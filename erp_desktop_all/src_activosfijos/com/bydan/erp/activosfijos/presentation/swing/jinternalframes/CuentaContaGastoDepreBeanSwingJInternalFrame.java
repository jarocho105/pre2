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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.CuentaContaGastoDepreConstantesFunciones;
import com.bydan.erp.activosfijos.util.CuentaContaGastoDepreParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.CuentaContaGastoDepreParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.CuentaContaGastoDepreBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CuentaContaGastoDepreBeanSwingJInternalFrame extends CuentaContaGastoDepreJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CuentaContaGastoDepreBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CuentaContaGastoDepre> cuentacontagastodepreValidator = new ClassValidator<CuentaContaGastoDepre>(CuentaContaGastoDepre.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CuentaContaGastoDepre cuentacontagastodepre;	
	public CuentaContaGastoDepre cuentacontagastodepreAux;
	public CuentaContaGastoDepre cuentacontagastodepreAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CuentaContaGastoDepre cuentacontagastodepreTotales;
	public Long idCuentaContaGastoDepreActual;
	public Long iIdNuevoCuentaContaGastoDepre=0L;
	public int rowIndexActual=0;
	
	
	
	
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

	public String sFinalQueryComboGastoDepreciacion="";

	public List<GastoDepreciacion> gastodepreciacionsForeignKey;

	public List<GastoDepreciacion> getgastodepreciacionsForeignKey() {
		return gastodepreciacionsForeignKey;
	}

	public void setgastodepreciacionsForeignKey(List<GastoDepreciacion> gastodepreciacionsForeignKey) {
		this.gastodepreciacionsForeignKey = gastodepreciacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public GastoDepreciacion gastodepreciacionForeignKey;

	public GastoDepreciacion getgastodepreciacionForeignKey() {
		return gastodepreciacionForeignKey;
	}

	public void setgastodepreciacionForeignKey(GastoDepreciacion gastodepreciacionForeignKey) {
		this.gastodepreciacionForeignKey = gastodepreciacionForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableActual=0L;

	public Long getidCuentaContableActual() {
		return idCuentaContableActual;
	}

	public void setidCuentaContableActual(Long idCuentaContableActual) {
		this.idCuentaContableActual= idCuentaContableActual;
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
	
	public Boolean isPermisoTodoCuentaContaGastoDepre;
	public Boolean isPermisoNuevoCuentaContaGastoDepre;
	public Boolean isPermisoActualizarCuentaContaGastoDepre;
	public Boolean isPermisoActualizarOriginalCuentaContaGastoDepre;
	public Boolean isPermisoEliminarCuentaContaGastoDepre;
	public Boolean isPermisoGuardarCambiosCuentaContaGastoDepre;
	public Boolean isPermisoConsultaCuentaContaGastoDepre;
	public Boolean isPermisoBusquedaCuentaContaGastoDepre;
	public Boolean isPermisoReporteCuentaContaGastoDepre;
	public Boolean isPermisoPaginacionMedioCuentaContaGastoDepre;
	public Boolean isPermisoPaginacionAltoCuentaContaGastoDepre;
	public Boolean isPermisoPaginacionTodoCuentaContaGastoDepre;
	public Boolean isPermisoCopiarCuentaContaGastoDepre;
	public Boolean isPermisoVerFormCuentaContaGastoDepre;
	public Boolean isPermisoDuplicarCuentaContaGastoDepre;
	public Boolean isPermisoOrdenCuentaContaGastoDepre;
	
	
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
	
	public CuentaContaGastoDepreParameterReturnGeneral cuentacontagastodepreReturnGeneral;
	public CuentaContaGastoDepreParameterReturnGeneral cuentacontagastodepreParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCuentaContaGastoDepre=false;
	public Boolean esParaAccionDesdeFormularioCuentaContaGastoDepre=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CuentaContaGastoDepreSessionBeanAdditional cuentacontagastodepreSessionBeanAdditional=null;
	
	public CuentaContaGastoDepreSessionBeanAdditional getCuentaContaGastoDepreSessionBeanAdditional() {
		return this.cuentacontagastodepreSessionBeanAdditional;
	}
	
	public void setCuentaContaGastoDepreSessionBeanAdditional(CuentaContaGastoDepreSessionBeanAdditional cuentacontagastodepreSessionBeanAdditional) {
		try {
			this.cuentacontagastodepreSessionBeanAdditional=cuentacontagastodepreSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CuentaContaGastoDepreBeanSwingJInternalFrameAdditional cuentacontagastodepreBeanSwingJInternalFrameAdditional=null;
	//public class CuentaContaGastoDepreBeanSwingJInternalFrame
	
	public CuentaContaGastoDepreBeanSwingJInternalFrameAdditional getCuentaContaGastoDepreBeanSwingJInternalFrameAdditional() {
		return this.cuentacontagastodepreBeanSwingJInternalFrameAdditional;
	}
	
	public void setCuentaContaGastoDepreBeanSwingJInternalFrameAdditional(CuentaContaGastoDepreBeanSwingJInternalFrameAdditional cuentacontagastodepreBeanSwingJInternalFrameAdditional) {
		try {
			this.cuentacontagastodepreBeanSwingJInternalFrameAdditional=cuentacontagastodepreBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CuentaContaGastoDepreLogic cuentacontagastodepreLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CuentaContaGastoDepre cuentacontagastodepreBean;
	public CuentaContaGastoDepreConstantesFunciones cuentacontagastodepreConstantesFunciones;
	//public CuentaContaGastoDepreParameterReturnGeneral cuentacontagastodepreReturnGeneral;
	
	//FK
	
	public CuentaContableLogic cuentacontableLogic;
	public GastoDepreciacionLogic gastodepreciacionLogic;
	
	//PARAMETROS
	
	
	//public List<CuentaContaGastoDepre> cuentacontagastodepres;	
	//public List<CuentaContaGastoDepre> cuentacontagastodepresEliminados;
	//public List<CuentaContaGastoDepre> cuentacontagastodepresAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCuentaContaGastoDepre=false;
	public Boolean isVisibilidadCeldaDuplicarCuentaContaGastoDepre=true;
	public Boolean isVisibilidadCeldaCopiarCuentaContaGastoDepre=true;
	public Boolean isVisibilidadCeldaVerFormCuentaContaGastoDepre=true;
	public Boolean isVisibilidadCeldaOrdenCuentaContaGastoDepre=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=false;
	public Boolean isVisibilidadCeldaModificarCuentaContaGastoDepre=false;
	public Boolean isVisibilidadCeldaActualizarCuentaContaGastoDepre=false;
	public Boolean isVisibilidadCeldaEliminarCuentaContaGastoDepre=false;
	public Boolean isVisibilidadCeldaCancelarCuentaContaGastoDepre=false;
	public Boolean isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdGastoDepreciacion=false;
	
	public Long getiIdNuevoCuentaContaGastoDepre() {
		return this.iIdNuevoCuentaContaGastoDepre;
	}

	public void setiIdNuevoCuentaContaGastoDepre(Long iIdNuevoCuentaContaGastoDepre) {
		this.iIdNuevoCuentaContaGastoDepre = iIdNuevoCuentaContaGastoDepre;
	}
	
	public Long getidCuentaContaGastoDepreActual() {
		return this.idCuentaContaGastoDepreActual;
	}

	public void setidCuentaContaGastoDepreActual(Long idCuentaContaGastoDepreActual) {
		this.idCuentaContaGastoDepreActual = idCuentaContaGastoDepreActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CuentaContaGastoDepre getcuentacontagastodepre() {
		return this.cuentacontagastodepre;
	}

	public void setcuentacontagastodepre(CuentaContaGastoDepre cuentacontagastodepre) {
		this.cuentacontagastodepre = cuentacontagastodepre;
	}
	
	public CuentaContaGastoDepre getcuentacontagastodepreAux() {
		return this.cuentacontagastodepreAux;
	}

	public void setcuentacontagastodepreAux(CuentaContaGastoDepre cuentacontagastodepreAux) {
		this.cuentacontagastodepreAux = cuentacontagastodepreAux;
	}				
	
	public CuentaContaGastoDepre getcuentacontagastodepreAnterior() {
		return this.cuentacontagastodepreAnterior;
	}

	public void setcuentacontagastodepreAnterior(CuentaContaGastoDepre cuentacontagastodepreAnterior) {
		this.cuentacontagastodepreAnterior = cuentacontagastodepreAnterior;
	}	
	
	public CuentaContaGastoDepre getcuentacontagastodepreTotales() {
		return this.cuentacontagastodepreTotales;
	}

	public void setcuentacontagastodepreTotales(CuentaContaGastoDepre cuentacontagastodepreTotales) {
		this.cuentacontagastodepreTotales = cuentacontagastodepreTotales;
	}	
	
	public CuentaContaGastoDepre getcuentacontagastodepreBean() {
		return this.cuentacontagastodepreBean;
	}

	public void setcuentacontagastodepreBean(CuentaContaGastoDepre cuentacontagastodepreBean) {
		this.cuentacontagastodepreBean = cuentacontagastodepreBean;
	}	
	
	public CuentaContaGastoDepreParameterReturnGeneral getcuentacontagastodepreReturnGeneral() {
		return this.cuentacontagastodepreReturnGeneral;
	}

	public void setcuentacontagastodepreReturnGeneral(CuentaContaGastoDepreParameterReturnGeneral cuentacontagastodepreReturnGeneral) {
		this.cuentacontagastodepreReturnGeneral = cuentacontagastodepreReturnGeneral;
	}	
	
	
	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_gasto_depreciacionFK_IdGastoDepreciacion=-1L;

	public Long getid_gasto_depreciacionFK_IdGastoDepreciacion() {
		return this.id_gasto_depreciacionFK_IdGastoDepreciacion;
	}

	public void setid_gasto_depreciacionFK_IdGastoDepreciacion(Long id_gasto_depreciacionFK_IdGastoDepreciacion) {
		this.id_gasto_depreciacionFK_IdGastoDepreciacion = id_gasto_depreciacionFK_IdGastoDepreciacion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CuentaContaGastoDepreLogic getCuentaContaGastoDepreLogic()	{		
		return cuentacontagastodepreLogic;
	}

	public void setCuentaContaGastoDepreLogic(CuentaContaGastoDepreLogic cuentacontagastodepreLogic) {
		this.cuentacontagastodepreLogic = cuentacontagastodepreLogic;
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
	
	public Boolean getIsEsNuevoCuentaContaGastoDepre() {
		return isEsNuevoCuentaContaGastoDepre;
	}

	public void setIsEsNuevoCuentaContaGastoDepre(Boolean isEsNuevoCuentaContaGastoDepre) {
		this.isEsNuevoCuentaContaGastoDepre = isEsNuevoCuentaContaGastoDepre;
	}

	public Boolean getEsParaAccionDesdeFormularioCuentaContaGastoDepre() {
		return esParaAccionDesdeFormularioCuentaContaGastoDepre;
	}
	
	public void setEsParaAccionDesdeFormularioCuentaContaGastoDepre(Boolean esParaAccionDesdeFormularioCuentaContaGastoDepre) {
		this.esParaAccionDesdeFormularioCuentaContaGastoDepre = esParaAccionDesdeFormularioCuentaContaGastoDepre;
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

			cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.cuentacontagastodepreSessionBean==null) {
				this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
			}

			if(!this.cuentacontagastodepreSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

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
					cuentacontableLogic.getEntityWithConnection(cuentacontagastodepreSessionBean.getlidCuentaContableActual());
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

	public void cargarCombosGastoDepreciacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.gastodepreciacionsForeignKey=new ArrayList<GastoDepreciacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			GastoDepreciacionLogic gastodepreciacionLogic=new GastoDepreciacionLogic();

			gastodepreciacionLogic.getGastoDepreciacionDataAccess().setIsForForeingKeyData(true);

			if(this.cuentacontagastodepreSessionBean==null) {
				this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
			}

			if(!this.cuentacontagastodepreSessionBean.getisBusquedaDesdeForeignKeySesionGastoDepreciacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacionLogic.getGastoDepreciacionDataAccess().setIsForForeingKeyData(true);

					gastodepreciacionLogic.getTodosGastoDepreciacionsWithConnection(sFinalQuery,new Pagination());

					this.gastodepreciacionsForeignKey=gastodepreciacionLogic.getGastoDepreciacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGastoDepreciacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacionLogic.getEntityWithConnection(cuentacontagastodepreSessionBean.getlidGastoDepreciacionActual());
					this.gastodepreciacionsForeignKey.add(gastodepreciacionLogic.getGastoDepreciacion());
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

					if(this.cuentacontagastodepre!=null) {
						this.cuentacontagastodepre.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
						this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableCuentaContaGastoDepre.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
						if(this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableCuentaContaGastoDepreGenerico)throws Exception
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
				jComboBoxid_cuenta_contableCuentaContaGastoDepreGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableCuentaContaGastoDepreGenerico!=null && jComboBoxid_cuenta_contableCuentaContaGastoDepreGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableCuentaContaGastoDepreGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualGastoDepreciacionForeignKey(Long idGastoDepreciacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			GastoDepreciacion  gastodepreciacionTemp=null;

			for(GastoDepreciacion gastodepreciacionAux:gastodepreciacionsForeignKey) {
				if(gastodepreciacionAux.getId()!=null && gastodepreciacionAux.getId().equals(idGastoDepreciacionSeleccionado)) {
					gastodepreciacionTemp=gastodepreciacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(gastodepreciacionTemp!=null) {

					if(this.cuentacontagastodepre!=null) {
						this.cuentacontagastodepre.setGastoDepreciacion(gastodepreciacionTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
						this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setSelectedItem(gastodepreciacionTemp);
					}
				} else {
					//jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setSelectedItem(gastodepreciacionTemp);
					if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
						if(this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdGastoDepreciacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(gastodepreciacionTemp!=null && jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre!=null) {
						jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setSelectedItem(gastodepreciacionTemp);
					} else {
						if(jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre!=null) {
							//jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setSelectedItem(gastodepreciacionTemp);
							if(jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.getItemCount()>0) {
								jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setSelectedIndex(0);
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

	public String getActualGastoDepreciacionForeignKeyDescripcion(Long idGastoDepreciacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			GastoDepreciacion  gastodepreciacionTemp=null;

			for(GastoDepreciacion gastodepreciacionAux:gastodepreciacionsForeignKey) {
				if(gastodepreciacionAux.getId()!=null && gastodepreciacionAux.getId().equals(idGastoDepreciacionSeleccionado)) {
					gastodepreciacionTemp=gastodepreciacionAux;
					break;
				}
			}


			sDescripcion=GastoDepreciacionConstantesFunciones.getGastoDepreciacionDescripcion(gastodepreciacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGastoDepreciacionForeignKeyGenerico(Long idGastoDepreciacionSeleccionado,JComboBox jComboBoxid_gasto_depreciacionCuentaContaGastoDepreGenerico)throws Exception
	{
		try
		{
			GastoDepreciacion  gastodepreciacionTemp=null;

			for(GastoDepreciacion gastodepreciacionAux:gastodepreciacionsForeignKey) {
				if(gastodepreciacionAux.getId()!=null && gastodepreciacionAux.getId().equals(idGastoDepreciacionSeleccionado)) {
					gastodepreciacionTemp=gastodepreciacionAux;
					break;
				}
			}

			if(gastodepreciacionTemp!=null) {
				jComboBoxid_gasto_depreciacionCuentaContaGastoDepreGenerico.setSelectedItem(gastodepreciacionTemp);
			} else {
				if(jComboBoxid_gasto_depreciacionCuentaContaGastoDepreGenerico!=null && jComboBoxid_gasto_depreciacionCuentaContaGastoDepreGenerico.getItemCount()>0) {
					jComboBoxid_gasto_depreciacionCuentaContaGastoDepreGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(CuentaContaGastoDepre cuentacontagastodepre,JComboBox jComboBoxid_cuenta_contableCuentaContaGastoDepreGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableCuentaContaGastoDepreGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableCuentaContaGastoDepreGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				cuentacontagastodepre.setid_cuenta_contable(cuentacontableAux.getId());
				cuentacontagastodepre.setcuentacontable_descripcion(CuentaContaGastoDepreConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				cuentacontagastodepre.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGastoDepreciacionForeignKey(CuentaContaGastoDepre cuentacontagastodepre,JComboBox jComboBoxid_gasto_depreciacionCuentaContaGastoDepreGenerico)throws Exception
	{
		try
		{
			GastoDepreciacion  gastodepreciacionAux=new GastoDepreciacion();

			if(jComboBoxid_gasto_depreciacionCuentaContaGastoDepreGenerico==null) {
				gastodepreciacionAux=(GastoDepreciacion)this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.getSelectedItem();
			} else {
				gastodepreciacionAux=(GastoDepreciacion)jComboBoxid_gasto_depreciacionCuentaContaGastoDepreGenerico.getSelectedItem();
			}

			if(gastodepreciacionAux!=null && gastodepreciacionAux.getId()!=null) {
				cuentacontagastodepre.setid_gasto_depreciacion(gastodepreciacionAux.getId());
				cuentacontagastodepre.setgastodepreciacion_descripcion(CuentaContaGastoDepreConstantesFunciones.getGastoDepreciacionDescripcion(gastodepreciacionAux));
				cuentacontagastodepre.setGastoDepreciacion(gastodepreciacionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { 
							this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { 
					}

					if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.addItem(cuentacontable);
							}
						}

						if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGastoDepreciacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGastoDepreciacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { 
							this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.removeAllItems();

							for(GastoDepreciacion gastodepreciacion:this.gastodepreciacionsForeignKey) {
								this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.addItem(gastodepreciacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { 
					}

					if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdGastoDepreciacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.removeAllItems();

							for(GastoDepreciacion gastodepreciacion:this.gastodepreciacionsForeignKey) {
								this.jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.addItem(gastodepreciacion);
							}
						}

						if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
							this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
							this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameGastoDepreciacionForeignKey(GastoDepreciacion gastodepreciacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
							this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setSelectedItem(gastodepreciacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
							this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setSelectedItem(gastodepreciacion);
						} else {
							this.jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCuentaContaGastoDepre() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CuentaContaGastoDepreConstantesFunciones.refrescarForeignKeysDescripcionesCuentaContaGastoDepre(this.cuentacontagastodepreLogic.getCuentaContaGastoDepres());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CuentaContaGastoDepreConstantesFunciones.refrescarForeignKeysDescripcionesCuentaContaGastoDepre(this.cuentacontagastodepres);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(GastoDepreciacion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cuentacontagastodepreLogic.setCuentaContaGastoDepres(this.cuentacontagastodepres);
			cuentacontagastodepreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CuentaContaGastoDepreParameterReturnGeneral getCuentaContaGastoDepreParameterGeneral() {
		return this.cuentacontagastodepreParameterGeneral;
	}
	
	public void setCuentaContaGastoDepreParameterGeneral(CuentaContaGastoDepreParameterReturnGeneral cuentacontagastodepreParameterGeneral) {
		this.cuentacontagastodepreParameterGeneral = cuentacontagastodepreParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCuentaContaGastoDepre() {
		return isPermisoTodoCuentaContaGastoDepre;
	}

	public void setIsPermisoTodoCuentaContaGastoDepre(Boolean isPermisoTodoCuentaContaGastoDepre) {
		this.isPermisoTodoCuentaContaGastoDepre = isPermisoTodoCuentaContaGastoDepre;
	}

	public Boolean getIsPermisoNuevoCuentaContaGastoDepre() {
		return isPermisoNuevoCuentaContaGastoDepre;
	}

	public void setIsPermisoNuevoCuentaContaGastoDepre(Boolean isPermisoNuevoCuentaContaGastoDepre) {
		this.isPermisoNuevoCuentaContaGastoDepre = isPermisoNuevoCuentaContaGastoDepre;
	}

	public Boolean getIsPermisoActualizarCuentaContaGastoDepre() {
		return isPermisoActualizarCuentaContaGastoDepre;
	}

	public void setIsPermisoActualizarCuentaContaGastoDepre(Boolean isPermisoActualizarCuentaContaGastoDepre) {
		this.isPermisoActualizarCuentaContaGastoDepre = isPermisoActualizarCuentaContaGastoDepre;
	}

	public Boolean getIsPermisoEliminarCuentaContaGastoDepre() {
		return isPermisoEliminarCuentaContaGastoDepre;
	}

	public void setIsPermisoEliminarCuentaContaGastoDepre(Boolean isPermisoEliminarCuentaContaGastoDepre) {
		this.isPermisoEliminarCuentaContaGastoDepre = isPermisoEliminarCuentaContaGastoDepre;
	}

	public Boolean getIsPermisoGuardarCambiosCuentaContaGastoDepre() {
		return isPermisoGuardarCambiosCuentaContaGastoDepre;
	}

	public void setIsPermisoGuardarCambiosCuentaContaGastoDepre(Boolean isPermisoGuardarCambiosCuentaContaGastoDepre) {
		this.isPermisoGuardarCambiosCuentaContaGastoDepre = isPermisoGuardarCambiosCuentaContaGastoDepre;
	}
	
	public Boolean getIsPermisoConsultaCuentaContaGastoDepre() {
		return isPermisoConsultaCuentaContaGastoDepre;
	}

	public void setIsPermisoConsultaCuentaContaGastoDepre(Boolean isPermisoConsultaCuentaContaGastoDepre) {
		this.isPermisoConsultaCuentaContaGastoDepre = isPermisoConsultaCuentaContaGastoDepre;
	}

	public Boolean getIsPermisoBusquedaCuentaContaGastoDepre() {
		return isPermisoBusquedaCuentaContaGastoDepre;
	}

	public void setIsPermisoBusquedaCuentaContaGastoDepre(Boolean isPermisoBusquedaCuentaContaGastoDepre) {
		this.isPermisoBusquedaCuentaContaGastoDepre = isPermisoBusquedaCuentaContaGastoDepre;
	}

	public Boolean getIsPermisoReporteCuentaContaGastoDepre() {
		return isPermisoReporteCuentaContaGastoDepre;
	}

	public void setIsPermisoReporteCuentaContaGastoDepre(Boolean isPermisoReporteCuentaContaGastoDepre) {
		this.isPermisoReporteCuentaContaGastoDepre = isPermisoReporteCuentaContaGastoDepre;
	}
	
	public Boolean getIsPermisoPaginacionMedioCuentaContaGastoDepre() {
		return isPermisoPaginacionMedioCuentaContaGastoDepre;
	}

	public void setIsPermisoPaginacionMedioCuentaContaGastoDepre(Boolean isPermisoPaginacionMedioCuentaContaGastoDepre) {
		this.isPermisoPaginacionMedioCuentaContaGastoDepre = isPermisoPaginacionMedioCuentaContaGastoDepre;
	}
	
	public Boolean getIsPermisoPaginacionTodoCuentaContaGastoDepre() {
		return isPermisoPaginacionTodoCuentaContaGastoDepre;
	}

	public void setIsPermisoPaginacionTodoCuentaContaGastoDepre(Boolean isPermisoPaginacionTodoCuentaContaGastoDepre) {
		this.isPermisoPaginacionTodoCuentaContaGastoDepre = isPermisoPaginacionTodoCuentaContaGastoDepre;
	}
	
	public Boolean getIsPermisoPaginacionAltoCuentaContaGastoDepre() {
		return isPermisoPaginacionAltoCuentaContaGastoDepre;
	}

	public void setIsPermisoPaginacionAltoCuentaContaGastoDepre(Boolean isPermisoPaginacionAltoCuentaContaGastoDepre) {
		this.isPermisoPaginacionAltoCuentaContaGastoDepre = isPermisoPaginacionAltoCuentaContaGastoDepre;
	}
	
	public Boolean getIsPermisoCopiarCuentaContaGastoDepre() {
		return isPermisoCopiarCuentaContaGastoDepre;
	}

	public void setIsPermisoCopiarCuentaContaGastoDepre(Boolean isPermisoCopiarCuentaContaGastoDepre) {
		this.isPermisoCopiarCuentaContaGastoDepre = isPermisoCopiarCuentaContaGastoDepre;
	}
	
	public Boolean getIsPermisoVerFormCuentaContaGastoDepre() {
		return isPermisoVerFormCuentaContaGastoDepre;
	}

	public void setIsPermisoVerFormCuentaContaGastoDepre(Boolean isPermisoVerFormCuentaContaGastoDepre) {
		this.isPermisoVerFormCuentaContaGastoDepre = isPermisoVerFormCuentaContaGastoDepre;
	}
	
	public Boolean getIsPermisoDuplicarCuentaContaGastoDepre() {
		return isPermisoDuplicarCuentaContaGastoDepre;
	}

	public void setIsPermisoDuplicarCuentaContaGastoDepre(Boolean isPermisoDuplicarCuentaContaGastoDepre) {
		this.isPermisoDuplicarCuentaContaGastoDepre = isPermisoDuplicarCuentaContaGastoDepre;
	}
	
	public Boolean getIsPermisoOrdenCuentaContaGastoDepre() {
		return isPermisoOrdenCuentaContaGastoDepre;
	}

	public void setIsPermisoOrdenCuentaContaGastoDepre(Boolean isPermisoOrdenCuentaContaGastoDepre) {
		this.isPermisoOrdenCuentaContaGastoDepre = isPermisoOrdenCuentaContaGastoDepre;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCuentaContaGastoDepre() {
		return isVisibilidadCeldaNuevoCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaNuevoCuentaContaGastoDepre(Boolean isVisibilidadCeldaNuevoCuentaContaGastoDepre) {
		this.isVisibilidadCeldaNuevoCuentaContaGastoDepre = isVisibilidadCeldaNuevoCuentaContaGastoDepre;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCuentaContaGastoDepre() {
		return isVisibilidadCeldaDuplicarCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaDuplicarCuentaContaGastoDepre(Boolean isVisibilidadCeldaDuplicarCuentaContaGastoDepre) {
		this.isVisibilidadCeldaDuplicarCuentaContaGastoDepre = isVisibilidadCeldaDuplicarCuentaContaGastoDepre;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCuentaContaGastoDepre() {
		return isVisibilidadCeldaCopiarCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaCopiarCuentaContaGastoDepre(Boolean isVisibilidadCeldaCopiarCuentaContaGastoDepre) {
		this.isVisibilidadCeldaCopiarCuentaContaGastoDepre = isVisibilidadCeldaCopiarCuentaContaGastoDepre;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCuentaContaGastoDepre() {
		return isVisibilidadCeldaVerFormCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaVerFormCuentaContaGastoDepre(Boolean isVisibilidadCeldaVerFormCuentaContaGastoDepre) {
		this.isVisibilidadCeldaVerFormCuentaContaGastoDepre = isVisibilidadCeldaVerFormCuentaContaGastoDepre;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCuentaContaGastoDepre() {
		return isVisibilidadCeldaOrdenCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaOrdenCuentaContaGastoDepre(Boolean isVisibilidadCeldaOrdenCuentaContaGastoDepre) {
		this.isVisibilidadCeldaOrdenCuentaContaGastoDepre = isVisibilidadCeldaOrdenCuentaContaGastoDepre;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre() {
		return isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre(Boolean isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre) {
		this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre = isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCuentaContaGastoDepre() {
		return isVisibilidadCeldaModificarCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaModificarCuentaContaGastoDepre(Boolean isVisibilidadCeldaModificarCuentaContaGastoDepre) {
		this.isVisibilidadCeldaModificarCuentaContaGastoDepre = isVisibilidadCeldaModificarCuentaContaGastoDepre;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCuentaContaGastoDepre() {
		return isVisibilidadCeldaActualizarCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaActualizarCuentaContaGastoDepre(Boolean isVisibilidadCeldaActualizarCuentaContaGastoDepre) {
		this.isVisibilidadCeldaActualizarCuentaContaGastoDepre = isVisibilidadCeldaActualizarCuentaContaGastoDepre;
	}

	public Boolean getIsVisibilidadCeldaEliminarCuentaContaGastoDepre() {
		return isVisibilidadCeldaEliminarCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaEliminarCuentaContaGastoDepre(Boolean isVisibilidadCeldaEliminarCuentaContaGastoDepre) {
		this.isVisibilidadCeldaEliminarCuentaContaGastoDepre = isVisibilidadCeldaEliminarCuentaContaGastoDepre;
	}

	public Boolean getIsVisibilidadCeldaCancelarCuentaContaGastoDepre() {
		return isVisibilidadCeldaCancelarCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaCancelarCuentaContaGastoDepre(Boolean isVisibilidadCeldaCancelarCuentaContaGastoDepre) {
		this.isVisibilidadCeldaCancelarCuentaContaGastoDepre = isVisibilidadCeldaCancelarCuentaContaGastoDepre;
	}

	public Boolean getIsVisibilidadCeldaGuardarCuentaContaGastoDepre() {
		return isVisibilidadCeldaGuardarCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaGuardarCuentaContaGastoDepre(Boolean isVisibilidadCeldaGuardarCuentaContaGastoDepre) {
		this.isVisibilidadCeldaGuardarCuentaContaGastoDepre = isVisibilidadCeldaGuardarCuentaContaGastoDepre;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre() {
		return isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre(Boolean isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre) {
		this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre = isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre;
	}
		
	public CuentaContaGastoDepreSessionBean getcuentacontagastodepreSessionBean() {
		return this.cuentacontagastodepreSessionBean;
	}
	
	public void setcuentacontagastodepreSessionBean(CuentaContaGastoDepreSessionBean cuentacontagastodepreSessionBean) {
		this.cuentacontagastodepreSessionBean=cuentacontagastodepreSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdGastoDepreciacion() {
		return this.isVisibilidadFK_IdGastoDepreciacion;
	}

	public void setisVisibilidadFK_IdGastoDepreciacion(Boolean isVisibilidadFK_IdGastoDepreciacion) {
		this.isVisibilidadFK_IdGastoDepreciacion=isVisibilidadFK_IdGastoDepreciacion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre)throws Exception {
		try {
			
				this.setActualParaGuardarCuentaContableForeignKey(cuentacontagastodepre,null);
				this.setActualParaGuardarGastoDepreciacionForeignKey(cuentacontagastodepre,null);
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
	
	public void bugActualizarReferenciaActual(CuentaContaGastoDepre cuentacontagastodepre,CuentaContaGastoDepre cuentacontagastodepreAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCuentaContaGastoDepre(cuentacontagastodepre);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cuentacontagastodepreAux.setId(cuentacontagastodepre.getId());
		cuentacontagastodepreAux.setVersionRow(cuentacontagastodepre.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCuentaContaGastoDepre();
		
			int intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.cuentacontagastodepre,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cuentacontagastodepreValidator.getInvalidValues(this.cuentacontagastodepre);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cuentacontagastodepreLogic.setDatosCliente(datosCliente);
			cuentacontagastodepreLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cuentacontagastodepreAux=new  CuentaContaGastoDepre();
				
				cuentacontagastodepreAux.setIsNew(true);
				cuentacontagastodepreAux.setIsChanged(true);
				
				cuentacontagastodepreAux.setCuentaContaGastoDepreOriginal(this.cuentacontagastodepre);
				
				cuentacontagastodepreAux.setId(this.cuentacontagastodepre.getId());	
				cuentacontagastodepreAux.setVersionRow(this.cuentacontagastodepre.getVersionRow());	
				cuentacontagastodepreAux.setid_cuenta_contable(this.cuentacontagastodepre.getid_cuenta_contable());	
				cuentacontagastodepreAux.setid_gasto_depreciacion(this.cuentacontagastodepre.getid_gasto_depreciacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cuentacontagastodepreAux,cuentacontagastodepreLogic.getCuentaContaGastoDepres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontagastodepreAux,cuentacontagastodepres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontagastodepreLogic.saveCuentaContaGastoDepres();//WithConnection
						//cuentacontagastodepreLogic.getSetVersionRowCuentaContaGastoDepres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentacontagastodepre,cuentacontagastodepreAux);
					
					this.refrescarForeignKeysDescripcionesCuentaContaGastoDepre();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacontagastodepreLogic.saveCuentaContaGastoDepreRelaciones(cuentacontagastodepreAux);//WithConnection
								//cuentacontagastodepreLogic.getSetVersionRowCuentaContaGastoDepres();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentacontagastodepre,cuentacontagastodepreAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentacontagastodepreAux,cuentacontagastodepreLogic.getCuentaContaGastoDepres());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentacontagastodepreAux,cuentacontagastodepres);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentacontagastodepre,cuentacontagastodepreAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cuentacontagastodepreAux=new  CuentaContaGastoDepre();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado() 
					|| (this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado() && this.cuentacontagastodepre.getId()>=0)) {
						
					cuentacontagastodepreAux.setIsNew(false);
				}
				
				cuentacontagastodepreAux.setIsDeleted(false);
			
				cuentacontagastodepreAux.setId(this.cuentacontagastodepre.getId());	
				cuentacontagastodepreAux.setVersionRow(this.cuentacontagastodepre.getVersionRow());	
				cuentacontagastodepreAux.setid_cuenta_contable(this.cuentacontagastodepre.getid_cuenta_contable());	
				cuentacontagastodepreAux.setid_gasto_depreciacion(this.cuentacontagastodepre.getid_gasto_depreciacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentacontagastodepreAux,cuentacontagastodepreLogic.getCuentaContaGastoDepres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontagastodepreAux,cuentacontagastodepres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontagastodepreLogic.saveCuentaContaGastoDepres();//WithConnection
						//cuentacontagastodepreLogic.getSetVersionRowCuentaContaGastoDepres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentacontagastodepre,cuentacontagastodepreAux);
					
					this.refrescarForeignKeysDescripcionesCuentaContaGastoDepre();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacontagastodepreLogic.saveCuentaContaGastoDepreRelaciones(cuentacontagastodepreAux);//WithConnection
								//cuentacontagastodepreLogic.getSetVersionRowCuentaContaGastoDepres();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentacontagastodepre,cuentacontagastodepreAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentacontagastodepreAux,cuentacontagastodepreLogic.getCuentaContaGastoDepres());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentacontagastodepreAux,cuentacontagastodepres);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentacontagastodepre,cuentacontagastodepreAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cuentacontagastodepreAux=new  CuentaContaGastoDepre();
				
				cuentacontagastodepreAux.setIsNew(false);
				cuentacontagastodepreAux.setIsChanged(false);
				
				cuentacontagastodepreAux.setIsDeleted(true);
				
				cuentacontagastodepreAux.setId(this.cuentacontagastodepre.getId());	
				cuentacontagastodepreAux.setVersionRow(this.cuentacontagastodepre.getVersionRow());	
				cuentacontagastodepreAux.setid_cuenta_contable(this.cuentacontagastodepre.getid_cuenta_contable());	
				cuentacontagastodepreAux.setid_gasto_depreciacion(this.cuentacontagastodepre.getid_gasto_depreciacion());	
				
				if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cuentacontagastodepreAux.getId()>=0) {	
						this.cuentacontagastodepresEliminados.add(cuentacontagastodepreAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cuentacontagastodepreAux,cuentacontagastodepreLogic.getCuentaContaGastoDepres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontagastodepreAux,cuentacontagastodepres);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontagastodepreLogic.saveCuentaContaGastoDepres();//WithConnection
						//cuentacontagastodepreLogic.getSetVersionRowCuentaContaGastoDepres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacontagastodepreLogic.saveCuentaContaGastoDepreRelaciones(cuentacontagastodepreAux);//WithConnection
								//cuentacontagastodepreLogic.getSetVersionRowCuentaContaGastoDepres();//WithConnection
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
							if(this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cuentacontagastodepreAux,cuentacontagastodepreLogic.getCuentaContaGastoDepres());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cuentacontagastodepreAux,cuentacontagastodepres);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().addAll(this.cuentacontagastodepresEliminados);
					
					cuentacontagastodepreLogic.saveCuentaContaGastoDepres();//WithConnection
					//cuentacontagastodepreLogic.getSetVersionRowCuentaContaGastoDepres();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCuentaContaGastoDepre();
				
				this.cuentacontagastodepresEliminados= new ArrayList<CuentaContaGastoDepre>();		
			}
			
			if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cuenta Conta Gasto Depre GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Conta Gasto Depre",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cuentacontagastodepre=cuentacontagastodepreAux;
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
      		//this.finishProcessCuentaContaGastoDepre();
      	}
		
	}	
	
	public void actualizarRelaciones(CuentaContaGastoDepre cuentacontagastodepreLocal) throws Exception {
		
		if(this.cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CuentaContaGastoDepre cuentacontagastodepreLocal) throws Exception {	
		if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				cuentacontagastodepreLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GastoDepreciacionDetalleFormJInternalFrame.class)) {
				GastoDepreciacionBeanSwingJInternalFrame gastodepreciacionBeanSwingJInternalFrameLocal=(GastoDepreciacionBeanSwingJInternalFrame) ((GastoDepreciacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				gastodepreciacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGastoDepreciacion(gastodepreciacionBeanSwingJInternalFrameLocal.getgastodepreciacion(),true);
				gastodepreciacionBeanSwingJInternalFrameLocal.actualizarLista(gastodepreciacionBeanSwingJInternalFrameLocal.gastodepreciacion,this.gastodepreciacionsForeignKey);

				gastodepreciacionBeanSwingJInternalFrameLocal.actualizarRelaciones(gastodepreciacionBeanSwingJInternalFrameLocal.gastodepreciacion);

				cuentacontagastodepreLocal.setGastoDepreciacion(gastodepreciacionBeanSwingJInternalFrameLocal.gastodepreciacion);

				this.addItemDefectoCombosForeignKeyGastoDepreciacion();
				this.cargarCombosFrameGastoDepreciacionsForeignKey("Formulario");
				this.setActualGastoDepreciacionForeignKey(gastodepreciacionBeanSwingJInternalFrameLocal.gastodepreciacion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCuentaContaGastoDepreActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cuentacontagastodepreValidator.getInvalidValues(this.cuentacontagastodepre);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CuentaContaGastoDepre cuentacontagastodepre,List<CuentaContaGastoDepre> cuentacontagastodepres) throws Exception {
		try	{		
			CuentaContaGastoDepreConstantesFunciones.actualizarLista(cuentacontagastodepre,cuentacontagastodepres,this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CuentaContaGastoDepre cuentacontagastodepre,List<CuentaContaGastoDepre> cuentacontagastodepres) throws Exception {
		try	{			
			CuentaContaGastoDepreConstantesFunciones.actualizarSelectedLista(cuentacontagastodepre,cuentacontagastodepres);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CuentaContaGastoDepre> cuentacontagastodepresLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cuentacontagastodepresLocal=this.cuentacontagastodepreLogic.getCuentaContaGastoDepres();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cuentacontagastodepresLocal=this.cuentacontagastodepres;
			}
			//ARCHITECTURE
		
			for(CuentaContaGastoDepre cuentacontagastodepreLocal:cuentacontagastodepresLocal) {
				if(this.permiteMantenimiento(cuentacontagastodepreLocal) && cuentacontagastodepreLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CuentaContaGastoDepreConstantesFunciones.getCuentaContaGastoDepreLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CuentaContaGastoDepreConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelid_cuenta_contableCuentaContaGastoDepre,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaContaGastoDepreConstantesFunciones.IDGASTODEPRECIACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelid_gasto_depreciacionCuentaContaGastoDepre,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelid_cuenta_contableCuentaContaGastoDepre,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelid_gasto_depreciacionCuentaContaGastoDepre,"");
		
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
		this.iIdNuevoCuentaContaGastoDepre--;	
		
		
		this.cuentacontagastodepreAux=new CuentaContaGastoDepre();
		
		this.cuentacontagastodepreAux.setId(this.iIdNuevoCuentaContaGastoDepre);
		this.cuentacontagastodepreAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().add(this.cuentacontagastodepreAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cuentacontagastodepres.add(this.cuentacontagastodepreAux);
		}
		//ARCHITECTURE
		
		this.cuentacontagastodepre=this.cuentacontagastodepreAux;
		
		if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCuentaContaGastoDepre(this.cuentacontagastodepre);
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaContaGastoDepre(this.cuentacontagastodepre);
		}
				
		//this.setDefaultControlesCuentaContaGastoDepre();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCuentaContaGastoDepre();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCuentaContaGastoDepre();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaContaGastoDepre();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaContaGastoDepre(this.cuentacontagastodepreBean,this.cuentacontagastodepre,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
			classes=CuentaContaGastoDepreConstantesFunciones.getClassesRelationshipsOfCuentaContaGastoDepre(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cuentacontagastodepreReturnGeneral=cuentacontagastodepreLogic.procesarEventosCuentaContaGastoDepresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacontagastodepreLogic.getCuentaContaGastoDepres(),this.cuentacontagastodepre,this.cuentacontagastodepreParameterGeneral,this.isEsNuevoCuentaContaGastoDepre,classes);//this.cuentacontagastodepreLogic.getCuentaContaGastoDepre()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCuentaContaGastoDepre(this.cuentacontagastodepreReturnGeneral,this.cuentacontagastodepreBean,false);
		
		if(this.cuentacontagastodepreReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaContaGastoDepre(this.cuentacontagastodepreReturnGeneral.getCuentaContaGastoDepre());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCuentaContaGastoDepre(this.cuentacontagastodepreReturnGeneral.getCuentaContaGastoDepre());
		}
		
		if(this.cuentacontagastodepreReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCuentaContaGastoDepre(this.cuentacontagastodepreReturnGeneral.getCuentaContaGastoDepre(),classes);//this.cuentacontagastodepreBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.cuentacontagastodepre,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCuentaContaGastoDepre();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCuentaContaGastoDepre();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.RecargarFormCuentaContaGastoDepre(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCuentaContaGastoDepre(false);
						
			if(cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaContaGastoDepre();
			}
			
			this.actualizarVisualTableDatosCuentaContaGastoDepre();
			
			this.jTableDatosCuentaContaGastoDepre.setRowSelectionInterval(this.getIndiceNuevoCuentaContaGastoDepre(), this.getIndiceNuevoCuentaContaGastoDepre());
			
			this.seleccionarFilaTablaCuentaContaGastoDepreActual();
						
			this.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCuentaContaGastoDepre(Boolean isHabilitar) throws Exception {
			
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.setEnabled(isHabilitar && this.cuentacontagastodepreConstantesFunciones.activarid_cuenta_contableCuentaContaGastoDepre);
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setEnabled(isHabilitar && this.cuentacontagastodepreConstantesFunciones.activarid_gasto_depreciacionCuentaContaGastoDepre);
	};
	
	public void setDefaultControlesCuentaContaGastoDepre() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCuentaContaGastoDepre(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cuentacontagastodepreSessionBean.setConGuardarRelaciones(true);			
			this.cuentacontagastodepreSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jTabbedPaneRelacionesCuentaContaGastoDepre.setVisible(true);
			
					
		} else {
			//this.cuentacontagastodepreSessionBean.setConGuardarRelaciones(false);			
			this.cuentacontagastodepreSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jTabbedPaneRelacionesCuentaContaGastoDepre.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCuentaContaGastoDepre() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
				if(cuentacontagastodepreAux.getId().equals(this.iIdNuevoCuentaContaGastoDepre)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepres) {
				if(cuentacontagastodepreAux.getId().equals(this.iIdNuevoCuentaContaGastoDepre)) {
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
	
	public int getIndiceActualCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
				if(cuentacontagastodepreAux.getId().equals(cuentacontagastodepre.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepres) {
				if(cuentacontagastodepreAux.getId().equals(cuentacontagastodepre.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepreOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
				if(cuentacontagastodepreAux.getCuentaContaGastoDepreOriginal().getId().equals(cuentacontagastodepreOriginal.getId())) {
					existe=true;
					cuentacontagastodepreOriginal.setId(cuentacontagastodepreAux.getId());
					cuentacontagastodepreOriginal.setVersionRow(cuentacontagastodepreAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepres) {
				if(cuentacontagastodepreAux.getCuentaContaGastoDepreOriginal().getId().equals(cuentacontagastodepreOriginal.getId())) {
					existe=true;
					cuentacontagastodepreOriginal.setId(cuentacontagastodepreAux.getId());
					cuentacontagastodepreOriginal.setVersionRow(cuentacontagastodepreAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCuentaContaGastoDepre(Boolean esParaCancelar) throws Exception {
		cuentacontagastodepresAux=new ArrayList<CuentaContaGastoDepre>();
		cuentacontagastodepreAux=new CuentaContaGastoDepre();
		
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
					if(cuentacontagastodepreAux.getId()<0) {
						cuentacontagastodepresAux.add(cuentacontagastodepreAux);
					}		
				}
				this.iIdNuevoCuentaContaGastoDepre=0L;
				this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().removeAll(cuentacontagastodepresAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepres) {
					if(cuentacontagastodepreAux.getId()<0) {
						cuentacontagastodepresAux.add(cuentacontagastodepreAux);
					}		
				}
				this.iIdNuevoCuentaContaGastoDepre=0L;
				this.cuentacontagastodepres.removeAll(cuentacontagastodepresAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCuentaContaGastoDepre 
					&& this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().size()>0
					) {
					cuentacontagastodepreAux=this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().get(this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().size() - 1);
				
					if(cuentacontagastodepreAux.getId()<0) {
						this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().remove(cuentacontagastodepreAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCuentaContaGastoDepre && this.cuentacontagastodepres.size()>0) {
					cuentacontagastodepreAux=this.cuentacontagastodepres.get(this.cuentacontagastodepres.size() - 1);
				
					if(cuentacontagastodepreAux.getId()<0) {
						this.cuentacontagastodepres.remove(cuentacontagastodepreAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCuentaContaGastoDepre(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cuentacontagastodepre.getId()<0) {
				this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().remove(this.cuentacontagastodepre);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cuentacontagastodepre.getId()<0) {
				this.cuentacontagastodepres.remove(this.cuentacontagastodepre);
			}
		}			
	}
	
	public void setEstadosInicialesCuentaContaGastoDepre(List<CuentaContaGastoDepre> cuentacontagastodepresAux) throws Exception {
		CuentaContaGastoDepreConstantesFunciones.setEstadosInicialesCuentaContaGastoDepre(cuentacontagastodepresAux);
	}
	
	public void setEstadosInicialesCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepreAux) throws Exception {
		CuentaContaGastoDepreConstantesFunciones.setEstadosInicialesCuentaContaGastoDepre(cuentacontagastodepreAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCuentaContaGastoDepreActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCuentaContaGastoDepreActual()) {
				if(!this.isEsNuevoCuentaContaGastoDepre) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCuentaContaGastoDepre=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCuentaContaGastoDepreActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cuenta Conta Gasto Depre ?", "MANTENIMIENTO DE Cuenta Conta Gasto Depre", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CuentaContaGastoDepre cuentacontagastodepre) throws Exception {
		CuentaContaGastoDepreConstantesFunciones.seleccionarAsignar(this.cuentacontagastodepre,cuentacontagastodepre);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCuentaContaGastoDepre=this.isPermisoActualizarOriginalCuentaContaGastoDepre;
			
			
			this.seleccionarAsignar(cuentacontagastodepre);
			
			

			idCuentaContableActual=cuentacontagastodepre.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaContaGastoDepreConstantesFunciones.quitarEspaciosCuentaContaGastoDepre(this.cuentacontagastodepre,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cuentacontagastodepreSessionBean.setsFuncionBusquedaRapida(this.cuentacontagastodepreSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoCuentaContaGastoDepre) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCuentaContaGastoDepre(esParaCancelar);				
				this.cancelarNuevoCuentaContaGastoDepre(esParaCancelar);								
			}
			
			this.cuentacontagastodepre=new CuentaContaGastoDepre();
			
			this.inicializarCuentaContaGastoDepre();
			
			this.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCuentaContaGastoDepre() throws Exception {
		try {
			CuentaContaGastoDepreConstantesFunciones.inicializarCuentaContaGastoDepre(this.cuentacontagastodepre);
			
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
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCuentaContaGastoDepres(String sAccionBusqueda,List<CuentaContaGastoDepre> cuentacontagastodepresParaReportes) throws Exception {
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
					sPathReporteFinal="CuentaContaGastoDepre"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CuentaContaGastoDepreMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CuentaContaGastoDepreMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CuentaContaGastoDepre"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cuenta Conta Gasto Depres");		
		parameters.put("busquedapor", CuentaContaGastoDepreConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCuentaContaGastoDepre=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CuentaContaGastoDepreConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CuentaContaGastoDepreConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCuentaContaGastoDepre=new JRBeanArrayDataSource(CuentaContaGastoDepreJInternalFrame.TraerCuentaContaGastoDepreBeans(cuentacontagastodepresParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCuentaContaGastoDepre);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CuentaContaGastoDepreConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CuentaContaGastoDepreConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CuentaContaGastoDepreBean.TraerCuentaContaGastoDepreBeans(cuentacontagastodepresParaReportes).toArray()));
							
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
				this.generarExcelReporteCuentaContaGastoDepres(sAccionBusqueda,sTipoArchivoReporte,cuentacontagastodepresParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCuentaContaGastoDepres(sAccionBusqueda,sTipoArchivoReporte,cuentacontagastodepresParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepreActionPerformed(null);
					//this.generarExcelReporteCuentaContaGastoDepres(sAccionBusqueda,sTipoArchivoReporte,cuentacontagastodepresParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCuentaContaGastoDepres(sAccionBusqueda,sTipoArchivoReporte,cuentacontagastodepresParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCuentaContaGastoDepres(sAccionBusqueda,sTipoArchivoReporte,cuentacontagastodepresParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCuentaContaGastoDepres(sAccionBusqueda,sTipoArchivoReporte,cuentacontagastodepresParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCuentaContaGastoDepres(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaContaGastoDepre> cuentacontagastodepresParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontagastodepre";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaContaGastoDepres");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaContaGastoDepre("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CuentaContaGastoDepre cuentacontagastodepre : cuentacontagastodepresParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CuentaContaGastoDepreConstantesFunciones.generarExcelReporteDataCuentaContaGastoDepre("NORMAL",row,workbook,cuentacontagastodepre,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Gasto Depre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCuentaContaGastoDepre(String sTipo,Row row,Workbook workbook) {
		
		CuentaContaGastoDepreConstantesFunciones.generarExcelReporteHeaderCuentaContaGastoDepre(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCuentaContaGastoDepres(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaContaGastoDepre> cuentacontagastodepresParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontagastodepre_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaContaGastoDepres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CuentaContaGastoDepre cuentacontagastodepre : cuentacontagastodepresParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CuentaContaGastoDepreConstantesFunciones.getCuentaContaGastoDepreDescripcion(cuentacontagastodepre));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontagastodepre.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontagastodepre.getgastodepreciacion_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Gasto Depre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCuentaContaGastoDepres(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaContaGastoDepre> cuentacontagastodepresParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CuentaContaGastoDepre> cuentacontagastodepresRespaldo=null;
		
		classes=CuentaContaGastoDepreConstantesFunciones.getClassesRelationshipsOfCuentaContaGastoDepre(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cuentacontagastodepreLogic.setDatosCliente(this.datosCliente);
		this.cuentacontagastodepreLogic.setDatosDeep(this.datosDeep);
		this.cuentacontagastodepreLogic.setIsConDeep(true);
		
		cuentacontagastodepresRespaldo=this.cuentacontagastodepreLogic.getCuentaContaGastoDepres();
		
		this.cuentacontagastodepreLogic.setCuentaContaGastoDepres(cuentacontagastodepresParaReportes);	
		this.cuentacontagastodepreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cuentacontagastodepresParaReportes=this.cuentacontagastodepreLogic.getCuentaContaGastoDepres();
		this.cuentacontagastodepreLogic.setCuentaContaGastoDepres(cuentacontagastodepresRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontagastodepre_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaContaGastoDepres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaContaGastoDepre("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CuentaContaGastoDepre cuentacontagastodepre : cuentacontagastodepresParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCuentaContaGastoDepre("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CuentaContaGastoDepreConstantesFunciones.generarExcelReporteDataCuentaContaGastoDepre("NORMAL",row,workbook,cuentacontagastodepre,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CuentaContaGastoDepreConstantesFunciones.getCuentaContaGastoDepreDescripcion(cuentacontagastodepre));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Gasto Depre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCuentaContaGastoDepre() throws Exception {		
		this.startProcessCuentaContaGastoDepre(true);
	}
	
	public void startProcessCuentaContaGastoDepre(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCuentaContaGastoDepre ,this.jPanelParametrosReportesCuentaContaGastoDepre, this.jScrollPanelDatosCuentaContaGastoDepre,this.jPanelPaginacionCuentaContaGastoDepre, this.jScrollPanelDatosEdicionCuentaContaGastoDepre, this.jPanelAccionesCuentaContaGastoDepre,this.jPanelAccionesFormularioCuentaContaGastoDepre,this.jmenuBarCuentaContaGastoDepre,this.jmenuBarDetalleCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,this.jTtoolBarDetalleCuentaContaGastoDepre);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaContaGastoDepre=this.jTabbedPaneBusquedasCuentaContaGastoDepre; 
		
		final JPanel jPanelParametrosReportesCuentaContaGastoDepre=this.jPanelParametrosReportesCuentaContaGastoDepre;
		//final JScrollPane jScrollPanelDatosCuentaContaGastoDepre=this.jScrollPanelDatosCuentaContaGastoDepre;
		final JTable jTableDatosCuentaContaGastoDepre=this.jTableDatosCuentaContaGastoDepre;		
		final JPanel jPanelPaginacionCuentaContaGastoDepre=this.jPanelPaginacionCuentaContaGastoDepre;
		//final JScrollPane jScrollPanelDatosEdicionCuentaContaGastoDepre=this.jScrollPanelDatosEdicionCuentaContaGastoDepre;
		final JPanel jPanelAccionesCuentaContaGastoDepre=this.jPanelAccionesCuentaContaGastoDepre;
		
		JPanel jPanelCamposAuxiliarCuentaContaGastoDepre=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCuentaContaGastoDepre=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			jPanelCamposAuxiliarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jPanelCamposCuentaContaGastoDepre;
			jPanelAccionesFormularioAuxiliarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jPanelAccionesFormularioCuentaContaGastoDepre;
		}
		
		final JPanel jPanelCamposCuentaContaGastoDepre=jPanelCamposAuxiliarCuentaContaGastoDepre;
		final JPanel jPanelAccionesFormularioCuentaContaGastoDepre=jPanelAccionesFormularioAuxiliarCuentaContaGastoDepre;
		
		
		final JMenuBar jmenuBarCuentaContaGastoDepre=this.jmenuBarCuentaContaGastoDepre;
		final JToolBar jTtoolBarCuentaContaGastoDepre=this.jTtoolBarCuentaContaGastoDepre;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCuentaContaGastoDepre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaContaGastoDepre=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			jmenuBarDetalleAuxiliarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jmenuBarDetalleCuentaContaGastoDepre;
			jTtoolBarDetalleAuxiliarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jTtoolBarDetalleCuentaContaGastoDepre;
		}
		
		final JMenuBar jmenuBarDetalleCuentaContaGastoDepre=jmenuBarDetalleAuxiliarCuentaContaGastoDepre;
		final JToolBar jTtoolBarDetalleCuentaContaGastoDepre=jTtoolBarDetalleAuxiliarCuentaContaGastoDepre;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaContaGastoDepre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaContaGastoDepre;
			processRunnable.jTableDatos=jTableDatosCuentaContaGastoDepre;
			processRunnable.jPanelCampos=jPanelCamposCuentaContaGastoDepre;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaContaGastoDepre;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaContaGastoDepre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaContaGastoDepre;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaContaGastoDepre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaContaGastoDepre;
			processRunnable.jTtoolBar=jTtoolBarCuentaContaGastoDepre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaContaGastoDepre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaContaGastoDepre ,jPanelParametrosReportesCuentaContaGastoDepre,jTableDatosCuentaContaGastoDepre, /*jScrollPanelDatosCuentaContaGastoDepre,*/jPanelCamposCuentaContaGastoDepre,jPanelPaginacionCuentaContaGastoDepre, /*jScrollPanelDatosEdicionCuentaContaGastoDepre,*/ jPanelAccionesCuentaContaGastoDepre,jPanelAccionesFormularioCuentaContaGastoDepre,jmenuBarCuentaContaGastoDepre,jmenuBarDetalleCuentaContaGastoDepre,jTtoolBarCuentaContaGastoDepre,jTtoolBarDetalleCuentaContaGastoDepre);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaContaGastoDepre ,jPanelParametrosReportesCuentaContaGastoDepre, jScrollPanelDatosCuentaContaGastoDepre,jPanelPaginacionCuentaContaGastoDepre, jScrollPanelDatosEdicionCuentaContaGastoDepre, jPanelAccionesCuentaContaGastoDepre,jPanelAccionesFormularioCuentaContaGastoDepre,jmenuBarCuentaContaGastoDepre,jmenuBarDetalleCuentaContaGastoDepre,jTtoolBarCuentaContaGastoDepre,jTtoolBarDetalleCuentaContaGastoDepre);
						
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
	
	public void finishProcessCuentaContaGastoDepre() {// throws Exception 
		this.finishProcessCuentaContaGastoDepre(true);
	}
	
	public void finishProcessCuentaContaGastoDepre(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCuentaContaGastoDepre ,this.jPanelParametrosReportesCuentaContaGastoDepre, this.jScrollPanelDatosCuentaContaGastoDepre,this.jPanelPaginacionCuentaContaGastoDepre, this.jScrollPanelDatosEdicionCuentaContaGastoDepre, this.jPanelAccionesCuentaContaGastoDepre,this.jPanelAccionesFormularioCuentaContaGastoDepre,this.jmenuBarCuentaContaGastoDepre,this.jmenuBarDetalleCuentaContaGastoDepre,this.jTtoolBarCuentaContaGastoDepre,this.jTtoolBarDetalleCuentaContaGastoDepre);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaContaGastoDepre=this.jTabbedPaneBusquedasCuentaContaGastoDepre; 
		
		final JPanel jPanelParametrosReportesCuentaContaGastoDepre=this.jPanelParametrosReportesCuentaContaGastoDepre;
		//final JScrollPane jScrollPanelDatosCuentaContaGastoDepre=this.jScrollPanelDatosCuentaContaGastoDepre;
		final JTable jTableDatosCuentaContaGastoDepre=this.jTableDatosCuentaContaGastoDepre;		
		final JPanel jPanelPaginacionCuentaContaGastoDepre=this.jPanelPaginacionCuentaContaGastoDepre;
		//final JScrollPane jScrollPanelDatosEdicionCuentaContaGastoDepre=this.jScrollPanelDatosEdicionCuentaContaGastoDepre;
		final JPanel jPanelAccionesCuentaContaGastoDepre=this.jPanelAccionesCuentaContaGastoDepre;
		
		JPanel jPanelCamposAuxiliarCuentaContaGastoDepre=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCuentaContaGastoDepre=new JPanel();
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			jPanelCamposAuxiliarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jPanelCamposCuentaContaGastoDepre;
			jPanelAccionesFormularioAuxiliarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jPanelAccionesFormularioCuentaContaGastoDepre;
		}
		
		final JPanel jPanelCamposCuentaContaGastoDepre=jPanelCamposAuxiliarCuentaContaGastoDepre;
		final JPanel jPanelAccionesFormularioCuentaContaGastoDepre=jPanelAccionesFormularioAuxiliarCuentaContaGastoDepre;
		
		
		final JMenuBar jmenuBarCuentaContaGastoDepre=this.jmenuBarCuentaContaGastoDepre;		
		final JToolBar jTtoolBarCuentaContaGastoDepre=this.jTtoolBarCuentaContaGastoDepre;
				
		JMenuBar jmenuBarDetalleAuxiliarCuentaContaGastoDepre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaContaGastoDepre=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			jmenuBarDetalleAuxiliarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jmenuBarDetalleCuentaContaGastoDepre;
			jTtoolBarDetalleAuxiliarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jTtoolBarDetalleCuentaContaGastoDepre;		
		}
		
		final JMenuBar jmenuBarDetalleCuentaContaGastoDepre=jmenuBarDetalleAuxiliarCuentaContaGastoDepre;
		final JToolBar jTtoolBarDetalleCuentaContaGastoDepre=jTtoolBarDetalleAuxiliarCuentaContaGastoDepre;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaContaGastoDepre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaContaGastoDepre;
			processRunnable.jTableDatos=jTableDatosCuentaContaGastoDepre;
			processRunnable.jPanelCampos=jPanelCamposCuentaContaGastoDepre;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaContaGastoDepre;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaContaGastoDepre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaContaGastoDepre;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaContaGastoDepre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaContaGastoDepre;
			processRunnable.jTtoolBar=jTtoolBarCuentaContaGastoDepre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaContaGastoDepre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCuentaContaGastoDepre ,jPanelParametrosReportesCuentaContaGastoDepre, jTableDatosCuentaContaGastoDepre,/*jScrollPanelDatosCuentaContaGastoDepre,*/jPanelCamposCuentaContaGastoDepre,jPanelPaginacionCuentaContaGastoDepre, /*jScrollPanelDatosEdicionCuentaContaGastoDepre,*/ jPanelAccionesCuentaContaGastoDepre,jPanelAccionesFormularioCuentaContaGastoDepre,jmenuBarCuentaContaGastoDepre,jmenuBarDetalleCuentaContaGastoDepre,jTtoolBarCuentaContaGastoDepre,jTtoolBarDetalleCuentaContaGastoDepre));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCuentaContaGastoDepre(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCuentaContaGastoDepre(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCuentaContaGastoDepre(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCuentaContaGastoDepre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCuentaContaGastoDepre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCuentaContaGastoDepre,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCuentaContaGastoDepre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCuentaContaGastoDepre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCuentaContaGastoDepre,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cuentacontagastodepreConstantesFunciones.getsFinalQueryCuentaContaGastoDepre();
		String  finalQueryPaginacionTodos=this.cuentacontagastodepreConstantesFunciones.getsFinalQueryCuentaContaGastoDepre();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CuentaContaGastoDepreConstantesFunciones.getArrayColumnasGlobalesNoCuentaContaGastoDepre(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CuentaContaGastoDepreConstantesFunciones.getArrayColumnasGlobalesCuentaContaGastoDepre(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CuentaContaGastoDepreConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cuentacontagastodepresEliminados= new ArrayList<CuentaContaGastoDepre>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCuentaContaGastoDepre();
		
				///*CuentaContaGastoDepreSessionBean*/this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
			
			if(this.cuentacontagastodepreSessionBean==null) {
				this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
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
					this.iNumeroPaginacion=CuentaContaGastoDepreConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CuentaContaGastoDepreConstantesFunciones.getClassesForeignKeysOfCuentaContaGastoDepre(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cuentacontagastodepre."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cuentacontagastodepresAux= new ArrayList<CuentaContaGastoDepre>();
			
				
			cuentacontagastodepreLogic.setDatosCliente(this.datosCliente);
			cuentacontagastodepreLogic.setDatosDeep(this.datosDeep);
			cuentacontagastodepreLogic.setIsConDeep(true);
			
			
			cuentacontagastodepreLogic.getCuentaContaGastoDepreDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cuentacontagastodepreLogic.getTodosCuentaContaGastoDepres(finalQueryGlobal,pagination);
					
					//cuentacontagastodepreLogic.getTodosCuentaContaGastoDepresWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cuentacontagastodepreLogic.getCuentaContaGastoDepres()==null|| cuentacontagastodepreLogic.getCuentaContaGastoDepres().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacontagastodepresAux= new ArrayList<CuentaContaGastoDepre>();
							cuentacontagastodepresAux.addAll(cuentacontagastodepreLogic.getCuentaContaGastoDepres());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontagastodepresAux= new ArrayList<CuentaContaGastoDepre>();
							cuentacontagastodepresAux.addAll(cuentacontagastodepres);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacontagastodepreLogic.getTodosCuentaContaGastoDepres(finalQueryGlobal+"",this.pagination);												
							
							//cuentacontagastodepreLogic.getTodosCuentaContaGastoDepresWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCuentaContaGastoDepres("Todos",cuentacontagastodepreLogic.getCuentaContaGastoDepres() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacontagastodepreLogic.setCuentaContaGastoDepres(new ArrayList<CuentaContaGastoDepre>());					
							cuentacontagastodepreLogic.getCuentaContaGastoDepres().addAll(cuentacontagastodepresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontagastodepres=new ArrayList<CuentaContaGastoDepre>();
							cuentacontagastodepres.addAll(cuentacontagastodepresAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCuentaContaGastoDepre=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCuentaContaGastoDepre=this.idActual;
				
				} else if(this.idCuentaContaGastoDepreActual!=null && this.idCuentaContaGastoDepreActual!=0L) {
					idCuentaContaGastoDepre=idCuentaContaGastoDepreActual;
				}
				
					
				this.sDetalleReporte=CuentaContaGastoDepreConstantesFunciones.getDetalleIndicePorId(idCuentaContaGastoDepre);
				
				this.cuentacontagastodepres=new ArrayList<CuentaContaGastoDepre>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cuentacontagastodepreLogic.getEntity(idCuentaContaGastoDepre);
					
					//cuentacontagastodepreLogic.getEntityWithConnection(idCuentaContaGastoDepre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontagastodepreLogic.setCuentaContaGastoDepres(new ArrayList<CuentaContaGastoDepre>());
					cuentacontagastodepreLogic.getCuentaContaGastoDepres().add(cuentacontagastodepreLogic.getCuentaContaGastoDepre());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontagastodepres=new ArrayList<CuentaContaGastoDepre>();
					this.cuentacontagastodepres.add(cuentacontagastodepre);
				}
				
				if(cuentacontagastodepreLogic.getCuentaContaGastoDepre()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=CuentaContaGastoDepreConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentacontagastodepreLogic.getCuentaContaGastoDepresFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContaGastoDepreConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContaGastoDepreConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentacontagastodepreLogic.getCuentaContaGastoDepres()==null||cuentacontagastodepreLogic.getCuentaContaGastoDepres().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentacontagastodepres==null|| cuentacontagastodepres.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontagastodepresAux=new ArrayList<CuentaContaGastoDepre>();
						cuentacontagastodepresAux.addAll(cuentacontagastodepreLogic.getCuentaContaGastoDepres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontagastodepresAux=new ArrayList<CuentaContaGastoDepre>();
							cuentacontagastodepresAux.addAll(cuentacontagastodepres);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentacontagastodepreLogic.getCuentaContaGastoDepresFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContaGastoDepreConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContaGastoDepreConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaContaGastoDepres("FK_IdCuentaContable",cuentacontagastodepreLogic.getCuentaContaGastoDepres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaContaGastoDepres("FK_IdCuentaContable",cuentacontagastodepres);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontagastodepreLogic.setCuentaContaGastoDepres(new ArrayList<CuentaContaGastoDepre>());
						cuentacontagastodepreLogic.getCuentaContaGastoDepres().addAll(cuentacontagastodepresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontagastodepres=new ArrayList<CuentaContaGastoDepre>();
							cuentacontagastodepres.addAll(cuentacontagastodepresAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdGastoDepreciacion")) {
				this.sDetalleReporte=CuentaContaGastoDepreConstantesFunciones.getDetalleIndiceFK_IdGastoDepreciacion(id_gasto_depreciacionFK_IdGastoDepreciacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentacontagastodepreLogic.getCuentaContaGastoDepresFK_IdGastoDepreciacion(finalQueryGlobal,pagination,id_gasto_depreciacionFK_IdGastoDepreciacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContaGastoDepreConstantesFunciones.getDetalleIndiceFK_IdGastoDepreciacion(id_gasto_depreciacionFK_IdGastoDepreciacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContaGastoDepreConstantesFunciones.getDetalleIndiceFK_IdGastoDepreciacion(id_gasto_depreciacionFK_IdGastoDepreciacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentacontagastodepreLogic.getCuentaContaGastoDepres()==null||cuentacontagastodepreLogic.getCuentaContaGastoDepres().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentacontagastodepres==null|| cuentacontagastodepres.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontagastodepresAux=new ArrayList<CuentaContaGastoDepre>();
						cuentacontagastodepresAux.addAll(cuentacontagastodepreLogic.getCuentaContaGastoDepres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontagastodepresAux=new ArrayList<CuentaContaGastoDepre>();
							cuentacontagastodepresAux.addAll(cuentacontagastodepres);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentacontagastodepreLogic.getCuentaContaGastoDepresFK_IdGastoDepreciacion(finalQueryGlobal,pagination,id_gasto_depreciacionFK_IdGastoDepreciacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContaGastoDepreConstantesFunciones.getDetalleIndiceFK_IdGastoDepreciacion(id_gasto_depreciacionFK_IdGastoDepreciacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContaGastoDepreConstantesFunciones.getDetalleIndiceFK_IdGastoDepreciacion(id_gasto_depreciacionFK_IdGastoDepreciacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaContaGastoDepres("FK_IdGastoDepreciacion",cuentacontagastodepreLogic.getCuentaContaGastoDepres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaContaGastoDepres("FK_IdGastoDepreciacion",cuentacontagastodepres);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontagastodepreLogic.setCuentaContaGastoDepres(new ArrayList<CuentaContaGastoDepre>());
						cuentacontagastodepreLogic.getCuentaContaGastoDepres().addAll(cuentacontagastodepresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontagastodepres=new ArrayList<CuentaContaGastoDepre>();
							cuentacontagastodepres.addAll(cuentacontagastodepresAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCuentaContaGastoDepre();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCuentaContaGastoDepre();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentacontagastodepreLogic.getCuentaContaGastoDepres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacontagastodepres.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentacontagastodepreLogic.getCuentaContaGastoDepres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacontagastodepres.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CuentaContaGastoDepre cuentacontagastodepre) {
		Boolean permite=true;
		
		if(this.cuentacontagastodepre.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CuentaContaGastoDepreConstantesFunciones.getOrderByListaCuentaContaGastoDepre();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CuentaContaGastoDepreConstantesFunciones.getOrderByListaCuentaContaGastoDepre();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContaGastoDepre cuentacontagastodepre:cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
				if(cuentacontagastodepre.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontagastodepreTotales=cuentacontagastodepre;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContaGastoDepre cuentacontagastodepre:this.cuentacontagastodepres) {
				if(cuentacontagastodepre.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontagastodepreTotales=cuentacontagastodepre;
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
			this.cuentacontagastodepreAux=new CuentaContaGastoDepre();
			this.cuentacontagastodepreAux.setsType(Constantes2.S_TOTALES);
			this.cuentacontagastodepreAux.setIsNew(false);
			this.cuentacontagastodepreAux.setIsChanged(false);
			this.cuentacontagastodepreAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CuentaContaGastoDepreConstantesFunciones.TotalizarValoresFilaCuentaContaGastoDepre(this.cuentacontagastodepreLogic.getCuentaContaGastoDepres(),this.cuentacontagastodepreAux);
				
				this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().add(this.cuentacontagastodepreAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CuentaContaGastoDepreConstantesFunciones.TotalizarValoresFilaCuentaContaGastoDepre(this.cuentacontagastodepres,this.cuentacontagastodepreAux);
				
				this.cuentacontagastodepres.add(this.cuentacontagastodepreAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cuentacontagastodepreTotales=new CuentaContaGastoDepre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().remove(cuentacontagastodepreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentacontagastodepres.remove(cuentacontagastodepreTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cuentacontagastodepreTotales=new CuentaContaGastoDepre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContaGastoDepre cuentacontagastodepre:cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
				if(cuentacontagastodepre.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontagastodepreTotales=cuentacontagastodepre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaContaGastoDepreConstantesFunciones.TotalizarValoresFilaCuentaContaGastoDepre(this.cuentacontagastodepreLogic.getCuentaContaGastoDepres(),cuentacontagastodepreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContaGastoDepre cuentacontagastodepre:this.cuentacontagastodepres) {
				if(cuentacontagastodepre.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontagastodepreTotales=cuentacontagastodepre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaContaGastoDepreConstantesFunciones.TotalizarValoresFilaCuentaContaGastoDepre(this.cuentacontagastodepres,cuentacontagastodepreTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCuentaContaGastoDepresFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaContaGastoDepresFK_IdGastoDepreciacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdGastoDepreciacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCuentaContaGastoDepresFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontagastodepreLogic.getCuentaContaGastoDepresFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaContaGastoDepresFK_IdGastoDepreciacion(String sFinalQuery,Long id_gasto_depreciacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontagastodepreLogic.getCuentaContaGastoDepresFK_IdGastoDepreciacion(sFinalQuery,this.pagination,id_gasto_depreciacion);
				
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
	
	public void inicializarPermisosCuentaContaGastoDepre() {
		this.isPermisoTodoCuentaContaGastoDepre=false;
		this.isPermisoNuevoCuentaContaGastoDepre=false;
		this.isPermisoActualizarCuentaContaGastoDepre=false;
		this.isPermisoActualizarOriginalCuentaContaGastoDepre=false;
		this.isPermisoEliminarCuentaContaGastoDepre=false;
		this.isPermisoGuardarCambiosCuentaContaGastoDepre=false;
		this.isPermisoConsultaCuentaContaGastoDepre=false;
		this.isPermisoBusquedaCuentaContaGastoDepre=false;
		this.isPermisoReporteCuentaContaGastoDepre=false;		
		this.isPermisoOrdenCuentaContaGastoDepre=false;		
		this.isPermisoPaginacionMedioCuentaContaGastoDepre=false;		
		this.isPermisoPaginacionAltoCuentaContaGastoDepre=false;
		this.isPermisoPaginacionTodoCuentaContaGastoDepre=false;
		this.isPermisoCopiarCuentaContaGastoDepre=false;		
		this.isPermisoVerFormCuentaContaGastoDepre=false;		
		this.isPermisoDuplicarCuentaContaGastoDepre=false;		
		this.isPermisoOrdenCuentaContaGastoDepre=false;		
	}
	
	public void setPermisosUsuarioCuentaContaGastoDepre(Boolean isPermiso) {
		this.isPermisoTodoCuentaContaGastoDepre=isPermiso;
		this.isPermisoNuevoCuentaContaGastoDepre=isPermiso;
		this.isPermisoActualizarCuentaContaGastoDepre=isPermiso;
		this.isPermisoActualizarOriginalCuentaContaGastoDepre=isPermiso;
		this.isPermisoEliminarCuentaContaGastoDepre=isPermiso;
		this.isPermisoGuardarCambiosCuentaContaGastoDepre=isPermiso;
		this.isPermisoConsultaCuentaContaGastoDepre=isPermiso;
		this.isPermisoBusquedaCuentaContaGastoDepre=isPermiso;
		this.isPermisoReporteCuentaContaGastoDepre=isPermiso;
		this.isPermisoOrdenCuentaContaGastoDepre=isPermiso;		
		this.isPermisoPaginacionMedioCuentaContaGastoDepre=isPermiso;		
		this.isPermisoPaginacionAltoCuentaContaGastoDepre=isPermiso;		
		this.isPermisoPaginacionTodoCuentaContaGastoDepre=isPermiso;		
		this.isPermisoCopiarCuentaContaGastoDepre=isPermiso;		
		this.isPermisoVerFormCuentaContaGastoDepre=isPermiso;		
		this.isPermisoDuplicarCuentaContaGastoDepre=isPermiso;
		this.isPermisoOrdenCuentaContaGastoDepre=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCuentaContaGastoDepre(Boolean isPermiso) {
		//this.isPermisoTodoCuentaContaGastoDepre=isPermiso;
		this.isPermisoNuevoCuentaContaGastoDepre=isPermiso;
		this.isPermisoActualizarCuentaContaGastoDepre=isPermiso;
		this.isPermisoActualizarOriginalCuentaContaGastoDepre=isPermiso;
		this.isPermisoEliminarCuentaContaGastoDepre=isPermiso;
		this.isPermisoGuardarCambiosCuentaContaGastoDepre=isPermiso;
		//this.isPermisoConsultaCuentaContaGastoDepre=isPermiso;
		//this.isPermisoBusquedaCuentaContaGastoDepre=isPermiso;
		//this.isPermisoReporteCuentaContaGastoDepre=isPermiso;
		//this.isPermisoOrdenCuentaContaGastoDepre=isPermiso;		
		//this.isPermisoPaginacionMedioCuentaContaGastoDepre=isPermiso;		
		//this.isPermisoPaginacionAltoCuentaContaGastoDepre=isPermiso;		
		//this.isPermisoPaginacionTodoCuentaContaGastoDepre=isPermiso;		
		//this.isPermisoCopiarCuentaContaGastoDepre=isPermiso;		
		//this.isPermisoDuplicarCuentaContaGastoDepre=isPermiso;
		//this.isPermisoOrdenCuentaContaGastoDepre=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCuentaContaGastoDepreClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CuentaContaGastoDepreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCuentaContaGastoDepre(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCuentaContaGastoDepreClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCuentaContaGastoDepreClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCuentaContaGastoDepreClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCuentaContaGastoDepreClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCuentaContaGastoDepre() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CuentaContaGastoDepreJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CuentaContaGastoDepreConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCuentaContaGastoDepre=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCuentaContaGastoDepre=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCuentaContaGastoDepre=this.isPermisoActualizarCuentaContaGastoDepre;
			this.isPermisoEliminarCuentaContaGastoDepre=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCuentaContaGastoDepre=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCuentaContaGastoDepre=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCuentaContaGastoDepre=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCuentaContaGastoDepre=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCuentaContaGastoDepre=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaContaGastoDepre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCuentaContaGastoDepre=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCuentaContaGastoDepre=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCuentaContaGastoDepre=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCuentaContaGastoDepre=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCuentaContaGastoDepre=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCuentaContaGastoDepre=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaContaGastoDepre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCuentaContaGastoDepre.setToolTipText(this.jTableDatosCuentaContaGastoDepre.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCuentaContaGastoDepre(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCuentaContaGastoDepre(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CuentaContaGastoDepreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CuentaContaGastoDepreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCuentaContaGastoDepre() throws Exception {
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
	public void inicializarCombosForeignKeyCuentaContaGastoDepreListas()throws Exception {
		try	{						
			
				this.cuentacontablesForeignKey=new ArrayList();
				this.gastodepreciacionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCuentaContaGastoDepreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CuentaContaGastoDepreJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCuentaContaGastoDepreListas(false);
			} else {
			
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGastoDepreciacionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyGastoDepreciacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.gastodepreciacionsForeignKey==null||this.gastodepreciacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=GastoDepreciacionConstantesFunciones.getArrayColumnasGlobalesGastoDepreciacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GastoDepreciacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=GastoDepreciacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosGastoDepreciacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCuentaContaGastoDepreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CuentaContaGastoDepreParameterReturnGeneral cuentacontagastodepreReturnGeneral=new CuentaContaGastoDepreParameterReturnGeneral();
						
			


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.cuentacontagastodepreConstantesFunciones.cargarid_cuenta_contableCuentaContaGastoDepre)
					 || (this.esRecargarFks && this.cuentacontagastodepreConstantesFunciones.cargarid_cuenta_contableCuentaContaGastoDepre)) {

					if(!this.cuentacontagastodepreSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+cuentacontagastodepreSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalGastoDepreciacion="";

				if(((this.gastodepreciacionsForeignKey==null||this.gastodepreciacionsForeignKey.size()<=0) && this.cuentacontagastodepreConstantesFunciones.cargarid_gasto_depreciacionCuentaContaGastoDepre)
					 || (this.esRecargarFks && this.cuentacontagastodepreConstantesFunciones.cargarid_gasto_depreciacionCuentaContaGastoDepre)) {

					if(!this.cuentacontagastodepreSessionBean.getisBusquedaDesdeForeignKeySesionGastoDepreciacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=GastoDepreciacionConstantesFunciones.getArrayColumnasGlobalesGastoDepreciacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalGastoDepreciacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GastoDepreciacionConstantesFunciones.TABLENAME);

						finalQueryGlobalGastoDepreciacion=Funciones.GetFinalQueryAppend(finalQueryGlobalGastoDepreciacion, "");
						finalQueryGlobalGastoDepreciacion+=GastoDepreciacionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosGastoDepreciacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalGastoDepreciacion=" WHERE " + ConstantesSql.ID + "="+cuentacontagastodepreSessionBean.getlidGastoDepreciacionActual();
					}
				} else {
					finalQueryGlobalGastoDepreciacion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cuentacontagastodepreReturnGeneral=cuentacontagastodepreLogic.cargarCombosLoteForeignKeyCuentaContaGastoDepre(finalQueryGlobalCuentaContable,finalQueryGlobalGastoDepreciacion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=cuentacontagastodepreReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalGastoDepreciacion.equals("NONE")) {
				this.gastodepreciacionsForeignKey=cuentacontagastodepreReturnGeneral.getgastodepreciacionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCuentaContaGastoDepre()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyGastoDepreciacion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {
			if(this.cuentacontagastodepreSessionBean==null) {
				this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
			}

			if(!this.cuentacontagastodepreSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

	public void addItemDefectoCombosForeignKeyGastoDepreciacion()throws Exception {
		try {

			if(!this.cuentacontagastodepreSessionBean.getisBusquedaDesdeForeignKeySesionGastoDepreciacion()) {
				GastoDepreciacion gastodepreciacion=new GastoDepreciacion();
				GastoDepreciacionConstantesFunciones.setGastoDepreciacionDescripcion(gastodepreciacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				gastodepreciacion.setId(null);

				if(!GastoDepreciacionConstantesFunciones.ExisteEnLista(this.gastodepreciacionsForeignKey,gastodepreciacion,true)) {

					this.gastodepreciacionsForeignKey.add(0,gastodepreciacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCuentaContaGastoDepre()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCuentaContaGastoDepre(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCuentaContaGastoDepre()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaContaGastoDepre();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre)throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(cuentacontagastodepre.getid_cuenta_contable(),false,"Formulario");
			this.setActualGastoDepreciacionForeignKey(cuentacontagastodepre.getid_gasto_depreciacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cuentacontagastodepre.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableCuentaContaGastoDepre")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(cuentacontagastodepre.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCuentaContaGastoDepre()throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(this.cuentacontagastodepreConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualGastoDepreciacionForeignKey(this.cuentacontagastodepreConstantesFunciones.getid_gasto_depreciacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaContaGastoDepre()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCuentaContaGastoDepre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCuentaContaGastoDepre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCuentaContaGastoDepre()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCuentaContaGastoDepre()throws Exception {
		try {
			

			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameGastoDepreciacionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCuentaContaGastoDepre(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGastoDepreciacionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCuentaContaGastoDepre()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre!=null && this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre!=null && this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public CuentaContaGastoDepreBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CuentaContaGastoDepreBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CuentaContaGastoDepreBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean(); 
		this.cuentacontagastodepreConstantesFunciones=new CuentaContaGastoDepreConstantesFunciones(); 
		this.cuentacontagastodepreBean=new CuentaContaGastoDepre();//(this.cuentacontagastodepreConstantesFunciones); 		
		this.cuentacontagastodepreReturnGeneral=new CuentaContaGastoDepreParameterReturnGeneral(); 
		
		this.cuentacontagastodepreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacontagastodepreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CuentaContaGastoDepreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CuentaContaGastoDepreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CuentaContaGastoDepreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCuentaContaGastoDepre(true);
			
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
			
			this.cuentacontagastodepreConstantesFunciones=new CuentaContaGastoDepreConstantesFunciones(); 
			this.cuentacontagastodepreBean=new CuentaContaGastoDepre();//this.cuentacontagastodepreConstantesFunciones); 			
			this.cuentacontagastodepreReturnGeneral=new CuentaContaGastoDepreParameterReturnGeneral(); 
		
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Conta Gasto Depre Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cuentacontagastodepre=new CuentaContaGastoDepre();
			this.cuentacontagastodepres = new ArrayList<CuentaContaGastoDepre>();
			this.cuentacontagastodepresAux = new ArrayList<CuentaContaGastoDepre>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic=new CuentaContaGastoDepreLogic();
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}
			
			//this.cuentacontagastodepreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cuentacontagastodepreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCuentaContaGastoDepre);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaContaGastoDepre);	
					}
					
					if(this.jInternalFrameImportacionCuentaContaGastoDepre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaContaGastoDepre);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCuentaContaGastoDepre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCuentaContaGastoDepre);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaContaGastoDepre);
				this.jInternalFrameDetalleFormCuentaContaGastoDepre.setVisible(false);
				this.jInternalFrameDetalleFormCuentaContaGastoDepre.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre);
					this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setVisible(false);
					this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCuentaContaGastoDepre!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCuentaContaGastoDepre);
					this.jInternalFrameImportacionCuentaContaGastoDepre.setVisible(false);
					this.jInternalFrameImportacionCuentaContaGastoDepre.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCuentaContaGastoDepre!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCuentaContaGastoDepre);
					this.jInternalFrameOrderByCuentaContaGastoDepre.setVisible(false);
					this.jInternalFrameOrderByCuentaContaGastoDepre.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCuentaContaGastoDepreActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CuentaContaGastoDepreConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cuentacontagastodepreReturnGeneral=new CuentaContaGastoDepreParameterReturnGeneral();
			
			this.cuentacontagastodepreParameterGeneral=new CuentaContaGastoDepreParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cuentacontagastodepreLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CuentaContaGastoDepreJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaContaGastoDepreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado(),this.cuentacontagastodepreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaContaGastoDepreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado(),this.cuentacontagastodepreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaDuplicarCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaCopiarCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaVerFormCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaOrdenCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaModificarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaCancelarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=false;
			
			
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdGastoDepreciacion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCuentaContaGastoDepre();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCuentaContaGastoDepre(false);
			
			this.setPermisosUsuarioCuentaContaGastoDepre();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado() 
				|| (this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado() && this.cuentacontagastodepreSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCuentaContaGastoDepreClasesRelacionadas();
			}
			
			if(this.cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCuentaContaGastoDepreClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCuentaContaGastoDepre();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCuentaContaGastoDepre();
			}
			
			if(!this.isPermisoBusquedaCuentaContaGastoDepre) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCuentaContaGastoDepre,this.isPermisoPaginacionMedioCuentaContaGastoDepre,this.isPermisoPaginacionTodoCuentaContaGastoDepre);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CuentaContaGastoDepreConstantesFunciones.getTiposSeleccionarCuentaContaGastoDepre());
				
				this.tiposColumnasSelect=CuentaContaGastoDepreConstantesFunciones.getTiposSeleccionarCuentaContaGastoDepre(true);
				
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
			//if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCuentaContaGastoDepre();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCuentaContaGastoDepre(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCuentaContaGastoDepre(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContaGastoDepre() ;
			
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
			
			this.cuentacontableLogic=new CuentaContableLogic();
			this.gastodepreciacionLogic=new GastoDepreciacionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cuentacontagastodepreImplementable= (CuentaContaGastoDepreImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaContaGastoDepreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cuentacontagastodepreImplementableHome= (CuentaContaGastoDepreImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaContaGastoDepreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cuentacontagastodepres= new ArrayList<CuentaContaGastoDepre>();
			this.cuentacontagastodepresEliminados= new ArrayList<CuentaContaGastoDepre>();
						
			this.isEsNuevoCuentaContaGastoDepre=false;
			this.esParaAccionDesdeFormularioCuentaContaGastoDepre=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.gastodepreciacionsForeignKey=new ArrayList<GastoDepreciacion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCuentaContaGastoDepre(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCuentaContaGastoDepre();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CuentaContaGastoDepreConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCuentaContaGastoDepre(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCuentaContaGastoDepre();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCuentaContaGastoDepre();
			}
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCuentaContaGastoDepre.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCuentaContaGastoDepre.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCuentaContaGastoDepre.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCuentaContaGastoDepre(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CuentaContaGastoDepre: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCuentaContaGastoDepre() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCuentaContaGastoDepre")) {
				iIndex=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jTabbedPaneRelacionesCuentaContaGastoDepre.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jTabbedPaneRelacionesCuentaContaGastoDepre.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCuentaContaGastoDepre();	
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
	
	public void cargarCombosForeignKeyCuentaContaGastoDepre(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCuentaContaGastoDepre(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCuentaContaGastoDepre(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCuentaContaGastoDepreListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCuentaContaGastoDepre();
		
		this.cargarCombosFrameForeignKeyCuentaContaGastoDepre();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCuentaContaGastoDepre();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCuentaContaGastoDepre();
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

	public void cargarCombosForeignKeyGastoDepreciacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyGastoDepreciacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyGastoDepreciacion();
				this.cargarCombosFrameGastoDepreciacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGastoDepreciacion(this.gastodepreciacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCuentaContaGastoDepreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
			
			if(jTableDatosCuentaContaGastoDepre.getRowCount()>=1) {
				jTableDatosCuentaContaGastoDepre.removeRowSelectionInterval(0, jTableDatosCuentaContaGastoDepre.getRowCount()-1);						
			}
			
			this.isEsNuevoCuentaContaGastoDepre=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCuentaContaGastoDepre(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCuentaContaGastoDepre(true);			
			//this.cuentacontagastodepre=new CuentaContaGastoDepre();
			//this.cuentacontagastodepre.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaContaGastoDepre(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContaGastoDepre() ;
			
			if(CuentaContaGastoDepreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaContaGastoDepre(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cuentacontagastodepre);	
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);				
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
			if(this.cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CuentaContaGastoDepre: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCuentaContaGastoDepreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCuentaContaGastoDepre.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCuentaContaGastoDepre.getSelectedRows().length;			
			}
			
			cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCuentaContaGastoDepre--;			
				//CuentaContaGastoDepre cuentacontagastodepreAux= new CuentaContaGastoDepre();			
				//cuentacontagastodepreAux.setId(this.iIdNuevoCuentaContaGastoDepre);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CuentaContaGastoDepre cuentacontagastodepreOrigen=new CuentaContaGastoDepre();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CuentaContaGastoDepre cuentacontagastodepreOrigen : cuentacontagastodepresSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cuentacontagastodepreOrigen =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontagastodepreOrigen =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCuentaContaGastoDepre();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cuentacontagastodepre.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCuentaContaGastoDepre(cuentacontagastodepreOrigen,this.cuentacontagastodepre,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().add(this.cuentacontagastodepreAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentacontagastodepres.add(this.cuentacontagastodepreAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
				
				this.jTableDatosCuentaContaGastoDepre.setRowSelectionInterval(this.getIndiceNuevoCuentaContaGastoDepre(), this.getIndiceNuevoCuentaContaGastoDepre());
				
				int iLastRow =  this.jTableDatosCuentaContaGastoDepre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaContaGastoDepre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaContaGastoDepre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();									
		
			CuentaContaGastoDepre cuentacontagastodepreOrigen=new CuentaContaGastoDepre();
			CuentaContaGastoDepre cuentacontagastodepreDestino=new CuentaContaGastoDepre();
				
			cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCuentaContaGastoDepre.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cuentacontagastodepresSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCuentaContaGastoDepre.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontagastodepreOrigen =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentacontagastodepreOrigen =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontagastodepreDestino =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentacontagastodepreDestino =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cuentacontagastodepreOrigen =cuentacontagastodepresSeleccionados.get(0);
				cuentacontagastodepreDestino =cuentacontagastodepresSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCuentaContaGastoDepre(cuentacontagastodepreOrigen,cuentacontagastodepreDestino,true,false);
				
				cuentacontagastodepreDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentacontagastodepreDestino,cuentacontagastodepreLogic.getCuentaContaGastoDepres());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontagastodepreDestino,cuentacontagastodepres);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
				
				//this.jTableDatosCuentaContaGastoDepre.setRowSelectionInterval(this.getIndiceNuevoCuentaContaGastoDepre(), this.getIndiceNuevoCuentaContaGastoDepre());
				
				int iLastRow =  this.jTableDatosCuentaContaGastoDepre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaContaGastoDepre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaContaGastoDepre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCuentaContaGastoDepre.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCuentaContaGastoDepre.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCuentaContaGastoDepre.setVisible(!isVisible);
			this.jPanelPaginacionCuentaContaGastoDepre.setVisible(!isVisible);
			this.jPanelAccionesCuentaContaGastoDepre.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCuentaContaGastoDepre();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCuentaContaGastoDepre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCuentaContaGastoDepre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCuentaContaGastoDepre();
			
			this.abrirFrameOrderByCuentaContaGastoDepre();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCuentaContaGastoDepre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCuentaContaGastoDepre(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaContaGastoDepre);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCuentaContaGastoDepre.isMaximum()) {
					this.jInternalFrameDetalleFormCuentaContaGastoDepre.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCuentaContaGastoDepre.setSize(this.jInternalFrameDetalleFormCuentaContaGastoDepre.iWidthFormulario,this.jInternalFrameDetalleFormCuentaContaGastoDepre.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCuentaContaGastoDepre.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCuentaContaGastoDepre.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCuentaContaGastoDepre.isMaximum()) {
						this.jInternalFrameDetalleFormCuentaContaGastoDepre.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCuentaContaGastoDepre.jContentPaneDetalleCuentaContaGastoDepre.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCuentaContaGastoDepre.jTabbedPaneRelacionesCuentaContaGastoDepre.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCuentaContaGastoDepre.jContentPaneDetalleCuentaContaGastoDepre.getWidth(),CuentaContaGastoDepreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaContaGastoDepre.jTabbedPaneRelacionesCuentaContaGastoDepre.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCuentaContaGastoDepre.jContentPaneDetalleCuentaContaGastoDepre.getWidth(),CuentaContaGastoDepreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaContaGastoDepre.jTabbedPaneRelacionesCuentaContaGastoDepre.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCuentaContaGastoDepre.jContentPaneDetalleCuentaContaGastoDepre.getWidth(),CuentaContaGastoDepreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCuentaContaGastoDepre.setVisible(true);
	        this.jInternalFrameDetalleFormCuentaContaGastoDepre.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCuentaContaGastoDepre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCuentaContaGastoDepre==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCuentaContaGastoDepre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContaGastoDepre,false,this);
				} else {
					this.jInternalFrameOrderByCuentaContaGastoDepre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContaGastoDepre,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCuentaContaGastoDepre);
				this.jInternalFrameOrderByCuentaContaGastoDepre.setVisible(false);
				this.jInternalFrameOrderByCuentaContaGastoDepre.setSelected(false);
				
				this.jInternalFrameOrderByCuentaContaGastoDepre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaContaGastoDepre"));
				
				this.inicializarActualizarBindingTablaOrderByCuentaContaGastoDepre();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCuentaContaGastoDepre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCuentaContaGastoDepre==null) {
				
				this.jInternalFrameImportacionCuentaContaGastoDepre=new ImportacionJInternalFrame(CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaContaGastoDepre);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCuentaContaGastoDepre);
				this.jInternalFrameImportacionCuentaContaGastoDepre.setVisible(false);
				this.jInternalFrameImportacionCuentaContaGastoDepre.setSelected(false);


				this.jInternalFrameImportacionCuentaContaGastoDepre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaContaGastoDepre"));
				this.jInternalFrameImportacionCuentaContaGastoDepre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaContaGastoDepre"));
				this.jInternalFrameImportacionCuentaContaGastoDepre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaContaGastoDepre"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCuentaContaGastoDepre() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre==null) {
				this.jInternalFrameReporteDinamicoCuentaContaGastoDepre=new ReporteDinamicoJInternalFrame(CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaContaGastoDepre);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre);
				this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setVisible(false);
				this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaContaGastoDepre"));
				this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaContaGastoDepre"));
				this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaContaGastoDepre"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaContaGastoDepre();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCuentaContaGastoDepre() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaContaGastoDepre);
			
	       	this.jInternalFrameDetalleFormCuentaContaGastoDepre.setVisible(false);
	        this.jInternalFrameDetalleFormCuentaContaGastoDepre.setSelected(false);
			
			//this.jInternalFrameDetalleFormCuentaContaGastoDepre.dispose();
			//this.jInternalFrameDetalleFormCuentaContaGastoDepre=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCuentaContaGastoDepre() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setVisible(true);
	        this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCuentaContaGastoDepre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCuentaContaGastoDepre.setVisible(true);
	        this.jInternalFrameImportacionCuentaContaGastoDepre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCuentaContaGastoDepre() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCuentaContaGastoDepre.setVisible(true);
	        this.jInternalFrameOrderByCuentaContaGastoDepre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCuentaContaGastoDepre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCuentaContaGastoDepre.setVisible(false);
	        this.jInternalFrameOrderByCuentaContaGastoDepre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCuentaContaGastoDepre() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setVisible(false);
	        this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCuentaContaGastoDepre() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCuentaContaGastoDepre.setVisible(false);
	        this.jInternalFrameImportacionCuentaContaGastoDepre.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderCuentaContaGastoDepre=(TitledBorder)this.jScrollPanelDatosCuentaContaGastoDepre.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderCuentaContaGastoDepre.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCuentaContaGastoDepre(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCuentaContaGastoDepre(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCuentaContaGastoDepre(true);
			//this.isEsNuevoCuentaContaGastoDepre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaContaGastoDepre(false) ;
			
			if(cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CuentaContaGastoDepreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaContaGastoDepre(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContaGastoDepre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCuentaContaGastoDepreActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCuentaContaGastoDepre(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCuentaContaGastoDepre(true);
			//this.isEsNuevoCuentaContaGastoDepre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cuentacontagastodepre.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCuentaContaGastoDepre(false) ;
			
			if(CuentaContaGastoDepreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaContaGastoDepre(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContaGastoDepre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.cuentacontagastodepreConstantesFunciones.cargarid_cuenta_contableCuentaContaGastoDepre) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaGastoDepre,CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaContaGastoDepre.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaGastoDepreciacion(List<GastoDepreciacion> gastodepreciacionsForeignKey)throws Exception{
		TableColumn tableColumnGastoDepreciacion=this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaGastoDepre,CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION));
		TableCellEditor tableCellEditorGastoDepreciacion =tableColumnGastoDepreciacion.getCellEditor();

		GastoDepreciacionTableCell gastodepreciacionTableCellFk=(GastoDepreciacionTableCell)tableCellEditorGastoDepreciacion;

		if(gastodepreciacionTableCellFk!=null) {
			gastodepreciacionTableCellFk.setgastodepreciacionsForeignKey(gastodepreciacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaContaGastoDepre.getSelectedRow();

		//if(intSelectedRow<=0) {
			//gastodepreciacionTableCellFk.setRowActual(intSelectedRow);
			//gastodepreciacionTableCellFk.setgastodepreciacionsForeignKeyActual(gastodepreciacionsForeignKey);
		//}


		if(gastodepreciacionTableCellFk!=null) {
			gastodepreciacionTableCellFk.RecargarGastoDepreciacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCuentaContaGastoDepre(false);
			
			//if(!this.isEsNuevoCuentaContaGastoDepre) {								
				int intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.cuentacontagastodepre,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);
				
			}
			
			if(this.permiteMantenimiento(this.cuentacontagastodepre)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCuentaContaGastoDepre=true;
					this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
					this.isEsNuevoCuentaContaGastoDepre=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCuentaContaGastoDepre=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCuentaContaGastoDepre=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaContaGastoDepre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaContaGastoDepre(false);
				
				this.habilitarDeshabilitarControlesCuentaContaGastoDepre(false);
			
												
				
				if(CuentaContaGastoDepreJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCuentaContaGastoDepre();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,cuentacontagastodepreSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCuentaContaGastoDepre(this.cuentacontagastodepre,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCuentaContaGastoDepre.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cuentacontagastodepreSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cuentacontagastodepre.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CuentaContaGastoDepre.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaGastoDepre.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				this.cuentacontagastodepre.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				this.cuentacontagastodepre.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cuentacontagastodepre)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CuentaContaGastoDepreModel) this.jTableDatosCuentaContaGastoDepre.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCuentaContaGastoDepre=true;
				this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
				this.isEsNuevoCuentaContaGastoDepre=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaContaGastoDepre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaContaGastoDepre(false);
				
				this.habilitarDeshabilitarControlesCuentaContaGastoDepre(false);
				
				
				
				if(CuentaContaGastoDepreJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCuentaContaGastoDepre();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCuentaContaGastoDepre.getRowCount()>=1) {
				jTableDatosCuentaContaGastoDepre.removeRowSelectionInterval(0, jTableDatosCuentaContaGastoDepre.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCuentaContaGastoDepre(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaContaGastoDepre(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContaGastoDepre(false) ;
			
			this.isEsNuevoCuentaContaGastoDepre=false;
			
			if(CuentaContaGastoDepreJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCuentaContaGastoDepre();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCuentaContaGastoDepre(false);
				
				//SI ES MANUAL
				if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCuentaContaGastoDepre();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCuentaContaGastoDepre--;			
			//CuentaContaGastoDepre cuentacontagastodepreAux= new CuentaContaGastoDepre();			
			//cuentacontagastodepreAux.setId(this.iIdNuevoCuentaContaGastoDepre);
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCuentaContaGastoDepre();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);
			
			this.cuentacontagastodepre.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().add(this.cuentacontagastodepreAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cuentacontagastodepres.add(this.cuentacontagastodepreAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
			
			this.jTableDatosCuentaContaGastoDepre.setRowSelectionInterval(this.getIndiceNuevoCuentaContaGastoDepre(), this.getIndiceNuevoCuentaContaGastoDepre());
			
			int iLastRow =  this.jTableDatosCuentaContaGastoDepre.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCuentaContaGastoDepre.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCuentaContaGastoDepre.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContaGastoDepre(false);
			
			//SI ES MANUAL
			if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaContaGastoDepre();
			}
			
			//this.abrirFrameTreeCuentaContaGastoDepre();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cuenta Conta Gasto DepreS ?", "MANTENIMIENTO DE Cuenta Conta Gasto Depre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCuentaContaGastoDepre.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCuentaContaGastoDepre();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cuentacontagastodepreReturnGeneral=cuentacontagastodepreLogic.procesarImportacionCuentaContaGastoDepresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cuentacontagastodepreParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCuentaContaGastoDepreReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCuentaContaGastoDepre.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCuentaContaGastoDepre.setFileImportacion(this.jInternalFrameImportacionCuentaContaGastoDepre.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCuentaContaGastoDepre.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCuentaContaGastoDepre.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCuentaContaGastoDepre.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCuentaContaGastoDepre.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();		

		cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CuentaContaGastoDepreBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CuentaContaGastoDepreBaseDesign.jrxml";
			
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
			
			this.generarReporteCuentaContaGastoDepres("Todos",cuentacontagastodepresSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Gasto Depre",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_GastoDepreciacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_GastoDepreciacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_GastoDepreciacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_GastoDepreciacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION:
					sNombreCampoCategoria="id_gasto_depreciacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION:
					sNombreCampoCategoriaValor="id_gasto_depreciacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Gasto Depreciacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_gasto_depreciacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();		
		
		cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontagastodepre";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CuentaContaGastoDepres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(CuentaContaGastoDepre cuentacontagastodepre:cuentacontagastodepresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontagastodepre.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION);
					iRow++;

					for(CuentaContaGastoDepre cuentacontagastodepre:cuentacontagastodepresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontagastodepre.getgastodepreciacion_descripcion());
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
			//	this.getFilaCabeceraExportarExcelCuentaContaGastoDepre(row);				
			//	iRow++;
			//}				
			
			//for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepresSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCuentaContaGastoDepre(cuentacontagastodepreAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Gasto Depre",JOptionPane.INFORMATION_MESSAGE);
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
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContaGastoDepre(false);
			
			//SI ES MANUAL
			if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaContaGastoDepre();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContaGastoDepre(false);
			
			//SI ES MANUAL
			if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaContaGastoDepre();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContaGastoDepre(false);
			
			//SI ES MANUAL
			if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaContaGastoDepre();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCuentaContaGastoDepre() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCuentaContaGastoDepre.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCuentaContaGastoDepre.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCuentaContaGastoDepre.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCuentaContaGastoDepre.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCuentaContaGastoDepre.setMinimumSize(dimensionMinimum);
		this.jTableDatosCuentaContaGastoDepre.setMaximumSize(dimensionMaximum);
		this.jTableDatosCuentaContaGastoDepre.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCuentaContaGastoDepre(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCuentaContaGastoDepre(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCuentaContaGastoDepre(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCuentaContaGastoDepre(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCuentaContaGastoDepre(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCuentaContaGastoDepre(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContaGastoDepre(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCuentaContaGastoDepre(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCuentaContaGastoDepre() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCuentaContaGastoDepre();
		
		this.inicializarActualizarBindingBotonesManualCuentaContaGastoDepre(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaContaGastoDepre();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContaGastoDepre() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaContaGastoDepre(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaContaGastoDepre(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCuentaContaGastoDepre.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCuentaContaGastoDepre.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jCheckBoxPostAccionNuevoCuentaContaGastoDepre.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jCheckBoxPostAccionSinCerrarCuentaContaGastoDepre.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jCheckBoxPostAccionSinMensajeCuentaContaGastoDepre.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCuentaContaGastoDepre.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCuentaContaGastoDepre.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
				this.jInternalFrameDetalleFormCuentaContaGastoDepre.jCheckBoxPostAccionNuevoCuentaContaGastoDepre.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCuentaContaGastoDepre.jCheckBoxPostAccionSinCerrarCuentaContaGastoDepre.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCuentaContaGastoDepre.jCheckBoxPostAccionSinMensajeCuentaContaGastoDepre.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCuentaContaGastoDepre.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCuentaContaGastoDepre.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCuentaContaGastoDepre.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCuentaContaGastoDepre.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCuentaContaGastoDepre.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCuentaContaGastoDepre.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCuentaContaGastoDepre(Boolean esInicializar) throws Exception {
		try	{	
			if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaContaGastoDepre(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContaGastoDepre() throws Exception {
		try	{
			if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaContaGastoDepre();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaContaGastoDepre() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaContaGastoDepre() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCuentaContaGastoDepre.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCuentaContaGastoDepre.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCuentaContaGastoDepre.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCuentaContaGastoDepre.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCuentaContaGastoDepre.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCuentaContaGastoDepre.addItem(reporte);
			}
			
			
			if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCuentaContaGastoDepre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCuentaContaGastoDepre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCuentaContaGastoDepre.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCuentaContaGastoDepre.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCuentaContaGastoDepre.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCuentaContaGastoDepre.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaContaGastoDepre();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaContaGastoDepre() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre!=null) {
				this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre!=null) {
				this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre!=null) {
				
				if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCuentaContaGastoDepre()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaContaGastoDepre.getSelectedItem()).getId();}
		if(this.jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.getSelectedItem()!=null){this.id_gasto_depreciacionFK_IdGastoDepreciacion=((GastoDepreciacion)this.jComboBoxid_gasto_depreciacionFK_IdGastoDepreciacionCuentaContaGastoDepre.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCuentaContaGastoDepre(Boolean esInicializar) throws Exception {				
		if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaContaGastoDepre();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCuentaContaGastoDepre() throws Exception {
		this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCuentaContaGastoDepre() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CuentaContaGastoDeprePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CuentaContaGastoDeprePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCuentaContaGastoDepreOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaGastoDepreOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CuentaContaGastoDeprePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CuentaContaGastoDeprePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCuentaContaGastoDepre(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cuentacontagastodepreLogic.getCuentaContaGastoDepres().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cuentacontagastodepres.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCuentaContaGastoDepre.setModel(new CuentaContaGastoDepreModel(this.cuentacontagastodepreLogic.getCuentaContaGastoDepres(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCuentaContaGastoDepre.setModel(new CuentaContaGastoDepreModel(this.cuentacontagastodepres,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCuentaContaGastoDepre!=null && this.jInternalFrameOrderByCuentaContaGastoDepre.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCuentaContaGastoDepre();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaGastoDepre,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CuentaContaGastoDeprePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO,cuentacontagastodepreConstantesFunciones.resaltarSeleccionarCuentaContaGastoDepre,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO,cuentacontagastodepreConstantesFunciones.resaltarSeleccionarCuentaContaGastoDepre,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaGastoDepre,CuentaContaGastoDepreConstantesFunciones.LABEL_ID));

		if(this.cuentacontagastodepreConstantesFunciones.mostraridCuentaContaGastoDepre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContaGastoDepreConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuentacontagastodepreConstantesFunciones.resaltaridCuentaContaGastoDepre,this.cuentacontagastodepreConstantesFunciones.activaridCuentaContaGastoDepre,this,true,"idCuentaContaGastoDepre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentacontagastodepreConstantesFunciones.resaltaridCuentaContaGastoDepre,this.cuentacontagastodepreConstantesFunciones.activaridCuentaContaGastoDepre,this,true,"idCuentaContaGastoDepre","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaGastoDepre,CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.cuentacontagastodepreConstantesFunciones.mostrarid_cuenta_contableCuentaContaGastoDepre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cuentacontagastodepreConstantesFunciones.resaltarid_cuenta_contableCuentaContaGastoDepre,this,this.cuentacontagastodepreConstantesFunciones.activarid_cuenta_contableCuentaContaGastoDepre));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cuentacontagastodepreConstantesFunciones.resaltarid_cuenta_contableCuentaContaGastoDepre,this,this.cuentacontagastodepreConstantesFunciones.activarid_cuenta_contableCuentaContaGastoDepre,true,"id_cuenta_contableCuentaContaGastoDepre","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CuentaContaGastoDeprePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaGastoDepre,CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION));

		if(this.cuentacontagastodepreConstantesFunciones.mostrarid_gasto_depreciacionCuentaContaGastoDepre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new GastoDepreciacionTableCell(this.gastodepreciacionsForeignKey,this.cuentacontagastodepreConstantesFunciones.resaltarid_gasto_depreciacionCuentaContaGastoDepre,this,this.cuentacontagastodepreConstantesFunciones.activarid_gasto_depreciacionCuentaContaGastoDepre));
			tableColumn.setCellEditor(new GastoDepreciacionTableCell(this.gastodepreciacionsForeignKey,this.cuentacontagastodepreConstantesFunciones.resaltarid_gasto_depreciacionCuentaContaGastoDepre,this,this.cuentacontagastodepreConstantesFunciones.activarid_gasto_depreciacionCuentaContaGastoDepre,true,"id_gasto_depreciacionCuentaContaGastoDepre","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaContaGastoDeprePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaContaGastoDepre.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaContaGastoDepre.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCuentaContaGastoDepre.addColumn(tableColumn);
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
			
			this.jTableDatosCuentaContaGastoDepre.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCuentaContaGastoDepre.moveColumn(this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCuentaContaGastoDepre.moveColumn(this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCuentaContaGastoDepre.moveColumn(this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCuentaContaGastoDepre.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCuentaContaGastoDepre.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCuentaContaGastoDepre,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCuentaContaGastoDepre.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCuentaContaGastoDepre.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCuentaContaGastoDepre.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cuentacontagastodepreLogic.getCuentaContaGastoDepres().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cuentacontagastodepres.size()-1;
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
		//this.jTableDatosCuentaContaGastoDepre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCuentaContaGastoDepre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCuentaContaGastoDepre();
			
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
				
				//this.isEsNuevoCuentaContaGastoDepre=false;
					
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
				if(this.cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaContaGastoDepre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaContaGastoDepre.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cuentacontagastodepre.getsType().equals("DUPLICADO")
				   || this.cuentacontagastodepre.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCuentaContaGastoDepre=true;
				
				} else {
					this.isEsNuevoCuentaContaGastoDepre=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
					if(this.cuentacontagastodepre.getId()>=0 && !this.cuentacontagastodepre.getIsNew()) {						
						this.isEsNuevoCuentaContaGastoDepre=false;
						
					} else {
						this.isEsNuevoCuentaContaGastoDepre=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCuentaContaGastoDepre(esRelaciones);						
				
				this.seleccionarCuentaContaGastoDepre(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cuentacontagastodepre.getId()<0) {
					this.isEsNuevoCuentaContaGastoDepre=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCuentaContaGastoDepre(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCuentaContaGastoDepre(evt,rowIndex);
				}	
				
				if(this.cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CuentaContaGastoDepre: " + this.dDif); 
					}
				}								
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCuentaContaGastoDepre(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cuentacontagastodepre)) {
					if(this.cuentacontagastodepre.getId()>0) {
						this.cuentacontagastodepre.setIsDeleted(true);
						
						this.cuentacontagastodepresEliminados.add(this.cuentacontagastodepre);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().remove(this.cuentacontagastodepre);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentacontagastodepres.remove(this.cuentacontagastodepre);				
					}
					
					
					((CuentaContaGastoDepreModel) this.jTableDatosCuentaContaGastoDepre.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCuentaContaGastoDepre(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCuentaContaGastoDepre) {
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaContaGastoDepre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaContaGastoDepre.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCuentaContaGastoDepre(this.cuentacontagastodepre);
				}
				
				//ARCHITECTURE
				try {
					

					//CuentaContable
					if(!this.cuentacontagastodepreConstantesFunciones.cargarid_cuenta_contableCuentaContaGastoDepre || this.cuentacontagastodepreConstantesFunciones.event_dependid_cuenta_contableCuentaContaGastoDepre) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.cuentacontagastodepre.getid_cuenta_contable());
									//this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(cuentacontagastodepre.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(cuentacontagastodepre.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.cuentacontagastodepre.getid_cuenta_contable(),false,"Formulario");

					//GastoDepreciacion
					if(!this.cuentacontagastodepreConstantesFunciones.cargarid_gasto_depreciacionCuentaContaGastoDepre || this.cuentacontagastodepreConstantesFunciones.event_dependid_gasto_depreciacionCuentaContaGastoDepre) {
						//this.cargarCombosGastoDepreciacionsForeignKeyLista(" where id="+this.cuentacontagastodepre.getid_gasto_depreciacion());
									//this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);
						this.gastodepreciacionsForeignKey=new ArrayList<GastoDepreciacion>();

						if(cuentacontagastodepre.getGastoDepreciacion()!=null) {
							this.gastodepreciacionsForeignKey.add(cuentacontagastodepre.getGastoDepreciacion());
						}

						this.addItemDefectoCombosForeignKeyGastoDepreciacion();
						this.cargarCombosFrameGastoDepreciacionsForeignKey("Todos");
					}
					this.setActualGastoDepreciacionForeignKey(this.cuentacontagastodepre.getid_gasto_depreciacion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCuentaContaGastoDepre("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCuentaContaGastoDepre(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaContaGastoDepre() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCuentaContaGastoDepre(cuentacontagastodepre,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCuentaContaGastoDepre(cuentacontagastodepre);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCuentaContaGastoDepre(cuentacontagastodepre,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCuentaContaGastoDepre(cuentacontagastodepre);
	}
	
	public void setVariablesObjetoActualToFormularioCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelidCuentaContaGastoDepre.setText(cuentacontagastodepre.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CuentaContaGastoDepre cuentacontagastodepreLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cuentacontagastodepreLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CuentaContaGastoDepre cuentacontagastodepreLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cuentacontagastodepreLocal=this.cuentacontagastodepre;
			} else {
				cuentacontagastodepreLocal=this.cuentacontagastodepreAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cuentacontagastodepreLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCuentaContaGastoDepre(cuentacontagastodepreLocal,true);
					
					if(cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cuentacontagastodepreLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cuentacontagastodepreLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(cuentacontagastodepre,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(cuentacontagastodepre);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(cuentacontagastodepre,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelidCuentaContaGastoDepre.getText()==null || this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelidCuentaContaGastoDepre.getText()=="" || this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelidCuentaContaGastoDepre.getText()=="Id") {
				this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelidCuentaContaGastoDepre.setText("0");
			}

			if(conColumnasBase) {cuentacontagastodepre.setId(Long.parseLong(this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelidCuentaContaGastoDepre.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaContaGastoDepreConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelIdCuentaContaGastoDepre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepreBean,CuentaContaGastoDepre cuentacontagastodepre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cuentacontagastodepreBean.getid_cuenta_contable()!=null && !cuentacontagastodepreBean.getid_cuenta_contable().equals(-1L))) {cuentacontagastodepre.setid_cuenta_contable(cuentacontagastodepreBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cuentacontagastodepreBean.getid_gasto_depreciacion()!=null && !cuentacontagastodepreBean.getid_gasto_depreciacion().equals(-1L))) {cuentacontagastodepre.setid_gasto_depreciacion(cuentacontagastodepreBean.getid_gasto_depreciacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepreOrigen,CuentaContaGastoDepre cuentacontagastodepre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentacontagastodepreOrigen.getId()!=null && !cuentacontagastodepreOrigen.getId().equals(0L))) {cuentacontagastodepre.setId(cuentacontagastodepreOrigen.getId());}}
			if(conDefault || (!conDefault && cuentacontagastodepreOrigen.getid_cuenta_contable()!=null && !cuentacontagastodepreOrigen.getid_cuenta_contable().equals(-1L))) {cuentacontagastodepre.setid_cuenta_contable(cuentacontagastodepreOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cuentacontagastodepreOrigen.getid_gasto_depreciacion()!=null && !cuentacontagastodepreOrigen.getid_gasto_depreciacion().equals(-1L))) {cuentacontagastodepre.setid_gasto_depreciacion(cuentacontagastodepreOrigen.getid_gasto_depreciacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelidCuentaContaGastoDepre.setText(cuentacontagastodepre.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaContaGastoDepre(CuentaContaGastoDepreBean cuentacontagastodepreBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelidCuentaContaGastoDepre.setText(cuentacontagastodepreBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCuentaContaGastoDepre(CuentaContaGastoDepreParameterReturnGeneral cuentacontagastodepreReturnGeneral,CuentaContaGastoDepreBean cuentacontagastodepreBean,Boolean conDefault) throws Exception { 
		try {
			CuentaContaGastoDepre cuentacontagastodepreLocal=new CuentaContaGastoDepre();
			
			cuentacontagastodepreLocal=cuentacontagastodepreReturnGeneral.getCuentaContaGastoDepre();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentacontagastodepreLocal.getId()!=null && !cuentacontagastodepreLocal.getId().equals(0L))) {cuentacontagastodepreBean.setId(cuentacontagastodepreLocal.getId());}}
			if(conDefault || (!conDefault && cuentacontagastodepreLocal.getid_cuenta_contable()!=null && !cuentacontagastodepreLocal.getid_cuenta_contable().equals(-1L))) {cuentacontagastodepreBean.setid_cuenta_contable(cuentacontagastodepreLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cuentacontagastodepreLocal.getid_gasto_depreciacion()!=null && !cuentacontagastodepreLocal.getid_gasto_depreciacion().equals(-1L))) {cuentacontagastodepreBean.setid_gasto_depreciacion(cuentacontagastodepreLocal.getid_gasto_depreciacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCuentaContaGastoDepreGenerico(Long idCuentaContaGastoDepreSeleccionado,JComboBox jComboBoxCuentaContaGastoDepre,List<CuentaContaGastoDepre> cuentacontagastodepresLocal)throws Exception {
		try {
			CuentaContaGastoDepre  cuentacontagastodepreTemp=null;

			for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepresLocal) {
				if(cuentacontagastodepreAux.getId()!=null && cuentacontagastodepreAux.getId().equals(idCuentaContaGastoDepreSeleccionado)) {
					cuentacontagastodepreTemp=cuentacontagastodepreAux;
					break;
				}
			}

			jComboBoxCuentaContaGastoDepre.setSelectedItem(cuentacontagastodepreTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCuentaContaGastoDepreGenerico(JComboBox jComboBoxCuentaContaGastoDepre,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCuentaContaGastoDepre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaContaGastoDepre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCuentaContaGastoDepre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaContaGastoDepre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaContaGastoDepre.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCuentaContaGastoDepre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaContaGastoDepre.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCuentaContaGastoDepre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCuentaContaGastoDepre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCuentaContaGastoDepre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacontagastodepre=(CuentaContaGastoDepre) cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentacontagastodepre =(CuentaContaGastoDepre) cuentacontagastodepres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!cuentacontagastodepre.getIsNew() && !cuentacontagastodepre.getIsChanged() && !cuentacontagastodepre.getIsDeleted()) {
				sDescripcion=cuentacontagastodepre.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacontagastodepre.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("GastoDepreciacion")) {
			//sDescripcion=this.getActualGastoDepreciacionForeignKeyDescripcion((Long)value);
			if(!cuentacontagastodepre.getIsNew() && !cuentacontagastodepre.getIsChanged() && !cuentacontagastodepre.getIsDeleted()) {
				sDescripcion=cuentacontagastodepre.getgastodepreciacion_descripcion();
			} else {
				//sDescripcion=this.getActualGastoDepreciacionForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacontagastodepre.getgastodepreciacion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CuentaContaGastoDepre cuentacontagastodepreRow=new CuentaContaGastoDepre();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacontagastodepreRow=(CuentaContaGastoDepre) cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentacontagastodepreRow=(CuentaContaGastoDepre) cuentacontagastodepres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCuentaContaGastoDepre(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaNuevoCuentaContaGastoDepre && this.isPermisoNuevoCuentaContaGastoDepre));			
			this.jButtonDuplicarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaDuplicarCuentaContaGastoDepre && this.isPermisoDuplicarCuentaContaGastoDepre));			
			this.jButtonCopiarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaCopiarCuentaContaGastoDepre && this.isPermisoCopiarCuentaContaGastoDepre));
			this.jButtonVerFormCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaVerFormCuentaContaGastoDepre && this.isPermisoVerFormCuentaContaGastoDepre));
			
			this.jButtonAbrirOrderByCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaOrdenCuentaContaGastoDepre && this.isPermisoOrdenCuentaContaGastoDepre));			
			
			this.jButtonNuevoRelacionesCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre && this.isPermisoNuevoCuentaContaGastoDepre));			
			this.jButtonNuevoGuardarCambiosCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaNuevoCuentaContaGastoDepre && this.isPermisoNuevoCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre));
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonModificarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaModificarCuentaContaGastoDepre && this.isPermisoActualizarCuentaContaGastoDepre));	
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonActualizarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaActualizarCuentaContaGastoDepre && this.isPermisoActualizarCuentaContaGastoDepre));	
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonEliminarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaEliminarCuentaContaGastoDepre && this.isPermisoEliminarCuentaContaGastoDepre));
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonCancelarCuentaContaGastoDepre.setVisible(this.isVisibilidadCeldaCancelarCuentaContaGastoDepre);							
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaGuardarCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre));			
			
			}
						
			this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaNuevoCuentaContaGastoDepre && this.isPermisoNuevoCuentaContaGastoDepre));						
			this.jButtonDuplicarToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaDuplicarCuentaContaGastoDepre && this.isPermisoDuplicarCuentaContaGastoDepre));						
			this.jButtonCopiarToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaCopiarCuentaContaGastoDepre && this.isPermisoCopiarCuentaContaGastoDepre));			
			this.jButtonVerFormToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaVerFormCuentaContaGastoDepre && this.isPermisoVerFormCuentaContaGastoDepre));			
			this.jButtonAbrirOrderByToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaOrdenCuentaContaGastoDepre && this.isPermisoOrdenCuentaContaGastoDepre));
			this.jButtonNuevoRelacionesToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre && this.isPermisoNuevoCuentaContaGastoDepre));			
			this.jButtonNuevoGuardarCambiosToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaNuevoCuentaContaGastoDepre && this.isPermisoNuevoCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre));			
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonModificarToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaModificarCuentaContaGastoDepre && this.isPermisoActualizarCuentaContaGastoDepre));	
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonActualizarToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaActualizarCuentaContaGastoDepre  && this.isPermisoActualizarCuentaContaGastoDepre));	
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonEliminarToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaEliminarCuentaContaGastoDepre && this.isPermisoEliminarCuentaContaGastoDepre));
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonCancelarToolBarCuentaContaGastoDepre.setVisible(this.isVisibilidadCeldaCancelarCuentaContaGastoDepre);				
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaGuardarCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaNuevoCuentaContaGastoDepre && this.isPermisoNuevoCuentaContaGastoDepre));			
			this.jMenuItemDuplicarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaDuplicarCuentaContaGastoDepre && this.isPermisoDuplicarCuentaContaGastoDepre));			
			this.jMenuItemCopiarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaCopiarCuentaContaGastoDepre && this.isPermisoCopiarCuentaContaGastoDepre));			
			this.jMenuItemVerFormCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaVerFormCuentaContaGastoDepre && this.isPermisoVerFormCuentaContaGastoDepre));			
			this.jMenuItemAbrirOrderByCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaOrdenCuentaContaGastoDepre && this.isPermisoOrdenCuentaContaGastoDepre));			
			//this.jMenuItemMostrarOcultarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaOrdenCuentaContaGastoDepre && this.isPermisoOrdenCuentaContaGastoDepre));
			this.jMenuItemDetalleAbrirOrderByCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaOrdenCuentaContaGastoDepre && this.isPermisoOrdenCuentaContaGastoDepre));			
			//this.jMenuItemDetalleMostrarOcultarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaOrdenCuentaContaGastoDepre && this.isPermisoOrdenCuentaContaGastoDepre));			
			this.jMenuItemNuevoRelacionesCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre && this.isPermisoNuevoCuentaContaGastoDepre));			
			this.jMenuItemNuevoGuardarCambiosCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaNuevoCuentaContaGastoDepre && this.isPermisoNuevoCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre));									
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemModificarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaModificarCuentaContaGastoDepre && this.isPermisoActualizarCuentaContaGastoDepre));	
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemActualizarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaActualizarCuentaContaGastoDepre && this.isPermisoActualizarCuentaContaGastoDepre));	
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemEliminarCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaEliminarCuentaContaGastoDepre && this.isPermisoEliminarCuentaContaGastoDepre));
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemCancelarCuentaContaGastoDepre.setVisible(this.isVisibilidadCeldaCancelarCuentaContaGastoDepre);				
			}
			
			this.jMenuItemGuardarCambiosCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaGuardarCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre));						
			this.jMenuItemGuardarCambiosTablaCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=this.jButtonNuevoCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaDuplicarCuentaContaGastoDepre=this.jButtonDuplicarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaCopiarCuentaContaGastoDepre=this.jButtonCopiarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaVerFormCuentaContaGastoDepre=this.jButtonVerFormCuentaContaGastoDepre.isVisible();
			
			this.isVisibilidadCeldaOrdenCuentaContaGastoDepre=this.jButtonAbrirOrderByCuentaContaGastoDepre.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=this.jButtonNuevoRelacionesCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaModificarCuentaContaGastoDepre=this.jButtonModificarCuentaContaGastoDepre.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonActualizarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonEliminarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaCancelarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonCancelarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosCuentaContaGastoDepre.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=this.jButtonNuevoToolBarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=this.jButtonNuevoRelacionesToolBarCuentaContaGastoDepre.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			this.isVisibilidadCeldaModificarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonModificarToolBarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonActualizarToolBarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonEliminarToolBarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaCancelarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonCancelarToolBarCuentaContaGastoDepre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=this.jButtonGuardarCambiosToolBarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=this.jButtonGuardarCambiosTablaToolBarCuentaContaGastoDepre.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=this.jMenuItemNuevoCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=this.jMenuItemNuevoRelacionesCuentaContaGastoDepre.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			this.isVisibilidadCeldaModificarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemModificarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemActualizarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemEliminarCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaCancelarCuentaContaGastoDepre=this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemCancelarCuentaContaGastoDepre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=this.jMenuItemGuardarCambiosCuentaContaGastoDepre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=this.jMenuItemGuardarCambiosTablaCuentaContaGastoDepre.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCuentaContaGastoDepre(Boolean esInicializar) {
		if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
				//if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaContaGastoDepre();
			}
			
			this.inicializarActualizarBindingBotonesManualCuentaContaGastoDepre(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCuentaContaGastoDepre() {
		this.jButtonNuevoCuentaContaGastoDepre.setVisible(this.isPermisoNuevoCuentaContaGastoDepre);			
		this.jButtonDuplicarCuentaContaGastoDepre.setVisible(this.isPermisoDuplicarCuentaContaGastoDepre);			
		this.jButtonCopiarCuentaContaGastoDepre.setVisible(this.isPermisoCopiarCuentaContaGastoDepre);			
		this.jButtonVerFormCuentaContaGastoDepre.setVisible(this.isPermisoVerFormCuentaContaGastoDepre);			
		
		this.jButtonAbrirOrderByCuentaContaGastoDepre.setVisible(this.isPermisoOrdenCuentaContaGastoDepre);					
		
		this.jButtonNuevoRelacionesCuentaContaGastoDepre.setVisible(this.isPermisoNuevoCuentaContaGastoDepre);			
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonModificarCuentaContaGastoDepre.setVisible(this.isPermisoActualizarCuentaContaGastoDepre);	
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonActualizarCuentaContaGastoDepre.setVisible(this.isPermisoActualizarCuentaContaGastoDepre);	
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonEliminarCuentaContaGastoDepre.setVisible(this.isPermisoEliminarCuentaContaGastoDepre);
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonCancelarCuentaContaGastoDepre.setVisible(this.isVisibilidadCeldaCancelarCuentaContaGastoDepre);						
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosCuentaContaGastoDepre.setVisible(this.isPermisoGuardarCambiosCuentaContaGastoDepre);							
		}
		
		this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.setVisible(this.isPermisoActualizarCuentaContaGastoDepre);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaContaGastoDepre() {
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonModificarCuentaContaGastoDepre.setVisible(this.isPermisoActualizarCuentaContaGastoDepre);	
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonActualizarCuentaContaGastoDepre.setVisible(this.isPermisoActualizarCuentaContaGastoDepre);	
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonEliminarCuentaContaGastoDepre.setVisible(this.isPermisoEliminarCuentaContaGastoDepre);
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonCancelarCuentaContaGastoDepre.setVisible(this.isVisibilidadCeldaCancelarCuentaContaGastoDepre);							
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosCuentaContaGastoDepre.setVisible((this.isVisibilidadCeldaGuardarCuentaContaGastoDepre && this.isPermisoGuardarCambiosCuentaContaGastoDepre));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCuentaContaGastoDepre() {
		if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCuentaContaGastoDepre();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCuentaContaGastoDepre() {
	}
	
	public void jTableDatosCuentaContaGastoDepreListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCuentaContaGastoDepre(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCuentaContaGastoDepreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.getcuentacontagastodepre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontagastodepre==null) {
						this.cuentacontagastodepre = new CuentaContaGastoDepre();
					}

					this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.cuentacontagastodepre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);
				}

				if(this.cuentacontagastodepre.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cuentacontagastodepre.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContaGastoDepre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableCuentaContaGastoDepreActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderCuentaContaGastoDepre=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosCuentaContaGastoDepre.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCuentaContaGastoDepre=(TitledBorder)this.jScrollPanelDatosCuentaContaGastoDepre.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCuentaContaGastoDepre.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableCuentaContaGastoDepreUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebCuentaContaGastoDepre(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaContaGastoDepre.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaContaGastoDepre.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.getcuentacontagastodepre(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cuentacontagastodepreLogic.getConnexion());

				if(this.cuentacontagastodepre.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.cuentacontagastodepre.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaContaGastoDepre=(TitledBorder)this.jScrollPanelDatosCuentaContaGastoDepre.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCuentaContaGastoDepre.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableCuentaContaGastoDepreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.getcuentacontagastodepre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontagastodepre==null) {
						this.cuentacontagastodepre = new CuentaContaGastoDepre();
					}

					this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.cuentacontagastodepre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);
				}

				if(this.cuentacontagastodepre.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.cuentacontagastodepre.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContaGastoDepre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogastodepreciacion=true;

			idTienePermisogastodepreciacion=this.tienePermisosUsuarioEnPaginaWebCuentaContaGastoDepre(GastoDepreciacionConstantesFunciones.CLASSNAME);

			if(idTienePermisogastodepreciacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaContaGastoDepre.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaContaGastoDepre.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.getcuentacontagastodepre(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);

				this.gastodepreciacionBeanSwingJInternalFrame=new GastoDepreciacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.gastodepreciacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.gastodepreciacionBeanSwingJInternalFrame.getGastoDepreciacionLogic().setConnexion(this.cuentacontagastodepreLogic.getConnexion());

				if(this.cuentacontagastodepre.getid_gasto_depreciacion()!=null) {
					this.gastodepreciacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.gastodepreciacionBeanSwingJInternalFrame.setIdActual(this.cuentacontagastodepre.getid_gasto_depreciacion());
					this.gastodepreciacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.gastodepreciacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.gastodepreciacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGastoDepreciacion();
				}

				JInternalFrameBase jinternalFrame =this.gastodepreciacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaContaGastoDepre=(TitledBorder)this.jScrollPanelDatosCuentaContaGastoDepre.getBorder();
				TitledBorder titledBordergastodepreciacion=(TitledBorder)this.gastodepreciacionBeanSwingJInternalFrame.jScrollPanelDatosGastoDepreciacion.getBorder();

				titledBordergastodepreciacion.setTitle(titledBorderCuentaContaGastoDepre.getTitle() + " -> Gasto Depreciacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_gasto_depreciacionCuentaContaGastoDepreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.getcuentacontagastodepre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontagastodepre==null) {
						this.cuentacontagastodepre = new CuentaContaGastoDepre();
					}

					this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.cuentacontagastodepre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);
				}

				if(this.cuentacontagastodepre.getid_gasto_depreciacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_gasto_depreciacion = "+this.cuentacontagastodepre.getid_gasto_depreciacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContaGastoDepre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);

			this.getCuentaContaGastoDepresFK_IdCuentaContable();

			this.inicializarActualizarBindingCuentaContaGastoDepre(false);

			//if(CuentaContaGastoDepreBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGastoDepreciacionCuentaContaGastoDepreActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);

			this.getCuentaContaGastoDepresFK_IdGastoDepreciacion();

			this.inicializarActualizarBindingCuentaContaGastoDepre(false);

			//if(CuentaContaGastoDepreBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontagastodepreLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCuentaContaGastoDepre() {
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.setVisible(false);	    			
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.dispose();
			this.jInternalFrameDetalleFormCuentaContaGastoDepre=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre!=null) {
			this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.dispose();
			this.jInternalFrameReporteDinamicoCuentaContaGastoDepre=null;
		}
		
		if(this.jInternalFrameImportacionCuentaContaGastoDepre!=null) {
			this.jInternalFrameImportacionCuentaContaGastoDepre.setVisible(false);	    			
			this.jInternalFrameImportacionCuentaContaGastoDepre.dispose();
			this.jInternalFrameImportacionCuentaContaGastoDepre=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCuentaContaGastoDepre();
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
			
			if(sTipo.equals("NuevoCuentaContaGastoDepre")) {
				jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCuentaContaGastoDepre")) {
				jButtonDuplicarCuentaContaGastoDepreActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCuentaContaGastoDepre")) {
				jButtonCopiarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("VerFormCuentaContaGastoDepre")) {
				jButtonVerFormCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCuentaContaGastoDepre")) {
				jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCuentaContaGastoDepre")) {
				jButtonDuplicarCuentaContaGastoDepreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCuentaContaGastoDepre")) {
				jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCuentaContaGastoDepre")) {
				jButtonDuplicarCuentaContaGastoDepreActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCuentaContaGastoDepre")) {
				jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCuentaContaGastoDepre")) {
				jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCuentaContaGastoDepre")) {
				jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCuentaContaGastoDepre")) {
				jButtonModificarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCuentaContaGastoDepre")) {
				jButtonModificarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCuentaContaGastoDepre")) {
				jButtonModificarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCuentaContaGastoDepre")) {
				jButtonActualizarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCuentaContaGastoDepre")) {
				jButtonActualizarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCuentaContaGastoDepre")) {
				jButtonActualizarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("EliminarCuentaContaGastoDepre")) {
				jButtonEliminarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCuentaContaGastoDepre")) {
				jButtonEliminarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCuentaContaGastoDepre")) {
				jButtonEliminarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("CancelarCuentaContaGastoDepre")) {
				jButtonCancelarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCuentaContaGastoDepre")) {
				jButtonCancelarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCuentaContaGastoDepre")) {
				jButtonCancelarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("CerrarCuentaContaGastoDepre")) {
				jButtonCerrarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCuentaContaGastoDepre")) {
				jButtonCerrarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCuentaContaGastoDepre")) {
				jButtonCerrarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCuentaContaGastoDepre")) {
				jButtonMostrarOcultarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCuentaContaGastoDepre")) {
				jButtonCancelarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCuentaContaGastoDepre")) {
				jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCuentaContaGastoDepre")) {
				jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCuentaContaGastoDepre")) {
				jButtonCopiarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCuentaContaGastoDepre")) {
				jButtonVerFormCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCuentaContaGastoDepre")) {
				jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCuentaContaGastoDepre")) {
				jButtonCopiarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCuentaContaGastoDepre")) {
				jButtonVerFormCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCuentaContaGastoDepre")) {
				jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCuentaContaGastoDepre")) {
				jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCuentaContaGastoDepre")) {
				jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCuentaContaGastoDepre")) {
				jButtonRecargarInformacionCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCuentaContaGastoDepre")) {
				jButtonRecargarInformacionCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCuentaContaGastoDepre")) {
				jButtonRecargarInformacionCuentaContaGastoDepreActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCuentaContaGastoDepre")) {
				jButtonAnterioresCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCuentaContaGastoDepre")) {
				jButtonAnterioresCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCuentaContaGastoDepre")) {
				jButtonAnterioresCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCuentaContaGastoDepre")) {
				jButtonSiguientesCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCuentaContaGastoDepre")) {
				jButtonSiguientesCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCuentaContaGastoDepre")) {
				jButtonSiguientesCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCuentaContaGastoDepre") || sTipo.equals("MenuItemDetalleAbrirOrderByCuentaContaGastoDepre")) {
				jButtonAbrirOrderByCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCuentaContaGastoDepre") || sTipo.equals("MenuItemDetalleMostrarOcultarCuentaContaGastoDepre")) {
				jButtonMostrarOcultarCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaContaGastoDepre")) {
				jButtonNuevoGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCuentaContaGastoDepre")) {
				jButtonNuevoGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCuentaContaGastoDepre")) {
				jButtonNuevoGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCuentaContaGastoDepre")) {
				jButtonCerrarReporteDinamicoCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCuentaContaGastoDepre")) {
				jButtonGenerarReporteDinamicoCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCuentaContaGastoDepre")) {
				
				jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCuentaContaGastoDepre")) {
				jButtonCerrarImportacionCuentaContaGastoDepreActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCuentaContaGastoDepre")) {
				
				jButtonGenerarImportacionCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCuentaContaGastoDepre")) {
				
				jButtonAbrirImportacionCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCuentaContaGastoDepre")) {
				jComboBoxTiposAccionesCuentaContaGastoDepreActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCuentaContaGastoDepre")) {
				jComboBoxTiposRelacionesCuentaContaGastoDepreActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCuentaContaGastoDepre")) {
				jComboBoxTiposAccionesCuentaContaGastoDepreActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCuentaContaGastoDepre")) {
				
				jComboBoxTiposSeleccionarCuentaContaGastoDepreActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCuentaContaGastoDepre")) {
				jTextFieldValorCampoGeneralCuentaContaGastoDepreActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCuentaContaGastoDepre")) {
				jButtonAbrirOrderByCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCuentaContaGastoDepre")) {
				jButtonAbrirOrderByCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCuentaContaGastoDepre")) {
				jButtonCerrarOrderByCuentaContaGastoDepreActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaContaGastoDepreBusqueda")) {
				this.jButtonidCuentaContaGastoDepreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaGastoDepre")) {
				this.jButtonid_cuenta_contableCuentaContaGastoDepreActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaGastoDepreArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaGastoDepreUpdate")) {
				this.jButtonid_cuenta_contableCuentaContaGastoDepreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaGastoDepreBusqueda")) {
				this.jButtonid_cuenta_contableCuentaContaGastoDepreBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_gasto_depreciacionCuentaContaGastoDepreUpdate")) {
				this.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_gasto_depreciacionCuentaContaGastoDepreBusqueda")) {
				this.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contableCuentaContaGastoDepre")) {
				this.jButtonid_cuenta_contableCuentaContaGastoDepreActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCuentaContableCuentaContaGastoDepre")) {
				this.jButtonFK_IdCuentaContableCuentaContaGastoDepreActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdGastoDepreciacionCuentaContaGastoDepre")) {
				this.jButtonFK_IdGastoDepreciacionCuentaContaGastoDepreActionPerformed(evt);
			}
			
			;
			
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCuentaContaGastoDepre();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaGastoDepreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				


				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaGastoDepre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaGastoDepre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CuentaContaGastoDepre cuentacontagastodepreLocal=null;
			
			if(!this.getEsControlTabla()) {
				cuentacontagastodepreLocal=this.cuentacontagastodepre;
			} else {
				cuentacontagastodepreLocal=this.cuentacontagastodepreAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
							
				
				


				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaGastoDepre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaGastoDepre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaGastoDepreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
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
			
			


			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaGastoDepreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
								
						
				


				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaGastoDepre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaGastoDepre.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
								
				
				


				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaGastoDepre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaGastoDepre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaGastoDepreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaGastoDepreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaGastoDepreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
							
				
				


				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaGastoDepre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaGastoDepre.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaGastoDepreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
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
			
			


			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaGastoDepreActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
								
				
				


				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaGastoDepre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaGastoDepre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaGastoDepreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaGastoDepreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaGastoDepreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCuentaContaGastoDepre")) {
					jCheckBoxSeleccionarTodosCuentaContaGastoDepreItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCuentaContaGastoDepre")) {
					jCheckBoxSeleccionadosCuentaContaGastoDepreItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCuentaContaGastoDepre")) {
					
				}
				
				


				
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaGastoDepre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaGastoDepre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
												
				
				


				
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaGastoDepre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaGastoDepre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaGastoDepreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaGastoDepreActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
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
			
			


			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContaGastoDepreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaGastoDepre.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaGastoDepre.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontagastodepre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontagastodepre);
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
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
				
				


				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContaGastoDepre.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContaGastoDepre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContaGastoDepreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontagastodepreAnterior =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCuentaContaGastoDepre")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCuentaContaGastoDepreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCuentaContaGastoDepre.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cuentacontagastodepre =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cuentacontagastodepre);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCuentaContaGastoDepre")) {
				
				}
				
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCuentaContaGastoDepre")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCuentaContaGastoDepre.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCuentaContaGastoDepre")) {
			
			}
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCuentaContaGastoDepre();
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
			if(sTipo.equals("NuevoCuentaContaGastoDepre")) {
				jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCuentaContaGastoDepre")) {
				jButtonDuplicarCuentaContaGastoDepreActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCuentaContaGastoDepre")) {
				jButtonCopiarCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCuentaContaGastoDepre")) {
				jButtonVerFormCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCuentaContaGastoDepre")) {
				jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCuentaContaGastoDepre")) {
				jButtonModificarCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCuentaContaGastoDepre")) {
				jButtonActualizarCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCuentaContaGastoDepre")) {
				jButtonEliminarCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCuentaContaGastoDepre")) {
				jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCuentaContaGastoDepre")) {
				jButtonCancelarCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCuentaContaGastoDepre")) {
				jButtonCerrarCuentaContaGastoDepreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCuentaContaGastoDepre")) {
				jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaContaGastoDepre")) {
				jButtonNuevoGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCuentaContaGastoDepre")) {
				jButtonAbrirOrderByCuentaContaGastoDepreActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCuentaContaGastoDepre")) {
				jButtonRecargarInformacionCuentaContaGastoDepreActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCuentaContaGastoDepre")) {
				jButtonAnterioresCuentaContaGastoDepreActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCuentaContaGastoDepre")) {
				jButtonSiguientesCuentaContaGastoDepreActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaContaGastoDepreBusqueda")) {
				this.jButtonidCuentaContaGastoDepreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaGastoDepre")) {
				this.jButtonid_cuenta_contableCuentaContaGastoDepreActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaGastoDepreArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaGastoDepreUpdate")) {
				this.jButtonid_cuenta_contableCuentaContaGastoDepreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaContaGastoDepreBusqueda")) {
				this.jButtonid_cuenta_contableCuentaContaGastoDepreBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_gasto_depreciacionCuentaContaGastoDepreUpdate")) {
				this.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_gasto_depreciacionCuentaContaGastoDepreBusqueda")) {
				this.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusquedaActionPerformed(evt);
			}
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCuentaContaGastoDepre();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCuentaContaGastoDepre")) {
				closingInternalFrameCuentaContaGastoDepre();
				
			} else if(sTipo.equals("jButtonCancelarCuentaContaGastoDepre")) {
				JInternalFrameBase jInternalFrameDetalleFormCuentaContaGastoDepre = (JInternalFrameBase)evt.getSource();
	            	
	            CuentaContaGastoDepreBeanSwingJInternalFrame jInternalFrameParent=(CuentaContaGastoDepreBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaContaGastoDepre.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCuentaContaGastoDepreActionPerformed(null);
			}
			
			CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentacontagastodepre,new Object(),this.cuentacontagastodepreParameterGeneral,this.cuentacontagastodepreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCuentaContaGastoDepre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCuentaContaGastoDepre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCuentaContaGastoDepre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cuentacontagastodepre)) {
			if(!esControlTabla) {
				if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.cuentacontagastodepre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);			
				}
				
				if(this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCuentaContaGastoDepre(this.cuentacontagastodepre,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentacontagastodepreReturnGeneral=cuentacontagastodepreLogic.procesarEventosCuentaContaGastoDepresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontagastodepreLogic.getCuentaContaGastoDepres(),this.cuentacontagastodepre,this.cuentacontagastodepreParameterGeneral,this.isEsNuevoCuentaContaGastoDepre,classes);//this.cuentacontagastodepreLogic.getCuentaContaGastoDepre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCuentaContaGastoDepre(this.cuentacontagastodepreReturnGeneral,this.cuentacontagastodepreBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCuentaContaGastoDepre(classes,this.cuentacontagastodepreReturnGeneral,this.cuentacontagastodepreBean,false);
					}
						
					if(this.cuentacontagastodepreReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCuentaContaGastoDepre(this.cuentacontagastodepreReturnGeneral.getCuentaContaGastoDepre());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCuentaContaGastoDepre(this.cuentacontagastodepreReturnGeneral.getCuentaContaGastoDepre());	
					}
						
					if(this.cuentacontagastodepreReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCuentaContaGastoDepre(this.cuentacontagastodepreReturnGeneral.getCuentaContaGastoDepre(),classes);//this.cuentacontagastodepreBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCuentaContaGastoDepre(this.cuentacontagastodepre,classes);//this.cuentacontagastodepreBean);									
				}
			
				if(CuentaContaGastoDepreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCuentaContaGastoDepre(this.cuentacontagastodepre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContaGastoDepre(this.cuentacontagastodepre);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cuentacontagastodepreAnterior!=null) {
						this.cuentacontagastodepre=this.cuentacontagastodepreAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentacontagastodepreReturnGeneral=cuentacontagastodepreLogic.procesarEventosCuentaContaGastoDepresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontagastodepreLogic.getCuentaContaGastoDepres(),this.cuentacontagastodepre,this.cuentacontagastodepreParameterGeneral,this.isEsNuevoCuentaContaGastoDepre,classes);//this.cuentacontagastodepreLogic.getCuentaContaGastoDepre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cuentacontagastodepreReturnGeneral.getCuentaContaGastoDepre(),cuentacontagastodepreLogic.getCuentaContaGastoDepres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cuentacontagastodepreReturnGeneral.getCuentaContaGastoDepre(),this.cuentacontagastodepres);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCuentaContaGastoDepre.repaint();
				
				//((AbstractTableModel) this.jTableDatosCuentaContaGastoDepre.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCuentaContaGastoDepre();
			}
		}
	}
	
	public void actualizarVisualTableDatosCuentaContaGastoDepre() throws Exception {
		
		CuentaContaGastoDepreModel cuentacontagastodepreModel=(CuentaContaGastoDepreModel)this.jTableDatosCuentaContaGastoDepre.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacontagastodepreModel.cuentacontagastodepres=this.cuentacontagastodepreLogic.getCuentaContaGastoDepres();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cuentacontagastodepreModel.cuentacontagastodepres=this.cuentacontagastodepres;
		}
		
		
		((CuentaContaGastoDepreModel) this.jTableDatosCuentaContaGastoDepre.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCuentaContaGastoDepre() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcuentacontagastodepreAnterior(),this.cuentacontagastodepreLogic.getCuentaContaGastoDepres());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcuentacontagastodepreAnterior(),this.cuentacontagastodepres);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCuentaContaGastoDepre();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
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
										
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontagastodepre,new Object(),generalEntityParameterGeneral,this.cuentacontagastodepreReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CuentaContaGastoDepreConstantesFunciones.getClassesRelationshipsOfCuentaContaGastoDepre(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CuentaContaGastoDepreConstantesFunciones.getClassesRelationshipsFromStringsOfCuentaContaGastoDepre(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCuentaContaGastoDepre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontagastodepre,new Object(),generalEntityParameterGeneral,this.cuentacontagastodepreReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCuentaContaGastoDepre(CuentaContaGastoDepreBean cuentacontagastodepreBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCuentaContaGastoDepre(ArrayList<Classe> classes,CuentaContaGastoDepreReturnGeneral cuentacontagastodepreReturnGeneral,CuentaContaGastoDepreBean cuentacontagastodepreBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cuentacontagastodepre)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre = new CuentaContaGastoDepreDetalleFormJInternalFrame(jDesktopPane,this.cuentacontagastodepreSessionBean.getConGuardarRelaciones(),this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaContaGastoDepre);
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.setVisible(false);
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.setSelected(false);						
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.cuentacontagastodepreLogic=this.cuentacontagastodepreLogic;
		
		this.cargarCombosFrameForeignKeyCuentaContaGastoDepre("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaContaGastoDepre();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaContaGastoDepre();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCuentaContaGastoDepre("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCuentaContaGastoDepre();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaContaGastoDepre"));
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonModificarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"ModificarCuentaContaGastoDepre"));

		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonModificarToolBarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaContaGastoDepre"));
					
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemModificarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaContaGastoDepre"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonActualizarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"ActualizarCuentaContaGastoDepre"));
		
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonActualizarToolBarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaContaGastoDepre"));
						
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemActualizarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaContaGastoDepre"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonEliminarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"EliminarCuentaContaGastoDepre"));
		
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonEliminarToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaContaGastoDepre"));
								
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemEliminarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaContaGastoDepre"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonCancelarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"CancelarCuentaContaGastoDepre"));
		
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonCancelarToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaContaGastoDepre"));
					
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemCancelarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaContaGastoDepre"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemDetalleCerrarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaContaGastoDepre"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaContaGastoDepre"));
		
		
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaContaGastoDepre"));
		
		
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaContaGastoDepre"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonidCuentaContaGastoDepreBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaContaGastoDepreBusqueda"));
		//jButtonid_cuenta_contableCuentaContaGastoDepre.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCuentaContaGastoDepreActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepre"));
		//jButtonid_cuenta_contableCuentaContaGastoDepreArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepreArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepreArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepreUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate.addActionListener(new ButtonActionListener(this,"id_gasto_depreciacionCuentaContaGastoDepreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda.addActionListener(new ButtonActionListener(this,"id_gasto_depreciacionCuentaContaGastoDepreBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jTabbedPaneRelacionesCuentaContaGastoDepre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaContaGastoDepre"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCuentaContaGastoDepre"));
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaContaGastoDepre"));
		}
		
		this.jTableDatosCuentaContaGastoDepre.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCuentaContaGastoDepre"));
		
		this.jTableDatosCuentaContaGastoDepre.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCuentaContaGastoDepre"));
		
		this.jButtonNuevoCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"NuevoCuentaContaGastoDepre"));
		
		this.jButtonDuplicarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"DuplicarCuentaContaGastoDepre"));
		
		this.jButtonCopiarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"CopiarCuentaContaGastoDepre"));
		
		this.jButtonVerFormCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"VerFormCuentaContaGastoDepre"));
		
		
		this.jButtonNuevoToolBarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"NuevoToolBarCuentaContaGastoDepre"));
			
		this.jButtonDuplicarToolBarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCuentaContaGastoDepre"));
			
		this.jMenuItemNuevoCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCuentaContaGastoDepre"));
			
		this.jMenuItemDuplicarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCuentaContaGastoDepre"));		
		
		
		this.jButtonNuevoRelacionesCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCuentaContaGastoDepre"));
		
		
		this.jButtonNuevoRelacionesToolBarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCuentaContaGastoDepre"));
			
		this.jMenuItemNuevoRelacionesCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCuentaContaGastoDepre"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonModificarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"ModificarCuentaContaGastoDepre"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonModificarToolBarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaContaGastoDepre"));
			
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemModificarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaContaGastoDepre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonActualizarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"ActualizarCuentaContaGastoDepre"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonActualizarToolBarCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaContaGastoDepre"));
				
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemActualizarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaContaGastoDepre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonEliminarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"EliminarCuentaContaGastoDepre"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonEliminarToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaContaGastoDepre"));
						
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemEliminarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaContaGastoDepre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonCancelarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"CancelarCuentaContaGastoDepre"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonCancelarToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaContaGastoDepre"));
			
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemCancelarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaContaGastoDepre"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCuentaContaGastoDepre"));		
		
		
		this.jButtonCerrarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"CerrarCuentaContaGastoDepre"));
		
		
		this.jButtonCerrarToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"CerrarToolBarCuentaContaGastoDepre"));
			
		this.jMenuItemCerrarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCuentaContaGastoDepre"));
			
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jMenuItemDetalleCerrarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaContaGastoDepre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"GuardarCambiosCuentaContaGastoDepre"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaContaGastoDepre"));
		}
		
		this.jButtonCopiarToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"CopiarToolBarCuentaContaGastoDepre"));
			
		this.jButtonVerFormToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"VerFormToolBarCuentaContaGastoDepre"));
		
		this.jMenuItemGuardarCambiosCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCuentaContaGastoDepre"));
			
		this.jMenuItemCopiarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCuentaContaGastoDepre"));		
		
		this.jMenuItemVerFormCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCuentaContaGastoDepre"));		
		
		
		this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaContaGastoDepre"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCuentaContaGastoDepre"));
			
		this.jMenuItemGuardarCambiosTablaCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaContaGastoDepre"));		
		
		
		
		this.jButtonRecargarInformacionCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"RecargarInformacionCuentaContaGastoDepre"));
					
		this.jButtonRecargarInformacionToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCuentaContaGastoDepre"));
		
		this.jMenuItemRecargarInformacionCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCuentaContaGastoDepre"));		
		
		
		
		this.jButtonAnterioresCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"AnterioresCuentaContaGastoDepre"));
		
		
		this.jButtonAnterioresToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCuentaContaGastoDepre"));
		
		this.jMenuItemAnterioresCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCuentaContaGastoDepre"));		
		
		
		this.jButtonSiguientesCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"SiguientesCuentaContaGastoDepre"));
		
		
		this.jButtonSiguientesToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCuentaContaGastoDepre"));
			
		this.jMenuItemSiguientesCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCuentaContaGastoDepre"));
			
		this.jMenuItemAbrirOrderByCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCuentaContaGastoDepre"));
			
		this.jMenuItemMostrarOcultarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCuentaContaGastoDepre"));
			
		this.jMenuItemDetalleAbrirOrderByCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCuentaContaGastoDepre"));
			
		this.jMenuItemDetalleMostarOcultarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCuentaContaGastoDepre"));		
		
		
		this.jButtonNuevoGuardarCambiosCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCuentaContaGastoDepre"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCuentaContaGastoDepre"));
			
		this.jMenuItemNuevoGuardarCambiosCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCuentaContaGastoDepre"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCuentaContaGastoDepre"));

		this.jCheckBoxSeleccionadosCuentaContaGastoDepre.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCuentaContaGastoDepre"));
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaContaGastoDepre"));
		}
		
		
		this.jComboBoxTiposRelacionesCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"TiposRelacionesCuentaContaGastoDepre"));
			
		this.jComboBoxTiposAccionesCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"TiposAccionesCuentaContaGastoDepre"));
					
		this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCuentaContaGastoDepre"));
			
		this.jTextFieldValorCampoGeneralCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCuentaContaGastoDepre"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonidCuentaContaGastoDepreBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaContaGastoDepreBusqueda"));
		//jButtonid_cuenta_contableCuentaContaGastoDepre.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCuentaContaGastoDepreActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepre"));
		//jButtonid_cuenta_contableCuentaContaGastoDepreArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepreArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepreArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepreUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate.addActionListener(new ButtonActionListener(this,"id_gasto_depreciacionCuentaContaGastoDepreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda.addActionListener(new ButtonActionListener(this,"id_gasto_depreciacionCuentaContaGastoDepreBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCuentaContaGastoDepre"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepre"));

			this.jButtonFK_IdGastoDepreciacionCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"FK_IdGastoDepreciacionCuentaContaGastoDepre"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCuentaContaGastoDepre!=null) {
				this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaContaGastoDepre"));
				this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaContaGastoDepre"));
				this.jInternalFrameReporteDinamicoCuentaContaGastoDepre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaContaGastoDepre"));
			}
			
			//this.jButtonCerrarReporteDinamicoCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaContaGastoDepre"));				
			//this.jButtonGenerarReporteDinamicoCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaContaGastoDepre"));
			//this.jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaContaGastoDepre"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCuentaContaGastoDepre!=null) {
				this.jInternalFrameImportacionCuentaContaGastoDepre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaContaGastoDepre"));
				this.jInternalFrameImportacionCuentaContaGastoDepre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaContaGastoDepre"));
				this.jInternalFrameImportacionCuentaContaGastoDepre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaContaGastoDepre"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"AbrirOrderByCuentaContaGastoDepre"));
			
			this.jButtonAbrirOrderByToolBarCuentaContaGastoDepre.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCuentaContaGastoDepre"));			
			
			if(this.jInternalFrameOrderByCuentaContaGastoDepre!=null) {
				this.jInternalFrameOrderByCuentaContaGastoDepre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaContaGastoDepre"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jTabbedPaneRelacionesCuentaContaGastoDepre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaContaGastoDepre"));
		
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
            		closingInternalFrameCuentaContaGastoDepre();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCuentaContaGastoDepre = (JInternalFrameBase)event.getSource();
	            	
	            CuentaContaGastoDepreBeanSwingJInternalFrame jInternalFrameParent=(CuentaContaGastoDepreBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaContaGastoDepre.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCuentaContaGastoDepreActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCuentaContaGastoDepre.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCuentaContaGastoDepreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCuentaContaGastoDepre.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCuentaContaGastoDepre.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCuentaContaGastoDepre";
		inputMap = this.jButtonNuevoCuentaContaGastoDepre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCuentaContaGastoDepre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCuentaContaGastoDepre";
		inputMap = this.jButtonNuevoRelacionesCuentaContaGastoDepre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCuentaContaGastoDepre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaContaGastoDepreActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCuentaContaGastoDepre";
		inputMap = this.jButtonModificarCuentaContaGastoDepre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCuentaContaGastoDepre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCuentaContaGastoDepreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCuentaContaGastoDepre";
		inputMap = this.jButtonActualizarCuentaContaGastoDepre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCuentaContaGastoDepre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCuentaContaGastoDepreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCuentaContaGastoDepre";
		inputMap = this.jButtonEliminarCuentaContaGastoDepre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCuentaContaGastoDepre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCuentaContaGastoDepreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCuentaContaGastoDepre";
		inputMap = this.jButtonCancelarCuentaContaGastoDepre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCuentaContaGastoDepre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCuentaContaGastoDepreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCuentaContaGastoDepre";
		inputMap = this.jButtonCerrarCuentaContaGastoDepre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCuentaContaGastoDepre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCuentaContaGastoDepreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCuentaContaGastoDepre";
		inputMap = this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosCuentaContaGastoDepre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonGuardarCambiosCuentaContaGastoDepre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCuentaContaGastoDepre.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCuentaContaGastoDepreItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCuentaContaGastoDepre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCuentaContaGastoDepreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCuentaContaGastoDepreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCuentaContaGastoDepre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCuentaContaGastoDepreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonidCuentaContaGastoDepreBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaContaGastoDepreBusqueda"));
		//jButtonid_cuenta_contableCuentaContaGastoDepre.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCuentaContaGastoDepreActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepre"));
		//jButtonid_cuenta_contableCuentaContaGastoDepreArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepreArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepreArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepreUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate.addActionListener(new ButtonActionListener(this,"id_gasto_depreciacionCuentaContaGastoDepreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda.addActionListener(new ButtonActionListener(this,"id_gasto_depreciacionCuentaContaGastoDepreBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCuentaContaGastoDepre"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaContaGastoDepre"));

		this.jButtonFK_IdGastoDepreciacionCuentaContaGastoDepre.addActionListener(new ButtonActionListener(this,"FK_IdGastoDepreciacionCuentaContaGastoDepre"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCuentaContaGastoDepre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCuentaContaGastoDepreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCuentaContaGastoDepreActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCuentaContaGastoDepre.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCuentaContaGastoDepre(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
					cuentacontagastodepreAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepres) {
					cuentacontagastodepreAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCuentaContaGastoDepreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
						cuentacontagastodepreAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepres) {
						cuentacontagastodepreAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepres) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaContaGastoDepre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaContaGastoDepre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaGastoDepre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCuentaContaGastoDepreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCuentaContaGastoDepre.getSelectedRows();
			
			CuentaContaGastoDepre cuentacontagastodepreLocal=new CuentaContaGastoDepre();
			
			//this.seleccionarTodosCuentaContaGastoDepre(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontagastodepreLocal =(CuentaContaGastoDepre) this.cuentacontagastodepreLogic.getCuentaContaGastoDepres().toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cuentacontagastodepreLocal =(CuentaContaGastoDepre) this.cuentacontagastodepres.toArray()[this.jTableDatosCuentaContaGastoDepre.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cuentacontagastodepreLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
						cuentacontagastodepreAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepres) {
						cuentacontagastodepreAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaContaGastoDepre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaContaGastoDepre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaContaGastoDepre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCuentaContaGastoDepreItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCuentaContaGastoDepreParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCuentaContaGastoDepreActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCuentaContaGastoDepre.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepres) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCuentaContaGastoDepreActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCuentaContaGastoDepre=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCuentaContaGastoDepre.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCuentaContaGastoDepre) {				
					conSplash=true;//false;										
					
					//this.startProcessCuentaContaGastoDepre(conSplash);
				
					this.generarReporteCuentaContaGastoDepresSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContaGastoDepre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCuentaContaGastoDepresSeleccionados();
				//this.jComboBoxTiposAccionesCuentaContaGastoDepre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaContaGastoDepresSeleccionados(false);
				//this.jComboBoxTiposAccionesCuentaContaGastoDepre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaContaGastoDepresSeleccionados(true);
				//this.jComboBoxTiposAccionesCuentaContaGastoDepre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaContaGastoDepre();
				
				this.exportarCuentaContaGastoDepresSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContaGastoDepre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCuentaContaGastoDepres();
				//this.importarCuentaContaGastoDepres();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContaGastoDepre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaContaGastoDepre();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCuentaContaGastoDepresSeleccionados();
				//this.jComboBoxTiposAccionesCuentaContaGastoDepre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cuenta Conta Gasto Depre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCuentaContaGastoDepre();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCuentaContaGastoDepre)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCuentaContaGastoDepre(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Conta Gasto Depre",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContaGastoDepre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setSelectedIndex(0);					
				}	
			} 			
			else if(CuentaContaGastoDepreBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCuentaContaGastoDepre) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCuentaContaGastoDepre(conSplash);
					
						//this.actualizarParametrosGeneralCuentaContaGastoDepre();
						
						this.generarReporteProcesoAccionCuentaContaGastoDepresSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCuentaContaGastoDepre.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cuenta Conta Gasto DepreS SELECCIONADOS?", "MANTENIMIENTO DE Cuenta Conta Gasto Depre", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCuentaContaGastoDepre();
				
						this.actualizarParametrosGeneralCuentaContaGastoDepre();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cuentacontagastodepreReturnGeneral=cuentacontagastodepreLogic.procesarAccionCuentaContaGastoDepresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cuentacontagastodepreLogic.getCuentaContaGastoDepres(),this.cuentacontagastodepreParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCuentaContaGastoDepreReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaContaGastoDepre.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCuentaContaGastoDepre();
					
					CuentaContaGastoDepreBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCuentaContaGastoDepreReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaContaGastoDepre.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCuentaContaGastoDepre(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCuentaContaGastoDepreActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCuentaContaGastoDepre();
			
			if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();		
			CuentaContaGastoDepre cuentacontagastodepre=new CuentaContaGastoDepre();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCuentaContaGastoDepre(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCuentaContaGastoDepre.getSelectedItem();
			
			
			
			
			cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(true);
			//this.sTipoAccion;
			
			if(cuentacontagastodepresSeleccionados.size()==1) {
				for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepresSeleccionados) {
					cuentacontagastodepre=cuentacontagastodepreAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCuentaContaGastoDepre();
			
      		//this.finishProcessCuentaContaGastoDepre(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCuentaContaGastoDepreReturnGeneral() throws Exception {
		if(this.cuentacontagastodepreReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cuentacontagastodepreReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cuentacontagastodepreReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cuentacontagastodepreReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cuentacontagastodepreReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cuentacontagastodepreReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCuentaContaGastoDepre(false);
		}
		
		if(this.cuentacontagastodepreReturnGeneral.getConRetornoLista() || this.cuentacontagastodepreReturnGeneral.getConRetornoObjeto()) {
			if(this.cuentacontagastodepreReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentacontagastodepreLogic.setCuentaContaGastoDepres(this.cuentacontagastodepreReturnGeneral.getCuentaContaGastoDepres());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cuentacontagastodepreReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentacontagastodepreLogic.setCuentaContaGastoDepre(this.cuentacontagastodepreReturnGeneral.getCuentaContaGastoDepre());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCuentaContaGastoDepre(false);
		}
	}
	
	public void actualizarParametrosGeneralCuentaContaGastoDepre() throws Exception {
		
		
	}
	
	public ArrayList<CuentaContaGastoDepre> getCuentaContaGastoDepresSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCuentaContaGastoDepre) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepreLogic.getCuentaContaGastoDepres()) {
					if(cuentacontagastodepreAux.getIsSelected()) {
						cuentacontagastodepresSeleccionados.add(cuentacontagastodepreAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContaGastoDepre cuentacontagastodepreAux:this.cuentacontagastodepres) {
					if(cuentacontagastodepreAux.getIsSelected()) {
						cuentacontagastodepresSeleccionados.add(cuentacontagastodepreAux);				
					}
				}
			}
			
			if(cuentacontagastodepresSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cuentacontagastodepresSeleccionados.addAll(this.cuentacontagastodepreLogic.getCuentaContaGastoDepres());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cuentacontagastodepresSeleccionados.addAll(this.cuentacontagastodepres);				
					}
				}
			}
		} else {
			cuentacontagastodepresSeleccionados.add(this.cuentacontagastodepre);
		}
		
		return cuentacontagastodepresSeleccionados;
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
	
	public void generarReporteCuentaContaGastoDepresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCuentaContaGastoDepresSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCuentaContaGastoDepresSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaContaGastoDepresSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaContaGastoDepresSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cuenta Conta Gasto Depre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCuentaContaGastoDepresSeleccionados() throws Exception {
		ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();		
		
		cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCuentaContaGastoDepres("Todos",cuentacontagastodepresSeleccionados);
		
	}	
	
	public void generarReporteNormalCuentaContaGastoDepresSeleccionados() throws Exception {
		ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();		
		
		cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCuentaContaGastoDepres("Todos",cuentacontagastodepresSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCuentaContaGastoDepresSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();
		
		cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCuentaContaGastoDepres("Todos",cuentacontagastodepresSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCuentaContaGastoDepresSeleccionados() throws Exception {
		ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCuentaContaGastoDepre();
		
		
		cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCuentaContaGastoDepre();
		
		
		//this.generarReporteCuentaContaGastoDepres("Todos",cuentacontagastodepresSeleccionados ,cuentacontagastodepreImplementable,cuentacontagastodepreImplementableHome);
	}
	
	public void mostrarImportacionCuentaContaGastoDepres() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCuentaContaGastoDepre();
		
		this.abrirFrameImportacionCuentaContaGastoDepre();		
		
			
		//this.generarReporteCuentaContaGastoDepres("Todos",cuentacontagastodepresSeleccionados ,cuentacontagastodepreImplementable,cuentacontagastodepreImplementableHome);
	}
	
	public void importarCuentaContaGastoDepres() throws Exception {		
	
	}
	
	public void exportarCuentaContaGastoDepresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCuentaContaGastoDepresSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCuentaContaGastoDepresSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCuentaContaGastoDepresSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cuenta Conta Gasto Depre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCuentaContaGastoDepresSeleccionados() throws Exception {
		ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();		
		
		cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontagastodepre."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCuentaContaGastoDepre(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepresSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCuentaContaGastoDepre(cuentacontagastodepreAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cuentacontagastodepreAux.setsDetalleGeneralEntityReporte(cuentacontagastodepreAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Gasto Depre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCuentaContaGastoDepre(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CuentaContaGastoDepreConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContaGastoDepreConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cuentacontagastodepre.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontagastodepre.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontagastodepre.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontagastodepre.getgastodepreciacion_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCuentaContaGastoDepresSeleccionados() throws Exception {
		ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();		
		
		cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontagastodepre.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CuentaContaGastoDepres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCuentaContaGastoDepre(row);				
				iRow++;
			}				
			
			for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepresSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCuentaContaGastoDepre(cuentacontagastodepreAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Gasto Depre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCuentaContaGastoDepresSeleccionados() throws Exception {
		ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();		
		
		cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontagastodepre.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cuentacontagastodepres");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cuentacontagastodepre");
			//elementRoot.appendChild(element);
		
			for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepresSeleccionados) {
				element = document.createElement("cuentacontagastodepre");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCuentaContaGastoDepre(cuentacontagastodepreAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Conta Gasto Depre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCuentaContaGastoDepre(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContaGastoDepreConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContaGastoDepreConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontagastodepre.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontagastodepre.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontagastodepre.getgastodepreciacion_descripcion());				
	}
	
	public void setFilaDatosExportarXmlCuentaContaGastoDepre(CuentaContaGastoDepre cuentacontagastodepre,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CuentaContaGastoDepreConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cuentacontagastodepre.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CuentaContaGastoDepreConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cuentacontagastodepre.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcuentacontable_descripcion = document.createElement(CuentaContaGastoDepreConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(cuentacontagastodepre.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementgastodepreciacion_descripcion = document.createElement(CuentaContaGastoDepreConstantesFunciones.IDGASTODEPRECIACION);
		elementgastodepreciacion_descripcion.appendChild(document.createTextNode(cuentacontagastodepre.getgastodepreciacion_descripcion()));
		element.appendChild(elementgastodepreciacion_descripcion);
	}
	
	public void generarReporteGroupGenericoCuentaContaGastoDepresSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados=new ArrayList<CuentaContaGastoDepre>();
		
		cuentacontagastodepresSeleccionados=this.getCuentaContaGastoDepresSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCuentaContaGastoDepre(cuentacontagastodepresSeleccionados);
		
		this.generarReporteCuentaContaGastoDepres("Todos",cuentacontagastodepresSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCuentaContaGastoDepre(ArrayList<CuentaContaGastoDepre> cuentacontagastodepresSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CuentaContaGastoDepre cuentacontagastodepreAux:cuentacontagastodepresSeleccionados) {
				cuentacontagastodepreAux.setsDetalleGeneralEntityReporte(cuentacontagastodepreAux.toString());
			
				if(sTipoSeleccionar.equals(CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					cuentacontagastodepreAux.setsDescripcionGeneralEntityReporte1(cuentacontagastodepreAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION)) {
					existe=true;
					cuentacontagastodepreAux.setsDescripcionGeneralEntityReporte1(cuentacontagastodepreAux.getgastodepreciacion_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContaGastoDepreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCuentaContaGastoDepre(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=true;
				this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=true;
				this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=true;
			}
			
			this.isVisibilidadCeldaModificarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaCancelarCuentaContaGastoDepre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaModificarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaCancelarCuentaContaGastoDepre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaModificarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaCancelarCuentaContaGastoDepre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaModificarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaCancelarCuentaContaGastoDepre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaModificarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaCancelarCuentaContaGastoDepre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaCancelarCuentaContaGastoDepre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaModificarCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaCancelarCuentaContaGastoDepre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContaGastoDepre=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CuentaContaGastoDepreJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=true;
		} else {
			this.actualizarEstadoPanelsCuentaContaGastoDepre(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCuentaContaGastoDepre=false;
			//this.isVisibilidadCeldaVerFormCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaDuplicarCuentaContaGastoDepre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=false;
		} else {
			this.isVisibilidadCeldaNuevoCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContaGastoDepre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
			if(!cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=false;												
			}
			
			this.jButtonCerrarCuentaContaGastoDepre.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaContaGastoDepre=false;
		}
		
		if(!this.permiteMantenimiento(this.cuentacontagastodepre)) {
			this.isVisibilidadCeldaActualizarCuentaContaGastoDepre=false;
			this.isVisibilidadCeldaEliminarCuentaContaGastoDepre=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaContaGastoDepre() {
	}
	
	public void actualizarEstadoPanelsCuentaContaGastoDepre(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaGastoDepre!=null) {
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosCuentaContaGastoDepre.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContaGastoDepre!=null) {
				this.jPanelPaginacionCuentaContaGastoDepre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContaGastoDepre!=null) {
				this.jPanelParametrosReportesCuentaContaGastoDepre.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaGastoDepre!=null) {
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosCuentaContaGastoDepre.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaContaGastoDepre!=null) {
				this.jPanelPaginacionCuentaContaGastoDepre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaContaGastoDepre!=null) {
				this.jPanelParametrosReportesCuentaContaGastoDepre.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaGastoDepre!=null) {
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosCuentaContaGastoDepre.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaContaGastoDepre!=null) {
				this.jPanelPaginacionCuentaContaGastoDepre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaContaGastoDepre!=null) {
				this.jPanelParametrosReportesCuentaContaGastoDepre.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaGastoDepre!=null) {
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosCuentaContaGastoDepre.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaContaGastoDepre!=null) {
				this.jPanelPaginacionCuentaContaGastoDepre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaContaGastoDepre!=null) {
				this.jPanelParametrosReportesCuentaContaGastoDepre.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaGastoDepre!=null) {
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosCuentaContaGastoDepre.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContaGastoDepre!=null) {
				this.jPanelPaginacionCuentaContaGastoDepre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContaGastoDepre!=null) {
				this.jPanelParametrosReportesCuentaContaGastoDepre.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaGastoDepre!=null) {
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosCuentaContaGastoDepre.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContaGastoDepre!=null) {
				this.jPanelPaginacionCuentaContaGastoDepre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContaGastoDepre!=null) {
				this.jPanelParametrosReportesCuentaContaGastoDepre.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaGastoDepre!=null) {
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContaGastoDepre!=null) {
				this.jScrollPanelDatosCuentaContaGastoDepre.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContaGastoDepre!=null) {
				this.jPanelPaginacionCuentaContaGastoDepre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContaGastoDepre!=null) {
				this.jPanelParametrosReportesCuentaContaGastoDepre.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCuentaContaGastoDepre!=null) {
					this.jTabbedPaneBusquedasCuentaContaGastoDepre.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCuentaContaGastoDepre!=null) {
				this.jPanelParametrosReportesCuentaContaGastoDepre.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContaGastoDepre!=null) {
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCuentaContaGastoDepre!=null) {
				this.jPanelParametrosReportesCuentaContaGastoDepre.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaContaGastoDepre.remove(jPanelFK_IdCuentaContableCuentaContaGastoDepre);}

			this.isVisibilidadFK_IdGastoDepreciacion=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdGastoDepreciacion) {this.jTabbedPaneBusquedasCuentaContaGastoDepre.remove(jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre);}
		}
		
	}

	public void setVisibilidadBusquedasParaGastoDepreciacion(Boolean isParaGastoDepreciacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGastoDepreciacionNegation=!isParaGastoDepreciacion;

			this.isVisibilidadFK_IdCuentaContable=isParaGastoDepreciacionNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaContaGastoDepre.remove(jPanelFK_IdCuentaContableCuentaContaGastoDepre);}

			this.isVisibilidadFK_IdGastoDepreciacion=isParaGastoDepreciacion;
			if(!this.isVisibilidadFK_IdGastoDepreciacion) {this.jTabbedPaneBusquedasCuentaContaGastoDepre.remove(jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre);}
		}
		
	}
	
	
	
	

	public String registrarSesionCuentaContaGastoDepreParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(cuentacontagastodepreSessionBean==null) {
				cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(cuentacontagastodepreSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.cuentacontagastodepreFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(CuentaContaGastoDepreConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionCuentaContaGastoDepre(true);
			//cuentacontableSessionBean.setlidCuentaContaGastoDepreActual(this.idCuentaContaGastoDepreActual);

			cuentacontagastodepreSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContaGastoDepre(true);
			cuentacontagastodepreSessionBean.setlIdCuentaContaGastoDepreActualForeignKey(this.idCuentaContaGastoDepreActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CuentaContaGastoDepreSessionBean cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
		
		if(this.cuentacontagastodepreSessionBean==null) {
			this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
		}
		
		this.cuentacontagastodepreSessionBean.setsUltimaBusquedaCuentaContaGastoDepre(this.getsAccionBusqueda());
		this.cuentacontagastodepreSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cuentacontagastodepreSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			cuentacontagastodepreSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdGastoDepreciacion")) {
			cuentacontagastodepreSessionBean.setid_gasto_depreciacion(this.getid_gasto_depreciacionFK_IdGastoDepreciacion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CuentaContaGastoDepreSessionBean cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
		
		if(this.cuentacontagastodepreSessionBean==null) {
			this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
		}
		
		if(this.cuentacontagastodepreSessionBean.getsUltimaBusquedaCuentaContaGastoDepre()!=null&&!this.cuentacontagastodepreSessionBean.getsUltimaBusquedaCuentaContaGastoDepre().equals("")) {
			this.setsAccionBusqueda(cuentacontagastodepreSessionBean.getsUltimaBusquedaCuentaContaGastoDepre());
			this.setiNumeroPaginacion(cuentacontagastodepreSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cuentacontagastodepreSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(cuentacontagastodepreSessionBean.getid_cuenta_contable());
				cuentacontagastodepreSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdGastoDepreciacion")) {
				this.setid_gasto_depreciacionFK_IdGastoDepreciacion(cuentacontagastodepreSessionBean.getid_gasto_depreciacion());
				cuentacontagastodepreSessionBean.setid_gasto_depreciacion(-1L);
			}
		}
		
		this.cuentacontagastodepreSessionBean.setsUltimaBusquedaCuentaContaGastoDepre("");
		this.cuentacontagastodepreSessionBean.setiNumeroPaginacion(CuentaContaGastoDepreConstantesFunciones.INUMEROPAGINACION);
		this.cuentacontagastodepreSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCuentaContaGastoDepre() {
		this.updateBorderResaltarBusquedasFormularioCuentaContaGastoDepre();
		this.updateVisibilidadBusquedasFormularioCuentaContaGastoDepre();
		this.updateHabilitarBusquedasFormularioCuentaContaGastoDepre();
	}
	
	public void updateBorderResaltarBusquedasFormularioCuentaContaGastoDepre() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCuentaContaGastoDepre.getComponents().length>0) {
	

		if(this.cuentacontagastodepreConstantesFunciones.resaltarFK_IdCuentaContableCuentaContaGastoDepre!=null) {
			index= this.jTabbedPaneBusquedasCuentaContaGastoDepre.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaContaGastoDepre);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaGastoDepre.getComponent(index);
				jPanel.setBorder(this.cuentacontagastodepreConstantesFunciones.resaltarFK_IdCuentaContableCuentaContaGastoDepre);
			}
		}

		if(this.cuentacontagastodepreConstantesFunciones.resaltarFK_IdGastoDepreciacionCuentaContaGastoDepre!=null) {
			index= this.jTabbedPaneBusquedasCuentaContaGastoDepre.indexOfComponent(this.jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaGastoDepre.getComponent(index);
				jPanel.setBorder(this.cuentacontagastodepreConstantesFunciones.resaltarFK_IdGastoDepreciacionCuentaContaGastoDepre);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCuentaContaGastoDepre() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCuentaContaGastoDepre.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaContaGastoDepre.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaContaGastoDepre);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaGastoDepre.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentacontagastodepreConstantesFunciones.mostrarFK_IdCuentaContableCuentaContaGastoDepre);
			if(!this.cuentacontagastodepreConstantesFunciones.mostrarFK_IdCuentaContableCuentaContaGastoDepre && index>-1) {
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuentaContaGastoDepre.indexOfComponent(this.jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaGastoDepre.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentacontagastodepreConstantesFunciones.mostrarFK_IdGastoDepreciacionCuentaContaGastoDepre);
			if(!this.cuentacontagastodepreConstantesFunciones.mostrarFK_IdGastoDepreciacionCuentaContaGastoDepre && index>-1) {
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCuentaContaGastoDepre() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCuentaContaGastoDepre.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaContaGastoDepre.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaContaGastoDepre);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaGastoDepre.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentacontagastodepreConstantesFunciones.activarFK_IdCuentaContableCuentaContaGastoDepre);
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.setEnabledAt(index,this.cuentacontagastodepreConstantesFunciones.activarFK_IdCuentaContableCuentaContaGastoDepre);
			}

			index= this.jTabbedPaneBusquedasCuentaContaGastoDepre.indexOfComponent(this.jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaGastoDepre.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentacontagastodepreConstantesFunciones.activarFK_IdGastoDepreciacionCuentaContaGastoDepre);
				this.jTabbedPaneBusquedasCuentaContaGastoDepre.setEnabledAt(index,this.cuentacontagastodepreConstantesFunciones.activarFK_IdGastoDepreciacionCuentaContaGastoDepre);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCuentaContaGastoDepre(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasCuentaContaGastoDepre.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaContaGastoDepre);

			this.jTabbedPaneBusquedasCuentaContaGastoDepre.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaGastoDepre.getComponent(index);

			this.cuentacontagastodepreConstantesFunciones.setResaltarFK_IdCuentaContableCuentaContaGastoDepre(resaltar);

			jPanel.setBorder(this.cuentacontagastodepreConstantesFunciones.resaltarFK_IdCuentaContableCuentaContaGastoDepre);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdGastoDepreciacion")) {
			index= this.jTabbedPaneBusquedasCuentaContaGastoDepre.indexOfComponent(this.jPanelFK_IdGastoDepreciacionCuentaContaGastoDepre);

			this.jTabbedPaneBusquedasCuentaContaGastoDepre.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContaGastoDepre.getComponent(index);

			this.cuentacontagastodepreConstantesFunciones.setResaltarFK_IdGastoDepreciacionCuentaContaGastoDepre(resaltar);

			jPanel.setBorder(this.cuentacontagastodepreConstantesFunciones.resaltarFK_IdGastoDepreciacionCuentaContaGastoDepre);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCuentaContaGastoDepre.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCuentaContaGastoDepre() throws Exception {

		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCuentaContaGastoDepre();
		this.updateVisibilidadResaltarControlesFormularioCuentaContaGastoDepre();
		this.updateHabilitarResaltarControlesFormularioCuentaContaGastoDepre();
		
	}
	
	public void updateBorderResaltarControlesFormularioCuentaContaGastoDepre() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cuentacontagastodepreConstantesFunciones.resaltaridCuentaContaGastoDepre!=null && this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelidCuentaContaGastoDepre.setBorder(this.cuentacontagastodepreConstantesFunciones.resaltaridCuentaContaGastoDepre);}
		if(this.cuentacontagastodepreConstantesFunciones.resaltarid_cuenta_contableCuentaContaGastoDepre!=null && this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.setBorder(this.cuentacontagastodepreConstantesFunciones.resaltarid_cuenta_contableCuentaContaGastoDepre);}
		if(this.cuentacontagastodepreConstantesFunciones.resaltarid_gasto_depreciacionCuentaContaGastoDepre!=null && this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setBorder(this.cuentacontagastodepreConstantesFunciones.resaltarid_gasto_depreciacionCuentaContaGastoDepre);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCuentaContaGastoDepre() throws Exception {		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
	
		//this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelidCuentaContaGastoDepre.setVisible(this.cuentacontagastodepreConstantesFunciones.mostraridCuentaContaGastoDepre);
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jPanelidCuentaContaGastoDepre.setVisible(this.cuentacontagastodepreConstantesFunciones.mostraridCuentaContaGastoDepre);
		//this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.setVisible(this.cuentacontagastodepreConstantesFunciones.mostrarid_cuenta_contableCuentaContaGastoDepre);
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jPanelid_cuenta_contableCuentaContaGastoDepre.setVisible(this.cuentacontagastodepreConstantesFunciones.mostrarid_cuenta_contableCuentaContaGastoDepre);
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepre.setVisible(this.cuentacontagastodepreConstantesFunciones.mostrarid_cuenta_contableCuentaContaGastoDepre);
		//this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setVisible(this.cuentacontagastodepreConstantesFunciones.mostrarid_gasto_depreciacionCuentaContaGastoDepre);
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jPanelid_gasto_depreciacionCuentaContaGastoDepre.setVisible(this.cuentacontagastodepreConstantesFunciones.mostrarid_gasto_depreciacionCuentaContaGastoDepre);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCuentaContaGastoDepre() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaContaGastoDepre!=null) {
	
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jLabelidCuentaContaGastoDepre.setEnabled(this.cuentacontagastodepreConstantesFunciones.activaridCuentaContaGastoDepre);
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_cuenta_contableCuentaContaGastoDepre.setEnabled(this.cuentacontagastodepreConstantesFunciones.activarid_cuenta_contableCuentaContaGastoDepre);
			this.jInternalFrameDetalleFormCuentaContaGastoDepre.jButtonid_cuenta_contableCuentaContaGastoDepre.setEnabled(this.cuentacontagastodepreConstantesFunciones.activarid_cuenta_contableCuentaContaGastoDepre);
		this.jInternalFrameDetalleFormCuentaContaGastoDepre.jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setEnabled(this.cuentacontagastodepreConstantesFunciones.activarid_gasto_depreciacionCuentaContaGastoDepre);
		}
	}
	
		
}