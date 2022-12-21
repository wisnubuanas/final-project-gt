<template>
    <div class="row">
      <div class="col-md-3">
        <Sidebar></Sidebar>
      </div>
      <div class="col-md-9">
        <Add></Add>
      </div>
    </div>
</template>

<script>
import Add from '../components/Add.vue'
import Sidebar from '../components/Sidebar.vue'

export default {
    name : 'AddPage',
    components: {
        Add, 
        Sidebar,

      
  },
}
</script>

<style>
/* #t{
    margin-left: 100px;
} */
</style>