const mappingUrl = '/member/login';
const redirectUrl = '/';

const emailValid = (email) => {
    return /^[A-Za-z0-9.\-_]+@([A-Za-z0-9-]+\.)+[A-Za-z]{2,6}$/.test(email)
};

const email = document.querySelector('#email');
const password = document.querySelector('#password');

let emailCheck = false;
let passwordCheck = false;

email.addEventListener('change', () => {
    emailCheck = emailValid(document.querySelector('#email').value);
    let checkMessage = document.querySelector('#emailCheck');
    if (emailCheck) {
        checkMessage.innerHTML = '';
        return emailCheck;
    } else if (!emailCheck) {
        checkMessage.innerHTML = '이메일 형식이 올바르지 않습니다.';
    }
})

password.addEventListener('change', () => {
    passwordCheck = passwordValid(document.querySelector('#password').value);
    let checkMessage = document.querySelector('#passwordCheck');
    if (passwordCheck) {
        checkMessage.innerHTML = '';
        return passwordCheck;
    } else if (!passwordCheck) {
        checkMessage.innerHTML = '비밀번호 형식이 올바르지 않습니다.';
    }
})

document.querySelector('button.login_btn').addEventListener('click', event => {
    event.preventDefault();

    if (emailCheck && passwordCheck) {
        fetch(mappingUrl, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                email: email.value,
                password: password.value,
            }),
        }).then(response => {
            return response.text();
        }).then(message => {
            if (message === 'success') {
                location.href = redirectUrl;
            } else if (message === 'fail') {
                alert('아이디 또는 비밀번호가 일치하지 않습니다.');
            }
        }).catch(error => {
            alert(error);
        })
    } else {
        document.querySelectorAll('.form-control').forEach((e, i) => {
            if (e.value === null || e.value === undefined || e.value === '') {
                let checkMessage = document.querySelectorAll('.registerCheck');
                switch (checkMessage[i].getAttribute('id')) {
                    case 'emailCheck':
                        checkMessage[i].innerHTML = '이메일을 입력하세요';
                        break;
                    case 'passwordCheck':
                        checkMessage[i].innerHTML = '비밀번호을 입력하세요';
                        break;
                }

            }
        })
    }

})