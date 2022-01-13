import Vue from 'vue'
import App from './App.vue'
import vueRouter from 'vue-router'
import router from './router'
//import store from './store'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.config.productionTip = false
Vue.use(ElementUI);
Vue.use(vueRouter);
new Vue({
  router,
  //store,
  render: h => h(App),
   beforeCreate(){
      Vue.prototype.$bus= this
  }
}).$mount('#app')
