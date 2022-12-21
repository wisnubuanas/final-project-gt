<template>
<div>
  <div class="home ml-3">
    <h1 class="mt-3 mb-3 ">Homepage</h1>
    <div class="row">
      <div class="col col-md-4">

        <!-- CARD -->
        <div class="card-1 d-flex flex-column justify-content-center text-center shadow">
          <p class="title-card">Jumlah KK</p>
          <p class="card-text">{{ kkData.length }}</p>
        </div>
      </div>
      <div class="col">
        <div class="card-2 d-flex flex-column justify-content-center text-center">
          <p class="title-card">Jumlah Anggota</p>
          <p class="card-text">{{ anggotaData.length }}</p>
        </div>
      </div>

      <!-- TABLE -->
      <div class="table mt-2 ml-3  " style="width: 100vw;">
        <h4 id="dkktulisan" class="mt-4 mb-2 mb-2 d-flex text-center">Data Kartu keluarga</h4>
        <table id="datakkk" class="mt-3" >
              <thead>
                  <tr>
                      <th scope="col">No</th>
                      <th scope="col">Nomor KK</th>
                      <th scope="col">Alamat</th>
                      <th scope="col">Kota</th>
                      <th scope="col">Kode Pos</th>
                      <th scope="col">Action</th>
                  </tr>
              </thead>
              <tbody v-if="kkData.length > 0">
                  <tr v-for="(item, index) in kkData" :key="item.id">
                      <td>{{ index + 1 }}</td>
                      <td>{{ item.nomor_kk }}</td>
                      <td>{{ item.alamat }}</td>
                      <td>{{ item.kabupaten_kota }}</td>
                      <td>{{ item.kode_pos }}</td>
                      <td class="d-flex">
                        <router-link :to="{ name :'details' , params:{no_kk:item.id}}"><button class="btn btn-primary mr-2" type="submit">Detail</button>
                        </router-link>
                          <button class="btn btn-sm btn-danger" @click="deleteKKFunc(item.id)">Delete</button>
                      </td>
                  </tr>
              </tbody>
              <tbody v-else>
                <tr class="msg-tr text-center">
                  <td colspan="6" class="msg-null">
                    <h3>Saat ini Tidak Ada Data Kartu Keluarga !</h3>
                  </td>
                </tr>
            </tbody>
          </table>

          <div class="footer">
            <!-- FOOTER -->
            <!-- <footer class="text-center text-white ">
              <p class="bg-dark h-5 py-1 small rounded">Copyright | 2022</p>
            </footer> -->
          </div>
      </div>
    </div>
  </div>
  <div>
    
  </div>
</div>
</template>

<script>
import kkService from "../services/kkService"
import anggotakkService from "@/services/anggotakkService";

export default {
name : "CardComponents",

methods : {
        getKK(){
            kkService.getAll()
                .then(response => {
                    this.kkData = response.data;
                    console.log(this.kkData);
                })
                .catch(e => {
                    console.log(e);
                });
},
        getAnggota() {
            anggotakkService.getAll()
                .then((response) => {
                    this.anggotaData = response.data;
                    console.log(this.anggotaData);
                })
                .catch((e) => {
                    console.log(e);
                });
        },
        deleteKKFunc(id){
            if(confirm("Apakah anda yakin hapus?")){
                kkService.deletekk(id)
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
    mounted(){
        this.getKK();
        this.getAnggota()
    },
    data(){
        return{
            kkData : null,
            anggotaData : null,
        }
    }
}
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

.card-1 {
  height: 150px;
  width: 200px;
  /* background-color: salmon; */
  background-color: #36393f;
  border-radius: 20px;
}

.card-2 {
  height: 150px;
  width: 200px;
  /* background-color: rgb(0, 255, 170); */
  background-color: #36393f;
  border-radius: 20px;
}



.title-card {
  font-size: 20px;
  color: aliceblue;
}

.count {
  font-size: 40px;
  color: aliceblue;
}
.card-text {
  font-size: 40px;
  color: aliceblue;
}
.footer {
  margin-top: 20px;
}



#dkktulisan{
  margin-left: 250px;
}
#datakkk{
  margin-left: 50px;
}
/* #h{
  margin-left: 230px;
} */


</style>