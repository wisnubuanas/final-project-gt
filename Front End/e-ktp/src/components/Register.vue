<template>
  <div id="bg" class="d-flex justify-content-center">
    <div>
      <div class="border border-secondary p-2 mt-5 mb-5 rounded shadow" id="x" style="width: 900px; margin:auto;">
        <img src="../assets/ktpregister.png" class="img-fluid" id="ktp">
        <h3 id="d" class="text-white">Daftar Peserta</h3>
        <div class="d-flex flex-center p-3 mt-4 mr-4">
  
      <form id="q" style="width: 500px; margin: auto" @submit.prevent="register">
        <div class="form-row">
      <label class="col-sm-2 col-form-label text-white">Nama Lengkap</label>
      <div class="col-sm-9">
        <input type="text" class="form-control ml-1" id="" placeholder="Nama Lengkap" v-model="userRegister.nama">
      </div>
    </div>
    <div class="form-group row">
      <label class="col-sm-2 col-form-label text-white">Email</label>
      <div class="col-sm-9">
        <input type="email" class="form-control ml-1" id="" placeholder="Email" v-model="userRegister.email">
      </div>
    </div>
    <div class="form-group row">
      <label class="col-sm-2 col-form-label text-white">Password</label>
      <div class="col-sm-9">
        <input type="password" class="form-control ml-1" id="" placeholder="Password" v-model="userRegister.password">
      </div>
    </div>
    <div class="form-group row">
      <label class="col-sm-2 col-form-label text-white">Repassword</label>
      <div class="col-sm-9">
        <input type="password" class="form-control ml-1" id="" placeholder="Repassword" v-model="password2">
      </div>
    </div>

            <p v-if="registerSuccess" style="color:red;">Berhasil Daftar!, Silahkan Login</p>
            <p v-if="emailValid" style="color:red;">Email sudah di gunakan!</p>
            <p v-if="passwordValid" style="color:red;">Password tidak sama</p>

    <div class="form-group row">
      <div class="col-sm-4 mt-2 d-flex justify-content-around">
        <router-link to="/">
          <button type="submit" class="btn btn-danger">Login</button>
        </router-link>
        <button type="submit" class="btn btn-primary">Daftar</button>
      </div>
    </div>
    <div>
      <p class="small fw-bold mt-2 pt-1 mb-0 text-white">Sudah mempunyai akun? <a href="/"
        class="link-danger">Masuk di sini</a></p>
    </div>
  </form>
    </div>
      </div>
    </div>
  </div>
  
</template>

<script>
import userservice from '../services/userService'

export default {
name: 'registerComponents',

data() {
        return {
            userRegister: {
                nama: null,
                email: null,
                password: null
            },
            password2: "",
            registerSuccess: false,
            emailValid: false,
            passwordValid: false
        }
    },

    methods: {

        register() {
            let data = this.userRegister;
            let password1 = data.password;
            let password2 = this.password2;

            this.registerSuccess = false;
            this.emailValid = false;
            this.passwordValid = false;

            if (password1 == password2) {
                console.log(data);
                userservice.register(data).then(response => {
                    console.log(response);
                    this.dataRegister = {};
                    this.password2 = "";
                    this.registerSuccess = true;
                    // l
                }).catch(e => {
                    console.log(e);
                    if (e.response.data.status === 500) {

                        this.emailValid = true;
                    }
                })
            } else {
                // location.reload();
                this.passwordValid = true;
            }
        }
    }
}
</script>

<style>

* {
  margin: 0;
  padding: 0;
}
#x{
  margin-left: 100%;
  width: 100%;
  background-color: #36393f;
}
#q{
  margin : auto;
}
#d{
  text-align: center;
}
#ktp{
  width: 100px;
  height: auto;
  margin-left: 400px;
}
#bg {
  width: 100vw;
  height: 100vh;
  background-color: #5865f2;
}
</style>