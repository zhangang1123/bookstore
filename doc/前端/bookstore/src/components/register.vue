<template>
  <div id="login_box">
      <div class="skip" @click="skip">
          <strong>直接进入</strong>
         <i class="el-icon-d-arrow-right"></i>
      </div>
        <h2>register</h2>
        <div id="form">
            <div id="input_box">
                <input type="text" v-model="usename" placeholder="Username">
            </div>
            <div id="input_box">
                <input type="password" v-model="usepsd" placeholder="Password">
            </div>
            <div id="input_box">
                <input type="password" v-model="usepsd" placeholder="Enter your password">
            </div>
            <div >
                <input class="verification" type="text"  placeholder="验证码">
            </div>
        </div>
        <button id="sign_in" >register</button>
        <br>
        <div id="sign_up">
            <a @click="login">已有密码，直接登录</a>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            
        }
    },
    methods:{
        login(){
            this.$router.push({name: 'login'});
        },
         skip(){
            this.$router.push({name: 'user'})
        }
    },
    beforeCreate() {
        document.getElementsByTagName('body')[0].className = 'body';  
    },
}
</script>

<style scoped>
.skip{
    position: absolute;
    top:5px;
    right:5px;
    color: white
}
 #login_box {
            width: 16%;
            height: 350px;
            background-color: #00000070;
            margin: auto;
            margin-top: 10%;
            text-align: center;
            border-radius: 10px;
            padding: 50px 50px;
            position:relative;
        }
        
        #login_box input,
        #login_box button {
            outline: none;
        }
        
        #login_box h2 {
            color: #ffffff90;
            margin-top: 5%;
        }
        
        #login_box #form #input_box {
            margin-top: 5%;
        }
        
        #login_box #form #input_box input {
            border: 0;
            width: 60%;
            font-size: 15px;
            color: #ffffff;
            background: #ffffff00;
            border-bottom: 2px solid #ffffff;
            padding: 5px 10px;
            margin-top: 10px;
        }
        
        #login_box button {
            margin-top: 30px;
            width: 40%;
            height: 20px;
            border-radius: 10px;
            border: 0;
            color: #fff;
            font-size: 15px;
            background-image: linear-gradient(120deg, #93bdfb 0%, #5774f5 100%);
            cursor: pointer;
        }
        
        #login_box #sign_up {
            margin-top: 20%;
        }
        
        #login_box #sign_up a {
            color: #468fb9;
            cursor: pointer;
        }
        .verification{
            font-size: 30px;
            width:120px;
            margin-top:10px;
        }
</style>