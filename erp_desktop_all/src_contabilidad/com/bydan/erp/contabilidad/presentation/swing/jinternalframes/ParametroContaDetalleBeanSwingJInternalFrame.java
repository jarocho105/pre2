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

import com.bydan.erp.contabilidad.util.ParametroContaDetalleConstantesFunciones;
import com.bydan.erp.contabilidad.util.ParametroContaDetalleParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.ParametroContaDetalleParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.ParametroContaDetalleBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class ParametroContaDetalleBeanSwingJInternalFrame extends ParametroContaDetalleJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroContaDetalleBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroContaDetalle> parametrocontadetalleValidator = new ClassValidator<ParametroContaDetalle>(ParametroContaDetalle.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroContaDetalle parametrocontadetalle;	
	public ParametroContaDetalle parametrocontadetalleAux;
	public ParametroContaDetalle parametrocontadetalleAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroContaDetalle parametrocontadetalleTotales;
	public Long idParametroContaDetalleActual;
	public Long iIdNuevoParametroContaDetalle=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboParametroConta="";

	public List<ParametroConta> parametrocontasForeignKey;

	public List<ParametroConta> getparametrocontasForeignKey() {
		return parametrocontasForeignKey;
	}

	public void setparametrocontasForeignKey(List<ParametroConta> parametrocontasForeignKey) {
		this.parametrocontasForeignKey = parametrocontasForeignKey;
	}

	//OBJETO FK ACTUAL
	public ParametroConta parametrocontaForeignKey;

	public ParametroConta getparametrocontaForeignKey() {
		return parametrocontaForeignKey;
	}

	public void setparametrocontaForeignKey(ParametroConta parametrocontaForeignKey) {
		this.parametrocontaForeignKey = parametrocontaForeignKey;
	}

	public String sFinalQueryComboTipoParametroConta="";

	public List<TipoParametroConta> tipoparametrocontasForeignKey;

	public List<TipoParametroConta> gettipoparametrocontasForeignKey() {
		return tipoparametrocontasForeignKey;
	}

	public void settipoparametrocontasForeignKey(List<TipoParametroConta> tipoparametrocontasForeignKey) {
		this.tipoparametrocontasForeignKey = tipoparametrocontasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoParametroConta tipoparametrocontaForeignKey;

	public TipoParametroConta gettipoparametrocontaForeignKey() {
		return tipoparametrocontaForeignKey;
	}

	public void settipoparametrocontaForeignKey(TipoParametroConta tipoparametrocontaForeignKey) {
		this.tipoparametrocontaForeignKey = tipoparametrocontaForeignKey;
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
	
	public Boolean isPermisoTodoParametroContaDetalle;
	public Boolean isPermisoNuevoParametroContaDetalle;
	public Boolean isPermisoActualizarParametroContaDetalle;
	public Boolean isPermisoActualizarOriginalParametroContaDetalle;
	public Boolean isPermisoEliminarParametroContaDetalle;
	public Boolean isPermisoGuardarCambiosParametroContaDetalle;
	public Boolean isPermisoConsultaParametroContaDetalle;
	public Boolean isPermisoBusquedaParametroContaDetalle;
	public Boolean isPermisoReporteParametroContaDetalle;
	public Boolean isPermisoPaginacionMedioParametroContaDetalle;
	public Boolean isPermisoPaginacionAltoParametroContaDetalle;
	public Boolean isPermisoPaginacionTodoParametroContaDetalle;
	public Boolean isPermisoCopiarParametroContaDetalle;
	public Boolean isPermisoVerFormParametroContaDetalle;
	public Boolean isPermisoDuplicarParametroContaDetalle;
	public Boolean isPermisoOrdenParametroContaDetalle;
	
	
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
	
	public ParametroContaDetalleParameterReturnGeneral parametrocontadetalleReturnGeneral;
	public ParametroContaDetalleParameterReturnGeneral parametrocontadetalleParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroContaDetalle=false;
	public Boolean esParaAccionDesdeFormularioParametroContaDetalle=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroContaDetalleSessionBeanAdditional parametrocontadetalleSessionBeanAdditional=null;
	
	public ParametroContaDetalleSessionBeanAdditional getParametroContaDetalleSessionBeanAdditional() {
		return this.parametrocontadetalleSessionBeanAdditional;
	}
	
	public void setParametroContaDetalleSessionBeanAdditional(ParametroContaDetalleSessionBeanAdditional parametrocontadetalleSessionBeanAdditional) {
		try {
			this.parametrocontadetalleSessionBeanAdditional=parametrocontadetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroContaDetalleBeanSwingJInternalFrameAdditional parametrocontadetalleBeanSwingJInternalFrameAdditional=null;
	//public class ParametroContaDetalleBeanSwingJInternalFrame
	
	public ParametroContaDetalleBeanSwingJInternalFrameAdditional getParametroContaDetalleBeanSwingJInternalFrameAdditional() {
		return this.parametrocontadetalleBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroContaDetalleBeanSwingJInternalFrameAdditional(ParametroContaDetalleBeanSwingJInternalFrameAdditional parametrocontadetalleBeanSwingJInternalFrameAdditional) {
		try {
			this.parametrocontadetalleBeanSwingJInternalFrameAdditional=parametrocontadetalleBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroContaDetalleLogic parametrocontadetalleLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroContaDetalle parametrocontadetalleBean;
	public ParametroContaDetalleConstantesFunciones parametrocontadetalleConstantesFunciones;
	//public ParametroContaDetalleParameterReturnGeneral parametrocontadetalleReturnGeneral;
	
	//FK
	
	public ParametroContaLogic parametrocontaLogic;
	public TipoParametroContaLogic tipoparametrocontaLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroContaDetalle> parametrocontadetalles;	
	//public List<ParametroContaDetalle> parametrocontadetallesEliminados;
	//public List<ParametroContaDetalle> parametrocontadetallesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroContaDetalle=false;
	public Boolean isVisibilidadCeldaDuplicarParametroContaDetalle=true;
	public Boolean isVisibilidadCeldaCopiarParametroContaDetalle=true;
	public Boolean isVisibilidadCeldaVerFormParametroContaDetalle=true;
	public Boolean isVisibilidadCeldaOrdenParametroContaDetalle=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=false;
	public Boolean isVisibilidadCeldaModificarParametroContaDetalle=false;
	public Boolean isVisibilidadCeldaActualizarParametroContaDetalle=false;
	public Boolean isVisibilidadCeldaEliminarParametroContaDetalle=false;
	public Boolean isVisibilidadCeldaCancelarParametroContaDetalle=false;
	public Boolean isVisibilidadCeldaGuardarParametroContaDetalle=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroContaDetalle=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdParametroConta=false;
	public Boolean isVisibilidadFK_IdParametroContaDetalle=false;
	
	public Long getiIdNuevoParametroContaDetalle() {
		return this.iIdNuevoParametroContaDetalle;
	}

	public void setiIdNuevoParametroContaDetalle(Long iIdNuevoParametroContaDetalle) {
		this.iIdNuevoParametroContaDetalle = iIdNuevoParametroContaDetalle;
	}
	
	public Long getidParametroContaDetalleActual() {
		return this.idParametroContaDetalleActual;
	}

	public void setidParametroContaDetalleActual(Long idParametroContaDetalleActual) {
		this.idParametroContaDetalleActual = idParametroContaDetalleActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroContaDetalle getparametrocontadetalle() {
		return this.parametrocontadetalle;
	}

	public void setparametrocontadetalle(ParametroContaDetalle parametrocontadetalle) {
		this.parametrocontadetalle = parametrocontadetalle;
	}
	
	public ParametroContaDetalle getparametrocontadetalleAux() {
		return this.parametrocontadetalleAux;
	}

	public void setparametrocontadetalleAux(ParametroContaDetalle parametrocontadetalleAux) {
		this.parametrocontadetalleAux = parametrocontadetalleAux;
	}				
	
	public ParametroContaDetalle getparametrocontadetalleAnterior() {
		return this.parametrocontadetalleAnterior;
	}

	public void setparametrocontadetalleAnterior(ParametroContaDetalle parametrocontadetalleAnterior) {
		this.parametrocontadetalleAnterior = parametrocontadetalleAnterior;
	}	
	
	public ParametroContaDetalle getparametrocontadetalleTotales() {
		return this.parametrocontadetalleTotales;
	}

	public void setparametrocontadetalleTotales(ParametroContaDetalle parametrocontadetalleTotales) {
		this.parametrocontadetalleTotales = parametrocontadetalleTotales;
	}	
	
	public ParametroContaDetalle getparametrocontadetalleBean() {
		return this.parametrocontadetalleBean;
	}

	public void setparametrocontadetalleBean(ParametroContaDetalle parametrocontadetalleBean) {
		this.parametrocontadetalleBean = parametrocontadetalleBean;
	}	
	
	public ParametroContaDetalleParameterReturnGeneral getparametrocontadetalleReturnGeneral() {
		return this.parametrocontadetalleReturnGeneral;
	}

	public void setparametrocontadetalleReturnGeneral(ParametroContaDetalleParameterReturnGeneral parametrocontadetalleReturnGeneral) {
		this.parametrocontadetalleReturnGeneral = parametrocontadetalleReturnGeneral;
	}	
	
	
	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_parametro_contaFK_IdParametroConta=-1L;

	public Long getid_parametro_contaFK_IdParametroConta() {
		return this.id_parametro_contaFK_IdParametroConta;
	}

	public void setid_parametro_contaFK_IdParametroConta(Long id_parametro_contaFK_IdParametroConta) {
		this.id_parametro_contaFK_IdParametroConta = id_parametro_contaFK_IdParametroConta;
	}

	public Long id_tipo_parametro_contaFK_IdParametroContaDetalle=-1L;

	public Long getid_tipo_parametro_contaFK_IdParametroContaDetalle() {
		return this.id_tipo_parametro_contaFK_IdParametroContaDetalle;
	}

	public void setid_tipo_parametro_contaFK_IdParametroContaDetalle(Long id_tipo_parametro_contaFK_IdParametroContaDetalle) {
		this.id_tipo_parametro_contaFK_IdParametroContaDetalle = id_tipo_parametro_contaFK_IdParametroContaDetalle;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroContaDetalleLogic getParametroContaDetalleLogic()	{		
		return parametrocontadetalleLogic;
	}

	public void setParametroContaDetalleLogic(ParametroContaDetalleLogic parametrocontadetalleLogic) {
		this.parametrocontadetalleLogic = parametrocontadetalleLogic;
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
	
	public Boolean getIsEsNuevoParametroContaDetalle() {
		return isEsNuevoParametroContaDetalle;
	}

	public void setIsEsNuevoParametroContaDetalle(Boolean isEsNuevoParametroContaDetalle) {
		this.isEsNuevoParametroContaDetalle = isEsNuevoParametroContaDetalle;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroContaDetalle() {
		return esParaAccionDesdeFormularioParametroContaDetalle;
	}
	
	public void setEsParaAccionDesdeFormularioParametroContaDetalle(Boolean esParaAccionDesdeFormularioParametroContaDetalle) {
		this.esParaAccionDesdeFormularioParametroContaDetalle = esParaAccionDesdeFormularioParametroContaDetalle;
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
	
	
	public void cargarCombosParametroContasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.parametrocontasForeignKey=new ArrayList<ParametroConta>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ParametroContaLogic parametrocontaLogic=new ParametroContaLogic();

			parametrocontaLogic.getParametroContaDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocontadetalleSessionBean==null) {
				this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
			}

			if(!this.parametrocontadetalleSessionBean.getisBusquedaDesdeForeignKeySesionParametroConta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontaLogic.getParametroContaDataAccess().setIsForForeingKeyData(true);

					parametrocontaLogic.getTodosParametroContasWithConnection(sFinalQuery,new Pagination());

					this.parametrocontasForeignKey=parametrocontaLogic.getParametroContas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaParametroConta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontaLogic.getEntityWithConnection(parametrocontadetalleSessionBean.getlidParametroContaActual());
					this.parametrocontasForeignKey.add(parametrocontaLogic.getParametroConta());
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

	public void cargarCombosTipoParametroContasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoparametrocontasForeignKey=new ArrayList<TipoParametroConta>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoParametroContaLogic tipoparametrocontaLogic=new TipoParametroContaLogic();

			tipoparametrocontaLogic.getTipoParametroContaDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocontadetalleSessionBean==null) {
				this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
			}

			if(!this.parametrocontadetalleSessionBean.getisBusquedaDesdeForeignKeySesionTipoParametroConta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparametrocontaLogic.getTipoParametroContaDataAccess().setIsForForeingKeyData(true);

					tipoparametrocontaLogic.getTodosTipoParametroContasWithConnection(sFinalQuery,new Pagination());

					this.tipoparametrocontasForeignKey=tipoparametrocontaLogic.getTipoParametroContas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoParametroConta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparametrocontaLogic.getEntityWithConnection(parametrocontadetalleSessionBean.getlidTipoParametroContaActual());
					this.tipoparametrocontasForeignKey.add(tipoparametrocontaLogic.getTipoParametroConta());
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

			cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocontadetalleSessionBean==null) {
				this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
			}

			if(!this.parametrocontadetalleSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(parametrocontadetalleSessionBean.getlidCuentaContableActual());
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

	
	
	public void setActualParametroContaForeignKey(Long idParametroContaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ParametroConta  parametrocontaTemp=null;

			for(ParametroConta parametrocontaAux:parametrocontasForeignKey) {
				if(parametrocontaAux.getId()!=null && parametrocontaAux.getId().equals(idParametroContaSeleccionado)) {
					parametrocontaTemp=parametrocontaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(parametrocontaTemp!=null) {

					if(this.parametrocontadetalle!=null) {
						this.parametrocontadetalle.setParametroConta(parametrocontaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
						this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.setSelectedItem(parametrocontaTemp);
					}
				} else {
					//jComboBoxid_parametro_contaParametroContaDetalle.setSelectedItem(parametrocontaTemp);
					if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
						if(this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdParametroConta") || sFormularioTipoBusqueda.equals("Todos")){
					if(parametrocontaTemp!=null && jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle!=null) {
						jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.setSelectedItem(parametrocontaTemp);
					} else {
						if(jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle!=null) {
							//jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.setSelectedItem(parametrocontaTemp);
							if(jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.getItemCount()>0) {
								jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.setSelectedIndex(0);
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

	public String getActualParametroContaForeignKeyDescripcion(Long idParametroContaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ParametroConta  parametrocontaTemp=null;

			for(ParametroConta parametrocontaAux:parametrocontasForeignKey) {
				if(parametrocontaAux.getId()!=null && parametrocontaAux.getId().equals(idParametroContaSeleccionado)) {
					parametrocontaTemp=parametrocontaAux;
					break;
				}
			}


			sDescripcion=ParametroContaConstantesFunciones.getParametroContaDescripcion(parametrocontaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualParametroContaForeignKeyGenerico(Long idParametroContaSeleccionado,JComboBox jComboBoxid_parametro_contaParametroContaDetalleGenerico)throws Exception
	{
		try
		{
			ParametroConta  parametrocontaTemp=null;

			for(ParametroConta parametrocontaAux:parametrocontasForeignKey) {
				if(parametrocontaAux.getId()!=null && parametrocontaAux.getId().equals(idParametroContaSeleccionado)) {
					parametrocontaTemp=parametrocontaAux;
					break;
				}
			}

			if(parametrocontaTemp!=null) {
				jComboBoxid_parametro_contaParametroContaDetalleGenerico.setSelectedItem(parametrocontaTemp);
			} else {
				if(jComboBoxid_parametro_contaParametroContaDetalleGenerico!=null && jComboBoxid_parametro_contaParametroContaDetalleGenerico.getItemCount()>0) {
					jComboBoxid_parametro_contaParametroContaDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoParametroContaForeignKey(Long idTipoParametroContaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoParametroConta  tipoparametrocontaTemp=null;

			for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontasForeignKey) {
				if(tipoparametrocontaAux.getId()!=null && tipoparametrocontaAux.getId().equals(idTipoParametroContaSeleccionado)) {
					tipoparametrocontaTemp=tipoparametrocontaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoparametrocontaTemp!=null) {

					if(this.parametrocontadetalle!=null) {
						this.parametrocontadetalle.setTipoParametroConta(tipoparametrocontaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
						this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.setSelectedItem(tipoparametrocontaTemp);
					}
				} else {
					//jComboBoxid_tipo_parametro_contaParametroContaDetalle.setSelectedItem(tipoparametrocontaTemp);
					if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
						if(this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdParametroContaDetalle") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoparametrocontaTemp!=null && jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle!=null) {
						jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setSelectedItem(tipoparametrocontaTemp);
					} else {
						if(jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle!=null) {
							//jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setSelectedItem(tipoparametrocontaTemp);
							if(jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.getItemCount()>0) {
								jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setSelectedIndex(0);
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

	public String getActualTipoParametroContaForeignKeyDescripcion(Long idTipoParametroContaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoParametroConta  tipoparametrocontaTemp=null;

			for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontasForeignKey) {
				if(tipoparametrocontaAux.getId()!=null && tipoparametrocontaAux.getId().equals(idTipoParametroContaSeleccionado)) {
					tipoparametrocontaTemp=tipoparametrocontaAux;
					break;
				}
			}


			sDescripcion=TipoParametroContaConstantesFunciones.getTipoParametroContaDescripcion(tipoparametrocontaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoParametroContaForeignKeyGenerico(Long idTipoParametroContaSeleccionado,JComboBox jComboBoxid_tipo_parametro_contaParametroContaDetalleGenerico)throws Exception
	{
		try
		{
			TipoParametroConta  tipoparametrocontaTemp=null;

			for(TipoParametroConta tipoparametrocontaAux:tipoparametrocontasForeignKey) {
				if(tipoparametrocontaAux.getId()!=null && tipoparametrocontaAux.getId().equals(idTipoParametroContaSeleccionado)) {
					tipoparametrocontaTemp=tipoparametrocontaAux;
					break;
				}
			}

			if(tipoparametrocontaTemp!=null) {
				jComboBoxid_tipo_parametro_contaParametroContaDetalleGenerico.setSelectedItem(tipoparametrocontaTemp);
			} else {
				if(jComboBoxid_tipo_parametro_contaParametroContaDetalleGenerico!=null && jComboBoxid_tipo_parametro_contaParametroContaDetalleGenerico.getItemCount()>0) {
					jComboBoxid_tipo_parametro_contaParametroContaDetalleGenerico.setSelectedIndex(0);
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

					if(this.parametrocontadetalle!=null) {
						this.parametrocontadetalle.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
						this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableParametroContaDetalle.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
						if(this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableParametroContaDetalleGenerico)throws Exception
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
				jComboBoxid_cuenta_contableParametroContaDetalleGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableParametroContaDetalleGenerico!=null && jComboBoxid_cuenta_contableParametroContaDetalleGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableParametroContaDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarParametroContaForeignKey(ParametroContaDetalle parametrocontadetalle,JComboBox jComboBoxid_parametro_contaParametroContaDetalleGenerico)throws Exception
	{
		try
		{
			ParametroConta  parametrocontaAux=new ParametroConta();

			if(jComboBoxid_parametro_contaParametroContaDetalleGenerico==null) {
				parametrocontaAux=(ParametroConta)this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.getSelectedItem();
			} else {
				parametrocontaAux=(ParametroConta)jComboBoxid_parametro_contaParametroContaDetalleGenerico.getSelectedItem();
			}

			if(parametrocontaAux!=null && parametrocontaAux.getId()!=null) {
				parametrocontadetalle.setid_parametro_conta(parametrocontaAux.getId());
				parametrocontadetalle.setparametroconta_descripcion(ParametroContaDetalleConstantesFunciones.getParametroContaDescripcion(parametrocontaAux));
				parametrocontadetalle.setParametroConta(parametrocontaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoParametroContaForeignKey(ParametroContaDetalle parametrocontadetalle,JComboBox jComboBoxid_tipo_parametro_contaParametroContaDetalleGenerico)throws Exception
	{
		try
		{
			TipoParametroConta  tipoparametrocontaAux=new TipoParametroConta();

			if(jComboBoxid_tipo_parametro_contaParametroContaDetalleGenerico==null) {
				tipoparametrocontaAux=(TipoParametroConta)this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.getSelectedItem();
			} else {
				tipoparametrocontaAux=(TipoParametroConta)jComboBoxid_tipo_parametro_contaParametroContaDetalleGenerico.getSelectedItem();
			}

			if(tipoparametrocontaAux!=null && tipoparametrocontaAux.getId()!=null) {
				parametrocontadetalle.setid_tipo_parametro_conta(tipoparametrocontaAux.getId());
				parametrocontadetalle.settipoparametroconta_descripcion(ParametroContaDetalleConstantesFunciones.getTipoParametroContaDescripcion(tipoparametrocontaAux));
				parametrocontadetalle.setTipoParametroConta(tipoparametrocontaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(ParametroContaDetalle parametrocontadetalle,JComboBox jComboBoxid_cuenta_contableParametroContaDetalleGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableParametroContaDetalleGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableParametroContaDetalleGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				parametrocontadetalle.setid_cuenta_contable(cuentacontableAux.getId());
				parametrocontadetalle.setcuentacontable_descripcion(ParametroContaDetalleConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				parametrocontadetalle.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameParametroContasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingParametroConta=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { 
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.removeAllItems();

							for(ParametroConta parametroconta:this.parametrocontasForeignKey) {
								this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.addItem(parametroconta);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { 
					}

					if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdParametroConta") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.removeAllItems();

							for(ParametroConta parametroconta:this.parametrocontasForeignKey) {
								this.jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.addItem(parametroconta);
							}
						}

						if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoParametroContasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoParametroConta=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { 
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.removeAllItems();

							for(TipoParametroConta tipoparametroconta:this.tipoparametrocontasForeignKey) {
								this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.addItem(tipoparametroconta);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { 
					}

					if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdParametroContaDetalle") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.removeAllItems();

							for(TipoParametroConta tipoparametroconta:this.tipoparametrocontasForeignKey) {
								this.jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.addItem(tipoparametroconta);
							}
						}

						if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { 
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { 
					}

					if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.addItem(cuentacontable);
							}
						}

						if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameParametroContaForeignKey(ParametroConta parametroconta,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.setSelectedItem(parametroconta);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.setSelectedItem(parametroconta);
						} else {
							this.jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoParametroContaForeignKey(TipoParametroConta tipoparametroconta,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.setSelectedItem(tipoparametroconta);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setSelectedItem(tipoparametroconta);
						} else {
							this.jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParametroContaDetalle() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroContaDetalleConstantesFunciones.refrescarForeignKeysDescripcionesParametroContaDetalle(this.parametrocontadetalleLogic.getParametroContaDetalles());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroContaDetalleConstantesFunciones.refrescarForeignKeysDescripcionesParametroContaDetalle(this.parametrocontadetalles);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(ParametroConta.class));
		classes.add(new Classe(TipoParametroConta.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametrocontadetalleLogic.setParametroContaDetalles(this.parametrocontadetalles);
			parametrocontadetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroContaDetalleParameterReturnGeneral getParametroContaDetalleParameterGeneral() {
		return this.parametrocontadetalleParameterGeneral;
	}
	
	public void setParametroContaDetalleParameterGeneral(ParametroContaDetalleParameterReturnGeneral parametrocontadetalleParameterGeneral) {
		this.parametrocontadetalleParameterGeneral = parametrocontadetalleParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroContaDetalle() {
		return isPermisoTodoParametroContaDetalle;
	}

	public void setIsPermisoTodoParametroContaDetalle(Boolean isPermisoTodoParametroContaDetalle) {
		this.isPermisoTodoParametroContaDetalle = isPermisoTodoParametroContaDetalle;
	}

	public Boolean getIsPermisoNuevoParametroContaDetalle() {
		return isPermisoNuevoParametroContaDetalle;
	}

	public void setIsPermisoNuevoParametroContaDetalle(Boolean isPermisoNuevoParametroContaDetalle) {
		this.isPermisoNuevoParametroContaDetalle = isPermisoNuevoParametroContaDetalle;
	}

	public Boolean getIsPermisoActualizarParametroContaDetalle() {
		return isPermisoActualizarParametroContaDetalle;
	}

	public void setIsPermisoActualizarParametroContaDetalle(Boolean isPermisoActualizarParametroContaDetalle) {
		this.isPermisoActualizarParametroContaDetalle = isPermisoActualizarParametroContaDetalle;
	}

	public Boolean getIsPermisoEliminarParametroContaDetalle() {
		return isPermisoEliminarParametroContaDetalle;
	}

	public void setIsPermisoEliminarParametroContaDetalle(Boolean isPermisoEliminarParametroContaDetalle) {
		this.isPermisoEliminarParametroContaDetalle = isPermisoEliminarParametroContaDetalle;
	}

	public Boolean getIsPermisoGuardarCambiosParametroContaDetalle() {
		return isPermisoGuardarCambiosParametroContaDetalle;
	}

	public void setIsPermisoGuardarCambiosParametroContaDetalle(Boolean isPermisoGuardarCambiosParametroContaDetalle) {
		this.isPermisoGuardarCambiosParametroContaDetalle = isPermisoGuardarCambiosParametroContaDetalle;
	}
	
	public Boolean getIsPermisoConsultaParametroContaDetalle() {
		return isPermisoConsultaParametroContaDetalle;
	}

	public void setIsPermisoConsultaParametroContaDetalle(Boolean isPermisoConsultaParametroContaDetalle) {
		this.isPermisoConsultaParametroContaDetalle = isPermisoConsultaParametroContaDetalle;
	}

	public Boolean getIsPermisoBusquedaParametroContaDetalle() {
		return isPermisoBusquedaParametroContaDetalle;
	}

	public void setIsPermisoBusquedaParametroContaDetalle(Boolean isPermisoBusquedaParametroContaDetalle) {
		this.isPermisoBusquedaParametroContaDetalle = isPermisoBusquedaParametroContaDetalle;
	}

	public Boolean getIsPermisoReporteParametroContaDetalle() {
		return isPermisoReporteParametroContaDetalle;
	}

	public void setIsPermisoReporteParametroContaDetalle(Boolean isPermisoReporteParametroContaDetalle) {
		this.isPermisoReporteParametroContaDetalle = isPermisoReporteParametroContaDetalle;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroContaDetalle() {
		return isPermisoPaginacionMedioParametroContaDetalle;
	}

	public void setIsPermisoPaginacionMedioParametroContaDetalle(Boolean isPermisoPaginacionMedioParametroContaDetalle) {
		this.isPermisoPaginacionMedioParametroContaDetalle = isPermisoPaginacionMedioParametroContaDetalle;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroContaDetalle() {
		return isPermisoPaginacionTodoParametroContaDetalle;
	}

	public void setIsPermisoPaginacionTodoParametroContaDetalle(Boolean isPermisoPaginacionTodoParametroContaDetalle) {
		this.isPermisoPaginacionTodoParametroContaDetalle = isPermisoPaginacionTodoParametroContaDetalle;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroContaDetalle() {
		return isPermisoPaginacionAltoParametroContaDetalle;
	}

	public void setIsPermisoPaginacionAltoParametroContaDetalle(Boolean isPermisoPaginacionAltoParametroContaDetalle) {
		this.isPermisoPaginacionAltoParametroContaDetalle = isPermisoPaginacionAltoParametroContaDetalle;
	}
	
	public Boolean getIsPermisoCopiarParametroContaDetalle() {
		return isPermisoCopiarParametroContaDetalle;
	}

	public void setIsPermisoCopiarParametroContaDetalle(Boolean isPermisoCopiarParametroContaDetalle) {
		this.isPermisoCopiarParametroContaDetalle = isPermisoCopiarParametroContaDetalle;
	}
	
	public Boolean getIsPermisoVerFormParametroContaDetalle() {
		return isPermisoVerFormParametroContaDetalle;
	}

	public void setIsPermisoVerFormParametroContaDetalle(Boolean isPermisoVerFormParametroContaDetalle) {
		this.isPermisoVerFormParametroContaDetalle = isPermisoVerFormParametroContaDetalle;
	}
	
	public Boolean getIsPermisoDuplicarParametroContaDetalle() {
		return isPermisoDuplicarParametroContaDetalle;
	}

	public void setIsPermisoDuplicarParametroContaDetalle(Boolean isPermisoDuplicarParametroContaDetalle) {
		this.isPermisoDuplicarParametroContaDetalle = isPermisoDuplicarParametroContaDetalle;
	}
	
	public Boolean getIsPermisoOrdenParametroContaDetalle() {
		return isPermisoOrdenParametroContaDetalle;
	}

	public void setIsPermisoOrdenParametroContaDetalle(Boolean isPermisoOrdenParametroContaDetalle) {
		this.isPermisoOrdenParametroContaDetalle = isPermisoOrdenParametroContaDetalle;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroContaDetalle() {
		return isVisibilidadCeldaNuevoParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaNuevoParametroContaDetalle(Boolean isVisibilidadCeldaNuevoParametroContaDetalle) {
		this.isVisibilidadCeldaNuevoParametroContaDetalle = isVisibilidadCeldaNuevoParametroContaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroContaDetalle() {
		return isVisibilidadCeldaDuplicarParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaDuplicarParametroContaDetalle(Boolean isVisibilidadCeldaDuplicarParametroContaDetalle) {
		this.isVisibilidadCeldaDuplicarParametroContaDetalle = isVisibilidadCeldaDuplicarParametroContaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroContaDetalle() {
		return isVisibilidadCeldaCopiarParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaCopiarParametroContaDetalle(Boolean isVisibilidadCeldaCopiarParametroContaDetalle) {
		this.isVisibilidadCeldaCopiarParametroContaDetalle = isVisibilidadCeldaCopiarParametroContaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroContaDetalle() {
		return isVisibilidadCeldaVerFormParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaVerFormParametroContaDetalle(Boolean isVisibilidadCeldaVerFormParametroContaDetalle) {
		this.isVisibilidadCeldaVerFormParametroContaDetalle = isVisibilidadCeldaVerFormParametroContaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroContaDetalle() {
		return isVisibilidadCeldaOrdenParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaOrdenParametroContaDetalle(Boolean isVisibilidadCeldaOrdenParametroContaDetalle) {
		this.isVisibilidadCeldaOrdenParametroContaDetalle = isVisibilidadCeldaOrdenParametroContaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroContaDetalle() {
		return isVisibilidadCeldaNuevoRelacionesParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroContaDetalle(Boolean isVisibilidadCeldaNuevoRelacionesParametroContaDetalle) {
		this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle = isVisibilidadCeldaNuevoRelacionesParametroContaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroContaDetalle() {
		return isVisibilidadCeldaModificarParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaModificarParametroContaDetalle(Boolean isVisibilidadCeldaModificarParametroContaDetalle) {
		this.isVisibilidadCeldaModificarParametroContaDetalle = isVisibilidadCeldaModificarParametroContaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroContaDetalle() {
		return isVisibilidadCeldaActualizarParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaActualizarParametroContaDetalle(Boolean isVisibilidadCeldaActualizarParametroContaDetalle) {
		this.isVisibilidadCeldaActualizarParametroContaDetalle = isVisibilidadCeldaActualizarParametroContaDetalle;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroContaDetalle() {
		return isVisibilidadCeldaEliminarParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaEliminarParametroContaDetalle(Boolean isVisibilidadCeldaEliminarParametroContaDetalle) {
		this.isVisibilidadCeldaEliminarParametroContaDetalle = isVisibilidadCeldaEliminarParametroContaDetalle;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroContaDetalle() {
		return isVisibilidadCeldaCancelarParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaCancelarParametroContaDetalle(Boolean isVisibilidadCeldaCancelarParametroContaDetalle) {
		this.isVisibilidadCeldaCancelarParametroContaDetalle = isVisibilidadCeldaCancelarParametroContaDetalle;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroContaDetalle() {
		return isVisibilidadCeldaGuardarParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaGuardarParametroContaDetalle(Boolean isVisibilidadCeldaGuardarParametroContaDetalle) {
		this.isVisibilidadCeldaGuardarParametroContaDetalle = isVisibilidadCeldaGuardarParametroContaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroContaDetalle() {
		return isVisibilidadCeldaGuardarCambiosParametroContaDetalle;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroContaDetalle(Boolean isVisibilidadCeldaGuardarCambiosParametroContaDetalle) {
		this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle = isVisibilidadCeldaGuardarCambiosParametroContaDetalle;
	}
		
	public ParametroContaDetalleSessionBean getparametrocontadetalleSessionBean() {
		return this.parametrocontadetalleSessionBean;
	}
	
	public void setparametrocontadetalleSessionBean(ParametroContaDetalleSessionBean parametrocontadetalleSessionBean) {
		this.parametrocontadetalleSessionBean=parametrocontadetalleSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdParametroConta() {
		return this.isVisibilidadFK_IdParametroConta;
	}

	public void setisVisibilidadFK_IdParametroConta(Boolean isVisibilidadFK_IdParametroConta) {
		this.isVisibilidadFK_IdParametroConta=isVisibilidadFK_IdParametroConta;
	}

	public Boolean getisVisibilidadFK_IdParametroContaDetalle() {
		return this.isVisibilidadFK_IdParametroContaDetalle;
	}

	public void setisVisibilidadFK_IdParametroContaDetalle(Boolean isVisibilidadFK_IdParametroContaDetalle) {
		this.isVisibilidadFK_IdParametroContaDetalle=isVisibilidadFK_IdParametroContaDetalle;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(ParametroContaDetalle parametrocontadetalle)throws Exception {
		try {
			
				this.setActualParaGuardarParametroContaForeignKey(parametrocontadetalle,null);
				this.setActualParaGuardarTipoParametroContaForeignKey(parametrocontadetalle,null);
				this.setActualParaGuardarCuentaContableForeignKey(parametrocontadetalle,null);
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
	
	public void bugActualizarReferenciaActual(ParametroContaDetalle parametrocontadetalle,ParametroContaDetalle parametrocontadetalleAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroContaDetalle(parametrocontadetalle);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametrocontadetalleAux.setId(parametrocontadetalle.getId());
		parametrocontadetalleAux.setVersionRow(parametrocontadetalle.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroContaDetalle();
		
			int intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.parametrocontadetalle,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametrocontadetalleValidator.getInvalidValues(this.parametrocontadetalle);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametrocontadetalleLogic.setDatosCliente(datosCliente);
			parametrocontadetalleLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametrocontadetalleAux=new  ParametroContaDetalle();
				
				parametrocontadetalleAux.setIsNew(true);
				parametrocontadetalleAux.setIsChanged(true);
				
				parametrocontadetalleAux.setParametroContaDetalleOriginal(this.parametrocontadetalle);
				
				parametrocontadetalleAux.setId(this.parametrocontadetalle.getId());	
				parametrocontadetalleAux.setVersionRow(this.parametrocontadetalle.getVersionRow());	
				parametrocontadetalleAux.setid_parametro_conta(this.parametrocontadetalle.getid_parametro_conta());	
				parametrocontadetalleAux.setid_tipo_parametro_conta(this.parametrocontadetalle.getid_tipo_parametro_conta());	
				parametrocontadetalleAux.setid_cuenta_contable(this.parametrocontadetalle.getid_cuenta_contable());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrocontadetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametrocontadetalleAux,parametrocontadetalleLogic.getParametroContaDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocontadetalleAux,parametrocontadetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontadetalleLogic.saveParametroContaDetalles();//WithConnection
						//parametrocontadetalleLogic.getSetVersionRowParametroContaDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrocontadetalle,parametrocontadetalleAux);
					
					this.refrescarForeignKeysDescripcionesParametroContaDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrocontadetalleLogic.saveParametroContaDetalleRelaciones(parametrocontadetalleAux);//WithConnection
								//parametrocontadetalleLogic.getSetVersionRowParametroContaDetalles();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrocontadetalle,parametrocontadetalleAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrocontadetalleSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrocontadetalleAux,parametrocontadetalleLogic.getParametroContaDetalles());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrocontadetalleAux,parametrocontadetalles);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrocontadetalle,parametrocontadetalleAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametrocontadetalleAux=new  ParametroContaDetalle();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado() 
					|| (this.parametrocontadetalleSessionBean.getEsGuardarRelacionado() && this.parametrocontadetalle.getId()>=0)) {
						
					parametrocontadetalleAux.setIsNew(false);
				}
				
				parametrocontadetalleAux.setIsDeleted(false);
			
				parametrocontadetalleAux.setId(this.parametrocontadetalle.getId());	
				parametrocontadetalleAux.setVersionRow(this.parametrocontadetalle.getVersionRow());	
				parametrocontadetalleAux.setid_parametro_conta(this.parametrocontadetalle.getid_parametro_conta());	
				parametrocontadetalleAux.setid_tipo_parametro_conta(this.parametrocontadetalle.getid_tipo_parametro_conta());	
				parametrocontadetalleAux.setid_cuenta_contable(this.parametrocontadetalle.getid_cuenta_contable());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrocontadetalleAux,parametrocontadetalleLogic.getParametroContaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocontadetalleAux,parametrocontadetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontadetalleLogic.saveParametroContaDetalles();//WithConnection
						//parametrocontadetalleLogic.getSetVersionRowParametroContaDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrocontadetalle,parametrocontadetalleAux);
					
					this.refrescarForeignKeysDescripcionesParametroContaDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrocontadetalleLogic.saveParametroContaDetalleRelaciones(parametrocontadetalleAux);//WithConnection
								//parametrocontadetalleLogic.getSetVersionRowParametroContaDetalles();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrocontadetalle,parametrocontadetalleAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrocontadetalleSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrocontadetalleAux,parametrocontadetalleLogic.getParametroContaDetalles());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrocontadetalleAux,parametrocontadetalles);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrocontadetalle,parametrocontadetalleAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametrocontadetalleAux=new  ParametroContaDetalle();
				
				parametrocontadetalleAux.setIsNew(false);
				parametrocontadetalleAux.setIsChanged(false);
				
				parametrocontadetalleAux.setIsDeleted(true);
				
				parametrocontadetalleAux.setId(this.parametrocontadetalle.getId());	
				parametrocontadetalleAux.setVersionRow(this.parametrocontadetalle.getVersionRow());	
				parametrocontadetalleAux.setid_parametro_conta(this.parametrocontadetalle.getid_parametro_conta());	
				parametrocontadetalleAux.setid_tipo_parametro_conta(this.parametrocontadetalle.getid_tipo_parametro_conta());	
				parametrocontadetalleAux.setid_cuenta_contable(this.parametrocontadetalle.getid_cuenta_contable());	
				
				if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametrocontadetalleAux.getId()>=0) {	
						this.parametrocontadetallesEliminados.add(parametrocontadetalleAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametrocontadetalleAux,parametrocontadetalleLogic.getParametroContaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocontadetalleAux,parametrocontadetalles);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontadetalleLogic.saveParametroContaDetalles();//WithConnection
						//parametrocontadetalleLogic.getSetVersionRowParametroContaDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrocontadetalleLogic.saveParametroContaDetalleRelaciones(parametrocontadetalleAux);//WithConnection
								//parametrocontadetalleLogic.getSetVersionRowParametroContaDetalles();//WithConnection
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
							if(this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametrocontadetalleSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametrocontadetalleAux,parametrocontadetalleLogic.getParametroContaDetalles());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametrocontadetalleAux,parametrocontadetalles);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.getParametroContaDetalles().addAll(this.parametrocontadetallesEliminados);
					
					parametrocontadetalleLogic.saveParametroContaDetalles();//WithConnection
					//parametrocontadetalleLogic.getSetVersionRowParametroContaDetalles();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroContaDetalle();
				
				this.parametrocontadetallesEliminados= new ArrayList<ParametroContaDetalle>();		
			}
			
			if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Conta Detalle GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Conta Detalle",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametrocontadetalle=parametrocontadetalleAux;
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
      		//this.finishProcessParametroContaDetalle();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroContaDetalle parametrocontadetalleLocal) throws Exception {
		
		if(this.parametrocontadetalleSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroContaDetalle parametrocontadetalleLocal) throws Exception {	
		if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ParametroContaDetalleFormJInternalFrame.class)) {
				ParametroContaBeanSwingJInternalFrame parametrocontaBeanSwingJInternalFrameLocal=(ParametroContaBeanSwingJInternalFrame) ((ParametroContaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				parametrocontaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoParametroConta(parametrocontaBeanSwingJInternalFrameLocal.getparametroconta(),true);
				parametrocontaBeanSwingJInternalFrameLocal.actualizarLista(parametrocontaBeanSwingJInternalFrameLocal.parametroconta,this.parametrocontasForeignKey);

				parametrocontaBeanSwingJInternalFrameLocal.actualizarRelaciones(parametrocontaBeanSwingJInternalFrameLocal.parametroconta);

				parametrocontadetalleLocal.setParametroConta(parametrocontaBeanSwingJInternalFrameLocal.parametroconta);

				this.addItemDefectoCombosForeignKeyParametroConta();
				this.cargarCombosFrameParametroContasForeignKey("Formulario");
				this.setActualParametroContaForeignKey(parametrocontaBeanSwingJInternalFrameLocal.parametroconta.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoParametroContaDetalleFormJInternalFrame.class)) {
				TipoParametroContaBeanSwingJInternalFrame tipoparametrocontaBeanSwingJInternalFrameLocal=(TipoParametroContaBeanSwingJInternalFrame) ((TipoParametroContaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoparametrocontaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoParametroConta(tipoparametrocontaBeanSwingJInternalFrameLocal.gettipoparametroconta(),true);
				tipoparametrocontaBeanSwingJInternalFrameLocal.actualizarLista(tipoparametrocontaBeanSwingJInternalFrameLocal.tipoparametroconta,this.tipoparametrocontasForeignKey);

				tipoparametrocontaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoparametrocontaBeanSwingJInternalFrameLocal.tipoparametroconta);

				parametrocontadetalleLocal.setTipoParametroConta(tipoparametrocontaBeanSwingJInternalFrameLocal.tipoparametroconta);

				this.addItemDefectoCombosForeignKeyTipoParametroConta();
				this.cargarCombosFrameTipoParametroContasForeignKey("Formulario");
				this.setActualTipoParametroContaForeignKey(tipoparametrocontaBeanSwingJInternalFrameLocal.tipoparametroconta.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				parametrocontadetalleLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroContaDetalleActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametrocontadetalleValidator.getInvalidValues(this.parametrocontadetalle);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroContaDetalle parametrocontadetalle,List<ParametroContaDetalle> parametrocontadetalles) throws Exception {
		try	{		
			ParametroContaDetalleConstantesFunciones.actualizarLista(parametrocontadetalle,parametrocontadetalles,this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroContaDetalle parametrocontadetalle,List<ParametroContaDetalle> parametrocontadetalles) throws Exception {
		try	{			
			ParametroContaDetalleConstantesFunciones.actualizarSelectedLista(parametrocontadetalle,parametrocontadetalles);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroContaDetalle> parametrocontadetallesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametrocontadetallesLocal=this.parametrocontadetalleLogic.getParametroContaDetalles();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametrocontadetallesLocal=this.parametrocontadetalles;
			}
			//ARCHITECTURE
		
			for(ParametroContaDetalle parametrocontadetalleLocal:parametrocontadetallesLocal) {
				if(this.permiteMantenimiento(parametrocontadetalleLocal) && parametrocontadetalleLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroContaDetalleConstantesFunciones.getParametroContaDetalleLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroContaDetalleConstantesFunciones.IDPARAMETROCONTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContaDetalle.jLabelid_parametro_contaParametroContaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroContaDetalleConstantesFunciones.IDTIPOPARAMETROCONTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContaDetalle.jLabelid_tipo_parametro_contaParametroContaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroContaDetalleConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContaDetalle.jLabelid_cuenta_contableParametroContaDetalle,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContaDetalle.jLabelid_parametro_contaParametroContaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContaDetalle.jLabelid_tipo_parametro_contaParametroContaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContaDetalle.jLabelid_cuenta_contableParametroContaDetalle,"");
		
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
		this.iIdNuevoParametroContaDetalle--;	
		
		
		this.parametrocontadetalleAux=new ParametroContaDetalle();
		
		this.parametrocontadetalleAux.setId(this.iIdNuevoParametroContaDetalle);
		this.parametrocontadetalleAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrocontadetalleLogic.getParametroContaDetalles().add(this.parametrocontadetalleAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametrocontadetalles.add(this.parametrocontadetalleAux);
		}
		//ARCHITECTURE
		
		this.parametrocontadetalle=this.parametrocontadetalleAux;
		
		if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroContaDetalle(this.parametrocontadetalle);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroContaDetalle(this.parametrocontadetalle);
		}
				
		//this.setDefaultControlesParametroContaDetalle();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroContaDetalle();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroContaDetalle();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroContaDetalle();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroContaDetalle(this.parametrocontadetalleBean,this.parametrocontadetalle,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
			classes=ParametroContaDetalleConstantesFunciones.getClassesRelationshipsOfParametroContaDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametrocontadetalleReturnGeneral=parametrocontadetalleLogic.procesarEventosParametroContaDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrocontadetalleLogic.getParametroContaDetalles(),this.parametrocontadetalle,this.parametrocontadetalleParameterGeneral,this.isEsNuevoParametroContaDetalle,classes);//this.parametrocontadetalleLogic.getParametroContaDetalle()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroContaDetalle(this.parametrocontadetalleReturnGeneral,this.parametrocontadetalleBean,false);
		
		if(this.parametrocontadetalleReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroContaDetalle(this.parametrocontadetalleReturnGeneral.getParametroContaDetalle());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroContaDetalle(this.parametrocontadetalleReturnGeneral.getParametroContaDetalle());
		}
		
		if(this.parametrocontadetalleReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroContaDetalle(this.parametrocontadetalleReturnGeneral.getParametroContaDetalle(),classes);//this.parametrocontadetalleBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.parametrocontadetalle,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroContaDetalle();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroContaDetalle();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.RecargarFormParametroContaDetalle(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroContaDetalle(false);
						
			if(parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroContaDetalle();
			}
			
			this.actualizarVisualTableDatosParametroContaDetalle();
			
			this.jTableDatosParametroContaDetalle.setRowSelectionInterval(this.getIndiceNuevoParametroContaDetalle(), this.getIndiceNuevoParametroContaDetalle());
			
			this.seleccionarFilaTablaParametroContaDetalleActual();
						
			this.actualizarEstadoCeldasBotonesParametroContaDetalle("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroContaDetalle(Boolean isHabilitar) throws Exception {
			
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.setEnabled(isHabilitar && this.parametrocontadetalleConstantesFunciones.activarid_parametro_contaParametroContaDetalle);
		this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.setEnabled(isHabilitar && this.parametrocontadetalleConstantesFunciones.activarid_tipo_parametro_contaParametroContaDetalle);
		this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.setEnabled(isHabilitar && this.parametrocontadetalleConstantesFunciones.activarid_cuenta_contableParametroContaDetalle);
	};
	
	public void setDefaultControlesParametroContaDetalle() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroContaDetalle(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametrocontadetalleSessionBean.setConGuardarRelaciones(true);			
			this.parametrocontadetalleSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroContaDetalle.jTabbedPaneRelacionesParametroContaDetalle.setVisible(true);
			
					
		} else {
			//this.parametrocontadetalleSessionBean.setConGuardarRelaciones(false);			
			this.parametrocontadetalleSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroContaDetalle.jTabbedPaneRelacionesParametroContaDetalle.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroContaDetalle() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalleLogic.getParametroContaDetalles()) {
				if(parametrocontadetalleAux.getId().equals(this.iIdNuevoParametroContaDetalle)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalles) {
				if(parametrocontadetalleAux.getId().equals(this.iIdNuevoParametroContaDetalle)) {
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
	
	public int getIndiceActualParametroContaDetalle(ParametroContaDetalle parametrocontadetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalleLogic.getParametroContaDetalles()) {
				if(parametrocontadetalleAux.getId().equals(parametrocontadetalle.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalles) {
				if(parametrocontadetalleAux.getId().equals(parametrocontadetalle.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroContaDetalle(ParametroContaDetalle parametrocontadetalleOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalleLogic.getParametroContaDetalles()) {
				if(parametrocontadetalleAux.getParametroContaDetalleOriginal().getId().equals(parametrocontadetalleOriginal.getId())) {
					existe=true;
					parametrocontadetalleOriginal.setId(parametrocontadetalleAux.getId());
					parametrocontadetalleOriginal.setVersionRow(parametrocontadetalleAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalles) {
				if(parametrocontadetalleAux.getParametroContaDetalleOriginal().getId().equals(parametrocontadetalleOriginal.getId())) {
					existe=true;
					parametrocontadetalleOriginal.setId(parametrocontadetalleAux.getId());
					parametrocontadetalleOriginal.setVersionRow(parametrocontadetalleAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroContaDetalle(Boolean esParaCancelar) throws Exception {
		parametrocontadetallesAux=new ArrayList<ParametroContaDetalle>();
		parametrocontadetalleAux=new ParametroContaDetalle();
		
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalleLogic.getParametroContaDetalles()) {
					if(parametrocontadetalleAux.getId()<0) {
						parametrocontadetallesAux.add(parametrocontadetalleAux);
					}		
				}
				this.iIdNuevoParametroContaDetalle=0L;
				this.parametrocontadetalleLogic.getParametroContaDetalles().removeAll(parametrocontadetallesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalles) {
					if(parametrocontadetalleAux.getId()<0) {
						parametrocontadetallesAux.add(parametrocontadetalleAux);
					}		
				}
				this.iIdNuevoParametroContaDetalle=0L;
				this.parametrocontadetalles.removeAll(parametrocontadetallesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroContaDetalle 
					&& this.parametrocontadetalleLogic.getParametroContaDetalles().size()>0
					) {
					parametrocontadetalleAux=this.parametrocontadetalleLogic.getParametroContaDetalles().get(this.parametrocontadetalleLogic.getParametroContaDetalles().size() - 1);
				
					if(parametrocontadetalleAux.getId()<0) {
						this.parametrocontadetalleLogic.getParametroContaDetalles().remove(parametrocontadetalleAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroContaDetalle && this.parametrocontadetalles.size()>0) {
					parametrocontadetalleAux=this.parametrocontadetalles.get(this.parametrocontadetalles.size() - 1);
				
					if(parametrocontadetalleAux.getId()<0) {
						this.parametrocontadetalles.remove(parametrocontadetalleAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroContaDetalle(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametrocontadetalle.getId()<0) {
				this.parametrocontadetalleLogic.getParametroContaDetalles().remove(this.parametrocontadetalle);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametrocontadetalle.getId()<0) {
				this.parametrocontadetalles.remove(this.parametrocontadetalle);
			}
		}			
	}
	
	public void setEstadosInicialesParametroContaDetalle(List<ParametroContaDetalle> parametrocontadetallesAux) throws Exception {
		ParametroContaDetalleConstantesFunciones.setEstadosInicialesParametroContaDetalle(parametrocontadetallesAux);
	}
	
	public void setEstadosInicialesParametroContaDetalle(ParametroContaDetalle parametrocontadetalleAux) throws Exception {
		ParametroContaDetalleConstantesFunciones.setEstadosInicialesParametroContaDetalle(parametrocontadetalleAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroContaDetalleActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroContaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroContaDetalleActual()) {
				if(!this.isEsNuevoParametroContaDetalle) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroContaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroContaDetalle=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroContaDetalleActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Conta Detalle ?", "MANTENIMIENTO DE Parametro Conta Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroContaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroContaDetalle parametrocontadetalle) throws Exception {
		ParametroContaDetalleConstantesFunciones.seleccionarAsignar(this.parametrocontadetalle,parametrocontadetalle);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroContaDetalle=this.isPermisoActualizarOriginalParametroContaDetalle;
			
			
			this.seleccionarAsignar(parametrocontadetalle);
			
			

			idCuentaContableActual=parametrocontadetalle.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroContaDetalleConstantesFunciones.quitarEspaciosParametroContaDetalle(this.parametrocontadetalle,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroContaDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametrocontadetalleSessionBean.setsFuncionBusquedaRapida(this.parametrocontadetalleSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoParametroContaDetalle) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroContaDetalle(esParaCancelar);				
				this.cancelarNuevoParametroContaDetalle(esParaCancelar);								
			}
			
			this.parametrocontadetalle=new ParametroContaDetalle();
			
			this.inicializarParametroContaDetalle();
			
			this.actualizarEstadoCeldasBotonesParametroContaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroContaDetalle() throws Exception {
		try {
			ParametroContaDetalleConstantesFunciones.inicializarParametroContaDetalle(this.parametrocontadetalle);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametrocontadetalleLogic.getParametroContaDetalles().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroContaDetalles(String sAccionBusqueda,List<ParametroContaDetalle> parametrocontadetallesParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroContaDetalle"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroContaDetalleMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroContaDetalleMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroContaDetalle"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Conta Detalles");		
		parameters.put("busquedapor", ParametroContaDetalleConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroContaDetalle=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroContaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroContaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroContaDetalle=new JRBeanArrayDataSource(ParametroContaDetalleJInternalFrame.TraerParametroContaDetalleBeans(parametrocontadetallesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroContaDetalle);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroContaDetalleConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroContaDetalleConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroContaDetalleBean.TraerParametroContaDetalleBeans(parametrocontadetallesParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroContaDetalles(sAccionBusqueda,sTipoArchivoReporte,parametrocontadetallesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroContaDetalles(sAccionBusqueda,sTipoArchivoReporte,parametrocontadetallesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroContaDetalleActionPerformed(null);
					//this.generarExcelReporteParametroContaDetalles(sAccionBusqueda,sTipoArchivoReporte,parametrocontadetallesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroContaDetalles(sAccionBusqueda,sTipoArchivoReporte,parametrocontadetallesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroContaDetalles(sAccionBusqueda,sTipoArchivoReporte,parametrocontadetallesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroContaDetalles(sAccionBusqueda,sTipoArchivoReporte,parametrocontadetallesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroContaDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroContaDetalle> parametrocontadetallesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontadetalle";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroContaDetalles");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroContaDetalle("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroContaDetalle parametrocontadetalle : parametrocontadetallesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroContaDetalleConstantesFunciones.generarExcelReporteDataParametroContaDetalle("NORMAL",row,workbook,parametrocontadetalle,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Conta Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroContaDetalle(String sTipo,Row row,Workbook workbook) {
		
		ParametroContaDetalleConstantesFunciones.generarExcelReporteHeaderParametroContaDetalle(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroContaDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroContaDetalle> parametrocontadetallesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontadetalle_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroContaDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroContaDetalle parametrocontadetalle : parametrocontadetallesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroContaDetalleConstantesFunciones.getParametroContaDetalleDescripcion(parametrocontadetalle));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontadetalle.getparametroconta_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontadetalle.gettipoparametroconta_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontadetalle.getcuentacontable_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Conta Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroContaDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroContaDetalle> parametrocontadetallesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroContaDetalle> parametrocontadetallesRespaldo=null;
		
		classes=ParametroContaDetalleConstantesFunciones.getClassesRelationshipsOfParametroContaDetalle(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametrocontadetalleLogic.setDatosCliente(this.datosCliente);
		this.parametrocontadetalleLogic.setDatosDeep(this.datosDeep);
		this.parametrocontadetalleLogic.setIsConDeep(true);
		
		parametrocontadetallesRespaldo=this.parametrocontadetalleLogic.getParametroContaDetalles();
		
		this.parametrocontadetalleLogic.setParametroContaDetalles(parametrocontadetallesParaReportes);	
		this.parametrocontadetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametrocontadetallesParaReportes=this.parametrocontadetalleLogic.getParametroContaDetalles();
		this.parametrocontadetalleLogic.setParametroContaDetalles(parametrocontadetallesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontadetalle_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroContaDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroContaDetalle("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroContaDetalle parametrocontadetalle : parametrocontadetallesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroContaDetalle("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroContaDetalleConstantesFunciones.generarExcelReporteDataParametroContaDetalle("NORMAL",row,workbook,parametrocontadetalle,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroContaDetalleConstantesFunciones.getParametroContaDetalleDescripcion(parametrocontadetalle));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Conta Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroContaDetalle() throws Exception {		
		this.startProcessParametroContaDetalle(true);
	}
	
	public void startProcessParametroContaDetalle(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroContaDetalle ,this.jPanelParametrosReportesParametroContaDetalle, this.jScrollPanelDatosParametroContaDetalle,this.jPanelPaginacionParametroContaDetalle, this.jScrollPanelDatosEdicionParametroContaDetalle, this.jPanelAccionesParametroContaDetalle,this.jPanelAccionesFormularioParametroContaDetalle,this.jmenuBarParametroContaDetalle,this.jmenuBarDetalleParametroContaDetalle,this.jTtoolBarParametroContaDetalle,this.jTtoolBarDetalleParametroContaDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroContaDetalle=this.jTabbedPaneBusquedasParametroContaDetalle; 
		
		final JPanel jPanelParametrosReportesParametroContaDetalle=this.jPanelParametrosReportesParametroContaDetalle;
		//final JScrollPane jScrollPanelDatosParametroContaDetalle=this.jScrollPanelDatosParametroContaDetalle;
		final JTable jTableDatosParametroContaDetalle=this.jTableDatosParametroContaDetalle;		
		final JPanel jPanelPaginacionParametroContaDetalle=this.jPanelPaginacionParametroContaDetalle;
		//final JScrollPane jScrollPanelDatosEdicionParametroContaDetalle=this.jScrollPanelDatosEdicionParametroContaDetalle;
		final JPanel jPanelAccionesParametroContaDetalle=this.jPanelAccionesParametroContaDetalle;
		
		JPanel jPanelCamposAuxiliarParametroContaDetalle=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroContaDetalle=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			jPanelCamposAuxiliarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jPanelCamposParametroContaDetalle;
			jPanelAccionesFormularioAuxiliarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jPanelAccionesFormularioParametroContaDetalle;
		}
		
		final JPanel jPanelCamposParametroContaDetalle=jPanelCamposAuxiliarParametroContaDetalle;
		final JPanel jPanelAccionesFormularioParametroContaDetalle=jPanelAccionesFormularioAuxiliarParametroContaDetalle;
		
		
		final JMenuBar jmenuBarParametroContaDetalle=this.jmenuBarParametroContaDetalle;
		final JToolBar jTtoolBarParametroContaDetalle=this.jTtoolBarParametroContaDetalle;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroContaDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroContaDetalle=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			jmenuBarDetalleAuxiliarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jmenuBarDetalleParametroContaDetalle;
			jTtoolBarDetalleAuxiliarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jTtoolBarDetalleParametroContaDetalle;
		}
		
		final JMenuBar jmenuBarDetalleParametroContaDetalle=jmenuBarDetalleAuxiliarParametroContaDetalle;
		final JToolBar jTtoolBarDetalleParametroContaDetalle=jTtoolBarDetalleAuxiliarParametroContaDetalle;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroContaDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroContaDetalle;
			processRunnable.jTableDatos=jTableDatosParametroContaDetalle;
			processRunnable.jPanelCampos=jPanelCamposParametroContaDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroContaDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesParametroContaDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroContaDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarParametroContaDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroContaDetalle;
			processRunnable.jTtoolBar=jTtoolBarParametroContaDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroContaDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroContaDetalle ,jPanelParametrosReportesParametroContaDetalle,jTableDatosParametroContaDetalle, /*jScrollPanelDatosParametroContaDetalle,*/jPanelCamposParametroContaDetalle,jPanelPaginacionParametroContaDetalle, /*jScrollPanelDatosEdicionParametroContaDetalle,*/ jPanelAccionesParametroContaDetalle,jPanelAccionesFormularioParametroContaDetalle,jmenuBarParametroContaDetalle,jmenuBarDetalleParametroContaDetalle,jTtoolBarParametroContaDetalle,jTtoolBarDetalleParametroContaDetalle);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroContaDetalle ,jPanelParametrosReportesParametroContaDetalle, jScrollPanelDatosParametroContaDetalle,jPanelPaginacionParametroContaDetalle, jScrollPanelDatosEdicionParametroContaDetalle, jPanelAccionesParametroContaDetalle,jPanelAccionesFormularioParametroContaDetalle,jmenuBarParametroContaDetalle,jmenuBarDetalleParametroContaDetalle,jTtoolBarParametroContaDetalle,jTtoolBarDetalleParametroContaDetalle);
						
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
	
	public void finishProcessParametroContaDetalle() {// throws Exception 
		this.finishProcessParametroContaDetalle(true);
	}
	
	public void finishProcessParametroContaDetalle(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroContaDetalle ,this.jPanelParametrosReportesParametroContaDetalle, this.jScrollPanelDatosParametroContaDetalle,this.jPanelPaginacionParametroContaDetalle, this.jScrollPanelDatosEdicionParametroContaDetalle, this.jPanelAccionesParametroContaDetalle,this.jPanelAccionesFormularioParametroContaDetalle,this.jmenuBarParametroContaDetalle,this.jmenuBarDetalleParametroContaDetalle,this.jTtoolBarParametroContaDetalle,this.jTtoolBarDetalleParametroContaDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroContaDetalle=this.jTabbedPaneBusquedasParametroContaDetalle; 
		
		final JPanel jPanelParametrosReportesParametroContaDetalle=this.jPanelParametrosReportesParametroContaDetalle;
		//final JScrollPane jScrollPanelDatosParametroContaDetalle=this.jScrollPanelDatosParametroContaDetalle;
		final JTable jTableDatosParametroContaDetalle=this.jTableDatosParametroContaDetalle;		
		final JPanel jPanelPaginacionParametroContaDetalle=this.jPanelPaginacionParametroContaDetalle;
		//final JScrollPane jScrollPanelDatosEdicionParametroContaDetalle=this.jScrollPanelDatosEdicionParametroContaDetalle;
		final JPanel jPanelAccionesParametroContaDetalle=this.jPanelAccionesParametroContaDetalle;
		
		JPanel jPanelCamposAuxiliarParametroContaDetalle=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroContaDetalle=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			jPanelCamposAuxiliarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jPanelCamposParametroContaDetalle;
			jPanelAccionesFormularioAuxiliarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jPanelAccionesFormularioParametroContaDetalle;
		}
		
		final JPanel jPanelCamposParametroContaDetalle=jPanelCamposAuxiliarParametroContaDetalle;
		final JPanel jPanelAccionesFormularioParametroContaDetalle=jPanelAccionesFormularioAuxiliarParametroContaDetalle;
		
		
		final JMenuBar jmenuBarParametroContaDetalle=this.jmenuBarParametroContaDetalle;		
		final JToolBar jTtoolBarParametroContaDetalle=this.jTtoolBarParametroContaDetalle;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroContaDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroContaDetalle=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			jmenuBarDetalleAuxiliarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jmenuBarDetalleParametroContaDetalle;
			jTtoolBarDetalleAuxiliarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jTtoolBarDetalleParametroContaDetalle;		
		}
		
		final JMenuBar jmenuBarDetalleParametroContaDetalle=jmenuBarDetalleAuxiliarParametroContaDetalle;
		final JToolBar jTtoolBarDetalleParametroContaDetalle=jTtoolBarDetalleAuxiliarParametroContaDetalle;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroContaDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroContaDetalle;
			processRunnable.jTableDatos=jTableDatosParametroContaDetalle;
			processRunnable.jPanelCampos=jPanelCamposParametroContaDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroContaDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesParametroContaDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroContaDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarParametroContaDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroContaDetalle;
			processRunnable.jTtoolBar=jTtoolBarParametroContaDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroContaDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroContaDetalle ,jPanelParametrosReportesParametroContaDetalle, jTableDatosParametroContaDetalle,/*jScrollPanelDatosParametroContaDetalle,*/jPanelCamposParametroContaDetalle,jPanelPaginacionParametroContaDetalle, /*jScrollPanelDatosEdicionParametroContaDetalle,*/ jPanelAccionesParametroContaDetalle,jPanelAccionesFormularioParametroContaDetalle,jmenuBarParametroContaDetalle,jmenuBarDetalleParametroContaDetalle,jTtoolBarParametroContaDetalle,jTtoolBarDetalleParametroContaDetalle));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroContaDetalle(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroContaDetalle(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroContaDetalle(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroContaDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroContaDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroContaDetalle,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroContaDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroContaDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroContaDetalle,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametrocontadetalleConstantesFunciones.getsFinalQueryParametroContaDetalle();
		String  finalQueryPaginacionTodos=this.parametrocontadetalleConstantesFunciones.getsFinalQueryParametroContaDetalle();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroContaDetalleConstantesFunciones.getArrayColumnasGlobalesNoParametroContaDetalle(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroContaDetalleConstantesFunciones.getArrayColumnasGlobalesParametroContaDetalle(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroContaDetalleConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametrocontadetallesEliminados= new ArrayList<ParametroContaDetalle>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroContaDetalle();
		
				///*ParametroContaDetalleSessionBean*/this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
			
			if(this.parametrocontadetalleSessionBean==null) {
				this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
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
					this.iNumeroPaginacion=ParametroContaDetalleConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroContaDetalleConstantesFunciones.getClassesForeignKeysOfParametroContaDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametrocontadetalle."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametrocontadetallesAux= new ArrayList<ParametroContaDetalle>();
			
				
			parametrocontadetalleLogic.setDatosCliente(this.datosCliente);
			parametrocontadetalleLogic.setDatosDeep(this.datosDeep);
			parametrocontadetalleLogic.setIsConDeep(true);
			
			
			parametrocontadetalleLogic.getParametroContaDetalleDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametrocontadetalleLogic.getTodosParametroContaDetalles(finalQueryGlobal,pagination);
					
					//parametrocontadetalleLogic.getTodosParametroContaDetallesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametrocontadetalleLogic.getParametroContaDetalles()==null|| parametrocontadetalleLogic.getParametroContaDetalles().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrocontadetallesAux= new ArrayList<ParametroContaDetalle>();
							parametrocontadetallesAux.addAll(parametrocontadetalleLogic.getParametroContaDetalles());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontadetallesAux= new ArrayList<ParametroContaDetalle>();
							parametrocontadetallesAux.addAll(parametrocontadetalles);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrocontadetalleLogic.getTodosParametroContaDetalles(finalQueryGlobal+"",this.pagination);												
							
							//parametrocontadetalleLogic.getTodosParametroContaDetallesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroContaDetalles("Todos",parametrocontadetalleLogic.getParametroContaDetalles() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrocontadetalleLogic.setParametroContaDetalles(new ArrayList<ParametroContaDetalle>());					
							parametrocontadetalleLogic.getParametroContaDetalles().addAll(parametrocontadetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontadetalles=new ArrayList<ParametroContaDetalle>();
							parametrocontadetalles.addAll(parametrocontadetallesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroContaDetalle=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroContaDetalle=this.idActual;
				
				} else if(this.idParametroContaDetalleActual!=null && this.idParametroContaDetalleActual!=0L) {
					idParametroContaDetalle=idParametroContaDetalleActual;
				}
				
					
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndicePorId(idParametroContaDetalle);
				
				this.parametrocontadetalles=new ArrayList<ParametroContaDetalle>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametrocontadetalleLogic.getEntity(idParametroContaDetalle);
					
					//parametrocontadetalleLogic.getEntityWithConnection(idParametroContaDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontadetalleLogic.setParametroContaDetalles(new ArrayList<ParametroContaDetalle>());
					parametrocontadetalleLogic.getParametroContaDetalles().add(parametrocontadetalleLogic.getParametroContaDetalle());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontadetalles=new ArrayList<ParametroContaDetalle>();
					this.parametrocontadetalles.add(parametrocontadetalle);
				}
				
				if(parametrocontadetalleLogic.getParametroContaDetalle()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontadetalleLogic.getParametroContaDetallesFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontadetalleLogic.getParametroContaDetalles()==null||parametrocontadetalleLogic.getParametroContaDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontadetalles==null|| parametrocontadetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontadetallesAux=new ArrayList<ParametroContaDetalle>();
						parametrocontadetallesAux.addAll(parametrocontadetalleLogic.getParametroContaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontadetallesAux=new ArrayList<ParametroContaDetalle>();
							parametrocontadetallesAux.addAll(parametrocontadetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontadetalleLogic.getParametroContaDetallesFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContaDetalles("FK_IdCuentaContable",parametrocontadetalleLogic.getParametroContaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContaDetalles("FK_IdCuentaContable",parametrocontadetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontadetalleLogic.setParametroContaDetalles(new ArrayList<ParametroContaDetalle>());
						parametrocontadetalleLogic.getParametroContaDetalles().addAll(parametrocontadetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontadetalles=new ArrayList<ParametroContaDetalle>();
							parametrocontadetalles.addAll(parametrocontadetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdParametroConta")) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdParametroConta(id_parametro_contaFK_IdParametroConta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontadetalleLogic.getParametroContaDetallesFK_IdParametroConta(finalQueryGlobal,pagination,id_parametro_contaFK_IdParametroConta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdParametroConta(id_parametro_contaFK_IdParametroConta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdParametroConta(id_parametro_contaFK_IdParametroConta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontadetalleLogic.getParametroContaDetalles()==null||parametrocontadetalleLogic.getParametroContaDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontadetalles==null|| parametrocontadetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontadetallesAux=new ArrayList<ParametroContaDetalle>();
						parametrocontadetallesAux.addAll(parametrocontadetalleLogic.getParametroContaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontadetallesAux=new ArrayList<ParametroContaDetalle>();
							parametrocontadetallesAux.addAll(parametrocontadetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontadetalleLogic.getParametroContaDetallesFK_IdParametroConta(finalQueryGlobal,pagination,id_parametro_contaFK_IdParametroConta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdParametroConta(id_parametro_contaFK_IdParametroConta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdParametroConta(id_parametro_contaFK_IdParametroConta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContaDetalles("FK_IdParametroConta",parametrocontadetalleLogic.getParametroContaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContaDetalles("FK_IdParametroConta",parametrocontadetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontadetalleLogic.setParametroContaDetalles(new ArrayList<ParametroContaDetalle>());
						parametrocontadetalleLogic.getParametroContaDetalles().addAll(parametrocontadetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontadetalles=new ArrayList<ParametroContaDetalle>();
							parametrocontadetalles.addAll(parametrocontadetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdParametroContaDetalle")) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdParametroContaDetalle(id_tipo_parametro_contaFK_IdParametroContaDetalle);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontadetalleLogic.getParametroContaDetallesFK_IdParametroContaDetalle(finalQueryGlobal,pagination,id_tipo_parametro_contaFK_IdParametroContaDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdParametroContaDetalle(id_tipo_parametro_contaFK_IdParametroContaDetalle);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdParametroContaDetalle(id_tipo_parametro_contaFK_IdParametroContaDetalle);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontadetalleLogic.getParametroContaDetalles()==null||parametrocontadetalleLogic.getParametroContaDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontadetalles==null|| parametrocontadetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontadetallesAux=new ArrayList<ParametroContaDetalle>();
						parametrocontadetallesAux.addAll(parametrocontadetalleLogic.getParametroContaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontadetallesAux=new ArrayList<ParametroContaDetalle>();
							parametrocontadetallesAux.addAll(parametrocontadetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontadetalleLogic.getParametroContaDetallesFK_IdParametroContaDetalle(finalQueryGlobal,pagination,id_tipo_parametro_contaFK_IdParametroContaDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdParametroContaDetalle(id_tipo_parametro_contaFK_IdParametroContaDetalle);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContaDetalleConstantesFunciones.getDetalleIndiceFK_IdParametroContaDetalle(id_tipo_parametro_contaFK_IdParametroContaDetalle);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContaDetalles("FK_IdParametroContaDetalle",parametrocontadetalleLogic.getParametroContaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContaDetalles("FK_IdParametroContaDetalle",parametrocontadetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontadetalleLogic.setParametroContaDetalles(new ArrayList<ParametroContaDetalle>());
						parametrocontadetalleLogic.getParametroContaDetalles().addAll(parametrocontadetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontadetalles=new ArrayList<ParametroContaDetalle>();
							parametrocontadetalles.addAll(parametrocontadetallesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroContaDetalle();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroContaDetalle();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrocontadetalleLogic.getParametroContaDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocontadetalles.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrocontadetalleLogic.getParametroContaDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocontadetalles.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroContaDetalle parametrocontadetalle) {
		Boolean permite=true;
		
		if(this.parametrocontadetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroContaDetalleConstantesFunciones.getOrderByListaParametroContaDetalle();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroContaDetalleConstantesFunciones.getOrderByListaParametroContaDetalle();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroContaDetalle parametrocontadetalle:parametrocontadetalleLogic.getParametroContaDetalles()) {
				if(parametrocontadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocontadetalleTotales=parametrocontadetalle;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroContaDetalle parametrocontadetalle:this.parametrocontadetalles) {
				if(parametrocontadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocontadetalleTotales=parametrocontadetalle;
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
			this.parametrocontadetalleAux=new ParametroContaDetalle();
			this.parametrocontadetalleAux.setsType(Constantes2.S_TOTALES);
			this.parametrocontadetalleAux.setIsNew(false);
			this.parametrocontadetalleAux.setIsChanged(false);
			this.parametrocontadetalleAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroContaDetalleConstantesFunciones.TotalizarValoresFilaParametroContaDetalle(this.parametrocontadetalleLogic.getParametroContaDetalles(),this.parametrocontadetalleAux);
				
				this.parametrocontadetalleLogic.getParametroContaDetalles().add(this.parametrocontadetalleAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroContaDetalleConstantesFunciones.TotalizarValoresFilaParametroContaDetalle(this.parametrocontadetalles,this.parametrocontadetalleAux);
				
				this.parametrocontadetalles.add(this.parametrocontadetalleAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrocontadetalleTotales=new ParametroContaDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrocontadetalleLogic.getParametroContaDetalles().remove(parametrocontadetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrocontadetalles.remove(parametrocontadetalleTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrocontadetalleTotales=new ParametroContaDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroContaDetalle parametrocontadetalle:parametrocontadetalleLogic.getParametroContaDetalles()) {
				if(parametrocontadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocontadetalleTotales=parametrocontadetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroContaDetalleConstantesFunciones.TotalizarValoresFilaParametroContaDetalle(this.parametrocontadetalleLogic.getParametroContaDetalles(),parametrocontadetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroContaDetalle parametrocontadetalle:this.parametrocontadetalles) {
				if(parametrocontadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocontadetalleTotales=parametrocontadetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroContaDetalleConstantesFunciones.TotalizarValoresFilaParametroContaDetalle(this.parametrocontadetalles,parametrocontadetalleTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroContaDetallesFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroContaDetallesFK_IdParametroConta()throws Exception {
		try {
			sAccionBusqueda="FK_IdParametroConta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroContaDetallesFK_IdParametroContaDetalle()throws Exception {
		try {
			sAccionBusqueda="FK_IdParametroContaDetalle";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroContaDetallesFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontadetalleLogic.getParametroContaDetallesFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroContaDetallesFK_IdParametroConta(String sFinalQuery,Long id_parametro_conta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontadetalleLogic.getParametroContaDetallesFK_IdParametroConta(sFinalQuery,this.pagination,id_parametro_conta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroContaDetallesFK_IdParametroContaDetalle(String sFinalQuery,Long id_tipo_parametro_conta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontadetalleLogic.getParametroContaDetallesFK_IdParametroContaDetalle(sFinalQuery,this.pagination,id_tipo_parametro_conta);
				
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
	
	public void inicializarPermisosParametroContaDetalle() {
		this.isPermisoTodoParametroContaDetalle=false;
		this.isPermisoNuevoParametroContaDetalle=false;
		this.isPermisoActualizarParametroContaDetalle=false;
		this.isPermisoActualizarOriginalParametroContaDetalle=false;
		this.isPermisoEliminarParametroContaDetalle=false;
		this.isPermisoGuardarCambiosParametroContaDetalle=false;
		this.isPermisoConsultaParametroContaDetalle=false;
		this.isPermisoBusquedaParametroContaDetalle=false;
		this.isPermisoReporteParametroContaDetalle=false;		
		this.isPermisoOrdenParametroContaDetalle=false;		
		this.isPermisoPaginacionMedioParametroContaDetalle=false;		
		this.isPermisoPaginacionAltoParametroContaDetalle=false;
		this.isPermisoPaginacionTodoParametroContaDetalle=false;
		this.isPermisoCopiarParametroContaDetalle=false;		
		this.isPermisoVerFormParametroContaDetalle=false;		
		this.isPermisoDuplicarParametroContaDetalle=false;		
		this.isPermisoOrdenParametroContaDetalle=false;		
	}
	
	public void setPermisosUsuarioParametroContaDetalle(Boolean isPermiso) {
		this.isPermisoTodoParametroContaDetalle=isPermiso;
		this.isPermisoNuevoParametroContaDetalle=isPermiso;
		this.isPermisoActualizarParametroContaDetalle=isPermiso;
		this.isPermisoActualizarOriginalParametroContaDetalle=isPermiso;
		this.isPermisoEliminarParametroContaDetalle=isPermiso;
		this.isPermisoGuardarCambiosParametroContaDetalle=isPermiso;
		this.isPermisoConsultaParametroContaDetalle=isPermiso;
		this.isPermisoBusquedaParametroContaDetalle=isPermiso;
		this.isPermisoReporteParametroContaDetalle=isPermiso;
		this.isPermisoOrdenParametroContaDetalle=isPermiso;		
		this.isPermisoPaginacionMedioParametroContaDetalle=isPermiso;		
		this.isPermisoPaginacionAltoParametroContaDetalle=isPermiso;		
		this.isPermisoPaginacionTodoParametroContaDetalle=isPermiso;		
		this.isPermisoCopiarParametroContaDetalle=isPermiso;		
		this.isPermisoVerFormParametroContaDetalle=isPermiso;		
		this.isPermisoDuplicarParametroContaDetalle=isPermiso;
		this.isPermisoOrdenParametroContaDetalle=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroContaDetalle(Boolean isPermiso) {
		//this.isPermisoTodoParametroContaDetalle=isPermiso;
		this.isPermisoNuevoParametroContaDetalle=isPermiso;
		this.isPermisoActualizarParametroContaDetalle=isPermiso;
		this.isPermisoActualizarOriginalParametroContaDetalle=isPermiso;
		this.isPermisoEliminarParametroContaDetalle=isPermiso;
		this.isPermisoGuardarCambiosParametroContaDetalle=isPermiso;
		//this.isPermisoConsultaParametroContaDetalle=isPermiso;
		//this.isPermisoBusquedaParametroContaDetalle=isPermiso;
		//this.isPermisoReporteParametroContaDetalle=isPermiso;
		//this.isPermisoOrdenParametroContaDetalle=isPermiso;		
		//this.isPermisoPaginacionMedioParametroContaDetalle=isPermiso;		
		//this.isPermisoPaginacionAltoParametroContaDetalle=isPermiso;		
		//this.isPermisoPaginacionTodoParametroContaDetalle=isPermiso;		
		//this.isPermisoCopiarParametroContaDetalle=isPermiso;		
		//this.isPermisoDuplicarParametroContaDetalle=isPermiso;
		//this.isPermisoOrdenParametroContaDetalle=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroContaDetalleClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroContaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroContaDetalle(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroContaDetalleClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroContaDetalleClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroContaDetalleClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroContaDetalleClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroContaDetalle() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroContaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroContaDetalleConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroContaDetalle=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroContaDetalle=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroContaDetalle=this.isPermisoActualizarParametroContaDetalle;
			this.isPermisoEliminarParametroContaDetalle=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroContaDetalle=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroContaDetalle=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroContaDetalle=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroContaDetalle=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroContaDetalle=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroContaDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroContaDetalle=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroContaDetalle=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroContaDetalle=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroContaDetalle=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroContaDetalle=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroContaDetalle=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroContaDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroContaDetalle.setToolTipText(this.jTableDatosParametroContaDetalle.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroContaDetalle(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroContaDetalle(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroContaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroContaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroContaDetalle() throws Exception {
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
	public void inicializarCombosForeignKeyParametroContaDetalleListas()throws Exception {
		try	{						
			
				this.parametrocontasForeignKey=new ArrayList();
				this.tipoparametrocontasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroContaDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroContaDetalleJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroContaDetalleListas(false);
			} else {
			
				this.cargarCombosForeignKeyParametroContaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoParametroContaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyParametroContaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.parametrocontasForeignKey==null||this.parametrocontasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ParametroContaConstantesFunciones.getArrayColumnasGlobalesParametroConta(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ParametroContaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ParametroContaConstantesFunciones.SFINALQUERY;

				this.cargarCombosParametroContasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoParametroContaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoparametrocontasForeignKey==null||this.tipoparametrocontasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoParametroContaConstantesFunciones.getArrayColumnasGlobalesTipoParametroConta(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoParametroContaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoParametroContaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoParametroContasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyParametroContaDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroContaDetalleParameterReturnGeneral parametrocontadetalleReturnGeneral=new ParametroContaDetalleParameterReturnGeneral();
						
			


				String finalQueryGlobalParametroConta="";

				if(((this.parametrocontasForeignKey==null||this.parametrocontasForeignKey.size()<=0) && this.parametrocontadetalleConstantesFunciones.cargarid_parametro_contaParametroContaDetalle)
					 || (this.esRecargarFks && this.parametrocontadetalleConstantesFunciones.cargarid_parametro_contaParametroContaDetalle)) {

					if(!this.parametrocontadetalleSessionBean.getisBusquedaDesdeForeignKeySesionParametroConta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ParametroContaConstantesFunciones.getArrayColumnasGlobalesParametroConta(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalParametroConta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ParametroContaConstantesFunciones.TABLENAME);

						finalQueryGlobalParametroConta=Funciones.GetFinalQueryAppend(finalQueryGlobalParametroConta, "");
						finalQueryGlobalParametroConta+=ParametroContaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosParametroContasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalParametroConta=" WHERE " + ConstantesSql.ID + "="+parametrocontadetalleSessionBean.getlidParametroContaActual();
					}
				} else {
					finalQueryGlobalParametroConta="NONE";
				}


				String finalQueryGlobalTipoParametroConta="";

				if(((this.tipoparametrocontasForeignKey==null||this.tipoparametrocontasForeignKey.size()<=0) && this.parametrocontadetalleConstantesFunciones.cargarid_tipo_parametro_contaParametroContaDetalle)
					 || (this.esRecargarFks && this.parametrocontadetalleConstantesFunciones.cargarid_tipo_parametro_contaParametroContaDetalle)) {

					if(!this.parametrocontadetalleSessionBean.getisBusquedaDesdeForeignKeySesionTipoParametroConta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoParametroContaConstantesFunciones.getArrayColumnasGlobalesTipoParametroConta(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoParametroConta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoParametroContaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoParametroConta=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoParametroConta, "");
						finalQueryGlobalTipoParametroConta+=TipoParametroContaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoParametroContasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoParametroConta=" WHERE " + ConstantesSql.ID + "="+parametrocontadetalleSessionBean.getlidTipoParametroContaActual();
					}
				} else {
					finalQueryGlobalTipoParametroConta="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.parametrocontadetalleConstantesFunciones.cargarid_cuenta_contableParametroContaDetalle)
					 || (this.esRecargarFks && this.parametrocontadetalleConstantesFunciones.cargarid_cuenta_contableParametroContaDetalle)) {

					if(!this.parametrocontadetalleSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+parametrocontadetalleSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametrocontadetalleReturnGeneral=parametrocontadetalleLogic.cargarCombosLoteForeignKeyParametroContaDetalle(finalQueryGlobalParametroConta,finalQueryGlobalTipoParametroConta,finalQueryGlobalCuentaContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalParametroConta.equals("NONE")) {
				this.parametrocontasForeignKey=parametrocontadetalleReturnGeneral.getparametrocontasForeignKey();
			}

			if(!finalQueryGlobalTipoParametroConta.equals("NONE")) {
				this.tipoparametrocontasForeignKey=parametrocontadetalleReturnGeneral.gettipoparametrocontasForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=parametrocontadetalleReturnGeneral.getcuentacontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroContaDetalle()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyParametroConta();
			this.addItemDefectoCombosForeignKeyTipoParametroConta();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyParametroConta()throws Exception {
		try {
			if(this.parametrocontadetalleSessionBean==null) {
				this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
			}

			if(!this.parametrocontadetalleSessionBean.getisBusquedaDesdeForeignKeySesionParametroConta()) {
				ParametroConta parametroconta=new ParametroConta();
				ParametroContaConstantesFunciones.setParametroContaDescripcion(parametroconta,Constantes.SMENSAJE_ESCOJA_OPCION);
				parametroconta.setId(null);

				if(!ParametroContaConstantesFunciones.ExisteEnLista(this.parametrocontasForeignKey,parametroconta,true)) {

					this.parametrocontasForeignKey.add(0,parametroconta);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoParametroConta()throws Exception {
		try {

			if(!this.parametrocontadetalleSessionBean.getisBusquedaDesdeForeignKeySesionTipoParametroConta()) {
				TipoParametroConta tipoparametroconta=new TipoParametroConta();
				TipoParametroContaConstantesFunciones.setTipoParametroContaDescripcion(tipoparametroconta,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoparametroconta.setId(null);

				if(!TipoParametroContaConstantesFunciones.ExisteEnLista(this.tipoparametrocontasForeignKey,tipoparametroconta,true)) {

					this.tipoparametrocontasForeignKey.add(0,tipoparametroconta);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.parametrocontadetalleSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
	
	public void initActionsCombosTodosForeignKeyParametroContaDetalle()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroContaDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroContaDetalle()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroContaDetalle();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroContaDetalle(ParametroContaDetalle parametrocontadetalle)throws Exception {	
		try {
			
			this.setActualParametroContaForeignKey(parametrocontadetalle.getid_parametro_conta(),false,"Formulario");
			this.setActualTipoParametroContaForeignKey(parametrocontadetalle.getid_tipo_parametro_conta(),false,"Formulario");
			this.setActualCuentaContableForeignKey(parametrocontadetalle.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroContaDetalle(ParametroContaDetalle parametrocontadetalle,String sTipoEvento)throws Exception {	
		try {
			
			

				if(parametrocontadetalle.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableParametroContaDetalle")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(parametrocontadetalle.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroContaDetalle()throws Exception {	
		try {
			
			this.setActualParametroContaForeignKey(this.parametrocontadetalleConstantesFunciones.getid_parametro_conta(),false,"Formulario");
			this.setActualTipoParametroContaForeignKey(this.parametrocontadetalleConstantesFunciones.getid_tipo_parametro_conta(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.parametrocontadetalleConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroContaDetalle()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroContaDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroContaDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroContaDetalle()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroContaDetalle()throws Exception {
		try {
			

			this.cargarCombosFrameParametroContasForeignKey("Todos");
			this.cargarCombosFrameTipoParametroContasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroContaDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameParametroContasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoParametroContasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroContaDetalle()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle!=null && this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle!=null && this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle!=null && this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ParametroContaDetalleBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroContaDetalleBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroContaDetalleBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean(); 
		this.parametrocontadetalleConstantesFunciones=new ParametroContaDetalleConstantesFunciones(); 
		this.parametrocontadetalleBean=new ParametroContaDetalle();//(this.parametrocontadetalleConstantesFunciones); 		
		this.parametrocontadetalleReturnGeneral=new ParametroContaDetalleParameterReturnGeneral(); 
		
		this.parametrocontadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocontadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroContaDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroContaDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroContaDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroContaDetalle(true);
			
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
			
			this.parametrocontadetalleConstantesFunciones=new ParametroContaDetalleConstantesFunciones(); 
			this.parametrocontadetalleBean=new ParametroContaDetalle();//this.parametrocontadetalleConstantesFunciones); 			
			this.parametrocontadetalleReturnGeneral=new ParametroContaDetalleParameterReturnGeneral(); 
		
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Conta Detalle Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parametrocontadetalle=new ParametroContaDetalle();
			this.parametrocontadetalles = new ArrayList<ParametroContaDetalle>();
			this.parametrocontadetallesAux = new ArrayList<ParametroContaDetalle>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic=new ParametroContaDetalleLogic();
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.parametrocontadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametrocontadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroContaDetalle);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroContaDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroContaDetalle);	
					}
					
					if(this.jInternalFrameImportacionParametroContaDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroContaDetalle);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroContaDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroContaDetalle);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroContaDetalle);
				this.jInternalFrameDetalleFormParametroContaDetalle.setVisible(false);
				this.jInternalFrameDetalleFormParametroContaDetalle.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroContaDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroContaDetalle);
					this.jInternalFrameReporteDinamicoParametroContaDetalle.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroContaDetalle.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroContaDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroContaDetalle);
					this.jInternalFrameImportacionParametroContaDetalle.setVisible(false);
					this.jInternalFrameImportacionParametroContaDetalle.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroContaDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroContaDetalle);
					this.jInternalFrameOrderByParametroContaDetalle.setVisible(false);
					this.jInternalFrameOrderByParametroContaDetalle.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroContaDetalleActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroContaDetalleConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametrocontadetalleReturnGeneral=new ParametroContaDetalleParameterReturnGeneral();
			
			this.parametrocontadetalleParameterGeneral=new ParametroContaDetalleParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametrocontadetalleLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroContaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroContaDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrocontadetalleSessionBean.getEsGuardarRelacionado(),this.parametrocontadetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroContaDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrocontadetalleSessionBean.getEsGuardarRelacionado(),this.parametrocontadetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroContaDetalle=false;
			this.isVisibilidadCeldaDuplicarParametroContaDetalle=true;
			this.isVisibilidadCeldaCopiarParametroContaDetalle=true;
			this.isVisibilidadCeldaVerFormParametroContaDetalle=true;
			this.isVisibilidadCeldaOrdenParametroContaDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=false;
			this.isVisibilidadCeldaModificarParametroContaDetalle=false;
			this.isVisibilidadCeldaActualizarParametroContaDetalle=false;
			this.isVisibilidadCeldaEliminarParametroContaDetalle=false;
			this.isVisibilidadCeldaCancelarParametroContaDetalle=false;
			this.isVisibilidadCeldaGuardarParametroContaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=false;
			
			
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdParametroConta=true;
			this.isVisibilidadFK_IdParametroContaDetalle=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroContaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroContaDetalle();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroContaDetalle(false);
			
			this.setPermisosUsuarioParametroContaDetalle();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado() 
				|| (this.parametrocontadetalleSessionBean.getEsGuardarRelacionado() && this.parametrocontadetalleSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroContaDetalleClasesRelacionadas();
			}
			
			if(this.parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroContaDetalleClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroContaDetalle();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroContaDetalle();
			}
			
			if(!this.isPermisoBusquedaParametroContaDetalle) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroContaDetalle.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroContaDetalle,this.isPermisoPaginacionMedioParametroContaDetalle,this.isPermisoPaginacionTodoParametroContaDetalle);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroContaDetalleConstantesFunciones.getTiposSeleccionarParametroContaDetalle());
				
				this.tiposColumnasSelect=ParametroContaDetalleConstantesFunciones.getTiposSeleccionarParametroContaDetalle(true);
				
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
			//if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroContaDetalle();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroContaDetalle(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroContaDetalle(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroContaDetalle() ;
			
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
			
			this.parametrocontaLogic=new ParametroContaLogic();
			this.tipoparametrocontaLogic=new TipoParametroContaLogic();
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
				parametrocontadetalleImplementable= (ParametroContaDetalleImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroContaDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametrocontadetalleImplementableHome= (ParametroContaDetalleImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroContaDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametrocontadetalles= new ArrayList<ParametroContaDetalle>();
			this.parametrocontadetallesEliminados= new ArrayList<ParametroContaDetalle>();
						
			this.isEsNuevoParametroContaDetalle=false;
			this.esParaAccionDesdeFormularioParametroContaDetalle=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.parametrocontasForeignKey=new ArrayList<ParametroConta>() ;
			this.tipoparametrocontasForeignKey=new ArrayList<TipoParametroConta>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroContaDetalle(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroContaDetalle();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroContaDetalleConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroContaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroContaDetalle(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroContaDetalle();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroContaDetalle();
			}
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroContaDetalle.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroContaDetalle.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroContaDetalle.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroContaDetalle(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroContaDetalle: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroContaDetalle() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroContaDetalle")) {
				iIndex=this.jInternalFrameDetalleFormParametroContaDetalle.jTabbedPaneRelacionesParametroContaDetalle.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroContaDetalle.jTabbedPaneRelacionesParametroContaDetalle.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroContaDetalle();	
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
	
	public void cargarCombosForeignKeyParametroContaDetalle(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroContaDetalle(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroContaDetalle(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroContaDetalleListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroContaDetalle();
		
		this.cargarCombosFrameForeignKeyParametroContaDetalle();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroContaDetalle();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroContaDetalle();
		}
	}
	
	

	public void cargarCombosForeignKeyParametroConta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyParametroContaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyParametroConta();
				this.cargarCombosFrameParametroContasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaParametroConta(this.parametrocontasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoParametroConta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoParametroContaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoParametroConta();
				this.cargarCombosFrameTipoParametroContasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoParametroConta(this.tipoparametrocontasForeignKey);

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
	
	public void jButtonNuevoParametroContaDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
			
			if(jTableDatosParametroContaDetalle.getRowCount()>=1) {
				jTableDatosParametroContaDetalle.removeRowSelectionInterval(0, jTableDatosParametroContaDetalle.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroContaDetalle=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroContaDetalle(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroContaDetalle(true);			
			//this.parametrocontadetalle=new ParametroContaDetalle();
			//this.parametrocontadetalle.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroContaDetalle(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroContaDetalle() ;
			
			if(ParametroContaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroContaDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametrocontadetalle);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);				
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
			if(this.parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroContaDetalle: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroContaDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroContaDetalle.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroContaDetalle.getSelectedRows().length;			
			}
			
			parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroContaDetalle--;			
				//ParametroContaDetalle parametrocontadetalleAux= new ParametroContaDetalle();			
				//parametrocontadetalleAux.setId(this.iIdNuevoParametroContaDetalle);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroContaDetalle parametrocontadetalleOrigen=new ParametroContaDetalle();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroContaDetalle parametrocontadetalleOrigen : parametrocontadetallesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametrocontadetalleOrigen =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontadetalleOrigen =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroContaDetalle();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametrocontadetalle.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroContaDetalle(parametrocontadetalleOrigen,this.parametrocontadetalle,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrocontadetalleLogic.getParametroContaDetalles().add(this.parametrocontadetalleAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrocontadetalles.add(this.parametrocontadetalleAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroContaDetalle(false);
				
				this.jTableDatosParametroContaDetalle.setRowSelectionInterval(this.getIndiceNuevoParametroContaDetalle(), this.getIndiceNuevoParametroContaDetalle());
				
				int iLastRow =  this.jTableDatosParametroContaDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroContaDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroContaDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroContaDetalle(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();									
		
			ParametroContaDetalle parametrocontadetalleOrigen=new ParametroContaDetalle();
			ParametroContaDetalle parametrocontadetalleDestino=new ParametroContaDetalle();
				
			parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroContaDetalle.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametrocontadetallesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroContaDetalle.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontadetalleOrigen =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrocontadetalleOrigen =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontadetalleDestino =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrocontadetalleDestino =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametrocontadetalleOrigen =parametrocontadetallesSeleccionados.get(0);
				parametrocontadetalleDestino =parametrocontadetallesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroContaDetalle(parametrocontadetalleOrigen,parametrocontadetalleDestino,true,false);
				
				parametrocontadetalleDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrocontadetalleDestino,parametrocontadetalleLogic.getParametroContaDetalles());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocontadetalleDestino,parametrocontadetalles);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroContaDetalle(false);
				
				//this.jTableDatosParametroContaDetalle.setRowSelectionInterval(this.getIndiceNuevoParametroContaDetalle(), this.getIndiceNuevoParametroContaDetalle());
				
				int iLastRow =  this.jTableDatosParametroContaDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroContaDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroContaDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroContaDetalle(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroContaDetalle.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroContaDetalle.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroContaDetalle.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroContaDetalle.setVisible(!isVisible);
			this.jPanelPaginacionParametroContaDetalle.setVisible(!isVisible);
			this.jPanelAccionesParametroContaDetalle.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroContaDetalle();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroContaDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroContaDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroContaDetalle();
			
			this.abrirFrameOrderByParametroContaDetalle();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroContaDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroContaDetalle(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroContaDetalle);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroContaDetalle.isMaximum()) {
					this.jInternalFrameDetalleFormParametroContaDetalle.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroContaDetalle.setSize(this.jInternalFrameDetalleFormParametroContaDetalle.iWidthFormulario,this.jInternalFrameDetalleFormParametroContaDetalle.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroContaDetalle.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroContaDetalle.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroContaDetalle.isMaximum()) {
						this.jInternalFrameDetalleFormParametroContaDetalle.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroContaDetalle.jContentPaneDetalleParametroContaDetalle.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroContaDetalle.jTabbedPaneRelacionesParametroContaDetalle.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroContaDetalle.jContentPaneDetalleParametroContaDetalle.getWidth(),ParametroContaDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroContaDetalle.jTabbedPaneRelacionesParametroContaDetalle.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroContaDetalle.jContentPaneDetalleParametroContaDetalle.getWidth(),ParametroContaDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroContaDetalle.jTabbedPaneRelacionesParametroContaDetalle.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroContaDetalle.jContentPaneDetalleParametroContaDetalle.getWidth(),ParametroContaDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroContaDetalle.setVisible(true);
	        this.jInternalFrameDetalleFormParametroContaDetalle.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroContaDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroContaDetalle==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroContaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroContaDetalle,false,this);
				} else {
					this.jInternalFrameOrderByParametroContaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroContaDetalle,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroContaDetalle);
				this.jInternalFrameOrderByParametroContaDetalle.setVisible(false);
				this.jInternalFrameOrderByParametroContaDetalle.setSelected(false);
				
				this.jInternalFrameOrderByParametroContaDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroContaDetalle"));
				
				this.inicializarActualizarBindingTablaOrderByParametroContaDetalle();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroContaDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroContaDetalle==null) {
				
				this.jInternalFrameImportacionParametroContaDetalle=new ImportacionJInternalFrame(ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroContaDetalle);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroContaDetalle);
				this.jInternalFrameImportacionParametroContaDetalle.setVisible(false);
				this.jInternalFrameImportacionParametroContaDetalle.setSelected(false);


				this.jInternalFrameImportacionParametroContaDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroContaDetalle"));
				this.jInternalFrameImportacionParametroContaDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroContaDetalle"));
				this.jInternalFrameImportacionParametroContaDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroContaDetalle"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroContaDetalle() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroContaDetalle==null) {
				this.jInternalFrameReporteDinamicoParametroContaDetalle=new ReporteDinamicoJInternalFrame(ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroContaDetalle);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroContaDetalle);
				this.jInternalFrameReporteDinamicoParametroContaDetalle.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroContaDetalle.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroContaDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroContaDetalle"));
				this.jInternalFrameReporteDinamicoParametroContaDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroContaDetalle"));
				this.jInternalFrameReporteDinamicoParametroContaDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroContaDetalle"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroContaDetalle();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroContaDetalle() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroContaDetalle);
			
	       	this.jInternalFrameDetalleFormParametroContaDetalle.setVisible(false);
	        this.jInternalFrameDetalleFormParametroContaDetalle.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroContaDetalle.dispose();
			//this.jInternalFrameDetalleFormParametroContaDetalle=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroContaDetalle() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroContaDetalle.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroContaDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroContaDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroContaDetalle.setVisible(true);
	        this.jInternalFrameImportacionParametroContaDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroContaDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroContaDetalle.setVisible(true);
	        this.jInternalFrameOrderByParametroContaDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroContaDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroContaDetalle.setVisible(false);
	        this.jInternalFrameOrderByParametroContaDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroContaDetalle() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroContaDetalle.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroContaDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroContaDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroContaDetalle.setVisible(false);
	        this.jInternalFrameImportacionParametroContaDetalle.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderParametroContaDetalle=(TitledBorder)this.jScrollPanelDatosParametroContaDetalle.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderParametroContaDetalle.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroContaDetalle(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroContaDetalle(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroContaDetalle(true);
			//this.isEsNuevoParametroContaDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroContaDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroContaDetalle(false) ;
			
			if(parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroContaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroContaDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroContaDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroContaDetalleActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroContaDetalle(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroContaDetalle(true);
			//this.isEsNuevoParametroContaDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametrocontadetalle.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroContaDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroContaDetalle(false) ;
			
			if(ParametroContaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroContaDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroContaDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.parametrocontadetalleConstantesFunciones.cargarid_cuenta_contableParametroContaDetalle) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingParametroContaDetalle(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaParametroConta(List<ParametroConta> parametrocontasForeignKey)throws Exception{
		TableColumn tableColumnParametroConta=this.jTableDatosParametroContaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContaDetalle,ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA));
		TableCellEditor tableCellEditorParametroConta =tableColumnParametroConta.getCellEditor();

		ParametroContaTableCell parametrocontaTableCellFk=(ParametroContaTableCell)tableCellEditorParametroConta;

		if(parametrocontaTableCellFk!=null) {
			parametrocontaTableCellFk.setparametrocontasForeignKey(parametrocontasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroContaDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//parametrocontaTableCellFk.setRowActual(intSelectedRow);
			//parametrocontaTableCellFk.setparametrocontasForeignKeyActual(parametrocontasForeignKey);
		//}


		if(parametrocontaTableCellFk!=null) {
			parametrocontaTableCellFk.RecargarParametroContasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoParametroConta(List<TipoParametroConta> tipoparametrocontasForeignKey)throws Exception{
		TableColumn tableColumnTipoParametroConta=this.jTableDatosParametroContaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContaDetalle,ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA));
		TableCellEditor tableCellEditorTipoParametroConta =tableColumnTipoParametroConta.getCellEditor();

		TipoParametroContaTableCell tipoparametrocontaTableCellFk=(TipoParametroContaTableCell)tableCellEditorTipoParametroConta;

		if(tipoparametrocontaTableCellFk!=null) {
			tipoparametrocontaTableCellFk.settipoparametrocontasForeignKey(tipoparametrocontasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroContaDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoparametrocontaTableCellFk.setRowActual(intSelectedRow);
			//tipoparametrocontaTableCellFk.settipoparametrocontasForeignKeyActual(tipoparametrocontasForeignKey);
		//}


		if(tipoparametrocontaTableCellFk!=null) {
			tipoparametrocontaTableCellFk.RecargarTipoParametroContasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosParametroContaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContaDetalle,ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroContaDetalle.getSelectedRow();

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
	
	public void jButtonActualizarParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroContaDetalle(false);
			
			//if(!this.isEsNuevoParametroContaDetalle) {								
				int intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.parametrocontadetalle,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
				
			}
			
			if(this.permiteMantenimiento(this.parametrocontadetalle)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroContaDetalle=true;
					this.inicializarActualizarBindingTablaParametroContaDetalle(false);
					this.isEsNuevoParametroContaDetalle=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroContaDetalle=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroContaDetalle=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroContaDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroContaDetalle(false);
				
				this.habilitarDeshabilitarControlesParametroContaDetalle(false);
			
												
				
				if(ParametroContaDetalleJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroContaDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroContaDetalleActionPerformed(evt,parametrocontadetalleSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroContaDetalle(this.parametrocontadetalle,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroContaDetalle.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametrocontadetalleSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametrocontadetalle.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroContaDetalle.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContaDetalle.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				this.parametrocontadetalle.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				this.parametrocontadetalle.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametrocontadetalle)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroContaDetalleModel) this.jTableDatosParametroContaDetalle.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroContaDetalle=true;
				this.inicializarActualizarBindingTablaParametroContaDetalle(false);
				this.isEsNuevoParametroContaDetalle=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroContaDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroContaDetalle(false);
				
				this.habilitarDeshabilitarControlesParametroContaDetalle(false);
				
				
				
				if(ParametroContaDetalleJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroContaDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroContaDetalle.getRowCount()>=1) {
				jTableDatosParametroContaDetalle.removeRowSelectionInterval(0, jTableDatosParametroContaDetalle.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroContaDetalle(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroContaDetalle(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroContaDetalle(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroContaDetalle(false) ;
			
			this.isEsNuevoParametroContaDetalle=false;
			
			if(ParametroContaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroContaDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroContaDetalle(false);
				
				//SI ES MANUAL
				if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroContaDetalle();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroContaDetalle--;			
			//ParametroContaDetalle parametrocontadetalleAux= new ParametroContaDetalle();			
			//parametrocontadetalleAux.setId(this.iIdNuevoParametroContaDetalle);
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroContaDetalle();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
			
			this.parametrocontadetalle.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametrocontadetalleLogic.getParametroContaDetalles().add(this.parametrocontadetalleAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametrocontadetalles.add(this.parametrocontadetalleAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroContaDetalle(false);
			
			this.jTableDatosParametroContaDetalle.setRowSelectionInterval(this.getIndiceNuevoParametroContaDetalle(), this.getIndiceNuevoParametroContaDetalle());
			
			int iLastRow =  this.jTableDatosParametroContaDetalle.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroContaDetalle.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroContaDetalle.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroContaDetalle(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroContaDetalle(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroContaDetalle(false);
			
			//SI ES MANUAL
			if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroContaDetalle();
			}
			
			//this.abrirFrameTreeParametroContaDetalle();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro Conta DetalleS ?", "MANTENIMIENTO DE Parametro Conta Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroContaDetalle.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroContaDetalle();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametrocontadetalleReturnGeneral=parametrocontadetalleLogic.procesarImportacionParametroContaDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametrocontadetalleParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroContaDetalleReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroContaDetalle.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroContaDetalle.setFileImportacion(this.jInternalFrameImportacionParametroContaDetalle.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroContaDetalle.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroContaDetalle.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroContaDetalle.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroContaDetalle.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();		

		parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroContaDetalleBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroContaDetalleBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroContaDetalles("Todos",parametrocontadetallesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Conta Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ParametroConta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ParametroConta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ParametroConta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ParametroConta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoParametroConta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoParametroConta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoParametroConta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoParametroConta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroContaDetalle.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA:
					sNombreCampoCategoria="id_parametro_conta";
					break;

				case ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA:
					sNombreCampoCategoria="id_tipo_parametro_conta";
					break;

				case ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA:
					sNombreCampoCategoriaValor="id_parametro_conta";
					break;

				case ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA:
					sNombreCampoCategoriaValor="id_tipo_parametro_conta";
					break;

				case ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Parametro Conta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_parametro_conta");
					break;

				case ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Parametro Conta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_parametro_conta");
					break;

				case ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();		
		
		parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontadetalle";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroContaDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA);
					iRow++;

					for(ParametroContaDetalle parametrocontadetalle:parametrocontadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontadetalle.getparametroconta_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA);
					iRow++;

					for(ParametroContaDetalle parametrocontadetalle:parametrocontadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontadetalle.gettipoparametroconta_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(ParametroContaDetalle parametrocontadetalle:parametrocontadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontadetalle.getcuentacontable_descripcion());
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
			//	this.getFilaCabeceraExportarExcelParametroContaDetalle(row);				
			//	iRow++;
			//}				
			
			//for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetallesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroContaDetalle(parametrocontadetalleAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Conta Detalle",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroContaDetalle(false);
			
			//SI ES MANUAL
			if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroContaDetalle();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroContaDetalle(false);
			
			//SI ES MANUAL
			if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroContaDetalle();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroContaDetalle(false);
			
			//SI ES MANUAL
			if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroContaDetalle();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroContaDetalle() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroContaDetalle.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroContaDetalle.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroContaDetalle.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroContaDetalle.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroContaDetalle.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroContaDetalle.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroContaDetalle.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroContaDetalle(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroContaDetalle(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroContaDetalle(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroContaDetalle(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroContaDetalle(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroContaDetalle(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroContaDetalle(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroContaDetalle(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroContaDetalle() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroContaDetalle();
		
		this.inicializarActualizarBindingBotonesManualParametroContaDetalle(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroContaDetalle();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroContaDetalle() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroContaDetalle(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroContaDetalle(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroContaDetalle.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroContaDetalle.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroContaDetalle.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroContaDetalle.jCheckBoxPostAccionNuevoParametroContaDetalle.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroContaDetalle.jCheckBoxPostAccionSinCerrarParametroContaDetalle.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroContaDetalle.jCheckBoxPostAccionSinMensajeParametroContaDetalle.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroContaDetalle.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroContaDetalle.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroContaDetalle.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
				this.jInternalFrameDetalleFormParametroContaDetalle.jCheckBoxPostAccionNuevoParametroContaDetalle.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroContaDetalle.jCheckBoxPostAccionSinCerrarParametroContaDetalle.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroContaDetalle.jCheckBoxPostAccionSinMensajeParametroContaDetalle.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroContaDetalle.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroContaDetalle.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroContaDetalle.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroContaDetalle!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroContaDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroContaDetalle.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroContaDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroContaDetalle.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroContaDetalle!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroContaDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroContaDetalle.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroContaDetalle.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroContaDetalle(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroContaDetalle(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroContaDetalle() throws Exception {
		try	{
			if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroContaDetalle();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroContaDetalle() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroContaDetalle() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroContaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroContaDetalle.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroContaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroContaDetalle.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroContaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroContaDetalle.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroContaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroContaDetalle.addItem(reporte);
			}
			
			
			if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroContaDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroContaDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroContaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroContaDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroContaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroContaDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroContaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroContaDetalle.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroContaDetalle.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroContaDetalle();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroContaDetalle() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroContaDetalle!=null) {
				this.jInternalFrameReporteDinamicoParametroContaDetalle.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroContaDetalle.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroContaDetalle!=null) {
				this.jInternalFrameReporteDinamicoParametroContaDetalle.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroContaDetalle.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroContaDetalle!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroContaDetalle.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroContaDetalle()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableParametroContaDetalle.getSelectedItem()).getId();}
		if(this.jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.getSelectedItem()!=null){this.id_parametro_contaFK_IdParametroConta=((ParametroConta)this.jComboBoxid_parametro_contaFK_IdParametroContaParametroContaDetalle.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.getSelectedItem()!=null){this.id_tipo_parametro_contaFK_IdParametroContaDetalle=((TipoParametroConta)this.jComboBoxid_tipo_parametro_contaFK_IdParametroContaDetalleParametroContaDetalle.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroContaDetalle(Boolean esInicializar) throws Exception {				
		if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroContaDetalle();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroContaDetalle() throws Exception {
		this.inicializarActualizarBindingTablaParametroContaDetalle(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroContaDetalle() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroContaDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroContaDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroContaDetalleOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContaDetalleOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroContaDetallePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroContaDetallePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroContaDetalle(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametrocontadetalleLogic.getParametroContaDetalles().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametrocontadetalles.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroContaDetalle.setModel(new ParametroContaDetalleModel(this.parametrocontadetalleLogic.getParametroContaDetalles(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroContaDetalle.setModel(new ParametroContaDetalleModel(this.parametrocontadetalles,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroContaDetalle!=null && this.jInternalFrameOrderByParametroContaDetalle.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroContaDetalle();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroContaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContaDetalle,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroContaDetallePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO,parametrocontadetalleConstantesFunciones.resaltarSeleccionarParametroContaDetalle,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO,parametrocontadetalleConstantesFunciones.resaltarSeleccionarParametroContaDetalle,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroContaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContaDetalle,ParametroContaDetalleConstantesFunciones.LABEL_ID));

		if(this.parametrocontadetalleConstantesFunciones.mostraridParametroContaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContaDetalleConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrocontadetalleConstantesFunciones.resaltaridParametroContaDetalle,this.parametrocontadetalleConstantesFunciones.activaridParametroContaDetalle,this,true,"idParametroContaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrocontadetalleConstantesFunciones.resaltaridParametroContaDetalle,this.parametrocontadetalleConstantesFunciones.activaridParametroContaDetalle,this,true,"idParametroContaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContaDetalle,ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA));

		if(this.parametrocontadetalleConstantesFunciones.mostrarid_parametro_contaParametroContaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ParametroContaTableCell(this.parametrocontasForeignKey,this.parametrocontadetalleConstantesFunciones.resaltarid_parametro_contaParametroContaDetalle,this,this.parametrocontadetalleConstantesFunciones.activarid_parametro_contaParametroContaDetalle));
			tableColumn.setCellEditor(new ParametroContaTableCell(this.parametrocontasForeignKey,this.parametrocontadetalleConstantesFunciones.resaltarid_parametro_contaParametroContaDetalle,this,this.parametrocontadetalleConstantesFunciones.activarid_parametro_contaParametroContaDetalle,true,"id_parametro_contaParametroContaDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroContaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContaDetalle,ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA));

		if(this.parametrocontadetalleConstantesFunciones.mostrarid_tipo_parametro_contaParametroContaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoParametroContaTableCell(this.tipoparametrocontasForeignKey,this.parametrocontadetalleConstantesFunciones.resaltarid_tipo_parametro_contaParametroContaDetalle,this,this.parametrocontadetalleConstantesFunciones.activarid_tipo_parametro_contaParametroContaDetalle));
			tableColumn.setCellEditor(new TipoParametroContaTableCell(this.tipoparametrocontasForeignKey,this.parametrocontadetalleConstantesFunciones.resaltarid_tipo_parametro_contaParametroContaDetalle,this,this.parametrocontadetalleConstantesFunciones.activarid_tipo_parametro_contaParametroContaDetalle,true,"id_tipo_parametro_contaParametroContaDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroContaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContaDetalle,ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.parametrocontadetalleConstantesFunciones.mostrarid_cuenta_contableParametroContaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.parametrocontadetalleConstantesFunciones.resaltarid_cuenta_contableParametroContaDetalle,this,this.parametrocontadetalleConstantesFunciones.activarid_cuenta_contableParametroContaDetalle));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.parametrocontadetalleConstantesFunciones.resaltarid_cuenta_contableParametroContaDetalle,this,this.parametrocontadetalleConstantesFunciones.activarid_cuenta_contableParametroContaDetalle,true,"id_cuenta_contableParametroContaDetalle","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new ParametroContaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroContaDetalle.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroContaDetalle.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroContaDetalle.addColumn(tableColumn);
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
			
			this.jTableDatosParametroContaDetalle.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroContaDetalle.moveColumn(this.jTableDatosParametroContaDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroContaDetalle.moveColumn(this.jTableDatosParametroContaDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroContaDetalle.moveColumn(this.jTableDatosParametroContaDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroContaDetalle.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroContaDetalle.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroContaDetalle,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroContaDetalle.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroContaDetalle.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroContaDetalle.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroContaDetalle.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroContaDetalle.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametrocontadetalleLogic.getParametroContaDetalles().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametrocontadetalles.size()-1;
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
		//this.jTableDatosParametroContaDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroContaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroContaDetalle();
			
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
				
				//this.isEsNuevoParametroContaDetalle=false;
					
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
				if(this.parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroContaDetalle==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroContaDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroContaDetalle.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametrocontadetalle.getsType().equals("DUPLICADO")
				   || this.parametrocontadetalle.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroContaDetalle=true;
				
				} else {
					this.isEsNuevoParametroContaDetalle=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
					if(this.parametrocontadetalle.getId()>=0 && !this.parametrocontadetalle.getIsNew()) {						
						this.isEsNuevoParametroContaDetalle=false;
						
					} else {
						this.isEsNuevoParametroContaDetalle=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroContaDetalle(esRelaciones);						
				
				this.seleccionarParametroContaDetalle(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametrocontadetalle.getId()<0) {
					this.isEsNuevoParametroContaDetalle=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroContaDetalle(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroContaDetalle(evt,rowIndex);
				}	
				
				if(this.parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroContaDetalle: " + this.dDif); 
					}
				}								
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroContaDetalle(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametrocontadetalle)) {
					if(this.parametrocontadetalle.getId()>0) {
						this.parametrocontadetalle.setIsDeleted(true);
						
						this.parametrocontadetallesEliminados.add(this.parametrocontadetalle);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrocontadetalleLogic.getParametroContaDetalles().remove(this.parametrocontadetalle);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrocontadetalles.remove(this.parametrocontadetalle);				
					}
					
					
					((ParametroContaDetalleModel) this.jTableDatosParametroContaDetalle.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroContaDetalle(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroContaDetalle(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroContaDetalle) {
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroContaDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroContaDetalle.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroContaDetalle(this.parametrocontadetalle);
				}
				
				//ARCHITECTURE
				try {
					

					//ParametroConta
					if(!this.parametrocontadetalleConstantesFunciones.cargarid_parametro_contaParametroContaDetalle || this.parametrocontadetalleConstantesFunciones.event_dependid_parametro_contaParametroContaDetalle) {
						//this.cargarCombosParametroContasForeignKeyLista(" where id="+this.parametrocontadetalle.getid_parametro_conta());
									//this.inicializarActualizarBindingParametroContaDetalle(false,false);
						this.parametrocontasForeignKey=new ArrayList<ParametroConta>();

						if(parametrocontadetalle.getParametroConta()!=null) {
							this.parametrocontasForeignKey.add(parametrocontadetalle.getParametroConta());
						}

						this.addItemDefectoCombosForeignKeyParametroConta();
						this.cargarCombosFrameParametroContasForeignKey("Todos");
					}
					this.setActualParametroContaForeignKey(this.parametrocontadetalle.getid_parametro_conta(),false,"Formulario");

					//TipoParametroConta
					if(!this.parametrocontadetalleConstantesFunciones.cargarid_tipo_parametro_contaParametroContaDetalle || this.parametrocontadetalleConstantesFunciones.event_dependid_tipo_parametro_contaParametroContaDetalle) {
						//this.cargarCombosTipoParametroContasForeignKeyLista(" where id="+this.parametrocontadetalle.getid_tipo_parametro_conta());
									//this.inicializarActualizarBindingParametroContaDetalle(false,false);
						this.tipoparametrocontasForeignKey=new ArrayList<TipoParametroConta>();

						if(parametrocontadetalle.getTipoParametroConta()!=null) {
							this.tipoparametrocontasForeignKey.add(parametrocontadetalle.getTipoParametroConta());
						}

						this.addItemDefectoCombosForeignKeyTipoParametroConta();
						this.cargarCombosFrameTipoParametroContasForeignKey("Todos");
					}
					this.setActualTipoParametroContaForeignKey(this.parametrocontadetalle.getid_tipo_parametro_conta(),false,"Formulario");

					//CuentaContable
					if(!this.parametrocontadetalleConstantesFunciones.cargarid_cuenta_contableParametroContaDetalle || this.parametrocontadetalleConstantesFunciones.event_dependid_cuenta_contableParametroContaDetalle) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.parametrocontadetalle.getid_cuenta_contable());
									//this.inicializarActualizarBindingParametroContaDetalle(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(parametrocontadetalle.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(parametrocontadetalle.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.parametrocontadetalle.getid_cuenta_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroContaDetalle("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroContaDetalle(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroContaDetalle() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroContaDetalle(ParametroContaDetalle parametrocontadetalle) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroContaDetalle(parametrocontadetalle,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroContaDetalle(ParametroContaDetalle parametrocontadetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroContaDetalle(parametrocontadetalle);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroContaDetalle(parametrocontadetalle,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroContaDetalle(parametrocontadetalle);
	}
	
	public void setVariablesObjetoActualToFormularioParametroContaDetalle(ParametroContaDetalle parametrocontadetalle) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroContaDetalle.jLabelidParametroContaDetalle.setText(parametrocontadetalle.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroContaDetalle parametrocontadetalleLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametrocontadetalleLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroContaDetalle parametrocontadetalleLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametrocontadetalleLocal=this.parametrocontadetalle;
			} else {
				parametrocontadetalleLocal=this.parametrocontadetalleAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametrocontadetalleLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroContaDetalle(parametrocontadetalleLocal,true);
					
					if(parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametrocontadetalleLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametrocontadetalleLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroContaDetalle(ParametroContaDetalle parametrocontadetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroContaDetalle(parametrocontadetalle,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(parametrocontadetalle);
	}
	
	public void setVariablesFormularioToObjetoActualParametroContaDetalle(ParametroContaDetalle parametrocontadetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroContaDetalle(parametrocontadetalle,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroContaDetalle(ParametroContaDetalle parametrocontadetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroContaDetalle.jLabelidParametroContaDetalle.getText()==null || this.jInternalFrameDetalleFormParametroContaDetalle.jLabelidParametroContaDetalle.getText()=="" || this.jInternalFrameDetalleFormParametroContaDetalle.jLabelidParametroContaDetalle.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroContaDetalle.jLabelidParametroContaDetalle.setText("0");
			}

			if(conColumnasBase) {parametrocontadetalle.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroContaDetalle.jLabelidParametroContaDetalle.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroContaDetalleConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContaDetalle.jLabelIdParametroContaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroContaDetalle(ParametroContaDetalle parametrocontadetalleBean,ParametroContaDetalle parametrocontadetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parametrocontadetalleBean.getid_parametro_conta()!=null && !parametrocontadetalleBean.getid_parametro_conta().equals(-1L))) {parametrocontadetalle.setid_parametro_conta(parametrocontadetalleBean.getid_parametro_conta());}
			if(conDefault || (!conDefault && parametrocontadetalleBean.getid_tipo_parametro_conta()!=null && !parametrocontadetalleBean.getid_tipo_parametro_conta().equals(-1L))) {parametrocontadetalle.setid_tipo_parametro_conta(parametrocontadetalleBean.getid_tipo_parametro_conta());}
			if(conDefault || (!conDefault && parametrocontadetalleBean.getid_cuenta_contable()!=null && !parametrocontadetalleBean.getid_cuenta_contable().equals(-1L))) {parametrocontadetalle.setid_cuenta_contable(parametrocontadetalleBean.getid_cuenta_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroContaDetalle(ParametroContaDetalle parametrocontadetalleOrigen,ParametroContaDetalle parametrocontadetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrocontadetalleOrigen.getId()!=null && !parametrocontadetalleOrigen.getId().equals(0L))) {parametrocontadetalle.setId(parametrocontadetalleOrigen.getId());}}
			if(conDefault || (!conDefault && parametrocontadetalleOrigen.getid_parametro_conta()!=null && !parametrocontadetalleOrigen.getid_parametro_conta().equals(-1L))) {parametrocontadetalle.setid_parametro_conta(parametrocontadetalleOrigen.getid_parametro_conta());}
			if(conDefault || (!conDefault && parametrocontadetalleOrigen.getid_tipo_parametro_conta()!=null && !parametrocontadetalleOrigen.getid_tipo_parametro_conta().equals(-1L))) {parametrocontadetalle.setid_tipo_parametro_conta(parametrocontadetalleOrigen.getid_tipo_parametro_conta());}
			if(conDefault || (!conDefault && parametrocontadetalleOrigen.getid_cuenta_contable()!=null && !parametrocontadetalleOrigen.getid_cuenta_contable().equals(-1L))) {parametrocontadetalle.setid_cuenta_contable(parametrocontadetalleOrigen.getid_cuenta_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroContaDetalle(ParametroContaDetalle parametrocontadetalle) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroContaDetalle.jLabelidParametroContaDetalle.setText(parametrocontadetalle.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroContaDetalle(ParametroContaDetalleBean parametrocontadetalleBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroContaDetalle.jLabelidParametroContaDetalle.setText(parametrocontadetalleBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroContaDetalle(ParametroContaDetalleParameterReturnGeneral parametrocontadetalleReturnGeneral,ParametroContaDetalleBean parametrocontadetalleBean,Boolean conDefault) throws Exception { 
		try {
			ParametroContaDetalle parametrocontadetalleLocal=new ParametroContaDetalle();
			
			parametrocontadetalleLocal=parametrocontadetalleReturnGeneral.getParametroContaDetalle();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrocontadetalleLocal.getId()!=null && !parametrocontadetalleLocal.getId().equals(0L))) {parametrocontadetalleBean.setId(parametrocontadetalleLocal.getId());}}
			if(conDefault || (!conDefault && parametrocontadetalleLocal.getid_parametro_conta()!=null && !parametrocontadetalleLocal.getid_parametro_conta().equals(-1L))) {parametrocontadetalleBean.setid_parametro_conta(parametrocontadetalleLocal.getid_parametro_conta());}
			if(conDefault || (!conDefault && parametrocontadetalleLocal.getid_tipo_parametro_conta()!=null && !parametrocontadetalleLocal.getid_tipo_parametro_conta().equals(-1L))) {parametrocontadetalleBean.setid_tipo_parametro_conta(parametrocontadetalleLocal.getid_tipo_parametro_conta());}
			if(conDefault || (!conDefault && parametrocontadetalleLocal.getid_cuenta_contable()!=null && !parametrocontadetalleLocal.getid_cuenta_contable().equals(-1L))) {parametrocontadetalleBean.setid_cuenta_contable(parametrocontadetalleLocal.getid_cuenta_contable());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroContaDetalleGenerico(Long idParametroContaDetalleSeleccionado,JComboBox jComboBoxParametroContaDetalle,List<ParametroContaDetalle> parametrocontadetallesLocal)throws Exception {
		try {
			ParametroContaDetalle  parametrocontadetalleTemp=null;

			for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetallesLocal) {
				if(parametrocontadetalleAux.getId()!=null && parametrocontadetalleAux.getId().equals(idParametroContaDetalleSeleccionado)) {
					parametrocontadetalleTemp=parametrocontadetalleAux;
					break;
				}
			}

			jComboBoxParametroContaDetalle.setSelectedItem(parametrocontadetalleTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroContaDetalleGenerico(JComboBox jComboBoxParametroContaDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroContaDetalle.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroContaDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroContaDetalle.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroContaDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrocontadetalle=(ParametroContaDetalle) parametrocontadetalleLogic.getParametroContaDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrocontadetalle =(ParametroContaDetalle) parametrocontadetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("ParametroConta")) {
			//sDescripcion=this.getActualParametroContaForeignKeyDescripcion((Long)value);
			if(!parametrocontadetalle.getIsNew() && !parametrocontadetalle.getIsChanged() && !parametrocontadetalle.getIsDeleted()) {
				sDescripcion=parametrocontadetalle.getparametroconta_descripcion();
			} else {
				//sDescripcion=this.getActualParametroContaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontadetalle.getparametroconta_descripcion();
			}
		}

		if(sTipo.equals("TipoParametroConta")) {
			//sDescripcion=this.getActualTipoParametroContaForeignKeyDescripcion((Long)value);
			if(!parametrocontadetalle.getIsNew() && !parametrocontadetalle.getIsChanged() && !parametrocontadetalle.getIsDeleted()) {
				sDescripcion=parametrocontadetalle.gettipoparametroconta_descripcion();
			} else {
				//sDescripcion=this.getActualTipoParametroContaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontadetalle.gettipoparametroconta_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!parametrocontadetalle.getIsNew() && !parametrocontadetalle.getIsChanged() && !parametrocontadetalle.getIsDeleted()) {
				sDescripcion=parametrocontadetalle.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontadetalle.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroContaDetalle parametrocontadetalleRow=new ParametroContaDetalle();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrocontadetalleRow=(ParametroContaDetalle) parametrocontadetalleLogic.getParametroContaDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrocontadetalleRow=(ParametroContaDetalle) parametrocontadetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroContaDetalle(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroContaDetalle.setVisible((this.isVisibilidadCeldaNuevoParametroContaDetalle && this.isPermisoNuevoParametroContaDetalle));			
			this.jButtonDuplicarParametroContaDetalle.setVisible((this.isVisibilidadCeldaDuplicarParametroContaDetalle && this.isPermisoDuplicarParametroContaDetalle));			
			this.jButtonCopiarParametroContaDetalle.setVisible((this.isVisibilidadCeldaCopiarParametroContaDetalle && this.isPermisoCopiarParametroContaDetalle));
			this.jButtonVerFormParametroContaDetalle.setVisible((this.isVisibilidadCeldaVerFormParametroContaDetalle && this.isPermisoVerFormParametroContaDetalle));
			
			this.jButtonAbrirOrderByParametroContaDetalle.setVisible((this.isVisibilidadCeldaOrdenParametroContaDetalle && this.isPermisoOrdenParametroContaDetalle));			
			
			this.jButtonNuevoRelacionesParametroContaDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle && this.isPermisoNuevoParametroContaDetalle));			
			this.jButtonNuevoGuardarCambiosParametroContaDetalle.setVisible((this.isVisibilidadCeldaNuevoParametroContaDetalle && this.isPermisoNuevoParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle));
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonModificarParametroContaDetalle.setVisible((this.isVisibilidadCeldaModificarParametroContaDetalle && this.isPermisoActualizarParametroContaDetalle));	
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonActualizarParametroContaDetalle.setVisible((this.isVisibilidadCeldaActualizarParametroContaDetalle && this.isPermisoActualizarParametroContaDetalle));	
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonEliminarParametroContaDetalle.setVisible((this.isVisibilidadCeldaEliminarParametroContaDetalle && this.isPermisoEliminarParametroContaDetalle));
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonCancelarParametroContaDetalle.setVisible(this.isVisibilidadCeldaCancelarParametroContaDetalle);							
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosParametroContaDetalle.setVisible((this.isVisibilidadCeldaGuardarParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroContaDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaNuevoParametroContaDetalle && this.isPermisoNuevoParametroContaDetalle));						
			this.jButtonDuplicarToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaDuplicarParametroContaDetalle && this.isPermisoDuplicarParametroContaDetalle));						
			this.jButtonCopiarToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaCopiarParametroContaDetalle && this.isPermisoCopiarParametroContaDetalle));			
			this.jButtonVerFormToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaVerFormParametroContaDetalle && this.isPermisoVerFormParametroContaDetalle));			
			this.jButtonAbrirOrderByToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaOrdenParametroContaDetalle && this.isPermisoOrdenParametroContaDetalle));
			this.jButtonNuevoRelacionesToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle && this.isPermisoNuevoParametroContaDetalle));			
			this.jButtonNuevoGuardarCambiosToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaNuevoParametroContaDetalle && this.isPermisoNuevoParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle));			
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonModificarToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaModificarParametroContaDetalle && this.isPermisoActualizarParametroContaDetalle));	
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonActualizarToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaActualizarParametroContaDetalle  && this.isPermisoActualizarParametroContaDetalle));	
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonEliminarToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaEliminarParametroContaDetalle && this.isPermisoEliminarParametroContaDetalle));
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonCancelarToolBarParametroContaDetalle.setVisible(this.isVisibilidadCeldaCancelarParametroContaDetalle);				
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaGuardarParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroContaDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroContaDetalle.setVisible((this.isVisibilidadCeldaNuevoParametroContaDetalle && this.isPermisoNuevoParametroContaDetalle));			
			this.jMenuItemDuplicarParametroContaDetalle.setVisible((this.isVisibilidadCeldaDuplicarParametroContaDetalle && this.isPermisoDuplicarParametroContaDetalle));			
			this.jMenuItemCopiarParametroContaDetalle.setVisible((this.isVisibilidadCeldaCopiarParametroContaDetalle && this.isPermisoCopiarParametroContaDetalle));			
			this.jMenuItemVerFormParametroContaDetalle.setVisible((this.isVisibilidadCeldaVerFormParametroContaDetalle && this.isPermisoVerFormParametroContaDetalle));			
			this.jMenuItemAbrirOrderByParametroContaDetalle.setVisible((this.isVisibilidadCeldaOrdenParametroContaDetalle && this.isPermisoOrdenParametroContaDetalle));			
			//this.jMenuItemMostrarOcultarParametroContaDetalle.setVisible((this.isVisibilidadCeldaOrdenParametroContaDetalle && this.isPermisoOrdenParametroContaDetalle));
			this.jMenuItemDetalleAbrirOrderByParametroContaDetalle.setVisible((this.isVisibilidadCeldaOrdenParametroContaDetalle && this.isPermisoOrdenParametroContaDetalle));			
			//this.jMenuItemDetalleMostrarOcultarParametroContaDetalle.setVisible((this.isVisibilidadCeldaOrdenParametroContaDetalle && this.isPermisoOrdenParametroContaDetalle));			
			this.jMenuItemNuevoRelacionesParametroContaDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle && this.isPermisoNuevoParametroContaDetalle));			
			this.jMenuItemNuevoGuardarCambiosParametroContaDetalle.setVisible((this.isVisibilidadCeldaNuevoParametroContaDetalle && this.isPermisoNuevoParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle));									
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemModificarParametroContaDetalle.setVisible((this.isVisibilidadCeldaModificarParametroContaDetalle && this.isPermisoActualizarParametroContaDetalle));	
			this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemActualizarParametroContaDetalle.setVisible((this.isVisibilidadCeldaActualizarParametroContaDetalle && this.isPermisoActualizarParametroContaDetalle));	
			this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemEliminarParametroContaDetalle.setVisible((this.isVisibilidadCeldaEliminarParametroContaDetalle && this.isPermisoEliminarParametroContaDetalle));
			this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemCancelarParametroContaDetalle.setVisible(this.isVisibilidadCeldaCancelarParametroContaDetalle);				
			}
			
			this.jMenuItemGuardarCambiosParametroContaDetalle.setVisible((this.isVisibilidadCeldaGuardarParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle));						
			this.jMenuItemGuardarCambiosTablaParametroContaDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroContaDetalle=this.jButtonNuevoParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaDuplicarParametroContaDetalle=this.jButtonDuplicarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaCopiarParametroContaDetalle=this.jButtonCopiarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaVerFormParametroContaDetalle=this.jButtonVerFormParametroContaDetalle.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroContaDetalle=this.jButtonAbrirOrderByParametroContaDetalle.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=this.jButtonNuevoRelacionesParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaModificarParametroContaDetalle=this.jButtonModificarParametroContaDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			this.isVisibilidadCeldaActualizarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jButtonActualizarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaEliminarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jButtonEliminarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaCancelarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jButtonCancelarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaGuardarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosParametroContaDetalle.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=this.jButtonGuardarCambiosTablaParametroContaDetalle.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroContaDetalle=this.jButtonNuevoToolBarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=this.jButtonNuevoRelacionesToolBarParametroContaDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			this.isVisibilidadCeldaModificarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jButtonModificarToolBarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaActualizarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jButtonActualizarToolBarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaEliminarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jButtonEliminarToolBarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaCancelarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jButtonCancelarToolBarParametroContaDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroContaDetalle=this.jButtonGuardarCambiosToolBarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=this.jButtonGuardarCambiosTablaToolBarParametroContaDetalle.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroContaDetalle=this.jMenuItemNuevoParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=this.jMenuItemNuevoRelacionesParametroContaDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			this.isVisibilidadCeldaModificarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemModificarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaActualizarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemActualizarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaEliminarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemEliminarParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaCancelarParametroContaDetalle=this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemCancelarParametroContaDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroContaDetalle=this.jMenuItemGuardarCambiosParametroContaDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=this.jMenuItemGuardarCambiosTablaParametroContaDetalle.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroContaDetalle(Boolean esInicializar) {
		if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
				//if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroContaDetalle();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroContaDetalle(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroContaDetalle() {
		this.jButtonNuevoParametroContaDetalle.setVisible(this.isPermisoNuevoParametroContaDetalle);			
		this.jButtonDuplicarParametroContaDetalle.setVisible(this.isPermisoDuplicarParametroContaDetalle);			
		this.jButtonCopiarParametroContaDetalle.setVisible(this.isPermisoCopiarParametroContaDetalle);			
		this.jButtonVerFormParametroContaDetalle.setVisible(this.isPermisoVerFormParametroContaDetalle);			
		
		this.jButtonAbrirOrderByParametroContaDetalle.setVisible(this.isPermisoOrdenParametroContaDetalle);					
		
		this.jButtonNuevoRelacionesParametroContaDetalle.setVisible(this.isPermisoNuevoParametroContaDetalle);			
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonModificarParametroContaDetalle.setVisible(this.isPermisoActualizarParametroContaDetalle);	
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonActualizarParametroContaDetalle.setVisible(this.isPermisoActualizarParametroContaDetalle);	
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonEliminarParametroContaDetalle.setVisible(this.isPermisoEliminarParametroContaDetalle);
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonCancelarParametroContaDetalle.setVisible(this.isVisibilidadCeldaCancelarParametroContaDetalle);						
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosParametroContaDetalle.setVisible(this.isPermisoGuardarCambiosParametroContaDetalle);							
		}
		
		this.jButtonGuardarCambiosTablaParametroContaDetalle.setVisible(this.isPermisoActualizarParametroContaDetalle);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroContaDetalle() {
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonModificarParametroContaDetalle.setVisible(this.isPermisoActualizarParametroContaDetalle);	
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonActualizarParametroContaDetalle.setVisible(this.isPermisoActualizarParametroContaDetalle);	
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonEliminarParametroContaDetalle.setVisible(this.isPermisoEliminarParametroContaDetalle);
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonCancelarParametroContaDetalle.setVisible(this.isVisibilidadCeldaCancelarParametroContaDetalle);							
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosParametroContaDetalle.setVisible((this.isVisibilidadCeldaGuardarParametroContaDetalle && this.isPermisoGuardarCambiosParametroContaDetalle));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroContaDetalle() {
		if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroContaDetalle();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroContaDetalle() {
	}
	
	public void jTableDatosParametroContaDetalleListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroContaDetalle(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroContaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.getparametrocontadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontadetalle==null) {
						this.parametrocontadetalle = new ParametroContaDetalle();
					}

					this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.parametrocontadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
				}

				if(this.parametrocontadetalle.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametrocontadetalle.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_parametro_contaParametroContaDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoparametroconta=true;

			idTienePermisoparametroconta=this.tienePermisosUsuarioEnPaginaWebParametroContaDetalle(ParametroContaConstantesFunciones.CLASSNAME);

			if(idTienePermisoparametroconta) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContaDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContaDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.getparametrocontadetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);

				this.parametrocontaBeanSwingJInternalFrame=new ParametroContaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.parametrocontaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.parametrocontaBeanSwingJInternalFrame.getParametroContaLogic().setConnexion(this.parametrocontadetalleLogic.getConnexion());

				if(this.parametrocontadetalle.getid_parametro_conta()!=null) {
					this.parametrocontaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.parametrocontaBeanSwingJInternalFrame.setIdActual(this.parametrocontadetalle.getid_parametro_conta());
					this.parametrocontaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.parametrocontaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.parametrocontaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroConta();
				}

				JInternalFrameBase jinternalFrame =this.parametrocontaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContaDetalle=(TitledBorder)this.jScrollPanelDatosParametroContaDetalle.getBorder();
				TitledBorder titledBorderparametroconta=(TitledBorder)this.parametrocontaBeanSwingJInternalFrame.jScrollPanelDatosParametroConta.getBorder();

				titledBorderparametroconta.setTitle(titledBorderParametroContaDetalle.getTitle() + " -> Parametro Contabilidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_parametro_contaParametroContaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.getparametrocontadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontadetalle==null) {
						this.parametrocontadetalle = new ParametroContaDetalle();
					}

					this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.parametrocontadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
				}

				if(this.parametrocontadetalle.getid_parametro_conta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_parametro_conta = "+this.parametrocontadetalle.getid_parametro_conta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_parametro_contaParametroContaDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoparametroconta=true;

			idTienePermisotipoparametroconta=this.tienePermisosUsuarioEnPaginaWebParametroContaDetalle(TipoParametroContaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoparametroconta) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContaDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContaDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.getparametrocontadetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);

				this.tipoparametrocontaBeanSwingJInternalFrame=new TipoParametroContaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoparametrocontaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoparametrocontaBeanSwingJInternalFrame.getTipoParametroContaLogic().setConnexion(this.parametrocontadetalleLogic.getConnexion());

				if(this.parametrocontadetalle.getid_tipo_parametro_conta()!=null) {
					this.tipoparametrocontaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoparametrocontaBeanSwingJInternalFrame.setIdActual(this.parametrocontadetalle.getid_tipo_parametro_conta());
					this.tipoparametrocontaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoparametrocontaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoparametrocontaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoParametroConta();
				}

				JInternalFrameBase jinternalFrame =this.tipoparametrocontaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContaDetalle=(TitledBorder)this.jScrollPanelDatosParametroContaDetalle.getBorder();
				TitledBorder titledBordertipoparametroconta=(TitledBorder)this.tipoparametrocontaBeanSwingJInternalFrame.jScrollPanelDatosTipoParametroConta.getBorder();

				titledBordertipoparametroconta.setTitle(titledBorderParametroContaDetalle.getTitle() + " -> Tipo Parametro Conta");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_parametro_contaParametroContaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.getparametrocontadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontadetalle==null) {
						this.parametrocontadetalle = new ParametroContaDetalle();
					}

					this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.parametrocontadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
				}

				if(this.parametrocontadetalle.getid_tipo_parametro_conta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_parametro_conta = "+this.parametrocontadetalle.getid_tipo_parametro_conta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableParametroContaDetalleActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderParametroContaDetalle=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosParametroContaDetalle.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderParametroContaDetalle=(TitledBorder)this.jScrollPanelDatosParametroContaDetalle.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderParametroContaDetalle.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableParametroContaDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebParametroContaDetalle(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContaDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContaDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.getparametrocontadetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.parametrocontadetalleLogic.getConnexion());

				if(this.parametrocontadetalle.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.parametrocontadetalle.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContaDetalle=(TitledBorder)this.jScrollPanelDatosParametroContaDetalle.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderParametroContaDetalle.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableParametroContaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.getparametrocontadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontadetalle==null) {
						this.parametrocontadetalle = new ParametroContaDetalle();
					}

					this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.parametrocontadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);
				}

				if(this.parametrocontadetalle.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.parametrocontadetalle.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContaDetalle(false,false);

			this.getParametroContaDetallesFK_IdCuentaContable();

			this.inicializarActualizarBindingParametroContaDetalle(false);

			//if(ParametroContaDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContaDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdParametroContaParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContaDetalle(false,false);

			this.getParametroContaDetallesFK_IdParametroConta();

			this.inicializarActualizarBindingParametroContaDetalle(false);

			//if(ParametroContaDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContaDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdParametroContaDetalleParametroContaDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContaDetalle(false,false);

			this.getParametroContaDetallesFK_IdParametroContaDetalle();

			this.inicializarActualizarBindingParametroContaDetalle(false);

			//if(ParametroContaDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContaDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroContaDetalle() {
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
			this.jInternalFrameDetalleFormParametroContaDetalle.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroContaDetalle.dispose();
			this.jInternalFrameDetalleFormParametroContaDetalle=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroContaDetalle!=null) {
			this.jInternalFrameReporteDinamicoParametroContaDetalle.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroContaDetalle.dispose();
			this.jInternalFrameReporteDinamicoParametroContaDetalle=null;
		}
		
		if(this.jInternalFrameImportacionParametroContaDetalle!=null) {
			this.jInternalFrameImportacionParametroContaDetalle.setVisible(false);	    			
			this.jInternalFrameImportacionParametroContaDetalle.dispose();
			this.jInternalFrameImportacionParametroContaDetalle=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroContaDetalle();
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroContaDetalle")) {
				jButtonNuevoParametroContaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroContaDetalle")) {
				jButtonDuplicarParametroContaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroContaDetalle")) {
				jButtonCopiarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroContaDetalle")) {
				jButtonVerFormParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroContaDetalle")) {
				jButtonNuevoParametroContaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroContaDetalle")) {
				jButtonDuplicarParametroContaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroContaDetalle")) {
				jButtonNuevoParametroContaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroContaDetalle")) {
				jButtonDuplicarParametroContaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroContaDetalle")) {
				jButtonNuevoParametroContaDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroContaDetalle")) {
				jButtonNuevoParametroContaDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroContaDetalle")) {
				jButtonNuevoParametroContaDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroContaDetalle")) {
				jButtonModificarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroContaDetalle")) {
				jButtonModificarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroContaDetalle")) {
				jButtonModificarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroContaDetalle")) {
				jButtonActualizarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroContaDetalle")) {
				jButtonActualizarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroContaDetalle")) {
				jButtonActualizarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroContaDetalle")) {
				jButtonEliminarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroContaDetalle")) {
				jButtonEliminarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroContaDetalle")) {
				jButtonEliminarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroContaDetalle")) {
				jButtonCancelarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroContaDetalle")) {
				jButtonCancelarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroContaDetalle")) {
				jButtonCancelarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroContaDetalle")) {
				jButtonCerrarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroContaDetalle")) {
				jButtonCerrarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroContaDetalle")) {
				jButtonCerrarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroContaDetalle")) {
				jButtonMostrarOcultarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroContaDetalle")) {
				jButtonCancelarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroContaDetalle")) {
				jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroContaDetalle")) {
				jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroContaDetalle")) {
				jButtonCopiarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroContaDetalle")) {
				jButtonVerFormParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroContaDetalle")) {
				jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroContaDetalle")) {
				jButtonCopiarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroContaDetalle")) {
				jButtonVerFormParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroContaDetalle")) {
				jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroContaDetalle")) {
				jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroContaDetalle")) {
				jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroContaDetalle")) {
				jButtonRecargarInformacionParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroContaDetalle")) {
				jButtonRecargarInformacionParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroContaDetalle")) {
				jButtonRecargarInformacionParametroContaDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroContaDetalle")) {
				jButtonAnterioresParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroContaDetalle")) {
				jButtonAnterioresParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroContaDetalle")) {
				jButtonAnterioresParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroContaDetalle")) {
				jButtonSiguientesParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroContaDetalle")) {
				jButtonSiguientesParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroContaDetalle")) {
				jButtonSiguientesParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroContaDetalle") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroContaDetalle")) {
				jButtonAbrirOrderByParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroContaDetalle") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroContaDetalle")) {
				jButtonMostrarOcultarParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroContaDetalle")) {
				jButtonNuevoGuardarCambiosParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroContaDetalle")) {
				jButtonNuevoGuardarCambiosParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroContaDetalle")) {
				jButtonNuevoGuardarCambiosParametroContaDetalleActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroContaDetalle")) {
				jButtonCerrarReporteDinamicoParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroContaDetalle")) {
				jButtonGenerarReporteDinamicoParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroContaDetalle")) {
				
				jButtonGenerarExcelReporteDinamicoParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroContaDetalle")) {
				jButtonCerrarImportacionParametroContaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroContaDetalle")) {
				
				jButtonGenerarImportacionParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroContaDetalle")) {
				
				jButtonAbrirImportacionParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroContaDetalle")) {
				jComboBoxTiposAccionesParametroContaDetalleActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroContaDetalle")) {
				jComboBoxTiposRelacionesParametroContaDetalleActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroContaDetalle")) {
				jComboBoxTiposAccionesParametroContaDetalleActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroContaDetalle")) {
				
				jComboBoxTiposSeleccionarParametroContaDetalleActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroContaDetalle")) {
				jTextFieldValorCampoGeneralParametroContaDetalleActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroContaDetalle")) {
				jButtonAbrirOrderByParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroContaDetalle")) {
				jButtonAbrirOrderByParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroContaDetalle")) {
				jButtonCerrarOrderByParametroContaDetalleActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroContaDetalleBusqueda")) {
				this.jButtonidParametroContaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parametro_contaParametroContaDetalleUpdate")) {
				this.jButtonid_parametro_contaParametroContaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parametro_contaParametroContaDetalleBusqueda")) {
				this.jButtonid_parametro_contaParametroContaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_parametro_contaParametroContaDetalleUpdate")) {
				this.jButtonid_tipo_parametro_contaParametroContaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_parametro_contaParametroContaDetalleBusqueda")) {
				this.jButtonid_tipo_parametro_contaParametroContaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableParametroContaDetalle")) {
				this.jButtonid_cuenta_contableParametroContaDetalleActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableParametroContaDetalleArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableParametroContaDetalleUpdate")) {
				this.jButtonid_cuenta_contableParametroContaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableParametroContaDetalleBusqueda")) {
				this.jButtonid_cuenta_contableParametroContaDetalleBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contableParametroContaDetalle")) {
				this.jButtonid_cuenta_contableParametroContaDetalleActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCuentaContableParametroContaDetalle")) {
				this.jButtonFK_IdCuentaContableParametroContaDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdParametroContaParametroContaDetalle")) {
				this.jButtonFK_IdParametroContaParametroContaDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdParametroContaDetalleParametroContaDetalle")) {
				this.jButtonFK_IdParametroContaDetalleParametroContaDetalleActionPerformed(evt);
			}
			
			;
			
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroContaDetalle();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContaDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				


				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroContaDetalle parametrocontadetalleLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrocontadetalleLocal=this.parametrocontadetalle;
			} else {
				parametrocontadetalleLocal=this.parametrocontadetalleAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
							
				
				


				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
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
			
			


			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContaDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
								
						
				


				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContaDetalle.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
								
				
				


				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContaDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
							
				
				


				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContaDetalle.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContaDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
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
			
			


			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContaDetalleActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
								
				
				


				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContaDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContaDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroContaDetalle")) {
					jCheckBoxSeleccionarTodosParametroContaDetalleItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroContaDetalle")) {
					jCheckBoxSeleccionadosParametroContaDetalleItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroContaDetalle")) {
					
				}
				
				


				
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
												
				
				


				
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContaDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContaDetalleActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
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
			
			


			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContaDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContaDetalle.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContaDetalle.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontadetalle);
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
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
				
				


				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContaDetalle.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontadetalleAnterior =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroContaDetalle")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroContaDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroContaDetalle.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametrocontadetalle =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametrocontadetalle);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroContaDetalle")) {
				
				}
				
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroContaDetalle")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroContaDetalle.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroContaDetalle")) {
			
			}
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroContaDetalle();
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
			if(sTipo.equals("NuevoParametroContaDetalle")) {
				jButtonNuevoParametroContaDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroContaDetalle")) {
				jButtonDuplicarParametroContaDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroContaDetalle")) {
				jButtonCopiarParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroContaDetalle")) {
				jButtonVerFormParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroContaDetalle")) {
				jButtonNuevoParametroContaDetalleActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroContaDetalle")) {
				jButtonModificarParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroContaDetalle")) {
				jButtonActualizarParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroContaDetalle")) {
				jButtonEliminarParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroContaDetalle")) {
				jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroContaDetalle")) {
				jButtonCancelarParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroContaDetalle")) {
				jButtonCerrarParametroContaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroContaDetalle")) {
				jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroContaDetalle")) {
				jButtonNuevoGuardarCambiosParametroContaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroContaDetalle")) {
				jButtonAbrirOrderByParametroContaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroContaDetalle")) {
				jButtonRecargarInformacionParametroContaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroContaDetalle")) {
				jButtonAnterioresParametroContaDetalleActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroContaDetalle")) {
				jButtonSiguientesParametroContaDetalleActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroContaDetalleBusqueda")) {
				this.jButtonidParametroContaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parametro_contaParametroContaDetalleUpdate")) {
				this.jButtonid_parametro_contaParametroContaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parametro_contaParametroContaDetalleBusqueda")) {
				this.jButtonid_parametro_contaParametroContaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_parametro_contaParametroContaDetalleUpdate")) {
				this.jButtonid_tipo_parametro_contaParametroContaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_parametro_contaParametroContaDetalleBusqueda")) {
				this.jButtonid_tipo_parametro_contaParametroContaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableParametroContaDetalle")) {
				this.jButtonid_cuenta_contableParametroContaDetalleActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableParametroContaDetalleArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableParametroContaDetalleUpdate")) {
				this.jButtonid_cuenta_contableParametroContaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableParametroContaDetalleBusqueda")) {
				this.jButtonid_cuenta_contableParametroContaDetalleBusquedaActionPerformed(evt);
			}
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroContaDetalle();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroContaDetalle")) {
				closingInternalFrameParametroContaDetalle();
				
			} else if(sTipo.equals("jButtonCancelarParametroContaDetalle")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroContaDetalle = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroContaDetalleBeanSwingJInternalFrame jInternalFrameParent=(ParametroContaDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroContaDetalle.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroContaDetalleActionPerformed(null);
			}
			
			ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrocontadetalle,new Object(),this.parametrocontadetalleParameterGeneral,this.parametrocontadetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroContaDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroContaDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroContaDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametrocontadetalle)) {
			if(!esControlTabla) {
				if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.parametrocontadetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);			
				}
				
				if(this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroContaDetalle(this.parametrocontadetalle,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrocontadetalleReturnGeneral=parametrocontadetalleLogic.procesarEventosParametroContaDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocontadetalleLogic.getParametroContaDetalles(),this.parametrocontadetalle,this.parametrocontadetalleParameterGeneral,this.isEsNuevoParametroContaDetalle,classes);//this.parametrocontadetalleLogic.getParametroContaDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroContaDetalle(this.parametrocontadetalleReturnGeneral,this.parametrocontadetalleBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroContaDetalle(classes,this.parametrocontadetalleReturnGeneral,this.parametrocontadetalleBean,false);
					}
						
					if(this.parametrocontadetalleReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroContaDetalle(this.parametrocontadetalleReturnGeneral.getParametroContaDetalle());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroContaDetalle(this.parametrocontadetalleReturnGeneral.getParametroContaDetalle());	
					}
						
					if(this.parametrocontadetalleReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroContaDetalle(this.parametrocontadetalleReturnGeneral.getParametroContaDetalle(),classes);//this.parametrocontadetalleBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroContaDetalle(this.parametrocontadetalle,classes);//this.parametrocontadetalleBean);									
				}
			
				if(ParametroContaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroContaDetalle(this.parametrocontadetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContaDetalle(this.parametrocontadetalle);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametrocontadetalleAnterior!=null) {
						this.parametrocontadetalle=this.parametrocontadetalleAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrocontadetalleReturnGeneral=parametrocontadetalleLogic.procesarEventosParametroContaDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocontadetalleLogic.getParametroContaDetalles(),this.parametrocontadetalle,this.parametrocontadetalleParameterGeneral,this.isEsNuevoParametroContaDetalle,classes);//this.parametrocontadetalleLogic.getParametroContaDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrocontadetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametrocontadetalleReturnGeneral.getParametroContaDetalle(),parametrocontadetalleLogic.getParametroContaDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametrocontadetalleReturnGeneral.getParametroContaDetalle(),this.parametrocontadetalles);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroContaDetalle.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroContaDetalle.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroContaDetalle();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroContaDetalle() throws Exception {
		
		ParametroContaDetalleModel parametrocontadetalleModel=(ParametroContaDetalleModel)this.jTableDatosParametroContaDetalle.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrocontadetalleModel.parametrocontadetalles=this.parametrocontadetalleLogic.getParametroContaDetalles();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametrocontadetalleModel.parametrocontadetalles=this.parametrocontadetalles;
		}
		
		
		((ParametroContaDetalleModel) this.jTableDatosParametroContaDetalle.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroContaDetalle() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametrocontadetalleAnterior(),this.parametrocontadetalleLogic.getParametroContaDetalles());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametrocontadetalleAnterior(),this.parametrocontadetalles);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroContaDetalle();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroContaDetalle(ParametroContaDetalle parametrocontadetalle,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
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
										
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocontadetalle,new Object(),generalEntityParameterGeneral,this.parametrocontadetalleReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroContaDetalleConstantesFunciones.getClassesRelationshipsOfParametroContaDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroContaDetalleConstantesFunciones.getClassesRelationshipsFromStringsOfParametroContaDetalle(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroContaDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroContaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocontadetalle,new Object(),generalEntityParameterGeneral,this.parametrocontadetalleReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroContaDetalle(ParametroContaDetalleBean parametrocontadetalleBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroContaDetalle(ArrayList<Classe> classes,ParametroContaDetalleReturnGeneral parametrocontadetalleReturnGeneral,ParametroContaDetalleBean parametrocontadetalleBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroContaDetalle(ParametroContaDetalle parametrocontadetalle,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrocontadetalle)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroContaDetalle = new ParametroContaDetalleDetalleFormJInternalFrame(jDesktopPane,this.parametrocontadetalleSessionBean.getConGuardarRelaciones(),this.parametrocontadetalleSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroContaDetalle);
		this.jInternalFrameDetalleFormParametroContaDetalle.setVisible(false);
		this.jInternalFrameDetalleFormParametroContaDetalle.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroContaDetalle.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroContaDetalle.parametrocontadetalleLogic=this.parametrocontadetalleLogic;
		
		this.cargarCombosFrameForeignKeyParametroContaDetalle("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroContaDetalle();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroContaDetalle();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroContaDetalle("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroContaDetalle();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroContaDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroContaDetalle"));
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonModificarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"ModificarParametroContaDetalle"));

		
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonModificarToolBarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroContaDetalle"));
					
		this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemModificarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroContaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonActualizarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"ActualizarParametroContaDetalle"));
		
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonActualizarToolBarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroContaDetalle"));
						
		this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemActualizarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroContaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonEliminarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"EliminarParametroContaDetalle"));
		
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonEliminarToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroContaDetalle"));
								
		this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemEliminarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroContaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonCancelarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"CancelarParametroContaDetalle"));
		
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonCancelarToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroContaDetalle"));
					
		this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemCancelarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroContaDetalle"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemDetalleCerrarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroContaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroContaDetalle"));
		
		
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroContaDetalle"));
		
		
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroContaDetalle"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonidParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idParametroContaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_parametro_contaParametroContaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_parametro_contaParametroContaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_parametro_contaParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_parametro_contaParametroContaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_tipo_parametro_contaParametroContaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_parametro_contaParametroContaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_parametro_contaParametroContaDetalleBusqueda"));
		//jButtonid_cuenta_contableParametroContaDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableParametroContaDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalle.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalle"));
		//jButtonid_cuenta_contableParametroContaDetalleArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalleArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalleArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalleBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroContaDetalle.jTabbedPaneRelacionesParametroContaDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroContaDetalle"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroContaDetalle"));
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroContaDetalle"));
		}
		
		this.jTableDatosParametroContaDetalle.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroContaDetalle"));
		
		this.jTableDatosParametroContaDetalle.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroContaDetalle"));
		
		this.jButtonNuevoParametroContaDetalle.addActionListener(new ButtonActionListener(this,"NuevoParametroContaDetalle"));
		
		this.jButtonDuplicarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"DuplicarParametroContaDetalle"));
		
		this.jButtonCopiarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"CopiarParametroContaDetalle"));
		
		this.jButtonVerFormParametroContaDetalle.addActionListener(new ButtonActionListener(this,"VerFormParametroContaDetalle"));
		
		
		this.jButtonNuevoToolBarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroContaDetalle"));
			
		this.jButtonDuplicarToolBarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroContaDetalle"));
			
		this.jMenuItemNuevoParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroContaDetalle"));
			
		this.jMenuItemDuplicarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroContaDetalle"));		
		
		
		this.jButtonNuevoRelacionesParametroContaDetalle.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroContaDetalle"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroContaDetalle"));
			
		this.jMenuItemNuevoRelacionesParametroContaDetalle.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroContaDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonModificarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"ModificarParametroContaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonModificarToolBarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroContaDetalle"));
			
			this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemModificarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroContaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonActualizarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"ActualizarParametroContaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonActualizarToolBarParametroContaDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroContaDetalle"));
				
			this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemActualizarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroContaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonEliminarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"EliminarParametroContaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonEliminarToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroContaDetalle"));
						
			this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemEliminarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroContaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonCancelarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"CancelarParametroContaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonCancelarToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroContaDetalle"));
			
			this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemCancelarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroContaDetalle"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroContaDetalle"));		
		
		
		this.jButtonCerrarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"CerrarParametroContaDetalle"));
		
		
		this.jButtonCerrarToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroContaDetalle"));
			
		this.jMenuItemCerrarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroContaDetalle"));
			
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jMenuItemDetalleCerrarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroContaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosParametroContaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroContaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroContaDetalle"));
		}
		
		this.jButtonCopiarToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroContaDetalle"));
			
		this.jButtonVerFormToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroContaDetalle"));
		
		this.jMenuItemGuardarCambiosParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroContaDetalle"));
			
		this.jMenuItemCopiarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroContaDetalle"));		
		
		this.jMenuItemVerFormParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroContaDetalle"));		
		
		
		this.jButtonGuardarCambiosTablaParametroContaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroContaDetalle"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroContaDetalle"));
			
		this.jMenuItemGuardarCambiosTablaParametroContaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroContaDetalle"));		
		
		
		
		this.jButtonRecargarInformacionParametroContaDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroContaDetalle"));
					
		this.jButtonRecargarInformacionToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroContaDetalle"));
		
		this.jMenuItemRecargarInformacionParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroContaDetalle"));		
		
		
		
		this.jButtonAnterioresParametroContaDetalle.addActionListener (new ButtonActionListener(this,"AnterioresParametroContaDetalle"));
		
		
		this.jButtonAnterioresToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroContaDetalle"));
		
		this.jMenuItemAnterioresParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroContaDetalle"));		
		
		
		this.jButtonSiguientesParametroContaDetalle.addActionListener (new ButtonActionListener(this,"SiguientesParametroContaDetalle"));
		
		
		this.jButtonSiguientesToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroContaDetalle"));
			
		this.jMenuItemSiguientesParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroContaDetalle"));
			
		this.jMenuItemAbrirOrderByParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroContaDetalle"));
			
		this.jMenuItemMostrarOcultarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroContaDetalle"));
			
		this.jMenuItemDetalleAbrirOrderByParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroContaDetalle"));
			
		this.jMenuItemDetalleMostarOcultarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroContaDetalle"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroContaDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroContaDetalle"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroContaDetalle"));
			
		this.jMenuItemNuevoGuardarCambiosParametroContaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroContaDetalle"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroContaDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroContaDetalle"));

		this.jCheckBoxSeleccionadosParametroContaDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroContaDetalle"));
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroContaDetalle"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroContaDetalle.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroContaDetalle"));
			
		this.jComboBoxTiposAccionesParametroContaDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroContaDetalle"));
					
		this.jComboBoxTiposSeleccionarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroContaDetalle"));
			
		this.jTextFieldValorCampoGeneralParametroContaDetalle.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroContaDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonidParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idParametroContaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_parametro_contaParametroContaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_parametro_contaParametroContaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_parametro_contaParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_parametro_contaParametroContaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_tipo_parametro_contaParametroContaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_parametro_contaParametroContaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_parametro_contaParametroContaDetalleBusqueda"));
		//jButtonid_cuenta_contableParametroContaDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableParametroContaDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalle.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalle"));
		//jButtonid_cuenta_contableParametroContaDetalleArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalleArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalleArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalleBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableParametroContaDetalle.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableParametroContaDetalle"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableParametroContaDetalle.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalle"));

			this.jButtonFK_IdParametroContaParametroContaDetalle.addActionListener(new ButtonActionListener(this,"FK_IdParametroContaParametroContaDetalle"));

			this.jButtonFK_IdParametroContaDetalleParametroContaDetalle.addActionListener(new ButtonActionListener(this,"FK_IdParametroContaDetalleParametroContaDetalle"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroContaDetalle!=null) {
				this.jInternalFrameReporteDinamicoParametroContaDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroContaDetalle"));
				this.jInternalFrameReporteDinamicoParametroContaDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroContaDetalle"));
				this.jInternalFrameReporteDinamicoParametroContaDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroContaDetalle"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroContaDetalle.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroContaDetalle"));				
			//this.jButtonGenerarReporteDinamicoParametroContaDetalle.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroContaDetalle"));
			//this.jButtonGenerarExcelReporteDinamicoParametroContaDetalle.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroContaDetalle"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroContaDetalle!=null) {
				this.jInternalFrameImportacionParametroContaDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroContaDetalle"));
				this.jInternalFrameImportacionParametroContaDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroContaDetalle"));
				this.jInternalFrameImportacionParametroContaDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroContaDetalle"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroContaDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroContaDetalle"));
			
			this.jButtonAbrirOrderByToolBarParametroContaDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroContaDetalle"));			
			
			if(this.jInternalFrameOrderByParametroContaDetalle!=null) {
				this.jInternalFrameOrderByParametroContaDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroContaDetalle"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContaDetalle.jTabbedPaneRelacionesParametroContaDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroContaDetalle"));
		
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
            		closingInternalFrameParametroContaDetalle();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroContaDetalle.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroContaDetalle = (JInternalFrameBase)event.getSource();
	            	
	            ParametroContaDetalleBeanSwingJInternalFrame jInternalFrameParent=(ParametroContaDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroContaDetalle.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroContaDetalleActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroContaDetalle.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroContaDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroContaDetalle.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroContaDetalle.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContaDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContaDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContaDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroContaDetalle";
		inputMap = this.jButtonNuevoParametroContaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroContaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroContaDetalleActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContaDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContaDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContaDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroContaDetalle";
		inputMap = this.jButtonNuevoRelacionesParametroContaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroContaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroContaDetalleActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroContaDetalle";
		inputMap = this.jButtonModificarParametroContaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroContaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroContaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroContaDetalle";
		inputMap = this.jButtonActualizarParametroContaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroContaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroContaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroContaDetalle";
		inputMap = this.jButtonEliminarParametroContaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroContaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroContaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroContaDetalle";
		inputMap = this.jButtonCancelarParametroContaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroContaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroContaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroContaDetalle";
		inputMap = this.jButtonCerrarParametroContaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroContaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroContaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroContaDetalle";
		inputMap = this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosParametroContaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonGuardarCambiosParametroContaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroContaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroContaDetalle.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroContaDetalleItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroContaDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroContaDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroContaDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroContaDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroContaDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroContaDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonidParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idParametroContaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_parametro_contaParametroContaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_parametro_contaParametroContaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_parametro_contaParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_parametro_contaParametroContaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_tipo_parametro_contaParametroContaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_parametro_contaParametroContaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_parametro_contaParametroContaDetalleBusqueda"));
		//jButtonid_cuenta_contableParametroContaDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableParametroContaDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalle.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalle"));
		//jButtonid_cuenta_contableParametroContaDetalleArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalleArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalleArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalleBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableParametroContaDetalle.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableParametroContaDetalle"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableParametroContaDetalle.addActionListener(new ButtonActionListener(this,"id_cuenta_contableParametroContaDetalle"));

		this.jButtonFK_IdParametroContaParametroContaDetalle.addActionListener(new ButtonActionListener(this,"FK_IdParametroContaParametroContaDetalle"));

		this.jButtonFK_IdParametroContaDetalleParametroContaDetalle.addActionListener(new ButtonActionListener(this,"FK_IdParametroContaDetalleParametroContaDetalle"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroContaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroContaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroContaDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroContaDetalle.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroContaDetalle(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalleLogic.getParametroContaDetalles()) {
					parametrocontadetalleAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetalles) {
					parametrocontadetalleAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroContaDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroContaDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalleLogic.getParametroContaDetalles()) {
						parametrocontadetalleAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetalles) {
						parametrocontadetalleAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalleLogic.getParametroContaDetalles()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetalles) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroContaDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroContaDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroContaDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroContaDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroContaDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroContaDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroContaDetalle.getSelectedRows();
			
			ParametroContaDetalle parametrocontadetalleLocal=new ParametroContaDetalle();
			
			//this.seleccionarTodosParametroContaDetalle(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontadetalleLocal =(ParametroContaDetalle) this.parametrocontadetalleLogic.getParametroContaDetalles().toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametrocontadetalleLocal =(ParametroContaDetalle) this.parametrocontadetalles.toArray()[this.jTableDatosParametroContaDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametrocontadetalleLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalleLogic.getParametroContaDetalles()) {
						parametrocontadetalleAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetalles) {
						parametrocontadetalleAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroContaDetalle(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroContaDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroContaDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroContaDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroContaDetalleItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroContaDetalleParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroContaDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroContaDetalle(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroContaDetalle.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalleLogic.getParametroContaDetalles()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetalles) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroContaDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroContaDetalleActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroContaDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroContaDetalle=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroContaDetalle.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroContaDetalle) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroContaDetalle(conSplash);
				
					this.generarReporteParametroContaDetallesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroContaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroContaDetallesSeleccionados();
				//this.jComboBoxTiposAccionesParametroContaDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroContaDetallesSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroContaDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroContaDetallesSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroContaDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroContaDetalle();
				
				this.exportarParametroContaDetallesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroContaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroContaDetalles();
				//this.importarParametroContaDetalles();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroContaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroContaDetalle();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroContaDetallesSeleccionados();
				//this.jComboBoxTiposAccionesParametroContaDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Conta Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroContaDetalle();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroContaDetalle)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroContaDetalle(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Conta Detalle",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroContaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroContaDetalleBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroContaDetalle) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroContaDetalle(conSplash);
					
						//this.actualizarParametrosGeneralParametroContaDetalle();
						
						this.generarReporteProcesoAccionParametroContaDetallesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroContaDetalle.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroContaDetalleBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro Conta DetalleS SELECCIONADOS?", "MANTENIMIENTO DE Parametro Conta Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroContaDetalle();
				
						this.actualizarParametrosGeneralParametroContaDetalle();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametrocontadetalleReturnGeneral=parametrocontadetalleLogic.procesarAccionParametroContaDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametrocontadetalleLogic.getParametroContaDetalles(),this.parametrocontadetalleParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroContaDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroContaDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroContaDetalle();
					
					ParametroContaDetalleBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroContaDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroContaDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxTiposAccionesFormularioParametroContaDetalle.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroContaDetalle(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroContaDetalleActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroContaDetalle();
			
			if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();		
			ParametroContaDetalle parametrocontadetalle=new ParametroContaDetalle();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroContaDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroContaDetalle.getSelectedItem();
			
			
			
			
			parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametrocontadetallesSeleccionados.size()==1) {
				for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetallesSeleccionados) {
					parametrocontadetalle=parametrocontadetalleAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroContaDetalle();
			
      		//this.finishProcessParametroContaDetalle(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroContaDetalleReturnGeneral() throws Exception {
		if(this.parametrocontadetalleReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametrocontadetalleReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametrocontadetalleReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametrocontadetalleReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametrocontadetalleReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametrocontadetalleReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroContaDetalle(false);
		}
		
		if(this.parametrocontadetalleReturnGeneral.getConRetornoLista() || this.parametrocontadetalleReturnGeneral.getConRetornoObjeto()) {
			if(this.parametrocontadetalleReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrocontadetalleLogic.setParametroContaDetalles(this.parametrocontadetalleReturnGeneral.getParametroContaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametrocontadetalleReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrocontadetalleLogic.setParametroContaDetalle(this.parametrocontadetalleReturnGeneral.getParametroContaDetalle());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroContaDetalle(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroContaDetalle() throws Exception {
		
		
	}
	
	public ArrayList<ParametroContaDetalle> getParametroContaDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroContaDetalle) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetalleLogic.getParametroContaDetalles()) {
					if(parametrocontadetalleAux.getIsSelected()) {
						parametrocontadetallesSeleccionados.add(parametrocontadetalleAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroContaDetalle parametrocontadetalleAux:this.parametrocontadetalles) {
					if(parametrocontadetalleAux.getIsSelected()) {
						parametrocontadetallesSeleccionados.add(parametrocontadetalleAux);				
					}
				}
			}
			
			if(parametrocontadetallesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametrocontadetallesSeleccionados.addAll(this.parametrocontadetalleLogic.getParametroContaDetalles());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametrocontadetallesSeleccionados.addAll(this.parametrocontadetalles);				
					}
				}
			}
		} else {
			parametrocontadetallesSeleccionados.add(this.parametrocontadetalle);
		}
		
		return parametrocontadetallesSeleccionados;
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
	
	public void generarReporteParametroContaDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroContaDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroContaDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroContaDetallesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroContaDetallesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Conta Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroContaDetallesSeleccionados() throws Exception {
		ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();		
		
		parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroContaDetalles("Todos",parametrocontadetallesSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroContaDetallesSeleccionados() throws Exception {
		ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();		
		
		parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroContaDetalles("Todos",parametrocontadetallesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroContaDetallesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();
		
		parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroContaDetalles("Todos",parametrocontadetallesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroContaDetallesSeleccionados() throws Exception {
		ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroContaDetalle();
		
		
		parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroContaDetalle();
		
		
		//this.generarReporteParametroContaDetalles("Todos",parametrocontadetallesSeleccionados ,parametrocontadetalleImplementable,parametrocontadetalleImplementableHome);
	}
	
	public void mostrarImportacionParametroContaDetalles() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroContaDetalle();
		
		this.abrirFrameImportacionParametroContaDetalle();		
		
			
		//this.generarReporteParametroContaDetalles("Todos",parametrocontadetallesSeleccionados ,parametrocontadetalleImplementable,parametrocontadetalleImplementableHome);
	}
	
	public void importarParametroContaDetalles() throws Exception {		
	
	}
	
	public void exportarParametroContaDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroContaDetallesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroContaDetallesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroContaDetallesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Conta Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroContaDetallesSeleccionados() throws Exception {
		ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();		
		
		parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontadetalle."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroContaDetalle(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetallesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroContaDetalle(parametrocontadetalleAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametrocontadetalleAux.setsDetalleGeneralEntityReporte(parametrocontadetalleAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Conta Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroContaDetalle(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroContaDetalleConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContaDetalleConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroContaDetalle(ParametroContaDetalle parametrocontadetalle,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrocontadetalle.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontadetalle.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontadetalle.getparametroconta_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontadetalle.gettipoparametroconta_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontadetalle.getcuentacontable_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroContaDetallesSeleccionados() throws Exception {
		ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();		
		
		parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontadetalle.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroContaDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroContaDetalle(row);				
				iRow++;
			}				
			
			for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetallesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroContaDetalle(parametrocontadetalleAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Conta Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroContaDetallesSeleccionados() throws Exception {
		ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();		
		
		parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontadetalle.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametrocontadetalles");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrocontadetalle");
			//elementRoot.appendChild(element);
		
			for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetallesSeleccionados) {
				element = document.createElement("parametrocontadetalle");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroContaDetalle(parametrocontadetalleAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Conta Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroContaDetalle(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContaDetalleConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContaDetalleConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroContaDetalle(ParametroContaDetalle parametrocontadetalle,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontadetalle.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontadetalle.getparametroconta_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontadetalle.gettipoparametroconta_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontadetalle.getcuentacontable_descripcion());				
	}
	
	public void setFilaDatosExportarXmlParametroContaDetalle(ParametroContaDetalle parametrocontadetalle,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroContaDetalleConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametrocontadetalle.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroContaDetalleConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrocontadetalle.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementparametroconta_descripcion = document.createElement(ParametroContaDetalleConstantesFunciones.IDPARAMETROCONTA);
		elementparametroconta_descripcion.appendChild(document.createTextNode(parametrocontadetalle.getparametroconta_descripcion()));
		element.appendChild(elementparametroconta_descripcion);

		Element elementtipoparametroconta_descripcion = document.createElement(ParametroContaDetalleConstantesFunciones.IDTIPOPARAMETROCONTA);
		elementtipoparametroconta_descripcion.appendChild(document.createTextNode(parametrocontadetalle.gettipoparametroconta_descripcion()));
		element.appendChild(elementtipoparametroconta_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(ParametroContaDetalleConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(parametrocontadetalle.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);
	}
	
	public void generarReporteGroupGenericoParametroContaDetallesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados=new ArrayList<ParametroContaDetalle>();
		
		parametrocontadetallesSeleccionados=this.getParametroContaDetallesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroContaDetalle(parametrocontadetallesSeleccionados);
		
		this.generarReporteParametroContaDetalles("Todos",parametrocontadetallesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroContaDetalle(ArrayList<ParametroContaDetalle> parametrocontadetallesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroContaDetalle parametrocontadetalleAux:parametrocontadetallesSeleccionados) {
				parametrocontadetalleAux.setsDetalleGeneralEntityReporte(parametrocontadetalleAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA)) {
					existe=true;
					parametrocontadetalleAux.setsDescripcionGeneralEntityReporte1(parametrocontadetalleAux.getparametroconta_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA)) {
					existe=true;
					parametrocontadetalleAux.setsDescripcionGeneralEntityReporte1(parametrocontadetalleAux.gettipoparametroconta_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					parametrocontadetalleAux.setsDescripcionGeneralEntityReporte1(parametrocontadetalleAux.getcuentacontable_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroContaDetalle(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroContaDetalle=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=true;
				this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=true;
			}
			
			this.isVisibilidadCeldaModificarParametroContaDetalle=false;
			this.isVisibilidadCeldaActualizarParametroContaDetalle=false;
			this.isVisibilidadCeldaEliminarParametroContaDetalle=false;
			this.isVisibilidadCeldaCancelarParametroContaDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroContaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=false;
			this.isVisibilidadCeldaModificarParametroContaDetalle=false;
			this.isVisibilidadCeldaActualizarParametroContaDetalle=true;
			this.isVisibilidadCeldaEliminarParametroContaDetalle=false;
			this.isVisibilidadCeldaCancelarParametroContaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroContaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=false;
			this.isVisibilidadCeldaModificarParametroContaDetalle=false;
			this.isVisibilidadCeldaActualizarParametroContaDetalle=true;
			this.isVisibilidadCeldaEliminarParametroContaDetalle=true;
			this.isVisibilidadCeldaCancelarParametroContaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroContaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=false;
			this.isVisibilidadCeldaModificarParametroContaDetalle=false;
			this.isVisibilidadCeldaActualizarParametroContaDetalle=true;
			this.isVisibilidadCeldaEliminarParametroContaDetalle=false;
			this.isVisibilidadCeldaCancelarParametroContaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroContaDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=true;
			this.isVisibilidadCeldaModificarParametroContaDetalle=false;
			this.isVisibilidadCeldaActualizarParametroContaDetalle=false;
			this.isVisibilidadCeldaEliminarParametroContaDetalle=false;
			this.isVisibilidadCeldaCancelarParametroContaDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroContaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=false;
			this.isVisibilidadCeldaActualizarParametroContaDetalle=false;
			this.isVisibilidadCeldaEliminarParametroContaDetalle=false;
			this.isVisibilidadCeldaCancelarParametroContaDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroContaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=false;
			this.isVisibilidadCeldaModificarParametroContaDetalle=true;
			this.isVisibilidadCeldaActualizarParametroContaDetalle=false;
			this.isVisibilidadCeldaEliminarParametroContaDetalle=false;
			this.isVisibilidadCeldaCancelarParametroContaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroContaDetalle=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroContaDetalleJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroContaDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=true;
		} else {
			this.actualizarEstadoPanelsParametroContaDetalle(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroContaDetalle=false;
			//this.isVisibilidadCeldaVerFormParametroContaDetalle=false;
			this.isVisibilidadCeldaDuplicarParametroContaDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroContaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContaDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
			if(!parametrocontadetalleSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=false;												
			}
			
			this.jButtonCerrarParametroContaDetalle.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroContaDetalle=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrocontadetalle)) {
			this.isVisibilidadCeldaActualizarParametroContaDetalle=false;
			this.isVisibilidadCeldaEliminarParametroContaDetalle=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroContaDetalle() {
	}
	
	public void actualizarEstadoPanelsParametroContaDetalle(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroContaDetalle!=null) {
				this.jScrollPanelDatosEdicionParametroContaDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContaDetalle!=null) {
				this.jTabbedPaneBusquedasParametroContaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroContaDetalle!=null) {
				this.jScrollPanelDatosParametroContaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroContaDetalle!=null) {
				this.jPanelPaginacionParametroContaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroContaDetalle!=null) {
				this.jPanelParametrosReportesParametroContaDetalle.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroContaDetalle!=null) {
				this.jScrollPanelDatosEdicionParametroContaDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContaDetalle!=null) {
				this.jTabbedPaneBusquedasParametroContaDetalle.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroContaDetalle!=null) {
				this.jScrollPanelDatosParametroContaDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroContaDetalle!=null) {
				this.jPanelPaginacionParametroContaDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroContaDetalle!=null) {
				this.jPanelParametrosReportesParametroContaDetalle.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroContaDetalle!=null) {
				this.jScrollPanelDatosEdicionParametroContaDetalle.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContaDetalle!=null) {
				this.jTabbedPaneBusquedasParametroContaDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroContaDetalle!=null) {
				this.jScrollPanelDatosParametroContaDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroContaDetalle!=null) {
				this.jPanelPaginacionParametroContaDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroContaDetalle!=null) {
				this.jPanelParametrosReportesParametroContaDetalle.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroContaDetalle!=null) {
				this.jScrollPanelDatosEdicionParametroContaDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContaDetalle!=null) {
				this.jTabbedPaneBusquedasParametroContaDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroContaDetalle!=null) {
				this.jScrollPanelDatosParametroContaDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroContaDetalle!=null) {
				this.jPanelPaginacionParametroContaDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroContaDetalle!=null) {
				this.jPanelParametrosReportesParametroContaDetalle.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroContaDetalle!=null) {
				this.jScrollPanelDatosEdicionParametroContaDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContaDetalle!=null) {
				this.jTabbedPaneBusquedasParametroContaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroContaDetalle!=null) {
				this.jScrollPanelDatosParametroContaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroContaDetalle!=null) {
				this.jPanelPaginacionParametroContaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroContaDetalle!=null) {
				this.jPanelParametrosReportesParametroContaDetalle.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroContaDetalle!=null) {
				this.jScrollPanelDatosEdicionParametroContaDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContaDetalle!=null) {
				this.jTabbedPaneBusquedasParametroContaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroContaDetalle!=null) {
				this.jScrollPanelDatosParametroContaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroContaDetalle!=null) {
				this.jPanelPaginacionParametroContaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroContaDetalle!=null) {
				this.jPanelParametrosReportesParametroContaDetalle.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroContaDetalle!=null) {
				this.jScrollPanelDatosEdicionParametroContaDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContaDetalle!=null) {
				this.jTabbedPaneBusquedasParametroContaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroContaDetalle!=null) {
				this.jScrollPanelDatosParametroContaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroContaDetalle!=null) {
				this.jPanelPaginacionParametroContaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroContaDetalle!=null) {
				this.jPanelParametrosReportesParametroContaDetalle.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroContaDetalle!=null) {
					this.jTabbedPaneBusquedasParametroContaDetalle.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroContaDetalle!=null) {
				this.jPanelParametrosReportesParametroContaDetalle.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContaDetalle!=null) {
				this.jTabbedPaneBusquedasParametroContaDetalle.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroContaDetalle!=null) {
				this.jPanelParametrosReportesParametroContaDetalle.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaParametroConta(Boolean isParaParametroConta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaParametroContaNegation=!isParaParametroConta;

			this.isVisibilidadFK_IdCuentaContable=isParaParametroContaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasParametroContaDetalle.remove(jPanelFK_IdCuentaContableParametroContaDetalle);}

			this.isVisibilidadFK_IdParametroConta=isParaParametroConta;
			if(!this.isVisibilidadFK_IdParametroConta) {this.jTabbedPaneBusquedasParametroContaDetalle.remove(jPanelFK_IdParametroContaParametroContaDetalle);}

			this.isVisibilidadFK_IdParametroContaDetalle=isParaParametroContaNegation;
			if(!this.isVisibilidadFK_IdParametroContaDetalle) {this.jTabbedPaneBusquedasParametroContaDetalle.remove(jPanelFK_IdParametroContaDetalleParametroContaDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoParametroConta(Boolean isParaTipoParametroConta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoParametroContaNegation=!isParaTipoParametroConta;

			this.isVisibilidadFK_IdCuentaContable=isParaTipoParametroContaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasParametroContaDetalle.remove(jPanelFK_IdCuentaContableParametroContaDetalle);}

			this.isVisibilidadFK_IdParametroConta=isParaTipoParametroContaNegation;
			if(!this.isVisibilidadFK_IdParametroConta) {this.jTabbedPaneBusquedasParametroContaDetalle.remove(jPanelFK_IdParametroContaParametroContaDetalle);}

			this.isVisibilidadFK_IdParametroContaDetalle=isParaTipoParametroConta;
			if(!this.isVisibilidadFK_IdParametroContaDetalle) {this.jTabbedPaneBusquedasParametroContaDetalle.remove(jPanelFK_IdParametroContaDetalleParametroContaDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasParametroContaDetalle.remove(jPanelFK_IdCuentaContableParametroContaDetalle);}

			this.isVisibilidadFK_IdParametroConta=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdParametroConta) {this.jTabbedPaneBusquedasParametroContaDetalle.remove(jPanelFK_IdParametroContaParametroContaDetalle);}

			this.isVisibilidadFK_IdParametroContaDetalle=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdParametroContaDetalle) {this.jTabbedPaneBusquedasParametroContaDetalle.remove(jPanelFK_IdParametroContaDetalleParametroContaDetalle);}
		}
		
	}
	
	
	
	

	public String registrarSesionParametroContaDetalleParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(parametrocontadetalleSessionBean==null) {
				parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(parametrocontadetalleSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.parametrocontadetalleFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(ParametroContaDetalleConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionParametroContaDetalle(true);
			//cuentacontableSessionBean.setlidParametroContaDetalleActual(this.idParametroContaDetalleActual);

			parametrocontadetalleSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyParametroContaDetalle(true);
			parametrocontadetalleSessionBean.setlIdParametroContaDetalleActualForeignKey(this.idParametroContaDetalleActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroContaDetalleSessionBean parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
		
		if(this.parametrocontadetalleSessionBean==null) {
			this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
		}
		
		this.parametrocontadetalleSessionBean.setsUltimaBusquedaParametroContaDetalle(this.getsAccionBusqueda());
		this.parametrocontadetalleSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametrocontadetalleSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			parametrocontadetalleSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdParametroConta")) {
			parametrocontadetalleSessionBean.setid_parametro_conta(this.getid_parametro_contaFK_IdParametroConta());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdParametroContaDetalle")) {
			parametrocontadetalleSessionBean.setid_tipo_parametro_conta(this.getid_tipo_parametro_contaFK_IdParametroContaDetalle());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroContaDetalleSessionBean parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
		
		if(this.parametrocontadetalleSessionBean==null) {
			this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
		}
		
		if(this.parametrocontadetalleSessionBean.getsUltimaBusquedaParametroContaDetalle()!=null&&!this.parametrocontadetalleSessionBean.getsUltimaBusquedaParametroContaDetalle().equals("")) {
			this.setsAccionBusqueda(parametrocontadetalleSessionBean.getsUltimaBusquedaParametroContaDetalle());
			this.setiNumeroPaginacion(parametrocontadetalleSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametrocontadetalleSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(parametrocontadetalleSessionBean.getid_cuenta_contable());
				parametrocontadetalleSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdParametroConta")) {
				this.setid_parametro_contaFK_IdParametroConta(parametrocontadetalleSessionBean.getid_parametro_conta());
				parametrocontadetalleSessionBean.setid_parametro_conta(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdParametroContaDetalle")) {
				this.setid_tipo_parametro_contaFK_IdParametroContaDetalle(parametrocontadetalleSessionBean.getid_tipo_parametro_conta());
				parametrocontadetalleSessionBean.setid_tipo_parametro_conta(-1L);
			}
		}
		
		this.parametrocontadetalleSessionBean.setsUltimaBusquedaParametroContaDetalle("");
		this.parametrocontadetalleSessionBean.setiNumeroPaginacion(ParametroContaDetalleConstantesFunciones.INUMEROPAGINACION);
		this.parametrocontadetalleSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroContaDetalle(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroContaDetalle() {
		this.updateBorderResaltarBusquedasFormularioParametroContaDetalle();
		this.updateVisibilidadBusquedasFormularioParametroContaDetalle();
		this.updateHabilitarBusquedasFormularioParametroContaDetalle();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroContaDetalle() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroContaDetalle.getComponents().length>0) {
	

		if(this.parametrocontadetalleConstantesFunciones.resaltarFK_IdCuentaContableParametroContaDetalle!=null) {
			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdCuentaContableParametroContaDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);
				jPanel.setBorder(this.parametrocontadetalleConstantesFunciones.resaltarFK_IdCuentaContableParametroContaDetalle);
			}
		}

		if(this.parametrocontadetalleConstantesFunciones.resaltarFK_IdParametroContaParametroContaDetalle!=null) {
			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdParametroContaParametroContaDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);
				jPanel.setBorder(this.parametrocontadetalleConstantesFunciones.resaltarFK_IdParametroContaParametroContaDetalle);
			}
		}

		if(this.parametrocontadetalleConstantesFunciones.resaltarFK_IdParametroContaDetalleParametroContaDetalle!=null) {
			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdParametroContaDetalleParametroContaDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);
				jPanel.setBorder(this.parametrocontadetalleConstantesFunciones.resaltarFK_IdParametroContaDetalleParametroContaDetalle);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroContaDetalle() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroContaDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdCuentaContableParametroContaDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocontadetalleConstantesFunciones.mostrarFK_IdCuentaContableParametroContaDetalle);
			if(!this.parametrocontadetalleConstantesFunciones.mostrarFK_IdCuentaContableParametroContaDetalle && index>-1) {
				this.jTabbedPaneBusquedasParametroContaDetalle.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdParametroContaParametroContaDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocontadetalleConstantesFunciones.mostrarFK_IdParametroContaParametroContaDetalle);
			if(!this.parametrocontadetalleConstantesFunciones.mostrarFK_IdParametroContaParametroContaDetalle && index>-1) {
				this.jTabbedPaneBusquedasParametroContaDetalle.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdParametroContaDetalleParametroContaDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocontadetalleConstantesFunciones.mostrarFK_IdParametroContaDetalleParametroContaDetalle);
			if(!this.parametrocontadetalleConstantesFunciones.mostrarFK_IdParametroContaDetalleParametroContaDetalle && index>-1) {
				this.jTabbedPaneBusquedasParametroContaDetalle.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroContaDetalle() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroContaDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdCuentaContableParametroContaDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocontadetalleConstantesFunciones.activarFK_IdCuentaContableParametroContaDetalle);
				this.jTabbedPaneBusquedasParametroContaDetalle.setEnabledAt(index,this.parametrocontadetalleConstantesFunciones.activarFK_IdCuentaContableParametroContaDetalle);
			}

			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdParametroContaParametroContaDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocontadetalleConstantesFunciones.activarFK_IdParametroContaParametroContaDetalle);
				this.jTabbedPaneBusquedasParametroContaDetalle.setEnabledAt(index,this.parametrocontadetalleConstantesFunciones.activarFK_IdParametroContaParametroContaDetalle);
			}

			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdParametroContaDetalleParametroContaDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocontadetalleConstantesFunciones.activarFK_IdParametroContaDetalleParametroContaDetalle);
				this.jTabbedPaneBusquedasParametroContaDetalle.setEnabledAt(index,this.parametrocontadetalleConstantesFunciones.activarFK_IdParametroContaDetalleParametroContaDetalle);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroContaDetalle(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdCuentaContableParametroContaDetalle);

			this.jTabbedPaneBusquedasParametroContaDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);

			this.parametrocontadetalleConstantesFunciones.setResaltarFK_IdCuentaContableParametroContaDetalle(resaltar);

			jPanel.setBorder(this.parametrocontadetalleConstantesFunciones.resaltarFK_IdCuentaContableParametroContaDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdParametroConta")) {
			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdParametroContaParametroContaDetalle);

			this.jTabbedPaneBusquedasParametroContaDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);

			this.parametrocontadetalleConstantesFunciones.setResaltarFK_IdParametroContaParametroContaDetalle(resaltar);

			jPanel.setBorder(this.parametrocontadetalleConstantesFunciones.resaltarFK_IdParametroContaParametroContaDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdParametroContaDetalle")) {
			index= this.jTabbedPaneBusquedasParametroContaDetalle.indexOfComponent(this.jPanelFK_IdParametroContaDetalleParametroContaDetalle);

			this.jTabbedPaneBusquedasParametroContaDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContaDetalle.getComponent(index);

			this.parametrocontadetalleConstantesFunciones.setResaltarFK_IdParametroContaDetalleParametroContaDetalle(resaltar);

			jPanel.setBorder(this.parametrocontadetalleConstantesFunciones.resaltarFK_IdParametroContaDetalleParametroContaDetalle);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParametroContaDetalle.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroContaDetalle() throws Exception {

		if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroContaDetalle();
		this.updateVisibilidadResaltarControlesFormularioParametroContaDetalle();
		this.updateHabilitarResaltarControlesFormularioParametroContaDetalle();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroContaDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametrocontadetalleConstantesFunciones.resaltaridParametroContaDetalle!=null && this.jInternalFrameDetalleFormParametroContaDetalle!=null) {this.jInternalFrameDetalleFormParametroContaDetalle.jLabelidParametroContaDetalle.setBorder(this.parametrocontadetalleConstantesFunciones.resaltaridParametroContaDetalle);}
		if(this.parametrocontadetalleConstantesFunciones.resaltarid_parametro_contaParametroContaDetalle!=null && this.jInternalFrameDetalleFormParametroContaDetalle!=null) {this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.setBorder(this.parametrocontadetalleConstantesFunciones.resaltarid_parametro_contaParametroContaDetalle);}
		if(this.parametrocontadetalleConstantesFunciones.resaltarid_tipo_parametro_contaParametroContaDetalle!=null && this.jInternalFrameDetalleFormParametroContaDetalle!=null) {this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.setBorder(this.parametrocontadetalleConstantesFunciones.resaltarid_tipo_parametro_contaParametroContaDetalle);}
		if(this.parametrocontadetalleConstantesFunciones.resaltarid_cuenta_contableParametroContaDetalle!=null && this.jInternalFrameDetalleFormParametroContaDetalle!=null) {this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.setBorder(this.parametrocontadetalleConstantesFunciones.resaltarid_cuenta_contableParametroContaDetalle);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroContaDetalle() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
	
		//this.jInternalFrameDetalleFormParametroContaDetalle.jLabelidParametroContaDetalle.setVisible(this.parametrocontadetalleConstantesFunciones.mostraridParametroContaDetalle);
		this.jInternalFrameDetalleFormParametroContaDetalle.jPanelidParametroContaDetalle.setVisible(this.parametrocontadetalleConstantesFunciones.mostraridParametroContaDetalle);
		//this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.setVisible(this.parametrocontadetalleConstantesFunciones.mostrarid_parametro_contaParametroContaDetalle);
		this.jInternalFrameDetalleFormParametroContaDetalle.jPanelid_parametro_contaParametroContaDetalle.setVisible(this.parametrocontadetalleConstantesFunciones.mostrarid_parametro_contaParametroContaDetalle);
		//this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.setVisible(this.parametrocontadetalleConstantesFunciones.mostrarid_tipo_parametro_contaParametroContaDetalle);
		this.jInternalFrameDetalleFormParametroContaDetalle.jPanelid_tipo_parametro_contaParametroContaDetalle.setVisible(this.parametrocontadetalleConstantesFunciones.mostrarid_tipo_parametro_contaParametroContaDetalle);
		//this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.setVisible(this.parametrocontadetalleConstantesFunciones.mostrarid_cuenta_contableParametroContaDetalle);
		this.jInternalFrameDetalleFormParametroContaDetalle.jPanelid_cuenta_contableParametroContaDetalle.setVisible(this.parametrocontadetalleConstantesFunciones.mostrarid_cuenta_contableParametroContaDetalle);
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalle.setVisible(this.parametrocontadetalleConstantesFunciones.mostrarid_cuenta_contableParametroContaDetalle);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroContaDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormParametroContaDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroContaDetalle!=null) {
	
		this.jInternalFrameDetalleFormParametroContaDetalle.jLabelidParametroContaDetalle.setEnabled(this.parametrocontadetalleConstantesFunciones.activaridParametroContaDetalle);
		this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_parametro_contaParametroContaDetalle.setEnabled(this.parametrocontadetalleConstantesFunciones.activarid_parametro_contaParametroContaDetalle);
		this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_tipo_parametro_contaParametroContaDetalle.setEnabled(this.parametrocontadetalleConstantesFunciones.activarid_tipo_parametro_contaParametroContaDetalle);
		this.jInternalFrameDetalleFormParametroContaDetalle.jComboBoxid_cuenta_contableParametroContaDetalle.setEnabled(this.parametrocontadetalleConstantesFunciones.activarid_cuenta_contableParametroContaDetalle);
			this.jInternalFrameDetalleFormParametroContaDetalle.jButtonid_cuenta_contableParametroContaDetalle.setEnabled(this.parametrocontadetalleConstantesFunciones.activarid_cuenta_contableParametroContaDetalle);
		}
	}
	
		
}