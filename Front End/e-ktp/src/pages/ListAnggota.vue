<template>
    <div>
      <div class="row">
        <div class="col-md-3">
          <Sidebar></Sidebar>
        </div>
        <div class="col-md-9">
          <DaftarAnggota></DaftarAnggota>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  
  import Sidebar from '../components/Sidebar.vue'
  import DaftarAnggota from '../components/DaftarAnggota.vue'
  
  export default {
      name : 'DaftarAKPage',
      components: {
  
          Sidebar,
          DaftarAnggota,
  
        
    },
    mounted(){
      console.log(this.$route.params.no_kk)
    }
  }
  </script>
  
  <style scoped>
  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }
  
  </style>