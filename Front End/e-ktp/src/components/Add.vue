<template>
  <div>
    <div id="dak0" class="mt-4">
      <h2 id="dak">Tambah Kartu Keluarga</h2>
      <router-link to="/home" type="submit" class="btn btn-primary mt-2">Back</router-link>
    </div>

    <div class="border border-secondary p-5 mt-5 mb-5 rounded" id="borderaddkk" >

      <form @submit.prevent="inputKK">

        <div class="form-row">
          <label class="col-sm-2 col-form-label">Nomor Kartu Keluarga</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input v-model="kkData.nomor_kk" type="text" class="form-control" placeholder="Nomer KK">
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
              <textarea v-model="kkData.alamat" style="overflow: auto;" cols="72" rows="auto"  placeholder="Alamat"> </textarea>
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
        <input v-model="kkData.rw" type="text" class="form-control" placeholder="RW">
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
import kkService from "../services/kkService"
// import success from "./Success.vue";

export default {
name : 'AddComponent',
components: {
        // success,
    },
    data() {
        return {
            kkData: {
                alamat: null,
                desa_kelurahan: null,
                kabupaten_kota: null,
                kecamatan: null,
                kode_pos: null,
                nomor_kk: null,
                provinsi: null,
                rt: null,
                rw: null,
            },
};
    },
    methods: {
        inputKK() {
            let data = this.kkData;
            let id = this.kkData.id;
            let route = this.$route.fullPath;
            if (route === "/addkk") {
                kkService
                    .create(data)
                    .then((response) => {
                        console.log(response.data);
                        this.success = true;
                        this.textAlert = 'Disubmit';
                    })
                    .catch((e) => {
                      let errorEntry = e.response.data.trace.includes("Duplicate entry");
                        if (errorEntry) {
                            this.validasiKK = true;
                        } else {
                            this.validasiKK = false;
                        }
                    });
            } else {
                kkService
                    .updateKK(id, data)
                    .then((response) => {
                        console.log(response.data);
                        this.success = true;
                        this.textAlert = 'Diupdate';
                    })
                    .catch((e) => {
                        console.log(e);
                    });
            }
        },
    
    }}
</script>

<style>
#dak {
  color : #282892;
}
#atast{
  margin: left 200%;
}
#borderaddkk{
  width: 800px; 
    /* margin: 350px; */
}
/* #dak{
  margin-left: 300px;
} */
</style>