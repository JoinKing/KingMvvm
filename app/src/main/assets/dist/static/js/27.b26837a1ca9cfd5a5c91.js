webpackJsonp([27],{Fz5w:function(t,n,e){var a=e("kxFB");n=t.exports=e("FZ+f")(!0),n.push([t.i,"\n.cdct_container[data-v-2c86bcf0] {\n  height: 100%;\n  overflow: hidden;\n}\n.wrapper[data-v-2c86bcf0] {\n  height: 100%;\n}\n.listBox[data-v-2c86bcf0] {\n  width: 100%;\n  margin-bottom: 10px;\n  padding: 1.7rem 1.5rem 1.4rem;\n  background: #fff;\n  box-shadow: 0px 0px 8px 0px rgba(0, 0, 0, 0.09);\n  border-radius: 4px;\n}\n.listBox .title[data-v-2c86bcf0] {\n  color: #4A4A4A;\n  font-size: 1.8rem;\n  margin-bottom: 1.5rem;\n  font-weight: 400;\n}\n.listBox .info[data-v-2c86bcf0] {\n  color: #666;\n  padding-bottom: 1.5rem;\n}\n.listBox .tips[data-v-2c86bcf0] {\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  padding-top: 1.5rem;\n  -webkit-box-pack: justify;\n  -webkit-justify-content: space-between;\n          justify-content: space-between;\n}\n.listBox .tips .time[data-v-2c86bcf0],\n.listBox .tips .username[data-v-2c86bcf0] {\n  color: #AAA;\n  font-size: 1.4rem;\n  padding-left: 25px;\n  position: relative;\n  max-width: 50%;\n}\n.listBox .tips .time[data-v-2c86bcf0]::before,\n.listBox .tips .username[data-v-2c86bcf0]::before {\n  content: '';\n  position: absolute;\n  left: 0;\n  top: 50%;\n  width: 16px;\n  height: 16px;\n  background-size: 15px 15px;\n  -webkit-transform: translateY(-50%);\n          transform: translateY(-50%);\n  background-repeat: no-repeat;\n}\n.listBox .tips .time[data-v-2c86bcf0]::before {\n  background-image: url("+a(e("zXAi"))+");\n}\n.listBox .tips .username[data-v-2c86bcf0]::before {\n  background-size: 16px 14px;\n  background-image: url("+a(e("GCzJ"))+");\n}\n.error[data-v-2c86bcf0] {\n  background-image: url("+a(e("JeK5"))+");\n}\n","",{version:3,sources:["F:/Doctor/CDCT_RCH_MOBILE/src/views/HealthRrecords/womenHealth/CancerScreening.vue"],names:[],mappings:";AACA;EACE,aAAa;EACb,iBAAiB;CAClB;AACD;EACE,aAAa;CACd;AACD;EACE,YAAY;EACZ,oBAAoB;EACpB,8BAA8B;EAC9B,iBAAiB;EACjB,gDAAgD;EAChD,mBAAmB;CACpB;AACD;EACE,eAAe;EACf,kBAAkB;EAClB,sBAAsB;EACtB,iBAAiB;CAClB;AACD;EACE,YAAY;EACZ,uBAAuB;CACxB;AACD;EACE,qBAAqB;EACrB,sBAAsB;EACtB,cAAc;EACd,oBAAoB;EACpB,0BAA0B;EAC1B,uCAAuC;UAC/B,+BAA+B;CACxC;AACD;;EAEE,YAAY;EACZ,kBAAkB;EAClB,mBAAmB;EACnB,mBAAmB;EACnB,eAAe;CAChB;AACD;;EAEE,YAAY;EACZ,mBAAmB;EACnB,QAAQ;EACR,SAAS;EACT,YAAY;EACZ,aAAa;EACb,2BAA2B;EAC3B,oCAAoC;UAC5B,4BAA4B;EACpC,6BAA6B;CAC9B;AACD;EACE,gDAA6D;CAC9D;AACD;EACE,2BAA2B;EAC3B,gDAA4D;CAC7D;AACD;EACE,gDAA2D;CAC5D",file:"CancerScreening.vue",sourcesContent:["\n.cdct_container[data-v-2c86bcf0] {\n  height: 100%;\n  overflow: hidden;\n}\n.wrapper[data-v-2c86bcf0] {\n  height: 100%;\n}\n.listBox[data-v-2c86bcf0] {\n  width: 100%;\n  margin-bottom: 10px;\n  padding: 1.7rem 1.5rem 1.4rem;\n  background: #fff;\n  box-shadow: 0px 0px 8px 0px rgba(0, 0, 0, 0.09);\n  border-radius: 4px;\n}\n.listBox .title[data-v-2c86bcf0] {\n  color: #4A4A4A;\n  font-size: 1.8rem;\n  margin-bottom: 1.5rem;\n  font-weight: 400;\n}\n.listBox .info[data-v-2c86bcf0] {\n  color: #666;\n  padding-bottom: 1.5rem;\n}\n.listBox .tips[data-v-2c86bcf0] {\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  padding-top: 1.5rem;\n  -webkit-box-pack: justify;\n  -webkit-justify-content: space-between;\n          justify-content: space-between;\n}\n.listBox .tips .time[data-v-2c86bcf0],\n.listBox .tips .username[data-v-2c86bcf0] {\n  color: #AAA;\n  font-size: 1.4rem;\n  padding-left: 25px;\n  position: relative;\n  max-width: 50%;\n}\n.listBox .tips .time[data-v-2c86bcf0]::before,\n.listBox .tips .username[data-v-2c86bcf0]::before {\n  content: '';\n  position: absolute;\n  left: 0;\n  top: 50%;\n  width: 16px;\n  height: 16px;\n  background-size: 15px 15px;\n  -webkit-transform: translateY(-50%);\n          transform: translateY(-50%);\n  background-repeat: no-repeat;\n}\n.listBox .tips .time[data-v-2c86bcf0]::before {\n  background-image: url('~viewImgs/WomenHealth/icon_time.png');\n}\n.listBox .tips .username[data-v-2c86bcf0]::before {\n  background-size: 16px 14px;\n  background-image: url('~viewImgs/WomenHealth/icon_hos.png');\n}\n.error[data-v-2c86bcf0] {\n  background-image: url('~viewImgs/WomenHealth/errorBg.png');\n}\n"],sourceRoot:""}])},GCzJ:function(t,n){t.exports="data:image/png;base64,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"},JeK5:function(t,n,e){t.exports=e.p+"static/img/errorBg.90607a9.png"},R6NA:function(t,n,e){var a=e("Fz5w");"string"==typeof a&&(a=[[t.i,a,""]]),a.locals&&(t.exports=a.locals);e("rjj0")("15f68fa4",a,!0,{})},puId:function(t,n,e){"use strict";function a(t){e("R6NA")}Object.defineProperty(n,"__esModule",{value:!0});var A=e("Gu7T"),i=e.n(A),o=e("ABCa"),s=e("rLAy"),r=e("FOn0"),c=(o.a,s.a,r.a,{components:{XHeader:o.a,Toast:s.a,SelectTab:r.a},data:function(){return{noData:!1,TabDefault1:{key:"0",val:"类型筛选"},TabDefault2:{key:"12",val:"近一年"},select1:[{key:"0",val:"全部类型"},{key:"1",val:"宫颈癌"},{key:"2",val:"乳腺癌"}],select2:[{key:"1200",val:"全部"},{key:"12",val:"近一年"},{key:"36",val:"近三年"}],type:0,start:"",num:12,pageIndex:1,pageSize:15,list:[]}},mounted:function(){this.getCurrentDate(),this.getCancerList(!0)},methods:{selChange1:function(t){this.type=t.key,this.getCancerList(!0)},selChange2:function(t){this.num=t.key,this.getCancerList(!0)},getCurrentDate:function(){var t=new Date,n=t.getFullYear(),e=t.getMonth()+1;e>=1&&e<=9&&(e="0"+e),this.start=n+""+e},getCancerList:function(t){var n=this;t&&(this.pageIndex=1),this.$vux.loading.show({text:"加载中..."}),this.$ajax.post("",{"MSH.1":"liangaiService","MSH.2":"list",CHZBM:this.$root.loginInfo.CHZBM,type:this.type,start:this.start,num:this.num,GRDAID:this.$root.loginInfo.grdaid,pageIndex:this.pageIndex,pageSize:this.pageSize,token:this.$root.loginInfo.token}).then(function(t){console.log(t),n.$vux.loading.hide(),void 0!==t&&void 0!==t.rows&&(1==t.pageNumber&&(n.pageIndex=1,n.list=[]),t.rows.length>0?(n.noData=!1,n.pageIndex++,n.list=[].concat(i()(n.list),i()(t.rows))):t.pageNumber>1?n.$vux.toast.text("没有更多了","bottom"):n.noData=!0),n.$refs.scroll.finishPullUp(),n.$refs.scroll.finishPullDown()}).catch(function(t){console.log(t),n.$vux.loading.hide(),n.$refs.scroll.finishPullUp(),n.$refs.scroll.finishPullDown()})},cancerDetail:function(t,n){"GJ"==t?this.$router.push({name:"CervicalCancers",params:{ID:n}}):"RX"==t&&this.$router.push({name:"BreastCancers",params:{ID:n}})}}}),l=function(){var t=this,n=t.$createElement,e=t._self._c||n;return e("div",{staticClass:"cdct_container",on:{touchstart:t.addLinkBg,touchend:t.removeLinkBg,touchmove:t.moveLinkBg}},[e("div",{staticClass:"cdct_header"},[e("XHeader",{attrs:{"left-options":{backText:"",preventGoBack:!0}},on:{"on-click-back":function(n){t.$router.goBack()}}},[t._v("两癌筛查")])],1),t._v(" "),e("select-tab",{attrs:{TabDefault1:t.TabDefault1,TabDefault2:t.TabDefault2,selectList1:t.select1,selectList2:t.select2},on:{"on-change1":t.selChange1,"on-change2":t.selChange2}}),t._v(" "),e("scroll",{ref:"scroll",staticStyle:{height:"calc(100% - 50px)"},attrs:{data:t.list,pullDownRefresh:!0,isloading:t.$store.state.CONTROL_LOADDING},on:{pullingDown:function(n){t.getCancerList(!0)},pullingUp:function(n){t.getCancerList(!1)}}},t._l(t.list,function(n,a){return e("div",{key:a,staticClass:"listBox cdct_addLinkitem",on:{click:function(e){t.cancerDetail(n.TYPE,n.ID)}}},[e("h3",{staticClass:"title cdct_onetxtcut"},[t._v(t._s("RX"==n.TYPE?"乳腺癌筛查登记表":"GJ"==n.TYPE?"宫颈癌筛查登记表":""))]),t._v(" "),e("p",{staticClass:"info vux-1px-b cdct_onetxtcut"},[t._v("最后诊断："+t._s(n.JG))]),t._v(" "),e("div",{staticClass:"tips"},[e("div",{staticClass:"time cdct_onetxtcut"},[t._v(t._s(n.ZDSJ))]),t._v(" "),e("div",{staticClass:"username cdct_onetxtcut"},[t._v(t._s(n.ZDJG))])])])})),t._v(" "),t.noData?e("div",{staticClass:"error"},[t._v("暂无记录")]):t._e()],1)},p=[],d={render:l,staticRenderFns:p},g=d,u=e("VU/8"),B=a,C=u(c,g,!1,B,"data-v-2c86bcf0",null);n.default=C.exports},zXAi:function(t,n){t.exports="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAEqklEQVRIS7WXf2hbVRTHv+emzdL0x9a6ibDhEIab0ImbqCiCG+pGOpuXvNtm6mBS9odTx1REpwN1KMMhUzatv0CoFGsh7XuvLy2dzDHHUHTiJor6j7BNcHRau64/srVp8o7cpJntlh8vgb2/Eu73nM855973zrkEF0/Huq99dQ3jDxJxAIy1AC0HoS5tyhgnwlmHnVNMdGhiZPRo27G2qWJuqZAgujHaUFHj2wHwMwBunNUmGDhP4OEMl5YQcBMA72wgfxPQDsdpD/eFL+bznxds6P0thNQHIFLAiwB3CaDPe8n7Q9OhpvG5DgcDg3VTvpl7iCjExFsALAQwBIee0q2gnQt+DZjBZMn+AwDvBOMSC+xLkf+9SM/DY8XKp9a7NnXV+6tqnnUYuwjwAbxfN0IvXm07D6ygpm53E9FmAL87EKEWo/mPXEBDt18iZke3QvtzrZvhgdsgUhaAlQT6LGwE2+bq5oFNaX8EYDuAb0dnENgW0ybyZWlKW+0f64ZWn09jhaxF7KEjAN0J4F3d0F7Iaq+ALRl7jMFfgPnXpCdxb6QnMlmotKaM/aPWdSOYPXQ55Rm4+F5l7oCDLUaoXwnT4PTh8M+cBuBnJBulIdXvgo9bsHLSK3tXCVT+AsZw0jO9ItITuZwGm3rfXhDtZsZuaWpvFYOmbVxmnPVl6rG9IN4N8Cu6EdpHHes6fAsbGoZASI2N1C1rO7a+6MtfDlhV9bI/cY4YE+HbtWVkhu1WCESJ8XbY1Ha5ybYccKaysY9B/CQcbCBL2p8ysA2OuE+3mr+7nmCrxQowi0FmvEOmtH8CeGVSJBZFeiKJ6wke2DRQP+1L/kvAcQW+ANA53Qiudgv9v9RcyYwn8tk5nCIhRFwaoSNZjSHtvwAk1Jdqigk/SkO7vzSwPQpgkRubue+vqjCDb1EZx5nxmzS1u904yWp6pRUiFo1EzIXsiMX4jGfqk+w2mnrfCRCtVhmfZ8K4NLRbSwGXqzWkrb79NWTqsRMg547Zw3W5XIdu7Pqb+/0zXkdt0SlV6nRjYMYD0tSOu3FQrsbQ7fVEOMrMH5IlrRBDqPY1r3uU67yQnSljB9N93qFmirZGvRWOdwgQGBupXer2k1lqYJ0bOqtrauvOASIxfHZoabpJWLr9BhNeLaVJlAq2dPt1JuxhxmvS1N5Mg+2gXZuqwGkQqhmeRmk8UrQtlgKOBu2VFZX4GcDo5MTYiq2Ht8avDAJm2H4UAt1uBwG34GjrVwsrnEtqEFjlQIRbjOY+ZZt79GF8k/RMB4pNIcXgc0cfZhyQpvZ81mYeeA/2iNVyrUHgUDrzGRGM9AfPFAPkWp8tr8puFYBu3dAen6u7ZrzNwNccJGAHgAk4tHcyvqB96+GNcTcBfB4YrPP5E88J0MsAqlyNt3MdG3rfZiJ6H8ASBoYFozMpnAFvQpzUrpo+1T56nPhdYASJsAWgBjXQM2O7NLVYroALXmHMsHkDhNgJpqdBWJxxwAkG/QngglD/GIuZ+GYCVaZXM9eb9qRItEd6InkvAQXB2UijrdEq4XgfIlCAGGtAWA6gNhMHxkE4A9DJVCr1ZfX0gqNNh5qmi23LfzO+GPGVO6NVAAAAAElFTkSuQmCC"}});
//# sourceMappingURL=27.b26837a1ca9cfd5a5c91.js.map