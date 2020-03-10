package cn.hyperchain.sdk.response;

import com.google.gson.annotations.Expose;

/**
 * this class represents response for contract compile.
 *
 * @author Lam
 * @ClassName CompileResponse
 * @date 2019-07-09
 */
public class CompileResponse extends Response {
    public class CompileReturn {
        @Expose
        private String[] bin;
        @Expose
        private String[] abi;

        public String[] getBin() {
            return bin;
        }

        public String[] getAbi() {
            return abi;
        }

        @Override
        public String toString() {
            return "CompileReturn{" +
                    "bin='" + bin + '\'' +
                    ", abi='" + abi + '\'' +
                    '}';
        }
    }

    @Expose
    private CompileReturn result;

    public CompileReturn getResult() {
        return result;
    }

    public String[] getBin() {
        return result.getBin();
    }

    public String[] getAbi() {
        return result.getAbi();
    }

    @Override
    public String toString() {
        return "CompileResponse{" +
                "result=" + result +
                ", jsonrpc='" + jsonrpc + '\'' +
                ", id='" + id + '\'' +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
