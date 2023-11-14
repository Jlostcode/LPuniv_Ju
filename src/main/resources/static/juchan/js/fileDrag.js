
Dropzone.autoDiscover = false;

$(document).ready(function () {
    // Dropzone 설정
    var dropzone = new Dropzone("#dropzoneForm", {
        url: "/amc/amc_insert",  // 파일 업로드를 처리하는 서버 엔드포인트 URL
        method: "post",
        autoProcessQueue: false, // 자동으로 보내기. true : 파일 업로드 되자마자 서버로 요청, false : 서버에는 올라가지 않은 상태.
        paramName: "file",  // 파일 파라미터 이름
        uploadMultiple: true,  // 다중 파일 업로드 활성화
        maxFiles: 5,  // 최대 업로드 파일 수
        maxFilesize: 5,  // 최대 파일 크기 (MB)
        parallelUploads: 5,  // 병렬 업로드 수
        dictDefaultMessage: "파일을 여기에 드래그하세요 또는 클릭하세요. 최대 파일 갯수 : 5개",  // 기본 메시지
        dictRemoveFile: "파일 삭제",  // 파일 삭제 버튼 텍스트
        addRemoveLinks: true,  // 파일 추가/삭제 링크 표시 여부
        dictMaxFilesExceeded: "더 이상 파일을 업로드할 수 없습니다.",  // 최대 파일 개수 초과 시 메시지
        init: function () {
            this.on("complete", function (file) {
                // 업로드가 완료된 후의 동작
                if (this.getUploadingFiles().length === 0 && this.getQueuedFiles().length === 0) {
                    // 모든 파일 업로드가 완료되었을 때, 추가 동작을 수행하거나 폼 제출 등
                }
            });
        }
    });

    // Dropzone의 파일 업로드와 관련된 이벤트 핸들러 등록
    dropzone.on("sending", function (file, xhr, formData) {
        // 파일이 업로드되기 전의 동작
        // 추가적인 데이터를 formData에 추가할 수 있음
        formData.append("additionalParam", "value");
    });

    // 기타 Dropzone 이벤트 등록 가능

});