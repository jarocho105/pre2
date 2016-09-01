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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.CuentaFlujoCajaConstantesFunciones;
import com.bydan.erp.contabilidad.util.CuentaFlujoCajaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.CuentaFlujoCajaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.CuentaFlujoCajaBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class CuentaFlujoCajaBeanSwingJInternalFrame extends CuentaFlujoCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CuentaFlujoCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CuentaFlujoCaja> cuentaflujocajaValidator = new ClassValidator<CuentaFlujoCaja>(CuentaFlujoCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CuentaFlujoCaja cuentaflujocaja;	
	public CuentaFlujoCaja cuentaflujocajaAux;
	public CuentaFlujoCaja cuentaflujocajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CuentaFlujoCaja cuentaflujocajaTotales;
	public Long idCuentaFlujoCajaActual;
	public Long iIdNuevoCuentaFlujoCaja=0L;
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

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

	public String sFinalQueryComboDia="";

	public List<Dia> diasForeignKey;

	public List<Dia> getdiasForeignKey() {
		return diasForeignKey;
	}

	public void setdiasForeignKey(List<Dia> diasForeignKey) {
		this.diasForeignKey = diasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Dia diaForeignKey;

	public Dia getdiaForeignKey() {
		return diaForeignKey;
	}

	public void setdiaForeignKey(Dia diaForeignKey) {
		this.diaForeignKey = diaForeignKey;
	}

	public String sFinalQueryComboCuentaContable="";

	public List<CuentaContable> cuentacontablesForeignKey;

	public List<CuentaContable> getcuentacontablesForeignKey() {
		return cuentacontablesForeignKey;
	}

	public void setcuentacontablesForeignKey(List<CuentaContable> cuentacontablesForeignKey) {
		this.cuentacontablesForeignKey = cuentacontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableForeignKey;

	public CuentaContable getcuentacontableForeignKey() {
		return cuentacontableForeignKey;
	}

	public void setcuentacontableForeignKey(CuentaContable cuentacontableForeignKey) {
		this.cuentacontableForeignKey = cuentacontableForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableActual=0L;

	public Long getidCuentaContableActual() {
		return idCuentaContableActual;
	}

	public void setidCuentaContableActual(Long idCuentaContableActual) {
		this.idCuentaContableActual= idCuentaContableActual;
	}
	
	

	public Boolean isTienePermisosDetalleCuentaFlujoCaja=false;

	public Boolean getIsTienePermisosDetalleCuentaFlujoCaja() {
		return isTienePermisosDetalleCuentaFlujoCaja;
	}

	public void setIsTienePermisosDetalleCuentaFlujoCaja(Boolean isTienePermisosDetalleCuentaFlujoCaja) {
		this.isTienePermisosDetalleCuentaFlujoCaja= isTienePermisosDetalleCuentaFlujoCaja;
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
	
	public Boolean isPermisoTodoCuentaFlujoCaja;
	public Boolean isPermisoNuevoCuentaFlujoCaja;
	public Boolean isPermisoActualizarCuentaFlujoCaja;
	public Boolean isPermisoActualizarOriginalCuentaFlujoCaja;
	public Boolean isPermisoEliminarCuentaFlujoCaja;
	public Boolean isPermisoGuardarCambiosCuentaFlujoCaja;
	public Boolean isPermisoConsultaCuentaFlujoCaja;
	public Boolean isPermisoBusquedaCuentaFlujoCaja;
	public Boolean isPermisoReporteCuentaFlujoCaja;
	public Boolean isPermisoPaginacionMedioCuentaFlujoCaja;
	public Boolean isPermisoPaginacionAltoCuentaFlujoCaja;
	public Boolean isPermisoPaginacionTodoCuentaFlujoCaja;
	public Boolean isPermisoCopiarCuentaFlujoCaja;
	public Boolean isPermisoVerFormCuentaFlujoCaja;
	public Boolean isPermisoDuplicarCuentaFlujoCaja;
	public Boolean isPermisoOrdenCuentaFlujoCaja;
	
	
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
	
	public CuentaFlujoCajaParameterReturnGeneral cuentaflujocajaReturnGeneral;
	public CuentaFlujoCajaParameterReturnGeneral cuentaflujocajaParameterGeneral;
	
	

	public DetalleCuentaFlujoCajaLogic detallecuentaflujocajaLogic=null;

	public DetalleCuentaFlujoCajaLogic getDetalleCuentaFlujoCajaLogic() {
		return detallecuentaflujocajaLogic;
	}

	public void setDetalleCuentaFlujoCajaLogic(DetalleCuentaFlujoCajaLogic detallecuentaflujocajaLogic) {
		this.detallecuentaflujocajaLogic = detallecuentaflujocajaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCuentaFlujoCaja=false;
	public Boolean esParaAccionDesdeFormularioCuentaFlujoCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CuentaFlujoCajaSessionBeanAdditional cuentaflujocajaSessionBeanAdditional=null;
	
	public CuentaFlujoCajaSessionBeanAdditional getCuentaFlujoCajaSessionBeanAdditional() {
		return this.cuentaflujocajaSessionBeanAdditional;
	}
	
	public void setCuentaFlujoCajaSessionBeanAdditional(CuentaFlujoCajaSessionBeanAdditional cuentaflujocajaSessionBeanAdditional) {
		try {
			this.cuentaflujocajaSessionBeanAdditional=cuentaflujocajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CuentaFlujoCajaBeanSwingJInternalFrameAdditional cuentaflujocajaBeanSwingJInternalFrameAdditional=null;
	//public class CuentaFlujoCajaBeanSwingJInternalFrame
	
	public CuentaFlujoCajaBeanSwingJInternalFrameAdditional getCuentaFlujoCajaBeanSwingJInternalFrameAdditional() {
		return this.cuentaflujocajaBeanSwingJInternalFrameAdditional;
	}
	
	public void setCuentaFlujoCajaBeanSwingJInternalFrameAdditional(CuentaFlujoCajaBeanSwingJInternalFrameAdditional cuentaflujocajaBeanSwingJInternalFrameAdditional) {
		try {
			this.cuentaflujocajaBeanSwingJInternalFrameAdditional=cuentaflujocajaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CuentaFlujoCajaLogic cuentaflujocajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CuentaFlujoCaja cuentaflujocajaBean;
	public CuentaFlujoCajaConstantesFunciones cuentaflujocajaConstantesFunciones;
	//public CuentaFlujoCajaParameterReturnGeneral cuentaflujocajaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public MesLogic mesLogic;
	public DiaLogic diaLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<CuentaFlujoCaja> cuentaflujocajas;	
	//public List<CuentaFlujoCaja> cuentaflujocajasEliminados;
	//public List<CuentaFlujoCaja> cuentaflujocajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaDuplicarCuentaFlujoCaja=true;
	public Boolean isVisibilidadCeldaCopiarCuentaFlujoCaja=true;
	public Boolean isVisibilidadCeldaVerFormCuentaFlujoCaja=true;
	public Boolean isVisibilidadCeldaOrdenCuentaFlujoCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaModificarCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaActualizarCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaEliminarCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaCancelarCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaGuardarCuentaFlujoCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdDia=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoCuentaFlujoCaja() {
		return this.iIdNuevoCuentaFlujoCaja;
	}

	public void setiIdNuevoCuentaFlujoCaja(Long iIdNuevoCuentaFlujoCaja) {
		this.iIdNuevoCuentaFlujoCaja = iIdNuevoCuentaFlujoCaja;
	}
	
	public Long getidCuentaFlujoCajaActual() {
		return this.idCuentaFlujoCajaActual;
	}

	public void setidCuentaFlujoCajaActual(Long idCuentaFlujoCajaActual) {
		this.idCuentaFlujoCajaActual = idCuentaFlujoCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CuentaFlujoCaja getcuentaflujocaja() {
		return this.cuentaflujocaja;
	}

	public void setcuentaflujocaja(CuentaFlujoCaja cuentaflujocaja) {
		this.cuentaflujocaja = cuentaflujocaja;
	}
	
	public CuentaFlujoCaja getcuentaflujocajaAux() {
		return this.cuentaflujocajaAux;
	}

	public void setcuentaflujocajaAux(CuentaFlujoCaja cuentaflujocajaAux) {
		this.cuentaflujocajaAux = cuentaflujocajaAux;
	}				
	
	public CuentaFlujoCaja getcuentaflujocajaAnterior() {
		return this.cuentaflujocajaAnterior;
	}

	public void setcuentaflujocajaAnterior(CuentaFlujoCaja cuentaflujocajaAnterior) {
		this.cuentaflujocajaAnterior = cuentaflujocajaAnterior;
	}	
	
	public CuentaFlujoCaja getcuentaflujocajaTotales() {
		return this.cuentaflujocajaTotales;
	}

	public void setcuentaflujocajaTotales(CuentaFlujoCaja cuentaflujocajaTotales) {
		this.cuentaflujocajaTotales = cuentaflujocajaTotales;
	}	
	
	public CuentaFlujoCaja getcuentaflujocajaBean() {
		return this.cuentaflujocajaBean;
	}

	public void setcuentaflujocajaBean(CuentaFlujoCaja cuentaflujocajaBean) {
		this.cuentaflujocajaBean = cuentaflujocajaBean;
	}	
	
	public CuentaFlujoCajaParameterReturnGeneral getcuentaflujocajaReturnGeneral() {
		return this.cuentaflujocajaReturnGeneral;
	}

	public void setcuentaflujocajaReturnGeneral(CuentaFlujoCajaParameterReturnGeneral cuentaflujocajaReturnGeneral) {
		this.cuentaflujocajaReturnGeneral = cuentaflujocajaReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_diaFK_IdDia=-1L;

	public Long getid_diaFK_IdDia() {
		return this.id_diaFK_IdDia;
	}

	public void setid_diaFK_IdDia(Long id_diaFK_IdDia) {
		this.id_diaFK_IdDia = id_diaFK_IdDia;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CuentaFlujoCajaLogic getCuentaFlujoCajaLogic()	{		
		return cuentaflujocajaLogic;
	}

	public void setCuentaFlujoCajaLogic(CuentaFlujoCajaLogic cuentaflujocajaLogic) {
		this.cuentaflujocajaLogic = cuentaflujocajaLogic;
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
	
	public Boolean getIsEsNuevoCuentaFlujoCaja() {
		return isEsNuevoCuentaFlujoCaja;
	}

	public void setIsEsNuevoCuentaFlujoCaja(Boolean isEsNuevoCuentaFlujoCaja) {
		this.isEsNuevoCuentaFlujoCaja = isEsNuevoCuentaFlujoCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioCuentaFlujoCaja() {
		return esParaAccionDesdeFormularioCuentaFlujoCaja;
	}
	
	public void setEsParaAccionDesdeFormularioCuentaFlujoCaja(Boolean esParaAccionDesdeFormularioCuentaFlujoCaja) {
		this.esParaAccionDesdeFormularioCuentaFlujoCaja = esParaAccionDesdeFormularioCuentaFlujoCaja;
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

			if(this.cuentaflujocajaSessionBean==null) {
				this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
			}

			if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cuentaflujocajaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.cuentaflujocajaSessionBean==null) {
				this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
			}

			if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(cuentaflujocajaSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

	public void cargarCombosDiasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.diasForeignKey=new ArrayList<Dia>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DiaLogic diaLogic=new DiaLogic();

			//diaLogic.getDiaDataAccess().setIsForForeingKeyData(true);

			if(this.cuentaflujocajaSessionBean==null) {
				this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
			}

			if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionDia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diaLogic.getDiaDataAccess().setIsForForeingKeyData(true);

					diaLogic.getTodosDiasWithConnection(sFinalQuery,new Pagination());

					this.diasForeignKey=diaLogic.getDias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDia(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					diaLogic.getEntityWithConnection(cuentaflujocajaSessionBean.getlidDiaActual());
					this.diasForeignKey.add(diaLogic.getDia());
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

	public void cargarCombosCuentaContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.cuentaflujocajaSessionBean==null) {
				this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
			}

			if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablesForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(cuentaflujocajaSessionBean.getlidCuentaContableActual());
					this.cuentacontablesForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.cuentaflujocaja!=null) {
						this.cuentaflujocaja.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
						this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCuentaFlujoCaja.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCuentaFlujoCajaGenerico)throws Exception
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
				jComboBoxid_empresaCuentaFlujoCajaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCuentaFlujoCajaGenerico!=null && jComboBoxid_empresaCuentaFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_empresaCuentaFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.cuentaflujocaja!=null) {
						this.cuentaflujocaja.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
						this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesCuentaFlujoCaja.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesCuentaFlujoCajaGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesCuentaFlujoCajaGenerico!=null && jComboBoxid_mesCuentaFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_mesCuentaFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDiaForeignKey(Long idDiaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Dia  diaTemp=null;

			for(Dia diaAux:diasForeignKey) {
				if(diaAux.getId()!=null && diaAux.getId().equals(idDiaSeleccionado)) {
					diaTemp=diaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(diaTemp!=null) {

					if(this.cuentaflujocaja!=null) {
						this.cuentaflujocaja.setDia(diaTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
						this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.setSelectedItem(diaTemp);
					}
				} else {
					//jComboBoxid_diaCuentaFlujoCaja.setSelectedItem(diaTemp);
					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.setSelectedIndex(0);
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

	public String getActualDiaForeignKeyDescripcion(Long idDiaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Dia  diaTemp=null;

			for(Dia diaAux:diasForeignKey) {
				if(diaAux.getId()!=null && diaAux.getId().equals(idDiaSeleccionado)) {
					diaTemp=diaAux;
					break;
				}
			}


			sDescripcion=DiaConstantesFunciones.getDiaDescripcion(diaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDiaForeignKeyGenerico(Long idDiaSeleccionado,JComboBox jComboBoxid_diaCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			Dia  diaTemp=null;

			for(Dia diaAux:diasForeignKey) {
				if(diaAux.getId()!=null && diaAux.getId().equals(idDiaSeleccionado)) {
					diaTemp=diaAux;
					break;
				}
			}

			if(diaTemp!=null) {
				jComboBoxid_diaCuentaFlujoCajaGenerico.setSelectedItem(diaTemp);
			} else {
				if(jComboBoxid_diaCuentaFlujoCajaGenerico!=null && jComboBoxid_diaCuentaFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_diaCuentaFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableForeignKey(Long idCuentaContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableTemp!=null) {

					if(this.cuentaflujocaja!=null) {
						this.cuentaflujocaja.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
						this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableCuentaFlujoCaja.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setSelectedIndex(0);
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

	public String getActualCuentaContableForeignKeyDescripcion(Long idCuentaContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(cuentacontableTemp!=null) {
				jComboBoxid_cuenta_contableCuentaFlujoCajaGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableCuentaFlujoCajaGenerico!=null && jComboBoxid_cuenta_contableCuentaFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableCuentaFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CuentaFlujoCaja cuentaflujocaja,JComboBox jComboBoxid_empresaCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCuentaFlujoCajaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCuentaFlujoCajaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cuentaflujocaja.setid_empresa(empresaAux.getId());
				cuentaflujocaja.setempresa_descripcion(CuentaFlujoCajaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cuentaflujocaja.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(CuentaFlujoCaja cuentaflujocaja,JComboBox jComboBoxid_mesCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesCuentaFlujoCajaGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesCuentaFlujoCajaGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				cuentaflujocaja.setid_mes(mesAux.getId());
				cuentaflujocaja.setmes_descripcion(CuentaFlujoCajaConstantesFunciones.getMesDescripcion(mesAux));
				cuentaflujocaja.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDiaForeignKey(CuentaFlujoCaja cuentaflujocaja,JComboBox jComboBoxid_diaCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			Dia  diaAux=new Dia();

			if(jComboBoxid_diaCuentaFlujoCajaGenerico==null) {
				diaAux=(Dia)this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.getSelectedItem();
			} else {
				diaAux=(Dia)jComboBoxid_diaCuentaFlujoCajaGenerico.getSelectedItem();
			}

			if(diaAux!=null && diaAux.getId()!=null) {
				cuentaflujocaja.setid_dia(diaAux.getId());
				cuentaflujocaja.setdia_descripcion(CuentaFlujoCajaConstantesFunciones.getDiaDescripcion(diaAux));
				cuentaflujocaja.setDia(diaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(CuentaFlujoCaja cuentaflujocaja,JComboBox jComboBoxid_cuenta_contableCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableCuentaFlujoCajaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableCuentaFlujoCajaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				cuentaflujocaja.setid_cuenta_contable(cuentacontableAux.getId());
				cuentaflujocaja.setcuentacontable_descripcion(CuentaFlujoCajaConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				cuentaflujocaja.setCuentaContable(cuentacontableAux);			}
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

					if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { 
					}

					if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { 
					}

					if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDiasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.removeAllItems();

							for(Dia dia:this.diasForeignKey) {
								this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.addItem(dia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { 
					}

					if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { 
					}

					if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.addItem(cuentacontable);
							}
						}

						if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDiaForeignKey(Dia dia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.setSelectedItem(dia);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCuentaFlujoCaja() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CuentaFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesCuentaFlujoCaja(this.cuentaflujocajaLogic.getCuentaFlujoCajas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CuentaFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesCuentaFlujoCaja(this.cuentaflujocajas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Mes.class));
		classes.add(new Classe(Dia.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cuentaflujocajaLogic.setCuentaFlujoCajas(this.cuentaflujocajas);
			cuentaflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CuentaFlujoCajaParameterReturnGeneral getCuentaFlujoCajaParameterGeneral() {
		return this.cuentaflujocajaParameterGeneral;
	}
	
	public void setCuentaFlujoCajaParameterGeneral(CuentaFlujoCajaParameterReturnGeneral cuentaflujocajaParameterGeneral) {
		this.cuentaflujocajaParameterGeneral = cuentaflujocajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCuentaFlujoCaja() {
		return isPermisoTodoCuentaFlujoCaja;
	}

	public void setIsPermisoTodoCuentaFlujoCaja(Boolean isPermisoTodoCuentaFlujoCaja) {
		this.isPermisoTodoCuentaFlujoCaja = isPermisoTodoCuentaFlujoCaja;
	}

	public Boolean getIsPermisoNuevoCuentaFlujoCaja() {
		return isPermisoNuevoCuentaFlujoCaja;
	}

	public void setIsPermisoNuevoCuentaFlujoCaja(Boolean isPermisoNuevoCuentaFlujoCaja) {
		this.isPermisoNuevoCuentaFlujoCaja = isPermisoNuevoCuentaFlujoCaja;
	}

	public Boolean getIsPermisoActualizarCuentaFlujoCaja() {
		return isPermisoActualizarCuentaFlujoCaja;
	}

	public void setIsPermisoActualizarCuentaFlujoCaja(Boolean isPermisoActualizarCuentaFlujoCaja) {
		this.isPermisoActualizarCuentaFlujoCaja = isPermisoActualizarCuentaFlujoCaja;
	}

	public Boolean getIsPermisoEliminarCuentaFlujoCaja() {
		return isPermisoEliminarCuentaFlujoCaja;
	}

	public void setIsPermisoEliminarCuentaFlujoCaja(Boolean isPermisoEliminarCuentaFlujoCaja) {
		this.isPermisoEliminarCuentaFlujoCaja = isPermisoEliminarCuentaFlujoCaja;
	}

	public Boolean getIsPermisoGuardarCambiosCuentaFlujoCaja() {
		return isPermisoGuardarCambiosCuentaFlujoCaja;
	}

	public void setIsPermisoGuardarCambiosCuentaFlujoCaja(Boolean isPermisoGuardarCambiosCuentaFlujoCaja) {
		this.isPermisoGuardarCambiosCuentaFlujoCaja = isPermisoGuardarCambiosCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoConsultaCuentaFlujoCaja() {
		return isPermisoConsultaCuentaFlujoCaja;
	}

	public void setIsPermisoConsultaCuentaFlujoCaja(Boolean isPermisoConsultaCuentaFlujoCaja) {
		this.isPermisoConsultaCuentaFlujoCaja = isPermisoConsultaCuentaFlujoCaja;
	}

	public Boolean getIsPermisoBusquedaCuentaFlujoCaja() {
		return isPermisoBusquedaCuentaFlujoCaja;
	}

	public void setIsPermisoBusquedaCuentaFlujoCaja(Boolean isPermisoBusquedaCuentaFlujoCaja) {
		this.isPermisoBusquedaCuentaFlujoCaja = isPermisoBusquedaCuentaFlujoCaja;
	}

	public Boolean getIsPermisoReporteCuentaFlujoCaja() {
		return isPermisoReporteCuentaFlujoCaja;
	}

	public void setIsPermisoReporteCuentaFlujoCaja(Boolean isPermisoReporteCuentaFlujoCaja) {
		this.isPermisoReporteCuentaFlujoCaja = isPermisoReporteCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioCuentaFlujoCaja() {
		return isPermisoPaginacionMedioCuentaFlujoCaja;
	}

	public void setIsPermisoPaginacionMedioCuentaFlujoCaja(Boolean isPermisoPaginacionMedioCuentaFlujoCaja) {
		this.isPermisoPaginacionMedioCuentaFlujoCaja = isPermisoPaginacionMedioCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoCuentaFlujoCaja() {
		return isPermisoPaginacionTodoCuentaFlujoCaja;
	}

	public void setIsPermisoPaginacionTodoCuentaFlujoCaja(Boolean isPermisoPaginacionTodoCuentaFlujoCaja) {
		this.isPermisoPaginacionTodoCuentaFlujoCaja = isPermisoPaginacionTodoCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoCuentaFlujoCaja() {
		return isPermisoPaginacionAltoCuentaFlujoCaja;
	}

	public void setIsPermisoPaginacionAltoCuentaFlujoCaja(Boolean isPermisoPaginacionAltoCuentaFlujoCaja) {
		this.isPermisoPaginacionAltoCuentaFlujoCaja = isPermisoPaginacionAltoCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoCopiarCuentaFlujoCaja() {
		return isPermisoCopiarCuentaFlujoCaja;
	}

	public void setIsPermisoCopiarCuentaFlujoCaja(Boolean isPermisoCopiarCuentaFlujoCaja) {
		this.isPermisoCopiarCuentaFlujoCaja = isPermisoCopiarCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoVerFormCuentaFlujoCaja() {
		return isPermisoVerFormCuentaFlujoCaja;
	}

	public void setIsPermisoVerFormCuentaFlujoCaja(Boolean isPermisoVerFormCuentaFlujoCaja) {
		this.isPermisoVerFormCuentaFlujoCaja = isPermisoVerFormCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoDuplicarCuentaFlujoCaja() {
		return isPermisoDuplicarCuentaFlujoCaja;
	}

	public void setIsPermisoDuplicarCuentaFlujoCaja(Boolean isPermisoDuplicarCuentaFlujoCaja) {
		this.isPermisoDuplicarCuentaFlujoCaja = isPermisoDuplicarCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoOrdenCuentaFlujoCaja() {
		return isPermisoOrdenCuentaFlujoCaja;
	}

	public void setIsPermisoOrdenCuentaFlujoCaja(Boolean isPermisoOrdenCuentaFlujoCaja) {
		this.isPermisoOrdenCuentaFlujoCaja = isPermisoOrdenCuentaFlujoCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCuentaFlujoCaja() {
		return isVisibilidadCeldaNuevoCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoCuentaFlujoCaja(Boolean isVisibilidadCeldaNuevoCuentaFlujoCaja) {
		this.isVisibilidadCeldaNuevoCuentaFlujoCaja = isVisibilidadCeldaNuevoCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCuentaFlujoCaja() {
		return isVisibilidadCeldaDuplicarCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaDuplicarCuentaFlujoCaja(Boolean isVisibilidadCeldaDuplicarCuentaFlujoCaja) {
		this.isVisibilidadCeldaDuplicarCuentaFlujoCaja = isVisibilidadCeldaDuplicarCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCuentaFlujoCaja() {
		return isVisibilidadCeldaCopiarCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaCopiarCuentaFlujoCaja(Boolean isVisibilidadCeldaCopiarCuentaFlujoCaja) {
		this.isVisibilidadCeldaCopiarCuentaFlujoCaja = isVisibilidadCeldaCopiarCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCuentaFlujoCaja() {
		return isVisibilidadCeldaVerFormCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaVerFormCuentaFlujoCaja(Boolean isVisibilidadCeldaVerFormCuentaFlujoCaja) {
		this.isVisibilidadCeldaVerFormCuentaFlujoCaja = isVisibilidadCeldaVerFormCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCuentaFlujoCaja() {
		return isVisibilidadCeldaOrdenCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaOrdenCuentaFlujoCaja(Boolean isVisibilidadCeldaOrdenCuentaFlujoCaja) {
		this.isVisibilidadCeldaOrdenCuentaFlujoCaja = isVisibilidadCeldaOrdenCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja() {
		return isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja(Boolean isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja) {
		this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja = isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCuentaFlujoCaja() {
		return isVisibilidadCeldaModificarCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaModificarCuentaFlujoCaja(Boolean isVisibilidadCeldaModificarCuentaFlujoCaja) {
		this.isVisibilidadCeldaModificarCuentaFlujoCaja = isVisibilidadCeldaModificarCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCuentaFlujoCaja() {
		return isVisibilidadCeldaActualizarCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaActualizarCuentaFlujoCaja(Boolean isVisibilidadCeldaActualizarCuentaFlujoCaja) {
		this.isVisibilidadCeldaActualizarCuentaFlujoCaja = isVisibilidadCeldaActualizarCuentaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarCuentaFlujoCaja() {
		return isVisibilidadCeldaEliminarCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaEliminarCuentaFlujoCaja(Boolean isVisibilidadCeldaEliminarCuentaFlujoCaja) {
		this.isVisibilidadCeldaEliminarCuentaFlujoCaja = isVisibilidadCeldaEliminarCuentaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarCuentaFlujoCaja() {
		return isVisibilidadCeldaCancelarCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaCancelarCuentaFlujoCaja(Boolean isVisibilidadCeldaCancelarCuentaFlujoCaja) {
		this.isVisibilidadCeldaCancelarCuentaFlujoCaja = isVisibilidadCeldaCancelarCuentaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarCuentaFlujoCaja() {
		return isVisibilidadCeldaGuardarCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarCuentaFlujoCaja(Boolean isVisibilidadCeldaGuardarCuentaFlujoCaja) {
		this.isVisibilidadCeldaGuardarCuentaFlujoCaja = isVisibilidadCeldaGuardarCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCuentaFlujoCaja() {
		return isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCuentaFlujoCaja(Boolean isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja) {
		this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja = isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja;
	}
		
	public CuentaFlujoCajaSessionBean getcuentaflujocajaSessionBean() {
		return this.cuentaflujocajaSessionBean;
	}
	
	public void setcuentaflujocajaSessionBean(CuentaFlujoCajaSessionBean cuentaflujocajaSessionBean) {
		this.cuentaflujocajaSessionBean=cuentaflujocajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdDia() {
		return this.isVisibilidadFK_IdDia;
	}

	public void setisVisibilidadFK_IdDia(Boolean isVisibilidadFK_IdDia) {
		this.isVisibilidadFK_IdDia=isVisibilidadFK_IdDia;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cuentaflujocaja,null);
				this.setActualParaGuardarMesForeignKey(cuentaflujocaja,null);
				this.setActualParaGuardarDiaForeignKey(cuentaflujocaja,null);
				this.setActualParaGuardarCuentaContableForeignKey(cuentaflujocaja,null);
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
	
	public void bugActualizarReferenciaActual(CuentaFlujoCaja cuentaflujocaja,CuentaFlujoCaja cuentaflujocajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCuentaFlujoCaja(cuentaflujocaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cuentaflujocajaAux.setId(cuentaflujocaja.getId());
		cuentaflujocajaAux.setVersionRow(cuentaflujocaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCuentaFlujoCaja();
		
			int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cuentaflujocajaValidator.getInvalidValues(this.cuentaflujocaja);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cuentaflujocajaLogic.setDatosCliente(datosCliente);
			cuentaflujocajaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cuentaflujocajaAux=new  CuentaFlujoCaja();
				
				cuentaflujocajaAux.setIsNew(true);
				cuentaflujocajaAux.setIsChanged(true);
				
				cuentaflujocajaAux.setCuentaFlujoCajaOriginal(this.cuentaflujocaja);
				
				cuentaflujocajaAux.setId(this.cuentaflujocaja.getId());	
				cuentaflujocajaAux.setVersionRow(this.cuentaflujocaja.getVersionRow());	
				cuentaflujocajaAux.setid_empresa(this.cuentaflujocaja.getid_empresa());	
				cuentaflujocajaAux.setnombre(this.cuentaflujocaja.getnombre());	
				cuentaflujocajaAux.setid_mes(this.cuentaflujocaja.getid_mes());	
				cuentaflujocajaAux.setid_dia(this.cuentaflujocaja.getid_dia());	
				cuentaflujocajaAux.setid_cuenta_contable(this.cuentaflujocaja.getid_cuenta_contable());	
				cuentaflujocajaAux.setformula(this.cuentaflujocaja.getformula());	
				cuentaflujocajaAux.setes_flujo_caja(this.cuentaflujocaja.getes_flujo_caja());	
				cuentaflujocajaAux.setcon_agrupar(this.cuentaflujocaja.getcon_agrupar());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cuentaflujocajaAux,cuentaflujocajaLogic.getCuentaFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentaflujocajaAux,cuentaflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaflujocajaLogic.saveCuentaFlujoCajas();//WithConnection
						//cuentaflujocajaLogic.getSetVersionRowCuentaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentaflujocaja,cuentaflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesCuentaFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().addAll(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajas.addAll(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentaflujocajaLogic.saveCuentaFlujoCajaRelaciones(cuentaflujocajaAux,this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());//WithConnection
								//cuentaflujocajaLogic.getSetVersionRowCuentaFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentaflujocaja,cuentaflujocajaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(new ArrayList<DetalleCuentaFlujoCaja>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajas= new ArrayList<DetalleCuentaFlujoCaja>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();}
							cuentaflujocajaAux.setDetalleCuentaFlujoCajas(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentaflujocajaAux,cuentaflujocajaLogic.getCuentaFlujoCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentaflujocajaAux,cuentaflujocajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentaflujocaja,cuentaflujocajaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cuentaflujocajaAux=new  CuentaFlujoCaja();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() 
					|| (this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() && this.cuentaflujocaja.getId()>=0)) {
						
					cuentaflujocajaAux.setIsNew(false);
				}
				
				cuentaflujocajaAux.setIsDeleted(false);
			
				cuentaflujocajaAux.setId(this.cuentaflujocaja.getId());	
				cuentaflujocajaAux.setVersionRow(this.cuentaflujocaja.getVersionRow());	
				cuentaflujocajaAux.setid_empresa(this.cuentaflujocaja.getid_empresa());	
				cuentaflujocajaAux.setnombre(this.cuentaflujocaja.getnombre());	
				cuentaflujocajaAux.setid_mes(this.cuentaflujocaja.getid_mes());	
				cuentaflujocajaAux.setid_dia(this.cuentaflujocaja.getid_dia());	
				cuentaflujocajaAux.setid_cuenta_contable(this.cuentaflujocaja.getid_cuenta_contable());	
				cuentaflujocajaAux.setformula(this.cuentaflujocaja.getformula());	
				cuentaflujocajaAux.setes_flujo_caja(this.cuentaflujocaja.getes_flujo_caja());	
				cuentaflujocajaAux.setcon_agrupar(this.cuentaflujocaja.getcon_agrupar());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentaflujocajaAux,cuentaflujocajaLogic.getCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentaflujocajaAux,cuentaflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaflujocajaLogic.saveCuentaFlujoCajas();//WithConnection
						//cuentaflujocajaLogic.getSetVersionRowCuentaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentaflujocaja,cuentaflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesCuentaFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().addAll(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajas.addAll(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentaflujocajaLogic.saveCuentaFlujoCajaRelaciones(cuentaflujocajaAux,this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());//WithConnection
								//cuentaflujocajaLogic.getSetVersionRowCuentaFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentaflujocaja,cuentaflujocajaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(new ArrayList<DetalleCuentaFlujoCaja>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajas= new ArrayList<DetalleCuentaFlujoCaja>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();}
							cuentaflujocajaAux.setDetalleCuentaFlujoCajas(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentaflujocajaAux,cuentaflujocajaLogic.getCuentaFlujoCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentaflujocajaAux,cuentaflujocajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentaflujocaja,cuentaflujocajaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cuentaflujocajaAux=new  CuentaFlujoCaja();
				
				cuentaflujocajaAux.setIsNew(false);
				cuentaflujocajaAux.setIsChanged(false);
				
				cuentaflujocajaAux.setIsDeleted(true);
				
				cuentaflujocajaAux.setId(this.cuentaflujocaja.getId());	
				cuentaflujocajaAux.setVersionRow(this.cuentaflujocaja.getVersionRow());	
				cuentaflujocajaAux.setid_empresa(this.cuentaflujocaja.getid_empresa());	
				cuentaflujocajaAux.setnombre(this.cuentaflujocaja.getnombre());	
				cuentaflujocajaAux.setid_mes(this.cuentaflujocaja.getid_mes());	
				cuentaflujocajaAux.setid_dia(this.cuentaflujocaja.getid_dia());	
				cuentaflujocajaAux.setid_cuenta_contable(this.cuentaflujocaja.getid_cuenta_contable());	
				cuentaflujocajaAux.setformula(this.cuentaflujocaja.getformula());	
				cuentaflujocajaAux.setes_flujo_caja(this.cuentaflujocaja.getes_flujo_caja());	
				cuentaflujocajaAux.setcon_agrupar(this.cuentaflujocaja.getcon_agrupar());	
				
				if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cuentaflujocajaAux.getId()>=0) {	
						this.cuentaflujocajasEliminados.add(cuentaflujocajaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cuentaflujocajaAux,cuentaflujocajaLogic.getCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentaflujocajaAux,cuentaflujocajas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaflujocajaLogic.saveCuentaFlujoCajas();//WithConnection
						//cuentaflujocajaLogic.getSetVersionRowCuentaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().addAll(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajas.addAll(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentaflujocajaLogic.saveCuentaFlujoCajaRelaciones(cuentaflujocajaAux,this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());//WithConnection
								//cuentaflujocajaLogic.getSetVersionRowCuentaFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(new ArrayList<DetalleCuentaFlujoCaja>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajas= new ArrayList<DetalleCuentaFlujoCaja>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();}
							cuentaflujocajaAux.setDetalleCuentaFlujoCajas(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cuentaflujocajaAux,cuentaflujocajaLogic.getCuentaFlujoCajas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cuentaflujocajaAux,cuentaflujocajas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.getCuentaFlujoCajas().addAll(this.cuentaflujocajasEliminados);
					
					cuentaflujocajaLogic.saveCuentaFlujoCajas();//WithConnection
					//cuentaflujocajaLogic.getSetVersionRowCuentaFlujoCajas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCuentaFlujoCaja();
				
				this.cuentaflujocajasEliminados= new ArrayList<CuentaFlujoCaja>();		
			}
			
			if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cuenta Flujo Caja GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cuentaflujocaja=cuentaflujocajaAux;
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
      		//this.finishProcessCuentaFlujoCaja();
      	}
		
	}	
	
	public void actualizarRelaciones(CuentaFlujoCaja cuentaflujocajaLocal) throws Exception {
		
		if(this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				cuentaflujocajaLocal.setDetalleCuentaFlujoCajas(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
			
			} else {
			
				cuentaflujocajaLocal.setDetalleCuentaFlujoCajas(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CuentaFlujoCaja cuentaflujocajaLocal) throws Exception {	
		if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cuentaflujocajaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				cuentaflujocajaLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DiaDetalleFormJInternalFrame.class)) {
				DiaBeanSwingJInternalFrame diaBeanSwingJInternalFrameLocal=(DiaBeanSwingJInternalFrame) ((DiaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				diaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDia(diaBeanSwingJInternalFrameLocal.getdia(),true);
				diaBeanSwingJInternalFrameLocal.actualizarLista(diaBeanSwingJInternalFrameLocal.dia,this.diasForeignKey);

				diaBeanSwingJInternalFrameLocal.actualizarRelaciones(diaBeanSwingJInternalFrameLocal.dia);

				cuentaflujocajaLocal.setDia(diaBeanSwingJInternalFrameLocal.dia);

				this.addItemDefectoCombosForeignKeyDia();
				this.cargarCombosFrameDiasForeignKey("Formulario");
				this.setActualDiaForeignKey(diaBeanSwingJInternalFrameLocal.dia.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				cuentaflujocajaLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCuentaFlujoCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cuentaflujocajaValidator.getInvalidValues(this.cuentaflujocaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CuentaFlujoCaja cuentaflujocaja,List<CuentaFlujoCaja> cuentaflujocajas) throws Exception {
		try	{		
			CuentaFlujoCajaConstantesFunciones.actualizarLista(cuentaflujocaja,cuentaflujocajas,this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CuentaFlujoCaja cuentaflujocaja,List<CuentaFlujoCaja> cuentaflujocajas) throws Exception {
		try	{			
			CuentaFlujoCajaConstantesFunciones.actualizarSelectedLista(cuentaflujocaja,cuentaflujocajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CuentaFlujoCaja> cuentaflujocajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cuentaflujocajasLocal=this.cuentaflujocajaLogic.getCuentaFlujoCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cuentaflujocajasLocal=this.cuentaflujocajas;
			}
			//ARCHITECTURE
		
			for(CuentaFlujoCaja cuentaflujocajaLocal:cuentaflujocajasLocal) {
				if(this.permiteMantenimiento(cuentaflujocajaLocal) && cuentaflujocajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CuentaFlujoCajaConstantesFunciones.getCuentaFlujoCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CuentaFlujoCajaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelid_empresaCuentaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaFlujoCajaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelnombreCuentaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaFlujoCajaConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelid_mesCuentaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaFlujoCajaConstantesFunciones.IDDIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelid_diaCuentaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaFlujoCajaConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelid_cuenta_contableCuentaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaFlujoCajaConstantesFunciones.FORMULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelformulaCuentaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaFlujoCajaConstantesFunciones.ESFLUJOCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabeles_flujo_cajaCuentaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaFlujoCajaConstantesFunciones.CONAGRUPAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelcon_agruparCuentaFlujoCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelid_empresaCuentaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelnombreCuentaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelid_mesCuentaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelid_diaCuentaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelid_cuenta_contableCuentaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelformulaCuentaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabeles_flujo_cajaCuentaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelcon_agruparCuentaFlujoCaja,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleCuentaFlujoCaja")) {
			if(this.cuentaflujocaja==null) {
				this.cuentaflujocaja= new CuentaFlujoCaja();
			}

			if(this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCuentaFlujoCaja
				this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);

				this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.getdetallecuentaflujocaja().setCuentaFlujoCaja(this.cuentaflujocaja);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCuentaFlujoCaja--;	
		
		
		this.cuentaflujocajaAux=new CuentaFlujoCaja();
		
		this.cuentaflujocajaAux.setId(this.iIdNuevoCuentaFlujoCaja);
		this.cuentaflujocajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentaflujocajaLogic.getCuentaFlujoCajas().add(this.cuentaflujocajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cuentaflujocajas.add(this.cuentaflujocajaAux);
		}
		//ARCHITECTURE
		
		this.cuentaflujocaja=this.cuentaflujocajaAux;
		
		if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCuentaFlujoCaja(this.cuentaflujocaja);
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaFlujoCaja(this.cuentaflujocaja);
		}
				
		//this.setDefaultControlesCuentaFlujoCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCuentaFlujoCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCuentaFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaFlujoCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaFlujoCaja(this.cuentaflujocajaBean,this.cuentaflujocaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
			classes=CuentaFlujoCajaConstantesFunciones.getClassesRelationshipsOfCuentaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cuentaflujocajaReturnGeneral=cuentaflujocajaLogic.procesarEventosCuentaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentaflujocajaLogic.getCuentaFlujoCajas(),this.cuentaflujocaja,this.cuentaflujocajaParameterGeneral,this.isEsNuevoCuentaFlujoCaja,classes);//this.cuentaflujocajaLogic.getCuentaFlujoCaja()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCuentaFlujoCaja(this.cuentaflujocajaReturnGeneral,this.cuentaflujocajaBean,false);
		
		if(this.cuentaflujocajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaFlujoCaja(this.cuentaflujocajaReturnGeneral.getCuentaFlujoCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCuentaFlujoCaja(this.cuentaflujocajaReturnGeneral.getCuentaFlujoCaja());
		}
		
		if(this.cuentaflujocajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCuentaFlujoCaja(this.cuentaflujocajaReturnGeneral.getCuentaFlujoCaja(),classes);//this.cuentaflujocajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCuentaFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCuentaFlujoCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.RecargarFormCuentaFlujoCaja(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCuentaFlujoCaja(false);
						
			if(cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado() && DetalleCuentaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleCuentaFlujoCajaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaFlujoCaja();
			}
			
			this.actualizarVisualTableDatosCuentaFlujoCaja();
			
			this.jTableDatosCuentaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoCuentaFlujoCaja(), this.getIndiceNuevoCuentaFlujoCaja());
			
			this.seleccionarFilaTablaCuentaFlujoCajaActual();
						
			this.actualizarEstadoCeldasBotonesCuentaFlujoCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCuentaFlujoCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreanombreCuentaFlujoCaja.setEnabled(isHabilitar && this.cuentaflujocajaConstantesFunciones.activarnombreCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreaformulaCuentaFlujoCaja.setEnabled(isHabilitar && this.cuentaflujocajaConstantesFunciones.activarformulaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxes_flujo_cajaCuentaFlujoCaja.setEnabled(isHabilitar && this.cuentaflujocajaConstantesFunciones.activares_flujo_cajaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxcon_agruparCuentaFlujoCaja.setEnabled(isHabilitar && this.cuentaflujocajaConstantesFunciones.activarcon_agruparCuentaFlujoCaja);	
		//
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.setEnabled(isHabilitar && this.cuentaflujocajaConstantesFunciones.activarid_empresaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.setEnabled(isHabilitar && this.cuentaflujocajaConstantesFunciones.activarid_mesCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.setEnabled(isHabilitar && this.cuentaflujocajaConstantesFunciones.activarid_diaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.setEnabled(isHabilitar && this.cuentaflujocajaConstantesFunciones.activarid_cuenta_contableCuentaFlujoCaja);
	};
	
	public void setDefaultControlesCuentaFlujoCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCuentaFlujoCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cuentaflujocajaSessionBean.setConGuardarRelaciones(true);			
			this.cuentaflujocajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jTabbedPaneRelacionesCuentaFlujoCaja.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.cuentaflujocajaSessionBean.setConGuardarRelaciones(false);			
			this.cuentaflujocajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jTabbedPaneRelacionesCuentaFlujoCaja.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCuentaFlujoCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajaLogic.getCuentaFlujoCajas()) {
				if(cuentaflujocajaAux.getId().equals(this.iIdNuevoCuentaFlujoCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajas) {
				if(cuentaflujocajaAux.getId().equals(this.iIdNuevoCuentaFlujoCaja)) {
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
	
	public int getIndiceActualCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajaLogic.getCuentaFlujoCajas()) {
				if(cuentaflujocajaAux.getId().equals(cuentaflujocaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajas) {
				if(cuentaflujocajaAux.getId().equals(cuentaflujocaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajaLogic.getCuentaFlujoCajas()) {
				if(cuentaflujocajaAux.getCuentaFlujoCajaOriginal().getId().equals(cuentaflujocajaOriginal.getId())) {
					existe=true;
					cuentaflujocajaOriginal.setId(cuentaflujocajaAux.getId());
					cuentaflujocajaOriginal.setVersionRow(cuentaflujocajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajas) {
				if(cuentaflujocajaAux.getCuentaFlujoCajaOriginal().getId().equals(cuentaflujocajaOriginal.getId())) {
					existe=true;
					cuentaflujocajaOriginal.setId(cuentaflujocajaAux.getId());
					cuentaflujocajaOriginal.setVersionRow(cuentaflujocajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCuentaFlujoCaja(Boolean esParaCancelar) throws Exception {
		cuentaflujocajasAux=new ArrayList<CuentaFlujoCaja>();
		cuentaflujocajaAux=new CuentaFlujoCaja();
		
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajaLogic.getCuentaFlujoCajas()) {
					if(cuentaflujocajaAux.getId()<0) {
						cuentaflujocajasAux.add(cuentaflujocajaAux);
					}		
				}
				this.iIdNuevoCuentaFlujoCaja=0L;
				this.cuentaflujocajaLogic.getCuentaFlujoCajas().removeAll(cuentaflujocajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajas) {
					if(cuentaflujocajaAux.getId()<0) {
						cuentaflujocajasAux.add(cuentaflujocajaAux);
					}		
				}
				this.iIdNuevoCuentaFlujoCaja=0L;
				this.cuentaflujocajas.removeAll(cuentaflujocajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCuentaFlujoCaja 
					&& this.cuentaflujocajaLogic.getCuentaFlujoCajas().size()>0
					) {
					cuentaflujocajaAux=this.cuentaflujocajaLogic.getCuentaFlujoCajas().get(this.cuentaflujocajaLogic.getCuentaFlujoCajas().size() - 1);
				
					if(cuentaflujocajaAux.getId()<0) {
						this.cuentaflujocajaLogic.getCuentaFlujoCajas().remove(cuentaflujocajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCuentaFlujoCaja && this.cuentaflujocajas.size()>0) {
					cuentaflujocajaAux=this.cuentaflujocajas.get(this.cuentaflujocajas.size() - 1);
				
					if(cuentaflujocajaAux.getId()<0) {
						this.cuentaflujocajas.remove(cuentaflujocajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCuentaFlujoCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cuentaflujocaja.getId()<0) {
				this.cuentaflujocajaLogic.getCuentaFlujoCajas().remove(this.cuentaflujocaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cuentaflujocaja.getId()<0) {
				this.cuentaflujocajas.remove(this.cuentaflujocaja);
			}
		}			
	}
	
	public void setEstadosInicialesCuentaFlujoCaja(List<CuentaFlujoCaja> cuentaflujocajasAux) throws Exception {
		CuentaFlujoCajaConstantesFunciones.setEstadosInicialesCuentaFlujoCaja(cuentaflujocajasAux);
	}
	
	public void setEstadosInicialesCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocajaAux) throws Exception {
		CuentaFlujoCajaConstantesFunciones.setEstadosInicialesCuentaFlujoCaja(cuentaflujocajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCuentaFlujoCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCuentaFlujoCajaActual()) {
				if(!this.isEsNuevoCuentaFlujoCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCuentaFlujoCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCuentaFlujoCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cuenta Flujo Caja ?", "MANTENIMIENTO DE Cuenta Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CuentaFlujoCaja cuentaflujocaja) throws Exception {
		CuentaFlujoCajaConstantesFunciones.seleccionarAsignar(this.cuentaflujocaja,cuentaflujocaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCuentaFlujoCaja=this.isPermisoActualizarOriginalCuentaFlujoCaja;
			
			
			this.seleccionarAsignar(cuentaflujocaja);
			
			

			idCuentaContableActual=cuentaflujocaja.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaFlujoCajaConstantesFunciones.quitarEspaciosCuentaFlujoCaja(this.cuentaflujocaja,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCuentaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cuentaflujocajaSessionBean.setsFuncionBusquedaRapida(this.cuentaflujocajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableActual() throws Exception {
		try	{
			CuentaContable cuentacontableAux=new CuentaContable();

			if(this.idCuentaContableActual != null && this.idCuentaContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(this.idCuentaContableActual);
					cuentacontableAux= cuentacontableLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablesForeignKey=new ArrayList<CuentaContable>();
				cuentacontablesForeignKey.add(cuentacontableAux);
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
			if(this.isEsNuevoCuentaFlujoCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCuentaFlujoCaja(esParaCancelar);				
				this.cancelarNuevoCuentaFlujoCaja(esParaCancelar);								
			}
			
			this.cuentaflujocaja=new CuentaFlujoCaja();
			
			this.inicializarCuentaFlujoCaja();
			
			this.actualizarEstadoCeldasBotonesCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCuentaFlujoCaja() throws Exception {
		try {
			CuentaFlujoCajaConstantesFunciones.inicializarCuentaFlujoCaja(this.cuentaflujocaja);
			
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
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cuentaflujocajaLogic.getCuentaFlujoCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCuentaFlujoCajas(String sAccionBusqueda,List<CuentaFlujoCaja> cuentaflujocajasParaReportes) throws Exception {
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
					sPathReporteFinal="CuentaFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CuentaFlujoCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CuentaFlujoCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CuentaFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cuenta Flujo Cajas");		
		parameters.put("busquedapor", CuentaFlujoCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleCuentaFlujoCaja.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CuentaFlujoCajaLogic cuentaflujocajaLogicAuxiliar=new CuentaFlujoCajaLogic();
					cuentaflujocajaLogicAuxiliar.setDatosCliente(cuentaflujocajaLogic.getDatosCliente());				
					cuentaflujocajaLogicAuxiliar.setCuentaFlujoCajas(cuentaflujocajasParaReportes);
					
					cuentaflujocajaLogicAuxiliar.cargarRelacionesLoteForeignKeyCuentaFlujoCajaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					cuentaflujocajasParaReportes=cuentaflujocajaLogicAuxiliar.getCuentaFlujoCajas();
					
					//cuentaflujocajaLogic.getNewConnexionToDeep();
					
					//for (CuentaFlujoCaja cuentaflujocaja:cuentaflujocajasParaReportes) {
					//	cuentaflujocajaLogic.deepLoad(cuentaflujocaja, false, DeepLoadType.INCLUDE, classes);
					//}						
					//cuentaflujocajaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//cuentaflujocajaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleCuentaFlujoCaja = AuxiliarReportes.class.getResourceAsStream("DetalleCuentaFlujoCajaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallecuentaflujocaja", reportFileDetalleCuentaFlujoCaja);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCuentaFlujoCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CuentaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CuentaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCuentaFlujoCaja=new JRBeanArrayDataSource(CuentaFlujoCajaJInternalFrame.TraerCuentaFlujoCajaBeans(cuentaflujocajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCuentaFlujoCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CuentaFlujoCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CuentaFlujoCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CuentaFlujoCajaBean.TraerCuentaFlujoCajaBeans(cuentaflujocajasParaReportes).toArray()));
							
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
				this.generarExcelReporteCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,cuentaflujocajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,cuentaflujocajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCuentaFlujoCajaActionPerformed(null);
					//this.generarExcelReporteCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,cuentaflujocajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,cuentaflujocajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,cuentaflujocajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,cuentaflujocajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCuentaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaFlujoCaja> cuentaflujocajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaflujocaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaFlujoCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaFlujoCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CuentaFlujoCaja cuentaflujocaja : cuentaflujocajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CuentaFlujoCajaConstantesFunciones.generarExcelReporteDataCuentaFlujoCaja("NORMAL",row,workbook,cuentaflujocaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCuentaFlujoCaja(String sTipo,Row row,Workbook workbook) {
		
		CuentaFlujoCajaConstantesFunciones.generarExcelReporteHeaderCuentaFlujoCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCuentaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaFlujoCaja> cuentaflujocajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaflujocaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CuentaFlujoCaja cuentaflujocaja : cuentaflujocajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CuentaFlujoCajaConstantesFunciones.getCuentaFlujoCajaDescripcion(cuentaflujocaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaflujocaja.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaflujocaja.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaFlujoCajaConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaflujocaja.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaflujocaja.getdia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaflujocaja.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentaflujocaja.getformula());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(cuentaflujocaja.getes_flujo_caja()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(cuentaflujocaja.getcon_agrupar()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCuentaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaFlujoCaja> cuentaflujocajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CuentaFlujoCaja> cuentaflujocajasRespaldo=null;
		
		classes=CuentaFlujoCajaConstantesFunciones.getClassesRelationshipsOfCuentaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cuentaflujocajaLogic.setDatosCliente(this.datosCliente);
		this.cuentaflujocajaLogic.setDatosDeep(this.datosDeep);
		this.cuentaflujocajaLogic.setIsConDeep(true);
		
		cuentaflujocajasRespaldo=this.cuentaflujocajaLogic.getCuentaFlujoCajas();
		
		this.cuentaflujocajaLogic.setCuentaFlujoCajas(cuentaflujocajasParaReportes);	
		this.cuentaflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cuentaflujocajasParaReportes=this.cuentaflujocajaLogic.getCuentaFlujoCajas();
		this.cuentaflujocajaLogic.setCuentaFlujoCajas(cuentaflujocajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaflujocaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaFlujoCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CuentaFlujoCaja cuentaflujocaja : cuentaflujocajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCuentaFlujoCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CuentaFlujoCajaConstantesFunciones.generarExcelReporteDataCuentaFlujoCaja("NORMAL",row,workbook,cuentaflujocaja,cellStyleDataAux);
		
			
			


				//DetalleCuentaFlujoCaja
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO))) {

				if(cuentaflujocaja.getDetalleCuentaFlujoCajas()!=null && cuentaflujocaja.getDetalleCuentaFlujoCajas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleCuentaFlujoCajaConstantesFunciones.generarExcelReporteHeaderDetalleCuentaFlujoCaja("RELACIONADO",row,workbook);
				}

				if(cuentaflujocaja.getDetalleCuentaFlujoCajas()!=null) {
					i2=0;
					for(DetalleCuentaFlujoCaja detallecuentaflujocaja : cuentaflujocaja.getDetalleCuentaFlujoCajas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleCuentaFlujoCajaConstantesFunciones.generarExcelReporteDataDetalleCuentaFlujoCaja("RELACIONADO",row,workbook,detallecuentaflujocaja,cellStyleDataAuxHijo);
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
		cell.setCellValue(CuentaFlujoCajaConstantesFunciones.getCuentaFlujoCajaDescripcion(cuentaflujocaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCuentaFlujoCaja() throws Exception {		
		this.startProcessCuentaFlujoCaja(true);
	}
	
	public void startProcessCuentaFlujoCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCuentaFlujoCaja ,this.jPanelParametrosReportesCuentaFlujoCaja, this.jScrollPanelDatosCuentaFlujoCaja,this.jPanelPaginacionCuentaFlujoCaja, this.jScrollPanelDatosEdicionCuentaFlujoCaja, this.jPanelAccionesCuentaFlujoCaja,this.jPanelAccionesFormularioCuentaFlujoCaja,this.jmenuBarCuentaFlujoCaja,this.jmenuBarDetalleCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaFlujoCaja=this.jTabbedPaneBusquedasCuentaFlujoCaja; 
		
		final JPanel jPanelParametrosReportesCuentaFlujoCaja=this.jPanelParametrosReportesCuentaFlujoCaja;
		//final JScrollPane jScrollPanelDatosCuentaFlujoCaja=this.jScrollPanelDatosCuentaFlujoCaja;
		final JTable jTableDatosCuentaFlujoCaja=this.jTableDatosCuentaFlujoCaja;		
		final JPanel jPanelPaginacionCuentaFlujoCaja=this.jPanelPaginacionCuentaFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionCuentaFlujoCaja=this.jScrollPanelDatosEdicionCuentaFlujoCaja;
		final JPanel jPanelAccionesCuentaFlujoCaja=this.jPanelAccionesCuentaFlujoCaja;
		
		JPanel jPanelCamposAuxiliarCuentaFlujoCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCuentaFlujoCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			jPanelCamposAuxiliarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelCamposCuentaFlujoCaja;
			jPanelAccionesFormularioAuxiliarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelAccionesFormularioCuentaFlujoCaja;
		}
		
		final JPanel jPanelCamposCuentaFlujoCaja=jPanelCamposAuxiliarCuentaFlujoCaja;
		final JPanel jPanelAccionesFormularioCuentaFlujoCaja=jPanelAccionesFormularioAuxiliarCuentaFlujoCaja;
		
		
		final JMenuBar jmenuBarCuentaFlujoCaja=this.jmenuBarCuentaFlujoCaja;
		final JToolBar jTtoolBarCuentaFlujoCaja=this.jTtoolBarCuentaFlujoCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCuentaFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaFlujoCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jmenuBarDetalleCuentaFlujoCaja;
			jTtoolBarDetalleAuxiliarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jTtoolBarDetalleCuentaFlujoCaja;
		}
		
		final JMenuBar jmenuBarDetalleCuentaFlujoCaja=jmenuBarDetalleAuxiliarCuentaFlujoCaja;
		final JToolBar jTtoolBarDetalleCuentaFlujoCaja=jTtoolBarDetalleAuxiliarCuentaFlujoCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaFlujoCaja;
			processRunnable.jTableDatos=jTableDatosCuentaFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposCuentaFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarCuentaFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaFlujoCaja ,jPanelParametrosReportesCuentaFlujoCaja,jTableDatosCuentaFlujoCaja, /*jScrollPanelDatosCuentaFlujoCaja,*/jPanelCamposCuentaFlujoCaja,jPanelPaginacionCuentaFlujoCaja, /*jScrollPanelDatosEdicionCuentaFlujoCaja,*/ jPanelAccionesCuentaFlujoCaja,jPanelAccionesFormularioCuentaFlujoCaja,jmenuBarCuentaFlujoCaja,jmenuBarDetalleCuentaFlujoCaja,jTtoolBarCuentaFlujoCaja,jTtoolBarDetalleCuentaFlujoCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaFlujoCaja ,jPanelParametrosReportesCuentaFlujoCaja, jScrollPanelDatosCuentaFlujoCaja,jPanelPaginacionCuentaFlujoCaja, jScrollPanelDatosEdicionCuentaFlujoCaja, jPanelAccionesCuentaFlujoCaja,jPanelAccionesFormularioCuentaFlujoCaja,jmenuBarCuentaFlujoCaja,jmenuBarDetalleCuentaFlujoCaja,jTtoolBarCuentaFlujoCaja,jTtoolBarDetalleCuentaFlujoCaja);
						
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
	
	public void finishProcessCuentaFlujoCaja() {// throws Exception 
		this.finishProcessCuentaFlujoCaja(true);
	}
	
	public void finishProcessCuentaFlujoCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCuentaFlujoCaja ,this.jPanelParametrosReportesCuentaFlujoCaja, this.jScrollPanelDatosCuentaFlujoCaja,this.jPanelPaginacionCuentaFlujoCaja, this.jScrollPanelDatosEdicionCuentaFlujoCaja, this.jPanelAccionesCuentaFlujoCaja,this.jPanelAccionesFormularioCuentaFlujoCaja,this.jmenuBarCuentaFlujoCaja,this.jmenuBarDetalleCuentaFlujoCaja,this.jTtoolBarCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaFlujoCaja=this.jTabbedPaneBusquedasCuentaFlujoCaja; 
		
		final JPanel jPanelParametrosReportesCuentaFlujoCaja=this.jPanelParametrosReportesCuentaFlujoCaja;
		//final JScrollPane jScrollPanelDatosCuentaFlujoCaja=this.jScrollPanelDatosCuentaFlujoCaja;
		final JTable jTableDatosCuentaFlujoCaja=this.jTableDatosCuentaFlujoCaja;		
		final JPanel jPanelPaginacionCuentaFlujoCaja=this.jPanelPaginacionCuentaFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionCuentaFlujoCaja=this.jScrollPanelDatosEdicionCuentaFlujoCaja;
		final JPanel jPanelAccionesCuentaFlujoCaja=this.jPanelAccionesCuentaFlujoCaja;
		
		JPanel jPanelCamposAuxiliarCuentaFlujoCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCuentaFlujoCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			jPanelCamposAuxiliarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelCamposCuentaFlujoCaja;
			jPanelAccionesFormularioAuxiliarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelAccionesFormularioCuentaFlujoCaja;
		}
		
		final JPanel jPanelCamposCuentaFlujoCaja=jPanelCamposAuxiliarCuentaFlujoCaja;
		final JPanel jPanelAccionesFormularioCuentaFlujoCaja=jPanelAccionesFormularioAuxiliarCuentaFlujoCaja;
		
		
		final JMenuBar jmenuBarCuentaFlujoCaja=this.jmenuBarCuentaFlujoCaja;		
		final JToolBar jTtoolBarCuentaFlujoCaja=this.jTtoolBarCuentaFlujoCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarCuentaFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaFlujoCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jmenuBarDetalleCuentaFlujoCaja;
			jTtoolBarDetalleAuxiliarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jTtoolBarDetalleCuentaFlujoCaja;		
		}
		
		final JMenuBar jmenuBarDetalleCuentaFlujoCaja=jmenuBarDetalleAuxiliarCuentaFlujoCaja;
		final JToolBar jTtoolBarDetalleCuentaFlujoCaja=jTtoolBarDetalleAuxiliarCuentaFlujoCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaFlujoCaja;
			processRunnable.jTableDatos=jTableDatosCuentaFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposCuentaFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarCuentaFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCuentaFlujoCaja ,jPanelParametrosReportesCuentaFlujoCaja, jTableDatosCuentaFlujoCaja,/*jScrollPanelDatosCuentaFlujoCaja,*/jPanelCamposCuentaFlujoCaja,jPanelPaginacionCuentaFlujoCaja, /*jScrollPanelDatosEdicionCuentaFlujoCaja,*/ jPanelAccionesCuentaFlujoCaja,jPanelAccionesFormularioCuentaFlujoCaja,jmenuBarCuentaFlujoCaja,jmenuBarDetalleCuentaFlujoCaja,jTtoolBarCuentaFlujoCaja,jTtoolBarDetalleCuentaFlujoCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCuentaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCuentaFlujoCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCuentaFlujoCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCuentaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCuentaFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCuentaFlujoCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCuentaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCuentaFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCuentaFlujoCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cuentaflujocajaConstantesFunciones.getsFinalQueryCuentaFlujoCaja();
		String  finalQueryPaginacionTodos=this.cuentaflujocajaConstantesFunciones.getsFinalQueryCuentaFlujoCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CuentaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesNoCuentaFlujoCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CuentaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesCuentaFlujoCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CuentaFlujoCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cuentaflujocajasEliminados= new ArrayList<CuentaFlujoCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCuentaFlujoCaja();
		
				///*CuentaFlujoCajaSessionBean*/this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
			
			if(this.cuentaflujocajaSessionBean==null) {
				this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
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
					this.iNumeroPaginacion=CuentaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CuentaFlujoCajaConstantesFunciones.getClassesForeignKeysOfCuentaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cuentaflujocaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cuentaflujocajasAux= new ArrayList<CuentaFlujoCaja>();
			
				
			cuentaflujocajaLogic.setDatosCliente(this.datosCliente);
			cuentaflujocajaLogic.setDatosDeep(this.datosDeep);
			cuentaflujocajaLogic.setIsConDeep(true);
			
			
			cuentaflujocajaLogic.getCuentaFlujoCajaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cuentaflujocajaLogic.getTodosCuentaFlujoCajas(finalQueryGlobal,pagination);
					
					//cuentaflujocajaLogic.getTodosCuentaFlujoCajasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cuentaflujocajaLogic.getCuentaFlujoCajas()==null|| cuentaflujocajaLogic.getCuentaFlujoCajas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentaflujocajasAux= new ArrayList<CuentaFlujoCaja>();
							cuentaflujocajasAux.addAll(cuentaflujocajaLogic.getCuentaFlujoCajas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaflujocajasAux= new ArrayList<CuentaFlujoCaja>();
							cuentaflujocajasAux.addAll(cuentaflujocajas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentaflujocajaLogic.getTodosCuentaFlujoCajas(finalQueryGlobal+"",this.pagination);												
							
							//cuentaflujocajaLogic.getTodosCuentaFlujoCajasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCuentaFlujoCajas("Todos",cuentaflujocajaLogic.getCuentaFlujoCajas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentaflujocajaLogic.setCuentaFlujoCajas(new ArrayList<CuentaFlujoCaja>());					
							cuentaflujocajaLogic.getCuentaFlujoCajas().addAll(cuentaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaflujocajas=new ArrayList<CuentaFlujoCaja>();
							cuentaflujocajas.addAll(cuentaflujocajasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCuentaFlujoCaja=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCuentaFlujoCaja=this.idActual;
				
				} else if(this.idCuentaFlujoCajaActual!=null && this.idCuentaFlujoCajaActual!=0L) {
					idCuentaFlujoCaja=idCuentaFlujoCajaActual;
				}
				
					
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndicePorId(idCuentaFlujoCaja);
				
				this.cuentaflujocajas=new ArrayList<CuentaFlujoCaja>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cuentaflujocajaLogic.getEntity(idCuentaFlujoCaja);
					
					//cuentaflujocajaLogic.getEntityWithConnection(idCuentaFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaflujocajaLogic.setCuentaFlujoCajas(new ArrayList<CuentaFlujoCaja>());
					cuentaflujocajaLogic.getCuentaFlujoCajas().add(cuentaflujocajaLogic.getCuentaFlujoCaja());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaflujocajas=new ArrayList<CuentaFlujoCaja>();
					this.cuentaflujocajas.add(cuentaflujocaja);
				}
				
				if(cuentaflujocajaLogic.getCuentaFlujoCaja()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaflujocajaLogic.getCuentaFlujoCajasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaflujocajaLogic.getCuentaFlujoCajas()==null||cuentaflujocajaLogic.getCuentaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaflujocajas==null|| cuentaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaflujocajasAux=new ArrayList<CuentaFlujoCaja>();
						cuentaflujocajasAux.addAll(cuentaflujocajaLogic.getCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaflujocajasAux=new ArrayList<CuentaFlujoCaja>();
							cuentaflujocajasAux.addAll(cuentaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaflujocajaLogic.getCuentaFlujoCajasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaFlujoCajas("BusquedaPorNombre",cuentaflujocajaLogic.getCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaFlujoCajas("BusquedaPorNombre",cuentaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaflujocajaLogic.setCuentaFlujoCajas(new ArrayList<CuentaFlujoCaja>());
						cuentaflujocajaLogic.getCuentaFlujoCajas().addAll(cuentaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaflujocajas=new ArrayList<CuentaFlujoCaja>();
							cuentaflujocajas.addAll(cuentaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaflujocajaLogic.getCuentaFlujoCajasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaflujocajaLogic.getCuentaFlujoCajas()==null||cuentaflujocajaLogic.getCuentaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaflujocajas==null|| cuentaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaflujocajasAux=new ArrayList<CuentaFlujoCaja>();
						cuentaflujocajasAux.addAll(cuentaflujocajaLogic.getCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaflujocajasAux=new ArrayList<CuentaFlujoCaja>();
							cuentaflujocajasAux.addAll(cuentaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaflujocajaLogic.getCuentaFlujoCajasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaFlujoCajas("FK_IdCuentaContable",cuentaflujocajaLogic.getCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaFlujoCajas("FK_IdCuentaContable",cuentaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaflujocajaLogic.setCuentaFlujoCajas(new ArrayList<CuentaFlujoCaja>());
						cuentaflujocajaLogic.getCuentaFlujoCajas().addAll(cuentaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaflujocajas=new ArrayList<CuentaFlujoCaja>();
							cuentaflujocajas.addAll(cuentaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentaflujocajaLogic.getCuentaFlujoCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentaflujocajaLogic.getCuentaFlujoCajas()==null||cuentaflujocajaLogic.getCuentaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentaflujocajas==null|| cuentaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaflujocajasAux=new ArrayList<CuentaFlujoCaja>();
						cuentaflujocajasAux.addAll(cuentaflujocajaLogic.getCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaflujocajasAux=new ArrayList<CuentaFlujoCaja>();
							cuentaflujocajasAux.addAll(cuentaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentaflujocajaLogic.getCuentaFlujoCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaFlujoCajas("FK_IdEmpresa",cuentaflujocajaLogic.getCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaFlujoCajas("FK_IdEmpresa",cuentaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaflujocajaLogic.setCuentaFlujoCajas(new ArrayList<CuentaFlujoCaja>());
						cuentaflujocajaLogic.getCuentaFlujoCajas().addAll(cuentaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaflujocajas=new ArrayList<CuentaFlujoCaja>();
							cuentaflujocajas.addAll(cuentaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCuentaFlujoCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCuentaFlujoCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentaflujocajaLogic.getCuentaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentaflujocajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentaflujocajaLogic.getCuentaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentaflujocajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CuentaFlujoCaja cuentaflujocaja) {
		Boolean permite=true;
		
		if(this.cuentaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CuentaFlujoCajaConstantesFunciones.getOrderByListaCuentaFlujoCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CuentaFlujoCajaConstantesFunciones.getOrderByListaCuentaFlujoCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaFlujoCaja cuentaflujocaja:cuentaflujocajaLogic.getCuentaFlujoCajas()) {
				if(cuentaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					cuentaflujocajaTotales=cuentaflujocaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaFlujoCaja cuentaflujocaja:this.cuentaflujocajas) {
				if(cuentaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					cuentaflujocajaTotales=cuentaflujocaja;
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
			this.cuentaflujocajaAux=new CuentaFlujoCaja();
			this.cuentaflujocajaAux.setsType(Constantes2.S_TOTALES);
			this.cuentaflujocajaAux.setIsNew(false);
			this.cuentaflujocajaAux.setIsChanged(false);
			this.cuentaflujocajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CuentaFlujoCajaConstantesFunciones.TotalizarValoresFilaCuentaFlujoCaja(this.cuentaflujocajaLogic.getCuentaFlujoCajas(),this.cuentaflujocajaAux);
				
				this.cuentaflujocajaLogic.getCuentaFlujoCajas().add(this.cuentaflujocajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CuentaFlujoCajaConstantesFunciones.TotalizarValoresFilaCuentaFlujoCaja(this.cuentaflujocajas,this.cuentaflujocajaAux);
				
				this.cuentaflujocajas.add(this.cuentaflujocajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cuentaflujocajaTotales=new CuentaFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentaflujocajaLogic.getCuentaFlujoCajas().remove(cuentaflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentaflujocajas.remove(cuentaflujocajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cuentaflujocajaTotales=new CuentaFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaFlujoCaja cuentaflujocaja:cuentaflujocajaLogic.getCuentaFlujoCajas()) {
				if(cuentaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					cuentaflujocajaTotales=cuentaflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaFlujoCajaConstantesFunciones.TotalizarValoresFilaCuentaFlujoCaja(this.cuentaflujocajaLogic.getCuentaFlujoCajas(),cuentaflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaFlujoCaja cuentaflujocaja:this.cuentaflujocajas) {
				if(cuentaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					cuentaflujocajaTotales=cuentaflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaFlujoCajaConstantesFunciones.TotalizarValoresFilaCuentaFlujoCaja(this.cuentaflujocajas,cuentaflujocajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCuentaFlujoCajasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaFlujoCajasFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaFlujoCajasFK_IdDia()throws Exception {
		try {
			sAccionBusqueda="FK_IdDia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaFlujoCajasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaFlujoCajasFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCuentaFlujoCajasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaflujocajaLogic.getCuentaFlujoCajasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaFlujoCajasFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaflujocajaLogic.getCuentaFlujoCajasFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaFlujoCajasFK_IdDia(String sFinalQuery,Long id_dia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaflujocajaLogic.getCuentaFlujoCajasFK_IdDia(sFinalQuery,this.pagination,id_dia);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaFlujoCajasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaflujocajaLogic.getCuentaFlujoCajasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaFlujoCajasFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaflujocajaLogic.getCuentaFlujoCajasFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
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
	
	public void inicializarPermisosCuentaFlujoCaja() {
		this.isPermisoTodoCuentaFlujoCaja=false;
		this.isPermisoNuevoCuentaFlujoCaja=false;
		this.isPermisoActualizarCuentaFlujoCaja=false;
		this.isPermisoActualizarOriginalCuentaFlujoCaja=false;
		this.isPermisoEliminarCuentaFlujoCaja=false;
		this.isPermisoGuardarCambiosCuentaFlujoCaja=false;
		this.isPermisoConsultaCuentaFlujoCaja=false;
		this.isPermisoBusquedaCuentaFlujoCaja=false;
		this.isPermisoReporteCuentaFlujoCaja=false;		
		this.isPermisoOrdenCuentaFlujoCaja=false;		
		this.isPermisoPaginacionMedioCuentaFlujoCaja=false;		
		this.isPermisoPaginacionAltoCuentaFlujoCaja=false;
		this.isPermisoPaginacionTodoCuentaFlujoCaja=false;
		this.isPermisoCopiarCuentaFlujoCaja=false;		
		this.isPermisoVerFormCuentaFlujoCaja=false;		
		this.isPermisoDuplicarCuentaFlujoCaja=false;		
		this.isPermisoOrdenCuentaFlujoCaja=false;		
	}
	
	public void setPermisosUsuarioCuentaFlujoCaja(Boolean isPermiso) {
		this.isPermisoTodoCuentaFlujoCaja=isPermiso;
		this.isPermisoNuevoCuentaFlujoCaja=isPermiso;
		this.isPermisoActualizarCuentaFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalCuentaFlujoCaja=isPermiso;
		this.isPermisoEliminarCuentaFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosCuentaFlujoCaja=isPermiso;
		this.isPermisoConsultaCuentaFlujoCaja=isPermiso;
		this.isPermisoBusquedaCuentaFlujoCaja=isPermiso;
		this.isPermisoReporteCuentaFlujoCaja=isPermiso;
		this.isPermisoOrdenCuentaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionMedioCuentaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionAltoCuentaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionTodoCuentaFlujoCaja=isPermiso;		
		this.isPermisoCopiarCuentaFlujoCaja=isPermiso;		
		this.isPermisoVerFormCuentaFlujoCaja=isPermiso;		
		this.isPermisoDuplicarCuentaFlujoCaja=isPermiso;
		this.isPermisoOrdenCuentaFlujoCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCuentaFlujoCaja(Boolean isPermiso) {
		//this.isPermisoTodoCuentaFlujoCaja=isPermiso;
		this.isPermisoNuevoCuentaFlujoCaja=isPermiso;
		this.isPermisoActualizarCuentaFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalCuentaFlujoCaja=isPermiso;
		this.isPermisoEliminarCuentaFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosCuentaFlujoCaja=isPermiso;
		//this.isPermisoConsultaCuentaFlujoCaja=isPermiso;
		//this.isPermisoBusquedaCuentaFlujoCaja=isPermiso;
		//this.isPermisoReporteCuentaFlujoCaja=isPermiso;
		//this.isPermisoOrdenCuentaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionMedioCuentaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionAltoCuentaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionTodoCuentaFlujoCaja=isPermiso;		
		//this.isPermisoCopiarCuentaFlujoCaja=isPermiso;		
		//this.isPermisoDuplicarCuentaFlujoCaja=isPermiso;
		//this.isPermisoOrdenCuentaFlujoCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCuentaFlujoCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleCuentaFlujoCajaConstantesFunciones.SNOMBREOPCION);
		
		if(CuentaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleCuentaFlujoCaja=false;
		this.isTienePermisosDetalleCuentaFlujoCaja=this.verificarGetPermisosUsuarioOpcionCuentaFlujoCajaClaseRelacionada(this.opcionsRelacionadas,DetalleCuentaFlujoCajaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCuentaFlujoCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCuentaFlujoCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleCuentaFlujoCaja=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCuentaFlujoCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCuentaFlujoCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCuentaFlujoCajaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleCuentaFlujoCaja && this.jInternalFrameDetalleFormCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jTabbedPaneRelacionesCuentaFlujoCaja.remove(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCuentaFlujoCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CuentaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CuentaFlujoCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCuentaFlujoCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCuentaFlujoCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCuentaFlujoCaja=this.isPermisoActualizarCuentaFlujoCaja;
			this.isPermisoEliminarCuentaFlujoCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCuentaFlujoCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCuentaFlujoCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCuentaFlujoCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCuentaFlujoCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCuentaFlujoCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCuentaFlujoCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCuentaFlujoCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCuentaFlujoCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCuentaFlujoCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCuentaFlujoCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCuentaFlujoCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCuentaFlujoCaja.setToolTipText(this.jTableDatosCuentaFlujoCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCuentaFlujoCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCuentaFlujoCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CuentaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CuentaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCuentaFlujoCaja() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleCuentaFlujoCaja && this.cuentaflujocajaConstantesFunciones.mostrarDetalleCuentaFlujoCajaCuentaFlujoCaja && !CuentaFlujoCajaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Cuenta Flujo Caja");
			reporte.setsDescripcion("Detalle Cuenta Flujo Caja");
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
	public void inicializarCombosForeignKeyCuentaFlujoCajaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.diasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCuentaFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CuentaFlujoCajaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCuentaFlujoCajaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDiaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDiaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.diasForeignKey==null||this.diasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DiaConstantesFunciones.getArrayColumnasGlobalesDia(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DiaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DiaConstantesFunciones.SFINALQUERY;

				this.cargarCombosDiasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCuentaFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CuentaFlujoCajaParameterReturnGeneral cuentaflujocajaReturnGeneral=new CuentaFlujoCajaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cuentaflujocajaConstantesFunciones.cargarid_empresaCuentaFlujoCaja)
					 || (this.esRecargarFks && this.cuentaflujocajaConstantesFunciones.cargarid_empresaCuentaFlujoCaja)) {

					if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cuentaflujocajaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.cuentaflujocajaConstantesFunciones.cargarid_mesCuentaFlujoCaja)
					 || (this.esRecargarFks && this.cuentaflujocajaConstantesFunciones.cargarid_mesCuentaFlujoCaja)) {

					if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+cuentaflujocajaSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}


				String finalQueryGlobalDia="";

				if(((this.diasForeignKey==null||this.diasForeignKey.size()<=0) && this.cuentaflujocajaConstantesFunciones.cargarid_diaCuentaFlujoCaja)
					 || (this.esRecargarFks && this.cuentaflujocajaConstantesFunciones.cargarid_diaCuentaFlujoCaja)) {

					if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionDia()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DiaConstantesFunciones.getArrayColumnasGlobalesDia(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDia=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DiaConstantesFunciones.TABLENAME);

						finalQueryGlobalDia=Funciones.GetFinalQueryAppend(finalQueryGlobalDia, "");
						finalQueryGlobalDia+=DiaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDiasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDia=" WHERE " + ConstantesSql.ID + "="+cuentaflujocajaSessionBean.getlidDiaActual();
					}
				} else {
					finalQueryGlobalDia="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.cuentaflujocajaConstantesFunciones.cargarid_cuenta_contableCuentaFlujoCaja)
					 || (this.esRecargarFks && this.cuentaflujocajaConstantesFunciones.cargarid_cuenta_contableCuentaFlujoCaja)) {

					if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+cuentaflujocajaSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cuentaflujocajaReturnGeneral=cuentaflujocajaLogic.cargarCombosLoteForeignKeyCuentaFlujoCaja(finalQueryGlobalEmpresa,finalQueryGlobalMes,finalQueryGlobalDia,finalQueryGlobalCuentaContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cuentaflujocajaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=cuentaflujocajaReturnGeneral.getmessForeignKey();
			}

			if(!finalQueryGlobalDia.equals("NONE")) {
				this.diasForeignKey=cuentaflujocajaReturnGeneral.getdiasForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=cuentaflujocajaReturnGeneral.getcuentacontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCuentaFlujoCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyDia();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cuentaflujocajaSessionBean==null) {
				this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
			}

			if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyDia()throws Exception {
		try {

			if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionDia()) {
				Dia dia=new Dia();
				DiaConstantesFunciones.setDiaDescripcion(dia,Constantes.SMENSAJE_ESCOJA_OPCION);
				dia.setId(null);

				if(!DiaConstantesFunciones.ExisteEnLista(this.diasForeignKey,dia,true)) {

					this.diasForeignKey.add(0,dia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.cuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				CuentaContable cuentacontable=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontable.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablesForeignKey,cuentacontable,true)) {

					this.cuentacontablesForeignKey.add(0,cuentacontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCuentaFlujoCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCuentaFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCuentaFlujoCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaFlujoCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja)throws Exception {	
		try {
			
			this.setActualDiaForeignKey(cuentaflujocaja.getid_dia(),false,"Formulario");
			this.setActualCuentaContableForeignKey(cuentaflujocaja.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cuentaflujocaja.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableCuentaFlujoCaja")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(cuentaflujocaja.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCuentaFlujoCaja()throws Exception {	
		try {
			
			this.setActualDiaForeignKey(this.cuentaflujocajaConstantesFunciones.getid_dia(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.cuentaflujocajaConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaFlujoCaja()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCuentaFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCuentaFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCuentaFlujoCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCuentaFlujoCaja()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameDiasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCuentaFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDiasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCuentaFlujoCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public CuentaFlujoCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CuentaFlujoCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CuentaFlujoCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean(); 
		this.cuentaflujocajaConstantesFunciones=new CuentaFlujoCajaConstantesFunciones(); 
		this.cuentaflujocajaBean=new CuentaFlujoCaja();//(this.cuentaflujocajaConstantesFunciones); 		
		this.cuentaflujocajaReturnGeneral=new CuentaFlujoCajaParameterReturnGeneral(); 
		
		this.cuentaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CuentaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CuentaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CuentaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCuentaFlujoCaja(true);
			
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
			
			this.cuentaflujocajaConstantesFunciones=new CuentaFlujoCajaConstantesFunciones(); 
			this.cuentaflujocajaBean=new CuentaFlujoCaja();//this.cuentaflujocajaConstantesFunciones); 			
			this.cuentaflujocajaReturnGeneral=new CuentaFlujoCajaParameterReturnGeneral(); 
		
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Flujo Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cuentaflujocaja=new CuentaFlujoCaja();
			this.cuentaflujocajas = new ArrayList<CuentaFlujoCaja>();
			this.cuentaflujocajasAux = new ArrayList<CuentaFlujoCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic=new CuentaFlujoCajaLogic();
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.cuentaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cuentaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCuentaFlujoCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaFlujoCaja);	
					}
					
					if(this.jInternalFrameImportacionCuentaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaFlujoCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCuentaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCuentaFlujoCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaFlujoCaja);
				this.jInternalFrameDetalleFormCuentaFlujoCaja.setVisible(false);
				this.jInternalFrameDetalleFormCuentaFlujoCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaFlujoCaja);
					this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCuentaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCuentaFlujoCaja);
					this.jInternalFrameImportacionCuentaFlujoCaja.setVisible(false);
					this.jInternalFrameImportacionCuentaFlujoCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCuentaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCuentaFlujoCaja);
					this.jInternalFrameOrderByCuentaFlujoCaja.setVisible(false);
					this.jInternalFrameOrderByCuentaFlujoCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCuentaFlujoCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CuentaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cuentaflujocajaReturnGeneral=new CuentaFlujoCajaParameterReturnGeneral();
			
			this.cuentaflujocajaParameterGeneral=new CuentaFlujoCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cuentaflujocajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CuentaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleCuentaFlujoCajaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentaflujocajaSessionBean.getEsGuardarRelacionado(),this.cuentaflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentaflujocajaSessionBean.getEsGuardarRelacionado(),this.cuentaflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarCuentaFlujoCaja=true;
			this.isVisibilidadCeldaCopiarCuentaFlujoCaja=true;
			this.isVisibilidadCeldaVerFormCuentaFlujoCaja=true;
			this.isVisibilidadCeldaOrdenCuentaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=false;
			this.isVisibilidadCeldaModificarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdDia=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCuentaFlujoCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCuentaFlujoCaja(false);
			
			this.setPermisosUsuarioCuentaFlujoCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() 
				|| (this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() && this.cuentaflujocajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCuentaFlujoCajaClasesRelacionadas();
			}
			
			if(this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCuentaFlujoCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCuentaFlujoCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCuentaFlujoCaja();
			}
			
			if(!this.isPermisoBusquedaCuentaFlujoCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCuentaFlujoCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCuentaFlujoCaja,this.isPermisoPaginacionMedioCuentaFlujoCaja,this.isPermisoPaginacionTodoCuentaFlujoCaja);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CuentaFlujoCajaConstantesFunciones.getTiposSeleccionarCuentaFlujoCaja());
				
				this.tiposColumnasSelect=CuentaFlujoCajaConstantesFunciones.getTiposSeleccionarCuentaFlujoCaja(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCuentaFlujoCaja();				
				//this.tiposRelacionesSelect=CuentaFlujoCajaConstantesFunciones.getTiposRelacionesCuentaFlujoCaja(true);
				
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
			//if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCuentaFlujoCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCuentaFlujoCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCuentaFlujoCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaFlujoCaja() ;
			
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
			
			
			this.detallecuentaflujocajaLogic=new DetalleCuentaFlujoCajaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.mesLogic=new MesLogic();
			this.diaLogic=new DiaLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cuentaflujocajaImplementable= (CuentaFlujoCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cuentaflujocajaImplementableHome= (CuentaFlujoCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cuentaflujocajas= new ArrayList<CuentaFlujoCaja>();
			this.cuentaflujocajasEliminados= new ArrayList<CuentaFlujoCaja>();
						
			this.isEsNuevoCuentaFlujoCaja=false;
			this.esParaAccionDesdeFormularioCuentaFlujoCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.diasForeignKey=new ArrayList<Dia>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCuentaFlujoCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCuentaFlujoCaja();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CuentaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCuentaFlujoCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCuentaFlujoCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCuentaFlujoCaja();
			}
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCuentaFlujoCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCuentaFlujoCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCuentaFlujoCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCuentaFlujoCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CuentaFlujoCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCuentaFlujoCaja() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCuentaFlujoCaja")) {
				iIndex=this.jInternalFrameDetalleFormCuentaFlujoCaja.jTabbedPaneRelacionesCuentaFlujoCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCuentaFlujoCaja.jTabbedPaneRelacionesCuentaFlujoCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Cuenta Flujo Cajas")) {
					if(!DetalleCuentaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCuentaFlujoCaja();

						this.cargarParteTabPanelRelacionadaDetalleCuentaFlujoCaja(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCuentaFlujoCaja();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleCuentaFlujoCaja(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCuentaFlujoCaja.cargarSessionConBeanSwingJInternalFrameDetalleCuentaFlujoCaja(false,true,iIndex);
		this.jButtonDetalleCuentaFlujoCajaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleCuentaFlujoCaja();

		//this.jTabbedPaneRelacionesCuentaFlujoCaja.updateUI();
		//this.jTabbedPaneRelacionesCuentaFlujoCaja.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCuentaFlujoCaja.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleCuentaFlujoCaja")) {
				int row=this.jTableDatosCuentaFlujoCaja.getSelectedRow();
				jButtonDetalleCuentaFlujoCajaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Cuenta Flujo Caja")) {

					if(this.isTienePermisosDetalleCuentaFlujoCaja && this.cuentaflujocajaConstantesFunciones.mostrarDetalleCuentaFlujoCajaCuentaFlujoCaja && !CuentaFlujoCajaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Cuenta Flujo Cajas"+"("+DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Cuenta Flujo Cajas");

						if(cuentaflujocajaConstantesFunciones.resaltarDetalleCuentaFlujoCajaCuentaFlujoCaja!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cuentaflujocajaConstantesFunciones.resaltarDetalleCuentaFlujoCajaCuentaFlujoCaja);
						}

						jmenuItem.setEnabled(this.cuentaflujocajaConstantesFunciones.activarDetalleCuentaFlujoCajaCuentaFlujoCaja);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleCuentaFlujoCaja"));

						

						this.jInternalFrameDetalleFormCuentaFlujoCaja.jmenuDetalleCuentaFlujoCaja.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCuentaFlujoCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCuentaFlujoCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCuentaFlujoCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCuentaFlujoCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCuentaFlujoCaja();
		
		this.cargarCombosFrameForeignKeyCuentaFlujoCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCuentaFlujoCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCuentaFlujoCaja();
		}
	}
	
	

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDiaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDia();
				this.cargarCombosFrameDiasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDia(this.diasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCuentaFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
			
			if(jTableDatosCuentaFlujoCaja.getRowCount()>=1) {
				jTableDatosCuentaFlujoCaja.removeRowSelectionInterval(0, jTableDatosCuentaFlujoCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoCuentaFlujoCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCuentaFlujoCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCuentaFlujoCaja(true);			
			//this.cuentaflujocaja=new CuentaFlujoCaja();
			//this.cuentaflujocaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaFlujoCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaFlujoCaja() ;
			
			if(CuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaFlujoCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cuentaflujocaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);				
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
			if(this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CuentaFlujoCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCuentaFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCuentaFlujoCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCuentaFlujoCaja.getSelectedRows().length;			
			}
			
			cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCuentaFlujoCaja--;			
				//CuentaFlujoCaja cuentaflujocajaAux= new CuentaFlujoCaja();			
				//cuentaflujocajaAux.setId(this.iIdNuevoCuentaFlujoCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CuentaFlujoCaja cuentaflujocajaOrigen=new CuentaFlujoCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CuentaFlujoCaja cuentaflujocajaOrigen : cuentaflujocajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cuentaflujocajaOrigen =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentaflujocajaOrigen =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCuentaFlujoCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cuentaflujocaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCuentaFlujoCaja(cuentaflujocajaOrigen,this.cuentaflujocaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentaflujocajaLogic.getCuentaFlujoCajas().add(this.cuentaflujocajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentaflujocajas.add(this.cuentaflujocajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
				
				this.jTableDatosCuentaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoCuentaFlujoCaja(), this.getIndiceNuevoCuentaFlujoCaja());
				
				int iLastRow =  this.jTableDatosCuentaFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();									
		
			CuentaFlujoCaja cuentaflujocajaOrigen=new CuentaFlujoCaja();
			CuentaFlujoCaja cuentaflujocajaDestino=new CuentaFlujoCaja();
				
			cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCuentaFlujoCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cuentaflujocajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCuentaFlujoCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaflujocajaOrigen =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentaflujocajaOrigen =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentaflujocajaDestino =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentaflujocajaDestino =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cuentaflujocajaOrigen =cuentaflujocajasSeleccionados.get(0);
				cuentaflujocajaDestino =cuentaflujocajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCuentaFlujoCaja(cuentaflujocajaOrigen,cuentaflujocajaDestino,true,false);
				
				cuentaflujocajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentaflujocajaDestino,cuentaflujocajaLogic.getCuentaFlujoCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentaflujocajaDestino,cuentaflujocajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
				
				//this.jTableDatosCuentaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoCuentaFlujoCaja(), this.getIndiceNuevoCuentaFlujoCaja());
				
				int iLastRow =  this.jTableDatosCuentaFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCuentaFlujoCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCuentaFlujoCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCuentaFlujoCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCuentaFlujoCaja.setVisible(!isVisible);
			this.jPanelPaginacionCuentaFlujoCaja.setVisible(!isVisible);
			this.jPanelAccionesCuentaFlujoCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCuentaFlujoCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCuentaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCuentaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCuentaFlujoCaja();
			
			this.abrirFrameOrderByCuentaFlujoCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCuentaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCuentaFlujoCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaFlujoCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCuentaFlujoCaja.isMaximum()) {
					this.jInternalFrameDetalleFormCuentaFlujoCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCuentaFlujoCaja.setSize(this.jInternalFrameDetalleFormCuentaFlujoCaja.iWidthFormulario,this.jInternalFrameDetalleFormCuentaFlujoCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCuentaFlujoCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCuentaFlujoCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCuentaFlujoCaja.isMaximum()) {
						this.jInternalFrameDetalleFormCuentaFlujoCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCuentaFlujoCaja.jContentPaneDetalleCuentaFlujoCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCuentaFlujoCaja.jTabbedPaneRelacionesCuentaFlujoCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCuentaFlujoCaja.jContentPaneDetalleCuentaFlujoCaja.getWidth(),CuentaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaFlujoCaja.jTabbedPaneRelacionesCuentaFlujoCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCuentaFlujoCaja.jContentPaneDetalleCuentaFlujoCaja.getWidth(),CuentaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaFlujoCaja.jTabbedPaneRelacionesCuentaFlujoCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCuentaFlujoCaja.jContentPaneDetalleCuentaFlujoCaja.getWidth(),CuentaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleCuentaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleCuentaFlujoCaja();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCuentaFlujoCaja.setVisible(true);
	        this.jInternalFrameDetalleFormCuentaFlujoCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCuentaFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCuentaFlujoCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCuentaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaFlujoCaja,false,this);
				} else {
					this.jInternalFrameOrderByCuentaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaFlujoCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCuentaFlujoCaja);
				this.jInternalFrameOrderByCuentaFlujoCaja.setVisible(false);
				this.jInternalFrameOrderByCuentaFlujoCaja.setSelected(false);
				
				this.jInternalFrameOrderByCuentaFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaFlujoCaja"));
				
				this.inicializarActualizarBindingTablaOrderByCuentaFlujoCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCuentaFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCuentaFlujoCaja==null) {
				
				this.jInternalFrameImportacionCuentaFlujoCaja=new ImportacionJInternalFrame(CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaFlujoCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCuentaFlujoCaja);
				this.jInternalFrameImportacionCuentaFlujoCaja.setVisible(false);
				this.jInternalFrameImportacionCuentaFlujoCaja.setSelected(false);


				this.jInternalFrameImportacionCuentaFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaFlujoCaja"));
				this.jInternalFrameImportacionCuentaFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaFlujoCaja"));
				this.jInternalFrameImportacionCuentaFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaFlujoCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCuentaFlujoCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja==null) {
				this.jInternalFrameReporteDinamicoCuentaFlujoCaja=new ReporteDinamicoJInternalFrame(CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaFlujoCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaFlujoCaja);
				this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaFlujoCaja"));
				this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaFlujoCaja"));
				this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaFlujoCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaFlujoCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleCuentaFlujoCaja() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosDetalleCuentaFlujoCaja.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCuentaFlujoCaja.jContentPaneDetalleCuentaFlujoCaja.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosDetalleCuentaFlujoCaja.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosDetalleCuentaFlujoCaja.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosDetalleCuentaFlujoCaja.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCuentaFlujoCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaFlujoCaja);
			
	       	this.jInternalFrameDetalleFormCuentaFlujoCaja.setVisible(false);
	        this.jInternalFrameDetalleFormCuentaFlujoCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormCuentaFlujoCaja.dispose();
			//this.jInternalFrameDetalleFormCuentaFlujoCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCuentaFlujoCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCuentaFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCuentaFlujoCaja.setVisible(true);
	        this.jInternalFrameImportacionCuentaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCuentaFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCuentaFlujoCaja.setVisible(true);
	        this.jInternalFrameOrderByCuentaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCuentaFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCuentaFlujoCaja.setVisible(false);
	        this.jInternalFrameOrderByCuentaFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCuentaFlujoCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCuentaFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCuentaFlujoCaja.setVisible(false);
	        this.jInternalFrameImportacionCuentaFlujoCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContable(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContable";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderCuentaFlujoCaja=(TitledBorder)this.jScrollPanelDatosCuentaFlujoCaja.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderCuentaFlujoCaja.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContable(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCuentaFlujoCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCuentaFlujoCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCuentaFlujoCaja(true);
			//this.isEsNuevoCuentaFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCuentaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaFlujoCaja(false) ;
			
			if(cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado() && DetalleCuentaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleCuentaFlujoCajaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaFlujoCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCuentaFlujoCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCuentaFlujoCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCuentaFlujoCaja(true);
			//this.isEsNuevoCuentaFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cuentaflujocaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCuentaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCuentaFlujoCaja(false) ;
			
			if(CuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaFlujoCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.cuentaflujocajaConstantesFunciones.cargarid_cuenta_contableCuentaFlujoCaja) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaFlujoCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaDia(List<Dia> diasForeignKey)throws Exception{
		TableColumn tableColumnDia=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA));
		TableCellEditor tableCellEditorDia =tableColumnDia.getCellEditor();

		DiaTableCell diaTableCellFk=(DiaTableCell)tableCellEditorDia;

		if(diaTableCellFk!=null) {
			diaTableCellFk.setdiasForeignKey(diasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaFlujoCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//diaTableCellFk.setRowActual(intSelectedRow);
			//diaTableCellFk.setdiasForeignKeyActual(diasForeignKey);
		//}


		if(diaTableCellFk!=null) {
			diaTableCellFk.RecargarDiasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaFlujoCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCuentaFlujoCaja(false);
			
			//if(!this.isEsNuevoCuentaFlujoCaja) {								
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
				
			}
			
			if(this.permiteMantenimiento(this.cuentaflujocaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCuentaFlujoCaja=true;
					this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
					this.isEsNuevoCuentaFlujoCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCuentaFlujoCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCuentaFlujoCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesCuentaFlujoCaja(false);
			
												
				
				if(CuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCuentaFlujoCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCuentaFlujoCajaActionPerformed(evt,cuentaflujocajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCuentaFlujoCaja(this.cuentaflujocaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCuentaFlujoCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cuentaflujocajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cuentaflujocaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CuentaFlujoCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaFlujoCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.cuentaflujocaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.cuentaflujocaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cuentaflujocaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CuentaFlujoCajaModel) this.jTableDatosCuentaFlujoCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCuentaFlujoCaja=true;
				this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
				this.isEsNuevoCuentaFlujoCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesCuentaFlujoCaja(false);
				
				
				
				if(CuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCuentaFlujoCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCuentaFlujoCaja.getRowCount()>=1) {
				jTableDatosCuentaFlujoCaja.removeRowSelectionInterval(0, jTableDatosCuentaFlujoCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCuentaFlujoCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaFlujoCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaFlujoCaja(false) ;
			
			this.isEsNuevoCuentaFlujoCaja=false;
			
			if(CuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCuentaFlujoCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCuentaFlujoCaja(false);
				
				//SI ES MANUAL
				if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCuentaFlujoCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCuentaFlujoCaja--;			
			//CuentaFlujoCaja cuentaflujocajaAux= new CuentaFlujoCaja();			
			//cuentaflujocajaAux.setId(this.iIdNuevoCuentaFlujoCaja);
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCuentaFlujoCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
			
			this.cuentaflujocaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cuentaflujocajaLogic.getCuentaFlujoCajas().add(this.cuentaflujocajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cuentaflujocajas.add(this.cuentaflujocajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
			
			this.jTableDatosCuentaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoCuentaFlujoCaja(), this.getIndiceNuevoCuentaFlujoCaja());
			
			int iLastRow =  this.jTableDatosCuentaFlujoCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCuentaFlujoCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCuentaFlujoCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaFlujoCaja(false);
			
			//SI ES MANUAL
			if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaFlujoCaja();
			}
			
			//this.abrirFrameTreeCuentaFlujoCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cuenta Flujo CajaS ?", "MANTENIMIENTO DE Cuenta Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCuentaFlujoCaja.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCuentaFlujoCaja();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cuentaflujocajaReturnGeneral=cuentaflujocajaLogic.procesarImportacionCuentaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cuentaflujocajaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCuentaFlujoCajaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCuentaFlujoCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCuentaFlujoCaja.setFileImportacion(this.jInternalFrameImportacionCuentaFlujoCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCuentaFlujoCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCuentaFlujoCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCuentaFlujoCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCuentaFlujoCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();		

		cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CuentaFlujoCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CuentaFlujoCajaBaseDesign.jrxml";
			
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
			
			this.generarReporteCuentaFlujoCajas("Todos",cuentaflujocajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Dia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Dia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Dia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Dia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rmula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rmula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rmula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rmula_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_FlujoCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_FlujoCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_FlujoCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_FlujoCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nAgrupar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nAgrupar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nAgrupar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nAgrupar_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA:
					sNombreCampoCategoria="id_dia";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA:
					sNombreCampoCategoria="formula";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA:
					sNombreCampoCategoria="es_flujo_caja";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR:
					sNombreCampoCategoria="con_agrupar";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA:
					sNombreCampoCategoriaValor="id_dia";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA:
					sNombreCampoCategoriaValor="formula";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA:
					sNombreCampoCategoriaValor="es_flujo_caja";
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR:
					sNombreCampoCategoriaValor="con_agrupar";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_dia");
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"formula");
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Flujo Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_flujo_caja");
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Agrupar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_agrupar");
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
	
	public void jButtonGenerarExcelReporteDinamicoCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();		
		
		cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaflujocaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CuentaFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CuentaFlujoCaja cuentaflujocaja:cuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaflujocaja.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CuentaFlujoCaja cuentaflujocaja:cuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaflujocaja.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(CuentaFlujoCaja cuentaflujocaja:cuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaflujocaja.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA);
					iRow++;

					for(CuentaFlujoCaja cuentaflujocaja:cuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaflujocaja.getdia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(CuentaFlujoCaja cuentaflujocaja:cuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaflujocaja.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA);
					iRow++;

					for(CuentaFlujoCaja cuentaflujocaja:cuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaflujocaja.getformula());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA);
					iRow++;

					for(CuentaFlujoCaja cuentaflujocaja:cuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaflujocaja.getes_flujo_caja());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR);
					iRow++;

					for(CuentaFlujoCaja cuentaflujocaja:cuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentaflujocaja.getcon_agrupar());
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
			//	this.getFilaCabeceraExportarExcelCuentaFlujoCaja(row);				
			//	iRow++;
			//}				
			
			//for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCuentaFlujoCaja(cuentaflujocajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
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
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaFlujoCaja(false);
			
			//SI ES MANUAL
			if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaFlujoCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaFlujoCaja(false);
			
			//SI ES MANUAL
			if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaFlujoCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaFlujoCaja(false);
			
			//SI ES MANUAL
			if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaFlujoCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCuentaFlujoCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCuentaFlujoCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCuentaFlujoCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCuentaFlujoCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCuentaFlujoCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCuentaFlujoCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosCuentaFlujoCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosCuentaFlujoCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCuentaFlujoCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCuentaFlujoCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCuentaFlujoCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCuentaFlujoCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCuentaFlujoCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCuentaFlujoCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaFlujoCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCuentaFlujoCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCuentaFlujoCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCuentaFlujoCaja();
		
		this.inicializarActualizarBindingBotonesManualCuentaFlujoCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaFlujoCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaFlujoCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaFlujoCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaFlujoCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCuentaFlujoCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCuentaFlujoCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCuentaFlujoCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxPostAccionNuevoCuentaFlujoCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxPostAccionSinCerrarCuentaFlujoCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxPostAccionSinMensajeCuentaFlujoCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCuentaFlujoCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCuentaFlujoCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCuentaFlujoCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
				this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxPostAccionNuevoCuentaFlujoCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxPostAccionSinCerrarCuentaFlujoCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxPostAccionSinMensajeCuentaFlujoCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCuentaFlujoCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCuentaFlujoCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCuentaFlujoCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCuentaFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCuentaFlujoCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCuentaFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCuentaFlujoCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCuentaFlujoCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCuentaFlujoCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCuentaFlujoCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaFlujoCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCuentaFlujoCaja() throws Exception {
		try	{
			if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaFlujoCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaFlujoCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaFlujoCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCuentaFlujoCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCuentaFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCuentaFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCuentaFlujoCaja.addItem(reporte);
			}
			
			
			if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCuentaFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCuentaFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCuentaFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCuentaFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCuentaFlujoCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCuentaFlujoCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaFlujoCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaFlujoCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCuentaFlujoCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreCuentaFlujoCaja.getText();
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaFlujoCaja.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCuentaFlujoCaja(Boolean esInicializar) throws Exception {				
		if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaFlujoCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCuentaFlujoCaja() throws Exception {
		this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCuentaFlujoCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCuentaFlujoCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCuentaFlujoCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cuentaflujocajaLogic.getCuentaFlujoCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cuentaflujocajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCuentaFlujoCaja.setModel(new CuentaFlujoCajaModel(this.cuentaflujocajaLogic.getCuentaFlujoCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCuentaFlujoCaja.setModel(new CuentaFlujoCajaModel(this.cuentaflujocajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCuentaFlujoCaja!=null && this.jInternalFrameOrderByCuentaFlujoCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCuentaFlujoCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,cuentaflujocajaConstantesFunciones.resaltarSeleccionarCuentaFlujoCaja,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,cuentaflujocajaConstantesFunciones.resaltarSeleccionarCuentaFlujoCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_ID));

		if(this.cuentaflujocajaConstantesFunciones.mostraridCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaFlujoCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuentaflujocajaConstantesFunciones.resaltaridCuentaFlujoCaja,this.cuentaflujocajaConstantesFunciones.activaridCuentaFlujoCaja,this,true,"idCuentaFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentaflujocajaConstantesFunciones.resaltaridCuentaFlujoCaja,this.cuentaflujocajaConstantesFunciones.activaridCuentaFlujoCaja,this,true,"idCuentaFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cuentaflujocajaConstantesFunciones.mostrarid_empresaCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cuentaflujocajaConstantesFunciones.resaltarid_empresaCuentaFlujoCaja,this,this.cuentaflujocajaConstantesFunciones.activarid_empresaCuentaFlujoCaja));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cuentaflujocajaConstantesFunciones.resaltarid_empresaCuentaFlujoCaja,this,this.cuentaflujocajaConstantesFunciones.activarid_empresaCuentaFlujoCaja,false,"id_empresaCuentaFlujoCaja","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE));

		if(this.cuentaflujocajaConstantesFunciones.mostrarnombreCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cuentaflujocajaConstantesFunciones.resaltarnombreCuentaFlujoCaja,this.cuentaflujocajaConstantesFunciones.activarnombreCuentaFlujoCaja,this,true,"nombreCuentaFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentaflujocajaConstantesFunciones.resaltarnombreCuentaFlujoCaja,this.cuentaflujocajaConstantesFunciones.activarnombreCuentaFlujoCaja,this,true,"nombreCuentaFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_IDMES));

		if(this.cuentaflujocajaConstantesFunciones.mostrarid_mesCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaFlujoCajaConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.cuentaflujocajaConstantesFunciones.resaltarid_mesCuentaFlujoCaja,this,this.cuentaflujocajaConstantesFunciones.activarid_mesCuentaFlujoCaja));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.cuentaflujocajaConstantesFunciones.resaltarid_mesCuentaFlujoCaja,this,this.cuentaflujocajaConstantesFunciones.activarid_mesCuentaFlujoCaja,true,"id_mesCuentaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA));

		if(this.cuentaflujocajaConstantesFunciones.mostrarid_diaCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DiaTableCell(this.diasForeignKey,this.cuentaflujocajaConstantesFunciones.resaltarid_diaCuentaFlujoCaja,this,this.cuentaflujocajaConstantesFunciones.activarid_diaCuentaFlujoCaja));
			tableColumn.setCellEditor(new DiaTableCell(this.diasForeignKey,this.cuentaflujocajaConstantesFunciones.resaltarid_diaCuentaFlujoCaja,this,this.cuentaflujocajaConstantesFunciones.activarid_diaCuentaFlujoCaja,true,"id_diaCuentaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.cuentaflujocajaConstantesFunciones.mostrarid_cuenta_contableCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cuentaflujocajaConstantesFunciones.resaltarid_cuenta_contableCuentaFlujoCaja,this,this.cuentaflujocajaConstantesFunciones.activarid_cuenta_contableCuentaFlujoCaja));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cuentaflujocajaConstantesFunciones.resaltarid_cuenta_contableCuentaFlujoCaja,this,this.cuentaflujocajaConstantesFunciones.activarid_cuenta_contableCuentaFlujoCaja,true,"id_cuenta_contableCuentaFlujoCaja","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA));

		if(this.cuentaflujocajaConstantesFunciones.mostrarformulaCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cuentaflujocajaConstantesFunciones.resaltarformulaCuentaFlujoCaja,this.cuentaflujocajaConstantesFunciones.activarformulaCuentaFlujoCaja,this,true,"formulaCuentaFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentaflujocajaConstantesFunciones.resaltarformulaCuentaFlujoCaja,this.cuentaflujocajaConstantesFunciones.activarformulaCuentaFlujoCaja,this,true,"formulaCuentaFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA));

		if(this.cuentaflujocajaConstantesFunciones.mostrares_flujo_cajaCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cuentaflujocajaConstantesFunciones.resaltares_flujo_cajaCuentaFlujoCaja,this.cuentaflujocajaConstantesFunciones.activares_flujo_cajaCuentaFlujoCaja));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cuentaflujocajaConstantesFunciones.resaltares_flujo_cajaCuentaFlujoCaja,this.cuentaflujocajaConstantesFunciones.activares_flujo_cajaCuentaFlujoCaja,this,true,"es_flujo_cajaCuentaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR));

		if(this.cuentaflujocajaConstantesFunciones.mostrarcon_agruparCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cuentaflujocajaConstantesFunciones.resaltarcon_agruparCuentaFlujoCaja,this.cuentaflujocajaConstantesFunciones.activarcon_agruparCuentaFlujoCaja));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cuentaflujocajaConstantesFunciones.resaltarcon_agruparCuentaFlujoCaja,this.cuentaflujocajaConstantesFunciones.activarcon_agruparCuentaFlujoCaja,this,true,"con_agruparCuentaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleCuentaFlujoCaja && this.cuentaflujocajaConstantesFunciones.mostrarDetalleCuentaFlujoCajaCuentaFlujoCaja && !CuentaFlujoCajaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Cuenta Flujo Cajas");
				tableColumn.setHeaderValue("Detalle Cuenta Flujo Cajas");
				tableColumn.setCellRenderer(new DetalleCuentaFlujoCajaTableCell(cuentaflujocajaConstantesFunciones.resaltarDetalleCuentaFlujoCajaCuentaFlujoCaja,this,this.cuentaflujocajaConstantesFunciones.activarDetalleCuentaFlujoCajaCuentaFlujoCaja));
				tableColumn.setCellEditor(new DetalleCuentaFlujoCajaTableCell(cuentaflujocajaConstantesFunciones.resaltarDetalleCuentaFlujoCajaCuentaFlujoCaja,this,this.cuentaflujocajaConstantesFunciones.activarDetalleCuentaFlujoCajaCuentaFlujoCaja));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCuentaFlujoCaja.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaFlujoCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaFlujoCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCuentaFlujoCaja.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosCuentaFlujoCaja.addColumn(tableColumn);
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
			
			this.jTableDatosCuentaFlujoCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCuentaFlujoCaja.moveColumn(this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCuentaFlujoCaja.moveColumn(this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCuentaFlujoCaja.moveColumn(this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCuentaFlujoCaja.moveColumn(this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCuentaFlujoCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCuentaFlujoCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCuentaFlujoCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCuentaFlujoCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCuentaFlujoCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCuentaFlujoCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cuentaflujocajaLogic.getCuentaFlujoCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cuentaflujocajas.size()-1;
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
		//this.jTableDatosCuentaFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCuentaFlujoCaja();
			
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
				
				//this.isEsNuevoCuentaFlujoCaja=false;
					
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
				if(this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaFlujoCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cuentaflujocaja.getsType().equals("DUPLICADO")
				   || this.cuentaflujocaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCuentaFlujoCaja=true;
				
				} else {
					this.isEsNuevoCuentaFlujoCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					if(this.cuentaflujocaja.getId()>=0 && !this.cuentaflujocaja.getIsNew()) {						
						this.isEsNuevoCuentaFlujoCaja=false;
						
					} else {
						this.isEsNuevoCuentaFlujoCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCuentaFlujoCaja(esRelaciones);						
				
				this.seleccionarCuentaFlujoCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cuentaflujocaja.getId()<0) {
					this.isEsNuevoCuentaFlujoCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCuentaFlujoCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCuentaFlujoCaja(evt,rowIndex);
				}	
				
				if(this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CuentaFlujoCaja: " + this.dDif); 
					}
				}								
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCuentaFlujoCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cuentaflujocaja)) {
					if(this.cuentaflujocaja.getId()>0) {
						this.cuentaflujocaja.setIsDeleted(true);
						
						this.cuentaflujocajasEliminados.add(this.cuentaflujocaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentaflujocajaLogic.getCuentaFlujoCajas().remove(this.cuentaflujocaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentaflujocajas.remove(this.cuentaflujocaja);				
					}
					
					
					((CuentaFlujoCajaModel) this.jTableDatosCuentaFlujoCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCuentaFlujoCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCuentaFlujoCaja) {
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaFlujoCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCuentaFlujoCaja(this.cuentaflujocaja);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cuentaflujocajaConstantesFunciones.cargarid_empresaCuentaFlujoCaja || this.cuentaflujocajaConstantesFunciones.event_dependid_empresaCuentaFlujoCaja) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cuentaflujocaja.getid_empresa());
									//this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cuentaflujocaja.getEmpresa()!=null) {
							this.empresasForeignKey.add(cuentaflujocaja.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cuentaflujocaja.getid_empresa(),false,"Formulario");

					//Mes
					if(!this.cuentaflujocajaConstantesFunciones.cargarid_mesCuentaFlujoCaja || this.cuentaflujocajaConstantesFunciones.event_dependid_mesCuentaFlujoCaja) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.cuentaflujocaja.getid_mes());
									//this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(cuentaflujocaja.getMes()!=null) {
							this.messForeignKey.add(cuentaflujocaja.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.cuentaflujocaja.getid_mes(),false,"Formulario");

					//Dia
					if(!this.cuentaflujocajaConstantesFunciones.cargarid_diaCuentaFlujoCaja || this.cuentaflujocajaConstantesFunciones.event_dependid_diaCuentaFlujoCaja) {
						//this.cargarCombosDiasForeignKeyLista(" where id="+this.cuentaflujocaja.getid_dia());
									//this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
						this.diasForeignKey=new ArrayList<Dia>();

						if(cuentaflujocaja.getDia()!=null) {
							this.diasForeignKey.add(cuentaflujocaja.getDia());
						}

						this.addItemDefectoCombosForeignKeyDia();
						this.cargarCombosFrameDiasForeignKey("Todos");
					}
					this.setActualDiaForeignKey(this.cuentaflujocaja.getid_dia(),false,"Formulario");

					//CuentaContable
					if(!this.cuentaflujocajaConstantesFunciones.cargarid_cuenta_contableCuentaFlujoCaja || this.cuentaflujocajaConstantesFunciones.event_dependid_cuenta_contableCuentaFlujoCaja) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.cuentaflujocaja.getid_cuenta_contable());
									//this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(cuentaflujocaja.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(cuentaflujocaja.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.cuentaflujocaja.getid_cuenta_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCuentaFlujoCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCuentaFlujoCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaFlujoCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCuentaFlujoCaja(cuentaflujocaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCuentaFlujoCaja(cuentaflujocaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCuentaFlujoCaja(cuentaflujocaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCuentaFlujoCaja(cuentaflujocaja);
	}
	
	public void setVariablesObjetoActualToFormularioCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelidCuentaFlujoCaja.setText(cuentaflujocaja.getId().toString());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreanombreCuentaFlujoCaja.setText(cuentaflujocaja.getnombre());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreaformulaCuentaFlujoCaja.setText(cuentaflujocaja.getformula());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxes_flujo_cajaCuentaFlujoCaja.setSelected(cuentaflujocaja.getes_flujo_caja());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxcon_agruparCuentaFlujoCaja.setSelected(cuentaflujocaja.getcon_agrupar());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CuentaFlujoCaja cuentaflujocajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cuentaflujocajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CuentaFlujoCaja cuentaflujocajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cuentaflujocajaLocal=this.cuentaflujocaja;
			} else {
				cuentaflujocajaLocal=this.cuentaflujocajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cuentaflujocajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCuentaFlujoCaja(cuentaflujocajaLocal,true);
					
					if(cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cuentaflujocajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cuentaflujocajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(cuentaflujocaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(cuentaflujocaja);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(cuentaflujocaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelidCuentaFlujoCaja.getText()==null || this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelidCuentaFlujoCaja.getText()=="" || this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelidCuentaFlujoCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelidCuentaFlujoCaja.setText("0");
			}

			if(conColumnasBase) {cuentaflujocaja.setId(Long.parseLong(this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelidCuentaFlujoCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaFlujoCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelIdCuentaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentaflujocaja.setnombre(this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreanombreCuentaFlujoCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelnombreCuentaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentaflujocaja.setformula(this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreaformulaCuentaFlujoCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelformulaCuentaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentaflujocaja.setes_flujo_caja(this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxes_flujo_cajaCuentaFlujoCaja.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabeles_flujo_cajaCuentaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentaflujocaja.setcon_agrupar(this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxcon_agruparCuentaFlujoCaja.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelcon_agruparCuentaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocajaBean,CuentaFlujoCaja cuentaflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocajaOrigen,CuentaFlujoCaja cuentaflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentaflujocajaOrigen.getId()!=null && !cuentaflujocajaOrigen.getId().equals(0L))) {cuentaflujocaja.setId(cuentaflujocajaOrigen.getId());}}
			if(conDefault || (!conDefault && cuentaflujocajaOrigen.getnombre()!=null && !cuentaflujocajaOrigen.getnombre().equals(""))) {cuentaflujocaja.setnombre(cuentaflujocajaOrigen.getnombre());}
			if(conDefault || (!conDefault && cuentaflujocajaOrigen.getformula()!=null && !cuentaflujocajaOrigen.getformula().equals(""))) {cuentaflujocaja.setformula(cuentaflujocajaOrigen.getformula());}
			if(conDefault || (!conDefault && cuentaflujocajaOrigen.getes_flujo_caja()!=null && !cuentaflujocajaOrigen.getes_flujo_caja().equals(false))) {cuentaflujocaja.setes_flujo_caja(cuentaflujocajaOrigen.getes_flujo_caja());}
			if(conDefault || (!conDefault && cuentaflujocajaOrigen.getcon_agrupar()!=null && !cuentaflujocajaOrigen.getcon_agrupar().equals(false))) {cuentaflujocaja.setcon_agrupar(cuentaflujocajaOrigen.getcon_agrupar());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelidCuentaFlujoCaja.setText(cuentaflujocaja.getId().toString());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreanombreCuentaFlujoCaja.setText(cuentaflujocaja.getnombre());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreaformulaCuentaFlujoCaja.setText(cuentaflujocaja.getformula());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxes_flujo_cajaCuentaFlujoCaja.setSelected(cuentaflujocaja.getes_flujo_caja());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxcon_agruparCuentaFlujoCaja.setSelected(cuentaflujocaja.getcon_agrupar());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaFlujoCaja(CuentaFlujoCajaBean cuentaflujocajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelidCuentaFlujoCaja.setText(cuentaflujocajaBean.getId().toString());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreanombreCuentaFlujoCaja.setText(cuentaflujocajaBean.getnombre());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreaformulaCuentaFlujoCaja.setText(cuentaflujocajaBean.getformula());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxes_flujo_cajaCuentaFlujoCaja.setSelected(cuentaflujocajaBean.getes_flujo_caja());
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxcon_agruparCuentaFlujoCaja.setSelected(cuentaflujocajaBean.getcon_agrupar());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCuentaFlujoCaja(CuentaFlujoCajaParameterReturnGeneral cuentaflujocajaReturnGeneral,CuentaFlujoCajaBean cuentaflujocajaBean,Boolean conDefault) throws Exception { 
		try {
			CuentaFlujoCaja cuentaflujocajaLocal=new CuentaFlujoCaja();
			
			cuentaflujocajaLocal=cuentaflujocajaReturnGeneral.getCuentaFlujoCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentaflujocajaLocal.getId()!=null && !cuentaflujocajaLocal.getId().equals(0L))) {cuentaflujocajaBean.setId(cuentaflujocajaLocal.getId());}}
			if(conDefault || (!conDefault && cuentaflujocajaLocal.getnombre()!=null && !cuentaflujocajaLocal.getnombre().equals(""))) {cuentaflujocajaBean.setnombre(cuentaflujocajaLocal.getnombre());}
			if(conDefault || (!conDefault && cuentaflujocajaLocal.getformula()!=null && !cuentaflujocajaLocal.getformula().equals(""))) {cuentaflujocajaBean.setformula(cuentaflujocajaLocal.getformula());}
			if(conDefault || (!conDefault && cuentaflujocajaLocal.getes_flujo_caja()!=null && !cuentaflujocajaLocal.getes_flujo_caja().equals(false))) {cuentaflujocajaBean.setes_flujo_caja(cuentaflujocajaLocal.getes_flujo_caja());}
			if(conDefault || (!conDefault && cuentaflujocajaLocal.getcon_agrupar()!=null && !cuentaflujocajaLocal.getcon_agrupar().equals(false))) {cuentaflujocajaBean.setcon_agrupar(cuentaflujocajaLocal.getcon_agrupar());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCuentaFlujoCajaGenerico(Long idCuentaFlujoCajaSeleccionado,JComboBox jComboBoxCuentaFlujoCaja,List<CuentaFlujoCaja> cuentaflujocajasLocal)throws Exception {
		try {
			CuentaFlujoCaja  cuentaflujocajaTemp=null;

			for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajasLocal) {
				if(cuentaflujocajaAux.getId()!=null && cuentaflujocajaAux.getId().equals(idCuentaFlujoCajaSeleccionado)) {
					cuentaflujocajaTemp=cuentaflujocajaAux;
					break;
				}
			}

			jComboBoxCuentaFlujoCaja.setSelectedItem(cuentaflujocajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCuentaFlujoCajaGenerico(JComboBox jComboBoxCuentaFlujoCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaFlujoCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCuentaFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaFlujoCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCuentaFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleCuentaFlujoCaja")) {
			jButtonDetalleCuentaFlujoCajaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentaflujocaja=(CuentaFlujoCaja) cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentaflujocaja =(CuentaFlujoCaja) cuentaflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cuentaflujocaja.getIsNew() && !cuentaflujocaja.getIsChanged() && !cuentaflujocaja.getIsDeleted()) {
				sDescripcion=cuentaflujocaja.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaflujocaja.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!cuentaflujocaja.getIsNew() && !cuentaflujocaja.getIsChanged() && !cuentaflujocaja.getIsDeleted()) {
				sDescripcion=cuentaflujocaja.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaflujocaja.getmes_descripcion();
			}
		}

		if(sTipo.equals("Dia")) {
			//sDescripcion=this.getActualDiaForeignKeyDescripcion((Long)value);
			if(!cuentaflujocaja.getIsNew() && !cuentaflujocaja.getIsChanged() && !cuentaflujocaja.getIsDeleted()) {
				sDescripcion=cuentaflujocaja.getdia_descripcion();
			} else {
				//sDescripcion=this.getActualDiaForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaflujocaja.getdia_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!cuentaflujocaja.getIsNew() && !cuentaflujocaja.getIsChanged() && !cuentaflujocaja.getIsDeleted()) {
				sDescripcion=cuentaflujocaja.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=cuentaflujocaja.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CuentaFlujoCaja cuentaflujocajaRow=new CuentaFlujoCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentaflujocajaRow=(CuentaFlujoCaja) cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentaflujocajaRow=(CuentaFlujoCaja) cuentaflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CuentaFlujoCaja cuentaflujocaja) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocaja = (CuentaFlujoCaja)this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.cuentaflujocaja = (CuentaFlujoCaja)this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(cuentaflujocaja!=null) {
						this.cuentaflujocaja = cuentaflujocaja;
					} else {
						this.cuentaflujocaja = new CuentaFlujoCaja();
					}
				}

				if(this.isTienePermisosDetalleCuentaFlujoCaja && this.permiteMantenimiento(this.cuentaflujocaja)) {
					DetalleCuentaFlujoCajaBeanSwingJInternalFrame detallecuentaflujocajaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFramePopup=new DetalleCuentaFlujoCajaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallecuentaflujocajaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFramePopup;
					} else {
						detallecuentaflujocajaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame;
					}

					List<CuentaFlujoCaja> cuentaflujocajas=new ArrayList<CuentaFlujoCaja>();
					cuentaflujocajas.add(this.cuentaflujocaja);
					if(!esRelacionado) {
						//detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaSessionBean.setConGuardarRelaciones(false);
						//detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallecuentaflujocajaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCuentaFlujoCaja.cargarDetalleCuentaFlujoCajaBeanSwingJInternalFrame(cuentaflujocajas,this.cuentaflujocaja,detallecuentaflujocajaBeanSwingJInternalFrame,/*conInicializar,*/detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaSessionBean.getConGuardarRelaciones(),detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
					detallecuentaflujocajaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallecuentaflujocajaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCuentaFlujoCaja("no_relacionado");

						detallecuentaflujocajaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleCuentaFlujoCajaConstantesFunciones.ITAMANIOFILATABLA + (DetalleCuentaFlujoCajaConstantesFunciones.ITAMANIOFILATABLA/2));

						detallecuentaflujocajaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCuentaFlujoCaja=(TitledBorder)this.jScrollPanelDatosCuentaFlujoCaja.getBorder();
						TitledBorder titledBorderDetalleCuentaFlujoCaja=(TitledBorder)detallecuentaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosDetalleCuentaFlujoCaja.getBorder();

						titledBorderDetalleCuentaFlujoCaja.setTitle(titledBorderCuentaFlujoCaja.getTitle() + " -> Detalle Cuenta Flujo Caja");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallecuentaflujocajaBeanSwingJInternalFrame);
						}

						detallecuentaflujocajaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallecuentaflujocajaBeanSwingJInternalFrame);

						detallecuentaflujocajaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Cuenta Flujo Caja",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCuentaFlujoCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoCuentaFlujoCaja && this.isPermisoNuevoCuentaFlujoCaja));			
			this.jButtonDuplicarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarCuentaFlujoCaja && this.isPermisoDuplicarCuentaFlujoCaja));			
			this.jButtonCopiarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarCuentaFlujoCaja && this.isPermisoCopiarCuentaFlujoCaja));
			this.jButtonVerFormCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormCuentaFlujoCaja && this.isPermisoVerFormCuentaFlujoCaja));
			
			this.jButtonAbrirOrderByCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenCuentaFlujoCaja && this.isPermisoOrdenCuentaFlujoCaja));			
			
			this.jButtonNuevoRelacionesCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja && this.isPermisoNuevoCuentaFlujoCaja));			
			this.jButtonNuevoGuardarCambiosCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoCuentaFlujoCaja && this.isPermisoNuevoCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja));
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonModificarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarCuentaFlujoCaja && this.isPermisoActualizarCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonActualizarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarCuentaFlujoCaja && this.isPermisoActualizarCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonEliminarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarCuentaFlujoCaja && this.isPermisoEliminarCuentaFlujoCaja));
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonCancelarCuentaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarCuentaFlujoCaja);							
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoCuentaFlujoCaja && this.isPermisoNuevoCuentaFlujoCaja));						
			this.jButtonDuplicarToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarCuentaFlujoCaja && this.isPermisoDuplicarCuentaFlujoCaja));						
			this.jButtonCopiarToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarCuentaFlujoCaja && this.isPermisoCopiarCuentaFlujoCaja));			
			this.jButtonVerFormToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormCuentaFlujoCaja && this.isPermisoVerFormCuentaFlujoCaja));			
			this.jButtonAbrirOrderByToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenCuentaFlujoCaja && this.isPermisoOrdenCuentaFlujoCaja));
			this.jButtonNuevoRelacionesToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja && this.isPermisoNuevoCuentaFlujoCaja));			
			this.jButtonNuevoGuardarCambiosToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoCuentaFlujoCaja && this.isPermisoNuevoCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja));			
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonModificarToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarCuentaFlujoCaja && this.isPermisoActualizarCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonActualizarToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarCuentaFlujoCaja  && this.isPermisoActualizarCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonEliminarToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarCuentaFlujoCaja && this.isPermisoEliminarCuentaFlujoCaja));
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonCancelarToolBarCuentaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarCuentaFlujoCaja);				
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoCuentaFlujoCaja && this.isPermisoNuevoCuentaFlujoCaja));			
			this.jMenuItemDuplicarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarCuentaFlujoCaja && this.isPermisoDuplicarCuentaFlujoCaja));			
			this.jMenuItemCopiarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarCuentaFlujoCaja && this.isPermisoCopiarCuentaFlujoCaja));			
			this.jMenuItemVerFormCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormCuentaFlujoCaja && this.isPermisoVerFormCuentaFlujoCaja));			
			this.jMenuItemAbrirOrderByCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenCuentaFlujoCaja && this.isPermisoOrdenCuentaFlujoCaja));			
			//this.jMenuItemMostrarOcultarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenCuentaFlujoCaja && this.isPermisoOrdenCuentaFlujoCaja));
			this.jMenuItemDetalleAbrirOrderByCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenCuentaFlujoCaja && this.isPermisoOrdenCuentaFlujoCaja));			
			//this.jMenuItemDetalleMostrarOcultarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenCuentaFlujoCaja && this.isPermisoOrdenCuentaFlujoCaja));			
			this.jMenuItemNuevoRelacionesCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja && this.isPermisoNuevoCuentaFlujoCaja));			
			this.jMenuItemNuevoGuardarCambiosCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoCuentaFlujoCaja && this.isPermisoNuevoCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja));									
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemModificarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarCuentaFlujoCaja && this.isPermisoActualizarCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemActualizarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarCuentaFlujoCaja && this.isPermisoActualizarCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemEliminarCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarCuentaFlujoCaja && this.isPermisoEliminarCuentaFlujoCaja));
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemCancelarCuentaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarCuentaFlujoCaja);				
			}
			
			this.jMenuItemGuardarCambiosCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja));						
			this.jMenuItemGuardarCambiosTablaCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=this.jButtonNuevoCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaDuplicarCuentaFlujoCaja=this.jButtonDuplicarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCopiarCuentaFlujoCaja=this.jButtonCopiarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaVerFormCuentaFlujoCaja=this.jButtonVerFormCuentaFlujoCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenCuentaFlujoCaja=this.jButtonAbrirOrderByCuentaFlujoCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=this.jButtonNuevoRelacionesCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaModificarCuentaFlujoCaja=this.jButtonModificarCuentaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonActualizarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonEliminarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonCancelarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosCuentaFlujoCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=this.jButtonGuardarCambiosTablaCuentaFlujoCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=this.jButtonNuevoToolBarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=this.jButtonNuevoRelacionesToolBarCuentaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonModificarToolBarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonActualizarToolBarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonEliminarToolBarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonCancelarToolBarCuentaFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaFlujoCaja=this.jButtonGuardarCambiosToolBarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=this.jButtonGuardarCambiosTablaToolBarCuentaFlujoCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=this.jMenuItemNuevoCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=this.jMenuItemNuevoRelacionesCuentaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemModificarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemActualizarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemEliminarCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemCancelarCuentaFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaFlujoCaja=this.jMenuItemGuardarCambiosCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=this.jMenuItemGuardarCambiosTablaCuentaFlujoCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCuentaFlujoCaja(Boolean esInicializar) {
		if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
				//if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaFlujoCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualCuentaFlujoCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCuentaFlujoCaja() {
		this.jButtonNuevoCuentaFlujoCaja.setVisible(this.isPermisoNuevoCuentaFlujoCaja);			
		this.jButtonDuplicarCuentaFlujoCaja.setVisible(this.isPermisoDuplicarCuentaFlujoCaja);			
		this.jButtonCopiarCuentaFlujoCaja.setVisible(this.isPermisoCopiarCuentaFlujoCaja);			
		this.jButtonVerFormCuentaFlujoCaja.setVisible(this.isPermisoVerFormCuentaFlujoCaja);			
		
		this.jButtonAbrirOrderByCuentaFlujoCaja.setVisible(this.isPermisoOrdenCuentaFlujoCaja);					
		
		this.jButtonNuevoRelacionesCuentaFlujoCaja.setVisible(this.isPermisoNuevoCuentaFlujoCaja);			
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonModificarCuentaFlujoCaja.setVisible(this.isPermisoActualizarCuentaFlujoCaja);	
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonActualizarCuentaFlujoCaja.setVisible(this.isPermisoActualizarCuentaFlujoCaja);	
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonEliminarCuentaFlujoCaja.setVisible(this.isPermisoEliminarCuentaFlujoCaja);
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonCancelarCuentaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarCuentaFlujoCaja);						
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosCuentaFlujoCaja.setVisible(this.isPermisoGuardarCambiosCuentaFlujoCaja);							
		}
		
		this.jButtonGuardarCambiosTablaCuentaFlujoCaja.setVisible(this.isPermisoActualizarCuentaFlujoCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaFlujoCaja() {
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonModificarCuentaFlujoCaja.setVisible(this.isPermisoActualizarCuentaFlujoCaja);	
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonActualizarCuentaFlujoCaja.setVisible(this.isPermisoActualizarCuentaFlujoCaja);	
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonEliminarCuentaFlujoCaja.setVisible(this.isPermisoEliminarCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonCancelarCuentaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarCuentaFlujoCaja);							
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCuentaFlujoCaja && this.isPermisoGuardarCambiosCuentaFlujoCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCuentaFlujoCaja() {
		if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCuentaFlujoCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCuentaFlujoCaja() {
	}
	
	public void jTableDatosCuentaFlujoCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCuentaFlujoCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaflujocaja==null) {
						this.cuentaflujocaja = new CuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
				}

				if(this.cuentaflujocaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cuentaflujocaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCuentaFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCuentaFlujoCaja(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cuentaflujocajaLogic.getConnexion());

				if(this.cuentaflujocaja.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cuentaflujocaja.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaFlujoCaja=(TitledBorder)this.jScrollPanelDatosCuentaFlujoCaja.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCuentaFlujoCaja.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaflujocaja==null) {
						this.cuentaflujocaja = new CuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
				}

				if(this.cuentaflujocaja.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cuentaflujocaja.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaflujocaja==null) {
						this.cuentaflujocaja = new CuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
				}

				if(this.cuentaflujocaja.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cuentaflujocaja.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesCuentaFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebCuentaFlujoCaja(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.cuentaflujocajaLogic.getConnexion());

				if(this.cuentaflujocaja.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.cuentaflujocaja.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaFlujoCaja=(TitledBorder)this.jScrollPanelDatosCuentaFlujoCaja.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderCuentaFlujoCaja.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaflujocaja==null) {
						this.cuentaflujocaja = new CuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
				}

				if(this.cuentaflujocaja.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.cuentaflujocaja.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_diaCuentaFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodia=true;

			idTienePermisodia=this.tienePermisosUsuarioEnPaginaWebCuentaFlujoCaja(DiaConstantesFunciones.CLASSNAME);

			if(idTienePermisodia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);

				this.diaBeanSwingJInternalFrame=new DiaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.diaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.diaBeanSwingJInternalFrame.getDiaLogic().setConnexion(this.cuentaflujocajaLogic.getConnexion());

				if(this.cuentaflujocaja.getid_dia()!=null) {
					this.diaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.diaBeanSwingJInternalFrame.setIdActual(this.cuentaflujocaja.getid_dia());
					this.diaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.diaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.diaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDia();
				}

				JInternalFrameBase jinternalFrame =this.diaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaFlujoCaja=(TitledBorder)this.jScrollPanelDatosCuentaFlujoCaja.getBorder();
				TitledBorder titledBorderdia=(TitledBorder)this.diaBeanSwingJInternalFrame.jScrollPanelDatosDia.getBorder();

				titledBorderdia.setTitle(titledBorderCuentaFlujoCaja.getTitle() + " -> Dia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_diaCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaflujocaja==null) {
						this.cuentaflujocaja = new CuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
				}

				if(this.cuentaflujocaja.getid_dia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_dia = "+this.cuentaflujocaja.getid_dia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableCuentaFlujoCajaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="CuentaContable";

			if(!this.sFinalQueryGeneral_cuentacontable.equals("")) {
				this.cuentacontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontable);
				this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCuentaFlujoCaja=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosCuentaFlujoCaja.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCuentaFlujoCaja=(TitledBorder)this.jScrollPanelDatosCuentaFlujoCaja.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCuentaFlujoCaja.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableCuentaFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebCuentaFlujoCaja(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cuentaflujocajaLogic.getConnexion());

				if(this.cuentaflujocaja.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.cuentaflujocaja.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaFlujoCaja=(TitledBorder)this.jScrollPanelDatosCuentaFlujoCaja.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCuentaFlujoCaja.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaflujocaja==null) {
						this.cuentaflujocaja = new CuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
				}

				if(this.cuentaflujocaja.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.cuentaflujocaja.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonformulaCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaflujocaja==null) {
						this.cuentaflujocaja = new CuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
				}

				if(this.cuentaflujocaja.getformula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where formula like '%"+this.cuentaflujocaja.getformula()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_flujo_cajaCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaflujocaja==null) {
						this.cuentaflujocaja = new CuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
				}

				if(this.cuentaflujocaja.getes_flujo_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_flujo_caja = "+this.cuentaflujocaja.getes_flujo_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_agruparCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.getcuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentaflujocaja==null) {
						this.cuentaflujocaja = new CuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);
				}

				if(this.cuentaflujocaja.getcon_agrupar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_agrupar = "+this.cuentaflujocaja.getcon_agrupar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaFlujoCaja(false,false);

			this.getCuentaFlujoCajasBusquedaPorNombre();

			this.inicializarActualizarBindingCuentaFlujoCaja(false);

			//if(CuentaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaFlujoCaja(false,false);

			this.getCuentaFlujoCajasFK_IdCuentaContable();

			this.inicializarActualizarBindingCuentaFlujoCaja(false);

			//if(CuentaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDiaCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaFlujoCaja(false,false);

			this.getCuentaFlujoCajasFK_IdDia();

			this.inicializarActualizarBindingCuentaFlujoCaja(false);

			//if(CuentaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaFlujoCaja(false,false);

			this.getCuentaFlujoCajasFK_IdEmpresa();

			this.inicializarActualizarBindingCuentaFlujoCaja(false);

			//if(CuentaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaFlujoCaja(false,false);

			this.getCuentaFlujoCajasFK_IdMes();

			this.inicializarActualizarBindingCuentaFlujoCaja(false);

			//if(CuentaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCuentaFlujoCaja() {
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
		

		if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormCuentaFlujoCaja.dispose();
			this.jInternalFrameDetalleFormCuentaFlujoCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja!=null) {
			this.jInternalFrameReporteDinamicoCuentaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCuentaFlujoCaja.dispose();
			this.jInternalFrameReporteDinamicoCuentaFlujoCaja=null;
		}
		
		if(this.jInternalFrameImportacionCuentaFlujoCaja!=null) {
			this.jInternalFrameImportacionCuentaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameImportacionCuentaFlujoCaja.dispose();
			this.jInternalFrameImportacionCuentaFlujoCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCuentaFlujoCaja();
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoCuentaFlujoCaja")) {
				jButtonNuevoCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCuentaFlujoCaja")) {
				jButtonDuplicarCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCuentaFlujoCaja")) {
				jButtonCopiarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormCuentaFlujoCaja")) {
				jButtonVerFormCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCuentaFlujoCaja")) {
				jButtonNuevoCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCuentaFlujoCaja")) {
				jButtonDuplicarCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCuentaFlujoCaja")) {
				jButtonNuevoCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCuentaFlujoCaja")) {
				jButtonDuplicarCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCuentaFlujoCaja")) {
				jButtonNuevoCuentaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCuentaFlujoCaja")) {
				jButtonNuevoCuentaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCuentaFlujoCaja")) {
				jButtonNuevoCuentaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCuentaFlujoCaja")) {
				jButtonModificarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCuentaFlujoCaja")) {
				jButtonModificarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCuentaFlujoCaja")) {
				jButtonModificarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCuentaFlujoCaja")) {
				jButtonActualizarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCuentaFlujoCaja")) {
				jButtonActualizarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCuentaFlujoCaja")) {
				jButtonActualizarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarCuentaFlujoCaja")) {
				jButtonEliminarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCuentaFlujoCaja")) {
				jButtonEliminarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCuentaFlujoCaja")) {
				jButtonEliminarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarCuentaFlujoCaja")) {
				jButtonCancelarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCuentaFlujoCaja")) {
				jButtonCancelarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCuentaFlujoCaja")) {
				jButtonCancelarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarCuentaFlujoCaja")) {
				jButtonCerrarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCuentaFlujoCaja")) {
				jButtonCerrarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCuentaFlujoCaja")) {
				jButtonCerrarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCuentaFlujoCaja")) {
				jButtonMostrarOcultarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCuentaFlujoCaja")) {
				jButtonCancelarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCuentaFlujoCaja")) {
				jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCuentaFlujoCaja")) {
				jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCuentaFlujoCaja")) {
				jButtonCopiarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCuentaFlujoCaja")) {
				jButtonVerFormCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCuentaFlujoCaja")) {
				jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCuentaFlujoCaja")) {
				jButtonCopiarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCuentaFlujoCaja")) {
				jButtonVerFormCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCuentaFlujoCaja")) {
				jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCuentaFlujoCaja")) {
				jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCuentaFlujoCaja")) {
				jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCuentaFlujoCaja")) {
				jButtonRecargarInformacionCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCuentaFlujoCaja")) {
				jButtonRecargarInformacionCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCuentaFlujoCaja")) {
				jButtonRecargarInformacionCuentaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCuentaFlujoCaja")) {
				jButtonAnterioresCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCuentaFlujoCaja")) {
				jButtonAnterioresCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCuentaFlujoCaja")) {
				jButtonAnterioresCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCuentaFlujoCaja")) {
				jButtonSiguientesCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCuentaFlujoCaja")) {
				jButtonSiguientesCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCuentaFlujoCaja")) {
				jButtonSiguientesCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCuentaFlujoCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByCuentaFlujoCaja")) {
				jButtonAbrirOrderByCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCuentaFlujoCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarCuentaFlujoCaja")) {
				jButtonMostrarOcultarCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaFlujoCaja")) {
				jButtonNuevoGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCuentaFlujoCaja")) {
				jButtonNuevoGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCuentaFlujoCaja")) {
				jButtonNuevoGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCuentaFlujoCaja")) {
				jButtonCerrarReporteDinamicoCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCuentaFlujoCaja")) {
				jButtonGenerarReporteDinamicoCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCuentaFlujoCaja")) {
				
				jButtonGenerarExcelReporteDinamicoCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCuentaFlujoCaja")) {
				jButtonCerrarImportacionCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCuentaFlujoCaja")) {
				
				jButtonGenerarImportacionCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCuentaFlujoCaja")) {
				
				jButtonAbrirImportacionCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCuentaFlujoCaja")) {
				jComboBoxTiposAccionesCuentaFlujoCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCuentaFlujoCaja")) {
				jComboBoxTiposRelacionesCuentaFlujoCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCuentaFlujoCaja")) {
				jComboBoxTiposAccionesCuentaFlujoCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCuentaFlujoCaja")) {
				
				jComboBoxTiposSeleccionarCuentaFlujoCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCuentaFlujoCaja")) {
				jTextFieldValorCampoGeneralCuentaFlujoCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCuentaFlujoCaja")) {
				jButtonAbrirOrderByCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCuentaFlujoCaja")) {
				jButtonAbrirOrderByCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCuentaFlujoCaja")) {
				jButtonCerrarOrderByCuentaFlujoCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaFlujoCajaBusqueda")) {
				this.jButtonidCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCuentaFlujoCajaUpdate")) {
				this.jButtonid_empresaCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCuentaFlujoCajaBusqueda")) {
				this.jButtonid_empresaCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCuentaFlujoCajaBusqueda")) {
				this.jButtonnombreCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesCuentaFlujoCajaUpdate")) {
				this.jButtonid_mesCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesCuentaFlujoCajaBusqueda")) {
				this.jButtonid_mesCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_diaCuentaFlujoCajaUpdate")) {
				this.jButtonid_diaCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_diaCuentaFlujoCajaBusqueda")) {
				this.jButtonid_diaCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaFlujoCaja")) {
				this.jButtonid_cuenta_contableCuentaFlujoCajaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaFlujoCajaArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaFlujoCajaUpdate")) {
				this.jButtonid_cuenta_contableCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaFlujoCajaBusqueda")) {
				this.jButtonid_cuenta_contableCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("formulaCuentaFlujoCajaBusqueda")) {
				this.jButtonformulaCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_flujo_cajaCuentaFlujoCajaBusqueda")) {
				this.jButtones_flujo_cajaCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_agruparCuentaFlujoCajaBusqueda")) {
				this.jButtoncon_agruparCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contableCuentaFlujoCaja")) {
				this.jButtonid_cuenta_contableCuentaFlujoCajaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorNombreCuentaFlujoCaja")) {
				this.jButtonBusquedaPorNombreCuentaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableCuentaFlujoCaja")) {
				this.jButtonFK_IdCuentaContableCuentaFlujoCajaActionPerformed(evt);
			}
			
			;
			
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCuentaFlujoCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				


				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CuentaFlujoCaja cuentaflujocajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				cuentaflujocajaLocal=this.cuentaflujocaja;
			} else {
				cuentaflujocajaLocal=this.cuentaflujocajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
							
				
				


				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
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
			
			


			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
								
						
				


				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaFlujoCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
								
				
				


				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
							
				
				


				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaFlujoCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
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
			
			


			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaFlujoCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
								
				
				


				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCuentaFlujoCaja")) {
					jCheckBoxSeleccionarTodosCuentaFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCuentaFlujoCaja")) {
					jCheckBoxSeleccionadosCuentaFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCuentaFlujoCaja")) {
					
				}
				
				


				
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
												
				
				


				
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaFlujoCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
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
			
			


			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaFlujoCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaFlujoCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentaflujocaja);
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
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
				
				


				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaFlujoCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentaflujocajaAnterior =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCuentaFlujoCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCuentaFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCuentaFlujoCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cuentaflujocaja =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cuentaflujocaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCuentaFlujoCaja")) {
				
				}
				
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCuentaFlujoCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCuentaFlujoCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCuentaFlujoCaja")) {
			
			}
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCuentaFlujoCaja();
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
			if(sTipo.equals("NuevoCuentaFlujoCaja")) {
				jButtonNuevoCuentaFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCuentaFlujoCaja")) {
				jButtonDuplicarCuentaFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCuentaFlujoCaja")) {
				jButtonCopiarCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCuentaFlujoCaja")) {
				jButtonVerFormCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCuentaFlujoCaja")) {
				jButtonNuevoCuentaFlujoCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCuentaFlujoCaja")) {
				jButtonModificarCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCuentaFlujoCaja")) {
				jButtonActualizarCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCuentaFlujoCaja")) {
				jButtonEliminarCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCuentaFlujoCaja")) {
				jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCuentaFlujoCaja")) {
				jButtonCancelarCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCuentaFlujoCaja")) {
				jButtonCerrarCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCuentaFlujoCaja")) {
				jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaFlujoCaja")) {
				jButtonNuevoGuardarCambiosCuentaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCuentaFlujoCaja")) {
				jButtonAbrirOrderByCuentaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCuentaFlujoCaja")) {
				jButtonRecargarInformacionCuentaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCuentaFlujoCaja")) {
				jButtonAnterioresCuentaFlujoCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCuentaFlujoCaja")) {
				jButtonSiguientesCuentaFlujoCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaFlujoCajaBusqueda")) {
				this.jButtonidCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCuentaFlujoCajaUpdate")) {
				this.jButtonid_empresaCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCuentaFlujoCajaBusqueda")) {
				this.jButtonid_empresaCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCuentaFlujoCajaBusqueda")) {
				this.jButtonnombreCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesCuentaFlujoCajaUpdate")) {
				this.jButtonid_mesCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesCuentaFlujoCajaBusqueda")) {
				this.jButtonid_mesCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_diaCuentaFlujoCajaUpdate")) {
				this.jButtonid_diaCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_diaCuentaFlujoCajaBusqueda")) {
				this.jButtonid_diaCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaFlujoCaja")) {
				this.jButtonid_cuenta_contableCuentaFlujoCajaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaFlujoCajaArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaFlujoCajaUpdate")) {
				this.jButtonid_cuenta_contableCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaFlujoCajaBusqueda")) {
				this.jButtonid_cuenta_contableCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("formulaCuentaFlujoCajaBusqueda")) {
				this.jButtonformulaCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_flujo_cajaCuentaFlujoCajaBusqueda")) {
				this.jButtones_flujo_cajaCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_agruparCuentaFlujoCajaBusqueda")) {
				this.jButtoncon_agruparCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCuentaFlujoCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCuentaFlujoCaja")) {
				closingInternalFrameCuentaFlujoCaja();
				
			} else if(sTipo.equals("jButtonCancelarCuentaFlujoCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormCuentaFlujoCaja = (JInternalFrameBase)evt.getSource();
	            	
	            CuentaFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(CuentaFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaFlujoCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCuentaFlujoCajaActionPerformed(null);
			}
			
			CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentaflujocaja,new Object(),this.cuentaflujocajaParameterGeneral,this.cuentaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCuentaFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCuentaFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCuentaFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cuentaflujocaja)) {
			if(!esControlTabla) {
				if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);			
				}
				
				if(this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentaflujocajaReturnGeneral=cuentaflujocajaLogic.procesarEventosCuentaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentaflujocajaLogic.getCuentaFlujoCajas(),this.cuentaflujocaja,this.cuentaflujocajaParameterGeneral,this.isEsNuevoCuentaFlujoCaja,classes);//this.cuentaflujocajaLogic.getCuentaFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCuentaFlujoCaja(this.cuentaflujocajaReturnGeneral,this.cuentaflujocajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCuentaFlujoCaja(classes,this.cuentaflujocajaReturnGeneral,this.cuentaflujocajaBean,false);
					}
						
					if(this.cuentaflujocajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCuentaFlujoCaja(this.cuentaflujocajaReturnGeneral.getCuentaFlujoCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCuentaFlujoCaja(this.cuentaflujocajaReturnGeneral.getCuentaFlujoCaja());	
					}
						
					if(this.cuentaflujocajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCuentaFlujoCaja(this.cuentaflujocajaReturnGeneral.getCuentaFlujoCaja(),classes);//this.cuentaflujocajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCuentaFlujoCaja(this.cuentaflujocaja,classes);//this.cuentaflujocajaBean);									
				}
			
				if(CuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCuentaFlujoCaja(this.cuentaflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaFlujoCaja(this.cuentaflujocaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cuentaflujocajaAnterior!=null) {
						this.cuentaflujocaja=this.cuentaflujocajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentaflujocajaReturnGeneral=cuentaflujocajaLogic.procesarEventosCuentaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentaflujocajaLogic.getCuentaFlujoCajas(),this.cuentaflujocaja,this.cuentaflujocajaParameterGeneral,this.isEsNuevoCuentaFlujoCaja,classes);//this.cuentaflujocajaLogic.getCuentaFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cuentaflujocajaReturnGeneral.getCuentaFlujoCaja(),cuentaflujocajaLogic.getCuentaFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cuentaflujocajaReturnGeneral.getCuentaFlujoCaja(),this.cuentaflujocajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCuentaFlujoCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosCuentaFlujoCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCuentaFlujoCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosCuentaFlujoCaja() throws Exception {
		
		CuentaFlujoCajaModel cuentaflujocajaModel=(CuentaFlujoCajaModel)this.jTableDatosCuentaFlujoCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentaflujocajaModel.cuentaflujocajas=this.cuentaflujocajaLogic.getCuentaFlujoCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cuentaflujocajaModel.cuentaflujocajas=this.cuentaflujocajas;
		}
		
		
		((CuentaFlujoCajaModel) this.jTableDatosCuentaFlujoCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCuentaFlujoCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcuentaflujocajaAnterior(),this.cuentaflujocajaLogic.getCuentaFlujoCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcuentaflujocajaAnterior(),this.cuentaflujocajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCuentaFlujoCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCuentaFlujoCaja.class)) {
					this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(cuentaflujocaja.getDetalleCuentaFlujoCajas());
					this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
										
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentaflujocaja,new Object(),generalEntityParameterGeneral,this.cuentaflujocajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CuentaFlujoCajaConstantesFunciones.getClassesRelationshipsOfCuentaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CuentaFlujoCajaConstantesFunciones.getClassesRelationshipsFromStringsOfCuentaFlujoCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCuentaFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentaflujocaja,new Object(),generalEntityParameterGeneral,this.cuentaflujocajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCuentaFlujoCaja(CuentaFlujoCajaBean cuentaflujocajaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCuentaFlujoCaja.class)) {
					this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(cuentaflujocaja.getDetalleCuentaFlujoCajas());
					this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCuentaFlujoCaja(ArrayList<Classe> classes,CuentaFlujoCajaReturnGeneral cuentaflujocajaReturnGeneral,CuentaFlujoCajaBean cuentaflujocajaBean,Boolean conDefault) throws Exception {
		
			this.cuentaflujocajaBean.setDetalleCuentaFlujoCajas(cuentaflujocajaReturnGeneral.getCuentaFlujoCaja().getDetalleCuentaFlujoCajas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleCuentaFlujoCaja.class)) {
					cuentaflujocaja.setDetalleCuentaFlujoCajas(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.cuentaflujocaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja = new CuentaFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.cuentaflujocajaSessionBean.getConGuardarRelaciones(),this.cuentaflujocajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.setVisible(false);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.cuentaflujocajaLogic=this.cuentaflujocajaLogic;
		
		this.cargarCombosFrameForeignKeyCuentaFlujoCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaFlujoCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaFlujoCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCuentaFlujoCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCuentaFlujoCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaFlujoCaja"));
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonModificarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarCuentaFlujoCaja"));

		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonModificarToolBarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaFlujoCaja"));
					
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemModificarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonActualizarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarCuentaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonActualizarToolBarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaFlujoCaja"));
						
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemActualizarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonEliminarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarCuentaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonEliminarToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaFlujoCaja"));
								
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemEliminarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonCancelarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarCuentaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonCancelarToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaFlujoCaja"));
					
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemCancelarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaFlujoCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemDetalleCerrarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaFlujoCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonidCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_empresaCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_empresaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonnombreCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_mesCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_mesCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_mesCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_diaCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_diaCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_diaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_diaCuentaFlujoCajaBusqueda"));
		//jButtonid_cuenta_contableCuentaFlujoCaja.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCuentaFlujoCajaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCaja"));
		//jButtonid_cuenta_contableCuentaFlujoCajaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCajaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCajaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonformulaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"formulaCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtones_flujo_cajaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"es_flujo_cajaCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtoncon_agruparCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"con_agruparCuentaFlujoCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jTabbedPaneRelacionesCuentaFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaFlujoCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCuentaFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaFlujoCaja"));
		}
		
		this.jTableDatosCuentaFlujoCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCuentaFlujoCaja"));
		
		this.jTableDatosCuentaFlujoCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCuentaFlujoCaja"));
		
		this.jButtonNuevoCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoCuentaFlujoCaja"));
		
		this.jButtonDuplicarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarCuentaFlujoCaja"));
		
		this.jButtonCopiarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"CopiarCuentaFlujoCaja"));
		
		this.jButtonVerFormCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"VerFormCuentaFlujoCaja"));
		
		
		this.jButtonNuevoToolBarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarCuentaFlujoCaja"));
			
		this.jButtonDuplicarToolBarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCuentaFlujoCaja"));
			
		this.jMenuItemNuevoCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCuentaFlujoCaja"));
			
		this.jMenuItemDuplicarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCuentaFlujoCaja"));		
		
		
		this.jButtonNuevoRelacionesCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCuentaFlujoCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCuentaFlujoCaja"));
			
		this.jMenuItemNuevoRelacionesCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCuentaFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonModificarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarCuentaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonModificarToolBarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaFlujoCaja"));
			
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemModificarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonActualizarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarCuentaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonActualizarToolBarCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaFlujoCaja"));
				
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemActualizarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonEliminarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarCuentaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonEliminarToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaFlujoCaja"));
						
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemEliminarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonCancelarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarCuentaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonCancelarToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaFlujoCaja"));
			
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemCancelarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaFlujoCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCuentaFlujoCaja"));		
		
		
		this.jButtonCerrarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarCuentaFlujoCaja"));
		
		
		this.jButtonCerrarToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarCuentaFlujoCaja"));
			
		this.jMenuItemCerrarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCuentaFlujoCaja"));
			
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jMenuItemDetalleCerrarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosCuentaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaFlujoCaja"));
		}
		
		this.jButtonCopiarToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarCuentaFlujoCaja"));
			
		this.jButtonVerFormToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarCuentaFlujoCaja"));
		
		this.jMenuItemGuardarCambiosCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCuentaFlujoCaja"));
			
		this.jMenuItemCopiarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCuentaFlujoCaja"));		
		
		this.jMenuItemVerFormCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCuentaFlujoCaja"));		
		
		
		this.jButtonGuardarCambiosTablaCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaFlujoCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCuentaFlujoCaja"));
			
		this.jMenuItemGuardarCambiosTablaCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaFlujoCaja"));		
		
		
		
		this.jButtonRecargarInformacionCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionCuentaFlujoCaja"));
					
		this.jButtonRecargarInformacionToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCuentaFlujoCaja"));
		
		this.jMenuItemRecargarInformacionCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCuentaFlujoCaja"));		
		
		
		
		this.jButtonAnterioresCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresCuentaFlujoCaja"));
		
		
		this.jButtonAnterioresToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCuentaFlujoCaja"));
		
		this.jMenuItemAnterioresCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCuentaFlujoCaja"));		
		
		
		this.jButtonSiguientesCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesCuentaFlujoCaja"));
		
		
		this.jButtonSiguientesToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCuentaFlujoCaja"));
			
		this.jMenuItemSiguientesCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCuentaFlujoCaja"));
			
		this.jMenuItemAbrirOrderByCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCuentaFlujoCaja"));
			
		this.jMenuItemMostrarOcultarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCuentaFlujoCaja"));
			
		this.jMenuItemDetalleAbrirOrderByCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCuentaFlujoCaja"));
			
		this.jMenuItemDetalleMostarOcultarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCuentaFlujoCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCuentaFlujoCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCuentaFlujoCaja"));
			
		this.jMenuItemNuevoGuardarCambiosCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCuentaFlujoCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCuentaFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCuentaFlujoCaja"));

		this.jCheckBoxSeleccionadosCuentaFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCuentaFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaFlujoCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesCuentaFlujoCaja"));
			
		this.jComboBoxTiposAccionesCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesCuentaFlujoCaja"));
					
		this.jComboBoxTiposSeleccionarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCuentaFlujoCaja"));
			
		this.jTextFieldValorCampoGeneralCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCuentaFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonidCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_empresaCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_empresaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonnombreCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_mesCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_mesCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_mesCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_diaCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_diaCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_diaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_diaCuentaFlujoCajaBusqueda"));
		//jButtonid_cuenta_contableCuentaFlujoCaja.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCuentaFlujoCajaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCaja"));
		//jButtonid_cuenta_contableCuentaFlujoCajaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCajaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCajaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonformulaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"formulaCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtones_flujo_cajaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"es_flujo_cajaCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtoncon_agruparCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"con_agruparCuentaFlujoCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCuentaFlujoCaja"));

			this.jButtonFK_IdCuentaContableCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCuentaFlujoCaja"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCuentaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaFlujoCaja"));
				this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaFlujoCaja"));
				this.jInternalFrameReporteDinamicoCuentaFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaFlujoCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaFlujoCaja"));				
			//this.jButtonGenerarReporteDinamicoCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaFlujoCaja"));
			//this.jButtonGenerarExcelReporteDinamicoCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaFlujoCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCuentaFlujoCaja!=null) {
				this.jInternalFrameImportacionCuentaFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaFlujoCaja"));
				this.jInternalFrameImportacionCuentaFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaFlujoCaja"));
				this.jInternalFrameImportacionCuentaFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaFlujoCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByCuentaFlujoCaja"));
			
			this.jButtonAbrirOrderByToolBarCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCuentaFlujoCaja"));			
			
			if(this.jInternalFrameOrderByCuentaFlujoCaja!=null) {
				this.jInternalFrameOrderByCuentaFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaFlujoCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jTabbedPaneRelacionesCuentaFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaFlujoCaja"));
		
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
            		closingInternalFrameCuentaFlujoCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCuentaFlujoCaja = (JInternalFrameBase)event.getSource();
	            	
	            CuentaFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(CuentaFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaFlujoCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCuentaFlujoCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCuentaFlujoCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCuentaFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCuentaFlujoCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCuentaFlujoCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCuentaFlujoCaja";
		inputMap = this.jButtonNuevoCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaFlujoCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCuentaFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaFlujoCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCuentaFlujoCaja";
		inputMap = this.jButtonModificarCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCuentaFlujoCaja";
		inputMap = this.jButtonActualizarCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCuentaFlujoCaja";
		inputMap = this.jButtonEliminarCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCuentaFlujoCaja";
		inputMap = this.jButtonCancelarCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCuentaFlujoCaja";
		inputMap = this.jButtonCerrarCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCuentaFlujoCaja";
		inputMap = this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonGuardarCambiosCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCuentaFlujoCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCuentaFlujoCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCuentaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCuentaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCuentaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCuentaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCuentaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCuentaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonidCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_empresaCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_empresaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonnombreCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_mesCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_mesCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_mesCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_diaCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_diaCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_diaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_diaCuentaFlujoCajaBusqueda"));
		//jButtonid_cuenta_contableCuentaFlujoCaja.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCuentaFlujoCajaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCaja"));
		//jButtonid_cuenta_contableCuentaFlujoCajaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCajaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCajaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonformulaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"formulaCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtones_flujo_cajaCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"es_flujo_cajaCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtoncon_agruparCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"con_agruparCuentaFlujoCajaBusqueda"));
		
		
		this.jButtonBusquedaPorNombreCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCuentaFlujoCaja"));

		this.jButtonFK_IdCuentaContableCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCuentaFlujoCaja"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaFlujoCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCuentaFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCuentaFlujoCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCuentaFlujoCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajaLogic.getCuentaFlujoCajas()) {
					cuentaflujocajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajas) {
					cuentaflujocajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCuentaFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajaLogic.getCuentaFlujoCajas()) {
						cuentaflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajas) {
						cuentaflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajaLogic.getCuentaFlujoCajas()) {
					
						if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA)) {
							existe=true;
							cuentaflujocajaAux.setes_flujo_caja(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR)) {
							existe=true;
							cuentaflujocajaAux.setcon_agrupar(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajas) {
						
						if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA)) {
							existe=true;
							cuentaflujocajaAux.setes_flujo_caja(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR)) {
							existe=true;
							cuentaflujocajaAux.setcon_agrupar(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCuentaFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCuentaFlujoCaja.getSelectedRows();
			
			CuentaFlujoCaja cuentaflujocajaLocal=new CuentaFlujoCaja();
			
			//this.seleccionarTodosCuentaFlujoCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaflujocajaLocal =(CuentaFlujoCaja) this.cuentaflujocajaLogic.getCuentaFlujoCajas().toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cuentaflujocajaLocal =(CuentaFlujoCaja) this.cuentaflujocajas.toArray()[this.jTableDatosCuentaFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cuentaflujocajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajaLogic.getCuentaFlujoCajas()) {
						cuentaflujocajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajas) {
						cuentaflujocajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCuentaFlujoCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCuentaFlujoCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCuentaFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCuentaFlujoCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajaLogic.getCuentaFlujoCajas()) {
				
						if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cuentaflujocajaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA)) {
							existe=true;
							cuentaflujocajaAux.setformula(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajas) {
					
						if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cuentaflujocajaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA)) {
							existe=true;
							cuentaflujocajaAux.setformula(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCuentaFlujoCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCuentaFlujoCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCuentaFlujoCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCuentaFlujoCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessCuentaFlujoCaja(conSplash);
				
					this.generarReporteCuentaFlujoCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCuentaFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesCuentaFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaFlujoCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesCuentaFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaFlujoCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesCuentaFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaFlujoCaja();
				
				this.exportarCuentaFlujoCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCuentaFlujoCajas();
				//this.importarCuentaFlujoCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaFlujoCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCuentaFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesCuentaFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cuenta Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCuentaFlujoCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCuentaFlujoCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCuentaFlujoCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setSelectedIndex(0);					
				}	
			} 			
			else if(CuentaFlujoCajaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCuentaFlujoCaja) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCuentaFlujoCaja(conSplash);
					
						//this.actualizarParametrosGeneralCuentaFlujoCaja();
						
						this.generarReporteProcesoAccionCuentaFlujoCajasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCuentaFlujoCaja.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CuentaFlujoCajaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cuenta Flujo CajaS SELECCIONADOS?", "MANTENIMIENTO DE Cuenta Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCuentaFlujoCaja();
				
						this.actualizarParametrosGeneralCuentaFlujoCaja();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cuentaflujocajaReturnGeneral=cuentaflujocajaLogic.procesarAccionCuentaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cuentaflujocajaLogic.getCuentaFlujoCajas(),this.cuentaflujocajaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCuentaFlujoCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaFlujoCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCuentaFlujoCaja();
					
					CuentaFlujoCajaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCuentaFlujoCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaFlujoCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCuentaFlujoCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCuentaFlujoCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCuentaFlujoCaja();
			
			if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();		
			CuentaFlujoCaja cuentaflujocaja=new CuentaFlujoCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCuentaFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCuentaFlujoCaja.getSelectedItem();
			
			
			
			
			cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(cuentaflujocajasSeleccionados.size()==1) {
				for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajasSeleccionados) {
					cuentaflujocaja=cuentaflujocajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Cuenta Flujo Caja")) {
					jButtonDetalleCuentaFlujoCajaActionPerformed(null,rowIndex,true,false,cuentaflujocaja);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCuentaFlujoCaja();
			
      		//this.finishProcessCuentaFlujoCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCuentaFlujoCajaReturnGeneral() throws Exception {
		if(this.cuentaflujocajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cuentaflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cuentaflujocajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cuentaflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cuentaflujocajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cuentaflujocajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCuentaFlujoCaja(false);
		}
		
		if(this.cuentaflujocajaReturnGeneral.getConRetornoLista() || this.cuentaflujocajaReturnGeneral.getConRetornoObjeto()) {
			if(this.cuentaflujocajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentaflujocajaLogic.setCuentaFlujoCajas(this.cuentaflujocajaReturnGeneral.getCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cuentaflujocajaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentaflujocajaLogic.setCuentaFlujoCaja(this.cuentaflujocajaReturnGeneral.getCuentaFlujoCaja());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCuentaFlujoCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralCuentaFlujoCaja() throws Exception {
		
		
	}
	
	public ArrayList<CuentaFlujoCaja> getCuentaFlujoCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCuentaFlujoCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajaLogic.getCuentaFlujoCajas()) {
					if(cuentaflujocajaAux.getIsSelected()) {
						cuentaflujocajasSeleccionados.add(cuentaflujocajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaFlujoCaja cuentaflujocajaAux:this.cuentaflujocajas) {
					if(cuentaflujocajaAux.getIsSelected()) {
						cuentaflujocajasSeleccionados.add(cuentaflujocajaAux);				
					}
				}
			}
			
			if(cuentaflujocajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cuentaflujocajasSeleccionados.addAll(this.cuentaflujocajaLogic.getCuentaFlujoCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cuentaflujocajasSeleccionados.addAll(this.cuentaflujocajas);				
					}
				}
			}
		} else {
			cuentaflujocajasSeleccionados.add(this.cuentaflujocaja);
		}
		
		return cuentaflujocajasSeleccionados;
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
	
	public void generarReporteCuentaFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCuentaFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCuentaFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaFlujoCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaFlujoCajasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCuentaFlujoCajasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cuenta Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();		
		
		cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCuentaFlujoCajas("Todos",cuentaflujocajasSeleccionados);
		
	}	
	
	public void generarReporteNormalCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();		
		
		cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCuentaFlujoCajas("Todos",cuentaflujocajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCuentaFlujoCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();
		
		cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCuentaFlujoCajas("Todos",cuentaflujocajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCuentaFlujoCaja();
		
		
		cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCuentaFlujoCaja();
		
		
		//this.generarReporteCuentaFlujoCajas("Todos",cuentaflujocajasSeleccionados ,cuentaflujocajaImplementable,cuentaflujocajaImplementableHome);
	}
	
	public void mostrarImportacionCuentaFlujoCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCuentaFlujoCaja();
		
		this.abrirFrameImportacionCuentaFlujoCaja();		
		
			
		//this.generarReporteCuentaFlujoCajas("Todos",cuentaflujocajasSeleccionados ,cuentaflujocajaImplementable,cuentaflujocajaImplementableHome);
	}
	
	public void importarCuentaFlujoCajas() throws Exception {		
	
	}
	
	public void exportarCuentaFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCuentaFlujoCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCuentaFlujoCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCuentaFlujoCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cuenta Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();		
		
		cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaflujocaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCuentaFlujoCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCuentaFlujoCaja(cuentaflujocajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cuentaflujocajaAux.setsDetalleGeneralEntityReporte(cuentaflujocajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCuentaFlujoCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CuentaFlujoCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaFlujoCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaFlujoCajaConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cuentaflujocaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaflujocaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaflujocaja.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaflujocaja.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaflujocaja.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaflujocaja.getdia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaflujocaja.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaflujocaja.getformula();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaflujocaja.getes_flujo_caja().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentaflujocaja.getcon_agrupar().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();		
		
		cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaflujocaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CuentaFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCuentaFlujoCaja(row);				
				iRow++;
			}				
			
			for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCuentaFlujoCaja(cuentaflujocajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();		
		
		cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentaflujocaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cuentaflujocajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cuentaflujocaja");
			//elementRoot.appendChild(element);
		
			for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajasSeleccionados) {
				element = document.createElement("cuentaflujocaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCuentaFlujoCaja(cuentaflujocajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCuentaFlujoCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaflujocaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaflujocaja.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaflujocaja.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaflujocaja.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaflujocaja.getdia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaflujocaja.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaflujocaja.getformula());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaflujocaja.getes_flujo_caja());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentaflujocaja.getcon_agrupar());				
	}
	
	public void setFilaDatosExportarXmlCuentaFlujoCaja(CuentaFlujoCaja cuentaflujocaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CuentaFlujoCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cuentaflujocaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CuentaFlujoCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cuentaflujocaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CuentaFlujoCajaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cuentaflujocaja.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(CuentaFlujoCajaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cuentaflujocaja.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementmes_descripcion = document.createElement(CuentaFlujoCajaConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(cuentaflujocaja.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementdia_descripcion = document.createElement(CuentaFlujoCajaConstantesFunciones.IDDIA);
		elementdia_descripcion.appendChild(document.createTextNode(cuentaflujocaja.getdia_descripcion()));
		element.appendChild(elementdia_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(CuentaFlujoCajaConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(cuentaflujocaja.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementformula = document.createElement(CuentaFlujoCajaConstantesFunciones.FORMULA);
		elementformula.appendChild(document.createTextNode(cuentaflujocaja.getformula().trim()));
		element.appendChild(elementformula);

		Element elementes_flujo_caja = document.createElement(CuentaFlujoCajaConstantesFunciones.ESFLUJOCAJA);
		elementes_flujo_caja.appendChild(document.createTextNode(cuentaflujocaja.getes_flujo_caja().toString().trim()));
		element.appendChild(elementes_flujo_caja);

		Element elementcon_agrupar = document.createElement(CuentaFlujoCajaConstantesFunciones.CONAGRUPAR);
		elementcon_agrupar.appendChild(document.createTextNode(cuentaflujocaja.getcon_agrupar().toString().trim()));
		element.appendChild(elementcon_agrupar);
	}
	
	public void generarReporteGroupGenericoCuentaFlujoCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados=new ArrayList<CuentaFlujoCaja>();
		
		cuentaflujocajasSeleccionados=this.getCuentaFlujoCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCuentaFlujoCaja(cuentaflujocajasSeleccionados);
		
		this.generarReporteCuentaFlujoCajas("Todos",cuentaflujocajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCuentaFlujoCaja(ArrayList<CuentaFlujoCaja> cuentaflujocajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajasSeleccionados) {
				cuentaflujocajaAux.setsDetalleGeneralEntityReporte(cuentaflujocajaAux.toString());
			
				if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(cuentaflujocajaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(cuentaflujocajaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					cuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(cuentaflujocajaAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA)) {
					existe=true;
					cuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(cuentaflujocajaAux.getdia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					cuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(cuentaflujocajaAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA)) {
					existe=true;
					cuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(cuentaflujocajaAux.getformula());
				}
				 else if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA)) {
					existe=true;
					cuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cuentaflujocajaAux.getes_flujo_caja()));
				}
				 else if(sTipoSeleccionar.equals(CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR)) {
					existe=true;
					cuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cuentaflujocajaAux.getcon_agrupar()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCuentaFlujoCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCuentaFlujoCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=true;
				this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=true;
			}
			
			this.isVisibilidadCeldaModificarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarCuentaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=false;
			this.isVisibilidadCeldaModificarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarCuentaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=false;
			this.isVisibilidadCeldaModificarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=true;
			this.isVisibilidadCeldaCancelarCuentaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=false;
			this.isVisibilidadCeldaModificarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarCuentaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=true;
			this.isVisibilidadCeldaModificarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarCuentaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarCuentaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=false;
			this.isVisibilidadCeldaModificarCuentaFlujoCaja=true;
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarCuentaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaFlujoCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=true;
		} else {
			this.actualizarEstadoPanelsCuentaFlujoCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCuentaFlujoCaja=false;
			//this.isVisibilidadCeldaVerFormCuentaFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarCuentaFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!cuentaflujocajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=false;												
			}
			
			this.jButtonCerrarCuentaFlujoCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaFlujoCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.cuentaflujocaja)) {
			this.isVisibilidadCeldaActualizarCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarCuentaFlujoCaja=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaFlujoCaja() {
		this.isVisibilidadCeldaNuevoCuentaFlujoCaja=false;
		this.isVisibilidadCeldaGuardarCambiosCuentaFlujoCaja=false;
	}
	
	public void actualizarEstadoPanelsCuentaFlujoCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionCuentaFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasCuentaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaFlujoCaja!=null) {
				this.jPanelPaginacionCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesCuentaFlujoCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionCuentaFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasCuentaFlujoCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaFlujoCaja!=null) {
				this.jPanelPaginacionCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesCuentaFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionCuentaFlujoCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasCuentaFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaFlujoCaja!=null) {
				this.jPanelPaginacionCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesCuentaFlujoCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionCuentaFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasCuentaFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaFlujoCaja!=null) {
				this.jPanelPaginacionCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesCuentaFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionCuentaFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasCuentaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaFlujoCaja!=null) {
				this.jPanelPaginacionCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesCuentaFlujoCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionCuentaFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasCuentaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaFlujoCaja!=null) {
				this.jPanelPaginacionCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesCuentaFlujoCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionCuentaFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasCuentaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaFlujoCaja!=null) {
				this.jPanelPaginacionCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesCuentaFlujoCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCuentaFlujoCaja!=null) {
					this.jTabbedPaneBusquedasCuentaFlujoCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesCuentaFlujoCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasCuentaFlujoCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesCuentaFlujoCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCuentaFlujoCaja.remove(jPanelBusquedaPorNombreCuentaFlujoCaja);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaFlujoCaja.remove(jPanelFK_IdCuentaContableCuentaFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaPorNombre=isParaMesNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCuentaFlujoCaja.remove(jPanelBusquedaPorNombreCuentaFlujoCaja);}

			this.isVisibilidadFK_IdCuentaContable=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaFlujoCaja.remove(jPanelFK_IdCuentaContableCuentaFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaDia(Boolean isParaDia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDiaNegation=!isParaDia;

			this.isVisibilidadBusquedaPorNombre=isParaDiaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCuentaFlujoCaja.remove(jPanelBusquedaPorNombreCuentaFlujoCaja);}

			this.isVisibilidadFK_IdCuentaContable=isParaDiaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaFlujoCaja.remove(jPanelFK_IdCuentaContableCuentaFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCuentaFlujoCaja.remove(jPanelBusquedaPorNombreCuentaFlujoCaja);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaFlujoCaja.remove(jPanelFK_IdCuentaContableCuentaFlujoCaja);}
		}
		
	}
	
	

	public String registrarSesionCuentaFlujoCajaParaDetalleCuentaFlujoCajas() throws Exception {
		Boolean isPaginaPopupDetalleCuentaFlujoCaja=false;

		try {

			if(this.cuentaflujocajaSessionBean==null) {
				this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
			}

			if(this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaSessionBean==null) {
				this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
			}

			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaSessionBean.setsPathNavegacionActual(cuentaflujocajaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja(true);
			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleCuentaFlujoCaja(CuentaFlujoCajaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionCuentaFlujoCaja(true);
			this.jInternalFrameDetalleFormCuentaFlujoCaja.detallecuentaflujocajaSessionBean.setlidCuentaFlujoCajaActual(this.idCuentaFlujoCajaActual);

			cuentaflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCaja(true);
			cuentaflujocajaSessionBean.setlIdCuentaFlujoCajaActualForeignKey(this.idCuentaFlujoCajaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionCuentaFlujoCajaParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(cuentaflujocajaSessionBean==null) {
				cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(cuentaflujocajaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.cuentaflujocajaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(CuentaFlujoCajaConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionCuentaFlujoCaja(true);
			//cuentacontableSessionBean.setlidCuentaFlujoCajaActual(this.idCuentaFlujoCajaActual);

			cuentaflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaFlujoCaja(true);
			cuentaflujocajaSessionBean.setlIdCuentaFlujoCajaActualForeignKey(this.idCuentaFlujoCajaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CuentaFlujoCajaSessionBean cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
		
		if(this.cuentaflujocajaSessionBean==null) {
			this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
		}
		
		this.cuentaflujocajaSessionBean.setsUltimaBusquedaCuentaFlujoCaja(this.getsAccionBusqueda());
		this.cuentaflujocajaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cuentaflujocajaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			cuentaflujocajaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			cuentaflujocajaSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cuentaflujocajaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CuentaFlujoCajaSessionBean cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
		
		if(this.cuentaflujocajaSessionBean==null) {
			this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
		}
		
		if(this.cuentaflujocajaSessionBean.getsUltimaBusquedaCuentaFlujoCaja()!=null&&!this.cuentaflujocajaSessionBean.getsUltimaBusquedaCuentaFlujoCaja().equals("")) {
			this.setsAccionBusqueda(cuentaflujocajaSessionBean.getsUltimaBusquedaCuentaFlujoCaja());
			this.setiNumeroPaginacion(cuentaflujocajaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cuentaflujocajaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(cuentaflujocajaSessionBean.getnombre());
				cuentaflujocajaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(cuentaflujocajaSessionBean.getid_cuenta_contable());
				cuentaflujocajaSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cuentaflujocajaSessionBean.getid_empresa());
				cuentaflujocajaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.cuentaflujocajaSessionBean.setsUltimaBusquedaCuentaFlujoCaja("");
		this.cuentaflujocajaSessionBean.setiNumeroPaginacion(CuentaFlujoCajaConstantesFunciones.INUMEROPAGINACION);
		this.cuentaflujocajaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCuentaFlujoCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCuentaFlujoCaja() {
		this.updateBorderResaltarBusquedasFormularioCuentaFlujoCaja();
		this.updateVisibilidadBusquedasFormularioCuentaFlujoCaja();
		this.updateHabilitarBusquedasFormularioCuentaFlujoCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioCuentaFlujoCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCuentaFlujoCaja.getComponents().length>0) {
	

		if(this.cuentaflujocajaConstantesFunciones.resaltarBusquedaPorNombreCuentaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasCuentaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreCuentaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.cuentaflujocajaConstantesFunciones.resaltarBusquedaPorNombreCuentaFlujoCaja);
			}
		}

		if(this.cuentaflujocajaConstantesFunciones.resaltarFK_IdCuentaContableCuentaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.cuentaflujocajaConstantesFunciones.resaltarFK_IdCuentaContableCuentaFlujoCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCuentaFlujoCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCuentaFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreCuentaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarBusquedaPorNombreCuentaFlujoCaja);
			if(!this.cuentaflujocajaConstantesFunciones.mostrarBusquedaPorNombreCuentaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasCuentaFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarFK_IdCuentaContableCuentaFlujoCaja);
			if(!this.cuentaflujocajaConstantesFunciones.mostrarFK_IdCuentaContableCuentaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasCuentaFlujoCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCuentaFlujoCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCuentaFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreCuentaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentaflujocajaConstantesFunciones.activarBusquedaPorNombreCuentaFlujoCaja);
				this.jTabbedPaneBusquedasCuentaFlujoCaja.setEnabledAt(index,this.cuentaflujocajaConstantesFunciones.activarBusquedaPorNombreCuentaFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentaflujocajaConstantesFunciones.activarFK_IdCuentaContableCuentaFlujoCaja);
				this.jTabbedPaneBusquedasCuentaFlujoCaja.setEnabledAt(index,this.cuentaflujocajaConstantesFunciones.activarFK_IdCuentaContableCuentaFlujoCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCuentaFlujoCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasCuentaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreCuentaFlujoCaja);

			this.jTabbedPaneBusquedasCuentaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaFlujoCaja.getComponent(index);

			this.cuentaflujocajaConstantesFunciones.setResaltarBusquedaPorNombreCuentaFlujoCaja(resaltar);

			jPanel.setBorder(this.cuentaflujocajaConstantesFunciones.resaltarBusquedaPorNombreCuentaFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaFlujoCaja);

			this.jTabbedPaneBusquedasCuentaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaFlujoCaja.getComponent(index);

			this.cuentaflujocajaConstantesFunciones.setResaltarFK_IdCuentaContableCuentaFlujoCaja(resaltar);

			jPanel.setBorder(this.cuentaflujocajaConstantesFunciones.resaltarFK_IdCuentaContableCuentaFlujoCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCuentaFlujoCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCuentaFlujoCaja() throws Exception {

		if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCuentaFlujoCaja();
		this.updateVisibilidadResaltarControlesFormularioCuentaFlujoCaja();
		this.updateHabilitarResaltarControlesFormularioCuentaFlujoCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioCuentaFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cuentaflujocajaConstantesFunciones.resaltaridCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelidCuentaFlujoCaja.setBorder(this.cuentaflujocajaConstantesFunciones.resaltaridCuentaFlujoCaja);}
		if(this.cuentaflujocajaConstantesFunciones.resaltarid_empresaCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.setBorder(this.cuentaflujocajaConstantesFunciones.resaltarid_empresaCuentaFlujoCaja);}
		if(this.cuentaflujocajaConstantesFunciones.resaltarnombreCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreanombreCuentaFlujoCaja.setBorder(this.cuentaflujocajaConstantesFunciones.resaltarnombreCuentaFlujoCaja);}
		if(this.cuentaflujocajaConstantesFunciones.resaltarid_mesCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.setBorder(this.cuentaflujocajaConstantesFunciones.resaltarid_mesCuentaFlujoCaja);}
		if(this.cuentaflujocajaConstantesFunciones.resaltarid_diaCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.setBorder(this.cuentaflujocajaConstantesFunciones.resaltarid_diaCuentaFlujoCaja);}
		if(this.cuentaflujocajaConstantesFunciones.resaltarid_cuenta_contableCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.setBorder(this.cuentaflujocajaConstantesFunciones.resaltarid_cuenta_contableCuentaFlujoCaja);}
		if(this.cuentaflujocajaConstantesFunciones.resaltarformulaCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreaformulaCuentaFlujoCaja.setBorder(this.cuentaflujocajaConstantesFunciones.resaltarformulaCuentaFlujoCaja);}
		if(this.cuentaflujocajaConstantesFunciones.resaltares_flujo_cajaCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxes_flujo_cajaCuentaFlujoCaja.setBorderPainted(true);this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxes_flujo_cajaCuentaFlujoCaja.setBorder(this.cuentaflujocajaConstantesFunciones.resaltares_flujo_cajaCuentaFlujoCaja);}
		if(this.cuentaflujocajaConstantesFunciones.resaltarcon_agruparCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxcon_agruparCuentaFlujoCaja.setBorderPainted(true);this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxcon_agruparCuentaFlujoCaja.setBorder(this.cuentaflujocajaConstantesFunciones.resaltarcon_agruparCuentaFlujoCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCuentaFlujoCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
	
		//this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelidCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostraridCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelidCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostraridCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarid_empresaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelid_empresaCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarid_empresaCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreanombreCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarnombreCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelnombreCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarnombreCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarid_mesCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelid_mesCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarid_mesCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarid_diaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelid_diaCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarid_diaCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarid_cuenta_contableCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelid_cuenta_contableCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarid_cuenta_contableCuentaFlujoCaja);
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarid_cuenta_contableCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreaformulaCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarformulaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelformulaCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarformulaCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxes_flujo_cajaCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrares_flujo_cajaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jPaneles_flujo_cajaCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrares_flujo_cajaCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxcon_agruparCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarcon_agruparCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jPanelcon_agruparCuentaFlujoCaja.setVisible(this.cuentaflujocajaConstantesFunciones.mostrarcon_agruparCuentaFlujoCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCuentaFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaFlujoCaja!=null) {
	
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jLabelidCuentaFlujoCaja.setEnabled(this.cuentaflujocajaConstantesFunciones.activaridCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_empresaCuentaFlujoCaja.setEnabled(this.cuentaflujocajaConstantesFunciones.activarid_empresaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreanombreCuentaFlujoCaja.setEnabled(this.cuentaflujocajaConstantesFunciones.activarnombreCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_mesCuentaFlujoCaja.setEnabled(this.cuentaflujocajaConstantesFunciones.activarid_mesCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_diaCuentaFlujoCaja.setEnabled(this.cuentaflujocajaConstantesFunciones.activarid_diaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jComboBoxid_cuenta_contableCuentaFlujoCaja.setEnabled(this.cuentaflujocajaConstantesFunciones.activarid_cuenta_contableCuentaFlujoCaja);
			this.jInternalFrameDetalleFormCuentaFlujoCaja.jButtonid_cuenta_contableCuentaFlujoCaja.setEnabled(this.cuentaflujocajaConstantesFunciones.activarid_cuenta_contableCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jTextAreaformulaCuentaFlujoCaja.setEnabled(this.cuentaflujocajaConstantesFunciones.activarformulaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxes_flujo_cajaCuentaFlujoCaja.setEnabled(this.cuentaflujocajaConstantesFunciones.activares_flujo_cajaCuentaFlujoCaja);
		this.jInternalFrameDetalleFormCuentaFlujoCaja.jCheckBoxcon_agruparCuentaFlujoCaja.setEnabled(this.cuentaflujocajaConstantesFunciones.activarcon_agruparCuentaFlujoCaja);
		}
	}
	
		
}