webpackJsonp([66],{Qbdf:function(n,e,t){var i=t("Wh45");"string"==typeof i&&(i=[[n.i,i,""]]),i.locals&&(n.exports=i.locals);t("rjj0")("59d506ca",i,!0,{})},REuB:function(n,e,t){"use strict";function i(n){t("Qbdf")}Object.defineProperty(e,"__esModule",{value:!0});var o=t("lHA8"),a=t.n(o),r=t("Gu7T"),A=t.n(r),s=t("HqzV"),d=t("jijt"),l=(s.a,d.a,{components:{Search:s.a,InlineLoading:d.a},data:function(){return{pageIndex:1,pageSize:15,list:[],value:"",nodata:!1,history:"",historyShow:!1}},mounted:function(){this.getHistory(),this.$refs.searchinput.focus()},watch:{value:function(){this.value=this.value.replace(/[^A-Za-z0-9\u4e00-\u9fa5]/g,"")}},methods:{removeValue:function(){this.value="",this.$refs.searchinput.focus(),this.nodata=!1,this.list=[],this.pageIndex=1},showHistoryJuge:function(){this.value.toString().length<1&&this.history.length>0?this.historyShow=!0:this.historyShow=!1},getHistory:function(){if(window.localStorage.history_disease){this.history=window.localStorage.history_disease;var n=this.history.split(",");this.history=[].concat(A()(new a.a(n.reverse()))).reverse().join(),","==this.history.charAt(0)&&(this.history=this.history.substring(1,this.history.length)),","==this.history.charAt(this.history.length-1)&&(this.history=this.history.substring(0,this.history.length-1)),localStorage.setItem("history_disease",this.history)}else localStorage.setItem("history_disease","")},removeHistory:function(){this.history="",localStorage.setItem("history_disease",""),this.showHistoryJuge()},setHistory:function(){if(this.historyShow=!1,""!=this.value){var n=this.history.split(",");n.push(this.value),this.history=[].concat(A()(new a.a(n.reverse()))).reverse().join(),","==this.history.charAt(0)&&(this.history=this.history.substring(1,this.history.length)),","==this.history.charAt(this.history.length-1)&&(this.history=this.history.substring(0,this.history.length-1)),localStorage.setItem("history_disease",this.history)}},setseartch:function(n){this.pageIndex=1,this.value=n,this.initdata()},changeSearch:function(){this.pageIndex=1,this.list=[],this.nodata=!1,this.initdata()},initdata:function(){var n=this;this.value=this.value.replace(/[^A-Za-z0-9\u4e00-\u9fa5]/g,""),this.showHistoryJuge(),""!=this.value?this.$ajax.post(this.$root.host,{"MSH.1":"diseasepool","MSH.2":"listDisease",pageIndex:this.pageIndex,pageSize:this.pageSize,title:this.value,cbm:window.localStorage.lastcode_Y&&"undefined"!=window.localStorage.lastcode_Y?window.localStorage.lastcode_Y:""}).then(function(e){console.log(e),n.$refs.scroll.finishPullUp(),n.$refs.scroll.finishPullDown(),void 0!==e&&void 0!==e.rows&&e.rows.length>0?(n.nodata=!1,1==n.pageIndex?n.list=e.rows:n.list=n.list.concat(e.rows)):n.judge()}):(this.list=[],this.pageIndex=1,this.nodata=!1)},judge:function(){this.pageIndex>1?this.$vux.toast.text("没有更多了","bottom"):(this.nodata=!0,this.list=[],this.pageIndex=1)},pullingUp:function(){this.pageIndex++,this.initdata()},toDetail:function(n,e){this.$router.push({name:"symptoms",params:{code:e,name:n}})}}}),b=function(){var n=this,e=n.$createElement,t=n._self._c||e;return t("div",{staticClass:"cdct_container cdct_containerSearch"},[t("div",{staticClass:"cdct_header vux-1px-b"},[t("div",{staticClass:"weui-search-bar weui-search-bar_focusing"},[t("div",{staticClass:"outbox"},[t("div",{staticClass:"weui-search-bar__box"},[t("i",{staticClass:"weui-icon-search",on:{click:function(e){return e.stopPropagation(),n.getfucs(e)}}}),n._v(" "),t("input",{directives:[{name:"model",rawName:"v-model.trim",value:n.value,expression:"value",modifiers:{trim:!0}}],ref:"searchinput",staticClass:"weui-search_input",attrs:{type:"text",placeholder:"输入症状名称"},domProps:{value:n.value},on:{focus:n.showHistoryJuge,blur:[n.setHistory,function(e){n.$forceUpdate()}],input:[function(e){e.target.composing||(n.value=e.target.value.trim())},n.changeSearch],click:function(e){return e.stopPropagation(),n.getfucs(e)}}}),n._v(" "),t("a",{directives:[{name:"show",rawName:"v-show",value:n.value.length>0,expression:"value.length>0"}],staticClass:"weui-icon-clear",attrs:{href:"javascript:"},on:{click:n.removeValue}})])]),n._v(" "),t("a",{staticClass:"weui-search-bar__cancel-btn",attrs:{href:"javascript:"},on:{click:function(e){n.$router.goBack()}}},[n._v("取消\n                                    ")])])]),n._v(" "),t("div",{directives:[{name:"show",rawName:"v-show",value:n.historyShow,expression:"historyShow"}],staticClass:"history"},[t("div",{staticClass:"searchResult"},[t("span",{staticClass:"searchspan cdct_onetxtcut"},[n._v("搜索记录")]),n._v(" "),t("i",{staticClass:"deleteicon",on:{click:n.removeHistory}})]),n._v(" "),n._l(n.history.split(",").reverse(),function(e,i){return i<5?t("div",{key:i,staticClass:"searchResult",on:{click:function(t){n.setseartch(e)}}},[t("i",{staticClass:"weui-icon-search"}),n._v(" "),t("span",{staticClass:"titlespan cdct_onetxtcut"},[n._v(n._s(e))])]):n._e()})],2),n._v(" "),t("scroll",{ref:"scroll",staticStyle:{height:"100%"},attrs:{data:n.list,isloading:n.$store.state.CONTROL_LOADDING},on:{pullingUp:n.pullingUp}},n._l(n.list,function(e,i){return t("div",{key:i,staticClass:"searchResult",on:{click:function(t){n.toDetail(e.CJBMC,e.CBM)}}},[t("i",{staticClass:"weui-icon-search"}),n._v(" "),t("span",{staticClass:"titlespan cdct_onetxtcut"},[n._v(n._s(e.CJBMC))])])})),n._v(" "),n.nodata?t("div",{staticClass:"error"},[t("span",{staticClass:"deepcolor"},[n._v("没有搜索结果")]),n._v(" "),t("br"),t("span",{staticClass:"lesscolor"},[n._v("换个关键词试试呢")])]):n._e()],1)},c=[],C={render:b,staticRenderFns:c},B=C,h=t("VU/8"),f=i,g=h(l,B,!1,f,"data-v-87df4b98",null);e.default=g.exports},Wh45:function(n,e,t){var i=t("kxFB");e=n.exports=t("FZ+f")(!0),e.push([n.i,"\n.cdct_container[data-v-87df4b98] {\n  height: 100%;\n}\n.weui-search-bar[data-v-87df4b98],\n.outbox[data-v-87df4b98] {\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n  -webkit-flex-direction: row;\n          flex-direction: row;\n  -webkit-box-flex: 1;\n  -webkit-flex: auto;\n          flex: auto;\n}\n.outbox[data-v-87df4b98] {\n  padding: .8rem .8rem .8rem 1.5rem;\n}\n.weui-search-bar__box[data-v-87df4b98] {\n  -webkit-box-flex: 1;\n  -webkit-flex: auto;\n          flex: auto;\n  padding: 0 .3rem;\n  background: #eeeeee;\n  border-radius: 2px;\n}\n.weui-search_input[data-v-87df4b98] {\n  -webkit-box-flex: 1;\n  -webkit-flex: auto;\n          flex: auto;\n  width: calc(100% - 50px);\n  height: 2rem;\n  border: 0;\n  font-size: 1.4rem;\n  line-height: 2.1rem;\n  margin: 1rem 0;\n  box-sizing: content-box;\n  background: transparent;\n  outline: none;\n}\n.weui-search-bar__cancel-btn[data-v-87df4b98] {\n  line-height: 5.6rem;\n  padding-right: .9rem;\n  color: #333333;\n  font-size: 1.5rem;\n}\n.history[data-v-87df4b98] {\n  position: absolute;\n  top: 82px;\n  height: auto;\n  width: 100%;\n  z-index: 10;\n}\n.history .deleteicon[data-v-87df4b98] {\n  width: 4rem;\n  background: url("+i(t("63lO"))+") center center no-repeat;\n}\n.history .titlespan[data-v-87df4b98] {\n  font-size: 1.6rem;\n}\n.searchResult[data-v-87df4b98] {\n  padding: 0 0 0 .4rem;\n  line-height: 4.4rem;\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  width: 100%;\n  color: #666666;\n  -webkit-box-pack: center;\n  -webkit-justify-content: center;\n          justify-content: center;\n  border-bottom: 1px solid #E5E5E5;\n  background-color: white;\n}\n.searchResult .weui-icon-search[data-v-87df4b98] {\n  font-size: 1.6rem;\n  line-height: 4.4rem;\n  padding: 0 .5rem;\n}\n.searchResult .titlespan[data-v-87df4b98],\n.searchResult .searchspan[data-v-87df4b98] {\n  color: #333333;\n  font-size: 1.4rem;\n  -webkit-box-flex: 1;\n  -webkit-flex: 1;\n          flex: 1;\n}\n.searchResult .searchspan[data-v-87df4b98] {\n  color: #666666;\n  padding-left: 1rem;\n}\n.title_row[data-v-87df4b98] {\n  margin-top: 10px;\n  padding: 0 0 0 1.4rem;\n  line-height: 4.4rem;\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  width: 100%;\n  color: #666666;\n  -webkit-box-pack: center;\n  -webkit-justify-content: center;\n          justify-content: center;\n  border-bottom: 1px solid #E5E5E5;\n  background-color: white;\n}\n.title_row .titlespan[data-v-87df4b98] {\n  color: #666666;\n  font-size: 1.6rem;\n  -webkit-box-flex: 1;\n  -webkit-flex: 1;\n          flex: 1;\n}\n.title_row .morespan[data-v-87df4b98] {\n  color: #999999;\n  font-size: 1.4rem;\n  -webkit-box-flex: 1;\n  -webkit-flex: 1;\n          flex: 1;\n  position: relative;\n  padding-right: 2.5rem;\n  text-align: right;\n}\n.title_row .morespan[data-v-87df4b98]:after {\n  content: \" \";\n  display: inline-block;\n  height: 6px;\n  margin-right: 1.5rem;\n  width: 6px;\n  border-width: 2px 2px 0 0;\n  border-color: #C8C8CD;\n  border-style: solid;\n  -webkit-transform: matrix(0.71, 0.71, -0.71, 0.71, 0, 0);\n  transform: matrix(0.71, 0.71, -0.71, 0.71, 0, 0);\n  position: relative;\n  top: -2px;\n  position: absolute;\n  top: 50%;\n  margin-top: -4px;\n  right: 2px;\n}\n.range-box[data-v-87df4b98] {\n  padding: 1.4rem 1.5rem 0 1.5rem;\n  background-color: white;\n}\n.range-box .line[data-v-87df4b98] {\n  height: 1rem;\n  border-bottom: 1px solid #E5E5E5;\n}\n.range-box .noline[data-v-87df4b98] {\n  border-bottom: none;\n}\n.imgrange-box[data-v-87df4b98] {\n  padding: 1.4rem 1.5rem 0 1.5rem;\n  background-color: white;\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  -webkit-box-align: center;\n  -webkit-align-items: center;\n          align-items: center;\n}\n.imgrange-box .line[data-v-87df4b98] {\n  height: 1rem;\n  border-bottom: 1px solid #E5E5E5;\n}\n.imgrange-box .noline[data-v-87df4b98] {\n  border-bottom: none;\n}\n.imgrange-box .bq[data-v-87df4b98] {\n  color: #3CB963;\n  display: inline-block;\n  line-height: 22px;\n  padding: 0 6px;\n  font-size: 1.2rem;\n  background: #E1FFEA;\n  text-align: center;\n  margin-left: 8px;\n  border-radius: 2px;\n}\n.imgrange-box .bottom[data-v-87df4b98] {\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  padding-top: 10px;\n  -webkit-box-pack: justify;\n  -webkit-justify-content: space-between;\n          justify-content: space-between;\n}\n.imgrange-box .bottom .user[data-v-87df4b98],\n.imgrange-box .bottom .host[data-v-87df4b98],\n.imgrange-box .bottom > div[data-v-87df4b98] {\n  font-size: 1.3rem;\n  color: #999;\n  max-width: 50%;\n  position: relative;\n  padding-left: 18px;\n}\n.imgrange-box .bottom .user[data-v-87df4b98]:before,\n.imgrange-box .bottom .host[data-v-87df4b98]:before,\n.imgrange-box .bottom > div[data-v-87df4b98]:before {\n  content: '';\n  position: absolute;\n  left: 0;\n  top: 50%;\n  width: 16px;\n  height: 100%;\n  -webkit-transform: translateY(-50%);\n          transform: translateY(-50%);\n  background-repeat: no-repeat;\n  background-size: 12px 13px;\n  background-position: center center;\n}\n.imgrange-box .bottom .user span[data-v-87df4b98],\n.imgrange-box .bottom .host span[data-v-87df4b98],\n.imgrange-box .bottom > div span[data-v-87df4b98] {\n  color: #3CB963;\n}\n.imgrange-box .bottom .user[data-v-87df4b98]::before {\n  background-image: url("+i(t("4wg4"))+");\n}\n.imgrange-box .bottom .host[data-v-87df4b98]::before {\n  background-image: url("+i(t("I7T1"))+");\n}\n.box-img[data-v-87df4b98] {\n  width: 5rem;\n  height: 5rem;\n  margin-right: 0.5rem;\n}\n.box-img img[data-v-87df4b98] {\n  max-width: 100%;\n  max-height: 100%;\n}\n.box-brief[data-v-87df4b98] {\n  width: calc(100% - 5.5rem);\n}\n.box-brief .box-drugs-number[data-v-87df4b98] {\n  font-size: 1.4rem;\n  color: #999999;\n}\n.box-brief .box-drugs-number span[data-v-87df4b98] {\n  color: #3CB963;\n}\n.box-title[data-v-87df4b98] {\n  color: #333333;\n  font-size: 1.8rem;\n  margin-bottom: .5rem;\n}\n.box-title .type[data-v-87df4b98] {\n  color: #999999;\n  padding: 0 0 0 6px;\n  font-size: 1.3rem;\n}\n.box-txt[data-v-87df4b98] {\n  font-size: 1.4rem;\n  color: #666666;\n  display: -webkit-box;\n  -webkit-box-orient: vertical;\n  -webkit-line-clamp: 2;\n  white-space: pre-wrap;\n  overflow: hidden;\n  text-overflow: ellipsis;\n}\n.deepcolor[data-v-87df4b98] {\n  color: #333333;\n  font-size: 1.6rem;\n}\n.lesscolor[data-v-87df4b98] {\n  color: #999999;\n  font-size: 1.4rem;\n}\n.error[data-v-87df4b98] {\n  background-image: url("+i(t("Xb5A"))+");\n}\n.cdct_container[data-v-87df4b98] {\n  padding-top: 80px;\n}\n.cdct_container .cdct_header[data-v-87df4b98] {\n  padding-top: 27px;\n}\n","",{version:3,sources:["F:/Doctor/CDCT_RCH_MOBILE/src/views/drugsAndElse/diseaseListSearch.vue"],names:[],mappings:"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",file:"diseaseListSearch.vue",sourcesContent:["\n.cdct_container[data-v-87df4b98] {\n  height: 100%;\n}\n.weui-search-bar[data-v-87df4b98],\n.outbox[data-v-87df4b98] {\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  -webkit-box-orient: horizontal;\n  -webkit-box-direction: normal;\n  -webkit-flex-direction: row;\n          flex-direction: row;\n  -webkit-box-flex: 1;\n  -webkit-flex: auto;\n          flex: auto;\n}\n.outbox[data-v-87df4b98] {\n  padding: .8rem .8rem .8rem 1.5rem;\n}\n.weui-search-bar__box[data-v-87df4b98] {\n  -webkit-box-flex: 1;\n  -webkit-flex: auto;\n          flex: auto;\n  padding: 0 .3rem;\n  background: #eeeeee;\n  border-radius: 2px;\n}\n.weui-search_input[data-v-87df4b98] {\n  -webkit-box-flex: 1;\n  -webkit-flex: auto;\n          flex: auto;\n  width: calc(100% - 50px);\n  height: 2rem;\n  border: 0;\n  font-size: 1.4rem;\n  line-height: 2.1rem;\n  margin: 1rem 0;\n  box-sizing: content-box;\n  background: transparent;\n  outline: none;\n}\n.weui-search-bar__cancel-btn[data-v-87df4b98] {\n  line-height: 5.6rem;\n  padding-right: .9rem;\n  color: #333333;\n  font-size: 1.5rem;\n}\n.history[data-v-87df4b98] {\n  position: absolute;\n  top: 82px;\n  height: auto;\n  width: 100%;\n  z-index: 10;\n}\n.history .deleteicon[data-v-87df4b98] {\n  width: 4rem;\n  background: url('~viewImgs/HealthRecords/delete.png') center center no-repeat;\n}\n.history .titlespan[data-v-87df4b98] {\n  font-size: 1.6rem;\n}\n.searchResult[data-v-87df4b98] {\n  padding: 0 0 0 .4rem;\n  line-height: 4.4rem;\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  width: 100%;\n  color: #666666;\n  -webkit-box-pack: center;\n  -webkit-justify-content: center;\n          justify-content: center;\n  border-bottom: 1px solid #E5E5E5;\n  background-color: white;\n}\n.searchResult .weui-icon-search[data-v-87df4b98] {\n  font-size: 1.6rem;\n  line-height: 4.4rem;\n  padding: 0 .5rem;\n}\n.searchResult .titlespan[data-v-87df4b98],\n.searchResult .searchspan[data-v-87df4b98] {\n  color: #333333;\n  font-size: 1.4rem;\n  -webkit-box-flex: 1;\n  -webkit-flex: 1;\n          flex: 1;\n}\n.searchResult .searchspan[data-v-87df4b98] {\n  color: #666666;\n  padding-left: 1rem;\n}\n.title_row[data-v-87df4b98] {\n  margin-top: 10px;\n  padding: 0 0 0 1.4rem;\n  line-height: 4.4rem;\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  width: 100%;\n  color: #666666;\n  -webkit-box-pack: center;\n  -webkit-justify-content: center;\n          justify-content: center;\n  border-bottom: 1px solid #E5E5E5;\n  background-color: white;\n}\n.title_row .titlespan[data-v-87df4b98] {\n  color: #666666;\n  font-size: 1.6rem;\n  -webkit-box-flex: 1;\n  -webkit-flex: 1;\n          flex: 1;\n}\n.title_row .morespan[data-v-87df4b98] {\n  color: #999999;\n  font-size: 1.4rem;\n  -webkit-box-flex: 1;\n  -webkit-flex: 1;\n          flex: 1;\n  position: relative;\n  padding-right: 2.5rem;\n  text-align: right;\n}\n.title_row .morespan[data-v-87df4b98]:after {\n  content: \" \";\n  display: inline-block;\n  height: 6px;\n  margin-right: 1.5rem;\n  width: 6px;\n  border-width: 2px 2px 0 0;\n  border-color: #C8C8CD;\n  border-style: solid;\n  -webkit-transform: matrix(0.71, 0.71, -0.71, 0.71, 0, 0);\n  transform: matrix(0.71, 0.71, -0.71, 0.71, 0, 0);\n  position: relative;\n  top: -2px;\n  position: absolute;\n  top: 50%;\n  margin-top: -4px;\n  right: 2px;\n}\n.range-box[data-v-87df4b98] {\n  padding: 1.4rem 1.5rem 0 1.5rem;\n  background-color: white;\n}\n.range-box .line[data-v-87df4b98] {\n  height: 1rem;\n  border-bottom: 1px solid #E5E5E5;\n}\n.range-box .noline[data-v-87df4b98] {\n  border-bottom: none;\n}\n.imgrange-box[data-v-87df4b98] {\n  padding: 1.4rem 1.5rem 0 1.5rem;\n  background-color: white;\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  -webkit-box-align: center;\n  -webkit-align-items: center;\n          align-items: center;\n}\n.imgrange-box .line[data-v-87df4b98] {\n  height: 1rem;\n  border-bottom: 1px solid #E5E5E5;\n}\n.imgrange-box .noline[data-v-87df4b98] {\n  border-bottom: none;\n}\n.imgrange-box .bq[data-v-87df4b98] {\n  color: #3CB963;\n  display: inline-block;\n  line-height: 22px;\n  padding: 0 6px;\n  font-size: 1.2rem;\n  background: #E1FFEA;\n  text-align: center;\n  margin-left: 8px;\n  border-radius: 2px;\n}\n.imgrange-box .bottom[data-v-87df4b98] {\n  display: -webkit-box;\n  display: -webkit-flex;\n  display: flex;\n  padding-top: 10px;\n  -webkit-box-pack: justify;\n  -webkit-justify-content: space-between;\n          justify-content: space-between;\n}\n.imgrange-box .bottom .user[data-v-87df4b98],\n.imgrange-box .bottom .host[data-v-87df4b98],\n.imgrange-box .bottom > div[data-v-87df4b98] {\n  font-size: 1.3rem;\n  color: #999;\n  max-width: 50%;\n  position: relative;\n  padding-left: 18px;\n}\n.imgrange-box .bottom .user[data-v-87df4b98]:before,\n.imgrange-box .bottom .host[data-v-87df4b98]:before,\n.imgrange-box .bottom > div[data-v-87df4b98]:before {\n  content: '';\n  position: absolute;\n  left: 0;\n  top: 50%;\n  width: 16px;\n  height: 100%;\n  -webkit-transform: translateY(-50%);\n          transform: translateY(-50%);\n  background-repeat: no-repeat;\n  background-size: 12px 13px;\n  background-position: center center;\n}\n.imgrange-box .bottom .user span[data-v-87df4b98],\n.imgrange-box .bottom .host span[data-v-87df4b98],\n.imgrange-box .bottom > div span[data-v-87df4b98] {\n  color: #3CB963;\n}\n.imgrange-box .bottom .user[data-v-87df4b98]::before {\n  background-image: url('~viewImgs/HealthRecords/tree_icon1.png');\n}\n.imgrange-box .bottom .host[data-v-87df4b98]::before {\n  background-image: url('~viewImgs/HealthRecords/tree_icon2.png');\n}\n.box-img[data-v-87df4b98] {\n  width: 5rem;\n  height: 5rem;\n  margin-right: 0.5rem;\n}\n.box-img img[data-v-87df4b98] {\n  max-width: 100%;\n  max-height: 100%;\n}\n.box-brief[data-v-87df4b98] {\n  width: calc(100% - 5.5rem);\n}\n.box-brief .box-drugs-number[data-v-87df4b98] {\n  font-size: 1.4rem;\n  color: #999999;\n}\n.box-brief .box-drugs-number span[data-v-87df4b98] {\n  color: #3CB963;\n}\n.box-title[data-v-87df4b98] {\n  color: #333333;\n  font-size: 1.8rem;\n  margin-bottom: .5rem;\n}\n.box-title .type[data-v-87df4b98] {\n  color: #999999;\n  padding: 0 0 0 6px;\n  font-size: 1.3rem;\n}\n.box-txt[data-v-87df4b98] {\n  font-size: 1.4rem;\n  color: #666666;\n  display: -webkit-box;\n  -webkit-box-orient: vertical;\n  -webkit-line-clamp: 2;\n  white-space: pre-wrap;\n  overflow: hidden;\n  text-overflow: ellipsis;\n}\n.deepcolor[data-v-87df4b98] {\n  color: #333333;\n  font-size: 1.6rem;\n}\n.lesscolor[data-v-87df4b98] {\n  color: #999999;\n  font-size: 1.4rem;\n}\n.error[data-v-87df4b98] {\n  background-image: url('~viewImgs/HealthRecords/searchNodata.png');\n}\n.cdct_container[data-v-87df4b98] {\n  padding-top: 80px;\n}\n.cdct_container .cdct_header[data-v-87df4b98] {\n  padding-top: 27px;\n}\n"],sourceRoot:""}])}});
//# sourceMappingURL=66.813233a966fa6d470c98.js.map