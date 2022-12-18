<template>
  <div id="bg" class="d-flex justify-content-center">
    <div>
      <div class="border border-secondary p-2 mt-5 mb-5 rounded shadow" id="x" style="width: 900px; margin:auto;">
        <img src="https://cdn-icons-png.flaticon.com/512/1497/1497759.png" class="img-fluid" id="ktp">
        <h3 id="d" class="text-white">Daftar Peserta</h3>
        <div class="d-flex flex-center p-3 mt-4 mr-4">
  
      <form id="q" style="width: 500px; margin: auto">
        <div class="form-row">
      <label class="col-sm-2 col-form-label text-white">Nama Lengkap</label>
      <div class="col-sm-10">
        <input type="text" class="form-control ml-1" id="" placeholder="Email">
      </div>
    </div>
    <div class="form-group row">
      <label class="col-sm-2 col-form-label text-white">Email</label>
      <div class="col-sm-10">
        <input type="email" class="form-control ml-1" id="" placeholder="Password">
      </div>
    </div>
    <div class="form-group row">
      <label class="col-sm-2 col-form-label text-white">Password</label>
      <div class="col-sm-10">
        <input type="password" class="form-control ml-1" id="" placeholder="Email">
      </div>
    </div>
    <div class="form-group row">
      <label class="col-sm-2 col-form-label text-white">Repassword</label>
      <div class="col-sm-10">
        <input type="password" class="form-control ml-1" id="" placeholder="Password">
      </div>
    </div>
    <div class="form-group row">
      <div class="col-sm-4 mt-2 d-flex justify-content-around">
        <button type="submit" class="btn btn-danger">Login</button>
        <button type="submit" class="btn btn-primary">Daftar</button>
      </div>
    </div>
    <div>
      <p class="small fw-bold mt-2 pt-1 mb-0 text-white">Sudah mempunyai akun? <a href="/"
        class="link-danger">Masuk di sini</a></p>
    </div>
  </form>
    </div>
      </div>
    </div>
  </div>
  
</template>

<script>
export default {
name: 'registerComponents',
}
</script>

<style>

* {
  margin: 0;
  padding: 0;
}
#x{
  margin-left: 100%;
  width: 100%;
  background-color: #36393f;
}
#q{
  margin : auto;
}
#d{
  text-align: center;
}
#ktp{
  width: 100px;
  height: auto;
  margin-left: 400px;
}
#bg {
  width: 100vw;
  height: 100vh;
  background-color: #5865f2;
}
</style>