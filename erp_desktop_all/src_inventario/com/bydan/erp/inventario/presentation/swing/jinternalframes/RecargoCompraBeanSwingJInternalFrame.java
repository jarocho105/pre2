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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.RecargoCompraConstantesFunciones;
import com.bydan.erp.inventario.util.RecargoCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.RecargoCompraParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.RecargoCompraBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class RecargoCompraBeanSwingJInternalFrame extends RecargoCompraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RecargoCompraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RecargoCompra> recargocompraValidator = new ClassValidator<RecargoCompra>(RecargoCompra.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RecargoCompra recargocompra;	
	public RecargoCompra recargocompraAux;
	public RecargoCompra recargocompraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RecargoCompra recargocompraTotales;
	public Long idRecargoCompraActual;
	public Long iIdNuevoRecargoCompra=0L;
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

	public String sFinalQueryComboCuentaContableDebito="";

	public List<CuentaContable> cuentacontabledebitosForeignKey;

	public List<CuentaContable> getcuentacontabledebitosForeignKey() {
		return cuentacontabledebitosForeignKey;
	}

	public void setcuentacontabledebitosForeignKey(List<CuentaContable> cuentacontabledebitosForeignKey) {
		this.cuentacontabledebitosForeignKey = cuentacontabledebitosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontabledebitoForeignKey;

	public CuentaContable getcuentacontabledebitoForeignKey() {
		return cuentacontabledebitoForeignKey;
	}

	public void setcuentacontabledebitoForeignKey(CuentaContable cuentacontabledebitoForeignKey) {
		this.cuentacontabledebitoForeignKey = cuentacontabledebitoForeignKey;
	}

	public String sFinalQueryComboCuentaContableCredito="";

	public List<CuentaContable> cuentacontablecreditosForeignKey;

	public List<CuentaContable> getcuentacontablecreditosForeignKey() {
		return cuentacontablecreditosForeignKey;
	}

	public void setcuentacontablecreditosForeignKey(List<CuentaContable> cuentacontablecreditosForeignKey) {
		this.cuentacontablecreditosForeignKey = cuentacontablecreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontablecreditoForeignKey;

	public CuentaContable getcuentacontablecreditoForeignKey() {
		return cuentacontablecreditoForeignKey;
	}

	public void setcuentacontablecreditoForeignKey(CuentaContable cuentacontablecreditoForeignKey) {
		this.cuentacontablecreditoForeignKey = cuentacontablecreditoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableDebitoActual=0L;

	public Long getidCuentaContableDebitoActual() {
		return idCuentaContableDebitoActual;
	}

	public void setidCuentaContableDebitoActual(Long idCuentaContableDebitoActual) {
		this.idCuentaContableDebitoActual= idCuentaContableDebitoActual;
	}
	public Long idCuentaContableCreditoActual=0L;

	public Long getidCuentaContableCreditoActual() {
		return idCuentaContableCreditoActual;
	}

	public void setidCuentaContableCreditoActual(Long idCuentaContableCreditoActual) {
		this.idCuentaContableCreditoActual= idCuentaContableCreditoActual;
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
	
	public Boolean isPermisoTodoRecargoCompra;
	public Boolean isPermisoNuevoRecargoCompra;
	public Boolean isPermisoActualizarRecargoCompra;
	public Boolean isPermisoActualizarOriginalRecargoCompra;
	public Boolean isPermisoEliminarRecargoCompra;
	public Boolean isPermisoGuardarCambiosRecargoCompra;
	public Boolean isPermisoConsultaRecargoCompra;
	public Boolean isPermisoBusquedaRecargoCompra;
	public Boolean isPermisoReporteRecargoCompra;
	public Boolean isPermisoPaginacionMedioRecargoCompra;
	public Boolean isPermisoPaginacionAltoRecargoCompra;
	public Boolean isPermisoPaginacionTodoRecargoCompra;
	public Boolean isPermisoCopiarRecargoCompra;
	public Boolean isPermisoVerFormRecargoCompra;
	public Boolean isPermisoDuplicarRecargoCompra;
	public Boolean isPermisoOrdenRecargoCompra;
	
	
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
	
	public RecargoCompraParameterReturnGeneral recargocompraReturnGeneral;
	public RecargoCompraParameterReturnGeneral recargocompraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRecargoCompra=false;
	public Boolean esParaAccionDesdeFormularioRecargoCompra=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RecargoCompraSessionBeanAdditional recargocompraSessionBeanAdditional=null;
	
	public RecargoCompraSessionBeanAdditional getRecargoCompraSessionBeanAdditional() {
		return this.recargocompraSessionBeanAdditional;
	}
	
	public void setRecargoCompraSessionBeanAdditional(RecargoCompraSessionBeanAdditional recargocompraSessionBeanAdditional) {
		try {
			this.recargocompraSessionBeanAdditional=recargocompraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RecargoCompraBeanSwingJInternalFrameAdditional recargocompraBeanSwingJInternalFrameAdditional=null;
	//public class RecargoCompraBeanSwingJInternalFrame
	
	public RecargoCompraBeanSwingJInternalFrameAdditional getRecargoCompraBeanSwingJInternalFrameAdditional() {
		return this.recargocompraBeanSwingJInternalFrameAdditional;
	}
	
	public void setRecargoCompraBeanSwingJInternalFrameAdditional(RecargoCompraBeanSwingJInternalFrameAdditional recargocompraBeanSwingJInternalFrameAdditional) {
		try {
			this.recargocompraBeanSwingJInternalFrameAdditional=recargocompraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RecargoCompraLogic recargocompraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RecargoCompra recargocompraBean;
	public RecargoCompraConstantesFunciones recargocompraConstantesFunciones;
	//public RecargoCompraParameterReturnGeneral recargocompraReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CuentaContableLogic cuentacontabledebitoLogic;
	public CuentaContableLogic cuentacontablecreditoLogic;
	
	//PARAMETROS
	
	
	//public List<RecargoCompra> recargocompras;	
	//public List<RecargoCompra> recargocomprasEliminados;
	//public List<RecargoCompra> recargocomprasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRecargoCompra=false;
	public Boolean isVisibilidadCeldaDuplicarRecargoCompra=true;
	public Boolean isVisibilidadCeldaCopiarRecargoCompra=true;
	public Boolean isVisibilidadCeldaVerFormRecargoCompra=true;
	public Boolean isVisibilidadCeldaOrdenRecargoCompra=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRecargoCompra=false;
	public Boolean isVisibilidadCeldaModificarRecargoCompra=false;
	public Boolean isVisibilidadCeldaActualizarRecargoCompra=false;
	public Boolean isVisibilidadCeldaEliminarRecargoCompra=false;
	public Boolean isVisibilidadCeldaCancelarRecargoCompra=false;
	public Boolean isVisibilidadCeldaGuardarRecargoCompra=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRecargoCompra=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdCuentaContableCredito=false;
	public Boolean isVisibilidadFK_IdCuentaContableDebito=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoRecargoCompra() {
		return this.iIdNuevoRecargoCompra;
	}

	public void setiIdNuevoRecargoCompra(Long iIdNuevoRecargoCompra) {
		this.iIdNuevoRecargoCompra = iIdNuevoRecargoCompra;
	}
	
	public Long getidRecargoCompraActual() {
		return this.idRecargoCompraActual;
	}

	public void setidRecargoCompraActual(Long idRecargoCompraActual) {
		this.idRecargoCompraActual = idRecargoCompraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RecargoCompra getrecargocompra() {
		return this.recargocompra;
	}

	public void setrecargocompra(RecargoCompra recargocompra) {
		this.recargocompra = recargocompra;
	}
	
	public RecargoCompra getrecargocompraAux() {
		return this.recargocompraAux;
	}

	public void setrecargocompraAux(RecargoCompra recargocompraAux) {
		this.recargocompraAux = recargocompraAux;
	}				
	
	public RecargoCompra getrecargocompraAnterior() {
		return this.recargocompraAnterior;
	}

	public void setrecargocompraAnterior(RecargoCompra recargocompraAnterior) {
		this.recargocompraAnterior = recargocompraAnterior;
	}	
	
	public RecargoCompra getrecargocompraTotales() {
		return this.recargocompraTotales;
	}

	public void setrecargocompraTotales(RecargoCompra recargocompraTotales) {
		this.recargocompraTotales = recargocompraTotales;
	}	
	
	public RecargoCompra getrecargocompraBean() {
		return this.recargocompraBean;
	}

	public void setrecargocompraBean(RecargoCompra recargocompraBean) {
		this.recargocompraBean = recargocompraBean;
	}	
	
	public RecargoCompraParameterReturnGeneral getrecargocompraReturnGeneral() {
		return this.recargocompraReturnGeneral;
	}

	public void setrecargocompraReturnGeneral(RecargoCompraParameterReturnGeneral recargocompraReturnGeneral) {
		this.recargocompraReturnGeneral = recargocompraReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_cuenta_contable_creditoFK_IdCuentaContableCredito=-1L;

	public Long getid_cuenta_contable_creditoFK_IdCuentaContableCredito() {
		return this.id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public void setid_cuenta_contable_creditoFK_IdCuentaContableCredito(Long id_cuenta_contable_creditoFK_IdCuentaContableCredito) {
		this.id_cuenta_contable_creditoFK_IdCuentaContableCredito = id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public Long id_cuenta_contable_debitoFK_IdCuentaContableDebito=-1L;

	public Long getid_cuenta_contable_debitoFK_IdCuentaContableDebito() {
		return this.id_cuenta_contable_debitoFK_IdCuentaContableDebito;
	}

	public void setid_cuenta_contable_debitoFK_IdCuentaContableDebito(Long id_cuenta_contable_debitoFK_IdCuentaContableDebito) {
		this.id_cuenta_contable_debitoFK_IdCuentaContableDebito = id_cuenta_contable_debitoFK_IdCuentaContableDebito;
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
	
	
	public RecargoCompraLogic getRecargoCompraLogic()	{		
		return recargocompraLogic;
	}

	public void setRecargoCompraLogic(RecargoCompraLogic recargocompraLogic) {
		this.recargocompraLogic = recargocompraLogic;
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
	
	public Boolean getIsEsNuevoRecargoCompra() {
		return isEsNuevoRecargoCompra;
	}

	public void setIsEsNuevoRecargoCompra(Boolean isEsNuevoRecargoCompra) {
		this.isEsNuevoRecargoCompra = isEsNuevoRecargoCompra;
	}

	public Boolean getEsParaAccionDesdeFormularioRecargoCompra() {
		return esParaAccionDesdeFormularioRecargoCompra;
	}
	
	public void setEsParaAccionDesdeFormularioRecargoCompra(Boolean esParaAccionDesdeFormularioRecargoCompra) {
		this.esParaAccionDesdeFormularioRecargoCompra = esParaAccionDesdeFormularioRecargoCompra;
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

			if(this.recargocompraSessionBean==null) {
				this.recargocompraSessionBean=new RecargoCompraSessionBean();
			}

			if(!this.recargocompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(recargocompraSessionBean.getlidEmpresaActual());
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

	public void cargarCombosCuentaContableDebitosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.recargocompraSessionBean==null) {
				this.recargocompraSessionBean=new RecargoCompraSessionBean();
			}

			if(!this.recargocompraSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontabledebitoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontabledebitosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableDebito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(recargocompraSessionBean.getlidCuentaContableDebitoActual());
					this.cuentacontabledebitosForeignKey.add(cuentacontableLogic.getCuentaContable());
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

	public void cargarCombosCuentaContableCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.recargocompraSessionBean==null) {
				this.recargocompraSessionBean=new RecargoCompraSessionBean();
			}

			if(!this.recargocompraSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontablecreditoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablecreditosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(recargocompraSessionBean.getlidCuentaContableCreditoActual());
					this.cuentacontablecreditosForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.recargocompra!=null) {
						this.recargocompra.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
						this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRecargoCompra.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
						if(this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRecargoCompraGenerico)throws Exception
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
				jComboBoxid_empresaRecargoCompraGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRecargoCompraGenerico!=null && jComboBoxid_empresaRecargoCompraGenerico.getItemCount()>0) {
					jComboBoxid_empresaRecargoCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableDebitoForeignKey(Long idCuentaContableDebitoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontabledebitoTemp!=null) {

					if(this.recargocompra!=null) {
						this.recargocompra.setCuentaContableDebito(cuentacontabledebitoTemp);
					}

					if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
						this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.setSelectedItem(cuentacontabledebitoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_debitoRecargoCompra.setSelectedItem(cuentacontabledebitoTemp);
					if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
						if(this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDebito") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontabledebitoTemp!=null && jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra!=null) {
						jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setSelectedItem(cuentacontabledebitoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra!=null) {
							//jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setSelectedItem(cuentacontabledebitoTemp);
							if(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.getItemCount()>0) {
								jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setSelectedIndex(0);
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

	public String getActualCuentaContableDebitoForeignKeyDescripcion(Long idCuentaContableDebitoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontabledebitoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableDebitoForeignKeyGenerico(Long idCuentaContableDebitoSeleccionado,JComboBox jComboBoxid_cuenta_contable_debitoRecargoCompraGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}

			if(cuentacontabledebitoTemp!=null) {
				jComboBoxid_cuenta_contable_debitoRecargoCompraGenerico.setSelectedItem(cuentacontabledebitoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_debitoRecargoCompraGenerico!=null && jComboBoxid_cuenta_contable_debitoRecargoCompraGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_debitoRecargoCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableCreditoForeignKey(Long idCuentaContableCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontablecreditoTemp!=null) {

					if(this.recargocompra!=null) {
						this.recargocompra.setCuentaContableCredito(cuentacontablecreditoTemp);
					}

					if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
						this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.setSelectedItem(cuentacontablecreditoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_creditoRecargoCompra.setSelectedItem(cuentacontablecreditoTemp);
					if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
						if(this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontablecreditoTemp!=null && jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra!=null) {
						jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setSelectedItem(cuentacontablecreditoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra!=null) {
							//jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setSelectedItem(cuentacontablecreditoTemp);
							if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.getItemCount()>0) {
								jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setSelectedIndex(0);
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

	public String getActualCuentaContableCreditoForeignKeyDescripcion(Long idCuentaContableCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontablecreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableCreditoForeignKeyGenerico(Long idCuentaContableCreditoSeleccionado,JComboBox jComboBoxid_cuenta_contable_creditoRecargoCompraGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(cuentacontablecreditoTemp!=null) {
				jComboBoxid_cuenta_contable_creditoRecargoCompraGenerico.setSelectedItem(cuentacontablecreditoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_creditoRecargoCompraGenerico!=null && jComboBoxid_cuenta_contable_creditoRecargoCompraGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_creditoRecargoCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RecargoCompra recargocompra,JComboBox jComboBoxid_empresaRecargoCompraGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRecargoCompraGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRecargoCompraGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				recargocompra.setid_empresa(empresaAux.getId());
				recargocompra.setempresa_descripcion(RecargoCompraConstantesFunciones.getEmpresaDescripcion(empresaAux));
				recargocompra.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableDebitoForeignKey(RecargoCompra recargocompra,JComboBox jComboBoxid_cuenta_contable_debitoRecargoCompraGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_debitoRecargoCompraGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_debitoRecargoCompraGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				recargocompra.setid_cuenta_contable_debito(cuentacontableAux.getId());
				recargocompra.setcuentacontabledebito_descripcion(RecargoCompraConstantesFunciones.getCuentaContableDebitoDescripcion(cuentacontableAux));
				recargocompra.setCuentaContableDebito(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCreditoForeignKey(RecargoCompra recargocompra,JComboBox jComboBoxid_cuenta_contable_creditoRecargoCompraGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_creditoRecargoCompraGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_creditoRecargoCompraGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				recargocompra.setid_cuenta_contable_credito(cuentacontableAux.getId());
				recargocompra.setcuentacontablecredito_descripcion(RecargoCompraConstantesFunciones.getCuentaContableCreditoDescripcion(cuentacontableAux));
				recargocompra.setCuentaContableCredito(cuentacontableAux);			}
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

					if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRecargoCompra!=null) { 
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRecargoCompra!=null) { 
					}

					if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableDebitosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRecargoCompra!=null) { 
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.removeAllItems();

							for(CuentaContable cuentacontabledebito:this.cuentacontabledebitosForeignKey) {
								this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.addItem(cuentacontabledebito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRecargoCompra!=null) { 
					}

					if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDebito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.removeAllItems();

							for(CuentaContable cuentacontabledebito:this.cuentacontabledebitosForeignKey) {
								this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.addItem(cuentacontabledebito);
							}
						}

						if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRecargoCompra!=null) { 
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.addItem(cuentacontablecredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRecargoCompra!=null) { 
					}

					if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.addItem(cuentacontablecredito);
							}
						}

						if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableDebitoForeignKey(CuentaContable cuentacontabledebito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.setSelectedItem(cuentacontabledebito);
						}
					} else {
						if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setSelectedItem(cuentacontabledebito);
						} else {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableCreditoForeignKey(CuentaContable cuentacontablecredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.setSelectedItem(cuentacontablecredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setSelectedItem(cuentacontablecredito);
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRecargoCompra() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RecargoCompraConstantesFunciones.refrescarForeignKeysDescripcionesRecargoCompra(this.recargocompraLogic.getRecargoCompras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RecargoCompraConstantesFunciones.refrescarForeignKeysDescripcionesRecargoCompra(this.recargocompras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//recargocompraLogic.setRecargoCompras(this.recargocompras);
			recargocompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RecargoCompraParameterReturnGeneral getRecargoCompraParameterGeneral() {
		return this.recargocompraParameterGeneral;
	}
	
	public void setRecargoCompraParameterGeneral(RecargoCompraParameterReturnGeneral recargocompraParameterGeneral) {
		this.recargocompraParameterGeneral = recargocompraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRecargoCompra() {
		return isPermisoTodoRecargoCompra;
	}

	public void setIsPermisoTodoRecargoCompra(Boolean isPermisoTodoRecargoCompra) {
		this.isPermisoTodoRecargoCompra = isPermisoTodoRecargoCompra;
	}

	public Boolean getIsPermisoNuevoRecargoCompra() {
		return isPermisoNuevoRecargoCompra;
	}

	public void setIsPermisoNuevoRecargoCompra(Boolean isPermisoNuevoRecargoCompra) {
		this.isPermisoNuevoRecargoCompra = isPermisoNuevoRecargoCompra;
	}

	public Boolean getIsPermisoActualizarRecargoCompra() {
		return isPermisoActualizarRecargoCompra;
	}

	public void setIsPermisoActualizarRecargoCompra(Boolean isPermisoActualizarRecargoCompra) {
		this.isPermisoActualizarRecargoCompra = isPermisoActualizarRecargoCompra;
	}

	public Boolean getIsPermisoEliminarRecargoCompra() {
		return isPermisoEliminarRecargoCompra;
	}

	public void setIsPermisoEliminarRecargoCompra(Boolean isPermisoEliminarRecargoCompra) {
		this.isPermisoEliminarRecargoCompra = isPermisoEliminarRecargoCompra;
	}

	public Boolean getIsPermisoGuardarCambiosRecargoCompra() {
		return isPermisoGuardarCambiosRecargoCompra;
	}

	public void setIsPermisoGuardarCambiosRecargoCompra(Boolean isPermisoGuardarCambiosRecargoCompra) {
		this.isPermisoGuardarCambiosRecargoCompra = isPermisoGuardarCambiosRecargoCompra;
	}
	
	public Boolean getIsPermisoConsultaRecargoCompra() {
		return isPermisoConsultaRecargoCompra;
	}

	public void setIsPermisoConsultaRecargoCompra(Boolean isPermisoConsultaRecargoCompra) {
		this.isPermisoConsultaRecargoCompra = isPermisoConsultaRecargoCompra;
	}

	public Boolean getIsPermisoBusquedaRecargoCompra() {
		return isPermisoBusquedaRecargoCompra;
	}

	public void setIsPermisoBusquedaRecargoCompra(Boolean isPermisoBusquedaRecargoCompra) {
		this.isPermisoBusquedaRecargoCompra = isPermisoBusquedaRecargoCompra;
	}

	public Boolean getIsPermisoReporteRecargoCompra() {
		return isPermisoReporteRecargoCompra;
	}

	public void setIsPermisoReporteRecargoCompra(Boolean isPermisoReporteRecargoCompra) {
		this.isPermisoReporteRecargoCompra = isPermisoReporteRecargoCompra;
	}
	
	public Boolean getIsPermisoPaginacionMedioRecargoCompra() {
		return isPermisoPaginacionMedioRecargoCompra;
	}

	public void setIsPermisoPaginacionMedioRecargoCompra(Boolean isPermisoPaginacionMedioRecargoCompra) {
		this.isPermisoPaginacionMedioRecargoCompra = isPermisoPaginacionMedioRecargoCompra;
	}
	
	public Boolean getIsPermisoPaginacionTodoRecargoCompra() {
		return isPermisoPaginacionTodoRecargoCompra;
	}

	public void setIsPermisoPaginacionTodoRecargoCompra(Boolean isPermisoPaginacionTodoRecargoCompra) {
		this.isPermisoPaginacionTodoRecargoCompra = isPermisoPaginacionTodoRecargoCompra;
	}
	
	public Boolean getIsPermisoPaginacionAltoRecargoCompra() {
		return isPermisoPaginacionAltoRecargoCompra;
	}

	public void setIsPermisoPaginacionAltoRecargoCompra(Boolean isPermisoPaginacionAltoRecargoCompra) {
		this.isPermisoPaginacionAltoRecargoCompra = isPermisoPaginacionAltoRecargoCompra;
	}
	
	public Boolean getIsPermisoCopiarRecargoCompra() {
		return isPermisoCopiarRecargoCompra;
	}

	public void setIsPermisoCopiarRecargoCompra(Boolean isPermisoCopiarRecargoCompra) {
		this.isPermisoCopiarRecargoCompra = isPermisoCopiarRecargoCompra;
	}
	
	public Boolean getIsPermisoVerFormRecargoCompra() {
		return isPermisoVerFormRecargoCompra;
	}

	public void setIsPermisoVerFormRecargoCompra(Boolean isPermisoVerFormRecargoCompra) {
		this.isPermisoVerFormRecargoCompra = isPermisoVerFormRecargoCompra;
	}
	
	public Boolean getIsPermisoDuplicarRecargoCompra() {
		return isPermisoDuplicarRecargoCompra;
	}

	public void setIsPermisoDuplicarRecargoCompra(Boolean isPermisoDuplicarRecargoCompra) {
		this.isPermisoDuplicarRecargoCompra = isPermisoDuplicarRecargoCompra;
	}
	
	public Boolean getIsPermisoOrdenRecargoCompra() {
		return isPermisoOrdenRecargoCompra;
	}

	public void setIsPermisoOrdenRecargoCompra(Boolean isPermisoOrdenRecargoCompra) {
		this.isPermisoOrdenRecargoCompra = isPermisoOrdenRecargoCompra;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRecargoCompra() {
		return isVisibilidadCeldaNuevoRecargoCompra;
	}

	public void setIsVisibilidadCeldaNuevoRecargoCompra(Boolean isVisibilidadCeldaNuevoRecargoCompra) {
		this.isVisibilidadCeldaNuevoRecargoCompra = isVisibilidadCeldaNuevoRecargoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRecargoCompra() {
		return isVisibilidadCeldaDuplicarRecargoCompra;
	}

	public void setIsVisibilidadCeldaDuplicarRecargoCompra(Boolean isVisibilidadCeldaDuplicarRecargoCompra) {
		this.isVisibilidadCeldaDuplicarRecargoCompra = isVisibilidadCeldaDuplicarRecargoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRecargoCompra() {
		return isVisibilidadCeldaCopiarRecargoCompra;
	}

	public void setIsVisibilidadCeldaCopiarRecargoCompra(Boolean isVisibilidadCeldaCopiarRecargoCompra) {
		this.isVisibilidadCeldaCopiarRecargoCompra = isVisibilidadCeldaCopiarRecargoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRecargoCompra() {
		return isVisibilidadCeldaVerFormRecargoCompra;
	}

	public void setIsVisibilidadCeldaVerFormRecargoCompra(Boolean isVisibilidadCeldaVerFormRecargoCompra) {
		this.isVisibilidadCeldaVerFormRecargoCompra = isVisibilidadCeldaVerFormRecargoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRecargoCompra() {
		return isVisibilidadCeldaOrdenRecargoCompra;
	}

	public void setIsVisibilidadCeldaOrdenRecargoCompra(Boolean isVisibilidadCeldaOrdenRecargoCompra) {
		this.isVisibilidadCeldaOrdenRecargoCompra = isVisibilidadCeldaOrdenRecargoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRecargoCompra() {
		return isVisibilidadCeldaNuevoRelacionesRecargoCompra;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRecargoCompra(Boolean isVisibilidadCeldaNuevoRelacionesRecargoCompra) {
		this.isVisibilidadCeldaNuevoRelacionesRecargoCompra = isVisibilidadCeldaNuevoRelacionesRecargoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRecargoCompra() {
		return isVisibilidadCeldaModificarRecargoCompra;
	}

	public void setIsVisibilidadCeldaModificarRecargoCompra(Boolean isVisibilidadCeldaModificarRecargoCompra) {
		this.isVisibilidadCeldaModificarRecargoCompra = isVisibilidadCeldaModificarRecargoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRecargoCompra() {
		return isVisibilidadCeldaActualizarRecargoCompra;
	}

	public void setIsVisibilidadCeldaActualizarRecargoCompra(Boolean isVisibilidadCeldaActualizarRecargoCompra) {
		this.isVisibilidadCeldaActualizarRecargoCompra = isVisibilidadCeldaActualizarRecargoCompra;
	}

	public Boolean getIsVisibilidadCeldaEliminarRecargoCompra() {
		return isVisibilidadCeldaEliminarRecargoCompra;
	}

	public void setIsVisibilidadCeldaEliminarRecargoCompra(Boolean isVisibilidadCeldaEliminarRecargoCompra) {
		this.isVisibilidadCeldaEliminarRecargoCompra = isVisibilidadCeldaEliminarRecargoCompra;
	}

	public Boolean getIsVisibilidadCeldaCancelarRecargoCompra() {
		return isVisibilidadCeldaCancelarRecargoCompra;
	}

	public void setIsVisibilidadCeldaCancelarRecargoCompra(Boolean isVisibilidadCeldaCancelarRecargoCompra) {
		this.isVisibilidadCeldaCancelarRecargoCompra = isVisibilidadCeldaCancelarRecargoCompra;
	}

	public Boolean getIsVisibilidadCeldaGuardarRecargoCompra() {
		return isVisibilidadCeldaGuardarRecargoCompra;
	}

	public void setIsVisibilidadCeldaGuardarRecargoCompra(Boolean isVisibilidadCeldaGuardarRecargoCompra) {
		this.isVisibilidadCeldaGuardarRecargoCompra = isVisibilidadCeldaGuardarRecargoCompra;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRecargoCompra() {
		return isVisibilidadCeldaGuardarCambiosRecargoCompra;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRecargoCompra(Boolean isVisibilidadCeldaGuardarCambiosRecargoCompra) {
		this.isVisibilidadCeldaGuardarCambiosRecargoCompra = isVisibilidadCeldaGuardarCambiosRecargoCompra;
	}
		
	public RecargoCompraSessionBean getrecargocompraSessionBean() {
		return this.recargocompraSessionBean;
	}
	
	public void setrecargocompraSessionBean(RecargoCompraSessionBean recargocompraSessionBean) {
		this.recargocompraSessionBean=recargocompraSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableCredito() {
		return this.isVisibilidadFK_IdCuentaContableCredito;
	}

	public void setisVisibilidadFK_IdCuentaContableCredito(Boolean isVisibilidadFK_IdCuentaContableCredito) {
		this.isVisibilidadFK_IdCuentaContableCredito=isVisibilidadFK_IdCuentaContableCredito;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableDebito() {
		return this.isVisibilidadFK_IdCuentaContableDebito;
	}

	public void setisVisibilidadFK_IdCuentaContableDebito(Boolean isVisibilidadFK_IdCuentaContableDebito) {
		this.isVisibilidadFK_IdCuentaContableDebito=isVisibilidadFK_IdCuentaContableDebito;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(RecargoCompra recargocompra)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(recargocompra,null);
				this.setActualParaGuardarCuentaContableDebitoForeignKey(recargocompra,null);
				this.setActualParaGuardarCuentaContableCreditoForeignKey(recargocompra,null);
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
	
	public void bugActualizarReferenciaActual(RecargoCompra recargocompra,RecargoCompra recargocompraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRecargoCompra(recargocompra);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		recargocompraAux.setId(recargocompra.getId());
		recargocompraAux.setVersionRow(recargocompra.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRecargoCompra();
		
			int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RecargoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRecargoCompra(this.recargocompra,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = recargocompraValidator.getInvalidValues(this.recargocompra);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			recargocompraLogic.setDatosCliente(datosCliente);
			recargocompraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				recargocompraAux=new  RecargoCompra();
				
				recargocompraAux.setIsNew(true);
				recargocompraAux.setIsChanged(true);
				
				recargocompraAux.setRecargoCompraOriginal(this.recargocompra);
				
				recargocompraAux.setId(this.recargocompra.getId());	
				recargocompraAux.setVersionRow(this.recargocompra.getVersionRow());	
				recargocompraAux.setid_empresa(this.recargocompra.getid_empresa());	
				recargocompraAux.setnombre(this.recargocompra.getnombre());	
				recargocompraAux.setid_cuenta_contable_debito(this.recargocompra.getid_cuenta_contable_debito());	
				recargocompraAux.setid_cuenta_contable_credito(this.recargocompra.getid_cuenta_contable_credito());	
				recargocompraAux.setes_servicio(this.recargocompra.getes_servicio());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.recargocompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.recargocompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(recargocompraAux,recargocompraLogic.getRecargoCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recargocompraAux,recargocompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.recargocompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.recargocompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocompraLogic.saveRecargoCompras();//WithConnection
						//recargocompraLogic.getSetVersionRowRecargoCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.recargocompra,recargocompraAux);
					
					this.refrescarForeignKeysDescripcionesRecargoCompra();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.recargocompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								recargocompraLogic.saveRecargoCompraRelaciones(recargocompraAux);//WithConnection
								//recargocompraLogic.getSetVersionRowRecargoCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.recargocompra,recargocompraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.recargocompraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.recargocompraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(recargocompraAux,recargocompraLogic.getRecargoCompras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(recargocompraAux,recargocompras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.recargocompra,recargocompraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				recargocompraAux=new  RecargoCompra();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.recargocompraSessionBean.getEsGuardarRelacionado() 
					|| (this.recargocompraSessionBean.getEsGuardarRelacionado() && this.recargocompra.getId()>=0)) {
						
					recargocompraAux.setIsNew(false);
				}
				
				recargocompraAux.setIsDeleted(false);
			
				recargocompraAux.setId(this.recargocompra.getId());	
				recargocompraAux.setVersionRow(this.recargocompra.getVersionRow());	
				recargocompraAux.setid_empresa(this.recargocompra.getid_empresa());	
				recargocompraAux.setnombre(this.recargocompra.getnombre());	
				recargocompraAux.setid_cuenta_contable_debito(this.recargocompra.getid_cuenta_contable_debito());	
				recargocompraAux.setid_cuenta_contable_credito(this.recargocompra.getid_cuenta_contable_credito());	
				recargocompraAux.setes_servicio(this.recargocompra.getes_servicio());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(recargocompraAux,recargocompraLogic.getRecargoCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recargocompraAux,recargocompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.recargocompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.recargocompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocompraLogic.saveRecargoCompras();//WithConnection
						//recargocompraLogic.getSetVersionRowRecargoCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.recargocompra,recargocompraAux);
					
					this.refrescarForeignKeysDescripcionesRecargoCompra();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.recargocompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								recargocompraLogic.saveRecargoCompraRelaciones(recargocompraAux);//WithConnection
								//recargocompraLogic.getSetVersionRowRecargoCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.recargocompra,recargocompraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.recargocompraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.recargocompraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(recargocompraAux,recargocompraLogic.getRecargoCompras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(recargocompraAux,recargocompras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.recargocompra,recargocompraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				recargocompraAux=new  RecargoCompra();
				
				recargocompraAux.setIsNew(false);
				recargocompraAux.setIsChanged(false);
				
				recargocompraAux.setIsDeleted(true);
				
				recargocompraAux.setId(this.recargocompra.getId());	
				recargocompraAux.setVersionRow(this.recargocompra.getVersionRow());	
				recargocompraAux.setid_empresa(this.recargocompra.getid_empresa());	
				recargocompraAux.setnombre(this.recargocompra.getnombre());	
				recargocompraAux.setid_cuenta_contable_debito(this.recargocompra.getid_cuenta_contable_debito());	
				recargocompraAux.setid_cuenta_contable_credito(this.recargocompra.getid_cuenta_contable_credito());	
				recargocompraAux.setes_servicio(this.recargocompra.getes_servicio());	
				
				if(this.recargocompraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.recargocompraAux.getId()>=0) {	
						this.recargocomprasEliminados.add(recargocompraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(recargocompraAux,recargocompraLogic.getRecargoCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recargocompraAux,recargocompras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.recargocompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.recargocompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocompraLogic.saveRecargoCompras();//WithConnection
						//recargocompraLogic.getSetVersionRowRecargoCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.recargocompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								recargocompraLogic.saveRecargoCompraRelaciones(recargocompraAux);//WithConnection
								//recargocompraLogic.getSetVersionRowRecargoCompras();//WithConnection
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
							if(this.recargocompraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.recargocompraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(recargocompraAux,recargocompraLogic.getRecargoCompras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(recargocompraAux,recargocompras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.getRecargoCompras().addAll(this.recargocomprasEliminados);
					
					recargocompraLogic.saveRecargoCompras();//WithConnection
					//recargocompraLogic.getSetVersionRowRecargoCompras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRecargoCompra();
				
				this.recargocomprasEliminados= new ArrayList<RecargoCompra>();		
			}
			
			if(this.recargocompraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Recargo Compra GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Recargo Compra",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.recargocompra=recargocompraAux;
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
      		//this.finishProcessRecargoCompra();
      	}
		
	}	
	
	public void actualizarRelaciones(RecargoCompra recargocompraLocal) throws Exception {
		
		if(this.recargocompraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RecargoCompra recargocompraLocal) throws Exception {	
		if(this.recargocompraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				recargocompraLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontabledebitoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontabledebitoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontabledebitosForeignKey);

				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				recargocompraLocal.setCuentaContableDebito(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableDebito();
				this.cargarCombosFrameCuentaContableDebitosForeignKey("Formulario");
				this.setActualCuentaContableDebitoForeignKey(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecreditoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecreditosForeignKey);

				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				recargocompraLocal.setCuentaContableCredito(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey("Formulario");
				this.setActualCuentaContableCreditoForeignKey(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRecargoCompraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = recargocompraValidator.getInvalidValues(this.recargocompra);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RecargoCompra recargocompra,List<RecargoCompra> recargocompras) throws Exception {
		try	{		
			RecargoCompraConstantesFunciones.actualizarLista(recargocompra,recargocompras,this.recargocompraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RecargoCompra recargocompra,List<RecargoCompra> recargocompras) throws Exception {
		try	{			
			RecargoCompraConstantesFunciones.actualizarSelectedLista(recargocompra,recargocompras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RecargoCompra> recargocomprasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				recargocomprasLocal=this.recargocompraLogic.getRecargoCompras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				recargocomprasLocal=this.recargocompras;
			}
			//ARCHITECTURE
		
			for(RecargoCompra recargocompraLocal:recargocomprasLocal) {
				if(this.permiteMantenimiento(recargocompraLocal) && recargocompraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RecargoCompraConstantesFunciones.getRecargoCompraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RecargoCompraConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecargoCompra.jLabelid_empresaRecargoCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecargoCompraConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecargoCompra.jLabelnombreRecargoCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecargoCompraConstantesFunciones.IDCUENTACONTABLEDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecargoCompra.jLabelid_cuenta_contable_debitoRecargoCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecargoCompraConstantesFunciones.IDCUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecargoCompra.jLabelid_cuenta_contable_creditoRecargoCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecargoCompraConstantesFunciones.ESSERVICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecargoCompra.jLabeles_servicioRecargoCompra,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecargoCompra.jLabelid_empresaRecargoCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecargoCompra.jLabelnombreRecargoCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecargoCompra.jLabelid_cuenta_contable_debitoRecargoCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecargoCompra.jLabelid_cuenta_contable_creditoRecargoCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecargoCompra.jLabeles_servicioRecargoCompra,"");
		
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
		this.iIdNuevoRecargoCompra--;	
		
		
		this.recargocompraAux=new RecargoCompra();
		
		this.recargocompraAux.setId(this.iIdNuevoRecargoCompra);
		this.recargocompraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.recargocompraLogic.getRecargoCompras().add(this.recargocompraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.recargocompras.add(this.recargocompraAux);
		}
		//ARCHITECTURE
		
		this.recargocompra=this.recargocompraAux;
		
		if(RecargoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRecargoCompra(this.recargocompra);
			this.setVariablesObjetoActualToFormularioForeignKeyRecargoCompra(this.recargocompra);
		}
				
		//this.setDefaultControlesRecargoCompra();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRecargoCompra();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRecargoCompra();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRecargoCompra();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRecargoCompra(this.recargocompraBean,this.recargocompra,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RecargoCompraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.recargocompraSessionBean.getConGuardarRelaciones()) {
			classes=RecargoCompraConstantesFunciones.getClassesRelationshipsOfRecargoCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.recargocompraReturnGeneral=recargocompraLogic.procesarEventosRecargoComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.recargocompraLogic.getRecargoCompras(),this.recargocompra,this.recargocompraParameterGeneral,this.isEsNuevoRecargoCompra,classes);//this.recargocompraLogic.getRecargoCompra()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRecargoCompra(this.recargocompraReturnGeneral,this.recargocompraBean,false);
		
		if(this.recargocompraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRecargoCompra(this.recargocompraReturnGeneral.getRecargoCompra());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRecargoCompra(this.recargocompraReturnGeneral.getRecargoCompra());
		}
		
		if(this.recargocompraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRecargoCompra(this.recargocompraReturnGeneral.getRecargoCompra(),classes);//this.recargocompraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRecargoCompra(this.recargocompra,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRecargoCompra();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRecargoCompra();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RecargoCompraBeanSwingJInternalFrameAdditional.RecargarFormRecargoCompra(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRecargoCompra(false);
						
			if(recargocompraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRecargoCompra();
			}
			
			this.actualizarVisualTableDatosRecargoCompra();
			
			this.jTableDatosRecargoCompra.setRowSelectionInterval(this.getIndiceNuevoRecargoCompra(), this.getIndiceNuevoRecargoCompra());
			
			this.seleccionarFilaTablaRecargoCompraActual();
						
			this.actualizarEstadoCeldasBotonesRecargoCompra("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRecargoCompra(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRecargoCompra.jTextFieldnombreRecargoCompra.setEnabled(isHabilitar && this.recargocompraConstantesFunciones.activarnombreRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxes_servicioRecargoCompra.setEnabled(isHabilitar && this.recargocompraConstantesFunciones.activares_servicioRecargoCompra);	
		//
		this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.setEnabled(isHabilitar && this.recargocompraConstantesFunciones.activarid_empresaRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.setEnabled(isHabilitar && this.recargocompraConstantesFunciones.activarid_cuenta_contable_debitoRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.setEnabled(isHabilitar && this.recargocompraConstantesFunciones.activarid_cuenta_contable_creditoRecargoCompra);
	};
	
	public void setDefaultControlesRecargoCompra() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRecargoCompra(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.recargocompraSessionBean.setConGuardarRelaciones(true);			
			this.recargocompraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRecargoCompra.jTabbedPaneRelacionesRecargoCompra.setVisible(true);
			
					
		} else {
			//this.recargocompraSessionBean.setConGuardarRelaciones(false);			
			this.recargocompraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRecargoCompra.jTabbedPaneRelacionesRecargoCompra.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRecargoCompra() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RecargoCompra recargocompraAux:this.recargocompraLogic.getRecargoCompras()) {
				if(recargocompraAux.getId().equals(this.iIdNuevoRecargoCompra)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RecargoCompra recargocompraAux:this.recargocompras) {
				if(recargocompraAux.getId().equals(this.iIdNuevoRecargoCompra)) {
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
	
	public int getIndiceActualRecargoCompra(RecargoCompra recargocompra,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RecargoCompra recargocompraAux:this.recargocompraLogic.getRecargoCompras()) {
				if(recargocompraAux.getId().equals(recargocompra.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RecargoCompra recargocompraAux:this.recargocompras) {
				if(recargocompraAux.getId().equals(recargocompra.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRecargoCompra(RecargoCompra recargocompraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RecargoCompra recargocompraAux:this.recargocompraLogic.getRecargoCompras()) {
				if(recargocompraAux.getRecargoCompraOriginal().getId().equals(recargocompraOriginal.getId())) {
					existe=true;
					recargocompraOriginal.setId(recargocompraAux.getId());
					recargocompraOriginal.setVersionRow(recargocompraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RecargoCompra recargocompraAux:this.recargocompras) {
				if(recargocompraAux.getRecargoCompraOriginal().getId().equals(recargocompraOriginal.getId())) {
					existe=true;
					recargocompraOriginal.setId(recargocompraAux.getId());
					recargocompraOriginal.setVersionRow(recargocompraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRecargoCompra(Boolean esParaCancelar) throws Exception {
		recargocomprasAux=new ArrayList<RecargoCompra>();
		recargocompraAux=new RecargoCompra();
		
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RecargoCompra recargocompraAux:this.recargocompraLogic.getRecargoCompras()) {
					if(recargocompraAux.getId()<0) {
						recargocomprasAux.add(recargocompraAux);
					}		
				}
				this.iIdNuevoRecargoCompra=0L;
				this.recargocompraLogic.getRecargoCompras().removeAll(recargocomprasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RecargoCompra recargocompraAux:this.recargocompras) {
					if(recargocompraAux.getId()<0) {
						recargocomprasAux.add(recargocompraAux);
					}		
				}
				this.iIdNuevoRecargoCompra=0L;
				this.recargocompras.removeAll(recargocomprasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRecargoCompra 
					&& this.recargocompraLogic.getRecargoCompras().size()>0
					) {
					recargocompraAux=this.recargocompraLogic.getRecargoCompras().get(this.recargocompraLogic.getRecargoCompras().size() - 1);
				
					if(recargocompraAux.getId()<0) {
						this.recargocompraLogic.getRecargoCompras().remove(recargocompraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRecargoCompra && this.recargocompras.size()>0) {
					recargocompraAux=this.recargocompras.get(this.recargocompras.size() - 1);
				
					if(recargocompraAux.getId()<0) {
						this.recargocompras.remove(recargocompraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRecargoCompra(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(recargocompra.getId()<0) {
				this.recargocompraLogic.getRecargoCompras().remove(this.recargocompra);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(recargocompra.getId()<0) {
				this.recargocompras.remove(this.recargocompra);
			}
		}			
	}
	
	public void setEstadosInicialesRecargoCompra(List<RecargoCompra> recargocomprasAux) throws Exception {
		RecargoCompraConstantesFunciones.setEstadosInicialesRecargoCompra(recargocomprasAux);
	}
	
	public void setEstadosInicialesRecargoCompra(RecargoCompra recargocompraAux) throws Exception {
		RecargoCompraConstantesFunciones.setEstadosInicialesRecargoCompra(recargocompraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRecargoCompraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRecargoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRecargoCompraActual()) {
				if(!this.isEsNuevoRecargoCompra) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRecargoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRecargoCompra=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRecargoCompraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Recargo Compra ?", "MANTENIMIENTO DE Recargo Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRecargoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RecargoCompra recargocompra) throws Exception {
		RecargoCompraConstantesFunciones.seleccionarAsignar(this.recargocompra,recargocompra);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRecargoCompra=this.isPermisoActualizarOriginalRecargoCompra;
			
			
			this.seleccionarAsignar(recargocompra);
			
			

			idCuentaContableDebitoActual=recargocompra.getid_cuenta_contable_debito();
			this.seleccionarCuentaContableDebitoActual();

			idCuentaContableCreditoActual=recargocompra.getid_cuenta_contable_credito();
			this.seleccionarCuentaContableCreditoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RecargoCompraConstantesFunciones.quitarEspaciosRecargoCompra(this.recargocompra,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRecargoCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.recargocompraSessionBean.setsFuncionBusquedaRapida(this.recargocompraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableDebitoActual() throws Exception {
		try	{
			CuentaContable cuentacontabledebitoAux=new CuentaContable();

			if(this.idCuentaContableDebitoActual != null && this.idCuentaContableDebitoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabledebitoLogic.getEntityWithConnection(this.idCuentaContableDebitoActual);
					cuentacontabledebitoAux= cuentacontabledebitoLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();
				cuentacontabledebitosForeignKey.add(cuentacontabledebitoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCuentaContableCreditoActual() throws Exception {
		try	{
			CuentaContable cuentacontablecreditoAux=new CuentaContable();

			if(this.idCuentaContableCreditoActual != null && this.idCuentaContableCreditoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontablecreditoLogic.getEntityWithConnection(this.idCuentaContableCreditoActual);
					cuentacontablecreditoAux= cuentacontablecreditoLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();
				cuentacontablecreditosForeignKey.add(cuentacontablecreditoAux);
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
			if(this.isEsNuevoRecargoCompra) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRecargoCompra(esParaCancelar);				
				this.cancelarNuevoRecargoCompra(esParaCancelar);								
			}
			
			this.recargocompra=new RecargoCompra();
			
			this.inicializarRecargoCompra();
			
			this.actualizarEstadoCeldasBotonesRecargoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRecargoCompra() throws Exception {
		try {
			RecargoCompraConstantesFunciones.inicializarRecargoCompra(this.recargocompra);
			
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
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.recargocompraLogic.getRecargoCompras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRecargoCompras(String sAccionBusqueda,List<RecargoCompra> recargocomprasParaReportes) throws Exception {
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
					sPathReporteFinal="RecargoCompra"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RecargoCompraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RecargoCompraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RecargoCompra"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Recargo Compraes");		
		parameters.put("busquedapor", RecargoCompraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRecargoCompra=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RecargoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RecargoCompraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRecargoCompra=new JRBeanArrayDataSource(RecargoCompraJInternalFrame.TraerRecargoCompraBeans(recargocomprasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRecargoCompra);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RecargoCompraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RecargoCompraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RecargoCompraBean.TraerRecargoCompraBeans(recargocomprasParaReportes).toArray()));
							
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
				this.generarExcelReporteRecargoCompras(sAccionBusqueda,sTipoArchivoReporte,recargocomprasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRecargoCompras(sAccionBusqueda,sTipoArchivoReporte,recargocomprasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRecargoCompraActionPerformed(null);
					//this.generarExcelReporteRecargoCompras(sAccionBusqueda,sTipoArchivoReporte,recargocomprasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRecargoCompras(sAccionBusqueda,sTipoArchivoReporte,recargocomprasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRecargoCompras(sAccionBusqueda,sTipoArchivoReporte,recargocomprasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRecargoCompras(sAccionBusqueda,sTipoArchivoReporte,recargocomprasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRecargoCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<RecargoCompra> recargocomprasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recargocompra";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RecargoCompras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRecargoCompra("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RecargoCompra recargocompra : recargocomprasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RecargoCompraConstantesFunciones.generarExcelReporteDataRecargoCompra("NORMAL",row,workbook,recargocompra,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recargo Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRecargoCompra(String sTipo,Row row,Workbook workbook) {
		
		RecargoCompraConstantesFunciones.generarExcelReporteHeaderRecargoCompra(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRecargoCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<RecargoCompra> recargocomprasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recargocompra_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RecargoCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RecargoCompra recargocompra : recargocomprasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RecargoCompraConstantesFunciones.getRecargoCompraDescripcion(recargocompra));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecargoCompraConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recargocompra.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecargoCompraConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recargocompra.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recargocompra.getcuentacontabledebito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recargocompra.getcuentacontablecredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecargoCompraConstantesFunciones.LABEL_ESSERVICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_ESSERVICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(recargocompra.getes_servicio()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recargo Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRecargoCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<RecargoCompra> recargocomprasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RecargoCompra> recargocomprasRespaldo=null;
		
		classes=RecargoCompraConstantesFunciones.getClassesRelationshipsOfRecargoCompra(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.recargocompraLogic.setDatosCliente(this.datosCliente);
		this.recargocompraLogic.setDatosDeep(this.datosDeep);
		this.recargocompraLogic.setIsConDeep(true);
		
		recargocomprasRespaldo=this.recargocompraLogic.getRecargoCompras();
		
		this.recargocompraLogic.setRecargoCompras(recargocomprasParaReportes);	
		this.recargocompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		recargocomprasParaReportes=this.recargocompraLogic.getRecargoCompras();
		this.recargocompraLogic.setRecargoCompras(recargocomprasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recargocompra_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RecargoCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRecargoCompra("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RecargoCompra recargocompra : recargocomprasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRecargoCompra("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RecargoCompraConstantesFunciones.generarExcelReporteDataRecargoCompra("NORMAL",row,workbook,recargocompra,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RecargoCompraConstantesFunciones.getRecargoCompraDescripcion(recargocompra));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recargo Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRecargoCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRecargoCompra.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRecargoCompra() throws Exception {		
		this.startProcessRecargoCompra(true);
	}
	
	public void startProcessRecargoCompra(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRecargoCompra ,this.jPanelParametrosReportesRecargoCompra, this.jScrollPanelDatosRecargoCompra,this.jPanelPaginacionRecargoCompra, this.jScrollPanelDatosEdicionRecargoCompra, this.jPanelAccionesRecargoCompra,this.jPanelAccionesFormularioRecargoCompra,this.jmenuBarRecargoCompra,this.jmenuBarDetalleRecargoCompra,this.jTtoolBarRecargoCompra,this.jTtoolBarDetalleRecargoCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasRecargoCompra=this.jTabbedPaneBusquedasRecargoCompra; 
		
		final JPanel jPanelParametrosReportesRecargoCompra=this.jPanelParametrosReportesRecargoCompra;
		//final JScrollPane jScrollPanelDatosRecargoCompra=this.jScrollPanelDatosRecargoCompra;
		final JTable jTableDatosRecargoCompra=this.jTableDatosRecargoCompra;		
		final JPanel jPanelPaginacionRecargoCompra=this.jPanelPaginacionRecargoCompra;
		//final JScrollPane jScrollPanelDatosEdicionRecargoCompra=this.jScrollPanelDatosEdicionRecargoCompra;
		final JPanel jPanelAccionesRecargoCompra=this.jPanelAccionesRecargoCompra;
		
		JPanel jPanelCamposAuxiliarRecargoCompra=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRecargoCompra=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			jPanelCamposAuxiliarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jPanelCamposRecargoCompra;
			jPanelAccionesFormularioAuxiliarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jPanelAccionesFormularioRecargoCompra;
		}
		
		final JPanel jPanelCamposRecargoCompra=jPanelCamposAuxiliarRecargoCompra;
		final JPanel jPanelAccionesFormularioRecargoCompra=jPanelAccionesFormularioAuxiliarRecargoCompra;
		
		
		final JMenuBar jmenuBarRecargoCompra=this.jmenuBarRecargoCompra;
		final JToolBar jTtoolBarRecargoCompra=this.jTtoolBarRecargoCompra;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRecargoCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRecargoCompra=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			jmenuBarDetalleAuxiliarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jmenuBarDetalleRecargoCompra;
			jTtoolBarDetalleAuxiliarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jTtoolBarDetalleRecargoCompra;
		}
		
		final JMenuBar jmenuBarDetalleRecargoCompra=jmenuBarDetalleAuxiliarRecargoCompra;
		final JToolBar jTtoolBarDetalleRecargoCompra=jTtoolBarDetalleAuxiliarRecargoCompra;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRecargoCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRecargoCompra;
			processRunnable.jTableDatos=jTableDatosRecargoCompra;
			processRunnable.jPanelCampos=jPanelCamposRecargoCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionRecargoCompra;
			processRunnable.jPanelAcciones=jPanelAccionesRecargoCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRecargoCompra;
			
			
			processRunnable.jmenuBar=jmenuBarRecargoCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRecargoCompra;
			processRunnable.jTtoolBar=jTtoolBarRecargoCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRecargoCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRecargoCompra ,jPanelParametrosReportesRecargoCompra,jTableDatosRecargoCompra, /*jScrollPanelDatosRecargoCompra,*/jPanelCamposRecargoCompra,jPanelPaginacionRecargoCompra, /*jScrollPanelDatosEdicionRecargoCompra,*/ jPanelAccionesRecargoCompra,jPanelAccionesFormularioRecargoCompra,jmenuBarRecargoCompra,jmenuBarDetalleRecargoCompra,jTtoolBarRecargoCompra,jTtoolBarDetalleRecargoCompra);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRecargoCompra ,jPanelParametrosReportesRecargoCompra, jScrollPanelDatosRecargoCompra,jPanelPaginacionRecargoCompra, jScrollPanelDatosEdicionRecargoCompra, jPanelAccionesRecargoCompra,jPanelAccionesFormularioRecargoCompra,jmenuBarRecargoCompra,jmenuBarDetalleRecargoCompra,jTtoolBarRecargoCompra,jTtoolBarDetalleRecargoCompra);
						
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
	
	public void finishProcessRecargoCompra() {// throws Exception 
		this.finishProcessRecargoCompra(true);
	}
	
	public void finishProcessRecargoCompra(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRecargoCompra ,this.jPanelParametrosReportesRecargoCompra, this.jScrollPanelDatosRecargoCompra,this.jPanelPaginacionRecargoCompra, this.jScrollPanelDatosEdicionRecargoCompra, this.jPanelAccionesRecargoCompra,this.jPanelAccionesFormularioRecargoCompra,this.jmenuBarRecargoCompra,this.jmenuBarDetalleRecargoCompra,this.jTtoolBarRecargoCompra,this.jTtoolBarDetalleRecargoCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasRecargoCompra=this.jTabbedPaneBusquedasRecargoCompra; 
		
		final JPanel jPanelParametrosReportesRecargoCompra=this.jPanelParametrosReportesRecargoCompra;
		//final JScrollPane jScrollPanelDatosRecargoCompra=this.jScrollPanelDatosRecargoCompra;
		final JTable jTableDatosRecargoCompra=this.jTableDatosRecargoCompra;		
		final JPanel jPanelPaginacionRecargoCompra=this.jPanelPaginacionRecargoCompra;
		//final JScrollPane jScrollPanelDatosEdicionRecargoCompra=this.jScrollPanelDatosEdicionRecargoCompra;
		final JPanel jPanelAccionesRecargoCompra=this.jPanelAccionesRecargoCompra;
		
		JPanel jPanelCamposAuxiliarRecargoCompra=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRecargoCompra=new JPanel();
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			jPanelCamposAuxiliarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jPanelCamposRecargoCompra;
			jPanelAccionesFormularioAuxiliarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jPanelAccionesFormularioRecargoCompra;
		}
		
		final JPanel jPanelCamposRecargoCompra=jPanelCamposAuxiliarRecargoCompra;
		final JPanel jPanelAccionesFormularioRecargoCompra=jPanelAccionesFormularioAuxiliarRecargoCompra;
		
		
		final JMenuBar jmenuBarRecargoCompra=this.jmenuBarRecargoCompra;		
		final JToolBar jTtoolBarRecargoCompra=this.jTtoolBarRecargoCompra;
				
		JMenuBar jmenuBarDetalleAuxiliarRecargoCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRecargoCompra=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			jmenuBarDetalleAuxiliarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jmenuBarDetalleRecargoCompra;
			jTtoolBarDetalleAuxiliarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jTtoolBarDetalleRecargoCompra;		
		}
		
		final JMenuBar jmenuBarDetalleRecargoCompra=jmenuBarDetalleAuxiliarRecargoCompra;
		final JToolBar jTtoolBarDetalleRecargoCompra=jTtoolBarDetalleAuxiliarRecargoCompra;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRecargoCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRecargoCompra;
			processRunnable.jTableDatos=jTableDatosRecargoCompra;
			processRunnable.jPanelCampos=jPanelCamposRecargoCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionRecargoCompra;
			processRunnable.jPanelAcciones=jPanelAccionesRecargoCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRecargoCompra;
			
			
			processRunnable.jmenuBar=jmenuBarRecargoCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRecargoCompra;
			processRunnable.jTtoolBar=jTtoolBarRecargoCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRecargoCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRecargoCompra ,jPanelParametrosReportesRecargoCompra, jTableDatosRecargoCompra,/*jScrollPanelDatosRecargoCompra,*/jPanelCamposRecargoCompra,jPanelPaginacionRecargoCompra, /*jScrollPanelDatosEdicionRecargoCompra,*/ jPanelAccionesRecargoCompra,jPanelAccionesFormularioRecargoCompra,jmenuBarRecargoCompra,jmenuBarDetalleRecargoCompra,jTtoolBarRecargoCompra,jTtoolBarDetalleRecargoCompra));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRecargoCompra(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRecargoCompra(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRecargoCompra(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRecargoCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRecargoCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRecargoCompra,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRecargoCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRecargoCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRecargoCompra,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.recargocompraConstantesFunciones.getsFinalQueryRecargoCompra();
		String  finalQueryPaginacionTodos=this.recargocompraConstantesFunciones.getsFinalQueryRecargoCompra();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RecargoCompraConstantesFunciones.getArrayColumnasGlobalesNoRecargoCompra(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RecargoCompraConstantesFunciones.getArrayColumnasGlobalesRecargoCompra(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RecargoCompraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.recargocomprasEliminados= new ArrayList<RecargoCompra>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRecargoCompra();
		
				///*RecargoCompraSessionBean*/this.recargocompraSessionBean=new RecargoCompraSessionBean();
			
			if(this.recargocompraSessionBean==null) {
				this.recargocompraSessionBean=new RecargoCompraSessionBean();
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
					this.iNumeroPaginacion=RecargoCompraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RecargoCompraConstantesFunciones.getClassesForeignKeysOfRecargoCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/recargocompra."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			recargocomprasAux= new ArrayList<RecargoCompra>();
			
				
			recargocompraLogic.setDatosCliente(this.datosCliente);
			recargocompraLogic.setDatosDeep(this.datosDeep);
			recargocompraLogic.setIsConDeep(true);
			
			
			recargocompraLogic.getRecargoCompraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					recargocompraLogic.getTodosRecargoCompras(finalQueryGlobal,pagination);
					
					//recargocompraLogic.getTodosRecargoComprasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(recargocompraLogic.getRecargoCompras()==null|| recargocompraLogic.getRecargoCompras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							recargocomprasAux= new ArrayList<RecargoCompra>();
							recargocomprasAux.addAll(recargocompraLogic.getRecargoCompras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recargocomprasAux= new ArrayList<RecargoCompra>();
							recargocomprasAux.addAll(recargocompras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							recargocompraLogic.getTodosRecargoCompras(finalQueryGlobal+"",this.pagination);												
							
							//recargocompraLogic.getTodosRecargoComprasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRecargoCompras("Todos",recargocompraLogic.getRecargoCompras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							recargocompraLogic.setRecargoCompras(new ArrayList<RecargoCompra>());					
							recargocompraLogic.getRecargoCompras().addAll(recargocomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recargocompras=new ArrayList<RecargoCompra>();
							recargocompras.addAll(recargocomprasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRecargoCompra=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRecargoCompra=this.idActual;
				
				} else if(this.idRecargoCompraActual!=null && this.idRecargoCompraActual!=0L) {
					idRecargoCompra=idRecargoCompraActual;
				}
				
					
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndicePorId(idRecargoCompra);
				
				this.recargocompras=new ArrayList<RecargoCompra>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					recargocompraLogic.getEntity(idRecargoCompra);
					
					//recargocompraLogic.getEntityWithConnection(idRecargoCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recargocompraLogic.setRecargoCompras(new ArrayList<RecargoCompra>());
					recargocompraLogic.getRecargoCompras().add(recargocompraLogic.getRecargoCompra());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recargocompras=new ArrayList<RecargoCompra>();
					this.recargocompras.add(recargocompra);
				}
				
				if(recargocompraLogic.getRecargoCompra()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					recargocompraLogic.getRecargoComprasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=recargocompraLogic.getRecargoCompras()==null||recargocompraLogic.getRecargoCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=recargocompras==null|| recargocompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocomprasAux=new ArrayList<RecargoCompra>();
						recargocomprasAux.addAll(recargocompraLogic.getRecargoCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recargocomprasAux=new ArrayList<RecargoCompra>();
							recargocomprasAux.addAll(recargocompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							recargocompraLogic.getRecargoComprasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRecargoCompras("BusquedaPorNombre",recargocompraLogic.getRecargoCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRecargoCompras("BusquedaPorNombre",recargocompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocompraLogic.setRecargoCompras(new ArrayList<RecargoCompra>());
						recargocompraLogic.getRecargoCompras().addAll(recargocomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recargocompras=new ArrayList<RecargoCompra>();
							recargocompras.addAll(recargocomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableCredito")) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					recargocompraLogic.getRecargoComprasFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=recargocompraLogic.getRecargoCompras()==null||recargocompraLogic.getRecargoCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=recargocompras==null|| recargocompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocomprasAux=new ArrayList<RecargoCompra>();
						recargocomprasAux.addAll(recargocompraLogic.getRecargoCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recargocomprasAux=new ArrayList<RecargoCompra>();
							recargocomprasAux.addAll(recargocompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							recargocompraLogic.getRecargoComprasFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRecargoCompras("FK_IdCuentaContableCredito",recargocompraLogic.getRecargoCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRecargoCompras("FK_IdCuentaContableCredito",recargocompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocompraLogic.setRecargoCompras(new ArrayList<RecargoCompra>());
						recargocompraLogic.getRecargoCompras().addAll(recargocomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recargocompras=new ArrayList<RecargoCompra>();
							recargocompras.addAll(recargocomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableDebito")) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					recargocompraLogic.getRecargoComprasFK_IdCuentaContableDebito(finalQueryGlobal,pagination,id_cuenta_contable_debitoFK_IdCuentaContableDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=recargocompraLogic.getRecargoCompras()==null||recargocompraLogic.getRecargoCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=recargocompras==null|| recargocompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocomprasAux=new ArrayList<RecargoCompra>();
						recargocomprasAux.addAll(recargocompraLogic.getRecargoCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recargocomprasAux=new ArrayList<RecargoCompra>();
							recargocomprasAux.addAll(recargocompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							recargocompraLogic.getRecargoComprasFK_IdCuentaContableDebito(finalQueryGlobal,pagination,id_cuenta_contable_debitoFK_IdCuentaContableDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRecargoCompras("FK_IdCuentaContableDebito",recargocompraLogic.getRecargoCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRecargoCompras("FK_IdCuentaContableDebito",recargocompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocompraLogic.setRecargoCompras(new ArrayList<RecargoCompra>());
						recargocompraLogic.getRecargoCompras().addAll(recargocomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recargocompras=new ArrayList<RecargoCompra>();
							recargocompras.addAll(recargocomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					recargocompraLogic.getRecargoComprasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=recargocompraLogic.getRecargoCompras()==null||recargocompraLogic.getRecargoCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=recargocompras==null|| recargocompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocomprasAux=new ArrayList<RecargoCompra>();
						recargocomprasAux.addAll(recargocompraLogic.getRecargoCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recargocomprasAux=new ArrayList<RecargoCompra>();
							recargocomprasAux.addAll(recargocompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							recargocompraLogic.getRecargoComprasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecargoCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRecargoCompras("FK_IdEmpresa",recargocompraLogic.getRecargoCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRecargoCompras("FK_IdEmpresa",recargocompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocompraLogic.setRecargoCompras(new ArrayList<RecargoCompra>());
						recargocompraLogic.getRecargoCompras().addAll(recargocomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recargocompras=new ArrayList<RecargoCompra>();
							recargocompras.addAll(recargocomprasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRecargoCompra();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRecargoCompra();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=recargocompraLogic.getRecargoCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=recargocompras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=recargocompraLogic.getRecargoCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=recargocompras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RecargoCompra recargocompra) {
		Boolean permite=true;
		
		if(this.recargocompra.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RecargoCompraConstantesFunciones.getOrderByListaRecargoCompra();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RecargoCompraConstantesFunciones.getOrderByListaRecargoCompra();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RecargoCompra recargocompra:recargocompraLogic.getRecargoCompras()) {
				if(recargocompra.getsType().equals(Constantes2.S_TOTALES)) {
					recargocompraTotales=recargocompra;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RecargoCompra recargocompra:this.recargocompras) {
				if(recargocompra.getsType().equals(Constantes2.S_TOTALES)) {
					recargocompraTotales=recargocompra;
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
			this.recargocompraAux=new RecargoCompra();
			this.recargocompraAux.setsType(Constantes2.S_TOTALES);
			this.recargocompraAux.setIsNew(false);
			this.recargocompraAux.setIsChanged(false);
			this.recargocompraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RecargoCompraConstantesFunciones.TotalizarValoresFilaRecargoCompra(this.recargocompraLogic.getRecargoCompras(),this.recargocompraAux);
				
				this.recargocompraLogic.getRecargoCompras().add(this.recargocompraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RecargoCompraConstantesFunciones.TotalizarValoresFilaRecargoCompra(this.recargocompras,this.recargocompraAux);
				
				this.recargocompras.add(this.recargocompraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		recargocompraTotales=new RecargoCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.recargocompraLogic.getRecargoCompras().remove(recargocompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.recargocompras.remove(recargocompraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		recargocompraTotales=new RecargoCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RecargoCompra recargocompra:recargocompraLogic.getRecargoCompras()) {
				if(recargocompra.getsType().equals(Constantes2.S_TOTALES)) {
					recargocompraTotales=recargocompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RecargoCompraConstantesFunciones.TotalizarValoresFilaRecargoCompra(this.recargocompraLogic.getRecargoCompras(),recargocompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RecargoCompra recargocompra:this.recargocompras) {
				if(recargocompra.getsType().equals(Constantes2.S_TOTALES)) {
					recargocompraTotales=recargocompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RecargoCompraConstantesFunciones.TotalizarValoresFilaRecargoCompra(this.recargocompras,recargocompraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRecargoComprasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRecargoComprasFK_IdCuentaContableCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRecargoComprasFK_IdCuentaContableDebito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableDebito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRecargoComprasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRecargoComprasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recargocompraLogic.getRecargoComprasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRecargoComprasFK_IdCuentaContableCredito(String sFinalQuery,Long id_cuenta_contable_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recargocompraLogic.getRecargoComprasFK_IdCuentaContableCredito(sFinalQuery,this.pagination,id_cuenta_contable_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRecargoComprasFK_IdCuentaContableDebito(String sFinalQuery,Long id_cuenta_contable_debito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recargocompraLogic.getRecargoComprasFK_IdCuentaContableDebito(sFinalQuery,this.pagination,id_cuenta_contable_debito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRecargoComprasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recargocompraLogic.getRecargoComprasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosRecargoCompra() {
		this.isPermisoTodoRecargoCompra=false;
		this.isPermisoNuevoRecargoCompra=false;
		this.isPermisoActualizarRecargoCompra=false;
		this.isPermisoActualizarOriginalRecargoCompra=false;
		this.isPermisoEliminarRecargoCompra=false;
		this.isPermisoGuardarCambiosRecargoCompra=false;
		this.isPermisoConsultaRecargoCompra=false;
		this.isPermisoBusquedaRecargoCompra=false;
		this.isPermisoReporteRecargoCompra=false;		
		this.isPermisoOrdenRecargoCompra=false;		
		this.isPermisoPaginacionMedioRecargoCompra=false;		
		this.isPermisoPaginacionAltoRecargoCompra=false;
		this.isPermisoPaginacionTodoRecargoCompra=false;
		this.isPermisoCopiarRecargoCompra=false;		
		this.isPermisoVerFormRecargoCompra=false;		
		this.isPermisoDuplicarRecargoCompra=false;		
		this.isPermisoOrdenRecargoCompra=false;		
	}
	
	public void setPermisosUsuarioRecargoCompra(Boolean isPermiso) {
		this.isPermisoTodoRecargoCompra=isPermiso;
		this.isPermisoNuevoRecargoCompra=isPermiso;
		this.isPermisoActualizarRecargoCompra=isPermiso;
		this.isPermisoActualizarOriginalRecargoCompra=isPermiso;
		this.isPermisoEliminarRecargoCompra=isPermiso;
		this.isPermisoGuardarCambiosRecargoCompra=isPermiso;
		this.isPermisoConsultaRecargoCompra=isPermiso;
		this.isPermisoBusquedaRecargoCompra=isPermiso;
		this.isPermisoReporteRecargoCompra=isPermiso;
		this.isPermisoOrdenRecargoCompra=isPermiso;		
		this.isPermisoPaginacionMedioRecargoCompra=isPermiso;		
		this.isPermisoPaginacionAltoRecargoCompra=isPermiso;		
		this.isPermisoPaginacionTodoRecargoCompra=isPermiso;		
		this.isPermisoCopiarRecargoCompra=isPermiso;		
		this.isPermisoVerFormRecargoCompra=isPermiso;		
		this.isPermisoDuplicarRecargoCompra=isPermiso;
		this.isPermisoOrdenRecargoCompra=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRecargoCompra(Boolean isPermiso) {
		//this.isPermisoTodoRecargoCompra=isPermiso;
		this.isPermisoNuevoRecargoCompra=isPermiso;
		this.isPermisoActualizarRecargoCompra=isPermiso;
		this.isPermisoActualizarOriginalRecargoCompra=isPermiso;
		this.isPermisoEliminarRecargoCompra=isPermiso;
		this.isPermisoGuardarCambiosRecargoCompra=isPermiso;
		//this.isPermisoConsultaRecargoCompra=isPermiso;
		//this.isPermisoBusquedaRecargoCompra=isPermiso;
		//this.isPermisoReporteRecargoCompra=isPermiso;
		//this.isPermisoOrdenRecargoCompra=isPermiso;		
		//this.isPermisoPaginacionMedioRecargoCompra=isPermiso;		
		//this.isPermisoPaginacionAltoRecargoCompra=isPermiso;		
		//this.isPermisoPaginacionTodoRecargoCompra=isPermiso;		
		//this.isPermisoCopiarRecargoCompra=isPermiso;		
		//this.isPermisoDuplicarRecargoCompra=isPermiso;
		//this.isPermisoOrdenRecargoCompra=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRecargoCompraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RecargoCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRecargoCompra(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRecargoCompraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRecargoCompraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRecargoCompraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRecargoCompraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRecargoCompra() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RecargoCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.recargocompraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RecargoCompraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRecargoCompra=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRecargoCompra=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRecargoCompra=this.isPermisoActualizarRecargoCompra;
			this.isPermisoEliminarRecargoCompra=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRecargoCompra=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRecargoCompra=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRecargoCompra=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRecargoCompra=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRecargoCompra=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRecargoCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRecargoCompra=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRecargoCompra=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRecargoCompra=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRecargoCompra=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRecargoCompra=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRecargoCompra=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRecargoCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.recargocompraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRecargoCompra.setToolTipText(this.jTableDatosRecargoCompra.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRecargoCompra(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRecargoCompra(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RecargoCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RecargoCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRecargoCompra() throws Exception {
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
	public void inicializarCombosForeignKeyRecargoCompraListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cuentacontabledebitosForeignKey=new ArrayList();
				this.cuentacontablecreditosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRecargoCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RecargoCompraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRecargoCompraListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCuentaContableDebitoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontabledebitosForeignKey==null||this.cuentacontabledebitosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableDebitosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyRecargoCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RecargoCompraParameterReturnGeneral recargocompraReturnGeneral=new RecargoCompraParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.recargocompraConstantesFunciones.cargarid_empresaRecargoCompra)
					 || (this.esRecargarFks && this.recargocompraConstantesFunciones.cargarid_empresaRecargoCompra)) {

					if(!this.recargocompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+recargocompraSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCuentaContableDebito="";

				if(((this.cuentacontabledebitosForeignKey==null||this.cuentacontabledebitosForeignKey.size()<=0) && this.recargocompraConstantesFunciones.cargarid_cuenta_contable_debitoRecargoCompra)
					 || (this.esRecargarFks && this.recargocompraConstantesFunciones.cargarid_cuenta_contable_debitoRecargoCompra)) {

					if(!this.recargocompraSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableDebito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableDebito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableDebito, "");
						finalQueryGlobalCuentaContableDebito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableDebitosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableDebito=" WHERE " + ConstantesSql.ID + "="+recargocompraSessionBean.getlidCuentaContableDebitoActual();
					}
				} else {
					finalQueryGlobalCuentaContableDebito="NONE";
				}


				String finalQueryGlobalCuentaContableCredito="";

				if(((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0) && this.recargocompraConstantesFunciones.cargarid_cuenta_contable_creditoRecargoCompra)
					 || (this.esRecargarFks && this.recargocompraConstantesFunciones.cargarid_cuenta_contable_creditoRecargoCompra)) {

					if(!this.recargocompraSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCredito, "");
						finalQueryGlobalCuentaContableCredito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCredito=" WHERE " + ConstantesSql.ID + "="+recargocompraSessionBean.getlidCuentaContableCreditoActual();
					}
				} else {
					finalQueryGlobalCuentaContableCredito="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				recargocompraReturnGeneral=recargocompraLogic.cargarCombosLoteForeignKeyRecargoCompra(finalQueryGlobalEmpresa,finalQueryGlobalCuentaContableDebito,finalQueryGlobalCuentaContableCredito);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=recargocompraReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCuentaContableDebito.equals("NONE")) {
				this.cuentacontabledebitosForeignKey=recargocompraReturnGeneral.getcuentacontabledebitosForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCredito.equals("NONE")) {
				this.cuentacontablecreditosForeignKey=recargocompraReturnGeneral.getcuentacontablecreditosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRecargoCompra()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCuentaContableDebito();
			this.addItemDefectoCombosForeignKeyCuentaContableCredito();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.recargocompraSessionBean==null) {
				this.recargocompraSessionBean=new RecargoCompraSessionBean();
			}

			if(!this.recargocompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContableDebito()throws Exception {
		try {

			if(!this.recargocompraSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
				CuentaContable cuentacontabledebito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontabledebito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontabledebito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontabledebitosForeignKey,cuentacontabledebito,true)) {

					this.cuentacontabledebitosForeignKey.add(0,cuentacontabledebito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableCredito()throws Exception {
		try {

			if(!this.recargocompraSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				CuentaContable cuentacontablecredito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontablecredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontablecredito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablecreditosForeignKey,cuentacontablecredito,true)) {

					this.cuentacontablecreditosForeignKey.add(0,cuentacontablecredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRecargoCompra()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRecargoCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRecargoCompra()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRecargoCompra();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRecargoCompra(RecargoCompra recargocompra)throws Exception {	
		try {
			
			this.setActualCuentaContableDebitoForeignKey(recargocompra.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(recargocompra.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRecargoCompra(RecargoCompra recargocompra,String sTipoEvento)throws Exception {	
		try {
			
			

				if(recargocompra.getCuentaContableDebito()!=null && !sTipoEvento.equals("id_cuenta_contable_debitoRecargoCompra")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontabledebitosForeignKey.add(recargocompra.getCuentaContableDebito());

					this.addItemDefectoCombosForeignKeyCuentaContableDebito();
					this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
				}

				if(recargocompra.getCuentaContableCredito()!=null && !sTipoEvento.equals("id_cuenta_contable_creditoRecargoCompra")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablecreditosForeignKey.add(recargocompra.getCuentaContableCredito());

					this.addItemDefectoCombosForeignKeyCuentaContableCredito();
					this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRecargoCompra()throws Exception {	
		try {
			
			this.setActualCuentaContableDebitoForeignKey(this.recargocompraConstantesFunciones.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(this.recargocompraConstantesFunciones.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRecargoCompra()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRecargoCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRecargoCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRecargoCompra()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRecargoCompra()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRecargoCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableDebitosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRecargoCompra()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra!=null && this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra!=null && this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra!=null && this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public RecargoCompraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RecargoCompraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RecargoCompraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.recargocompraSessionBean=new RecargoCompraSessionBean(); 
		this.recargocompraConstantesFunciones=new RecargoCompraConstantesFunciones(); 
		this.recargocompraBean=new RecargoCompra();//(this.recargocompraConstantesFunciones); 		
		this.recargocompraReturnGeneral=new RecargoCompraParameterReturnGeneral(); 
		
		this.recargocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.recargocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RecargoCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RecargoCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RecargoCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRecargoCompra(true);
			
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
			
			this.recargocompraConstantesFunciones=new RecargoCompraConstantesFunciones(); 
			this.recargocompraBean=new RecargoCompra();//this.recargocompraConstantesFunciones); 			
			this.recargocompraReturnGeneral=new RecargoCompraParameterReturnGeneral(); 
		
			RecargoCompraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Recargo Compra Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.recargocompra=new RecargoCompra();
			this.recargocompras = new ArrayList<RecargoCompra>();
			this.recargocomprasAux = new ArrayList<RecargoCompra>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic=new RecargoCompraLogic();
				this.recargocompraLogic.getNewConnexionToDeep("");
			}
			
			//this.recargocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.recargocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRecargoCompra);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRecargoCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRecargoCompra);	
					}
					
					if(this.jInternalFrameImportacionRecargoCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRecargoCompra);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRecargoCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRecargoCompra);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRecargoCompra);
				this.jInternalFrameDetalleFormRecargoCompra.setVisible(false);
				this.jInternalFrameDetalleFormRecargoCompra.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRecargoCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRecargoCompra);
					this.jInternalFrameReporteDinamicoRecargoCompra.setVisible(false);
					this.jInternalFrameReporteDinamicoRecargoCompra.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRecargoCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRecargoCompra);
					this.jInternalFrameImportacionRecargoCompra.setVisible(false);
					this.jInternalFrameImportacionRecargoCompra.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRecargoCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRecargoCompra);
					this.jInternalFrameOrderByRecargoCompra.setVisible(false);
					this.jInternalFrameOrderByRecargoCompra.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRecargoCompraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RecargoCompraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.recargocompraReturnGeneral=new RecargoCompraParameterReturnGeneral();
			
			this.recargocompraParameterGeneral=new RecargoCompraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.recargocompraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RecargoCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.recargocompraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RecargoCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.recargocompraSessionBean.getEsGuardarRelacionado(),this.recargocompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RecargoCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.recargocompraSessionBean.getEsGuardarRelacionado(),this.recargocompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRecargoCompra=false;
			this.isVisibilidadCeldaDuplicarRecargoCompra=true;
			this.isVisibilidadCeldaCopiarRecargoCompra=true;
			this.isVisibilidadCeldaVerFormRecargoCompra=true;
			this.isVisibilidadCeldaOrdenRecargoCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=false;
			this.isVisibilidadCeldaModificarRecargoCompra=false;
			this.isVisibilidadCeldaActualizarRecargoCompra=false;
			this.isVisibilidadCeldaEliminarRecargoCompra=false;
			this.isVisibilidadCeldaCancelarRecargoCompra=false;
			this.isVisibilidadCeldaGuardarRecargoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdCuentaContableCredito=true;
			this.isVisibilidadFK_IdCuentaContableDebito=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRecargoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRecargoCompra();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRecargoCompra(false);
			
			this.setPermisosUsuarioRecargoCompra();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.recargocompraSessionBean.getEsGuardarRelacionado() 
				|| (this.recargocompraSessionBean.getEsGuardarRelacionado() && this.recargocompraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRecargoCompraClasesRelacionadas();
			}
			
			if(this.recargocompraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRecargoCompraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRecargoCompra();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRecargoCompra();
			}
			
			if(!this.isPermisoBusquedaRecargoCompra) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRecargoCompra.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRecargoCompra,this.isPermisoPaginacionMedioRecargoCompra,this.isPermisoPaginacionTodoRecargoCompra);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RecargoCompraConstantesFunciones.getTiposSeleccionarRecargoCompra());
				
				this.tiposColumnasSelect=RecargoCompraConstantesFunciones.getTiposSeleccionarRecargoCompra(true);
				
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
			//if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRecargoCompra();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioRecargoCompra(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioRecargoCompra(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRecargoCompra() ;
			
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
			this.cuentacontabledebitoLogic=new CuentaContableLogic();
			this.cuentacontablecreditoLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				recargocompraImplementable= (RecargoCompraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RecargoCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				recargocompraImplementableHome= (RecargoCompraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RecargoCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.recargocompras= new ArrayList<RecargoCompra>();
			this.recargocomprasEliminados= new ArrayList<RecargoCompra>();
						
			this.isEsNuevoRecargoCompra=false;
			this.esParaAccionDesdeFormularioRecargoCompra=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableDebitoActual=0L;
			this.idCuentaContableCreditoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRecargoCompra(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRecargoCompra();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RecargoCompraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RecargoCompraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRecargoCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRecargoCompra(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRecargoCompra!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRecargoCompra();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRecargoCompra();
			}
			
			RecargoCompraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRecargoCompra.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRecargoCompra.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRecargoCompra.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRecargoCompra(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RecargoCompra: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRecargoCompra() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRecargoCompra")) {
				iIndex=this.jInternalFrameDetalleFormRecargoCompra.jTabbedPaneRelacionesRecargoCompra.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRecargoCompra.jTabbedPaneRelacionesRecargoCompra.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRecargoCompra();	
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
	
	public void cargarCombosForeignKeyRecargoCompra(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRecargoCompra(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRecargoCompra(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRecargoCompraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRecargoCompra();
		
		this.cargarCombosFrameForeignKeyRecargoCompra();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRecargoCompra();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRecargoCompra();
		}
	}
	
	

	public void cargarCombosForeignKeyCuentaContableDebito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableDebito();
				this.cargarCombosFrameCuentaContableDebitosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableDebito(this.cuentacontabledebitosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRecargoCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.recargocompraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
			
			if(jTableDatosRecargoCompra.getRowCount()>=1) {
				jTableDatosRecargoCompra.removeRowSelectionInterval(0, jTableDatosRecargoCompra.getRowCount()-1);						
			}
			
			this.isEsNuevoRecargoCompra=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRecargoCompra(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRecargoCompra(true);			
			//this.recargocompra=new RecargoCompra();
			//this.recargocompra.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRecargoCompra(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRecargoCompra() ;
			
			if(RecargoCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRecargoCompra(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.recargocompra);	
			this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);				
			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
			if(this.recargocompraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RecargoCompra: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRecargoCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRecargoCompra.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRecargoCompra.getSelectedRows().length;			
			}
			
			recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRecargoCompra--;			
				//RecargoCompra recargocompraAux= new RecargoCompra();			
				//recargocompraAux.setId(this.iIdNuevoRecargoCompra);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RecargoCompra recargocompraOrigen=new RecargoCompra();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RecargoCompra recargocompraOrigen : recargocomprasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							recargocompraOrigen =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recargocompraOrigen =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRecargoCompra();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.recargocompra.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRecargoCompra(recargocompraOrigen,this.recargocompra,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.recargocompraLogic.getRecargoCompras().add(this.recargocompraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.recargocompras.add(this.recargocompraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRecargoCompra(false);
				
				this.jTableDatosRecargoCompra.setRowSelectionInterval(this.getIndiceNuevoRecargoCompra(), this.getIndiceNuevoRecargoCompra());
				
				int iLastRow =  this.jTableDatosRecargoCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRecargoCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRecargoCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRecargoCompra(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRecargoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();									
		
			RecargoCompra recargocompraOrigen=new RecargoCompra();
			RecargoCompra recargocompraDestino=new RecargoCompra();
				
			recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRecargoCompra.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || recargocomprasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRecargoCompra.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocompraOrigen =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						recargocompraOrigen =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recargocompraDestino =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						recargocompraDestino =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				recargocompraOrigen =recargocomprasSeleccionados.get(0);
				recargocompraDestino =recargocomprasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRecargoCompra(recargocompraOrigen,recargocompraDestino,true,false);
				
				recargocompraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(recargocompraDestino,recargocompraLogic.getRecargoCompras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recargocompraDestino,recargocompras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRecargoCompra(false);
				
				//this.jTableDatosRecargoCompra.setRowSelectionInterval(this.getIndiceNuevoRecargoCompra(), this.getIndiceNuevoRecargoCompra());
				
				int iLastRow =  this.jTableDatosRecargoCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRecargoCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRecargoCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRecargoCompra(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRecargoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRecargoCompra.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRecargoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRecargoCompra.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRecargoCompra.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRecargoCompra.setVisible(!isVisible);
			this.jPanelPaginacionRecargoCompra.setVisible(!isVisible);
			this.jPanelAccionesRecargoCompra.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRecargoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRecargoCompra();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRecargoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRecargoCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRecargoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRecargoCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRecargoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRecargoCompra();
			
			this.abrirFrameOrderByRecargoCompra();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRecargoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRecargoCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRecargoCompra(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRecargoCompra);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRecargoCompra.isMaximum()) {
					this.jInternalFrameDetalleFormRecargoCompra.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRecargoCompra.setSize(this.jInternalFrameDetalleFormRecargoCompra.iWidthFormulario,this.jInternalFrameDetalleFormRecargoCompra.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRecargoCompra.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRecargoCompra.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRecargoCompra.isMaximum()) {
						this.jInternalFrameDetalleFormRecargoCompra.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRecargoCompra.jContentPaneDetalleRecargoCompra.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRecargoCompra.jTabbedPaneRelacionesRecargoCompra.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRecargoCompra.jContentPaneDetalleRecargoCompra.getWidth(),RecargoCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRecargoCompra.jTabbedPaneRelacionesRecargoCompra.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRecargoCompra.jContentPaneDetalleRecargoCompra.getWidth(),RecargoCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRecargoCompra.jTabbedPaneRelacionesRecargoCompra.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRecargoCompra.jContentPaneDetalleRecargoCompra.getWidth(),RecargoCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRecargoCompra.setVisible(true);
	        this.jInternalFrameDetalleFormRecargoCompra.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRecargoCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRecargoCompra==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRecargoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRecargoCompra,false,this);
				} else {
					this.jInternalFrameOrderByRecargoCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRecargoCompra,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRecargoCompra);
				this.jInternalFrameOrderByRecargoCompra.setVisible(false);
				this.jInternalFrameOrderByRecargoCompra.setSelected(false);
				
				this.jInternalFrameOrderByRecargoCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRecargoCompra"));
				
				this.inicializarActualizarBindingTablaOrderByRecargoCompra();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRecargoCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRecargoCompra==null) {
				
				this.jInternalFrameImportacionRecargoCompra=new ImportacionJInternalFrame(RecargoCompraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRecargoCompra);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRecargoCompra);
				this.jInternalFrameImportacionRecargoCompra.setVisible(false);
				this.jInternalFrameImportacionRecargoCompra.setSelected(false);


				this.jInternalFrameImportacionRecargoCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRecargoCompra"));
				this.jInternalFrameImportacionRecargoCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRecargoCompra"));
				this.jInternalFrameImportacionRecargoCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRecargoCompra"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRecargoCompra() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRecargoCompra==null) {
				this.jInternalFrameReporteDinamicoRecargoCompra=new ReporteDinamicoJInternalFrame(RecargoCompraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRecargoCompra);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRecargoCompra);
				this.jInternalFrameReporteDinamicoRecargoCompra.setVisible(false);
				this.jInternalFrameReporteDinamicoRecargoCompra.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRecargoCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRecargoCompra"));
				this.jInternalFrameReporteDinamicoRecargoCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRecargoCompra"));
				this.jInternalFrameReporteDinamicoRecargoCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRecargoCompra"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRecargoCompra();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRecargoCompra() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRecargoCompra);
			
	       	this.jInternalFrameDetalleFormRecargoCompra.setVisible(false);
	        this.jInternalFrameDetalleFormRecargoCompra.setSelected(false);
			
			//this.jInternalFrameDetalleFormRecargoCompra.dispose();
			//this.jInternalFrameDetalleFormRecargoCompra=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRecargoCompra() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRecargoCompra.setVisible(true);
	        this.jInternalFrameReporteDinamicoRecargoCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRecargoCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRecargoCompra.setVisible(true);
	        this.jInternalFrameImportacionRecargoCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRecargoCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRecargoCompra.setVisible(true);
	        this.jInternalFrameOrderByRecargoCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRecargoCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRecargoCompra.setVisible(false);
	        this.jInternalFrameOrderByRecargoCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRecargoCompra() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRecargoCompra.setVisible(false);
	        this.jInternalFrameReporteDinamicoRecargoCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRecargoCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRecargoCompra.setVisible(false);
	        this.jInternalFrameImportacionRecargoCompra.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContableDebito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableDebito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderRecargoCompra=(TitledBorder)this.jScrollPanelDatosRecargoCompra.getBorder();
						TitledBorder titledBorderCuentaContableDebito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableDebito.setTitle(titledBorderRecargoCompra.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableDebito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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

				public void abrirFrameTreeCuentaContableCredito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableCredito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderRecargoCompra=(TitledBorder)this.jScrollPanelDatosRecargoCompra.getBorder();
						TitledBorder titledBorderCuentaContableCredito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCredito.setTitle(titledBorderRecargoCompra.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableCredito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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
	
	public void jButtonModificarRecargoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRecargoCompra(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRecargoCompra(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRecargoCompra(true);
			//this.isEsNuevoRecargoCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRecargoCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRecargoCompra(false) ;
			
			if(recargocompraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RecargoCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRecargoCompra(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRecargoCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRecargoCompraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRecargoCompra(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRecargoCompra(true);
			//this.isEsNuevoRecargoCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.recargocompra.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRecargoCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRecargoCompra(false) ;
			
			if(RecargoCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRecargoCompra(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRecargoCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContableDebito")) {
				if(!this.recargocompraConstantesFunciones.cargarid_cuenta_contable_debitoRecargoCompra) {
					this.cargarCombosCuentaContableDebitosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingRecargoCompra(false,false);
					this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_debito (id);

				this.recargarComboTablaCuentaContableDebito(this.cuentacontabledebitosForeignKey);

			}
			
			if(sType.equals("CuentaContableCredito")) {
				if(!this.recargocompraConstantesFunciones.cargarid_cuenta_contable_creditoRecargoCompra) {
					this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingRecargoCompra(false,false);
					this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito (id);

				this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCuentaContableDebito(List<CuentaContable> cuentacontabledebitosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableDebito=this.jTableDatosRecargoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompra,RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));
		TableCellEditor tableCellEditorCuentaContableDebito =tableColumnCuentaContableDebito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableDebito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontabledebitosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRecargoCompra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontabledebitosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableCredito(List<CuentaContable> cuentacontablecreditosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableCredito=this.jTableDatosRecargoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompra,RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));
		TableCellEditor tableCellEditorCuentaContableCredito =tableColumnCuentaContableCredito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCredito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRecargoCompra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablecreditosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_debito (Long id) throws Exception {
		this.setActualCuentaContableDebitoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_credito (Long id) throws Exception {
		this.setActualCuentaContableCreditoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarRecargoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRecargoCompra(false);
			
			//if(!this.isEsNuevoRecargoCompra) {								
				int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RecargoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRecargoCompra(this.recargocompra,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
				
			}
			
			if(this.permiteMantenimiento(this.recargocompra)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRecargoCompra=true;
					this.inicializarActualizarBindingTablaRecargoCompra(false);
					this.isEsNuevoRecargoCompra=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRecargoCompra=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRecargoCompra=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRecargoCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRecargoCompra(false);
				
				this.habilitarDeshabilitarControlesRecargoCompra(false);
			
												
				
				if(RecargoCompraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRecargoCompra();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRecargoCompraActionPerformed(evt,recargocompraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRecargoCompra(this.recargocompra,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRecargoCompra.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,recargocompraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.recargocompra.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RecargoCompra.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RecargoCompra.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRecargoCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				this.recargocompra.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				this.recargocompra.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.recargocompra)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RecargoCompraModel) this.jTableDatosRecargoCompra.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRecargoCompra=true;
				this.inicializarActualizarBindingTablaRecargoCompra(false);
				this.isEsNuevoRecargoCompra=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRecargoCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRecargoCompra(false);
				
				this.habilitarDeshabilitarControlesRecargoCompra(false);
				
				
				
				if(RecargoCompraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRecargoCompra();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRecargoCompraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRecargoCompra.getRowCount()>=1) {
				jTableDatosRecargoCompra.removeRowSelectionInterval(0, jTableDatosRecargoCompra.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRecargoCompra(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRecargoCompra(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRecargoCompra(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRecargoCompra(false) ;
			
			this.isEsNuevoRecargoCompra=false;
			
			if(RecargoCompraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRecargoCompra();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRecargoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRecargoCompra(false);
				
				//SI ES MANUAL
				if(RecargoCompraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRecargoCompra();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRecargoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRecargoCompra--;			
			//RecargoCompra recargocompraAux= new RecargoCompra();			
			//recargocompraAux.setId(this.iIdNuevoRecargoCompra);
			
			if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRecargoCompra();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
			
			this.recargocompra.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.recargocompraLogic.getRecargoCompras().add(this.recargocompraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.recargocompras.add(this.recargocompraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRecargoCompra(false);
			
			this.jTableDatosRecargoCompra.setRowSelectionInterval(this.getIndiceNuevoRecargoCompra(), this.getIndiceNuevoRecargoCompra());
			
			int iLastRow =  this.jTableDatosRecargoCompra.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRecargoCompra.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRecargoCompra.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRecargoCompra(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRecargoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRecargoCompra(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRecargoCompra(false);
			
			//SI ES MANUAL
			if(RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRecargoCompra();
			}
			
			//this.abrirFrameTreeRecargoCompra();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRecargoCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Recargo CompraES ?", "MANTENIMIENTO DE Recargo Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRecargoCompra.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRecargoCompra();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.recargocompraReturnGeneral=recargocompraLogic.procesarImportacionRecargoComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.recargocompraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRecargoCompraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRecargoCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRecargoCompra.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRecargoCompra.setFileImportacion(this.jInternalFrameImportacionRecargoCompra.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRecargoCompra.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRecargoCompra.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRecargoCompra.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRecargoCompra.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRecargoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();		

		recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RecargoCompraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RecargoCompraBaseDesign.jrxml";
			
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
			
			this.generarReporteRecargoCompras("Todos",recargocomprasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recargo Compra",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRecargoCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RecargoCompraConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecargoCompraConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableDebito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableDebito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableDebito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableDebito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecargoCompraConstantesFunciones.LABEL_ESSERVICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Servicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Servicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Servicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Servicio_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRecargoCompra.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RecargoCompraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RecargoCompraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoria="id_cuenta_contable_debito";
					break;

				case RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoria="id_cuenta_contable_credito";
					break;

				case RecargoCompraConstantesFunciones.LABEL_ESSERVICIO:
					sNombreCampoCategoria="es_servicio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RecargoCompraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RecargoCompraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_debito";
					break;

				case RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_credito";
					break;

				case RecargoCompraConstantesFunciones.LABEL_ESSERVICIO:
					sNombreCampoCategoriaValor="es_servicio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRecargoCompra.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RecargoCompraConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RecargoCompraConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta C. Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_debito");
					break;

				case RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta C. Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_credito");
					break;

				case RecargoCompraConstantesFunciones.LABEL_ESSERVICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Servicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_servicio");
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
	
	public void jButtonGenerarExcelReporteDinamicoRecargoCompraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();		
		
		recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recargocompra";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RecargoCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRecargoCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RecargoCompraConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RecargoCompra recargocompra:recargocomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recargocompra.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecargoCompraConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(RecargoCompra recargocompra:recargocomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recargocompra.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
					iRow++;

					for(RecargoCompra recargocompra:recargocomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recargocompra.getcuentacontabledebito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
					iRow++;

					for(RecargoCompra recargocompra:recargocomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recargocompra.getcuentacontablecredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecargoCompraConstantesFunciones.LABEL_ESSERVICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_ESSERVICIO);
					iRow++;

					for(RecargoCompra recargocompra:recargocomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recargocompra.getes_servicio());
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
			//	this.getFilaCabeceraExportarExcelRecargoCompra(row);				
			//	iRow++;
			//}				
			
			//for(RecargoCompra recargocompraAux:recargocomprasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRecargoCompra(recargocompraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recargo Compra",JOptionPane.INFORMATION_MESSAGE);
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
				this.recargocompraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRecargoCompra(false);
			
			//SI ES MANUAL
			if(RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRecargoCompra();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRecargoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRecargoCompra(false);
			
			//SI ES MANUAL
			if(RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRecargoCompra();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRecargoCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRecargoCompra(false);
			
			//SI ES MANUAL
			if(RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRecargoCompra();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRecargoCompra() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRecargoCompra.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRecargoCompra.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRecargoCompra.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRecargoCompra.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRecargoCompra.setMinimumSize(dimensionMinimum);
		this.jTableDatosRecargoCompra.setMaximumSize(dimensionMaximum);
		this.jTableDatosRecargoCompra.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRecargoCompra(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRecargoCompra(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRecargoCompra(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRecargoCompra(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRecargoCompra(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRecargoCompra(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRecargoCompra(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRecargoCompra(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RecargoCompraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRecargoCompra() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRecargoCompra();
		
		this.inicializarActualizarBindingBotonesManualRecargoCompra(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRecargoCompra();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRecargoCompra() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRecargoCompra(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRecargoCompra(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRecargoCompra.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRecargoCompra.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRecargoCompra.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxPostAccionNuevoRecargoCompra.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxPostAccionSinCerrarRecargoCompra.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxPostAccionSinMensajeRecargoCompra.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRecargoCompra.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRecargoCompra.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRecargoCompra.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
				this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxPostAccionNuevoRecargoCompra.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxPostAccionSinCerrarRecargoCompra.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxPostAccionSinMensajeRecargoCompra.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRecargoCompra.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRecargoCompra.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRecargoCompra.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRecargoCompra!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRecargoCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRecargoCompra.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRecargoCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRecargoCompra.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRecargoCompra!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRecargoCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRecargoCompra.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRecargoCompra.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRecargoCompra(Boolean esInicializar) throws Exception {
		try	{	
			if(RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRecargoCompra(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRecargoCompra() throws Exception {
		try	{
			if(RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRecargoCompra();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRecargoCompra() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRecargoCompra() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRecargoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRecargoCompra.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRecargoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRecargoCompra.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRecargoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRecargoCompra.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRecargoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRecargoCompra.addItem(reporte);
			}
			
			
			if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRecargoCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRecargoCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRecargoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRecargoCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRecargoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRecargoCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRecargoCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRecargoCompra.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRecargoCompra.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRecargoCompra();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRecargoCompra() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRecargoCompra!=null) {
				this.jInternalFrameReporteDinamicoRecargoCompra.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRecargoCompra.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRecargoCompra!=null) {
				this.jInternalFrameReporteDinamicoRecargoCompra.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRecargoCompra.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRecargoCompra!=null) {
				
				if(this.jInternalFrameReporteDinamicoRecargoCompra.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRecargoCompra.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRecargoCompra.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRecargoCompra.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRecargoCompra.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRecargoCompra.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRecargoCompra()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreRecargoCompra.getText();
		if(this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.getSelectedItem()!=null){this.id_cuenta_contable_creditoFK_IdCuentaContableCredito=((CuentaContable)this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoRecargoCompra.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.getSelectedItem()!=null){this.id_cuenta_contable_debitoFK_IdCuentaContableDebito=((CuentaContable)this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoRecargoCompra.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRecargoCompra(Boolean esInicializar) throws Exception {				
		if(RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRecargoCompra();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRecargoCompra() throws Exception {
		this.inicializarActualizarBindingTablaRecargoCompra(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRecargoCompra() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RecargoCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RecargoCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRecargoCompraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RecargoCompraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RecargoCompraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRecargoCompra(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=recargocompraLogic.getRecargoCompras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=recargocompras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RecargoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRecargoCompra.setModel(new RecargoCompraModel(this.recargocompraLogic.getRecargoCompras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRecargoCompra.setModel(new RecargoCompraModel(this.recargocompras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRecargoCompra!=null && this.jInternalFrameOrderByRecargoCompra.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRecargoCompra();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRecargoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompra,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RecargoCompraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO,recargocompraConstantesFunciones.resaltarSeleccionarRecargoCompra,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO,recargocompraConstantesFunciones.resaltarSeleccionarRecargoCompra,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRecargoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompra,RecargoCompraConstantesFunciones.LABEL_ID));

		if(this.recargocompraConstantesFunciones.mostraridRecargoCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecargoCompraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recargocompraConstantesFunciones.resaltaridRecargoCompra,this.recargocompraConstantesFunciones.activaridRecargoCompra,this,true,"idRecargoCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recargocompraConstantesFunciones.resaltaridRecargoCompra,this.recargocompraConstantesFunciones.activaridRecargoCompra,this,true,"idRecargoCompra","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecargoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompra,RecargoCompraConstantesFunciones.LABEL_IDEMPRESA));

		if(this.recargocompraConstantesFunciones.mostrarid_empresaRecargoCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecargoCompraConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.recargocompraConstantesFunciones.resaltarid_empresaRecargoCompra,this,this.recargocompraConstantesFunciones.activarid_empresaRecargoCompra));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.recargocompraConstantesFunciones.resaltarid_empresaRecargoCompra,this,this.recargocompraConstantesFunciones.activarid_empresaRecargoCompra,false,"id_empresaRecargoCompra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RecargoCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecargoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompra,RecargoCompraConstantesFunciones.LABEL_NOMBRE));

		if(this.recargocompraConstantesFunciones.mostrarnombreRecargoCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecargoCompraConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.recargocompraConstantesFunciones.resaltarnombreRecargoCompra,this.recargocompraConstantesFunciones.activarnombreRecargoCompra,this,true,"nombreRecargoCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recargocompraConstantesFunciones.resaltarnombreRecargoCompra,this.recargocompraConstantesFunciones.activarnombreRecargoCompra,this,true,"nombreRecargoCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RecargoCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecargoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompra,RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));

		if(this.recargocompraConstantesFunciones.mostrarid_cuenta_contable_debitoRecargoCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.recargocompraConstantesFunciones.resaltarid_cuenta_contable_debitoRecargoCompra,this,this.recargocompraConstantesFunciones.activarid_cuenta_contable_debitoRecargoCompra));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.recargocompraConstantesFunciones.resaltarid_cuenta_contable_debitoRecargoCompra,this,this.recargocompraConstantesFunciones.activarid_cuenta_contable_debitoRecargoCompra,true,"id_cuenta_contable_debitoRecargoCompra","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new RecargoCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecargoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompra,RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));

		if(this.recargocompraConstantesFunciones.mostrarid_cuenta_contable_creditoRecargoCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.recargocompraConstantesFunciones.resaltarid_cuenta_contable_creditoRecargoCompra,this,this.recargocompraConstantesFunciones.activarid_cuenta_contable_creditoRecargoCompra));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.recargocompraConstantesFunciones.resaltarid_cuenta_contable_creditoRecargoCompra,this,this.recargocompraConstantesFunciones.activarid_cuenta_contable_creditoRecargoCompra,true,"id_cuenta_contable_creditoRecargoCompra","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new RecargoCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecargoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompra,RecargoCompraConstantesFunciones.LABEL_ESSERVICIO));

		if(this.recargocompraConstantesFunciones.mostrares_servicioRecargoCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecargoCompraConstantesFunciones.LABEL_ESSERVICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.recargocompraConstantesFunciones.resaltares_servicioRecargoCompra,this.recargocompraConstantesFunciones.activares_servicioRecargoCompra));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.recargocompraConstantesFunciones.resaltares_servicioRecargoCompra,this.recargocompraConstantesFunciones.activares_servicioRecargoCompra,this,true,"es_servicioRecargoCompra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RecargoCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.recargocompraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.recargocompraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRecargoCompra.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.recargocompraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.recargocompraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRecargoCompra.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.recargocompraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.recargocompraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRecargoCompra.addColumn(tableColumn);
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
			
			this.jTableDatosRecargoCompra.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRecargoCompra.moveColumn(this.jTableDatosRecargoCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRecargoCompra.moveColumn(this.jTableDatosRecargoCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRecargoCompra.moveColumn(this.jTableDatosRecargoCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRecargoCompra.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRecargoCompra.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRecargoCompra,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRecargoCompra.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRecargoCompra.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RecargoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRecargoCompra.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRecargoCompra.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRecargoCompra.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=recargocompraLogic.getRecargoCompras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=recargocompras.size()-1;
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
		//this.jTableDatosRecargoCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRecargoCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRecargoCompra();
			
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
				
				//this.isEsNuevoRecargoCompra=false;
					
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
				if(this.recargocompraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRecargoCompra==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRecargoCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRecargoCompra.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.recargocompra.getsType().equals("DUPLICADO")
				   || this.recargocompra.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRecargoCompra=true;
				
				} else {
					this.isEsNuevoRecargoCompra=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
					if(this.recargocompra.getId()>=0 && !this.recargocompra.getIsNew()) {						
						this.isEsNuevoRecargoCompra=false;
						
					} else {
						this.isEsNuevoRecargoCompra=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRecargoCompra(esRelaciones);						
				
				this.seleccionarRecargoCompra(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.recargocompra.getId()<0) {
					this.isEsNuevoRecargoCompra=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRecargoCompra(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRecargoCompra(evt,rowIndex);
				}	
				
				if(this.recargocompraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RecargoCompra: " + this.dDif); 
					}
				}								
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRecargoCompra(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.recargocompra)) {
					if(this.recargocompra.getId()>0) {
						this.recargocompra.setIsDeleted(true);
						
						this.recargocomprasEliminados.add(this.recargocompra);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.recargocompraLogic.getRecargoCompras().remove(this.recargocompra);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.recargocompras.remove(this.recargocompra);				
					}
					
					
					((RecargoCompraModel) this.jTableDatosRecargoCompra.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRecargoCompra(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRecargoCompra(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRecargoCompra) {
			
			if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRecargoCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRecargoCompra.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RecargoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRecargoCompra(this.recargocompra);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.recargocompraConstantesFunciones.cargarid_empresaRecargoCompra || this.recargocompraConstantesFunciones.event_dependid_empresaRecargoCompra) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.recargocompra.getid_empresa());
									//this.inicializarActualizarBindingRecargoCompra(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(recargocompra.getEmpresa()!=null) {
							this.empresasForeignKey.add(recargocompra.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.recargocompra.getid_empresa(),false,"Formulario");

					//CuentaContableDebito
					if(!this.recargocompraConstantesFunciones.cargarid_cuenta_contable_debitoRecargoCompra || this.recargocompraConstantesFunciones.event_dependid_cuenta_contable_debitoRecargoCompra) {
						//this.cargarCombosCuentaContableDebitosForeignKeyLista(" where id="+this.recargocompra.getid_cuenta_contable_debito());
									//this.inicializarActualizarBindingRecargoCompra(false,false);
						this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();

						if(recargocompra.getCuentaContableDebito()!=null) {
							this.cuentacontabledebitosForeignKey.add(recargocompra.getCuentaContableDebito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableDebito();
						this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
					}
					this.setActualCuentaContableDebitoForeignKey(this.recargocompra.getid_cuenta_contable_debito(),false,"Formulario");

					//CuentaContableCredito
					if(!this.recargocompraConstantesFunciones.cargarid_cuenta_contable_creditoRecargoCompra || this.recargocompraConstantesFunciones.event_dependid_cuenta_contable_creditoRecargoCompra) {
						//this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+this.recargocompra.getid_cuenta_contable_credito());
									//this.inicializarActualizarBindingRecargoCompra(false,false);
						this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

						if(recargocompra.getCuentaContableCredito()!=null) {
							this.cuentacontablecreditosForeignKey.add(recargocompra.getCuentaContableCredito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCredito();
						this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
					}
					this.setActualCuentaContableCreditoForeignKey(this.recargocompra.getid_cuenta_contable_credito(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRecargoCompra("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRecargoCompra(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRecargoCompra() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRecargoCompra(RecargoCompra recargocompra) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRecargoCompra(recargocompra,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRecargoCompra(RecargoCompra recargocompra,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRecargoCompra(recargocompra);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRecargoCompra(recargocompra,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRecargoCompra(recargocompra);
	}
	
	public void setVariablesObjetoActualToFormularioRecargoCompra(RecargoCompra recargocompra) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRecargoCompra.jLabelidRecargoCompra.setText(recargocompra.getId().toString());
			this.jInternalFrameDetalleFormRecargoCompra.jTextFieldnombreRecargoCompra.setText(recargocompra.getnombre());
			this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxes_servicioRecargoCompra.setSelected(recargocompra.getes_servicio());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RecargoCompra recargocompraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,recargocompraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RecargoCompra recargocompraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				recargocompraLocal=this.recargocompra;
			} else {
				recargocompraLocal=this.recargocompraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(recargocompraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRecargoCompra(recargocompraLocal,true);
					
					if(recargocompraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(recargocompraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.recargocompraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(recargocompraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRecargoCompra(RecargoCompra recargocompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRecargoCompra(recargocompra,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(recargocompra);
	}
	
	public void setVariablesFormularioToObjetoActualRecargoCompra(RecargoCompra recargocompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRecargoCompra(recargocompra,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRecargoCompra(RecargoCompra recargocompra,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRecargoCompra.jLabelidRecargoCompra.getText()==null || this.jInternalFrameDetalleFormRecargoCompra.jLabelidRecargoCompra.getText()=="" || this.jInternalFrameDetalleFormRecargoCompra.jLabelidRecargoCompra.getText()=="Id") {
				this.jInternalFrameDetalleFormRecargoCompra.jLabelidRecargoCompra.setText("0");
			}

			if(conColumnasBase) {recargocompra.setId(Long.parseLong(this.jInternalFrameDetalleFormRecargoCompra.jLabelidRecargoCompra.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecargoCompraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecargoCompra.jLabelIdRecargoCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recargocompra.setnombre(this.jInternalFrameDetalleFormRecargoCompra.jTextFieldnombreRecargoCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecargoCompraConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecargoCompra.jLabelnombreRecargoCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recargocompra.setes_servicio(this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxes_servicioRecargoCompra.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecargoCompraConstantesFunciones.LABEL_ESSERVICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecargoCompra.jLabeles_servicioRecargoCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRecargoCompra(RecargoCompra recargocompraBean,RecargoCompra recargocompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && recargocompraBean.getid_cuenta_contable_debito()!=null && !recargocompraBean.getid_cuenta_contable_debito().equals(-1L))) {recargocompra.setid_cuenta_contable_debito(recargocompraBean.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && recargocompraBean.getid_cuenta_contable_credito()!=null && !recargocompraBean.getid_cuenta_contable_credito().equals(-1L))) {recargocompra.setid_cuenta_contable_credito(recargocompraBean.getid_cuenta_contable_credito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRecargoCompra(RecargoCompra recargocompraOrigen,RecargoCompra recargocompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && recargocompraOrigen.getId()!=null && !recargocompraOrigen.getId().equals(0L))) {recargocompra.setId(recargocompraOrigen.getId());}}
			if(conDefault || (!conDefault && recargocompraOrigen.getnombre()!=null && !recargocompraOrigen.getnombre().equals(""))) {recargocompra.setnombre(recargocompraOrigen.getnombre());}
			if(conDefault || (!conDefault && recargocompraOrigen.getid_cuenta_contable_debito()!=null && !recargocompraOrigen.getid_cuenta_contable_debito().equals(-1L))) {recargocompra.setid_cuenta_contable_debito(recargocompraOrigen.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && recargocompraOrigen.getid_cuenta_contable_credito()!=null && !recargocompraOrigen.getid_cuenta_contable_credito().equals(-1L))) {recargocompra.setid_cuenta_contable_credito(recargocompraOrigen.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && recargocompraOrigen.getes_servicio()!=null && !recargocompraOrigen.getes_servicio().equals(false))) {recargocompra.setes_servicio(recargocompraOrigen.getes_servicio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRecargoCompra(RecargoCompra recargocompra) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRecargoCompra.jLabelidRecargoCompra.setText(recargocompra.getId().toString());
			this.jInternalFrameDetalleFormRecargoCompra.jTextFieldnombreRecargoCompra.setText(recargocompra.getnombre());
			this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxes_servicioRecargoCompra.setSelected(recargocompra.getes_servicio());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRecargoCompra(RecargoCompraBean recargocompraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRecargoCompra.jLabelidRecargoCompra.setText(recargocompraBean.getId().toString());
			this.jInternalFrameDetalleFormRecargoCompra.jTextFieldnombreRecargoCompra.setText(recargocompraBean.getnombre());
			this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxes_servicioRecargoCompra.setSelected(recargocompraBean.getes_servicio());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRecargoCompra(RecargoCompraParameterReturnGeneral recargocompraReturnGeneral,RecargoCompraBean recargocompraBean,Boolean conDefault) throws Exception { 
		try {
			RecargoCompra recargocompraLocal=new RecargoCompra();
			
			recargocompraLocal=recargocompraReturnGeneral.getRecargoCompra();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && recargocompraLocal.getId()!=null && !recargocompraLocal.getId().equals(0L))) {recargocompraBean.setId(recargocompraLocal.getId());}}
			if(conDefault || (!conDefault && recargocompraLocal.getnombre()!=null && !recargocompraLocal.getnombre().equals(""))) {recargocompraBean.setnombre(recargocompraLocal.getnombre());}
			if(conDefault || (!conDefault && recargocompraLocal.getid_cuenta_contable_debito()!=null && !recargocompraLocal.getid_cuenta_contable_debito().equals(-1L))) {recargocompraBean.setid_cuenta_contable_debito(recargocompraLocal.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && recargocompraLocal.getid_cuenta_contable_credito()!=null && !recargocompraLocal.getid_cuenta_contable_credito().equals(-1L))) {recargocompraBean.setid_cuenta_contable_credito(recargocompraLocal.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && recargocompraLocal.getes_servicio()!=null && !recargocompraLocal.getes_servicio().equals(false))) {recargocompraBean.setes_servicio(recargocompraLocal.getes_servicio());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRecargoCompraGenerico(Long idRecargoCompraSeleccionado,JComboBox jComboBoxRecargoCompra,List<RecargoCompra> recargocomprasLocal)throws Exception {
		try {
			RecargoCompra  recargocompraTemp=null;

			for(RecargoCompra recargocompraAux:recargocomprasLocal) {
				if(recargocompraAux.getId()!=null && recargocompraAux.getId().equals(idRecargoCompraSeleccionado)) {
					recargocompraTemp=recargocompraAux;
					break;
				}
			}

			jComboBoxRecargoCompra.setSelectedItem(recargocompraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRecargoCompraGenerico(JComboBox jComboBoxRecargoCompra,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRecargoCompra.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRecargoCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRecargoCompra.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRecargoCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			recargocompra=(RecargoCompra) recargocompraLogic.getRecargoCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			recargocompra =(RecargoCompra) recargocompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!recargocompra.getIsNew() && !recargocompra.getIsChanged() && !recargocompra.getIsDeleted()) {
				sDescripcion=recargocompra.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=recargocompra.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableDebito")) {
			//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
			if(!recargocompra.getIsNew() && !recargocompra.getIsChanged() && !recargocompra.getIsDeleted()) {
				sDescripcion=recargocompra.getcuentacontabledebito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
				sDescripcion=recargocompra.getcuentacontabledebito_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCredito")) {
			//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
			if(!recargocompra.getIsNew() && !recargocompra.getIsChanged() && !recargocompra.getIsDeleted()) {
				sDescripcion=recargocompra.getcuentacontablecredito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=recargocompra.getcuentacontablecredito_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RecargoCompra recargocompraRow=new RecargoCompra();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			recargocompraRow=(RecargoCompra) recargocompraLogic.getRecargoCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			recargocompraRow=(RecargoCompra) recargocompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRecargoCompra(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRecargoCompra.setVisible((this.isVisibilidadCeldaNuevoRecargoCompra && this.isPermisoNuevoRecargoCompra));			
			this.jButtonDuplicarRecargoCompra.setVisible((this.isVisibilidadCeldaDuplicarRecargoCompra && this.isPermisoDuplicarRecargoCompra));			
			this.jButtonCopiarRecargoCompra.setVisible((this.isVisibilidadCeldaCopiarRecargoCompra && this.isPermisoCopiarRecargoCompra));
			this.jButtonVerFormRecargoCompra.setVisible((this.isVisibilidadCeldaVerFormRecargoCompra && this.isPermisoVerFormRecargoCompra));
			
			this.jButtonAbrirOrderByRecargoCompra.setVisible((this.isVisibilidadCeldaOrdenRecargoCompra && this.isPermisoOrdenRecargoCompra));			
			
			this.jButtonNuevoRelacionesRecargoCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesRecargoCompra && this.isPermisoNuevoRecargoCompra));			
			this.jButtonNuevoGuardarCambiosRecargoCompra.setVisible((this.isVisibilidadCeldaNuevoRecargoCompra && this.isPermisoNuevoRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra));
			
			if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonModificarRecargoCompra.setVisible((this.isVisibilidadCeldaModificarRecargoCompra && this.isPermisoActualizarRecargoCompra));	
			this.jInternalFrameDetalleFormRecargoCompra.jButtonActualizarRecargoCompra.setVisible((this.isVisibilidadCeldaActualizarRecargoCompra && this.isPermisoActualizarRecargoCompra));	
			this.jInternalFrameDetalleFormRecargoCompra.jButtonEliminarRecargoCompra.setVisible((this.isVisibilidadCeldaEliminarRecargoCompra && this.isPermisoEliminarRecargoCompra));
			this.jInternalFrameDetalleFormRecargoCompra.jButtonCancelarRecargoCompra.setVisible(this.isVisibilidadCeldaCancelarRecargoCompra);							
			this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosRecargoCompra.setVisible((this.isVisibilidadCeldaGuardarRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra));			
			
			}
						
			this.jButtonGuardarCambiosTablaRecargoCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaNuevoRecargoCompra && this.isPermisoNuevoRecargoCompra));						
			this.jButtonDuplicarToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaDuplicarRecargoCompra && this.isPermisoDuplicarRecargoCompra));						
			this.jButtonCopiarToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaCopiarRecargoCompra && this.isPermisoCopiarRecargoCompra));			
			this.jButtonVerFormToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaVerFormRecargoCompra && this.isPermisoVerFormRecargoCompra));			
			this.jButtonAbrirOrderByToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaOrdenRecargoCompra && this.isPermisoOrdenRecargoCompra));
			this.jButtonNuevoRelacionesToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesRecargoCompra && this.isPermisoNuevoRecargoCompra));			
			this.jButtonNuevoGuardarCambiosToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaNuevoRecargoCompra && this.isPermisoNuevoRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra));			
			
			if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonModificarToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaModificarRecargoCompra && this.isPermisoActualizarRecargoCompra));	
			this.jInternalFrameDetalleFormRecargoCompra.jButtonActualizarToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaActualizarRecargoCompra  && this.isPermisoActualizarRecargoCompra));	
			this.jInternalFrameDetalleFormRecargoCompra.jButtonEliminarToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaEliminarRecargoCompra && this.isPermisoEliminarRecargoCompra));
			this.jInternalFrameDetalleFormRecargoCompra.jButtonCancelarToolBarRecargoCompra.setVisible(this.isVisibilidadCeldaCancelarRecargoCompra);				
			this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaGuardarRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRecargoCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRecargoCompra.setVisible((this.isVisibilidadCeldaNuevoRecargoCompra && this.isPermisoNuevoRecargoCompra));			
			this.jMenuItemDuplicarRecargoCompra.setVisible((this.isVisibilidadCeldaDuplicarRecargoCompra && this.isPermisoDuplicarRecargoCompra));			
			this.jMenuItemCopiarRecargoCompra.setVisible((this.isVisibilidadCeldaCopiarRecargoCompra && this.isPermisoCopiarRecargoCompra));			
			this.jMenuItemVerFormRecargoCompra.setVisible((this.isVisibilidadCeldaVerFormRecargoCompra && this.isPermisoVerFormRecargoCompra));			
			this.jMenuItemAbrirOrderByRecargoCompra.setVisible((this.isVisibilidadCeldaOrdenRecargoCompra && this.isPermisoOrdenRecargoCompra));			
			//this.jMenuItemMostrarOcultarRecargoCompra.setVisible((this.isVisibilidadCeldaOrdenRecargoCompra && this.isPermisoOrdenRecargoCompra));
			this.jMenuItemDetalleAbrirOrderByRecargoCompra.setVisible((this.isVisibilidadCeldaOrdenRecargoCompra && this.isPermisoOrdenRecargoCompra));			
			//this.jMenuItemDetalleMostrarOcultarRecargoCompra.setVisible((this.isVisibilidadCeldaOrdenRecargoCompra && this.isPermisoOrdenRecargoCompra));			
			this.jMenuItemNuevoRelacionesRecargoCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesRecargoCompra && this.isPermisoNuevoRecargoCompra));			
			this.jMenuItemNuevoGuardarCambiosRecargoCompra.setVisible((this.isVisibilidadCeldaNuevoRecargoCompra && this.isPermisoNuevoRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra));									
			
			if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			this.jInternalFrameDetalleFormRecargoCompra.jMenuItemModificarRecargoCompra.setVisible((this.isVisibilidadCeldaModificarRecargoCompra && this.isPermisoActualizarRecargoCompra));	
			this.jInternalFrameDetalleFormRecargoCompra.jMenuItemActualizarRecargoCompra.setVisible((this.isVisibilidadCeldaActualizarRecargoCompra && this.isPermisoActualizarRecargoCompra));	
			this.jInternalFrameDetalleFormRecargoCompra.jMenuItemEliminarRecargoCompra.setVisible((this.isVisibilidadCeldaEliminarRecargoCompra && this.isPermisoEliminarRecargoCompra));
			this.jInternalFrameDetalleFormRecargoCompra.jMenuItemCancelarRecargoCompra.setVisible(this.isVisibilidadCeldaCancelarRecargoCompra);				
			}
			
			this.jMenuItemGuardarCambiosRecargoCompra.setVisible((this.isVisibilidadCeldaGuardarRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra));						
			this.jMenuItemGuardarCambiosTablaRecargoCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRecargoCompra=this.jButtonNuevoRecargoCompra.isVisible();
			this.isVisibilidadCeldaDuplicarRecargoCompra=this.jButtonDuplicarRecargoCompra.isVisible();
			this.isVisibilidadCeldaCopiarRecargoCompra=this.jButtonCopiarRecargoCompra.isVisible();
			this.isVisibilidadCeldaVerFormRecargoCompra=this.jButtonVerFormRecargoCompra.isVisible();
			
			this.isVisibilidadCeldaOrdenRecargoCompra=this.jButtonAbrirOrderByRecargoCompra.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=this.jButtonNuevoRelacionesRecargoCompra.isVisible();
			this.isVisibilidadCeldaModificarRecargoCompra=this.jButtonModificarRecargoCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			this.isVisibilidadCeldaActualizarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jButtonActualizarRecargoCompra.isVisible();
			this.isVisibilidadCeldaEliminarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jButtonEliminarRecargoCompra.isVisible();
			this.isVisibilidadCeldaCancelarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jButtonCancelarRecargoCompra.isVisible();
			this.isVisibilidadCeldaGuardarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosRecargoCompra.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=this.jButtonGuardarCambiosTablaRecargoCompra.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRecargoCompra=this.jButtonNuevoToolBarRecargoCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=this.jButtonNuevoRelacionesToolBarRecargoCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			this.isVisibilidadCeldaModificarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jButtonModificarToolBarRecargoCompra.isVisible();
			this.isVisibilidadCeldaActualizarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jButtonActualizarToolBarRecargoCompra.isVisible();
			this.isVisibilidadCeldaEliminarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jButtonEliminarToolBarRecargoCompra.isVisible();
			this.isVisibilidadCeldaCancelarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jButtonCancelarToolBarRecargoCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRecargoCompra=this.jButtonGuardarCambiosToolBarRecargoCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=this.jButtonGuardarCambiosTablaToolBarRecargoCompra.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRecargoCompra=this.jMenuItemNuevoRecargoCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=this.jMenuItemNuevoRelacionesRecargoCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			this.isVisibilidadCeldaModificarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jMenuItemModificarRecargoCompra.isVisible();
			this.isVisibilidadCeldaActualizarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jMenuItemActualizarRecargoCompra.isVisible();
			this.isVisibilidadCeldaEliminarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jMenuItemEliminarRecargoCompra.isVisible();
			this.isVisibilidadCeldaCancelarRecargoCompra=this.jInternalFrameDetalleFormRecargoCompra.jMenuItemCancelarRecargoCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRecargoCompra=this.jMenuItemGuardarCambiosRecargoCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=this.jMenuItemGuardarCambiosTablaRecargoCompra.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRecargoCompra(Boolean esInicializar) {
		if(RecargoCompraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.recargocompraSessionBean.getConGuardarRelaciones()) {
				//if(this.recargocompraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRecargoCompra();
			}
			
			this.inicializarActualizarBindingBotonesManualRecargoCompra(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRecargoCompra() {
		this.jButtonNuevoRecargoCompra.setVisible(this.isPermisoNuevoRecargoCompra);			
		this.jButtonDuplicarRecargoCompra.setVisible(this.isPermisoDuplicarRecargoCompra);			
		this.jButtonCopiarRecargoCompra.setVisible(this.isPermisoCopiarRecargoCompra);			
		this.jButtonVerFormRecargoCompra.setVisible(this.isPermisoVerFormRecargoCompra);			
		
		this.jButtonAbrirOrderByRecargoCompra.setVisible(this.isPermisoOrdenRecargoCompra);					
		
		this.jButtonNuevoRelacionesRecargoCompra.setVisible(this.isPermisoNuevoRecargoCompra);			
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonModificarRecargoCompra.setVisible(this.isPermisoActualizarRecargoCompra);	
			this.jInternalFrameDetalleFormRecargoCompra.jButtonActualizarRecargoCompra.setVisible(this.isPermisoActualizarRecargoCompra);	
			this.jInternalFrameDetalleFormRecargoCompra.jButtonEliminarRecargoCompra.setVisible(this.isPermisoEliminarRecargoCompra);
			this.jInternalFrameDetalleFormRecargoCompra.jButtonCancelarRecargoCompra.setVisible(this.isVisibilidadCeldaCancelarRecargoCompra);						
			this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosRecargoCompra.setVisible(this.isPermisoGuardarCambiosRecargoCompra);							
		}
		
		this.jButtonGuardarCambiosTablaRecargoCompra.setVisible(this.isPermisoActualizarRecargoCompra);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRecargoCompra() {
		this.jInternalFrameDetalleFormRecargoCompra.jButtonModificarRecargoCompra.setVisible(this.isPermisoActualizarRecargoCompra);	
		this.jInternalFrameDetalleFormRecargoCompra.jButtonActualizarRecargoCompra.setVisible(this.isPermisoActualizarRecargoCompra);	
		this.jInternalFrameDetalleFormRecargoCompra.jButtonEliminarRecargoCompra.setVisible(this.isPermisoEliminarRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jButtonCancelarRecargoCompra.setVisible(this.isVisibilidadCeldaCancelarRecargoCompra);							
		this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosRecargoCompra.setVisible((this.isVisibilidadCeldaGuardarRecargoCompra && this.isPermisoGuardarCambiosRecargoCompra));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRecargoCompra() {
		if(RecargoCompraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRecargoCompra();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRecargoCompra() {
	}
	
	public void jTableDatosRecargoCompraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRecargoCompra(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRecargoCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecargoCompra(this.getrecargocompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recargocompra==null) {
						this.recargocompra = new RecargoCompra();
					}

					this.setVariablesFormularioToObjetoActualRecargoCompra(this.recargocompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
				}

				if(this.recargocompra.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.recargocompra.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecargoCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRecargoCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRecargoCompra(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRecargoCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRecargoCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRecargoCompra(this.getrecargocompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.recargocompraLogic.getConnexion());

				if(this.recargocompra.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.recargocompra.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRecargoCompra=(TitledBorder)this.jScrollPanelDatosRecargoCompra.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRecargoCompra.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRecargoCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecargoCompra(this.getrecargocompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recargocompra==null) {
						this.recargocompra = new RecargoCompra();
					}

					this.setVariablesFormularioToObjetoActualRecargoCompra(this.recargocompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
				}

				if(this.recargocompra.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.recargocompra.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecargoCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreRecargoCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecargoCompra(this.getrecargocompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recargocompra==null) {
						this.recargocompra = new RecargoCompra();
					}

					this.setVariablesFormularioToObjetoActualRecargoCompra(this.recargocompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
				}

				if(this.recargocompra.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.recargocompra.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecargoCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_debitoRecargoCompraActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontabledebitoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontabledebitoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontabledebitoBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableDebito";

			if(!this.sFinalQueryGeneral_cuentacontabledebito.equals("")) {
				this.cuentacontabledebitoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontabledebito);
				this.cuentacontabledebitoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontabledebitoBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontabledebitoBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontabledebitoBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableDebito.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontabledebitoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderRecargoCompra=null;
			TitledBorder titledBordercuentacontabledebito=null;

			if(!this.jScrollPanelDatosRecargoCompra.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderRecargoCompra=(TitledBorder)this.jScrollPanelDatosRecargoCompra.getBorder();
				titledBordercuentacontabledebito=(TitledBorder)this.cuentacontabledebitoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledebito.setTitle(titledBorderRecargoCompra.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_debitoRecargoCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontabledebito=true;

			idTienePermisocuentacontabledebito=this.tienePermisosUsuarioEnPaginaWebRecargoCompra(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontabledebito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRecargoCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRecargoCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRecargoCompra(this.getrecargocompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);

				this.cuentacontabledebitoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontabledebitoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontabledebitoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.recargocompraLogic.getConnexion());

				if(this.recargocompra.getid_cuenta_contable_debito()!=null) {
					this.cuentacontabledebitoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontabledebitoBeanSwingJInternalFrame.setIdActual(this.recargocompra.getid_cuenta_contable_debito());
					this.cuentacontabledebitoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontabledebitoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRecargoCompra=(TitledBorder)this.jScrollPanelDatosRecargoCompra.getBorder();
				TitledBorder titledBordercuentacontabledebito=(TitledBorder)this.cuentacontabledebitoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledebito.setTitle(titledBorderRecargoCompra.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_debitoRecargoCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecargoCompra(this.getrecargocompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recargocompra==null) {
						this.recargocompra = new RecargoCompra();
					}

					this.setVariablesFormularioToObjetoActualRecargoCompra(this.recargocompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
				}

				if(this.recargocompra.getid_cuenta_contable_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_debito = "+this.recargocompra.getid_cuenta_contable_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecargoCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_creditoRecargoCompraActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableCredito";

			if(!this.sFinalQueryGeneral_cuentacontablecredito.equals("")) {
				this.cuentacontablecreditoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontablecredito);
				this.cuentacontablecreditoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontablecreditoBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableCredito.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderRecargoCompra=null;
			TitledBorder titledBordercuentacontablecredito=null;

			if(!this.jScrollPanelDatosRecargoCompra.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderRecargoCompra=(TitledBorder)this.jScrollPanelDatosRecargoCompra.getBorder();
				titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderRecargoCompra.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_creditoRecargoCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecredito=true;

			idTienePermisocuentacontablecredito=this.tienePermisosUsuarioEnPaginaWebRecargoCompra(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRecargoCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRecargoCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRecargoCompra(this.getrecargocompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);

				this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecreditoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.recargocompraLogic.getConnexion());

				if(this.recargocompra.getid_cuenta_contable_credito()!=null) {
					this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecreditoBeanSwingJInternalFrame.setIdActual(this.recargocompra.getid_cuenta_contable_credito());
					this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRecargoCompra=(TitledBorder)this.jScrollPanelDatosRecargoCompra.getBorder();
				TitledBorder titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderRecargoCompra.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_creditoRecargoCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecargoCompra(this.getrecargocompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recargocompra==null) {
						this.recargocompra = new RecargoCompra();
					}

					this.setVariablesFormularioToObjetoActualRecargoCompra(this.recargocompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
				}

				if(this.recargocompra.getid_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_credito = "+this.recargocompra.getid_cuenta_contable_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecargoCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_servicioRecargoCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecargoCompra(this.getrecargocompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recargocompra==null) {
						this.recargocompra = new RecargoCompra();
					}

					this.setVariablesFormularioToObjetoActualRecargoCompra(this.recargocompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);
				}

				if(this.recargocompra.getes_servicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_servicio = "+this.recargocompra.getes_servicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecargoCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreRecargoCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRecargoCompra(false,false);

			this.getRecargoComprasBusquedaPorNombre();

			this.inicializarActualizarBindingRecargoCompra(false);

			//if(RecargoCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRecargoCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCreditoRecargoCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRecargoCompra(false,false);

			this.getRecargoComprasFK_IdCuentaContableCredito();

			this.inicializarActualizarBindingRecargoCompra(false);

			//if(RecargoCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRecargoCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableDebitoRecargoCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRecargoCompra(false,false);

			this.getRecargoComprasFK_IdCuentaContableDebito();

			this.inicializarActualizarBindingRecargoCompra(false);

			//if(RecargoCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRecargoCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRecargoCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRecargoCompra(false,false);

			this.getRecargoComprasFK_IdEmpresa();

			this.inicializarActualizarBindingRecargoCompra(false);

			//if(RecargoCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRecargoCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recargocompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRecargoCompra() {
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
			this.jInternalFrameDetalleFormRecargoCompra.setVisible(false);	    			
			this.jInternalFrameDetalleFormRecargoCompra.dispose();
			this.jInternalFrameDetalleFormRecargoCompra=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRecargoCompra!=null) {
			this.jInternalFrameReporteDinamicoRecargoCompra.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRecargoCompra.dispose();
			this.jInternalFrameReporteDinamicoRecargoCompra=null;
		}
		
		if(this.jInternalFrameImportacionRecargoCompra!=null) {
			this.jInternalFrameImportacionRecargoCompra.setVisible(false);	    			
			this.jInternalFrameImportacionRecargoCompra.dispose();
			this.jInternalFrameImportacionRecargoCompra=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRecargoCompra();
			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
			
			if(sTipo.equals("NuevoRecargoCompra")) {
				jButtonNuevoRecargoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRecargoCompra")) {
				jButtonDuplicarRecargoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRecargoCompra")) {
				jButtonCopiarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormRecargoCompra")) {
				jButtonVerFormRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRecargoCompra")) {
				jButtonNuevoRecargoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRecargoCompra")) {
				jButtonDuplicarRecargoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRecargoCompra")) {
				jButtonNuevoRecargoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRecargoCompra")) {
				jButtonDuplicarRecargoCompraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRecargoCompra")) {
				jButtonNuevoRecargoCompraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRecargoCompra")) {
				jButtonNuevoRecargoCompraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRecargoCompra")) {
				jButtonNuevoRecargoCompraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRecargoCompra")) {
				jButtonModificarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRecargoCompra")) {
				jButtonModificarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRecargoCompra")) {
				jButtonModificarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRecargoCompra")) {
				jButtonActualizarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRecargoCompra")) {
				jButtonActualizarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRecargoCompra")) {
				jButtonActualizarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarRecargoCompra")) {
				jButtonEliminarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRecargoCompra")) {
				jButtonEliminarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRecargoCompra")) {
				jButtonEliminarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarRecargoCompra")) {
				jButtonCancelarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRecargoCompra")) {
				jButtonCancelarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRecargoCompra")) {
				jButtonCancelarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarRecargoCompra")) {
				jButtonCerrarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRecargoCompra")) {
				jButtonCerrarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRecargoCompra")) {
				jButtonCerrarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRecargoCompra")) {
				jButtonMostrarOcultarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRecargoCompra")) {
				jButtonCancelarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRecargoCompra")) {
				jButtonGuardarCambiosRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRecargoCompra")) {
				jButtonGuardarCambiosRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRecargoCompra")) {
				jButtonCopiarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRecargoCompra")) {
				jButtonVerFormRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRecargoCompra")) {
				jButtonGuardarCambiosRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRecargoCompra")) {
				jButtonCopiarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRecargoCompra")) {
				jButtonVerFormRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRecargoCompra")) {
				jButtonGuardarCambiosRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRecargoCompra")) {
				jButtonGuardarCambiosRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRecargoCompra")) {
				jButtonGuardarCambiosRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRecargoCompra")) {
				jButtonRecargarInformacionRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRecargoCompra")) {
				jButtonRecargarInformacionRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRecargoCompra")) {
				jButtonRecargarInformacionRecargoCompraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRecargoCompra")) {
				jButtonAnterioresRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRecargoCompra")) {
				jButtonAnterioresRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRecargoCompra")) {
				jButtonAnterioresRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRecargoCompra")) {
				jButtonSiguientesRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRecargoCompra")) {
				jButtonSiguientesRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRecargoCompra")) {
				jButtonSiguientesRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRecargoCompra") || sTipo.equals("MenuItemDetalleAbrirOrderByRecargoCompra")) {
				jButtonAbrirOrderByRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRecargoCompra") || sTipo.equals("MenuItemDetalleMostrarOcultarRecargoCompra")) {
				jButtonMostrarOcultarRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRecargoCompra")) {
				jButtonNuevoGuardarCambiosRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRecargoCompra")) {
				jButtonNuevoGuardarCambiosRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRecargoCompra")) {
				jButtonNuevoGuardarCambiosRecargoCompraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRecargoCompra")) {
				jButtonCerrarReporteDinamicoRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRecargoCompra")) {
				jButtonGenerarReporteDinamicoRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRecargoCompra")) {
				
				jButtonGenerarExcelReporteDinamicoRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRecargoCompra")) {
				jButtonCerrarImportacionRecargoCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRecargoCompra")) {
				
				jButtonGenerarImportacionRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRecargoCompra")) {
				
				jButtonAbrirImportacionRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRecargoCompra")) {
				jComboBoxTiposAccionesRecargoCompraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRecargoCompra")) {
				jComboBoxTiposRelacionesRecargoCompraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRecargoCompra")) {
				jComboBoxTiposAccionesRecargoCompraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRecargoCompra")) {
				
				jComboBoxTiposSeleccionarRecargoCompraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRecargoCompra")) {
				jTextFieldValorCampoGeneralRecargoCompraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRecargoCompra")) {
				jButtonAbrirOrderByRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRecargoCompra")) {
				jButtonAbrirOrderByRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRecargoCompra")) {
				jButtonCerrarOrderByRecargoCompraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRecargoCompraBusqueda")) {
				this.jButtonidRecargoCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRecargoCompraUpdate")) {
				this.jButtonid_empresaRecargoCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRecargoCompraBusqueda")) {
				this.jButtonid_empresaRecargoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreRecargoCompraBusqueda")) {
				this.jButtonnombreRecargoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoRecargoCompra")) {
				this.jButtonid_cuenta_contable_debitoRecargoCompraActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoRecargoCompraArbol")) {
				this.abrirFrameTreeCuentaContableDebito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoRecargoCompraUpdate")) {
				this.jButtonid_cuenta_contable_debitoRecargoCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoRecargoCompraBusqueda")) {
				this.jButtonid_cuenta_contable_debitoRecargoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoRecargoCompra")) {
				this.jButtonid_cuenta_contable_creditoRecargoCompraActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoRecargoCompraArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoRecargoCompraUpdate")) {
				this.jButtonid_cuenta_contable_creditoRecargoCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoRecargoCompraBusqueda")) {
				this.jButtonid_cuenta_contable_creditoRecargoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_servicioRecargoCompraBusqueda")) {
				this.jButtones_servicioRecargoCompraBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contable_creditoRecargoCompra")) {
				this.jButtonid_cuenta_contable_creditoRecargoCompraActionPerformed(evt);
			}
			else if(sTipo.equals("id_cuenta_contable_debitoRecargoCompra")) {
				this.jButtonid_cuenta_contable_debitoRecargoCompraActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorNombreRecargoCompra")) {
				this.jButtonBusquedaPorNombreRecargoCompraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableCreditoRecargoCompra")) {
				this.jButtonFK_IdCuentaContableCreditoRecargoCompraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableDebitoRecargoCompra")) {
				this.jButtonFK_IdCuentaContableDebitoRecargoCompraActionPerformed(evt);
			}
			
			;
			
			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRecargoCompra();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecargoCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				


				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RecargoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RecargoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RecargoCompra recargocompraLocal=null;
			
			if(!this.getEsControlTabla()) {
				recargocompraLocal=this.recargocompra;
			} else {
				recargocompraLocal=this.recargocompraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
							
				
				


				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RecargoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RecargoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecargoCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraAnterior =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recargocompraAnterior =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
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
			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
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
			
			


			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecargoCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
								
						
				


				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RecargoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RecargoCompra.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
								
				
				


				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RecargoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RecargoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecargoCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraAnterior =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recargocompraAnterior =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecargoCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraAnterior =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recargocompraAnterior =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecargoCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
							
				
				


				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RecargoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RecargoCompra.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecargoCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recargocompraAnterior =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.recargocompraAnterior =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
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
			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
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
			
			


			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecargoCompraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
								
				
				


				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RecargoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RecargoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecargoCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraAnterior =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recargocompraAnterior =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecargoCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecargoCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRecargoCompra")) {
					jCheckBoxSeleccionarTodosRecargoCompraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRecargoCompra")) {
					jCheckBoxSeleccionadosRecargoCompraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRecargoCompra")) {
					
				}
				
				


				
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RecargoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RecargoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
												
				
				


				
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RecargoCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RecargoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecargoCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recargocompraAnterior =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.recargocompraAnterior =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecargoCompraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
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
			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
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
			
			


			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecargoCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RecargoCompra.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RecargoCompra.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recargocompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recargocompra);
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
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
				
				


				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RecargoCompra.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RecargoCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecargoCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recargocompraAnterior =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recargocompraAnterior =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRecargoCompra")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRecargoCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRecargoCompra.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.recargocompra =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.recargocompra =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.recargocompra);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRecargoCompra")) {
				
				}
				
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRecargoCompra")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRecargoCompra.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRecargoCompra")) {
			
			}
			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRecargoCompra();
			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
			if(sTipo.equals("NuevoRecargoCompra")) {
				jButtonNuevoRecargoCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRecargoCompra")) {
				jButtonDuplicarRecargoCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRecargoCompra")) {
				jButtonCopiarRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRecargoCompra")) {
				jButtonVerFormRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRecargoCompra")) {
				jButtonNuevoRecargoCompraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRecargoCompra")) {
				jButtonModificarRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRecargoCompra")) {
				jButtonActualizarRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRecargoCompra")) {
				jButtonEliminarRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRecargoCompra")) {
				jButtonGuardarCambiosRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRecargoCompra")) {
				jButtonCancelarRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRecargoCompra")) {
				jButtonCerrarRecargoCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRecargoCompra")) {
				jButtonGuardarCambiosRecargoCompraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRecargoCompra")) {
				jButtonNuevoGuardarCambiosRecargoCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRecargoCompra")) {
				jButtonAbrirOrderByRecargoCompraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRecargoCompra")) {
				jButtonRecargarInformacionRecargoCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRecargoCompra")) {
				jButtonAnterioresRecargoCompraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRecargoCompra")) {
				jButtonSiguientesRecargoCompraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRecargoCompraBusqueda")) {
				this.jButtonidRecargoCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRecargoCompraUpdate")) {
				this.jButtonid_empresaRecargoCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRecargoCompraBusqueda")) {
				this.jButtonid_empresaRecargoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreRecargoCompraBusqueda")) {
				this.jButtonnombreRecargoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoRecargoCompra")) {
				this.jButtonid_cuenta_contable_debitoRecargoCompraActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoRecargoCompraArbol")) {
				this.abrirFrameTreeCuentaContableDebito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoRecargoCompraUpdate")) {
				this.jButtonid_cuenta_contable_debitoRecargoCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoRecargoCompraBusqueda")) {
				this.jButtonid_cuenta_contable_debitoRecargoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoRecargoCompra")) {
				this.jButtonid_cuenta_contable_creditoRecargoCompraActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoRecargoCompraArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoRecargoCompraUpdate")) {
				this.jButtonid_cuenta_contable_creditoRecargoCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoRecargoCompraBusqueda")) {
				this.jButtonid_cuenta_contable_creditoRecargoCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_servicioRecargoCompraBusqueda")) {
				this.jButtones_servicioRecargoCompraBusquedaActionPerformed(evt);
			}
			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRecargoCompra();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRecargoCompra")) {
				closingInternalFrameRecargoCompra();
				
			} else if(sTipo.equals("jButtonCancelarRecargoCompra")) {
				JInternalFrameBase jInternalFrameDetalleFormRecargoCompra = (JInternalFrameBase)evt.getSource();
	            	
	            RecargoCompraBeanSwingJInternalFrame jInternalFrameParent=(RecargoCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormRecargoCompra.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRecargoCompraActionPerformed(null);
			}
			
			RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.recargocompra,new Object(),this.recargocompraParameterGeneral,this.recargocompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRecargoCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRecargoCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRecargoCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.recargocompra)) {
			if(!esControlTabla) {
				if(RecargoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRecargoCompra(this.recargocompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);			
				}
				
				if(this.recargocompraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRecargoCompra(this.recargocompra,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.recargocompraReturnGeneral=recargocompraLogic.procesarEventosRecargoComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recargocompraLogic.getRecargoCompras(),this.recargocompra,this.recargocompraParameterGeneral,this.isEsNuevoRecargoCompra,classes);//this.recargocompraLogic.getRecargoCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRecargoCompra(this.recargocompraReturnGeneral,this.recargocompraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.recargocompraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRecargoCompra(classes,this.recargocompraReturnGeneral,this.recargocompraBean,false);
					}
						
					if(this.recargocompraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRecargoCompra(this.recargocompraReturnGeneral.getRecargoCompra());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRecargoCompra(this.recargocompraReturnGeneral.getRecargoCompra());	
					}
						
					if(this.recargocompraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRecargoCompra(this.recargocompraReturnGeneral.getRecargoCompra(),classes);//this.recargocompraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRecargoCompra(this.recargocompra,classes);//this.recargocompraBean);									
				}
			
				if(RecargoCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRecargoCompra(this.recargocompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRecargoCompra(this.recargocompra);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.recargocompraAnterior!=null) {
						this.recargocompra=this.recargocompraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.recargocompraReturnGeneral=recargocompraLogic.procesarEventosRecargoComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recargocompraLogic.getRecargoCompras(),this.recargocompra,this.recargocompraParameterGeneral,this.isEsNuevoRecargoCompra,classes);//this.recargocompraLogic.getRecargoCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.recargocompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.recargocompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.recargocompraReturnGeneral.getRecargoCompra(),recargocompraLogic.getRecargoCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.recargocompraReturnGeneral.getRecargoCompra(),this.recargocompras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRecargoCompra.repaint();
				
				//((AbstractTableModel) this.jTableDatosRecargoCompra.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRecargoCompra();
			}
		}
	}
	
	public void actualizarVisualTableDatosRecargoCompra() throws Exception {
		
		RecargoCompraModel recargocompraModel=(RecargoCompraModel)this.jTableDatosRecargoCompra.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			recargocompraModel.recargocompras=this.recargocompraLogic.getRecargoCompras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			recargocompraModel.recargocompras=this.recargocompras;
		}
		
		
		((RecargoCompraModel) this.jTableDatosRecargoCompra.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRecargoCompra() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrecargocompraAnterior(),this.recargocompraLogic.getRecargoCompras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrecargocompraAnterior(),this.recargocompras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRecargoCompra();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRecargoCompra(RecargoCompra recargocompra,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
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
										
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recargocompra,new Object(),generalEntityParameterGeneral,this.recargocompraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.recargocompraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RecargoCompraConstantesFunciones.getClassesRelationshipsOfRecargoCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RecargoCompraConstantesFunciones.getClassesRelationshipsFromStringsOfRecargoCompra(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRecargoCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RecargoCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recargocompra,new Object(),generalEntityParameterGeneral,this.recargocompraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRecargoCompra(RecargoCompraBean recargocompraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRecargoCompra(ArrayList<Classe> classes,RecargoCompraReturnGeneral recargocompraReturnGeneral,RecargoCompraBean recargocompraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRecargoCompra(RecargoCompra recargocompra,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.recargocompra)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRecargoCompra = new RecargoCompraDetalleFormJInternalFrame(jDesktopPane,this.recargocompraSessionBean.getConGuardarRelaciones(),this.recargocompraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.setVisible(false);
		this.jInternalFrameDetalleFormRecargoCompra.setSelected(false);						
		
		this.jInternalFrameDetalleFormRecargoCompra.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRecargoCompra.recargocompraLogic=this.recargocompraLogic;
		
		this.cargarCombosFrameForeignKeyRecargoCompra("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRecargoCompra();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRecargoCompra();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRecargoCompra("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRecargoCompra();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRecargoCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRecargoCompra"));
		
		this.jInternalFrameDetalleFormRecargoCompra.jButtonModificarRecargoCompra.addActionListener(new ButtonActionListener(this,"ModificarRecargoCompra"));

		
		this.jInternalFrameDetalleFormRecargoCompra.jButtonModificarToolBarRecargoCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarRecargoCompra"));
					
		this.jInternalFrameDetalleFormRecargoCompra.jMenuItemModificarRecargoCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarRecargoCompra"));		
		
		
		
		this.jInternalFrameDetalleFormRecargoCompra.jButtonActualizarRecargoCompra.addActionListener (new ButtonActionListener(this,"ActualizarRecargoCompra"));
		
		
		this.jInternalFrameDetalleFormRecargoCompra.jButtonActualizarToolBarRecargoCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRecargoCompra"));
						
		this.jInternalFrameDetalleFormRecargoCompra.jMenuItemActualizarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRecargoCompra"));		
		
		
		
		this.jInternalFrameDetalleFormRecargoCompra.jButtonEliminarRecargoCompra.addActionListener (new ButtonActionListener(this,"EliminarRecargoCompra"));
		
		
		this.jInternalFrameDetalleFormRecargoCompra.jButtonEliminarToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarRecargoCompra"));
								
		this.jInternalFrameDetalleFormRecargoCompra.jMenuItemEliminarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRecargoCompra"));		
		
		
		
		this.jInternalFrameDetalleFormRecargoCompra.jButtonCancelarRecargoCompra.addActionListener (new ButtonActionListener(this,"CancelarRecargoCompra"));
		
		
		this.jInternalFrameDetalleFormRecargoCompra.jButtonCancelarToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarRecargoCompra"));
					
		this.jInternalFrameDetalleFormRecargoCompra.jMenuItemCancelarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRecargoCompra"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRecargoCompra.jMenuItemDetalleCerrarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRecargoCompra"));		
		
		
		
		this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRecargoCompra"));
		
		
		
		this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRecargoCompra"));
		
		
		
		this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRecargoCompra"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonidRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"idRecargoCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_empresaRecargoCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRecargoCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_empresaRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRecargoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonnombreRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreRecargoCompraBusqueda"));
		//jButtonid_cuenta_contable_debitoRecargoCompra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_debitoRecargoCompraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompra.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompra"));
		//jButtonid_cuenta_contable_debitoRecargoCompraArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDebito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompraArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompraArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompraUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompraBusqueda"));
		//jButtonid_cuenta_contable_creditoRecargoCompra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoRecargoCompraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompra.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompra"));
		//jButtonid_cuenta_contable_creditoRecargoCompraArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompraArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompraArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompraUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtones_servicioRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"es_servicioRecargoCompraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRecargoCompra.jTabbedPaneRelacionesRecargoCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRecargoCompra"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRecargoCompra"));
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRecargoCompra"));
		}
		
		this.jTableDatosRecargoCompra.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRecargoCompra"));
		
		this.jTableDatosRecargoCompra.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRecargoCompra"));
		
		this.jButtonNuevoRecargoCompra.addActionListener(new ButtonActionListener(this,"NuevoRecargoCompra"));
		
		this.jButtonDuplicarRecargoCompra.addActionListener(new ButtonActionListener(this,"DuplicarRecargoCompra"));
		
		this.jButtonCopiarRecargoCompra.addActionListener(new ButtonActionListener(this,"CopiarRecargoCompra"));
		
		this.jButtonVerFormRecargoCompra.addActionListener(new ButtonActionListener(this,"VerFormRecargoCompra"));
		
		
		this.jButtonNuevoToolBarRecargoCompra.addActionListener(new ButtonActionListener(this,"NuevoToolBarRecargoCompra"));
			
		this.jButtonDuplicarToolBarRecargoCompra.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRecargoCompra"));
			
		this.jMenuItemNuevoRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRecargoCompra"));
			
		this.jMenuItemDuplicarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRecargoCompra"));		
		
		
		this.jButtonNuevoRelacionesRecargoCompra.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRecargoCompra"));
		
		
		this.jButtonNuevoRelacionesToolBarRecargoCompra.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRecargoCompra"));
			
		this.jMenuItemNuevoRelacionesRecargoCompra.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRecargoCompra"));		
		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonModificarRecargoCompra.addActionListener(new ButtonActionListener(this,"ModificarRecargoCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonModificarToolBarRecargoCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarRecargoCompra"));
			
			this.jInternalFrameDetalleFormRecargoCompra.jMenuItemModificarRecargoCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarRecargoCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRecargoCompra.jButtonActualizarRecargoCompra.addActionListener (new ButtonActionListener(this,"ActualizarRecargoCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonActualizarToolBarRecargoCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRecargoCompra"));
				
			this.jInternalFrameDetalleFormRecargoCompra.jMenuItemActualizarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRecargoCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonEliminarRecargoCompra.addActionListener (new ButtonActionListener(this,"EliminarRecargoCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonEliminarToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarRecargoCompra"));
						
			this.jInternalFrameDetalleFormRecargoCompra.jMenuItemEliminarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRecargoCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonCancelarRecargoCompra.addActionListener (new ButtonActionListener(this,"CancelarRecargoCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonCancelarToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarRecargoCompra"));
			
			this.jInternalFrameDetalleFormRecargoCompra.jMenuItemCancelarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRecargoCompra"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRecargoCompra"));		
		
		
		this.jButtonCerrarRecargoCompra.addActionListener (new ButtonActionListener(this,"CerrarRecargoCompra"));
		
		
		this.jButtonCerrarToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"CerrarToolBarRecargoCompra"));
			
		this.jMenuItemCerrarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRecargoCompra"));
			
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jMenuItemDetalleCerrarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRecargoCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosRecargoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosRecargoCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRecargoCompra"));
		}
		
		this.jButtonCopiarToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"CopiarToolBarRecargoCompra"));
			
		this.jButtonVerFormToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"VerFormToolBarRecargoCompra"));
		
		this.jMenuItemGuardarCambiosRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRecargoCompra"));
			
		this.jMenuItemCopiarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRecargoCompra"));		
		
		this.jMenuItemVerFormRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRecargoCompra"));		
		
		
		this.jButtonGuardarCambiosTablaRecargoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRecargoCompra"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRecargoCompra"));
			
		this.jMenuItemGuardarCambiosTablaRecargoCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRecargoCompra"));		
		
		
		
		this.jButtonRecargarInformacionRecargoCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionRecargoCompra"));
					
		this.jButtonRecargarInformacionToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRecargoCompra"));
		
		this.jMenuItemRecargarInformacionRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRecargoCompra"));		
		
		
		
		this.jButtonAnterioresRecargoCompra.addActionListener (new ButtonActionListener(this,"AnterioresRecargoCompra"));
		
		
		this.jButtonAnterioresToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRecargoCompra"));
		
		this.jMenuItemAnterioresRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRecargoCompra"));		
		
		
		this.jButtonSiguientesRecargoCompra.addActionListener (new ButtonActionListener(this,"SiguientesRecargoCompra"));
		
		
		this.jButtonSiguientesToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRecargoCompra"));
			
		this.jMenuItemSiguientesRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRecargoCompra"));
			
		this.jMenuItemAbrirOrderByRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRecargoCompra"));
			
		this.jMenuItemMostrarOcultarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRecargoCompra"));
			
		this.jMenuItemDetalleAbrirOrderByRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRecargoCompra"));
			
		this.jMenuItemDetalleMostarOcultarRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRecargoCompra"));		
		
		
		this.jButtonNuevoGuardarCambiosRecargoCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRecargoCompra"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRecargoCompra"));
			
		this.jMenuItemNuevoGuardarCambiosRecargoCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRecargoCompra"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRecargoCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRecargoCompra"));

		this.jCheckBoxSeleccionadosRecargoCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRecargoCompra"));
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRecargoCompra"));
		}
		
		
		this.jComboBoxTiposRelacionesRecargoCompra.addActionListener (new ButtonActionListener(this,"TiposRelacionesRecargoCompra"));
			
		this.jComboBoxTiposAccionesRecargoCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesRecargoCompra"));
					
		this.jComboBoxTiposSeleccionarRecargoCompra.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRecargoCompra"));
			
		this.jTextFieldValorCampoGeneralRecargoCompra.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRecargoCompra"));		
		
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonidRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"idRecargoCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_empresaRecargoCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRecargoCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_empresaRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRecargoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonnombreRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreRecargoCompraBusqueda"));
		//jButtonid_cuenta_contable_debitoRecargoCompra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_debitoRecargoCompraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompra.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompra"));
		//jButtonid_cuenta_contable_debitoRecargoCompraArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDebito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompraArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompraArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompraUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompraBusqueda"));
		//jButtonid_cuenta_contable_creditoRecargoCompra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoRecargoCompraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompra.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompra"));
		//jButtonid_cuenta_contable_creditoRecargoCompraArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompraArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompraArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompraUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtones_servicioRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"es_servicioRecargoCompraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreRecargoCompra.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreRecargoCompra"));

			this.jButtonFK_IdCuentaContableCreditoRecargoCompra.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoRecargoCompra"));

			this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoRecargoCompra.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompra"));

			this.jButtonFK_IdCuentaContableDebitoRecargoCompra.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDebitoRecargoCompra"));

			this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoRecargoCompra.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompra"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRecargoCompra!=null) {
				this.jInternalFrameReporteDinamicoRecargoCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRecargoCompra"));
				this.jInternalFrameReporteDinamicoRecargoCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRecargoCompra"));
				this.jInternalFrameReporteDinamicoRecargoCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRecargoCompra"));
			}
			
			//this.jButtonCerrarReporteDinamicoRecargoCompra.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRecargoCompra"));				
			//this.jButtonGenerarReporteDinamicoRecargoCompra.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRecargoCompra"));
			//this.jButtonGenerarExcelReporteDinamicoRecargoCompra.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRecargoCompra"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRecargoCompra!=null) {
				this.jInternalFrameImportacionRecargoCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRecargoCompra"));
				this.jInternalFrameImportacionRecargoCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRecargoCompra"));
				this.jInternalFrameImportacionRecargoCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRecargoCompra"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRecargoCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByRecargoCompra"));
			
			this.jButtonAbrirOrderByToolBarRecargoCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRecargoCompra"));			
			
			if(this.jInternalFrameOrderByRecargoCompra!=null) {
				this.jInternalFrameOrderByRecargoCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRecargoCompra"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecargoCompra.jTabbedPaneRelacionesRecargoCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRecargoCompra"));
		
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
            		closingInternalFrameRecargoCompra();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRecargoCompra.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRecargoCompra = (JInternalFrameBase)event.getSource();
	            	
	            RecargoCompraBeanSwingJInternalFrame jInternalFrameParent=(RecargoCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormRecargoCompra.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRecargoCompraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRecargoCompra.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRecargoCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRecargoCompra.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRecargoCompra.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecargoCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecargoCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecargoCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRecargoCompra";
		inputMap = this.jButtonNuevoRecargoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRecargoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRecargoCompraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecargoCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecargoCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecargoCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRecargoCompra";
		inputMap = this.jButtonNuevoRelacionesRecargoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRecargoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRecargoCompraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRecargoCompra";
		inputMap = this.jButtonModificarRecargoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRecargoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRecargoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRecargoCompra";
		inputMap = this.jButtonActualizarRecargoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRecargoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRecargoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRecargoCompra";
		inputMap = this.jButtonEliminarRecargoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRecargoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRecargoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRecargoCompra";
		inputMap = this.jButtonCancelarRecargoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRecargoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRecargoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRecargoCompra";
		inputMap = this.jButtonCerrarRecargoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRecargoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRecargoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRecargoCompra";
		inputMap = this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosRecargoCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRecargoCompra.jButtonGuardarCambiosRecargoCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRecargoCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRecargoCompra.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRecargoCompraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRecargoCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRecargoCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRecargoCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRecargoCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRecargoCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRecargoCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonidRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"idRecargoCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_empresaRecargoCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRecargoCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_empresaRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRecargoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonnombreRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"nombreRecargoCompraBusqueda"));
		//jButtonid_cuenta_contable_debitoRecargoCompra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_debitoRecargoCompraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompra.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompra"));
		//jButtonid_cuenta_contable_debitoRecargoCompraArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDebito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompraArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompraArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompraUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompraBusqueda"));
		//jButtonid_cuenta_contable_creditoRecargoCompra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoRecargoCompraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompra.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompra"));
		//jButtonid_cuenta_contable_creditoRecargoCompraArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompraArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompraArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompraUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecargoCompra.jButtones_servicioRecargoCompraBusqueda.addActionListener(new ButtonActionListener(this,"es_servicioRecargoCompraBusqueda"));
		
		
		this.jButtonBusquedaPorNombreRecargoCompra.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreRecargoCompra"));

		this.jButtonFK_IdCuentaContableCreditoRecargoCompra.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoRecargoCompra"));

		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoRecargoCompra.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoRecargoCompra"));

		this.jButtonFK_IdCuentaContableDebitoRecargoCompra.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDebitoRecargoCompra"));

		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoRecargoCompra.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoRecargoCompra"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRecargoCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRecargoCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRecargoCompraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRecargoCompra.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRecargoCompra(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RecargoCompra recargocompraAux:this.recargocompraLogic.getRecargoCompras()) {
					recargocompraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RecargoCompra recargocompraAux:recargocompras) {
					recargocompraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRecargoCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRecargoCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RecargoCompra recargocompraAux:this.recargocompraLogic.getRecargoCompras()) {
						recargocompraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RecargoCompra recargocompraAux:recargocompras) {
						recargocompraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RecargoCompra recargocompraAux:this.recargocompraLogic.getRecargoCompras()) {
					
						if(sTipoSeleccionar.equals(RecargoCompraConstantesFunciones.LABEL_ESSERVICIO)) {
							existe=true;
							recargocompraAux.setes_servicio(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RecargoCompra recargocompraAux:recargocompras) {
						
						if(sTipoSeleccionar.equals(RecargoCompraConstantesFunciones.LABEL_ESSERVICIO)) {
							existe=true;
							recargocompraAux.setes_servicio(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRecargoCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRecargoCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRecargoCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRecargoCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRecargoCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRecargoCompra.getSelectedRows();
			
			RecargoCompra recargocompraLocal=new RecargoCompra();
			
			//this.seleccionarTodosRecargoCompra(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recargocompraLocal =(RecargoCompra) this.recargocompraLogic.getRecargoCompras().toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					recargocompraLocal =(RecargoCompra) this.recargocompras.toArray()[this.jTableDatosRecargoCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				recargocompraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RecargoCompra recargocompraAux:this.recargocompraLogic.getRecargoCompras()) {
						recargocompraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RecargoCompra recargocompraAux:recargocompras) {
						recargocompraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRecargoCompra(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRecargoCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRecargoCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRecargoCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRecargoCompraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRecargoCompraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRecargoCompraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRecargoCompra(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRecargoCompra.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RecargoCompra recargocompraAux:this.recargocompraLogic.getRecargoCompras()) {
				
						if(sTipoSeleccionar.equals(RecargoCompraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							recargocompraAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RecargoCompra recargocompraAux:recargocompras) {
					
						if(sTipoSeleccionar.equals(RecargoCompraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							recargocompraAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRecargoCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRecargoCompraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRecargoCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRecargoCompra=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRecargoCompra.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRecargoCompra) {				
					conSplash=true;//false;										
					
					//this.startProcessRecargoCompra(conSplash);
				
					this.generarReporteRecargoComprasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRecargoCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRecargoComprasSeleccionados();
				//this.jComboBoxTiposAccionesRecargoCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRecargoComprasSeleccionados(false);
				//this.jComboBoxTiposAccionesRecargoCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRecargoComprasSeleccionados(true);
				//this.jComboBoxTiposAccionesRecargoCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRecargoCompra();
				
				this.exportarRecargoComprasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRecargoCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRecargoCompras();
				//this.importarRecargoCompras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRecargoCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRecargoCompra();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRecargoComprasSeleccionados();
				//this.jComboBoxTiposAccionesRecargoCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Recargo Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRecargoCompra();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRecargoCompra)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRecargoCompra(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Recargo Compra",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRecargoCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.setSelectedIndex(0);					
				}	
			} 			
			else if(RecargoCompraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRecargoCompra) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRecargoCompra(conSplash);
					
						//this.actualizarParametrosGeneralRecargoCompra();
						
						this.generarReporteProcesoAccionRecargoComprasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRecargoCompra.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RecargoCompraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Recargo CompraES SELECCIONADOS?", "MANTENIMIENTO DE Recargo Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRecargoCompra();
				
						this.actualizarParametrosGeneralRecargoCompra();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.recargocompraReturnGeneral=recargocompraLogic.procesarAccionRecargoComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.recargocompraLogic.getRecargoCompras(),this.recargocompraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRecargoCompraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRecargoCompra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRecargoCompra();
					
					RecargoCompraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRecargoCompraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRecargoCompra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRecargoCompra.jComboBoxTiposAccionesFormularioRecargoCompra.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRecargoCompra(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRecargoCompraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRecargoCompra();
			
			if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();		
			RecargoCompra recargocompra=new RecargoCompra();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRecargoCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRecargoCompra.getSelectedItem();
			
			
			
			
			recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(true);
			//this.sTipoAccion;
			
			if(recargocomprasSeleccionados.size()==1) {
				for(RecargoCompra recargocompraAux:recargocomprasSeleccionados) {
					recargocompra=recargocompraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRecargoCompra();
			
      		//this.finishProcessRecargoCompra(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRecargoCompraReturnGeneral() throws Exception {
		if(this.recargocompraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.recargocompraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.recargocompraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.recargocompraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.recargocompraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.recargocompraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRecargoCompra(false);
		}
		
		if(this.recargocompraReturnGeneral.getConRetornoLista() || this.recargocompraReturnGeneral.getConRetornoObjeto()) {
			if(this.recargocompraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.recargocompraLogic.setRecargoCompras(this.recargocompraReturnGeneral.getRecargoCompras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.recargocompraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.recargocompraLogic.setRecargoCompra(this.recargocompraReturnGeneral.getRecargoCompra());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRecargoCompra(false);
		}
	}
	
	public void actualizarParametrosGeneralRecargoCompra() throws Exception {
		
		
	}
	
	public ArrayList<RecargoCompra> getRecargoComprasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRecargoCompra) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RecargoCompra recargocompraAux:recargocompraLogic.getRecargoCompras()) {
					if(recargocompraAux.getIsSelected()) {
						recargocomprasSeleccionados.add(recargocompraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RecargoCompra recargocompraAux:this.recargocompras) {
					if(recargocompraAux.getIsSelected()) {
						recargocomprasSeleccionados.add(recargocompraAux);				
					}
				}
			}
			
			if(recargocomprasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						recargocomprasSeleccionados.addAll(this.recargocompraLogic.getRecargoCompras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						recargocomprasSeleccionados.addAll(this.recargocompras);				
					}
				}
			}
		} else {
			recargocomprasSeleccionados.add(this.recargocompra);
		}
		
		return recargocomprasSeleccionados;
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
	
	public void generarReporteRecargoComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRecargoComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRecargoComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRecargoComprasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRecargoComprasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Recargo Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRecargoComprasSeleccionados() throws Exception {
		ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();		
		
		recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRecargoCompras("Todos",recargocomprasSeleccionados);
		
	}	
	
	public void generarReporteNormalRecargoComprasSeleccionados() throws Exception {
		ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();		
		
		recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRecargoCompras("Todos",recargocomprasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRecargoComprasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();
		
		recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRecargoCompras("Todos",recargocomprasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRecargoComprasSeleccionados() throws Exception {
		ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRecargoCompra();
		
		
		recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRecargoCompra();
		
		
		//this.generarReporteRecargoCompras("Todos",recargocomprasSeleccionados ,recargocompraImplementable,recargocompraImplementableHome);
	}
	
	public void mostrarImportacionRecargoCompras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRecargoCompra();
		
		this.abrirFrameImportacionRecargoCompra();		
		
			
		//this.generarReporteRecargoCompras("Todos",recargocomprasSeleccionados ,recargocompraImplementable,recargocompraImplementableHome);
	}
	
	public void importarRecargoCompras() throws Exception {		
	
	}
	
	public void exportarRecargoComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRecargoComprasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRecargoComprasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRecargoComprasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Recargo Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRecargoComprasSeleccionados() throws Exception {
		ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();		
		
		recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recargocompra."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRecargoCompra(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RecargoCompra recargocompraAux:recargocomprasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRecargoCompra(recargocompraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//recargocompraAux.setsDetalleGeneralEntityReporte(recargocompraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recargo Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRecargoCompra(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RecargoCompraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecargoCompraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecargoCompraConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecargoCompraConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecargoCompraConstantesFunciones.LABEL_ESSERVICIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRecargoCompra(RecargoCompra recargocompra,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=recargocompra.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=recargocompra.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=recargocompra.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recargocompra.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recargocompra.getcuentacontabledebito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recargocompra.getcuentacontablecredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recargocompra.getes_servicio().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRecargoComprasSeleccionados() throws Exception {
		ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();		
		
		recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recargocompra.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RecargoCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRecargoCompra(row);				
				iRow++;
			}				
			
			for(RecargoCompra recargocompraAux:recargocomprasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRecargoCompra(recargocompraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recargo Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRecargoComprasSeleccionados() throws Exception {
		ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();		
		
		recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recargocompra.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("recargocompras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("recargocompra");
			//elementRoot.appendChild(element);
		
			for(RecargoCompra recargocompraAux:recargocomprasSeleccionados) {
				element = document.createElement("recargocompra");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRecargoCompra(recargocompraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recargo Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRecargoCompra(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(RecargoCompraConstantesFunciones.LABEL_ESSERVICIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRecargoCompra(RecargoCompra recargocompra,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(recargocompra.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(recargocompra.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(recargocompra.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(recargocompra.getcuentacontabledebito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(recargocompra.getcuentacontablecredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(recargocompra.getes_servicio());				
	}
	
	public void setFilaDatosExportarXmlRecargoCompra(RecargoCompra recargocompra,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RecargoCompraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(recargocompra.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RecargoCompraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(recargocompra.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RecargoCompraConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(recargocompra.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(RecargoCompraConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(recargocompra.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcuentacontabledebito_descripcion = document.createElement(RecargoCompraConstantesFunciones.IDCUENTACONTABLEDEBITO);
		elementcuentacontabledebito_descripcion.appendChild(document.createTextNode(recargocompra.getcuentacontabledebito_descripcion()));
		element.appendChild(elementcuentacontabledebito_descripcion);

		Element elementcuentacontablecredito_descripcion = document.createElement(RecargoCompraConstantesFunciones.IDCUENTACONTABLECREDITO);
		elementcuentacontablecredito_descripcion.appendChild(document.createTextNode(recargocompra.getcuentacontablecredito_descripcion()));
		element.appendChild(elementcuentacontablecredito_descripcion);

		Element elementes_servicio = document.createElement(RecargoCompraConstantesFunciones.ESSERVICIO);
		elementes_servicio.appendChild(document.createTextNode(recargocompra.getes_servicio().toString().trim()));
		element.appendChild(elementes_servicio);
	}
	
	public void generarReporteGroupGenericoRecargoComprasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RecargoCompra> recargocomprasSeleccionados=new ArrayList<RecargoCompra>();
		
		recargocomprasSeleccionados=this.getRecargoComprasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRecargoCompra(recargocomprasSeleccionados);
		
		this.generarReporteRecargoCompras("Todos",recargocomprasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRecargoCompra(ArrayList<RecargoCompra> recargocomprasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RecargoCompra recargocompraAux:recargocomprasSeleccionados) {
				recargocompraAux.setsDetalleGeneralEntityReporte(recargocompraAux.toString());
			
				if(sTipoSeleccionar.equals(RecargoCompraConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					recargocompraAux.setsDescripcionGeneralEntityReporte1(recargocompraAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RecargoCompraConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					recargocompraAux.setsDescripcionGeneralEntityReporte1(recargocompraAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO)) {
					existe=true;
					recargocompraAux.setsDescripcionGeneralEntityReporte1(recargocompraAux.getcuentacontabledebito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO)) {
					existe=true;
					recargocompraAux.setsDescripcionGeneralEntityReporte1(recargocompraAux.getcuentacontablecredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RecargoCompraConstantesFunciones.LABEL_ESSERVICIO)) {
					existe=true;
					recargocompraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(recargocompraAux.getes_servicio()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecargoCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRecargoCompra(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRecargoCompra=true;
				this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=true;
				this.isVisibilidadCeldaGuardarCambiosRecargoCompra=true;
			}
			
			this.isVisibilidadCeldaModificarRecargoCompra=false;
			this.isVisibilidadCeldaActualizarRecargoCompra=false;
			this.isVisibilidadCeldaEliminarRecargoCompra=false;
			this.isVisibilidadCeldaCancelarRecargoCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecargoCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarRecargoCompra=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRecargoCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=false;
			this.isVisibilidadCeldaModificarRecargoCompra=false;
			this.isVisibilidadCeldaActualizarRecargoCompra=true;
			this.isVisibilidadCeldaEliminarRecargoCompra=false;
			this.isVisibilidadCeldaCancelarRecargoCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecargoCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarRecargoCompra=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRecargoCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=false;
			this.isVisibilidadCeldaModificarRecargoCompra=false;
			this.isVisibilidadCeldaActualizarRecargoCompra=true;
			this.isVisibilidadCeldaEliminarRecargoCompra=true;
			this.isVisibilidadCeldaCancelarRecargoCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecargoCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarRecargoCompra=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRecargoCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=false;
			this.isVisibilidadCeldaModificarRecargoCompra=false;
			this.isVisibilidadCeldaActualizarRecargoCompra=true;
			this.isVisibilidadCeldaEliminarRecargoCompra=false;
			this.isVisibilidadCeldaCancelarRecargoCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecargoCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarRecargoCompra=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRecargoCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=true;
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=true;
			this.isVisibilidadCeldaModificarRecargoCompra=false;
			this.isVisibilidadCeldaActualizarRecargoCompra=false;
			this.isVisibilidadCeldaEliminarRecargoCompra=false;
			this.isVisibilidadCeldaCancelarRecargoCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecargoCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarRecargoCompra=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRecargoCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=false;
			this.isVisibilidadCeldaActualizarRecargoCompra=false;
			this.isVisibilidadCeldaEliminarRecargoCompra=false;
			this.isVisibilidadCeldaCancelarRecargoCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecargoCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarRecargoCompra=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRecargoCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=false;
			this.isVisibilidadCeldaModificarRecargoCompra=true;
			this.isVisibilidadCeldaActualizarRecargoCompra=false;
			this.isVisibilidadCeldaEliminarRecargoCompra=false;
			this.isVisibilidadCeldaCancelarRecargoCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecargoCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarRecargoCompra=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RecargoCompraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRecargoCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=true;
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=true;
		} else {
			this.actualizarEstadoPanelsRecargoCompra(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRecargoCompra=false;
			//this.isVisibilidadCeldaVerFormRecargoCompra=false;
			this.isVisibilidadCeldaDuplicarRecargoCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!recargocompraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=false;
		} else {
			this.isVisibilidadCeldaNuevoRecargoCompra=false;
			this.isVisibilidadCeldaGuardarCambiosRecargoCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(recargocompraSessionBean.getEsGuardarRelacionado()) {
			if(!recargocompraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=false;												
			}
			
			this.jButtonCerrarRecargoCompra.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRecargoCompra=false;
		}
		
		if(!this.permiteMantenimiento(this.recargocompra)) {
			this.isVisibilidadCeldaActualizarRecargoCompra=false;
			this.isVisibilidadCeldaEliminarRecargoCompra=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRecargoCompra() {
	}
	
	public void actualizarEstadoPanelsRecargoCompra(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRecargoCompra!=null) {
				this.jScrollPanelDatosEdicionRecargoCompra.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecargoCompra!=null) {
				this.jTabbedPaneBusquedasRecargoCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRecargoCompra!=null) {
				this.jScrollPanelDatosRecargoCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionRecargoCompra!=null) {
				this.jPanelPaginacionRecargoCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRecargoCompra!=null) {
				this.jPanelParametrosReportesRecargoCompra.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRecargoCompra!=null) {
				this.jScrollPanelDatosEdicionRecargoCompra.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecargoCompra!=null) {
				this.jTabbedPaneBusquedasRecargoCompra.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRecargoCompra!=null) {
				this.jScrollPanelDatosRecargoCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionRecargoCompra!=null) {
				this.jPanelPaginacionRecargoCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRecargoCompra!=null) {
				this.jPanelParametrosReportesRecargoCompra.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRecargoCompra!=null) {
				this.jScrollPanelDatosEdicionRecargoCompra.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecargoCompra!=null) {
				this.jTabbedPaneBusquedasRecargoCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRecargoCompra!=null) {
				this.jScrollPanelDatosRecargoCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionRecargoCompra!=null) {
				this.jPanelPaginacionRecargoCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRecargoCompra!=null) {
				this.jPanelParametrosReportesRecargoCompra.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRecargoCompra!=null) {
				this.jScrollPanelDatosEdicionRecargoCompra.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecargoCompra!=null) {
				this.jTabbedPaneBusquedasRecargoCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRecargoCompra!=null) {
				this.jScrollPanelDatosRecargoCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionRecargoCompra!=null) {
				this.jPanelPaginacionRecargoCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRecargoCompra!=null) {
				this.jPanelParametrosReportesRecargoCompra.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRecargoCompra!=null) {
				this.jScrollPanelDatosEdicionRecargoCompra.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecargoCompra!=null) {
				this.jTabbedPaneBusquedasRecargoCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRecargoCompra!=null) {
				this.jScrollPanelDatosRecargoCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionRecargoCompra!=null) {
				this.jPanelPaginacionRecargoCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRecargoCompra!=null) {
				this.jPanelParametrosReportesRecargoCompra.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRecargoCompra!=null) {
				this.jScrollPanelDatosEdicionRecargoCompra.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecargoCompra!=null) {
				this.jTabbedPaneBusquedasRecargoCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRecargoCompra!=null) {
				this.jScrollPanelDatosRecargoCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionRecargoCompra!=null) {
				this.jPanelPaginacionRecargoCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRecargoCompra!=null) {
				this.jPanelParametrosReportesRecargoCompra.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRecargoCompra!=null) {
				this.jScrollPanelDatosEdicionRecargoCompra.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecargoCompra!=null) {
				this.jTabbedPaneBusquedasRecargoCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRecargoCompra!=null) {
				this.jScrollPanelDatosRecargoCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionRecargoCompra!=null) {
				this.jPanelPaginacionRecargoCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRecargoCompra!=null) {
				this.jPanelParametrosReportesRecargoCompra.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.recargocompraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRecargoCompra!=null) {
					this.jTabbedPaneBusquedasRecargoCompra.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRecargoCompra!=null) {
				this.jPanelParametrosReportesRecargoCompra.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecargoCompra!=null) {
				this.jTabbedPaneBusquedasRecargoCompra.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRecargoCompra!=null) {
				this.jPanelParametrosReportesRecargoCompra.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasRecargoCompra.remove(jPanelBusquedaPorNombreRecargoCompra);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasRecargoCompra.remove(jPanelFK_IdCuentaContableCreditoRecargoCompra);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasRecargoCompra.remove(jPanelFK_IdCuentaContableDebitoRecargoCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableDebito(Boolean isParaCuentaContableDebito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableDebitoNegation=!isParaCuentaContableDebito;

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasRecargoCompra.remove(jPanelBusquedaPorNombreRecargoCompra);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasRecargoCompra.remove(jPanelFK_IdCuentaContableCreditoRecargoCompra);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaCuentaContableDebito;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasRecargoCompra.remove(jPanelFK_IdCuentaContableDebitoRecargoCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCredito(Boolean isParaCuentaContableCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCreditoNegation=!isParaCuentaContableCredito;

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasRecargoCompra.remove(jPanelBusquedaPorNombreRecargoCompra);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableCredito;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasRecargoCompra.remove(jPanelFK_IdCuentaContableCreditoRecargoCompra);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasRecargoCompra.remove(jPanelFK_IdCuentaContableDebitoRecargoCompra);}
		}
		
	}
	
	
	
	

	public String registrarSesionRecargoCompraParaBusquedaCuentaContableDebitos() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(recargocompraSessionBean==null) {
				recargocompraSessionBean=new RecargoCompraSessionBean();
			}

			if(cuentacontabledebitoSessionBean==null) {
				cuentacontabledebitoSessionBean=new CuentaContableSessionBean();
			}

			cuentacontabledebitoSessionBean.setsPathNavegacionActual(recargocompraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontabledebitoSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontabledebitoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontabledebitoSessionBean.getisPaginaPopup();
			cuentacontabledebitoSessionBean.setisPaginaPopup(false);
			cuentacontabledebitoSessionBean.setEstaModoBusqueda(true);
			cuentacontabledebitoSessionBean.setsFuncionBusquedaRapida("window.opener.recargocompraFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_debito(TO_REPLACE);");
			cuentacontabledebitoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontabledebitoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(RecargoCompraConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionRecargoCompra(true);
			//cuentacontableSessionBean.setlidRecargoCompraActual(this.idRecargoCompraActual);

			recargocompraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRecargoCompra(true);
			recargocompraSessionBean.setlIdRecargoCompraActualForeignKey(this.idRecargoCompraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionRecargoCompraParaBusquedaCuentaContableCreditos() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(recargocompraSessionBean==null) {
				recargocompraSessionBean=new RecargoCompraSessionBean();
			}

			if(cuentacontablecreditoSessionBean==null) {
				cuentacontablecreditoSessionBean=new CuentaContableSessionBean();
			}

			cuentacontablecreditoSessionBean.setsPathNavegacionActual(recargocompraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontablecreditoSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontablecreditoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontablecreditoSessionBean.getisPaginaPopup();
			cuentacontablecreditoSessionBean.setisPaginaPopup(false);
			cuentacontablecreditoSessionBean.setEstaModoBusqueda(true);
			cuentacontablecreditoSessionBean.setsFuncionBusquedaRapida("window.opener.recargocompraFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito(TO_REPLACE);");
			cuentacontablecreditoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontablecreditoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(RecargoCompraConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionRecargoCompra(true);
			//cuentacontableSessionBean.setlidRecargoCompraActual(this.idRecargoCompraActual);

			recargocompraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRecargoCompra(true);
			recargocompraSessionBean.setlIdRecargoCompraActualForeignKey(this.idRecargoCompraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RecargoCompraSessionBean recargocompraSessionBean=new RecargoCompraSessionBean();
		
		if(this.recargocompraSessionBean==null) {
			this.recargocompraSessionBean=new RecargoCompraSessionBean();
		}
		
		this.recargocompraSessionBean.setsUltimaBusquedaRecargoCompra(this.getsAccionBusqueda());
		this.recargocompraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.recargocompraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			recargocompraSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
			recargocompraSessionBean.setid_cuenta_contable_credito(this.getid_cuenta_contable_creditoFK_IdCuentaContableCredito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDebito")) {
			recargocompraSessionBean.setid_cuenta_contable_debito(this.getid_cuenta_contable_debitoFK_IdCuentaContableDebito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			recargocompraSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RecargoCompraSessionBean recargocompraSessionBean=new RecargoCompraSessionBean();
		
		if(this.recargocompraSessionBean==null) {
			this.recargocompraSessionBean=new RecargoCompraSessionBean();
		}
		
		if(this.recargocompraSessionBean.getsUltimaBusquedaRecargoCompra()!=null&&!this.recargocompraSessionBean.getsUltimaBusquedaRecargoCompra().equals("")) {
			this.setsAccionBusqueda(recargocompraSessionBean.getsUltimaBusquedaRecargoCompra());
			this.setiNumeroPaginacion(recargocompraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(recargocompraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(recargocompraSessionBean.getnombre());
				recargocompraSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
				this.setid_cuenta_contable_creditoFK_IdCuentaContableCredito(recargocompraSessionBean.getid_cuenta_contable_credito());
				recargocompraSessionBean.setid_cuenta_contable_credito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDebito")) {
				this.setid_cuenta_contable_debitoFK_IdCuentaContableDebito(recargocompraSessionBean.getid_cuenta_contable_debito());
				recargocompraSessionBean.setid_cuenta_contable_debito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(recargocompraSessionBean.getid_empresa());
				recargocompraSessionBean.setid_empresa(-1L);
			}
		}
		
		this.recargocompraSessionBean.setsUltimaBusquedaRecargoCompra("");
		this.recargocompraSessionBean.setiNumeroPaginacion(RecargoCompraConstantesFunciones.INUMEROPAGINACION);
		this.recargocompraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRecargoCompra(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRecargoCompra() {
		this.updateBorderResaltarBusquedasFormularioRecargoCompra();
		this.updateVisibilidadBusquedasFormularioRecargoCompra();
		this.updateHabilitarBusquedasFormularioRecargoCompra();
	}
	
	public void updateBorderResaltarBusquedasFormularioRecargoCompra() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRecargoCompra.getComponents().length>0) {
	

		if(this.recargocompraConstantesFunciones.resaltarBusquedaPorNombreRecargoCompra!=null) {
			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelBusquedaPorNombreRecargoCompra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);
				jPanel.setBorder(this.recargocompraConstantesFunciones.resaltarBusquedaPorNombreRecargoCompra);
			}
		}

		if(this.recargocompraConstantesFunciones.resaltarFK_IdCuentaContableCreditoRecargoCompra!=null) {
			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoRecargoCompra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);
				jPanel.setBorder(this.recargocompraConstantesFunciones.resaltarFK_IdCuentaContableCreditoRecargoCompra);
			}
		}

		if(this.recargocompraConstantesFunciones.resaltarFK_IdCuentaContableDebitoRecargoCompra!=null) {
			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoRecargoCompra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);
				jPanel.setBorder(this.recargocompraConstantesFunciones.resaltarFK_IdCuentaContableDebitoRecargoCompra);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRecargoCompra() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRecargoCompra.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelBusquedaPorNombreRecargoCompra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.recargocompraConstantesFunciones.mostrarBusquedaPorNombreRecargoCompra);
			if(!this.recargocompraConstantesFunciones.mostrarBusquedaPorNombreRecargoCompra && index>-1) {
				this.jTabbedPaneBusquedasRecargoCompra.remove(index);
			}

			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoRecargoCompra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.recargocompraConstantesFunciones.mostrarFK_IdCuentaContableCreditoRecargoCompra);
			if(!this.recargocompraConstantesFunciones.mostrarFK_IdCuentaContableCreditoRecargoCompra && index>-1) {
				this.jTabbedPaneBusquedasRecargoCompra.remove(index);
			}

			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoRecargoCompra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.recargocompraConstantesFunciones.mostrarFK_IdCuentaContableDebitoRecargoCompra);
			if(!this.recargocompraConstantesFunciones.mostrarFK_IdCuentaContableDebitoRecargoCompra && index>-1) {
				this.jTabbedPaneBusquedasRecargoCompra.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRecargoCompra() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRecargoCompra.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelBusquedaPorNombreRecargoCompra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.recargocompraConstantesFunciones.activarBusquedaPorNombreRecargoCompra);
				this.jTabbedPaneBusquedasRecargoCompra.setEnabledAt(index,this.recargocompraConstantesFunciones.activarBusquedaPorNombreRecargoCompra);
			}

			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoRecargoCompra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.recargocompraConstantesFunciones.activarFK_IdCuentaContableCreditoRecargoCompra);
				this.jTabbedPaneBusquedasRecargoCompra.setEnabledAt(index,this.recargocompraConstantesFunciones.activarFK_IdCuentaContableCreditoRecargoCompra);
			}

			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoRecargoCompra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.recargocompraConstantesFunciones.activarFK_IdCuentaContableDebitoRecargoCompra);
				this.jTabbedPaneBusquedasRecargoCompra.setEnabledAt(index,this.recargocompraConstantesFunciones.activarFK_IdCuentaContableDebitoRecargoCompra);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRecargoCompra(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelBusquedaPorNombreRecargoCompra);

			this.jTabbedPaneBusquedasRecargoCompra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);

			this.recargocompraConstantesFunciones.setResaltarBusquedaPorNombreRecargoCompra(resaltar);

			jPanel.setBorder(this.recargocompraConstantesFunciones.resaltarBusquedaPorNombreRecargoCompra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableCredito")) {
			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoRecargoCompra);

			this.jTabbedPaneBusquedasRecargoCompra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);

			this.recargocompraConstantesFunciones.setResaltarFK_IdCuentaContableCreditoRecargoCompra(resaltar);

			jPanel.setBorder(this.recargocompraConstantesFunciones.resaltarFK_IdCuentaContableCreditoRecargoCompra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableDebito")) {
			index= this.jTabbedPaneBusquedasRecargoCompra.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoRecargoCompra);

			this.jTabbedPaneBusquedasRecargoCompra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRecargoCompra.getComponent(index);

			this.recargocompraConstantesFunciones.setResaltarFK_IdCuentaContableDebitoRecargoCompra(resaltar);

			jPanel.setBorder(this.recargocompraConstantesFunciones.resaltarFK_IdCuentaContableDebitoRecargoCompra);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRecargoCompra.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRecargoCompra() throws Exception {

		if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRecargoCompra();
		this.updateVisibilidadResaltarControlesFormularioRecargoCompra();
		this.updateHabilitarResaltarControlesFormularioRecargoCompra();
		
	}
	
	public void updateBorderResaltarControlesFormularioRecargoCompra() throws Exception {
		if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.recargocompraConstantesFunciones.resaltaridRecargoCompra!=null && this.jInternalFrameDetalleFormRecargoCompra!=null) {this.jInternalFrameDetalleFormRecargoCompra.jLabelidRecargoCompra.setBorder(this.recargocompraConstantesFunciones.resaltaridRecargoCompra);}
		if(this.recargocompraConstantesFunciones.resaltarid_empresaRecargoCompra!=null && this.jInternalFrameDetalleFormRecargoCompra!=null) {this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.setBorder(this.recargocompraConstantesFunciones.resaltarid_empresaRecargoCompra);}
		if(this.recargocompraConstantesFunciones.resaltarnombreRecargoCompra!=null && this.jInternalFrameDetalleFormRecargoCompra!=null) {this.jInternalFrameDetalleFormRecargoCompra.jTextFieldnombreRecargoCompra.setBorder(this.recargocompraConstantesFunciones.resaltarnombreRecargoCompra);}
		if(this.recargocompraConstantesFunciones.resaltarid_cuenta_contable_debitoRecargoCompra!=null && this.jInternalFrameDetalleFormRecargoCompra!=null) {this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.setBorder(this.recargocompraConstantesFunciones.resaltarid_cuenta_contable_debitoRecargoCompra);}
		if(this.recargocompraConstantesFunciones.resaltarid_cuenta_contable_creditoRecargoCompra!=null && this.jInternalFrameDetalleFormRecargoCompra!=null) {this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.setBorder(this.recargocompraConstantesFunciones.resaltarid_cuenta_contable_creditoRecargoCompra);}
		if(this.recargocompraConstantesFunciones.resaltares_servicioRecargoCompra!=null && this.jInternalFrameDetalleFormRecargoCompra!=null) {this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxes_servicioRecargoCompra.setBorderPainted(true);this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxes_servicioRecargoCompra.setBorder(this.recargocompraConstantesFunciones.resaltares_servicioRecargoCompra);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRecargoCompra() throws Exception {		
		if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
	
		//this.jInternalFrameDetalleFormRecargoCompra.jLabelidRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostraridRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jPanelidRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostraridRecargoCompra);
		//this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrarid_empresaRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jPanelid_empresaRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrarid_empresaRecargoCompra);
		//this.jInternalFrameDetalleFormRecargoCompra.jTextFieldnombreRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrarnombreRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jPanelnombreRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrarnombreRecargoCompra);
		//this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrarid_cuenta_contable_debitoRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jPanelid_cuenta_contable_debitoRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrarid_cuenta_contable_debitoRecargoCompra);
			this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrarid_cuenta_contable_debitoRecargoCompra);
		//this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrarid_cuenta_contable_creditoRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jPanelid_cuenta_contable_creditoRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrarid_cuenta_contable_creditoRecargoCompra);
			this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrarid_cuenta_contable_creditoRecargoCompra);
		//this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxes_servicioRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrares_servicioRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jPaneles_servicioRecargoCompra.setVisible(this.recargocompraConstantesFunciones.mostrares_servicioRecargoCompra);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRecargoCompra() throws Exception {
		if(this.jInternalFrameDetalleFormRecargoCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRecargoCompra!=null) {
	
		this.jInternalFrameDetalleFormRecargoCompra.jLabelidRecargoCompra.setEnabled(this.recargocompraConstantesFunciones.activaridRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_empresaRecargoCompra.setEnabled(this.recargocompraConstantesFunciones.activarid_empresaRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jTextFieldnombreRecargoCompra.setEnabled(this.recargocompraConstantesFunciones.activarnombreRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_debitoRecargoCompra.setEnabled(this.recargocompraConstantesFunciones.activarid_cuenta_contable_debitoRecargoCompra);
			this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_debitoRecargoCompra.setEnabled(this.recargocompraConstantesFunciones.activarid_cuenta_contable_debitoRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jComboBoxid_cuenta_contable_creditoRecargoCompra.setEnabled(this.recargocompraConstantesFunciones.activarid_cuenta_contable_creditoRecargoCompra);
			this.jInternalFrameDetalleFormRecargoCompra.jButtonid_cuenta_contable_creditoRecargoCompra.setEnabled(this.recargocompraConstantesFunciones.activarid_cuenta_contable_creditoRecargoCompra);
		this.jInternalFrameDetalleFormRecargoCompra.jCheckBoxes_servicioRecargoCompra.setEnabled(this.recargocompraConstantesFunciones.activares_servicioRecargoCompra);
		}
	}
	
		
}