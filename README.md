
![Screenshot (790)](https://github.com/zehrayhn/SpringSecurityWithJWT/assets/75533288/eacf45c3-73c5-41a1-a869-62b0564cb736)

application.properties dosyasında veri tabanı ile ilgili gerekli değiştirmeleri yaparak projeyi çalıştırabilirsiniz. 



![Screenshot (785)](https://github.com/zehrayhn/SpringSecurityWithJWT/assets/75533288/dc5bf0ed-b48b-4151-a49b-f2e42a0a6edc)

Postman ile register işleminin gerçekleştirilmesi için body kısmında gerekli kullanıcı bilgileri girildikten sonra şekildeki gibi token döner.



![Screenshot (786)](https://github.com/zehrayhn/SpringSecurityWithJWT/assets/75533288/a90f4703-e280-4e28-bef5-c6df6969fdc3)

Login işlemi başarılı olduğunda da bir token döner.



![Screenshot (787)](https://github.com/zehrayhn/SpringSecurityWithJWT/assets/75533288/8a62baa9-6a87-4ce7-bfd5-0036f253455c)

Kimlik doğrulaması gereken url'ler için ise Authorization kısmından Bearer Token kısmı seçilerek login olmuş kullanıcıdan dönen token verilir. 
Bu sayede sayfaya erişim sağlanmış olur. Aksi halde 403 hatası döner.


