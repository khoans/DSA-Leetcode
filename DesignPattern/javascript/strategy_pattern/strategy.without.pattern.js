function getPrice(originalPrice, typePromotion = 'default') {

    // Giảm giá khi người dng đặt trước một sản phẩm
    if (typePromotion === "preOrder") {
        return originalPrice * 0.8;
    }

    // Tiếp tục thêm tính năng khuyến mãi thông thường, ví dụ nếu giá gốc < 200 thì giảm 10%, còn > thì giảm tối đa 30
    if (typePromotion === "promotion") {
        return originalPrice <= 200 ? originalPrice * 0.9 : originalPrice - 30;
    }

    // Thời  xưa chưa có marketing nhưu bây giờ
    if (typePromotion === "default") {
        return originalPrice;
    }
}

console.log('---> Price:::', getPrice(100, 'preOrder')); // 80
