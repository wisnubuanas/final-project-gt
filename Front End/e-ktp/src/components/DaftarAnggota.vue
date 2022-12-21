<template>
  <div class="form-add" v-show="!success">
    <h5 class="mt-4 mb-2 mb-2 d-flex text-center">Daftar Anggota keluarga</h5>
    <router-link :to="{ path: '/detailKK/' + this.$route.params.no_kk }">
        <button class="btn btn-primary mt-3 shadow">Back</button>
    </router-link>
            <b-button class="btn btn-success btn-tambah mt-3 shadow" v-b-modal.modal-prevent-closing>Tambah Anggota</b-button>
<!-- table -->
    <div class="table mt-4 ml-3  " style="width: 100vw;">
        <table >
              <thead>
                  <tr>
                      <th scope="col">No</th>
                      <th scope="col">NIK</th>
                      <th scope="col">Nama</th>
                      <th scope="col">Jenis Kelamin</th>
                      <th scope="col">Kepala Keluarga</th>
                      <th scope="col">Action</th>
                  </tr>
              </thead>
              <tbody v-if="anggotaData.length > 0">
                  <tr v-for="(item, index) in anggotaData" :key="item.id">
                      <td>{{ index + 1 }}</td>
                      <td>{{ item.nik }}</td>
                      <td>{{ item.nama }}</td>
                      <td>{{ item.jenis_kelamin }}</td>
                      <td>{{ item.kepala_keluarga }}</td>
                      <td class="d-flex">
                        <router-link :to="`/detailKK/${item.id}/listAnggota/detailAnggota`">
                                <button class="btn btn-primary mr-1 btn-tambah">Detail</button>
                            </router-link>
                            <button class="btn btn-danger" type="submit" @click="deleteAnggotaKKFunc(item.id)">Hapus</button>
                        <!-- <router-link :to="{ name :'listak' , params:{ide:item.id}}"><button class="btn btn-primary mr-2" type="submit">Detail</button>
                        </router-link>
                          <button class="btn btn-sm btn-danger" @click="deleteAnggotaKKFunc(item.id)">Delete</button> -->
                      </td>
                  </tr>
              </tbody>
              <tbody v-else>
                <tr class="msg-tr text-center">
                  <td colspan="6" class="msg-null">
                    <h3>Data Tidak Tersedia</h3>
                  </td>
                </tr>
            </tbody>
          </table>
      </div>
      <!-- <table></table> -->

      <!-- ftambah Anggota -->
      <b-modal id="modal-prevent-closing" ref="modal" title="Silahkan Tambahkan Anggota" ok-title="Submit"
                cancel-title="Tutup"  @ok="TambahAK" @submit="getIdKK" required>
                <!-- <button @submit="inputAnggota" type="submit">tes</button> -->

      <!-- <div class="border border-secondary p-5 mt-5 mb-5 rounded" id="kotakformtambah" > -->

<form @submit="inputAnggota">
  <div class="form-row">
    <label class="col-sm-2 col-form-label">NIK</label>
    <div class="form-group row">
      <div class="col-sm-10">
      <input v-model="anggotaData.nik" type="text" class="form-control" placeholder="NIK">
      </div>
    </div>
    <label class="col-sm-3 col-form-label" >Jenis Kelamin</label>
  <div class="form-group row">
    <div class="col-sm-12">
    <select v-model="anggotaData.jenis_kelamin" class="form-control" placeholder="Jenis Kelamin">
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
      <input v-model="anggotaData.nama" type="text" class="form-control" placeholder="Nama">
      </div>
    </div>

    <label class="col-sm-3 col-form-label" >Agama</label>
    <div class="form-group row">
      <div class="col-sm-12">
      <select v-model="anggotaData.agama" class="form-control" placeholder="Agama">
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
      <input v-model="anggotaData.tanggal_lahir" type="date" class="form-control" style="width:110%" placeholder="Tanggal Lahir">
      </div>
    </div>

  <label class="col-sm-3 col-form-label ml-5" style="margin-left : 200%">Pendidikan</label>
  <div class="form-group row" style="margin-left : -10px">
    <div class="col-sm-12">
    <select v-model="anggotaData.pendidikan" class="form-control" style="width:85%" placeholder="Pendidikan">
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
  <input v-model="anggotaData.tempat_lahir" type="text" class="form-control" placeholder="Tempat Lahir">
  </div>
</div>
<label class="col-sm-3 col-form-label">Kepala Keluarga</label>
<div class="form-group row">
  <div class="col-sm-12">
  <select v-model="anggotaData.kepala_keluarga" class="form-control" style="width:150%" placeholder="Kepala Keluarga">
      <option selected>  </option>
                  <option>       Ya</option>
                  <option>       Tidak</option>
              </select>
  </div>
</div>
</div>

<!-- <div class="form-group row">
<div class="col-sm-4  mt-3 d-flex justify-content-between">
<button type="submit" class="btn btn-danger">Cancel</button>
<button type="submit" class="btn btn-success">Update</button>
</div>
</div> -->
</form>
<!-- </div> -->
<p  v-if="validasiKK" class="small text-danger">NIK Sudah Terdaftar</p>
            </b-modal>
<!-- end -->
<div v-show="success">
            <Success :propsAlert="textAlert"></Success>
        </div>
    </div>
</template>

<script>
import anggotakkService from '@/services/anggotakkService';
import success from './Success.vue';

export default {
name: "daftarakComponent",
components: {
        success
    },

data() {
        return {
            anggotaKeluargaData: [],
            success: false,
            textAlert: '',

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
            }
        };
    },

methods : {
  TambahAK() {
            this.getIdKK();
            let data = this.anggotaData;
            let id = this.anggotaData.id;
            // let id = this.$route.params.id;
            let route = this.$route.fullPath;
            if (route === `/updateAnggota`) {
                anggotakkService.updateKartuKeluarga(id, data)
                    .then((response) => {
                        console.log(response.data);
                    })
                    .catch((e) => {
                        console.log(e);
                    });
            } else {
                anggotakkService.create(data)
                    .then((response) => {
                        console.log(response.data);
                        this.textAlert = 'Disubmit '
                        this.success = true;
                    })
                    .catch((e) => {
                        let errorEntry = e.response.data.trace.includes("Duplicate entry");
                        if (errorEntry) {
                            this.validasiKK = true;
                        } else {
                            this.validasiKK = false;
                        }
                    });
            }
        },
        inputAnggota() {
            let data = this.anggotaData;
            // console.log(data)
            anggotakkService.create(data)
            .then(response => {
                console.log(response);
                // this.$router.push("/home");
            }).catch((e) => {
                console.log(e);
            });
        },
        getIdKK() {
                this.anggotaData.id_kk = this.$route.params.no_kk
            },
        getAnggotaKK() {
                let id_kk = this.$route.params.no_kk;
                anggotakkService.getAnggotaKK(id_kk)
                    .then((response) => {
                        this.anggotaData = response.data;
                        console.log(this.anggotaData);
                    })
                    .catch((e) => {
                        console.log(e);
                    });
            },
        deleteAnggotaKKFunc(id){
                if(confirm("Apakah anda yakin hapus?")){
                anggotakkService.deleteAnggotaKK(id)
                .then(response => {
                    console.log(response.data);
                })
                .catch(e => {
                    console.log(e);
                    });
                    location.reload();
                }else{
                    alert("Hapus dibatalkan!")
                }
              }
            },
        Form(id) {
            anggotakkService.updateGetId(id)
                .then(response => {
                    this.anggotaData = response.data
                }).catch(e => {
                    console.log(e);
                })
        },
        mounted(){
            this.getAnggotaKK(this.$route.params.no_kk);
        },
        //         getAnggotaKK(){
        //             anggotakkService.getAll()
        //                 .then(response => {
        //                     this.anggotaData = response.data;
        //                     console.log(this.anggotaData);
        //                 })
        //                 .catch(e => {
        //                     console.log(e);
        //                 });
        // },

        // data(){
            //     return{
                //         anggotaData : null,
                //     }
    // }
}
</script>

<style>
#kotakformtambah{
    width: 750px;
    height: fit-content;
}
#modal-prevent-closing{
  margin :auto;
}
.btn-tambah {
    margin-left: 10px;
}
</style>