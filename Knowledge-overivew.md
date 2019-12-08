# Functional programing - Lập trình hàm
*I write this review in vietnamese, my mother language is vietnamese, the book i read is in english, so i will write my knowledge in vietnamese*

*Tóm tắt có sử dụng các thuật ngữ tiếng anh, có giải nghĩa nếu lần đầu sử dụng. mình hạn chế dùng các từ tiếng việt, không phải vì tiếng việt không hay, mà để quen với các khái niệm, phục vụ mục đích tra cứu, đọc tài liệu tiếng anh khác sau này.*

## State - Trạng thái
- Mô hình máy Von Neumann
![Mô hình máy Von Neumann](resrouce\img\von-neumann-architecture.svg "Von Neumann Architecture")
    - Phần lớn các ngôn ngữ lập trình thông thường có mô hình tính toán dựa trên việc chuyển đối các state. Von Neumann. Việc này đi kèm với khái niệm modifiable variable (biến có thể thay đổi giá trị được). Name (tên, phục vụ mục đích trừu tượng, là một **association** xuất hiện trong **enviroment**). Đơn giản, việc thay đổi giá trị chỉ là thay đổi giá trị tại một địa chỉ, vùng nhớ. Còn association(cái liên kết giữa name với vùng nhớ) thì không đổi. Thông thường được thực hiện bằng toán tử =. Chỉnh sửa r-value chứ không phải l-value

    - Tuy nhiên, vẫn tồn tại mô hình tính toán mà không sử dụng modifiable variable (lập trình mà chỉ sử dụng val/ const). Tính toán bằng cách không chỉnh sửa trạng thái, mà viết lại biểu thức. Không có chỉnh sửa bộ nhớ -> không sử dụng =. Khi đó toàn bộ việc tính toán sẽ giống như sự chỉnh sửa (yep, rất phức tạp) enviroment, ở đó sử dụng chủ yếu các high-order function.

High-order function và đệ quy là 2 thành phần chính của mô hình stateless(không trạng thái). Và vâng, lập trình hàm

## Exression and function
Hàm là biểu thức
