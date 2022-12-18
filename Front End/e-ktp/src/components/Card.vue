<template>
<div>
  <div class="home ml-3">
    <h1 class="mt-3 mb-3 ">Home</h1>
    <div class="row">
      <div class="col col-md-4">

        <!-- CARD -->
        <div class="card-1 d-flex flex-column justify-content-center text-center">
          <p class="title-card">Jumlah KK</p>
          <p class="card-text">{{ kkData.length }}</p>
        </div>
      </div>
      <div class="col">
        <div class="card-2 d-flex flex-column justify-content-center text-center">
          <p class="title-card">Jumlah Anggota</p>
          <p class="count">0</p>
        </div>
      </div>

      <!-- TABLE -->
      <div class="table mt-2 ml-3 " style="width: 80vw;">
        <h5 class="mt-4 mb-2 mb-2">Tabel Kartu keluarga</h5>
        <table id="datakkk" >
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
              <tbody>
                  <tr v-for="(item, index) in kkData" :key="item.id">
                      <td>{{ index + 1 }}</td>
                      <td>{{ item.nomor_kk }}</td>
                      <td>{{ item.alamat }}</td>
                      <td>{{ item.kabupaten_kota }}</td>
                      <td>{{ item.kode_pos }}</td>
                      <td class="d-flex">
                          <button class="btn btn-sm btn-warning mr-2 text-white">Update</button>
                          <button class="btn btn-sm btn-danger" @click="deleteKKFunc(item.id)">Delete</button>
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

    <!-- <div>
      <div class="mt-5 ml-5">
        <h3 id="h">Homepage</h3>
      </div>
      
    <div class="row mt-4" id="kotakkkk" style="width:50%">
      <div class="col-sm-6">
      <div class="card">
        <div class="card-body">
          <h5 class="card-title">Jumlah Kartu Keluarga</h5>
          <h3> NUMBER</h3> -->
          <!-- <p class="card-text">With supporting text below as a natural lead-in to additional content.</p> -->
          <!-- <a href="#" class="btn btn-primary">Go somewhere</a> -->
        <!-- </div>
      </div>
    </div>
    <div class="col-sm-6">
      <div class="card">
        <div class="card-body">
          <h5 class="card-title">Jumlah Seluruh Warga</h5>
          <h3>NUMBER</h3> -->
          <!-- <p class="card-text">With supporting text below as a natural lead-in to additional content.</p> -->
          <!-- <a href="#" class="btn btn-primary">Go somewhere</a> -->
        <!-- </div>
      </div>
    </div>
  </div> -->
  
  <!-- <div>         -->
          <!-- <h3 class="text-center my-4 mt-3 ">Data Kartu Keluarga</h3>
          <table id="datakk" class="table table-striped d-flex justify-content-around" >
              <thead>
                  <tr>
                      <th scope="col">No</th>
                      <th scope="col">Nomor KK</th>
                      <th scope="col">Nama</th>
                      <th scope="col">Alamat</th>
                      <th scope="col">Kota</th>
                      <th scope="col">Kode Pos</th>
                      <th scope="col">Action</th>
                  </tr>
              </thead>
              <tbody>
                  <tr v-for="(item, index) in kkData" :key="item.id">
                      <th>{{ index + 1 }}</th>
                      <td>wlwlwl</td>
                      <td>{{ item.first_name + " " + item.last_name }}</td>
                      <td>{{ item.email }}</td>
                      <td>{{ item.phone_number }}</td>
                      <td>{{ item.city }}</td>
                      <td>{{ item.address }}</td>
                      <td>{{ item.postal_code }}</td>
                      <td class="d-flex">
                          <button class="btn btn-sm btn-warning mr-2 text-white" @click="$emit('updateShippingFunc', item)">Update</button>
                          <button class="btn btn-sm btn-danger" @click="deleteShippingFunc(item.id)">Delete</button>
                      </td>
                  </tr>
              </tbody>
          </table>
      </div> -->
  
    <!-- </div> -->
    
  </div>
</div>
</template>

<script>
import kkService from "../services/kkService"

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
    },
    data(){
        return{
            kkData : null,
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
  background-color: salmon;
  border-radius: 20px;
}

.card-2 {
  height: 150px;
  width: 200px;
  background-color: rgb(0, 255, 170);
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



/* #kotakkkk{
  margin-left: 250px;
} */
/* #h{
  margin-left: 230px;
} */


</style>