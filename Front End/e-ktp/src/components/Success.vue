<template>
  <div class="d-flex justify-content-around">
      <div class="cards shadow mt-5 text-center">
          <div class="card-body ">
              <h4 class="card-title mb-1 text-white">Success!</h4>
              <p class="card-text text-white">Data Berhasil {{ propsAlert }} !</p>

              <router-link to="/home" v-if="propsAlert === 'Disubmit'">
                  <button class="btn btn-primary mt-3">Back</button>
              </router-link>

              <router-link to="/home" v-else-if="propsAlert === 'Diupdate'">
                  <button class="btn btn-primary mt-3">Back</button>
              </router-link>

              <router-link :to="{ path: '/detailKK/' + this.$route.params.no_kk + '/listAnggota/' }"
                  v-else-if="propsAlert === 'Disubmit '">
                  <button class="btn btn-primary mt-3" @click="RefreshFunc">Back</button>
              </router-link>

              <router-link :to="{ path: '/detailKK/' + this.$route.params.id + '/listAnggota/detailAnggota' }"
                  v-else-if="propsAlert === 'Diupdate '">
                  <button class="btn btn-primary mt-3" @click="RefreshFunc">Back</button>
              </router-link>
          </div>
      </div>
  </div>
</template>

<script>
export default {
  name: "SuccessComp",
  data() {
      return {
      }
  },
  methods: {
      RefreshFunc() {
          location.reload();
      },
  },
  props: [
      'propsAlert'
  ],
}
</script>

<style scoped>
.cards {
  border: 1px solid #25AAE1;
  padding: 15px 15px;
  border-radius: 15px;
  margin-top: 15px;
  width: 50%;
}
.btn-primary {
  background-color: #25AAE1;
}
</style>
<!-- <template>
    <div class="cards">
      <div class="card-body">
          <h5 class="card-title">Success!</h5>
          <p class="card-text" >Your Data Has Been {{ Judul }} !</p>
          <router-link to="/" v-if="Judul === 'Submit'">
            <button class="back btn btn-primary mt-3">Back</button>
          </router-link>
          <router-link to="/" v-else-if="Judul === 'Update'">
            <button class="back btn btn-primary mt-3">Back</button>
          </router-link>
        <button class="btn btn-primary" @click="RefreshFunc" v-else>Back</button>
      </div>
    </div>
  </template>
  
  <script>
  export default {
  name : 'SuccesComponent',
  data() {
      return {
        Judul: null,
      };
    },
    methods: {
      ubahJudul() {
        let route = this.$route.fullPath;
        if (route === "/add") {
          this.Judul = "inputed";
        } else if (route === "/"){
          this.Judul = " deleted";
        } else {
          this.Judul = "updated";
        }
      },
      RefreshFunc() {
        location.reload();
      },
    },
    mounted() {
      this.ubahJudul();
    },
  };
  </script>
  
  <style scoped>
  
  </style> -->