<template>
  <div>
    <div id="dak0" class="mt-4">
      <h2 id="dak">Tambah Kartu Keluarga</h2>
      <router-link to="/home" type="submit" class="btn btn-primary mt-2">Back</router-link>
    </div>

    <div class="border border-secondary p-5 mt-5 mb-5 rounded" id="borderaddkk" >

      <form id="xx">

        <div class="form-row">
          <label class="col-sm-2 col-form-label">Nomor Kartu Keluarga</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="Nomer Kartu Keluarga">
            </div>
          </div>
          <label class="col-sm-3 col-form-label">Desa / Kelurahan</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="Desa / Kelurahan">
            </div>
          </div>
        </div>
        
        <div class="form-row">
          <label class="col-sm-2 col-form-label">Alamat</label>
            <div class="form-group row">
              <div class="col-sm-10">
              <textarea style="overflow: auto;" cols="72" rows="auto"  placeholder="Alamat"> </textarea>
            </div>
          </div>
        </div>
    
          <div class="form-row">
          <label class="col-sm-2 col-form-label">Kecamatan</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="Kecamatan">
            </div>
          </div>
    
          <label class="col-sm-3 col-form-label" >Kabupaten / Kota</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="Kabupaten / Kota">
            </div>
          </div>
          </div>
        <div class="form-row">
          <label class="col-sm-2 col-form-label" >RT</label>
        <div class="form-group row">
          <div class="col-sm-10">
          <input type="text" class="form-control" placeholder="RT">
          </div>
        </div>
        <label class="col-sm-3 col-form-label">Provinsi</label>
        <div class="form-group row">
          <div class="col-sm-10">
          <input type="text" class="form-control" placeholder="Provinsi">
          </div>
        </div>
      </div>

      <div class="form-row">
        <label class="col-sm-2 col-form-label">RW</label>
      <div class="form-group row">
        <div class="col-sm-10">
        <input type="text" class="form-control" placeholder="RW">
        </div>
      </div>
      <label class="col-sm-3 col-form-label">Kode Pos</label>
      <div class="form-group row">
        <div class="col-sm-10">
        <input type="text" class="form-control" placeholder="Kode Pos">
        </div>
      </div>
    </div>


    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
    </div>

</template>

<script>
export default {
name : 'AddComponent',
}
</script>

<style>
#tkk {
  color : #282892;
}
#atast{
  margin: left 200%;
}
#borderaddkk{
  width: 800px; 
    margin: 350px;
}
</style>