<template>
  <div>
    <div class="border border-secondary p-5 mt-5 mb-5 rounded"  >

<form @submit.prevent="inputKK" class="d-flex">

  <div class="form-row">
    <label class="col-sm-2 col-form-label">Nomor Kartu Keluarga</label>
    <div class="form-group row">
      <div class="col-sm-10">
      <input v-model="kkData.nomor_kk" type="text" class="form-control" placeholder="Nomer Kartu Keluarga">
      <!-- :disabled=Readonlykk -->
      </div>
    </div>
    <label class="col-sm-3 col-form-label">Desa / Kelurahan</label>
    <div class="form-group row">
      <div class="col-sm-10">
      <input v-model="kkData.desa_kelurahan" type="text" class="form-control" placeholder="Desa / Kelurahan">
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
      <input v-model="kkData.kecamatan" type="text" class="form-control" placeholder="Kecamatan">
      </div>
    </div>

    <label class="col-sm-3 col-form-label" >Kabupaten / Kota</label>
    <div class="form-group row">
      <div class="col-sm-10">
      <input v-model="kkData.kabupaten_kota" type="text" class="form-control" placeholder="Kabupaten / Kota">
      </div>
    </div>
    </div>
  <div class="form-row">
    <label class="col-sm-2 col-form-label" >RT</label>
  <div class="form-group row">
    <div class="col-sm-10">
    <input v-model="kkData.rt" type="text" class="form-control" placeholder="RT">
    </div>
  </div>
  <label class="col-sm-3 col-form-label">Provinsi</label>
  <div class="form-group row">
    <div class="col-sm-10">
    <input v-model="kkData.provinsi" type="text" class="form-control" placeholder="Provinsi">
    </div>
  </div>
</div>

<div class="form-row">
  <label class="col-sm-2 col-form-label">RW</label>
<div class="form-group row">
  <div class="col-sm-10">
  <input  v-model="kkData.rw" type="text" class="form-control" placeholder="RW">
  </div>
</div>
<label class="col-sm-3 col-form-label">Kode Pos</label>
<div class="form-group row">
  <div class="col-sm-10">
  <input v-model="kkData.kode_pos" type="text" class="form-control" placeholder="Kode Pos">
  </div>
</div>
</div>


<button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
  </div>
</template>

<script>
import anggotakkService from '@/services/anggotakkService';

export default {
name : "AnggotaKKComponent",
data(){
  return{
    AnggotaKKData: {
      agama: null,
      id_kk: null,
      jenis_kelamin : null,
      kepala_keluarga : null,
      nama : null,
      nik : null,
      pendidikan : null,
      tanggal_lahir : null,
      tempat_lahir : null,
    },
    success: false,
    buttonValue : "Submit",
    title : "Tambah Anggota Keluarga",
    ReadonlyKK: true,
    UpdateButton : false,
    ListButton : false,
    SubmitButton : true,
  };
},

methods: {
  inputAnggotaKK(){
    let data = this.AnggotaKKData;
    if (this.buttonValue === "Submit"){
      AnggotaKKServices.create(data).then((response) => {
        console.log(response.data);
        this.success = true;
      });
      Swal.fire({
        position: "center",
        icon: "success",
        title: "Input Berhasil !",
        timer: 2000,
        timerProgressBar: true,

      })
      .then(() => {
        this.$router.push("/home");
      }
      )
      .catch((e) => {
        console.log(e);
      }
      );
    } else {
      AnggotaKKServices.updateAnggotaKK(data.id, data).then((response) => {
        console.log(response.data);
        this.success = true;
      }
      );
      Swal.fire({
        position: "center",
        icon: "success",
        title: "Update Data Berhasil !",
        timerProgressBar: false, 
      }

      )
    }
  }
}
}
</script>

<style>

</style>