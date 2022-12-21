<template>
    <div>
      <div>
      <div class="row">
        <div class="col-md-3">
          <Sidebar></Sidebar>
        </div>
        <div class="col-md-9">
          <FormAnggota></FormAnggota>
        </div>
      </div>
    </div>   
    </div>
  </template>
  
  <script>
  
  import FormAnggota from '../components/FormAnggota.vue'
  import Sidebar from '../components/Sidebar.vue'
  
  export default {
      name : 'FormAnggotaPage',
      components: {
  
          FormAnggota,
          Sidebar,
  
        
    },
  }
  </script>
  
  <!-- <style>
#d{
    margin-left: 50px;
}
  </style> -->