<template>
  <div v-show="!success">
                <!-- Button -->
                <h2 id="dak" class="mt-3">Detail Anggota Keluarga</h2>
                <router-link :to="{ path: '/detailKK/' + anggotaData.id_kk + '/listAnggota' }">
                <button class="btn btn-success mt-4 shadow">Back</button>
            </router-link>

            <button class="btn btn-warning mt-4 mx-2 text-white" type="submit" @click.prevent="updateFunc()">
                Update Anggota
            </button>

    <!-- <div id="dak0" class="mt-4"> -->
      <!-- <router-link to="/home" type="submit" class="btn btn-primary mt-2">Back</router-link>
    </div> -->

    <div class="border border-secondary p-5 mt-3 mb-5 rounded" style="width: 80%;" id="kotak00" >

      <form action="" class="mt-3 p-4" @submit.prevent="updateAnggotaKKFunc">

        <div class="form-row">
          <label class="col-sm-2 col-form-label">NIK</label>
          <div class="form-group row">
            <div class="col-sm-10">
            <input :disabled="ReadOnly" v-model="anggotaData.nik" type="text" class="form-control" placeholder="NIK">
            </div>
          </div>
          <label class="col-sm-3 col-form-label" >Jenis Kelamin</label>
        <div class="form-group row">
          <div class="col-sm-12">
          <select :disabled="ReadOnly" v-model="anggotaData.jenis_kelamin" class="form-control" placeholder="Jenis Kelamin">
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
            <input :disabled="ReadOnly" v-model="anggotaData.nama" type="text" class="form-control" placeholder="Nama">
            </div>
          </div>
    
          <label class="col-sm-3 col-form-label" >Agama</label>
          <div class="form-group row">
            <div class="col-sm-12">
            <select :disabled="ReadOnly" v-model="anggotaData.agama" class="form-control" placeholder="Agama">
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
            <input :disabled="ReadOnly" v-model="anggotaData.tanggal_lahir" type="date" class="form-control" style="width:110%" placeholder="Tanggal Lahir">
            </div>
          </div>

        <label class="col-sm-3 col-form-label ml-5" style="margin-left : 200%">Pendidikan</label>
        <div class="form-group row" style="margin-left : -10px">
          <div class="col-sm-12">
          <select :disabled="ReadOnly" v-model="anggotaData.pendidikan" class="form-control" style="width:85%" placeholder="Pendidikan">
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
        <input :disabled="ReadOnly" v-model="anggotaData.tempat_lahir" type="text" class="form-control" placeholder="Tempat Lahir">
        </div>
      </div>
      <label class="col-sm-3 col-form-label">Kepala Keluarga</label>
      <div class="form-group row">
        <div class="col-sm-12">
        <select :disabled="ReadOnly" v-model="anggotaData.kepala_keluarga" class="form-control" style="width:150%" placeholder="Kepala Keluarga">
            <option selected>  </option>
                        <option>       Ya</option>
                        <option>       Tidak</option>
                    </select>
        </div>
      </div>
    </div>

    <div class="form-group row">
    <!-- <div class="col-sm-4  mt-3 d-flex justify-content-between">
      <button type="submit" class="btn btn-danger">Cancel</button>
      <button type="submit" class="btn btn-success">Update</button>
    </div> -->
  </div>
  <button class=" btn btn-success button-update" type="submit" v-show="btnUpdate">
                    Update
                </button>
  </form>
</div>
<div v-show="success">
            <Success :propsAlert="textAlert"></Success>
        </div>
    </div>

</template>

<script>
import anggotakkService from '@/services/anggotakkService';
import Success from './Success.vue';

export default {
    name : "FormAnggotaComponents",
    components: {
        Success
    },

    data() {
        return {
            anggotaData: {
                nik: null,
                agama: null,
                nama: null,
                jenis_kelamin: null,
                tempat_lahir: null,
                tanggal_lahir: null,
                pendidikan: null,
                kepala_keluarga: null,
                id_kk: null,
            },
            ReadOnly: true,
            success: false,
            textAlert: '',
            btnUpdate: false,
        };
    },

    methods: {
      updateGetId() {
            let id = this.$route.params.id;
            anggotakkService
                .updateGetId(id)
                .then((response) => {
                    this.anggotaData = response.data;
                    console.log(this.anggotaData);
                })
                .catch((e) => {
                    console.log(e);
                });
        },


        updateAnggotaKKFunc() {
            let data = this.anggotaData;
            let id = this.$route.params.id;
            anggotakkService
                .updateAnggotaKK(id, data)
                .then((response) => {
                    console.log(response.data);
                    this.success = true;
                    this.textAlert = 'Diupdate ';
                })
                .catch((e) => {
                    console.log(e);
                });
        },

        updateFunc() {
            let update = this.ReadOnly;
            if (update == true) {
                this.ReadOnly = false;
                this.btnUpdate = true;
            } else {
                this.ReadOnly = true;
                this.btnUpdate = false;
            }
        },
    },

    mounted() {
        this.updateGetId();
    }

}
</script>

<style scoped>

#dak {
  color : #282892;
}

/* #kotak00{
    width: 800px; 
    margin: 350px;
} */
</style>