<template>
    <div>
      <div>
      <div class="row">
        <div class="col-md-3">
          <Sidebar></Sidebar>
        </div>
        <div class="col-md-9">
          <DetailAK></DetailAK>
        </div>
      </div>
    </div>   
    </div>
</template>

<script>
import DetailAK from "../components/FormAnggota.vue"
import Sidebar from "../components/Sidebar.vue"

export default {
    name : 'TestPage',
    components: {
        DetailAK,
        Sidebar

      
  },
}
</script>

<style>

</style>