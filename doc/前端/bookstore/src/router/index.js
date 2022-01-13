import VueRouter from "vue-router";
import login from "../components/login"
import register from "../components/register"
import user from "../components/user"
//解决冗余导航问题
const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
  return originalPush.call(this, location).catch(err => err)
}
const originalreplace = VueRouter.prototype.replace
VueRouter.prototype.replace = function replace(location) {
  return originalreplace.call(this, location).catch(err => err)
}
export default new VueRouter({
    routes:[
        { 
          name:"login",
          path: "/login",
          component:login,
        },
        { 
          name:"register",
          path: "/",
          component:register,
        },
        {
          name:"user",
          path: "/user",
          component:user,
        }
    ]
});