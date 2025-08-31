/**
 * Mục tiêu của Strategy Pattern là tách các thuật toán ra khỏi ngữ cảnh sử dụng chúng.
 * Điều này giúp mã nguồn trở nên dễ bảo trì, mở rộng và tái sử dụng hơn.
 * Trong ví dụ này, chúng ta đã tách các chiến lược tính giá thành công ra khỏi hàm getPrice.
 * Mỗi chiến lược được định nghĩa trong một hàm riêng biệt, giúp mã nguồn trở nên rõ ràng và dễ hiểu hơn.
 * Khi cần thêm hoặc thay đổi chiến lược tính giá, chúng ta chỉ cần thêm hoặc sửa đổi các hàm tương ứng mà không ảnh hưởng đến hàm getPrice.
 * Điều này làm cho mã nguồn dễ bảo trì và mở rộng hơn.
 * Ngoài ra, việc sử dụng một đối tượng để lưu trữ các chiến lược giúp chúng ta dễ dàng truy cập và sử dụng các chiến lược này.
 * Chúng ta có thể dễ dàng thêm, sửa đổi hoặc xóa các chiến lược mà không cần thay đổi cấu trúc của hàm getPrice.
 * Điều này làm cho mã nguồn trở nên linh hoạt và dễ dàng tái sử dụng trong các ngữ cảnh khác nhau.
 *
 *
 */

function preOrderPrice(originalPrice) {
    return originalPrice * 0.8;
}

function promotionPrice(originalPrice) {
    return originalPrice <= 200 ? originalPrice * 0.9 : originalPrice - 30;
}

function defaultPrice(originalPrice) {
    return originalPrice;
}

function dayPrice(originalPrice) {
    return originalPrice * 0.6;
}

function blackFridayPrice(originalPrice) {
    return originalPrice * 0.5;
}

const getPriceStrategies = {
    preOrder: preOrderPrice,
    promotion: promotionPrice,
    day: dayPrice,
    blackFriday: blackFridayPrice,
    default: defaultPrice
}

function getPrice(originalPrice, typePromotion) {
    return getPriceStrategies[typePromotion](originalPrice);
}

console.log('---> Price:::', getPrice(100, 'preOrder')); // 80



// =====================
// Strategy Pattern - not optimal
// function getPrice(originalPrice, typePromotion) {
//     if (typePromotion === 'preOrder') {
//         return preOrderPrice(originalPrice);
//     }
//
//     if (typePromotion === 'promotion') {
//         return promotionPrice(originalPrice);
//     }
//
//     if (typePromotion === 'day') {
//         return dayPrice(originalPrice);
//     }
//
//     if (typePromotion === 'blackFriday') {
//         return blackFridayPrice(originalPrice);
//     }
//
//     return defaultPrice(originalPrice);
// }
