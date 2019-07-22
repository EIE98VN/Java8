# Java8

Vấn đề đối với Date Time ở các phiên bản Java trước:
- Các class Java Date Time không nhất quán: chúng ta có class Date trong cả 2 package java.util và java.sql
- Thiết kế có chút khó khăn. java.util.Date bao gồm cả date và time trong khi java.sql.Date chỉ bao gồm date. Cả 2 class cùng có tên như nhau
- Không an toàn với môi trường đa luồng . Vì tất cả các class Date đều mutable
- Class Date không cung cấp Internationalization và không hỗ trợ Timezone

Cải tiến trong java8:
- Đa luồng: tất cả các class trong Date Time API mới đều là immutable.
- API mới phân chia rõ ràng giữa Date Time, hạn chế nhầm lẫn khi sử dụng. Nó định nghĩa tách biệt các class cho Date, Time, DateTime, Timestamp, Timezone, …
- Tất cả các class trong API Date Time đi kèm với các tác vụ phổ biến như cộng, trừ, parsing, định dạng date/time…
