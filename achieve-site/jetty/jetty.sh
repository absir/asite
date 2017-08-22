#!/usr/bin/env bash
cd `dirname $0`
currentDir=`pwd`

apps=(root)

start(){
    pid=`cat pid.log`
    if [ $pid ];then
        echo "already start. PID:`cat pid.log`"
    else
        if [ ! $JETTY_HOME ];then
            echo "JETTY HOME NOT FOUND!"
            exit
        fi

        if [ !-d "work"];then
            mkdir "work"
        fi

        EVN=$2
        if [ ! $EVN ];then
            EVN="PRODUCT"
        else
            EVN=$(echo $EVN | tr '[a-z]' '[A-Z]')     
        fi

        evnDebug=0
        if [ "$EVN" == "DEVELOP" ];then
            evnDebug=1
        elif [ "$EVN" == "DEBUG" ];then
            evnDebug=1
        fi

        if [ $evnDebug -le 0 ];then
            JAVA_OPTS="$JAVA_OPTS -Xms1024m -Xmx6096m -XX:PermSize=256m -XX:MaxPermSize=512m"
        else
            JAVA_OPTS="$JAVA_OPTS -Xms128m -Xmx512m -XX:PermSize=64m -XX:MaxPermSize=128m"
            JAVA_OPTS="$JAVA_OPTS -Xdebug -Xrunjdwp:transport=dt_socket,address=18787,suspend=n,server=y"
        fi

        command="java $JAVA_OPTS -D_AB_ENV=$EVN -jar $JETTY_HOME/start.jar"
        if [ $evnDebug -le 0 ];then
            rm -f nohup.out
            command="nohup $command &"
        fi
        printf "$command\r\n"
        eval $command
        #纪录pid
        if [ $evnDebug -le 0 ];then
            echo $! > pid.log
        fi
    fi
}

stop(){
    pid=`cat pid.log`
    if [ $pid ];then

        for app in ${apps[*]}
        do
            command="work/webResources/$app/protected/maintenance/scripts/shutdown.sh"
            printf "$command\r\n"
            $command
        done

        command="kill -9 $pid"
        printf "$command\r\n"
        $command
        #删除pid
        rm -f pid.log
    else
        echo "not start. pid.log could not found"
    fi
}

case "$1" in
    start)
start
;;
stop)
stop
;;
restart)
stop
start
;;
*)
echo "not found command for $1"
esac