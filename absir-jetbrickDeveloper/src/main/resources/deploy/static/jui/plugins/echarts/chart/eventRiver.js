define("echarts/chart/eventRiver", ["require", "../component/base", "./base", "../layout/eventRiver", "zrender/shape/Polygon", "../component/axis", "../component/grid", "../component/dataZoom", "../config", "../util/ecData", "../util/date", "zrender/tool/util", "zrender/tool/color", "../chart"], function (e) {
    function t(e, t, a, o, s) {
        n.call(this, e, t, a, o, s), i.call(this);
        var r = this;
        r._ondragend = function () {
            r.isDragend = !0
        }, this.refresh(o)
    }

    var n = e("../component/base"), i = e("./base"), a = e("../layout/eventRiver"), o = e("zrender/shape/Polygon");
    e("../component/axis"), e("../component/grid"), e("../component/dataZoom");
    var s = e("../config"), r = e("../util/ecData"), l = e("../util/date"), h = e("zrender/tool/util"), m = e("zrender/tool/color");
    return t.prototype = {
        type: s.CHART_TYPE_EVENTRIVER, _buildShape: function () {
            var e = this.series;
            this.selectedMap = {}, this._dataPreprocessing();
            for (var t = this.component.legend, n = [], i = 0; i < e.length; i++)if (e[i].type === this.type) {
                e[i] = this.reformOption(e[i]), this.legendHoverLink = e[i].legendHoverLink || this.legendHoverLink;
                var o = e[i].name || "";
                if (this.selectedMap[o] = t ? t.isSelected(o) : !0, !this.selectedMap[o])continue;
                this.buildMark(i), n.push(this.series[i])
            }
            a(n, this._intervalX, this.component.grid.getArea()), this._drawEventRiver(), this.addShapeList()
        }, _dataPreprocessing: function () {
            for (var e, t, n = this.series, i = 0, a = n.length; a > i; i++)if (n[i].type === this.type) {
                e = this.component.xAxis.getAxis(n[i].xAxisIndex || 0);
                for (var o = 0, s = n[i].eventList.length; s > o; o++) {
                    t = n[i].eventList[o].evolution;
                    for (var r = 0, h = t.length; h > r; r++)t[r].timeScale = e.getCoord(l.getNewDate(t[r].time) - 0), t[r].valueScale = Math.pow(t[r].value, .8)
                }
            }
            this._intervalX = Math.round(this.component.grid.getWidth() / 40)
        }, _drawEventRiver: function () {
            for (var e = this.series, t = 0; t < e.length; t++) {
                var n = e[t].name || "";
                if (e[t].type === this.type && this.selectedMap[n])for (var i = 0; i < e[t].eventList.length; i++)this._drawEventBubble(e[t].eventList[i], t, i)
            }
        }, _drawEventBubble: function (e, t, n) {
            var i = this.series, a = i[t], s = a.name || "", l = a.eventList[n], h = [l, a], V = this.component.legend, U = V ? V.getColor(s) : this.zr.getColor(t), d = this.deepMerge(h, "itemStyle.normal") || {}, p = this.deepMerge(h, "itemStyle.emphasis") || {}, c = this.getItemStyleColor(d.color, t, n, l) || U, u = this.getItemStyleColor(p.color, t, n, l) || ("string" == typeof c ? m.lift(c, -.2) : c), y = this._calculateControlPoints(e), g = {
                zlevel: this._zlevelBase,
                clickable: this.deepQuery(h, "clickable"),
                style: {
                    pointList: y,
                    smooth: "spline",
                    brushType: "both",
                    lineJoin: "round",
                    color: c,
                    lineWidth: d.borderWidth,
                    strokeColor: d.borderColor
                },
                highlightStyle: {color: u, lineWidth: p.borderWidth, strokeColor: p.borderColor},
                draggable: "vertical",
                ondragend: this._ondragend
            };
            g = new o(g), this.addLabel(g, a, l, e.name), r.pack(g, i[t], t, i[t].eventList[n], n, i[t].eventList[n].name), this.shapeList.push(g)
        }, _calculateControlPoints: function (e) {
            var t = this._intervalX, n = e.y, i = e.evolution, a = i.length;
            if (!(1 > a)) {
                for (var o = [], s = [], r = 0; a > r; r++)o.push(i[r].timeScale), s.push(i[r].valueScale);
                var l = [];
                l.push([o[0], n]);
                var r = 0;
                for (r = 0; a - 1 > r; r++)l.push([(o[r] + o[r + 1]) / 2, s[r] / -2 + n]);
                for (l.push([(o[r] + (o[r] + t)) / 2, s[r] / -2 + n]), l.push([o[r] + t, n]), l.push([(o[r] + (o[r] + t)) / 2, s[r] / 2 + n]), r = a - 1; r > 0; r--)l.push([(o[r] + o[r - 1]) / 2, s[r - 1] / 2 + n]);
                return l
            }
        }, ondragend: function (e, t) {
            this.isDragend && e.target && (t.dragOut = !0, t.dragIn = !0, t.needRefresh = !1, this.isDragend = !1)
        }, refresh: function (e) {
            e && (this.option = e, this.series = e.series), this.backupShapeList(), this._buildShape()
        }
    }, h.inherits(t, i), h.inherits(t, n), e("../chart").define("eventRiver", t), t
}), define("echarts/layout/eventRiver", ["require"], function () {
    function e(e, o, s) {
        function r(e, t) {
            var n = e.importance, i = t.importance;
            return n > i ? -1 : i > n ? 1 : 0
        }

        function l(e, t) {
            if (e.indexOf)return e.indexOf(t);
            for (var n = 0, i = e.length; i > n; n++)if (e[n] === t)return n;
            return -1
        }

        for (var h = 5, m = o, V = 0; V < e.length; V++) {
            for (var U = 0; U < e[V].eventList.length; U++) {
                null == e[V].eventList[U].weight && (e[V].eventList[U].weight = 1);
                for (var d = 0, p = 0; p < e[V].eventList[U].evolution.length; p++)d += e[V].eventList[U].evolution[p].valueScale;
                e[V].eventList[U].importance = d * e[V].eventList[U].weight
            }
            e[V].eventList.sort(r)
        }
        for (var V = 0; V < e.length; V++) {
            null == e[V].weight && (e[V].weight = 1);
            for (var d = 0, U = 0; U < e[V].eventList.length; U++)d += e[V].eventList[U].weight;
            e[V].importance = d * e[V].weight
        }
        e.sort(r);
        for (var c = Number.MAX_VALUE, u = 0, V = 0; V < e.length; V++)for (var U = 0; U < e[V].eventList.length; U++)for (var p = 0; p < e[V].eventList[U].evolution.length; p++) {
            var y = e[V].eventList[U].evolution[p].timeScale;
            c = Math.min(c, y), u = Math.max(u, y)
        }
        for (var g = n(Math.floor(c), Math.ceil(u)), b = 0, V = 0; V < e.length; V++)for (var U = 0; U < e[V].eventList.length; U++) {
            var f = e[V].eventList[U];
            f.time = [], f.value = [];
            for (var p = 0; p < e[V].eventList[U].evolution.length; p++)f.time.push(e[V].eventList[U].evolution[p].timeScale), f.value.push(e[V].eventList[U].evolution[p].valueScale);
            var k = l(f.value, Math.max.apply(Math, f.value)), _ = i(g, f.time[k], f.time[k + 1]), p = 0;
            for (f.y = _ + f.value[k] / 2 + h, p = 0; p < f.time.length - 1; p++) {
                var x = i(g, f.time[p], f.time[p + 1]);
                f.y - f.value[p] / 2 - h < x && (f.y = x + f.value[p] / 2 + h)
            }
            var x = i(g, f.time[p], f.time[p] + m);
            for (f.y - f.value[p] / 2 - h < x && (f.y = x + f.value[p] / 2 + h), e[V].y = f.y, b = Math.max(b, f.y + f.value[k] / 2), p = 0; p < f.time.length - 1; p++)a(g, f.time[p], f.time[p + 1], f.y + f.value[p] / 2);
            a(g, f.time[p], f.time[p] + m, f.y + f.value[p] / 2)
        }
        t(e, s, b, h)
    }

    function t(e, t, n, i) {
        for (var a = t.y, o = (t.height - i) / n, s = 0; s < e.length; s++) {
            e[s].y = e[s].y * o + a;
            for (var r = e[s].eventList, l = 0; l < r.length; l++) {
                r[l].y = r[l].y * o + a;
                for (var h = r[l].evolution, m = 0; m < h.length; m++)h[m].valueScale *= 1 * o
            }
        }
    }

    function n(e, t) {
        var i = {left: e, right: t, leftChild: null, rightChild: null, maxValue: 0};
        if (t > e + 1) {
            var a = Math.round((e + t) / 2);
            i.leftChild = n(e, a), i.rightChild = n(a, t)
        }
        return i
    }

    function i(e, t, n) {
        if (1 > n - t)return 0;
        var a = Math.round((e.left + e.right) / 2), o = 0;
        if (t == e.left && n == e.right)o = e.maxValue; else if (a >= n && null != e.leftChild)o = i(e.leftChild, t, n); else if (t >= a && null != e.rightChild)o = i(e.rightChild, t, n); else {
            var s = 0, r = 0;
            null != e.leftChild && (s = i(e.leftChild, t, a)), null != e.rightChild && (r = i(e.rightChild, a, n)), o = s > r ? s : r
        }
        return o
    }

    function a(e, t, n, i) {
        if (null != e) {
            var o = Math.round((e.left + e.right) / 2);
            e.maxValue = e.maxValue > i ? e.maxValue : i, (Math.floor(10 * t) != Math.floor(10 * e.left) || Math.floor(10 * n) != Math.floor(10 * e.right)) && (o >= n ? a(e.leftChild, t, n, i) : t >= o ? a(e.rightChild, t, n, i) : (a(e.leftChild, t, o, i), a(e.rightChild, o, n, i)))
        }
    }

    return e
});