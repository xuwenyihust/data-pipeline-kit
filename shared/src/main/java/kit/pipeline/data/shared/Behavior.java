package kit.pipeline.data.shared;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class Behavior {
    private int id;
    private int userId;
    private int orderId;
    private int productId;
    private int productCount;
    private String behaviorType;
    private String timestamp;
}
