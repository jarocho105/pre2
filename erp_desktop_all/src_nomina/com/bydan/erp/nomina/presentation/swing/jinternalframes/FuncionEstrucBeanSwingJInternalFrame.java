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

import com.bydan.erp.nomina.util.FuncionEstrucConstantesFunciones;
import com.bydan.erp.nomina.util.FuncionEstrucParameterReturnGeneral;
//import com.bydan.erp.nomina.util.FuncionEstrucParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.FuncionEstrucBean;
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
public class FuncionEstrucBeanSwingJInternalFrame extends FuncionEstrucJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FuncionEstrucBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FuncionEstruc> funcionestrucValidator = new ClassValidator<FuncionEstruc>(FuncionEstruc.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FuncionEstruc funcionestruc;	
	public FuncionEstruc funcionestrucAux;
	public FuncionEstruc funcionestrucAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FuncionEstruc funcionestrucTotales;
	public Long idFuncionEstrucActual;
	public Long iIdNuevoFuncionEstruc=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboEstructura="";

	public List<Estructura> estructurasForeignKey;

	public List<Estructura> getestructurasForeignKey() {
		return estructurasForeignKey;
	}

	public void setestructurasForeignKey(List<Estructura> estructurasForeignKey) {
		this.estructurasForeignKey = estructurasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraForeignKey;

	public Estructura getestructuraForeignKey() {
		return estructuraForeignKey;
	}

	public void setestructuraForeignKey(Estructura estructuraForeignKey) {
		this.estructuraForeignKey = estructuraForeignKey;
	}

	public String sFinalQueryComboFuncion="";

	public List<Funcion> funcionsForeignKey;

	public List<Funcion> getfuncionsForeignKey() {
		return funcionsForeignKey;
	}

	public void setfuncionsForeignKey(List<Funcion> funcionsForeignKey) {
		this.funcionsForeignKey = funcionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Funcion funcionForeignKey;

	public Funcion getfuncionForeignKey() {
		return funcionForeignKey;
	}

	public void setfuncionForeignKey(Funcion funcionForeignKey) {
		this.funcionForeignKey = funcionForeignKey;
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
	
	public Boolean isPermisoTodoFuncionEstruc;
	public Boolean isPermisoNuevoFuncionEstruc;
	public Boolean isPermisoActualizarFuncionEstruc;
	public Boolean isPermisoActualizarOriginalFuncionEstruc;
	public Boolean isPermisoEliminarFuncionEstruc;
	public Boolean isPermisoGuardarCambiosFuncionEstruc;
	public Boolean isPermisoConsultaFuncionEstruc;
	public Boolean isPermisoBusquedaFuncionEstruc;
	public Boolean isPermisoReporteFuncionEstruc;
	public Boolean isPermisoPaginacionMedioFuncionEstruc;
	public Boolean isPermisoPaginacionAltoFuncionEstruc;
	public Boolean isPermisoPaginacionTodoFuncionEstruc;
	public Boolean isPermisoCopiarFuncionEstruc;
	public Boolean isPermisoVerFormFuncionEstruc;
	public Boolean isPermisoDuplicarFuncionEstruc;
	public Boolean isPermisoOrdenFuncionEstruc;
	
	
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
	
	public FuncionEstrucParameterReturnGeneral funcionestrucReturnGeneral;
	public FuncionEstrucParameterReturnGeneral funcionestrucParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFuncionEstruc=false;
	public Boolean esParaAccionDesdeFormularioFuncionEstruc=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FuncionEstrucSessionBeanAdditional funcionestrucSessionBeanAdditional=null;
	
	public FuncionEstrucSessionBeanAdditional getFuncionEstrucSessionBeanAdditional() {
		return this.funcionestrucSessionBeanAdditional;
	}
	
	public void setFuncionEstrucSessionBeanAdditional(FuncionEstrucSessionBeanAdditional funcionestrucSessionBeanAdditional) {
		try {
			this.funcionestrucSessionBeanAdditional=funcionestrucSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FuncionEstrucBeanSwingJInternalFrameAdditional funcionestrucBeanSwingJInternalFrameAdditional=null;
	//public class FuncionEstrucBeanSwingJInternalFrame
	
	public FuncionEstrucBeanSwingJInternalFrameAdditional getFuncionEstrucBeanSwingJInternalFrameAdditional() {
		return this.funcionestrucBeanSwingJInternalFrameAdditional;
	}
	
	public void setFuncionEstrucBeanSwingJInternalFrameAdditional(FuncionEstrucBeanSwingJInternalFrameAdditional funcionestrucBeanSwingJInternalFrameAdditional) {
		try {
			this.funcionestrucBeanSwingJInternalFrameAdditional=funcionestrucBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FuncionEstrucLogic funcionestrucLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FuncionEstruc funcionestrucBean;
	public FuncionEstrucConstantesFunciones funcionestrucConstantesFunciones;
	//public FuncionEstrucParameterReturnGeneral funcionestrucReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EstructuraLogic estructuraLogic;
	public FuncionLogic funcionLogic;
	
	//PARAMETROS
	
	
	//public List<FuncionEstruc> funcionestrucs;	
	//public List<FuncionEstruc> funcionestrucsEliminados;
	//public List<FuncionEstruc> funcionestrucsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFuncionEstruc=false;
	public Boolean isVisibilidadCeldaDuplicarFuncionEstruc=true;
	public Boolean isVisibilidadCeldaCopiarFuncionEstruc=true;
	public Boolean isVisibilidadCeldaVerFormFuncionEstruc=true;
	public Boolean isVisibilidadCeldaOrdenFuncionEstruc=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFuncionEstruc=false;
	public Boolean isVisibilidadCeldaModificarFuncionEstruc=false;
	public Boolean isVisibilidadCeldaActualizarFuncionEstruc=false;
	public Boolean isVisibilidadCeldaEliminarFuncionEstruc=false;
	public Boolean isVisibilidadCeldaCancelarFuncionEstruc=false;
	public Boolean isVisibilidadCeldaGuardarFuncionEstruc=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFuncionEstruc=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdFuncion=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoFuncionEstruc() {
		return this.iIdNuevoFuncionEstruc;
	}

	public void setiIdNuevoFuncionEstruc(Long iIdNuevoFuncionEstruc) {
		this.iIdNuevoFuncionEstruc = iIdNuevoFuncionEstruc;
	}
	
	public Long getidFuncionEstrucActual() {
		return this.idFuncionEstrucActual;
	}

	public void setidFuncionEstrucActual(Long idFuncionEstrucActual) {
		this.idFuncionEstrucActual = idFuncionEstrucActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FuncionEstruc getfuncionestruc() {
		return this.funcionestruc;
	}

	public void setfuncionestruc(FuncionEstruc funcionestruc) {
		this.funcionestruc = funcionestruc;
	}
	
	public FuncionEstruc getfuncionestrucAux() {
		return this.funcionestrucAux;
	}

	public void setfuncionestrucAux(FuncionEstruc funcionestrucAux) {
		this.funcionestrucAux = funcionestrucAux;
	}				
	
	public FuncionEstruc getfuncionestrucAnterior() {
		return this.funcionestrucAnterior;
	}

	public void setfuncionestrucAnterior(FuncionEstruc funcionestrucAnterior) {
		this.funcionestrucAnterior = funcionestrucAnterior;
	}	
	
	public FuncionEstruc getfuncionestrucTotales() {
		return this.funcionestrucTotales;
	}

	public void setfuncionestrucTotales(FuncionEstruc funcionestrucTotales) {
		this.funcionestrucTotales = funcionestrucTotales;
	}	
	
	public FuncionEstruc getfuncionestrucBean() {
		return this.funcionestrucBean;
	}

	public void setfuncionestrucBean(FuncionEstruc funcionestrucBean) {
		this.funcionestrucBean = funcionestrucBean;
	}	
	
	public FuncionEstrucParameterReturnGeneral getfuncionestrucReturnGeneral() {
		return this.funcionestrucReturnGeneral;
	}

	public void setfuncionestrucReturnGeneral(FuncionEstrucParameterReturnGeneral funcionestrucReturnGeneral) {
		this.funcionestrucReturnGeneral = funcionestrucReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_funcionFK_IdFuncion=-1L;

	public Long getid_funcionFK_IdFuncion() {
		return this.id_funcionFK_IdFuncion;
	}

	public void setid_funcionFK_IdFuncion(Long id_funcionFK_IdFuncion) {
		this.id_funcionFK_IdFuncion = id_funcionFK_IdFuncion;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FuncionEstrucLogic getFuncionEstrucLogic()	{		
		return funcionestrucLogic;
	}

	public void setFuncionEstrucLogic(FuncionEstrucLogic funcionestrucLogic) {
		this.funcionestrucLogic = funcionestrucLogic;
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
	
	public Boolean getIsEsNuevoFuncionEstruc() {
		return isEsNuevoFuncionEstruc;
	}

	public void setIsEsNuevoFuncionEstruc(Boolean isEsNuevoFuncionEstruc) {
		this.isEsNuevoFuncionEstruc = isEsNuevoFuncionEstruc;
	}

	public Boolean getEsParaAccionDesdeFormularioFuncionEstruc() {
		return esParaAccionDesdeFormularioFuncionEstruc;
	}
	
	public void setEsParaAccionDesdeFormularioFuncionEstruc(Boolean esParaAccionDesdeFormularioFuncionEstruc) {
		this.esParaAccionDesdeFormularioFuncionEstruc = esParaAccionDesdeFormularioFuncionEstruc;
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

			if(this.funcionestrucSessionBean==null) {
				this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
			}

			if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(funcionestrucSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.funcionestrucSessionBean==null) {
				this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
			}

			if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(funcionestrucSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosEstructurasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructurasForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.funcionestrucSessionBean==null) {
				this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
			}

			if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructurasForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(funcionestrucSessionBean.getlidEstructuraActual());
					this.estructurasForeignKey.add(estructuraLogic.getEstructura());
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

	public void cargarCombosFuncionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.funcionsForeignKey=new ArrayList<Funcion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FuncionLogic funcionLogic=new FuncionLogic();

			//funcionLogic.getFuncionDataAccess().setIsForForeingKeyData(true);

			if(this.funcionestrucSessionBean==null) {
				this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
			}

			if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionFuncion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//funcionLogic.getFuncionDataAccess().setIsForForeingKeyData(true);

					funcionLogic.getTodosFuncionsWithConnection(sFinalQuery,new Pagination());

					this.funcionsForeignKey=funcionLogic.getFuncions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFuncion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					funcionLogic.getEntityWithConnection(funcionestrucSessionBean.getlidFuncionActual());
					this.funcionsForeignKey.add(funcionLogic.getFuncion());
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

					if(this.funcionestruc!=null) {
						this.funcionestruc.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
						this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFuncionEstruc.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
						if(this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.getItemCount()>0) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFuncionEstrucGenerico)throws Exception
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
				jComboBoxid_empresaFuncionEstrucGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFuncionEstrucGenerico!=null && jComboBoxid_empresaFuncionEstrucGenerico.getItemCount()>0) {
					jComboBoxid_empresaFuncionEstrucGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.funcionestruc!=null) {
						this.funcionestruc.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
						this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalFuncionEstruc.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
						if(this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.getItemCount()>0) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalFuncionEstrucGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalFuncionEstrucGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalFuncionEstrucGenerico!=null && jComboBoxid_sucursalFuncionEstrucGenerico.getItemCount()>0) {
					jComboBoxid_sucursalFuncionEstrucGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraForeignKey(Long idEstructuraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraTemp!=null) {

					if(this.funcionestruc!=null) {
						this.funcionestruc.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
						this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraFuncionEstruc.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
						if(this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.getItemCount()>0) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc!=null) {
						jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.setSelectedIndex(0);
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

	public String getActualEstructuraForeignKeyDescripcion(Long idEstructuraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraFuncionEstrucGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(estructuraTemp!=null) {
				jComboBoxid_estructuraFuncionEstrucGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraFuncionEstrucGenerico!=null && jComboBoxid_estructuraFuncionEstrucGenerico.getItemCount()>0) {
					jComboBoxid_estructuraFuncionEstrucGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFuncionForeignKey(Long idFuncionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Funcion  funcionTemp=null;

			for(Funcion funcionAux:funcionsForeignKey) {
				if(funcionAux.getId()!=null && funcionAux.getId().equals(idFuncionSeleccionado)) {
					funcionTemp=funcionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(funcionTemp!=null) {

					if(this.funcionestruc!=null) {
						this.funcionestruc.setFuncion(funcionTemp);
					}

					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
						this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.setSelectedItem(funcionTemp);
					}
				} else {
					//jComboBoxid_funcionFuncionEstruc.setSelectedItem(funcionTemp);
					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
						if(this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.getItemCount()>0) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFuncion") || sFormularioTipoBusqueda.equals("Todos")){
					if(funcionTemp!=null && jComboBoxid_funcionFK_IdFuncionFuncionEstruc!=null) {
						jComboBoxid_funcionFK_IdFuncionFuncionEstruc.setSelectedItem(funcionTemp);
					} else {
						if(jComboBoxid_funcionFK_IdFuncionFuncionEstruc!=null) {
							//jComboBoxid_funcionFK_IdFuncionFuncionEstruc.setSelectedItem(funcionTemp);
							if(jComboBoxid_funcionFK_IdFuncionFuncionEstruc.getItemCount()>0) {
								jComboBoxid_funcionFK_IdFuncionFuncionEstruc.setSelectedIndex(0);
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

	public String getActualFuncionForeignKeyDescripcion(Long idFuncionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Funcion  funcionTemp=null;

			for(Funcion funcionAux:funcionsForeignKey) {
				if(funcionAux.getId()!=null && funcionAux.getId().equals(idFuncionSeleccionado)) {
					funcionTemp=funcionAux;
					break;
				}
			}


			sDescripcion=FuncionConstantesFunciones.getFuncionDescripcion(funcionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFuncionForeignKeyGenerico(Long idFuncionSeleccionado,JComboBox jComboBoxid_funcionFuncionEstrucGenerico)throws Exception
	{
		try
		{
			Funcion  funcionTemp=null;

			for(Funcion funcionAux:funcionsForeignKey) {
				if(funcionAux.getId()!=null && funcionAux.getId().equals(idFuncionSeleccionado)) {
					funcionTemp=funcionAux;
					break;
				}
			}

			if(funcionTemp!=null) {
				jComboBoxid_funcionFuncionEstrucGenerico.setSelectedItem(funcionTemp);
			} else {
				if(jComboBoxid_funcionFuncionEstrucGenerico!=null && jComboBoxid_funcionFuncionEstrucGenerico.getItemCount()>0) {
					jComboBoxid_funcionFuncionEstrucGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FuncionEstruc funcionestruc,JComboBox jComboBoxid_empresaFuncionEstrucGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFuncionEstrucGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFuncionEstrucGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				funcionestruc.setid_empresa(empresaAux.getId());
				funcionestruc.setempresa_descripcion(FuncionEstrucConstantesFunciones.getEmpresaDescripcion(empresaAux));
				funcionestruc.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(FuncionEstruc funcionestruc,JComboBox jComboBoxid_sucursalFuncionEstrucGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalFuncionEstrucGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalFuncionEstrucGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				funcionestruc.setid_sucursal(sucursalAux.getId());
				funcionestruc.setsucursal_descripcion(FuncionEstrucConstantesFunciones.getSucursalDescripcion(sucursalAux));
				funcionestruc.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(FuncionEstruc funcionestruc,JComboBox jComboBoxid_estructuraFuncionEstrucGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraFuncionEstrucGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraFuncionEstrucGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				funcionestruc.setid_estructura(estructuraAux.getId());
				funcionestruc.setestructura_descripcion(FuncionEstrucConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				funcionestruc.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFuncionForeignKey(FuncionEstruc funcionestruc,JComboBox jComboBoxid_funcionFuncionEstrucGenerico)throws Exception
	{
		try
		{
			Funcion  funcionAux=new Funcion();

			if(jComboBoxid_funcionFuncionEstrucGenerico==null) {
				funcionAux=(Funcion)this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.getSelectedItem();
			} else {
				funcionAux=(Funcion)jComboBoxid_funcionFuncionEstrucGenerico.getSelectedItem();
			}

			if(funcionAux!=null && funcionAux.getId()!=null) {
				funcionestruc.setid_funcion(funcionAux.getId());
				funcionestruc.setfuncion_descripcion(FuncionEstrucConstantesFunciones.getFuncionDescripcion(funcionAux));
				funcionestruc.setFuncion(funcionAux);			}
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

					if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { 
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { 
					}

					if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { 
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { 
					}

					if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructurasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { 
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { 
					}

					if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.addItem(estructura);
							}
						}

						if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFuncionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFuncion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { 
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.removeAllItems();

							for(Funcion funcion:this.funcionsForeignKey) {
								this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.addItem(funcion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { 
					}

					if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFuncion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_funcionFK_IdFuncionFuncionEstruc.removeAllItems();

							for(Funcion funcion:this.funcionsForeignKey) {
								this.jComboBoxid_funcionFK_IdFuncionFuncionEstruc.addItem(funcion);
							}
						}

						if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFuncionForeignKey(Funcion funcion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.setSelectedItem(funcion);
						}
					} else {
						if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_funcionFK_IdFuncionFuncionEstruc.setSelectedItem(funcion);
						} else {
							this.jComboBoxid_funcionFK_IdFuncionFuncionEstruc.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFuncionEstruc() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FuncionEstrucConstantesFunciones.refrescarForeignKeysDescripcionesFuncionEstruc(this.funcionestrucLogic.getFuncionEstrucs());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FuncionEstrucConstantesFunciones.refrescarForeignKeysDescripcionesFuncionEstruc(this.funcionestrucs);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(Funcion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//funcionestrucLogic.setFuncionEstrucs(this.funcionestrucs);
			funcionestrucLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FuncionEstrucParameterReturnGeneral getFuncionEstrucParameterGeneral() {
		return this.funcionestrucParameterGeneral;
	}
	
	public void setFuncionEstrucParameterGeneral(FuncionEstrucParameterReturnGeneral funcionestrucParameterGeneral) {
		this.funcionestrucParameterGeneral = funcionestrucParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFuncionEstruc() {
		return isPermisoTodoFuncionEstruc;
	}

	public void setIsPermisoTodoFuncionEstruc(Boolean isPermisoTodoFuncionEstruc) {
		this.isPermisoTodoFuncionEstruc = isPermisoTodoFuncionEstruc;
	}

	public Boolean getIsPermisoNuevoFuncionEstruc() {
		return isPermisoNuevoFuncionEstruc;
	}

	public void setIsPermisoNuevoFuncionEstruc(Boolean isPermisoNuevoFuncionEstruc) {
		this.isPermisoNuevoFuncionEstruc = isPermisoNuevoFuncionEstruc;
	}

	public Boolean getIsPermisoActualizarFuncionEstruc() {
		return isPermisoActualizarFuncionEstruc;
	}

	public void setIsPermisoActualizarFuncionEstruc(Boolean isPermisoActualizarFuncionEstruc) {
		this.isPermisoActualizarFuncionEstruc = isPermisoActualizarFuncionEstruc;
	}

	public Boolean getIsPermisoEliminarFuncionEstruc() {
		return isPermisoEliminarFuncionEstruc;
	}

	public void setIsPermisoEliminarFuncionEstruc(Boolean isPermisoEliminarFuncionEstruc) {
		this.isPermisoEliminarFuncionEstruc = isPermisoEliminarFuncionEstruc;
	}

	public Boolean getIsPermisoGuardarCambiosFuncionEstruc() {
		return isPermisoGuardarCambiosFuncionEstruc;
	}

	public void setIsPermisoGuardarCambiosFuncionEstruc(Boolean isPermisoGuardarCambiosFuncionEstruc) {
		this.isPermisoGuardarCambiosFuncionEstruc = isPermisoGuardarCambiosFuncionEstruc;
	}
	
	public Boolean getIsPermisoConsultaFuncionEstruc() {
		return isPermisoConsultaFuncionEstruc;
	}

	public void setIsPermisoConsultaFuncionEstruc(Boolean isPermisoConsultaFuncionEstruc) {
		this.isPermisoConsultaFuncionEstruc = isPermisoConsultaFuncionEstruc;
	}

	public Boolean getIsPermisoBusquedaFuncionEstruc() {
		return isPermisoBusquedaFuncionEstruc;
	}

	public void setIsPermisoBusquedaFuncionEstruc(Boolean isPermisoBusquedaFuncionEstruc) {
		this.isPermisoBusquedaFuncionEstruc = isPermisoBusquedaFuncionEstruc;
	}

	public Boolean getIsPermisoReporteFuncionEstruc() {
		return isPermisoReporteFuncionEstruc;
	}

	public void setIsPermisoReporteFuncionEstruc(Boolean isPermisoReporteFuncionEstruc) {
		this.isPermisoReporteFuncionEstruc = isPermisoReporteFuncionEstruc;
	}
	
	public Boolean getIsPermisoPaginacionMedioFuncionEstruc() {
		return isPermisoPaginacionMedioFuncionEstruc;
	}

	public void setIsPermisoPaginacionMedioFuncionEstruc(Boolean isPermisoPaginacionMedioFuncionEstruc) {
		this.isPermisoPaginacionMedioFuncionEstruc = isPermisoPaginacionMedioFuncionEstruc;
	}
	
	public Boolean getIsPermisoPaginacionTodoFuncionEstruc() {
		return isPermisoPaginacionTodoFuncionEstruc;
	}

	public void setIsPermisoPaginacionTodoFuncionEstruc(Boolean isPermisoPaginacionTodoFuncionEstruc) {
		this.isPermisoPaginacionTodoFuncionEstruc = isPermisoPaginacionTodoFuncionEstruc;
	}
	
	public Boolean getIsPermisoPaginacionAltoFuncionEstruc() {
		return isPermisoPaginacionAltoFuncionEstruc;
	}

	public void setIsPermisoPaginacionAltoFuncionEstruc(Boolean isPermisoPaginacionAltoFuncionEstruc) {
		this.isPermisoPaginacionAltoFuncionEstruc = isPermisoPaginacionAltoFuncionEstruc;
	}
	
	public Boolean getIsPermisoCopiarFuncionEstruc() {
		return isPermisoCopiarFuncionEstruc;
	}

	public void setIsPermisoCopiarFuncionEstruc(Boolean isPermisoCopiarFuncionEstruc) {
		this.isPermisoCopiarFuncionEstruc = isPermisoCopiarFuncionEstruc;
	}
	
	public Boolean getIsPermisoVerFormFuncionEstruc() {
		return isPermisoVerFormFuncionEstruc;
	}

	public void setIsPermisoVerFormFuncionEstruc(Boolean isPermisoVerFormFuncionEstruc) {
		this.isPermisoVerFormFuncionEstruc = isPermisoVerFormFuncionEstruc;
	}
	
	public Boolean getIsPermisoDuplicarFuncionEstruc() {
		return isPermisoDuplicarFuncionEstruc;
	}

	public void setIsPermisoDuplicarFuncionEstruc(Boolean isPermisoDuplicarFuncionEstruc) {
		this.isPermisoDuplicarFuncionEstruc = isPermisoDuplicarFuncionEstruc;
	}
	
	public Boolean getIsPermisoOrdenFuncionEstruc() {
		return isPermisoOrdenFuncionEstruc;
	}

	public void setIsPermisoOrdenFuncionEstruc(Boolean isPermisoOrdenFuncionEstruc) {
		this.isPermisoOrdenFuncionEstruc = isPermisoOrdenFuncionEstruc;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFuncionEstruc() {
		return isVisibilidadCeldaNuevoFuncionEstruc;
	}

	public void setIsVisibilidadCeldaNuevoFuncionEstruc(Boolean isVisibilidadCeldaNuevoFuncionEstruc) {
		this.isVisibilidadCeldaNuevoFuncionEstruc = isVisibilidadCeldaNuevoFuncionEstruc;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFuncionEstruc() {
		return isVisibilidadCeldaDuplicarFuncionEstruc;
	}

	public void setIsVisibilidadCeldaDuplicarFuncionEstruc(Boolean isVisibilidadCeldaDuplicarFuncionEstruc) {
		this.isVisibilidadCeldaDuplicarFuncionEstruc = isVisibilidadCeldaDuplicarFuncionEstruc;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFuncionEstruc() {
		return isVisibilidadCeldaCopiarFuncionEstruc;
	}

	public void setIsVisibilidadCeldaCopiarFuncionEstruc(Boolean isVisibilidadCeldaCopiarFuncionEstruc) {
		this.isVisibilidadCeldaCopiarFuncionEstruc = isVisibilidadCeldaCopiarFuncionEstruc;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFuncionEstruc() {
		return isVisibilidadCeldaVerFormFuncionEstruc;
	}

	public void setIsVisibilidadCeldaVerFormFuncionEstruc(Boolean isVisibilidadCeldaVerFormFuncionEstruc) {
		this.isVisibilidadCeldaVerFormFuncionEstruc = isVisibilidadCeldaVerFormFuncionEstruc;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFuncionEstruc() {
		return isVisibilidadCeldaOrdenFuncionEstruc;
	}

	public void setIsVisibilidadCeldaOrdenFuncionEstruc(Boolean isVisibilidadCeldaOrdenFuncionEstruc) {
		this.isVisibilidadCeldaOrdenFuncionEstruc = isVisibilidadCeldaOrdenFuncionEstruc;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFuncionEstruc() {
		return isVisibilidadCeldaNuevoRelacionesFuncionEstruc;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFuncionEstruc(Boolean isVisibilidadCeldaNuevoRelacionesFuncionEstruc) {
		this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc = isVisibilidadCeldaNuevoRelacionesFuncionEstruc;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFuncionEstruc() {
		return isVisibilidadCeldaModificarFuncionEstruc;
	}

	public void setIsVisibilidadCeldaModificarFuncionEstruc(Boolean isVisibilidadCeldaModificarFuncionEstruc) {
		this.isVisibilidadCeldaModificarFuncionEstruc = isVisibilidadCeldaModificarFuncionEstruc;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFuncionEstruc() {
		return isVisibilidadCeldaActualizarFuncionEstruc;
	}

	public void setIsVisibilidadCeldaActualizarFuncionEstruc(Boolean isVisibilidadCeldaActualizarFuncionEstruc) {
		this.isVisibilidadCeldaActualizarFuncionEstruc = isVisibilidadCeldaActualizarFuncionEstruc;
	}

	public Boolean getIsVisibilidadCeldaEliminarFuncionEstruc() {
		return isVisibilidadCeldaEliminarFuncionEstruc;
	}

	public void setIsVisibilidadCeldaEliminarFuncionEstruc(Boolean isVisibilidadCeldaEliminarFuncionEstruc) {
		this.isVisibilidadCeldaEliminarFuncionEstruc = isVisibilidadCeldaEliminarFuncionEstruc;
	}

	public Boolean getIsVisibilidadCeldaCancelarFuncionEstruc() {
		return isVisibilidadCeldaCancelarFuncionEstruc;
	}

	public void setIsVisibilidadCeldaCancelarFuncionEstruc(Boolean isVisibilidadCeldaCancelarFuncionEstruc) {
		this.isVisibilidadCeldaCancelarFuncionEstruc = isVisibilidadCeldaCancelarFuncionEstruc;
	}

	public Boolean getIsVisibilidadCeldaGuardarFuncionEstruc() {
		return isVisibilidadCeldaGuardarFuncionEstruc;
	}

	public void setIsVisibilidadCeldaGuardarFuncionEstruc(Boolean isVisibilidadCeldaGuardarFuncionEstruc) {
		this.isVisibilidadCeldaGuardarFuncionEstruc = isVisibilidadCeldaGuardarFuncionEstruc;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFuncionEstruc() {
		return isVisibilidadCeldaGuardarCambiosFuncionEstruc;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFuncionEstruc(Boolean isVisibilidadCeldaGuardarCambiosFuncionEstruc) {
		this.isVisibilidadCeldaGuardarCambiosFuncionEstruc = isVisibilidadCeldaGuardarCambiosFuncionEstruc;
	}
		
	public FuncionEstrucSessionBean getfuncionestrucSessionBean() {
		return this.funcionestrucSessionBean;
	}
	
	public void setfuncionestrucSessionBean(FuncionEstrucSessionBean funcionestrucSessionBean) {
		this.funcionestrucSessionBean=funcionestrucSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdFuncion() {
		return this.isVisibilidadFK_IdFuncion;
	}

	public void setisVisibilidadFK_IdFuncion(Boolean isVisibilidadFK_IdFuncion) {
		this.isVisibilidadFK_IdFuncion=isVisibilidadFK_IdFuncion;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(FuncionEstruc funcionestruc)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(funcionestruc,null);
				this.setActualParaGuardarSucursalForeignKey(funcionestruc,null);
				this.setActualParaGuardarEstructuraForeignKey(funcionestruc,null);
				this.setActualParaGuardarFuncionForeignKey(funcionestruc,null);
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
	
	public void bugActualizarReferenciaActual(FuncionEstruc funcionestruc,FuncionEstruc funcionestrucAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFuncionEstruc(funcionestruc);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		funcionestrucAux.setId(funcionestruc.getId());
		funcionestrucAux.setVersionRow(funcionestruc.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFuncionEstruc();
		
			int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = funcionestrucValidator.getInvalidValues(this.funcionestruc);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			funcionestrucLogic.setDatosCliente(datosCliente);
			funcionestrucLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				funcionestrucAux=new  FuncionEstruc();
				
				funcionestrucAux.setIsNew(true);
				funcionestrucAux.setIsChanged(true);
				
				funcionestrucAux.setFuncionEstrucOriginal(this.funcionestruc);
				
				funcionestrucAux.setId(this.funcionestruc.getId());	
				funcionestrucAux.setVersionRow(this.funcionestruc.getVersionRow());	
				funcionestrucAux.setid_empresa(this.funcionestruc.getid_empresa());	
				funcionestrucAux.setid_sucursal(this.funcionestruc.getid_sucursal());	
				funcionestrucAux.setid_estructura(this.funcionestruc.getid_estructura());	
				funcionestrucAux.setid_funcion(this.funcionestruc.getid_funcion());	
				funcionestrucAux.setnombre(this.funcionestruc.getnombre());	
				funcionestrucAux.setdescripcion(this.funcionestruc.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.funcionestrucSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.funcionestrucSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(funcionestrucAux,funcionestrucLogic.getFuncionEstrucs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(funcionestrucAux,funcionestrucs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.funcionestrucSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.funcionestrucSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucLogic.saveFuncionEstrucs();//WithConnection
						//funcionestrucLogic.getSetVersionRowFuncionEstrucs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.funcionestruc,funcionestrucAux);
					
					this.refrescarForeignKeysDescripcionesFuncionEstruc();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.funcionestrucSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								funcionestrucLogic.saveFuncionEstrucRelaciones(funcionestrucAux);//WithConnection
								//funcionestrucLogic.getSetVersionRowFuncionEstrucs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.funcionestruc,funcionestrucAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.funcionestrucSessionBean.getEstaModoGuardarRelaciones() 
									|| this.funcionestrucSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(funcionestrucAux,funcionestrucLogic.getFuncionEstrucs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(funcionestrucAux,funcionestrucs);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.funcionestruc,funcionestrucAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				funcionestrucAux=new  FuncionEstruc();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.funcionestrucSessionBean.getEsGuardarRelacionado() 
					|| (this.funcionestrucSessionBean.getEsGuardarRelacionado() && this.funcionestruc.getId()>=0)) {
						
					funcionestrucAux.setIsNew(false);
				}
				
				funcionestrucAux.setIsDeleted(false);
			
				funcionestrucAux.setId(this.funcionestruc.getId());	
				funcionestrucAux.setVersionRow(this.funcionestruc.getVersionRow());	
				funcionestrucAux.setid_empresa(this.funcionestruc.getid_empresa());	
				funcionestrucAux.setid_sucursal(this.funcionestruc.getid_sucursal());	
				funcionestrucAux.setid_estructura(this.funcionestruc.getid_estructura());	
				funcionestrucAux.setid_funcion(this.funcionestruc.getid_funcion());	
				funcionestrucAux.setnombre(this.funcionestruc.getnombre());	
				funcionestrucAux.setdescripcion(this.funcionestruc.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(funcionestrucAux,funcionestrucLogic.getFuncionEstrucs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(funcionestrucAux,funcionestrucs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.funcionestrucSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.funcionestrucSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucLogic.saveFuncionEstrucs();//WithConnection
						//funcionestrucLogic.getSetVersionRowFuncionEstrucs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.funcionestruc,funcionestrucAux);
					
					this.refrescarForeignKeysDescripcionesFuncionEstruc();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.funcionestrucSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								funcionestrucLogic.saveFuncionEstrucRelaciones(funcionestrucAux);//WithConnection
								//funcionestrucLogic.getSetVersionRowFuncionEstrucs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.funcionestruc,funcionestrucAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.funcionestrucSessionBean.getEstaModoGuardarRelaciones() 
									|| this.funcionestrucSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(funcionestrucAux,funcionestrucLogic.getFuncionEstrucs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(funcionestrucAux,funcionestrucs);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.funcionestruc,funcionestrucAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				funcionestrucAux=new  FuncionEstruc();
				
				funcionestrucAux.setIsNew(false);
				funcionestrucAux.setIsChanged(false);
				
				funcionestrucAux.setIsDeleted(true);
				
				funcionestrucAux.setId(this.funcionestruc.getId());	
				funcionestrucAux.setVersionRow(this.funcionestruc.getVersionRow());	
				funcionestrucAux.setid_empresa(this.funcionestruc.getid_empresa());	
				funcionestrucAux.setid_sucursal(this.funcionestruc.getid_sucursal());	
				funcionestrucAux.setid_estructura(this.funcionestruc.getid_estructura());	
				funcionestrucAux.setid_funcion(this.funcionestruc.getid_funcion());	
				funcionestrucAux.setnombre(this.funcionestruc.getnombre());	
				funcionestrucAux.setdescripcion(this.funcionestruc.getdescripcion());	
				
				if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.funcionestrucAux.getId()>=0) {	
						this.funcionestrucsEliminados.add(funcionestrucAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(funcionestrucAux,funcionestrucLogic.getFuncionEstrucs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(funcionestrucAux,funcionestrucs);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.funcionestrucSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.funcionestrucSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucLogic.saveFuncionEstrucs();//WithConnection
						//funcionestrucLogic.getSetVersionRowFuncionEstrucs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.funcionestrucSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								funcionestrucLogic.saveFuncionEstrucRelaciones(funcionestrucAux);//WithConnection
								//funcionestrucLogic.getSetVersionRowFuncionEstrucs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.funcionestrucSessionBean.getEstaModoGuardarRelaciones() 
								|| this.funcionestrucSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(funcionestrucAux,funcionestrucLogic.getFuncionEstrucs());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(funcionestrucAux,funcionestrucs);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.getFuncionEstrucs().addAll(this.funcionestrucsEliminados);
					
					funcionestrucLogic.saveFuncionEstrucs();//WithConnection
					//funcionestrucLogic.getSetVersionRowFuncionEstrucs();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFuncionEstruc();
				
				this.funcionestrucsEliminados= new ArrayList<FuncionEstruc>();		
			}
			
			if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Funcion Estruc GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Funcion Estruc",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.funcionestruc=funcionestrucAux;
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
      		//this.finishProcessFuncionEstruc();
      	}
		
	}	
	
	public void actualizarRelaciones(FuncionEstruc funcionestrucLocal) throws Exception {
		
		if(this.funcionestrucSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FuncionEstruc funcionestrucLocal) throws Exception {	
		if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				funcionestrucLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				funcionestrucLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				funcionestrucLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FuncionDetalleFormJInternalFrame.class)) {
				FuncionBeanSwingJInternalFrame funcionBeanSwingJInternalFrameLocal=(FuncionBeanSwingJInternalFrame) ((FuncionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				funcionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFuncion(funcionBeanSwingJInternalFrameLocal.getfuncion(),true);
				funcionBeanSwingJInternalFrameLocal.actualizarLista(funcionBeanSwingJInternalFrameLocal.funcion,this.funcionsForeignKey);

				funcionBeanSwingJInternalFrameLocal.actualizarRelaciones(funcionBeanSwingJInternalFrameLocal.funcion);

				funcionestrucLocal.setFuncion(funcionBeanSwingJInternalFrameLocal.funcion);

				this.addItemDefectoCombosForeignKeyFuncion();
				this.cargarCombosFrameFuncionsForeignKey("Formulario");
				this.setActualFuncionForeignKey(funcionBeanSwingJInternalFrameLocal.funcion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFuncionEstrucActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = funcionestrucValidator.getInvalidValues(this.funcionestruc);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FuncionEstruc funcionestruc,List<FuncionEstruc> funcionestrucs) throws Exception {
		try	{		
			FuncionEstrucConstantesFunciones.actualizarLista(funcionestruc,funcionestrucs,this.funcionestrucSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FuncionEstruc funcionestruc,List<FuncionEstruc> funcionestrucs) throws Exception {
		try	{			
			FuncionEstrucConstantesFunciones.actualizarSelectedLista(funcionestruc,funcionestrucs);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FuncionEstruc> funcionestrucsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				funcionestrucsLocal=this.funcionestrucLogic.getFuncionEstrucs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				funcionestrucsLocal=this.funcionestrucs;
			}
			//ARCHITECTURE
		
			for(FuncionEstruc funcionestrucLocal:funcionestrucsLocal) {
				if(this.permiteMantenimiento(funcionestrucLocal) && funcionestrucLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FuncionEstrucConstantesFunciones.getFuncionEstrucLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FuncionEstrucConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncionEstruc.jLabelid_empresaFuncionEstruc,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FuncionEstrucConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncionEstruc.jLabelid_sucursalFuncionEstruc,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FuncionEstrucConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncionEstruc.jLabelid_estructuraFuncionEstruc,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FuncionEstrucConstantesFunciones.IDFUNCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncionEstruc.jLabelid_funcionFuncionEstruc,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FuncionEstrucConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncionEstruc.jLabelnombreFuncionEstruc,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FuncionEstrucConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncionEstruc.jLabeldescripcionFuncionEstruc,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFuncionEstruc.jLabelid_empresaFuncionEstruc,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFuncionEstruc.jLabelid_sucursalFuncionEstruc,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFuncionEstruc.jLabelid_estructuraFuncionEstruc,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFuncionEstruc.jLabelid_funcionFuncionEstruc,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFuncionEstruc.jLabelnombreFuncionEstruc,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFuncionEstruc.jLabeldescripcionFuncionEstruc,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoFuncionEstruc--;	
		
		
		this.funcionestrucAux=new FuncionEstruc();
		
		this.funcionestrucAux.setId(this.iIdNuevoFuncionEstruc);
		this.funcionestrucAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.funcionestrucLogic.getFuncionEstrucs().add(this.funcionestrucAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.funcionestrucs.add(this.funcionestrucAux);
		}
		//ARCHITECTURE
		
		this.funcionestruc=this.funcionestrucAux;
		
		if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFuncionEstruc(this.funcionestruc);
			this.setVariablesObjetoActualToFormularioForeignKeyFuncionEstruc(this.funcionestruc);
		}
				
		//this.setDefaultControlesFuncionEstruc();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFuncionEstruc();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFuncionEstruc();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFuncionEstruc();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFuncionEstruc(this.funcionestrucBean,this.funcionestruc,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FuncionEstrucConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.funcionestrucSessionBean.getConGuardarRelaciones()) {
			classes=FuncionEstrucConstantesFunciones.getClassesRelationshipsOfFuncionEstruc(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.funcionestrucReturnGeneral=funcionestrucLogic.procesarEventosFuncionEstrucsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.funcionestrucLogic.getFuncionEstrucs(),this.funcionestruc,this.funcionestrucParameterGeneral,this.isEsNuevoFuncionEstruc,classes);//this.funcionestrucLogic.getFuncionEstruc()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFuncionEstruc(this.funcionestrucReturnGeneral,this.funcionestrucBean,false);
		
		if(this.funcionestrucReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFuncionEstruc(this.funcionestrucReturnGeneral.getFuncionEstruc());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFuncionEstruc(this.funcionestrucReturnGeneral.getFuncionEstruc());
		}
		
		if(this.funcionestrucReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFuncionEstruc(this.funcionestrucReturnGeneral.getFuncionEstruc(),classes);//this.funcionestrucBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFuncionEstruc();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFuncionEstruc();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.RecargarFormFuncionEstruc(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFuncionEstruc(false);
						
			if(funcionestrucSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFuncionEstruc();
			}
			
			this.actualizarVisualTableDatosFuncionEstruc();
			
			this.jTableDatosFuncionEstruc.setRowSelectionInterval(this.getIndiceNuevoFuncionEstruc(), this.getIndiceNuevoFuncionEstruc());
			
			this.seleccionarFilaTablaFuncionEstrucActual();
						
			this.actualizarEstadoCeldasBotonesFuncionEstruc("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFuncionEstruc(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFuncionEstruc.jTextAreanombreFuncionEstruc.setEnabled(isHabilitar && this.funcionestrucConstantesFunciones.activarnombreFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jTextAreadescripcionFuncionEstruc.setEnabled(isHabilitar && this.funcionestrucConstantesFunciones.activardescripcionFuncionEstruc);	
		//
		this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.setEnabled(isHabilitar && this.funcionestrucConstantesFunciones.activarid_empresaFuncionEstruc);//
		this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.setEnabled(isHabilitar && this.funcionestrucConstantesFunciones.activarid_sucursalFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.setEnabled(isHabilitar && this.funcionestrucConstantesFunciones.activarid_estructuraFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.setEnabled(isHabilitar && this.funcionestrucConstantesFunciones.activarid_funcionFuncionEstruc);
	};
	
	public void setDefaultControlesFuncionEstruc() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFuncionEstruc(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.funcionestrucSessionBean.setConGuardarRelaciones(true);			
			this.funcionestrucSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFuncionEstruc.jTabbedPaneRelacionesFuncionEstruc.setVisible(true);
			
					
		} else {
			//this.funcionestrucSessionBean.setConGuardarRelaciones(false);			
			this.funcionestrucSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFuncionEstruc.jTabbedPaneRelacionesFuncionEstruc.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFuncionEstruc() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FuncionEstruc funcionestrucAux:this.funcionestrucLogic.getFuncionEstrucs()) {
				if(funcionestrucAux.getId().equals(this.iIdNuevoFuncionEstruc)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FuncionEstruc funcionestrucAux:this.funcionestrucs) {
				if(funcionestrucAux.getId().equals(this.iIdNuevoFuncionEstruc)) {
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
	
	public int getIndiceActualFuncionEstruc(FuncionEstruc funcionestruc,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FuncionEstruc funcionestrucAux:this.funcionestrucLogic.getFuncionEstrucs()) {
				if(funcionestrucAux.getId().equals(funcionestruc.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FuncionEstruc funcionestrucAux:this.funcionestrucs) {
				if(funcionestrucAux.getId().equals(funcionestruc.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFuncionEstruc(FuncionEstruc funcionestrucOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FuncionEstruc funcionestrucAux:this.funcionestrucLogic.getFuncionEstrucs()) {
				if(funcionestrucAux.getFuncionEstrucOriginal().getId().equals(funcionestrucOriginal.getId())) {
					existe=true;
					funcionestrucOriginal.setId(funcionestrucAux.getId());
					funcionestrucOriginal.setVersionRow(funcionestrucAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FuncionEstruc funcionestrucAux:this.funcionestrucs) {
				if(funcionestrucAux.getFuncionEstrucOriginal().getId().equals(funcionestrucOriginal.getId())) {
					existe=true;
					funcionestrucOriginal.setId(funcionestrucAux.getId());
					funcionestrucOriginal.setVersionRow(funcionestrucAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFuncionEstruc(Boolean esParaCancelar) throws Exception {
		funcionestrucsAux=new ArrayList<FuncionEstruc>();
		funcionestrucAux=new FuncionEstruc();
		
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FuncionEstruc funcionestrucAux:this.funcionestrucLogic.getFuncionEstrucs()) {
					if(funcionestrucAux.getId()<0) {
						funcionestrucsAux.add(funcionestrucAux);
					}		
				}
				this.iIdNuevoFuncionEstruc=0L;
				this.funcionestrucLogic.getFuncionEstrucs().removeAll(funcionestrucsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FuncionEstruc funcionestrucAux:this.funcionestrucs) {
					if(funcionestrucAux.getId()<0) {
						funcionestrucsAux.add(funcionestrucAux);
					}		
				}
				this.iIdNuevoFuncionEstruc=0L;
				this.funcionestrucs.removeAll(funcionestrucsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFuncionEstruc 
					&& this.funcionestrucLogic.getFuncionEstrucs().size()>0
					) {
					funcionestrucAux=this.funcionestrucLogic.getFuncionEstrucs().get(this.funcionestrucLogic.getFuncionEstrucs().size() - 1);
				
					if(funcionestrucAux.getId()<0) {
						this.funcionestrucLogic.getFuncionEstrucs().remove(funcionestrucAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFuncionEstruc && this.funcionestrucs.size()>0) {
					funcionestrucAux=this.funcionestrucs.get(this.funcionestrucs.size() - 1);
				
					if(funcionestrucAux.getId()<0) {
						this.funcionestrucs.remove(funcionestrucAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFuncionEstruc(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(funcionestruc.getId()<0) {
				this.funcionestrucLogic.getFuncionEstrucs().remove(this.funcionestruc);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(funcionestruc.getId()<0) {
				this.funcionestrucs.remove(this.funcionestruc);
			}
		}			
	}
	
	public void setEstadosInicialesFuncionEstruc(List<FuncionEstruc> funcionestrucsAux) throws Exception {
		FuncionEstrucConstantesFunciones.setEstadosInicialesFuncionEstruc(funcionestrucsAux);
	}
	
	public void setEstadosInicialesFuncionEstruc(FuncionEstruc funcionestrucAux) throws Exception {
		FuncionEstrucConstantesFunciones.setEstadosInicialesFuncionEstruc(funcionestrucAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFuncionEstrucActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFuncionEstruc("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFuncionEstrucActual()) {
				if(!this.isEsNuevoFuncionEstruc) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFuncionEstruc("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFuncionEstruc=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFuncionEstrucActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Funcion Estruc ?", "MANTENIMIENTO DE Funcion Estruc", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFuncionEstruc("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FuncionEstruc funcionestruc) throws Exception {
		FuncionEstrucConstantesFunciones.seleccionarAsignar(this.funcionestruc,funcionestruc);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFuncionEstruc=this.isPermisoActualizarOriginalFuncionEstruc;
			
			
			this.seleccionarAsignar(funcionestruc);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FuncionEstrucConstantesFunciones.quitarEspaciosFuncionEstruc(this.funcionestruc,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFuncionEstruc("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.funcionestrucSessionBean.setsFuncionBusquedaRapida(this.funcionestrucSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFuncionEstruc) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFuncionEstruc(esParaCancelar);				
				this.cancelarNuevoFuncionEstruc(esParaCancelar);								
			}
			
			this.funcionestruc=new FuncionEstruc();
			
			this.inicializarFuncionEstruc();
			
			this.actualizarEstadoCeldasBotonesFuncionEstruc("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFuncionEstruc() throws Exception {
		try {
			FuncionEstrucConstantesFunciones.inicializarFuncionEstruc(this.funcionestruc);
			
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
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.funcionestrucLogic.getFuncionEstrucs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFuncionEstrucs(String sAccionBusqueda,List<FuncionEstruc> funcionestrucsParaReportes) throws Exception {
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
					sPathReporteFinal="FuncionEstruc"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FuncionEstrucMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FuncionEstrucMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FuncionEstruc"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Funcion Estruces");		
		parameters.put("busquedapor", FuncionEstrucConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFuncionEstruc=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FuncionEstrucConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FuncionEstrucConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFuncionEstruc=new JRBeanArrayDataSource(FuncionEstrucJInternalFrame.TraerFuncionEstrucBeans(funcionestrucsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFuncionEstruc);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FuncionEstrucConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FuncionEstrucConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FuncionEstrucBean.TraerFuncionEstrucBeans(funcionestrucsParaReportes).toArray()));
							
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
				this.generarExcelReporteFuncionEstrucs(sAccionBusqueda,sTipoArchivoReporte,funcionestrucsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFuncionEstrucs(sAccionBusqueda,sTipoArchivoReporte,funcionestrucsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFuncionEstrucActionPerformed(null);
					//this.generarExcelReporteFuncionEstrucs(sAccionBusqueda,sTipoArchivoReporte,funcionestrucsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFuncionEstrucs(sAccionBusqueda,sTipoArchivoReporte,funcionestrucsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFuncionEstrucs(sAccionBusqueda,sTipoArchivoReporte,funcionestrucsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFuncionEstrucs(sAccionBusqueda,sTipoArchivoReporte,funcionestrucsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFuncionEstrucs(String sAccionBusqueda,String sTipoArchivoReporte,List<FuncionEstruc> funcionestrucsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcionestruc";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FuncionEstrucs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFuncionEstruc("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FuncionEstruc funcionestruc : funcionestrucsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FuncionEstrucConstantesFunciones.generarExcelReporteDataFuncionEstruc("NORMAL",row,workbook,funcionestruc,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion Estruc",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFuncionEstruc(String sTipo,Row row,Workbook workbook) {
		
		FuncionEstrucConstantesFunciones.generarExcelReporteHeaderFuncionEstruc(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFuncionEstrucs(String sAccionBusqueda,String sTipoArchivoReporte,List<FuncionEstruc> funcionestrucsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcionestruc_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FuncionEstrucs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FuncionEstruc funcionestruc : funcionestrucsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FuncionEstrucConstantesFunciones.getFuncionEstrucDescripcion(funcionestruc));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(funcionestruc.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(funcionestruc.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(funcionestruc.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FuncionEstrucConstantesFunciones.LABEL_IDFUNCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDFUNCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(funcionestruc.getfuncion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FuncionEstrucConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(funcionestruc.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(funcionestruc.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion Estruc",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFuncionEstrucs(String sAccionBusqueda,String sTipoArchivoReporte,List<FuncionEstruc> funcionestrucsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FuncionEstruc> funcionestrucsRespaldo=null;
		
		classes=FuncionEstrucConstantesFunciones.getClassesRelationshipsOfFuncionEstruc(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.funcionestrucLogic.setDatosCliente(this.datosCliente);
		this.funcionestrucLogic.setDatosDeep(this.datosDeep);
		this.funcionestrucLogic.setIsConDeep(true);
		
		funcionestrucsRespaldo=this.funcionestrucLogic.getFuncionEstrucs();
		
		this.funcionestrucLogic.setFuncionEstrucs(funcionestrucsParaReportes);	
		this.funcionestrucLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		funcionestrucsParaReportes=this.funcionestrucLogic.getFuncionEstrucs();
		this.funcionestrucLogic.setFuncionEstrucs(funcionestrucsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcionestruc_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FuncionEstrucs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFuncionEstruc("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FuncionEstruc funcionestruc : funcionestrucsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFuncionEstruc("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FuncionEstrucConstantesFunciones.generarExcelReporteDataFuncionEstruc("NORMAL",row,workbook,funcionestruc,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FuncionEstrucConstantesFunciones.getFuncionEstrucDescripcion(funcionestruc));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion Estruc",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFuncionEstruc.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFuncionEstruc.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFuncionEstruc() throws Exception {		
		this.startProcessFuncionEstruc(true);
	}
	
	public void startProcessFuncionEstruc(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFuncionEstruc ,this.jPanelParametrosReportesFuncionEstruc, this.jScrollPanelDatosFuncionEstruc,this.jPanelPaginacionFuncionEstruc, this.jScrollPanelDatosEdicionFuncionEstruc, this.jPanelAccionesFuncionEstruc,this.jPanelAccionesFormularioFuncionEstruc,this.jmenuBarFuncionEstruc,this.jmenuBarDetalleFuncionEstruc,this.jTtoolBarFuncionEstruc,this.jTtoolBarDetalleFuncionEstruc);		
		
		final JTabbedPane jTabbedPaneBusquedasFuncionEstruc=this.jTabbedPaneBusquedasFuncionEstruc; 
		
		final JPanel jPanelParametrosReportesFuncionEstruc=this.jPanelParametrosReportesFuncionEstruc;
		//final JScrollPane jScrollPanelDatosFuncionEstruc=this.jScrollPanelDatosFuncionEstruc;
		final JTable jTableDatosFuncionEstruc=this.jTableDatosFuncionEstruc;		
		final JPanel jPanelPaginacionFuncionEstruc=this.jPanelPaginacionFuncionEstruc;
		//final JScrollPane jScrollPanelDatosEdicionFuncionEstruc=this.jScrollPanelDatosEdicionFuncionEstruc;
		final JPanel jPanelAccionesFuncionEstruc=this.jPanelAccionesFuncionEstruc;
		
		JPanel jPanelCamposAuxiliarFuncionEstruc=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFuncionEstruc=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			jPanelCamposAuxiliarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jPanelCamposFuncionEstruc;
			jPanelAccionesFormularioAuxiliarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jPanelAccionesFormularioFuncionEstruc;
		}
		
		final JPanel jPanelCamposFuncionEstruc=jPanelCamposAuxiliarFuncionEstruc;
		final JPanel jPanelAccionesFormularioFuncionEstruc=jPanelAccionesFormularioAuxiliarFuncionEstruc;
		
		
		final JMenuBar jmenuBarFuncionEstruc=this.jmenuBarFuncionEstruc;
		final JToolBar jTtoolBarFuncionEstruc=this.jTtoolBarFuncionEstruc;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFuncionEstruc=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFuncionEstruc=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			jmenuBarDetalleAuxiliarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jmenuBarDetalleFuncionEstruc;
			jTtoolBarDetalleAuxiliarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jTtoolBarDetalleFuncionEstruc;
		}
		
		final JMenuBar jmenuBarDetalleFuncionEstruc=jmenuBarDetalleAuxiliarFuncionEstruc;
		final JToolBar jTtoolBarDetalleFuncionEstruc=jTtoolBarDetalleAuxiliarFuncionEstruc;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFuncionEstruc;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFuncionEstruc;
			processRunnable.jTableDatos=jTableDatosFuncionEstruc;
			processRunnable.jPanelCampos=jPanelCamposFuncionEstruc;
			processRunnable.jPanelPaginacion=jPanelPaginacionFuncionEstruc;
			processRunnable.jPanelAcciones=jPanelAccionesFuncionEstruc;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFuncionEstruc;
			
			
			processRunnable.jmenuBar=jmenuBarFuncionEstruc;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFuncionEstruc;
			processRunnable.jTtoolBar=jTtoolBarFuncionEstruc;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFuncionEstruc;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFuncionEstruc ,jPanelParametrosReportesFuncionEstruc,jTableDatosFuncionEstruc, /*jScrollPanelDatosFuncionEstruc,*/jPanelCamposFuncionEstruc,jPanelPaginacionFuncionEstruc, /*jScrollPanelDatosEdicionFuncionEstruc,*/ jPanelAccionesFuncionEstruc,jPanelAccionesFormularioFuncionEstruc,jmenuBarFuncionEstruc,jmenuBarDetalleFuncionEstruc,jTtoolBarFuncionEstruc,jTtoolBarDetalleFuncionEstruc);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFuncionEstruc ,jPanelParametrosReportesFuncionEstruc, jScrollPanelDatosFuncionEstruc,jPanelPaginacionFuncionEstruc, jScrollPanelDatosEdicionFuncionEstruc, jPanelAccionesFuncionEstruc,jPanelAccionesFormularioFuncionEstruc,jmenuBarFuncionEstruc,jmenuBarDetalleFuncionEstruc,jTtoolBarFuncionEstruc,jTtoolBarDetalleFuncionEstruc);
						
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
	
	public void finishProcessFuncionEstruc() {// throws Exception 
		this.finishProcessFuncionEstruc(true);
	}
	
	public void finishProcessFuncionEstruc(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFuncionEstruc ,this.jPanelParametrosReportesFuncionEstruc, this.jScrollPanelDatosFuncionEstruc,this.jPanelPaginacionFuncionEstruc, this.jScrollPanelDatosEdicionFuncionEstruc, this.jPanelAccionesFuncionEstruc,this.jPanelAccionesFormularioFuncionEstruc,this.jmenuBarFuncionEstruc,this.jmenuBarDetalleFuncionEstruc,this.jTtoolBarFuncionEstruc,this.jTtoolBarDetalleFuncionEstruc);		
		
		final JTabbedPane jTabbedPaneBusquedasFuncionEstruc=this.jTabbedPaneBusquedasFuncionEstruc; 
		
		final JPanel jPanelParametrosReportesFuncionEstruc=this.jPanelParametrosReportesFuncionEstruc;
		//final JScrollPane jScrollPanelDatosFuncionEstruc=this.jScrollPanelDatosFuncionEstruc;
		final JTable jTableDatosFuncionEstruc=this.jTableDatosFuncionEstruc;		
		final JPanel jPanelPaginacionFuncionEstruc=this.jPanelPaginacionFuncionEstruc;
		//final JScrollPane jScrollPanelDatosEdicionFuncionEstruc=this.jScrollPanelDatosEdicionFuncionEstruc;
		final JPanel jPanelAccionesFuncionEstruc=this.jPanelAccionesFuncionEstruc;
		
		JPanel jPanelCamposAuxiliarFuncionEstruc=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFuncionEstruc=new JPanel();
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			jPanelCamposAuxiliarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jPanelCamposFuncionEstruc;
			jPanelAccionesFormularioAuxiliarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jPanelAccionesFormularioFuncionEstruc;
		}
		
		final JPanel jPanelCamposFuncionEstruc=jPanelCamposAuxiliarFuncionEstruc;
		final JPanel jPanelAccionesFormularioFuncionEstruc=jPanelAccionesFormularioAuxiliarFuncionEstruc;
		
		
		final JMenuBar jmenuBarFuncionEstruc=this.jmenuBarFuncionEstruc;		
		final JToolBar jTtoolBarFuncionEstruc=this.jTtoolBarFuncionEstruc;
				
		JMenuBar jmenuBarDetalleAuxiliarFuncionEstruc=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFuncionEstruc=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			jmenuBarDetalleAuxiliarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jmenuBarDetalleFuncionEstruc;
			jTtoolBarDetalleAuxiliarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jTtoolBarDetalleFuncionEstruc;		
		}
		
		final JMenuBar jmenuBarDetalleFuncionEstruc=jmenuBarDetalleAuxiliarFuncionEstruc;
		final JToolBar jTtoolBarDetalleFuncionEstruc=jTtoolBarDetalleAuxiliarFuncionEstruc;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFuncionEstruc;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFuncionEstruc;
			processRunnable.jTableDatos=jTableDatosFuncionEstruc;
			processRunnable.jPanelCampos=jPanelCamposFuncionEstruc;
			processRunnable.jPanelPaginacion=jPanelPaginacionFuncionEstruc;
			processRunnable.jPanelAcciones=jPanelAccionesFuncionEstruc;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFuncionEstruc;
			
			
			processRunnable.jmenuBar=jmenuBarFuncionEstruc;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFuncionEstruc;
			processRunnable.jTtoolBar=jTtoolBarFuncionEstruc;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFuncionEstruc;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFuncionEstruc ,jPanelParametrosReportesFuncionEstruc, jTableDatosFuncionEstruc,/*jScrollPanelDatosFuncionEstruc,*/jPanelCamposFuncionEstruc,jPanelPaginacionFuncionEstruc, /*jScrollPanelDatosEdicionFuncionEstruc,*/ jPanelAccionesFuncionEstruc,jPanelAccionesFormularioFuncionEstruc,jmenuBarFuncionEstruc,jmenuBarDetalleFuncionEstruc,jTtoolBarFuncionEstruc,jTtoolBarDetalleFuncionEstruc));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFuncionEstruc(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFuncionEstruc(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFuncionEstruc(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFuncionEstruc(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFuncionEstruc,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFuncionEstruc,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFuncionEstruc(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFuncionEstruc,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFuncionEstruc,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.funcionestrucConstantesFunciones.getsFinalQueryFuncionEstruc();
		String  finalQueryPaginacionTodos=this.funcionestrucConstantesFunciones.getsFinalQueryFuncionEstruc();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FuncionEstrucConstantesFunciones.getArrayColumnasGlobalesNoFuncionEstruc(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FuncionEstrucConstantesFunciones.getArrayColumnasGlobalesFuncionEstruc(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FuncionEstrucConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.funcionestrucsEliminados= new ArrayList<FuncionEstruc>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFuncionEstruc();
		
				///*FuncionEstrucSessionBean*/this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
			
			if(this.funcionestrucSessionBean==null) {
				this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
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
					this.iNumeroPaginacion=FuncionEstrucConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FuncionEstrucConstantesFunciones.getClassesForeignKeysOfFuncionEstruc(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/funcionestruc."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			funcionestrucsAux= new ArrayList<FuncionEstruc>();
			
				
			funcionestrucLogic.setDatosCliente(this.datosCliente);
			funcionestrucLogic.setDatosDeep(this.datosDeep);
			funcionestrucLogic.setIsConDeep(true);
			
			
			funcionestrucLogic.getFuncionEstrucDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					funcionestrucLogic.getTodosFuncionEstrucs(finalQueryGlobal,pagination);
					
					//funcionestrucLogic.getTodosFuncionEstrucsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(funcionestrucLogic.getFuncionEstrucs()==null|| funcionestrucLogic.getFuncionEstrucs().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							funcionestrucsAux= new ArrayList<FuncionEstruc>();
							funcionestrucsAux.addAll(funcionestrucLogic.getFuncionEstrucs());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionestrucsAux= new ArrayList<FuncionEstruc>();
							funcionestrucsAux.addAll(funcionestrucs);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							funcionestrucLogic.getTodosFuncionEstrucs(finalQueryGlobal+"",this.pagination);												
							
							//funcionestrucLogic.getTodosFuncionEstrucsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFuncionEstrucs("Todos",funcionestrucLogic.getFuncionEstrucs() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							funcionestrucLogic.setFuncionEstrucs(new ArrayList<FuncionEstruc>());					
							funcionestrucLogic.getFuncionEstrucs().addAll(funcionestrucsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionestrucs=new ArrayList<FuncionEstruc>();
							funcionestrucs.addAll(funcionestrucsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFuncionEstruc=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFuncionEstruc=this.idActual;
				
				} else if(this.idFuncionEstrucActual!=null && this.idFuncionEstrucActual!=0L) {
					idFuncionEstruc=idFuncionEstrucActual;
				}
				
					
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndicePorId(idFuncionEstruc);
				
				this.funcionestrucs=new ArrayList<FuncionEstruc>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					funcionestrucLogic.getEntity(idFuncionEstruc);
					
					//funcionestrucLogic.getEntityWithConnection(idFuncionEstruc);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					funcionestrucLogic.setFuncionEstrucs(new ArrayList<FuncionEstruc>());
					funcionestrucLogic.getFuncionEstrucs().add(funcionestrucLogic.getFuncionEstruc());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.funcionestrucs=new ArrayList<FuncionEstruc>();
					this.funcionestrucs.add(funcionestruc);
				}
				
				if(funcionestrucLogic.getFuncionEstruc()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					funcionestrucLogic.getFuncionEstrucsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=funcionestrucLogic.getFuncionEstrucs()==null||funcionestrucLogic.getFuncionEstrucs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=funcionestrucs==null|| funcionestrucs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucsAux=new ArrayList<FuncionEstruc>();
						funcionestrucsAux.addAll(funcionestrucLogic.getFuncionEstrucs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionestrucsAux=new ArrayList<FuncionEstruc>();
							funcionestrucsAux.addAll(funcionestrucs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							funcionestrucLogic.getFuncionEstrucsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFuncionEstrucs("FK_IdEmpresa",funcionestrucLogic.getFuncionEstrucs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFuncionEstrucs("FK_IdEmpresa",funcionestrucs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucLogic.setFuncionEstrucs(new ArrayList<FuncionEstruc>());
						funcionestrucLogic.getFuncionEstrucs().addAll(funcionestrucsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionestrucs=new ArrayList<FuncionEstruc>();
							funcionestrucs.addAll(funcionestrucsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					funcionestrucLogic.getFuncionEstrucsFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=funcionestrucLogic.getFuncionEstrucs()==null||funcionestrucLogic.getFuncionEstrucs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=funcionestrucs==null|| funcionestrucs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucsAux=new ArrayList<FuncionEstruc>();
						funcionestrucsAux.addAll(funcionestrucLogic.getFuncionEstrucs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionestrucsAux=new ArrayList<FuncionEstruc>();
							funcionestrucsAux.addAll(funcionestrucs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							funcionestrucLogic.getFuncionEstrucsFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFuncionEstrucs("FK_IdEstructura",funcionestrucLogic.getFuncionEstrucs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFuncionEstrucs("FK_IdEstructura",funcionestrucs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucLogic.setFuncionEstrucs(new ArrayList<FuncionEstruc>());
						funcionestrucLogic.getFuncionEstrucs().addAll(funcionestrucsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionestrucs=new ArrayList<FuncionEstruc>();
							funcionestrucs.addAll(funcionestrucsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFuncion")) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdFuncion(id_funcionFK_IdFuncion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					funcionestrucLogic.getFuncionEstrucsFK_IdFuncion(finalQueryGlobal,pagination,id_funcionFK_IdFuncion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdFuncion(id_funcionFK_IdFuncion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdFuncion(id_funcionFK_IdFuncion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=funcionestrucLogic.getFuncionEstrucs()==null||funcionestrucLogic.getFuncionEstrucs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=funcionestrucs==null|| funcionestrucs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucsAux=new ArrayList<FuncionEstruc>();
						funcionestrucsAux.addAll(funcionestrucLogic.getFuncionEstrucs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionestrucsAux=new ArrayList<FuncionEstruc>();
							funcionestrucsAux.addAll(funcionestrucs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							funcionestrucLogic.getFuncionEstrucsFK_IdFuncion(finalQueryGlobal,pagination,id_funcionFK_IdFuncion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdFuncion(id_funcionFK_IdFuncion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdFuncion(id_funcionFK_IdFuncion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFuncionEstrucs("FK_IdFuncion",funcionestrucLogic.getFuncionEstrucs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFuncionEstrucs("FK_IdFuncion",funcionestrucs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucLogic.setFuncionEstrucs(new ArrayList<FuncionEstruc>());
						funcionestrucLogic.getFuncionEstrucs().addAll(funcionestrucsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionestrucs=new ArrayList<FuncionEstruc>();
							funcionestrucs.addAll(funcionestrucsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					funcionestrucLogic.getFuncionEstrucsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=funcionestrucLogic.getFuncionEstrucs()==null||funcionestrucLogic.getFuncionEstrucs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=funcionestrucs==null|| funcionestrucs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucsAux=new ArrayList<FuncionEstruc>();
						funcionestrucsAux.addAll(funcionestrucLogic.getFuncionEstrucs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionestrucsAux=new ArrayList<FuncionEstruc>();
							funcionestrucsAux.addAll(funcionestrucs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							funcionestrucLogic.getFuncionEstrucsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FuncionEstrucConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFuncionEstrucs("FK_IdSucursal",funcionestrucLogic.getFuncionEstrucs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFuncionEstrucs("FK_IdSucursal",funcionestrucs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucLogic.setFuncionEstrucs(new ArrayList<FuncionEstruc>());
						funcionestrucLogic.getFuncionEstrucs().addAll(funcionestrucsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionestrucs=new ArrayList<FuncionEstruc>();
							funcionestrucs.addAll(funcionestrucsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFuncionEstruc();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFuncionEstruc();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=funcionestrucLogic.getFuncionEstrucs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=funcionestrucs.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=funcionestrucLogic.getFuncionEstrucs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=funcionestrucs.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FuncionEstruc funcionestruc) {
		Boolean permite=true;
		
		if(this.funcionestruc.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FuncionEstrucConstantesFunciones.getOrderByListaFuncionEstruc();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FuncionEstrucConstantesFunciones.getOrderByListaFuncionEstruc();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FuncionEstruc funcionestruc:funcionestrucLogic.getFuncionEstrucs()) {
				if(funcionestruc.getsType().equals(Constantes2.S_TOTALES)) {
					funcionestrucTotales=funcionestruc;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FuncionEstruc funcionestruc:this.funcionestrucs) {
				if(funcionestruc.getsType().equals(Constantes2.S_TOTALES)) {
					funcionestrucTotales=funcionestruc;
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
			this.funcionestrucAux=new FuncionEstruc();
			this.funcionestrucAux.setsType(Constantes2.S_TOTALES);
			this.funcionestrucAux.setIsNew(false);
			this.funcionestrucAux.setIsChanged(false);
			this.funcionestrucAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FuncionEstrucConstantesFunciones.TotalizarValoresFilaFuncionEstruc(this.funcionestrucLogic.getFuncionEstrucs(),this.funcionestrucAux);
				
				this.funcionestrucLogic.getFuncionEstrucs().add(this.funcionestrucAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FuncionEstrucConstantesFunciones.TotalizarValoresFilaFuncionEstruc(this.funcionestrucs,this.funcionestrucAux);
				
				this.funcionestrucs.add(this.funcionestrucAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		funcionestrucTotales=new FuncionEstruc();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.funcionestrucLogic.getFuncionEstrucs().remove(funcionestrucTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.funcionestrucs.remove(funcionestrucTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		funcionestrucTotales=new FuncionEstruc();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FuncionEstruc funcionestruc:funcionestrucLogic.getFuncionEstrucs()) {
				if(funcionestruc.getsType().equals(Constantes2.S_TOTALES)) {
					funcionestrucTotales=funcionestruc;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FuncionEstrucConstantesFunciones.TotalizarValoresFilaFuncionEstruc(this.funcionestrucLogic.getFuncionEstrucs(),funcionestrucTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FuncionEstruc funcionestruc:this.funcionestrucs) {
				if(funcionestruc.getsType().equals(Constantes2.S_TOTALES)) {
					funcionestrucTotales=funcionestruc;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FuncionEstrucConstantesFunciones.TotalizarValoresFilaFuncionEstruc(this.funcionestrucs,funcionestrucTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFuncionEstrucsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFuncionEstrucsFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFuncionEstrucsFK_IdFuncion()throws Exception {
		try {
			sAccionBusqueda="FK_IdFuncion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFuncionEstrucsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFuncionEstrucsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					funcionestrucLogic.getFuncionEstrucsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFuncionEstrucsFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					funcionestrucLogic.getFuncionEstrucsFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFuncionEstrucsFK_IdFuncion(String sFinalQuery,Long id_funcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					funcionestrucLogic.getFuncionEstrucsFK_IdFuncion(sFinalQuery,this.pagination,id_funcion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFuncionEstrucsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					funcionestrucLogic.getFuncionEstrucsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosFuncionEstruc() {
		this.isPermisoTodoFuncionEstruc=false;
		this.isPermisoNuevoFuncionEstruc=false;
		this.isPermisoActualizarFuncionEstruc=false;
		this.isPermisoActualizarOriginalFuncionEstruc=false;
		this.isPermisoEliminarFuncionEstruc=false;
		this.isPermisoGuardarCambiosFuncionEstruc=false;
		this.isPermisoConsultaFuncionEstruc=false;
		this.isPermisoBusquedaFuncionEstruc=false;
		this.isPermisoReporteFuncionEstruc=false;		
		this.isPermisoOrdenFuncionEstruc=false;		
		this.isPermisoPaginacionMedioFuncionEstruc=false;		
		this.isPermisoPaginacionAltoFuncionEstruc=false;
		this.isPermisoPaginacionTodoFuncionEstruc=false;
		this.isPermisoCopiarFuncionEstruc=false;		
		this.isPermisoVerFormFuncionEstruc=false;		
		this.isPermisoDuplicarFuncionEstruc=false;		
		this.isPermisoOrdenFuncionEstruc=false;		
	}
	
	public void setPermisosUsuarioFuncionEstruc(Boolean isPermiso) {
		this.isPermisoTodoFuncionEstruc=isPermiso;
		this.isPermisoNuevoFuncionEstruc=isPermiso;
		this.isPermisoActualizarFuncionEstruc=isPermiso;
		this.isPermisoActualizarOriginalFuncionEstruc=isPermiso;
		this.isPermisoEliminarFuncionEstruc=isPermiso;
		this.isPermisoGuardarCambiosFuncionEstruc=isPermiso;
		this.isPermisoConsultaFuncionEstruc=isPermiso;
		this.isPermisoBusquedaFuncionEstruc=isPermiso;
		this.isPermisoReporteFuncionEstruc=isPermiso;
		this.isPermisoOrdenFuncionEstruc=isPermiso;		
		this.isPermisoPaginacionMedioFuncionEstruc=isPermiso;		
		this.isPermisoPaginacionAltoFuncionEstruc=isPermiso;		
		this.isPermisoPaginacionTodoFuncionEstruc=isPermiso;		
		this.isPermisoCopiarFuncionEstruc=isPermiso;		
		this.isPermisoVerFormFuncionEstruc=isPermiso;		
		this.isPermisoDuplicarFuncionEstruc=isPermiso;
		this.isPermisoOrdenFuncionEstruc=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFuncionEstruc(Boolean isPermiso) {
		//this.isPermisoTodoFuncionEstruc=isPermiso;
		this.isPermisoNuevoFuncionEstruc=isPermiso;
		this.isPermisoActualizarFuncionEstruc=isPermiso;
		this.isPermisoActualizarOriginalFuncionEstruc=isPermiso;
		this.isPermisoEliminarFuncionEstruc=isPermiso;
		this.isPermisoGuardarCambiosFuncionEstruc=isPermiso;
		//this.isPermisoConsultaFuncionEstruc=isPermiso;
		//this.isPermisoBusquedaFuncionEstruc=isPermiso;
		//this.isPermisoReporteFuncionEstruc=isPermiso;
		//this.isPermisoOrdenFuncionEstruc=isPermiso;		
		//this.isPermisoPaginacionMedioFuncionEstruc=isPermiso;		
		//this.isPermisoPaginacionAltoFuncionEstruc=isPermiso;		
		//this.isPermisoPaginacionTodoFuncionEstruc=isPermiso;		
		//this.isPermisoCopiarFuncionEstruc=isPermiso;		
		//this.isPermisoDuplicarFuncionEstruc=isPermiso;
		//this.isPermisoOrdenFuncionEstruc=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFuncionEstrucClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FuncionEstrucJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebFuncionEstruc(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFuncionEstrucClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFuncionEstrucClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFuncionEstrucClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFuncionEstrucClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFuncionEstruc() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FuncionEstrucJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FuncionEstrucConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFuncionEstruc=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFuncionEstruc=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFuncionEstruc=this.isPermisoActualizarFuncionEstruc;
			this.isPermisoEliminarFuncionEstruc=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFuncionEstruc=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFuncionEstruc=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFuncionEstruc=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFuncionEstruc=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFuncionEstruc=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFuncionEstruc=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFuncionEstruc=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFuncionEstruc=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFuncionEstruc=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFuncionEstruc=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFuncionEstruc=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFuncionEstruc=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFuncionEstruc=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFuncionEstruc.setToolTipText(this.jTableDatosFuncionEstruc.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFuncionEstruc(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFuncionEstruc(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FuncionEstrucJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FuncionEstrucJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFuncionEstruc() throws Exception {
		Reporte reporte=null;
		
		
		
		
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
	public void inicializarCombosForeignKeyFuncionEstrucListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.funcionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFuncionEstrucListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FuncionEstrucJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFuncionEstrucListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFuncionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructuraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFuncionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.funcionsForeignKey==null||this.funcionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FuncionConstantesFunciones.getArrayColumnasGlobalesFuncion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FuncionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FuncionConstantesFunciones.SFINALQUERY;

				this.cargarCombosFuncionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFuncionEstrucListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FuncionEstrucParameterReturnGeneral funcionestrucReturnGeneral=new FuncionEstrucParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.funcionestrucConstantesFunciones.cargarid_empresaFuncionEstruc)
					 || (this.esRecargarFks && this.funcionestrucConstantesFunciones.cargarid_empresaFuncionEstruc)) {

					if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+funcionestrucSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.funcionestrucConstantesFunciones.cargarid_sucursalFuncionEstruc)
					 || (this.esRecargarFks && this.funcionestrucConstantesFunciones.cargarid_sucursalFuncionEstruc)) {

					if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+funcionestrucSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.funcionestrucConstantesFunciones.cargarid_estructuraFuncionEstruc)
					 || (this.esRecargarFks && this.funcionestrucConstantesFunciones.cargarid_estructuraFuncionEstruc)) {

					if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+funcionestrucSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalFuncion="";

				if(((this.funcionsForeignKey==null||this.funcionsForeignKey.size()<=0) && this.funcionestrucConstantesFunciones.cargarid_funcionFuncionEstruc)
					 || (this.esRecargarFks && this.funcionestrucConstantesFunciones.cargarid_funcionFuncionEstruc)) {

					if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionFuncion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FuncionConstantesFunciones.getArrayColumnasGlobalesFuncion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFuncion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FuncionConstantesFunciones.TABLENAME);

						finalQueryGlobalFuncion=Funciones.GetFinalQueryAppend(finalQueryGlobalFuncion, "");
						finalQueryGlobalFuncion+=FuncionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFuncionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFuncion=" WHERE " + ConstantesSql.ID + "="+funcionestrucSessionBean.getlidFuncionActual();
					}
				} else {
					finalQueryGlobalFuncion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				funcionestrucReturnGeneral=funcionestrucLogic.cargarCombosLoteForeignKeyFuncionEstruc(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEstructura,finalQueryGlobalFuncion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=funcionestrucReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=funcionestrucReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=funcionestrucReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalFuncion.equals("NONE")) {
				this.funcionsForeignKey=funcionestrucReturnGeneral.getfuncionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFuncionEstruc()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyFuncion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.funcionestrucSessionBean==null) {
				this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
			}

			if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				Estructura estructura=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructura,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructura.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructurasForeignKey,estructura,true)) {

					this.estructurasForeignKey.add(0,estructura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFuncion()throws Exception {
		try {

			if(!this.funcionestrucSessionBean.getisBusquedaDesdeForeignKeySesionFuncion()) {
				Funcion funcion=new Funcion();
				FuncionConstantesFunciones.setFuncionDescripcion(funcion,Constantes.SMENSAJE_ESCOJA_OPCION);
				funcion.setId(null);

				if(!FuncionConstantesFunciones.ExisteEnLista(this.funcionsForeignKey,funcion,true)) {

					this.funcionsForeignKey.add(0,funcion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFuncionEstruc()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFuncionEstruc(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFuncionEstruc()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFuncionEstruc();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFuncionEstruc(FuncionEstruc funcionestruc)throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(funcionestruc.getid_estructura(),false,"Formulario");
			this.setActualFuncionForeignKey(funcionestruc.getid_funcion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFuncionEstruc(FuncionEstruc funcionestruc,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFuncionEstruc()throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(this.funcionestrucConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualFuncionForeignKey(this.funcionestrucConstantesFunciones.getid_funcion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFuncionEstruc()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFuncionEstruc()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFuncionEstruc()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFuncionEstruc()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFuncionEstruc()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameFuncionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFuncionEstruc(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFuncionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFuncionEstruc()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc!=null && this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.getItemCount()>0) {
				this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc!=null && this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.getItemCount()>0) {
				this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc!=null && this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.getItemCount()>0) {
				this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc!=null && this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.getItemCount()>0) {
				this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public FuncionEstrucBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FuncionEstrucBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FuncionEstrucBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.funcionestrucSessionBean=new FuncionEstrucSessionBean(); 
		this.funcionestrucConstantesFunciones=new FuncionEstrucConstantesFunciones(); 
		this.funcionestrucBean=new FuncionEstruc();//(this.funcionestrucConstantesFunciones); 		
		this.funcionestrucReturnGeneral=new FuncionEstrucParameterReturnGeneral(); 
		
		this.funcionestrucSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.funcionestrucSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FuncionEstrucBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FuncionEstrucBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FuncionEstrucBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFuncionEstruc(true);
			
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
			
			this.funcionestrucConstantesFunciones=new FuncionEstrucConstantesFunciones(); 
			this.funcionestrucBean=new FuncionEstruc();//this.funcionestrucConstantesFunciones); 			
			this.funcionestrucReturnGeneral=new FuncionEstrucParameterReturnGeneral(); 
		
			FuncionEstrucBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Funcion Estruc Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.funcionestruc=new FuncionEstruc();
			this.funcionestrucs = new ArrayList<FuncionEstruc>();
			this.funcionestrucsAux = new ArrayList<FuncionEstruc>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic=new FuncionEstrucLogic();
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}
			
			//this.funcionestrucSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.funcionestrucSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFuncionEstruc);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFuncionEstruc!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFuncionEstruc);	
					}
					
					if(this.jInternalFrameImportacionFuncionEstruc!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFuncionEstruc);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFuncionEstruc!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFuncionEstruc);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFuncionEstruc);
				this.jInternalFrameDetalleFormFuncionEstruc.setVisible(false);
				this.jInternalFrameDetalleFormFuncionEstruc.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFuncionEstruc!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFuncionEstruc);
					this.jInternalFrameReporteDinamicoFuncionEstruc.setVisible(false);
					this.jInternalFrameReporteDinamicoFuncionEstruc.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFuncionEstruc!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFuncionEstruc);
					this.jInternalFrameImportacionFuncionEstruc.setVisible(false);
					this.jInternalFrameImportacionFuncionEstruc.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFuncionEstruc!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFuncionEstruc);
					this.jInternalFrameOrderByFuncionEstruc.setVisible(false);
					this.jInternalFrameOrderByFuncionEstruc.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFuncionEstrucActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FuncionEstrucConstantesFunciones.INUMEROPAGINACION;
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
			
			this.funcionestrucReturnGeneral=new FuncionEstrucParameterReturnGeneral();
			
			this.funcionestrucParameterGeneral=new FuncionEstrucParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.funcionestrucLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FuncionEstrucJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FuncionEstrucConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.funcionestrucSessionBean.getEsGuardarRelacionado(),this.funcionestrucSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FuncionEstrucConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.funcionestrucSessionBean.getEsGuardarRelacionado(),this.funcionestrucSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFuncionEstruc=false;
			this.isVisibilidadCeldaDuplicarFuncionEstruc=true;
			this.isVisibilidadCeldaCopiarFuncionEstruc=true;
			this.isVisibilidadCeldaVerFormFuncionEstruc=true;
			this.isVisibilidadCeldaOrdenFuncionEstruc=true;
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=false;
			this.isVisibilidadCeldaModificarFuncionEstruc=false;
			this.isVisibilidadCeldaActualizarFuncionEstruc=false;
			this.isVisibilidadCeldaEliminarFuncionEstruc=false;
			this.isVisibilidadCeldaCancelarFuncionEstruc=false;
			this.isVisibilidadCeldaGuardarFuncionEstruc=false;
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdFuncion=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFuncionEstruc("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFuncionEstruc();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFuncionEstruc(false);
			
			this.setPermisosUsuarioFuncionEstruc();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.funcionestrucSessionBean.getEsGuardarRelacionado() 
				|| (this.funcionestrucSessionBean.getEsGuardarRelacionado() && this.funcionestrucSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFuncionEstrucClasesRelacionadas();
			}
			
			if(this.funcionestrucSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFuncionEstrucClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFuncionEstruc();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFuncionEstruc();
			}
			
			if(!this.isPermisoBusquedaFuncionEstruc) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFuncionEstruc.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFuncionEstruc,this.isPermisoPaginacionMedioFuncionEstruc,this.isPermisoPaginacionTodoFuncionEstruc);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FuncionEstrucConstantesFunciones.getTiposSeleccionarFuncionEstruc());
				
				this.tiposColumnasSelect=FuncionEstrucConstantesFunciones.getTiposSeleccionarFuncionEstruc(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFuncionEstruc();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioFuncionEstruc(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioFuncionEstruc(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFuncionEstruc() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.funcionLogic=new FuncionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				funcionestrucImplementable= (FuncionEstrucImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FuncionEstrucConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				funcionestrucImplementableHome= (FuncionEstrucImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FuncionEstrucConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.funcionestrucs= new ArrayList<FuncionEstruc>();
			this.funcionestrucsEliminados= new ArrayList<FuncionEstruc>();
						
			this.isEsNuevoFuncionEstruc=false;
			this.esParaAccionDesdeFormularioFuncionEstruc=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.funcionsForeignKey=new ArrayList<Funcion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFuncionEstruc(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFuncionEstruc();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FuncionEstrucBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FuncionEstrucConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFuncionEstruc("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFuncionEstruc(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFuncionEstruc();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFuncionEstruc();
			}
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFuncionEstruc.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFuncionEstruc.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFuncionEstruc.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFuncionEstruc(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FuncionEstruc: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFuncionEstruc() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFuncionEstruc")) {
				iIndex=this.jInternalFrameDetalleFormFuncionEstruc.jTabbedPaneRelacionesFuncionEstruc.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFuncionEstruc.jTabbedPaneRelacionesFuncionEstruc.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFuncionEstruc();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyFuncionEstruc(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFuncionEstruc(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFuncionEstruc(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFuncionEstrucListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFuncionEstruc();
		
		this.cargarCombosFrameForeignKeyFuncionEstruc();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFuncionEstruc();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFuncionEstruc();
		}
	}
	
	

	public void cargarCombosForeignKeyEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructura(this.estructurasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFuncion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFuncionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFuncion();
				this.cargarCombosFrameFuncionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFuncion(this.funcionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFuncionEstrucActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.funcionestrucSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
			
			if(jTableDatosFuncionEstruc.getRowCount()>=1) {
				jTableDatosFuncionEstruc.removeRowSelectionInterval(0, jTableDatosFuncionEstruc.getRowCount()-1);						
			}
			
			this.isEsNuevoFuncionEstruc=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFuncionEstruc(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFuncionEstruc(true);			
			//this.funcionestruc=new FuncionEstruc();
			//this.funcionestruc.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFuncionEstruc(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFuncionEstruc() ;
			
			if(FuncionEstrucJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFuncionEstruc(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.funcionestruc);	
			this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);				
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
			if(this.funcionestrucSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FuncionEstruc: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFuncionEstrucActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFuncionEstruc.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFuncionEstruc.getSelectedRows().length;			
			}
			
			funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFuncionEstruc--;			
				//FuncionEstruc funcionestrucAux= new FuncionEstruc();			
				//funcionestrucAux.setId(this.iIdNuevoFuncionEstruc);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FuncionEstruc funcionestrucOrigen=new FuncionEstruc();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FuncionEstruc funcionestrucOrigen : funcionestrucsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							funcionestrucOrigen =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionestrucOrigen =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFuncionEstruc();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.funcionestruc.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFuncionEstruc(funcionestrucOrigen,this.funcionestruc,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.funcionestrucLogic.getFuncionEstrucs().add(this.funcionestrucAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.funcionestrucs.add(this.funcionestrucAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFuncionEstruc(false);
				
				this.jTableDatosFuncionEstruc.setRowSelectionInterval(this.getIndiceNuevoFuncionEstruc(), this.getIndiceNuevoFuncionEstruc());
				
				int iLastRow =  this.jTableDatosFuncionEstruc.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFuncionEstruc.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFuncionEstruc.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFuncionEstruc(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();									
		
			FuncionEstruc funcionestrucOrigen=new FuncionEstruc();
			FuncionEstruc funcionestrucDestino=new FuncionEstruc();
				
			funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFuncionEstruc.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || funcionestrucsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFuncionEstruc.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucOrigen =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						funcionestrucOrigen =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionestrucDestino =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						funcionestrucDestino =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				funcionestrucOrigen =funcionestrucsSeleccionados.get(0);
				funcionestrucDestino =funcionestrucsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFuncionEstruc(funcionestrucOrigen,funcionestrucDestino,true,false);
				
				funcionestrucDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(funcionestrucDestino,funcionestrucLogic.getFuncionEstrucs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(funcionestrucDestino,funcionestrucs);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFuncionEstruc(false);
				
				//this.jTableDatosFuncionEstruc.setRowSelectionInterval(this.getIndiceNuevoFuncionEstruc(), this.getIndiceNuevoFuncionEstruc());
				
				int iLastRow =  this.jTableDatosFuncionEstruc.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFuncionEstruc.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFuncionEstruc.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFuncionEstruc(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFuncionEstruc.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFuncionEstruc.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFuncionEstruc.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFuncionEstruc.setVisible(!isVisible);
			this.jPanelPaginacionFuncionEstruc.setVisible(!isVisible);
			this.jPanelAccionesFuncionEstruc.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFuncionEstruc();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFuncionEstruc();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFuncionEstruc();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFuncionEstruc();
			
			this.abrirFrameOrderByFuncionEstruc();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFuncionEstruc();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFuncionEstruc(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFuncionEstruc);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFuncionEstruc.isMaximum()) {
					this.jInternalFrameDetalleFormFuncionEstruc.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFuncionEstruc.setSize(this.jInternalFrameDetalleFormFuncionEstruc.iWidthFormulario,this.jInternalFrameDetalleFormFuncionEstruc.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFuncionEstruc.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFuncionEstruc.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFuncionEstruc.isMaximum()) {
						this.jInternalFrameDetalleFormFuncionEstruc.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFuncionEstruc.jContentPaneDetalleFuncionEstruc.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFuncionEstruc.jTabbedPaneRelacionesFuncionEstruc.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFuncionEstruc.jContentPaneDetalleFuncionEstruc.getWidth(),FuncionEstrucConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFuncionEstruc.jTabbedPaneRelacionesFuncionEstruc.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFuncionEstruc.jContentPaneDetalleFuncionEstruc.getWidth(),FuncionEstrucConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFuncionEstruc.jTabbedPaneRelacionesFuncionEstruc.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFuncionEstruc.jContentPaneDetalleFuncionEstruc.getWidth(),FuncionEstrucConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFuncionEstruc.setVisible(true);
	        this.jInternalFrameDetalleFormFuncionEstruc.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFuncionEstruc() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFuncionEstruc==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFuncionEstruc=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFuncionEstruc,false,this);
				} else {
					this.jInternalFrameOrderByFuncionEstruc=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFuncionEstruc,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFuncionEstruc);
				this.jInternalFrameOrderByFuncionEstruc.setVisible(false);
				this.jInternalFrameOrderByFuncionEstruc.setSelected(false);
				
				this.jInternalFrameOrderByFuncionEstruc.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFuncionEstruc"));
				
				this.inicializarActualizarBindingTablaOrderByFuncionEstruc();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFuncionEstruc() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFuncionEstruc==null) {
				
				this.jInternalFrameImportacionFuncionEstruc=new ImportacionJInternalFrame(FuncionEstrucConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFuncionEstruc);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFuncionEstruc);
				this.jInternalFrameImportacionFuncionEstruc.setVisible(false);
				this.jInternalFrameImportacionFuncionEstruc.setSelected(false);


				this.jInternalFrameImportacionFuncionEstruc.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFuncionEstruc"));
				this.jInternalFrameImportacionFuncionEstruc.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFuncionEstruc"));
				this.jInternalFrameImportacionFuncionEstruc.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFuncionEstruc"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFuncionEstruc() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFuncionEstruc==null) {
				this.jInternalFrameReporteDinamicoFuncionEstruc=new ReporteDinamicoJInternalFrame(FuncionEstrucConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFuncionEstruc);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFuncionEstruc);
				this.jInternalFrameReporteDinamicoFuncionEstruc.setVisible(false);
				this.jInternalFrameReporteDinamicoFuncionEstruc.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFuncionEstruc.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFuncionEstruc"));
				this.jInternalFrameReporteDinamicoFuncionEstruc.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFuncionEstruc"));
				this.jInternalFrameReporteDinamicoFuncionEstruc.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFuncionEstruc"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFuncionEstruc();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFuncionEstruc() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFuncionEstruc);
			
	       	this.jInternalFrameDetalleFormFuncionEstruc.setVisible(false);
	        this.jInternalFrameDetalleFormFuncionEstruc.setSelected(false);
			
			//this.jInternalFrameDetalleFormFuncionEstruc.dispose();
			//this.jInternalFrameDetalleFormFuncionEstruc=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFuncionEstruc() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFuncionEstruc.setVisible(true);
	        this.jInternalFrameReporteDinamicoFuncionEstruc.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFuncionEstruc() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFuncionEstruc.setVisible(true);
	        this.jInternalFrameImportacionFuncionEstruc.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFuncionEstruc() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFuncionEstruc.setVisible(true);
	        this.jInternalFrameOrderByFuncionEstruc.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFuncionEstruc() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFuncionEstruc.setVisible(false);
	        this.jInternalFrameOrderByFuncionEstruc.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFuncionEstruc() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFuncionEstruc.setVisible(false);
	        this.jInternalFrameReporteDinamicoFuncionEstruc.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFuncionEstruc() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFuncionEstruc.setVisible(false);
	        this.jInternalFrameImportacionFuncionEstruc.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeEstructura(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="Estructura";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderFuncionEstruc=(TitledBorder)this.jScrollPanelDatosFuncionEstruc.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderFuncionEstruc.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructura(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeEstructura);
						jInternalFrameTreeEstructura.setVisible(false);
						jInternalFrameTreeEstructura.setSelected(false);
						//jInternalFrameTreeEstructura.dispose();
						//jInternalFrameTreeEstructura=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFuncionEstruc(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFuncionEstruc(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFuncionEstruc(true);
			//this.isEsNuevoFuncionEstruc=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFuncionEstruc("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFuncionEstruc(false) ;
			
			if(funcionestrucSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FuncionEstrucJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFuncionEstruc(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFuncionEstruc(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFuncionEstrucActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFuncionEstruc(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFuncionEstruc(true);
			//this.isEsNuevoFuncionEstruc=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.funcionestruc.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFuncionEstruc("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFuncionEstruc(false) ;
			
			if(FuncionEstrucJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFuncionEstruc(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFuncionEstruc(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosFuncionEstruc.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFuncionEstruc.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFuncion(List<Funcion> funcionsForeignKey)throws Exception{
		TableColumn tableColumnFuncion=this.jTableDatosFuncionEstruc.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,FuncionEstrucConstantesFunciones.LABEL_IDFUNCION));
		TableCellEditor tableCellEditorFuncion =tableColumnFuncion.getCellEditor();

		FuncionTableCell funcionTableCellFk=(FuncionTableCell)tableCellEditorFuncion;

		if(funcionTableCellFk!=null) {
			funcionTableCellFk.setfuncionsForeignKey(funcionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFuncionEstruc.getSelectedRow();

		//if(intSelectedRow<=0) {
			//funcionTableCellFk.setRowActual(intSelectedRow);
			//funcionTableCellFk.setfuncionsForeignKeyActual(funcionsForeignKey);
		//}


		if(funcionTableCellFk!=null) {
			funcionTableCellFk.RecargarFuncionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFuncionEstruc(false);
			
			//if(!this.isEsNuevoFuncionEstruc) {								
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
				
			}
			
			if(this.permiteMantenimiento(this.funcionestruc)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFuncionEstruc=true;
					this.inicializarActualizarBindingTablaFuncionEstruc(false);
					this.isEsNuevoFuncionEstruc=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFuncionEstruc=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFuncionEstruc=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFuncionEstruc(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFuncionEstruc(false);
				
				this.habilitarDeshabilitarControlesFuncionEstruc(false);
			
												
				
				if(FuncionEstrucJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFuncionEstruc();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFuncionEstrucActionPerformed(evt,funcionestrucSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFuncionEstruc(this.funcionestruc,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFuncionEstruc.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,funcionestrucSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.funcionestruc.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FuncionEstruc.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FuncionEstruc.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				this.funcionestruc.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				this.funcionestruc.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.funcionestruc)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FuncionEstrucModel) this.jTableDatosFuncionEstruc.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFuncionEstruc=true;
				this.inicializarActualizarBindingTablaFuncionEstruc(false);
				this.isEsNuevoFuncionEstruc=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFuncionEstruc(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFuncionEstruc(false);
				
				this.habilitarDeshabilitarControlesFuncionEstruc(false);
				
				
				
				if(FuncionEstrucJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFuncionEstruc();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFuncionEstruc.getRowCount()>=1) {
				jTableDatosFuncionEstruc.removeRowSelectionInterval(0, jTableDatosFuncionEstruc.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFuncionEstruc(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFuncionEstruc(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFuncionEstruc(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFuncionEstruc(false) ;
			
			this.isEsNuevoFuncionEstruc=false;
			
			if(FuncionEstrucJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFuncionEstruc();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFuncionEstruc(false);
				
				//SI ES MANUAL
				if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFuncionEstruc();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFuncionEstruc--;			
			//FuncionEstruc funcionestrucAux= new FuncionEstruc();			
			//funcionestrucAux.setId(this.iIdNuevoFuncionEstruc);
			
			if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFuncionEstruc();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
			
			this.funcionestruc.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.funcionestrucLogic.getFuncionEstrucs().add(this.funcionestrucAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.funcionestrucs.add(this.funcionestrucAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFuncionEstruc(false);
			
			this.jTableDatosFuncionEstruc.setRowSelectionInterval(this.getIndiceNuevoFuncionEstruc(), this.getIndiceNuevoFuncionEstruc());
			
			int iLastRow =  this.jTableDatosFuncionEstruc.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFuncionEstruc.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFuncionEstruc.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFuncionEstruc(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFuncionEstruc(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFuncionEstruc(false);
			
			//SI ES MANUAL
			if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFuncionEstruc();
			}
			
			//this.abrirFrameTreeFuncionEstruc();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Funcion EstrucES ?", "MANTENIMIENTO DE Funcion Estruc", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFuncionEstruc.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFuncionEstruc();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.funcionestrucReturnGeneral=funcionestrucLogic.procesarImportacionFuncionEstrucsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.funcionestrucParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFuncionEstrucReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFuncionEstruc.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFuncionEstruc.setFileImportacion(this.jInternalFrameImportacionFuncionEstruc.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFuncionEstruc.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFuncionEstruc.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFuncionEstruc.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFuncionEstruc.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();		

		funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FuncionEstrucBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FuncionEstrucBaseDesign.jrxml";
			
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
			
			this.generarReporteFuncionEstrucs("Todos",funcionestrucsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion Estruc",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFuncionEstruc.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDFUNCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Funcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Funcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Funcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Funcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FuncionEstrucConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoFuncionEstruc.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDFUNCION:
					sNombreCampoCategoria="id_funcion";
					break;

				case FuncionEstrucConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDFUNCION:
					sNombreCampoCategoriaValor="id_funcion";
					break;

				case FuncionEstrucConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFuncionEstruc.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDFUNCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Funcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_funcion");
					break;

				case FuncionEstrucConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();		
		
		funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcionestruc";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FuncionEstrucs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFuncionEstruc.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FuncionEstruc funcionestruc:funcionestrucsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(funcionestruc.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(FuncionEstruc funcionestruc:funcionestrucsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(funcionestruc.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(FuncionEstruc funcionestruc:funcionestrucsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(funcionestruc.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FuncionEstrucConstantesFunciones.LABEL_IDFUNCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDFUNCION);
					iRow++;

					for(FuncionEstruc funcionestruc:funcionestrucsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(funcionestruc.getfuncion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FuncionEstrucConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(FuncionEstruc funcionestruc:funcionestrucsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(funcionestruc.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(FuncionEstruc funcionestruc:funcionestrucsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(funcionestruc.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelFuncionEstruc(row);				
			//	iRow++;
			//}				
			
			//for(FuncionEstruc funcionestrucAux:funcionestrucsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFuncionEstruc(funcionestrucAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion Estruc",JOptionPane.INFORMATION_MESSAGE);
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
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFuncionEstruc(false);
			
			//SI ES MANUAL
			if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFuncionEstruc();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFuncionEstruc(false);
			
			//SI ES MANUAL
			if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFuncionEstruc();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFuncionEstruc(false);
			
			//SI ES MANUAL
			if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFuncionEstruc();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFuncionEstruc() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFuncionEstruc.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFuncionEstruc.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFuncionEstruc.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFuncionEstruc.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFuncionEstruc.setMinimumSize(dimensionMinimum);
		this.jTableDatosFuncionEstruc.setMaximumSize(dimensionMaximum);
		this.jTableDatosFuncionEstruc.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFuncionEstruc(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFuncionEstruc(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFuncionEstruc(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFuncionEstruc(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFuncionEstruc(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFuncionEstruc(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFuncionEstruc(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFuncionEstruc(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FuncionEstrucJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFuncionEstruc() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFuncionEstruc();
		
		this.inicializarActualizarBindingBotonesManualFuncionEstruc(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFuncionEstruc();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFuncionEstruc() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFuncionEstruc(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFuncionEstruc(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFuncionEstruc.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFuncionEstruc.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFuncionEstruc.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFuncionEstruc.jCheckBoxPostAccionNuevoFuncionEstruc.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFuncionEstruc.jCheckBoxPostAccionSinCerrarFuncionEstruc.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFuncionEstruc.jCheckBoxPostAccionSinMensajeFuncionEstruc.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFuncionEstruc.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFuncionEstruc.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFuncionEstruc.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
				this.jInternalFrameDetalleFormFuncionEstruc.jCheckBoxPostAccionNuevoFuncionEstruc.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFuncionEstruc.jCheckBoxPostAccionSinCerrarFuncionEstruc.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFuncionEstruc.jCheckBoxPostAccionSinMensajeFuncionEstruc.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFuncionEstruc.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFuncionEstruc.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFuncionEstruc.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFuncionEstruc!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFuncionEstruc.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFuncionEstruc.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFuncionEstruc.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFuncionEstruc.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFuncionEstruc!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFuncionEstruc.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFuncionEstruc.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFuncionEstruc.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFuncionEstruc(Boolean esInicializar) throws Exception {
		try	{	
			if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFuncionEstruc(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFuncionEstruc() throws Exception {
		try	{
			if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFuncionEstruc();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFuncionEstruc() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFuncionEstruc() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFuncionEstruc.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFuncionEstruc.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFuncionEstruc.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFuncionEstruc.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFuncionEstruc.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFuncionEstruc.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFuncionEstruc.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFuncionEstruc.addItem(reporte);
			}
			
			
			if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFuncionEstruc.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFuncionEstruc.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFuncionEstruc.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFuncionEstruc.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFuncionEstruc.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFuncionEstruc.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFuncionEstruc.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFuncionEstruc.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFuncionEstruc.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFuncionEstruc();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFuncionEstruc() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFuncionEstruc!=null) {
				this.jInternalFrameReporteDinamicoFuncionEstruc.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFuncionEstruc.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFuncionEstruc!=null) {
				this.jInternalFrameReporteDinamicoFuncionEstruc.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFuncionEstruc.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFuncionEstruc!=null) {
				
				if(this.jInternalFrameReporteDinamicoFuncionEstruc.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFuncionEstruc.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFuncionEstruc.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFuncionEstruc.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFuncionEstruc.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFuncionEstruc.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFuncionEstruc()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraFuncionEstruc.getSelectedItem()).getId();}
		if(this.jComboBoxid_funcionFK_IdFuncionFuncionEstruc.getSelectedItem()!=null){this.id_funcionFK_IdFuncion=((Funcion)this.jComboBoxid_funcionFK_IdFuncionFuncionEstruc.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFuncionEstruc(Boolean esInicializar) throws Exception {				
		if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFuncionEstruc();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFuncionEstruc() throws Exception {
		this.inicializarActualizarBindingTablaFuncionEstruc(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFuncionEstruc() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FuncionEstrucPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FuncionEstrucPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFuncionEstrucOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstrucOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FuncionEstrucPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FuncionEstrucPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFuncionEstruc(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=funcionestrucLogic.getFuncionEstrucs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=funcionestrucs.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFuncionEstruc.setModel(new FuncionEstrucModel(this.funcionestrucLogic.getFuncionEstrucs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFuncionEstruc.setModel(new FuncionEstrucModel(this.funcionestrucs,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFuncionEstruc!=null && this.jInternalFrameOrderByFuncionEstruc.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFuncionEstruc();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFuncionEstruc.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FuncionEstrucPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO,funcionestrucConstantesFunciones.resaltarSeleccionarFuncionEstruc,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO,funcionestrucConstantesFunciones.resaltarSeleccionarFuncionEstruc,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFuncionEstruc.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,FuncionEstrucConstantesFunciones.LABEL_ID));

		if(this.funcionestrucConstantesFunciones.mostraridFuncionEstruc && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FuncionEstrucConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.funcionestrucConstantesFunciones.resaltaridFuncionEstruc,this.funcionestrucConstantesFunciones.activaridFuncionEstruc,this,true,"idFuncionEstruc","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.funcionestrucConstantesFunciones.resaltaridFuncionEstruc,this.funcionestrucConstantesFunciones.activaridFuncionEstruc,this,true,"idFuncionEstruc","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFuncionEstruc.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA));

		if(this.funcionestrucConstantesFunciones.mostrarid_empresaFuncionEstruc && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.funcionestrucConstantesFunciones.resaltarid_empresaFuncionEstruc,this,this.funcionestrucConstantesFunciones.activarid_empresaFuncionEstruc));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.funcionestrucConstantesFunciones.resaltarid_empresaFuncionEstruc,this,this.funcionestrucConstantesFunciones.activarid_empresaFuncionEstruc,false,"id_empresaFuncionEstruc","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FuncionEstrucPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFuncionEstruc.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.funcionestrucConstantesFunciones.mostrarid_sucursalFuncionEstruc && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.funcionestrucConstantesFunciones.resaltarid_sucursalFuncionEstruc,this,this.funcionestrucConstantesFunciones.activarid_sucursalFuncionEstruc));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.funcionestrucConstantesFunciones.resaltarid_sucursalFuncionEstruc,this,this.funcionestrucConstantesFunciones.activarid_sucursalFuncionEstruc,false,"id_sucursalFuncionEstruc","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FuncionEstrucPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFuncionEstruc.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.funcionestrucConstantesFunciones.mostrarid_estructuraFuncionEstruc && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.funcionestrucConstantesFunciones.resaltarid_estructuraFuncionEstruc,this,this.funcionestrucConstantesFunciones.activarid_estructuraFuncionEstruc));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.funcionestrucConstantesFunciones.resaltarid_estructuraFuncionEstruc,this,this.funcionestrucConstantesFunciones.activarid_estructuraFuncionEstruc,true,"id_estructuraFuncionEstruc","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FuncionEstrucPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFuncionEstruc.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,FuncionEstrucConstantesFunciones.LABEL_IDFUNCION));

		if(this.funcionestrucConstantesFunciones.mostrarid_funcionFuncionEstruc && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FuncionEstrucConstantesFunciones.LABEL_IDFUNCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FuncionTableCell(this.funcionsForeignKey,this.funcionestrucConstantesFunciones.resaltarid_funcionFuncionEstruc,this,this.funcionestrucConstantesFunciones.activarid_funcionFuncionEstruc));
			tableColumn.setCellEditor(new FuncionTableCell(this.funcionsForeignKey,this.funcionestrucConstantesFunciones.resaltarid_funcionFuncionEstruc,this,this.funcionestrucConstantesFunciones.activarid_funcionFuncionEstruc,true,"id_funcionFuncionEstruc","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FuncionEstrucPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFuncionEstruc.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,FuncionEstrucConstantesFunciones.LABEL_NOMBRE));

		if(this.funcionestrucConstantesFunciones.mostrarnombreFuncionEstruc && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FuncionEstrucConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.funcionestrucConstantesFunciones.resaltarnombreFuncionEstruc,this.funcionestrucConstantesFunciones.activarnombreFuncionEstruc,this,true,"nombreFuncionEstruc","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.funcionestrucConstantesFunciones.resaltarnombreFuncionEstruc,this.funcionestrucConstantesFunciones.activarnombreFuncionEstruc,this,true,"nombreFuncionEstruc","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FuncionEstrucPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFuncionEstruc.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION));

		if(this.funcionestrucConstantesFunciones.mostrardescripcionFuncionEstruc && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.funcionestrucConstantesFunciones.resaltardescripcionFuncionEstruc,this.funcionestrucConstantesFunciones.activardescripcionFuncionEstruc,this,true,"descripcionFuncionEstruc","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.funcionestrucConstantesFunciones.resaltardescripcionFuncionEstruc,this.funcionestrucConstantesFunciones.activardescripcionFuncionEstruc,this,true,"descripcionFuncionEstruc","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FuncionEstrucPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.funcionestrucSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.funcionestrucSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFuncionEstruc.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.funcionestrucSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.funcionestrucSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFuncionEstruc.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.funcionestrucSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.funcionestrucSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFuncionEstruc.addColumn(tableColumn);
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
			
			this.jTableDatosFuncionEstruc.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFuncionEstruc.moveColumn(this.jTableDatosFuncionEstruc.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFuncionEstruc.moveColumn(this.jTableDatosFuncionEstruc.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFuncionEstruc.moveColumn(this.jTableDatosFuncionEstruc.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFuncionEstruc.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFuncionEstruc.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFuncionEstruc,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFuncionEstruc.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFuncionEstruc.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FuncionEstrucJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFuncionEstruc.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFuncionEstruc.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFuncionEstruc.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=funcionestrucLogic.getFuncionEstrucs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=funcionestrucs.size()-1;
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
		//this.jTableDatosFuncionEstruc.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFuncionEstruc.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFuncionEstruc();
			
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
				
				//this.isEsNuevoFuncionEstruc=false;
					
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
				if(this.funcionestrucSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFuncionEstruc==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFuncionEstruc.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFuncionEstruc.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.funcionestruc.getsType().equals("DUPLICADO")
				   || this.funcionestruc.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFuncionEstruc=true;
				
				} else {
					this.isEsNuevoFuncionEstruc=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
					if(this.funcionestruc.getId()>=0 && !this.funcionestruc.getIsNew()) {						
						this.isEsNuevoFuncionEstruc=false;
						
					} else {
						this.isEsNuevoFuncionEstruc=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFuncionEstruc(esRelaciones);						
				
				this.seleccionarFuncionEstruc(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.funcionestruc.getId()<0) {
					this.isEsNuevoFuncionEstruc=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFuncionEstruc(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFuncionEstruc(evt,rowIndex);
				}	
				
				if(this.funcionestrucSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FuncionEstruc: " + this.dDif); 
					}
				}								
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFuncionEstruc(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.funcionestruc)) {
					if(this.funcionestruc.getId()>0) {
						this.funcionestruc.setIsDeleted(true);
						
						this.funcionestrucsEliminados.add(this.funcionestruc);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.funcionestrucLogic.getFuncionEstrucs().remove(this.funcionestruc);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.funcionestrucs.remove(this.funcionestruc);				
					}
					
					
					((FuncionEstrucModel) this.jTableDatosFuncionEstruc.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFuncionEstruc(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFuncionEstruc(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFuncionEstruc) {
			
			if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFuncionEstruc.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFuncionEstruc.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFuncionEstruc(this.funcionestruc);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.funcionestrucConstantesFunciones.cargarid_empresaFuncionEstruc || this.funcionestrucConstantesFunciones.event_dependid_empresaFuncionEstruc) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.funcionestruc.getid_empresa());
									//this.inicializarActualizarBindingFuncionEstruc(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(funcionestruc.getEmpresa()!=null) {
							this.empresasForeignKey.add(funcionestruc.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.funcionestruc.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.funcionestrucConstantesFunciones.cargarid_sucursalFuncionEstruc || this.funcionestrucConstantesFunciones.event_dependid_sucursalFuncionEstruc) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.funcionestruc.getid_sucursal());
									//this.inicializarActualizarBindingFuncionEstruc(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(funcionestruc.getSucursal()!=null) {
							this.sucursalsForeignKey.add(funcionestruc.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.funcionestruc.getid_sucursal(),false,"Formulario");

					//Estructura
					if(!this.funcionestrucConstantesFunciones.cargarid_estructuraFuncionEstruc || this.funcionestrucConstantesFunciones.event_dependid_estructuraFuncionEstruc) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.funcionestruc.getid_estructura());
									//this.inicializarActualizarBindingFuncionEstruc(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(funcionestruc.getEstructura()!=null) {
							this.estructurasForeignKey.add(funcionestruc.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.funcionestruc.getid_estructura(),false,"Formulario");

					//Funcion
					if(!this.funcionestrucConstantesFunciones.cargarid_funcionFuncionEstruc || this.funcionestrucConstantesFunciones.event_dependid_funcionFuncionEstruc) {
						//this.cargarCombosFuncionsForeignKeyLista(" where id="+this.funcionestruc.getid_funcion());
									//this.inicializarActualizarBindingFuncionEstruc(false,false);
						this.funcionsForeignKey=new ArrayList<Funcion>();

						if(funcionestruc.getFuncion()!=null) {
							this.funcionsForeignKey.add(funcionestruc.getFuncion());
						}

						this.addItemDefectoCombosForeignKeyFuncion();
						this.cargarCombosFrameFuncionsForeignKey("Todos");
					}
					this.setActualFuncionForeignKey(this.funcionestruc.getid_funcion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFuncionEstruc("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFuncionEstruc(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFuncionEstruc() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFuncionEstruc(FuncionEstruc funcionestruc) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFuncionEstruc(funcionestruc,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFuncionEstruc(FuncionEstruc funcionestruc,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFuncionEstruc(funcionestruc);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFuncionEstruc(funcionestruc,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFuncionEstruc(funcionestruc);
	}
	
	public void setVariablesObjetoActualToFormularioFuncionEstruc(FuncionEstruc funcionestruc) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFuncionEstruc.jLabelidFuncionEstruc.setText(funcionestruc.getId().toString());
			this.jInternalFrameDetalleFormFuncionEstruc.jTextAreanombreFuncionEstruc.setText(funcionestruc.getnombre());
			this.jInternalFrameDetalleFormFuncionEstruc.jTextAreadescripcionFuncionEstruc.setText(funcionestruc.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FuncionEstruc funcionestrucLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,funcionestrucLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FuncionEstruc funcionestrucLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				funcionestrucLocal=this.funcionestruc;
			} else {
				funcionestrucLocal=this.funcionestrucAnterior;
			}
		}
		
		if(this.permiteMantenimiento(funcionestrucLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFuncionEstruc(funcionestrucLocal,true);
					
					if(funcionestrucSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(funcionestrucLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(funcionestrucLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFuncionEstruc(FuncionEstruc funcionestruc,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFuncionEstruc(funcionestruc,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(funcionestruc);
	}
	
	public void setVariablesFormularioToObjetoActualFuncionEstruc(FuncionEstruc funcionestruc,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFuncionEstruc(funcionestruc,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFuncionEstruc(FuncionEstruc funcionestruc,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFuncionEstruc.jLabelidFuncionEstruc.getText()==null || this.jInternalFrameDetalleFormFuncionEstruc.jLabelidFuncionEstruc.getText()=="" || this.jInternalFrameDetalleFormFuncionEstruc.jLabelidFuncionEstruc.getText()=="Id") {
				this.jInternalFrameDetalleFormFuncionEstruc.jLabelidFuncionEstruc.setText("0");
			}

			if(conColumnasBase) {funcionestruc.setId(Long.parseLong(this.jInternalFrameDetalleFormFuncionEstruc.jLabelidFuncionEstruc.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FuncionEstrucConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncionEstruc.jLabelIdFuncionEstruc,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			funcionestruc.setnombre(this.jInternalFrameDetalleFormFuncionEstruc.jTextAreanombreFuncionEstruc.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FuncionEstrucConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncionEstruc.jLabelnombreFuncionEstruc,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			funcionestruc.setdescripcion(this.jInternalFrameDetalleFormFuncionEstruc.jTextAreadescripcionFuncionEstruc.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncionEstruc.jLabeldescripcionFuncionEstruc,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFuncionEstruc(FuncionEstruc funcionestrucBean,FuncionEstruc funcionestruc,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && funcionestrucBean.getid_estructura()!=null && !funcionestrucBean.getid_estructura().equals(-1L))) {funcionestruc.setid_estructura(funcionestrucBean.getid_estructura());}
			if(conDefault || (!conDefault && funcionestrucBean.getid_funcion()!=null && !funcionestrucBean.getid_funcion().equals(-1L))) {funcionestruc.setid_funcion(funcionestrucBean.getid_funcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFuncionEstruc(FuncionEstruc funcionestrucOrigen,FuncionEstruc funcionestruc,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && funcionestrucOrigen.getId()!=null && !funcionestrucOrigen.getId().equals(0L))) {funcionestruc.setId(funcionestrucOrigen.getId());}}
			if(conDefault || (!conDefault && funcionestrucOrigen.getid_estructura()!=null && !funcionestrucOrigen.getid_estructura().equals(-1L))) {funcionestruc.setid_estructura(funcionestrucOrigen.getid_estructura());}
			if(conDefault || (!conDefault && funcionestrucOrigen.getid_funcion()!=null && !funcionestrucOrigen.getid_funcion().equals(-1L))) {funcionestruc.setid_funcion(funcionestrucOrigen.getid_funcion());}
			if(conDefault || (!conDefault && funcionestrucOrigen.getnombre()!=null && !funcionestrucOrigen.getnombre().equals(""))) {funcionestruc.setnombre(funcionestrucOrigen.getnombre());}
			if(conDefault || (!conDefault && funcionestrucOrigen.getdescripcion()!=null && !funcionestrucOrigen.getdescripcion().equals(""))) {funcionestruc.setdescripcion(funcionestrucOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFuncionEstruc(FuncionEstruc funcionestruc) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFuncionEstruc.jLabelidFuncionEstruc.setText(funcionestruc.getId().toString());
			this.jInternalFrameDetalleFormFuncionEstruc.jTextAreanombreFuncionEstruc.setText(funcionestruc.getnombre());
			this.jInternalFrameDetalleFormFuncionEstruc.jTextAreadescripcionFuncionEstruc.setText(funcionestruc.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFuncionEstruc(FuncionEstrucBean funcionestrucBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFuncionEstruc.jLabelidFuncionEstruc.setText(funcionestrucBean.getId().toString());
			this.jInternalFrameDetalleFormFuncionEstruc.jTextAreanombreFuncionEstruc.setText(funcionestrucBean.getnombre());
			this.jInternalFrameDetalleFormFuncionEstruc.jTextAreadescripcionFuncionEstruc.setText(funcionestrucBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFuncionEstruc(FuncionEstrucParameterReturnGeneral funcionestrucReturnGeneral,FuncionEstrucBean funcionestrucBean,Boolean conDefault) throws Exception { 
		try {
			FuncionEstruc funcionestrucLocal=new FuncionEstruc();
			
			funcionestrucLocal=funcionestrucReturnGeneral.getFuncionEstruc();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && funcionestrucLocal.getId()!=null && !funcionestrucLocal.getId().equals(0L))) {funcionestrucBean.setId(funcionestrucLocal.getId());}}
			if(conDefault || (!conDefault && funcionestrucLocal.getid_estructura()!=null && !funcionestrucLocal.getid_estructura().equals(-1L))) {funcionestrucBean.setid_estructura(funcionestrucLocal.getid_estructura());}
			if(conDefault || (!conDefault && funcionestrucLocal.getid_funcion()!=null && !funcionestrucLocal.getid_funcion().equals(-1L))) {funcionestrucBean.setid_funcion(funcionestrucLocal.getid_funcion());}
			if(conDefault || (!conDefault && funcionestrucLocal.getnombre()!=null && !funcionestrucLocal.getnombre().equals(""))) {funcionestrucBean.setnombre(funcionestrucLocal.getnombre());}
			if(conDefault || (!conDefault && funcionestrucLocal.getdescripcion()!=null && !funcionestrucLocal.getdescripcion().equals(""))) {funcionestrucBean.setdescripcion(funcionestrucLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFuncionEstrucGenerico(Long idFuncionEstrucSeleccionado,JComboBox jComboBoxFuncionEstruc,List<FuncionEstruc> funcionestrucsLocal)throws Exception {
		try {
			FuncionEstruc  funcionestrucTemp=null;

			for(FuncionEstruc funcionestrucAux:funcionestrucsLocal) {
				if(funcionestrucAux.getId()!=null && funcionestrucAux.getId().equals(idFuncionEstrucSeleccionado)) {
					funcionestrucTemp=funcionestrucAux;
					break;
				}
			}

			jComboBoxFuncionEstruc.setSelectedItem(funcionestrucTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFuncionEstrucGenerico(JComboBox jComboBoxFuncionEstruc,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFuncionEstruc.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFuncionEstruc.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFuncionEstruc.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFuncionEstruc.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFuncionEstruc.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFuncionEstruc.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			funcionestruc=(FuncionEstruc) funcionestrucLogic.getFuncionEstrucs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			funcionestruc =(FuncionEstruc) funcionestrucs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!funcionestruc.getIsNew() && !funcionestruc.getIsChanged() && !funcionestruc.getIsDeleted()) {
				sDescripcion=funcionestruc.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=funcionestruc.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!funcionestruc.getIsNew() && !funcionestruc.getIsChanged() && !funcionestruc.getIsDeleted()) {
				sDescripcion=funcionestruc.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=funcionestruc.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!funcionestruc.getIsNew() && !funcionestruc.getIsChanged() && !funcionestruc.getIsDeleted()) {
				sDescripcion=funcionestruc.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=funcionestruc.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Funcion")) {
			//sDescripcion=this.getActualFuncionForeignKeyDescripcion((Long)value);
			if(!funcionestruc.getIsNew() && !funcionestruc.getIsChanged() && !funcionestruc.getIsDeleted()) {
				sDescripcion=funcionestruc.getfuncion_descripcion();
			} else {
				//sDescripcion=this.getActualFuncionForeignKeyDescripcion((Long)value);
				sDescripcion=funcionestruc.getfuncion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FuncionEstruc funcionestrucRow=new FuncionEstruc();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			funcionestrucRow=(FuncionEstruc) funcionestrucLogic.getFuncionEstrucs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			funcionestrucRow=(FuncionEstruc) funcionestrucs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFuncionEstruc(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFuncionEstruc.setVisible((this.isVisibilidadCeldaNuevoFuncionEstruc && this.isPermisoNuevoFuncionEstruc));			
			this.jButtonDuplicarFuncionEstruc.setVisible((this.isVisibilidadCeldaDuplicarFuncionEstruc && this.isPermisoDuplicarFuncionEstruc));			
			this.jButtonCopiarFuncionEstruc.setVisible((this.isVisibilidadCeldaCopiarFuncionEstruc && this.isPermisoCopiarFuncionEstruc));
			this.jButtonVerFormFuncionEstruc.setVisible((this.isVisibilidadCeldaVerFormFuncionEstruc && this.isPermisoVerFormFuncionEstruc));
			
			this.jButtonAbrirOrderByFuncionEstruc.setVisible((this.isVisibilidadCeldaOrdenFuncionEstruc && this.isPermisoOrdenFuncionEstruc));			
			
			this.jButtonNuevoRelacionesFuncionEstruc.setVisible((this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc && this.isPermisoNuevoFuncionEstruc));			
			this.jButtonNuevoGuardarCambiosFuncionEstruc.setVisible((this.isVisibilidadCeldaNuevoFuncionEstruc && this.isPermisoNuevoFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc));
			
			if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonModificarFuncionEstruc.setVisible((this.isVisibilidadCeldaModificarFuncionEstruc && this.isPermisoActualizarFuncionEstruc));	
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonActualizarFuncionEstruc.setVisible((this.isVisibilidadCeldaActualizarFuncionEstruc && this.isPermisoActualizarFuncionEstruc));	
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonEliminarFuncionEstruc.setVisible((this.isVisibilidadCeldaEliminarFuncionEstruc && this.isPermisoEliminarFuncionEstruc));
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonCancelarFuncionEstruc.setVisible(this.isVisibilidadCeldaCancelarFuncionEstruc);							
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosFuncionEstruc.setVisible((this.isVisibilidadCeldaGuardarFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc));			
			
			}
						
			this.jButtonGuardarCambiosTablaFuncionEstruc.setVisible((this.isVisibilidadCeldaGuardarCambiosFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaNuevoFuncionEstruc && this.isPermisoNuevoFuncionEstruc));						
			this.jButtonDuplicarToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaDuplicarFuncionEstruc && this.isPermisoDuplicarFuncionEstruc));						
			this.jButtonCopiarToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaCopiarFuncionEstruc && this.isPermisoCopiarFuncionEstruc));			
			this.jButtonVerFormToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaVerFormFuncionEstruc && this.isPermisoVerFormFuncionEstruc));			
			this.jButtonAbrirOrderByToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaOrdenFuncionEstruc && this.isPermisoOrdenFuncionEstruc));
			this.jButtonNuevoRelacionesToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc && this.isPermisoNuevoFuncionEstruc));			
			this.jButtonNuevoGuardarCambiosToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaNuevoFuncionEstruc && this.isPermisoNuevoFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc));			
			
			if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonModificarToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaModificarFuncionEstruc && this.isPermisoActualizarFuncionEstruc));	
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonActualizarToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaActualizarFuncionEstruc  && this.isPermisoActualizarFuncionEstruc));	
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonEliminarToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaEliminarFuncionEstruc && this.isPermisoEliminarFuncionEstruc));
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonCancelarToolBarFuncionEstruc.setVisible(this.isVisibilidadCeldaCancelarFuncionEstruc);				
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaGuardarFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFuncionEstruc.setVisible((this.isVisibilidadCeldaGuardarCambiosFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFuncionEstruc.setVisible((this.isVisibilidadCeldaNuevoFuncionEstruc && this.isPermisoNuevoFuncionEstruc));			
			this.jMenuItemDuplicarFuncionEstruc.setVisible((this.isVisibilidadCeldaDuplicarFuncionEstruc && this.isPermisoDuplicarFuncionEstruc));			
			this.jMenuItemCopiarFuncionEstruc.setVisible((this.isVisibilidadCeldaCopiarFuncionEstruc && this.isPermisoCopiarFuncionEstruc));			
			this.jMenuItemVerFormFuncionEstruc.setVisible((this.isVisibilidadCeldaVerFormFuncionEstruc && this.isPermisoVerFormFuncionEstruc));			
			this.jMenuItemAbrirOrderByFuncionEstruc.setVisible((this.isVisibilidadCeldaOrdenFuncionEstruc && this.isPermisoOrdenFuncionEstruc));			
			//this.jMenuItemMostrarOcultarFuncionEstruc.setVisible((this.isVisibilidadCeldaOrdenFuncionEstruc && this.isPermisoOrdenFuncionEstruc));
			this.jMenuItemDetalleAbrirOrderByFuncionEstruc.setVisible((this.isVisibilidadCeldaOrdenFuncionEstruc && this.isPermisoOrdenFuncionEstruc));			
			//this.jMenuItemDetalleMostrarOcultarFuncionEstruc.setVisible((this.isVisibilidadCeldaOrdenFuncionEstruc && this.isPermisoOrdenFuncionEstruc));			
			this.jMenuItemNuevoRelacionesFuncionEstruc.setVisible((this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc && this.isPermisoNuevoFuncionEstruc));			
			this.jMenuItemNuevoGuardarCambiosFuncionEstruc.setVisible((this.isVisibilidadCeldaNuevoFuncionEstruc && this.isPermisoNuevoFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc));									
			
			if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemModificarFuncionEstruc.setVisible((this.isVisibilidadCeldaModificarFuncionEstruc && this.isPermisoActualizarFuncionEstruc));	
			this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemActualizarFuncionEstruc.setVisible((this.isVisibilidadCeldaActualizarFuncionEstruc && this.isPermisoActualizarFuncionEstruc));	
			this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemEliminarFuncionEstruc.setVisible((this.isVisibilidadCeldaEliminarFuncionEstruc && this.isPermisoEliminarFuncionEstruc));
			this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemCancelarFuncionEstruc.setVisible(this.isVisibilidadCeldaCancelarFuncionEstruc);				
			}
			
			this.jMenuItemGuardarCambiosFuncionEstruc.setVisible((this.isVisibilidadCeldaGuardarFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc));						
			this.jMenuItemGuardarCambiosTablaFuncionEstruc.setVisible((this.isVisibilidadCeldaGuardarCambiosFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFuncionEstruc=this.jButtonNuevoFuncionEstruc.isVisible();
			this.isVisibilidadCeldaDuplicarFuncionEstruc=this.jButtonDuplicarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaCopiarFuncionEstruc=this.jButtonCopiarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaVerFormFuncionEstruc=this.jButtonVerFormFuncionEstruc.isVisible();
			
			this.isVisibilidadCeldaOrdenFuncionEstruc=this.jButtonAbrirOrderByFuncionEstruc.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=this.jButtonNuevoRelacionesFuncionEstruc.isVisible();
			this.isVisibilidadCeldaModificarFuncionEstruc=this.jButtonModificarFuncionEstruc.isVisible();
			
			if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			this.isVisibilidadCeldaActualizarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jButtonActualizarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaEliminarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jButtonEliminarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaCancelarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jButtonCancelarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaGuardarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosFuncionEstruc.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=this.jButtonGuardarCambiosTablaFuncionEstruc.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFuncionEstruc=this.jButtonNuevoToolBarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=this.jButtonNuevoRelacionesToolBarFuncionEstruc.isVisible();
			
			if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			this.isVisibilidadCeldaModificarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jButtonModificarToolBarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaActualizarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jButtonActualizarToolBarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaEliminarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jButtonEliminarToolBarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaCancelarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jButtonCancelarToolBarFuncionEstruc.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFuncionEstruc=this.jButtonGuardarCambiosToolBarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=this.jButtonGuardarCambiosTablaToolBarFuncionEstruc.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFuncionEstruc=this.jMenuItemNuevoFuncionEstruc.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=this.jMenuItemNuevoRelacionesFuncionEstruc.isVisible();
			
			if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			this.isVisibilidadCeldaModificarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemModificarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaActualizarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemActualizarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaEliminarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemEliminarFuncionEstruc.isVisible();
			this.isVisibilidadCeldaCancelarFuncionEstruc=this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemCancelarFuncionEstruc.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFuncionEstruc=this.jMenuItemGuardarCambiosFuncionEstruc.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=this.jMenuItemGuardarCambiosTablaFuncionEstruc.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFuncionEstruc(Boolean esInicializar) {
		if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {			
			if(this.funcionestrucSessionBean.getConGuardarRelaciones()) {
				//if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFuncionEstruc();
			}
			
			this.inicializarActualizarBindingBotonesManualFuncionEstruc(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFuncionEstruc() {
		this.jButtonNuevoFuncionEstruc.setVisible(this.isPermisoNuevoFuncionEstruc);			
		this.jButtonDuplicarFuncionEstruc.setVisible(this.isPermisoDuplicarFuncionEstruc);			
		this.jButtonCopiarFuncionEstruc.setVisible(this.isPermisoCopiarFuncionEstruc);			
		this.jButtonVerFormFuncionEstruc.setVisible(this.isPermisoVerFormFuncionEstruc);			
		
		this.jButtonAbrirOrderByFuncionEstruc.setVisible(this.isPermisoOrdenFuncionEstruc);					
		
		this.jButtonNuevoRelacionesFuncionEstruc.setVisible(this.isPermisoNuevoFuncionEstruc);			
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonModificarFuncionEstruc.setVisible(this.isPermisoActualizarFuncionEstruc);	
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonActualizarFuncionEstruc.setVisible(this.isPermisoActualizarFuncionEstruc);	
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonEliminarFuncionEstruc.setVisible(this.isPermisoEliminarFuncionEstruc);
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonCancelarFuncionEstruc.setVisible(this.isVisibilidadCeldaCancelarFuncionEstruc);						
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosFuncionEstruc.setVisible(this.isPermisoGuardarCambiosFuncionEstruc);							
		}
		
		this.jButtonGuardarCambiosTablaFuncionEstruc.setVisible(this.isPermisoActualizarFuncionEstruc);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFuncionEstruc() {
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonModificarFuncionEstruc.setVisible(this.isPermisoActualizarFuncionEstruc);	
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonActualizarFuncionEstruc.setVisible(this.isPermisoActualizarFuncionEstruc);	
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonEliminarFuncionEstruc.setVisible(this.isPermisoEliminarFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonCancelarFuncionEstruc.setVisible(this.isVisibilidadCeldaCancelarFuncionEstruc);							
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosFuncionEstruc.setVisible((this.isVisibilidadCeldaGuardarFuncionEstruc && this.isPermisoGuardarCambiosFuncionEstruc));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFuncionEstruc() {
		if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFuncionEstruc();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFuncionEstruc() {
	}
	
	public void jTableDatosFuncionEstrucListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFuncionEstruc(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFuncionEstrucBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.getfuncionestruc(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.funcionestruc==null) {
						this.funcionestruc = new FuncionEstruc();
					}

					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
				}

				if(this.funcionestruc.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.funcionestruc.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFuncionEstruc(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFuncionEstrucUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFuncionEstruc(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFuncionEstruc.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFuncionEstruc.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFuncionEstruc(this.getfuncionestruc(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.funcionestrucLogic.getConnexion());

				if(this.funcionestruc.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.funcionestruc.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFuncionEstruc=(TitledBorder)this.jScrollPanelDatosFuncionEstruc.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFuncionEstruc.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFuncionEstrucBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.getfuncionestruc(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.funcionestruc==null) {
						this.funcionestruc = new FuncionEstruc();
					}

					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
				}

				if(this.funcionestruc.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.funcionestruc.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFuncionEstruc(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalFuncionEstrucUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebFuncionEstruc(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFuncionEstruc.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFuncionEstruc.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFuncionEstruc(this.getfuncionestruc(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.funcionestrucLogic.getConnexion());

				if(this.funcionestruc.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.funcionestruc.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFuncionEstruc=(TitledBorder)this.jScrollPanelDatosFuncionEstruc.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderFuncionEstruc.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalFuncionEstrucBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.getfuncionestruc(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.funcionestruc==null) {
						this.funcionestruc = new FuncionEstruc();
					}

					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
				}

				if(this.funcionestruc.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.funcionestruc.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFuncionEstruc(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraFuncionEstrucUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebFuncionEstruc(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFuncionEstruc.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFuncionEstruc.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFuncionEstruc(this.getfuncionestruc(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.funcionestrucLogic.getConnexion());

				if(this.funcionestruc.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.funcionestruc.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFuncionEstruc=(TitledBorder)this.jScrollPanelDatosFuncionEstruc.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderFuncionEstruc.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraFuncionEstrucBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.getfuncionestruc(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.funcionestruc==null) {
						this.funcionestruc = new FuncionEstruc();
					}

					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
				}

				if(this.funcionestruc.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.funcionestruc.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFuncionEstruc(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_funcionFuncionEstrucUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofuncion=true;

			idTienePermisofuncion=this.tienePermisosUsuarioEnPaginaWebFuncionEstruc(FuncionConstantesFunciones.CLASSNAME);

			if(idTienePermisofuncion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFuncionEstruc.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFuncionEstruc.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFuncionEstruc(this.getfuncionestruc(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);

				this.funcionBeanSwingJInternalFrame=new FuncionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.funcionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.funcionBeanSwingJInternalFrame.getFuncionLogic().setConnexion(this.funcionestrucLogic.getConnexion());

				if(this.funcionestruc.getid_funcion()!=null) {
					this.funcionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.funcionBeanSwingJInternalFrame.setIdActual(this.funcionestruc.getid_funcion());
					this.funcionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.funcionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.funcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaFuncion();
				}

				JInternalFrameBase jinternalFrame =this.funcionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFuncionEstruc=(TitledBorder)this.jScrollPanelDatosFuncionEstruc.getBorder();
				TitledBorder titledBorderfuncion=(TitledBorder)this.funcionBeanSwingJInternalFrame.jScrollPanelDatosFuncion.getBorder();

				titledBorderfuncion.setTitle(titledBorderFuncionEstruc.getTitle() + " -> Funcion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_funcionFuncionEstrucBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.getfuncionestruc(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.funcionestruc==null) {
						this.funcionestruc = new FuncionEstruc();
					}

					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
				}

				if(this.funcionestruc.getid_funcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_funcion = "+this.funcionestruc.getid_funcion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFuncionEstruc(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreFuncionEstrucBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.getfuncionestruc(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.funcionestruc==null) {
						this.funcionestruc = new FuncionEstruc();
					}

					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
				}

				if(this.funcionestruc.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.funcionestruc.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFuncionEstruc(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionFuncionEstrucBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.getfuncionestruc(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.funcionestruc==null) {
						this.funcionestruc = new FuncionEstruc();
					}

					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);
				}

				if(this.funcionestruc.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.funcionestruc.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFuncionEstruc(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFuncionEstruc(false,false);

			this.getFuncionEstrucsFK_IdEmpresa();

			this.inicializarActualizarBindingFuncionEstruc(false);

			//if(FuncionEstrucBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFuncionEstruc(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFuncionEstruc(false,false);

			this.getFuncionEstrucsFK_IdEstructura();

			this.inicializarActualizarBindingFuncionEstruc(false);

			//if(FuncionEstrucBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFuncionEstruc(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFuncionFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFuncionEstruc(false,false);

			this.getFuncionEstrucsFK_IdFuncion();

			this.inicializarActualizarBindingFuncionEstruc(false);

			//if(FuncionEstrucBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFuncionEstruc(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalFuncionEstrucActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFuncionEstruc(false,false);

			this.getFuncionEstrucsFK_IdSucursal();

			this.inicializarActualizarBindingFuncionEstruc(false);

			//if(FuncionEstrucBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFuncionEstruc(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionestrucLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFuncionEstruc() {
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
			this.jInternalFrameDetalleFormFuncionEstruc.setVisible(false);	    			
			this.jInternalFrameDetalleFormFuncionEstruc.dispose();
			this.jInternalFrameDetalleFormFuncionEstruc=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFuncionEstruc!=null) {
			this.jInternalFrameReporteDinamicoFuncionEstruc.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFuncionEstruc.dispose();
			this.jInternalFrameReporteDinamicoFuncionEstruc=null;
		}
		
		if(this.jInternalFrameImportacionFuncionEstruc!=null) {
			this.jInternalFrameImportacionFuncionEstruc.setVisible(false);	    			
			this.jInternalFrameImportacionFuncionEstruc.dispose();
			this.jInternalFrameImportacionFuncionEstruc=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFuncionEstruc();
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
			
			if(sTipo.equals("NuevoFuncionEstruc")) {
				jButtonNuevoFuncionEstrucActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFuncionEstruc")) {
				jButtonDuplicarFuncionEstrucActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFuncionEstruc")) {
				jButtonCopiarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("VerFormFuncionEstruc")) {
				jButtonVerFormFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFuncionEstruc")) {
				jButtonNuevoFuncionEstrucActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFuncionEstruc")) {
				jButtonDuplicarFuncionEstrucActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFuncionEstruc")) {
				jButtonNuevoFuncionEstrucActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFuncionEstruc")) {
				jButtonDuplicarFuncionEstrucActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFuncionEstruc")) {
				jButtonNuevoFuncionEstrucActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFuncionEstruc")) {
				jButtonNuevoFuncionEstrucActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFuncionEstruc")) {
				jButtonNuevoFuncionEstrucActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFuncionEstruc")) {
				jButtonModificarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFuncionEstruc")) {
				jButtonModificarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFuncionEstruc")) {
				jButtonModificarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFuncionEstruc")) {
				jButtonActualizarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFuncionEstruc")) {
				jButtonActualizarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFuncionEstruc")) {
				jButtonActualizarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("EliminarFuncionEstruc")) {
				jButtonEliminarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFuncionEstruc")) {
				jButtonEliminarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFuncionEstruc")) {
				jButtonEliminarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("CancelarFuncionEstruc")) {
				jButtonCancelarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFuncionEstruc")) {
				jButtonCancelarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFuncionEstruc")) {
				jButtonCancelarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("CerrarFuncionEstruc")) {
				jButtonCerrarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFuncionEstruc")) {
				jButtonCerrarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFuncionEstruc")) {
				jButtonCerrarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFuncionEstruc")) {
				jButtonMostrarOcultarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFuncionEstruc")) {
				jButtonCancelarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFuncionEstruc")) {
				jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFuncionEstruc")) {
				jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFuncionEstruc")) {
				jButtonCopiarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFuncionEstruc")) {
				jButtonVerFormFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFuncionEstruc")) {
				jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFuncionEstruc")) {
				jButtonCopiarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFuncionEstruc")) {
				jButtonVerFormFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFuncionEstruc")) {
				jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFuncionEstruc")) {
				jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFuncionEstruc")) {
				jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFuncionEstruc")) {
				jButtonRecargarInformacionFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFuncionEstruc")) {
				jButtonRecargarInformacionFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFuncionEstruc")) {
				jButtonRecargarInformacionFuncionEstrucActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFuncionEstruc")) {
				jButtonAnterioresFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFuncionEstruc")) {
				jButtonAnterioresFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFuncionEstruc")) {
				jButtonAnterioresFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFuncionEstruc")) {
				jButtonSiguientesFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFuncionEstruc")) {
				jButtonSiguientesFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFuncionEstruc")) {
				jButtonSiguientesFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFuncionEstruc") || sTipo.equals("MenuItemDetalleAbrirOrderByFuncionEstruc")) {
				jButtonAbrirOrderByFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFuncionEstruc") || sTipo.equals("MenuItemDetalleMostrarOcultarFuncionEstruc")) {
				jButtonMostrarOcultarFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFuncionEstruc")) {
				jButtonNuevoGuardarCambiosFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFuncionEstruc")) {
				jButtonNuevoGuardarCambiosFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFuncionEstruc")) {
				jButtonNuevoGuardarCambiosFuncionEstrucActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFuncionEstruc")) {
				jButtonCerrarReporteDinamicoFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFuncionEstruc")) {
				jButtonGenerarReporteDinamicoFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFuncionEstruc")) {
				
				jButtonGenerarExcelReporteDinamicoFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFuncionEstruc")) {
				jButtonCerrarImportacionFuncionEstrucActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFuncionEstruc")) {
				
				jButtonGenerarImportacionFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFuncionEstruc")) {
				
				jButtonAbrirImportacionFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFuncionEstruc")) {
				jComboBoxTiposAccionesFuncionEstrucActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFuncionEstruc")) {
				jComboBoxTiposRelacionesFuncionEstrucActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFuncionEstruc")) {
				jComboBoxTiposAccionesFuncionEstrucActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFuncionEstruc")) {
				
				jComboBoxTiposSeleccionarFuncionEstrucActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFuncionEstruc")) {
				jTextFieldValorCampoGeneralFuncionEstrucActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFuncionEstruc")) {
				jButtonAbrirOrderByFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFuncionEstruc")) {
				jButtonAbrirOrderByFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFuncionEstruc")) {
				jButtonCerrarOrderByFuncionEstrucActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFuncionEstrucBusqueda")) {
				this.jButtonidFuncionEstrucBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFuncionEstrucUpdate")) {
				this.jButtonid_empresaFuncionEstrucUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFuncionEstrucBusqueda")) {
				this.jButtonid_empresaFuncionEstrucBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFuncionEstrucUpdate")) {
				this.jButtonid_sucursalFuncionEstrucUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFuncionEstrucBusqueda")) {
				this.jButtonid_sucursalFuncionEstrucBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraFuncionEstrucUpdate")) {
				this.jButtonid_estructuraFuncionEstrucUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraFuncionEstrucBusqueda")) {
				this.jButtonid_estructuraFuncionEstrucBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_funcionFuncionEstrucUpdate")) {
				this.jButtonid_funcionFuncionEstrucUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_funcionFuncionEstrucBusqueda")) {
				this.jButtonid_funcionFuncionEstrucBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFuncionEstrucBusqueda")) {
				this.jButtonnombreFuncionEstrucBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionFuncionEstrucBusqueda")) {
				this.jButtondescripcionFuncionEstrucBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEstructuraFuncionEstruc")) {
				this.jButtonFK_IdEstructuraFuncionEstrucActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFuncionFuncionEstruc")) {
				this.jButtonFK_IdFuncionFuncionEstrucActionPerformed(evt);
			}
			
			;
			
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFuncionEstruc();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionEstrucActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				


				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FuncionEstruc.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FuncionEstruc.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FuncionEstruc funcionestrucLocal=null;
			
			if(!this.getEsControlTabla()) {
				funcionestrucLocal=this.funcionestruc;
			} else {
				funcionestrucLocal=this.funcionestrucAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
							
				
				


				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FuncionEstruc.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FuncionEstruc.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionEstrucActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
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
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
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
			
			


			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionEstrucActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
								
						
				


				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FuncionEstruc.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FuncionEstruc.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
								
				
				


				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FuncionEstruc.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FuncionEstruc.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionEstrucActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionEstrucActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionEstrucActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
			
			this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
							
				
				


				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FuncionEstruc.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FuncionEstruc.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionEstrucActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
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
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
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
			
			


			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionEstrucActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
			
			this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
								
				
				


				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FuncionEstruc.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FuncionEstruc.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionEstrucActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionEstrucActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
			
			this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionEstrucActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFuncionEstruc")) {
					jCheckBoxSeleccionarTodosFuncionEstrucItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFuncionEstruc")) {
					jCheckBoxSeleccionadosFuncionEstrucItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFuncionEstruc")) {
					
				}
				
				


				
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FuncionEstruc.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FuncionEstruc.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
												
				
				


				
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FuncionEstruc.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FuncionEstruc.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionEstrucActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionEstrucActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
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
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
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
			
			


			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionEstrucActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FuncionEstruc.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FuncionEstruc.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcionestruc);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcionestruc);
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
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
				
				


				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FuncionEstruc.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FuncionEstruc.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionEstrucActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionestrucAnterior =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFuncionEstruc")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFuncionEstrucListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFuncionEstruc.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.funcionestruc =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.funcionestruc =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.funcionestruc);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFuncionEstruc")) {
				
				}
				
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFuncionEstruc")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFuncionEstruc.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFuncionEstruc")) {
			
			}
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFuncionEstruc();
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
			if(sTipo.equals("NuevoFuncionEstruc")) {
				jButtonNuevoFuncionEstrucActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFuncionEstruc")) {
				jButtonDuplicarFuncionEstrucActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFuncionEstruc")) {
				jButtonCopiarFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFuncionEstruc")) {
				jButtonVerFormFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFuncionEstruc")) {
				jButtonNuevoFuncionEstrucActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFuncionEstruc")) {
				jButtonModificarFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFuncionEstruc")) {
				jButtonActualizarFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFuncionEstruc")) {
				jButtonEliminarFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFuncionEstruc")) {
				jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFuncionEstruc")) {
				jButtonCancelarFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFuncionEstruc")) {
				jButtonCerrarFuncionEstrucActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFuncionEstruc")) {
				jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFuncionEstruc")) {
				jButtonNuevoGuardarCambiosFuncionEstrucActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFuncionEstruc")) {
				jButtonAbrirOrderByFuncionEstrucActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFuncionEstruc")) {
				jButtonRecargarInformacionFuncionEstrucActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFuncionEstruc")) {
				jButtonAnterioresFuncionEstrucActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFuncionEstruc")) {
				jButtonSiguientesFuncionEstrucActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFuncionEstrucBusqueda")) {
				this.jButtonidFuncionEstrucBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFuncionEstrucUpdate")) {
				this.jButtonid_empresaFuncionEstrucUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFuncionEstrucBusqueda")) {
				this.jButtonid_empresaFuncionEstrucBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFuncionEstrucUpdate")) {
				this.jButtonid_sucursalFuncionEstrucUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFuncionEstrucBusqueda")) {
				this.jButtonid_sucursalFuncionEstrucBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraFuncionEstrucUpdate")) {
				this.jButtonid_estructuraFuncionEstrucUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraFuncionEstrucBusqueda")) {
				this.jButtonid_estructuraFuncionEstrucBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_funcionFuncionEstrucUpdate")) {
				this.jButtonid_funcionFuncionEstrucUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_funcionFuncionEstrucBusqueda")) {
				this.jButtonid_funcionFuncionEstrucBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFuncionEstrucBusqueda")) {
				this.jButtonnombreFuncionEstrucBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionFuncionEstrucBusqueda")) {
				this.jButtondescripcionFuncionEstrucBusquedaActionPerformed(evt);
			}
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFuncionEstruc();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFuncionEstruc")) {
				closingInternalFrameFuncionEstruc();
				
			} else if(sTipo.equals("jButtonCancelarFuncionEstruc")) {
				JInternalFrameBase jInternalFrameDetalleFormFuncionEstruc = (JInternalFrameBase)evt.getSource();
	            	
	            FuncionEstrucBeanSwingJInternalFrame jInternalFrameParent=(FuncionEstrucBeanSwingJInternalFrame)jInternalFrameDetalleFormFuncionEstruc.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFuncionEstrucActionPerformed(null);
			}
			
			FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.funcionestruc,new Object(),this.funcionestrucParameterGeneral,this.funcionestrucReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFuncionEstruc(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFuncionEstruc(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFuncionEstruc(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.funcionestruc)) {
			if(!esControlTabla) {
				if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);			
				}
				
				if(this.funcionestrucSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFuncionEstruc(this.funcionestruc,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.funcionestrucReturnGeneral=funcionestrucLogic.procesarEventosFuncionEstrucsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.funcionestrucLogic.getFuncionEstrucs(),this.funcionestruc,this.funcionestrucParameterGeneral,this.isEsNuevoFuncionEstruc,classes);//this.funcionestrucLogic.getFuncionEstruc()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFuncionEstruc(this.funcionestrucReturnGeneral,this.funcionestrucBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.funcionestrucSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFuncionEstruc(classes,this.funcionestrucReturnGeneral,this.funcionestrucBean,false);
					}
						
					if(this.funcionestrucReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFuncionEstruc(this.funcionestrucReturnGeneral.getFuncionEstruc());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFuncionEstruc(this.funcionestrucReturnGeneral.getFuncionEstruc());	
					}
						
					if(this.funcionestrucReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFuncionEstruc(this.funcionestrucReturnGeneral.getFuncionEstruc(),classes);//this.funcionestrucBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFuncionEstruc(this.funcionestruc,classes);//this.funcionestrucBean);									
				}
			
				if(FuncionEstrucJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFuncionEstruc(this.funcionestruc,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncionEstruc(this.funcionestruc);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.funcionestrucAnterior!=null) {
						this.funcionestruc=this.funcionestrucAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.funcionestrucReturnGeneral=funcionestrucLogic.procesarEventosFuncionEstrucsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.funcionestrucLogic.getFuncionEstrucs(),this.funcionestruc,this.funcionestrucParameterGeneral,this.isEsNuevoFuncionEstruc,classes);//this.funcionestrucLogic.getFuncionEstruc()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.funcionestrucSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.funcionestrucSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.funcionestrucReturnGeneral.getFuncionEstruc(),funcionestrucLogic.getFuncionEstrucs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.funcionestrucReturnGeneral.getFuncionEstruc(),this.funcionestrucs);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFuncionEstruc.repaint();
				
				//((AbstractTableModel) this.jTableDatosFuncionEstruc.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFuncionEstruc();
			}
		}
	}
	
	public void actualizarVisualTableDatosFuncionEstruc() throws Exception {
		
		FuncionEstrucModel funcionestrucModel=(FuncionEstrucModel)this.jTableDatosFuncionEstruc.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			funcionestrucModel.funcionestrucs=this.funcionestrucLogic.getFuncionEstrucs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			funcionestrucModel.funcionestrucs=this.funcionestrucs;
		}
		
		
		((FuncionEstrucModel) this.jTableDatosFuncionEstruc.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFuncionEstruc() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfuncionestrucAnterior(),this.funcionestrucLogic.getFuncionEstrucs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfuncionestrucAnterior(),this.funcionestrucs);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFuncionEstruc();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFuncionEstruc(FuncionEstruc funcionestruc,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
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
										
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.funcionestruc,new Object(),generalEntityParameterGeneral,this.funcionestrucReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.funcionestrucSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FuncionEstrucConstantesFunciones.getClassesRelationshipsOfFuncionEstruc(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FuncionEstrucConstantesFunciones.getClassesRelationshipsFromStringsOfFuncionEstruc(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFuncionEstruc(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FuncionEstrucBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.funcionestruc,new Object(),generalEntityParameterGeneral,this.funcionestrucReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFuncionEstruc(FuncionEstrucBean funcionestrucBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFuncionEstruc(ArrayList<Classe> classes,FuncionEstrucReturnGeneral funcionestrucReturnGeneral,FuncionEstrucBean funcionestrucBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFuncionEstruc(FuncionEstruc funcionestruc,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.funcionestruc)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFuncionEstruc = new FuncionEstrucDetalleFormJInternalFrame(jDesktopPane,this.funcionestrucSessionBean.getConGuardarRelaciones(),this.funcionestrucSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.setVisible(false);
		this.jInternalFrameDetalleFormFuncionEstruc.setSelected(false);						
		
		this.jInternalFrameDetalleFormFuncionEstruc.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFuncionEstruc.funcionestrucLogic=this.funcionestrucLogic;
		
		this.cargarCombosFrameForeignKeyFuncionEstruc("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFuncionEstruc();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFuncionEstruc();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFuncionEstruc("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFuncionEstruc();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFuncionEstruc.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFuncionEstruc"));
		
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonModificarFuncionEstruc.addActionListener(new ButtonActionListener(this,"ModificarFuncionEstruc"));

		
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonModificarToolBarFuncionEstruc.addActionListener(new ButtonActionListener(this,"ModificarToolBarFuncionEstruc"));
					
		this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemModificarFuncionEstruc.addActionListener(new ButtonActionListener(this,"MenuItemModificarFuncionEstruc"));		
		
		
		
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonActualizarFuncionEstruc.addActionListener (new ButtonActionListener(this,"ActualizarFuncionEstruc"));
		
		
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonActualizarToolBarFuncionEstruc.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFuncionEstruc"));
						
		this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemActualizarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFuncionEstruc"));		
		
		
		
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonEliminarFuncionEstruc.addActionListener (new ButtonActionListener(this,"EliminarFuncionEstruc"));
		
		
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonEliminarToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"EliminarToolBarFuncionEstruc"));
								
		this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemEliminarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFuncionEstruc"));		
		
		
		
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonCancelarFuncionEstruc.addActionListener (new ButtonActionListener(this,"CancelarFuncionEstruc"));
		
		
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonCancelarToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"CancelarToolBarFuncionEstruc"));
					
		this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemCancelarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFuncionEstruc"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemDetalleCerrarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFuncionEstruc"));		
		
		
		
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFuncionEstruc"));
		
		
		
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFuncionEstruc"));
		
		
		
		this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFuncionEstruc"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonidFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"idFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_empresaFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_empresaFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_sucursalFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_sucursalFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_estructuraFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_estructuraFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_funcionFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_funcionFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_funcionFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_funcionFuncionEstrucBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonnombreFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"nombreFuncionEstrucBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtondescripcionFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"descripcionFuncionEstrucBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFuncionEstruc.jTabbedPaneRelacionesFuncionEstruc.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFuncionEstruc"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFuncionEstruc"));
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFuncionEstruc"));
		}
		
		this.jTableDatosFuncionEstruc.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFuncionEstruc"));
		
		this.jTableDatosFuncionEstruc.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFuncionEstruc"));
		
		this.jButtonNuevoFuncionEstruc.addActionListener(new ButtonActionListener(this,"NuevoFuncionEstruc"));
		
		this.jButtonDuplicarFuncionEstruc.addActionListener(new ButtonActionListener(this,"DuplicarFuncionEstruc"));
		
		this.jButtonCopiarFuncionEstruc.addActionListener(new ButtonActionListener(this,"CopiarFuncionEstruc"));
		
		this.jButtonVerFormFuncionEstruc.addActionListener(new ButtonActionListener(this,"VerFormFuncionEstruc"));
		
		
		this.jButtonNuevoToolBarFuncionEstruc.addActionListener(new ButtonActionListener(this,"NuevoToolBarFuncionEstruc"));
			
		this.jButtonDuplicarToolBarFuncionEstruc.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFuncionEstruc"));
			
		this.jMenuItemNuevoFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFuncionEstruc"));
			
		this.jMenuItemDuplicarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFuncionEstruc"));		
		
		
		this.jButtonNuevoRelacionesFuncionEstruc.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFuncionEstruc"));
		
		
		this.jButtonNuevoRelacionesToolBarFuncionEstruc.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFuncionEstruc"));
			
		this.jMenuItemNuevoRelacionesFuncionEstruc.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFuncionEstruc"));		
		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonModificarFuncionEstruc.addActionListener(new ButtonActionListener(this,"ModificarFuncionEstruc"));
		}
		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonModificarToolBarFuncionEstruc.addActionListener(new ButtonActionListener(this,"ModificarToolBarFuncionEstruc"));
			
			this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemModificarFuncionEstruc.addActionListener(new ButtonActionListener(this,"MenuItemModificarFuncionEstruc"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonActualizarFuncionEstruc.addActionListener (new ButtonActionListener(this,"ActualizarFuncionEstruc"));
		}
		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonActualizarToolBarFuncionEstruc.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFuncionEstruc"));
				
			this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemActualizarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFuncionEstruc"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonEliminarFuncionEstruc.addActionListener (new ButtonActionListener(this,"EliminarFuncionEstruc"));
		}
		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonEliminarToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"EliminarToolBarFuncionEstruc"));
						
			this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemEliminarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFuncionEstruc"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonCancelarFuncionEstruc.addActionListener (new ButtonActionListener(this,"CancelarFuncionEstruc"));
		}
		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonCancelarToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"CancelarToolBarFuncionEstruc"));
			
			this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemCancelarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFuncionEstruc"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFuncionEstruc"));		
		
		
		this.jButtonCerrarFuncionEstruc.addActionListener (new ButtonActionListener(this,"CerrarFuncionEstruc"));
		
		
		this.jButtonCerrarToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"CerrarToolBarFuncionEstruc"));
			
		this.jMenuItemCerrarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFuncionEstruc"));
			
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jMenuItemDetalleCerrarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFuncionEstruc"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosFuncionEstruc.addActionListener (new ButtonActionListener(this,"GuardarCambiosFuncionEstruc"));
		}
		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFuncionEstruc"));
		}
		
		this.jButtonCopiarToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"CopiarToolBarFuncionEstruc"));
			
		this.jButtonVerFormToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"VerFormToolBarFuncionEstruc"));
		
		this.jMenuItemGuardarCambiosFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFuncionEstruc"));
			
		this.jMenuItemCopiarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFuncionEstruc"));		
		
		this.jMenuItemVerFormFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFuncionEstruc"));		
		
		
		this.jButtonGuardarCambiosTablaFuncionEstruc.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFuncionEstruc"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFuncionEstruc"));
			
		this.jMenuItemGuardarCambiosTablaFuncionEstruc.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFuncionEstruc"));		
		
		
		
		this.jButtonRecargarInformacionFuncionEstruc.addActionListener (new ButtonActionListener(this,"RecargarInformacionFuncionEstruc"));
					
		this.jButtonRecargarInformacionToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFuncionEstruc"));
		
		this.jMenuItemRecargarInformacionFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFuncionEstruc"));		
		
		
		
		this.jButtonAnterioresFuncionEstruc.addActionListener (new ButtonActionListener(this,"AnterioresFuncionEstruc"));
		
		
		this.jButtonAnterioresToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFuncionEstruc"));
		
		this.jMenuItemAnterioresFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFuncionEstruc"));		
		
		
		this.jButtonSiguientesFuncionEstruc.addActionListener (new ButtonActionListener(this,"SiguientesFuncionEstruc"));
		
		
		this.jButtonSiguientesToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFuncionEstruc"));
			
		this.jMenuItemSiguientesFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFuncionEstruc"));
			
		this.jMenuItemAbrirOrderByFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFuncionEstruc"));
			
		this.jMenuItemMostrarOcultarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFuncionEstruc"));
			
		this.jMenuItemDetalleAbrirOrderByFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFuncionEstruc"));
			
		this.jMenuItemDetalleMostarOcultarFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFuncionEstruc"));		
		
		
		this.jButtonNuevoGuardarCambiosFuncionEstruc.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFuncionEstruc"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFuncionEstruc"));
			
		this.jMenuItemNuevoGuardarCambiosFuncionEstruc.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFuncionEstruc"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFuncionEstruc.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFuncionEstruc"));

		this.jCheckBoxSeleccionadosFuncionEstruc.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFuncionEstruc"));
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFuncionEstruc"));
		}
		
		
		this.jComboBoxTiposRelacionesFuncionEstruc.addActionListener (new ButtonActionListener(this,"TiposRelacionesFuncionEstruc"));
			
		this.jComboBoxTiposAccionesFuncionEstruc.addActionListener (new ButtonActionListener(this,"TiposAccionesFuncionEstruc"));
					
		this.jComboBoxTiposSeleccionarFuncionEstruc.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFuncionEstruc"));
			
		this.jTextFieldValorCampoGeneralFuncionEstruc.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFuncionEstruc"));		
		
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonidFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"idFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_empresaFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_empresaFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_sucursalFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_sucursalFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_estructuraFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_estructuraFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_funcionFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_funcionFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_funcionFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_funcionFuncionEstrucBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonnombreFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"nombreFuncionEstrucBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtondescripcionFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"descripcionFuncionEstrucBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEstructuraFuncionEstruc.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraFuncionEstruc"));

			this.jButtonFK_IdFuncionFuncionEstruc.addActionListener(new ButtonActionListener(this,"FK_IdFuncionFuncionEstruc"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFuncionEstruc!=null) {
				this.jInternalFrameReporteDinamicoFuncionEstruc.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFuncionEstruc"));
				this.jInternalFrameReporteDinamicoFuncionEstruc.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFuncionEstruc"));
				this.jInternalFrameReporteDinamicoFuncionEstruc.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFuncionEstruc"));
			}
			
			//this.jButtonCerrarReporteDinamicoFuncionEstruc.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFuncionEstruc"));				
			//this.jButtonGenerarReporteDinamicoFuncionEstruc.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFuncionEstruc"));
			//this.jButtonGenerarExcelReporteDinamicoFuncionEstruc.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFuncionEstruc"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFuncionEstruc!=null) {
				this.jInternalFrameImportacionFuncionEstruc.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFuncionEstruc"));
				this.jInternalFrameImportacionFuncionEstruc.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFuncionEstruc"));
				this.jInternalFrameImportacionFuncionEstruc.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFuncionEstruc"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFuncionEstruc.addActionListener (new ButtonActionListener(this,"AbrirOrderByFuncionEstruc"));
			
			this.jButtonAbrirOrderByToolBarFuncionEstruc.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFuncionEstruc"));			
			
			if(this.jInternalFrameOrderByFuncionEstruc!=null) {
				this.jInternalFrameOrderByFuncionEstruc.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFuncionEstruc"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncionEstruc.jTabbedPaneRelacionesFuncionEstruc.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFuncionEstruc"));
		
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
            		closingInternalFrameFuncionEstruc();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFuncionEstruc.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFuncionEstruc = (JInternalFrameBase)event.getSource();
	            	
	            FuncionEstrucBeanSwingJInternalFrame jInternalFrameParent=(FuncionEstrucBeanSwingJInternalFrame)jInternalFrameDetalleFormFuncionEstruc.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFuncionEstrucActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFuncionEstruc.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFuncionEstrucListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFuncionEstruc.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFuncionEstruc.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionEstrucActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionEstrucActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionEstrucActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFuncionEstruc";
		inputMap = this.jButtonNuevoFuncionEstruc.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFuncionEstruc.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFuncionEstrucActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionEstrucActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionEstrucActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionEstrucActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFuncionEstruc";
		inputMap = this.jButtonNuevoRelacionesFuncionEstruc.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFuncionEstruc.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFuncionEstrucActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFuncionEstruc";
		inputMap = this.jButtonModificarFuncionEstruc.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFuncionEstruc.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFuncionEstrucActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFuncionEstruc";
		inputMap = this.jButtonActualizarFuncionEstruc.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFuncionEstruc.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFuncionEstrucActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFuncionEstruc";
		inputMap = this.jButtonEliminarFuncionEstruc.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFuncionEstruc.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFuncionEstrucActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFuncionEstruc";
		inputMap = this.jButtonCancelarFuncionEstruc.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFuncionEstruc.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFuncionEstrucActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFuncionEstruc";
		inputMap = this.jButtonCerrarFuncionEstruc.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFuncionEstruc.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFuncionEstrucActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFuncionEstruc";
		inputMap = this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosFuncionEstruc.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonGuardarCambiosFuncionEstruc.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFuncionEstrucActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFuncionEstruc.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFuncionEstrucItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFuncionEstruc.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFuncionEstrucActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFuncionEstruc.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFuncionEstrucActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFuncionEstruc.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFuncionEstrucActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonidFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"idFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_empresaFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_empresaFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_sucursalFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_sucursalFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_estructuraFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_estructuraFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraFuncionEstrucBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_funcionFuncionEstrucUpdate.addActionListener(new ButtonActionListener(this,"id_funcionFuncionEstrucUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonid_funcionFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"id_funcionFuncionEstrucBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtonnombreFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"nombreFuncionEstrucBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncionEstruc.jButtondescripcionFuncionEstrucBusqueda.addActionListener(new ButtonActionListener(this,"descripcionFuncionEstrucBusqueda"));
		
		
		this.jButtonFK_IdEstructuraFuncionEstruc.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraFuncionEstruc"));

		this.jButtonFK_IdFuncionFuncionEstruc.addActionListener(new ButtonActionListener(this,"FK_IdFuncionFuncionEstruc"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFuncionEstruc.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFuncionEstrucActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFuncionEstrucActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFuncionEstruc.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFuncionEstruc(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FuncionEstruc funcionestrucAux:this.funcionestrucLogic.getFuncionEstrucs()) {
					funcionestrucAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FuncionEstruc funcionestrucAux:funcionestrucs) {
					funcionestrucAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFuncionEstrucItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFuncionEstruc(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FuncionEstruc funcionestrucAux:this.funcionestrucLogic.getFuncionEstrucs()) {
						funcionestrucAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FuncionEstruc funcionestrucAux:funcionestrucs) {
						funcionestrucAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FuncionEstruc funcionestrucAux:this.funcionestrucLogic.getFuncionEstrucs()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FuncionEstruc funcionestrucAux:funcionestrucs) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFuncionEstruc(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFuncionEstruc.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFuncionEstruc.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFuncionEstrucItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFuncionEstruc(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFuncionEstruc.getSelectedRows();
			
			FuncionEstruc funcionestrucLocal=new FuncionEstruc();
			
			//this.seleccionarTodosFuncionEstruc(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					funcionestrucLocal =(FuncionEstruc) this.funcionestrucLogic.getFuncionEstrucs().toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					funcionestrucLocal =(FuncionEstruc) this.funcionestrucs.toArray()[this.jTableDatosFuncionEstruc.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				funcionestrucLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FuncionEstruc funcionestrucAux:this.funcionestrucLogic.getFuncionEstrucs()) {
						funcionestrucAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FuncionEstruc funcionestrucAux:funcionestrucs) {
						funcionestrucAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFuncionEstruc(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFuncionEstruc.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFuncionEstruc.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFuncionEstruc,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFuncionEstrucItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFuncionEstrucParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFuncionEstrucActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFuncionEstruc(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFuncionEstruc.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FuncionEstruc funcionestrucAux:this.funcionestrucLogic.getFuncionEstrucs()) {
				
						if(sTipoSeleccionar.equals(FuncionEstrucConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							funcionestrucAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							funcionestrucAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FuncionEstruc funcionestrucAux:funcionestrucs) {
					
						if(sTipoSeleccionar.equals(FuncionEstrucConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							funcionestrucAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							funcionestrucAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFuncionEstruc(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFuncionEstrucActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFuncionEstruc(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFuncionEstruc=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFuncionEstruc.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFuncionEstruc) {				
					conSplash=true;//false;										
					
					//this.startProcessFuncionEstruc(conSplash);
				
					this.generarReporteFuncionEstrucsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFuncionEstruc.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFuncionEstrucsSeleccionados();
				//this.jComboBoxTiposAccionesFuncionEstruc.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFuncionEstrucsSeleccionados(false);
				//this.jComboBoxTiposAccionesFuncionEstruc.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFuncionEstrucsSeleccionados(true);
				//this.jComboBoxTiposAccionesFuncionEstruc.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFuncionEstruc();
				
				this.exportarFuncionEstrucsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFuncionEstruc.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFuncionEstrucs();
				//this.importarFuncionEstrucs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFuncionEstruc.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFuncionEstruc();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFuncionEstrucsSeleccionados();
				//this.jComboBoxTiposAccionesFuncionEstruc.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Funcion Estruc", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFuncionEstruc();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFuncionEstruc)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFuncionEstruc(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Funcion Estruc",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFuncionEstruc.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.setSelectedIndex(0);					
				}	
			} 			
			else if(FuncionEstrucBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFuncionEstruc) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFuncionEstruc(conSplash);
					
						//this.actualizarParametrosGeneralFuncionEstruc();
						
						this.generarReporteProcesoAccionFuncionEstrucsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFuncionEstruc.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FuncionEstrucBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Funcion EstrucES SELECCIONADOS?", "MANTENIMIENTO DE Funcion Estruc", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFuncionEstruc();
				
						this.actualizarParametrosGeneralFuncionEstruc();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.funcionestrucReturnGeneral=funcionestrucLogic.procesarAccionFuncionEstrucsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.funcionestrucLogic.getFuncionEstrucs(),this.funcionestrucParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFuncionEstrucReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFuncionEstruc.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFuncionEstruc();
					
					FuncionEstrucBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFuncionEstrucReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFuncionEstruc.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxTiposAccionesFormularioFuncionEstruc.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFuncionEstruc(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFuncionEstrucActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFuncionEstruc();
			
			if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();		
			FuncionEstruc funcionestruc=new FuncionEstruc();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFuncionEstruc(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFuncionEstruc.getSelectedItem();
			
			
			
			
			funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(true);
			//this.sTipoAccion;
			
			if(funcionestrucsSeleccionados.size()==1) {
				for(FuncionEstruc funcionestrucAux:funcionestrucsSeleccionados) {
					funcionestruc=funcionestrucAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFuncionEstruc();
			
      		//this.finishProcessFuncionEstruc(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFuncionEstrucReturnGeneral() throws Exception {
		if(this.funcionestrucReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.funcionestrucReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.funcionestrucReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.funcionestrucReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.funcionestrucReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.funcionestrucReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFuncionEstruc(false);
		}
		
		if(this.funcionestrucReturnGeneral.getConRetornoLista() || this.funcionestrucReturnGeneral.getConRetornoObjeto()) {
			if(this.funcionestrucReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.funcionestrucLogic.setFuncionEstrucs(this.funcionestrucReturnGeneral.getFuncionEstrucs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.funcionestrucReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.funcionestrucLogic.setFuncionEstruc(this.funcionestrucReturnGeneral.getFuncionEstruc());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFuncionEstruc(false);
		}
	}
	
	public void actualizarParametrosGeneralFuncionEstruc() throws Exception {
		
		
	}
	
	public ArrayList<FuncionEstruc> getFuncionEstrucsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFuncionEstruc) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FuncionEstruc funcionestrucAux:funcionestrucLogic.getFuncionEstrucs()) {
					if(funcionestrucAux.getIsSelected()) {
						funcionestrucsSeleccionados.add(funcionestrucAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FuncionEstruc funcionestrucAux:this.funcionestrucs) {
					if(funcionestrucAux.getIsSelected()) {
						funcionestrucsSeleccionados.add(funcionestrucAux);				
					}
				}
			}
			
			if(funcionestrucsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						funcionestrucsSeleccionados.addAll(this.funcionestrucLogic.getFuncionEstrucs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						funcionestrucsSeleccionados.addAll(this.funcionestrucs);				
					}
				}
			}
		} else {
			funcionestrucsSeleccionados.add(this.funcionestruc);
		}
		
		return funcionestrucsSeleccionados;
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
	
	public void generarReporteFuncionEstrucsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFuncionEstrucsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFuncionEstrucsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFuncionEstrucsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFuncionEstrucsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Funcion Estruc",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFuncionEstrucsSeleccionados() throws Exception {
		ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();		
		
		funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFuncionEstrucs("Todos",funcionestrucsSeleccionados);
		
	}	
	
	public void generarReporteNormalFuncionEstrucsSeleccionados() throws Exception {
		ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();		
		
		funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFuncionEstrucs("Todos",funcionestrucsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFuncionEstrucsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();
		
		funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFuncionEstrucs("Todos",funcionestrucsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFuncionEstrucsSeleccionados() throws Exception {
		ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFuncionEstruc();
		
		
		funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFuncionEstruc();
		
		
		//this.generarReporteFuncionEstrucs("Todos",funcionestrucsSeleccionados ,funcionestrucImplementable,funcionestrucImplementableHome);
	}
	
	public void mostrarImportacionFuncionEstrucs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFuncionEstruc();
		
		this.abrirFrameImportacionFuncionEstruc();		
		
			
		//this.generarReporteFuncionEstrucs("Todos",funcionestrucsSeleccionados ,funcionestrucImplementable,funcionestrucImplementableHome);
	}
	
	public void importarFuncionEstrucs() throws Exception {		
	
	}
	
	public void exportarFuncionEstrucsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFuncionEstrucsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFuncionEstrucsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFuncionEstrucsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Funcion Estruc",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFuncionEstrucsSeleccionados() throws Exception {
		ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();		
		
		funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcionestruc."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFuncionEstruc(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FuncionEstruc funcionestrucAux:funcionestrucsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFuncionEstruc(funcionestrucAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//funcionestrucAux.setsDetalleGeneralEntityReporte(funcionestrucAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion Estruc",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFuncionEstruc(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FuncionEstrucConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FuncionEstrucConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FuncionEstrucConstantesFunciones.LABEL_IDFUNCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FuncionEstrucConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFuncionEstruc(FuncionEstruc funcionestruc,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=funcionestruc.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=funcionestruc.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=funcionestruc.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=funcionestruc.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=funcionestruc.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=funcionestruc.getfuncion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=funcionestruc.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=funcionestruc.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFuncionEstrucsSeleccionados() throws Exception {
		ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();		
		
		funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcionestruc.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FuncionEstrucs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFuncionEstruc(row);				
				iRow++;
			}				
			
			for(FuncionEstruc funcionestrucAux:funcionestrucsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFuncionEstruc(funcionestrucAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion Estruc",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFuncionEstrucsSeleccionados() throws Exception {
		ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();		
		
		funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcionestruc.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("funcionestrucs");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("funcionestruc");
			//elementRoot.appendChild(element);
		
			for(FuncionEstruc funcionestrucAux:funcionestrucsSeleccionados) {
				element = document.createElement("funcionestruc");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFuncionEstruc(funcionestrucAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion Estruc",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFuncionEstruc(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_IDFUNCION);
		cell = row.createCell(iColumn++);cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFuncionEstruc(FuncionEstruc funcionestruc,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(funcionestruc.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(funcionestruc.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(funcionestruc.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(funcionestruc.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(funcionestruc.getfuncion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(funcionestruc.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(funcionestruc.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlFuncionEstruc(FuncionEstruc funcionestruc,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FuncionEstrucConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(funcionestruc.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FuncionEstrucConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(funcionestruc.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FuncionEstrucConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(funcionestruc.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(FuncionEstrucConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(funcionestruc.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementestructura_descripcion = document.createElement(FuncionEstrucConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(funcionestruc.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementfuncion_descripcion = document.createElement(FuncionEstrucConstantesFunciones.IDFUNCION);
		elementfuncion_descripcion.appendChild(document.createTextNode(funcionestruc.getfuncion_descripcion()));
		element.appendChild(elementfuncion_descripcion);

		Element elementnombre = document.createElement(FuncionEstrucConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(funcionestruc.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(FuncionEstrucConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(funcionestruc.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoFuncionEstrucsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FuncionEstruc> funcionestrucsSeleccionados=new ArrayList<FuncionEstruc>();
		
		funcionestrucsSeleccionados=this.getFuncionEstrucsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFuncionEstruc(funcionestrucsSeleccionados);
		
		this.generarReporteFuncionEstrucs("Todos",funcionestrucsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFuncionEstruc(ArrayList<FuncionEstruc> funcionestrucsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FuncionEstruc funcionestrucAux:funcionestrucsSeleccionados) {
				funcionestrucAux.setsDetalleGeneralEntityReporte(funcionestrucAux.toString());
			
				if(sTipoSeleccionar.equals(FuncionEstrucConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					funcionestrucAux.setsDescripcionGeneralEntityReporte1(funcionestrucAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FuncionEstrucConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					funcionestrucAux.setsDescripcionGeneralEntityReporte1(funcionestrucAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FuncionEstrucConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					funcionestrucAux.setsDescripcionGeneralEntityReporte1(funcionestrucAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FuncionEstrucConstantesFunciones.LABEL_IDFUNCION)) {
					existe=true;
					funcionestrucAux.setsDescripcionGeneralEntityReporte1(funcionestrucAux.getfuncion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FuncionEstrucConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					funcionestrucAux.setsDescripcionGeneralEntityReporte1(funcionestrucAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(FuncionEstrucConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					funcionestrucAux.setsDescripcionGeneralEntityReporte1(funcionestrucAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionEstrucConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFuncionEstruc(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFuncionEstruc=true;
				this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=true;
				this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=true;
			}
			
			this.isVisibilidadCeldaModificarFuncionEstruc=false;
			this.isVisibilidadCeldaActualizarFuncionEstruc=false;
			this.isVisibilidadCeldaEliminarFuncionEstruc=false;
			this.isVisibilidadCeldaCancelarFuncionEstruc=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncionEstruc=true;
				} else {
					this.isVisibilidadCeldaGuardarFuncionEstruc=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFuncionEstruc=false;
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=false;
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=false;
			this.isVisibilidadCeldaModificarFuncionEstruc=false;
			this.isVisibilidadCeldaActualizarFuncionEstruc=true;
			this.isVisibilidadCeldaEliminarFuncionEstruc=false;
			this.isVisibilidadCeldaCancelarFuncionEstruc=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncionEstruc=true;
				} else {
					this.isVisibilidadCeldaGuardarFuncionEstruc=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFuncionEstruc=false;
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=false;
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=false;
			this.isVisibilidadCeldaModificarFuncionEstruc=false;
			this.isVisibilidadCeldaActualizarFuncionEstruc=true;
			this.isVisibilidadCeldaEliminarFuncionEstruc=true;
			this.isVisibilidadCeldaCancelarFuncionEstruc=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncionEstruc=true;
				} else {
					this.isVisibilidadCeldaGuardarFuncionEstruc=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFuncionEstruc=false;
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=false;
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=false;
			this.isVisibilidadCeldaModificarFuncionEstruc=false;
			this.isVisibilidadCeldaActualizarFuncionEstruc=true;
			this.isVisibilidadCeldaEliminarFuncionEstruc=false;
			this.isVisibilidadCeldaCancelarFuncionEstruc=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncionEstruc=false;
				} else {
					this.isVisibilidadCeldaGuardarFuncionEstruc=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFuncionEstruc=true;
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=true;
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=true;
			this.isVisibilidadCeldaModificarFuncionEstruc=false;
			this.isVisibilidadCeldaActualizarFuncionEstruc=false;
			this.isVisibilidadCeldaEliminarFuncionEstruc=false;
			this.isVisibilidadCeldaCancelarFuncionEstruc=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncionEstruc=true;
				} else {
					this.isVisibilidadCeldaGuardarFuncionEstruc=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFuncionEstruc=false;
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=false;
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=false;
			this.isVisibilidadCeldaActualizarFuncionEstruc=false;
			this.isVisibilidadCeldaEliminarFuncionEstruc=false;
			this.isVisibilidadCeldaCancelarFuncionEstruc=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncionEstruc=false;
				} else {
					this.isVisibilidadCeldaGuardarFuncionEstruc=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFuncionEstruc=false;
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=false;
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=false;
			this.isVisibilidadCeldaModificarFuncionEstruc=true;
			this.isVisibilidadCeldaActualizarFuncionEstruc=false;
			this.isVisibilidadCeldaEliminarFuncionEstruc=false;
			this.isVisibilidadCeldaCancelarFuncionEstruc=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncionEstruc=false;
				} else {
					this.isVisibilidadCeldaGuardarFuncionEstruc=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FuncionEstrucJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFuncionEstruc=true;
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=true;
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=true;
		} else {
			this.actualizarEstadoPanelsFuncionEstruc(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFuncionEstruc=false;
			//this.isVisibilidadCeldaVerFormFuncionEstruc=false;
			this.isVisibilidadCeldaDuplicarFuncionEstruc=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!funcionestrucSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=false;
		} else {
			this.isVisibilidadCeldaNuevoFuncionEstruc=false;
			this.isVisibilidadCeldaGuardarCambiosFuncionEstruc=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(funcionestrucSessionBean.getEsGuardarRelacionado()) {
			if(!funcionestrucSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=false;												
			}
			
			this.jButtonCerrarFuncionEstruc.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFuncionEstruc=false;
		}
		
		if(!this.permiteMantenimiento(this.funcionestruc)) {
			this.isVisibilidadCeldaActualizarFuncionEstruc=false;
			this.isVisibilidadCeldaEliminarFuncionEstruc=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFuncionEstruc() {
	}
	
	public void actualizarEstadoPanelsFuncionEstruc(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFuncionEstruc!=null) {
				this.jScrollPanelDatosEdicionFuncionEstruc.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncionEstruc!=null) {
				this.jTabbedPaneBusquedasFuncionEstruc.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFuncionEstruc!=null) {
				this.jScrollPanelDatosFuncionEstruc.setVisible(true);
			}
			
			if(this.jPanelPaginacionFuncionEstruc!=null) {
				this.jPanelPaginacionFuncionEstruc.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFuncionEstruc!=null) {
				this.jPanelParametrosReportesFuncionEstruc.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFuncionEstruc!=null) {
				this.jScrollPanelDatosEdicionFuncionEstruc.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncionEstruc!=null) {
				this.jTabbedPaneBusquedasFuncionEstruc.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFuncionEstruc!=null) {
				this.jScrollPanelDatosFuncionEstruc.setVisible(false);
			}
			
			if(this.jPanelPaginacionFuncionEstruc!=null) {
				this.jPanelPaginacionFuncionEstruc.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFuncionEstruc!=null) {
				this.jPanelParametrosReportesFuncionEstruc.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFuncionEstruc!=null) {
				this.jScrollPanelDatosEdicionFuncionEstruc.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncionEstruc!=null) {
				this.jTabbedPaneBusquedasFuncionEstruc.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFuncionEstruc!=null) {
				this.jScrollPanelDatosFuncionEstruc.setVisible(false);
			}
			
			if(this.jPanelPaginacionFuncionEstruc!=null) {
				this.jPanelPaginacionFuncionEstruc.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFuncionEstruc!=null) {
				this.jPanelParametrosReportesFuncionEstruc.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFuncionEstruc!=null) {
				this.jScrollPanelDatosEdicionFuncionEstruc.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncionEstruc!=null) {
				this.jTabbedPaneBusquedasFuncionEstruc.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFuncionEstruc!=null) {
				this.jScrollPanelDatosFuncionEstruc.setVisible(false);
			}
			
			if(this.jPanelPaginacionFuncionEstruc!=null) {
				this.jPanelPaginacionFuncionEstruc.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFuncionEstruc!=null) {
				this.jPanelParametrosReportesFuncionEstruc.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFuncionEstruc!=null) {
				this.jScrollPanelDatosEdicionFuncionEstruc.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncionEstruc!=null) {
				this.jTabbedPaneBusquedasFuncionEstruc.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFuncionEstruc!=null) {
				this.jScrollPanelDatosFuncionEstruc.setVisible(true);
			}
			
			if(this.jPanelPaginacionFuncionEstruc!=null) {
				this.jPanelPaginacionFuncionEstruc.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFuncionEstruc!=null) {
				this.jPanelParametrosReportesFuncionEstruc.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFuncionEstruc!=null) {
				this.jScrollPanelDatosEdicionFuncionEstruc.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncionEstruc!=null) {
				this.jTabbedPaneBusquedasFuncionEstruc.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFuncionEstruc!=null) {
				this.jScrollPanelDatosFuncionEstruc.setVisible(true);
			}
			
			if(this.jPanelPaginacionFuncionEstruc!=null) {
				this.jPanelPaginacionFuncionEstruc.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFuncionEstruc!=null) {
				this.jPanelParametrosReportesFuncionEstruc.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFuncionEstruc!=null) {
				this.jScrollPanelDatosEdicionFuncionEstruc.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncionEstruc!=null) {
				this.jTabbedPaneBusquedasFuncionEstruc.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFuncionEstruc!=null) {
				this.jScrollPanelDatosFuncionEstruc.setVisible(true);
			}
			
			if(this.jPanelPaginacionFuncionEstruc!=null) {
				this.jPanelPaginacionFuncionEstruc.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFuncionEstruc!=null) {
				this.jPanelParametrosReportesFuncionEstruc.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFuncionEstruc!=null) {
					this.jTabbedPaneBusquedasFuncionEstruc.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFuncionEstruc!=null) {
				this.jPanelParametrosReportesFuncionEstruc.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncionEstruc!=null) {
				this.jTabbedPaneBusquedasFuncionEstruc.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFuncionEstruc!=null) {
				this.jPanelParametrosReportesFuncionEstruc.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasFuncionEstruc.remove(jPanelFK_IdEstructuraFuncionEstruc);}

			this.isVisibilidadFK_IdFuncion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFuncion) {this.jTabbedPaneBusquedasFuncionEstruc.remove(jPanelFK_IdFuncionFuncionEstruc);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasFuncionEstruc.remove(jPanelFK_IdEstructuraFuncionEstruc);}

			this.isVisibilidadFK_IdFuncion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFuncion) {this.jTabbedPaneBusquedasFuncionEstruc.remove(jPanelFK_IdFuncionFuncionEstruc);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasFuncionEstruc.remove(jPanelFK_IdEstructuraFuncionEstruc);}

			this.isVisibilidadFK_IdFuncion=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdFuncion) {this.jTabbedPaneBusquedasFuncionEstruc.remove(jPanelFK_IdFuncionFuncionEstruc);}
		}
		
	}

	public void setVisibilidadBusquedasParaFuncion(Boolean isParaFuncion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFuncionNegation=!isParaFuncion;

			this.isVisibilidadFK_IdEstructura=isParaFuncionNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasFuncionEstruc.remove(jPanelFK_IdEstructuraFuncionEstruc);}

			this.isVisibilidadFK_IdFuncion=isParaFuncion;
			if(!this.isVisibilidadFK_IdFuncion) {this.jTabbedPaneBusquedasFuncionEstruc.remove(jPanelFK_IdFuncionFuncionEstruc);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FuncionEstrucSessionBean funcionestrucSessionBean=new FuncionEstrucSessionBean();
		
		if(this.funcionestrucSessionBean==null) {
			this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
		}
		
		this.funcionestrucSessionBean.setsUltimaBusquedaFuncionEstruc(this.getsAccionBusqueda());
		this.funcionestrucSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.funcionestrucSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			funcionestrucSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			funcionestrucSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFuncion")) {
			funcionestrucSessionBean.setid_funcion(this.getid_funcionFK_IdFuncion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			funcionestrucSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FuncionEstrucSessionBean funcionestrucSessionBean=new FuncionEstrucSessionBean();
		
		if(this.funcionestrucSessionBean==null) {
			this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
		}
		
		if(this.funcionestrucSessionBean.getsUltimaBusquedaFuncionEstruc()!=null&&!this.funcionestrucSessionBean.getsUltimaBusquedaFuncionEstruc().equals("")) {
			this.setsAccionBusqueda(funcionestrucSessionBean.getsUltimaBusquedaFuncionEstruc());
			this.setiNumeroPaginacion(funcionestrucSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(funcionestrucSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(funcionestrucSessionBean.getid_empresa());
				funcionestrucSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(funcionestrucSessionBean.getid_estructura());
				funcionestrucSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFuncion")) {
				this.setid_funcionFK_IdFuncion(funcionestrucSessionBean.getid_funcion());
				funcionestrucSessionBean.setid_funcion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(funcionestrucSessionBean.getid_sucursal());
				funcionestrucSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.funcionestrucSessionBean.setsUltimaBusquedaFuncionEstruc("");
		this.funcionestrucSessionBean.setiNumeroPaginacion(FuncionEstrucConstantesFunciones.INUMEROPAGINACION);
		this.funcionestrucSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFuncionEstruc(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFuncionEstruc() {
		this.updateBorderResaltarBusquedasFormularioFuncionEstruc();
		this.updateVisibilidadBusquedasFormularioFuncionEstruc();
		this.updateHabilitarBusquedasFormularioFuncionEstruc();
	}
	
	public void updateBorderResaltarBusquedasFormularioFuncionEstruc() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFuncionEstruc.getComponents().length>0) {
	

		if(this.funcionestrucConstantesFunciones.resaltarFK_IdEstructuraFuncionEstruc!=null) {
			index= this.jTabbedPaneBusquedasFuncionEstruc.indexOfComponent(this.jPanelFK_IdEstructuraFuncionEstruc);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFuncionEstruc.getComponent(index);
				jPanel.setBorder(this.funcionestrucConstantesFunciones.resaltarFK_IdEstructuraFuncionEstruc);
			}
		}

		if(this.funcionestrucConstantesFunciones.resaltarFK_IdFuncionFuncionEstruc!=null) {
			index= this.jTabbedPaneBusquedasFuncionEstruc.indexOfComponent(this.jPanelFK_IdFuncionFuncionEstruc);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFuncionEstruc.getComponent(index);
				jPanel.setBorder(this.funcionestrucConstantesFunciones.resaltarFK_IdFuncionFuncionEstruc);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFuncionEstruc() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFuncionEstruc.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFuncionEstruc.indexOfComponent(this.jPanelFK_IdEstructuraFuncionEstruc);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFuncionEstruc.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.funcionestrucConstantesFunciones.mostrarFK_IdEstructuraFuncionEstruc);
			if(!this.funcionestrucConstantesFunciones.mostrarFK_IdEstructuraFuncionEstruc && index>-1) {
				this.jTabbedPaneBusquedasFuncionEstruc.remove(index);
			}

			index= this.jTabbedPaneBusquedasFuncionEstruc.indexOfComponent(this.jPanelFK_IdFuncionFuncionEstruc);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFuncionEstruc.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.funcionestrucConstantesFunciones.mostrarFK_IdFuncionFuncionEstruc);
			if(!this.funcionestrucConstantesFunciones.mostrarFK_IdFuncionFuncionEstruc && index>-1) {
				this.jTabbedPaneBusquedasFuncionEstruc.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFuncionEstruc() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFuncionEstruc.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFuncionEstruc.indexOfComponent(this.jPanelFK_IdEstructuraFuncionEstruc);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFuncionEstruc.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.funcionestrucConstantesFunciones.activarFK_IdEstructuraFuncionEstruc);
				this.jTabbedPaneBusquedasFuncionEstruc.setEnabledAt(index,this.funcionestrucConstantesFunciones.activarFK_IdEstructuraFuncionEstruc);
			}

			index= this.jTabbedPaneBusquedasFuncionEstruc.indexOfComponent(this.jPanelFK_IdFuncionFuncionEstruc);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFuncionEstruc.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.funcionestrucConstantesFunciones.activarFK_IdFuncionFuncionEstruc);
				this.jTabbedPaneBusquedasFuncionEstruc.setEnabledAt(index,this.funcionestrucConstantesFunciones.activarFK_IdFuncionFuncionEstruc);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFuncionEstruc(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasFuncionEstruc.indexOfComponent(this.jPanelFK_IdEstructuraFuncionEstruc);

			this.jTabbedPaneBusquedasFuncionEstruc.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFuncionEstruc.getComponent(index);

			this.funcionestrucConstantesFunciones.setResaltarFK_IdEstructuraFuncionEstruc(resaltar);

			jPanel.setBorder(this.funcionestrucConstantesFunciones.resaltarFK_IdEstructuraFuncionEstruc);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFuncion")) {
			index= this.jTabbedPaneBusquedasFuncionEstruc.indexOfComponent(this.jPanelFK_IdFuncionFuncionEstruc);

			this.jTabbedPaneBusquedasFuncionEstruc.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFuncionEstruc.getComponent(index);

			this.funcionestrucConstantesFunciones.setResaltarFK_IdFuncionFuncionEstruc(resaltar);

			jPanel.setBorder(this.funcionestrucConstantesFunciones.resaltarFK_IdFuncionFuncionEstruc);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFuncionEstruc.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFuncionEstruc() throws Exception {

		if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFuncionEstruc();
		this.updateVisibilidadResaltarControlesFormularioFuncionEstruc();
		this.updateHabilitarResaltarControlesFormularioFuncionEstruc();
		
	}
	
	public void updateBorderResaltarControlesFormularioFuncionEstruc() throws Exception {
		if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.funcionestrucConstantesFunciones.resaltaridFuncionEstruc!=null && this.jInternalFrameDetalleFormFuncionEstruc!=null) {this.jInternalFrameDetalleFormFuncionEstruc.jLabelidFuncionEstruc.setBorder(this.funcionestrucConstantesFunciones.resaltaridFuncionEstruc);}
		if(this.funcionestrucConstantesFunciones.resaltarid_empresaFuncionEstruc!=null && this.jInternalFrameDetalleFormFuncionEstruc!=null) {this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.setBorder(this.funcionestrucConstantesFunciones.resaltarid_empresaFuncionEstruc);}
		if(this.funcionestrucConstantesFunciones.resaltarid_sucursalFuncionEstruc!=null && this.jInternalFrameDetalleFormFuncionEstruc!=null) {this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.setBorder(this.funcionestrucConstantesFunciones.resaltarid_sucursalFuncionEstruc);}
		if(this.funcionestrucConstantesFunciones.resaltarid_estructuraFuncionEstruc!=null && this.jInternalFrameDetalleFormFuncionEstruc!=null) {this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.setBorder(this.funcionestrucConstantesFunciones.resaltarid_estructuraFuncionEstruc);}
		if(this.funcionestrucConstantesFunciones.resaltarid_funcionFuncionEstruc!=null && this.jInternalFrameDetalleFormFuncionEstruc!=null) {this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.setBorder(this.funcionestrucConstantesFunciones.resaltarid_funcionFuncionEstruc);}
		if(this.funcionestrucConstantesFunciones.resaltarnombreFuncionEstruc!=null && this.jInternalFrameDetalleFormFuncionEstruc!=null) {this.jInternalFrameDetalleFormFuncionEstruc.jTextAreanombreFuncionEstruc.setBorder(this.funcionestrucConstantesFunciones.resaltarnombreFuncionEstruc);}
		if(this.funcionestrucConstantesFunciones.resaltardescripcionFuncionEstruc!=null && this.jInternalFrameDetalleFormFuncionEstruc!=null) {this.jInternalFrameDetalleFormFuncionEstruc.jTextAreadescripcionFuncionEstruc.setBorder(this.funcionestrucConstantesFunciones.resaltardescripcionFuncionEstruc);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFuncionEstruc() throws Exception {		
		if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
	
		//this.jInternalFrameDetalleFormFuncionEstruc.jLabelidFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostraridFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jPanelidFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostraridFuncionEstruc);
		//this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrarid_empresaFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jPanelid_empresaFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrarid_empresaFuncionEstruc);
		//this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrarid_sucursalFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jPanelid_sucursalFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrarid_sucursalFuncionEstruc);
		//this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrarid_estructuraFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jPanelid_estructuraFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrarid_estructuraFuncionEstruc);
		//this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrarid_funcionFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jPanelid_funcionFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrarid_funcionFuncionEstruc);
		//this.jInternalFrameDetalleFormFuncionEstruc.jTextAreanombreFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrarnombreFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jPanelnombreFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrarnombreFuncionEstruc);
		//this.jInternalFrameDetalleFormFuncionEstruc.jTextAreadescripcionFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrardescripcionFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jPaneldescripcionFuncionEstruc.setVisible(this.funcionestrucConstantesFunciones.mostrardescripcionFuncionEstruc);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFuncionEstruc() throws Exception {
		if(this.jInternalFrameDetalleFormFuncionEstruc==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFuncionEstruc!=null) {
	
		this.jInternalFrameDetalleFormFuncionEstruc.jLabelidFuncionEstruc.setEnabled(this.funcionestrucConstantesFunciones.activaridFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_empresaFuncionEstruc.setEnabled(this.funcionestrucConstantesFunciones.activarid_empresaFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_sucursalFuncionEstruc.setEnabled(this.funcionestrucConstantesFunciones.activarid_sucursalFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_estructuraFuncionEstruc.setEnabled(this.funcionestrucConstantesFunciones.activarid_estructuraFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jComboBoxid_funcionFuncionEstruc.setEnabled(this.funcionestrucConstantesFunciones.activarid_funcionFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jTextAreanombreFuncionEstruc.setEnabled(this.funcionestrucConstantesFunciones.activarnombreFuncionEstruc);
		this.jInternalFrameDetalleFormFuncionEstruc.jTextAreadescripcionFuncionEstruc.setEnabled(this.funcionestrucConstantesFunciones.activardescripcionFuncionEstruc);
		}
	}
	
		
}