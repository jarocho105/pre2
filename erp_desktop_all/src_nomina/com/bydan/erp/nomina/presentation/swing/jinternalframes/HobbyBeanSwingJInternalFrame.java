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

import com.bydan.erp.nomina.util.HobbyConstantesFunciones;
import com.bydan.erp.nomina.util.HobbyParameterReturnGeneral;
//import com.bydan.erp.nomina.util.HobbyParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.HobbyBean;
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
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class HobbyBeanSwingJInternalFrame extends HobbyJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(HobbyBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Hobby> hobbyValidator = new ClassValidator<Hobby>(Hobby.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Hobby hobby;	
	public Hobby hobbyAux;
	public Hobby hobbyAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Hobby hobbyTotales;
	public Long idHobbyActual;
	public Long iIdNuevoHobby=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosEmpleadoHobby=false;

	public Boolean getIsTienePermisosEmpleadoHobby() {
		return isTienePermisosEmpleadoHobby;
	}

	public void setIsTienePermisosEmpleadoHobby(Boolean isTienePermisosEmpleadoHobby) {
		this.isTienePermisosEmpleadoHobby= isTienePermisosEmpleadoHobby;
	}


	public Boolean isTienePermisosHobbyCliente=false;

	public Boolean getIsTienePermisosHobbyCliente() {
		return isTienePermisosHobbyCliente;
	}

	public void setIsTienePermisosHobbyCliente(Boolean isTienePermisosHobbyCliente) {
		this.isTienePermisosHobbyCliente= isTienePermisosHobbyCliente;
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
	
	public Boolean isPermisoTodoHobby;
	public Boolean isPermisoNuevoHobby;
	public Boolean isPermisoActualizarHobby;
	public Boolean isPermisoActualizarOriginalHobby;
	public Boolean isPermisoEliminarHobby;
	public Boolean isPermisoGuardarCambiosHobby;
	public Boolean isPermisoConsultaHobby;
	public Boolean isPermisoBusquedaHobby;
	public Boolean isPermisoReporteHobby;
	public Boolean isPermisoPaginacionMedioHobby;
	public Boolean isPermisoPaginacionAltoHobby;
	public Boolean isPermisoPaginacionTodoHobby;
	public Boolean isPermisoCopiarHobby;
	public Boolean isPermisoVerFormHobby;
	public Boolean isPermisoDuplicarHobby;
	public Boolean isPermisoOrdenHobby;
	
	
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
	
	public HobbyParameterReturnGeneral hobbyReturnGeneral;
	public HobbyParameterReturnGeneral hobbyParameterGeneral;
	
	

	public EmpleadoHobbyLogic empleadohobbyLogic=null;

	public EmpleadoHobbyLogic getEmpleadoHobbyLogic() {
		return empleadohobbyLogic;
	}

	public void setEmpleadoHobbyLogic(EmpleadoHobbyLogic empleadohobbyLogic) {
		this.empleadohobbyLogic = empleadohobbyLogic;
	}


	public HobbyClienteLogic hobbyclienteLogic=null;

	public HobbyClienteLogic getHobbyClienteLogic() {
		return hobbyclienteLogic;
	}

	public void setHobbyClienteLogic(HobbyClienteLogic hobbyclienteLogic) {
		this.hobbyclienteLogic = hobbyclienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoHobby=false;
	public Boolean esParaAccionDesdeFormularioHobby=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected HobbySessionBeanAdditional hobbySessionBeanAdditional=null;
	
	public HobbySessionBeanAdditional getHobbySessionBeanAdditional() {
		return this.hobbySessionBeanAdditional;
	}
	
	public void setHobbySessionBeanAdditional(HobbySessionBeanAdditional hobbySessionBeanAdditional) {
		try {
			this.hobbySessionBeanAdditional=hobbySessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected HobbyBeanSwingJInternalFrameAdditional hobbyBeanSwingJInternalFrameAdditional=null;
	//public class HobbyBeanSwingJInternalFrame
	
	public HobbyBeanSwingJInternalFrameAdditional getHobbyBeanSwingJInternalFrameAdditional() {
		return this.hobbyBeanSwingJInternalFrameAdditional;
	}
	
	public void setHobbyBeanSwingJInternalFrameAdditional(HobbyBeanSwingJInternalFrameAdditional hobbyBeanSwingJInternalFrameAdditional) {
		try {
			this.hobbyBeanSwingJInternalFrameAdditional=hobbyBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public HobbyLogic hobbyLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Hobby hobbyBean;
	public HobbyConstantesFunciones hobbyConstantesFunciones;
	//public HobbyParameterReturnGeneral hobbyReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Hobby> hobbys;	
	//public List<Hobby> hobbysEliminados;
	//public List<Hobby> hobbysAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoHobby=false;
	public Boolean isVisibilidadCeldaDuplicarHobby=true;
	public Boolean isVisibilidadCeldaCopiarHobby=true;
	public Boolean isVisibilidadCeldaVerFormHobby=true;
	public Boolean isVisibilidadCeldaOrdenHobby=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesHobby=false;
	public Boolean isVisibilidadCeldaModificarHobby=false;
	public Boolean isVisibilidadCeldaActualizarHobby=false;
	public Boolean isVisibilidadCeldaEliminarHobby=false;
	public Boolean isVisibilidadCeldaCancelarHobby=false;
	public Boolean isVisibilidadCeldaGuardarHobby=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosHobby=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoHobby() {
		return this.iIdNuevoHobby;
	}

	public void setiIdNuevoHobby(Long iIdNuevoHobby) {
		this.iIdNuevoHobby = iIdNuevoHobby;
	}
	
	public Long getidHobbyActual() {
		return this.idHobbyActual;
	}

	public void setidHobbyActual(Long idHobbyActual) {
		this.idHobbyActual = idHobbyActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Hobby gethobby() {
		return this.hobby;
	}

	public void sethobby(Hobby hobby) {
		this.hobby = hobby;
	}
	
	public Hobby gethobbyAux() {
		return this.hobbyAux;
	}

	public void sethobbyAux(Hobby hobbyAux) {
		this.hobbyAux = hobbyAux;
	}				
	
	public Hobby gethobbyAnterior() {
		return this.hobbyAnterior;
	}

	public void sethobbyAnterior(Hobby hobbyAnterior) {
		this.hobbyAnterior = hobbyAnterior;
	}	
	
	public Hobby gethobbyTotales() {
		return this.hobbyTotales;
	}

	public void sethobbyTotales(Hobby hobbyTotales) {
		this.hobbyTotales = hobbyTotales;
	}	
	
	public Hobby gethobbyBean() {
		return this.hobbyBean;
	}

	public void sethobbyBean(Hobby hobbyBean) {
		this.hobbyBean = hobbyBean;
	}	
	
	public HobbyParameterReturnGeneral gethobbyReturnGeneral() {
		return this.hobbyReturnGeneral;
	}

	public void sethobbyReturnGeneral(HobbyParameterReturnGeneral hobbyReturnGeneral) {
		this.hobbyReturnGeneral = hobbyReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public HobbyLogic getHobbyLogic()	{		
		return hobbyLogic;
	}

	public void setHobbyLogic(HobbyLogic hobbyLogic) {
		this.hobbyLogic = hobbyLogic;
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
	
	public Boolean getIsEsNuevoHobby() {
		return isEsNuevoHobby;
	}

	public void setIsEsNuevoHobby(Boolean isEsNuevoHobby) {
		this.isEsNuevoHobby = isEsNuevoHobby;
	}

	public Boolean getEsParaAccionDesdeFormularioHobby() {
		return esParaAccionDesdeFormularioHobby;
	}
	
	public void setEsParaAccionDesdeFormularioHobby(Boolean esParaAccionDesdeFormularioHobby) {
		this.esParaAccionDesdeFormularioHobby = esParaAccionDesdeFormularioHobby;
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

			if(this.hobbySessionBean==null) {
				this.hobbySessionBean=new HobbySessionBean();
			}

			if(!this.hobbySessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(hobbySessionBean.getlidEmpresaActual());
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

					if(this.hobby!=null) {
						this.hobby.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormHobby!=null) {
						this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaHobby.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormHobby!=null) {
						if(this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.getItemCount()>0) {
							this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaHobbyGenerico)throws Exception
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
				jComboBoxid_empresaHobbyGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaHobbyGenerico!=null && jComboBoxid_empresaHobbyGenerico.getItemCount()>0) {
					jComboBoxid_empresaHobbyGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Hobby hobby,JComboBox jComboBoxid_empresaHobbyGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaHobbyGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaHobbyGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				hobby.setid_empresa(empresaAux.getId());
				hobby.setempresa_descripcion(HobbyConstantesFunciones.getEmpresaDescripcion(empresaAux));
				hobby.setEmpresa(empresaAux);			}
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

					if(!HobbyJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHobby!=null) { 
							this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHobby!=null) { 
					}

					if(!HobbyJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHobby!=null) {
							this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormHobby!=null) {
							this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesHobby() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			HobbyConstantesFunciones.refrescarForeignKeysDescripcionesHobby(this.hobbyLogic.getHobbys());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			HobbyConstantesFunciones.refrescarForeignKeysDescripcionesHobby(this.hobbys);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//hobbyLogic.setHobbys(this.hobbys);
			hobbyLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public HobbyParameterReturnGeneral getHobbyParameterGeneral() {
		return this.hobbyParameterGeneral;
	}
	
	public void setHobbyParameterGeneral(HobbyParameterReturnGeneral hobbyParameterGeneral) {
		this.hobbyParameterGeneral = hobbyParameterGeneral;
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
	
	public Boolean getIsPermisoTodoHobby() {
		return isPermisoTodoHobby;
	}

	public void setIsPermisoTodoHobby(Boolean isPermisoTodoHobby) {
		this.isPermisoTodoHobby = isPermisoTodoHobby;
	}

	public Boolean getIsPermisoNuevoHobby() {
		return isPermisoNuevoHobby;
	}

	public void setIsPermisoNuevoHobby(Boolean isPermisoNuevoHobby) {
		this.isPermisoNuevoHobby = isPermisoNuevoHobby;
	}

	public Boolean getIsPermisoActualizarHobby() {
		return isPermisoActualizarHobby;
	}

	public void setIsPermisoActualizarHobby(Boolean isPermisoActualizarHobby) {
		this.isPermisoActualizarHobby = isPermisoActualizarHobby;
	}

	public Boolean getIsPermisoEliminarHobby() {
		return isPermisoEliminarHobby;
	}

	public void setIsPermisoEliminarHobby(Boolean isPermisoEliminarHobby) {
		this.isPermisoEliminarHobby = isPermisoEliminarHobby;
	}

	public Boolean getIsPermisoGuardarCambiosHobby() {
		return isPermisoGuardarCambiosHobby;
	}

	public void setIsPermisoGuardarCambiosHobby(Boolean isPermisoGuardarCambiosHobby) {
		this.isPermisoGuardarCambiosHobby = isPermisoGuardarCambiosHobby;
	}
	
	public Boolean getIsPermisoConsultaHobby() {
		return isPermisoConsultaHobby;
	}

	public void setIsPermisoConsultaHobby(Boolean isPermisoConsultaHobby) {
		this.isPermisoConsultaHobby = isPermisoConsultaHobby;
	}

	public Boolean getIsPermisoBusquedaHobby() {
		return isPermisoBusquedaHobby;
	}

	public void setIsPermisoBusquedaHobby(Boolean isPermisoBusquedaHobby) {
		this.isPermisoBusquedaHobby = isPermisoBusquedaHobby;
	}

	public Boolean getIsPermisoReporteHobby() {
		return isPermisoReporteHobby;
	}

	public void setIsPermisoReporteHobby(Boolean isPermisoReporteHobby) {
		this.isPermisoReporteHobby = isPermisoReporteHobby;
	}
	
	public Boolean getIsPermisoPaginacionMedioHobby() {
		return isPermisoPaginacionMedioHobby;
	}

	public void setIsPermisoPaginacionMedioHobby(Boolean isPermisoPaginacionMedioHobby) {
		this.isPermisoPaginacionMedioHobby = isPermisoPaginacionMedioHobby;
	}
	
	public Boolean getIsPermisoPaginacionTodoHobby() {
		return isPermisoPaginacionTodoHobby;
	}

	public void setIsPermisoPaginacionTodoHobby(Boolean isPermisoPaginacionTodoHobby) {
		this.isPermisoPaginacionTodoHobby = isPermisoPaginacionTodoHobby;
	}
	
	public Boolean getIsPermisoPaginacionAltoHobby() {
		return isPermisoPaginacionAltoHobby;
	}

	public void setIsPermisoPaginacionAltoHobby(Boolean isPermisoPaginacionAltoHobby) {
		this.isPermisoPaginacionAltoHobby = isPermisoPaginacionAltoHobby;
	}
	
	public Boolean getIsPermisoCopiarHobby() {
		return isPermisoCopiarHobby;
	}

	public void setIsPermisoCopiarHobby(Boolean isPermisoCopiarHobby) {
		this.isPermisoCopiarHobby = isPermisoCopiarHobby;
	}
	
	public Boolean getIsPermisoVerFormHobby() {
		return isPermisoVerFormHobby;
	}

	public void setIsPermisoVerFormHobby(Boolean isPermisoVerFormHobby) {
		this.isPermisoVerFormHobby = isPermisoVerFormHobby;
	}
	
	public Boolean getIsPermisoDuplicarHobby() {
		return isPermisoDuplicarHobby;
	}

	public void setIsPermisoDuplicarHobby(Boolean isPermisoDuplicarHobby) {
		this.isPermisoDuplicarHobby = isPermisoDuplicarHobby;
	}
	
	public Boolean getIsPermisoOrdenHobby() {
		return isPermisoOrdenHobby;
	}

	public void setIsPermisoOrdenHobby(Boolean isPermisoOrdenHobby) {
		this.isPermisoOrdenHobby = isPermisoOrdenHobby;
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
	
	public Boolean getIsVisibilidadCeldaNuevoHobby() {
		return isVisibilidadCeldaNuevoHobby;
	}

	public void setIsVisibilidadCeldaNuevoHobby(Boolean isVisibilidadCeldaNuevoHobby) {
		this.isVisibilidadCeldaNuevoHobby = isVisibilidadCeldaNuevoHobby;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarHobby() {
		return isVisibilidadCeldaDuplicarHobby;
	}

	public void setIsVisibilidadCeldaDuplicarHobby(Boolean isVisibilidadCeldaDuplicarHobby) {
		this.isVisibilidadCeldaDuplicarHobby = isVisibilidadCeldaDuplicarHobby;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarHobby() {
		return isVisibilidadCeldaCopiarHobby;
	}

	public void setIsVisibilidadCeldaCopiarHobby(Boolean isVisibilidadCeldaCopiarHobby) {
		this.isVisibilidadCeldaCopiarHobby = isVisibilidadCeldaCopiarHobby;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormHobby() {
		return isVisibilidadCeldaVerFormHobby;
	}

	public void setIsVisibilidadCeldaVerFormHobby(Boolean isVisibilidadCeldaVerFormHobby) {
		this.isVisibilidadCeldaVerFormHobby = isVisibilidadCeldaVerFormHobby;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenHobby() {
		return isVisibilidadCeldaOrdenHobby;
	}

	public void setIsVisibilidadCeldaOrdenHobby(Boolean isVisibilidadCeldaOrdenHobby) {
		this.isVisibilidadCeldaOrdenHobby = isVisibilidadCeldaOrdenHobby;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesHobby() {
		return isVisibilidadCeldaNuevoRelacionesHobby;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesHobby(Boolean isVisibilidadCeldaNuevoRelacionesHobby) {
		this.isVisibilidadCeldaNuevoRelacionesHobby = isVisibilidadCeldaNuevoRelacionesHobby;
	}
	
	public Boolean getIsVisibilidadCeldaModificarHobby() {
		return isVisibilidadCeldaModificarHobby;
	}

	public void setIsVisibilidadCeldaModificarHobby(Boolean isVisibilidadCeldaModificarHobby) {
		this.isVisibilidadCeldaModificarHobby = isVisibilidadCeldaModificarHobby;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarHobby() {
		return isVisibilidadCeldaActualizarHobby;
	}

	public void setIsVisibilidadCeldaActualizarHobby(Boolean isVisibilidadCeldaActualizarHobby) {
		this.isVisibilidadCeldaActualizarHobby = isVisibilidadCeldaActualizarHobby;
	}

	public Boolean getIsVisibilidadCeldaEliminarHobby() {
		return isVisibilidadCeldaEliminarHobby;
	}

	public void setIsVisibilidadCeldaEliminarHobby(Boolean isVisibilidadCeldaEliminarHobby) {
		this.isVisibilidadCeldaEliminarHobby = isVisibilidadCeldaEliminarHobby;
	}

	public Boolean getIsVisibilidadCeldaCancelarHobby() {
		return isVisibilidadCeldaCancelarHobby;
	}

	public void setIsVisibilidadCeldaCancelarHobby(Boolean isVisibilidadCeldaCancelarHobby) {
		this.isVisibilidadCeldaCancelarHobby = isVisibilidadCeldaCancelarHobby;
	}

	public Boolean getIsVisibilidadCeldaGuardarHobby() {
		return isVisibilidadCeldaGuardarHobby;
	}

	public void setIsVisibilidadCeldaGuardarHobby(Boolean isVisibilidadCeldaGuardarHobby) {
		this.isVisibilidadCeldaGuardarHobby = isVisibilidadCeldaGuardarHobby;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosHobby() {
		return isVisibilidadCeldaGuardarCambiosHobby;
	}

	public void setIsVisibilidadCeldaGuardarCambiosHobby(Boolean isVisibilidadCeldaGuardarCambiosHobby) {
		this.isVisibilidadCeldaGuardarCambiosHobby = isVisibilidadCeldaGuardarCambiosHobby;
	}
		
	public HobbySessionBean gethobbySessionBean() {
		return this.hobbySessionBean;
	}
	
	public void sethobbySessionBean(HobbySessionBean hobbySessionBean) {
		this.hobbySessionBean=hobbySessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysHobby(Hobby hobby)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(hobby,null);
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
	
	public void bugActualizarReferenciaActual(Hobby hobby,Hobby hobbyAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalHobby(hobby);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		hobbyAux.setId(hobby.getId());
		hobbyAux.setVersionRow(hobby.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessHobby();
		
			int intSelectedRow = this.jTableDatosHobby.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(HobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualHobby(this.hobby,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = hobbyValidator.getInvalidValues(this.hobby);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			hobbyLogic.setDatosCliente(datosCliente);
			hobbyLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				hobbyAux=new  Hobby();
				
				hobbyAux.setIsNew(true);
				hobbyAux.setIsChanged(true);
				
				hobbyAux.setHobbyOriginal(this.hobby);
				
				hobbyAux.setId(this.hobby.getId());	
				hobbyAux.setVersionRow(this.hobby.getVersionRow());	
				hobbyAux.setid_empresa(this.hobby.getid_empresa());	
				hobbyAux.setcodigo(this.hobby.getcodigo());	
				hobbyAux.setnombre(this.hobby.getnombre());	
				hobbyAux.setdescripcion(this.hobby.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.hobbySessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.hobbySessionBean.getEsGuardarRelacionado())	{
						actualizarLista(hobbyAux,hobbyLogic.getHobbys());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(hobbyAux,hobbys);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.hobbySessionBean.getEstaModoGuardarRelaciones() 
						&& !this.hobbySessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyLogic.saveHobbys();//WithConnection
						//hobbyLogic.getSetVersionRowHobbys();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.hobby,hobbyAux);
					
					this.refrescarForeignKeysDescripcionesHobby();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.hobbySessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.getEmpleadoHobbys().addAll(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbysEliminados);
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.getHobbyClientes().addAll(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbys.addAll(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbysEliminados);
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientes.addAll(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								hobbyLogic.saveHobbyRelaciones(hobbyAux,this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.getEmpleadoHobbys(),this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.getHobbyClientes());//WithConnection
								//hobbyLogic.getSetVersionRowHobbys();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.hobby,hobbyAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.setEmpleadoHobbys(new ArrayList<EmpleadoHobby>());
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.setHobbyClientes(new ArrayList<HobbyCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbys= new ArrayList<EmpleadoHobby>();
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientes= new ArrayList<HobbyCliente>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.quitarFilaTotales();}
							hobbyAux.setEmpleadoHobbys(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.getEmpleadoHobbys());

							if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							hobbyAux.setHobbyClientes(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.getHobbyClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.hobbySessionBean.getEstaModoGuardarRelaciones() 
									|| this.hobbySessionBean.getEsGuardarRelacionado())	{
									actualizarLista(hobbyAux,hobbyLogic.getHobbys());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(hobbyAux,hobbys);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.hobby,hobbyAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				hobbyAux=new  Hobby();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.hobbySessionBean.getEsGuardarRelacionado() 
					|| (this.hobbySessionBean.getEsGuardarRelacionado() && this.hobby.getId()>=0)) {
						
					hobbyAux.setIsNew(false);
				}
				
				hobbyAux.setIsDeleted(false);
			
				hobbyAux.setId(this.hobby.getId());	
				hobbyAux.setVersionRow(this.hobby.getVersionRow());	
				hobbyAux.setid_empresa(this.hobby.getid_empresa());	
				hobbyAux.setcodigo(this.hobby.getcodigo());	
				hobbyAux.setnombre(this.hobby.getnombre());	
				hobbyAux.setdescripcion(this.hobby.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(hobbyAux,hobbyLogic.getHobbys());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(hobbyAux,hobbys);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.hobbySessionBean.getEstaModoGuardarRelaciones() 
						&& !this.hobbySessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyLogic.saveHobbys();//WithConnection
						//hobbyLogic.getSetVersionRowHobbys();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.hobby,hobbyAux);
					
					this.refrescarForeignKeysDescripcionesHobby();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.hobbySessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.getEmpleadoHobbys().addAll(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbysEliminados);
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.getHobbyClientes().addAll(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbys.addAll(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbysEliminados);
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientes.addAll(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								hobbyLogic.saveHobbyRelaciones(hobbyAux,this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.getEmpleadoHobbys(),this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.getHobbyClientes());//WithConnection
								//hobbyLogic.getSetVersionRowHobbys();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.hobby,hobbyAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.setEmpleadoHobbys(new ArrayList<EmpleadoHobby>());
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.setHobbyClientes(new ArrayList<HobbyCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbys= new ArrayList<EmpleadoHobby>();
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientes= new ArrayList<HobbyCliente>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.quitarFilaTotales();}
							hobbyAux.setEmpleadoHobbys(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.getEmpleadoHobbys());

							if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							hobbyAux.setHobbyClientes(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.getHobbyClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.hobbySessionBean.getEstaModoGuardarRelaciones() 
									|| this.hobbySessionBean.getEsGuardarRelacionado())	{
									actualizarLista(hobbyAux,hobbyLogic.getHobbys());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(hobbyAux,hobbys);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.hobby,hobbyAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				hobbyAux=new  Hobby();
				
				hobbyAux.setIsNew(false);
				hobbyAux.setIsChanged(false);
				
				hobbyAux.setIsDeleted(true);
				
				hobbyAux.setId(this.hobby.getId());	
				hobbyAux.setVersionRow(this.hobby.getVersionRow());	
				hobbyAux.setid_empresa(this.hobby.getid_empresa());	
				hobbyAux.setcodigo(this.hobby.getcodigo());	
				hobbyAux.setnombre(this.hobby.getnombre());	
				hobbyAux.setdescripcion(this.hobby.getdescripcion());	
				
				if(this.hobbySessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.hobbyAux.getId()>=0) {	
						this.hobbysEliminados.add(hobbyAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(hobbyAux,hobbyLogic.getHobbys());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(hobbyAux,hobbys);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.hobbySessionBean.getEstaModoGuardarRelaciones() 
						&& !this.hobbySessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyLogic.saveHobbys();//WithConnection
						//hobbyLogic.getSetVersionRowHobbys();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.hobbySessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.getEmpleadoHobbys().addAll(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbysEliminados);
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.getHobbyClientes().addAll(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbys.addAll(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbysEliminados);
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientes.addAll(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								hobbyLogic.saveHobbyRelaciones(hobbyAux,this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.getEmpleadoHobbys(),this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.getHobbyClientes());//WithConnection
								//hobbyLogic.getSetVersionRowHobbys();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.setEmpleadoHobbys(new ArrayList<EmpleadoHobby>());
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.setHobbyClientes(new ArrayList<HobbyCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbys= new ArrayList<EmpleadoHobby>();
							this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientes= new ArrayList<HobbyCliente>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.quitarFilaTotales();}
							hobbyAux.setEmpleadoHobbys(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.getEmpleadoHobbys());

							if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							hobbyAux.setHobbyClientes(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.getHobbyClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.hobbySessionBean.getEstaModoGuardarRelaciones() 
								|| this.hobbySessionBean.getEsGuardarRelacionado())	{
								actualizarLista(hobbyAux,hobbyLogic.getHobbys());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(hobbyAux,hobbys);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.getHobbys().addAll(this.hobbysEliminados);
					
					hobbyLogic.saveHobbys();//WithConnection
					//hobbyLogic.getSetVersionRowHobbys();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesHobby();
				
				this.hobbysEliminados= new ArrayList<Hobby>();		
			}
			
			if(this.hobbySessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Hobby GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Hobby",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.hobby=hobbyAux;
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
      		//this.finishProcessHobby();
      	}
		
	}	
	
	public void actualizarRelaciones(Hobby hobbyLocal) throws Exception {
		
		if(this.hobbySessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				hobbyLocal.setEmpleadoHobbys(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.getEmpleadoHobbys());
				hobbyLocal.setHobbyClientes(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.getHobbyClientes());
			
			} else {
			
				hobbyLocal.setEmpleadoHobbys(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbys);
				hobbyLocal.setHobbyClientes(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Hobby hobbyLocal) throws Exception {	
		if(this.hobbySessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				hobbyLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarHobbyActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosHobby.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = hobbyValidator.getInvalidValues(this.hobby);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Hobby hobby,List<Hobby> hobbys) throws Exception {
		try	{		
			HobbyConstantesFunciones.actualizarLista(hobby,hobbys,this.hobbySessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Hobby hobby,List<Hobby> hobbys) throws Exception {
		try	{			
			HobbyConstantesFunciones.actualizarSelectedLista(hobby,hobbys);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Hobby> hobbysLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				hobbysLocal=this.hobbyLogic.getHobbys();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				hobbysLocal=this.hobbys;
			}
			//ARCHITECTURE
		
			for(Hobby hobbyLocal:hobbysLocal) {
				if(this.permiteMantenimiento(hobbyLocal) && hobbyLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+HobbyConstantesFunciones.getHobbyLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(HobbyConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobby.jLabelid_empresaHobby,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HobbyConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobby.jLabelcodigoHobby,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HobbyConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobby.jLabelnombreHobby,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HobbyConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobby.jLabeldescripcionHobby,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormHobby!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHobby.jLabelid_empresaHobby,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHobby.jLabelcodigoHobby,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHobby.jLabelnombreHobby,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHobby.jLabeldescripcionHobby,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("EmpleadoHobby")) {
			if(this.hobby==null) {
				this.hobby= new Hobby();
			}

			if(this.hobbySessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoHobby
				this.setVariablesFormularioToObjetoActualHobby(this.hobby,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);

				this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.getempleadohobby().setHobby(this.hobby);
			}

			return;
		}
		 else  if(sTipo.equals("HobbyCliente")) {
			if(this.hobby==null) {
				this.hobby= new Hobby();
			}

			if(this.hobbySessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoHobby
				this.setVariablesFormularioToObjetoActualHobby(this.hobby,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);

				this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.gethobbycliente().setHobby(this.hobby);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoHobby--;	
		
		
		this.hobbyAux=new Hobby();
		
		this.hobbyAux.setId(this.iIdNuevoHobby);
		this.hobbyAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.hobbyLogic.getHobbys().add(this.hobbyAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.hobbys.add(this.hobbyAux);
		}
		//ARCHITECTURE
		
		this.hobby=this.hobbyAux;
		
		if(HobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioHobby(this.hobby);
			this.setVariablesObjetoActualToFormularioForeignKeyHobby(this.hobby);
		}
				
		//this.setDefaultControlesHobby();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyHobby();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyHobby();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyHobby();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHobby(this.hobbyBean,this.hobby,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(HobbyConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.hobbySessionBean.getConGuardarRelaciones()) {
			classes=HobbyConstantesFunciones.getClassesRelationshipsOfHobby(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.hobbyReturnGeneral=hobbyLogic.procesarEventosHobbysWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.hobbyLogic.getHobbys(),this.hobby,this.hobbyParameterGeneral,this.isEsNuevoHobby,classes);//this.hobbyLogic.getHobby()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanHobby(this.hobbyReturnGeneral,this.hobbyBean,false);
		
		if(this.hobbyReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyHobby(this.hobbyReturnGeneral.getHobby());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioHobby(this.hobbyReturnGeneral.getHobby());
		}
		
		if(this.hobbyReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioHobby(this.hobbyReturnGeneral.getHobby(),classes);//this.hobbyBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualHobby(this.hobby,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyHobby();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyHobby();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HobbyBeanSwingJInternalFrameAdditional.RecargarFormHobby(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingHobby(false);
						
			if(hobbySessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.getEsGuardarRelacionado() && EmpleadoHobbyJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoHobbyActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.getEsGuardarRelacionado() && HobbyClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonHobbyClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(HobbyJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHobby();
			}
			
			this.actualizarVisualTableDatosHobby();
			
			this.jTableDatosHobby.setRowSelectionInterval(this.getIndiceNuevoHobby(), this.getIndiceNuevoHobby());
			
			this.seleccionarFilaTablaHobbyActual();
						
			this.actualizarEstadoCeldasBotonesHobby("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesHobby(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormHobby.jTextFieldcodigoHobby.setEnabled(isHabilitar && this.hobbyConstantesFunciones.activarcodigoHobby);
		this.jInternalFrameDetalleFormHobby.jTextAreanombreHobby.setEnabled(isHabilitar && this.hobbyConstantesFunciones.activarnombreHobby);
		this.jInternalFrameDetalleFormHobby.jTextAreadescripcionHobby.setEnabled(isHabilitar && this.hobbyConstantesFunciones.activardescripcionHobby);	
		//
		this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.setEnabled(isHabilitar && this.hobbyConstantesFunciones.activarid_empresaHobby);
	};
	
	public void setDefaultControlesHobby() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoHobby(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.hobbySessionBean.setConGuardarRelaciones(true);			
			this.hobbySessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormHobby.jTabbedPaneRelacionesHobby.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.hobbySessionBean.setConGuardarRelaciones(false);			
			this.hobbySessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormHobby.jTabbedPaneRelacionesHobby.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoHobby() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Hobby hobbyAux:this.hobbyLogic.getHobbys()) {
				if(hobbyAux.getId().equals(this.iIdNuevoHobby)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Hobby hobbyAux:this.hobbys) {
				if(hobbyAux.getId().equals(this.iIdNuevoHobby)) {
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
	
	public int getIndiceActualHobby(Hobby hobby,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Hobby hobbyAux:this.hobbyLogic.getHobbys()) {
				if(hobbyAux.getId().equals(hobby.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Hobby hobbyAux:this.hobbys) {
				if(hobbyAux.getId().equals(hobby.getId())) {
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
	
	public void setCamposBaseDesdeOriginalHobby(Hobby hobbyOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Hobby hobbyAux:this.hobbyLogic.getHobbys()) {
				if(hobbyAux.getHobbyOriginal().getId().equals(hobbyOriginal.getId())) {
					existe=true;
					hobbyOriginal.setId(hobbyAux.getId());
					hobbyOriginal.setVersionRow(hobbyAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Hobby hobbyAux:this.hobbys) {
				if(hobbyAux.getHobbyOriginal().getId().equals(hobbyOriginal.getId())) {
					existe=true;
					hobbyOriginal.setId(hobbyAux.getId());
					hobbyOriginal.setVersionRow(hobbyAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosHobby(Boolean esParaCancelar) throws Exception {
		hobbysAux=new ArrayList<Hobby>();
		hobbyAux=new Hobby();
		
		if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Hobby hobbyAux:this.hobbyLogic.getHobbys()) {
					if(hobbyAux.getId()<0) {
						hobbysAux.add(hobbyAux);
					}		
				}
				this.iIdNuevoHobby=0L;
				this.hobbyLogic.getHobbys().removeAll(hobbysAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Hobby hobbyAux:this.hobbys) {
					if(hobbyAux.getId()<0) {
						hobbysAux.add(hobbyAux);
					}		
				}
				this.iIdNuevoHobby=0L;
				this.hobbys.removeAll(hobbysAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoHobby 
					&& this.hobbyLogic.getHobbys().size()>0
					) {
					hobbyAux=this.hobbyLogic.getHobbys().get(this.hobbyLogic.getHobbys().size() - 1);
				
					if(hobbyAux.getId()<0) {
						this.hobbyLogic.getHobbys().remove(hobbyAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoHobby && this.hobbys.size()>0) {
					hobbyAux=this.hobbys.get(this.hobbys.size() - 1);
				
					if(hobbyAux.getId()<0) {
						this.hobbys.remove(hobbyAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoHobby(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(hobby.getId()<0) {
				this.hobbyLogic.getHobbys().remove(this.hobby);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(hobby.getId()<0) {
				this.hobbys.remove(this.hobby);
			}
		}			
	}
	
	public void setEstadosInicialesHobby(List<Hobby> hobbysAux) throws Exception {
		HobbyConstantesFunciones.setEstadosInicialesHobby(hobbysAux);
	}
	
	public void setEstadosInicialesHobby(Hobby hobbyAux) throws Exception {
		HobbyConstantesFunciones.setEstadosInicialesHobby(hobbyAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarHobbyActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarHobbyActual()) {
				if(!this.isEsNuevoHobby) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoHobby=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarHobbyActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Hobby ?", "MANTENIMIENTO DE Hobby", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Hobby hobby) throws Exception {
		HobbyConstantesFunciones.seleccionarAsignar(this.hobby,hobby);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarHobby=this.isPermisoActualizarOriginalHobby;
			
			
			this.seleccionarAsignar(hobby);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HobbyConstantesFunciones.quitarEspaciosHobby(this.hobby,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesHobby("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.hobbySessionBean.setsFuncionBusquedaRapida(this.hobbySessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoHobby) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosHobby(esParaCancelar);				
				this.cancelarNuevoHobby(esParaCancelar);								
			}
			
			this.hobby=new Hobby();
			
			this.inicializarHobby();
			
			this.actualizarEstadoCeldasBotonesHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarHobby() throws Exception {
		try {
			HobbyConstantesFunciones.inicializarHobby(this.hobby);
			
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
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.hobbyLogic.getHobbys().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteHobbys(String sAccionBusqueda,List<Hobby> hobbysParaReportes) throws Exception {
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
					sPathReporteFinal="Hobby"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="HobbyMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("HobbyMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Hobby"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Hobbyes");		
		parameters.put("busquedapor", HobbyConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(EmpleadoHobby.class));
			classes.add(new Classe(HobbyCliente.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					HobbyLogic hobbyLogicAuxiliar=new HobbyLogic();
					hobbyLogicAuxiliar.setDatosCliente(hobbyLogic.getDatosCliente());				
					hobbyLogicAuxiliar.setHobbys(hobbysParaReportes);
					
					hobbyLogicAuxiliar.cargarRelacionesLoteForeignKeyHobbyWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					hobbysParaReportes=hobbyLogicAuxiliar.getHobbys();
					
					//hobbyLogic.getNewConnexionToDeep();
					
					//for (Hobby hobby:hobbysParaReportes) {
					//	hobbyLogic.deepLoad(hobby, false, DeepLoadType.INCLUDE, classes);
					//}						
					//hobbyLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//hobbyLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEmpleadoHobby = AuxiliarReportes.class.getResourceAsStream("EmpleadoHobbyDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleadohobby", reportFileEmpleadoHobby);

			InputStream reportFileHobbyCliente = AuxiliarReportes.class.getResourceAsStream("HobbyClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_hobbycliente", reportFileHobbyCliente);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceHobby=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			HobbyConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			HobbyConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceHobby=new JRBeanArrayDataSource(HobbyJInternalFrame.TraerHobbyBeans(hobbysParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceHobby);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+HobbyConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+HobbyConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(HobbyBean.TraerHobbyBeans(hobbysParaReportes).toArray()));
							
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
				this.generarExcelReporteHobbys(sAccionBusqueda,sTipoArchivoReporte,hobbysParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalHobbys(sAccionBusqueda,sTipoArchivoReporte,hobbysParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoHobbyActionPerformed(null);
					//this.generarExcelReporteHobbys(sAccionBusqueda,sTipoArchivoReporte,hobbysParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalHobbys(sAccionBusqueda,sTipoArchivoReporte,hobbysParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesHobbys(sAccionBusqueda,sTipoArchivoReporte,hobbysParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesHobbys(sAccionBusqueda,sTipoArchivoReporte,hobbysParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHobbys(String sAccionBusqueda,String sTipoArchivoReporte,List<Hobby> hobbysParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobby";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Hobbys");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHobby("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Hobby hobby : hobbysParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			HobbyConstantesFunciones.generarExcelReporteDataHobby("NORMAL",row,workbook,hobby,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderHobby(String sTipo,Row row,Workbook workbook) {
		
		HobbyConstantesFunciones.generarExcelReporteHeaderHobby(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalHobbys(String sAccionBusqueda,String sTipoArchivoReporte,List<Hobby> hobbysParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobby_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Hobbys");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Hobby hobby : hobbysParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(HobbyConstantesFunciones.getHobbyDescripcion(hobby));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HobbyConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HobbyConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(hobby.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HobbyConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HobbyConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(hobby.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HobbyConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HobbyConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(hobby.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HobbyConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HobbyConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(hobby.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesHobbys(String sAccionBusqueda,String sTipoArchivoReporte,List<Hobby> hobbysParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Hobby> hobbysRespaldo=null;
		
		classes=HobbyConstantesFunciones.getClassesRelationshipsOfHobby(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.hobbyLogic.setDatosCliente(this.datosCliente);
		this.hobbyLogic.setDatosDeep(this.datosDeep);
		this.hobbyLogic.setIsConDeep(true);
		
		hobbysRespaldo=this.hobbyLogic.getHobbys();
		
		this.hobbyLogic.setHobbys(hobbysParaReportes);	
		this.hobbyLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		hobbysParaReportes=this.hobbyLogic.getHobbys();
		this.hobbyLogic.setHobbys(hobbysRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobby_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Hobbys");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHobby("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Hobby hobby : hobbysParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderHobby("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			HobbyConstantesFunciones.generarExcelReporteDataHobby("NORMAL",row,workbook,hobby,cellStyleDataAux);
		
			
			


				//EmpleadoHobby
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO))) {

				if(hobby.getEmpleadoHobbys()!=null && hobby.getEmpleadoHobbys().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoHobbyConstantesFunciones.generarExcelReporteHeaderEmpleadoHobby("RELACIONADO",row,workbook);
				}

				if(hobby.getEmpleadoHobbys()!=null) {
					i2=0;
					for(EmpleadoHobby empleadohobby : hobby.getEmpleadoHobbys()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoHobbyConstantesFunciones.generarExcelReporteDataEmpleadoHobby("RELACIONADO",row,workbook,empleadohobby,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//HobbyCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(HobbyClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(hobby.getHobbyClientes()!=null && hobby.getHobbyClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(HobbyClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					HobbyClienteConstantesFunciones.generarExcelReporteHeaderHobbyCliente("RELACIONADO",row,workbook);
				}

				if(hobby.getHobbyClientes()!=null) {
					i2=0;
					for(HobbyCliente hobbycliente : hobby.getHobbyClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						HobbyClienteConstantesFunciones.generarExcelReporteDataHobbyCliente("RELACIONADO",row,workbook,hobbycliente,cellStyleDataAuxHijo);
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
		cell.setCellValue(HobbyConstantesFunciones.getHobbyDescripcion(hobby));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoHobby.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHobby.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoHobby.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHobby.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessHobby() throws Exception {		
		this.startProcessHobby(true);
	}
	
	public void startProcessHobby(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasHobby ,this.jPanelParametrosReportesHobby, this.jScrollPanelDatosHobby,this.jPanelPaginacionHobby, this.jScrollPanelDatosEdicionHobby, this.jPanelAccionesHobby,this.jPanelAccionesFormularioHobby,this.jmenuBarHobby,this.jmenuBarDetalleHobby,this.jTtoolBarHobby,this.jTtoolBarDetalleHobby);		
		
		final JTabbedPane jTabbedPaneBusquedasHobby=this.jTabbedPaneBusquedasHobby; 
		
		final JPanel jPanelParametrosReportesHobby=this.jPanelParametrosReportesHobby;
		//final JScrollPane jScrollPanelDatosHobby=this.jScrollPanelDatosHobby;
		final JTable jTableDatosHobby=this.jTableDatosHobby;		
		final JPanel jPanelPaginacionHobby=this.jPanelPaginacionHobby;
		//final JScrollPane jScrollPanelDatosEdicionHobby=this.jScrollPanelDatosEdicionHobby;
		final JPanel jPanelAccionesHobby=this.jPanelAccionesHobby;
		
		JPanel jPanelCamposAuxiliarHobby=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarHobby=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormHobby!=null) {
			jPanelCamposAuxiliarHobby=this.jInternalFrameDetalleFormHobby.jPanelCamposHobby;
			jPanelAccionesFormularioAuxiliarHobby=this.jInternalFrameDetalleFormHobby.jPanelAccionesFormularioHobby;
		}
		
		final JPanel jPanelCamposHobby=jPanelCamposAuxiliarHobby;
		final JPanel jPanelAccionesFormularioHobby=jPanelAccionesFormularioAuxiliarHobby;
		
		
		final JMenuBar jmenuBarHobby=this.jmenuBarHobby;
		final JToolBar jTtoolBarHobby=this.jTtoolBarHobby;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarHobby=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHobby=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormHobby!=null) {
			jmenuBarDetalleAuxiliarHobby=this.jInternalFrameDetalleFormHobby.jmenuBarDetalleHobby;
			jTtoolBarDetalleAuxiliarHobby=this.jInternalFrameDetalleFormHobby.jTtoolBarDetalleHobby;
		}
		
		final JMenuBar jmenuBarDetalleHobby=jmenuBarDetalleAuxiliarHobby;
		final JToolBar jTtoolBarDetalleHobby=jTtoolBarDetalleAuxiliarHobby;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHobby;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHobby;
			processRunnable.jTableDatos=jTableDatosHobby;
			processRunnable.jPanelCampos=jPanelCamposHobby;
			processRunnable.jPanelPaginacion=jPanelPaginacionHobby;
			processRunnable.jPanelAcciones=jPanelAccionesHobby;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHobby;
			
			
			processRunnable.jmenuBar=jmenuBarHobby;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHobby;
			processRunnable.jTtoolBar=jTtoolBarHobby;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHobby;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHobby ,jPanelParametrosReportesHobby,jTableDatosHobby, /*jScrollPanelDatosHobby,*/jPanelCamposHobby,jPanelPaginacionHobby, /*jScrollPanelDatosEdicionHobby,*/ jPanelAccionesHobby,jPanelAccionesFormularioHobby,jmenuBarHobby,jmenuBarDetalleHobby,jTtoolBarHobby,jTtoolBarDetalleHobby);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHobby ,jPanelParametrosReportesHobby, jScrollPanelDatosHobby,jPanelPaginacionHobby, jScrollPanelDatosEdicionHobby, jPanelAccionesHobby,jPanelAccionesFormularioHobby,jmenuBarHobby,jmenuBarDetalleHobby,jTtoolBarHobby,jTtoolBarDetalleHobby);
						
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
	
	public void finishProcessHobby() {// throws Exception 
		this.finishProcessHobby(true);
	}
	
	public void finishProcessHobby(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasHobby ,this.jPanelParametrosReportesHobby, this.jScrollPanelDatosHobby,this.jPanelPaginacionHobby, this.jScrollPanelDatosEdicionHobby, this.jPanelAccionesHobby,this.jPanelAccionesFormularioHobby,this.jmenuBarHobby,this.jmenuBarDetalleHobby,this.jTtoolBarHobby,this.jTtoolBarDetalleHobby);		
		
		final JTabbedPane jTabbedPaneBusquedasHobby=this.jTabbedPaneBusquedasHobby; 
		
		final JPanel jPanelParametrosReportesHobby=this.jPanelParametrosReportesHobby;
		//final JScrollPane jScrollPanelDatosHobby=this.jScrollPanelDatosHobby;
		final JTable jTableDatosHobby=this.jTableDatosHobby;		
		final JPanel jPanelPaginacionHobby=this.jPanelPaginacionHobby;
		//final JScrollPane jScrollPanelDatosEdicionHobby=this.jScrollPanelDatosEdicionHobby;
		final JPanel jPanelAccionesHobby=this.jPanelAccionesHobby;
		
		JPanel jPanelCamposAuxiliarHobby=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarHobby=new JPanel();
		
		if(this.jInternalFrameDetalleFormHobby!=null) {
			jPanelCamposAuxiliarHobby=this.jInternalFrameDetalleFormHobby.jPanelCamposHobby;
			jPanelAccionesFormularioAuxiliarHobby=this.jInternalFrameDetalleFormHobby.jPanelAccionesFormularioHobby;
		}
		
		final JPanel jPanelCamposHobby=jPanelCamposAuxiliarHobby;
		final JPanel jPanelAccionesFormularioHobby=jPanelAccionesFormularioAuxiliarHobby;
		
		
		final JMenuBar jmenuBarHobby=this.jmenuBarHobby;		
		final JToolBar jTtoolBarHobby=this.jTtoolBarHobby;
				
		JMenuBar jmenuBarDetalleAuxiliarHobby=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHobby=new JToolBar();
		
		if(this.jInternalFrameDetalleFormHobby!=null) {
			jmenuBarDetalleAuxiliarHobby=this.jInternalFrameDetalleFormHobby.jmenuBarDetalleHobby;
			jTtoolBarDetalleAuxiliarHobby=this.jInternalFrameDetalleFormHobby.jTtoolBarDetalleHobby;		
		}
		
		final JMenuBar jmenuBarDetalleHobby=jmenuBarDetalleAuxiliarHobby;
		final JToolBar jTtoolBarDetalleHobby=jTtoolBarDetalleAuxiliarHobby;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHobby;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHobby;
			processRunnable.jTableDatos=jTableDatosHobby;
			processRunnable.jPanelCampos=jPanelCamposHobby;
			processRunnable.jPanelPaginacion=jPanelPaginacionHobby;
			processRunnable.jPanelAcciones=jPanelAccionesHobby;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHobby;
			
			
			processRunnable.jmenuBar=jmenuBarHobby;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHobby;
			processRunnable.jTtoolBar=jTtoolBarHobby;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHobby;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasHobby ,jPanelParametrosReportesHobby, jTableDatosHobby,/*jScrollPanelDatosHobby,*/jPanelCamposHobby,jPanelPaginacionHobby, /*jScrollPanelDatosEdicionHobby,*/ jPanelAccionesHobby,jPanelAccionesFormularioHobby,jmenuBarHobby,jmenuBarDetalleHobby,jTtoolBarHobby,jTtoolBarDetalleHobby));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesHobby(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarHobby(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuHobby(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarHobby(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarHobby,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleHobby,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuHobby(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarHobby,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleHobby,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.hobbyConstantesFunciones.getsFinalQueryHobby();
		String  finalQueryPaginacionTodos=this.hobbyConstantesFunciones.getsFinalQueryHobby();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=HobbyConstantesFunciones.getArrayColumnasGlobalesNoHobby(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=HobbyConstantesFunciones.getArrayColumnasGlobalesHobby(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,HobbyConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.hobbysEliminados= new ArrayList<Hobby>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessHobby();
		
				///*HobbySessionBean*/this.hobbySessionBean=new HobbySessionBean();
			
			if(this.hobbySessionBean==null) {
				this.hobbySessionBean=new HobbySessionBean();
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
					this.iNumeroPaginacion=HobbyConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=HobbyConstantesFunciones.getClassesForeignKeysOfHobby(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/hobby."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			hobbysAux= new ArrayList<Hobby>();
			
				
			hobbyLogic.setDatosCliente(this.datosCliente);
			hobbyLogic.setDatosDeep(this.datosDeep);
			hobbyLogic.setIsConDeep(true);
			
			
			hobbyLogic.getHobbyDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					hobbyLogic.getTodosHobbys(finalQueryGlobal,pagination);
					
					//hobbyLogic.getTodosHobbysWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(hobbyLogic.getHobbys()==null|| hobbyLogic.getHobbys().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							hobbysAux= new ArrayList<Hobby>();
							hobbysAux.addAll(hobbyLogic.getHobbys());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbysAux= new ArrayList<Hobby>();
							hobbysAux.addAll(hobbys);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							hobbyLogic.getTodosHobbys(finalQueryGlobal+"",this.pagination);												
							
							//hobbyLogic.getTodosHobbysWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteHobbys("Todos",hobbyLogic.getHobbys() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							hobbyLogic.setHobbys(new ArrayList<Hobby>());					
							hobbyLogic.getHobbys().addAll(hobbysAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbys=new ArrayList<Hobby>();
							hobbys.addAll(hobbysAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idHobby=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idHobby=this.idActual;
				
				} else if(this.idHobbyActual!=null && this.idHobbyActual!=0L) {
					idHobby=idHobbyActual;
				}
				
					
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndicePorId(idHobby);
				
				this.hobbys=new ArrayList<Hobby>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					hobbyLogic.getEntity(idHobby);
					
					//hobbyLogic.getEntityWithConnection(idHobby);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyLogic.setHobbys(new ArrayList<Hobby>());
					hobbyLogic.getHobbys().add(hobbyLogic.getHobby());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.hobbys=new ArrayList<Hobby>();
					this.hobbys.add(hobby);
				}
				
				if(hobbyLogic.getHobby()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					hobbyLogic.getHobbysBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=hobbyLogic.getHobbys()==null||hobbyLogic.getHobbys().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=hobbys==null|| hobbys.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbysAux=new ArrayList<Hobby>();
						hobbysAux.addAll(hobbyLogic.getHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbysAux=new ArrayList<Hobby>();
							hobbysAux.addAll(hobbys);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							hobbyLogic.getHobbysBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHobbys("BusquedaPorCodigo",hobbyLogic.getHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHobbys("BusquedaPorCodigo",hobbys);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyLogic.setHobbys(new ArrayList<Hobby>());
						hobbyLogic.getHobbys().addAll(hobbysAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbys=new ArrayList<Hobby>();
							hobbys.addAll(hobbysAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					hobbyLogic.getHobbysBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=hobbyLogic.getHobbys()==null||hobbyLogic.getHobbys().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=hobbys==null|| hobbys.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbysAux=new ArrayList<Hobby>();
						hobbysAux.addAll(hobbyLogic.getHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbysAux=new ArrayList<Hobby>();
							hobbysAux.addAll(hobbys);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							hobbyLogic.getHobbysBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHobbys("BusquedaPorNombre",hobbyLogic.getHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHobbys("BusquedaPorNombre",hobbys);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyLogic.setHobbys(new ArrayList<Hobby>());
						hobbyLogic.getHobbys().addAll(hobbysAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbys=new ArrayList<Hobby>();
							hobbys.addAll(hobbysAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					hobbyLogic.getHobbysFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=hobbyLogic.getHobbys()==null||hobbyLogic.getHobbys().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=hobbys==null|| hobbys.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbysAux=new ArrayList<Hobby>();
						hobbysAux.addAll(hobbyLogic.getHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbysAux=new ArrayList<Hobby>();
							hobbysAux.addAll(hobbys);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							hobbyLogic.getHobbysFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HobbyConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHobbys("FK_IdEmpresa",hobbyLogic.getHobbys());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHobbys("FK_IdEmpresa",hobbys);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyLogic.setHobbys(new ArrayList<Hobby>());
						hobbyLogic.getHobbys().addAll(hobbysAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbys=new ArrayList<Hobby>();
							hobbys.addAll(hobbysAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesHobby();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessHobby();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=hobbyLogic.getHobbys().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=hobbys.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=hobbyLogic.getHobbys().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=hobbys.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Hobby hobby) {
		Boolean permite=true;
		
		if(this.hobby.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=HobbyConstantesFunciones.getOrderByListaHobby();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=HobbyConstantesFunciones.getOrderByListaHobby();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Hobby hobby:hobbyLogic.getHobbys()) {
				if(hobby.getsType().equals(Constantes2.S_TOTALES)) {
					hobbyTotales=hobby;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Hobby hobby:this.hobbys) {
				if(hobby.getsType().equals(Constantes2.S_TOTALES)) {
					hobbyTotales=hobby;
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
			this.hobbyAux=new Hobby();
			this.hobbyAux.setsType(Constantes2.S_TOTALES);
			this.hobbyAux.setIsNew(false);
			this.hobbyAux.setIsChanged(false);
			this.hobbyAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				HobbyConstantesFunciones.TotalizarValoresFilaHobby(this.hobbyLogic.getHobbys(),this.hobbyAux);
				
				this.hobbyLogic.getHobbys().add(this.hobbyAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				HobbyConstantesFunciones.TotalizarValoresFilaHobby(this.hobbys,this.hobbyAux);
				
				this.hobbys.add(this.hobbyAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		hobbyTotales=new Hobby();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.hobbyLogic.getHobbys().remove(hobbyTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.hobbys.remove(hobbyTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		hobbyTotales=new Hobby();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Hobby hobby:hobbyLogic.getHobbys()) {
				if(hobby.getsType().equals(Constantes2.S_TOTALES)) {
					hobbyTotales=hobby;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HobbyConstantesFunciones.TotalizarValoresFilaHobby(this.hobbyLogic.getHobbys(),hobbyTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Hobby hobby:this.hobbys) {
				if(hobby.getsType().equals(Constantes2.S_TOTALES)) {
					hobbyTotales=hobby;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HobbyConstantesFunciones.TotalizarValoresFilaHobby(this.hobbys,hobbyTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getHobbysBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHobbysBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHobbysFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getHobbysBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyLogic.getHobbysBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHobbysBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyLogic.getHobbysBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHobbysFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyLogic.getHobbysFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosHobby() {
		this.isPermisoTodoHobby=false;
		this.isPermisoNuevoHobby=false;
		this.isPermisoActualizarHobby=false;
		this.isPermisoActualizarOriginalHobby=false;
		this.isPermisoEliminarHobby=false;
		this.isPermisoGuardarCambiosHobby=false;
		this.isPermisoConsultaHobby=false;
		this.isPermisoBusquedaHobby=false;
		this.isPermisoReporteHobby=false;		
		this.isPermisoOrdenHobby=false;		
		this.isPermisoPaginacionMedioHobby=false;		
		this.isPermisoPaginacionAltoHobby=false;
		this.isPermisoPaginacionTodoHobby=false;
		this.isPermisoCopiarHobby=false;		
		this.isPermisoVerFormHobby=false;		
		this.isPermisoDuplicarHobby=false;		
		this.isPermisoOrdenHobby=false;		
	}
	
	public void setPermisosUsuarioHobby(Boolean isPermiso) {
		this.isPermisoTodoHobby=isPermiso;
		this.isPermisoNuevoHobby=isPermiso;
		this.isPermisoActualizarHobby=isPermiso;
		this.isPermisoActualizarOriginalHobby=isPermiso;
		this.isPermisoEliminarHobby=isPermiso;
		this.isPermisoGuardarCambiosHobby=isPermiso;
		this.isPermisoConsultaHobby=isPermiso;
		this.isPermisoBusquedaHobby=isPermiso;
		this.isPermisoReporteHobby=isPermiso;
		this.isPermisoOrdenHobby=isPermiso;		
		this.isPermisoPaginacionMedioHobby=isPermiso;		
		this.isPermisoPaginacionAltoHobby=isPermiso;		
		this.isPermisoPaginacionTodoHobby=isPermiso;		
		this.isPermisoCopiarHobby=isPermiso;		
		this.isPermisoVerFormHobby=isPermiso;		
		this.isPermisoDuplicarHobby=isPermiso;
		this.isPermisoOrdenHobby=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioHobby(Boolean isPermiso) {
		//this.isPermisoTodoHobby=isPermiso;
		this.isPermisoNuevoHobby=isPermiso;
		this.isPermisoActualizarHobby=isPermiso;
		this.isPermisoActualizarOriginalHobby=isPermiso;
		this.isPermisoEliminarHobby=isPermiso;
		this.isPermisoGuardarCambiosHobby=isPermiso;
		//this.isPermisoConsultaHobby=isPermiso;
		//this.isPermisoBusquedaHobby=isPermiso;
		//this.isPermisoReporteHobby=isPermiso;
		//this.isPermisoOrdenHobby=isPermiso;		
		//this.isPermisoPaginacionMedioHobby=isPermiso;		
		//this.isPermisoPaginacionAltoHobby=isPermiso;		
		//this.isPermisoPaginacionTodoHobby=isPermiso;		
		//this.isPermisoCopiarHobby=isPermiso;		
		//this.isPermisoDuplicarHobby=isPermiso;
		//this.isPermisoOrdenHobby=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioHobbyClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EmpleadoHobbyConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(HobbyClienteConstantesFunciones.SNOMBREOPCION);
		
		if(HobbyJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEmpleadoHobby=false;
		this.isTienePermisosEmpleadoHobby=this.verificarGetPermisosUsuarioOpcionHobbyClaseRelacionada(this.opcionsRelacionadas,EmpleadoHobbyConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosHobbyCliente=false;
		this.isTienePermisosHobbyCliente=this.verificarGetPermisosUsuarioOpcionHobbyClaseRelacionada(this.opcionsRelacionadas,HobbyClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebHobby(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioHobbyClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEmpleadoHobby=conPermiso;
		this.isTienePermisosHobbyCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioHobbyClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionHobbyClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioHobbyClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEmpleadoHobby && this.jInternalFrameDetalleFormHobby!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormHobby.jTabbedPaneRelacionesHobby.remove(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosHobbyCliente && this.jInternalFrameDetalleFormHobby!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormHobby.jTabbedPaneRelacionesHobby.remove(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioHobby() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(HobbyJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.hobbySessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, HobbyConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoHobby=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarHobby=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalHobby=this.isPermisoActualizarHobby;
			this.isPermisoEliminarHobby=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosHobby=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaHobby=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaHobby=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoHobby=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteHobby=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHobby=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioHobby=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoHobby=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoHobby=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarHobby=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormHobby=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarHobby=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHobby=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.hobbySessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosHobby.setToolTipText(this.jTableDatosHobby.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioHobby(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioHobby(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(HobbyJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(HobbyJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioHobby() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEmpleadoHobby && this.hobbyConstantesFunciones.mostrarEmpleadoHobbyHobby && !HobbyConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado Hobby");
			reporte.setsDescripcion("Empleado Hobby");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosHobbyCliente && this.hobbyConstantesFunciones.mostrarHobbyClienteHobby && !HobbyConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Hobby Cliente");
			reporte.setsDescripcion("Hobby Cliente");
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
	public void inicializarCombosForeignKeyHobbyListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyHobbyListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(HobbyJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyHobbyListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyHobbyListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			HobbyParameterReturnGeneral hobbyReturnGeneral=new HobbyParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.hobbyConstantesFunciones.cargarid_empresaHobby)
					 || (this.esRecargarFks && this.hobbyConstantesFunciones.cargarid_empresaHobby)) {

					if(!this.hobbySessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+hobbySessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				hobbyReturnGeneral=hobbyLogic.cargarCombosLoteForeignKeyHobby(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=hobbyReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyHobby()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.hobbySessionBean==null) {
				this.hobbySessionBean=new HobbySessionBean();
			}

			if(!this.hobbySessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyHobby()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyHobby(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyHobby()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyHobby();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyHobby(Hobby hobby)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyHobby(Hobby hobby,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyHobby()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyHobby()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyHobby()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyHobby()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroHobby()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyHobby()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyHobby(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyHobby()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby!=null && this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.getItemCount()>0) {
				this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public HobbyBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public HobbyBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public HobbyBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.hobbySessionBean=new HobbySessionBean(); 
		this.hobbyConstantesFunciones=new HobbyConstantesFunciones(); 
		this.hobbyBean=new Hobby();//(this.hobbyConstantesFunciones); 		
		this.hobbyReturnGeneral=new HobbyParameterReturnGeneral(); 
		
		this.hobbySessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.hobbySessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public HobbyBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public HobbyBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public HobbyBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessHobby(true);
			
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
			
			this.hobbyConstantesFunciones=new HobbyConstantesFunciones(); 
			this.hobbyBean=new Hobby();//this.hobbyConstantesFunciones); 			
			this.hobbyReturnGeneral=new HobbyParameterReturnGeneral(); 
		
			HobbyBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Hobby Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.hobby=new Hobby();
			this.hobbys = new ArrayList<Hobby>();
			this.hobbysAux = new ArrayList<Hobby>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic=new HobbyLogic();
				this.hobbyLogic.getNewConnexionToDeep("");
			}
			
			//this.hobbySessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.hobbySessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormHobby);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoHobby!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHobby);	
					}
					
					if(this.jInternalFrameImportacionHobby!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHobby);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByHobby!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByHobby);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormHobby!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormHobby);
				this.jInternalFrameDetalleFormHobby.setVisible(false);
				this.jInternalFrameDetalleFormHobby.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoHobby!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHobby);
					this.jInternalFrameReporteDinamicoHobby.setVisible(false);
					this.jInternalFrameReporteDinamicoHobby.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionHobby!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionHobby);
					this.jInternalFrameImportacionHobby.setVisible(false);
					this.jInternalFrameImportacionHobby.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByHobby!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByHobby);
					this.jInternalFrameOrderByHobby.setVisible(false);
					this.jInternalFrameOrderByHobby.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idHobbyActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=HobbyConstantesFunciones.INUMEROPAGINACION;
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
			
			this.hobbyReturnGeneral=new HobbyParameterReturnGeneral();
			
			this.hobbyParameterGeneral=new HobbyParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.hobbyLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
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
			
			if(HobbyJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.hobbySessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EmpleadoHobbyConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(HobbyClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HobbyConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.hobbySessionBean.getEsGuardarRelacionado(),this.hobbySessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HobbyConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.hobbySessionBean.getEsGuardarRelacionado(),this.hobbySessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoHobby=false;
			this.isVisibilidadCeldaDuplicarHobby=true;
			this.isVisibilidadCeldaCopiarHobby=true;
			this.isVisibilidadCeldaVerFormHobby=true;
			this.isVisibilidadCeldaOrdenHobby=true;
			this.isVisibilidadCeldaNuevoRelacionesHobby=false;
			this.isVisibilidadCeldaModificarHobby=false;
			this.isVisibilidadCeldaActualizarHobby=false;
			this.isVisibilidadCeldaEliminarHobby=false;
			this.isVisibilidadCeldaCancelarHobby=false;
			this.isVisibilidadCeldaGuardarHobby=false;
			this.isVisibilidadCeldaGuardarCambiosHobby=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosHobby();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioHobby(false);
			
			this.setPermisosUsuarioHobby();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.hobbySessionBean.getEsGuardarRelacionado() 
				|| (this.hobbySessionBean.getEsGuardarRelacionado() && this.hobbySessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioHobbyClasesRelacionadas();
			}
			
			if(this.hobbySessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioHobbyClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!HobbyJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosHobby();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualHobby();
			}
			
			if(!this.isPermisoBusquedaHobby) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasHobby.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.hobbySessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioHobby,this.isPermisoPaginacionMedioHobby,this.isPermisoPaginacionTodoHobby);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(HobbyConstantesFunciones.getTiposSeleccionarHobby());
				
				this.tiposColumnasSelect=HobbyConstantesFunciones.getTiposSeleccionarHobby(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectHobby();				
				//this.tiposRelacionesSelect=HobbyConstantesFunciones.getTiposRelacionesHobby(true);
				
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
			//if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioHobby();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioHobby(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioHobby(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesHobby() ;
			
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
			
			
			this.empleadohobbyLogic=new EmpleadoHobbyLogic();
			this.hobbyclienteLogic=new HobbyClienteLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				hobbyImplementable= (HobbyImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HobbyConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				hobbyImplementableHome= (HobbyImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HobbyConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.hobbys= new ArrayList<Hobby>();
			this.hobbysEliminados= new ArrayList<Hobby>();
						
			this.isEsNuevoHobby=false;
			this.esParaAccionDesdeFormularioHobby=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyHobby(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroHobby();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			HobbyBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=HobbyConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesHobby("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingHobby(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormHobby!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioHobby();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioHobby();
			}
			
			HobbyBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasHobby.getTabCount(); i++) {
					this.jTabbedPaneBusquedasHobby.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasHobby.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessHobby(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Hobby: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectHobby() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesHobby")) {
				iIndex=this.jInternalFrameDetalleFormHobby.jTabbedPaneRelacionesHobby.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormHobby.jTabbedPaneRelacionesHobby.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosHobby.getSelectedRow();	
				
				

				if(sTitle.equals("Empleado Hobbyes")) {
					if(!EmpleadoHobbyJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessHobby();

						this.cargarParteTabPanelRelacionadaEmpleadoHobby(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Hobby Clientes")) {
					if(!HobbyClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessHobby();

						this.cargarParteTabPanelRelacionadaHobbyCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessHobby();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEmpleadoHobby(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormHobby.cargarSessionConBeanSwingJInternalFrameEmpleadoHobby(false,true,iIndex);
		this.jButtonEmpleadoHobbyActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleadoHobby();

		//this.jTabbedPaneRelacionesHobby.updateUI();
		//this.jTabbedPaneRelacionesHobby.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesHobby.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaHobbyCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormHobby.cargarSessionConBeanSwingJInternalFrameHobbyCliente(false,true,iIndex);
		this.jButtonHobbyClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaHobbyCliente();

		//this.jTabbedPaneRelacionesHobby.updateUI();
		//this.jTabbedPaneRelacionesHobby.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesHobby.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("EmpleadoHobby")) {
				int row=this.jTableDatosHobby.getSelectedRow();
				jButtonEmpleadoHobbyActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("HobbyCliente")) {
				int row=this.jTableDatosHobby.getSelectedRow();
				jButtonHobbyClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Empleado Hobby")) {

					if(this.isTienePermisosEmpleadoHobby && this.hobbyConstantesFunciones.mostrarEmpleadoHobbyHobby && !HobbyConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleado Hobbyes"+"("+EmpleadoHobbyConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleado Hobbyes");

						if(hobbyConstantesFunciones.resaltarEmpleadoHobbyHobby!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(hobbyConstantesFunciones.resaltarEmpleadoHobbyHobby);
						}

						jmenuItem.setEnabled(this.hobbyConstantesFunciones.activarEmpleadoHobbyHobby);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"EmpleadoHobby"));

						

						this.jInternalFrameDetalleFormHobby.jmenuDetalleHobby.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Hobby Cliente")) {

					if(this.isTienePermisosHobbyCliente && this.hobbyConstantesFunciones.mostrarHobbyClienteHobby && !HobbyConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Hobby Clientes"+"("+HobbyClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Hobby Clientes");

						if(hobbyConstantesFunciones.resaltarHobbyClienteHobby!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(hobbyConstantesFunciones.resaltarHobbyClienteHobby);
						}

						jmenuItem.setEnabled(this.hobbyConstantesFunciones.activarHobbyClienteHobby);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"HobbyCliente"));

						

						this.jInternalFrameDetalleFormHobby.jmenuDetalleHobby.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyHobby(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyHobby(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyHobby(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyHobbyListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyHobby();
		
		this.cargarCombosFrameForeignKeyHobby();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyHobby();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyHobby();
		}
	}
	
	
	
	public void jButtonNuevoHobbyActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.hobbySessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
			
			if(jTableDatosHobby.getRowCount()>=1) {
				jTableDatosHobby.removeRowSelectionInterval(0, jTableDatosHobby.getRowCount()-1);						
			}
			
			this.isEsNuevoHobby=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoHobby(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesHobby(true);			
			//this.hobby=new Hobby();
			//this.hobby.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHobby(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHobby() ;
			
			if(HobbyJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHobby(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.hobby);	
			this.actualizarInformacion("INFO_PADRE",false,this.hobby);				
			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
			if(this.hobbySessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Hobby: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarHobbyActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosHobby.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosHobby.getSelectedRows().length;			
			}
			
			hobbysSeleccionados=this.getHobbysSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoHobby--;			
				//Hobby hobbyAux= new Hobby();			
				//hobbyAux.setId(this.iIdNuevoHobby);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Hobby hobbyOrigen=new Hobby();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Hobby hobbyOrigen : hobbysSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosHobby.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							hobbyOrigen =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							hobbyOrigen =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaHobby();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.hobby.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosHobby(hobbyOrigen,this.hobby,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.hobbyLogic.getHobbys().add(this.hobbyAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.hobbys.add(this.hobbyAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaHobby(false);
				
				this.jTableDatosHobby.setRowSelectionInterval(this.getIndiceNuevoHobby(), this.getIndiceNuevoHobby());
				
				int iLastRow =  this.jTableDatosHobby.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHobby.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHobby.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHobby(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();									
		
			Hobby hobbyOrigen=new Hobby();
			Hobby hobbyDestino=new Hobby();
				
			hobbysSeleccionados=this.getHobbysSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosHobby.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || hobbysSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosHobby.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyOrigen =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						hobbyOrigen =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						hobbyDestino =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						hobbyDestino =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				hobbyOrigen =hobbysSeleccionados.get(0);
				hobbyDestino =hobbysSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosHobby(hobbyOrigen,hobbyDestino,true,false);
				
				hobbyDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(hobbyDestino,hobbyLogic.getHobbys());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(hobbyDestino,hobbys);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaHobby(false);
				
				//this.jTableDatosHobby.setRowSelectionInterval(this.getIndiceNuevoHobby(), this.getIndiceNuevoHobby());
				
				int iLastRow =  this.jTableDatosHobby.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHobby.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHobby.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHobby(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormHobby.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesHobby.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasHobby.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesHobby.setVisible(!isVisible);
			this.jPanelPaginacionHobby.setVisible(!isVisible);
			this.jPanelAccionesHobby.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameHobby();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoHobby();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionHobby();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByHobby();
			
			this.abrirFrameOrderByHobby();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByHobby();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleHobby(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormHobby);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormHobby.isMaximum()) {
					this.jInternalFrameDetalleFormHobby.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormHobby.setSize(this.jInternalFrameDetalleFormHobby.iWidthFormulario,this.jInternalFrameDetalleFormHobby.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormHobby.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormHobby.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormHobby.isMaximum()) {
						this.jInternalFrameDetalleFormHobby.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormHobby.jContentPaneDetalleHobby.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormHobby.jTabbedPaneRelacionesHobby.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormHobby.jContentPaneDetalleHobby.getWidth(),HobbyConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHobby.jTabbedPaneRelacionesHobby.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormHobby.jContentPaneDetalleHobby.getWidth(),HobbyConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHobby.jTabbedPaneRelacionesHobby.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormHobby.jContentPaneDetalleHobby.getWidth(),HobbyConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EmpleadoHobbyJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleadoHobby();
					}

					if(HobbyClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaHobbyCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormHobby.setVisible(true);
	        this.jInternalFrameDetalleFormHobby.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByHobby() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByHobby==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByHobby=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHobby,false,this);
				} else {
					this.jInternalFrameOrderByHobby=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHobby,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByHobby);
				this.jInternalFrameOrderByHobby.setVisible(false);
				this.jInternalFrameOrderByHobby.setSelected(false);
				
				this.jInternalFrameOrderByHobby.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHobby"));
				
				this.inicializarActualizarBindingTablaOrderByHobby();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionHobby() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionHobby==null) {
				
				this.jInternalFrameImportacionHobby=new ImportacionJInternalFrame(HobbyConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHobby);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionHobby);
				this.jInternalFrameImportacionHobby.setVisible(false);
				this.jInternalFrameImportacionHobby.setSelected(false);


				this.jInternalFrameImportacionHobby.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHobby"));
				this.jInternalFrameImportacionHobby.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHobby"));
				this.jInternalFrameImportacionHobby.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHobby"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoHobby() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoHobby==null) {
				this.jInternalFrameReporteDinamicoHobby=new ReporteDinamicoJInternalFrame(HobbyConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHobby);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHobby);
				this.jInternalFrameReporteDinamicoHobby.setVisible(false);
				this.jInternalFrameReporteDinamicoHobby.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoHobby.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHobby"));
				this.jInternalFrameReporteDinamicoHobby.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHobby"));
				this.jInternalFrameReporteDinamicoHobby.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHobby"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHobby();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEmpleadoHobby() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoHobby.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormHobby.jContentPaneDetalleHobby.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoHobby.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoHobby.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoHobby.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaHobbyCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.jScrollPanelDatosHobbyCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormHobby.jContentPaneDetalleHobby.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.jScrollPanelDatosHobbyCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.jScrollPanelDatosHobbyCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.jScrollPanelDatosHobbyCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleHobby() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormHobby);
			
	       	this.jInternalFrameDetalleFormHobby.setVisible(false);
	        this.jInternalFrameDetalleFormHobby.setSelected(false);
			
			//this.jInternalFrameDetalleFormHobby.dispose();
			//this.jInternalFrameDetalleFormHobby=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoHobby() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoHobby.setVisible(true);
	        this.jInternalFrameReporteDinamicoHobby.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionHobby() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionHobby.setVisible(true);
	        this.jInternalFrameImportacionHobby.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByHobby() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByHobby.setVisible(true);
	        this.jInternalFrameOrderByHobby.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByHobby() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByHobby.setVisible(false);
	        this.jInternalFrameOrderByHobby.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoHobby() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoHobby.setVisible(false);
	        this.jInternalFrameReporteDinamicoHobby.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionHobby() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionHobby.setVisible(false);
	        this.jInternalFrameImportacionHobby.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarHobby(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarHobby(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHobby.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesHobby(true);
			//this.isEsNuevoHobby=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesHobby("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHobby(false) ;
			
			if(hobbySessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.getEsGuardarRelacionado() && EmpleadoHobbyJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoHobbyActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.getEsGuardarRelacionado() && HobbyClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonHobbyClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(HobbyJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHobby(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHobby(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaHobbyActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarHobby(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHobby.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesHobby(true);
			//this.isEsNuevoHobby=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.hobby.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesHobby("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesHobby(false) ;
			
			if(HobbyJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHobby(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHobby(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesHobby(false);
			
			//if(!this.isEsNuevoHobby) {								
				int intSelectedRow = this.jTableDatosHobby.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(HobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualHobby(this.hobby,true);
				this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
				
			}
			
			if(this.permiteMantenimiento(this.hobby)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.hobbySessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoHobby=true;
					this.inicializarActualizarBindingTablaHobby(false);
					this.isEsNuevoHobby=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoHobby=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoHobby=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHobby(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHobby(false);
				
				this.habilitarDeshabilitarControlesHobby(false);
			
												
				
				if(HobbyJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleHobby();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoHobbyActionPerformed(evt,hobbySessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualHobby(this.hobby,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosHobby.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,hobbySessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.hobby.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Hobby.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Hobby.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarHobbyActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosHobby.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				this.hobby.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				this.hobby.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.hobby)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.hobbySessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((HobbyModel) this.jTableDatosHobby.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoHobby=true;
				this.inicializarActualizarBindingTablaHobby(false);
				this.isEsNuevoHobby=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHobby(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHobby(false);
				
				this.habilitarDeshabilitarControlesHobby(false);
				
				
				
				if(HobbyJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleHobby();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarHobbyActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosHobby.getRowCount()>=1) {
				jTableDatosHobby.removeRowSelectionInterval(0, jTableDatosHobby.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesHobby(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaHobby(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHobby(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHobby(false) ;
			
			this.isEsNuevoHobby=false;
			
			if(HobbyJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleHobby();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingHobby(false);
				
				//SI ES MANUAL
				if(HobbyJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualHobby();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoHobby--;			
			//Hobby hobbyAux= new Hobby();			
			//hobbyAux.setId(this.iIdNuevoHobby);
			
			if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaHobby();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
			
			this.hobby.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.hobbyLogic.getHobbys().add(this.hobbyAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.hobbys.add(this.hobbyAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaHobby(false);
			
			this.jTableDatosHobby.setRowSelectionInterval(this.getIndiceNuevoHobby(), this.getIndiceNuevoHobby());
			
			int iLastRow =  this.jTableDatosHobby.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosHobby.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosHobby.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaHobby(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingHobby(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHobby(false);
			
			//SI ES MANUAL
			if(HobbyJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHobby();
			}
			
			//this.abrirFrameTreeHobby();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionHobbyActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE HobbyES ?", "MANTENIMIENTO DE Hobby", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionHobby.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralHobby();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.hobbyReturnGeneral=hobbyLogic.procesarImportacionHobbysWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.hobbyParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarHobbyReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionHobbyActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionHobby.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionHobby.setFileImportacion(this.jInternalFrameImportacionHobby.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionHobby.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionHobby.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionHobby.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionHobby.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();		

		hobbysSeleccionados=this.getHobbysSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHobby.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHobby.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("HobbyBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"HobbyBaseDesign.jrxml";
			
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
			
			this.generarReporteHobbys("Todos",hobbysSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoHobby.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHobby.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HobbyConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HobbyConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HobbyConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HobbyConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoHobby.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoHobby.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoHobby.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case HobbyConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case HobbyConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case HobbyConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case HobbyConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoHobby.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case HobbyConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case HobbyConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case HobbyConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case HobbyConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoHobby.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHobby.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HobbyConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case HobbyConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case HobbyConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case HobbyConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoHobbyActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();		
		
		hobbysSeleccionados=this.getHobbysSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobby";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Hobbys");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoHobby.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoHobby.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case HobbyConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HobbyConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Hobby hobby:hobbysSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(hobby.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HobbyConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HobbyConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Hobby hobby:hobbysSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(hobby.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HobbyConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HobbyConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Hobby hobby:hobbysSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(hobby.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HobbyConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HobbyConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Hobby hobby:hobbysSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(hobby.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelHobby(row);				
			//	iRow++;
			//}				
			
			//for(Hobby hobbyAux:hobbysSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelHobby(hobbyAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby",JOptionPane.INFORMATION_MESSAGE);
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
				this.hobbyLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHobby(false);
			
			//SI ES MANUAL
			if(HobbyJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHobby();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHobby(false);
			
			//SI ES MANUAL
			if(HobbyJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHobby();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesHobbyActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHobby(false);
			
			//SI ES MANUAL
			if(HobbyJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHobby();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaHobby() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosHobby.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosHobby.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosHobby.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosHobby.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosHobby.setMinimumSize(dimensionMinimum);
		this.jTableDatosHobby.setMaximumSize(dimensionMaximum);
		this.jTableDatosHobby.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingHobby(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingHobby(esInicializar,true);
	}
	
	public void inicializarActualizarBindingHobby(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaHobby(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesHobby(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasHobby(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHobby(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesHobby(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !HobbyJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!HobbyJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualHobby() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaHobby();
		
		this.inicializarActualizarBindingBotonesManualHobby(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualHobby();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHobby() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualHobby(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualHobby(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosHobby.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosHobby.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteHobby.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormHobby!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormHobby.jCheckBoxPostAccionNuevoHobby.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormHobby.jCheckBoxPostAccionSinCerrarHobby.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormHobby.jCheckBoxPostAccionSinMensajeHobby.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosHobby.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosHobby.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteHobby.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormHobby!=null) {
				this.jInternalFrameDetalleFormHobby.jCheckBoxPostAccionNuevoHobby.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormHobby.jCheckBoxPostAccionSinCerrarHobby.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormHobby.jCheckBoxPostAccionSinMensajeHobby.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionHobby.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionHobby.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormHobby!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesHobby.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoHobby!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHobby.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesHobby.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesHobby.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarHobby.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesHobby.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoHobby!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHobby.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesHobby.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralHobby.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesHobby(Boolean esInicializar) throws Exception {
		try	{	
			if(HobbyJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualHobby(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesHobby() throws Exception {
		try	{
			if(HobbyJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualHobby();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHobby() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualHobby() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesHobby.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesHobby.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesHobby.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionHobby.addItem(reporte);
			}
			
			
			if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionHobby.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionHobby.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesHobby.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesHobby.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarHobby.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarHobby.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarHobby.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHobby();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHobby() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHobby!=null) {
				this.jInternalFrameReporteDinamicoHobby.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoHobby.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHobby!=null) {
				this.jInternalFrameReporteDinamicoHobby.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoHobby.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoHobby!=null) {
				
				if(this.jInternalFrameReporteDinamicoHobby.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHobby.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHobby.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoHobby.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHobby.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHobby.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualHobby()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoHobby.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreHobby.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasHobby(Boolean esInicializar) throws Exception {				
		if(HobbyJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualHobby();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaHobby() throws Exception {
		this.inicializarActualizarBindingTablaHobby(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByHobby() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByHobby.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByHobby.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHobby.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new HobbyPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByHobby.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHobby.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new HobbyPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosHobbyOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobbyOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new HobbyPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByHobby.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHobby.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new HobbyPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByHobby.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaHobby(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=hobbyLogic.getHobbys().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=hobbys.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(HobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosHobby.setModel(new HobbyModel(this.hobbyLogic.getHobbys(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosHobby.setModel(new HobbyModel(this.hobbys,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByHobby!=null && this.jInternalFrameOrderByHobby.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByHobby();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobby,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new HobbyPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+HobbyConstantesFunciones.SCLASSWEBTITULO,hobbyConstantesFunciones.resaltarSeleccionarHobby,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+HobbyConstantesFunciones.SCLASSWEBTITULO,hobbyConstantesFunciones.resaltarSeleccionarHobby,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobby,HobbyConstantesFunciones.LABEL_ID));

		if(this.hobbyConstantesFunciones.mostraridHobby && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HobbyConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.hobbyConstantesFunciones.resaltaridHobby,this.hobbyConstantesFunciones.activaridHobby,this,true,"idHobby","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.hobbyConstantesFunciones.resaltaridHobby,this.hobbyConstantesFunciones.activaridHobby,this,true,"idHobby","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobby,HobbyConstantesFunciones.LABEL_IDEMPRESA));

		if(this.hobbyConstantesFunciones.mostrarid_empresaHobby && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HobbyConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.hobbyConstantesFunciones.resaltarid_empresaHobby,this,this.hobbyConstantesFunciones.activarid_empresaHobby));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.hobbyConstantesFunciones.resaltarid_empresaHobby,this,this.hobbyConstantesFunciones.activarid_empresaHobby,false,"id_empresaHobby","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HobbyPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobby,HobbyConstantesFunciones.LABEL_CODIGO));

		if(this.hobbyConstantesFunciones.mostrarcodigoHobby && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HobbyConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.hobbyConstantesFunciones.resaltarcodigoHobby,this.hobbyConstantesFunciones.activarcodigoHobby,this,true,"codigoHobby","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.hobbyConstantesFunciones.resaltarcodigoHobby,this.hobbyConstantesFunciones.activarcodigoHobby,this,true,"codigoHobby","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HobbyPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobby,HobbyConstantesFunciones.LABEL_NOMBRE));

		if(this.hobbyConstantesFunciones.mostrarnombreHobby && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HobbyConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.hobbyConstantesFunciones.resaltarnombreHobby,this.hobbyConstantesFunciones.activarnombreHobby,this,true,"nombreHobby","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.hobbyConstantesFunciones.resaltarnombreHobby,this.hobbyConstantesFunciones.activarnombreHobby,this,true,"nombreHobby","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HobbyPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHobby,HobbyConstantesFunciones.LABEL_DESCRIPCION));

		if(this.hobbyConstantesFunciones.mostrardescripcionHobby && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HobbyConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.hobbyConstantesFunciones.resaltardescripcionHobby,this.hobbyConstantesFunciones.activardescripcionHobby,this,true,"descripcionHobby","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.hobbyConstantesFunciones.resaltardescripcionHobby,this.hobbyConstantesFunciones.activardescripcionHobby,this,true,"descripcionHobby","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HobbyPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.hobbySessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEmpleadoHobby && this.hobbyConstantesFunciones.mostrarEmpleadoHobbyHobby && !HobbyConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleado Hobbyes");
				tableColumn.setHeaderValue("Empleado Hobbyes");
				tableColumn.setCellRenderer(new EmpleadoHobbyTableCell(hobbyConstantesFunciones.resaltarEmpleadoHobbyHobby,this,this.hobbyConstantesFunciones.activarEmpleadoHobbyHobby));
				tableColumn.setCellEditor(new EmpleadoHobbyTableCell(hobbyConstantesFunciones.resaltarEmpleadoHobbyHobby,this,this.hobbyConstantesFunciones.activarEmpleadoHobbyHobby));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosHobby.addColumn(tableColumn);
			}

			if(this.isTienePermisosHobbyCliente && this.hobbyConstantesFunciones.mostrarHobbyClienteHobby && !HobbyConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Hobby Clientes");
				tableColumn.setHeaderValue("Hobby Clientes");
				tableColumn.setCellRenderer(new HobbyClienteTableCell(hobbyConstantesFunciones.resaltarHobbyClienteHobby,this,this.hobbyConstantesFunciones.activarHobbyClienteHobby));
				tableColumn.setCellEditor(new HobbyClienteTableCell(hobbyConstantesFunciones.resaltarHobbyClienteHobby,this,this.hobbyConstantesFunciones.activarHobbyClienteHobby));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosHobby.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.hobbySessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.hobbySessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHobby.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.hobbySessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.hobbySessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHobby.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarHobby && this.isPermisoGuardarCambiosHobby) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.hobbySessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.hobbySessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosHobby.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.hobbySessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosHobby.addColumn(tableColumn);
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
			
			this.jTableDatosHobby.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHobby && this.isPermisoGuardarCambiosHobby) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.hobbySessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHobby && this.isPermisoGuardarCambiosHobby) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosHobby.moveColumn(this.jTableDatosHobby.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosHobby.moveColumn(this.jTableDatosHobby.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.hobbySessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosHobby.moveColumn(this.jTableDatosHobby.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosHobby.moveColumn(this.jTableDatosHobby.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosHobby.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosHobby.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosHobby,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!HobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosHobby.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosHobby.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!HobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!HobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosHobby.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosHobby.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosHobby.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=hobbyLogic.getHobbys().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=hobbys.size()-1;
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
		//this.jTableDatosHobby.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosHobby.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosHobby();
			
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
				
				//this.isEsNuevoHobby=false;
					
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
				if(this.hobbySessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormHobby==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHobby.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHobby.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.hobby.getsType().equals("DUPLICADO")
				   || this.hobby.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoHobby=true;
				
				} else {
					this.isEsNuevoHobby=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
					if(this.hobby.getId()>=0 && !this.hobby.getIsNew()) {						
						this.isEsNuevoHobby=false;
						
					} else {
						this.isEsNuevoHobby=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoHobby(esRelaciones);						
				
				this.seleccionarHobby(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.hobby.getId()<0) {
					this.isEsNuevoHobby=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarHobby(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarHobby(evt,rowIndex);
				}	
				
				if(this.hobbySessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Hobby: " + this.dDif); 
					}
				}								
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarHobby(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.hobby)) {
					if(this.hobby.getId()>0) {
						this.hobby.setIsDeleted(true);
						
						this.hobbysEliminados.add(this.hobby);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.hobbyLogic.getHobbys().remove(this.hobby);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.hobbys.remove(this.hobby);				
					}
					
					
					((HobbyModel) this.jTableDatosHobby.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaHobby(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarHobby(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoHobby) {
			
			if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHobby.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHobby.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(HobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioHobby(this.hobby);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.hobbyConstantesFunciones.cargarid_empresaHobby || this.hobbyConstantesFunciones.event_dependid_empresaHobby) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.hobby.getid_empresa());
									//this.inicializarActualizarBindingHobby(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(hobby.getEmpresa()!=null) {
							this.empresasForeignKey.add(hobby.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.hobby.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesHobby("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesHobby(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHobby() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoHobby(Hobby hobby) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoHobby(hobby,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoHobby(Hobby hobby,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioHobby(hobby);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyHobby(hobby,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyHobby(hobby);
	}
	
	public void setVariablesObjetoActualToFormularioHobby(Hobby hobby) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormHobby.jLabelidHobby.setText(hobby.getId().toString());
			this.jInternalFrameDetalleFormHobby.jTextFieldcodigoHobby.setText(hobby.getcodigo());
			this.jInternalFrameDetalleFormHobby.jTextAreanombreHobby.setText(hobby.getnombre());
			this.jInternalFrameDetalleFormHobby.jTextAreadescripcionHobby.setText(hobby.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Hobby hobbyLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,hobbyLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Hobby hobbyLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				hobbyLocal=this.hobby;
			} else {
				hobbyLocal=this.hobbyAnterior;
			}
		}
		
		if(this.permiteMantenimiento(hobbyLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoHobby(hobbyLocal,true);
					
					if(hobbySessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(hobbyLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.hobbySessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(hobbyLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoHobby(Hobby hobby,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHobby(hobby,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysHobby(hobby);
	}
	
	public void setVariablesFormularioToObjetoActualHobby(Hobby hobby,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHobby(hobby,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualHobby(Hobby hobby,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormHobby.jLabelidHobby.getText()==null || this.jInternalFrameDetalleFormHobby.jLabelidHobby.getText()=="" || this.jInternalFrameDetalleFormHobby.jLabelidHobby.getText()=="Id") {
				this.jInternalFrameDetalleFormHobby.jLabelidHobby.setText("0");
			}

			if(conColumnasBase) {hobby.setId(Long.parseLong(this.jInternalFrameDetalleFormHobby.jLabelidHobby.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HobbyConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobby.jLabelIdHobby,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			hobby.setcodigo(this.jInternalFrameDetalleFormHobby.jTextFieldcodigoHobby.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HobbyConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobby.jLabelcodigoHobby,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			hobby.setnombre(this.jInternalFrameDetalleFormHobby.jTextAreanombreHobby.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HobbyConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobby.jLabelnombreHobby,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			hobby.setdescripcion(this.jInternalFrameDetalleFormHobby.jTextAreadescripcionHobby.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HobbyConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHobby.jLabeldescripcionHobby,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHobby(Hobby hobbyBean,Hobby hobby,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosHobby(Hobby hobbyOrigen,Hobby hobby,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && hobbyOrigen.getId()!=null && !hobbyOrigen.getId().equals(0L))) {hobby.setId(hobbyOrigen.getId());}}
			if(conDefault || (!conDefault && hobbyOrigen.getcodigo()!=null && !hobbyOrigen.getcodigo().equals(""))) {hobby.setcodigo(hobbyOrigen.getcodigo());}
			if(conDefault || (!conDefault && hobbyOrigen.getnombre()!=null && !hobbyOrigen.getnombre().equals(""))) {hobby.setnombre(hobbyOrigen.getnombre());}
			if(conDefault || (!conDefault && hobbyOrigen.getdescripcion()!=null && !hobbyOrigen.getdescripcion().equals(""))) {hobby.setdescripcion(hobbyOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHobby(Hobby hobby) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHobby.jLabelidHobby.setText(hobby.getId().toString());
			this.jInternalFrameDetalleFormHobby.jTextFieldcodigoHobby.setText(hobby.getcodigo());
			this.jInternalFrameDetalleFormHobby.jTextAreanombreHobby.setText(hobby.getnombre());
			this.jInternalFrameDetalleFormHobby.jTextAreadescripcionHobby.setText(hobby.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHobby(HobbyBean hobbyBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHobby.jLabelidHobby.setText(hobbyBean.getId().toString());
			this.jInternalFrameDetalleFormHobby.jTextFieldcodigoHobby.setText(hobbyBean.getcodigo());
			this.jInternalFrameDetalleFormHobby.jTextAreanombreHobby.setText(hobbyBean.getnombre());
			this.jInternalFrameDetalleFormHobby.jTextAreadescripcionHobby.setText(hobbyBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanHobby(HobbyParameterReturnGeneral hobbyReturnGeneral,HobbyBean hobbyBean,Boolean conDefault) throws Exception { 
		try {
			Hobby hobbyLocal=new Hobby();
			
			hobbyLocal=hobbyReturnGeneral.getHobby();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && hobbyLocal.getId()!=null && !hobbyLocal.getId().equals(0L))) {hobbyBean.setId(hobbyLocal.getId());}}
			if(conDefault || (!conDefault && hobbyLocal.getcodigo()!=null && !hobbyLocal.getcodigo().equals(""))) {hobbyBean.setcodigo(hobbyLocal.getcodigo());}
			if(conDefault || (!conDefault && hobbyLocal.getnombre()!=null && !hobbyLocal.getnombre().equals(""))) {hobbyBean.setnombre(hobbyLocal.getnombre());}
			if(conDefault || (!conDefault && hobbyLocal.getdescripcion()!=null && !hobbyLocal.getdescripcion().equals(""))) {hobbyBean.setdescripcion(hobbyLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxHobbyGenerico(Long idHobbySeleccionado,JComboBox jComboBoxHobby,List<Hobby> hobbysLocal)throws Exception {
		try {
			Hobby  hobbyTemp=null;

			for(Hobby hobbyAux:hobbysLocal) {
				if(hobbyAux.getId()!=null && hobbyAux.getId().equals(idHobbySeleccionado)) {
					hobbyTemp=hobbyAux;
					break;
				}
			}

			jComboBoxHobby.setSelectedItem(hobbyTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxHobbyGenerico(JComboBox jComboBoxHobby,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHobby.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxHobby.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHobby.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxHobby.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("EmpleadoHobby")) {
			jButtonEmpleadoHobbyActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("HobbyCliente")) {
			jButtonHobbyClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			hobby=(Hobby) hobbyLogic.getHobbys().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			hobby =(Hobby) hobbys.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!hobby.getIsNew() && !hobby.getIsChanged() && !hobby.getIsDeleted()) {
				sDescripcion=hobby.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=hobby.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Hobby hobbyRow=new Hobby();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			hobbyRow=(Hobby) hobbyLogic.getHobbys().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			hobbyRow=(Hobby) hobbys.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEmpleadoHobbyActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Hobby hobby) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormHobby==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobby = (Hobby)this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.hobby = (Hobby)this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(hobby!=null) {
						this.hobby = hobby;
					} else {
						this.hobby = new Hobby();
					}
				}

				if(this.isTienePermisosEmpleadoHobby && this.permiteMantenimiento(this.hobby)) {
					EmpleadoHobbyBeanSwingJInternalFrame empleadohobbyBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFramePopup=new EmpleadoHobbyBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadohobbyBeanSwingJInternalFrame=this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFramePopup;
					} else {
						empleadohobbyBeanSwingJInternalFrame=this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame;
					}

					List<Hobby> hobbys=new ArrayList<Hobby>();
					hobbys.add(this.hobby);
					if(!esRelacionado) {
						//empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.setConGuardarRelaciones(false);
						//empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadohobbyBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormHobby.cargarEmpleadoHobbyBeanSwingJInternalFrame(hobbys,this.hobby,empleadohobbyBeanSwingJInternalFrame,/*conInicializar,*/empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.getConGuardarRelaciones(),empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.getEsGuardarRelacionado());
					empleadohobbyBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadohobbyBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoHobby("no_relacionado");

						empleadohobbyBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoHobbyConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoHobbyConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadohobbyBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderHobby=(TitledBorder)this.jScrollPanelDatosHobby.getBorder();
						TitledBorder titledBorderEmpleadoHobby=(TitledBorder)empleadohobbyBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoHobby.getBorder();

						titledBorderEmpleadoHobby.setTitle(titledBorderHobby.getTitle() + " -> Empleado Hobby");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadohobbyBeanSwingJInternalFrame);
						}

						empleadohobbyBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadohobbyBeanSwingJInternalFrame);

						empleadohobbyBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.hobbySessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado Hobby",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonHobbyClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Hobby hobby) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormHobby==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobby = (Hobby)this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.hobby = (Hobby)this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(hobby!=null) {
						this.hobby = hobby;
					} else {
						this.hobby = new Hobby();
					}
				}

				if(this.isTienePermisosHobbyCliente && this.permiteMantenimiento(this.hobby)) {
					HobbyClienteBeanSwingJInternalFrame hobbyclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFramePopup=new HobbyClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						hobbyclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFramePopup;
					} else {
						hobbyclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame;
					}

					List<Hobby> hobbys=new ArrayList<Hobby>();
					hobbys.add(this.hobby);
					if(!esRelacionado) {
						//hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.setConGuardarRelaciones(false);
						//hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					hobbyclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormHobby.cargarHobbyClienteBeanSwingJInternalFrame(hobbys,this.hobby,hobbyclienteBeanSwingJInternalFrame,/*conInicializar,*/hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.getConGuardarRelaciones(),hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.getEsGuardarRelacionado());
					hobbyclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						hobbyclienteBeanSwingJInternalFrame.actualizarEstadoPanelsHobbyCliente("no_relacionado");

						hobbyclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(HobbyClienteConstantesFunciones.ITAMANIOFILATABLA + (HobbyClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						hobbyclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderHobby=(TitledBorder)this.jScrollPanelDatosHobby.getBorder();
						TitledBorder titledBorderHobbyCliente=(TitledBorder)hobbyclienteBeanSwingJInternalFrame.jScrollPanelDatosHobbyCliente.getBorder();

						titledBorderHobbyCliente.setTitle(titledBorderHobby.getTitle() + " -> Hobby Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,hobbyclienteBeanSwingJInternalFrame);
						}

						hobbyclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(hobbyclienteBeanSwingJInternalFrame);

						hobbyclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.hobbySessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Hobby Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualHobby(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoHobby.setVisible((this.isVisibilidadCeldaNuevoHobby && this.isPermisoNuevoHobby));			
			this.jButtonDuplicarHobby.setVisible((this.isVisibilidadCeldaDuplicarHobby && this.isPermisoDuplicarHobby));			
			this.jButtonCopiarHobby.setVisible((this.isVisibilidadCeldaCopiarHobby && this.isPermisoCopiarHobby));
			this.jButtonVerFormHobby.setVisible((this.isVisibilidadCeldaVerFormHobby && this.isPermisoVerFormHobby));
			
			this.jButtonAbrirOrderByHobby.setVisible((this.isVisibilidadCeldaOrdenHobby && this.isPermisoOrdenHobby));			
			
			this.jButtonNuevoRelacionesHobby.setVisible((this.isVisibilidadCeldaNuevoRelacionesHobby && this.isPermisoNuevoHobby));			
			this.jButtonNuevoGuardarCambiosHobby.setVisible((this.isVisibilidadCeldaNuevoHobby && this.isPermisoNuevoHobby && this.isPermisoGuardarCambiosHobby));
			
			if(this.jInternalFrameDetalleFormHobby!=null) {
			this.jInternalFrameDetalleFormHobby.jButtonModificarHobby.setVisible((this.isVisibilidadCeldaModificarHobby && this.isPermisoActualizarHobby));	
			this.jInternalFrameDetalleFormHobby.jButtonActualizarHobby.setVisible((this.isVisibilidadCeldaActualizarHobby && this.isPermisoActualizarHobby));	
			this.jInternalFrameDetalleFormHobby.jButtonEliminarHobby.setVisible((this.isVisibilidadCeldaEliminarHobby && this.isPermisoEliminarHobby));
			this.jInternalFrameDetalleFormHobby.jButtonCancelarHobby.setVisible(this.isVisibilidadCeldaCancelarHobby);							
			this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosHobby.setVisible((this.isVisibilidadCeldaGuardarHobby && this.isPermisoGuardarCambiosHobby));			
			
			}
						
			this.jButtonGuardarCambiosTablaHobby.setVisible((this.isVisibilidadCeldaGuardarCambiosHobby && this.isPermisoGuardarCambiosHobby));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarHobby.setVisible((this.isVisibilidadCeldaNuevoHobby && this.isPermisoNuevoHobby));						
			this.jButtonDuplicarToolBarHobby.setVisible((this.isVisibilidadCeldaDuplicarHobby && this.isPermisoDuplicarHobby));						
			this.jButtonCopiarToolBarHobby.setVisible((this.isVisibilidadCeldaCopiarHobby && this.isPermisoCopiarHobby));			
			this.jButtonVerFormToolBarHobby.setVisible((this.isVisibilidadCeldaVerFormHobby && this.isPermisoVerFormHobby));			
			this.jButtonAbrirOrderByToolBarHobby.setVisible((this.isVisibilidadCeldaOrdenHobby && this.isPermisoOrdenHobby));
			this.jButtonNuevoRelacionesToolBarHobby.setVisible((this.isVisibilidadCeldaNuevoRelacionesHobby && this.isPermisoNuevoHobby));			
			this.jButtonNuevoGuardarCambiosToolBarHobby.setVisible((this.isVisibilidadCeldaNuevoHobby && this.isPermisoNuevoHobby && this.isPermisoGuardarCambiosHobby));			
			
			if(this.jInternalFrameDetalleFormHobby!=null) {
			this.jInternalFrameDetalleFormHobby.jButtonModificarToolBarHobby.setVisible((this.isVisibilidadCeldaModificarHobby && this.isPermisoActualizarHobby));	
			this.jInternalFrameDetalleFormHobby.jButtonActualizarToolBarHobby.setVisible((this.isVisibilidadCeldaActualizarHobby  && this.isPermisoActualizarHobby));	
			this.jInternalFrameDetalleFormHobby.jButtonEliminarToolBarHobby.setVisible((this.isVisibilidadCeldaEliminarHobby && this.isPermisoEliminarHobby));
			this.jInternalFrameDetalleFormHobby.jButtonCancelarToolBarHobby.setVisible(this.isVisibilidadCeldaCancelarHobby);				
			this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosToolBarHobby.setVisible((this.isVisibilidadCeldaGuardarHobby && this.isPermisoGuardarCambiosHobby));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarHobby.setVisible((this.isVisibilidadCeldaGuardarCambiosHobby && this.isPermisoGuardarCambiosHobby));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoHobby.setVisible((this.isVisibilidadCeldaNuevoHobby && this.isPermisoNuevoHobby));			
			this.jMenuItemDuplicarHobby.setVisible((this.isVisibilidadCeldaDuplicarHobby && this.isPermisoDuplicarHobby));			
			this.jMenuItemCopiarHobby.setVisible((this.isVisibilidadCeldaCopiarHobby && this.isPermisoCopiarHobby));			
			this.jMenuItemVerFormHobby.setVisible((this.isVisibilidadCeldaVerFormHobby && this.isPermisoVerFormHobby));			
			this.jMenuItemAbrirOrderByHobby.setVisible((this.isVisibilidadCeldaOrdenHobby && this.isPermisoOrdenHobby));			
			//this.jMenuItemMostrarOcultarHobby.setVisible((this.isVisibilidadCeldaOrdenHobby && this.isPermisoOrdenHobby));
			this.jMenuItemDetalleAbrirOrderByHobby.setVisible((this.isVisibilidadCeldaOrdenHobby && this.isPermisoOrdenHobby));			
			//this.jMenuItemDetalleMostrarOcultarHobby.setVisible((this.isVisibilidadCeldaOrdenHobby && this.isPermisoOrdenHobby));			
			this.jMenuItemNuevoRelacionesHobby.setVisible((this.isVisibilidadCeldaNuevoRelacionesHobby && this.isPermisoNuevoHobby));			
			this.jMenuItemNuevoGuardarCambiosHobby.setVisible((this.isVisibilidadCeldaNuevoHobby && this.isPermisoNuevoHobby && this.isPermisoGuardarCambiosHobby));									
			
			if(this.jInternalFrameDetalleFormHobby!=null) {
			this.jInternalFrameDetalleFormHobby.jMenuItemModificarHobby.setVisible((this.isVisibilidadCeldaModificarHobby && this.isPermisoActualizarHobby));	
			this.jInternalFrameDetalleFormHobby.jMenuItemActualizarHobby.setVisible((this.isVisibilidadCeldaActualizarHobby && this.isPermisoActualizarHobby));	
			this.jInternalFrameDetalleFormHobby.jMenuItemEliminarHobby.setVisible((this.isVisibilidadCeldaEliminarHobby && this.isPermisoEliminarHobby));
			this.jInternalFrameDetalleFormHobby.jMenuItemCancelarHobby.setVisible(this.isVisibilidadCeldaCancelarHobby);				
			}
			
			this.jMenuItemGuardarCambiosHobby.setVisible((this.isVisibilidadCeldaGuardarHobby && this.isPermisoGuardarCambiosHobby));						
			this.jMenuItemGuardarCambiosTablaHobby.setVisible((this.isVisibilidadCeldaGuardarCambiosHobby && this.isPermisoGuardarCambiosHobby));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoHobby=this.jButtonNuevoHobby.isVisible();
			this.isVisibilidadCeldaDuplicarHobby=this.jButtonDuplicarHobby.isVisible();
			this.isVisibilidadCeldaCopiarHobby=this.jButtonCopiarHobby.isVisible();
			this.isVisibilidadCeldaVerFormHobby=this.jButtonVerFormHobby.isVisible();
			
			this.isVisibilidadCeldaOrdenHobby=this.jButtonAbrirOrderByHobby.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesHobby=this.jButtonNuevoRelacionesHobby.isVisible();
			this.isVisibilidadCeldaModificarHobby=this.jButtonModificarHobby.isVisible();
			
			if(this.jInternalFrameDetalleFormHobby!=null) {
			this.isVisibilidadCeldaActualizarHobby=this.jInternalFrameDetalleFormHobby.jButtonActualizarHobby.isVisible();
			this.isVisibilidadCeldaEliminarHobby=this.jInternalFrameDetalleFormHobby.jButtonEliminarHobby.isVisible();
			this.isVisibilidadCeldaCancelarHobby=this.jInternalFrameDetalleFormHobby.jButtonCancelarHobby.isVisible();
			this.isVisibilidadCeldaGuardarHobby=this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosHobby.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosHobby=this.jButtonGuardarCambiosTablaHobby.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoHobby=this.jButtonNuevoToolBarHobby.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHobby=this.jButtonNuevoRelacionesToolBarHobby.isVisible();
			
			if(this.jInternalFrameDetalleFormHobby!=null) {
			this.isVisibilidadCeldaModificarHobby=this.jInternalFrameDetalleFormHobby.jButtonModificarToolBarHobby.isVisible();
			this.isVisibilidadCeldaActualizarHobby=this.jInternalFrameDetalleFormHobby.jButtonActualizarToolBarHobby.isVisible();
			this.isVisibilidadCeldaEliminarHobby=this.jInternalFrameDetalleFormHobby.jButtonEliminarToolBarHobby.isVisible();
			this.isVisibilidadCeldaCancelarHobby=this.jInternalFrameDetalleFormHobby.jButtonCancelarToolBarHobby.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHobby=this.jButtonGuardarCambiosToolBarHobby.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHobby=this.jButtonGuardarCambiosTablaToolBarHobby.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoHobby=this.jMenuItemNuevoHobby.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHobby=this.jMenuItemNuevoRelacionesHobby.isVisible();
			
			if(this.jInternalFrameDetalleFormHobby!=null) {
			this.isVisibilidadCeldaModificarHobby=this.jInternalFrameDetalleFormHobby.jMenuItemModificarHobby.isVisible();
			this.isVisibilidadCeldaActualizarHobby=this.jInternalFrameDetalleFormHobby.jMenuItemActualizarHobby.isVisible();
			this.isVisibilidadCeldaEliminarHobby=this.jInternalFrameDetalleFormHobby.jMenuItemEliminarHobby.isVisible();
			this.isVisibilidadCeldaCancelarHobby=this.jInternalFrameDetalleFormHobby.jMenuItemCancelarHobby.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHobby=this.jMenuItemGuardarCambiosHobby.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHobby=this.jMenuItemGuardarCambiosTablaHobby.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesHobby(Boolean esInicializar) {
		if(HobbyJInternalFrame.ISBINDING_MANUAL) {			
			if(this.hobbySessionBean.getConGuardarRelaciones()) {
				//if(this.hobbySessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesHobby();
			}
			
			this.inicializarActualizarBindingBotonesManualHobby(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualHobby() {
		this.jButtonNuevoHobby.setVisible(this.isPermisoNuevoHobby);			
		this.jButtonDuplicarHobby.setVisible(this.isPermisoDuplicarHobby);			
		this.jButtonCopiarHobby.setVisible(this.isPermisoCopiarHobby);			
		this.jButtonVerFormHobby.setVisible(this.isPermisoVerFormHobby);			
		
		this.jButtonAbrirOrderByHobby.setVisible(this.isPermisoOrdenHobby);					
		
		this.jButtonNuevoRelacionesHobby.setVisible(this.isPermisoNuevoHobby);			
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jButtonModificarHobby.setVisible(this.isPermisoActualizarHobby);	
			this.jInternalFrameDetalleFormHobby.jButtonActualizarHobby.setVisible(this.isPermisoActualizarHobby);	
			this.jInternalFrameDetalleFormHobby.jButtonEliminarHobby.setVisible(this.isPermisoEliminarHobby);
			this.jInternalFrameDetalleFormHobby.jButtonCancelarHobby.setVisible(this.isVisibilidadCeldaCancelarHobby);						
			this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosHobby.setVisible(this.isPermisoGuardarCambiosHobby);							
		}
		
		this.jButtonGuardarCambiosTablaHobby.setVisible(this.isPermisoActualizarHobby);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleHobby() {
		this.jInternalFrameDetalleFormHobby.jButtonModificarHobby.setVisible(this.isPermisoActualizarHobby);	
		this.jInternalFrameDetalleFormHobby.jButtonActualizarHobby.setVisible(this.isPermisoActualizarHobby);	
		this.jInternalFrameDetalleFormHobby.jButtonEliminarHobby.setVisible(this.isPermisoEliminarHobby);
		this.jInternalFrameDetalleFormHobby.jButtonCancelarHobby.setVisible(this.isVisibilidadCeldaCancelarHobby);							
		this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosHobby.setVisible((this.isVisibilidadCeldaGuardarHobby && this.isPermisoGuardarCambiosHobby));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosHobby() {
		if(HobbyJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualHobby();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesHobby() {
	}
	
	public void jTableDatosHobbyListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarHobby(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidHobbyBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobby.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHobby(this.gethobby(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.hobby==null) {
						this.hobby = new Hobby();
					}

					this.setVariablesFormularioToObjetoActualHobby(this.hobby,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
				}

				if(this.hobby.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.hobby.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHobby(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaHobbyUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebHobby(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobby.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHobby.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHobby.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHobby(this.gethobby(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.hobbyLogic.getConnexion());

				if(this.hobby.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.hobby.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHobby=(TitledBorder)this.jScrollPanelDatosHobby.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderHobby.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaHobbyBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobby.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHobby(this.gethobby(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.hobby==null) {
						this.hobby = new Hobby();
					}

					this.setVariablesFormularioToObjetoActualHobby(this.hobby,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
				}

				if(this.hobby.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.hobby.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHobby(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoHobbyBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobby.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHobby(this.gethobby(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.hobby==null) {
						this.hobby = new Hobby();
					}

					this.setVariablesFormularioToObjetoActualHobby(this.hobby,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
				}

				if(this.hobby.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.hobby.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHobby(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreHobbyBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobby.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHobby(this.gethobby(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.hobby==null) {
						this.hobby = new Hobby();
					}

					this.setVariablesFormularioToObjetoActualHobby(this.hobby,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
				}

				if(this.hobby.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.hobby.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHobby(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionHobbyBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHobby.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHobby(this.gethobby(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.hobby==null) {
						this.hobby = new Hobby();
					}

					this.setVariablesFormularioToObjetoActualHobby(this.hobby,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);
				}

				if(this.hobby.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.hobby.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHobby(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoHobbyActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHobby(false,false);

			this.getHobbysBusquedaPorCodigo();

			this.inicializarActualizarBindingHobby(false);

			//if(HobbyBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHobby(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreHobbyActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHobby(false,false);

			this.getHobbysBusquedaPorNombre();

			this.inicializarActualizarBindingHobby(false);

			//if(HobbyBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHobby(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaHobbyActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHobby(false,false);

			this.getHobbysFK_IdEmpresa();

			this.inicializarActualizarBindingHobby(false);

			//if(HobbyBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHobby(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.hobbyLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameHobby() {
		if(this.jInternalFrameDetalleFormHobby!=null) {
		

		if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormHobby!=null) {
			this.jInternalFrameDetalleFormHobby.setVisible(false);	    			
			this.jInternalFrameDetalleFormHobby.dispose();
			this.jInternalFrameDetalleFormHobby=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoHobby!=null) {
			this.jInternalFrameReporteDinamicoHobby.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoHobby.dispose();
			this.jInternalFrameReporteDinamicoHobby=null;
		}
		
		if(this.jInternalFrameImportacionHobby!=null) {
			this.jInternalFrameImportacionHobby.setVisible(false);	    			
			this.jInternalFrameImportacionHobby.dispose();
			this.jInternalFrameImportacionHobby=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessHobby();
			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
			
			if(sTipo.equals("NuevoHobby")) {
				jButtonNuevoHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarHobby")) {
				jButtonDuplicarHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarHobby")) {
				jButtonCopiarHobbyActionPerformed(evt);
			} else if(sTipo.equals("VerFormHobby")) {
				jButtonVerFormHobbyActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarHobby")) {
				jButtonNuevoHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarHobby")) {
				jButtonDuplicarHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoHobby")) {
				jButtonNuevoHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarHobby")) {
				jButtonDuplicarHobbyActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesHobby")) {
				jButtonNuevoHobbyActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarHobby")) {
				jButtonNuevoHobbyActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesHobby")) {
				jButtonNuevoHobbyActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarHobby")) {
				jButtonModificarHobbyActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarHobby")) {
				jButtonModificarHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarHobby")) {
				jButtonModificarHobbyActionPerformed(evt);
			} else if(sTipo.equals("ActualizarHobby")) {
				jButtonActualizarHobbyActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarHobby")) {
				jButtonActualizarHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarHobby")) {
				jButtonActualizarHobbyActionPerformed(evt);
			} else if(sTipo.equals("EliminarHobby")) {
				jButtonEliminarHobbyActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarHobby")) {
				jButtonEliminarHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarHobby")) {
				jButtonEliminarHobbyActionPerformed(evt);
			} else if(sTipo.equals("CancelarHobby")) {
				jButtonCancelarHobbyActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarHobby")) {
				jButtonCancelarHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarHobby")) {
				jButtonCancelarHobbyActionPerformed(evt);
			} else if(sTipo.equals("CerrarHobby")) {
				jButtonCerrarHobbyActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarHobby")) {
				jButtonCerrarHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarHobby")) {
				jButtonCerrarHobbyActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarHobby")) {
				jButtonMostrarOcultarHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarHobby")) {
				jButtonCancelarHobbyActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosHobby")) {
				jButtonGuardarCambiosHobbyActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarHobby")) {
				jButtonGuardarCambiosHobbyActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarHobby")) {
				jButtonCopiarHobbyActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarHobby")) {
				jButtonVerFormHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosHobby")) {
				jButtonGuardarCambiosHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarHobby")) {
				jButtonCopiarHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormHobby")) {
				jButtonVerFormHobbyActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaHobby")) {
				jButtonGuardarCambiosHobbyActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarHobby")) {
				jButtonGuardarCambiosHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaHobby")) {
				jButtonGuardarCambiosHobbyActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionHobby")) {
				jButtonRecargarInformacionHobbyActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarHobby")) {
				jButtonRecargarInformacionHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionHobby")) {
				jButtonRecargarInformacionHobbyActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresHobby")) {
				jButtonAnterioresHobbyActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarHobby")) {
				jButtonAnterioresHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreHobby")) {
				jButtonAnterioresHobbyActionPerformed(evt);
			} else if(sTipo.equals("SiguientesHobby")) {
				jButtonSiguientesHobbyActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarHobby")) {
				jButtonSiguientesHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesHobby")) {
				jButtonSiguientesHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByHobby") || sTipo.equals("MenuItemDetalleAbrirOrderByHobby")) {
				jButtonAbrirOrderByHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarHobby") || sTipo.equals("MenuItemDetalleMostrarOcultarHobby")) {
				jButtonMostrarOcultarHobbyActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosHobby")) {
				jButtonNuevoGuardarCambiosHobbyActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarHobby")) {
				jButtonNuevoGuardarCambiosHobbyActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosHobby")) {
				jButtonNuevoGuardarCambiosHobbyActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoHobby")) {
				jButtonCerrarReporteDinamicoHobbyActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoHobby")) {
				jButtonGenerarReporteDinamicoHobbyActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoHobby")) {
				
				jButtonGenerarExcelReporteDinamicoHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionHobby")) {
				jButtonCerrarImportacionHobbyActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionHobby")) {
				
				jButtonGenerarImportacionHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionHobby")) {
				
				jButtonAbrirImportacionHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesHobby")) {
				jComboBoxTiposAccionesHobbyActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesHobby")) {
				jComboBoxTiposRelacionesHobbyActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioHobby")) {
				jComboBoxTiposAccionesHobbyActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarHobby")) {
				
				jComboBoxTiposSeleccionarHobbyActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralHobby")) {
				jTextFieldValorCampoGeneralHobbyActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByHobby")) {
				jButtonAbrirOrderByHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarHobby")) {
				jButtonAbrirOrderByHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByHobby")) {
				jButtonCerrarOrderByHobbyActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHobbyBusqueda")) {
				this.jButtonidHobbyBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHobbyUpdate")) {
				this.jButtonid_empresaHobbyUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHobbyBusqueda")) {
				this.jButtonid_empresaHobbyBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoHobbyBusqueda")) {
				this.jButtoncodigoHobbyBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreHobbyBusqueda")) {
				this.jButtonnombreHobbyBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionHobbyBusqueda")) {
				this.jButtondescripcionHobbyBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoHobby")) {
				this.jButtonBusquedaPorCodigoHobbyActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreHobby")) {
				this.jButtonBusquedaPorNombreHobbyActionPerformed(evt);
			}
			
			;
			
			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessHobby();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				


				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Hobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Hobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Hobby hobbyLocal=null;
			
			if(!this.getEsControlTabla()) {
				hobbyLocal=this.hobby;
			} else {
				hobbyLocal=this.hobbyAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
							
				
				


				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Hobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Hobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyAnterior =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbyAnterior =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
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
			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
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
			
			


			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
								
						
				


				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Hobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Hobby.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
								
				
				


				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Hobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Hobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyAnterior =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbyAnterior =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobby);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyAnterior =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbyAnterior =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
			
			this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
							
				
				


				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Hobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Hobby.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHobby.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobbyAnterior =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.hobbyAnterior =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
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
			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
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
			
			


			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
			
			this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
								
				
				


				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Hobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Hobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyAnterior =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbyAnterior =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
			
			this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosHobby")) {
					jCheckBoxSeleccionarTodosHobbyItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosHobby")) {
					jCheckBoxSeleccionadosHobbyItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarHobby")) {
					
				}
				
				


				
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Hobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Hobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
												
				
				


				
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Hobby.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Hobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHobby.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.hobbyAnterior =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.hobbyAnterior =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
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
			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
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
			
			


			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHobbyActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Hobby.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Hobby.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.hobby);
				
				this.actualizarInformacion("INFO_PADRE",false,this.hobby);
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
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
				
				


				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Hobby.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Hobby.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHobbyActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHobby.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.hobbyAnterior =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.hobbyAnterior =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarHobby")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosHobbyListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosHobby.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.hobby =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.hobby =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.hobby);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarHobby")) {
				
				}
				
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarHobby")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosHobby.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarHobby")) {
			
			}
			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessHobby();
			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
			if(sTipo.equals("NuevoHobby")) {
				jButtonNuevoHobbyActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarHobby")) {
				jButtonDuplicarHobbyActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarHobby")) {
				jButtonCopiarHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormHobby")) {
				jButtonVerFormHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesHobby")) {
				jButtonNuevoHobbyActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarHobby")) {
				jButtonModificarHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarHobby")) {
				jButtonActualizarHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarHobby")) {
				jButtonEliminarHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaHobby")) {
				jButtonGuardarCambiosHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarHobby")) {
				jButtonCancelarHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarHobby")) {
				jButtonCerrarHobbyActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosHobby")) {
				jButtonGuardarCambiosHobbyActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosHobby")) {
				jButtonNuevoGuardarCambiosHobbyActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByHobby")) {
				jButtonAbrirOrderByHobbyActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionHobby")) {
				jButtonRecargarInformacionHobbyActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresHobby")) {
				jButtonAnterioresHobbyActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesHobby")) {
				jButtonSiguientesHobbyActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHobbyBusqueda")) {
				this.jButtonidHobbyBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHobbyUpdate")) {
				this.jButtonid_empresaHobbyUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHobbyBusqueda")) {
				this.jButtonid_empresaHobbyBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoHobbyBusqueda")) {
				this.jButtoncodigoHobbyBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreHobbyBusqueda")) {
				this.jButtonnombreHobbyBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionHobbyBusqueda")) {
				this.jButtondescripcionHobbyBusquedaActionPerformed(evt);
			}
			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessHobby();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameHobby")) {
				closingInternalFrameHobby();
				
			} else if(sTipo.equals("jButtonCancelarHobby")) {
				JInternalFrameBase jInternalFrameDetalleFormHobby = (JInternalFrameBase)evt.getSource();
	            	
	            HobbyBeanSwingJInternalFrame jInternalFrameParent=(HobbyBeanSwingJInternalFrame)jInternalFrameDetalleFormHobby.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarHobbyActionPerformed(null);
			}
			
			HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.hobby,new Object(),this.hobbyParameterGeneral,this.hobbyReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormHobby(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormHobby(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormHobby(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.hobby)) {
			if(!esControlTabla) {
				if(HobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualHobby(this.hobby,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);			
				}
				
				if(this.hobbySessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualHobby(this.hobby,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.hobbyReturnGeneral=hobbyLogic.procesarEventosHobbysWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.hobbyLogic.getHobbys(),this.hobby,this.hobbyParameterGeneral,this.isEsNuevoHobby,classes);//this.hobbyLogic.getHobby()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanHobby(this.hobbyReturnGeneral,this.hobbyBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.hobbySessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanHobby(classes,this.hobbyReturnGeneral,this.hobbyBean,false);
					}
						
					if(this.hobbyReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyHobby(this.hobbyReturnGeneral.getHobby());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioHobby(this.hobbyReturnGeneral.getHobby());	
					}
						
					if(this.hobbyReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioHobby(this.hobbyReturnGeneral.getHobby(),classes);//this.hobbyBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioHobby(this.hobby,classes);//this.hobbyBean);									
				}
			
				if(HobbyJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualHobby(this.hobby,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHobby(this.hobby);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.hobbyAnterior!=null) {
						this.hobby=this.hobbyAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.hobbyReturnGeneral=hobbyLogic.procesarEventosHobbysWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.hobbyLogic.getHobbys(),this.hobby,this.hobbyParameterGeneral,this.isEsNuevoHobby,classes);//this.hobbyLogic.getHobby()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.hobbySessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.hobbySessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.hobbyReturnGeneral.getHobby(),hobbyLogic.getHobbys());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.hobbyReturnGeneral.getHobby(),this.hobbys);
				}
				//ARCHITECTURE
				
				//this.jTableDatosHobby.repaint();
				
				//((AbstractTableModel) this.jTableDatosHobby.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosHobby();
			}
		}
	}
	
	public void actualizarVisualTableDatosHobby() throws Exception {
		
		HobbyModel hobbyModel=(HobbyModel)this.jTableDatosHobby.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			hobbyModel.hobbys=this.hobbyLogic.getHobbys();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			hobbyModel.hobbys=this.hobbys;
		}
		
		
		((HobbyModel) this.jTableDatosHobby.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaHobby() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gethobbyAnterior(),this.hobbyLogic.getHobbys());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gethobbyAnterior(),this.hobbys);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosHobby();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioHobby(Hobby hobby,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoHobby.class)) {
					this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.setEmpleadoHobbys(hobby.getEmpleadoHobbys());
					this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoHobby(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(HobbyCliente.class)) {
					this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.setHobbyClientes(hobby.getHobbyClientes());
					this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaHobbyCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
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
										
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.hobby,new Object(),generalEntityParameterGeneral,this.hobbyReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.hobbySessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=HobbyConstantesFunciones.getClassesRelationshipsOfHobby(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=HobbyConstantesFunciones.getClassesRelationshipsFromStringsOfHobby(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormHobby(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				HobbyBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.hobby,new Object(),generalEntityParameterGeneral,this.hobbyReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioHobby(HobbyBean hobbyBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoHobby.class)) {
					this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.setEmpleadoHobbys(hobby.getEmpleadoHobbys());
					this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoHobby(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(HobbyCliente.class)) {
					this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.setHobbyClientes(hobby.getHobbyClientes());
					this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaHobbyCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanHobby(ArrayList<Classe> classes,HobbyReturnGeneral hobbyReturnGeneral,HobbyBean hobbyBean,Boolean conDefault) throws Exception {
		
			this.hobbyBean.setEmpleadoHobbys(hobbyReturnGeneral.getHobby().getEmpleadoHobbys());
			this.hobbyBean.setHobbyClientes(hobbyReturnGeneral.getHobby().getHobbyClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualHobby(Hobby hobby,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoHobby.class)) {
					hobby.setEmpleadoHobbys(this.jInternalFrameDetalleFormHobby.empleadohobbyBeanSwingJInternalFrame.empleadohobbyLogic.getEmpleadoHobbys());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(HobbyCliente.class)) {
					hobby.setHobbyClientes(this.jInternalFrameDetalleFormHobby.hobbyclienteBeanSwingJInternalFrame.hobbyclienteLogic.getHobbyClientes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.hobby)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormHobby = new HobbyDetalleFormJInternalFrame(jDesktopPane,this.hobbySessionBean.getConGuardarRelaciones(),this.hobbySessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormHobby);
		this.jInternalFrameDetalleFormHobby.setVisible(false);
		this.jInternalFrameDetalleFormHobby.setSelected(false);						
		
		this.jInternalFrameDetalleFormHobby.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormHobby.hobbyLogic=this.hobbyLogic;
		
		this.cargarCombosFrameForeignKeyHobby("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleHobby();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHobby();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyHobby("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyHobby();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormHobby.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHobby"));
		
		this.jInternalFrameDetalleFormHobby.jButtonModificarHobby.addActionListener(new ButtonActionListener(this,"ModificarHobby"));

		
		this.jInternalFrameDetalleFormHobby.jButtonModificarToolBarHobby.addActionListener(new ButtonActionListener(this,"ModificarToolBarHobby"));
					
		this.jInternalFrameDetalleFormHobby.jMenuItemModificarHobby.addActionListener(new ButtonActionListener(this,"MenuItemModificarHobby"));		
		
		
		
		this.jInternalFrameDetalleFormHobby.jButtonActualizarHobby.addActionListener (new ButtonActionListener(this,"ActualizarHobby"));
		
		
		this.jInternalFrameDetalleFormHobby.jButtonActualizarToolBarHobby.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHobby"));
						
		this.jInternalFrameDetalleFormHobby.jMenuItemActualizarHobby.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHobby"));		
		
		
		
		this.jInternalFrameDetalleFormHobby.jButtonEliminarHobby.addActionListener (new ButtonActionListener(this,"EliminarHobby"));
		
		
		this.jInternalFrameDetalleFormHobby.jButtonEliminarToolBarHobby.addActionListener (new ButtonActionListener(this,"EliminarToolBarHobby"));
								
		this.jInternalFrameDetalleFormHobby.jMenuItemEliminarHobby.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHobby"));		
		
		
		
		this.jInternalFrameDetalleFormHobby.jButtonCancelarHobby.addActionListener (new ButtonActionListener(this,"CancelarHobby"));
		
		
		this.jInternalFrameDetalleFormHobby.jButtonCancelarToolBarHobby.addActionListener (new ButtonActionListener(this,"CancelarToolBarHobby"));
					
		this.jInternalFrameDetalleFormHobby.jMenuItemCancelarHobby.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHobby"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormHobby.jMenuItemDetalleCerrarHobby.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHobby"));		
		
		
		
		this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosToolBarHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHobby"));
		
		
		
		this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosToolBarHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHobby"));
		
		
		
		this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHobby"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtonidHobbyBusqueda.addActionListener(new ButtonActionListener(this,"idHobbyBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobby.jButtonid_empresaHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtonid_empresaHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHobbyBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtoncodigoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"codigoHobbyBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtonnombreHobbyBusqueda.addActionListener(new ButtonActionListener(this,"nombreHobbyBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtondescripcionHobbyBusqueda.addActionListener(new ButtonActionListener(this,"descripcionHobbyBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormHobby.jTabbedPaneRelacionesHobby.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHobby"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameHobby"));
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHobby"));
		}
		
		this.jTableDatosHobby.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarHobby"));
		
		this.jTableDatosHobby.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarHobby"));
		
		this.jButtonNuevoHobby.addActionListener(new ButtonActionListener(this,"NuevoHobby"));
		
		this.jButtonDuplicarHobby.addActionListener(new ButtonActionListener(this,"DuplicarHobby"));
		
		this.jButtonCopiarHobby.addActionListener(new ButtonActionListener(this,"CopiarHobby"));
		
		this.jButtonVerFormHobby.addActionListener(new ButtonActionListener(this,"VerFormHobby"));
		
		
		this.jButtonNuevoToolBarHobby.addActionListener(new ButtonActionListener(this,"NuevoToolBarHobby"));
			
		this.jButtonDuplicarToolBarHobby.addActionListener(new ButtonActionListener(this,"DuplicarToolBarHobby"));
			
		this.jMenuItemNuevoHobby.addActionListener (new ButtonActionListener(this,"MenuItemNuevoHobby"));
			
		this.jMenuItemDuplicarHobby.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarHobby"));		
		
		
		this.jButtonNuevoRelacionesHobby.addActionListener (new ButtonActionListener(this,"NuevoRelacionesHobby"));
		
		
		this.jButtonNuevoRelacionesToolBarHobby.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarHobby"));
			
		this.jMenuItemNuevoRelacionesHobby.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesHobby"));		
		
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jButtonModificarHobby.addActionListener(new ButtonActionListener(this,"ModificarHobby"));
		}
		
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jButtonModificarToolBarHobby.addActionListener(new ButtonActionListener(this,"ModificarToolBarHobby"));
			
			this.jInternalFrameDetalleFormHobby.jMenuItemModificarHobby.addActionListener(new ButtonActionListener(this,"MenuItemModificarHobby"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormHobby.jButtonActualizarHobby.addActionListener (new ButtonActionListener(this,"ActualizarHobby"));
		}
		
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jButtonActualizarToolBarHobby.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHobby"));
				
			this.jInternalFrameDetalleFormHobby.jMenuItemActualizarHobby.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHobby"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jButtonEliminarHobby.addActionListener (new ButtonActionListener(this,"EliminarHobby"));
		}
		
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jButtonEliminarToolBarHobby.addActionListener (new ButtonActionListener(this,"EliminarToolBarHobby"));
						
			this.jInternalFrameDetalleFormHobby.jMenuItemEliminarHobby.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHobby"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jButtonCancelarHobby.addActionListener (new ButtonActionListener(this,"CancelarHobby"));
		}
		
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jButtonCancelarToolBarHobby.addActionListener (new ButtonActionListener(this,"CancelarToolBarHobby"));
			
			this.jInternalFrameDetalleFormHobby.jMenuItemCancelarHobby.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHobby"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarHobby.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarHobby"));		
		
		
		this.jButtonCerrarHobby.addActionListener (new ButtonActionListener(this,"CerrarHobby"));
		
		
		this.jButtonCerrarToolBarHobby.addActionListener (new ButtonActionListener(this,"CerrarToolBarHobby"));
			
		this.jMenuItemCerrarHobby.addActionListener (new ButtonActionListener(this,"MenuItemCerrarHobby"));
			
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jMenuItemDetalleCerrarHobby.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHobby"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosHobby"));
		}
		
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosToolBarHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHobby"));
		}
		
		this.jButtonCopiarToolBarHobby.addActionListener (new ButtonActionListener(this,"CopiarToolBarHobby"));
			
		this.jButtonVerFormToolBarHobby.addActionListener (new ButtonActionListener(this,"VerFormToolBarHobby"));
		
		this.jMenuItemGuardarCambiosHobby.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosHobby"));
			
		this.jMenuItemCopiarHobby.addActionListener (new ButtonActionListener(this,"MenuItemCopiarHobby"));		
		
		this.jMenuItemVerFormHobby.addActionListener (new ButtonActionListener(this,"MenuItemVerFormHobby"));		
		
		
		this.jButtonGuardarCambiosTablaHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHobby"));
		
		
		this.jButtonGuardarCambiosTablaToolBarHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarHobby"));
			
		this.jMenuItemGuardarCambiosTablaHobby.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHobby"));		
		
		
		
		this.jButtonRecargarInformacionHobby.addActionListener (new ButtonActionListener(this,"RecargarInformacionHobby"));
					
		this.jButtonRecargarInformacionToolBarHobby.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarHobby"));
		
		this.jMenuItemRecargarInformacionHobby.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionHobby"));		
		
		
		
		this.jButtonAnterioresHobby.addActionListener (new ButtonActionListener(this,"AnterioresHobby"));
		
		
		this.jButtonAnterioresToolBarHobby.addActionListener (new ButtonActionListener(this,"AnterioresToolBarHobby"));
		
		this.jMenuItemAnterioresHobby.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresHobby"));		
		
		
		this.jButtonSiguientesHobby.addActionListener (new ButtonActionListener(this,"SiguientesHobby"));
		
		
		this.jButtonSiguientesToolBarHobby.addActionListener (new ButtonActionListener(this,"SiguientesToolBarHobby"));
			
		this.jMenuItemSiguientesHobby.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesHobby"));
			
		this.jMenuItemAbrirOrderByHobby.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByHobby"));
			
		this.jMenuItemMostrarOcultarHobby.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarHobby"));
			
		this.jMenuItemDetalleAbrirOrderByHobby.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByHobby"));
			
		this.jMenuItemDetalleMostarOcultarHobby.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarHobby"));		
		
		
		this.jButtonNuevoGuardarCambiosHobby.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosHobby"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarHobby.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarHobby"));
			
		this.jMenuItemNuevoGuardarCambiosHobby.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosHobby"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosHobby.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosHobby"));

		this.jCheckBoxSeleccionadosHobby.addItemListener(new CheckBoxItemListener(this,"SeleccionadosHobby"));
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHobby"));
		}
		
		
		this.jComboBoxTiposRelacionesHobby.addActionListener (new ButtonActionListener(this,"TiposRelacionesHobby"));
			
		this.jComboBoxTiposAccionesHobby.addActionListener (new ButtonActionListener(this,"TiposAccionesHobby"));
					
		this.jComboBoxTiposSeleccionarHobby.addActionListener (new ButtonActionListener(this,"TiposSeleccionarHobby"));
			
		this.jTextFieldValorCampoGeneralHobby.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralHobby"));		
		
		
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtonidHobbyBusqueda.addActionListener(new ButtonActionListener(this,"idHobbyBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobby.jButtonid_empresaHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtonid_empresaHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHobbyBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtoncodigoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"codigoHobbyBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtonnombreHobbyBusqueda.addActionListener(new ButtonActionListener(this,"nombreHobbyBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtondescripcionHobbyBusqueda.addActionListener(new ButtonActionListener(this,"descripcionHobbyBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoHobby.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoHobby"));

			this.jButtonBusquedaPorNombreHobby.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreHobby"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoHobby!=null) {
				this.jInternalFrameReporteDinamicoHobby.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHobby"));
				this.jInternalFrameReporteDinamicoHobby.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHobby"));
				this.jInternalFrameReporteDinamicoHobby.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHobby"));
			}
			
			//this.jButtonCerrarReporteDinamicoHobby.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHobby"));				
			//this.jButtonGenerarReporteDinamicoHobby.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHobby"));
			//this.jButtonGenerarExcelReporteDinamicoHobby.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHobby"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionHobby!=null) {
				this.jInternalFrameImportacionHobby.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHobby"));
				this.jInternalFrameImportacionHobby.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHobby"));
				this.jInternalFrameImportacionHobby.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHobby"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByHobby.addActionListener (new ButtonActionListener(this,"AbrirOrderByHobby"));
			
			this.jButtonAbrirOrderByToolBarHobby.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarHobby"));			
			
			if(this.jInternalFrameOrderByHobby!=null) {
				this.jInternalFrameOrderByHobby.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHobby"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormHobby!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHobby.jTabbedPaneRelacionesHobby.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHobby"));
		
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
            		closingInternalFrameHobby();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormHobby.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormHobby = (JInternalFrameBase)event.getSource();
	            	
	            HobbyBeanSwingJInternalFrame jInternalFrameParent=(HobbyBeanSwingJInternalFrame)jInternalFrameDetalleFormHobby.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarHobbyActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosHobby.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosHobbyListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosHobby.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosHobby.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoHobby";
		inputMap = this.jButtonNuevoHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHobbyActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHobbyActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesHobby";
		inputMap = this.jButtonNuevoRelacionesHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHobbyActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarHobby";
		inputMap = this.jButtonModificarHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarHobby";
		inputMap = this.jButtonActualizarHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarHobby";
		inputMap = this.jButtonEliminarHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarHobby";
		inputMap = this.jButtonCancelarHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarHobby";
		inputMap = this.jButtonCerrarHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosHobby";
		inputMap = this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosHobby.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormHobby.jButtonGuardarCambiosHobby.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosHobbyActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosHobby.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosHobbyItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesHobby.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesHobbyActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarHobby.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarHobbyActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralHobby.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralHobbyActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtonidHobbyBusqueda.addActionListener(new ButtonActionListener(this,"idHobbyBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHobby.jButtonid_empresaHobbyUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHobbyUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtonid_empresaHobbyBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHobbyBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtoncodigoHobbyBusqueda.addActionListener(new ButtonActionListener(this,"codigoHobbyBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtonnombreHobbyBusqueda.addActionListener(new ButtonActionListener(this,"nombreHobbyBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHobby.jButtondescripcionHobbyBusqueda.addActionListener(new ButtonActionListener(this,"descripcionHobbyBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoHobby.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoHobby"));

		this.jButtonBusquedaPorNombreHobby.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreHobby"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionHobby.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionHobbyActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarHobbyActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarHobby.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosHobby(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Hobby hobbyAux:this.hobbyLogic.getHobbys()) {
					hobbyAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Hobby hobbyAux:hobbys) {
					hobbyAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosHobbyItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHobby(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Hobby hobbyAux:this.hobbyLogic.getHobbys()) {
						hobbyAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Hobby hobbyAux:hobbys) {
						hobbyAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Hobby hobbyAux:this.hobbyLogic.getHobbys()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Hobby hobbyAux:hobbys) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaHobby(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHobby.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHobby.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHobby,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosHobbyItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHobby(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosHobby.getSelectedRows();
			
			Hobby hobbyLocal=new Hobby();
			
			//this.seleccionarTodosHobby(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					hobbyLocal =(Hobby) this.hobbyLogic.getHobbys().toArray()[this.jTableDatosHobby.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					hobbyLocal =(Hobby) this.hobbys.toArray()[this.jTableDatosHobby.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				hobbyLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Hobby hobbyAux:this.hobbyLogic.getHobbys()) {
						hobbyAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Hobby hobbyAux:hobbys) {
						hobbyAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaHobby(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHobby.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHobby.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHobby,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualHobbyItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarHobbyParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralHobbyActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingHobby(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralHobby.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Hobby hobbyAux:this.hobbyLogic.getHobbys()) {
				
						if(sTipoSeleccionar.equals(HobbyConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							hobbyAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HobbyConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							hobbyAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HobbyConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							hobbyAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Hobby hobbyAux:hobbys) {
					
						if(sTipoSeleccionar.equals(HobbyConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							hobbyAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HobbyConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							hobbyAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HobbyConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							hobbyAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaHobby(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesHobbyActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingHobby(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioHobby=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesHobby.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteHobby) {				
					conSplash=true;//false;										
					
					//this.startProcessHobby(conSplash);
				
					this.generarReporteHobbysSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHobby.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoHobbysSeleccionados();
				//this.jComboBoxTiposAccionesHobby.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHobbysSeleccionados(false);
				//this.jComboBoxTiposAccionesHobby.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHobbysSeleccionados(true);
				//this.jComboBoxTiposAccionesHobby.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHobby();
				
				this.exportarHobbysSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHobby.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionHobbys();
				//this.importarHobbys();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHobby.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHobby();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelHobbysSeleccionados();
				//this.jComboBoxTiposAccionesHobby.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Hobby", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessHobby();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoHobby)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyHobby(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Hobby",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHobby.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.setSelectedIndex(0);					
				}	
			} 			
			else if(HobbyBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteHobby) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessHobby(conSplash);
					
						//this.actualizarParametrosGeneralHobby();
						
						this.generarReporteProcesoAccionHobbysSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesHobby.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(HobbyBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO HobbyES SELECCIONADOS?", "MANTENIMIENTO DE Hobby", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessHobby();
				
						this.actualizarParametrosGeneralHobby();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.hobbyReturnGeneral=hobbyLogic.procesarAccionHobbysWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.hobbyLogic.getHobbys(),this.hobbyParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarHobbyReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHobby.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralHobby();
					
					HobbyBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarHobbyReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHobby.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHobby.jComboBoxTiposAccionesFormularioHobby.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessHobby(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesHobbyActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessHobby();
			
			if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();		
			Hobby hobby=new Hobby();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingHobby(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesHobby.getSelectedItem();
			
			
			
			
			hobbysSeleccionados=this.getHobbysSeleccionados(true);
			//this.sTipoAccion;
			
			if(hobbysSeleccionados.size()==1) {
				for(Hobby hobbyAux:hobbysSeleccionados) {
					hobby=hobbyAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Empleado Hobby")) {
					jButtonEmpleadoHobbyActionPerformed(null,rowIndex,true,false,hobby);
				}
				else if(this.sTipoRelacion.equals("Hobby Cliente")) {
					jButtonHobbyClienteActionPerformed(null,rowIndex,true,false,hobby);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessHobby();
			
      		//this.finishProcessHobby(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarHobbyReturnGeneral() throws Exception {
		if(this.hobbyReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.hobbyReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.hobbyReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.hobbyReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.hobbyReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.hobbyReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingHobby(false);
		}
		
		if(this.hobbyReturnGeneral.getConRetornoLista() || this.hobbyReturnGeneral.getConRetornoObjeto()) {
			if(this.hobbyReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.hobbyLogic.setHobbys(this.hobbyReturnGeneral.getHobbys());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.hobbyReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.hobbyLogic.setHobby(this.hobbyReturnGeneral.getHobby());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingHobby(false);
		}
	}
	
	public void actualizarParametrosGeneralHobby() throws Exception {
		
		
	}
	
	public ArrayList<Hobby> getHobbysSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioHobby) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Hobby hobbyAux:hobbyLogic.getHobbys()) {
					if(hobbyAux.getIsSelected()) {
						hobbysSeleccionados.add(hobbyAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Hobby hobbyAux:this.hobbys) {
					if(hobbyAux.getIsSelected()) {
						hobbysSeleccionados.add(hobbyAux);				
					}
				}
			}
			
			if(hobbysSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						hobbysSeleccionados.addAll(this.hobbyLogic.getHobbys());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						hobbysSeleccionados.addAll(this.hobbys);				
					}
				}
			}
		} else {
			hobbysSeleccionados.add(this.hobby);
		}
		
		return hobbysSeleccionados;
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
	
	public void generarReporteHobbysSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalHobbysSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoHobbysSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHobbysSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHobbysSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesHobbysSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Hobby",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesHobbysSeleccionados() throws Exception {
		ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();		
		
		hobbysSeleccionados=this.getHobbysSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteHobbys("Todos",hobbysSeleccionados);
		
	}	
	
	public void generarReporteNormalHobbysSeleccionados() throws Exception {
		ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();		
		
		hobbysSeleccionados=this.getHobbysSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteHobbys("Todos",hobbysSeleccionados);
	}		
	
	public void generarReporteProcesoAccionHobbysSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();
		
		hobbysSeleccionados=this.getHobbysSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteHobbys("Todos",hobbysSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoHobbysSeleccionados() throws Exception {
		ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();		
		
		
		this.abrirInicializarFrameReporteDinamicoHobby();
		
		
		hobbysSeleccionados=this.getHobbysSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoHobby();
		
		
		//this.generarReporteHobbys("Todos",hobbysSeleccionados ,hobbyImplementable,hobbyImplementableHome);
	}
	
	public void mostrarImportacionHobbys() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionHobby();
		
		this.abrirFrameImportacionHobby();		
		
			
		//this.generarReporteHobbys("Todos",hobbysSeleccionados ,hobbyImplementable,hobbyImplementableHome);
	}
	
	public void importarHobbys() throws Exception {		
	
	}
	
	public void exportarHobbysSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelHobbysSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoHobbysSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlHobbysSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Hobby",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoHobbysSeleccionados() throws Exception {
		ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();		
		
		hobbysSeleccionados=this.getHobbysSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobby."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarHobby(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Hobby hobbyAux:hobbysSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarHobby(hobbyAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//hobbyAux.setsDetalleGeneralEntityReporte(hobbyAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarHobby(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=HobbyConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HobbyConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HobbyConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HobbyConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HobbyConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HobbyConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarHobby(Hobby hobby,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=hobby.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=hobby.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=hobby.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=hobby.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=hobby.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=hobby.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelHobbysSeleccionados() throws Exception {
		ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();		
		
		hobbysSeleccionados=this.getHobbysSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobby.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Hobbys");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelHobby(row);				
				iRow++;
			}				
			
			for(Hobby hobbyAux:hobbysSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelHobby(hobbyAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlHobbysSeleccionados() throws Exception {
		ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();		
		
		hobbysSeleccionados=this.getHobbysSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"hobby.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("hobbys");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("hobby");
			//elementRoot.appendChild(element);
		
			for(Hobby hobbyAux:hobbysSeleccionados) {
				element = document.createElement("hobby");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlHobby(hobbyAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.hobbySessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Hobby",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelHobby(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(HobbyConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(HobbyConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(HobbyConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(HobbyConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(HobbyConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(HobbyConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelHobby(Hobby hobby,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(hobby.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(hobby.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(hobby.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(hobby.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(hobby.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlHobby(Hobby hobby,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(HobbyConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(hobby.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(HobbyConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(hobby.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(HobbyConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(hobby.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(HobbyConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(hobby.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(HobbyConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(hobby.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(HobbyConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(hobby.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoHobbysSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Hobby> hobbysSeleccionados=new ArrayList<Hobby>();
		
		hobbysSeleccionados=this.getHobbysSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoHobby(hobbysSeleccionados);
		
		this.generarReporteHobbys("Todos",hobbysSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoHobby(ArrayList<Hobby> hobbysSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Hobby hobbyAux:hobbysSeleccionados) {
				hobbyAux.setsDetalleGeneralEntityReporte(hobbyAux.toString());
			
				if(sTipoSeleccionar.equals(HobbyConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					hobbyAux.setsDescripcionGeneralEntityReporte1(hobbyAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HobbyConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					hobbyAux.setsDescripcionGeneralEntityReporte1(hobbyAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(HobbyConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					hobbyAux.setsDescripcionGeneralEntityReporte1(hobbyAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(HobbyConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					hobbyAux.setsDescripcionGeneralEntityReporte1(hobbyAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HobbyConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesHobby(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoHobby=true;
				this.isVisibilidadCeldaNuevoRelacionesHobby=true;
				this.isVisibilidadCeldaGuardarCambiosHobby=true;
			}
			
			this.isVisibilidadCeldaModificarHobby=false;
			this.isVisibilidadCeldaActualizarHobby=false;
			this.isVisibilidadCeldaEliminarHobby=false;
			this.isVisibilidadCeldaCancelarHobby=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobby=true;
				} else {
					this.isVisibilidadCeldaGuardarHobby=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoHobby=false;
			this.isVisibilidadCeldaNuevoRelacionesHobby=false;
			this.isVisibilidadCeldaGuardarCambiosHobby=false;
			this.isVisibilidadCeldaModificarHobby=false;
			this.isVisibilidadCeldaActualizarHobby=true;
			this.isVisibilidadCeldaEliminarHobby=false;
			this.isVisibilidadCeldaCancelarHobby=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobby=true;
				} else {
					this.isVisibilidadCeldaGuardarHobby=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoHobby=false;
			this.isVisibilidadCeldaNuevoRelacionesHobby=false;
			this.isVisibilidadCeldaGuardarCambiosHobby=false;
			this.isVisibilidadCeldaModificarHobby=false;
			this.isVisibilidadCeldaActualizarHobby=true;
			this.isVisibilidadCeldaEliminarHobby=true;
			this.isVisibilidadCeldaCancelarHobby=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobby=true;
				} else {
					this.isVisibilidadCeldaGuardarHobby=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoHobby=false;
			this.isVisibilidadCeldaNuevoRelacionesHobby=false;
			this.isVisibilidadCeldaGuardarCambiosHobby=false;
			this.isVisibilidadCeldaModificarHobby=false;
			this.isVisibilidadCeldaActualizarHobby=true;
			this.isVisibilidadCeldaEliminarHobby=false;
			this.isVisibilidadCeldaCancelarHobby=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobby=false;
				} else {
					this.isVisibilidadCeldaGuardarHobby=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoHobby=true;
			this.isVisibilidadCeldaNuevoRelacionesHobby=true;
			this.isVisibilidadCeldaGuardarCambiosHobby=true;
			this.isVisibilidadCeldaModificarHobby=false;
			this.isVisibilidadCeldaActualizarHobby=false;
			this.isVisibilidadCeldaEliminarHobby=false;
			this.isVisibilidadCeldaCancelarHobby=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobby=true;
				} else {
					this.isVisibilidadCeldaGuardarHobby=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoHobby=false;
			this.isVisibilidadCeldaNuevoRelacionesHobby=false;
			this.isVisibilidadCeldaGuardarCambiosHobby=false;
			this.isVisibilidadCeldaActualizarHobby=false;
			this.isVisibilidadCeldaEliminarHobby=false;
			this.isVisibilidadCeldaCancelarHobby=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobby=false;
				} else {
					this.isVisibilidadCeldaGuardarHobby=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoHobby=false;
			this.isVisibilidadCeldaNuevoRelacionesHobby=false;
			this.isVisibilidadCeldaGuardarCambiosHobby=false;
			this.isVisibilidadCeldaModificarHobby=true;
			this.isVisibilidadCeldaActualizarHobby=false;
			this.isVisibilidadCeldaEliminarHobby=false;
			this.isVisibilidadCeldaCancelarHobby=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHobby=false;
				} else {
					this.isVisibilidadCeldaGuardarHobby=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(HobbyJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoHobby=true;
			this.isVisibilidadCeldaNuevoRelacionesHobby=true;
			this.isVisibilidadCeldaGuardarCambiosHobby=true;
		} else {
			this.actualizarEstadoPanelsHobby(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarHobby=false;
			//this.isVisibilidadCeldaVerFormHobby=false;
			this.isVisibilidadCeldaDuplicarHobby=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!hobbySessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesHobby=false;
		} else {
			this.isVisibilidadCeldaNuevoHobby=false;
			this.isVisibilidadCeldaGuardarCambiosHobby=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(hobbySessionBean.getEsGuardarRelacionado()) {
			if(!hobbySessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesHobby=false;												
			}
			
			this.jButtonCerrarHobby.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesHobby=false;
		}
		
		if(!this.permiteMantenimiento(this.hobby)) {
			this.isVisibilidadCeldaActualizarHobby=false;
			this.isVisibilidadCeldaEliminarHobby=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesHobby() {
		this.isVisibilidadCeldaNuevoHobby=false;
		this.isVisibilidadCeldaGuardarCambiosHobby=false;
	}
	
	public void actualizarEstadoPanelsHobby(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionHobby!=null) {
				this.jScrollPanelDatosEdicionHobby.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobby!=null) {
				this.jTabbedPaneBusquedasHobby.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHobby!=null) {
				this.jScrollPanelDatosHobby.setVisible(true);
			}
			
			if(this.jPanelPaginacionHobby!=null) {
				this.jPanelPaginacionHobby.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHobby!=null) {
				this.jPanelParametrosReportesHobby.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionHobby!=null) {
				this.jScrollPanelDatosEdicionHobby.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobby!=null) {
				this.jTabbedPaneBusquedasHobby.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosHobby!=null) {
				this.jScrollPanelDatosHobby.setVisible(false);
			}
			
			if(this.jPanelPaginacionHobby!=null) {
				this.jPanelPaginacionHobby.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHobby!=null) {
				this.jPanelParametrosReportesHobby.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionHobby!=null) {
				this.jScrollPanelDatosEdicionHobby.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobby!=null) {
				this.jTabbedPaneBusquedasHobby.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHobby!=null) {
				this.jScrollPanelDatosHobby.setVisible(false);
			}
			
			if(this.jPanelPaginacionHobby!=null) {
				this.jPanelPaginacionHobby.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHobby!=null) {
				this.jPanelParametrosReportesHobby.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionHobby!=null) {
				this.jScrollPanelDatosEdicionHobby.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobby!=null) {
				this.jTabbedPaneBusquedasHobby.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHobby!=null) {
				this.jScrollPanelDatosHobby.setVisible(false);
			}
			
			if(this.jPanelPaginacionHobby!=null) {
				this.jPanelPaginacionHobby.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHobby!=null) {
				this.jPanelParametrosReportesHobby.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionHobby!=null) {
				this.jScrollPanelDatosEdicionHobby.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobby!=null) {
				this.jTabbedPaneBusquedasHobby.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHobby!=null) {
				this.jScrollPanelDatosHobby.setVisible(true);
			}
			
			if(this.jPanelPaginacionHobby!=null) {
				this.jPanelPaginacionHobby.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHobby!=null) {
				this.jPanelParametrosReportesHobby.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionHobby!=null) {
				this.jScrollPanelDatosEdicionHobby.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobby!=null) {
				this.jTabbedPaneBusquedasHobby.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHobby!=null) {
				this.jScrollPanelDatosHobby.setVisible(true);
			}
			
			if(this.jPanelPaginacionHobby!=null) {
				this.jPanelPaginacionHobby.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHobby!=null) {
				this.jPanelParametrosReportesHobby.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionHobby!=null) {
				this.jScrollPanelDatosEdicionHobby.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobby!=null) {
				this.jTabbedPaneBusquedasHobby.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHobby!=null) {
				this.jScrollPanelDatosHobby.setVisible(true);
			}
			
			if(this.jPanelPaginacionHobby!=null) {
				this.jPanelPaginacionHobby.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHobby!=null) {
				this.jPanelParametrosReportesHobby.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.hobbySessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasHobby!=null) {
					this.jTabbedPaneBusquedasHobby.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesHobby!=null) {
				this.jPanelParametrosReportesHobby.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.hobbySessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHobby!=null) {
				this.jTabbedPaneBusquedasHobby.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesHobby!=null) {
				this.jPanelParametrosReportesHobby.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasHobby.remove(jPanelBusquedaPorCodigoHobby);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasHobby.remove(jPanelBusquedaPorNombreHobby);}
		}
		
	}
	
	

	public String registrarSesionHobbyParaEmpleadoHobbyes() throws Exception {
		Boolean isPaginaPopupEmpleadoHobby=false;

		try {

			if(this.hobbySessionBean==null) {
				this.hobbySessionBean=new HobbySessionBean();
			}

			if(this.jInternalFrameDetalleFormHobby.empleadohobbySessionBean==null) {
				this.jInternalFrameDetalleFormHobby.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
			}

			this.jInternalFrameDetalleFormHobby.empleadohobbySessionBean.setsPathNavegacionActual(hobbySessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoHobbyConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormHobby.empleadohobbySessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleadoHobby=this.jInternalFrameDetalleFormHobby.empleadohobbySessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormHobby.empleadohobbySessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoHobby(true);
			this.jInternalFrameDetalleFormHobby.empleadohobbySessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoHobby(HobbyConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormHobby.empleadohobbySessionBean.setisBusquedaDesdeForeignKeySesionHobby(true);
			this.jInternalFrameDetalleFormHobby.empleadohobbySessionBean.setlidHobbyActual(this.idHobbyActual);

			hobbySessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyHobby(true);
			hobbySessionBean.setlIdHobbyActualForeignKey(this.idHobbyActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionHobbyParaHobbyClientes() throws Exception {
		Boolean isPaginaPopupHobbyCliente=false;

		try {

			if(this.hobbySessionBean==null) {
				this.hobbySessionBean=new HobbySessionBean();
			}

			if(this.jInternalFrameDetalleFormHobby.hobbyclienteSessionBean==null) {
				this.jInternalFrameDetalleFormHobby.hobbyclienteSessionBean=new HobbyClienteSessionBean();
			}

			this.jInternalFrameDetalleFormHobby.hobbyclienteSessionBean.setsPathNavegacionActual(hobbySessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+HobbyClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormHobby.hobbyclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupHobbyCliente=this.jInternalFrameDetalleFormHobby.hobbyclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormHobby.hobbyclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeHobbyCliente(true);
			this.jInternalFrameDetalleFormHobby.hobbyclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeHobbyCliente(HobbyConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormHobby.hobbyclienteSessionBean.setisBusquedaDesdeForeignKeySesionHobby(true);
			this.jInternalFrameDetalleFormHobby.hobbyclienteSessionBean.setlidHobbyActual(this.idHobbyActual);

			hobbySessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyHobby(true);
			hobbySessionBean.setlIdHobbyActualForeignKey(this.idHobbyActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//HobbySessionBean hobbySessionBean=new HobbySessionBean();
		
		if(this.hobbySessionBean==null) {
			this.hobbySessionBean=new HobbySessionBean();
		}
		
		this.hobbySessionBean.setsUltimaBusquedaHobby(this.getsAccionBusqueda());
		this.hobbySessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.hobbySessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			hobbySessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			hobbySessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			hobbySessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//HobbySessionBean hobbySessionBean=new HobbySessionBean();
		
		if(this.hobbySessionBean==null) {
			this.hobbySessionBean=new HobbySessionBean();
		}
		
		if(this.hobbySessionBean.getsUltimaBusquedaHobby()!=null&&!this.hobbySessionBean.getsUltimaBusquedaHobby().equals("")) {
			this.setsAccionBusqueda(hobbySessionBean.getsUltimaBusquedaHobby());
			this.setiNumeroPaginacion(hobbySessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(hobbySessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(hobbySessionBean.getcodigo());
				hobbySessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(hobbySessionBean.getnombre());
				hobbySessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(hobbySessionBean.getid_empresa());
				hobbySessionBean.setid_empresa(-1L);
			}
		}
		
		this.hobbySessionBean.setsUltimaBusquedaHobby("");
		this.hobbySessionBean.setiNumeroPaginacion(HobbyConstantesFunciones.INUMEROPAGINACION);
		this.hobbySessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaHobby(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioHobby() {
		this.updateBorderResaltarBusquedasFormularioHobby();
		this.updateVisibilidadBusquedasFormularioHobby();
		this.updateHabilitarBusquedasFormularioHobby();
	}
	
	public void updateBorderResaltarBusquedasFormularioHobby() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasHobby.getComponents().length>0) {
	

		if(this.hobbyConstantesFunciones.resaltarBusquedaPorCodigoHobby!=null) {
			index= this.jTabbedPaneBusquedasHobby.indexOfComponent(this.jPanelBusquedaPorCodigoHobby);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHobby.getComponent(index);
				jPanel.setBorder(this.hobbyConstantesFunciones.resaltarBusquedaPorCodigoHobby);
			}
		}

		if(this.hobbyConstantesFunciones.resaltarBusquedaPorNombreHobby!=null) {
			index= this.jTabbedPaneBusquedasHobby.indexOfComponent(this.jPanelBusquedaPorNombreHobby);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHobby.getComponent(index);
				jPanel.setBorder(this.hobbyConstantesFunciones.resaltarBusquedaPorNombreHobby);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioHobby() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasHobby.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHobby.indexOfComponent(this.jPanelBusquedaPorCodigoHobby);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHobby.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.hobbyConstantesFunciones.mostrarBusquedaPorCodigoHobby);
			if(!this.hobbyConstantesFunciones.mostrarBusquedaPorCodigoHobby && index>-1) {
				this.jTabbedPaneBusquedasHobby.remove(index);
			}

			index= this.jTabbedPaneBusquedasHobby.indexOfComponent(this.jPanelBusquedaPorNombreHobby);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHobby.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.hobbyConstantesFunciones.mostrarBusquedaPorNombreHobby);
			if(!this.hobbyConstantesFunciones.mostrarBusquedaPorNombreHobby && index>-1) {
				this.jTabbedPaneBusquedasHobby.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioHobby() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasHobby.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHobby.indexOfComponent(this.jPanelBusquedaPorCodigoHobby);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHobby.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.hobbyConstantesFunciones.activarBusquedaPorCodigoHobby);
				this.jTabbedPaneBusquedasHobby.setEnabledAt(index,this.hobbyConstantesFunciones.activarBusquedaPorCodigoHobby);
			}

			index= this.jTabbedPaneBusquedasHobby.indexOfComponent(this.jPanelBusquedaPorNombreHobby);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHobby.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.hobbyConstantesFunciones.activarBusquedaPorNombreHobby);
				this.jTabbedPaneBusquedasHobby.setEnabledAt(index,this.hobbyConstantesFunciones.activarBusquedaPorNombreHobby);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaHobby(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasHobby.indexOfComponent(this.jPanelBusquedaPorCodigoHobby);

			this.jTabbedPaneBusquedasHobby.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHobby.getComponent(index);

			this.hobbyConstantesFunciones.setResaltarBusquedaPorCodigoHobby(resaltar);

			jPanel.setBorder(this.hobbyConstantesFunciones.resaltarBusquedaPorCodigoHobby);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasHobby.indexOfComponent(this.jPanelBusquedaPorNombreHobby);

			this.jTabbedPaneBusquedasHobby.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHobby.getComponent(index);

			this.hobbyConstantesFunciones.setResaltarBusquedaPorNombreHobby(resaltar);

			jPanel.setBorder(this.hobbyConstantesFunciones.resaltarBusquedaPorNombreHobby);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarHobby.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioHobby() throws Exception {

		if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioHobby();
		this.updateVisibilidadResaltarControlesFormularioHobby();
		this.updateHabilitarResaltarControlesFormularioHobby();
		
	}
	
	public void updateBorderResaltarControlesFormularioHobby() throws Exception {
		if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.hobbyConstantesFunciones.resaltaridHobby!=null && this.jInternalFrameDetalleFormHobby!=null) {this.jInternalFrameDetalleFormHobby.jLabelidHobby.setBorder(this.hobbyConstantesFunciones.resaltaridHobby);}
		if(this.hobbyConstantesFunciones.resaltarid_empresaHobby!=null && this.jInternalFrameDetalleFormHobby!=null) {this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.setBorder(this.hobbyConstantesFunciones.resaltarid_empresaHobby);}
		if(this.hobbyConstantesFunciones.resaltarcodigoHobby!=null && this.jInternalFrameDetalleFormHobby!=null) {this.jInternalFrameDetalleFormHobby.jTextFieldcodigoHobby.setBorder(this.hobbyConstantesFunciones.resaltarcodigoHobby);}
		if(this.hobbyConstantesFunciones.resaltarnombreHobby!=null && this.jInternalFrameDetalleFormHobby!=null) {this.jInternalFrameDetalleFormHobby.jTextAreanombreHobby.setBorder(this.hobbyConstantesFunciones.resaltarnombreHobby);}
		if(this.hobbyConstantesFunciones.resaltardescripcionHobby!=null && this.jInternalFrameDetalleFormHobby!=null) {this.jInternalFrameDetalleFormHobby.jTextAreadescripcionHobby.setBorder(this.hobbyConstantesFunciones.resaltardescripcionHobby);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioHobby() throws Exception {		
		if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHobby!=null) {
	
		//this.jInternalFrameDetalleFormHobby.jLabelidHobby.setVisible(this.hobbyConstantesFunciones.mostraridHobby);
		this.jInternalFrameDetalleFormHobby.jPanelidHobby.setVisible(this.hobbyConstantesFunciones.mostraridHobby);
		//this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.setVisible(this.hobbyConstantesFunciones.mostrarid_empresaHobby);
		this.jInternalFrameDetalleFormHobby.jPanelid_empresaHobby.setVisible(this.hobbyConstantesFunciones.mostrarid_empresaHobby);
		//this.jInternalFrameDetalleFormHobby.jTextFieldcodigoHobby.setVisible(this.hobbyConstantesFunciones.mostrarcodigoHobby);
		this.jInternalFrameDetalleFormHobby.jPanelcodigoHobby.setVisible(this.hobbyConstantesFunciones.mostrarcodigoHobby);
		//this.jInternalFrameDetalleFormHobby.jTextAreanombreHobby.setVisible(this.hobbyConstantesFunciones.mostrarnombreHobby);
		this.jInternalFrameDetalleFormHobby.jPanelnombreHobby.setVisible(this.hobbyConstantesFunciones.mostrarnombreHobby);
		//this.jInternalFrameDetalleFormHobby.jTextAreadescripcionHobby.setVisible(this.hobbyConstantesFunciones.mostrardescripcionHobby);
		this.jInternalFrameDetalleFormHobby.jPaneldescripcionHobby.setVisible(this.hobbyConstantesFunciones.mostrardescripcionHobby);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioHobby() throws Exception {
		if(this.jInternalFrameDetalleFormHobby==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHobby!=null) {
	
		this.jInternalFrameDetalleFormHobby.jLabelidHobby.setEnabled(this.hobbyConstantesFunciones.activaridHobby);
		this.jInternalFrameDetalleFormHobby.jComboBoxid_empresaHobby.setEnabled(this.hobbyConstantesFunciones.activarid_empresaHobby);
		this.jInternalFrameDetalleFormHobby.jTextFieldcodigoHobby.setEnabled(this.hobbyConstantesFunciones.activarcodigoHobby);
		this.jInternalFrameDetalleFormHobby.jTextAreanombreHobby.setEnabled(this.hobbyConstantesFunciones.activarnombreHobby);
		this.jInternalFrameDetalleFormHobby.jTextAreadescripcionHobby.setEnabled(this.hobbyConstantesFunciones.activardescripcionHobby);
		}
	}
	
		
}