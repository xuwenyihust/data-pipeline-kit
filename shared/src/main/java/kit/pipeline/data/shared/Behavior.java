package kit.pipeline.data.shared;

import lombok.Data;

@Data
public class Behavior {
    int id;
    int userId;
    int orderId;
    int productId;
    int productCount;
    String behaviorType;
    String timestamp;
}
