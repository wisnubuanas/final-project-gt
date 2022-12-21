<template>
  <div class="form-add">

    <h2 id="dak" class="mt-3">Detail Kartu Keluarga</h2>
    <router-link to="/home" v-show="!success">
            <button class="btn btn-primary mt-3 ">Back</button>
        </router-link>

        <button class="btn btn-warning mt-3 ml-2 mx-2 text-white" type="submit"
            v-show="!showBtn" @click.prevent="updateFunc()">
            Edit
        </button>

        <router-link :to="{name : 'listak'}">
            <button class="btn btn-success mt-3 ml-2" >
                {{ btnDetail }}
            </button>
        </router-link>

        <form action="" class="mt-3 p-4 " @submit.prevent="inputKK" v-show="!success">
          <div class="form-row">
          <label class="col-sm-2 col-form-label">Nomor Kartu Keluarga</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input :disabled="ReadOnly" v-model="kkData.nomor_kk" type="text" class="form-control" placeholder="Nomer KK">
            </div>
          </div>
          <label class="col-sm-3 col-form-label">Desa / Kelurahan</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input :disabled="ReadOnly"  v-model="kkData.desa_kelurahan" type="text" class="form-control" placeholder="Desa / Kelurahan">
            </div>
          </div>
        </div>
        
        <div class="form-row">
          <label class="col-sm-2 col-form-label">Alamat</label>
            <div class="form-group row">
              <div class="col-sm-10">
              <textarea  :disabled="ReadOnly"  v-model="kkData.alamat"  style="overflow: auto;" cols="72" rows="auto"  placeholder="Alamat"> </textarea>
            </div>
          </div>
        </div>
    
          <div class="form-row">
          <label class="col-sm-2 col-form-label">Kecamatan</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input :disabled="ReadOnly" v-model="kkData.kecamatan" type="text" class="form-control" placeholder="Kecamatan">
            </div>
          </div>
    
          <label class="col-sm-3 col-form-label" >Kabupaten / Kota</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input :disabled="ReadOnly" v-model="kkData.kabupaten_kota"  type="text" class="form-control" placeholder="Kabupaten / Kota">
            </div>
          </div>
          </div>
        <div class="form-row">
          <label class="col-sm-2 col-form-label" >RT</label>
        <div class="form-group row">
          <div class="col-sm-10">
          <input :disabled="ReadOnly"  v-model="kkData.rt" type="text" class="form-control" placeholder="RT">
          </div>
        </div>
        <label class="col-sm-3 col-form-label">Provinsi</label>
        <div class="form-group row">
          <div class="col-sm-10">
          <input :disabled="ReadOnly" v-model="kkData.provinsi"  type="text" class="form-control" placeholder="Provinsi">
          </div>
        </div>
      </div>

      <div class="form-row">
        <label class="col-sm-2 col-form-label">RW</label>
      <div class="form-group row">
        <div class="col-sm-10">
        <input :disabled="ReadOnly"  v-model="kkData.rw" type="text" class="form-control" placeholder="RW">
        </div>
      </div>
      <label class="col-sm-3 col-form-label">Kode Pos</label>
      <div class="form-group row">
        <div class="col-sm-10">
        <input :disabled="ReadOnly"  v-model="kkData.kode_pos" type="text" class="form-control" placeholder="Kode Pos">
        </div>
      </div>
    </div>
    <p v-if="validasiKK" class="small text-danger">Nomor KK Sudah Terdaftar</p>            
            <button class="button-submit mr-2" type="submit" v-show="buttons == '/addkk'">
                {{ buttonValue }}
            </button>
            <button class="button-submit btn btn-primary" type="submit" v-show="updateBtn">
                {{ buttonValue }}
            </button>
        </form>
        <div class="" v-show="success">
            <Success :propsAlert="textAlert"></Success>
        </div>
  </div>
</template>

<script>
import kkService from '@/services/kkService';
import success from "../components/Success.vue";


export default {
  name: "detailComponents",
    components: {
        success,
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
            buttons: this.$route.path,
            buttonValue: "Submit",
            success: false,
            ReadOnly: true,
            // kkNo: true,
            btnDetail: 'Tambah',
            showBtn: false,
            textAlert: '',
            Btnbawah : false,
            updateBtn : false,
            validasiKK: false,

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
        updateFunc() {
          let update = this.ReadOnly;
            if (update == true) {
                this.ReadOnly = false;
                this.updateBtn = true;
            } else {
                this.ReadOnly = true;
                this.updateBtn = false;
            }
        },
        getKK(id) {
            let nomor_kk = this.$route.params.no_kk;
            if (nomor_kk > 0) {
                this.buttonValue = "Update";
            }
            kkService
                .updateGetId(id)
                .then((response) => {
                    this.kkData = response.data;
                    console.log(this.kkData);
                })
                .catch((e) => {
                    console.log(e);
                });
        },
    },
    mounted() {
        if (this.$route.params.no_kk > 0) {
            this.getKK(this.$route.params.no_kk);
            this.btnDetail = 'Lihat Anggota'
        } else if (this.btnDetail == 'Tambah') {
            this.ReadOnly = false;
            // this.kkNo = false;
        }
    },
};


</script>

<style>

</style>