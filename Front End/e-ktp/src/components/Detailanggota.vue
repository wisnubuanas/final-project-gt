<template>
  <div>
    <div id="dak0" class="mt-4">
      <h2 id="dak">Detail Anggota Keluarga</h2>
      <router-link to="/home" type="submit" class="btn btn-primary mt-2">Back</router-link>
    </div>

    <div class="border border-secondary p-5 mt-5 mb-5 rounded" id="kotak00" >

      <form id="xx">

        <div class="form-row">
          <label class="col-sm-2 col-form-label">NIK</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="NIK">
            </div>
          </div>
          <label class="col-sm-3 col-form-label" >Jenis Kelamin</label>
        <div class="form-group row">
          <div class="col-sm-12">
          <select  class="form-control" placeholder="Jenis Kelamin">
            <option selected>  </option>
                        <option>Laki - Laki</option>
                        <option>Perempuan</option>
            </select>
          </div>
        </div>
        </div>
    
          <div class="form-row">
          <label class="col-sm-2 col-form-label">Nama</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="Nama">
            </div>
          </div>
    
          <label class="col-sm-3 col-form-label" >Agama</label>
          <div class="form-group row">
            <div class="col-sm-12">
            <select class="form-control" placeholder="Agama">
                <option selected>  </option>
                        <option>Islam</option>
                        <option>Kristen</option>
                        <option>Katholik</option>
                        <option>Hindu</option>
                        <option>Budha</option>
                        <option>Konghuchu</option>
                    </select>
            </div>
          </div>
          </div>
        <div class="form-row">
            <label class="col-sm-2 col-form-label">Tanggal Lahir</label>
          <div class="form-group row">
            <div class="col-sm-12">
            <input type="date" class="form-control" style="width:110%" placeholder="Tanggal Lahir">
            </div>
          </div>

        <label class="col-sm-3 col-form-label ml-5" style="margin-left : 200%">Pendidikan</label>
        <div class="form-group row" style="margin-left : -10px">
          <div class="col-sm-12">
          <select class="form-control" style="width:85%" placeholder="Pendidikan">
            <option selected>  </option>
                        <option>SD</option>
                        <option>SMP</option>
                        <option>SMA</option>
                        <option>D3</option>
                        <option>S1</option>
                        <option>S2</option>
                        <option>S3</option>
                        <option>Belum Sekolah</option>
            </select>            
          </div>
        </div>
      </div>

      <div class="form-row">
        <label class="col-sm-2 col-form-label">Tempat Lahir</label>
      <div class="form-group row">
        <div class="col-sm-10">
        <input type="text" class="form-control" placeholder="Tempat Lahir">
        </div>
      </div>
      <label class="col-sm-3 col-form-label">Kepala Keluarga</label>
      <div class="form-group row">
        <div class="col-sm-12">
        <select class="form-control" style="width:150%" placeholder="Kepala Keluarga">
            <option selected>  </option>
                        <option>       Ya</option>
                        <option>       Tidak</option>
                    </select>
        </div>
      </div>
    </div>

    <div class="form-group row">
    <div class="col-sm-4  mt-3 d-flex justify-content-between">
      <button type="submit" class="btn btn-danger">Cancel</button>
      <button type="submit" class="btn btn-success">Update</button>
    </div>
  </div>
  </form>
</div>
    </div>

</template>

<script>
export default {
    name : "DetailComponents",
}
</script>

<style>
#dak {
  color : #282892;
}
#dak0 {
  margin-left: 270px;
}
#kotak00{
    width: 800px; 
    margin: 350px;
}
/* #pend{
    margin-left: 100px;
} */
</style>