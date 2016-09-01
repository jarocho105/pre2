/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.nomina.util.CursoConstantesFunciones;
import com.bydan.erp.nomina.util.CursoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CursoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.CursoBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CursoBeanSwingJInternalFrame extends CursoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CursoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Curso> cursoValidator = new ClassValidator<Curso>(Curso.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Curso curso;	
	public Curso cursoAux;
	public Curso cursoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Curso cursoTotales;
	public Long idCursoActual;
	public Long iIdNuevoCurso=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

	public String sFinalQueryComboTipoCurso="";

	public List<TipoCurso> tipocursosForeignKey;

	public List<TipoCurso> gettipocursosForeignKey() {
		return tipocursosForeignKey;
	}

	public void settipocursosForeignKey(List<TipoCurso> tipocursosForeignKey) {
		this.tipocursosForeignKey = tipocursosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCurso tipocursoForeignKey;

	public TipoCurso gettipocursoForeignKey() {
		return tipocursoForeignKey;
	}

	public void settipocursoForeignKey(TipoCurso tipocursoForeignKey) {
		this.tipocursoForeignKey = tipocursoForeignKey;
	}

	public String sFinalQueryComboTipoInstitucion="";

	public List<TipoInstitucion> tipoinstitucionsForeignKey;

	public List<TipoInstitucion> gettipoinstitucionsForeignKey() {
		return tipoinstitucionsForeignKey;
	}

	public void settipoinstitucionsForeignKey(List<TipoInstitucion> tipoinstitucionsForeignKey) {
		this.tipoinstitucionsForeignKey = tipoinstitucionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoInstitucion tipoinstitucionForeignKey;

	public TipoInstitucion gettipoinstitucionForeignKey() {
		return tipoinstitucionForeignKey;
	}

	public void settipoinstitucionForeignKey(TipoInstitucion tipoinstitucionForeignKey) {
		this.tipoinstitucionForeignKey = tipoinstitucionForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
	}
	
	

	public Boolean isTienePermisosDetalleCurso=false;

	public Boolean getIsTienePermisosDetalleCurso() {
		return isTienePermisosDetalleCurso;
	}

	public void setIsTienePermisosDetalleCurso(Boolean isTienePermisosDetalleCurso) {
		this.isTienePermisosDetalleCurso= isTienePermisosDetalleCurso;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoCurso;
	public Boolean isPermisoNuevoCurso;
	public Boolean isPermisoActualizarCurso;
	public Boolean isPermisoActualizarOriginalCurso;
	public Boolean isPermisoEliminarCurso;
	public Boolean isPermisoGuardarCambiosCurso;
	public Boolean isPermisoConsultaCurso;
	public Boolean isPermisoBusquedaCurso;
	public Boolean isPermisoReporteCurso;
	public Boolean isPermisoPaginacionMedioCurso;
	public Boolean isPermisoPaginacionAltoCurso;
	public Boolean isPermisoPaginacionTodoCurso;
	public Boolean isPermisoCopiarCurso;
	public Boolean isPermisoVerFormCurso;
	public Boolean isPermisoDuplicarCurso;
	public Boolean isPermisoOrdenCurso;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public CursoParameterReturnGeneral cursoReturnGeneral;
	public CursoParameterReturnGeneral cursoParameterGeneral;
	
	

	public DetalleCursoLogic detallecursoLogic=null;

	public DetalleCursoLogic getDetalleCursoLogic() {
		return detallecursoLogic;
	}

	public void setDetalleCursoLogic(DetalleCursoLogic detallecursoLogic) {
		this.detallecursoLogic = detallecursoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCurso=false;
	public Boolean esParaAccionDesdeFormularioCurso=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CursoSessionBeanAdditional cursoSessionBeanAdditional=null;
	
	public CursoSessionBeanAdditional getCursoSessionBeanAdditional() {
		return this.cursoSessionBeanAdditional;
	}
	
	public void setCursoSessionBeanAdditional(CursoSessionBeanAdditional cursoSessionBeanAdditional) {
		try {
			this.cursoSessionBeanAdditional=cursoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CursoBeanSwingJInternalFrameAdditional cursoBeanSwingJInternalFrameAdditional=null;
	//public class CursoBeanSwingJInternalFrame
	
	public CursoBeanSwingJInternalFrameAdditional getCursoBeanSwingJInternalFrameAdditional() {
		return this.cursoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCursoBeanSwingJInternalFrameAdditional(CursoBeanSwingJInternalFrameAdditional cursoBeanSwingJInternalFrameAdditional) {
		try {
			this.cursoBeanSwingJInternalFrameAdditional=cursoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CursoLogic cursoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Curso cursoBean;
	public CursoConstantesFunciones cursoConstantesFunciones;
	//public CursoParameterReturnGeneral cursoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public TipoCursoLogic tipocursoLogic;
	public TipoInstitucionLogic tipoinstitucionLogic;
	
	//PARAMETROS
	
	
	//public List<Curso> cursos;	
	//public List<Curso> cursosEliminados;
	//public List<Curso> cursosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCurso=false;
	public Boolean isVisibilidadCeldaDuplicarCurso=true;
	public Boolean isVisibilidadCeldaCopiarCurso=true;
	public Boolean isVisibilidadCeldaVerFormCurso=true;
	public Boolean isVisibilidadCeldaOrdenCurso=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCurso=false;
	public Boolean isVisibilidadCeldaModificarCurso=false;
	public Boolean isVisibilidadCeldaActualizarCurso=false;
	public Boolean isVisibilidadCeldaEliminarCurso=false;
	public Boolean isVisibilidadCeldaCancelarCurso=false;
	public Boolean isVisibilidadCeldaGuardarCurso=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCurso=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoCurso=false;
	public Boolean isVisibilidadFK_IdTipoInstitucion=false;
	
	public Long getiIdNuevoCurso() {
		return this.iIdNuevoCurso;
	}

	public void setiIdNuevoCurso(Long iIdNuevoCurso) {
		this.iIdNuevoCurso = iIdNuevoCurso;
	}
	
	public Long getidCursoActual() {
		return this.idCursoActual;
	}

	public void setidCursoActual(Long idCursoActual) {
		this.idCursoActual = idCursoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Curso getcurso() {
		return this.curso;
	}

	public void setcurso(Curso curso) {
		this.curso = curso;
	}
	
	public Curso getcursoAux() {
		return this.cursoAux;
	}

	public void setcursoAux(Curso cursoAux) {
		this.cursoAux = cursoAux;
	}				
	
	public Curso getcursoAnterior() {
		return this.cursoAnterior;
	}

	public void setcursoAnterior(Curso cursoAnterior) {
		this.cursoAnterior = cursoAnterior;
	}	
	
	public Curso getcursoTotales() {
		return this.cursoTotales;
	}

	public void setcursoTotales(Curso cursoTotales) {
		this.cursoTotales = cursoTotales;
	}	
	
	public Curso getcursoBean() {
		return this.cursoBean;
	}

	public void setcursoBean(Curso cursoBean) {
		this.cursoBean = cursoBean;
	}	
	
	public CursoParameterReturnGeneral getcursoReturnGeneral() {
		return this.cursoReturnGeneral;
	}

	public void setcursoReturnGeneral(CursoParameterReturnGeneral cursoReturnGeneral) {
		this.cursoReturnGeneral = cursoReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_cursoFK_IdTipoCurso=-1L;

	public Long getid_tipo_cursoFK_IdTipoCurso() {
		return this.id_tipo_cursoFK_IdTipoCurso;
	}

	public void setid_tipo_cursoFK_IdTipoCurso(Long id_tipo_cursoFK_IdTipoCurso) {
		this.id_tipo_cursoFK_IdTipoCurso = id_tipo_cursoFK_IdTipoCurso;
	}

	public Long id_tipo_institucionFK_IdTipoInstitucion=-1L;

	public Long getid_tipo_institucionFK_IdTipoInstitucion() {
		return this.id_tipo_institucionFK_IdTipoInstitucion;
	}

	public void setid_tipo_institucionFK_IdTipoInstitucion(Long id_tipo_institucionFK_IdTipoInstitucion) {
		this.id_tipo_institucionFK_IdTipoInstitucion = id_tipo_institucionFK_IdTipoInstitucion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CursoLogic getCursoLogic()	{		
		return cursoLogic;
	}

	public void setCursoLogic(CursoLogic cursoLogic) {
		this.cursoLogic = cursoLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoCurso() {
		return isEsNuevoCurso;
	}

	public void setIsEsNuevoCurso(Boolean isEsNuevoCurso) {
		this.isEsNuevoCurso = isEsNuevoCurso;
	}

	public Boolean getEsParaAccionDesdeFormularioCurso() {
		return esParaAccionDesdeFormularioCurso;
	}
	
	public void setEsParaAccionDesdeFormularioCurso(Boolean esParaAccionDesdeFormularioCurso) {
		this.esParaAccionDesdeFormularioCurso = esParaAccionDesdeFormularioCurso;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.cursoSessionBean==null) {
				this.cursoSessionBean=new CursoSessionBean();
			}

			if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(cursoSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.cursoSessionBean==null) {
				this.cursoSessionBean=new CursoSessionBean();
			}

			if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(cursoSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTipoCursosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocursosForeignKey=new ArrayList<TipoCurso>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCursoLogic tipocursoLogic=new TipoCursoLogic();

			//tipocursoLogic.getTipoCursoDataAccess().setIsForForeingKeyData(true);

			if(this.cursoSessionBean==null) {
				this.cursoSessionBean=new CursoSessionBean();
			}

			if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCurso()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocursoLogic.getTipoCursoDataAccess().setIsForForeingKeyData(true);

					tipocursoLogic.getTodosTipoCursosWithConnection(sFinalQuery,new Pagination());

					this.tipocursosForeignKey=tipocursoLogic.getTipoCursos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCurso(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocursoLogic.getEntityWithConnection(cursoSessionBean.getlidTipoCursoActual());
					this.tipocursosForeignKey.add(tipocursoLogic.getTipoCurso());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTipoInstitucionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoinstitucionsForeignKey=new ArrayList<TipoInstitucion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoInstitucionLogic tipoinstitucionLogic=new TipoInstitucionLogic();

			//tipoinstitucionLogic.getTipoInstitucionDataAccess().setIsForForeingKeyData(true);

			if(this.cursoSessionBean==null) {
				this.cursoSessionBean=new CursoSessionBean();
			}

			if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionTipoInstitucion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoinstitucionLogic.getTipoInstitucionDataAccess().setIsForForeingKeyData(true);

					tipoinstitucionLogic.getTodosTipoInstitucionsWithConnection(sFinalQuery,new Pagination());

					this.tipoinstitucionsForeignKey=tipoinstitucionLogic.getTipoInstitucions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoInstitucion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinstitucionLogic.getEntityWithConnection(cursoSessionBean.getlidTipoInstitucionActual());
					this.tipoinstitucionsForeignKey.add(tipoinstitucionLogic.getTipoInstitucion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.curso!=null) {
						this.curso.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCurso!=null) {
						this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCurso.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCurso!=null) {
						if(this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCursoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaCursoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCursoGenerico!=null && jComboBoxid_empresaCursoGenerico.getItemCount()>0) {
					jComboBoxid_empresaCursoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.curso!=null) {
						this.curso.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormCurso!=null) {
						this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoCurso.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormCurso!=null) {
						if(this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoCurso!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoCurso.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoCurso!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoCurso.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoCurso.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoCurso.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoCursoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoCursoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoCursoGenerico!=null && jComboBoxid_empleadoCursoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoCursoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCursoForeignKey(Long idTipoCursoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCurso  tipocursoTemp=null;

			for(TipoCurso tipocursoAux:tipocursosForeignKey) {
				if(tipocursoAux.getId()!=null && tipocursoAux.getId().equals(idTipoCursoSeleccionado)) {
					tipocursoTemp=tipocursoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocursoTemp!=null) {

					if(this.curso!=null) {
						this.curso.setTipoCurso(tipocursoTemp);
					}

					if(this.jInternalFrameDetalleFormCurso!=null) {
						this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.setSelectedItem(tipocursoTemp);
					}
				} else {
					//jComboBoxid_tipo_cursoCurso.setSelectedItem(tipocursoTemp);
					if(this.jInternalFrameDetalleFormCurso!=null) {
						if(this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCurso") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocursoTemp!=null && jComboBoxid_tipo_cursoFK_IdTipoCursoCurso!=null) {
						jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.setSelectedItem(tipocursoTemp);
					} else {
						if(jComboBoxid_tipo_cursoFK_IdTipoCursoCurso!=null) {
							//jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.setSelectedItem(tipocursoTemp);
							if(jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.getItemCount()>0) {
								jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoCursoForeignKeyDescripcion(Long idTipoCursoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCurso  tipocursoTemp=null;

			for(TipoCurso tipocursoAux:tipocursosForeignKey) {
				if(tipocursoAux.getId()!=null && tipocursoAux.getId().equals(idTipoCursoSeleccionado)) {
					tipocursoTemp=tipocursoAux;
					break;
				}
			}


			sDescripcion=TipoCursoConstantesFunciones.getTipoCursoDescripcion(tipocursoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCursoForeignKeyGenerico(Long idTipoCursoSeleccionado,JComboBox jComboBoxid_tipo_cursoCursoGenerico)throws Exception
	{
		try
		{
			TipoCurso  tipocursoTemp=null;

			for(TipoCurso tipocursoAux:tipocursosForeignKey) {
				if(tipocursoAux.getId()!=null && tipocursoAux.getId().equals(idTipoCursoSeleccionado)) {
					tipocursoTemp=tipocursoAux;
					break;
				}
			}

			if(tipocursoTemp!=null) {
				jComboBoxid_tipo_cursoCursoGenerico.setSelectedItem(tipocursoTemp);
			} else {
				if(jComboBoxid_tipo_cursoCursoGenerico!=null && jComboBoxid_tipo_cursoCursoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_cursoCursoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoInstitucionForeignKey(Long idTipoInstitucionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoInstitucion  tipoinstitucionTemp=null;

			for(TipoInstitucion tipoinstitucionAux:tipoinstitucionsForeignKey) {
				if(tipoinstitucionAux.getId()!=null && tipoinstitucionAux.getId().equals(idTipoInstitucionSeleccionado)) {
					tipoinstitucionTemp=tipoinstitucionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoinstitucionTemp!=null) {

					if(this.curso!=null) {
						this.curso.setTipoInstitucion(tipoinstitucionTemp);
					}

					if(this.jInternalFrameDetalleFormCurso!=null) {
						this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.setSelectedItem(tipoinstitucionTemp);
					}
				} else {
					//jComboBoxid_tipo_institucionCurso.setSelectedItem(tipoinstitucionTemp);
					if(this.jInternalFrameDetalleFormCurso!=null) {
						if(this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.getItemCount()>0) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoInstitucion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoinstitucionTemp!=null && jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso!=null) {
						jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.setSelectedItem(tipoinstitucionTemp);
					} else {
						if(jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso!=null) {
							//jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.setSelectedItem(tipoinstitucionTemp);
							if(jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.getItemCount()>0) {
								jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoInstitucionForeignKeyDescripcion(Long idTipoInstitucionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoInstitucion  tipoinstitucionTemp=null;

			for(TipoInstitucion tipoinstitucionAux:tipoinstitucionsForeignKey) {
				if(tipoinstitucionAux.getId()!=null && tipoinstitucionAux.getId().equals(idTipoInstitucionSeleccionado)) {
					tipoinstitucionTemp=tipoinstitucionAux;
					break;
				}
			}


			sDescripcion=TipoInstitucionConstantesFunciones.getTipoInstitucionDescripcion(tipoinstitucionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoInstitucionForeignKeyGenerico(Long idTipoInstitucionSeleccionado,JComboBox jComboBoxid_tipo_institucionCursoGenerico)throws Exception
	{
		try
		{
			TipoInstitucion  tipoinstitucionTemp=null;

			for(TipoInstitucion tipoinstitucionAux:tipoinstitucionsForeignKey) {
				if(tipoinstitucionAux.getId()!=null && tipoinstitucionAux.getId().equals(idTipoInstitucionSeleccionado)) {
					tipoinstitucionTemp=tipoinstitucionAux;
					break;
				}
			}

			if(tipoinstitucionTemp!=null) {
				jComboBoxid_tipo_institucionCursoGenerico.setSelectedItem(tipoinstitucionTemp);
			} else {
				if(jComboBoxid_tipo_institucionCursoGenerico!=null && jComboBoxid_tipo_institucionCursoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_institucionCursoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Curso curso,JComboBox jComboBoxid_empresaCursoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCursoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCursoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				curso.setid_empresa(empresaAux.getId());
				curso.setempresa_descripcion(CursoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				curso.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(Curso curso,JComboBox jComboBoxid_empleadoCursoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoCursoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoCursoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				curso.setid_empleado(empleadoAux.getId());
				curso.setempleado_descripcion(CursoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				curso.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCursoForeignKey(Curso curso,JComboBox jComboBoxid_tipo_cursoCursoGenerico)throws Exception
	{
		try
		{
			TipoCurso  tipocursoAux=new TipoCurso();

			if(jComboBoxid_tipo_cursoCursoGenerico==null) {
				tipocursoAux=(TipoCurso)this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.getSelectedItem();
			} else {
				tipocursoAux=(TipoCurso)jComboBoxid_tipo_cursoCursoGenerico.getSelectedItem();
			}

			if(tipocursoAux!=null && tipocursoAux.getId()!=null) {
				curso.setid_tipo_curso(tipocursoAux.getId());
				curso.settipocurso_descripcion(CursoConstantesFunciones.getTipoCursoDescripcion(tipocursoAux));
				curso.setTipoCurso(tipocursoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoInstitucionForeignKey(Curso curso,JComboBox jComboBoxid_tipo_institucionCursoGenerico)throws Exception
	{
		try
		{
			TipoInstitucion  tipoinstitucionAux=new TipoInstitucion();

			if(jComboBoxid_tipo_institucionCursoGenerico==null) {
				tipoinstitucionAux=(TipoInstitucion)this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.getSelectedItem();
			} else {
				tipoinstitucionAux=(TipoInstitucion)jComboBoxid_tipo_institucionCursoGenerico.getSelectedItem();
			}

			if(tipoinstitucionAux!=null && tipoinstitucionAux.getId()!=null) {
				curso.setid_tipo_institucion(tipoinstitucionAux.getId());
				curso.settipoinstitucion_descripcion(CursoConstantesFunciones.getTipoInstitucionDescripcion(tipoinstitucionAux));
				curso.setTipoInstitucion(tipoinstitucionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CursoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCurso!=null) { 
							this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCurso!=null) { 
					}

					if(!CursoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CursoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCurso!=null) { 
							this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCurso!=null) { 
					}

					if(!CursoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CursoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoCurso.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoCurso.addItem(empleado);
							}
						}

						if(!CursoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCursosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCurso=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CursoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCurso!=null) { 
							this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.removeAllItems();

							for(TipoCurso tipocurso:this.tipocursosForeignKey) {
								this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.addItem(tipocurso);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCurso!=null) { 
					}

					if(!CursoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCurso") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CursoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.removeAllItems();

							for(TipoCurso tipocurso:this.tipocursosForeignKey) {
								this.jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.addItem(tipocurso);
							}
						}

						if(!CursoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoInstitucionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoInstitucion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CursoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCurso!=null) { 
							this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.removeAllItems();

							for(TipoInstitucion tipoinstitucion:this.tipoinstitucionsForeignKey) {
								this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.addItem(tipoinstitucion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCurso!=null) { 
					}

					if(!CursoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoInstitucion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CursoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.removeAllItems();

							for(TipoInstitucion tipoinstitucion:this.tipoinstitucionsForeignKey) {
								this.jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.addItem(tipoinstitucion);
							}
						}

						if(!CursoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCurso!=null) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCurso!=null) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCurso!=null) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormCurso!=null) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoCurso.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoCurso.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoCursoForeignKey(TipoCurso tipocurso,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCurso!=null) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.setSelectedItem(tipocurso);
						}
					} else {
						if(this.jInternalFrameDetalleFormCurso!=null) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.setSelectedItem(tipocurso);
						} else {
							this.jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoInstitucionForeignKey(TipoInstitucion tipoinstitucion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCurso!=null) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.setSelectedItem(tipoinstitucion);
						}
					} else {
						if(this.jInternalFrameDetalleFormCurso!=null) {
							this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.setSelectedItem(tipoinstitucion);
						} else {
							this.jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCurso() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CursoConstantesFunciones.refrescarForeignKeysDescripcionesCurso(this.cursoLogic.getCursos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CursoConstantesFunciones.refrescarForeignKeysDescripcionesCurso(this.cursos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(TipoCurso.class));
		classes.add(new Classe(TipoInstitucion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cursoLogic.setCursos(this.cursos);
			cursoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public CursoParameterReturnGeneral getCursoParameterGeneral() {
		return this.cursoParameterGeneral;
	}
	
	public void setCursoParameterGeneral(CursoParameterReturnGeneral cursoParameterGeneral) {
		this.cursoParameterGeneral = cursoParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoCurso() {
		return isPermisoTodoCurso;
	}

	public void setIsPermisoTodoCurso(Boolean isPermisoTodoCurso) {
		this.isPermisoTodoCurso = isPermisoTodoCurso;
	}

	public Boolean getIsPermisoNuevoCurso() {
		return isPermisoNuevoCurso;
	}

	public void setIsPermisoNuevoCurso(Boolean isPermisoNuevoCurso) {
		this.isPermisoNuevoCurso = isPermisoNuevoCurso;
	}

	public Boolean getIsPermisoActualizarCurso() {
		return isPermisoActualizarCurso;
	}

	public void setIsPermisoActualizarCurso(Boolean isPermisoActualizarCurso) {
		this.isPermisoActualizarCurso = isPermisoActualizarCurso;
	}

	public Boolean getIsPermisoEliminarCurso() {
		return isPermisoEliminarCurso;
	}

	public void setIsPermisoEliminarCurso(Boolean isPermisoEliminarCurso) {
		this.isPermisoEliminarCurso = isPermisoEliminarCurso;
	}

	public Boolean getIsPermisoGuardarCambiosCurso() {
		return isPermisoGuardarCambiosCurso;
	}

	public void setIsPermisoGuardarCambiosCurso(Boolean isPermisoGuardarCambiosCurso) {
		this.isPermisoGuardarCambiosCurso = isPermisoGuardarCambiosCurso;
	}
	
	public Boolean getIsPermisoConsultaCurso() {
		return isPermisoConsultaCurso;
	}

	public void setIsPermisoConsultaCurso(Boolean isPermisoConsultaCurso) {
		this.isPermisoConsultaCurso = isPermisoConsultaCurso;
	}

	public Boolean getIsPermisoBusquedaCurso() {
		return isPermisoBusquedaCurso;
	}

	public void setIsPermisoBusquedaCurso(Boolean isPermisoBusquedaCurso) {
		this.isPermisoBusquedaCurso = isPermisoBusquedaCurso;
	}

	public Boolean getIsPermisoReporteCurso() {
		return isPermisoReporteCurso;
	}

	public void setIsPermisoReporteCurso(Boolean isPermisoReporteCurso) {
		this.isPermisoReporteCurso = isPermisoReporteCurso;
	}
	
	public Boolean getIsPermisoPaginacionMedioCurso() {
		return isPermisoPaginacionMedioCurso;
	}

	public void setIsPermisoPaginacionMedioCurso(Boolean isPermisoPaginacionMedioCurso) {
		this.isPermisoPaginacionMedioCurso = isPermisoPaginacionMedioCurso;
	}
	
	public Boolean getIsPermisoPaginacionTodoCurso() {
		return isPermisoPaginacionTodoCurso;
	}

	public void setIsPermisoPaginacionTodoCurso(Boolean isPermisoPaginacionTodoCurso) {
		this.isPermisoPaginacionTodoCurso = isPermisoPaginacionTodoCurso;
	}
	
	public Boolean getIsPermisoPaginacionAltoCurso() {
		return isPermisoPaginacionAltoCurso;
	}

	public void setIsPermisoPaginacionAltoCurso(Boolean isPermisoPaginacionAltoCurso) {
		this.isPermisoPaginacionAltoCurso = isPermisoPaginacionAltoCurso;
	}
	
	public Boolean getIsPermisoCopiarCurso() {
		return isPermisoCopiarCurso;
	}

	public void setIsPermisoCopiarCurso(Boolean isPermisoCopiarCurso) {
		this.isPermisoCopiarCurso = isPermisoCopiarCurso;
	}
	
	public Boolean getIsPermisoVerFormCurso() {
		return isPermisoVerFormCurso;
	}

	public void setIsPermisoVerFormCurso(Boolean isPermisoVerFormCurso) {
		this.isPermisoVerFormCurso = isPermisoVerFormCurso;
	}
	
	public Boolean getIsPermisoDuplicarCurso() {
		return isPermisoDuplicarCurso;
	}

	public void setIsPermisoDuplicarCurso(Boolean isPermisoDuplicarCurso) {
		this.isPermisoDuplicarCurso = isPermisoDuplicarCurso;
	}
	
	public Boolean getIsPermisoOrdenCurso() {
		return isPermisoOrdenCurso;
	}

	public void setIsPermisoOrdenCurso(Boolean isPermisoOrdenCurso) {
		this.isPermisoOrdenCurso = isPermisoOrdenCurso;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoCurso() {
		return isVisibilidadCeldaNuevoCurso;
	}

	public void setIsVisibilidadCeldaNuevoCurso(Boolean isVisibilidadCeldaNuevoCurso) {
		this.isVisibilidadCeldaNuevoCurso = isVisibilidadCeldaNuevoCurso;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCurso() {
		return isVisibilidadCeldaDuplicarCurso;
	}

	public void setIsVisibilidadCeldaDuplicarCurso(Boolean isVisibilidadCeldaDuplicarCurso) {
		this.isVisibilidadCeldaDuplicarCurso = isVisibilidadCeldaDuplicarCurso;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCurso() {
		return isVisibilidadCeldaCopiarCurso;
	}

	public void setIsVisibilidadCeldaCopiarCurso(Boolean isVisibilidadCeldaCopiarCurso) {
		this.isVisibilidadCeldaCopiarCurso = isVisibilidadCeldaCopiarCurso;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCurso() {
		return isVisibilidadCeldaVerFormCurso;
	}

	public void setIsVisibilidadCeldaVerFormCurso(Boolean isVisibilidadCeldaVerFormCurso) {
		this.isVisibilidadCeldaVerFormCurso = isVisibilidadCeldaVerFormCurso;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCurso() {
		return isVisibilidadCeldaOrdenCurso;
	}

	public void setIsVisibilidadCeldaOrdenCurso(Boolean isVisibilidadCeldaOrdenCurso) {
		this.isVisibilidadCeldaOrdenCurso = isVisibilidadCeldaOrdenCurso;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCurso() {
		return isVisibilidadCeldaNuevoRelacionesCurso;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCurso(Boolean isVisibilidadCeldaNuevoRelacionesCurso) {
		this.isVisibilidadCeldaNuevoRelacionesCurso = isVisibilidadCeldaNuevoRelacionesCurso;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCurso() {
		return isVisibilidadCeldaModificarCurso;
	}

	public void setIsVisibilidadCeldaModificarCurso(Boolean isVisibilidadCeldaModificarCurso) {
		this.isVisibilidadCeldaModificarCurso = isVisibilidadCeldaModificarCurso;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCurso() {
		return isVisibilidadCeldaActualizarCurso;
	}

	public void setIsVisibilidadCeldaActualizarCurso(Boolean isVisibilidadCeldaActualizarCurso) {
		this.isVisibilidadCeldaActualizarCurso = isVisibilidadCeldaActualizarCurso;
	}

	public Boolean getIsVisibilidadCeldaEliminarCurso() {
		return isVisibilidadCeldaEliminarCurso;
	}

	public void setIsVisibilidadCeldaEliminarCurso(Boolean isVisibilidadCeldaEliminarCurso) {
		this.isVisibilidadCeldaEliminarCurso = isVisibilidadCeldaEliminarCurso;
	}

	public Boolean getIsVisibilidadCeldaCancelarCurso() {
		return isVisibilidadCeldaCancelarCurso;
	}

	public void setIsVisibilidadCeldaCancelarCurso(Boolean isVisibilidadCeldaCancelarCurso) {
		this.isVisibilidadCeldaCancelarCurso = isVisibilidadCeldaCancelarCurso;
	}

	public Boolean getIsVisibilidadCeldaGuardarCurso() {
		return isVisibilidadCeldaGuardarCurso;
	}

	public void setIsVisibilidadCeldaGuardarCurso(Boolean isVisibilidadCeldaGuardarCurso) {
		this.isVisibilidadCeldaGuardarCurso = isVisibilidadCeldaGuardarCurso;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCurso() {
		return isVisibilidadCeldaGuardarCambiosCurso;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCurso(Boolean isVisibilidadCeldaGuardarCambiosCurso) {
		this.isVisibilidadCeldaGuardarCambiosCurso = isVisibilidadCeldaGuardarCambiosCurso;
	}
		
	public CursoSessionBean getcursoSessionBean() {
		return this.cursoSessionBean;
	}
	
	public void setcursoSessionBean(CursoSessionBean cursoSessionBean) {
		this.cursoSessionBean=cursoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoCurso() {
		return this.isVisibilidadFK_IdTipoCurso;
	}

	public void setisVisibilidadFK_IdTipoCurso(Boolean isVisibilidadFK_IdTipoCurso) {
		this.isVisibilidadFK_IdTipoCurso=isVisibilidadFK_IdTipoCurso;
	}

	public Boolean getisVisibilidadFK_IdTipoInstitucion() {
		return this.isVisibilidadFK_IdTipoInstitucion;
	}

	public void setisVisibilidadFK_IdTipoInstitucion(Boolean isVisibilidadFK_IdTipoInstitucion) {
		this.isVisibilidadFK_IdTipoInstitucion=isVisibilidadFK_IdTipoInstitucion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCurso(Curso curso)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(curso,null);
				this.setActualParaGuardarEmpleadoForeignKey(curso,null);
				this.setActualParaGuardarTipoCursoForeignKey(curso,null);
				this.setActualParaGuardarTipoInstitucionForeignKey(curso,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(Curso curso,Curso cursoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCurso(curso);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cursoAux.setId(curso.getId());
		cursoAux.setVersionRow(curso.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCurso();
		
			int intSelectedRow = this.jTableDatosCurso.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cursoValidator.getInvalidValues(this.curso);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cursoLogic.setDatosCliente(datosCliente);
			cursoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cursoAux=new  Curso();
				
				cursoAux.setIsNew(true);
				cursoAux.setIsChanged(true);
				
				cursoAux.setCursoOriginal(this.curso);
				
				cursoAux.setId(this.curso.getId());	
				cursoAux.setVersionRow(this.curso.getVersionRow());	
				cursoAux.setid_empresa(this.curso.getid_empresa());	
				cursoAux.setid_empleado(this.curso.getid_empleado());	
				cursoAux.setid_tipo_curso(this.curso.getid_tipo_curso());	
				cursoAux.setid_tipo_institucion(this.curso.getid_tipo_institucion());	
				cursoAux.setnombre(this.curso.getnombre());	
				cursoAux.setcodigo_inscripcion(this.curso.getcodigo_inscripcion());	
				cursoAux.setfecha_inicio(this.curso.getfecha_inicio());	
				cursoAux.setfecha_fin(this.curso.getfecha_fin());	
				cursoAux.setnumero_horas(this.curso.getnumero_horas());	
				cursoAux.setes_aprobado(this.curso.getes_aprobado());	
				cursoAux.setes_auspicio_empresa(this.curso.getes_auspicio_empresa());	
				cursoAux.setdescripcion(this.curso.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cursoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cursoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cursoAux,cursoLogic.getCursos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cursoAux,cursos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cursoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cursoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cursoLogic.saveCursos();//WithConnection
						//cursoLogic.getSetVersionRowCursos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.curso,cursoAux);
					
					this.refrescarForeignKeysDescripcionesCurso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cursoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.getDetalleCursos().addAll(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursos.addAll(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cursoLogic.saveCursoRelaciones(cursoAux,this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.getDetalleCursos());//WithConnection
								//cursoLogic.getSetVersionRowCursos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.curso,cursoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.setDetalleCursos(new ArrayList<DetalleCurso>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursos= new ArrayList<DetalleCurso>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.quitarFilaTotales();}
							cursoAux.setDetalleCursos(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.getDetalleCursos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cursoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cursoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cursoAux,cursoLogic.getCursos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cursoAux,cursos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.curso,cursoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cursoAux=new  Curso();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cursoSessionBean.getEsGuardarRelacionado() 
					|| (this.cursoSessionBean.getEsGuardarRelacionado() && this.curso.getId()>=0)) {
						
					cursoAux.setIsNew(false);
				}
				
				cursoAux.setIsDeleted(false);
			
				cursoAux.setId(this.curso.getId());	
				cursoAux.setVersionRow(this.curso.getVersionRow());	
				cursoAux.setid_empresa(this.curso.getid_empresa());	
				cursoAux.setid_empleado(this.curso.getid_empleado());	
				cursoAux.setid_tipo_curso(this.curso.getid_tipo_curso());	
				cursoAux.setid_tipo_institucion(this.curso.getid_tipo_institucion());	
				cursoAux.setnombre(this.curso.getnombre());	
				cursoAux.setcodigo_inscripcion(this.curso.getcodigo_inscripcion());	
				cursoAux.setfecha_inicio(this.curso.getfecha_inicio());	
				cursoAux.setfecha_fin(this.curso.getfecha_fin());	
				cursoAux.setnumero_horas(this.curso.getnumero_horas());	
				cursoAux.setes_aprobado(this.curso.getes_aprobado());	
				cursoAux.setes_auspicio_empresa(this.curso.getes_auspicio_empresa());	
				cursoAux.setdescripcion(this.curso.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cursoAux,cursoLogic.getCursos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cursoAux,cursos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cursoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cursoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cursoLogic.saveCursos();//WithConnection
						//cursoLogic.getSetVersionRowCursos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.curso,cursoAux);
					
					this.refrescarForeignKeysDescripcionesCurso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cursoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.getDetalleCursos().addAll(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursos.addAll(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cursoLogic.saveCursoRelaciones(cursoAux,this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.getDetalleCursos());//WithConnection
								//cursoLogic.getSetVersionRowCursos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.curso,cursoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.setDetalleCursos(new ArrayList<DetalleCurso>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursos= new ArrayList<DetalleCurso>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.quitarFilaTotales();}
							cursoAux.setDetalleCursos(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.getDetalleCursos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cursoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cursoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cursoAux,cursoLogic.getCursos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cursoAux,cursos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.curso,cursoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cursoAux=new  Curso();
				
				cursoAux.setIsNew(false);
				cursoAux.setIsChanged(false);
				
				cursoAux.setIsDeleted(true);
				
				cursoAux.setId(this.curso.getId());	
				cursoAux.setVersionRow(this.curso.getVersionRow());	
				cursoAux.setid_empresa(this.curso.getid_empresa());	
				cursoAux.setid_empleado(this.curso.getid_empleado());	
				cursoAux.setid_tipo_curso(this.curso.getid_tipo_curso());	
				cursoAux.setid_tipo_institucion(this.curso.getid_tipo_institucion());	
				cursoAux.setnombre(this.curso.getnombre());	
				cursoAux.setcodigo_inscripcion(this.curso.getcodigo_inscripcion());	
				cursoAux.setfecha_inicio(this.curso.getfecha_inicio());	
				cursoAux.setfecha_fin(this.curso.getfecha_fin());	
				cursoAux.setnumero_horas(this.curso.getnumero_horas());	
				cursoAux.setes_aprobado(this.curso.getes_aprobado());	
				cursoAux.setes_auspicio_empresa(this.curso.getes_auspicio_empresa());	
				cursoAux.setdescripcion(this.curso.getdescripcion());	
				
				if(this.cursoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cursoAux.getId()>=0) {	
						this.cursosEliminados.add(cursoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cursoAux,cursoLogic.getCursos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cursoAux,cursos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cursoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cursoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cursoLogic.saveCursos();//WithConnection
						//cursoLogic.getSetVersionRowCursos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cursoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.getDetalleCursos().addAll(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursos.addAll(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cursoLogic.saveCursoRelaciones(cursoAux,this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.getDetalleCursos());//WithConnection
								//cursoLogic.getSetVersionRowCursos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.setDetalleCursos(new ArrayList<DetalleCurso>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursos= new ArrayList<DetalleCurso>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.quitarFilaTotales();}
							cursoAux.setDetalleCursos(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.getDetalleCursos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.cursoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cursoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cursoAux,cursoLogic.getCursos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cursoAux,cursos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getCursos().addAll(this.cursosEliminados);
					
					cursoLogic.saveCursos();//WithConnection
					//cursoLogic.getSetVersionRowCursos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCurso();
				
				this.cursosEliminados= new ArrayList<Curso>();		
			}
			
			if(this.cursoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Curso GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Curso",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.curso=cursoAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessCurso();
      	}
		
	}	
	
	public void actualizarRelaciones(Curso cursoLocal) throws Exception {
		
		if(this.cursoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				cursoLocal.setDetalleCursos(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.getDetalleCursos());
			
			} else {
			
				cursoLocal.setDetalleCursos(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Curso cursoLocal) throws Exception {	
		if(this.cursoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cursoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				cursoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCursoDetalleFormJInternalFrame.class)) {
				TipoCursoBeanSwingJInternalFrame tipocursoBeanSwingJInternalFrameLocal=(TipoCursoBeanSwingJInternalFrame) ((TipoCursoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocursoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCurso(tipocursoBeanSwingJInternalFrameLocal.gettipocurso(),true);
				tipocursoBeanSwingJInternalFrameLocal.actualizarLista(tipocursoBeanSwingJInternalFrameLocal.tipocurso,this.tipocursosForeignKey);

				tipocursoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocursoBeanSwingJInternalFrameLocal.tipocurso);

				cursoLocal.setTipoCurso(tipocursoBeanSwingJInternalFrameLocal.tipocurso);

				this.addItemDefectoCombosForeignKeyTipoCurso();
				this.cargarCombosFrameTipoCursosForeignKey("Formulario");
				this.setActualTipoCursoForeignKey(tipocursoBeanSwingJInternalFrameLocal.tipocurso.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoInstitucionDetalleFormJInternalFrame.class)) {
				TipoInstitucionBeanSwingJInternalFrame tipoinstitucionBeanSwingJInternalFrameLocal=(TipoInstitucionBeanSwingJInternalFrame) ((TipoInstitucionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoinstitucionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoInstitucion(tipoinstitucionBeanSwingJInternalFrameLocal.gettipoinstitucion(),true);
				tipoinstitucionBeanSwingJInternalFrameLocal.actualizarLista(tipoinstitucionBeanSwingJInternalFrameLocal.tipoinstitucion,this.tipoinstitucionsForeignKey);

				tipoinstitucionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoinstitucionBeanSwingJInternalFrameLocal.tipoinstitucion);

				cursoLocal.setTipoInstitucion(tipoinstitucionBeanSwingJInternalFrameLocal.tipoinstitucion);

				this.addItemDefectoCombosForeignKeyTipoInstitucion();
				this.cargarCombosFrameTipoInstitucionsForeignKey("Formulario");
				this.setActualTipoInstitucionForeignKey(tipoinstitucionBeanSwingJInternalFrameLocal.tipoinstitucion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCursoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCurso.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cursoValidator.getInvalidValues(this.curso);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Curso curso,List<Curso> cursos) throws Exception {
		try	{		
			CursoConstantesFunciones.actualizarLista(curso,cursos,this.cursoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Curso curso,List<Curso> cursos) throws Exception {
		try	{			
			CursoConstantesFunciones.actualizarSelectedLista(curso,cursos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Curso> cursosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cursosLocal=this.cursoLogic.getCursos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cursosLocal=this.cursos;
			}
			//ARCHITECTURE
		
			for(Curso cursoLocal:cursosLocal) {
				if(this.permiteMantenimiento(cursoLocal) && cursoLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+CursoConstantesFunciones.getCursoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelid_empresaCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelid_empleadoCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.IDTIPOCURSO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelid_tipo_cursoCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.IDTIPOINSTITUCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelid_tipo_institucionCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelnombreCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.CODIGOINSCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelcodigo_inscripcionCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelfecha_inicioCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelfecha_finCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.NUMEROHORAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelnumero_horasCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.ESAPROBADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabeles_aprobadoCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.ESAUSPICIOEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabeles_auspicio_empresaCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CursoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabeldescripcionCurso,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormCurso!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabelid_empresaCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabelid_empleadoCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabelid_tipo_cursoCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabelid_tipo_institucionCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabelnombreCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabelcodigo_inscripcionCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabelfecha_inicioCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabelfecha_finCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabelnumero_horasCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabeles_aprobadoCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabeles_auspicio_empresaCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCurso.jLabeldescripcionCurso,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleCurso")) {
			if(this.curso==null) {
				this.curso= new Curso();
			}

			if(this.cursoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCurso
				this.setVariablesFormularioToObjetoActualCurso(this.curso,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);

				this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.getdetallecurso().setCurso(this.curso);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCurso--;	
		
		
		this.cursoAux=new Curso();
		
		this.cursoAux.setId(this.iIdNuevoCurso);
		this.cursoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cursoLogic.getCursos().add(this.cursoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cursos.add(this.cursoAux);
		}
		//ARCHITECTURE
		
		this.curso=this.cursoAux;
		
		if(CursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCurso(this.curso);
			this.setVariablesObjetoActualToFormularioForeignKeyCurso(this.curso);
		}
				
		//this.setDefaultControlesCurso();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCurso();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCurso();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCurso();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCurso(this.cursoBean,this.curso,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CursoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cursoSessionBean.getConGuardarRelaciones()) {
			classes=CursoConstantesFunciones.getClassesRelationshipsOfCurso(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cursoReturnGeneral=cursoLogic.procesarEventosCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cursoLogic.getCursos(),this.curso,this.cursoParameterGeneral,this.isEsNuevoCurso,classes);//this.cursoLogic.getCurso()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCurso(this.cursoReturnGeneral,this.cursoBean,false);
		
		if(this.cursoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCurso(this.cursoReturnGeneral.getCurso());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCurso(this.cursoReturnGeneral.getCurso());
		}
		
		if(this.cursoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCurso(this.cursoReturnGeneral.getCurso(),classes);//this.cursoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCurso(this.curso,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCurso();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCurso();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CursoBeanSwingJInternalFrameAdditional.RecargarFormCurso(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCurso(false);
						
			if(cursoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoSessionBean.getEsGuardarRelacionado() && DetalleCursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleCursoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CursoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCurso();
			}
			
			this.actualizarVisualTableDatosCurso();
			
			this.jTableDatosCurso.setRowSelectionInterval(this.getIndiceNuevoCurso(), this.getIndiceNuevoCurso());
			
			this.seleccionarFilaTablaCursoActual();
						
			this.actualizarEstadoCeldasBotonesCurso("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCurso(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCurso.jTextAreanombreCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activarnombreCurso);
		this.jInternalFrameDetalleFormCurso.jTextFieldcodigo_inscripcionCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activarcodigo_inscripcionCurso);
		this.jInternalFrameDetalleFormCurso.jDateChooserfecha_inicioCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activarfecha_inicioCurso);
		this.jInternalFrameDetalleFormCurso.jDateChooserfecha_finCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activarfecha_finCurso);
		this.jInternalFrameDetalleFormCurso.jTextFieldnumero_horasCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activarnumero_horasCurso);
		this.jInternalFrameDetalleFormCurso.jCheckBoxes_aprobadoCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activares_aprobadoCurso);
		this.jInternalFrameDetalleFormCurso.jCheckBoxes_auspicio_empresaCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activares_auspicio_empresaCurso);
		this.jInternalFrameDetalleFormCurso.jTextAreadescripcionCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activardescripcionCurso);	
		//
		this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activarid_empresaCurso);
		this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activarid_empleadoCurso);
		this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activarid_tipo_cursoCurso);
		this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.setEnabled(isHabilitar && this.cursoConstantesFunciones.activarid_tipo_institucionCurso);
	};
	
	public void setDefaultControlesCurso() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCurso(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cursoSessionBean.setConGuardarRelaciones(true);			
			this.cursoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCurso.jTabbedPaneRelacionesCurso.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.cursoSessionBean.setConGuardarRelaciones(false);			
			this.cursoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCurso.jTabbedPaneRelacionesCurso.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCurso() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Curso cursoAux:this.cursoLogic.getCursos()) {
				if(cursoAux.getId().equals(this.iIdNuevoCurso)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Curso cursoAux:this.cursos) {
				if(cursoAux.getId().equals(this.iIdNuevoCurso)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualCurso(Curso curso,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Curso cursoAux:this.cursoLogic.getCursos()) {
				if(cursoAux.getId().equals(curso.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Curso cursoAux:this.cursos) {
				if(cursoAux.getId().equals(curso.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalCurso(Curso cursoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Curso cursoAux:this.cursoLogic.getCursos()) {
				if(cursoAux.getCursoOriginal().getId().equals(cursoOriginal.getId())) {
					existe=true;
					cursoOriginal.setId(cursoAux.getId());
					cursoOriginal.setVersionRow(cursoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Curso cursoAux:this.cursos) {
				if(cursoAux.getCursoOriginal().getId().equals(cursoOriginal.getId())) {
					existe=true;
					cursoOriginal.setId(cursoAux.getId());
					cursoOriginal.setVersionRow(cursoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCurso(Boolean esParaCancelar) throws Exception {
		cursosAux=new ArrayList<Curso>();
		cursoAux=new Curso();
		
		if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Curso cursoAux:this.cursoLogic.getCursos()) {
					if(cursoAux.getId()<0) {
						cursosAux.add(cursoAux);
					}		
				}
				this.iIdNuevoCurso=0L;
				this.cursoLogic.getCursos().removeAll(cursosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Curso cursoAux:this.cursos) {
					if(cursoAux.getId()<0) {
						cursosAux.add(cursoAux);
					}		
				}
				this.iIdNuevoCurso=0L;
				this.cursos.removeAll(cursosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCurso 
					&& this.cursoLogic.getCursos().size()>0
					) {
					cursoAux=this.cursoLogic.getCursos().get(this.cursoLogic.getCursos().size() - 1);
				
					if(cursoAux.getId()<0) {
						this.cursoLogic.getCursos().remove(cursoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCurso && this.cursos.size()>0) {
					cursoAux=this.cursos.get(this.cursos.size() - 1);
				
					if(cursoAux.getId()<0) {
						this.cursos.remove(cursoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCurso(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(curso.getId()<0) {
				this.cursoLogic.getCursos().remove(this.curso);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(curso.getId()<0) {
				this.cursos.remove(this.curso);
			}
		}			
	}
	
	public void setEstadosInicialesCurso(List<Curso> cursosAux) throws Exception {
		CursoConstantesFunciones.setEstadosInicialesCurso(cursosAux);
	}
	
	public void setEstadosInicialesCurso(Curso cursoAux) throws Exception {
		CursoConstantesFunciones.setEstadosInicialesCurso(cursoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCursoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCursoActual()) {
				if(!this.isEsNuevoCurso) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCurso=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCursoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Curso ?", "MANTENIMIENTO DE Curso", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Curso curso) throws Exception {
		CursoConstantesFunciones.seleccionarAsignar(this.curso,curso);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCurso=this.isPermisoActualizarOriginalCurso;
			
			
			this.seleccionarAsignar(curso);
			
			

			idEmpleadoActual=curso.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CursoConstantesFunciones.quitarEspaciosCurso(this.curso,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCurso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cursoSessionBean.setsFuncionBusquedaRapida(this.cursoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarEmpleadoActual() throws Exception {
		try	{
			Empleado empleadoAux=new Empleado();

			if(this.idEmpleadoActual != null && this.idEmpleadoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(this.idEmpleadoActual);
					empleadoAux= empleadoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosForeignKey=new ArrayList<Empleado>();
				empleadosForeignKey.add(empleadoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCurso) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCurso(esParaCancelar);				
				this.cancelarNuevoCurso(esParaCancelar);								
			}
			
			this.curso=new Curso();
			
			this.inicializarCurso();
			
			this.actualizarEstadoCeldasBotonesCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCurso() throws Exception {
		try {
			CursoConstantesFunciones.inicializarCurso(this.curso);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cursoLogic.getCursos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCursos(String sAccionBusqueda,List<Curso> cursosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="Curso"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CursoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CursoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Curso"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Cursos");		
		parameters.put("busquedapor", CursoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleCurso.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CursoLogic cursoLogicAuxiliar=new CursoLogic();
					cursoLogicAuxiliar.setDatosCliente(cursoLogic.getDatosCliente());				
					cursoLogicAuxiliar.setCursos(cursosParaReportes);
					
					cursoLogicAuxiliar.cargarRelacionesLoteForeignKeyCursoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					cursosParaReportes=cursoLogicAuxiliar.getCursos();
					
					//cursoLogic.getNewConnexionToDeep();
					
					//for (Curso curso:cursosParaReportes) {
					//	cursoLogic.deepLoad(curso, false, DeepLoadType.INCLUDE, classes);
					//}						
					//cursoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//cursoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleCurso = AuxiliarReportes.class.getResourceAsStream("DetalleCursoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallecurso", reportFileDetalleCurso);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCurso=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CursoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CursoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCurso=new JRBeanArrayDataSource(CursoJInternalFrame.TraerCursoBeans(cursosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCurso);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CursoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CursoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CursoBean.TraerCursoBeans(cursosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteCursos(sAccionBusqueda,sTipoArchivoReporte,cursosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCursos(sAccionBusqueda,sTipoArchivoReporte,cursosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCursoActionPerformed(null);
					//this.generarExcelReporteCursos(sAccionBusqueda,sTipoArchivoReporte,cursosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCursos(sAccionBusqueda,sTipoArchivoReporte,cursosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCursos(sAccionBusqueda,sTipoArchivoReporte,cursosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCursos(sAccionBusqueda,sTipoArchivoReporte,cursosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCursos(String sAccionBusqueda,String sTipoArchivoReporte,List<Curso> cursosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"curso";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cursos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCurso("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Curso curso : cursosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CursoConstantesFunciones.generarExcelReporteDataCurso("NORMAL",row,workbook,curso,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Curso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCurso(String sTipo,Row row,Workbook workbook) {
		
		CursoConstantesFunciones.generarExcelReporteHeaderCurso(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCursos(String sAccionBusqueda,String sTipoArchivoReporte,List<Curso> cursosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"curso_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cursos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Curso curso : cursosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CursoConstantesFunciones.getCursoDescripcion(curso));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(curso.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(curso.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_IDTIPOCURSO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_IDTIPOCURSO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(curso.gettipocurso_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(curso.gettipoinstitucion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(curso.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(curso.getcodigo_inscripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(curso.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(curso.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_NUMEROHORAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_NUMEROHORAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(curso.getnumero_horas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_ESAPROBADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_ESAPROBADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(curso.getes_aprobado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(curso.getes_auspicio_empresa()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CursoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CursoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(curso.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Curso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCursos(String sAccionBusqueda,String sTipoArchivoReporte,List<Curso> cursosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Curso> cursosRespaldo=null;
		
		classes=CursoConstantesFunciones.getClassesRelationshipsOfCurso(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cursoLogic.setDatosCliente(this.datosCliente);
		this.cursoLogic.setDatosDeep(this.datosDeep);
		this.cursoLogic.setIsConDeep(true);
		
		cursosRespaldo=this.cursoLogic.getCursos();
		
		this.cursoLogic.setCursos(cursosParaReportes);	
		this.cursoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cursosParaReportes=this.cursoLogic.getCursos();
		this.cursoLogic.setCursos(cursosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"curso_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cursos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCurso("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Curso curso : cursosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCurso("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CursoConstantesFunciones.generarExcelReporteDataCurso("NORMAL",row,workbook,curso,cellStyleDataAux);
		
			
			


				//DetalleCurso
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleCursoConstantesFunciones.SCLASSWEBTITULO))) {

				if(curso.getDetalleCursos()!=null && curso.getDetalleCursos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleCursoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleCursoConstantesFunciones.generarExcelReporteHeaderDetalleCurso("RELACIONADO",row,workbook);
				}

				if(curso.getDetalleCursos()!=null) {
					i2=0;
					for(DetalleCurso detallecurso : curso.getDetalleCursos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleCursoConstantesFunciones.generarExcelReporteDataDetalleCurso("RELACIONADO",row,workbook,detallecurso,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CursoConstantesFunciones.getCursoDescripcion(curso));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Curso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCurso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCurso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCurso.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCurso.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCurso() throws Exception {		
		this.startProcessCurso(true);
	}
	
	public void startProcessCurso(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCurso ,this.jPanelParametrosReportesCurso, this.jScrollPanelDatosCurso,this.jPanelPaginacionCurso, this.jScrollPanelDatosEdicionCurso, this.jPanelAccionesCurso,this.jPanelAccionesFormularioCurso,this.jmenuBarCurso,this.jmenuBarDetalleCurso,this.jTtoolBarCurso,this.jTtoolBarDetalleCurso);		
		
		final JTabbedPane jTabbedPaneBusquedasCurso=this.jTabbedPaneBusquedasCurso; 
		
		final JPanel jPanelParametrosReportesCurso=this.jPanelParametrosReportesCurso;
		//final JScrollPane jScrollPanelDatosCurso=this.jScrollPanelDatosCurso;
		final JTable jTableDatosCurso=this.jTableDatosCurso;		
		final JPanel jPanelPaginacionCurso=this.jPanelPaginacionCurso;
		//final JScrollPane jScrollPanelDatosEdicionCurso=this.jScrollPanelDatosEdicionCurso;
		final JPanel jPanelAccionesCurso=this.jPanelAccionesCurso;
		
		JPanel jPanelCamposAuxiliarCurso=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCurso=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCurso!=null) {
			jPanelCamposAuxiliarCurso=this.jInternalFrameDetalleFormCurso.jPanelCamposCurso;
			jPanelAccionesFormularioAuxiliarCurso=this.jInternalFrameDetalleFormCurso.jPanelAccionesFormularioCurso;
		}
		
		final JPanel jPanelCamposCurso=jPanelCamposAuxiliarCurso;
		final JPanel jPanelAccionesFormularioCurso=jPanelAccionesFormularioAuxiliarCurso;
		
		
		final JMenuBar jmenuBarCurso=this.jmenuBarCurso;
		final JToolBar jTtoolBarCurso=this.jTtoolBarCurso;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCurso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCurso=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCurso!=null) {
			jmenuBarDetalleAuxiliarCurso=this.jInternalFrameDetalleFormCurso.jmenuBarDetalleCurso;
			jTtoolBarDetalleAuxiliarCurso=this.jInternalFrameDetalleFormCurso.jTtoolBarDetalleCurso;
		}
		
		final JMenuBar jmenuBarDetalleCurso=jmenuBarDetalleAuxiliarCurso;
		final JToolBar jTtoolBarDetalleCurso=jTtoolBarDetalleAuxiliarCurso;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCurso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCurso;
			processRunnable.jTableDatos=jTableDatosCurso;
			processRunnable.jPanelCampos=jPanelCamposCurso;
			processRunnable.jPanelPaginacion=jPanelPaginacionCurso;
			processRunnable.jPanelAcciones=jPanelAccionesCurso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCurso;
			
			
			processRunnable.jmenuBar=jmenuBarCurso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCurso;
			processRunnable.jTtoolBar=jTtoolBarCurso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCurso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCurso ,jPanelParametrosReportesCurso,jTableDatosCurso, /*jScrollPanelDatosCurso,*/jPanelCamposCurso,jPanelPaginacionCurso, /*jScrollPanelDatosEdicionCurso,*/ jPanelAccionesCurso,jPanelAccionesFormularioCurso,jmenuBarCurso,jmenuBarDetalleCurso,jTtoolBarCurso,jTtoolBarDetalleCurso);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCurso ,jPanelParametrosReportesCurso, jScrollPanelDatosCurso,jPanelPaginacionCurso, jScrollPanelDatosEdicionCurso, jPanelAccionesCurso,jPanelAccionesFormularioCurso,jmenuBarCurso,jmenuBarDetalleCurso,jTtoolBarCurso,jTtoolBarDetalleCurso);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessCurso() {// throws Exception 
		this.finishProcessCurso(true);
	}
	
	public void finishProcessCurso(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCurso ,this.jPanelParametrosReportesCurso, this.jScrollPanelDatosCurso,this.jPanelPaginacionCurso, this.jScrollPanelDatosEdicionCurso, this.jPanelAccionesCurso,this.jPanelAccionesFormularioCurso,this.jmenuBarCurso,this.jmenuBarDetalleCurso,this.jTtoolBarCurso,this.jTtoolBarDetalleCurso);		
		
		final JTabbedPane jTabbedPaneBusquedasCurso=this.jTabbedPaneBusquedasCurso; 
		
		final JPanel jPanelParametrosReportesCurso=this.jPanelParametrosReportesCurso;
		//final JScrollPane jScrollPanelDatosCurso=this.jScrollPanelDatosCurso;
		final JTable jTableDatosCurso=this.jTableDatosCurso;		
		final JPanel jPanelPaginacionCurso=this.jPanelPaginacionCurso;
		//final JScrollPane jScrollPanelDatosEdicionCurso=this.jScrollPanelDatosEdicionCurso;
		final JPanel jPanelAccionesCurso=this.jPanelAccionesCurso;
		
		JPanel jPanelCamposAuxiliarCurso=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCurso=new JPanel();
		
		if(this.jInternalFrameDetalleFormCurso!=null) {
			jPanelCamposAuxiliarCurso=this.jInternalFrameDetalleFormCurso.jPanelCamposCurso;
			jPanelAccionesFormularioAuxiliarCurso=this.jInternalFrameDetalleFormCurso.jPanelAccionesFormularioCurso;
		}
		
		final JPanel jPanelCamposCurso=jPanelCamposAuxiliarCurso;
		final JPanel jPanelAccionesFormularioCurso=jPanelAccionesFormularioAuxiliarCurso;
		
		
		final JMenuBar jmenuBarCurso=this.jmenuBarCurso;		
		final JToolBar jTtoolBarCurso=this.jTtoolBarCurso;
				
		JMenuBar jmenuBarDetalleAuxiliarCurso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCurso=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCurso!=null) {
			jmenuBarDetalleAuxiliarCurso=this.jInternalFrameDetalleFormCurso.jmenuBarDetalleCurso;
			jTtoolBarDetalleAuxiliarCurso=this.jInternalFrameDetalleFormCurso.jTtoolBarDetalleCurso;		
		}
		
		final JMenuBar jmenuBarDetalleCurso=jmenuBarDetalleAuxiliarCurso;
		final JToolBar jTtoolBarDetalleCurso=jTtoolBarDetalleAuxiliarCurso;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCurso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCurso;
			processRunnable.jTableDatos=jTableDatosCurso;
			processRunnable.jPanelCampos=jPanelCamposCurso;
			processRunnable.jPanelPaginacion=jPanelPaginacionCurso;
			processRunnable.jPanelAcciones=jPanelAccionesCurso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCurso;
			
			
			processRunnable.jmenuBar=jmenuBarCurso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCurso;
			processRunnable.jTtoolBar=jTtoolBarCurso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCurso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCurso ,jPanelParametrosReportesCurso, jTableDatosCurso,/*jScrollPanelDatosCurso,*/jPanelCamposCurso,jPanelPaginacionCurso, /*jScrollPanelDatosEdicionCurso,*/ jPanelAccionesCurso,jPanelAccionesFormularioCurso,jmenuBarCurso,jmenuBarDetalleCurso,jTtoolBarCurso,jTtoolBarDetalleCurso));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCurso(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCurso(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCurso(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCurso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCurso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCurso,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCurso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCurso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCurso,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cursoConstantesFunciones.getsFinalQueryCurso();
		String  finalQueryPaginacionTodos=this.cursoConstantesFunciones.getsFinalQueryCurso();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=CursoConstantesFunciones.getArrayColumnasGlobalesNoCurso(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CursoConstantesFunciones.getArrayColumnasGlobalesCurso(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CursoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cursosEliminados= new ArrayList<Curso>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCurso();
		
				///*CursoSessionBean*/this.cursoSessionBean=new CursoSessionBean();
			
			if(this.cursoSessionBean==null) {
				this.cursoSessionBean=new CursoSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=CursoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CursoConstantesFunciones.getClassesForeignKeysOfCurso(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/curso."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cursosAux= new ArrayList<Curso>();
			
				
			cursoLogic.setDatosCliente(this.datosCliente);
			cursoLogic.setDatosDeep(this.datosDeep);
			cursoLogic.setIsConDeep(true);
			
			
			cursoLogic.getCursoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cursoLogic.getTodosCursos(finalQueryGlobal,pagination);
					
					//cursoLogic.getTodosCursosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cursoLogic.getCursos()==null|| cursoLogic.getCursos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cursosAux= new ArrayList<Curso>();
							cursosAux.addAll(cursoLogic.getCursos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cursosAux= new ArrayList<Curso>();
							cursosAux.addAll(cursos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cursoLogic.getTodosCursos(finalQueryGlobal+"",this.pagination);												
							
							//cursoLogic.getTodosCursosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCursos("Todos",cursoLogic.getCursos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cursoLogic.setCursos(new ArrayList<Curso>());					
							cursoLogic.getCursos().addAll(cursosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cursos=new ArrayList<Curso>();
							cursos.addAll(cursosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCurso=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCurso=this.idActual;
				
				} else if(this.idCursoActual!=null && this.idCursoActual!=0L) {
					idCurso=idCursoActual;
				}
				
					
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndicePorId(idCurso);
				
				this.cursos=new ArrayList<Curso>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cursoLogic.getEntity(idCurso);
					
					//cursoLogic.getEntityWithConnection(idCurso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cursoLogic.setCursos(new ArrayList<Curso>());
					cursoLogic.getCursos().add(cursoLogic.getCurso());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cursos=new ArrayList<Curso>();
					this.cursos.add(curso);
				}
				
				if(cursoLogic.getCurso()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cursoLogic.getCursosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cursoLogic.getCursos()==null||cursoLogic.getCursos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cursos==null|| cursos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cursosAux=new ArrayList<Curso>();
						cursosAux.addAll(cursoLogic.getCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cursosAux=new ArrayList<Curso>();
							cursosAux.addAll(cursos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cursoLogic.getCursosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCursos("FK_IdEmpleado",cursoLogic.getCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCursos("FK_IdEmpleado",cursos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cursoLogic.setCursos(new ArrayList<Curso>());
						cursoLogic.getCursos().addAll(cursosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cursos=new ArrayList<Curso>();
							cursos.addAll(cursosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cursoLogic.getCursosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cursoLogic.getCursos()==null||cursoLogic.getCursos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cursos==null|| cursos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cursosAux=new ArrayList<Curso>();
						cursosAux.addAll(cursoLogic.getCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cursosAux=new ArrayList<Curso>();
							cursosAux.addAll(cursos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cursoLogic.getCursosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCursos("FK_IdEmpresa",cursoLogic.getCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCursos("FK_IdEmpresa",cursos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cursoLogic.setCursos(new ArrayList<Curso>());
						cursoLogic.getCursos().addAll(cursosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cursos=new ArrayList<Curso>();
							cursos.addAll(cursosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCurso")) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdTipoCurso(id_tipo_cursoFK_IdTipoCurso);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cursoLogic.getCursosFK_IdTipoCurso(finalQueryGlobal,pagination,id_tipo_cursoFK_IdTipoCurso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdTipoCurso(id_tipo_cursoFK_IdTipoCurso);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdTipoCurso(id_tipo_cursoFK_IdTipoCurso);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cursoLogic.getCursos()==null||cursoLogic.getCursos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cursos==null|| cursos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cursosAux=new ArrayList<Curso>();
						cursosAux.addAll(cursoLogic.getCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cursosAux=new ArrayList<Curso>();
							cursosAux.addAll(cursos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cursoLogic.getCursosFK_IdTipoCurso(finalQueryGlobal,pagination,id_tipo_cursoFK_IdTipoCurso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdTipoCurso(id_tipo_cursoFK_IdTipoCurso);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdTipoCurso(id_tipo_cursoFK_IdTipoCurso);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCursos("FK_IdTipoCurso",cursoLogic.getCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCursos("FK_IdTipoCurso",cursos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cursoLogic.setCursos(new ArrayList<Curso>());
						cursoLogic.getCursos().addAll(cursosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cursos=new ArrayList<Curso>();
							cursos.addAll(cursosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoInstitucion")) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdTipoInstitucion(id_tipo_institucionFK_IdTipoInstitucion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cursoLogic.getCursosFK_IdTipoInstitucion(finalQueryGlobal,pagination,id_tipo_institucionFK_IdTipoInstitucion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdTipoInstitucion(id_tipo_institucionFK_IdTipoInstitucion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdTipoInstitucion(id_tipo_institucionFK_IdTipoInstitucion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cursoLogic.getCursos()==null||cursoLogic.getCursos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cursos==null|| cursos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cursosAux=new ArrayList<Curso>();
						cursosAux.addAll(cursoLogic.getCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cursosAux=new ArrayList<Curso>();
							cursosAux.addAll(cursos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cursoLogic.getCursosFK_IdTipoInstitucion(finalQueryGlobal,pagination,id_tipo_institucionFK_IdTipoInstitucion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdTipoInstitucion(id_tipo_institucionFK_IdTipoInstitucion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CursoConstantesFunciones.getDetalleIndiceFK_IdTipoInstitucion(id_tipo_institucionFK_IdTipoInstitucion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCursos("FK_IdTipoInstitucion",cursoLogic.getCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCursos("FK_IdTipoInstitucion",cursos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cursoLogic.setCursos(new ArrayList<Curso>());
						cursoLogic.getCursos().addAll(cursosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cursos=new ArrayList<Curso>();
							cursos.addAll(cursosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCurso();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCurso();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cursoLogic.getCursos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cursos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cursoLogic.getCursos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cursos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Curso curso) {
		Boolean permite=true;
		
		if(this.curso.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CursoConstantesFunciones.getOrderByListaCurso();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CursoConstantesFunciones.getOrderByListaCurso();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Curso curso:cursoLogic.getCursos()) {
				if(curso.getsType().equals(Constantes2.S_TOTALES)) {
					cursoTotales=curso;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Curso curso:this.cursos) {
				if(curso.getsType().equals(Constantes2.S_TOTALES)) {
					cursoTotales=curso;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.cursoAux=new Curso();
			this.cursoAux.setsType(Constantes2.S_TOTALES);
			this.cursoAux.setIsNew(false);
			this.cursoAux.setIsChanged(false);
			this.cursoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CursoConstantesFunciones.TotalizarValoresFilaCurso(this.cursoLogic.getCursos(),this.cursoAux);
				
				this.cursoLogic.getCursos().add(this.cursoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CursoConstantesFunciones.TotalizarValoresFilaCurso(this.cursos,this.cursoAux);
				
				this.cursos.add(this.cursoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cursoTotales=new Curso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cursoLogic.getCursos().remove(cursoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cursos.remove(cursoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cursoTotales=new Curso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Curso curso:cursoLogic.getCursos()) {
				if(curso.getsType().equals(Constantes2.S_TOTALES)) {
					cursoTotales=curso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CursoConstantesFunciones.TotalizarValoresFilaCurso(this.cursoLogic.getCursos(),cursoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Curso curso:this.cursos) {
				if(curso.getsType().equals(Constantes2.S_TOTALES)) {
					cursoTotales=curso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CursoConstantesFunciones.TotalizarValoresFilaCurso(this.cursos,cursoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCursosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCursosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCursosFK_IdTipoCurso()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCurso";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCursosFK_IdTipoInstitucion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoInstitucion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCursosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cursoLogic.getCursosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCursosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cursoLogic.getCursosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCursosFK_IdTipoCurso(String sFinalQuery,Long id_tipo_curso)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cursoLogic.getCursosFK_IdTipoCurso(sFinalQuery,this.pagination,id_tipo_curso);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCursosFK_IdTipoInstitucion(String sFinalQuery,Long id_tipo_institucion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cursoLogic.getCursosFK_IdTipoInstitucion(sFinalQuery,this.pagination,id_tipo_institucion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosCurso() {
		this.isPermisoTodoCurso=false;
		this.isPermisoNuevoCurso=false;
		this.isPermisoActualizarCurso=false;
		this.isPermisoActualizarOriginalCurso=false;
		this.isPermisoEliminarCurso=false;
		this.isPermisoGuardarCambiosCurso=false;
		this.isPermisoConsultaCurso=false;
		this.isPermisoBusquedaCurso=false;
		this.isPermisoReporteCurso=false;		
		this.isPermisoOrdenCurso=false;		
		this.isPermisoPaginacionMedioCurso=false;		
		this.isPermisoPaginacionAltoCurso=false;
		this.isPermisoPaginacionTodoCurso=false;
		this.isPermisoCopiarCurso=false;		
		this.isPermisoVerFormCurso=false;		
		this.isPermisoDuplicarCurso=false;		
		this.isPermisoOrdenCurso=false;		
	}
	
	public void setPermisosUsuarioCurso(Boolean isPermiso) {
		this.isPermisoTodoCurso=isPermiso;
		this.isPermisoNuevoCurso=isPermiso;
		this.isPermisoActualizarCurso=isPermiso;
		this.isPermisoActualizarOriginalCurso=isPermiso;
		this.isPermisoEliminarCurso=isPermiso;
		this.isPermisoGuardarCambiosCurso=isPermiso;
		this.isPermisoConsultaCurso=isPermiso;
		this.isPermisoBusquedaCurso=isPermiso;
		this.isPermisoReporteCurso=isPermiso;
		this.isPermisoOrdenCurso=isPermiso;		
		this.isPermisoPaginacionMedioCurso=isPermiso;		
		this.isPermisoPaginacionAltoCurso=isPermiso;		
		this.isPermisoPaginacionTodoCurso=isPermiso;		
		this.isPermisoCopiarCurso=isPermiso;		
		this.isPermisoVerFormCurso=isPermiso;		
		this.isPermisoDuplicarCurso=isPermiso;
		this.isPermisoOrdenCurso=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCurso(Boolean isPermiso) {
		//this.isPermisoTodoCurso=isPermiso;
		this.isPermisoNuevoCurso=isPermiso;
		this.isPermisoActualizarCurso=isPermiso;
		this.isPermisoActualizarOriginalCurso=isPermiso;
		this.isPermisoEliminarCurso=isPermiso;
		this.isPermisoGuardarCambiosCurso=isPermiso;
		//this.isPermisoConsultaCurso=isPermiso;
		//this.isPermisoBusquedaCurso=isPermiso;
		//this.isPermisoReporteCurso=isPermiso;
		//this.isPermisoOrdenCurso=isPermiso;		
		//this.isPermisoPaginacionMedioCurso=isPermiso;		
		//this.isPermisoPaginacionAltoCurso=isPermiso;		
		//this.isPermisoPaginacionTodoCurso=isPermiso;		
		//this.isPermisoCopiarCurso=isPermiso;		
		//this.isPermisoDuplicarCurso=isPermiso;
		//this.isPermisoOrdenCurso=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCursoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleCursoConstantesFunciones.SNOMBREOPCION);
		
		if(CursoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleCurso=false;
		this.isTienePermisosDetalleCurso=this.verificarGetPermisosUsuarioOpcionCursoClaseRelacionada(this.opcionsRelacionadas,DetalleCursoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCurso(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCursoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleCurso=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCursoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCursoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCursoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleCurso && this.jInternalFrameDetalleFormCurso!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCurso.jTabbedPaneRelacionesCurso.remove(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCurso() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CursoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cursoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CursoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCurso=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCurso=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCurso=this.isPermisoActualizarCurso;
			this.isPermisoEliminarCurso=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCurso=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCurso=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCurso=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCurso=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCurso=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCurso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCurso=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCurso=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCurso=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCurso=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCurso=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCurso=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCurso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cursoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCurso.setToolTipText(this.jTableDatosCurso.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCurso(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCurso(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CursoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(CursoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioCurso() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleCurso && this.cursoConstantesFunciones.mostrarDetalleCursoCurso && !CursoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Curso");
			reporte.setsDescripcion("Detalle Curso");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyCursoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.tipocursosForeignKey=new ArrayList();
				this.tipoinstitucionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCursoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CursoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCursoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCursoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoInstitucionListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCursoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocursosForeignKey==null||this.tipocursosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCursoConstantesFunciones.getArrayColumnasGlobalesTipoCurso(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCursoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCursoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCursosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoInstitucionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoinstitucionsForeignKey==null||this.tipoinstitucionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoInstitucionConstantesFunciones.getArrayColumnasGlobalesTipoInstitucion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoInstitucionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoInstitucionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoInstitucionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCursoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CursoParameterReturnGeneral cursoReturnGeneral=new CursoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cursoConstantesFunciones.cargarid_empresaCurso)
					 || (this.esRecargarFks && this.cursoConstantesFunciones.cargarid_empresaCurso)) {

					if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cursoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.cursoConstantesFunciones.cargarid_empleadoCurso)
					 || (this.esRecargarFks && this.cursoConstantesFunciones.cargarid_empleadoCurso)) {

					if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+cursoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalTipoCurso="";

				if(((this.tipocursosForeignKey==null||this.tipocursosForeignKey.size()<=0) && this.cursoConstantesFunciones.cargarid_tipo_cursoCurso)
					 || (this.esRecargarFks && this.cursoConstantesFunciones.cargarid_tipo_cursoCurso)) {

					if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCurso()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCursoConstantesFunciones.getArrayColumnasGlobalesTipoCurso(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCurso=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCursoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCurso=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCurso, "");
						finalQueryGlobalTipoCurso+=TipoCursoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCursosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCurso=" WHERE " + ConstantesSql.ID + "="+cursoSessionBean.getlidTipoCursoActual();
					}
				} else {
					finalQueryGlobalTipoCurso="NONE";
				}


				String finalQueryGlobalTipoInstitucion="";

				if(((this.tipoinstitucionsForeignKey==null||this.tipoinstitucionsForeignKey.size()<=0) && this.cursoConstantesFunciones.cargarid_tipo_institucionCurso)
					 || (this.esRecargarFks && this.cursoConstantesFunciones.cargarid_tipo_institucionCurso)) {

					if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionTipoInstitucion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoInstitucionConstantesFunciones.getArrayColumnasGlobalesTipoInstitucion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoInstitucion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoInstitucionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoInstitucion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoInstitucion, "");
						finalQueryGlobalTipoInstitucion+=TipoInstitucionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoInstitucionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoInstitucion=" WHERE " + ConstantesSql.ID + "="+cursoSessionBean.getlidTipoInstitucionActual();
					}
				} else {
					finalQueryGlobalTipoInstitucion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cursoReturnGeneral=cursoLogic.cargarCombosLoteForeignKeyCurso(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalTipoCurso,finalQueryGlobalTipoInstitucion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cursoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=cursoReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalTipoCurso.equals("NONE")) {
				this.tipocursosForeignKey=cursoReturnGeneral.gettipocursosForeignKey();
			}

			if(!finalQueryGlobalTipoInstitucion.equals("NONE")) {
				this.tipoinstitucionsForeignKey=cursoReturnGeneral.gettipoinstitucionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCurso()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyTipoCurso();
			this.addItemDefectoCombosForeignKeyTipoInstitucion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cursoSessionBean==null) {
				this.cursoSessionBean=new CursoSessionBean();
			}

			if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoCurso()throws Exception {
		try {

			if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCurso()) {
				TipoCurso tipocurso=new TipoCurso();
				TipoCursoConstantesFunciones.setTipoCursoDescripcion(tipocurso,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocurso.setId(null);

				if(!TipoCursoConstantesFunciones.ExisteEnLista(this.tipocursosForeignKey,tipocurso,true)) {

					this.tipocursosForeignKey.add(0,tipocurso);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoInstitucion()throws Exception {
		try {

			if(!this.cursoSessionBean.getisBusquedaDesdeForeignKeySesionTipoInstitucion()) {
				TipoInstitucion tipoinstitucion=new TipoInstitucion();
				TipoInstitucionConstantesFunciones.setTipoInstitucionDescripcion(tipoinstitucion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoinstitucion.setId(null);

				if(!TipoInstitucionConstantesFunciones.ExisteEnLista(this.tipoinstitucionsForeignKey,tipoinstitucion,true)) {

					this.tipoinstitucionsForeignKey.add(0,tipoinstitucion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCurso()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCurso(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCurso()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.curso.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.curso.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCurso();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCurso(Curso curso)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(curso.getid_empleado(),false,"Formulario");
			this.setActualTipoCursoForeignKey(curso.getid_tipo_curso(),false,"Formulario");
			this.setActualTipoInstitucionForeignKey(curso.getid_tipo_institucion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCurso(Curso curso,String sTipoEvento)throws Exception {	
		try {
			
			

				if(curso.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoCurso")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(curso.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCurso()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.cursoConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualTipoCursoForeignKey(this.cursoConstantesFunciones.getid_tipo_curso(),false,"Formulario");
			this.setActualTipoInstitucionForeignKey(this.cursoConstantesFunciones.getid_tipo_institucion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCurso()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCurso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCurso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCurso()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCurso()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameTipoCursosForeignKey("Todos");
			this.cargarCombosFrameTipoInstitucionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCurso(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCursosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoInstitucionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCurso()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso!=null && this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso!=null && this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso!=null && this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso!=null && this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.getItemCount()>0) {
				this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public CursoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CursoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CursoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cursoSessionBean=new CursoSessionBean(); 
		this.cursoConstantesFunciones=new CursoConstantesFunciones(); 
		this.cursoBean=new Curso();//(this.cursoConstantesFunciones); 		
		this.cursoReturnGeneral=new CursoParameterReturnGeneral(); 
		
		this.cursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CursoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CursoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CursoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCurso(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.cursoConstantesFunciones=new CursoConstantesFunciones(); 
			this.cursoBean=new Curso();//this.cursoConstantesFunciones); 			
			this.cursoReturnGeneral=new CursoParameterReturnGeneral(); 
		
			CursoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Curso Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.curso=new Curso();
			this.cursos = new ArrayList<Curso>();
			this.cursosAux = new ArrayList<Curso>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic=new CursoLogic();
				this.cursoLogic.getNewConnexionToDeep("");
			}
			
			//this.cursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCurso);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCurso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCurso);	
					}
					
					if(this.jInternalFrameImportacionCurso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCurso);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCurso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCurso);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCurso!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCurso);
				this.jInternalFrameDetalleFormCurso.setVisible(false);
				this.jInternalFrameDetalleFormCurso.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCurso!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCurso);
					this.jInternalFrameReporteDinamicoCurso.setVisible(false);
					this.jInternalFrameReporteDinamicoCurso.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCurso!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCurso);
					this.jInternalFrameImportacionCurso.setVisible(false);
					this.jInternalFrameImportacionCurso.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCurso!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCurso);
					this.jInternalFrameOrderByCurso.setVisible(false);
					this.jInternalFrameOrderByCurso.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCursoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CursoConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.cursoReturnGeneral=new CursoParameterReturnGeneral();
			
			this.cursoParameterGeneral=new CursoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cursoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(CursoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cursoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleCursoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CursoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cursoSessionBean.getEsGuardarRelacionado(),this.cursoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CursoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cursoSessionBean.getEsGuardarRelacionado(),this.cursoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoCurso=false;
			this.isVisibilidadCeldaDuplicarCurso=true;
			this.isVisibilidadCeldaCopiarCurso=true;
			this.isVisibilidadCeldaVerFormCurso=true;
			this.isVisibilidadCeldaOrdenCurso=true;
			this.isVisibilidadCeldaNuevoRelacionesCurso=false;
			this.isVisibilidadCeldaModificarCurso=false;
			this.isVisibilidadCeldaActualizarCurso=false;
			this.isVisibilidadCeldaEliminarCurso=false;
			this.isVisibilidadCeldaCancelarCurso=false;
			this.isVisibilidadCeldaGuardarCurso=false;
			this.isVisibilidadCeldaGuardarCambiosCurso=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoCurso=true;
			this.isVisibilidadFK_IdTipoInstitucion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCurso();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCurso(false);
			
			this.setPermisosUsuarioCurso();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cursoSessionBean.getEsGuardarRelacionado() 
				|| (this.cursoSessionBean.getEsGuardarRelacionado() && this.cursoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCursoClasesRelacionadas();
			}
			
			if(this.cursoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCursoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CursoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCurso();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCurso();
			}
			
			if(!this.isPermisoBusquedaCurso) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCurso.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cursoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCurso,this.isPermisoPaginacionMedioCurso,this.isPermisoPaginacionTodoCurso);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CursoConstantesFunciones.getTiposSeleccionarCurso());
				
				this.tiposColumnasSelect=CursoConstantesFunciones.getTiposSeleccionarCurso(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCurso();				
				//this.tiposRelacionesSelect=CursoConstantesFunciones.getTiposRelacionesCurso(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCurso();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCurso(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCurso(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCurso() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.detallecursoLogic=new DetalleCursoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.tipocursoLogic=new TipoCursoLogic();
			this.tipoinstitucionLogic=new TipoInstitucionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cursoImplementable= (CursoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CursoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cursoImplementableHome= (CursoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CursoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cursos= new ArrayList<Curso>();
			this.cursosEliminados= new ArrayList<Curso>();
						
			this.isEsNuevoCurso=false;
			this.esParaAccionDesdeFormularioCurso=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.tipocursosForeignKey=new ArrayList<TipoCurso>() ;
			this.tipoinstitucionsForeignKey=new ArrayList<TipoInstitucion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCurso(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCurso();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CursoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CursoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCurso(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCurso!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCurso();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCurso();
			}
			
			CursoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCurso.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCurso.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCurso.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCurso(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Curso: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCurso() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCurso")) {
				iIndex=this.jInternalFrameDetalleFormCurso.jTabbedPaneRelacionesCurso.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCurso.jTabbedPaneRelacionesCurso.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCurso.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Cursos")) {
					if(!DetalleCursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCurso();

						this.cargarParteTabPanelRelacionadaDetalleCurso(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCurso();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleCurso(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCurso.cargarSessionConBeanSwingJInternalFrameDetalleCurso(false,true,iIndex);
		this.jButtonDetalleCursoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleCurso();

		//this.jTabbedPaneRelacionesCurso.updateUI();
		//this.jTabbedPaneRelacionesCurso.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCurso.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleCurso")) {
				int row=this.jTableDatosCurso.getSelectedRow();
				jButtonDetalleCursoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Curso")) {

					if(this.isTienePermisosDetalleCurso && this.cursoConstantesFunciones.mostrarDetalleCursoCurso && !CursoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Cursos"+"("+DetalleCursoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Cursos");

						if(cursoConstantesFunciones.resaltarDetalleCursoCurso!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cursoConstantesFunciones.resaltarDetalleCursoCurso);
						}

						jmenuItem.setEnabled(this.cursoConstantesFunciones.activarDetalleCursoCurso);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleCurso"));

						

						this.jInternalFrameDetalleFormCurso.jmenuDetalleCurso.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCurso(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCurso(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCurso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCursoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCurso();
		
		this.cargarCombosFrameForeignKeyCurso();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCurso();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCurso();
		}
	}
	
	

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCurso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCursoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCurso();
				this.cargarCombosFrameTipoCursosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCurso(this.tipocursosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoInstitucion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoInstitucionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoInstitucion();
				this.cargarCombosFrameTipoInstitucionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoInstitucion(this.tipoinstitucionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCursoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cursoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
			
			if(jTableDatosCurso.getRowCount()>=1) {
				jTableDatosCurso.removeRowSelectionInterval(0, jTableDatosCurso.getRowCount()-1);						
			}
			
			this.isEsNuevoCurso=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCurso(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCurso(true);			
			//this.curso=new Curso();
			//this.curso.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCurso(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCurso() ;
			
			if(CursoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCurso(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.curso);	
			this.actualizarInformacion("INFO_PADRE",false,this.curso);				
			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
			if(this.cursoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Curso: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCursoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCurso.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCurso.getSelectedRows().length;			
			}
			
			cursosSeleccionados=this.getCursosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCurso--;			
				//Curso cursoAux= new Curso();			
				//cursoAux.setId(this.iIdNuevoCurso);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Curso cursoOrigen=new Curso();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Curso cursoOrigen : cursosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCurso.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cursoOrigen =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cursoOrigen =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCurso();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.curso.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCurso(cursoOrigen,this.curso,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cursoLogic.getCursos().add(this.cursoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cursos.add(this.cursoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCurso(false);
				
				this.jTableDatosCurso.setRowSelectionInterval(this.getIndiceNuevoCurso(), this.getIndiceNuevoCurso());
				
				int iLastRow =  this.jTableDatosCurso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCurso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCurso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCurso(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();									
		
			Curso cursoOrigen=new Curso();
			Curso cursoDestino=new Curso();
				
			cursosSeleccionados=this.getCursosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCurso.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cursosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCurso.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cursoOrigen =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cursoOrigen =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cursoDestino =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cursoDestino =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cursoOrigen =cursosSeleccionados.get(0);
				cursoDestino =cursosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCurso(cursoOrigen,cursoDestino,true,false);
				
				cursoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cursoDestino,cursoLogic.getCursos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cursoDestino,cursos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCurso(false);
				
				//this.jTableDatosCurso.setRowSelectionInterval(this.getIndiceNuevoCurso(), this.getIndiceNuevoCurso());
				
				int iLastRow =  this.jTableDatosCurso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCurso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCurso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCurso(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCurso.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCurso.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCurso.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCurso.setVisible(!isVisible);
			this.jPanelPaginacionCurso.setVisible(!isVisible);
			this.jPanelAccionesCurso.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCurso();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCurso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCurso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCurso();
			
			this.abrirFrameOrderByCurso();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCurso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCurso(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCurso);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCurso.isMaximum()) {
					this.jInternalFrameDetalleFormCurso.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCurso.setSize(this.jInternalFrameDetalleFormCurso.iWidthFormulario,this.jInternalFrameDetalleFormCurso.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCurso.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCurso.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCurso.isMaximum()) {
						this.jInternalFrameDetalleFormCurso.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCurso.jContentPaneDetalleCurso.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCurso.jTabbedPaneRelacionesCurso.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCurso.jContentPaneDetalleCurso.getWidth(),CursoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCurso.jTabbedPaneRelacionesCurso.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCurso.jContentPaneDetalleCurso.getWidth(),CursoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCurso.jTabbedPaneRelacionesCurso.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCurso.jContentPaneDetalleCurso.getWidth(),CursoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleCursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleCurso();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCurso.setVisible(true);
	        this.jInternalFrameDetalleFormCurso.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCurso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCurso==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCurso,false,this);
				} else {
					this.jInternalFrameOrderByCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCurso,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCurso);
				this.jInternalFrameOrderByCurso.setVisible(false);
				this.jInternalFrameOrderByCurso.setSelected(false);
				
				this.jInternalFrameOrderByCurso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCurso"));
				
				this.inicializarActualizarBindingTablaOrderByCurso();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCurso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCurso==null) {
				
				this.jInternalFrameImportacionCurso=new ImportacionJInternalFrame(CursoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCurso);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCurso);
				this.jInternalFrameImportacionCurso.setVisible(false);
				this.jInternalFrameImportacionCurso.setSelected(false);


				this.jInternalFrameImportacionCurso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCurso"));
				this.jInternalFrameImportacionCurso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCurso"));
				this.jInternalFrameImportacionCurso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCurso"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCurso() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCurso==null) {
				this.jInternalFrameReporteDinamicoCurso=new ReporteDinamicoJInternalFrame(CursoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCurso);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCurso);
				this.jInternalFrameReporteDinamicoCurso.setVisible(false);
				this.jInternalFrameReporteDinamicoCurso.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCurso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCurso"));
				this.jInternalFrameReporteDinamicoCurso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCurso"));
				this.jInternalFrameReporteDinamicoCurso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCurso"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCurso();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleCurso() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.jScrollPanelDatosDetalleCurso.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCurso.jContentPaneDetalleCurso.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.jScrollPanelDatosDetalleCurso.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.jScrollPanelDatosDetalleCurso.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.jScrollPanelDatosDetalleCurso.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCurso() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCurso);
			
	       	this.jInternalFrameDetalleFormCurso.setVisible(false);
	        this.jInternalFrameDetalleFormCurso.setSelected(false);
			
			//this.jInternalFrameDetalleFormCurso.dispose();
			//this.jInternalFrameDetalleFormCurso=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCurso() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCurso.setVisible(true);
	        this.jInternalFrameReporteDinamicoCurso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCurso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCurso.setVisible(true);
	        this.jInternalFrameImportacionCurso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCurso() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCurso.setVisible(true);
	        this.jInternalFrameOrderByCurso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCurso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCurso.setVisible(false);
	        this.jInternalFrameOrderByCurso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCurso() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCurso.setVisible(false);
	        this.jInternalFrameReporteDinamicoCurso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCurso() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCurso.setVisible(false);
	        this.jInternalFrameImportacionCurso.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCurso(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCurso(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCurso.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCurso(true);
			//this.isEsNuevoCurso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCurso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCurso(false) ;
			
			if(cursoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoSessionBean.getEsGuardarRelacionado() && DetalleCursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleCursoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CursoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCurso(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCurso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCursoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCurso(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCurso.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCurso(true);
			//this.isEsNuevoCurso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.curso.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCurso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCurso(false) ;
			
			if(CursoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCurso(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCurso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.cursoConstantesFunciones.cargarid_empleadoCurso) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCurso(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCurso.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoCurso(List<TipoCurso> tipocursosForeignKey)throws Exception{
		TableColumn tableColumnTipoCurso=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_IDTIPOCURSO));
		TableCellEditor tableCellEditorTipoCurso =tableColumnTipoCurso.getCellEditor();

		TipoCursoTableCell tipocursoTableCellFk=(TipoCursoTableCell)tableCellEditorTipoCurso;

		if(tipocursoTableCellFk!=null) {
			tipocursoTableCellFk.settipocursosForeignKey(tipocursosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCurso.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocursoTableCellFk.setRowActual(intSelectedRow);
			//tipocursoTableCellFk.settipocursosForeignKeyActual(tipocursosForeignKey);
		//}


		if(tipocursoTableCellFk!=null) {
			tipocursoTableCellFk.RecargarTipoCursosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoInstitucion(List<TipoInstitucion> tipoinstitucionsForeignKey)throws Exception{
		TableColumn tableColumnTipoInstitucion=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION));
		TableCellEditor tableCellEditorTipoInstitucion =tableColumnTipoInstitucion.getCellEditor();

		TipoInstitucionTableCell tipoinstitucionTableCellFk=(TipoInstitucionTableCell)tableCellEditorTipoInstitucion;

		if(tipoinstitucionTableCellFk!=null) {
			tipoinstitucionTableCellFk.settipoinstitucionsForeignKey(tipoinstitucionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCurso.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoinstitucionTableCellFk.setRowActual(intSelectedRow);
			//tipoinstitucionTableCellFk.settipoinstitucionsForeignKeyActual(tipoinstitucionsForeignKey);
		//}


		if(tipoinstitucionTableCellFk!=null) {
			tipoinstitucionTableCellFk.RecargarTipoInstitucionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCursoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCurso(false);
			
			//if(!this.isEsNuevoCurso) {								
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				
			}
			
			if(this.permiteMantenimiento(this.curso)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cursoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCurso=true;
					this.inicializarActualizarBindingTablaCurso(false);
					this.isEsNuevoCurso=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCurso=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCurso=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCurso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCurso(false);
				
				this.habilitarDeshabilitarControlesCurso(false);
			
												
				
				if(CursoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCurso();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCursoActionPerformed(evt,cursoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCurso(this.curso,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCurso.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cursoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.curso.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Curso.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Curso.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCursoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCurso.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				this.curso.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				this.curso.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.curso)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cursoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CursoModel) this.jTableDatosCurso.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCurso=true;
				this.inicializarActualizarBindingTablaCurso(false);
				this.isEsNuevoCurso=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCurso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCurso(false);
				
				this.habilitarDeshabilitarControlesCurso(false);
				
				
				
				if(CursoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCurso();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCursoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCurso.getRowCount()>=1) {
				jTableDatosCurso.removeRowSelectionInterval(0, jTableDatosCurso.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCurso(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCurso(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCurso(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCurso(false) ;
			
			this.isEsNuevoCurso=false;
			
			if(CursoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCurso();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCurso(false);
				
				//SI ES MANUAL
				if(CursoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCurso();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCurso--;			
			//Curso cursoAux= new Curso();			
			//cursoAux.setId(this.iIdNuevoCurso);
			
			if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCurso();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
			
			this.curso.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cursoLogic.getCursos().add(this.cursoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cursos.add(this.cursoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCurso(false);
			
			this.jTableDatosCurso.setRowSelectionInterval(this.getIndiceNuevoCurso(), this.getIndiceNuevoCurso());
			
			int iLastRow =  this.jTableDatosCurso.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCurso.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCurso.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCurso(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCurso(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCurso(false);
			
			//SI ES MANUAL
			if(CursoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCurso();
			}
			
			//this.abrirFrameTreeCurso();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCursoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE CursoS ?", "MANTENIMIENTO DE Curso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCurso.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCurso();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cursoReturnGeneral=cursoLogic.procesarImportacionCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cursoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCursoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCursoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCurso.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCurso.setFileImportacion(this.jInternalFrameImportacionCurso.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCurso.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCurso.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCurso.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCurso.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCursoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();		

		cursosSeleccionados=this.getCursosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCurso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCurso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CursoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CursoBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteCursos("Todos",cursosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Curso",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoCurso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCurso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CursoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CursoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CursoConstantesFunciones.LABEL_IDTIPOCURSO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCurso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCurso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCurso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCurso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoInstitucion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoInstitucion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoInstitucion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoInstitucion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CursoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoInscripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoInscripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoInscripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoInscripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CursoConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CursoConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CursoConstantesFunciones.LABEL_NUMEROHORAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroHoras_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroHoras_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroHoras_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroHoras_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CursoConstantesFunciones.LABEL_ESAPROBADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Aprobado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Aprobado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Aprobado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Aprobado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AuspicioEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AuspicioEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AuspicioEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AuspicioEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CursoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoCurso.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCurso.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCurso.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CursoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CursoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case CursoConstantesFunciones.LABEL_IDTIPOCURSO:
					sNombreCampoCategoria="id_tipo_curso";
					break;

				case CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION:
					sNombreCampoCategoria="id_tipo_institucion";
					break;

				case CursoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION:
					sNombreCampoCategoria="codigo_inscripcion";
					break;

				case CursoConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case CursoConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case CursoConstantesFunciones.LABEL_NUMEROHORAS:
					sNombreCampoCategoria="numero_horas";
					break;

				case CursoConstantesFunciones.LABEL_ESAPROBADO:
					sNombreCampoCategoria="es_aprobado";
					break;

				case CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA:
					sNombreCampoCategoria="es_auspicio_empresa";
					break;

				case CursoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCurso.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CursoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CursoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case CursoConstantesFunciones.LABEL_IDTIPOCURSO:
					sNombreCampoCategoriaValor="id_tipo_curso";
					break;

				case CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION:
					sNombreCampoCategoriaValor="id_tipo_institucion";
					break;

				case CursoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION:
					sNombreCampoCategoriaValor="codigo_inscripcion";
					break;

				case CursoConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case CursoConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case CursoConstantesFunciones.LABEL_NUMEROHORAS:
					sNombreCampoCategoriaValor="numero_horas";
					break;

				case CursoConstantesFunciones.LABEL_ESAPROBADO:
					sNombreCampoCategoriaValor="es_aprobado";
					break;

				case CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA:
					sNombreCampoCategoriaValor="es_auspicio_empresa";
					break;

				case CursoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCurso.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCurso.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CursoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CursoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case CursoConstantesFunciones.LABEL_IDTIPOCURSO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Curso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_curso");
					break;

				case CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Institucion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_institucion");
					break;

				case CursoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Inscripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_inscripcion");
					break;

				case CursoConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case CursoConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case CursoConstantesFunciones.LABEL_NUMEROHORAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Horas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_horas");
					break;

				case CursoConstantesFunciones.LABEL_ESAPROBADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Aprobado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_aprobado");
					break;

				case CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Auspicio Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_auspicio_empresa");
					break;

				case CursoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoCursoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();		
		
		cursosSeleccionados=this.getCursosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"curso";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("Cursos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCurso.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCurso.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CursoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CursoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CursoConstantesFunciones.LABEL_IDTIPOCURSO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_IDTIPOCURSO);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.gettipocurso_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.gettipoinstitucion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CursoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.getcodigo_inscripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CursoConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CursoConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CursoConstantesFunciones.LABEL_NUMEROHORAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_NUMEROHORAS);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.getnumero_horas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CursoConstantesFunciones.LABEL_ESAPROBADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_ESAPROBADO);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.getes_aprobado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.getes_auspicio_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CursoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CursoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Curso curso:cursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(curso.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelCurso(row);				
			//	iRow++;
			//}				
			
			//for(Curso cursoAux:cursosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCurso(cursoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Curso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCurso(false);
			
			//SI ES MANUAL
			if(CursoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCurso();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCurso(false);
			
			//SI ES MANUAL
			if(CursoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCurso();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCurso(false);
			
			//SI ES MANUAL
			if(CursoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCurso();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCurso() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCurso.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCurso.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCurso.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCurso.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCurso.setMinimumSize(dimensionMinimum);
		this.jTableDatosCurso.setMaximumSize(dimensionMaximum);
		this.jTableDatosCurso.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCurso(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCurso(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCurso(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCurso(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCurso(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCurso(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCurso(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCurso(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CursoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CursoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCurso() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCurso();
		
		this.inicializarActualizarBindingBotonesManualCurso(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCurso();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCurso() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCurso(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCurso(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCurso.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCurso.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCurso.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCurso!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCurso.jCheckBoxPostAccionNuevoCurso.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCurso.jCheckBoxPostAccionSinCerrarCurso.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCurso.jCheckBoxPostAccionSinMensajeCurso.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCurso.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCurso.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCurso.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCurso!=null) {
				this.jInternalFrameDetalleFormCurso.jCheckBoxPostAccionNuevoCurso.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCurso.jCheckBoxPostAccionSinCerrarCurso.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCurso.jCheckBoxPostAccionSinMensajeCurso.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCurso.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCurso.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCurso!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCurso.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCurso!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCurso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCurso.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCurso.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCurso.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCurso.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCurso!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCurso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCurso.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCurso.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCurso(Boolean esInicializar) throws Exception {
		try	{	
			if(CursoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCurso(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCurso() throws Exception {
		try	{
			if(CursoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCurso();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCurso() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCurso() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCurso.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCurso.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCurso.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCurso.addItem(reporte);
			}
			
			
			if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCurso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCurso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCurso.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCurso.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCurso.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCurso.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCurso();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCurso() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCurso!=null) {
				this.jInternalFrameReporteDinamicoCurso.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCurso.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCurso!=null) {
				this.jInternalFrameReporteDinamicoCurso.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCurso.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCurso!=null) {
				
				if(this.jInternalFrameReporteDinamicoCurso.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCurso.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCurso.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCurso.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCurso.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCurso.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCurso()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoCurso.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoCurso.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.getSelectedItem()!=null){this.id_tipo_cursoFK_IdTipoCurso=((TipoCurso)this.jComboBoxid_tipo_cursoFK_IdTipoCursoCurso.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.getSelectedItem()!=null){this.id_tipo_institucionFK_IdTipoInstitucion=((TipoInstitucion)this.jComboBoxid_tipo_institucionFK_IdTipoInstitucionCurso.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCurso(Boolean esInicializar) throws Exception {				
		if(CursoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCurso();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCurso() throws Exception {
		this.inicializarActualizarBindingTablaCurso(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCurso() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCurso.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCurso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCurso.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCurso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCurso.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCursoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCursoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCurso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCurso.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCurso.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCurso(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cursoLogic.getCursos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cursos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCurso.setModel(new CursoModel(this.cursoLogic.getCursos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCurso.setModel(new CursoModel(this.cursos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCurso!=null && this.jInternalFrameOrderByCurso.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCurso();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CursoConstantesFunciones.SCLASSWEBTITULO,cursoConstantesFunciones.resaltarSeleccionarCurso,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CursoConstantesFunciones.SCLASSWEBTITULO,cursoConstantesFunciones.resaltarSeleccionarCurso,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_ID));

		if(this.cursoConstantesFunciones.mostraridCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cursoConstantesFunciones.resaltaridCurso,this.cursoConstantesFunciones.activaridCurso,this,true,"idCurso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cursoConstantesFunciones.resaltaridCurso,this.cursoConstantesFunciones.activaridCurso,this,true,"idCurso","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cursoConstantesFunciones.mostrarid_empresaCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cursoConstantesFunciones.resaltarid_empresaCurso,this,this.cursoConstantesFunciones.activarid_empresaCurso));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cursoConstantesFunciones.resaltarid_empresaCurso,this,this.cursoConstantesFunciones.activarid_empresaCurso,false,"id_empresaCurso","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.cursoConstantesFunciones.mostrarid_empleadoCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.cursoConstantesFunciones.resaltarid_empleadoCurso,this,this.cursoConstantesFunciones.activarid_empleadoCurso));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.cursoConstantesFunciones.resaltarid_empleadoCurso,this,this.cursoConstantesFunciones.activarid_empleadoCurso,true,"id_empleadoCurso","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_IDTIPOCURSO));

		if(this.cursoConstantesFunciones.mostrarid_tipo_cursoCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_IDTIPOCURSO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCursoTableCell(this.tipocursosForeignKey,this.cursoConstantesFunciones.resaltarid_tipo_cursoCurso,this,this.cursoConstantesFunciones.activarid_tipo_cursoCurso));
			tableColumn.setCellEditor(new TipoCursoTableCell(this.tipocursosForeignKey,this.cursoConstantesFunciones.resaltarid_tipo_cursoCurso,this,this.cursoConstantesFunciones.activarid_tipo_cursoCurso,true,"id_tipo_cursoCurso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION));

		if(this.cursoConstantesFunciones.mostrarid_tipo_institucionCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoInstitucionTableCell(this.tipoinstitucionsForeignKey,this.cursoConstantesFunciones.resaltarid_tipo_institucionCurso,this,this.cursoConstantesFunciones.activarid_tipo_institucionCurso));
			tableColumn.setCellEditor(new TipoInstitucionTableCell(this.tipoinstitucionsForeignKey,this.cursoConstantesFunciones.resaltarid_tipo_institucionCurso,this,this.cursoConstantesFunciones.activarid_tipo_institucionCurso,true,"id_tipo_institucionCurso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_NOMBRE));

		if(this.cursoConstantesFunciones.mostrarnombreCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cursoConstantesFunciones.resaltarnombreCurso,this.cursoConstantesFunciones.activarnombreCurso,this,true,"nombreCurso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cursoConstantesFunciones.resaltarnombreCurso,this.cursoConstantesFunciones.activarnombreCurso,this,true,"nombreCurso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION));

		if(this.cursoConstantesFunciones.mostrarcodigo_inscripcionCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cursoConstantesFunciones.resaltarcodigo_inscripcionCurso,this.cursoConstantesFunciones.activarcodigo_inscripcionCurso,this,true,"codigo_inscripcionCurso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cursoConstantesFunciones.resaltarcodigo_inscripcionCurso,this.cursoConstantesFunciones.activarcodigo_inscripcionCurso,this,true,"codigo_inscripcionCurso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_FECHAINICIO));

		if(this.cursoConstantesFunciones.mostrarfecha_inicioCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cursoConstantesFunciones.resaltarfecha_inicioCurso,this.cursoConstantesFunciones.activarfecha_inicioCurso,this,true,"fecha_inicioCurso","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cursoConstantesFunciones.resaltarfecha_inicioCurso,this.cursoConstantesFunciones.activarfecha_inicioCurso,this,true,"fecha_inicioCurso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_FECHAFIN));

		if(this.cursoConstantesFunciones.mostrarfecha_finCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cursoConstantesFunciones.resaltarfecha_finCurso,this.cursoConstantesFunciones.activarfecha_finCurso,this,true,"fecha_finCurso","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cursoConstantesFunciones.resaltarfecha_finCurso,this.cursoConstantesFunciones.activarfecha_finCurso,this,true,"fecha_finCurso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_NUMEROHORAS));

		if(this.cursoConstantesFunciones.mostrarnumero_horasCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_NUMEROHORAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cursoConstantesFunciones.resaltarnumero_horasCurso,this.cursoConstantesFunciones.activarnumero_horasCurso,this,true,"numero_horasCurso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cursoConstantesFunciones.resaltarnumero_horasCurso,this.cursoConstantesFunciones.activarnumero_horasCurso,this,true,"numero_horasCurso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_ESAPROBADO));

		if(this.cursoConstantesFunciones.mostrares_aprobadoCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_ESAPROBADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cursoConstantesFunciones.resaltares_aprobadoCurso,this.cursoConstantesFunciones.activares_aprobadoCurso));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cursoConstantesFunciones.resaltares_aprobadoCurso,this.cursoConstantesFunciones.activares_aprobadoCurso,this,true,"es_aprobadoCurso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA));

		if(this.cursoConstantesFunciones.mostrares_auspicio_empresaCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cursoConstantesFunciones.resaltares_auspicio_empresaCurso,this.cursoConstantesFunciones.activares_auspicio_empresaCurso));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cursoConstantesFunciones.resaltares_auspicio_empresaCurso,this.cursoConstantesFunciones.activares_auspicio_empresaCurso,this,true,"es_auspicio_empresaCurso","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCurso,CursoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.cursoConstantesFunciones.mostrardescripcionCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CursoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cursoConstantesFunciones.resaltardescripcionCurso,this.cursoConstantesFunciones.activardescripcionCurso,this,true,"descripcionCurso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cursoConstantesFunciones.resaltardescripcionCurso,this.cursoConstantesFunciones.activardescripcionCurso,this,true,"descripcionCurso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cursoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleCurso && this.cursoConstantesFunciones.mostrarDetalleCursoCurso && !CursoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Cursos");
				tableColumn.setHeaderValue("Detalle Cursos");
				tableColumn.setCellRenderer(new DetalleCursoTableCell(cursoConstantesFunciones.resaltarDetalleCursoCurso,this,this.cursoConstantesFunciones.activarDetalleCursoCurso));
				tableColumn.setCellEditor(new DetalleCursoTableCell(cursoConstantesFunciones.resaltarDetalleCursoCurso,this,this.cursoConstantesFunciones.activarDetalleCursoCurso));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCurso.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cursoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cursoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCurso.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cursoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cursoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCurso.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCurso && this.isPermisoGuardarCambiosCurso) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cursoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cursoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCurso.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.cursoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosCurso.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosCurso.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCurso && this.isPermisoGuardarCambiosCurso) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cursoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCurso && this.isPermisoGuardarCambiosCurso) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCurso.moveColumn(this.jTableDatosCurso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCurso.moveColumn(this.jTableDatosCurso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cursoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCurso.moveColumn(this.jTableDatosCurso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCurso.moveColumn(this.jTableDatosCurso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCurso.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCurso.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCurso,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCurso.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCurso.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCurso.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCurso.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCurso.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=cursoLogic.getCursos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cursos.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosCurso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCurso();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoCurso=false;
					
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
				if(this.cursoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCurso==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCurso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCurso.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.curso.getsType().equals("DUPLICADO")
				   || this.curso.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCurso=true;
				
				} else {
					this.isEsNuevoCurso=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cursoSessionBean.getEsGuardarRelacionado()) {
					if(this.curso.getId()>=0 && !this.curso.getIsNew()) {						
						this.isEsNuevoCurso=false;
						
					} else {
						this.isEsNuevoCurso=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCurso(esRelaciones);						
				
				this.seleccionarCurso(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.curso.getId()<0) {
					this.isEsNuevoCurso=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCurso(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCurso(evt,rowIndex);
				}	
				
				if(this.cursoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Curso: " + this.dDif); 
					}
				}								
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCurso(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.curso)) {
					if(this.curso.getId()>0) {
						this.curso.setIsDeleted(true);
						
						this.cursosEliminados.add(this.curso);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cursoLogic.getCursos().remove(this.curso);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cursos.remove(this.curso);				
					}
					
					
					((CursoModel) this.jTableDatosCurso.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCurso(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCurso(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCurso) {
			
			if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCurso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCurso.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCurso(this.curso);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cursoConstantesFunciones.cargarid_empresaCurso || this.cursoConstantesFunciones.event_dependid_empresaCurso) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.curso.getid_empresa());
									//this.inicializarActualizarBindingCurso(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(curso.getEmpresa()!=null) {
							this.empresasForeignKey.add(curso.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.curso.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.cursoConstantesFunciones.cargarid_empleadoCurso || this.cursoConstantesFunciones.event_dependid_empleadoCurso) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.curso.getid_empleado());
									//this.inicializarActualizarBindingCurso(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(curso.getEmpleado()!=null) {
							this.empleadosForeignKey.add(curso.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.curso.getid_empleado(),false,"Formulario");

					//TipoCurso
					if(!this.cursoConstantesFunciones.cargarid_tipo_cursoCurso || this.cursoConstantesFunciones.event_dependid_tipo_cursoCurso) {
						//this.cargarCombosTipoCursosForeignKeyLista(" where id="+this.curso.getid_tipo_curso());
									//this.inicializarActualizarBindingCurso(false,false);
						this.tipocursosForeignKey=new ArrayList<TipoCurso>();

						if(curso.getTipoCurso()!=null) {
							this.tipocursosForeignKey.add(curso.getTipoCurso());
						}

						this.addItemDefectoCombosForeignKeyTipoCurso();
						this.cargarCombosFrameTipoCursosForeignKey("Todos");
					}
					this.setActualTipoCursoForeignKey(this.curso.getid_tipo_curso(),false,"Formulario");

					//TipoInstitucion
					if(!this.cursoConstantesFunciones.cargarid_tipo_institucionCurso || this.cursoConstantesFunciones.event_dependid_tipo_institucionCurso) {
						//this.cargarCombosTipoInstitucionsForeignKeyLista(" where id="+this.curso.getid_tipo_institucion());
									//this.inicializarActualizarBindingCurso(false,false);
						this.tipoinstitucionsForeignKey=new ArrayList<TipoInstitucion>();

						if(curso.getTipoInstitucion()!=null) {
							this.tipoinstitucionsForeignKey.add(curso.getTipoInstitucion());
						}

						this.addItemDefectoCombosForeignKeyTipoInstitucion();
						this.cargarCombosFrameTipoInstitucionsForeignKey("Todos");
					}
					this.setActualTipoInstitucionForeignKey(this.curso.getid_tipo_institucion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCurso("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCurso(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCurso() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCurso(Curso curso) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCurso(curso,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCurso(Curso curso,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCurso(curso);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCurso(curso,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCurso(curso);
	}
	
	public void setVariablesObjetoActualToFormularioCurso(Curso curso) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCurso.jLabelidCurso.setText(curso.getId().toString());
			this.jInternalFrameDetalleFormCurso.jTextAreanombreCurso.setText(curso.getnombre());
			this.jInternalFrameDetalleFormCurso.jTextFieldcodigo_inscripcionCurso.setText(curso.getcodigo_inscripcion());
			this.jInternalFrameDetalleFormCurso.jDateChooserfecha_inicioCurso.setDate(curso.getfecha_inicio());
			this.jInternalFrameDetalleFormCurso.jDateChooserfecha_finCurso.setDate(curso.getfecha_fin());
			this.jInternalFrameDetalleFormCurso.jTextFieldnumero_horasCurso.setText(curso.getnumero_horas().toString());
			this.jInternalFrameDetalleFormCurso.jCheckBoxes_aprobadoCurso.setSelected(curso.getes_aprobado());
			this.jInternalFrameDetalleFormCurso.jCheckBoxes_auspicio_empresaCurso.setSelected(curso.getes_auspicio_empresa());
			this.jInternalFrameDetalleFormCurso.jTextAreadescripcionCurso.setText(curso.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Curso cursoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cursoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Curso cursoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cursoLocal=this.curso;
			} else {
				cursoLocal=this.cursoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cursoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCurso(cursoLocal,true);
					
					if(cursoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cursoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cursoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cursoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCurso(Curso curso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCurso(curso,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCurso(curso);
	}
	
	public void setVariablesFormularioToObjetoActualCurso(Curso curso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCurso(curso,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCurso(Curso curso,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCurso.jLabelidCurso.getText()==null || this.jInternalFrameDetalleFormCurso.jLabelidCurso.getText()=="" || this.jInternalFrameDetalleFormCurso.jLabelidCurso.getText()=="Id") {
				this.jInternalFrameDetalleFormCurso.jLabelidCurso.setText("0");
			}

			if(conColumnasBase) {curso.setId(Long.parseLong(this.jInternalFrameDetalleFormCurso.jLabelidCurso.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CursoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelIdCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			curso.setnombre(this.jInternalFrameDetalleFormCurso.jTextAreanombreCurso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CursoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelnombreCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			curso.setcodigo_inscripcion(this.jInternalFrameDetalleFormCurso.jTextFieldcodigo_inscripcionCurso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelcodigo_inscripcionCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			curso.setfecha_inicio(this.jInternalFrameDetalleFormCurso.jDateChooserfecha_inicioCurso.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CursoConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelfecha_inicioCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			curso.setfecha_fin(this.jInternalFrameDetalleFormCurso.jDateChooserfecha_finCurso.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CursoConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelfecha_finCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			curso.setnumero_horas(Integer.parseInt(this.jInternalFrameDetalleFormCurso.jTextFieldnumero_horasCurso.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CursoConstantesFunciones.LABEL_NUMEROHORAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabelnumero_horasCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			curso.setes_aprobado(this.jInternalFrameDetalleFormCurso.jCheckBoxes_aprobadoCurso.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CursoConstantesFunciones.LABEL_ESAPROBADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabeles_aprobadoCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			curso.setes_auspicio_empresa(this.jInternalFrameDetalleFormCurso.jCheckBoxes_auspicio_empresaCurso.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabeles_auspicio_empresaCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			curso.setdescripcion(this.jInternalFrameDetalleFormCurso.jTextAreadescripcionCurso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CursoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCurso.jLabeldescripcionCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCurso(Curso cursoBean,Curso curso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cursoBean.getid_empleado()!=null && !cursoBean.getid_empleado().equals(-1L))) {curso.setid_empleado(cursoBean.getid_empleado());}
			if(conDefault || (!conDefault && cursoBean.getid_tipo_curso()!=null && !cursoBean.getid_tipo_curso().equals(-1L))) {curso.setid_tipo_curso(cursoBean.getid_tipo_curso());}
			if(conDefault || (!conDefault && cursoBean.getid_tipo_institucion()!=null && !cursoBean.getid_tipo_institucion().equals(-1L))) {curso.setid_tipo_institucion(cursoBean.getid_tipo_institucion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCurso(Curso cursoOrigen,Curso curso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cursoOrigen.getId()!=null && !cursoOrigen.getId().equals(0L))) {curso.setId(cursoOrigen.getId());}}
			if(conDefault || (!conDefault && cursoOrigen.getid_empleado()!=null && !cursoOrigen.getid_empleado().equals(-1L))) {curso.setid_empleado(cursoOrigen.getid_empleado());}
			if(conDefault || (!conDefault && cursoOrigen.getid_tipo_curso()!=null && !cursoOrigen.getid_tipo_curso().equals(-1L))) {curso.setid_tipo_curso(cursoOrigen.getid_tipo_curso());}
			if(conDefault || (!conDefault && cursoOrigen.getid_tipo_institucion()!=null && !cursoOrigen.getid_tipo_institucion().equals(-1L))) {curso.setid_tipo_institucion(cursoOrigen.getid_tipo_institucion());}
			if(conDefault || (!conDefault && cursoOrigen.getnombre()!=null && !cursoOrigen.getnombre().equals(""))) {curso.setnombre(cursoOrigen.getnombre());}
			if(conDefault || (!conDefault && cursoOrigen.getcodigo_inscripcion()!=null && !cursoOrigen.getcodigo_inscripcion().equals(""))) {curso.setcodigo_inscripcion(cursoOrigen.getcodigo_inscripcion());}
			if(conDefault || (!conDefault && cursoOrigen.getfecha_inicio()!=null && !cursoOrigen.getfecha_inicio().equals(new Date()))) {curso.setfecha_inicio(cursoOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && cursoOrigen.getfecha_fin()!=null && !cursoOrigen.getfecha_fin().equals(new Date()))) {curso.setfecha_fin(cursoOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && cursoOrigen.getnumero_horas()!=null && !cursoOrigen.getnumero_horas().equals(0))) {curso.setnumero_horas(cursoOrigen.getnumero_horas());}
			if(conDefault || (!conDefault && cursoOrigen.getes_aprobado()!=null && !cursoOrigen.getes_aprobado().equals(false))) {curso.setes_aprobado(cursoOrigen.getes_aprobado());}
			if(conDefault || (!conDefault && cursoOrigen.getes_auspicio_empresa()!=null && !cursoOrigen.getes_auspicio_empresa().equals(false))) {curso.setes_auspicio_empresa(cursoOrigen.getes_auspicio_empresa());}
			if(conDefault || (!conDefault && cursoOrigen.getdescripcion()!=null && !cursoOrigen.getdescripcion().equals(""))) {curso.setdescripcion(cursoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCurso(Curso curso) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCurso.jLabelidCurso.setText(curso.getId().toString());
			this.jInternalFrameDetalleFormCurso.jTextAreanombreCurso.setText(curso.getnombre());
			this.jInternalFrameDetalleFormCurso.jTextFieldcodigo_inscripcionCurso.setText(curso.getcodigo_inscripcion());
			this.jInternalFrameDetalleFormCurso.jDateChooserfecha_inicioCurso.setDate(curso.getfecha_inicio());
			this.jInternalFrameDetalleFormCurso.jDateChooserfecha_finCurso.setDate(curso.getfecha_fin());
			this.jInternalFrameDetalleFormCurso.jTextFieldnumero_horasCurso.setText(curso.getnumero_horas().toString());
			this.jInternalFrameDetalleFormCurso.jCheckBoxes_aprobadoCurso.setSelected(curso.getes_aprobado());
			this.jInternalFrameDetalleFormCurso.jCheckBoxes_auspicio_empresaCurso.setSelected(curso.getes_auspicio_empresa());
			this.jInternalFrameDetalleFormCurso.jTextAreadescripcionCurso.setText(curso.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCurso(CursoBean cursoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCurso.jLabelidCurso.setText(cursoBean.getId().toString());
			this.jInternalFrameDetalleFormCurso.jTextAreanombreCurso.setText(cursoBean.getnombre());
			this.jInternalFrameDetalleFormCurso.jTextFieldcodigo_inscripcionCurso.setText(cursoBean.getcodigo_inscripcion());
			this.jInternalFrameDetalleFormCurso.jDateChooserfecha_inicioCurso.setDate(cursoBean.getfecha_inicio());
			this.jInternalFrameDetalleFormCurso.jDateChooserfecha_finCurso.setDate(cursoBean.getfecha_fin());
			this.jInternalFrameDetalleFormCurso.jTextFieldnumero_horasCurso.setText(cursoBean.getnumero_horas().toString());
			this.jInternalFrameDetalleFormCurso.jCheckBoxes_aprobadoCurso.setSelected(cursoBean.getes_aprobado());
			this.jInternalFrameDetalleFormCurso.jCheckBoxes_auspicio_empresaCurso.setSelected(cursoBean.getes_auspicio_empresa());
			this.jInternalFrameDetalleFormCurso.jTextAreadescripcionCurso.setText(cursoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCurso(CursoParameterReturnGeneral cursoReturnGeneral,CursoBean cursoBean,Boolean conDefault) throws Exception { 
		try {
			Curso cursoLocal=new Curso();
			
			cursoLocal=cursoReturnGeneral.getCurso();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cursoLocal.getId()!=null && !cursoLocal.getId().equals(0L))) {cursoBean.setId(cursoLocal.getId());}}
			if(conDefault || (!conDefault && cursoLocal.getid_empleado()!=null && !cursoLocal.getid_empleado().equals(-1L))) {cursoBean.setid_empleado(cursoLocal.getid_empleado());}
			if(conDefault || (!conDefault && cursoLocal.getid_tipo_curso()!=null && !cursoLocal.getid_tipo_curso().equals(-1L))) {cursoBean.setid_tipo_curso(cursoLocal.getid_tipo_curso());}
			if(conDefault || (!conDefault && cursoLocal.getid_tipo_institucion()!=null && !cursoLocal.getid_tipo_institucion().equals(-1L))) {cursoBean.setid_tipo_institucion(cursoLocal.getid_tipo_institucion());}
			if(conDefault || (!conDefault && cursoLocal.getnombre()!=null && !cursoLocal.getnombre().equals(""))) {cursoBean.setnombre(cursoLocal.getnombre());}
			if(conDefault || (!conDefault && cursoLocal.getcodigo_inscripcion()!=null && !cursoLocal.getcodigo_inscripcion().equals(""))) {cursoBean.setcodigo_inscripcion(cursoLocal.getcodigo_inscripcion());}
			if(conDefault || (!conDefault && cursoLocal.getfecha_inicio()!=null && !cursoLocal.getfecha_inicio().equals(new Date()))) {cursoBean.setfecha_inicio(cursoLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && cursoLocal.getfecha_fin()!=null && !cursoLocal.getfecha_fin().equals(new Date()))) {cursoBean.setfecha_fin(cursoLocal.getfecha_fin());}
			if(conDefault || (!conDefault && cursoLocal.getnumero_horas()!=null && !cursoLocal.getnumero_horas().equals(0))) {cursoBean.setnumero_horas(cursoLocal.getnumero_horas());}
			if(conDefault || (!conDefault && cursoLocal.getes_aprobado()!=null && !cursoLocal.getes_aprobado().equals(false))) {cursoBean.setes_aprobado(cursoLocal.getes_aprobado());}
			if(conDefault || (!conDefault && cursoLocal.getes_auspicio_empresa()!=null && !cursoLocal.getes_auspicio_empresa().equals(false))) {cursoBean.setes_auspicio_empresa(cursoLocal.getes_auspicio_empresa());}
			if(conDefault || (!conDefault && cursoLocal.getdescripcion()!=null && !cursoLocal.getdescripcion().equals(""))) {cursoBean.setdescripcion(cursoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCursoGenerico(Long idCursoSeleccionado,JComboBox jComboBoxCurso,List<Curso> cursosLocal)throws Exception {
		try {
			Curso  cursoTemp=null;

			for(Curso cursoAux:cursosLocal) {
				if(cursoAux.getId()!=null && cursoAux.getId().equals(idCursoSeleccionado)) {
					cursoTemp=cursoAux;
					break;
				}
			}

			jComboBoxCurso.setSelectedItem(cursoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCursoGenerico(JComboBox jComboBoxCurso,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCurso.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCurso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCurso.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCurso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("DetalleCurso")) {
			jButtonDetalleCursoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			curso=(Curso) cursoLogic.getCursos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			curso =(Curso) cursos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!curso.getIsNew() && !curso.getIsChanged() && !curso.getIsDeleted()) {
				sDescripcion=curso.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=curso.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!curso.getIsNew() && !curso.getIsChanged() && !curso.getIsDeleted()) {
				sDescripcion=curso.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=curso.getempleado_descripcion();
			}
		}

		if(sTipo.equals("TipoCurso")) {
			//sDescripcion=this.getActualTipoCursoForeignKeyDescripcion((Long)value);
			if(!curso.getIsNew() && !curso.getIsChanged() && !curso.getIsDeleted()) {
				sDescripcion=curso.gettipocurso_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCursoForeignKeyDescripcion((Long)value);
				sDescripcion=curso.gettipocurso_descripcion();
			}
		}

		if(sTipo.equals("TipoInstitucion")) {
			//sDescripcion=this.getActualTipoInstitucionForeignKeyDescripcion((Long)value);
			if(!curso.getIsNew() && !curso.getIsChanged() && !curso.getIsDeleted()) {
				sDescripcion=curso.gettipoinstitucion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoInstitucionForeignKeyDescripcion((Long)value);
				sDescripcion=curso.gettipoinstitucion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Curso cursoRow=new Curso();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cursoRow=(Curso) cursoLogic.getCursos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cursoRow=(Curso) cursos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleCursoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Curso curso) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCurso==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso = (Curso)this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.curso = (Curso)this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(curso!=null) {
						this.curso = curso;
					} else {
						this.curso = new Curso();
					}
				}

				if(this.isTienePermisosDetalleCurso && this.permiteMantenimiento(this.curso)) {
					DetalleCursoBeanSwingJInternalFrame detallecursoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFramePopup=new DetalleCursoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallecursoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFramePopup;
					} else {
						detallecursoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame;
					}

					List<Curso> cursos=new ArrayList<Curso>();
					cursos.add(this.curso);
					if(!esRelacionado) {
						//detallecursoBeanSwingJInternalFrame.detallecursoSessionBean.setConGuardarRelaciones(false);
						//detallecursoBeanSwingJInternalFrame.detallecursoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallecursoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCurso.cargarDetalleCursoBeanSwingJInternalFrame(cursos,this.curso,detallecursoBeanSwingJInternalFrame,/*conInicializar,*/detallecursoBeanSwingJInternalFrame.detallecursoSessionBean.getConGuardarRelaciones(),detallecursoBeanSwingJInternalFrame.detallecursoSessionBean.getEsGuardarRelacionado());
					detallecursoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallecursoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCurso("no_relacionado");

						detallecursoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleCursoConstantesFunciones.ITAMANIOFILATABLA + (DetalleCursoConstantesFunciones.ITAMANIOFILATABLA/2));

						detallecursoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCurso=(TitledBorder)this.jScrollPanelDatosCurso.getBorder();
						TitledBorder titledBorderDetalleCurso=(TitledBorder)detallecursoBeanSwingJInternalFrame.jScrollPanelDatosDetalleCurso.getBorder();

						titledBorderDetalleCurso.setTitle(titledBorderCurso.getTitle() + " -> Detalle Curso");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallecursoBeanSwingJInternalFrame);
						}

						detallecursoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallecursoBeanSwingJInternalFrame);

						detallecursoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cursoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Curso",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCurso(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCurso.setVisible((this.isVisibilidadCeldaNuevoCurso && this.isPermisoNuevoCurso));			
			this.jButtonDuplicarCurso.setVisible((this.isVisibilidadCeldaDuplicarCurso && this.isPermisoDuplicarCurso));			
			this.jButtonCopiarCurso.setVisible((this.isVisibilidadCeldaCopiarCurso && this.isPermisoCopiarCurso));
			this.jButtonVerFormCurso.setVisible((this.isVisibilidadCeldaVerFormCurso && this.isPermisoVerFormCurso));
			
			this.jButtonAbrirOrderByCurso.setVisible((this.isVisibilidadCeldaOrdenCurso && this.isPermisoOrdenCurso));			
			
			this.jButtonNuevoRelacionesCurso.setVisible((this.isVisibilidadCeldaNuevoRelacionesCurso && this.isPermisoNuevoCurso));			
			this.jButtonNuevoGuardarCambiosCurso.setVisible((this.isVisibilidadCeldaNuevoCurso && this.isPermisoNuevoCurso && this.isPermisoGuardarCambiosCurso));
			
			if(this.jInternalFrameDetalleFormCurso!=null) {
			this.jInternalFrameDetalleFormCurso.jButtonModificarCurso.setVisible((this.isVisibilidadCeldaModificarCurso && this.isPermisoActualizarCurso));	
			this.jInternalFrameDetalleFormCurso.jButtonActualizarCurso.setVisible((this.isVisibilidadCeldaActualizarCurso && this.isPermisoActualizarCurso));	
			this.jInternalFrameDetalleFormCurso.jButtonEliminarCurso.setVisible((this.isVisibilidadCeldaEliminarCurso && this.isPermisoEliminarCurso));
			this.jInternalFrameDetalleFormCurso.jButtonCancelarCurso.setVisible(this.isVisibilidadCeldaCancelarCurso);							
			this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosCurso.setVisible((this.isVisibilidadCeldaGuardarCurso && this.isPermisoGuardarCambiosCurso));			
			
			}
						
			this.jButtonGuardarCambiosTablaCurso.setVisible((this.isVisibilidadCeldaGuardarCambiosCurso && this.isPermisoGuardarCambiosCurso));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCurso.setVisible((this.isVisibilidadCeldaNuevoCurso && this.isPermisoNuevoCurso));						
			this.jButtonDuplicarToolBarCurso.setVisible((this.isVisibilidadCeldaDuplicarCurso && this.isPermisoDuplicarCurso));						
			this.jButtonCopiarToolBarCurso.setVisible((this.isVisibilidadCeldaCopiarCurso && this.isPermisoCopiarCurso));			
			this.jButtonVerFormToolBarCurso.setVisible((this.isVisibilidadCeldaVerFormCurso && this.isPermisoVerFormCurso));			
			this.jButtonAbrirOrderByToolBarCurso.setVisible((this.isVisibilidadCeldaOrdenCurso && this.isPermisoOrdenCurso));
			this.jButtonNuevoRelacionesToolBarCurso.setVisible((this.isVisibilidadCeldaNuevoRelacionesCurso && this.isPermisoNuevoCurso));			
			this.jButtonNuevoGuardarCambiosToolBarCurso.setVisible((this.isVisibilidadCeldaNuevoCurso && this.isPermisoNuevoCurso && this.isPermisoGuardarCambiosCurso));			
			
			if(this.jInternalFrameDetalleFormCurso!=null) {
			this.jInternalFrameDetalleFormCurso.jButtonModificarToolBarCurso.setVisible((this.isVisibilidadCeldaModificarCurso && this.isPermisoActualizarCurso));	
			this.jInternalFrameDetalleFormCurso.jButtonActualizarToolBarCurso.setVisible((this.isVisibilidadCeldaActualizarCurso  && this.isPermisoActualizarCurso));	
			this.jInternalFrameDetalleFormCurso.jButtonEliminarToolBarCurso.setVisible((this.isVisibilidadCeldaEliminarCurso && this.isPermisoEliminarCurso));
			this.jInternalFrameDetalleFormCurso.jButtonCancelarToolBarCurso.setVisible(this.isVisibilidadCeldaCancelarCurso);				
			this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosToolBarCurso.setVisible((this.isVisibilidadCeldaGuardarCurso && this.isPermisoGuardarCambiosCurso));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCurso.setVisible((this.isVisibilidadCeldaGuardarCambiosCurso && this.isPermisoGuardarCambiosCurso));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCurso.setVisible((this.isVisibilidadCeldaNuevoCurso && this.isPermisoNuevoCurso));			
			this.jMenuItemDuplicarCurso.setVisible((this.isVisibilidadCeldaDuplicarCurso && this.isPermisoDuplicarCurso));			
			this.jMenuItemCopiarCurso.setVisible((this.isVisibilidadCeldaCopiarCurso && this.isPermisoCopiarCurso));			
			this.jMenuItemVerFormCurso.setVisible((this.isVisibilidadCeldaVerFormCurso && this.isPermisoVerFormCurso));			
			this.jMenuItemAbrirOrderByCurso.setVisible((this.isVisibilidadCeldaOrdenCurso && this.isPermisoOrdenCurso));			
			//this.jMenuItemMostrarOcultarCurso.setVisible((this.isVisibilidadCeldaOrdenCurso && this.isPermisoOrdenCurso));
			this.jMenuItemDetalleAbrirOrderByCurso.setVisible((this.isVisibilidadCeldaOrdenCurso && this.isPermisoOrdenCurso));			
			//this.jMenuItemDetalleMostrarOcultarCurso.setVisible((this.isVisibilidadCeldaOrdenCurso && this.isPermisoOrdenCurso));			
			this.jMenuItemNuevoRelacionesCurso.setVisible((this.isVisibilidadCeldaNuevoRelacionesCurso && this.isPermisoNuevoCurso));			
			this.jMenuItemNuevoGuardarCambiosCurso.setVisible((this.isVisibilidadCeldaNuevoCurso && this.isPermisoNuevoCurso && this.isPermisoGuardarCambiosCurso));									
			
			if(this.jInternalFrameDetalleFormCurso!=null) {
			this.jInternalFrameDetalleFormCurso.jMenuItemModificarCurso.setVisible((this.isVisibilidadCeldaModificarCurso && this.isPermisoActualizarCurso));	
			this.jInternalFrameDetalleFormCurso.jMenuItemActualizarCurso.setVisible((this.isVisibilidadCeldaActualizarCurso && this.isPermisoActualizarCurso));	
			this.jInternalFrameDetalleFormCurso.jMenuItemEliminarCurso.setVisible((this.isVisibilidadCeldaEliminarCurso && this.isPermisoEliminarCurso));
			this.jInternalFrameDetalleFormCurso.jMenuItemCancelarCurso.setVisible(this.isVisibilidadCeldaCancelarCurso);				
			}
			
			this.jMenuItemGuardarCambiosCurso.setVisible((this.isVisibilidadCeldaGuardarCurso && this.isPermisoGuardarCambiosCurso));						
			this.jMenuItemGuardarCambiosTablaCurso.setVisible((this.isVisibilidadCeldaGuardarCambiosCurso && this.isPermisoGuardarCambiosCurso));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCurso=this.jButtonNuevoCurso.isVisible();
			this.isVisibilidadCeldaDuplicarCurso=this.jButtonDuplicarCurso.isVisible();
			this.isVisibilidadCeldaCopiarCurso=this.jButtonCopiarCurso.isVisible();
			this.isVisibilidadCeldaVerFormCurso=this.jButtonVerFormCurso.isVisible();
			
			this.isVisibilidadCeldaOrdenCurso=this.jButtonAbrirOrderByCurso.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCurso=this.jButtonNuevoRelacionesCurso.isVisible();
			this.isVisibilidadCeldaModificarCurso=this.jButtonModificarCurso.isVisible();
			
			if(this.jInternalFrameDetalleFormCurso!=null) {
			this.isVisibilidadCeldaActualizarCurso=this.jInternalFrameDetalleFormCurso.jButtonActualizarCurso.isVisible();
			this.isVisibilidadCeldaEliminarCurso=this.jInternalFrameDetalleFormCurso.jButtonEliminarCurso.isVisible();
			this.isVisibilidadCeldaCancelarCurso=this.jInternalFrameDetalleFormCurso.jButtonCancelarCurso.isVisible();
			this.isVisibilidadCeldaGuardarCurso=this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosCurso.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCurso=this.jButtonGuardarCambiosTablaCurso.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCurso=this.jButtonNuevoToolBarCurso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCurso=this.jButtonNuevoRelacionesToolBarCurso.isVisible();
			
			if(this.jInternalFrameDetalleFormCurso!=null) {
			this.isVisibilidadCeldaModificarCurso=this.jInternalFrameDetalleFormCurso.jButtonModificarToolBarCurso.isVisible();
			this.isVisibilidadCeldaActualizarCurso=this.jInternalFrameDetalleFormCurso.jButtonActualizarToolBarCurso.isVisible();
			this.isVisibilidadCeldaEliminarCurso=this.jInternalFrameDetalleFormCurso.jButtonEliminarToolBarCurso.isVisible();
			this.isVisibilidadCeldaCancelarCurso=this.jInternalFrameDetalleFormCurso.jButtonCancelarToolBarCurso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCurso=this.jButtonGuardarCambiosToolBarCurso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCurso=this.jButtonGuardarCambiosTablaToolBarCurso.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCurso=this.jMenuItemNuevoCurso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCurso=this.jMenuItemNuevoRelacionesCurso.isVisible();
			
			if(this.jInternalFrameDetalleFormCurso!=null) {
			this.isVisibilidadCeldaModificarCurso=this.jInternalFrameDetalleFormCurso.jMenuItemModificarCurso.isVisible();
			this.isVisibilidadCeldaActualizarCurso=this.jInternalFrameDetalleFormCurso.jMenuItemActualizarCurso.isVisible();
			this.isVisibilidadCeldaEliminarCurso=this.jInternalFrameDetalleFormCurso.jMenuItemEliminarCurso.isVisible();
			this.isVisibilidadCeldaCancelarCurso=this.jInternalFrameDetalleFormCurso.jMenuItemCancelarCurso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCurso=this.jMenuItemGuardarCambiosCurso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCurso=this.jMenuItemGuardarCambiosTablaCurso.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCurso(Boolean esInicializar) {
		if(CursoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cursoSessionBean.getConGuardarRelaciones()) {
				//if(this.cursoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCurso();
			}
			
			this.inicializarActualizarBindingBotonesManualCurso(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCurso() {
		this.jButtonNuevoCurso.setVisible(this.isPermisoNuevoCurso);			
		this.jButtonDuplicarCurso.setVisible(this.isPermisoDuplicarCurso);			
		this.jButtonCopiarCurso.setVisible(this.isPermisoCopiarCurso);			
		this.jButtonVerFormCurso.setVisible(this.isPermisoVerFormCurso);			
		
		this.jButtonAbrirOrderByCurso.setVisible(this.isPermisoOrdenCurso);					
		
		this.jButtonNuevoRelacionesCurso.setVisible(this.isPermisoNuevoCurso);			
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jButtonModificarCurso.setVisible(this.isPermisoActualizarCurso);	
			this.jInternalFrameDetalleFormCurso.jButtonActualizarCurso.setVisible(this.isPermisoActualizarCurso);	
			this.jInternalFrameDetalleFormCurso.jButtonEliminarCurso.setVisible(this.isPermisoEliminarCurso);
			this.jInternalFrameDetalleFormCurso.jButtonCancelarCurso.setVisible(this.isVisibilidadCeldaCancelarCurso);						
			this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosCurso.setVisible(this.isPermisoGuardarCambiosCurso);							
		}
		
		this.jButtonGuardarCambiosTablaCurso.setVisible(this.isPermisoActualizarCurso);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCurso() {
		this.jInternalFrameDetalleFormCurso.jButtonModificarCurso.setVisible(this.isPermisoActualizarCurso);	
		this.jInternalFrameDetalleFormCurso.jButtonActualizarCurso.setVisible(this.isPermisoActualizarCurso);	
		this.jInternalFrameDetalleFormCurso.jButtonEliminarCurso.setVisible(this.isPermisoEliminarCurso);
		this.jInternalFrameDetalleFormCurso.jButtonCancelarCurso.setVisible(this.isVisibilidadCeldaCancelarCurso);							
		this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosCurso.setVisible((this.isVisibilidadCeldaGuardarCurso && this.isPermisoGuardarCambiosCurso));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCurso() {
		if(CursoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCurso();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCurso() {
	}
	
	public void jTableDatosCursoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCurso(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.curso.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCursoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCurso(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCurso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCurso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cursoLogic.getConnexion());

				if(this.curso.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.curso.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCurso=(TitledBorder)this.jScrollPanelDatosCurso.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCurso.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.curso.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoCursoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="Empleado";

			if(!this.sFinalQueryGeneral_empleado.equals("")) {
				this.empleadoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleado);
				this.empleadoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadoBeanSwingJInternalFrame.procesarBusqueda(this.empleadoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleado.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCurso=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosCurso.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCurso=(TitledBorder)this.jScrollPanelDatosCurso.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderCurso.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoCursoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebCurso(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCurso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCurso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.cursoLogic.getConnexion());

				if(this.curso.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.curso.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCurso=(TitledBorder)this.jScrollPanelDatosCurso.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderCurso.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.curso.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_cursoCursoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocurso=true;

			idTienePermisotipocurso=this.tienePermisosUsuarioEnPaginaWebCurso(TipoCursoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocurso) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCurso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCurso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);

				this.tipocursoBeanSwingJInternalFrame=new TipoCursoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocursoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocursoBeanSwingJInternalFrame.getTipoCursoLogic().setConnexion(this.cursoLogic.getConnexion());

				if(this.curso.getid_tipo_curso()!=null) {
					this.tipocursoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocursoBeanSwingJInternalFrame.setIdActual(this.curso.getid_tipo_curso());
					this.tipocursoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocursoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocursoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCurso();
				}

				JInternalFrameBase jinternalFrame =this.tipocursoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCurso=(TitledBorder)this.jScrollPanelDatosCurso.getBorder();
				TitledBorder titledBordertipocurso=(TitledBorder)this.tipocursoBeanSwingJInternalFrame.jScrollPanelDatosTipoCurso.getBorder();

				titledBordertipocurso.setTitle(titledBorderCurso.getTitle() + " -> Tipo Curso");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_cursoCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getid_tipo_curso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_curso = "+this.curso.getid_tipo_curso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_institucionCursoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoinstitucion=true;

			idTienePermisotipoinstitucion=this.tienePermisosUsuarioEnPaginaWebCurso(TipoInstitucionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoinstitucion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCurso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCurso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);

				this.tipoinstitucionBeanSwingJInternalFrame=new TipoInstitucionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoinstitucionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoinstitucionBeanSwingJInternalFrame.getTipoInstitucionLogic().setConnexion(this.cursoLogic.getConnexion());

				if(this.curso.getid_tipo_institucion()!=null) {
					this.tipoinstitucionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoinstitucionBeanSwingJInternalFrame.setIdActual(this.curso.getid_tipo_institucion());
					this.tipoinstitucionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoinstitucionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoinstitucionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoInstitucion();
				}

				JInternalFrameBase jinternalFrame =this.tipoinstitucionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCurso=(TitledBorder)this.jScrollPanelDatosCurso.getBorder();
				TitledBorder titledBordertipoinstitucion=(TitledBorder)this.tipoinstitucionBeanSwingJInternalFrame.jScrollPanelDatosTipoInstitucion.getBorder();

				titledBordertipoinstitucion.setTitle(titledBorderCurso.getTitle() + " -> Tipo Institucion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_institucionCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getid_tipo_institucion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_institucion = "+this.curso.getid_tipo_institucion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.curso.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_inscripcionCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getcodigo_inscripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_inscripcion like '%"+this.curso.getcodigo_inscripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.curso.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.curso.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_horasCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getnumero_horas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_horas = "+this.curso.getnumero_horas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_aprobadoCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getes_aprobado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_aprobado = "+this.curso.getes_aprobado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_auspicio_empresaCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getes_auspicio_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_auspicio_empresa = "+this.curso.getes_auspicio_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCurso(this.getcurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.curso==null) {
						this.curso = new Curso();
					}

					this.setVariablesFormularioToObjetoActualCurso(this.curso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);
				}

				if(this.curso.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.curso.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoCursoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCurso(false,false);

			this.getCursosFK_IdEmpleado();

			this.inicializarActualizarBindingCurso(false);

			//if(CursoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCurso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCursoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCurso(false,false);

			this.getCursosFK_IdEmpresa();

			this.inicializarActualizarBindingCurso(false);

			//if(CursoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCurso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCursoCursoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCurso(false,false);

			this.getCursosFK_IdTipoCurso();

			this.inicializarActualizarBindingCurso(false);

			//if(CursoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCurso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoInstitucionCursoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCurso(false,false);

			this.getCursosFK_IdTipoInstitucion();

			this.inicializarActualizarBindingCurso(false);

			//if(CursoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCurso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cursoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCurso() {
		if(this.jInternalFrameDetalleFormCurso!=null) {
		

		if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCurso!=null) {
			this.jInternalFrameDetalleFormCurso.setVisible(false);	    			
			this.jInternalFrameDetalleFormCurso.dispose();
			this.jInternalFrameDetalleFormCurso=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCurso!=null) {
			this.jInternalFrameReporteDinamicoCurso.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCurso.dispose();
			this.jInternalFrameReporteDinamicoCurso=null;
		}
		
		if(this.jInternalFrameImportacionCurso!=null) {
			this.jInternalFrameImportacionCurso.setVisible(false);	    			
			this.jInternalFrameImportacionCurso.dispose();
			this.jInternalFrameImportacionCurso=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCurso();
			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCurso")) {
				jButtonNuevoCursoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCurso")) {
				jButtonDuplicarCursoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCurso")) {
				jButtonCopiarCursoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCurso")) {
				jButtonVerFormCursoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCurso")) {
				jButtonNuevoCursoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCurso")) {
				jButtonDuplicarCursoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCurso")) {
				jButtonNuevoCursoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCurso")) {
				jButtonDuplicarCursoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCurso")) {
				jButtonNuevoCursoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCurso")) {
				jButtonNuevoCursoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCurso")) {
				jButtonNuevoCursoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCurso")) {
				jButtonModificarCursoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCurso")) {
				jButtonModificarCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCurso")) {
				jButtonModificarCursoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCurso")) {
				jButtonActualizarCursoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCurso")) {
				jButtonActualizarCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCurso")) {
				jButtonActualizarCursoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCurso")) {
				jButtonEliminarCursoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCurso")) {
				jButtonEliminarCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCurso")) {
				jButtonEliminarCursoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCurso")) {
				jButtonCancelarCursoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCurso")) {
				jButtonCancelarCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCurso")) {
				jButtonCancelarCursoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCurso")) {
				jButtonCerrarCursoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCurso")) {
				jButtonCerrarCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCurso")) {
				jButtonCerrarCursoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCurso")) {
				jButtonMostrarOcultarCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCurso")) {
				jButtonCancelarCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCurso")) {
				jButtonGuardarCambiosCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCurso")) {
				jButtonGuardarCambiosCursoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCurso")) {
				jButtonCopiarCursoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCurso")) {
				jButtonVerFormCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCurso")) {
				jButtonGuardarCambiosCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCurso")) {
				jButtonCopiarCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCurso")) {
				jButtonVerFormCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCurso")) {
				jButtonGuardarCambiosCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCurso")) {
				jButtonGuardarCambiosCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCurso")) {
				jButtonGuardarCambiosCursoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCurso")) {
				jButtonRecargarInformacionCursoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCurso")) {
				jButtonRecargarInformacionCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCurso")) {
				jButtonRecargarInformacionCursoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCurso")) {
				jButtonAnterioresCursoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCurso")) {
				jButtonAnterioresCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCurso")) {
				jButtonAnterioresCursoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCurso")) {
				jButtonSiguientesCursoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCurso")) {
				jButtonSiguientesCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCurso")) {
				jButtonSiguientesCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCurso") || sTipo.equals("MenuItemDetalleAbrirOrderByCurso")) {
				jButtonAbrirOrderByCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCurso") || sTipo.equals("MenuItemDetalleMostrarOcultarCurso")) {
				jButtonMostrarOcultarCursoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCurso")) {
				jButtonNuevoGuardarCambiosCursoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCurso")) {
				jButtonNuevoGuardarCambiosCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCurso")) {
				jButtonNuevoGuardarCambiosCursoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCurso")) {
				jButtonCerrarReporteDinamicoCursoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCurso")) {
				jButtonGenerarReporteDinamicoCursoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCurso")) {
				
				jButtonGenerarExcelReporteDinamicoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCurso")) {
				jButtonCerrarImportacionCursoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCurso")) {
				
				jButtonGenerarImportacionCursoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCurso")) {
				
				jButtonAbrirImportacionCursoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCurso")) {
				jComboBoxTiposAccionesCursoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCurso")) {
				jComboBoxTiposRelacionesCursoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCurso")) {
				jComboBoxTiposAccionesCursoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCurso")) {
				
				jComboBoxTiposSeleccionarCursoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCurso")) {
				jTextFieldValorCampoGeneralCursoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCurso")) {
				jButtonAbrirOrderByCursoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCurso")) {
				jButtonAbrirOrderByCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCurso")) {
				jButtonCerrarOrderByCursoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCursoBusqueda")) {
				this.jButtonidCursoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCursoUpdate")) {
				this.jButtonid_empresaCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCursoBusqueda")) {
				this.jButtonid_empresaCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoCurso")) {
				this.jButtonid_empleadoCursoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCursoUpdate")) {
				this.jButtonid_empleadoCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCursoBusqueda")) {
				this.jButtonid_empleadoCursoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cursoCursoUpdate")) {
				this.jButtonid_tipo_cursoCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cursoCursoBusqueda")) {
				this.jButtonid_tipo_cursoCursoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_institucionCursoUpdate")) {
				this.jButtonid_tipo_institucionCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_institucionCursoBusqueda")) {
				this.jButtonid_tipo_institucionCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCursoBusqueda")) {
				this.jButtonnombreCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_inscripcionCursoBusqueda")) {
				this.jButtoncodigo_inscripcionCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioCursoBusqueda")) {
				this.jButtonfecha_inicioCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finCursoBusqueda")) {
				this.jButtonfecha_finCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_horasCursoBusqueda")) {
				this.jButtonnumero_horasCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_aprobadoCursoBusqueda")) {
				this.jButtones_aprobadoCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_auspicio_empresaCursoBusqueda")) {
				this.jButtones_auspicio_empresaCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCursoBusqueda")) {
				this.jButtondescripcionCursoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoCurso")) {
				this.jButtonid_empleadoCursoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoCurso")) {
				this.jButtonFK_IdEmpleadoCursoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoCursoCurso")) {
				this.jButtonFK_IdTipoCursoCursoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoInstitucionCurso")) {
				this.jButtonFK_IdTipoInstitucionCursoActionPerformed(evt);
			}
			
			;
			
			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCurso();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCursoActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				


				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Curso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Curso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Curso cursoLocal=null;
			
			if(!this.getEsControlTabla()) {
				cursoLocal=this.curso;
			} else {
				cursoLocal=this.cursoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
							
				
				


				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Curso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Curso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoAnterior =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cursoAnterior =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCursoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
								
						
				


				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Curso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Curso.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
								
				
				


				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Curso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Curso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoAnterior =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cursoAnterior =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.curso);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoAnterior =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cursoAnterior =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCursoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
							
				
				


				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Curso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Curso.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCursoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCurso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cursoAnterior =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cursoAnterior =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCursoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
								
				
				


				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Curso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Curso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoAnterior =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cursoAnterior =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCursoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCursoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCurso")) {
					jCheckBoxSeleccionarTodosCursoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCurso")) {
					jCheckBoxSeleccionadosCursoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCurso")) {
					
				}
				
				


				
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Curso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Curso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
												
				
				


				
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Curso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Curso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCursoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCurso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cursoAnterior =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cursoAnterior =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCursoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCursoActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Curso.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Curso.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.curso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.curso);
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Curso.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Curso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cursoAnterior =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cursoAnterior =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCurso")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCursoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCurso.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.curso =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.curso =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.curso);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCurso")) {
				
				}
				
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCurso")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCurso.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCurso")) {
			
			}
			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCurso();
			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
			if(sTipo.equals("NuevoCurso")) {
				jButtonNuevoCursoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCurso")) {
				jButtonDuplicarCursoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCurso")) {
				jButtonCopiarCursoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCurso")) {
				jButtonVerFormCursoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCurso")) {
				jButtonNuevoCursoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCurso")) {
				jButtonModificarCursoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCurso")) {
				jButtonActualizarCursoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCurso")) {
				jButtonEliminarCursoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCurso")) {
				jButtonGuardarCambiosCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCurso")) {
				jButtonCancelarCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCurso")) {
				jButtonCerrarCursoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCurso")) {
				jButtonGuardarCambiosCursoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCurso")) {
				jButtonNuevoGuardarCambiosCursoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCurso")) {
				jButtonAbrirOrderByCursoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCurso")) {
				jButtonRecargarInformacionCursoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCurso")) {
				jButtonAnterioresCursoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCurso")) {
				jButtonSiguientesCursoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCursoBusqueda")) {
				this.jButtonidCursoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCursoUpdate")) {
				this.jButtonid_empresaCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCursoBusqueda")) {
				this.jButtonid_empresaCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoCurso")) {
				this.jButtonid_empleadoCursoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCursoUpdate")) {
				this.jButtonid_empleadoCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCursoBusqueda")) {
				this.jButtonid_empleadoCursoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cursoCursoUpdate")) {
				this.jButtonid_tipo_cursoCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cursoCursoBusqueda")) {
				this.jButtonid_tipo_cursoCursoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_institucionCursoUpdate")) {
				this.jButtonid_tipo_institucionCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_institucionCursoBusqueda")) {
				this.jButtonid_tipo_institucionCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCursoBusqueda")) {
				this.jButtonnombreCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_inscripcionCursoBusqueda")) {
				this.jButtoncodigo_inscripcionCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioCursoBusqueda")) {
				this.jButtonfecha_inicioCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finCursoBusqueda")) {
				this.jButtonfecha_finCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_horasCursoBusqueda")) {
				this.jButtonnumero_horasCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_aprobadoCursoBusqueda")) {
				this.jButtones_aprobadoCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_auspicio_empresaCursoBusqueda")) {
				this.jButtones_auspicio_empresaCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCursoBusqueda")) {
				this.jButtondescripcionCursoBusquedaActionPerformed(evt);
			}
			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCurso();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCurso")) {
				closingInternalFrameCurso();
				
			} else if(sTipo.equals("jButtonCancelarCurso")) {
				JInternalFrameBase jInternalFrameDetalleFormCurso = (JInternalFrameBase)evt.getSource();
	            	
	            CursoBeanSwingJInternalFrame jInternalFrameParent=(CursoBeanSwingJInternalFrame)jInternalFrameDetalleFormCurso.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCursoActionPerformed(null);
			}
			
			CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.curso,new Object(),this.cursoParameterGeneral,this.cursoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCurso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCurso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCurso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.curso)) {
			if(!esControlTabla) {
				if(CursoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCurso(this.curso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);			
				}
				
				if(this.cursoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCurso(this.curso,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cursoReturnGeneral=cursoLogic.procesarEventosCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cursoLogic.getCursos(),this.curso,this.cursoParameterGeneral,this.isEsNuevoCurso,classes);//this.cursoLogic.getCurso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCurso(this.cursoReturnGeneral,this.cursoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cursoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCurso(classes,this.cursoReturnGeneral,this.cursoBean,false);
					}
						
					if(this.cursoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCurso(this.cursoReturnGeneral.getCurso());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCurso(this.cursoReturnGeneral.getCurso());	
					}
						
					if(this.cursoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCurso(this.cursoReturnGeneral.getCurso(),classes);//this.cursoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCurso(this.curso,classes);//this.cursoBean);									
				}
			
				if(CursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCurso(this.curso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCurso(this.curso);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cursoAnterior!=null) {
						this.curso=this.cursoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cursoReturnGeneral=cursoLogic.procesarEventosCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cursoLogic.getCursos(),this.curso,this.cursoParameterGeneral,this.isEsNuevoCurso,classes);//this.cursoLogic.getCurso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cursoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cursoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cursoReturnGeneral.getCurso(),cursoLogic.getCursos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cursoReturnGeneral.getCurso(),this.cursos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCurso.repaint();
				
				//((AbstractTableModel) this.jTableDatosCurso.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCurso();
			}
		}
	}
	
	public void actualizarVisualTableDatosCurso() throws Exception {
		
		CursoModel cursoModel=(CursoModel)this.jTableDatosCurso.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cursoModel.cursos=this.cursoLogic.getCursos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cursoModel.cursos=this.cursos;
		}
		
		
		((CursoModel) this.jTableDatosCurso.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCurso() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcursoAnterior(),this.cursoLogic.getCursos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcursoAnterior(),this.cursos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCurso();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCurso(Curso curso,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCurso.class)) {
					this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.setDetalleCursos(curso.getDetalleCursos());
					this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCurso(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.curso,new Object(),generalEntityParameterGeneral,this.cursoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cursoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CursoConstantesFunciones.getClassesRelationshipsOfCurso(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CursoConstantesFunciones.getClassesRelationshipsFromStringsOfCurso(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCurso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.curso,new Object(),generalEntityParameterGeneral,this.cursoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCurso(CursoBean cursoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCurso.class)) {
					this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.setDetalleCursos(curso.getDetalleCursos());
					this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCurso(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCurso(ArrayList<Classe> classes,CursoReturnGeneral cursoReturnGeneral,CursoBean cursoBean,Boolean conDefault) throws Exception {
		
			this.cursoBean.setDetalleCursos(cursoReturnGeneral.getCurso().getDetalleCursos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCurso(Curso curso,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCurso.class)) {
					curso.setDetalleCursos(this.jInternalFrameDetalleFormCurso.detallecursoBeanSwingJInternalFrame.detallecursoLogic.getDetalleCursos());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.curso)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCurso = new CursoDetalleFormJInternalFrame(jDesktopPane,this.cursoSessionBean.getConGuardarRelaciones(),this.cursoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCurso);
		this.jInternalFrameDetalleFormCurso.setVisible(false);
		this.jInternalFrameDetalleFormCurso.setSelected(false);						
		
		this.jInternalFrameDetalleFormCurso.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCurso.cursoLogic=this.cursoLogic;
		
		this.cargarCombosFrameForeignKeyCurso("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCurso();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCurso();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCurso("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCurso();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCurso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCurso"));
		
		this.jInternalFrameDetalleFormCurso.jButtonModificarCurso.addActionListener(new ButtonActionListener(this,"ModificarCurso"));

		
		this.jInternalFrameDetalleFormCurso.jButtonModificarToolBarCurso.addActionListener(new ButtonActionListener(this,"ModificarToolBarCurso"));
					
		this.jInternalFrameDetalleFormCurso.jMenuItemModificarCurso.addActionListener(new ButtonActionListener(this,"MenuItemModificarCurso"));		
		
		
		
		this.jInternalFrameDetalleFormCurso.jButtonActualizarCurso.addActionListener (new ButtonActionListener(this,"ActualizarCurso"));
		
		
		this.jInternalFrameDetalleFormCurso.jButtonActualizarToolBarCurso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCurso"));
						
		this.jInternalFrameDetalleFormCurso.jMenuItemActualizarCurso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCurso"));		
		
		
		
		this.jInternalFrameDetalleFormCurso.jButtonEliminarCurso.addActionListener (new ButtonActionListener(this,"EliminarCurso"));
		
		
		this.jInternalFrameDetalleFormCurso.jButtonEliminarToolBarCurso.addActionListener (new ButtonActionListener(this,"EliminarToolBarCurso"));
								
		this.jInternalFrameDetalleFormCurso.jMenuItemEliminarCurso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCurso"));		
		
		
		
		this.jInternalFrameDetalleFormCurso.jButtonCancelarCurso.addActionListener (new ButtonActionListener(this,"CancelarCurso"));
		
		
		this.jInternalFrameDetalleFormCurso.jButtonCancelarToolBarCurso.addActionListener (new ButtonActionListener(this,"CancelarToolBarCurso"));
					
		this.jInternalFrameDetalleFormCurso.jMenuItemCancelarCurso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCurso"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCurso.jMenuItemDetalleCerrarCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCurso"));		
		
		
		
		this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosToolBarCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCurso"));
		
		
		
		this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosToolBarCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCurso"));
		
		
		
		this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCurso"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonidCursoBusqueda.addActionListener(new ButtonActionListener(this,"idCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_empresaCursoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_empresaCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCursoBusqueda"));
		//jButtonid_empleadoCurso.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoCursoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCurso.jButtonid_empleadoCurso.addActionListener(new ButtonActionListener(this,"id_empleadoCurso"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_empleadoCursoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_empleadoCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_cursoCursoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cursoCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_cursoCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cursoCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_institucionCursoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_institucionCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_institucionCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_institucionCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonnombreCursoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtoncodigo_inscripcionCursoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_inscripcionCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonfecha_inicioCursoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonfecha_finCursoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonnumero_horasCursoBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtones_aprobadoCursoBusqueda.addActionListener(new ButtonActionListener(this,"es_aprobadoCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtones_auspicio_empresaCursoBusqueda.addActionListener(new ButtonActionListener(this,"es_auspicio_empresaCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtondescripcionCursoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCursoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCurso.jTabbedPaneRelacionesCurso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCurso"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCurso"));
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCurso"));
		}
		
		this.jTableDatosCurso.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCurso"));
		
		this.jTableDatosCurso.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCurso"));
		
		this.jButtonNuevoCurso.addActionListener(new ButtonActionListener(this,"NuevoCurso"));
		
		this.jButtonDuplicarCurso.addActionListener(new ButtonActionListener(this,"DuplicarCurso"));
		
		this.jButtonCopiarCurso.addActionListener(new ButtonActionListener(this,"CopiarCurso"));
		
		this.jButtonVerFormCurso.addActionListener(new ButtonActionListener(this,"VerFormCurso"));
		
		
		this.jButtonNuevoToolBarCurso.addActionListener(new ButtonActionListener(this,"NuevoToolBarCurso"));
			
		this.jButtonDuplicarToolBarCurso.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCurso"));
			
		this.jMenuItemNuevoCurso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCurso"));
			
		this.jMenuItemDuplicarCurso.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCurso"));		
		
		
		this.jButtonNuevoRelacionesCurso.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCurso"));
		
		
		this.jButtonNuevoRelacionesToolBarCurso.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCurso"));
			
		this.jMenuItemNuevoRelacionesCurso.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCurso"));		
		
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jButtonModificarCurso.addActionListener(new ButtonActionListener(this,"ModificarCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jButtonModificarToolBarCurso.addActionListener(new ButtonActionListener(this,"ModificarToolBarCurso"));
			
			this.jInternalFrameDetalleFormCurso.jMenuItemModificarCurso.addActionListener(new ButtonActionListener(this,"MenuItemModificarCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCurso.jButtonActualizarCurso.addActionListener (new ButtonActionListener(this,"ActualizarCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jButtonActualizarToolBarCurso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCurso"));
				
			this.jInternalFrameDetalleFormCurso.jMenuItemActualizarCurso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jButtonEliminarCurso.addActionListener (new ButtonActionListener(this,"EliminarCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jButtonEliminarToolBarCurso.addActionListener (new ButtonActionListener(this,"EliminarToolBarCurso"));
						
			this.jInternalFrameDetalleFormCurso.jMenuItemEliminarCurso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jButtonCancelarCurso.addActionListener (new ButtonActionListener(this,"CancelarCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jButtonCancelarToolBarCurso.addActionListener (new ButtonActionListener(this,"CancelarToolBarCurso"));
			
			this.jInternalFrameDetalleFormCurso.jMenuItemCancelarCurso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCurso"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCurso.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCurso"));		
		
		
		this.jButtonCerrarCurso.addActionListener (new ButtonActionListener(this,"CerrarCurso"));
		
		
		this.jButtonCerrarToolBarCurso.addActionListener (new ButtonActionListener(this,"CerrarToolBarCurso"));
			
		this.jMenuItemCerrarCurso.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCurso"));
			
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jMenuItemDetalleCerrarCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosToolBarCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCurso"));
		}
		
		this.jButtonCopiarToolBarCurso.addActionListener (new ButtonActionListener(this,"CopiarToolBarCurso"));
			
		this.jButtonVerFormToolBarCurso.addActionListener (new ButtonActionListener(this,"VerFormToolBarCurso"));
		
		this.jMenuItemGuardarCambiosCurso.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCurso"));
			
		this.jMenuItemCopiarCurso.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCurso"));		
		
		this.jMenuItemVerFormCurso.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCurso"));		
		
		
		this.jButtonGuardarCambiosTablaCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCurso"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCurso"));
			
		this.jMenuItemGuardarCambiosTablaCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCurso"));		
		
		
		
		this.jButtonRecargarInformacionCurso.addActionListener (new ButtonActionListener(this,"RecargarInformacionCurso"));
					
		this.jButtonRecargarInformacionToolBarCurso.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCurso"));
		
		this.jMenuItemRecargarInformacionCurso.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCurso"));		
		
		
		
		this.jButtonAnterioresCurso.addActionListener (new ButtonActionListener(this,"AnterioresCurso"));
		
		
		this.jButtonAnterioresToolBarCurso.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCurso"));
		
		this.jMenuItemAnterioresCurso.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCurso"));		
		
		
		this.jButtonSiguientesCurso.addActionListener (new ButtonActionListener(this,"SiguientesCurso"));
		
		
		this.jButtonSiguientesToolBarCurso.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCurso"));
			
		this.jMenuItemSiguientesCurso.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCurso"));
			
		this.jMenuItemAbrirOrderByCurso.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCurso"));
			
		this.jMenuItemMostrarOcultarCurso.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCurso"));
			
		this.jMenuItemDetalleAbrirOrderByCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCurso"));
			
		this.jMenuItemDetalleMostarOcultarCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCurso"));		
		
		
		this.jButtonNuevoGuardarCambiosCurso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCurso"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCurso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCurso"));
			
		this.jMenuItemNuevoGuardarCambiosCurso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCurso"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCurso.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCurso"));

		this.jCheckBoxSeleccionadosCurso.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCurso"));
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCurso"));
		}
		
		
		this.jComboBoxTiposRelacionesCurso.addActionListener (new ButtonActionListener(this,"TiposRelacionesCurso"));
			
		this.jComboBoxTiposAccionesCurso.addActionListener (new ButtonActionListener(this,"TiposAccionesCurso"));
					
		this.jComboBoxTiposSeleccionarCurso.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCurso"));
			
		this.jTextFieldValorCampoGeneralCurso.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCurso"));		
		
		
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonidCursoBusqueda.addActionListener(new ButtonActionListener(this,"idCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_empresaCursoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_empresaCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCursoBusqueda"));
		//jButtonid_empleadoCurso.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoCursoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCurso.jButtonid_empleadoCurso.addActionListener(new ButtonActionListener(this,"id_empleadoCurso"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_empleadoCursoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_empleadoCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_cursoCursoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cursoCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_cursoCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cursoCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_institucionCursoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_institucionCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_institucionCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_institucionCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonnombreCursoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtoncodigo_inscripcionCursoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_inscripcionCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonfecha_inicioCursoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonfecha_finCursoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonnumero_horasCursoBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtones_aprobadoCursoBusqueda.addActionListener(new ButtonActionListener(this,"es_aprobadoCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtones_auspicio_empresaCursoBusqueda.addActionListener(new ButtonActionListener(this,"es_auspicio_empresaCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtondescripcionCursoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCursoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoCurso.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoCurso"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoCurso.addActionListener(new ButtonActionListener(this,"id_empleadoCurso"));

			this.jButtonFK_IdTipoCursoCurso.addActionListener(new ButtonActionListener(this,"FK_IdTipoCursoCurso"));

			this.jButtonFK_IdTipoInstitucionCurso.addActionListener(new ButtonActionListener(this,"FK_IdTipoInstitucionCurso"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCurso!=null) {
				this.jInternalFrameReporteDinamicoCurso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCurso"));
				this.jInternalFrameReporteDinamicoCurso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCurso"));
				this.jInternalFrameReporteDinamicoCurso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCurso"));
			}
			
			//this.jButtonCerrarReporteDinamicoCurso.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCurso"));				
			//this.jButtonGenerarReporteDinamicoCurso.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCurso"));
			//this.jButtonGenerarExcelReporteDinamicoCurso.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCurso"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCurso!=null) {
				this.jInternalFrameImportacionCurso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCurso"));
				this.jInternalFrameImportacionCurso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCurso"));
				this.jInternalFrameImportacionCurso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCurso"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCurso.addActionListener (new ButtonActionListener(this,"AbrirOrderByCurso"));
			
			this.jButtonAbrirOrderByToolBarCurso.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCurso"));			
			
			if(this.jInternalFrameOrderByCurso!=null) {
				this.jInternalFrameOrderByCurso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCurso"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCurso.jTabbedPaneRelacionesCurso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCurso"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameCurso();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCurso.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCurso = (JInternalFrameBase)event.getSource();
	            	
	            CursoBeanSwingJInternalFrame jInternalFrameParent=(CursoBeanSwingJInternalFrame)jInternalFrameDetalleFormCurso.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCursoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCurso.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCursoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCurso.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCurso.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCursoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCursoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCursoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCurso";
		inputMap = this.jButtonNuevoCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCursoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCursoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCursoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCursoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCurso";
		inputMap = this.jButtonNuevoRelacionesCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCursoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCurso";
		inputMap = this.jButtonModificarCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCurso";
		inputMap = this.jButtonActualizarCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCurso";
		inputMap = this.jButtonEliminarCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCurso";
		inputMap = this.jButtonCancelarCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCurso";
		inputMap = this.jButtonCerrarCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCurso";
		inputMap = this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCurso.jButtonGuardarCambiosCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCurso.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCursoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCurso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCursoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCurso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCursoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCurso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCursoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonidCursoBusqueda.addActionListener(new ButtonActionListener(this,"idCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_empresaCursoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_empresaCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCursoBusqueda"));
		//jButtonid_empleadoCurso.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoCursoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCurso.jButtonid_empleadoCurso.addActionListener(new ButtonActionListener(this,"id_empleadoCurso"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_empleadoCursoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_empleadoCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_cursoCursoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cursoCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_cursoCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cursoCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_institucionCursoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_institucionCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonid_tipo_institucionCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_institucionCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonnombreCursoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtoncodigo_inscripcionCursoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_inscripcionCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonfecha_inicioCursoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonfecha_finCursoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtonnumero_horasCursoBusqueda.addActionListener(new ButtonActionListener(this,"numero_horasCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtones_aprobadoCursoBusqueda.addActionListener(new ButtonActionListener(this,"es_aprobadoCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtones_auspicio_empresaCursoBusqueda.addActionListener(new ButtonActionListener(this,"es_auspicio_empresaCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCurso.jButtondescripcionCursoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCursoBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoCurso.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoCurso"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoCurso.addActionListener(new ButtonActionListener(this,"id_empleadoCurso"));

		this.jButtonFK_IdTipoCursoCurso.addActionListener(new ButtonActionListener(this,"FK_IdTipoCursoCurso"));

		this.jButtonFK_IdTipoInstitucionCurso.addActionListener(new ButtonActionListener(this,"FK_IdTipoInstitucionCurso"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCursoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCurso.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCurso(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Curso cursoAux:this.cursoLogic.getCursos()) {
					cursoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Curso cursoAux:cursos) {
					cursoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCursoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCurso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Curso cursoAux:this.cursoLogic.getCursos()) {
						cursoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Curso cursoAux:cursos) {
						cursoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Curso cursoAux:this.cursoLogic.getCursos()) {
					
						if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_ESAPROBADO)) {
							existe=true;
							cursoAux.setes_aprobado(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA)) {
							existe=true;
							cursoAux.setes_auspicio_empresa(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Curso cursoAux:cursos) {
						
						if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_ESAPROBADO)) {
							existe=true;
							cursoAux.setes_aprobado(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA)) {
							existe=true;
							cursoAux.setes_auspicio_empresa(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCurso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCurso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCurso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCurso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCursoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCurso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCurso.getSelectedRows();
			
			Curso cursoLocal=new Curso();
			
			//this.seleccionarTodosCurso(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cursoLocal =(Curso) this.cursoLogic.getCursos().toArray()[this.jTableDatosCurso.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cursoLocal =(Curso) this.cursos.toArray()[this.jTableDatosCurso.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cursoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Curso cursoAux:this.cursoLogic.getCursos()) {
						cursoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Curso cursoAux:cursos) {
						cursoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCurso(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCurso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCurso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCurso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCursoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCursoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCursoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCurso(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCurso.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Curso cursoAux:this.cursoLogic.getCursos()) {
				
						if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cursoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION)) {
							existe=true;
							cursoAux.setcodigo_inscripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							cursoAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							cursoAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_NUMEROHORAS)) {
							existe=true;
							cursoAux.setnumero_horas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cursoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Curso cursoAux:cursos) {
					
						if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cursoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION)) {
							existe=true;
							cursoAux.setcodigo_inscripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							cursoAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							cursoAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_NUMEROHORAS)) {
							existe=true;
							cursoAux.setnumero_horas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cursoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCurso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCursoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCurso(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCurso=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCurso.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCurso) {				
					conSplash=true;//false;										
					
					//this.startProcessCurso(conSplash);
				
					this.generarReporteCursosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCursosSeleccionados();
				//this.jComboBoxTiposAccionesCurso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCursosSeleccionados(false);
				//this.jComboBoxTiposAccionesCurso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCursosSeleccionados(true);
				//this.jComboBoxTiposAccionesCurso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCurso();
				
				this.exportarCursosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCursos();
				//this.importarCursos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCurso();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCursosSeleccionados();
				//this.jComboBoxTiposAccionesCurso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Curso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCurso();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCurso)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCurso(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Curso",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.setSelectedIndex(0);					
				}	
			} 			
			else if(CursoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCurso) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCurso(conSplash);
					
						//this.actualizarParametrosGeneralCurso();
						
						this.generarReporteProcesoAccionCursosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCurso.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CursoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CursoS SELECCIONADOS?", "MANTENIMIENTO DE Curso", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCurso();
				
						this.actualizarParametrosGeneralCurso();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cursoReturnGeneral=cursoLogic.procesarAccionCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cursoLogic.getCursos(),this.cursoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCursoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCurso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCurso();
					
					CursoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCursoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCurso.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCurso.jComboBoxTiposAccionesFormularioCurso.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCurso(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCursoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCurso();
			
			if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();		
			Curso curso=new Curso();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCurso(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCurso.getSelectedItem();
			
			
			
			
			cursosSeleccionados=this.getCursosSeleccionados(true);
			//this.sTipoAccion;
			
			if(cursosSeleccionados.size()==1) {
				for(Curso cursoAux:cursosSeleccionados) {
					curso=cursoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Curso")) {
					jButtonDetalleCursoActionPerformed(null,rowIndex,true,false,curso);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCurso();
			
      		//this.finishProcessCurso(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCursoReturnGeneral() throws Exception {
		if(this.cursoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cursoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cursoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cursoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cursoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cursoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCurso(false);
		}
		
		if(this.cursoReturnGeneral.getConRetornoLista() || this.cursoReturnGeneral.getConRetornoObjeto()) {
			if(this.cursoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cursoLogic.setCursos(this.cursoReturnGeneral.getCursos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cursoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cursoLogic.setCurso(this.cursoReturnGeneral.getCurso());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCurso(false);
		}
	}
	
	public void actualizarParametrosGeneralCurso() throws Exception {
		
		
	}
	
	public ArrayList<Curso> getCursosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCurso) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Curso cursoAux:cursoLogic.getCursos()) {
					if(cursoAux.getIsSelected()) {
						cursosSeleccionados.add(cursoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Curso cursoAux:this.cursos) {
					if(cursoAux.getIsSelected()) {
						cursosSeleccionados.add(cursoAux);				
					}
				}
			}
			
			if(cursosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cursosSeleccionados.addAll(this.cursoLogic.getCursos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cursosSeleccionados.addAll(this.cursos);				
					}
				}
			}
		} else {
			cursosSeleccionados.add(this.curso);
		}
		
		return cursosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteCursosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCursosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCursosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCursosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCursosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCursosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Curso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCursosSeleccionados() throws Exception {
		ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();		
		
		cursosSeleccionados=this.getCursosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCursos("Todos",cursosSeleccionados);
		
	}	
	
	public void generarReporteNormalCursosSeleccionados() throws Exception {
		ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();		
		
		cursosSeleccionados=this.getCursosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCursos("Todos",cursosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCursosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();
		
		cursosSeleccionados=this.getCursosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCursos("Todos",cursosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCursosSeleccionados() throws Exception {
		ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCurso();
		
		
		cursosSeleccionados=this.getCursosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCurso();
		
		
		//this.generarReporteCursos("Todos",cursosSeleccionados ,cursoImplementable,cursoImplementableHome);
	}
	
	public void mostrarImportacionCursos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCurso();
		
		this.abrirFrameImportacionCurso();		
		
			
		//this.generarReporteCursos("Todos",cursosSeleccionados ,cursoImplementable,cursoImplementableHome);
	}
	
	public void importarCursos() throws Exception {		
	
	}
	
	public void exportarCursosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCursosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCursosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCursosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Curso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCursosSeleccionados() throws Exception {
		ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();		
		
		cursosSeleccionados=this.getCursosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"curso."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCurso(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Curso cursoAux:cursosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCurso(cursoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cursoAux.setsDetalleGeneralEntityReporte(cursoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Curso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCurso(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CursoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_IDTIPOCURSO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_NUMEROHORAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_ESAPROBADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CursoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCurso(Curso curso,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=curso.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.gettipocurso_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.gettipoinstitucion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.getcodigo_inscripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.getnumero_horas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.getes_aprobado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.getes_auspicio_empresa().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=curso.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCursosSeleccionados() throws Exception {
		ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();		
		
		cursosSeleccionados=this.getCursosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"curso.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Cursos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCurso(row);				
				iRow++;
			}				
			
			for(Curso cursoAux:cursosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCurso(cursoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Curso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCursosSeleccionados() throws Exception {
		ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();		
		
		cursosSeleccionados=this.getCursosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"curso.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cursos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("curso");
			//elementRoot.appendChild(element);
		
			for(Curso cursoAux:cursosSeleccionados) {
				element = document.createElement("curso");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCurso(cursoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Curso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCurso(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_IDTIPOCURSO);
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_NUMEROHORAS);
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_ESAPROBADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CursoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCurso(Curso curso,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(curso.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.gettipocurso_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.gettipoinstitucion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.getcodigo_inscripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.getnumero_horas());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.getes_aprobado());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.getes_auspicio_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(curso.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlCurso(Curso curso,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CursoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(curso.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CursoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(curso.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CursoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(curso.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(CursoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(curso.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementtipocurso_descripcion = document.createElement(CursoConstantesFunciones.IDTIPOCURSO);
		elementtipocurso_descripcion.appendChild(document.createTextNode(curso.gettipocurso_descripcion()));
		element.appendChild(elementtipocurso_descripcion);

		Element elementtipoinstitucion_descripcion = document.createElement(CursoConstantesFunciones.IDTIPOINSTITUCION);
		elementtipoinstitucion_descripcion.appendChild(document.createTextNode(curso.gettipoinstitucion_descripcion()));
		element.appendChild(elementtipoinstitucion_descripcion);

		Element elementnombre = document.createElement(CursoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(curso.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcodigo_inscripcion = document.createElement(CursoConstantesFunciones.CODIGOINSCRIPCION);
		elementcodigo_inscripcion.appendChild(document.createTextNode(curso.getcodigo_inscripcion().trim()));
		element.appendChild(elementcodigo_inscripcion);

		Element elementfecha_inicio = document.createElement(CursoConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(curso.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(CursoConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(curso.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementnumero_horas = document.createElement(CursoConstantesFunciones.NUMEROHORAS);
		elementnumero_horas.appendChild(document.createTextNode(curso.getnumero_horas().toString().trim()));
		element.appendChild(elementnumero_horas);

		Element elementes_aprobado = document.createElement(CursoConstantesFunciones.ESAPROBADO);
		elementes_aprobado.appendChild(document.createTextNode(curso.getes_aprobado().toString().trim()));
		element.appendChild(elementes_aprobado);

		Element elementes_auspicio_empresa = document.createElement(CursoConstantesFunciones.ESAUSPICIOEMPRESA);
		elementes_auspicio_empresa.appendChild(document.createTextNode(curso.getes_auspicio_empresa().toString().trim()));
		element.appendChild(elementes_auspicio_empresa);

		Element elementdescripcion = document.createElement(CursoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(curso.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoCursosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Curso> cursosSeleccionados=new ArrayList<Curso>();
		
		cursosSeleccionados=this.getCursosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoCurso(cursosSeleccionados);
		
		this.generarReporteCursos("Todos",cursosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCurso(ArrayList<Curso> cursosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Curso cursoAux:cursosSeleccionados) {
				cursoAux.setsDetalleGeneralEntityReporte(cursoAux.toString());
			
				if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(cursoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(cursoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_IDTIPOCURSO)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(cursoAux.gettipocurso_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_IDTIPOINSTITUCION)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(cursoAux.gettipoinstitucion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(cursoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_CODIGOINSCRIPCION)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(cursoAux.getcodigo_inscripcion());
				}
				 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cursoAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cursoAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_NUMEROHORAS)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(cursoAux.getnumero_horas().toString());
				}
				 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_ESAPROBADO)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cursoAux.getes_aprobado()));
				}
				 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_ESAUSPICIOEMPRESA)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cursoAux.getes_auspicio_empresa()));
				}
				 else if(sTipoSeleccionar.equals(CursoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					cursoAux.setsDescripcionGeneralEntityReporte1(cursoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCurso(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCurso=true;
				this.isVisibilidadCeldaNuevoRelacionesCurso=true;
				this.isVisibilidadCeldaGuardarCambiosCurso=true;
			}
			
			this.isVisibilidadCeldaModificarCurso=false;
			this.isVisibilidadCeldaActualizarCurso=false;
			this.isVisibilidadCeldaEliminarCurso=false;
			this.isVisibilidadCeldaCancelarCurso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarCurso=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesCurso=false;
			this.isVisibilidadCeldaGuardarCambiosCurso=false;
			this.isVisibilidadCeldaModificarCurso=false;
			this.isVisibilidadCeldaActualizarCurso=true;
			this.isVisibilidadCeldaEliminarCurso=false;
			this.isVisibilidadCeldaCancelarCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarCurso=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesCurso=false;
			this.isVisibilidadCeldaGuardarCambiosCurso=false;
			this.isVisibilidadCeldaModificarCurso=false;
			this.isVisibilidadCeldaActualizarCurso=true;
			this.isVisibilidadCeldaEliminarCurso=true;
			this.isVisibilidadCeldaCancelarCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarCurso=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesCurso=false;
			this.isVisibilidadCeldaGuardarCambiosCurso=false;
			this.isVisibilidadCeldaModificarCurso=false;
			this.isVisibilidadCeldaActualizarCurso=true;
			this.isVisibilidadCeldaEliminarCurso=false;
			this.isVisibilidadCeldaCancelarCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCurso=false;
				} else {
					this.isVisibilidadCeldaGuardarCurso=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCurso=true;
			this.isVisibilidadCeldaNuevoRelacionesCurso=true;
			this.isVisibilidadCeldaGuardarCambiosCurso=true;
			this.isVisibilidadCeldaModificarCurso=false;
			this.isVisibilidadCeldaActualizarCurso=false;
			this.isVisibilidadCeldaEliminarCurso=false;
			this.isVisibilidadCeldaCancelarCurso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarCurso=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesCurso=false;
			this.isVisibilidadCeldaGuardarCambiosCurso=false;
			this.isVisibilidadCeldaActualizarCurso=false;
			this.isVisibilidadCeldaEliminarCurso=false;
			this.isVisibilidadCeldaCancelarCurso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCurso=false;
				} else {
					this.isVisibilidadCeldaGuardarCurso=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesCurso=false;
			this.isVisibilidadCeldaGuardarCambiosCurso=false;
			this.isVisibilidadCeldaModificarCurso=true;
			this.isVisibilidadCeldaActualizarCurso=false;
			this.isVisibilidadCeldaEliminarCurso=false;
			this.isVisibilidadCeldaCancelarCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCurso=false;
				} else {
					this.isVisibilidadCeldaGuardarCurso=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CursoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCurso=true;
			this.isVisibilidadCeldaNuevoRelacionesCurso=true;
			this.isVisibilidadCeldaGuardarCambiosCurso=true;
		} else {
			this.actualizarEstadoPanelsCurso(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCurso=false;
			//this.isVisibilidadCeldaVerFormCurso=false;
			this.isVisibilidadCeldaDuplicarCurso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cursoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCurso=false;
		} else {
			this.isVisibilidadCeldaNuevoCurso=false;
			this.isVisibilidadCeldaGuardarCambiosCurso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cursoSessionBean.getEsGuardarRelacionado()) {
			if(!cursoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCurso=false;												
			}
			
			this.jButtonCerrarCurso.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCurso=false;
		}
		
		if(!this.permiteMantenimiento(this.curso)) {
			this.isVisibilidadCeldaActualizarCurso=false;
			this.isVisibilidadCeldaEliminarCurso=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCurso() {
		this.isVisibilidadCeldaNuevoCurso=false;
		this.isVisibilidadCeldaGuardarCambiosCurso=false;
	}
	
	public void actualizarEstadoPanelsCurso(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCurso!=null) {
				this.jScrollPanelDatosEdicionCurso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCurso!=null) {
				this.jTabbedPaneBusquedasCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCurso!=null) {
				this.jScrollPanelDatosCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCurso!=null) {
				this.jPanelPaginacionCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCurso!=null) {
				this.jPanelParametrosReportesCurso.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCurso!=null) {
				this.jScrollPanelDatosEdicionCurso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCurso!=null) {
				this.jTabbedPaneBusquedasCurso.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCurso!=null) {
				this.jScrollPanelDatosCurso.setVisible(false);
			}
			
			if(this.jPanelPaginacionCurso!=null) {
				this.jPanelPaginacionCurso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCurso!=null) {
				this.jPanelParametrosReportesCurso.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCurso!=null) {
				this.jScrollPanelDatosEdicionCurso.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCurso!=null) {
				this.jTabbedPaneBusquedasCurso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCurso!=null) {
				this.jScrollPanelDatosCurso.setVisible(false);
			}
			
			if(this.jPanelPaginacionCurso!=null) {
				this.jPanelPaginacionCurso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCurso!=null) {
				this.jPanelParametrosReportesCurso.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCurso!=null) {
				this.jScrollPanelDatosEdicionCurso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCurso!=null) {
				this.jTabbedPaneBusquedasCurso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCurso!=null) {
				this.jScrollPanelDatosCurso.setVisible(false);
			}
			
			if(this.jPanelPaginacionCurso!=null) {
				this.jPanelPaginacionCurso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCurso!=null) {
				this.jPanelParametrosReportesCurso.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCurso!=null) {
				this.jScrollPanelDatosEdicionCurso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCurso!=null) {
				this.jTabbedPaneBusquedasCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCurso!=null) {
				this.jScrollPanelDatosCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCurso!=null) {
				this.jPanelPaginacionCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCurso!=null) {
				this.jPanelParametrosReportesCurso.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCurso!=null) {
				this.jScrollPanelDatosEdicionCurso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCurso!=null) {
				this.jTabbedPaneBusquedasCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCurso!=null) {
				this.jScrollPanelDatosCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCurso!=null) {
				this.jPanelPaginacionCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCurso!=null) {
				this.jPanelParametrosReportesCurso.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCurso!=null) {
				this.jScrollPanelDatosEdicionCurso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCurso!=null) {
				this.jTabbedPaneBusquedasCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCurso!=null) {
				this.jScrollPanelDatosCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionCurso!=null) {
				this.jPanelPaginacionCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCurso!=null) {
				this.jPanelParametrosReportesCurso.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cursoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCurso!=null) {
					this.jTabbedPaneBusquedasCurso.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCurso!=null) {
				this.jPanelParametrosReportesCurso.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cursoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCurso!=null) {
				this.jTabbedPaneBusquedasCurso.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCurso!=null) {
				this.jPanelParametrosReportesCurso.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdEmpleadoCurso);}

			this.isVisibilidadFK_IdTipoCurso=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCurso) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdTipoCursoCurso);}

			this.isVisibilidadFK_IdTipoInstitucion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoInstitucion) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdTipoInstitucionCurso);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdEmpleadoCurso);}

			this.isVisibilidadFK_IdTipoCurso=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoCurso) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdTipoCursoCurso);}

			this.isVisibilidadFK_IdTipoInstitucion=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoInstitucion) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdTipoInstitucionCurso);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCurso(Boolean isParaTipoCurso){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCursoNegation=!isParaTipoCurso;

			this.isVisibilidadFK_IdEmpleado=isParaTipoCursoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdEmpleadoCurso);}

			this.isVisibilidadFK_IdTipoCurso=isParaTipoCurso;
			if(!this.isVisibilidadFK_IdTipoCurso) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdTipoCursoCurso);}

			this.isVisibilidadFK_IdTipoInstitucion=isParaTipoCursoNegation;
			if(!this.isVisibilidadFK_IdTipoInstitucion) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdTipoInstitucionCurso);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoInstitucion(Boolean isParaTipoInstitucion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoInstitucionNegation=!isParaTipoInstitucion;

			this.isVisibilidadFK_IdEmpleado=isParaTipoInstitucionNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdEmpleadoCurso);}

			this.isVisibilidadFK_IdTipoCurso=isParaTipoInstitucionNegation;
			if(!this.isVisibilidadFK_IdTipoCurso) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdTipoCursoCurso);}

			this.isVisibilidadFK_IdTipoInstitucion=isParaTipoInstitucion;
			if(!this.isVisibilidadFK_IdTipoInstitucion) {this.jTabbedPaneBusquedasCurso.remove(jPanelFK_IdTipoInstitucionCurso);}
		}
		
	}
	
	

	public String registrarSesionCursoParaDetalleCursos() throws Exception {
		Boolean isPaginaPopupDetalleCurso=false;

		try {

			if(this.cursoSessionBean==null) {
				this.cursoSessionBean=new CursoSessionBean();
			}

			if(this.jInternalFrameDetalleFormCurso.detallecursoSessionBean==null) {
				this.jInternalFrameDetalleFormCurso.detallecursoSessionBean=new DetalleCursoSessionBean();
			}

			this.jInternalFrameDetalleFormCurso.detallecursoSessionBean.setsPathNavegacionActual(cursoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleCursoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCurso.detallecursoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleCurso=this.jInternalFrameDetalleFormCurso.detallecursoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCurso.detallecursoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleCurso(true);
			this.jInternalFrameDetalleFormCurso.detallecursoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCurso(CursoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCurso.detallecursoSessionBean.setisBusquedaDesdeForeignKeySesionCurso(true);
			this.jInternalFrameDetalleFormCurso.detallecursoSessionBean.setlidCursoActual(this.idCursoActual);

			cursoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCurso(true);
			cursoSessionBean.setlIdCursoActualForeignKey(this.idCursoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionCursoParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(cursoSessionBean==null) {
				cursoSessionBean=new CursoSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(cursoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.cursoFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(CursoConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionCurso(true);
			//empleadoSessionBean.setlidCursoActual(this.idCursoActual);

			cursoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCurso(true);
			cursoSessionBean.setlIdCursoActualForeignKey(this.idCursoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CursoSessionBean cursoSessionBean=new CursoSessionBean();
		
		if(this.cursoSessionBean==null) {
			this.cursoSessionBean=new CursoSessionBean();
		}
		
		this.cursoSessionBean.setsUltimaBusquedaCurso(this.getsAccionBusqueda());
		this.cursoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cursoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			cursoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cursoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCurso")) {
			cursoSessionBean.setid_tipo_curso(this.getid_tipo_cursoFK_IdTipoCurso());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoInstitucion")) {
			cursoSessionBean.setid_tipo_institucion(this.getid_tipo_institucionFK_IdTipoInstitucion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CursoSessionBean cursoSessionBean=new CursoSessionBean();
		
		if(this.cursoSessionBean==null) {
			this.cursoSessionBean=new CursoSessionBean();
		}
		
		if(this.cursoSessionBean.getsUltimaBusquedaCurso()!=null&&!this.cursoSessionBean.getsUltimaBusquedaCurso().equals("")) {
			this.setsAccionBusqueda(cursoSessionBean.getsUltimaBusquedaCurso());
			this.setiNumeroPaginacion(cursoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cursoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(cursoSessionBean.getid_empleado());
				cursoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cursoSessionBean.getid_empresa());
				cursoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCurso")) {
				this.setid_tipo_cursoFK_IdTipoCurso(cursoSessionBean.getid_tipo_curso());
				cursoSessionBean.setid_tipo_curso(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoInstitucion")) {
				this.setid_tipo_institucionFK_IdTipoInstitucion(cursoSessionBean.getid_tipo_institucion());
				cursoSessionBean.setid_tipo_institucion(-1L);
			}
		}
		
		this.cursoSessionBean.setsUltimaBusquedaCurso("");
		this.cursoSessionBean.setiNumeroPaginacion(CursoConstantesFunciones.INUMEROPAGINACION);
		this.cursoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCurso(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCurso() {
		this.updateBorderResaltarBusquedasFormularioCurso();
		this.updateVisibilidadBusquedasFormularioCurso();
		this.updateHabilitarBusquedasFormularioCurso();
	}
	
	public void updateBorderResaltarBusquedasFormularioCurso() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCurso.getComponents().length>0) {
	

		if(this.cursoConstantesFunciones.resaltarFK_IdEmpleadoCurso!=null) {
			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdEmpleadoCurso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);
				jPanel.setBorder(this.cursoConstantesFunciones.resaltarFK_IdEmpleadoCurso);
			}
		}

		if(this.cursoConstantesFunciones.resaltarFK_IdTipoCursoCurso!=null) {
			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdTipoCursoCurso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);
				jPanel.setBorder(this.cursoConstantesFunciones.resaltarFK_IdTipoCursoCurso);
			}
		}

		if(this.cursoConstantesFunciones.resaltarFK_IdTipoInstitucionCurso!=null) {
			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdTipoInstitucionCurso);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);
				jPanel.setBorder(this.cursoConstantesFunciones.resaltarFK_IdTipoInstitucionCurso);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCurso() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCurso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdEmpleadoCurso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cursoConstantesFunciones.mostrarFK_IdEmpleadoCurso);
			if(!this.cursoConstantesFunciones.mostrarFK_IdEmpleadoCurso && index>-1) {
				this.jTabbedPaneBusquedasCurso.remove(index);
			}

			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdTipoCursoCurso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cursoConstantesFunciones.mostrarFK_IdTipoCursoCurso);
			if(!this.cursoConstantesFunciones.mostrarFK_IdTipoCursoCurso && index>-1) {
				this.jTabbedPaneBusquedasCurso.remove(index);
			}

			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdTipoInstitucionCurso);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cursoConstantesFunciones.mostrarFK_IdTipoInstitucionCurso);
			if(!this.cursoConstantesFunciones.mostrarFK_IdTipoInstitucionCurso && index>-1) {
				this.jTabbedPaneBusquedasCurso.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCurso() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCurso.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdEmpleadoCurso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cursoConstantesFunciones.activarFK_IdEmpleadoCurso);
				this.jTabbedPaneBusquedasCurso.setEnabledAt(index,this.cursoConstantesFunciones.activarFK_IdEmpleadoCurso);
			}

			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdTipoCursoCurso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cursoConstantesFunciones.activarFK_IdTipoCursoCurso);
				this.jTabbedPaneBusquedasCurso.setEnabledAt(index,this.cursoConstantesFunciones.activarFK_IdTipoCursoCurso);
			}

			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdTipoInstitucionCurso);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cursoConstantesFunciones.activarFK_IdTipoInstitucionCurso);
				this.jTabbedPaneBusquedasCurso.setEnabledAt(index,this.cursoConstantesFunciones.activarFK_IdTipoInstitucionCurso);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCurso(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdEmpleadoCurso);

			this.jTabbedPaneBusquedasCurso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);

			this.cursoConstantesFunciones.setResaltarFK_IdEmpleadoCurso(resaltar);

			jPanel.setBorder(this.cursoConstantesFunciones.resaltarFK_IdEmpleadoCurso);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoCurso")) {
			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdTipoCursoCurso);

			this.jTabbedPaneBusquedasCurso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);

			this.cursoConstantesFunciones.setResaltarFK_IdTipoCursoCurso(resaltar);

			jPanel.setBorder(this.cursoConstantesFunciones.resaltarFK_IdTipoCursoCurso);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoInstitucion")) {
			index= this.jTabbedPaneBusquedasCurso.indexOfComponent(this.jPanelFK_IdTipoInstitucionCurso);

			this.jTabbedPaneBusquedasCurso.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCurso.getComponent(index);

			this.cursoConstantesFunciones.setResaltarFK_IdTipoInstitucionCurso(resaltar);

			jPanel.setBorder(this.cursoConstantesFunciones.resaltarFK_IdTipoInstitucionCurso);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCurso.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioCurso() throws Exception {

		if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCurso();
		this.updateVisibilidadResaltarControlesFormularioCurso();
		this.updateHabilitarResaltarControlesFormularioCurso();
		
	}
	
	public void updateBorderResaltarControlesFormularioCurso() throws Exception {
		if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cursoConstantesFunciones.resaltaridCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jLabelidCurso.setBorder(this.cursoConstantesFunciones.resaltaridCurso);}
		if(this.cursoConstantesFunciones.resaltarid_empresaCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.setBorder(this.cursoConstantesFunciones.resaltarid_empresaCurso);}
		if(this.cursoConstantesFunciones.resaltarid_empleadoCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.setBorder(this.cursoConstantesFunciones.resaltarid_empleadoCurso);}
		if(this.cursoConstantesFunciones.resaltarid_tipo_cursoCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.setBorder(this.cursoConstantesFunciones.resaltarid_tipo_cursoCurso);}
		if(this.cursoConstantesFunciones.resaltarid_tipo_institucionCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.setBorder(this.cursoConstantesFunciones.resaltarid_tipo_institucionCurso);}
		if(this.cursoConstantesFunciones.resaltarnombreCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jTextAreanombreCurso.setBorder(this.cursoConstantesFunciones.resaltarnombreCurso);}
		if(this.cursoConstantesFunciones.resaltarcodigo_inscripcionCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jTextFieldcodigo_inscripcionCurso.setBorder(this.cursoConstantesFunciones.resaltarcodigo_inscripcionCurso);}
		if(this.cursoConstantesFunciones.resaltarfecha_inicioCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jDateChooserfecha_inicioCurso.setBorder(this.cursoConstantesFunciones.resaltarfecha_inicioCurso);}
		if(this.cursoConstantesFunciones.resaltarfecha_finCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jDateChooserfecha_finCurso.setBorder(this.cursoConstantesFunciones.resaltarfecha_finCurso);}
		if(this.cursoConstantesFunciones.resaltarnumero_horasCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jTextFieldnumero_horasCurso.setBorder(this.cursoConstantesFunciones.resaltarnumero_horasCurso);}
		if(this.cursoConstantesFunciones.resaltares_aprobadoCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jCheckBoxes_aprobadoCurso.setBorderPainted(true);this.jInternalFrameDetalleFormCurso.jCheckBoxes_aprobadoCurso.setBorder(this.cursoConstantesFunciones.resaltares_aprobadoCurso);}
		if(this.cursoConstantesFunciones.resaltares_auspicio_empresaCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jCheckBoxes_auspicio_empresaCurso.setBorderPainted(true);this.jInternalFrameDetalleFormCurso.jCheckBoxes_auspicio_empresaCurso.setBorder(this.cursoConstantesFunciones.resaltares_auspicio_empresaCurso);}
		if(this.cursoConstantesFunciones.resaltardescripcionCurso!=null && this.jInternalFrameDetalleFormCurso!=null) {this.jInternalFrameDetalleFormCurso.jTextAreadescripcionCurso.setBorder(this.cursoConstantesFunciones.resaltardescripcionCurso);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCurso() throws Exception {		
		if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCurso!=null) {
	
		//this.jInternalFrameDetalleFormCurso.jLabelidCurso.setVisible(this.cursoConstantesFunciones.mostraridCurso);
		this.jInternalFrameDetalleFormCurso.jPanelidCurso.setVisible(this.cursoConstantesFunciones.mostraridCurso);
		//this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.setVisible(this.cursoConstantesFunciones.mostrarid_empresaCurso);
		this.jInternalFrameDetalleFormCurso.jPanelid_empresaCurso.setVisible(this.cursoConstantesFunciones.mostrarid_empresaCurso);
		//this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.setVisible(this.cursoConstantesFunciones.mostrarid_empleadoCurso);
		this.jInternalFrameDetalleFormCurso.jPanelid_empleadoCurso.setVisible(this.cursoConstantesFunciones.mostrarid_empleadoCurso);
			this.jInternalFrameDetalleFormCurso.jButtonid_empleadoCurso.setVisible(this.cursoConstantesFunciones.mostrarid_empleadoCurso);
		//this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.setVisible(this.cursoConstantesFunciones.mostrarid_tipo_cursoCurso);
		this.jInternalFrameDetalleFormCurso.jPanelid_tipo_cursoCurso.setVisible(this.cursoConstantesFunciones.mostrarid_tipo_cursoCurso);
		//this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.setVisible(this.cursoConstantesFunciones.mostrarid_tipo_institucionCurso);
		this.jInternalFrameDetalleFormCurso.jPanelid_tipo_institucionCurso.setVisible(this.cursoConstantesFunciones.mostrarid_tipo_institucionCurso);
		//this.jInternalFrameDetalleFormCurso.jTextAreanombreCurso.setVisible(this.cursoConstantesFunciones.mostrarnombreCurso);
		this.jInternalFrameDetalleFormCurso.jPanelnombreCurso.setVisible(this.cursoConstantesFunciones.mostrarnombreCurso);
		//this.jInternalFrameDetalleFormCurso.jTextFieldcodigo_inscripcionCurso.setVisible(this.cursoConstantesFunciones.mostrarcodigo_inscripcionCurso);
		this.jInternalFrameDetalleFormCurso.jPanelcodigo_inscripcionCurso.setVisible(this.cursoConstantesFunciones.mostrarcodigo_inscripcionCurso);
		//this.jInternalFrameDetalleFormCurso.jDateChooserfecha_inicioCurso.setVisible(this.cursoConstantesFunciones.mostrarfecha_inicioCurso);
		this.jInternalFrameDetalleFormCurso.jPanelfecha_inicioCurso.setVisible(this.cursoConstantesFunciones.mostrarfecha_inicioCurso);
		//this.jInternalFrameDetalleFormCurso.jDateChooserfecha_finCurso.setVisible(this.cursoConstantesFunciones.mostrarfecha_finCurso);
		this.jInternalFrameDetalleFormCurso.jPanelfecha_finCurso.setVisible(this.cursoConstantesFunciones.mostrarfecha_finCurso);
		//this.jInternalFrameDetalleFormCurso.jTextFieldnumero_horasCurso.setVisible(this.cursoConstantesFunciones.mostrarnumero_horasCurso);
		this.jInternalFrameDetalleFormCurso.jPanelnumero_horasCurso.setVisible(this.cursoConstantesFunciones.mostrarnumero_horasCurso);
		//this.jInternalFrameDetalleFormCurso.jCheckBoxes_aprobadoCurso.setVisible(this.cursoConstantesFunciones.mostrares_aprobadoCurso);
		this.jInternalFrameDetalleFormCurso.jPaneles_aprobadoCurso.setVisible(this.cursoConstantesFunciones.mostrares_aprobadoCurso);
		//this.jInternalFrameDetalleFormCurso.jCheckBoxes_auspicio_empresaCurso.setVisible(this.cursoConstantesFunciones.mostrares_auspicio_empresaCurso);
		this.jInternalFrameDetalleFormCurso.jPaneles_auspicio_empresaCurso.setVisible(this.cursoConstantesFunciones.mostrares_auspicio_empresaCurso);
		//this.jInternalFrameDetalleFormCurso.jTextAreadescripcionCurso.setVisible(this.cursoConstantesFunciones.mostrardescripcionCurso);
		this.jInternalFrameDetalleFormCurso.jPaneldescripcionCurso.setVisible(this.cursoConstantesFunciones.mostrardescripcionCurso);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCurso() throws Exception {
		if(this.jInternalFrameDetalleFormCurso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCurso!=null) {
	
		this.jInternalFrameDetalleFormCurso.jLabelidCurso.setEnabled(this.cursoConstantesFunciones.activaridCurso);
		this.jInternalFrameDetalleFormCurso.jComboBoxid_empresaCurso.setEnabled(this.cursoConstantesFunciones.activarid_empresaCurso);
		this.jInternalFrameDetalleFormCurso.jComboBoxid_empleadoCurso.setEnabled(this.cursoConstantesFunciones.activarid_empleadoCurso);
			this.jInternalFrameDetalleFormCurso.jButtonid_empleadoCurso.setEnabled(this.cursoConstantesFunciones.activarid_empleadoCurso);
		this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_cursoCurso.setEnabled(this.cursoConstantesFunciones.activarid_tipo_cursoCurso);
		this.jInternalFrameDetalleFormCurso.jComboBoxid_tipo_institucionCurso.setEnabled(this.cursoConstantesFunciones.activarid_tipo_institucionCurso);
		this.jInternalFrameDetalleFormCurso.jTextAreanombreCurso.setEnabled(this.cursoConstantesFunciones.activarnombreCurso);
		this.jInternalFrameDetalleFormCurso.jTextFieldcodigo_inscripcionCurso.setEnabled(this.cursoConstantesFunciones.activarcodigo_inscripcionCurso);
		this.jInternalFrameDetalleFormCurso.jDateChooserfecha_inicioCurso.setEnabled(this.cursoConstantesFunciones.activarfecha_inicioCurso);
		this.jInternalFrameDetalleFormCurso.jDateChooserfecha_finCurso.setEnabled(this.cursoConstantesFunciones.activarfecha_finCurso);
		this.jInternalFrameDetalleFormCurso.jTextFieldnumero_horasCurso.setEnabled(this.cursoConstantesFunciones.activarnumero_horasCurso);
		this.jInternalFrameDetalleFormCurso.jCheckBoxes_aprobadoCurso.setEnabled(this.cursoConstantesFunciones.activares_aprobadoCurso);
		this.jInternalFrameDetalleFormCurso.jCheckBoxes_auspicio_empresaCurso.setEnabled(this.cursoConstantesFunciones.activares_auspicio_empresaCurso);
		this.jInternalFrameDetalleFormCurso.jTextAreadescripcionCurso.setEnabled(this.cursoConstantesFunciones.activardescripcionCurso);
		}
	}
	
		
}