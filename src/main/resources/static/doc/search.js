let api = [];
const apiDocListSize = 1
api.push({
    name: 'default',
    order: '1',
    list: []
})
api[0].list.push({
    alias: 'AdminController',
    order: '1',
    link: '管理员信息表',
    desc: '管理员信息表',
    list: []
})
api[0].list[0].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8080/admin/list',
    desc: '查询所有',
});
api[0].list[0].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8080/admin/id',
    desc: '通过id查询',
});
api[0].list[0].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8080/admin/delete',
    desc: '通过id删除',
});
api[0].list[0].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8080/admin/add',
    desc: '添加',
});
api[0].list[0].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8080/admin/update',
    desc: '修改',
});
api[0].list[0].list.push({
    order: '6',
    deprecated: 'false',
    url: 'http://localhost:8080/admin/login',
    desc: '登录',
});
api[0].list.push({
    alias: 'ClassController',
    order: '2',
    link: '班级信息表',
    desc: '班级信息表',
    list: []
})
api[0].list[1].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8080/class/list',
    desc: '查询所有班级信息表',
});
api[0].list[1].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8080/class/id',
    desc: '通过id查询班级信息表',
});
api[0].list[1].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8080/class/delete',
    desc: '通过id删除班级信息表',
});
api[0].list[1].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8080/class/add',
    desc: '添加班级信息表',
});
api[0].list[1].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8080/class/update',
    desc: '修改班级信息表',
});
api[0].list[1].list.push({
    order: '6',
    deprecated: 'false',
    url: 'http://localhost:8080/class/name',
    desc: '通过名字查询班级信息表',
});
api[0].list.push({
    alias: 'CourseController',
    order: '3',
    link: '课程信息表',
    desc: '课程信息表',
    list: []
})
api[0].list[2].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8080/course/list',
    desc: '查询所有课程信息表',
});
api[0].list[2].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8080/course/id',
    desc: '通过id查询课程信息表',
});
api[0].list[2].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8080/course/delete',
    desc: '通过id删除课程信息表',
});
api[0].list[2].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8080/course/add',
    desc: '添加课程信息表',
});
api[0].list[2].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8080/course/update',
    desc: '修改课程信息表',
});
api[0].list[2].list.push({
    order: '6',
    deprecated: 'false',
    url: 'http://localhost:8080/course/name',
    desc: '通过名字查询课程信息表',
});
api[0].list.push({
    alias: 'ElectiveController',
    order: '4',
    link: '学生选修及成绩表',
    desc: '学生选修及成绩表',
    list: []
})
api[0].list[3].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8080/elective/list',
    desc: '查询所有学生选修及成绩表',
});
api[0].list[3].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8080/elective/id',
    desc: '通过id查询学生选修及成绩表',
});
api[0].list[3].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8080/elective/delete',
    desc: '通过id删除学生选修及成绩表',
});
api[0].list[3].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8080/elective/add',
    desc: '添加学生选修及成绩表',
});
api[0].list[3].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8080/elective/update',
    desc: '修改学生选修及成绩表',
});
api[0].list.push({
    alias: 'StudentController',
    order: '5',
    link: '学生信息表',
    desc: '学生信息表',
    list: []
})
api[0].list[4].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8080/student/list',
    desc: '查询所有',
});
api[0].list[4].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8080/student/id',
    desc: '通过id查询',
});
api[0].list[4].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8080/student/clNo',
    desc: '通过班级查询',
});
api[0].list[4].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8080/student/sname',
    desc: '通过名字查询',
});
api[0].list[4].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8080/student/dormitory',
    desc: '通过宿舍查询',
});
api[0].list[4].list.push({
    order: '6',
    deprecated: 'false',
    url: 'http://localhost:8080/student/delete',
    desc: '通过id删除',
});
api[0].list[4].list.push({
    order: '7',
    deprecated: 'false',
    url: 'http://localhost:8080/student/add',
    desc: '添加',
});
api[0].list[4].list.push({
    order: '8',
    deprecated: 'false',
    url: 'http://localhost:8080/student/update',
    desc: '修改',
});
api[0].list[4].list.push({
    order: '9',
    deprecated: 'false',
    url: 'http://localhost:8080/student/login',
    desc: '登录',
});
api[0].list.push({
    alias: 'TeachController',
    order: '6',
    link: '教师授课表',
    desc: '教师授课表',
    list: []
})
api[0].list[5].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8080/teach/list',
    desc: '查询所有教师授课表',
});
api[0].list[5].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8080/teach/id',
    desc: '通过id查询教师授课表',
});
api[0].list[5].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8080/teach/delete',
    desc: '通过id删除教师授课表',
});
api[0].list[5].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8080/teach/add',
    desc: '添加教师授课表',
});
api[0].list[5].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8080/teach/update',
    desc: '修改教师授课表',
});
api[0].list.push({
    alias: 'TeacherController',
    order: '7',
    link: '教师信息表',
    desc: '教师信息表',
    list: []
})
api[0].list[6].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8080/teacher/list',
    desc: '查询所有教师信息表',
});
api[0].list[6].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8080/teacher/id',
    desc: '通过id查询教师信息表',
});
api[0].list[6].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8080/teacher/delete',
    desc: '通过id删除教师信息表',
});
api[0].list[6].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8080/teacher/add',
    desc: '添加教师信息表',
});
api[0].list[6].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8080/teacher/update',
    desc: '修改教师信息表',
});
api[0].list[6].list.push({
    order: '6',
    deprecated: 'false',
    url: 'http://localhost:8080/teacher/name',
    desc: '通过名字查询教师信息表',
});
api[0].list.push({
    alias: 'YeartermController',
    order: '8',
    link: '学年学期表',
    desc: '学年学期表',
    list: []
})
api[0].list[7].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://localhost:8080/yearterm/list',
    desc: '查询所有学年学期表',
});
api[0].list[7].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://localhost:8080/yearterm/id',
    desc: '通过id查询学年学期表',
});
api[0].list[7].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://localhost:8080/yearterm/delete',
    desc: '通过id删除学年学期表',
});
api[0].list[7].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://localhost:8080/yearterm/add',
    desc: '添加学年学期表',
});
api[0].list[7].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://localhost:8080/yearterm/update',
    desc: '修改学年学期表',
});
api[0].list.push({
    alias: 'error',
    order: '9',
    link: 'error_code_list',
    desc: '错误码列表',
    list: []
})
document.onkeydown = keyDownSearch;
function keyDownSearch(e) {
    const theEvent = e;
    const code = theEvent.keyCode || theEvent.which || theEvent.charCode;
    if (code == 13) {
        const search = document.getElementById('search');
        const searchValue = search.value.toLocaleLowerCase();

        let searchGroup = [];
        for (let i = 0; i < api.length; i++) {

            let apiGroup = api[i];

            let searchArr = [];
            for (let i = 0; i < apiGroup.list.length; i++) {
                let apiData = apiGroup.list[i];
                const desc = apiData.desc;
                if (desc.toLocaleLowerCase().indexOf(searchValue) > -1) {
                    searchArr.push({
                        order: apiData.order,
                        desc: apiData.desc,
                        link: apiData.link,
                        list: apiData.list
                    });
                } else {
                    let methodList = apiData.list || [];
                    let methodListTemp = [];
                    for (let j = 0; j < methodList.length; j++) {
                        const methodData = methodList[j];
                        const methodDesc = methodData.desc;
                        if (methodDesc.toLocaleLowerCase().indexOf(searchValue) > -1) {
                            methodListTemp.push(methodData);
                            break;
                        }
                    }
                    if (methodListTemp.length > 0) {
                        const data = {
                            order: apiData.order,
                            desc: apiData.desc,
                            link: apiData.link,
                            list: methodListTemp
                        };
                        searchArr.push(data);
                    }
                }
            }
            if (apiGroup.name.toLocaleLowerCase().indexOf(searchValue) > -1) {
                searchGroup.push({
                    name: apiGroup.name,
                    order: apiGroup.order,
                    list: searchArr
                });
                continue;
            }
            if (searchArr.length === 0) {
                continue;
            }
            searchGroup.push({
                name: apiGroup.name,
                order: apiGroup.order,
                list: searchArr
            });
        }
        let html;
        if (searchValue == '') {
            const liClass = "";
            const display = "display: none";
            html = buildAccordion(api,liClass,display);
            document.getElementById('accordion').innerHTML = html;
        } else {
            const liClass = "open";
            const display = "display: block";
            html = buildAccordion(searchGroup,liClass,display);
            document.getElementById('accordion').innerHTML = html;
        }
        const Accordion = function (el, multiple) {
            this.el = el || {};
            this.multiple = multiple || false;
            const links = this.el.find('.dd');
            links.on('click', {el: this.el, multiple: this.multiple}, this.dropdown);
        };
        Accordion.prototype.dropdown = function (e) {
            const $el = e.data.el;
            $this = $(this), $next = $this.next();
            $next.slideToggle();
            $this.parent().toggleClass('open');
            if (!e.data.multiple) {
                $el.find('.submenu').not($next).slideUp("20").parent().removeClass('open');
            }
        };
        new Accordion($('#accordion'), false);
    }
}

function buildAccordion(apiGroups, liClass, display) {
    let html = "";
    let doc;
    if (apiGroups.length > 0) {
         if (apiDocListSize == 1) {
            let apiData = apiGroups[0].list;
            for (let j = 0; j < apiData.length; j++) {
                html += '<li class="'+liClass+'">';
                html += '<a class="dd" href="#_' + apiData[j].link + '">' + apiData[j].order + '.&nbsp;' + apiData[j].desc + '</a>';
                html += '<ul class="sectlevel2" style="'+display+'">';
                doc = apiData[j].list;
                for (let m = 0; m < doc.length; m++) {
                    let spanString;
                    if (doc[m].deprecated == 'true') {
                        spanString='<span class="line-through">';
                    } else {
                        spanString='<span>';
                    }
                    html += '<li><a href="#_1_' + apiData[j].order + '_' + doc[m].order + '_' + doc[m].desc + '">' + apiData[j].order + '.' + doc[m].order + '.&nbsp;' + spanString + doc[m].desc + '<span></a> </li>';
                }
                html += '</ul>';
                html += '</li>';
            }
        } else {
            for (let i = 0; i < apiGroups.length; i++) {
                let apiGroup = apiGroups[i];
                html += '<li class="'+liClass+'">';
                html += '<a class="dd" href="#_' + apiGroup.name + '">' + apiGroup.order + '.&nbsp;' + apiGroup.name + '</a>';
                html += '<ul class="sectlevel1">';

                let apiData = apiGroup.list;
                for (let j = 0; j < apiData.length; j++) {
                    html += '<li class="'+liClass+'">';
                    html += '<a class="dd" href="#_'+apiGroup.order+'_'+ apiData[j].order + '_'+ apiData[j].link + '">' +apiGroup.order+'.'+ apiData[j].order + '.&nbsp;' + apiData[j].desc + '</a>';
                    html += '<ul class="sectlevel2" style="'+display+'">';
                    doc = apiData[j].list;
                    for (let m = 0; m < doc.length; m++) {
                       let spanString;
                       if (doc[m].deprecated == 'true') {
                           spanString='<span class="line-through">';
                       } else {
                           spanString='<span>';
                       }
                       html += '<li><a href="#_'+apiGroup.order+'_' + apiData[j].order + '_' + doc[m].order + '_' + doc[m].desc + '">'+apiGroup.order+'.' + apiData[j].order + '.' + doc[m].order + '.&nbsp;' + spanString + doc[m].desc + '<span></a> </li>';
                   }
                    html += '</ul>';
                    html += '</li>';
                }

                html += '</ul>';
                html += '</li>';
            }
        }
    }
    return html;
}