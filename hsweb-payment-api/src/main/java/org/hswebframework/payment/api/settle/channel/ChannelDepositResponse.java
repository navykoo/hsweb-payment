package org.hswebframework.payment.api.settle.channel;

import org.hswebframework.payment.api.ApiResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChannelDepositResponse extends ApiResponse {
    private ChannelSettleInfo settleInfo;
}
