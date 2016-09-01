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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.CuentaContableTipoConstantesFunciones;
import com.bydan.erp.facturacion.util.CuentaContableTipoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.CuentaContableTipoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.CuentaContableTipoBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class CuentaContableTipoBeanSwingJInternalFrame extends CuentaContableTipoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CuentaContableTipoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CuentaContableTipo> cuentacontabletipoValidator = new ClassValidator<CuentaContableTipo>(CuentaContableTipo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CuentaContableTipo cuentacontabletipo;	
	public CuentaContableTipo cuentacontabletipoAux;
	public CuentaContableTipo cuentacontabletipoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CuentaContableTipo cuentacontabletipoTotales;
	public Long idCuentaContableTipoActual;
	public Long iIdNuevoCuentaContableTipo=0L;
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

	public String sFinalQueryComboTipoCuentaContableTipo="";

	public List<TipoCuentaContableTipo> tipocuentacontabletiposForeignKey;

	public List<TipoCuentaContableTipo> gettipocuentacontabletiposForeignKey() {
		return tipocuentacontabletiposForeignKey;
	}

	public void settipocuentacontabletiposForeignKey(List<TipoCuentaContableTipo> tipocuentacontabletiposForeignKey) {
		this.tipocuentacontabletiposForeignKey = tipocuentacontabletiposForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCuentaContableTipo tipocuentacontabletipoForeignKey;

	public TipoCuentaContableTipo gettipocuentacontabletipoForeignKey() {
		return tipocuentacontabletipoForeignKey;
	}

	public void settipocuentacontabletipoForeignKey(TipoCuentaContableTipo tipocuentacontabletipoForeignKey) {
		this.tipocuentacontabletipoForeignKey = tipocuentacontabletipoForeignKey;
	}

	public String sFinalQueryComboTipoProductoServicio="";

	public List<TipoProductoServicio> tipoproductoserviciosForeignKey;

	public List<TipoProductoServicio> gettipoproductoserviciosForeignKey() {
		return tipoproductoserviciosForeignKey;
	}

	public void settipoproductoserviciosForeignKey(List<TipoProductoServicio> tipoproductoserviciosForeignKey) {
		this.tipoproductoserviciosForeignKey = tipoproductoserviciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoProductoServicio tipoproductoservicioForeignKey;

	public TipoProductoServicio gettipoproductoservicioForeignKey() {
		return tipoproductoservicioForeignKey;
	}

	public void settipoproductoservicioForeignKey(TipoProductoServicio tipoproductoservicioForeignKey) {
		this.tipoproductoservicioForeignKey = tipoproductoservicioForeignKey;
	}

	public String sFinalQueryComboCuentaContableVenta="";

	public List<CuentaContable> cuentacontableventasForeignKey;

	public List<CuentaContable> getcuentacontableventasForeignKey() {
		return cuentacontableventasForeignKey;
	}

	public void setcuentacontableventasForeignKey(List<CuentaContable> cuentacontableventasForeignKey) {
		this.cuentacontableventasForeignKey = cuentacontableventasForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableventaForeignKey;

	public CuentaContable getcuentacontableventaForeignKey() {
		return cuentacontableventaForeignKey;
	}

	public void setcuentacontableventaForeignKey(CuentaContable cuentacontableventaForeignKey) {
		this.cuentacontableventaForeignKey = cuentacontableventaForeignKey;
	}

	public String sFinalQueryComboCuentaContableDescuento="";

	public List<CuentaContable> cuentacontabledescuentosForeignKey;

	public List<CuentaContable> getcuentacontabledescuentosForeignKey() {
		return cuentacontabledescuentosForeignKey;
	}

	public void setcuentacontabledescuentosForeignKey(List<CuentaContable> cuentacontabledescuentosForeignKey) {
		this.cuentacontabledescuentosForeignKey = cuentacontabledescuentosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontabledescuentoForeignKey;

	public CuentaContable getcuentacontabledescuentoForeignKey() {
		return cuentacontabledescuentoForeignKey;
	}

	public void setcuentacontabledescuentoForeignKey(CuentaContable cuentacontabledescuentoForeignKey) {
		this.cuentacontabledescuentoForeignKey = cuentacontabledescuentoForeignKey;
	}

	public String sFinalQueryComboCuentaContableDevolucion="";

	public List<CuentaContable> cuentacontabledevolucionsForeignKey;

	public List<CuentaContable> getcuentacontabledevolucionsForeignKey() {
		return cuentacontabledevolucionsForeignKey;
	}

	public void setcuentacontabledevolucionsForeignKey(List<CuentaContable> cuentacontabledevolucionsForeignKey) {
		this.cuentacontabledevolucionsForeignKey = cuentacontabledevolucionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontabledevolucionForeignKey;

	public CuentaContable getcuentacontabledevolucionForeignKey() {
		return cuentacontabledevolucionForeignKey;
	}

	public void setcuentacontabledevolucionForeignKey(CuentaContable cuentacontabledevolucionForeignKey) {
		this.cuentacontabledevolucionForeignKey = cuentacontabledevolucionForeignKey;
	}

	public String sFinalQueryComboCuentaContableCosto="";

	public List<CuentaContable> cuentacontablecostosForeignKey;

	public List<CuentaContable> getcuentacontablecostosForeignKey() {
		return cuentacontablecostosForeignKey;
	}

	public void setcuentacontablecostosForeignKey(List<CuentaContable> cuentacontablecostosForeignKey) {
		this.cuentacontablecostosForeignKey = cuentacontablecostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontablecostoForeignKey;

	public CuentaContable getcuentacontablecostoForeignKey() {
		return cuentacontablecostoForeignKey;
	}

	public void setcuentacontablecostoForeignKey(CuentaContable cuentacontablecostoForeignKey) {
		this.cuentacontablecostoForeignKey = cuentacontablecostoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableVentaActual=0L;

	public Long getidCuentaContableVentaActual() {
		return idCuentaContableVentaActual;
	}

	public void setidCuentaContableVentaActual(Long idCuentaContableVentaActual) {
		this.idCuentaContableVentaActual= idCuentaContableVentaActual;
	}
	public Long idCuentaContableDescuentoActual=0L;

	public Long getidCuentaContableDescuentoActual() {
		return idCuentaContableDescuentoActual;
	}

	public void setidCuentaContableDescuentoActual(Long idCuentaContableDescuentoActual) {
		this.idCuentaContableDescuentoActual= idCuentaContableDescuentoActual;
	}
	public Long idCuentaContableDevolucionActual=0L;

	public Long getidCuentaContableDevolucionActual() {
		return idCuentaContableDevolucionActual;
	}

	public void setidCuentaContableDevolucionActual(Long idCuentaContableDevolucionActual) {
		this.idCuentaContableDevolucionActual= idCuentaContableDevolucionActual;
	}
	public Long idCuentaContableCostoActual=0L;

	public Long getidCuentaContableCostoActual() {
		return idCuentaContableCostoActual;
	}

	public void setidCuentaContableCostoActual(Long idCuentaContableCostoActual) {
		this.idCuentaContableCostoActual= idCuentaContableCostoActual;
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
	
	public Boolean isPermisoTodoCuentaContableTipo;
	public Boolean isPermisoNuevoCuentaContableTipo;
	public Boolean isPermisoActualizarCuentaContableTipo;
	public Boolean isPermisoActualizarOriginalCuentaContableTipo;
	public Boolean isPermisoEliminarCuentaContableTipo;
	public Boolean isPermisoGuardarCambiosCuentaContableTipo;
	public Boolean isPermisoConsultaCuentaContableTipo;
	public Boolean isPermisoBusquedaCuentaContableTipo;
	public Boolean isPermisoReporteCuentaContableTipo;
	public Boolean isPermisoPaginacionMedioCuentaContableTipo;
	public Boolean isPermisoPaginacionAltoCuentaContableTipo;
	public Boolean isPermisoPaginacionTodoCuentaContableTipo;
	public Boolean isPermisoCopiarCuentaContableTipo;
	public Boolean isPermisoVerFormCuentaContableTipo;
	public Boolean isPermisoDuplicarCuentaContableTipo;
	public Boolean isPermisoOrdenCuentaContableTipo;
	
	
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
	
	public CuentaContableTipoParameterReturnGeneral cuentacontabletipoReturnGeneral;
	public CuentaContableTipoParameterReturnGeneral cuentacontabletipoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCuentaContableTipo=false;
	public Boolean esParaAccionDesdeFormularioCuentaContableTipo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CuentaContableTipoSessionBeanAdditional cuentacontabletipoSessionBeanAdditional=null;
	
	public CuentaContableTipoSessionBeanAdditional getCuentaContableTipoSessionBeanAdditional() {
		return this.cuentacontabletipoSessionBeanAdditional;
	}
	
	public void setCuentaContableTipoSessionBeanAdditional(CuentaContableTipoSessionBeanAdditional cuentacontabletipoSessionBeanAdditional) {
		try {
			this.cuentacontabletipoSessionBeanAdditional=cuentacontabletipoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CuentaContableTipoBeanSwingJInternalFrameAdditional cuentacontabletipoBeanSwingJInternalFrameAdditional=null;
	//public class CuentaContableTipoBeanSwingJInternalFrame
	
	public CuentaContableTipoBeanSwingJInternalFrameAdditional getCuentaContableTipoBeanSwingJInternalFrameAdditional() {
		return this.cuentacontabletipoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCuentaContableTipoBeanSwingJInternalFrameAdditional(CuentaContableTipoBeanSwingJInternalFrameAdditional cuentacontabletipoBeanSwingJInternalFrameAdditional) {
		try {
			this.cuentacontabletipoBeanSwingJInternalFrameAdditional=cuentacontabletipoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CuentaContableTipoLogic cuentacontabletipoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CuentaContableTipo cuentacontabletipoBean;
	public CuentaContableTipoConstantesFunciones cuentacontabletipoConstantesFunciones;
	//public CuentaContableTipoParameterReturnGeneral cuentacontabletipoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoCuentaContableTipoLogic tipocuentacontabletipoLogic;
	public TipoProductoServicioLogic tipoproductoservicioLogic;
	public CuentaContableLogic cuentacontableventaLogic;
	public CuentaContableLogic cuentacontabledescuentoLogic;
	public CuentaContableLogic cuentacontabledevolucionLogic;
	public CuentaContableLogic cuentacontablecostoLogic;
	
	//PARAMETROS
	
	
	//public List<CuentaContableTipo> cuentacontabletipos;	
	//public List<CuentaContableTipo> cuentacontabletiposEliminados;
	//public List<CuentaContableTipo> cuentacontabletiposAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaDuplicarCuentaContableTipo=true;
	public Boolean isVisibilidadCeldaCopiarCuentaContableTipo=true;
	public Boolean isVisibilidadCeldaVerFormCuentaContableTipo=true;
	public Boolean isVisibilidadCeldaOrdenCuentaContableTipo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaModificarCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaActualizarCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaEliminarCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaCancelarCuentaContableTipo=false;
	public Boolean isVisibilidadCeldaGuardarCuentaContableTipo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCuentaContableTipo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdCuentaContableCosto=false;
	public Boolean isVisibilidadFK_IdCuentaContableDescuento=false;
	public Boolean isVisibilidadFK_IdCuentaContableDevolucion=false;
	public Boolean isVisibilidadFK_IdCuentaContableVenta=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoCuentaContableTipo=false;
	public Boolean isVisibilidadFK_IdTipoProductoServicio=false;
	
	public Long getiIdNuevoCuentaContableTipo() {
		return this.iIdNuevoCuentaContableTipo;
	}

	public void setiIdNuevoCuentaContableTipo(Long iIdNuevoCuentaContableTipo) {
		this.iIdNuevoCuentaContableTipo = iIdNuevoCuentaContableTipo;
	}
	
	public Long getidCuentaContableTipoActual() {
		return this.idCuentaContableTipoActual;
	}

	public void setidCuentaContableTipoActual(Long idCuentaContableTipoActual) {
		this.idCuentaContableTipoActual = idCuentaContableTipoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CuentaContableTipo getcuentacontabletipo() {
		return this.cuentacontabletipo;
	}

	public void setcuentacontabletipo(CuentaContableTipo cuentacontabletipo) {
		this.cuentacontabletipo = cuentacontabletipo;
	}
	
	public CuentaContableTipo getcuentacontabletipoAux() {
		return this.cuentacontabletipoAux;
	}

	public void setcuentacontabletipoAux(CuentaContableTipo cuentacontabletipoAux) {
		this.cuentacontabletipoAux = cuentacontabletipoAux;
	}				
	
	public CuentaContableTipo getcuentacontabletipoAnterior() {
		return this.cuentacontabletipoAnterior;
	}

	public void setcuentacontabletipoAnterior(CuentaContableTipo cuentacontabletipoAnterior) {
		this.cuentacontabletipoAnterior = cuentacontabletipoAnterior;
	}	
	
	public CuentaContableTipo getcuentacontabletipoTotales() {
		return this.cuentacontabletipoTotales;
	}

	public void setcuentacontabletipoTotales(CuentaContableTipo cuentacontabletipoTotales) {
		this.cuentacontabletipoTotales = cuentacontabletipoTotales;
	}	
	
	public CuentaContableTipo getcuentacontabletipoBean() {
		return this.cuentacontabletipoBean;
	}

	public void setcuentacontabletipoBean(CuentaContableTipo cuentacontabletipoBean) {
		this.cuentacontabletipoBean = cuentacontabletipoBean;
	}	
	
	public CuentaContableTipoParameterReturnGeneral getcuentacontabletipoReturnGeneral() {
		return this.cuentacontabletipoReturnGeneral;
	}

	public void setcuentacontabletipoReturnGeneral(CuentaContableTipoParameterReturnGeneral cuentacontabletipoReturnGeneral) {
		this.cuentacontabletipoReturnGeneral = cuentacontabletipoReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_cuenta_contable_costoFK_IdCuentaContableCosto=null;

	public Long getid_cuenta_contable_costoFK_IdCuentaContableCosto() {
		return this.id_cuenta_contable_costoFK_IdCuentaContableCosto;
	}

	public void setid_cuenta_contable_costoFK_IdCuentaContableCosto(Long id_cuenta_contable_costoFK_IdCuentaContableCosto) {
		this.id_cuenta_contable_costoFK_IdCuentaContableCosto = id_cuenta_contable_costoFK_IdCuentaContableCosto;
	}

	public Long id_cuenta_contable_descuentoFK_IdCuentaContableDescuento=null;

	public Long getid_cuenta_contable_descuentoFK_IdCuentaContableDescuento() {
		return this.id_cuenta_contable_descuentoFK_IdCuentaContableDescuento;
	}

	public void setid_cuenta_contable_descuentoFK_IdCuentaContableDescuento(Long id_cuenta_contable_descuentoFK_IdCuentaContableDescuento) {
		this.id_cuenta_contable_descuentoFK_IdCuentaContableDescuento = id_cuenta_contable_descuentoFK_IdCuentaContableDescuento;
	}

	public Long id_cuenta_contable_devolucionFK_IdCuentaContableDevolucion=null;

	public Long getid_cuenta_contable_devolucionFK_IdCuentaContableDevolucion() {
		return this.id_cuenta_contable_devolucionFK_IdCuentaContableDevolucion;
	}

	public void setid_cuenta_contable_devolucionFK_IdCuentaContableDevolucion(Long id_cuenta_contable_devolucionFK_IdCuentaContableDevolucion) {
		this.id_cuenta_contable_devolucionFK_IdCuentaContableDevolucion = id_cuenta_contable_devolucionFK_IdCuentaContableDevolucion;
	}

	public Long id_cuenta_contable_ventaFK_IdCuentaContableVenta=null;

	public Long getid_cuenta_contable_ventaFK_IdCuentaContableVenta() {
		return this.id_cuenta_contable_ventaFK_IdCuentaContableVenta;
	}

	public void setid_cuenta_contable_ventaFK_IdCuentaContableVenta(Long id_cuenta_contable_ventaFK_IdCuentaContableVenta) {
		this.id_cuenta_contable_ventaFK_IdCuentaContableVenta = id_cuenta_contable_ventaFK_IdCuentaContableVenta;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo=-1L;

	public Long getid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo() {
		return this.id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo;
	}

	public void setid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo(Long id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo) {
		this.id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo = id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo;
	}

	public Long id_tipo_producto_servicioFK_IdTipoProductoServicio=-1L;

	public Long getid_tipo_producto_servicioFK_IdTipoProductoServicio() {
		return this.id_tipo_producto_servicioFK_IdTipoProductoServicio;
	}

	public void setid_tipo_producto_servicioFK_IdTipoProductoServicio(Long id_tipo_producto_servicioFK_IdTipoProductoServicio) {
		this.id_tipo_producto_servicioFK_IdTipoProductoServicio = id_tipo_producto_servicioFK_IdTipoProductoServicio;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CuentaContableTipoLogic getCuentaContableTipoLogic()	{		
		return cuentacontabletipoLogic;
	}

	public void setCuentaContableTipoLogic(CuentaContableTipoLogic cuentacontabletipoLogic) {
		this.cuentacontabletipoLogic = cuentacontabletipoLogic;
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
	
	public Boolean getIsEsNuevoCuentaContableTipo() {
		return isEsNuevoCuentaContableTipo;
	}

	public void setIsEsNuevoCuentaContableTipo(Boolean isEsNuevoCuentaContableTipo) {
		this.isEsNuevoCuentaContableTipo = isEsNuevoCuentaContableTipo;
	}

	public Boolean getEsParaAccionDesdeFormularioCuentaContableTipo() {
		return esParaAccionDesdeFormularioCuentaContableTipo;
	}
	
	public void setEsParaAccionDesdeFormularioCuentaContableTipo(Boolean esParaAccionDesdeFormularioCuentaContableTipo) {
		this.esParaAccionDesdeFormularioCuentaContableTipo = esParaAccionDesdeFormularioCuentaContableTipo;
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

			if(this.cuentacontabletipoSessionBean==null) {
				this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cuentacontabletipoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoCuentaContableTiposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocuentacontabletiposForeignKey=new ArrayList<TipoCuentaContableTipo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCuentaContableTipoLogic tipocuentacontabletipoLogic=new TipoCuentaContableTipoLogic();

			//tipocuentacontabletipoLogic.getTipoCuentaContableTipoDataAccess().setIsForForeingKeyData(true);

			if(this.cuentacontabletipoSessionBean==null) {
				this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaContableTipo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocuentacontabletipoLogic.getTipoCuentaContableTipoDataAccess().setIsForForeingKeyData(true);

					tipocuentacontabletipoLogic.getTodosTipoCuentaContableTiposWithConnection(sFinalQuery,new Pagination());

					this.tipocuentacontabletiposForeignKey=tipocuentacontabletipoLogic.getTipoCuentaContableTipos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCuentaContableTipo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentacontabletipoLogic.getEntityWithConnection(cuentacontabletipoSessionBean.getlidTipoCuentaContableTipoActual());
					this.tipocuentacontabletiposForeignKey.add(tipocuentacontabletipoLogic.getTipoCuentaContableTipo());
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

	public void cargarCombosTipoProductoServiciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoproductoserviciosForeignKey=new ArrayList<TipoProductoServicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoProductoServicioLogic tipoproductoservicioLogic=new TipoProductoServicioLogic();

			//tipoproductoservicioLogic.getTipoProductoServicioDataAccess().setIsForForeingKeyData(true);

			if(this.cuentacontabletipoSessionBean==null) {
				this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProductoServicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoproductoservicioLogic.getTipoProductoServicioDataAccess().setIsForForeingKeyData(true);

					tipoproductoservicioLogic.getTodosTipoProductoServiciosWithConnection(sFinalQuery,new Pagination());

					this.tipoproductoserviciosForeignKey=tipoproductoservicioLogic.getTipoProductoServicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoProductoServicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioLogic.getEntityWithConnection(cuentacontabletipoSessionBean.getlidTipoProductoServicioActual());
					this.tipoproductoserviciosForeignKey.add(tipoproductoservicioLogic.getTipoProductoServicio());
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

	public void cargarCombosCuentaContableVentasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontableventasForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.cuentacontabletipoSessionBean==null) {
				this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableVenta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableventaLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontableventasForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableVenta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(cuentacontabletipoSessionBean.getlidCuentaContableVentaActual());
					this.cuentacontableventasForeignKey.add(cuentacontableLogic.getCuentaContable());
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

	public void cargarCombosCuentaContableDescuentosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontabledescuentosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.cuentacontabletipoSessionBean==null) {
				this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDescuento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontabledescuentoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontabledescuentosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableDescuento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(cuentacontabletipoSessionBean.getlidCuentaContableDescuentoActual());
					this.cuentacontabledescuentosForeignKey.add(cuentacontableLogic.getCuentaContable());
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

	public void cargarCombosCuentaContableDevolucionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontabledevolucionsForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.cuentacontabletipoSessionBean==null) {
				this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDevolucion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontabledevolucionLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontabledevolucionsForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableDevolucion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(cuentacontabletipoSessionBean.getlidCuentaContableDevolucionActual());
					this.cuentacontabledevolucionsForeignKey.add(cuentacontableLogic.getCuentaContable());
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

	public void cargarCombosCuentaContableCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablecostosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.cuentacontabletipoSessionBean==null) {
				this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontablecostoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablecostosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(cuentacontabletipoSessionBean.getlidCuentaContableCostoActual());
					this.cuentacontablecostosForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.cuentacontabletipo!=null) {
						this.cuentacontabletipo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCuentaContableTipo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCuentaContableTipoGenerico)throws Exception
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
				jComboBoxid_empresaCuentaContableTipoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCuentaContableTipoGenerico!=null && jComboBoxid_empresaCuentaContableTipoGenerico.getItemCount()>0) {
					jComboBoxid_empresaCuentaContableTipoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCuentaContableTipoForeignKey(Long idTipoCuentaContableTipoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCuentaContableTipo  tipocuentacontabletipoTemp=null;

			for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletiposForeignKey) {
				if(tipocuentacontabletipoAux.getId()!=null && tipocuentacontabletipoAux.getId().equals(idTipoCuentaContableTipoSeleccionado)) {
					tipocuentacontabletipoTemp=tipocuentacontabletipoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocuentacontabletipoTemp!=null) {

					if(this.cuentacontabletipo!=null) {
						this.cuentacontabletipo.setTipoCuentaContableTipo(tipocuentacontabletipoTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setSelectedItem(tipocuentacontabletipoTemp);
					}
				} else {
					//jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setSelectedItem(tipocuentacontabletipoTemp);
					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCuentaContableTipo") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocuentacontabletipoTemp!=null && jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo!=null) {
						jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setSelectedItem(tipocuentacontabletipoTemp);
					} else {
						if(jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo!=null) {
							//jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setSelectedItem(tipocuentacontabletipoTemp);
							if(jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.getItemCount()>0) {
								jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setSelectedIndex(0);
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

	public String getActualTipoCuentaContableTipoForeignKeyDescripcion(Long idTipoCuentaContableTipoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCuentaContableTipo  tipocuentacontabletipoTemp=null;

			for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletiposForeignKey) {
				if(tipocuentacontabletipoAux.getId()!=null && tipocuentacontabletipoAux.getId().equals(idTipoCuentaContableTipoSeleccionado)) {
					tipocuentacontabletipoTemp=tipocuentacontabletipoAux;
					break;
				}
			}


			sDescripcion=TipoCuentaContableTipoConstantesFunciones.getTipoCuentaContableTipoDescripcion(tipocuentacontabletipoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCuentaContableTipoForeignKeyGenerico(Long idTipoCuentaContableTipoSeleccionado,JComboBox jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			TipoCuentaContableTipo  tipocuentacontabletipoTemp=null;

			for(TipoCuentaContableTipo tipocuentacontabletipoAux:tipocuentacontabletiposForeignKey) {
				if(tipocuentacontabletipoAux.getId()!=null && tipocuentacontabletipoAux.getId().equals(idTipoCuentaContableTipoSeleccionado)) {
					tipocuentacontabletipoTemp=tipocuentacontabletipoAux;
					break;
				}
			}

			if(tipocuentacontabletipoTemp!=null) {
				jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipoGenerico.setSelectedItem(tipocuentacontabletipoTemp);
			} else {
				if(jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipoGenerico!=null && jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoProductoServicioForeignKey(Long idTipoProductoServicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoproductoservicioTemp!=null) {

					if(this.cuentacontabletipo!=null) {
						this.cuentacontabletipo.setTipoProductoServicio(tipoproductoservicioTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.setSelectedItem(tipoproductoservicioTemp);
					}
				} else {
					//jComboBoxid_tipo_producto_servicioCuentaContableTipo.setSelectedItem(tipoproductoservicioTemp);
					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProductoServicio") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoservicioTemp!=null && jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo!=null) {
						jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setSelectedItem(tipoproductoservicioTemp);
					} else {
						if(jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo!=null) {
							//jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setSelectedItem(tipoproductoservicioTemp);
							if(jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.getItemCount()>0) {
								jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setSelectedIndex(0);
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

	public String getActualTipoProductoServicioForeignKeyDescripcion(Long idTipoProductoServicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}


			sDescripcion=TipoProductoServicioConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoProductoServicioForeignKeyGenerico(Long idTipoProductoServicioSeleccionado,JComboBox jComboBoxid_tipo_producto_servicioCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}

			if(tipoproductoservicioTemp!=null) {
				jComboBoxid_tipo_producto_servicioCuentaContableTipoGenerico.setSelectedItem(tipoproductoservicioTemp);
			} else {
				if(jComboBoxid_tipo_producto_servicioCuentaContableTipoGenerico!=null && jComboBoxid_tipo_producto_servicioCuentaContableTipoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_producto_servicioCuentaContableTipoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableVentaForeignKey(Long idCuentaContableVentaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableventaTemp=null;

			for(CuentaContable cuentacontableventaAux:cuentacontableventasForeignKey) {
				if(cuentacontableventaAux.getId()!=null && cuentacontableventaAux.getId().equals(idCuentaContableVentaSeleccionado)) {
					cuentacontableventaTemp=cuentacontableventaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableventaTemp!=null) {

					if(this.cuentacontabletipo!=null) {
						this.cuentacontabletipo.setCuentaContableVenta(cuentacontableventaTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setSelectedItem(cuentacontableventaTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setSelectedItem(cuentacontableventaTemp);
					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setSelectedIndex(0);
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

	public String getActualCuentaContableVentaForeignKeyDescripcion(Long idCuentaContableVentaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableventaTemp=null;

			for(CuentaContable cuentacontableventaAux:cuentacontableventasForeignKey) {
				if(cuentacontableventaAux.getId()!=null && cuentacontableventaAux.getId().equals(idCuentaContableVentaSeleccionado)) {
					cuentacontableventaTemp=cuentacontableventaAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableventaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableVentaForeignKeyGenerico(Long idCuentaContableVentaSeleccionado,JComboBox jComboBoxid_cuenta_contable_ventaCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableventaTemp=null;

			for(CuentaContable cuentacontableventaAux:cuentacontableventasForeignKey) {
				if(cuentacontableventaAux.getId()!=null && cuentacontableventaAux.getId().equals(idCuentaContableVentaSeleccionado)) {
					cuentacontableventaTemp=cuentacontableventaAux;
					break;
				}
			}

			if(cuentacontableventaTemp!=null) {
				jComboBoxid_cuenta_contable_ventaCuentaContableTipoGenerico.setSelectedItem(cuentacontableventaTemp);
			} else {
				if(jComboBoxid_cuenta_contable_ventaCuentaContableTipoGenerico!=null && jComboBoxid_cuenta_contable_ventaCuentaContableTipoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_ventaCuentaContableTipoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableDescuentoForeignKey(Long idCuentaContableDescuentoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledescuentoTemp=null;

			for(CuentaContable cuentacontabledescuentoAux:cuentacontabledescuentosForeignKey) {
				if(cuentacontabledescuentoAux.getId()!=null && cuentacontabledescuentoAux.getId().equals(idCuentaContableDescuentoSeleccionado)) {
					cuentacontabledescuentoTemp=cuentacontabledescuentoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontabledescuentoTemp!=null) {

					if(this.cuentacontabletipo!=null) {
						this.cuentacontabletipo.setCuentaContableDescuento(cuentacontabledescuentoTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setSelectedItem(cuentacontabledescuentoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setSelectedItem(cuentacontabledescuentoTemp);
					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setSelectedIndex(0);
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

	public String getActualCuentaContableDescuentoForeignKeyDescripcion(Long idCuentaContableDescuentoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontabledescuentoTemp=null;

			for(CuentaContable cuentacontabledescuentoAux:cuentacontabledescuentosForeignKey) {
				if(cuentacontabledescuentoAux.getId()!=null && cuentacontabledescuentoAux.getId().equals(idCuentaContableDescuentoSeleccionado)) {
					cuentacontabledescuentoTemp=cuentacontabledescuentoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontabledescuentoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableDescuentoForeignKeyGenerico(Long idCuentaContableDescuentoSeleccionado,JComboBox jComboBoxid_cuenta_contable_descuentoCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledescuentoTemp=null;

			for(CuentaContable cuentacontabledescuentoAux:cuentacontabledescuentosForeignKey) {
				if(cuentacontabledescuentoAux.getId()!=null && cuentacontabledescuentoAux.getId().equals(idCuentaContableDescuentoSeleccionado)) {
					cuentacontabledescuentoTemp=cuentacontabledescuentoAux;
					break;
				}
			}

			if(cuentacontabledescuentoTemp!=null) {
				jComboBoxid_cuenta_contable_descuentoCuentaContableTipoGenerico.setSelectedItem(cuentacontabledescuentoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_descuentoCuentaContableTipoGenerico!=null && jComboBoxid_cuenta_contable_descuentoCuentaContableTipoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_descuentoCuentaContableTipoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableDevolucionForeignKey(Long idCuentaContableDevolucionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledevolucionTemp=null;

			for(CuentaContable cuentacontabledevolucionAux:cuentacontabledevolucionsForeignKey) {
				if(cuentacontabledevolucionAux.getId()!=null && cuentacontabledevolucionAux.getId().equals(idCuentaContableDevolucionSeleccionado)) {
					cuentacontabledevolucionTemp=cuentacontabledevolucionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontabledevolucionTemp!=null) {

					if(this.cuentacontabletipo!=null) {
						this.cuentacontabletipo.setCuentaContableDevolucion(cuentacontabledevolucionTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setSelectedItem(cuentacontabledevolucionTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setSelectedItem(cuentacontabledevolucionTemp);
					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setSelectedIndex(0);
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

	public String getActualCuentaContableDevolucionForeignKeyDescripcion(Long idCuentaContableDevolucionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontabledevolucionTemp=null;

			for(CuentaContable cuentacontabledevolucionAux:cuentacontabledevolucionsForeignKey) {
				if(cuentacontabledevolucionAux.getId()!=null && cuentacontabledevolucionAux.getId().equals(idCuentaContableDevolucionSeleccionado)) {
					cuentacontabledevolucionTemp=cuentacontabledevolucionAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontabledevolucionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableDevolucionForeignKeyGenerico(Long idCuentaContableDevolucionSeleccionado,JComboBox jComboBoxid_cuenta_contable_devolucionCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledevolucionTemp=null;

			for(CuentaContable cuentacontabledevolucionAux:cuentacontabledevolucionsForeignKey) {
				if(cuentacontabledevolucionAux.getId()!=null && cuentacontabledevolucionAux.getId().equals(idCuentaContableDevolucionSeleccionado)) {
					cuentacontabledevolucionTemp=cuentacontabledevolucionAux;
					break;
				}
			}

			if(cuentacontabledevolucionTemp!=null) {
				jComboBoxid_cuenta_contable_devolucionCuentaContableTipoGenerico.setSelectedItem(cuentacontabledevolucionTemp);
			} else {
				if(jComboBoxid_cuenta_contable_devolucionCuentaContableTipoGenerico!=null && jComboBoxid_cuenta_contable_devolucionCuentaContableTipoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_devolucionCuentaContableTipoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableCostoForeignKey(Long idCuentaContableCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecostoTemp=null;

			for(CuentaContable cuentacontablecostoAux:cuentacontablecostosForeignKey) {
				if(cuentacontablecostoAux.getId()!=null && cuentacontablecostoAux.getId().equals(idCuentaContableCostoSeleccionado)) {
					cuentacontablecostoTemp=cuentacontablecostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontablecostoTemp!=null) {

					if(this.cuentacontabletipo!=null) {
						this.cuentacontabletipo.setCuentaContableCosto(cuentacontablecostoTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.setSelectedItem(cuentacontablecostoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_costoCuentaContableTipo.setSelectedItem(cuentacontablecostoTemp);
					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.setSelectedIndex(0);
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

	public String getActualCuentaContableCostoForeignKeyDescripcion(Long idCuentaContableCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontablecostoTemp=null;

			for(CuentaContable cuentacontablecostoAux:cuentacontablecostosForeignKey) {
				if(cuentacontablecostoAux.getId()!=null && cuentacontablecostoAux.getId().equals(idCuentaContableCostoSeleccionado)) {
					cuentacontablecostoTemp=cuentacontablecostoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontablecostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableCostoForeignKeyGenerico(Long idCuentaContableCostoSeleccionado,JComboBox jComboBoxid_cuenta_contable_costoCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecostoTemp=null;

			for(CuentaContable cuentacontablecostoAux:cuentacontablecostosForeignKey) {
				if(cuentacontablecostoAux.getId()!=null && cuentacontablecostoAux.getId().equals(idCuentaContableCostoSeleccionado)) {
					cuentacontablecostoTemp=cuentacontablecostoAux;
					break;
				}
			}

			if(cuentacontablecostoTemp!=null) {
				jComboBoxid_cuenta_contable_costoCuentaContableTipoGenerico.setSelectedItem(cuentacontablecostoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_costoCuentaContableTipoGenerico!=null && jComboBoxid_cuenta_contable_costoCuentaContableTipoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_costoCuentaContableTipoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CuentaContableTipo cuentacontabletipo,JComboBox jComboBoxid_empresaCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCuentaContableTipoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCuentaContableTipoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cuentacontabletipo.setid_empresa(empresaAux.getId());
				cuentacontabletipo.setempresa_descripcion(CuentaContableTipoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cuentacontabletipo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCuentaContableTipoForeignKey(CuentaContableTipo cuentacontabletipo,JComboBox jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			TipoCuentaContableTipo  tipocuentacontabletipoAux=new TipoCuentaContableTipo();

			if(jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipoGenerico==null) {
				tipocuentacontabletipoAux=(TipoCuentaContableTipo)this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.getSelectedItem();
			} else {
				tipocuentacontabletipoAux=(TipoCuentaContableTipo)jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipoGenerico.getSelectedItem();
			}

			if(tipocuentacontabletipoAux!=null && tipocuentacontabletipoAux.getId()!=null) {
				cuentacontabletipo.setid_tipo_cuenta_contable_tipo(tipocuentacontabletipoAux.getId());
				cuentacontabletipo.settipocuentacontabletipo_descripcion(CuentaContableTipoConstantesFunciones.getTipoCuentaContableTipoDescripcion(tipocuentacontabletipoAux));
				cuentacontabletipo.setTipoCuentaContableTipo(tipocuentacontabletipoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoServicioForeignKey(CuentaContableTipo cuentacontabletipo,JComboBox jComboBoxid_tipo_producto_servicioCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioAux=new TipoProductoServicio();

			if(jComboBoxid_tipo_producto_servicioCuentaContableTipoGenerico==null) {
				tipoproductoservicioAux=(TipoProductoServicio)this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.getSelectedItem();
			} else {
				tipoproductoservicioAux=(TipoProductoServicio)jComboBoxid_tipo_producto_servicioCuentaContableTipoGenerico.getSelectedItem();
			}

			if(tipoproductoservicioAux!=null && tipoproductoservicioAux.getId()!=null) {
				cuentacontabletipo.setid_tipo_producto_servicio(tipoproductoservicioAux.getId());
				cuentacontabletipo.settipoproductoservicio_descripcion(CuentaContableTipoConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicioAux));
				cuentacontabletipo.setTipoProductoServicio(tipoproductoservicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableVentaForeignKey(CuentaContableTipo cuentacontabletipo,JComboBox jComboBoxid_cuenta_contable_ventaCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_ventaCuentaContableTipoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_ventaCuentaContableTipoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				cuentacontabletipo.setid_cuenta_contable_venta(cuentacontableAux.getId());
				cuentacontabletipo.setcuentacontableventa_descripcion(CuentaContableTipoConstantesFunciones.getCuentaContableVentaDescripcion(cuentacontableAux));
				cuentacontabletipo.setCuentaContableVenta(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableDescuentoForeignKey(CuentaContableTipo cuentacontabletipo,JComboBox jComboBoxid_cuenta_contable_descuentoCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_descuentoCuentaContableTipoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_descuentoCuentaContableTipoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				cuentacontabletipo.setid_cuenta_contable_descuento(cuentacontableAux.getId());
				cuentacontabletipo.setcuentacontabledescuento_descripcion(CuentaContableTipoConstantesFunciones.getCuentaContableDescuentoDescripcion(cuentacontableAux));
				cuentacontabletipo.setCuentaContableDescuento(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableDevolucionForeignKey(CuentaContableTipo cuentacontabletipo,JComboBox jComboBoxid_cuenta_contable_devolucionCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_devolucionCuentaContableTipoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_devolucionCuentaContableTipoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				cuentacontabletipo.setid_cuenta_contable_devolucion(cuentacontableAux.getId());
				cuentacontabletipo.setcuentacontabledevolucion_descripcion(CuentaContableTipoConstantesFunciones.getCuentaContableDevolucionDescripcion(cuentacontableAux));
				cuentacontabletipo.setCuentaContableDevolucion(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCostoForeignKey(CuentaContableTipo cuentacontabletipo,JComboBox jComboBoxid_cuenta_contable_costoCuentaContableTipoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_costoCuentaContableTipoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_costoCuentaContableTipoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				cuentacontabletipo.setid_cuenta_contable_costo(cuentacontableAux.getId());
				cuentacontabletipo.setcuentacontablecosto_descripcion(CuentaContableTipoConstantesFunciones.getCuentaContableCostoDescripcion(cuentacontableAux));
				cuentacontabletipo.setCuentaContableCosto(cuentacontableAux);			}
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

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
					}

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCuentaContableTiposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCuentaContableTipo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.removeAllItems();

							for(TipoCuentaContableTipo tipocuentacontabletipo:this.tipocuentacontabletiposForeignKey) {
								this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.addItem(tipocuentacontabletipo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
					}

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCuentaContableTipo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.removeAllItems();

							for(TipoCuentaContableTipo tipocuentacontabletipo:this.tipocuentacontabletiposForeignKey) {
								this.jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.addItem(tipocuentacontabletipo);
							}
						}

						if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoProductoServiciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoProductoServicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.removeAllItems();

							for(TipoProductoServicio tipoproductoservicio:this.tipoproductoserviciosForeignKey) {
								this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.addItem(tipoproductoservicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
					}

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProductoServicio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.removeAllItems();

							for(TipoProductoServicio tipoproductoservicio:this.tipoproductoserviciosForeignKey) {
								this.jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.addItem(tipoproductoservicio);
							}
						}

						if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableVentasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.removeAllItems();

							for(CuentaContable cuentacontableventa:this.cuentacontableventasForeignKey) {
								this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.addItem(cuentacontableventa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
					}

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableDescuentosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.removeAllItems();

							for(CuentaContable cuentacontabledescuento:this.cuentacontabledescuentosForeignKey) {
								this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.addItem(cuentacontabledescuento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
					}

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableDevolucionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.removeAllItems();

							for(CuentaContable cuentacontabledevolucion:this.cuentacontabledevolucionsForeignKey) {
								this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.addItem(cuentacontabledevolucion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
					}

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.removeAllItems();

							for(CuentaContable cuentacontablecosto:this.cuentacontablecostosForeignKey) {
								this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.addItem(cuentacontablecosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { 
					}

					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoCuentaContableTipoForeignKey(TipoCuentaContableTipo tipocuentacontabletipo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setSelectedItem(tipocuentacontabletipo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setSelectedItem(tipocuentacontabletipo);
						} else {
							this.jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoProductoServicioForeignKey(TipoProductoServicio tipoproductoservicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.setSelectedItem(tipoproductoservicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setSelectedItem(tipoproductoservicio);
						} else {
							this.jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableVentaForeignKey(CuentaContable cuentacontableventa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setSelectedItem(cuentacontableventa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableDescuentoForeignKey(CuentaContable cuentacontabledescuento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setSelectedItem(cuentacontabledescuento);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableDevolucionForeignKey(CuentaContable cuentacontabledevolucion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setSelectedItem(cuentacontabledevolucion);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableCostoForeignKey(CuentaContable cuentacontablecosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.setSelectedItem(cuentacontablecosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCuentaContableTipo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CuentaContableTipoConstantesFunciones.refrescarForeignKeysDescripcionesCuentaContableTipo(this.cuentacontabletipoLogic.getCuentaContableTipos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CuentaContableTipoConstantesFunciones.refrescarForeignKeysDescripcionesCuentaContableTipo(this.cuentacontabletipos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoCuentaContableTipo.class));
		classes.add(new Classe(TipoProductoServicio.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cuentacontabletipoLogic.setCuentaContableTipos(this.cuentacontabletipos);
			cuentacontabletipoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CuentaContableTipoParameterReturnGeneral getCuentaContableTipoParameterGeneral() {
		return this.cuentacontabletipoParameterGeneral;
	}
	
	public void setCuentaContableTipoParameterGeneral(CuentaContableTipoParameterReturnGeneral cuentacontabletipoParameterGeneral) {
		this.cuentacontabletipoParameterGeneral = cuentacontabletipoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCuentaContableTipo() {
		return isPermisoTodoCuentaContableTipo;
	}

	public void setIsPermisoTodoCuentaContableTipo(Boolean isPermisoTodoCuentaContableTipo) {
		this.isPermisoTodoCuentaContableTipo = isPermisoTodoCuentaContableTipo;
	}

	public Boolean getIsPermisoNuevoCuentaContableTipo() {
		return isPermisoNuevoCuentaContableTipo;
	}

	public void setIsPermisoNuevoCuentaContableTipo(Boolean isPermisoNuevoCuentaContableTipo) {
		this.isPermisoNuevoCuentaContableTipo = isPermisoNuevoCuentaContableTipo;
	}

	public Boolean getIsPermisoActualizarCuentaContableTipo() {
		return isPermisoActualizarCuentaContableTipo;
	}

	public void setIsPermisoActualizarCuentaContableTipo(Boolean isPermisoActualizarCuentaContableTipo) {
		this.isPermisoActualizarCuentaContableTipo = isPermisoActualizarCuentaContableTipo;
	}

	public Boolean getIsPermisoEliminarCuentaContableTipo() {
		return isPermisoEliminarCuentaContableTipo;
	}

	public void setIsPermisoEliminarCuentaContableTipo(Boolean isPermisoEliminarCuentaContableTipo) {
		this.isPermisoEliminarCuentaContableTipo = isPermisoEliminarCuentaContableTipo;
	}

	public Boolean getIsPermisoGuardarCambiosCuentaContableTipo() {
		return isPermisoGuardarCambiosCuentaContableTipo;
	}

	public void setIsPermisoGuardarCambiosCuentaContableTipo(Boolean isPermisoGuardarCambiosCuentaContableTipo) {
		this.isPermisoGuardarCambiosCuentaContableTipo = isPermisoGuardarCambiosCuentaContableTipo;
	}
	
	public Boolean getIsPermisoConsultaCuentaContableTipo() {
		return isPermisoConsultaCuentaContableTipo;
	}

	public void setIsPermisoConsultaCuentaContableTipo(Boolean isPermisoConsultaCuentaContableTipo) {
		this.isPermisoConsultaCuentaContableTipo = isPermisoConsultaCuentaContableTipo;
	}

	public Boolean getIsPermisoBusquedaCuentaContableTipo() {
		return isPermisoBusquedaCuentaContableTipo;
	}

	public void setIsPermisoBusquedaCuentaContableTipo(Boolean isPermisoBusquedaCuentaContableTipo) {
		this.isPermisoBusquedaCuentaContableTipo = isPermisoBusquedaCuentaContableTipo;
	}

	public Boolean getIsPermisoReporteCuentaContableTipo() {
		return isPermisoReporteCuentaContableTipo;
	}

	public void setIsPermisoReporteCuentaContableTipo(Boolean isPermisoReporteCuentaContableTipo) {
		this.isPermisoReporteCuentaContableTipo = isPermisoReporteCuentaContableTipo;
	}
	
	public Boolean getIsPermisoPaginacionMedioCuentaContableTipo() {
		return isPermisoPaginacionMedioCuentaContableTipo;
	}

	public void setIsPermisoPaginacionMedioCuentaContableTipo(Boolean isPermisoPaginacionMedioCuentaContableTipo) {
		this.isPermisoPaginacionMedioCuentaContableTipo = isPermisoPaginacionMedioCuentaContableTipo;
	}
	
	public Boolean getIsPermisoPaginacionTodoCuentaContableTipo() {
		return isPermisoPaginacionTodoCuentaContableTipo;
	}

	public void setIsPermisoPaginacionTodoCuentaContableTipo(Boolean isPermisoPaginacionTodoCuentaContableTipo) {
		this.isPermisoPaginacionTodoCuentaContableTipo = isPermisoPaginacionTodoCuentaContableTipo;
	}
	
	public Boolean getIsPermisoPaginacionAltoCuentaContableTipo() {
		return isPermisoPaginacionAltoCuentaContableTipo;
	}

	public void setIsPermisoPaginacionAltoCuentaContableTipo(Boolean isPermisoPaginacionAltoCuentaContableTipo) {
		this.isPermisoPaginacionAltoCuentaContableTipo = isPermisoPaginacionAltoCuentaContableTipo;
	}
	
	public Boolean getIsPermisoCopiarCuentaContableTipo() {
		return isPermisoCopiarCuentaContableTipo;
	}

	public void setIsPermisoCopiarCuentaContableTipo(Boolean isPermisoCopiarCuentaContableTipo) {
		this.isPermisoCopiarCuentaContableTipo = isPermisoCopiarCuentaContableTipo;
	}
	
	public Boolean getIsPermisoVerFormCuentaContableTipo() {
		return isPermisoVerFormCuentaContableTipo;
	}

	public void setIsPermisoVerFormCuentaContableTipo(Boolean isPermisoVerFormCuentaContableTipo) {
		this.isPermisoVerFormCuentaContableTipo = isPermisoVerFormCuentaContableTipo;
	}
	
	public Boolean getIsPermisoDuplicarCuentaContableTipo() {
		return isPermisoDuplicarCuentaContableTipo;
	}

	public void setIsPermisoDuplicarCuentaContableTipo(Boolean isPermisoDuplicarCuentaContableTipo) {
		this.isPermisoDuplicarCuentaContableTipo = isPermisoDuplicarCuentaContableTipo;
	}
	
	public Boolean getIsPermisoOrdenCuentaContableTipo() {
		return isPermisoOrdenCuentaContableTipo;
	}

	public void setIsPermisoOrdenCuentaContableTipo(Boolean isPermisoOrdenCuentaContableTipo) {
		this.isPermisoOrdenCuentaContableTipo = isPermisoOrdenCuentaContableTipo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCuentaContableTipo() {
		return isVisibilidadCeldaNuevoCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaNuevoCuentaContableTipo(Boolean isVisibilidadCeldaNuevoCuentaContableTipo) {
		this.isVisibilidadCeldaNuevoCuentaContableTipo = isVisibilidadCeldaNuevoCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCuentaContableTipo() {
		return isVisibilidadCeldaDuplicarCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaDuplicarCuentaContableTipo(Boolean isVisibilidadCeldaDuplicarCuentaContableTipo) {
		this.isVisibilidadCeldaDuplicarCuentaContableTipo = isVisibilidadCeldaDuplicarCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCuentaContableTipo() {
		return isVisibilidadCeldaCopiarCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaCopiarCuentaContableTipo(Boolean isVisibilidadCeldaCopiarCuentaContableTipo) {
		this.isVisibilidadCeldaCopiarCuentaContableTipo = isVisibilidadCeldaCopiarCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCuentaContableTipo() {
		return isVisibilidadCeldaVerFormCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaVerFormCuentaContableTipo(Boolean isVisibilidadCeldaVerFormCuentaContableTipo) {
		this.isVisibilidadCeldaVerFormCuentaContableTipo = isVisibilidadCeldaVerFormCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCuentaContableTipo() {
		return isVisibilidadCeldaOrdenCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaOrdenCuentaContableTipo(Boolean isVisibilidadCeldaOrdenCuentaContableTipo) {
		this.isVisibilidadCeldaOrdenCuentaContableTipo = isVisibilidadCeldaOrdenCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCuentaContableTipo() {
		return isVisibilidadCeldaNuevoRelacionesCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCuentaContableTipo(Boolean isVisibilidadCeldaNuevoRelacionesCuentaContableTipo) {
		this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo = isVisibilidadCeldaNuevoRelacionesCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCuentaContableTipo() {
		return isVisibilidadCeldaModificarCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaModificarCuentaContableTipo(Boolean isVisibilidadCeldaModificarCuentaContableTipo) {
		this.isVisibilidadCeldaModificarCuentaContableTipo = isVisibilidadCeldaModificarCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCuentaContableTipo() {
		return isVisibilidadCeldaActualizarCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaActualizarCuentaContableTipo(Boolean isVisibilidadCeldaActualizarCuentaContableTipo) {
		this.isVisibilidadCeldaActualizarCuentaContableTipo = isVisibilidadCeldaActualizarCuentaContableTipo;
	}

	public Boolean getIsVisibilidadCeldaEliminarCuentaContableTipo() {
		return isVisibilidadCeldaEliminarCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaEliminarCuentaContableTipo(Boolean isVisibilidadCeldaEliminarCuentaContableTipo) {
		this.isVisibilidadCeldaEliminarCuentaContableTipo = isVisibilidadCeldaEliminarCuentaContableTipo;
	}

	public Boolean getIsVisibilidadCeldaCancelarCuentaContableTipo() {
		return isVisibilidadCeldaCancelarCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaCancelarCuentaContableTipo(Boolean isVisibilidadCeldaCancelarCuentaContableTipo) {
		this.isVisibilidadCeldaCancelarCuentaContableTipo = isVisibilidadCeldaCancelarCuentaContableTipo;
	}

	public Boolean getIsVisibilidadCeldaGuardarCuentaContableTipo() {
		return isVisibilidadCeldaGuardarCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaGuardarCuentaContableTipo(Boolean isVisibilidadCeldaGuardarCuentaContableTipo) {
		this.isVisibilidadCeldaGuardarCuentaContableTipo = isVisibilidadCeldaGuardarCuentaContableTipo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCuentaContableTipo() {
		return isVisibilidadCeldaGuardarCambiosCuentaContableTipo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCuentaContableTipo(Boolean isVisibilidadCeldaGuardarCambiosCuentaContableTipo) {
		this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo = isVisibilidadCeldaGuardarCambiosCuentaContableTipo;
	}
		
	public CuentaContableTipoSessionBean getcuentacontabletipoSessionBean() {
		return this.cuentacontabletipoSessionBean;
	}
	
	public void setcuentacontabletipoSessionBean(CuentaContableTipoSessionBean cuentacontabletipoSessionBean) {
		this.cuentacontabletipoSessionBean=cuentacontabletipoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableCosto() {
		return this.isVisibilidadFK_IdCuentaContableCosto;
	}

	public void setisVisibilidadFK_IdCuentaContableCosto(Boolean isVisibilidadFK_IdCuentaContableCosto) {
		this.isVisibilidadFK_IdCuentaContableCosto=isVisibilidadFK_IdCuentaContableCosto;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableDescuento() {
		return this.isVisibilidadFK_IdCuentaContableDescuento;
	}

	public void setisVisibilidadFK_IdCuentaContableDescuento(Boolean isVisibilidadFK_IdCuentaContableDescuento) {
		this.isVisibilidadFK_IdCuentaContableDescuento=isVisibilidadFK_IdCuentaContableDescuento;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableDevolucion() {
		return this.isVisibilidadFK_IdCuentaContableDevolucion;
	}

	public void setisVisibilidadFK_IdCuentaContableDevolucion(Boolean isVisibilidadFK_IdCuentaContableDevolucion) {
		this.isVisibilidadFK_IdCuentaContableDevolucion=isVisibilidadFK_IdCuentaContableDevolucion;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableVenta() {
		return this.isVisibilidadFK_IdCuentaContableVenta;
	}

	public void setisVisibilidadFK_IdCuentaContableVenta(Boolean isVisibilidadFK_IdCuentaContableVenta) {
		this.isVisibilidadFK_IdCuentaContableVenta=isVisibilidadFK_IdCuentaContableVenta;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoCuentaContableTipo() {
		return this.isVisibilidadFK_IdTipoCuentaContableTipo;
	}

	public void setisVisibilidadFK_IdTipoCuentaContableTipo(Boolean isVisibilidadFK_IdTipoCuentaContableTipo) {
		this.isVisibilidadFK_IdTipoCuentaContableTipo=isVisibilidadFK_IdTipoCuentaContableTipo;
	}

	public Boolean getisVisibilidadFK_IdTipoProductoServicio() {
		return this.isVisibilidadFK_IdTipoProductoServicio;
	}

	public void setisVisibilidadFK_IdTipoProductoServicio(Boolean isVisibilidadFK_IdTipoProductoServicio) {
		this.isVisibilidadFK_IdTipoProductoServicio=isVisibilidadFK_IdTipoProductoServicio;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(CuentaContableTipo cuentacontabletipo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cuentacontabletipo,null);
				this.setActualParaGuardarTipoCuentaContableTipoForeignKey(cuentacontabletipo,null);
				this.setActualParaGuardarTipoProductoServicioForeignKey(cuentacontabletipo,null);
				this.setActualParaGuardarCuentaContableVentaForeignKey(cuentacontabletipo,null);
				this.setActualParaGuardarCuentaContableDescuentoForeignKey(cuentacontabletipo,null);
				this.setActualParaGuardarCuentaContableDevolucionForeignKey(cuentacontabletipo,null);
				this.setActualParaGuardarCuentaContableCostoForeignKey(cuentacontabletipo,null);
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
	
	public void bugActualizarReferenciaActual(CuentaContableTipo cuentacontabletipo,CuentaContableTipo cuentacontabletipoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCuentaContableTipo(cuentacontabletipo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cuentacontabletipoAux.setId(cuentacontabletipo.getId());
		cuentacontabletipoAux.setVersionRow(cuentacontabletipo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCuentaContableTipo();
		
			int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cuentacontabletipoValidator.getInvalidValues(this.cuentacontabletipo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cuentacontabletipoLogic.setDatosCliente(datosCliente);
			cuentacontabletipoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cuentacontabletipoAux=new  CuentaContableTipo();
				
				cuentacontabletipoAux.setIsNew(true);
				cuentacontabletipoAux.setIsChanged(true);
				
				cuentacontabletipoAux.setCuentaContableTipoOriginal(this.cuentacontabletipo);
				
				cuentacontabletipoAux.setId(this.cuentacontabletipo.getId());	
				cuentacontabletipoAux.setVersionRow(this.cuentacontabletipo.getVersionRow());	
				cuentacontabletipoAux.setid_empresa(this.cuentacontabletipo.getid_empresa());	
				cuentacontabletipoAux.setnombre(this.cuentacontabletipo.getnombre());	
				cuentacontabletipoAux.setdigito_verificador(this.cuentacontabletipo.getdigito_verificador());	
				cuentacontabletipoAux.setid_tipo_cuenta_contable_tipo(this.cuentacontabletipo.getid_tipo_cuenta_contable_tipo());	
				cuentacontabletipoAux.setid_tipo_producto_servicio(this.cuentacontabletipo.getid_tipo_producto_servicio());	
				cuentacontabletipoAux.setid_cuenta_contable_venta(this.cuentacontabletipo.getid_cuenta_contable_venta());	
				cuentacontabletipoAux.setid_cuenta_contable_descuento(this.cuentacontabletipo.getid_cuenta_contable_descuento());	
				cuentacontabletipoAux.setid_cuenta_contable_devolucion(this.cuentacontabletipo.getid_cuenta_contable_devolucion());	
				cuentacontabletipoAux.setid_cuenta_contable_costo(this.cuentacontabletipo.getid_cuenta_contable_costo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cuentacontabletipoAux,cuentacontabletipoLogic.getCuentaContableTipos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontabletipoAux,cuentacontabletipos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletipoLogic.saveCuentaContableTipos();//WithConnection
						//cuentacontabletipoLogic.getSetVersionRowCuentaContableTipos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentacontabletipo,cuentacontabletipoAux);
					
					this.refrescarForeignKeysDescripcionesCuentaContableTipo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacontabletipoLogic.saveCuentaContableTipoRelaciones(cuentacontabletipoAux);//WithConnection
								//cuentacontabletipoLogic.getSetVersionRowCuentaContableTipos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentacontabletipo,cuentacontabletipoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentacontabletipoAux,cuentacontabletipoLogic.getCuentaContableTipos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentacontabletipoAux,cuentacontabletipos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentacontabletipo,cuentacontabletipoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cuentacontabletipoAux=new  CuentaContableTipo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() 
					|| (this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() && this.cuentacontabletipo.getId()>=0)) {
						
					cuentacontabletipoAux.setIsNew(false);
				}
				
				cuentacontabletipoAux.setIsDeleted(false);
			
				cuentacontabletipoAux.setId(this.cuentacontabletipo.getId());	
				cuentacontabletipoAux.setVersionRow(this.cuentacontabletipo.getVersionRow());	
				cuentacontabletipoAux.setid_empresa(this.cuentacontabletipo.getid_empresa());	
				cuentacontabletipoAux.setnombre(this.cuentacontabletipo.getnombre());	
				cuentacontabletipoAux.setdigito_verificador(this.cuentacontabletipo.getdigito_verificador());	
				cuentacontabletipoAux.setid_tipo_cuenta_contable_tipo(this.cuentacontabletipo.getid_tipo_cuenta_contable_tipo());	
				cuentacontabletipoAux.setid_tipo_producto_servicio(this.cuentacontabletipo.getid_tipo_producto_servicio());	
				cuentacontabletipoAux.setid_cuenta_contable_venta(this.cuentacontabletipo.getid_cuenta_contable_venta());	
				cuentacontabletipoAux.setid_cuenta_contable_descuento(this.cuentacontabletipo.getid_cuenta_contable_descuento());	
				cuentacontabletipoAux.setid_cuenta_contable_devolucion(this.cuentacontabletipo.getid_cuenta_contable_devolucion());	
				cuentacontabletipoAux.setid_cuenta_contable_costo(this.cuentacontabletipo.getid_cuenta_contable_costo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentacontabletipoAux,cuentacontabletipoLogic.getCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontabletipoAux,cuentacontabletipos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletipoLogic.saveCuentaContableTipos();//WithConnection
						//cuentacontabletipoLogic.getSetVersionRowCuentaContableTipos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentacontabletipo,cuentacontabletipoAux);
					
					this.refrescarForeignKeysDescripcionesCuentaContableTipo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacontabletipoLogic.saveCuentaContableTipoRelaciones(cuentacontabletipoAux);//WithConnection
								//cuentacontabletipoLogic.getSetVersionRowCuentaContableTipos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentacontabletipo,cuentacontabletipoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentacontabletipoAux,cuentacontabletipoLogic.getCuentaContableTipos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentacontabletipoAux,cuentacontabletipos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentacontabletipo,cuentacontabletipoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cuentacontabletipoAux=new  CuentaContableTipo();
				
				cuentacontabletipoAux.setIsNew(false);
				cuentacontabletipoAux.setIsChanged(false);
				
				cuentacontabletipoAux.setIsDeleted(true);
				
				cuentacontabletipoAux.setId(this.cuentacontabletipo.getId());	
				cuentacontabletipoAux.setVersionRow(this.cuentacontabletipo.getVersionRow());	
				cuentacontabletipoAux.setid_empresa(this.cuentacontabletipo.getid_empresa());	
				cuentacontabletipoAux.setnombre(this.cuentacontabletipo.getnombre());	
				cuentacontabletipoAux.setdigito_verificador(this.cuentacontabletipo.getdigito_verificador());	
				cuentacontabletipoAux.setid_tipo_cuenta_contable_tipo(this.cuentacontabletipo.getid_tipo_cuenta_contable_tipo());	
				cuentacontabletipoAux.setid_tipo_producto_servicio(this.cuentacontabletipo.getid_tipo_producto_servicio());	
				cuentacontabletipoAux.setid_cuenta_contable_venta(this.cuentacontabletipo.getid_cuenta_contable_venta());	
				cuentacontabletipoAux.setid_cuenta_contable_descuento(this.cuentacontabletipo.getid_cuenta_contable_descuento());	
				cuentacontabletipoAux.setid_cuenta_contable_devolucion(this.cuentacontabletipo.getid_cuenta_contable_devolucion());	
				cuentacontabletipoAux.setid_cuenta_contable_costo(this.cuentacontabletipo.getid_cuenta_contable_costo());	
				
				if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cuentacontabletipoAux.getId()>=0) {	
						this.cuentacontabletiposEliminados.add(cuentacontabletipoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cuentacontabletipoAux,cuentacontabletipoLogic.getCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontabletipoAux,cuentacontabletipos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletipoLogic.saveCuentaContableTipos();//WithConnection
						//cuentacontabletipoLogic.getSetVersionRowCuentaContableTipos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacontabletipoLogic.saveCuentaContableTipoRelaciones(cuentacontabletipoAux);//WithConnection
								//cuentacontabletipoLogic.getSetVersionRowCuentaContableTipos();//WithConnection
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
							if(this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cuentacontabletipoAux,cuentacontabletipoLogic.getCuentaContableTipos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cuentacontabletipoAux,cuentacontabletipos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.getCuentaContableTipos().addAll(this.cuentacontabletiposEliminados);
					
					cuentacontabletipoLogic.saveCuentaContableTipos();//WithConnection
					//cuentacontabletipoLogic.getSetVersionRowCuentaContableTipos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCuentaContableTipo();
				
				this.cuentacontabletiposEliminados= new ArrayList<CuentaContableTipo>();		
			}
			
			if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cuenta Contable Tipo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cuentacontabletipo=cuentacontabletipoAux;
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
      		//this.finishProcessCuentaContableTipo();
      	}
		
	}	
	
	public void actualizarRelaciones(CuentaContableTipo cuentacontabletipoLocal) throws Exception {
		
		if(this.cuentacontabletipoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CuentaContableTipo cuentacontabletipoLocal) throws Exception {	
		if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cuentacontabletipoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCuentaContableTipoDetalleFormJInternalFrame.class)) {
				TipoCuentaContableTipoBeanSwingJInternalFrame tipocuentacontabletipoBeanSwingJInternalFrameLocal=(TipoCuentaContableTipoBeanSwingJInternalFrame) ((TipoCuentaContableTipoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocuentacontabletipoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCuentaContableTipo(tipocuentacontabletipoBeanSwingJInternalFrameLocal.gettipocuentacontabletipo(),true);
				tipocuentacontabletipoBeanSwingJInternalFrameLocal.actualizarLista(tipocuentacontabletipoBeanSwingJInternalFrameLocal.tipocuentacontabletipo,this.tipocuentacontabletiposForeignKey);

				tipocuentacontabletipoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocuentacontabletipoBeanSwingJInternalFrameLocal.tipocuentacontabletipo);

				cuentacontabletipoLocal.setTipoCuentaContableTipo(tipocuentacontabletipoBeanSwingJInternalFrameLocal.tipocuentacontabletipo);

				this.addItemDefectoCombosForeignKeyTipoCuentaContableTipo();
				this.cargarCombosFrameTipoCuentaContableTiposForeignKey("Formulario");
				this.setActualTipoCuentaContableTipoForeignKey(tipocuentacontabletipoBeanSwingJInternalFrameLocal.tipocuentacontabletipo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoServicioDetalleFormJInternalFrame.class)) {
				TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrameLocal=(TipoProductoServicioBeanSwingJInternalFrame) ((TipoProductoServicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoservicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProductoServicio(tipoproductoservicioBeanSwingJInternalFrameLocal.gettipoproductoservicio(),true);
				tipoproductoservicioBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio,this.tipoproductoserviciosForeignKey);

				tipoproductoservicioBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio);

				cuentacontabletipoLocal.setTipoProductoServicio(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio);

				this.addItemDefectoCombosForeignKeyTipoProductoServicio();
				this.cargarCombosFrameTipoProductoServiciosForeignKey("Formulario");
				this.setActualTipoProductoServicioForeignKey(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableventaBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableventaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableventaBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableventaBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableventaBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontableventasForeignKey);

				cuentacontableventaBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableventaBeanSwingJInternalFrameLocal.cuentacontable);

				cuentacontabletipoLocal.setCuentaContableVenta(cuentacontableventaBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableVenta();
				this.cargarCombosFrameCuentaContableVentasForeignKey("Formulario");
				this.setActualCuentaContableVentaForeignKey(cuentacontableventaBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontabledescuentoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontabledescuentoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontabledescuentoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontabledescuentoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontabledescuentoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontabledescuentosForeignKey);

				cuentacontabledescuentoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontabledescuentoBeanSwingJInternalFrameLocal.cuentacontable);

				cuentacontabletipoLocal.setCuentaContableDescuento(cuentacontabledescuentoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableDescuento();
				this.cargarCombosFrameCuentaContableDescuentosForeignKey("Formulario");
				this.setActualCuentaContableDescuentoForeignKey(cuentacontabledescuentoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontabledevolucionBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontabledevolucionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontabledevolucionBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontabledevolucionBeanSwingJInternalFrameLocal.actualizarLista(cuentacontabledevolucionBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontabledevolucionsForeignKey);

				cuentacontabledevolucionBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontabledevolucionBeanSwingJInternalFrameLocal.cuentacontable);

				cuentacontabletipoLocal.setCuentaContableDevolucion(cuentacontabledevolucionBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableDevolucion();
				this.cargarCombosFrameCuentaContableDevolucionsForeignKey("Formulario");
				this.setActualCuentaContableDevolucionForeignKey(cuentacontabledevolucionBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecostoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecostoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecostoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecostoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecostosForeignKey);

				cuentacontablecostoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecostoBeanSwingJInternalFrameLocal.cuentacontable);

				cuentacontabletipoLocal.setCuentaContableCosto(cuentacontablecostoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCosto();
				this.cargarCombosFrameCuentaContableCostosForeignKey("Formulario");
				this.setActualCuentaContableCostoForeignKey(cuentacontablecostoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCuentaContableTipoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cuentacontabletipoValidator.getInvalidValues(this.cuentacontabletipo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CuentaContableTipo cuentacontabletipo,List<CuentaContableTipo> cuentacontabletipos) throws Exception {
		try	{		
			CuentaContableTipoConstantesFunciones.actualizarLista(cuentacontabletipo,cuentacontabletipos,this.cuentacontabletipoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CuentaContableTipo cuentacontabletipo,List<CuentaContableTipo> cuentacontabletipos) throws Exception {
		try	{			
			CuentaContableTipoConstantesFunciones.actualizarSelectedLista(cuentacontabletipo,cuentacontabletipos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CuentaContableTipo> cuentacontabletiposLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cuentacontabletiposLocal=this.cuentacontabletipoLogic.getCuentaContableTipos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cuentacontabletiposLocal=this.cuentacontabletipos;
			}
			//ARCHITECTURE
		
			for(CuentaContableTipo cuentacontabletipoLocal:cuentacontabletiposLocal) {
				if(this.permiteMantenimiento(cuentacontabletipoLocal) && cuentacontabletipoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CuentaContableTipoConstantesFunciones.getCuentaContableTipoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CuentaContableTipoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_empresaCuentaContableTipo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaContableTipoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelnombreCuentaContableTipo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaContableTipoConstantesFunciones.DIGITOVERIFICADOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabeldigito_verificadorCuentaContableTipo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaContableTipoConstantesFunciones.IDTIPOCUENTACONTABLETIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_tipo_cuenta_contable_tipoCuentaContableTipo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaContableTipoConstantesFunciones.IDTIPOPRODUCTOSERVICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_tipo_producto_servicioCuentaContableTipo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaContableTipoConstantesFunciones.IDCUENTACONTABLEVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_cuenta_contable_ventaCuentaContableTipo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaContableTipoConstantesFunciones.IDCUENTACONTABLEDESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_cuenta_contable_descuentoCuentaContableTipo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaContableTipoConstantesFunciones.IDCUENTACONTABLEDEVOLUCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_cuenta_contable_devolucionCuentaContableTipo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaContableTipoConstantesFunciones.IDCUENTACONTABLECOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_cuenta_contable_costoCuentaContableTipo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_empresaCuentaContableTipo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelnombreCuentaContableTipo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContableTipo.jLabeldigito_verificadorCuentaContableTipo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_tipo_cuenta_contable_tipoCuentaContableTipo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_tipo_producto_servicioCuentaContableTipo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_cuenta_contable_ventaCuentaContableTipo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_cuenta_contable_descuentoCuentaContableTipo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_cuenta_contable_devolucionCuentaContableTipo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelid_cuenta_contable_costoCuentaContableTipo,"");
		
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
		this.iIdNuevoCuentaContableTipo--;	
		
		
		this.cuentacontabletipoAux=new CuentaContableTipo();
		
		this.cuentacontabletipoAux.setId(this.iIdNuevoCuentaContableTipo);
		this.cuentacontabletipoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentacontabletipoLogic.getCuentaContableTipos().add(this.cuentacontabletipoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cuentacontabletipos.add(this.cuentacontabletipoAux);
		}
		//ARCHITECTURE
		
		this.cuentacontabletipo=this.cuentacontabletipoAux;
		
		if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCuentaContableTipo(this.cuentacontabletipo);
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaContableTipo(this.cuentacontabletipo);
		}
				
		//this.setDefaultControlesCuentaContableTipo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCuentaContableTipo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCuentaContableTipo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaContableTipo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaContableTipo(this.cuentacontabletipoBean,this.cuentacontabletipo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CuentaContableTipoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
			classes=CuentaContableTipoConstantesFunciones.getClassesRelationshipsOfCuentaContableTipo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cuentacontabletipoReturnGeneral=cuentacontabletipoLogic.procesarEventosCuentaContableTiposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacontabletipoLogic.getCuentaContableTipos(),this.cuentacontabletipo,this.cuentacontabletipoParameterGeneral,this.isEsNuevoCuentaContableTipo,classes);//this.cuentacontabletipoLogic.getCuentaContableTipo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCuentaContableTipo(this.cuentacontabletipoReturnGeneral,this.cuentacontabletipoBean,false);
		
		if(this.cuentacontabletipoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaContableTipo(this.cuentacontabletipoReturnGeneral.getCuentaContableTipo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCuentaContableTipo(this.cuentacontabletipoReturnGeneral.getCuentaContableTipo());
		}
		
		if(this.cuentacontabletipoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCuentaContableTipo(this.cuentacontabletipoReturnGeneral.getCuentaContableTipo(),classes);//this.cuentacontabletipoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCuentaContableTipo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCuentaContableTipo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.RecargarFormCuentaContableTipo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCuentaContableTipo(false);
						
			if(cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaContableTipo();
			}
			
			this.actualizarVisualTableDatosCuentaContableTipo();
			
			this.jTableDatosCuentaContableTipo.setRowSelectionInterval(this.getIndiceNuevoCuentaContableTipo(), this.getIndiceNuevoCuentaContableTipo());
			
			this.seleccionarFilaTablaCuentaContableTipoActual();
						
			this.actualizarEstadoCeldasBotonesCuentaContableTipo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCuentaContableTipo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jTextAreanombreCuentaContableTipo.setEnabled(isHabilitar && this.cuentacontabletipoConstantesFunciones.activarnombreCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jTextFielddigito_verificadorCuentaContableTipo.setEnabled(isHabilitar && this.cuentacontabletipoConstantesFunciones.activardigito_verificadorCuentaContableTipo);	
		//
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.setEnabled(isHabilitar && this.cuentacontabletipoConstantesFunciones.activarid_empresaCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setEnabled(isHabilitar && this.cuentacontabletipoConstantesFunciones.activarid_tipo_cuenta_contable_tipoCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.setEnabled(isHabilitar && this.cuentacontabletipoConstantesFunciones.activarid_tipo_producto_servicioCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setEnabled(isHabilitar && this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_ventaCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setEnabled(isHabilitar && this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_descuentoCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setEnabled(isHabilitar && this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_devolucionCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.setEnabled(isHabilitar && this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_costoCuentaContableTipo);
	};
	
	public void setDefaultControlesCuentaContableTipo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCuentaContableTipo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cuentacontabletipoSessionBean.setConGuardarRelaciones(true);			
			this.cuentacontabletipoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCuentaContableTipo.jTabbedPaneRelacionesCuentaContableTipo.setVisible(true);
			
					
		} else {
			//this.cuentacontabletipoSessionBean.setConGuardarRelaciones(false);			
			this.cuentacontabletipoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCuentaContableTipo.jTabbedPaneRelacionesCuentaContableTipo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCuentaContableTipo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipoLogic.getCuentaContableTipos()) {
				if(cuentacontabletipoAux.getId().equals(this.iIdNuevoCuentaContableTipo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipos) {
				if(cuentacontabletipoAux.getId().equals(this.iIdNuevoCuentaContableTipo)) {
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
	
	public int getIndiceActualCuentaContableTipo(CuentaContableTipo cuentacontabletipo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipoLogic.getCuentaContableTipos()) {
				if(cuentacontabletipoAux.getId().equals(cuentacontabletipo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipos) {
				if(cuentacontabletipoAux.getId().equals(cuentacontabletipo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCuentaContableTipo(CuentaContableTipo cuentacontabletipoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipoLogic.getCuentaContableTipos()) {
				if(cuentacontabletipoAux.getCuentaContableTipoOriginal().getId().equals(cuentacontabletipoOriginal.getId())) {
					existe=true;
					cuentacontabletipoOriginal.setId(cuentacontabletipoAux.getId());
					cuentacontabletipoOriginal.setVersionRow(cuentacontabletipoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipos) {
				if(cuentacontabletipoAux.getCuentaContableTipoOriginal().getId().equals(cuentacontabletipoOriginal.getId())) {
					existe=true;
					cuentacontabletipoOriginal.setId(cuentacontabletipoAux.getId());
					cuentacontabletipoOriginal.setVersionRow(cuentacontabletipoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCuentaContableTipo(Boolean esParaCancelar) throws Exception {
		cuentacontabletiposAux=new ArrayList<CuentaContableTipo>();
		cuentacontabletipoAux=new CuentaContableTipo();
		
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipoLogic.getCuentaContableTipos()) {
					if(cuentacontabletipoAux.getId()<0) {
						cuentacontabletiposAux.add(cuentacontabletipoAux);
					}		
				}
				this.iIdNuevoCuentaContableTipo=0L;
				this.cuentacontabletipoLogic.getCuentaContableTipos().removeAll(cuentacontabletiposAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipos) {
					if(cuentacontabletipoAux.getId()<0) {
						cuentacontabletiposAux.add(cuentacontabletipoAux);
					}		
				}
				this.iIdNuevoCuentaContableTipo=0L;
				this.cuentacontabletipos.removeAll(cuentacontabletiposAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCuentaContableTipo 
					&& this.cuentacontabletipoLogic.getCuentaContableTipos().size()>0
					) {
					cuentacontabletipoAux=this.cuentacontabletipoLogic.getCuentaContableTipos().get(this.cuentacontabletipoLogic.getCuentaContableTipos().size() - 1);
				
					if(cuentacontabletipoAux.getId()<0) {
						this.cuentacontabletipoLogic.getCuentaContableTipos().remove(cuentacontabletipoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCuentaContableTipo && this.cuentacontabletipos.size()>0) {
					cuentacontabletipoAux=this.cuentacontabletipos.get(this.cuentacontabletipos.size() - 1);
				
					if(cuentacontabletipoAux.getId()<0) {
						this.cuentacontabletipos.remove(cuentacontabletipoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCuentaContableTipo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cuentacontabletipo.getId()<0) {
				this.cuentacontabletipoLogic.getCuentaContableTipos().remove(this.cuentacontabletipo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cuentacontabletipo.getId()<0) {
				this.cuentacontabletipos.remove(this.cuentacontabletipo);
			}
		}			
	}
	
	public void setEstadosInicialesCuentaContableTipo(List<CuentaContableTipo> cuentacontabletiposAux) throws Exception {
		CuentaContableTipoConstantesFunciones.setEstadosInicialesCuentaContableTipo(cuentacontabletiposAux);
	}
	
	public void setEstadosInicialesCuentaContableTipo(CuentaContableTipo cuentacontabletipoAux) throws Exception {
		CuentaContableTipoConstantesFunciones.setEstadosInicialesCuentaContableTipo(cuentacontabletipoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCuentaContableTipoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCuentaContableTipoActual()) {
				if(!this.isEsNuevoCuentaContableTipo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCuentaContableTipo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCuentaContableTipoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cuenta Contable Tipo ?", "MANTENIMIENTO DE Cuenta Contable Tipo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CuentaContableTipo cuentacontabletipo) throws Exception {
		CuentaContableTipoConstantesFunciones.seleccionarAsignar(this.cuentacontabletipo,cuentacontabletipo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCuentaContableTipo=this.isPermisoActualizarOriginalCuentaContableTipo;
			
			
			this.seleccionarAsignar(cuentacontabletipo);
			
			

			idCuentaContableVentaActual=cuentacontabletipo.getid_cuenta_contable_venta();
			this.seleccionarCuentaContableVentaActual();

			idCuentaContableDescuentoActual=cuentacontabletipo.getid_cuenta_contable_descuento();
			this.seleccionarCuentaContableDescuentoActual();

			idCuentaContableDevolucionActual=cuentacontabletipo.getid_cuenta_contable_devolucion();
			this.seleccionarCuentaContableDevolucionActual();

			idCuentaContableCostoActual=cuentacontabletipo.getid_cuenta_contable_costo();
			this.seleccionarCuentaContableCostoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaContableTipoConstantesFunciones.quitarEspaciosCuentaContableTipo(this.cuentacontabletipo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCuentaContableTipo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cuentacontabletipoSessionBean.setsFuncionBusquedaRapida(this.cuentacontabletipoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableVentaActual() throws Exception {
		try	{
			CuentaContable cuentacontableventaAux=new CuentaContable();

			if(this.idCuentaContableVentaActual != null && this.idCuentaContableVentaActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableventaLogic.getEntityWithConnection(this.idCuentaContableVentaActual);
					cuentacontableventaAux= cuentacontableventaLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontableventasForeignKey=new ArrayList<CuentaContable>();
				cuentacontableventasForeignKey.add(cuentacontableventaAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCuentaContableDescuentoActual() throws Exception {
		try	{
			CuentaContable cuentacontabledescuentoAux=new CuentaContable();

			if(this.idCuentaContableDescuentoActual != null && this.idCuentaContableDescuentoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabledescuentoLogic.getEntityWithConnection(this.idCuentaContableDescuentoActual);
					cuentacontabledescuentoAux= cuentacontabledescuentoLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontabledescuentosForeignKey=new ArrayList<CuentaContable>();
				cuentacontabledescuentosForeignKey.add(cuentacontabledescuentoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCuentaContableDevolucionActual() throws Exception {
		try	{
			CuentaContable cuentacontabledevolucionAux=new CuentaContable();

			if(this.idCuentaContableDevolucionActual != null && this.idCuentaContableDevolucionActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabledevolucionLogic.getEntityWithConnection(this.idCuentaContableDevolucionActual);
					cuentacontabledevolucionAux= cuentacontabledevolucionLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontabledevolucionsForeignKey=new ArrayList<CuentaContable>();
				cuentacontabledevolucionsForeignKey.add(cuentacontabledevolucionAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCuentaContableCostoActual() throws Exception {
		try	{
			CuentaContable cuentacontablecostoAux=new CuentaContable();

			if(this.idCuentaContableCostoActual != null && this.idCuentaContableCostoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontablecostoLogic.getEntityWithConnection(this.idCuentaContableCostoActual);
					cuentacontablecostoAux= cuentacontablecostoLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablecostosForeignKey=new ArrayList<CuentaContable>();
				cuentacontablecostosForeignKey.add(cuentacontablecostoAux);
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
			if(this.isEsNuevoCuentaContableTipo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCuentaContableTipo(esParaCancelar);				
				this.cancelarNuevoCuentaContableTipo(esParaCancelar);								
			}
			
			this.cuentacontabletipo=new CuentaContableTipo();
			
			this.inicializarCuentaContableTipo();
			
			this.actualizarEstadoCeldasBotonesCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCuentaContableTipo() throws Exception {
		try {
			CuentaContableTipoConstantesFunciones.inicializarCuentaContableTipo(this.cuentacontabletipo);
			
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
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cuentacontabletipoLogic.getCuentaContableTipos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCuentaContableTipos(String sAccionBusqueda,List<CuentaContableTipo> cuentacontabletiposParaReportes) throws Exception {
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
					sPathReporteFinal="CuentaContableTipo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CuentaContableTipoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CuentaContableTipoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CuentaContableTipo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cuenta Contable Tipos");		
		parameters.put("busquedapor", CuentaContableTipoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCuentaContableTipo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CuentaContableTipoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CuentaContableTipoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCuentaContableTipo=new JRBeanArrayDataSource(CuentaContableTipoJInternalFrame.TraerCuentaContableTipoBeans(cuentacontabletiposParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCuentaContableTipo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CuentaContableTipoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CuentaContableTipoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CuentaContableTipoBean.TraerCuentaContableTipoBeans(cuentacontabletiposParaReportes).toArray()));
							
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
				this.generarExcelReporteCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,cuentacontabletiposParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,cuentacontabletiposParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCuentaContableTipoActionPerformed(null);
					//this.generarExcelReporteCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,cuentacontabletiposParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,cuentacontabletiposParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,cuentacontabletiposParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCuentaContableTipos(sAccionBusqueda,sTipoArchivoReporte,cuentacontabletiposParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCuentaContableTipos(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaContableTipo> cuentacontabletiposParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontabletipo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaContableTipos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaContableTipo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CuentaContableTipo cuentacontabletipo : cuentacontabletiposParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CuentaContableTipoConstantesFunciones.generarExcelReporteDataCuentaContableTipo("NORMAL",row,workbook,cuentacontabletipo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCuentaContableTipo(String sTipo,Row row,Workbook workbook) {
		
		CuentaContableTipoConstantesFunciones.generarExcelReporteHeaderCuentaContableTipo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCuentaContableTipos(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaContableTipo> cuentacontabletiposParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontabletipo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaContableTipos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CuentaContableTipo cuentacontabletipo : cuentacontabletiposParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CuentaContableTipoConstantesFunciones.getCuentaContableTipoDescripcion(cuentacontabletipo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontabletipo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContableTipoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontabletipo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontabletipo.getdigito_verificador());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontabletipo.gettipocuentacontabletipo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontabletipo.gettipoproductoservicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontabletipo.getcuentacontableventa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontabletipo.getcuentacontabledescuento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontabletipo.getcuentacontabledevolucion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacontabletipo.getcuentacontablecosto_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCuentaContableTipos(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaContableTipo> cuentacontabletiposParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CuentaContableTipo> cuentacontabletiposRespaldo=null;
		
		classes=CuentaContableTipoConstantesFunciones.getClassesRelationshipsOfCuentaContableTipo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cuentacontabletipoLogic.setDatosCliente(this.datosCliente);
		this.cuentacontabletipoLogic.setDatosDeep(this.datosDeep);
		this.cuentacontabletipoLogic.setIsConDeep(true);
		
		cuentacontabletiposRespaldo=this.cuentacontabletipoLogic.getCuentaContableTipos();
		
		this.cuentacontabletipoLogic.setCuentaContableTipos(cuentacontabletiposParaReportes);	
		this.cuentacontabletipoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cuentacontabletiposParaReportes=this.cuentacontabletipoLogic.getCuentaContableTipos();
		this.cuentacontabletipoLogic.setCuentaContableTipos(cuentacontabletiposRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontabletipo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaContableTipos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaContableTipo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CuentaContableTipo cuentacontabletipo : cuentacontabletiposParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCuentaContableTipo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CuentaContableTipoConstantesFunciones.generarExcelReporteDataCuentaContableTipo("NORMAL",row,workbook,cuentacontabletipo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CuentaContableTipoConstantesFunciones.getCuentaContableTipoDescripcion(cuentacontabletipo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCuentaContableTipo() throws Exception {		
		this.startProcessCuentaContableTipo(true);
	}
	
	public void startProcessCuentaContableTipo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCuentaContableTipo ,this.jPanelParametrosReportesCuentaContableTipo, this.jScrollPanelDatosCuentaContableTipo,this.jPanelPaginacionCuentaContableTipo, this.jScrollPanelDatosEdicionCuentaContableTipo, this.jPanelAccionesCuentaContableTipo,this.jPanelAccionesFormularioCuentaContableTipo,this.jmenuBarCuentaContableTipo,this.jmenuBarDetalleCuentaContableTipo,this.jTtoolBarCuentaContableTipo,this.jTtoolBarDetalleCuentaContableTipo);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaContableTipo=this.jTabbedPaneBusquedasCuentaContableTipo; 
		
		final JPanel jPanelParametrosReportesCuentaContableTipo=this.jPanelParametrosReportesCuentaContableTipo;
		//final JScrollPane jScrollPanelDatosCuentaContableTipo=this.jScrollPanelDatosCuentaContableTipo;
		final JTable jTableDatosCuentaContableTipo=this.jTableDatosCuentaContableTipo;		
		final JPanel jPanelPaginacionCuentaContableTipo=this.jPanelPaginacionCuentaContableTipo;
		//final JScrollPane jScrollPanelDatosEdicionCuentaContableTipo=this.jScrollPanelDatosEdicionCuentaContableTipo;
		final JPanel jPanelAccionesCuentaContableTipo=this.jPanelAccionesCuentaContableTipo;
		
		JPanel jPanelCamposAuxiliarCuentaContableTipo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCuentaContableTipo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			jPanelCamposAuxiliarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jPanelCamposCuentaContableTipo;
			jPanelAccionesFormularioAuxiliarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jPanelAccionesFormularioCuentaContableTipo;
		}
		
		final JPanel jPanelCamposCuentaContableTipo=jPanelCamposAuxiliarCuentaContableTipo;
		final JPanel jPanelAccionesFormularioCuentaContableTipo=jPanelAccionesFormularioAuxiliarCuentaContableTipo;
		
		
		final JMenuBar jmenuBarCuentaContableTipo=this.jmenuBarCuentaContableTipo;
		final JToolBar jTtoolBarCuentaContableTipo=this.jTtoolBarCuentaContableTipo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCuentaContableTipo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaContableTipo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			jmenuBarDetalleAuxiliarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jmenuBarDetalleCuentaContableTipo;
			jTtoolBarDetalleAuxiliarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jTtoolBarDetalleCuentaContableTipo;
		}
		
		final JMenuBar jmenuBarDetalleCuentaContableTipo=jmenuBarDetalleAuxiliarCuentaContableTipo;
		final JToolBar jTtoolBarDetalleCuentaContableTipo=jTtoolBarDetalleAuxiliarCuentaContableTipo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaContableTipo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaContableTipo;
			processRunnable.jTableDatos=jTableDatosCuentaContableTipo;
			processRunnable.jPanelCampos=jPanelCamposCuentaContableTipo;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaContableTipo;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaContableTipo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaContableTipo;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaContableTipo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaContableTipo;
			processRunnable.jTtoolBar=jTtoolBarCuentaContableTipo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaContableTipo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaContableTipo ,jPanelParametrosReportesCuentaContableTipo,jTableDatosCuentaContableTipo, /*jScrollPanelDatosCuentaContableTipo,*/jPanelCamposCuentaContableTipo,jPanelPaginacionCuentaContableTipo, /*jScrollPanelDatosEdicionCuentaContableTipo,*/ jPanelAccionesCuentaContableTipo,jPanelAccionesFormularioCuentaContableTipo,jmenuBarCuentaContableTipo,jmenuBarDetalleCuentaContableTipo,jTtoolBarCuentaContableTipo,jTtoolBarDetalleCuentaContableTipo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaContableTipo ,jPanelParametrosReportesCuentaContableTipo, jScrollPanelDatosCuentaContableTipo,jPanelPaginacionCuentaContableTipo, jScrollPanelDatosEdicionCuentaContableTipo, jPanelAccionesCuentaContableTipo,jPanelAccionesFormularioCuentaContableTipo,jmenuBarCuentaContableTipo,jmenuBarDetalleCuentaContableTipo,jTtoolBarCuentaContableTipo,jTtoolBarDetalleCuentaContableTipo);
						
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
	
	public void finishProcessCuentaContableTipo() {// throws Exception 
		this.finishProcessCuentaContableTipo(true);
	}
	
	public void finishProcessCuentaContableTipo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCuentaContableTipo ,this.jPanelParametrosReportesCuentaContableTipo, this.jScrollPanelDatosCuentaContableTipo,this.jPanelPaginacionCuentaContableTipo, this.jScrollPanelDatosEdicionCuentaContableTipo, this.jPanelAccionesCuentaContableTipo,this.jPanelAccionesFormularioCuentaContableTipo,this.jmenuBarCuentaContableTipo,this.jmenuBarDetalleCuentaContableTipo,this.jTtoolBarCuentaContableTipo,this.jTtoolBarDetalleCuentaContableTipo);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaContableTipo=this.jTabbedPaneBusquedasCuentaContableTipo; 
		
		final JPanel jPanelParametrosReportesCuentaContableTipo=this.jPanelParametrosReportesCuentaContableTipo;
		//final JScrollPane jScrollPanelDatosCuentaContableTipo=this.jScrollPanelDatosCuentaContableTipo;
		final JTable jTableDatosCuentaContableTipo=this.jTableDatosCuentaContableTipo;		
		final JPanel jPanelPaginacionCuentaContableTipo=this.jPanelPaginacionCuentaContableTipo;
		//final JScrollPane jScrollPanelDatosEdicionCuentaContableTipo=this.jScrollPanelDatosEdicionCuentaContableTipo;
		final JPanel jPanelAccionesCuentaContableTipo=this.jPanelAccionesCuentaContableTipo;
		
		JPanel jPanelCamposAuxiliarCuentaContableTipo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCuentaContableTipo=new JPanel();
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			jPanelCamposAuxiliarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jPanelCamposCuentaContableTipo;
			jPanelAccionesFormularioAuxiliarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jPanelAccionesFormularioCuentaContableTipo;
		}
		
		final JPanel jPanelCamposCuentaContableTipo=jPanelCamposAuxiliarCuentaContableTipo;
		final JPanel jPanelAccionesFormularioCuentaContableTipo=jPanelAccionesFormularioAuxiliarCuentaContableTipo;
		
		
		final JMenuBar jmenuBarCuentaContableTipo=this.jmenuBarCuentaContableTipo;		
		final JToolBar jTtoolBarCuentaContableTipo=this.jTtoolBarCuentaContableTipo;
				
		JMenuBar jmenuBarDetalleAuxiliarCuentaContableTipo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaContableTipo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			jmenuBarDetalleAuxiliarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jmenuBarDetalleCuentaContableTipo;
			jTtoolBarDetalleAuxiliarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jTtoolBarDetalleCuentaContableTipo;		
		}
		
		final JMenuBar jmenuBarDetalleCuentaContableTipo=jmenuBarDetalleAuxiliarCuentaContableTipo;
		final JToolBar jTtoolBarDetalleCuentaContableTipo=jTtoolBarDetalleAuxiliarCuentaContableTipo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaContableTipo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaContableTipo;
			processRunnable.jTableDatos=jTableDatosCuentaContableTipo;
			processRunnable.jPanelCampos=jPanelCamposCuentaContableTipo;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaContableTipo;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaContableTipo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaContableTipo;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaContableTipo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaContableTipo;
			processRunnable.jTtoolBar=jTtoolBarCuentaContableTipo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaContableTipo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCuentaContableTipo ,jPanelParametrosReportesCuentaContableTipo, jTableDatosCuentaContableTipo,/*jScrollPanelDatosCuentaContableTipo,*/jPanelCamposCuentaContableTipo,jPanelPaginacionCuentaContableTipo, /*jScrollPanelDatosEdicionCuentaContableTipo,*/ jPanelAccionesCuentaContableTipo,jPanelAccionesFormularioCuentaContableTipo,jmenuBarCuentaContableTipo,jmenuBarDetalleCuentaContableTipo,jTtoolBarCuentaContableTipo,jTtoolBarDetalleCuentaContableTipo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCuentaContableTipo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCuentaContableTipo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCuentaContableTipo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCuentaContableTipo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCuentaContableTipo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCuentaContableTipo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCuentaContableTipo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCuentaContableTipo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCuentaContableTipo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cuentacontabletipoConstantesFunciones.getsFinalQueryCuentaContableTipo();
		String  finalQueryPaginacionTodos=this.cuentacontabletipoConstantesFunciones.getsFinalQueryCuentaContableTipo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CuentaContableTipoConstantesFunciones.getArrayColumnasGlobalesNoCuentaContableTipo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CuentaContableTipoConstantesFunciones.getArrayColumnasGlobalesCuentaContableTipo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CuentaContableTipoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cuentacontabletiposEliminados= new ArrayList<CuentaContableTipo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCuentaContableTipo();
		
				///*CuentaContableTipoSessionBean*/this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			
			if(this.cuentacontabletipoSessionBean==null) {
				this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
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
					this.iNumeroPaginacion=CuentaContableTipoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CuentaContableTipoConstantesFunciones.getClassesForeignKeysOfCuentaContableTipo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cuentacontabletipo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cuentacontabletiposAux= new ArrayList<CuentaContableTipo>();
			
				
			cuentacontabletipoLogic.setDatosCliente(this.datosCliente);
			cuentacontabletipoLogic.setDatosDeep(this.datosDeep);
			cuentacontabletipoLogic.setIsConDeep(true);
			
			
			cuentacontabletipoLogic.getCuentaContableTipoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cuentacontabletipoLogic.getTodosCuentaContableTipos(finalQueryGlobal,pagination);
					
					//cuentacontabletipoLogic.getTodosCuentaContableTiposWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cuentacontabletipoLogic.getCuentaContableTipos()==null|| cuentacontabletipoLogic.getCuentaContableTipos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacontabletiposAux= new ArrayList<CuentaContableTipo>();
							cuentacontabletiposAux.addAll(cuentacontabletipoLogic.getCuentaContableTipos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontabletiposAux= new ArrayList<CuentaContableTipo>();
							cuentacontabletiposAux.addAll(cuentacontabletipos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacontabletipoLogic.getTodosCuentaContableTipos(finalQueryGlobal+"",this.pagination);												
							
							//cuentacontabletipoLogic.getTodosCuentaContableTiposWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCuentaContableTipos("Todos",cuentacontabletipoLogic.getCuentaContableTipos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacontabletipoLogic.setCuentaContableTipos(new ArrayList<CuentaContableTipo>());					
							cuentacontabletipoLogic.getCuentaContableTipos().addAll(cuentacontabletiposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontabletipos=new ArrayList<CuentaContableTipo>();
							cuentacontabletipos.addAll(cuentacontabletiposAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCuentaContableTipo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCuentaContableTipo=this.idActual;
				
				} else if(this.idCuentaContableTipoActual!=null && this.idCuentaContableTipoActual!=0L) {
					idCuentaContableTipo=idCuentaContableTipoActual;
				}
				
					
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndicePorId(idCuentaContableTipo);
				
				this.cuentacontabletipos=new ArrayList<CuentaContableTipo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cuentacontabletipoLogic.getEntity(idCuentaContableTipo);
					
					//cuentacontabletipoLogic.getEntityWithConnection(idCuentaContableTipo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabletipoLogic.setCuentaContableTipos(new ArrayList<CuentaContableTipo>());
					cuentacontabletipoLogic.getCuentaContableTipos().add(cuentacontabletipoLogic.getCuentaContableTipo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontabletipos=new ArrayList<CuentaContableTipo>();
					this.cuentacontabletipos.add(cuentacontabletipo);
				}
				
				if(cuentacontabletipoLogic.getCuentaContableTipo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentacontabletipoLogic.getCuentaContableTiposBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentacontabletipoLogic.getCuentaContableTipos()==null||cuentacontabletipoLogic.getCuentaContableTipos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentacontabletipos==null|| cuentacontabletipos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletiposAux=new ArrayList<CuentaContableTipo>();
						cuentacontabletiposAux.addAll(cuentacontabletipoLogic.getCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontabletiposAux=new ArrayList<CuentaContableTipo>();
							cuentacontabletiposAux.addAll(cuentacontabletipos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentacontabletipoLogic.getCuentaContableTiposBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaContableTipos("BusquedaPorNombre",cuentacontabletipoLogic.getCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaContableTipos("BusquedaPorNombre",cuentacontabletipos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletipoLogic.setCuentaContableTipos(new ArrayList<CuentaContableTipo>());
						cuentacontabletipoLogic.getCuentaContableTipos().addAll(cuentacontabletiposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontabletipos=new ArrayList<CuentaContableTipo>();
							cuentacontabletipos.addAll(cuentacontabletiposAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentacontabletipoLogic.getCuentaContableTiposFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentacontabletipoLogic.getCuentaContableTipos()==null||cuentacontabletipoLogic.getCuentaContableTipos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentacontabletipos==null|| cuentacontabletipos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletiposAux=new ArrayList<CuentaContableTipo>();
						cuentacontabletiposAux.addAll(cuentacontabletipoLogic.getCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontabletiposAux=new ArrayList<CuentaContableTipo>();
							cuentacontabletiposAux.addAll(cuentacontabletipos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentacontabletipoLogic.getCuentaContableTiposFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaContableTipos("FK_IdEmpresa",cuentacontabletipoLogic.getCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaContableTipos("FK_IdEmpresa",cuentacontabletipos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletipoLogic.setCuentaContableTipos(new ArrayList<CuentaContableTipo>());
						cuentacontabletipoLogic.getCuentaContableTipos().addAll(cuentacontabletiposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontabletipos=new ArrayList<CuentaContableTipo>();
							cuentacontabletipos.addAll(cuentacontabletiposAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCuentaContableTipo")) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaContableTipo(id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentacontabletipoLogic.getCuentaContableTiposFK_IdTipoCuentaContableTipo(finalQueryGlobal,pagination,id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaContableTipo(id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaContableTipo(id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentacontabletipoLogic.getCuentaContableTipos()==null||cuentacontabletipoLogic.getCuentaContableTipos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentacontabletipos==null|| cuentacontabletipos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletiposAux=new ArrayList<CuentaContableTipo>();
						cuentacontabletiposAux.addAll(cuentacontabletipoLogic.getCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontabletiposAux=new ArrayList<CuentaContableTipo>();
							cuentacontabletiposAux.addAll(cuentacontabletipos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentacontabletipoLogic.getCuentaContableTiposFK_IdTipoCuentaContableTipo(finalQueryGlobal,pagination,id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaContableTipo(id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaContableTipo(id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaContableTipos("FK_IdTipoCuentaContableTipo",cuentacontabletipoLogic.getCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaContableTipos("FK_IdTipoCuentaContableTipo",cuentacontabletipos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletipoLogic.setCuentaContableTipos(new ArrayList<CuentaContableTipo>());
						cuentacontabletipoLogic.getCuentaContableTipos().addAll(cuentacontabletiposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontabletipos=new ArrayList<CuentaContableTipo>();
							cuentacontabletipos.addAll(cuentacontabletiposAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProductoServicio")) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdTipoProductoServicio(id_tipo_producto_servicioFK_IdTipoProductoServicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentacontabletipoLogic.getCuentaContableTiposFK_IdTipoProductoServicio(finalQueryGlobal,pagination,id_tipo_producto_servicioFK_IdTipoProductoServicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdTipoProductoServicio(id_tipo_producto_servicioFK_IdTipoProductoServicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdTipoProductoServicio(id_tipo_producto_servicioFK_IdTipoProductoServicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentacontabletipoLogic.getCuentaContableTipos()==null||cuentacontabletipoLogic.getCuentaContableTipos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentacontabletipos==null|| cuentacontabletipos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletiposAux=new ArrayList<CuentaContableTipo>();
						cuentacontabletiposAux.addAll(cuentacontabletipoLogic.getCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontabletiposAux=new ArrayList<CuentaContableTipo>();
							cuentacontabletiposAux.addAll(cuentacontabletipos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentacontabletipoLogic.getCuentaContableTiposFK_IdTipoProductoServicio(finalQueryGlobal,pagination,id_tipo_producto_servicioFK_IdTipoProductoServicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdTipoProductoServicio(id_tipo_producto_servicioFK_IdTipoProductoServicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaContableTipoConstantesFunciones.getDetalleIndiceFK_IdTipoProductoServicio(id_tipo_producto_servicioFK_IdTipoProductoServicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaContableTipos("FK_IdTipoProductoServicio",cuentacontabletipoLogic.getCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaContableTipos("FK_IdTipoProductoServicio",cuentacontabletipos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletipoLogic.setCuentaContableTipos(new ArrayList<CuentaContableTipo>());
						cuentacontabletipoLogic.getCuentaContableTipos().addAll(cuentacontabletiposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontabletipos=new ArrayList<CuentaContableTipo>();
							cuentacontabletipos.addAll(cuentacontabletiposAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCuentaContableTipo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCuentaContableTipo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentacontabletipoLogic.getCuentaContableTipos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacontabletipos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentacontabletipoLogic.getCuentaContableTipos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacontabletipos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CuentaContableTipo cuentacontabletipo) {
		Boolean permite=true;
		
		if(this.cuentacontabletipo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CuentaContableTipoConstantesFunciones.getOrderByListaCuentaContableTipo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CuentaContableTipoConstantesFunciones.getOrderByListaCuentaContableTipo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContableTipo cuentacontabletipo:cuentacontabletipoLogic.getCuentaContableTipos()) {
				if(cuentacontabletipo.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontabletipoTotales=cuentacontabletipo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContableTipo cuentacontabletipo:this.cuentacontabletipos) {
				if(cuentacontabletipo.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontabletipoTotales=cuentacontabletipo;
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
			this.cuentacontabletipoAux=new CuentaContableTipo();
			this.cuentacontabletipoAux.setsType(Constantes2.S_TOTALES);
			this.cuentacontabletipoAux.setIsNew(false);
			this.cuentacontabletipoAux.setIsChanged(false);
			this.cuentacontabletipoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CuentaContableTipoConstantesFunciones.TotalizarValoresFilaCuentaContableTipo(this.cuentacontabletipoLogic.getCuentaContableTipos(),this.cuentacontabletipoAux);
				
				this.cuentacontabletipoLogic.getCuentaContableTipos().add(this.cuentacontabletipoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CuentaContableTipoConstantesFunciones.TotalizarValoresFilaCuentaContableTipo(this.cuentacontabletipos,this.cuentacontabletipoAux);
				
				this.cuentacontabletipos.add(this.cuentacontabletipoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cuentacontabletipoTotales=new CuentaContableTipo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentacontabletipoLogic.getCuentaContableTipos().remove(cuentacontabletipoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentacontabletipos.remove(cuentacontabletipoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cuentacontabletipoTotales=new CuentaContableTipo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaContableTipo cuentacontabletipo:cuentacontabletipoLogic.getCuentaContableTipos()) {
				if(cuentacontabletipo.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontabletipoTotales=cuentacontabletipo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaContableTipoConstantesFunciones.TotalizarValoresFilaCuentaContableTipo(this.cuentacontabletipoLogic.getCuentaContableTipos(),cuentacontabletipoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaContableTipo cuentacontabletipo:this.cuentacontabletipos) {
				if(cuentacontabletipo.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacontabletipoTotales=cuentacontabletipo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaContableTipoConstantesFunciones.TotalizarValoresFilaCuentaContableTipo(this.cuentacontabletipos,cuentacontabletipoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCuentaContableTiposBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaContableTiposFK_IdCuentaContableCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaContableTiposFK_IdCuentaContableDescuento()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableDescuento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaContableTiposFK_IdCuentaContableDevolucion()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableDevolucion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaContableTiposFK_IdCuentaContableVenta()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableVenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaContableTiposFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaContableTiposFK_IdTipoCuentaContableTipo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCuentaContableTipo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaContableTiposFK_IdTipoProductoServicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProductoServicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaContableTipoPorIdEmpresaPorIdTipoCuentaPorIdTipoProdu()throws Exception {
		try {
			sAccionBusqueda="PorIdEmpresaPorIdTipoCuentaPorIdTipoProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getCuentaContableTiposBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabletipoLogic.getCuentaContableTiposBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaContableTiposFK_IdCuentaContableCosto(String sFinalQuery,Long id_cuenta_contable_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabletipoLogic.getCuentaContableTiposFK_IdCuentaContableCosto(sFinalQuery,this.pagination,id_cuenta_contable_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaContableTiposFK_IdCuentaContableDescuento(String sFinalQuery,Long id_cuenta_contable_descuento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabletipoLogic.getCuentaContableTiposFK_IdCuentaContableDescuento(sFinalQuery,this.pagination,id_cuenta_contable_descuento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaContableTiposFK_IdCuentaContableDevolucion(String sFinalQuery,Long id_cuenta_contable_devolucion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabletipoLogic.getCuentaContableTiposFK_IdCuentaContableDevolucion(sFinalQuery,this.pagination,id_cuenta_contable_devolucion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaContableTiposFK_IdCuentaContableVenta(String sFinalQuery,Long id_cuenta_contable_venta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabletipoLogic.getCuentaContableTiposFK_IdCuentaContableVenta(sFinalQuery,this.pagination,id_cuenta_contable_venta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaContableTiposFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabletipoLogic.getCuentaContableTiposFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaContableTiposFK_IdTipoCuentaContableTipo(String sFinalQuery,Long id_tipo_cuenta_contable_tipo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabletipoLogic.getCuentaContableTiposFK_IdTipoCuentaContableTipo(sFinalQuery,this.pagination,id_tipo_cuenta_contable_tipo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaContableTiposFK_IdTipoProductoServicio(String sFinalQuery,Long id_tipo_producto_servicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabletipoLogic.getCuentaContableTiposFK_IdTipoProductoServicio(sFinalQuery,this.pagination,id_tipo_producto_servicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaContableTipoPorIdEmpresaPorIdTipoCuentaPorIdTipoProdu(Long id_empresa,Long id_tipo_cuenta_contable_tipo,Long id_tipo_producto_servicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabletipoLogic.getCuentaContableTipoPorIdEmpresaPorIdTipoCuentaPorIdTipoProdu(id_empresa,id_tipo_cuenta_contable_tipo,id_tipo_producto_servicio);
				
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
	
	public void inicializarPermisosCuentaContableTipo() {
		this.isPermisoTodoCuentaContableTipo=false;
		this.isPermisoNuevoCuentaContableTipo=false;
		this.isPermisoActualizarCuentaContableTipo=false;
		this.isPermisoActualizarOriginalCuentaContableTipo=false;
		this.isPermisoEliminarCuentaContableTipo=false;
		this.isPermisoGuardarCambiosCuentaContableTipo=false;
		this.isPermisoConsultaCuentaContableTipo=false;
		this.isPermisoBusquedaCuentaContableTipo=false;
		this.isPermisoReporteCuentaContableTipo=false;		
		this.isPermisoOrdenCuentaContableTipo=false;		
		this.isPermisoPaginacionMedioCuentaContableTipo=false;		
		this.isPermisoPaginacionAltoCuentaContableTipo=false;
		this.isPermisoPaginacionTodoCuentaContableTipo=false;
		this.isPermisoCopiarCuentaContableTipo=false;		
		this.isPermisoVerFormCuentaContableTipo=false;		
		this.isPermisoDuplicarCuentaContableTipo=false;		
		this.isPermisoOrdenCuentaContableTipo=false;		
	}
	
	public void setPermisosUsuarioCuentaContableTipo(Boolean isPermiso) {
		this.isPermisoTodoCuentaContableTipo=isPermiso;
		this.isPermisoNuevoCuentaContableTipo=isPermiso;
		this.isPermisoActualizarCuentaContableTipo=isPermiso;
		this.isPermisoActualizarOriginalCuentaContableTipo=isPermiso;
		this.isPermisoEliminarCuentaContableTipo=isPermiso;
		this.isPermisoGuardarCambiosCuentaContableTipo=isPermiso;
		this.isPermisoConsultaCuentaContableTipo=isPermiso;
		this.isPermisoBusquedaCuentaContableTipo=isPermiso;
		this.isPermisoReporteCuentaContableTipo=isPermiso;
		this.isPermisoOrdenCuentaContableTipo=isPermiso;		
		this.isPermisoPaginacionMedioCuentaContableTipo=isPermiso;		
		this.isPermisoPaginacionAltoCuentaContableTipo=isPermiso;		
		this.isPermisoPaginacionTodoCuentaContableTipo=isPermiso;		
		this.isPermisoCopiarCuentaContableTipo=isPermiso;		
		this.isPermisoVerFormCuentaContableTipo=isPermiso;		
		this.isPermisoDuplicarCuentaContableTipo=isPermiso;
		this.isPermisoOrdenCuentaContableTipo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCuentaContableTipo(Boolean isPermiso) {
		//this.isPermisoTodoCuentaContableTipo=isPermiso;
		this.isPermisoNuevoCuentaContableTipo=isPermiso;
		this.isPermisoActualizarCuentaContableTipo=isPermiso;
		this.isPermisoActualizarOriginalCuentaContableTipo=isPermiso;
		this.isPermisoEliminarCuentaContableTipo=isPermiso;
		this.isPermisoGuardarCambiosCuentaContableTipo=isPermiso;
		//this.isPermisoConsultaCuentaContableTipo=isPermiso;
		//this.isPermisoBusquedaCuentaContableTipo=isPermiso;
		//this.isPermisoReporteCuentaContableTipo=isPermiso;
		//this.isPermisoOrdenCuentaContableTipo=isPermiso;		
		//this.isPermisoPaginacionMedioCuentaContableTipo=isPermiso;		
		//this.isPermisoPaginacionAltoCuentaContableTipo=isPermiso;		
		//this.isPermisoPaginacionTodoCuentaContableTipo=isPermiso;		
		//this.isPermisoCopiarCuentaContableTipo=isPermiso;		
		//this.isPermisoDuplicarCuentaContableTipo=isPermiso;
		//this.isPermisoOrdenCuentaContableTipo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCuentaContableTipoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CuentaContableTipoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCuentaContableTipo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCuentaContableTipoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCuentaContableTipoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCuentaContableTipoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCuentaContableTipoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCuentaContableTipo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CuentaContableTipoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CuentaContableTipoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCuentaContableTipo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCuentaContableTipo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCuentaContableTipo=this.isPermisoActualizarCuentaContableTipo;
			this.isPermisoEliminarCuentaContableTipo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCuentaContableTipo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCuentaContableTipo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCuentaContableTipo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCuentaContableTipo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCuentaContableTipo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaContableTipo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCuentaContableTipo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCuentaContableTipo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCuentaContableTipo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCuentaContableTipo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCuentaContableTipo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCuentaContableTipo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaContableTipo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCuentaContableTipo.setToolTipText(this.jTableDatosCuentaContableTipo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCuentaContableTipo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCuentaContableTipo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CuentaContableTipoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CuentaContableTipoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCuentaContableTipo() throws Exception {
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
	public void inicializarCombosForeignKeyCuentaContableTipoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipocuentacontabletiposForeignKey=new ArrayList();
				this.tipoproductoserviciosForeignKey=new ArrayList();
				this.cuentacontableventasForeignKey=new ArrayList();
				this.cuentacontabledescuentosForeignKey=new ArrayList();
				this.cuentacontabledevolucionsForeignKey=new ArrayList();
				this.cuentacontablecostosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCuentaContableTipoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CuentaContableTipoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCuentaContableTipoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCuentaContableTipoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProductoServicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableVentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableDescuentoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableDevolucionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableCostoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoCuentaContableTipoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocuentacontabletiposForeignKey==null||this.tipocuentacontabletiposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCuentaContableTipoConstantesFunciones.getArrayColumnasGlobalesTipoCuentaContableTipo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuentaContableTipoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCuentaContableTipoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCuentaContableTiposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProductoServicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoproductoserviciosForeignKey==null||this.tipoproductoserviciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoProductoServicioConstantesFunciones.getArrayColumnasGlobalesTipoProductoServicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoServicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoProductoServicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoProductoServiciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableVentaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontableventasForeignKey==null||this.cuentacontableventasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableVentasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDescuentoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontabledescuentosForeignKey==null||this.cuentacontabledescuentosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableDescuentosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDevolucionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontabledevolucionsForeignKey==null||this.cuentacontabledevolucionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableDevolucionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablecostosForeignKey==null||this.cuentacontablecostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableCostosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCuentaContableTipoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CuentaContableTipoParameterReturnGeneral cuentacontabletipoReturnGeneral=new CuentaContableTipoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cuentacontabletipoConstantesFunciones.cargarid_empresaCuentaContableTipo)
					 || (this.esRecargarFks && this.cuentacontabletipoConstantesFunciones.cargarid_empresaCuentaContableTipo)) {

					if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cuentacontabletipoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoCuentaContableTipo="";

				if(((this.tipocuentacontabletiposForeignKey==null||this.tipocuentacontabletiposForeignKey.size()<=0) && this.cuentacontabletipoConstantesFunciones.cargarid_tipo_cuenta_contable_tipoCuentaContableTipo)
					 || (this.esRecargarFks && this.cuentacontabletipoConstantesFunciones.cargarid_tipo_cuenta_contable_tipoCuentaContableTipo)) {

					if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaContableTipo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCuentaContableTipoConstantesFunciones.getArrayColumnasGlobalesTipoCuentaContableTipo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCuentaContableTipo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuentaContableTipoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCuentaContableTipo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCuentaContableTipo, "");
						finalQueryGlobalTipoCuentaContableTipo+=TipoCuentaContableTipoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCuentaContableTiposForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCuentaContableTipo=" WHERE " + ConstantesSql.ID + "="+cuentacontabletipoSessionBean.getlidTipoCuentaContableTipoActual();
					}
				} else {
					finalQueryGlobalTipoCuentaContableTipo="NONE";
				}


				String finalQueryGlobalTipoProductoServicio="";

				if(((this.tipoproductoserviciosForeignKey==null||this.tipoproductoserviciosForeignKey.size()<=0) && this.cuentacontabletipoConstantesFunciones.cargarid_tipo_producto_servicioCuentaContableTipo)
					 || (this.esRecargarFks && this.cuentacontabletipoConstantesFunciones.cargarid_tipo_producto_servicioCuentaContableTipo)) {

					if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProductoServicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProductoServicioConstantesFunciones.getArrayColumnasGlobalesTipoProductoServicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProductoServicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoServicioConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProductoServicio=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProductoServicio, "");
						finalQueryGlobalTipoProductoServicio+=TipoProductoServicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProductoServiciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProductoServicio=" WHERE " + ConstantesSql.ID + "="+cuentacontabletipoSessionBean.getlidTipoProductoServicioActual();
					}
				} else {
					finalQueryGlobalTipoProductoServicio="NONE";
				}


				String finalQueryGlobalCuentaContableVenta="";

				if(((this.cuentacontableventasForeignKey==null||this.cuentacontableventasForeignKey.size()<=0) && this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_ventaCuentaContableTipo)
					 || (this.esRecargarFks && this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_ventaCuentaContableTipo)) {

					if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableVenta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableVenta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableVenta=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableVenta, "");
						finalQueryGlobalCuentaContableVenta+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableVentasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableVenta=" WHERE " + ConstantesSql.ID + "="+cuentacontabletipoSessionBean.getlidCuentaContableVentaActual();
					}
				} else {
					finalQueryGlobalCuentaContableVenta="NONE";
				}


				String finalQueryGlobalCuentaContableDescuento="";

				if(((this.cuentacontabledescuentosForeignKey==null||this.cuentacontabledescuentosForeignKey.size()<=0) && this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_descuentoCuentaContableTipo)
					 || (this.esRecargarFks && this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_descuentoCuentaContableTipo)) {

					if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDescuento()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableDescuento=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableDescuento=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableDescuento, "");
						finalQueryGlobalCuentaContableDescuento+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableDescuentosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableDescuento=" WHERE " + ConstantesSql.ID + "="+cuentacontabletipoSessionBean.getlidCuentaContableDescuentoActual();
					}
				} else {
					finalQueryGlobalCuentaContableDescuento="NONE";
				}


				String finalQueryGlobalCuentaContableDevolucion="";

				if(((this.cuentacontabledevolucionsForeignKey==null||this.cuentacontabledevolucionsForeignKey.size()<=0) && this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_devolucionCuentaContableTipo)
					 || (this.esRecargarFks && this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_devolucionCuentaContableTipo)) {

					if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDevolucion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableDevolucion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableDevolucion=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableDevolucion, "");
						finalQueryGlobalCuentaContableDevolucion+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableDevolucionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableDevolucion=" WHERE " + ConstantesSql.ID + "="+cuentacontabletipoSessionBean.getlidCuentaContableDevolucionActual();
					}
				} else {
					finalQueryGlobalCuentaContableDevolucion="NONE";
				}


				String finalQueryGlobalCuentaContableCosto="";

				if(((this.cuentacontablecostosForeignKey==null||this.cuentacontablecostosForeignKey.size()<=0) && this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_costoCuentaContableTipo)
					 || (this.esRecargarFks && this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_costoCuentaContableTipo)) {

					if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCosto, "");
						finalQueryGlobalCuentaContableCosto+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCosto=" WHERE " + ConstantesSql.ID + "="+cuentacontabletipoSessionBean.getlidCuentaContableCostoActual();
					}
				} else {
					finalQueryGlobalCuentaContableCosto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cuentacontabletipoReturnGeneral=cuentacontabletipoLogic.cargarCombosLoteForeignKeyCuentaContableTipo(finalQueryGlobalEmpresa,finalQueryGlobalTipoCuentaContableTipo,finalQueryGlobalTipoProductoServicio,finalQueryGlobalCuentaContableVenta,finalQueryGlobalCuentaContableDescuento,finalQueryGlobalCuentaContableDevolucion,finalQueryGlobalCuentaContableCosto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cuentacontabletipoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoCuentaContableTipo.equals("NONE")) {
				this.tipocuentacontabletiposForeignKey=cuentacontabletipoReturnGeneral.gettipocuentacontabletiposForeignKey();
			}

			if(!finalQueryGlobalTipoProductoServicio.equals("NONE")) {
				this.tipoproductoserviciosForeignKey=cuentacontabletipoReturnGeneral.gettipoproductoserviciosForeignKey();
			}

			if(!finalQueryGlobalCuentaContableVenta.equals("NONE")) {
				this.cuentacontableventasForeignKey=cuentacontabletipoReturnGeneral.getcuentacontableventasForeignKey();
			}

			if(!finalQueryGlobalCuentaContableDescuento.equals("NONE")) {
				this.cuentacontabledescuentosForeignKey=cuentacontabletipoReturnGeneral.getcuentacontabledescuentosForeignKey();
			}

			if(!finalQueryGlobalCuentaContableDevolucion.equals("NONE")) {
				this.cuentacontabledevolucionsForeignKey=cuentacontabletipoReturnGeneral.getcuentacontabledevolucionsForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCosto.equals("NONE")) {
				this.cuentacontablecostosForeignKey=cuentacontabletipoReturnGeneral.getcuentacontablecostosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCuentaContableTipo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoCuentaContableTipo();
			this.addItemDefectoCombosForeignKeyTipoProductoServicio();
			this.addItemDefectoCombosForeignKeyCuentaContableVenta();
			this.addItemDefectoCombosForeignKeyCuentaContableDescuento();
			this.addItemDefectoCombosForeignKeyCuentaContableDevolucion();
			this.addItemDefectoCombosForeignKeyCuentaContableCosto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cuentacontabletipoSessionBean==null) {
				this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoCuentaContableTipo()throws Exception {
		try {

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaContableTipo()) {
				TipoCuentaContableTipo tipocuentacontabletipo=new TipoCuentaContableTipo();
				TipoCuentaContableTipoConstantesFunciones.setTipoCuentaContableTipoDescripcion(tipocuentacontabletipo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocuentacontabletipo.setId(null);

				if(!TipoCuentaContableTipoConstantesFunciones.ExisteEnLista(this.tipocuentacontabletiposForeignKey,tipocuentacontabletipo,true)) {

					this.tipocuentacontabletiposForeignKey.add(0,tipocuentacontabletipo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoProductoServicio()throws Exception {
		try {

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionTipoProductoServicio()) {
				TipoProductoServicio tipoproductoservicio=new TipoProductoServicio();
				TipoProductoServicioConstantesFunciones.setTipoProductoServicioDescripcion(tipoproductoservicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoproductoservicio.setId(null);

				if(!TipoProductoServicioConstantesFunciones.ExisteEnLista(this.tipoproductoserviciosForeignKey,tipoproductoservicio,true)) {

					this.tipoproductoserviciosForeignKey.add(0,tipoproductoservicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableVenta()throws Exception {
		try {

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableVenta()) {
				CuentaContable cuentacontableventa=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontableventa,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontableventa.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontableventasForeignKey,cuentacontableventa,true)) {

					this.cuentacontableventasForeignKey.add(0,cuentacontableventa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableDescuento()throws Exception {
		try {

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDescuento()) {
				CuentaContable cuentacontabledescuento=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontabledescuento,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontabledescuento.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontabledescuentosForeignKey,cuentacontabledescuento,true)) {

					this.cuentacontabledescuentosForeignKey.add(0,cuentacontabledescuento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableDevolucion()throws Exception {
		try {

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDevolucion()) {
				CuentaContable cuentacontabledevolucion=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontabledevolucion,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontabledevolucion.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontabledevolucionsForeignKey,cuentacontabledevolucion,true)) {

					this.cuentacontabledevolucionsForeignKey.add(0,cuentacontabledevolucion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableCosto()throws Exception {
		try {

			if(!this.cuentacontabletipoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCosto()) {
				CuentaContable cuentacontablecosto=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontablecosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontablecosto.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablecostosForeignKey,cuentacontablecosto,true)) {

					this.cuentacontablecostosForeignKey.add(0,cuentacontablecosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCuentaContableTipo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCuentaContableTipo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCuentaContableTipo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaContableTipo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCuentaContableTipo(CuentaContableTipo cuentacontabletipo)throws Exception {	
		try {
			
			this.setActualTipoCuentaContableTipoForeignKey(cuentacontabletipo.getid_tipo_cuenta_contable_tipo(),false,"Formulario");
			this.setActualTipoProductoServicioForeignKey(cuentacontabletipo.getid_tipo_producto_servicio(),false,"Formulario");
			this.setActualCuentaContableVentaForeignKey(cuentacontabletipo.getid_cuenta_contable_venta(),false,"Formulario");
			this.setActualCuentaContableDescuentoForeignKey(cuentacontabletipo.getid_cuenta_contable_descuento(),false,"Formulario");
			this.setActualCuentaContableDevolucionForeignKey(cuentacontabletipo.getid_cuenta_contable_devolucion(),false,"Formulario");
			this.setActualCuentaContableCostoForeignKey(cuentacontabletipo.getid_cuenta_contable_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCuentaContableTipo(CuentaContableTipo cuentacontabletipo,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cuentacontabletipo.getCuentaContableVenta()!=null && !sTipoEvento.equals("id_cuenta_contable_ventaCuentaContableTipo")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontableventasForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontableventasForeignKey.add(cuentacontabletipo.getCuentaContableVenta());

					this.addItemDefectoCombosForeignKeyCuentaContableVenta();
					this.cargarCombosFrameCuentaContableVentasForeignKey("Todos");
				}

				if(cuentacontabletipo.getCuentaContableDescuento()!=null && !sTipoEvento.equals("id_cuenta_contable_descuentoCuentaContableTipo")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontabledescuentosForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontabledescuentosForeignKey.add(cuentacontabletipo.getCuentaContableDescuento());

					this.addItemDefectoCombosForeignKeyCuentaContableDescuento();
					this.cargarCombosFrameCuentaContableDescuentosForeignKey("Todos");
				}

				if(cuentacontabletipo.getCuentaContableDevolucion()!=null && !sTipoEvento.equals("id_cuenta_contable_devolucionCuentaContableTipo")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontabledevolucionsForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontabledevolucionsForeignKey.add(cuentacontabletipo.getCuentaContableDevolucion());

					this.addItemDefectoCombosForeignKeyCuentaContableDevolucion();
					this.cargarCombosFrameCuentaContableDevolucionsForeignKey("Todos");
				}

				if(cuentacontabletipo.getCuentaContableCosto()!=null && !sTipoEvento.equals("id_cuenta_contable_costoCuentaContableTipo")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablecostosForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablecostosForeignKey.add(cuentacontabletipo.getCuentaContableCosto());

					this.addItemDefectoCombosForeignKeyCuentaContableCosto();
					this.cargarCombosFrameCuentaContableCostosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCuentaContableTipo()throws Exception {	
		try {
			
			this.setActualTipoCuentaContableTipoForeignKey(this.cuentacontabletipoConstantesFunciones.getid_tipo_cuenta_contable_tipo(),false,"Formulario");
			this.setActualTipoProductoServicioForeignKey(this.cuentacontabletipoConstantesFunciones.getid_tipo_producto_servicio(),false,"Formulario");
			this.setActualCuentaContableVentaForeignKey(this.cuentacontabletipoConstantesFunciones.getid_cuenta_contable_venta(),false,"Formulario");
			this.setActualCuentaContableDescuentoForeignKey(this.cuentacontabletipoConstantesFunciones.getid_cuenta_contable_descuento(),false,"Formulario");
			this.setActualCuentaContableDevolucionForeignKey(this.cuentacontabletipoConstantesFunciones.getid_cuenta_contable_devolucion(),false,"Formulario");
			this.setActualCuentaContableCostoForeignKey(this.cuentacontabletipoConstantesFunciones.getid_cuenta_contable_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaContableTipo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCuentaContableTipo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCuentaContableTipo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCuentaContableTipo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCuentaContableTipo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoCuentaContableTiposForeignKey("Todos");
			this.cargarCombosFrameTipoProductoServiciosForeignKey("Todos");
			this.cargarCombosFrameCuentaContableVentasForeignKey("Todos");
			this.cargarCombosFrameCuentaContableDescuentosForeignKey("Todos");
			this.cargarCombosFrameCuentaContableDevolucionsForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCostosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCuentaContableTipo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCuentaContableTiposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductoServiciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableVentasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableDescuentosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableDevolucionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCostosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCuentaContableTipo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public CuentaContableTipoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CuentaContableTipoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CuentaContableTipoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean(); 
		this.cuentacontabletipoConstantesFunciones=new CuentaContableTipoConstantesFunciones(); 
		this.cuentacontabletipoBean=new CuentaContableTipo();//(this.cuentacontabletipoConstantesFunciones); 		
		this.cuentacontabletipoReturnGeneral=new CuentaContableTipoParameterReturnGeneral(); 
		
		this.cuentacontabletipoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacontabletipoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CuentaContableTipoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CuentaContableTipoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CuentaContableTipoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCuentaContableTipo(true);
			
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
			
			this.cuentacontabletipoConstantesFunciones=new CuentaContableTipoConstantesFunciones(); 
			this.cuentacontabletipoBean=new CuentaContableTipo();//this.cuentacontabletipoConstantesFunciones); 			
			this.cuentacontabletipoReturnGeneral=new CuentaContableTipoParameterReturnGeneral(); 
		
			CuentaContableTipoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Contable Tipo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cuentacontabletipo=new CuentaContableTipo();
			this.cuentacontabletipos = new ArrayList<CuentaContableTipo>();
			this.cuentacontabletiposAux = new ArrayList<CuentaContableTipo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic=new CuentaContableTipoLogic();
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			//this.cuentacontabletipoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cuentacontabletipoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCuentaContableTipo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCuentaContableTipo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaContableTipo);	
					}
					
					if(this.jInternalFrameImportacionCuentaContableTipo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaContableTipo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCuentaContableTipo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCuentaContableTipo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaContableTipo);
				this.jInternalFrameDetalleFormCuentaContableTipo.setVisible(false);
				this.jInternalFrameDetalleFormCuentaContableTipo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCuentaContableTipo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaContableTipo);
					this.jInternalFrameReporteDinamicoCuentaContableTipo.setVisible(false);
					this.jInternalFrameReporteDinamicoCuentaContableTipo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCuentaContableTipo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCuentaContableTipo);
					this.jInternalFrameImportacionCuentaContableTipo.setVisible(false);
					this.jInternalFrameImportacionCuentaContableTipo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCuentaContableTipo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCuentaContableTipo);
					this.jInternalFrameOrderByCuentaContableTipo.setVisible(false);
					this.jInternalFrameOrderByCuentaContableTipo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCuentaContableTipoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CuentaContableTipoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cuentacontabletipoReturnGeneral=new CuentaContableTipoParameterReturnGeneral();
			
			this.cuentacontabletipoParameterGeneral=new CuentaContableTipoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cuentacontabletipoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CuentaContableTipoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaContableTipoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentacontabletipoSessionBean.getEsGuardarRelacionado(),this.cuentacontabletipoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaContableTipoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentacontabletipoSessionBean.getEsGuardarRelacionado(),this.cuentacontabletipoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCuentaContableTipo=false;
			this.isVisibilidadCeldaDuplicarCuentaContableTipo=true;
			this.isVisibilidadCeldaCopiarCuentaContableTipo=true;
			this.isVisibilidadCeldaVerFormCuentaContableTipo=true;
			this.isVisibilidadCeldaOrdenCuentaContableTipo=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=false;
			this.isVisibilidadCeldaModificarCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdCuentaContableCosto=true;
			this.isVisibilidadFK_IdCuentaContableDescuento=true;
			this.isVisibilidadFK_IdCuentaContableDevolucion=true;
			this.isVisibilidadFK_IdCuentaContableVenta=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoCuentaContableTipo=true;
			this.isVisibilidadFK_IdTipoProductoServicio=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCuentaContableTipo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCuentaContableTipo(false);
			
			this.setPermisosUsuarioCuentaContableTipo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() 
				|| (this.cuentacontabletipoSessionBean.getEsGuardarRelacionado() && this.cuentacontabletipoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCuentaContableTipoClasesRelacionadas();
			}
			
			if(this.cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCuentaContableTipoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCuentaContableTipo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCuentaContableTipo();
			}
			
			if(!this.isPermisoBusquedaCuentaContableTipo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCuentaContableTipo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCuentaContableTipo,this.isPermisoPaginacionMedioCuentaContableTipo,this.isPermisoPaginacionTodoCuentaContableTipo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CuentaContableTipoConstantesFunciones.getTiposSeleccionarCuentaContableTipo());
				
				this.tiposColumnasSelect=CuentaContableTipoConstantesFunciones.getTiposSeleccionarCuentaContableTipo(true);
				
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
			//if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCuentaContableTipo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCuentaContableTipo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCuentaContableTipo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContableTipo() ;
			
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
			this.tipocuentacontabletipoLogic=new TipoCuentaContableTipoLogic();
			this.tipoproductoservicioLogic=new TipoProductoServicioLogic();
			this.cuentacontableventaLogic=new CuentaContableLogic();
			this.cuentacontabledescuentoLogic=new CuentaContableLogic();
			this.cuentacontabledevolucionLogic=new CuentaContableLogic();
			this.cuentacontablecostoLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cuentacontabletipoImplementable= (CuentaContableTipoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaContableTipoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cuentacontabletipoImplementableHome= (CuentaContableTipoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaContableTipoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cuentacontabletipos= new ArrayList<CuentaContableTipo>();
			this.cuentacontabletiposEliminados= new ArrayList<CuentaContableTipo>();
						
			this.isEsNuevoCuentaContableTipo=false;
			this.esParaAccionDesdeFormularioCuentaContableTipo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableVentaActual=0L;
			this.idCuentaContableDescuentoActual=0L;
			this.idCuentaContableDevolucionActual=0L;
			this.idCuentaContableCostoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipocuentacontabletiposForeignKey=new ArrayList<TipoCuentaContableTipo>() ;
			this.tipoproductoserviciosForeignKey=new ArrayList<TipoProductoServicio>() ;
			this.cuentacontableventasForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontabledescuentosForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontabledevolucionsForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontablecostosForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCuentaContableTipo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCuentaContableTipo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CuentaContableTipoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CuentaContableTipoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCuentaContableTipo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCuentaContableTipo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCuentaContableTipo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCuentaContableTipo();
			}
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCuentaContableTipo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCuentaContableTipo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCuentaContableTipo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCuentaContableTipo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CuentaContableTipo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCuentaContableTipo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCuentaContableTipo")) {
				iIndex=this.jInternalFrameDetalleFormCuentaContableTipo.jTabbedPaneRelacionesCuentaContableTipo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCuentaContableTipo.jTabbedPaneRelacionesCuentaContableTipo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCuentaContableTipo();	
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
	
	public void cargarCombosForeignKeyCuentaContableTipo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCuentaContableTipo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCuentaContableTipo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCuentaContableTipoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCuentaContableTipo();
		
		this.cargarCombosFrameForeignKeyCuentaContableTipo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCuentaContableTipo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCuentaContableTipo();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoCuentaContableTipo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCuentaContableTipoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCuentaContableTipo();
				this.cargarCombosFrameTipoCuentaContableTiposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCuentaContableTipo(this.tipocuentacontabletiposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProductoServicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoProductoServicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoProductoServicio();
				this.cargarCombosFrameTipoProductoServiciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoProductoServicio(this.tipoproductoserviciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableVentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableVenta();
				this.cargarCombosFrameCuentaContableVentasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableVenta(this.cuentacontableventasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDescuento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableDescuentoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableDescuento();
				this.cargarCombosFrameCuentaContableDescuentosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableDescuento(this.cuentacontabledescuentosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDevolucion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableDevolucionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableDevolucion();
				this.cargarCombosFrameCuentaContableDevolucionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableDevolucion(this.cuentacontabledevolucionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableCosto();
				this.cargarCombosFrameCuentaContableCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableCosto(this.cuentacontablecostosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCuentaContableTipoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
			
			if(jTableDatosCuentaContableTipo.getRowCount()>=1) {
				jTableDatosCuentaContableTipo.removeRowSelectionInterval(0, jTableDatosCuentaContableTipo.getRowCount()-1);						
			}
			
			this.isEsNuevoCuentaContableTipo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCuentaContableTipo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCuentaContableTipo(true);			
			//this.cuentacontabletipo=new CuentaContableTipo();
			//this.cuentacontabletipo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaContableTipo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContableTipo() ;
			
			if(CuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaContableTipo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cuentacontabletipo);	
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);				
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
			if(this.cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CuentaContableTipo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCuentaContableTipoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCuentaContableTipo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCuentaContableTipo.getSelectedRows().length;			
			}
			
			cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCuentaContableTipo--;			
				//CuentaContableTipo cuentacontabletipoAux= new CuentaContableTipo();			
				//cuentacontabletipoAux.setId(this.iIdNuevoCuentaContableTipo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CuentaContableTipo cuentacontabletipoOrigen=new CuentaContableTipo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CuentaContableTipo cuentacontabletipoOrigen : cuentacontabletiposSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cuentacontabletipoOrigen =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacontabletipoOrigen =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCuentaContableTipo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cuentacontabletipo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCuentaContableTipo(cuentacontabletipoOrigen,this.cuentacontabletipo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentacontabletipoLogic.getCuentaContableTipos().add(this.cuentacontabletipoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipos.add(this.cuentacontabletipoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCuentaContableTipo(false);
				
				this.jTableDatosCuentaContableTipo.setRowSelectionInterval(this.getIndiceNuevoCuentaContableTipo(), this.getIndiceNuevoCuentaContableTipo());
				
				int iLastRow =  this.jTableDatosCuentaContableTipo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaContableTipo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaContableTipo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaContableTipo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();									
		
			CuentaContableTipo cuentacontabletipoOrigen=new CuentaContableTipo();
			CuentaContableTipo cuentacontabletipoDestino=new CuentaContableTipo();
				
			cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCuentaContableTipo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cuentacontabletiposSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCuentaContableTipo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletipoOrigen =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentacontabletipoOrigen =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacontabletipoDestino =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentacontabletipoDestino =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cuentacontabletipoOrigen =cuentacontabletiposSeleccionados.get(0);
				cuentacontabletipoDestino =cuentacontabletiposSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCuentaContableTipo(cuentacontabletipoOrigen,cuentacontabletipoDestino,true,false);
				
				cuentacontabletipoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentacontabletipoDestino,cuentacontabletipoLogic.getCuentaContableTipos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacontabletipoDestino,cuentacontabletipos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCuentaContableTipo(false);
				
				//this.jTableDatosCuentaContableTipo.setRowSelectionInterval(this.getIndiceNuevoCuentaContableTipo(), this.getIndiceNuevoCuentaContableTipo());
				
				int iLastRow =  this.jTableDatosCuentaContableTipo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaContableTipo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaContableTipo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaContableTipo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCuentaContableTipo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCuentaContableTipo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCuentaContableTipo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCuentaContableTipo.setVisible(!isVisible);
			this.jPanelPaginacionCuentaContableTipo.setVisible(!isVisible);
			this.jPanelAccionesCuentaContableTipo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCuentaContableTipo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCuentaContableTipo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCuentaContableTipo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCuentaContableTipo();
			
			this.abrirFrameOrderByCuentaContableTipo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCuentaContableTipo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCuentaContableTipo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaContableTipo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCuentaContableTipo.isMaximum()) {
					this.jInternalFrameDetalleFormCuentaContableTipo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCuentaContableTipo.setSize(this.jInternalFrameDetalleFormCuentaContableTipo.iWidthFormulario,this.jInternalFrameDetalleFormCuentaContableTipo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCuentaContableTipo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCuentaContableTipo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCuentaContableTipo.isMaximum()) {
						this.jInternalFrameDetalleFormCuentaContableTipo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCuentaContableTipo.jContentPaneDetalleCuentaContableTipo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCuentaContableTipo.jTabbedPaneRelacionesCuentaContableTipo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCuentaContableTipo.jContentPaneDetalleCuentaContableTipo.getWidth(),CuentaContableTipoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaContableTipo.jTabbedPaneRelacionesCuentaContableTipo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCuentaContableTipo.jContentPaneDetalleCuentaContableTipo.getWidth(),CuentaContableTipoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaContableTipo.jTabbedPaneRelacionesCuentaContableTipo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCuentaContableTipo.jContentPaneDetalleCuentaContableTipo.getWidth(),CuentaContableTipoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCuentaContableTipo.setVisible(true);
	        this.jInternalFrameDetalleFormCuentaContableTipo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCuentaContableTipo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCuentaContableTipo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCuentaContableTipo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContableTipo,false,this);
				} else {
					this.jInternalFrameOrderByCuentaContableTipo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaContableTipo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCuentaContableTipo);
				this.jInternalFrameOrderByCuentaContableTipo.setVisible(false);
				this.jInternalFrameOrderByCuentaContableTipo.setSelected(false);
				
				this.jInternalFrameOrderByCuentaContableTipo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaContableTipo"));
				
				this.inicializarActualizarBindingTablaOrderByCuentaContableTipo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCuentaContableTipo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCuentaContableTipo==null) {
				
				this.jInternalFrameImportacionCuentaContableTipo=new ImportacionJInternalFrame(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaContableTipo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCuentaContableTipo);
				this.jInternalFrameImportacionCuentaContableTipo.setVisible(false);
				this.jInternalFrameImportacionCuentaContableTipo.setSelected(false);


				this.jInternalFrameImportacionCuentaContableTipo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaContableTipo"));
				this.jInternalFrameImportacionCuentaContableTipo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaContableTipo"));
				this.jInternalFrameImportacionCuentaContableTipo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaContableTipo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCuentaContableTipo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCuentaContableTipo==null) {
				this.jInternalFrameReporteDinamicoCuentaContableTipo=new ReporteDinamicoJInternalFrame(CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaContableTipo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaContableTipo);
				this.jInternalFrameReporteDinamicoCuentaContableTipo.setVisible(false);
				this.jInternalFrameReporteDinamicoCuentaContableTipo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCuentaContableTipo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaContableTipo"));
				this.jInternalFrameReporteDinamicoCuentaContableTipo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaContableTipo"));
				this.jInternalFrameReporteDinamicoCuentaContableTipo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaContableTipo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaContableTipo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCuentaContableTipo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaContableTipo);
			
	       	this.jInternalFrameDetalleFormCuentaContableTipo.setVisible(false);
	        this.jInternalFrameDetalleFormCuentaContableTipo.setSelected(false);
			
			//this.jInternalFrameDetalleFormCuentaContableTipo.dispose();
			//this.jInternalFrameDetalleFormCuentaContableTipo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCuentaContableTipo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCuentaContableTipo.setVisible(true);
	        this.jInternalFrameReporteDinamicoCuentaContableTipo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCuentaContableTipo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCuentaContableTipo.setVisible(true);
	        this.jInternalFrameImportacionCuentaContableTipo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCuentaContableTipo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCuentaContableTipo.setVisible(true);
	        this.jInternalFrameOrderByCuentaContableTipo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCuentaContableTipo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCuentaContableTipo.setVisible(false);
	        this.jInternalFrameOrderByCuentaContableTipo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCuentaContableTipo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCuentaContableTipo.setVisible(false);
	        this.jInternalFrameReporteDinamicoCuentaContableTipo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCuentaContableTipo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCuentaContableTipo.setVisible(false);
	        this.jInternalFrameImportacionCuentaContableTipo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContableVenta(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableVenta";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
						TitledBorder titledBorderCuentaContableVenta=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableVenta.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableVenta(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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

				public void abrirFrameTreeCuentaContableDescuento(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableDescuento";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
						TitledBorder titledBorderCuentaContableDescuento=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableDescuento.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableDescuento(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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

				public void abrirFrameTreeCuentaContableDevolucion(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableDevolucion";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
						TitledBorder titledBorderCuentaContableDevolucion=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableDevolucion.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableDevolucion(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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

				public void abrirFrameTreeCuentaContableCosto(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableCosto";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
						TitledBorder titledBorderCuentaContableCosto=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCosto.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableCosto(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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
	
	public void jButtonModificarCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCuentaContableTipo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCuentaContableTipo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCuentaContableTipo(true);
			//this.isEsNuevoCuentaContableTipo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCuentaContableTipo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaContableTipo(false) ;
			
			if(cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaContableTipo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContableTipo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCuentaContableTipoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCuentaContableTipo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCuentaContableTipo(true);
			//this.isEsNuevoCuentaContableTipo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cuentacontabletipo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCuentaContableTipo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCuentaContableTipo(false) ;
			
			if(CuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaContableTipo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContableTipo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContableVenta")) {
				if(!this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_ventaCuentaContableTipo) {
					this.cargarCombosCuentaContableVentasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCuentaContableTipo(false,false);
					this.cargarCombosFrameCuentaContableVentasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_venta (id);

				this.recargarComboTablaCuentaContableVenta(this.cuentacontableventasForeignKey);

			}
			
			if(sType.equals("CuentaContableDescuento")) {
				if(!this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_descuentoCuentaContableTipo) {
					this.cargarCombosCuentaContableDescuentosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCuentaContableTipo(false,false);
					this.cargarCombosFrameCuentaContableDescuentosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_descuento (id);

				this.recargarComboTablaCuentaContableDescuento(this.cuentacontabledescuentosForeignKey);

			}
			
			if(sType.equals("CuentaContableDevolucion")) {
				if(!this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_devolucionCuentaContableTipo) {
					this.cargarCombosCuentaContableDevolucionsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCuentaContableTipo(false,false);
					this.cargarCombosFrameCuentaContableDevolucionsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_devolucion (id);

				this.recargarComboTablaCuentaContableDevolucion(this.cuentacontabledevolucionsForeignKey);

			}
			
			if(sType.equals("CuentaContableCosto")) {
				if(!this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_costoCuentaContableTipo) {
					this.cargarCombosCuentaContableCostosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCuentaContableTipo(false,false);
					this.cargarCombosFrameCuentaContableCostosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_costo (id);

				this.recargarComboTablaCuentaContableCosto(this.cuentacontablecostosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoCuentaContableTipo(List<TipoCuentaContableTipo> tipocuentacontabletiposForeignKey)throws Exception{
		TableColumn tableColumnTipoCuentaContableTipo=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO));
		TableCellEditor tableCellEditorTipoCuentaContableTipo =tableColumnTipoCuentaContableTipo.getCellEditor();

		TipoCuentaContableTipoTableCell tipocuentacontabletipoTableCellFk=(TipoCuentaContableTipoTableCell)tableCellEditorTipoCuentaContableTipo;

		if(tipocuentacontabletipoTableCellFk!=null) {
			tipocuentacontabletipoTableCellFk.settipocuentacontabletiposForeignKey(tipocuentacontabletiposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaContableTipo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocuentacontabletipoTableCellFk.setRowActual(intSelectedRow);
			//tipocuentacontabletipoTableCellFk.settipocuentacontabletiposForeignKeyActual(tipocuentacontabletiposForeignKey);
		//}


		if(tipocuentacontabletipoTableCellFk!=null) {
			tipocuentacontabletipoTableCellFk.RecargarTipoCuentaContableTiposForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoProductoServicio(List<TipoProductoServicio> tipoproductoserviciosForeignKey)throws Exception{
		TableColumn tableColumnTipoProductoServicio=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO));
		TableCellEditor tableCellEditorTipoProductoServicio =tableColumnTipoProductoServicio.getCellEditor();

		TipoProductoServicioTableCell tipoproductoservicioTableCellFk=(TipoProductoServicioTableCell)tableCellEditorTipoProductoServicio;

		if(tipoproductoservicioTableCellFk!=null) {
			tipoproductoservicioTableCellFk.settipoproductoserviciosForeignKey(tipoproductoserviciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaContableTipo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoservicioTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoservicioTableCellFk.settipoproductoserviciosForeignKeyActual(tipoproductoserviciosForeignKey);
		//}


		if(tipoproductoservicioTableCellFk!=null) {
			tipoproductoservicioTableCellFk.RecargarTipoProductoServiciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableVenta(List<CuentaContable> cuentacontableventasForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableVenta=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA));
		TableCellEditor tableCellEditorCuentaContableVenta =tableColumnCuentaContableVenta.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableVenta;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontableventasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaContableTipo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontableventasForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableDescuento(List<CuentaContable> cuentacontabledescuentosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableDescuento=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO));
		TableCellEditor tableCellEditorCuentaContableDescuento =tableColumnCuentaContableDescuento.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableDescuento;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontabledescuentosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaContableTipo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontabledescuentosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableDevolucion(List<CuentaContable> cuentacontabledevolucionsForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableDevolucion=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION));
		TableCellEditor tableCellEditorCuentaContableDevolucion =tableColumnCuentaContableDevolucion.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableDevolucion;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontabledevolucionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaContableTipo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontabledevolucionsForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableCosto(List<CuentaContable> cuentacontablecostosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableCosto=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO));
		TableCellEditor tableCellEditorCuentaContableCosto =tableColumnCuentaContableCosto.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCosto;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaContableTipo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablecostosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_venta (Long id) throws Exception {
		this.setActualCuentaContableVentaForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_descuento (Long id) throws Exception {
		this.setActualCuentaContableDescuentoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_devolucion (Long id) throws Exception {
		this.setActualCuentaContableDevolucionForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_costo (Long id) throws Exception {
		this.setActualCuentaContableCostoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCuentaContableTipo(false);
			
			//if(!this.isEsNuevoCuentaContableTipo) {								
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				
			}
			
			if(this.permiteMantenimiento(this.cuentacontabletipo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCuentaContableTipo=true;
					this.inicializarActualizarBindingTablaCuentaContableTipo(false);
					this.isEsNuevoCuentaContableTipo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCuentaContableTipo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCuentaContableTipo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaContableTipo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaContableTipo(false);
				
				this.habilitarDeshabilitarControlesCuentaContableTipo(false);
			
												
				
				if(CuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCuentaContableTipo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCuentaContableTipoActionPerformed(evt,cuentacontabletipoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCuentaContableTipo(this.cuentacontabletipo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCuentaContableTipo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cuentacontabletipoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cuentacontabletipo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CuentaContableTipo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContableTipo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				this.cuentacontabletipo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				this.cuentacontabletipo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cuentacontabletipo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CuentaContableTipoModel) this.jTableDatosCuentaContableTipo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCuentaContableTipo=true;
				this.inicializarActualizarBindingTablaCuentaContableTipo(false);
				this.isEsNuevoCuentaContableTipo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaContableTipo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaContableTipo(false);
				
				this.habilitarDeshabilitarControlesCuentaContableTipo(false);
				
				
				
				if(CuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCuentaContableTipo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCuentaContableTipo.getRowCount()>=1) {
				jTableDatosCuentaContableTipo.removeRowSelectionInterval(0, jTableDatosCuentaContableTipo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCuentaContableTipo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCuentaContableTipo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaContableTipo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaContableTipo(false) ;
			
			this.isEsNuevoCuentaContableTipo=false;
			
			if(CuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCuentaContableTipo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCuentaContableTipo(false);
				
				//SI ES MANUAL
				if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCuentaContableTipo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCuentaContableTipo--;			
			//CuentaContableTipo cuentacontabletipoAux= new CuentaContableTipo();			
			//cuentacontabletipoAux.setId(this.iIdNuevoCuentaContableTipo);
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCuentaContableTipo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
			
			this.cuentacontabletipo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cuentacontabletipoLogic.getCuentaContableTipos().add(this.cuentacontabletipoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cuentacontabletipos.add(this.cuentacontabletipoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCuentaContableTipo(false);
			
			this.jTableDatosCuentaContableTipo.setRowSelectionInterval(this.getIndiceNuevoCuentaContableTipo(), this.getIndiceNuevoCuentaContableTipo());
			
			int iLastRow =  this.jTableDatosCuentaContableTipo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCuentaContableTipo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCuentaContableTipo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCuentaContableTipo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCuentaContableTipo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContableTipo(false);
			
			//SI ES MANUAL
			if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaContableTipo();
			}
			
			//this.abrirFrameTreeCuentaContableTipo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cuenta Contable TipoS ?", "MANTENIMIENTO DE Cuenta Contable Tipo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCuentaContableTipo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCuentaContableTipo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cuentacontabletipoReturnGeneral=cuentacontabletipoLogic.procesarImportacionCuentaContableTiposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cuentacontabletipoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCuentaContableTipoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCuentaContableTipo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCuentaContableTipo.setFileImportacion(this.jInternalFrameImportacionCuentaContableTipo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCuentaContableTipo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCuentaContableTipo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCuentaContableTipo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCuentaContableTipo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();		

		cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CuentaContableTipoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CuentaContableTipoBaseDesign.jrxml";
			
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
			
			this.generarReporteCuentaContableTipos("Todos",cuentacontabletiposSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaContableTipoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gitoVerificador_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gitoVerificador_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gitoVerificador_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gitoVerificador_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCuentaContableTipo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCuentaContableTipo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCuentaContableTipo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCuentaContableTipo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProductoServicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProductoServicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProductoServicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProductoServicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableDescuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableDescuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableDescuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableDescuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableDevolucion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableDevolucion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableDevolucion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableDevolucion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCosto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCuentaContableTipo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR:
					sNombreCampoCategoria="digito_verificador";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO:
					sNombreCampoCategoria="id_tipo_cuenta_contable_tipo";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO:
					sNombreCampoCategoria="id_tipo_producto_servicio";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA:
					sNombreCampoCategoria="id_cuenta_contable_venta";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO:
					sNombreCampoCategoria="id_cuenta_contable_descuento";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION:
					sNombreCampoCategoria="id_cuenta_contable_devolucion";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO:
					sNombreCampoCategoria="id_cuenta_contable_costo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR:
					sNombreCampoCategoriaValor="digito_verificador";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO:
					sNombreCampoCategoriaValor="id_tipo_cuenta_contable_tipo";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO:
					sNombreCampoCategoriaValor="id_tipo_producto_servicio";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA:
					sNombreCampoCategoriaValor="id_cuenta_contable_venta";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO:
					sNombreCampoCategoriaValor="id_cuenta_contable_descuento";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION:
					sNombreCampoCategoriaValor="id_cuenta_contable_devolucion";
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO:
					sNombreCampoCategoriaValor="id_cuenta_contable_costo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Digito Verificador",sNombreCampoCategoria,sNombreCampoCategoriaValor,"digito_verificador");
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"T. Cuenta Contable Tipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_cuenta_contable_tipo");
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"T. Producto Servicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_producto_servicio");
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"C. Contable Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_venta");
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"C. Contable Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_descuento");
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"C. Contable Devolucion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_devolucion");
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"C. Contable Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_costo");
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
	
	public void jButtonGenerarExcelReporteDinamicoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();		
		
		cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontabletipo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CuentaContableTipos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CuentaContableTipo cuentacontabletipo:cuentacontabletiposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontabletipo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CuentaContableTipo cuentacontabletipo:cuentacontabletiposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontabletipo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR);
					iRow++;

					for(CuentaContableTipo cuentacontabletipo:cuentacontabletiposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontabletipo.getdigito_verificador());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO);
					iRow++;

					for(CuentaContableTipo cuentacontabletipo:cuentacontabletiposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontabletipo.gettipocuentacontabletipo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
					iRow++;

					for(CuentaContableTipo cuentacontabletipo:cuentacontabletiposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontabletipo.gettipoproductoservicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA);
					iRow++;

					for(CuentaContableTipo cuentacontabletipo:cuentacontabletiposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontabletipo.getcuentacontableventa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO);
					iRow++;

					for(CuentaContableTipo cuentacontabletipo:cuentacontabletiposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontabletipo.getcuentacontabledescuento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION);
					iRow++;

					for(CuentaContableTipo cuentacontabletipo:cuentacontabletiposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontabletipo.getcuentacontabledevolucion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO);
					iRow++;

					for(CuentaContableTipo cuentacontabletipo:cuentacontabletiposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacontabletipo.getcuentacontablecosto_descripcion());
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
			//	this.getFilaCabeceraExportarExcelCuentaContableTipo(row);				
			//	iRow++;
			//}				
			
			//for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletiposSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCuentaContableTipo(cuentacontabletipoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
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
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContableTipo(false);
			
			//SI ES MANUAL
			if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaContableTipo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContableTipo(false);
			
			//SI ES MANUAL
			if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaContableTipo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaContableTipo(false);
			
			//SI ES MANUAL
			if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaContableTipo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCuentaContableTipo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCuentaContableTipo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCuentaContableTipo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCuentaContableTipo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCuentaContableTipo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCuentaContableTipo.setMinimumSize(dimensionMinimum);
		this.jTableDatosCuentaContableTipo.setMaximumSize(dimensionMaximum);
		this.jTableDatosCuentaContableTipo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCuentaContableTipo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCuentaContableTipo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCuentaContableTipo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCuentaContableTipo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCuentaContableTipo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCuentaContableTipo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContableTipo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCuentaContableTipo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCuentaContableTipo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCuentaContableTipo();
		
		this.inicializarActualizarBindingBotonesManualCuentaContableTipo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaContableTipo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContableTipo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaContableTipo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaContableTipo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCuentaContableTipo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCuentaContableTipo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCuentaContableTipo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCuentaContableTipo.jCheckBoxPostAccionNuevoCuentaContableTipo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCuentaContableTipo.jCheckBoxPostAccionSinCerrarCuentaContableTipo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCuentaContableTipo.jCheckBoxPostAccionSinMensajeCuentaContableTipo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCuentaContableTipo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCuentaContableTipo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCuentaContableTipo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
				this.jInternalFrameDetalleFormCuentaContableTipo.jCheckBoxPostAccionNuevoCuentaContableTipo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCuentaContableTipo.jCheckBoxPostAccionSinCerrarCuentaContableTipo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCuentaContableTipo.jCheckBoxPostAccionSinMensajeCuentaContableTipo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCuentaContableTipo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCuentaContableTipo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCuentaContableTipo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCuentaContableTipo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCuentaContableTipo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCuentaContableTipo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCuentaContableTipo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCuentaContableTipo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCuentaContableTipo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaContableTipo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCuentaContableTipo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCuentaContableTipo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCuentaContableTipo(Boolean esInicializar) throws Exception {
		try	{	
			if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaContableTipo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCuentaContableTipo() throws Exception {
		try	{
			if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaContableTipo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaContableTipo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaContableTipo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCuentaContableTipo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCuentaContableTipo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCuentaContableTipo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCuentaContableTipo.addItem(reporte);
			}
			
			
			if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCuentaContableTipo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCuentaContableTipo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCuentaContableTipo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCuentaContableTipo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCuentaContableTipo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCuentaContableTipo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCuentaContableTipo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaContableTipo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaContableTipo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaContableTipo!=null) {
				this.jInternalFrameReporteDinamicoCuentaContableTipo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaContableTipo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaContableTipo!=null) {
				this.jInternalFrameReporteDinamicoCuentaContableTipo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaContableTipo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCuentaContableTipo!=null) {
				
				if(this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaContableTipo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCuentaContableTipo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreCuentaContableTipo.getText();
		if(this.jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.getSelectedItem()!=null){this.id_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo=((TipoCuentaContableTipo)this.jComboBoxid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipoCuentaContableTipo.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.getSelectedItem()!=null){this.id_tipo_producto_servicioFK_IdTipoProductoServicio=((TipoProductoServicio)this.jComboBoxid_tipo_producto_servicioFK_IdTipoProductoServicioCuentaContableTipo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCuentaContableTipo(Boolean esInicializar) throws Exception {				
		if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaContableTipo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCuentaContableTipo() throws Exception {
		this.inicializarActualizarBindingTablaCuentaContableTipo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCuentaContableTipo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCuentaContableTipoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCuentaContableTipo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cuentacontabletipoLogic.getCuentaContableTipos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cuentacontabletipos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCuentaContableTipo.setModel(new CuentaContableTipoModel(this.cuentacontabletipoLogic.getCuentaContableTipos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCuentaContableTipo.setModel(new CuentaContableTipoModel(this.cuentacontabletipos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCuentaContableTipo!=null && this.jInternalFrameOrderByCuentaContableTipo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCuentaContableTipo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,cuentacontabletipoConstantesFunciones.resaltarSeleccionarCuentaContableTipo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CuentaContableTipoConstantesFunciones.SCLASSWEBTITULO,cuentacontabletipoConstantesFunciones.resaltarSeleccionarCuentaContableTipo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_ID));

		if(this.cuentacontabletipoConstantesFunciones.mostraridCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContableTipoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuentacontabletipoConstantesFunciones.resaltaridCuentaContableTipo,this.cuentacontabletipoConstantesFunciones.activaridCuentaContableTipo,this,true,"idCuentaContableTipo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentacontabletipoConstantesFunciones.resaltaridCuentaContableTipo,this.cuentacontabletipoConstantesFunciones.activaridCuentaContableTipo,this,true,"idCuentaContableTipo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cuentacontabletipoConstantesFunciones.mostrarid_empresaCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_empresaCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_empresaCuentaContableTipo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_empresaCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_empresaCuentaContableTipo,false,"id_empresaCuentaContableTipo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_NOMBRE));

		if(this.cuentacontabletipoConstantesFunciones.mostrarnombreCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContableTipoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cuentacontabletipoConstantesFunciones.resaltarnombreCuentaContableTipo,this.cuentacontabletipoConstantesFunciones.activarnombreCuentaContableTipo,this,true,"nombreCuentaContableTipo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentacontabletipoConstantesFunciones.resaltarnombreCuentaContableTipo,this.cuentacontabletipoConstantesFunciones.activarnombreCuentaContableTipo,this,true,"nombreCuentaContableTipo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR));

		if(this.cuentacontabletipoConstantesFunciones.mostrardigito_verificadorCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuentacontabletipoConstantesFunciones.resaltardigito_verificadorCuentaContableTipo,this.cuentacontabletipoConstantesFunciones.activardigito_verificadorCuentaContableTipo,this,true,"digito_verificadorCuentaContableTipo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentacontabletipoConstantesFunciones.resaltardigito_verificadorCuentaContableTipo,this.cuentacontabletipoConstantesFunciones.activardigito_verificadorCuentaContableTipo,this,true,"digito_verificadorCuentaContableTipo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO));

		if(this.cuentacontabletipoConstantesFunciones.mostrarid_tipo_cuenta_contable_tipoCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCuentaContableTipoTableCell(this.tipocuentacontabletiposForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_tipo_cuenta_contable_tipoCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_tipo_cuenta_contable_tipoCuentaContableTipo));
			tableColumn.setCellEditor(new TipoCuentaContableTipoTableCell(this.tipocuentacontabletiposForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_tipo_cuenta_contable_tipoCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_tipo_cuenta_contable_tipoCuentaContableTipo,true,"id_tipo_cuenta_contable_tipoCuentaContableTipo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO));

		if(this.cuentacontabletipoConstantesFunciones.mostrarid_tipo_producto_servicioCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProductoServicioTableCell(this.tipoproductoserviciosForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_tipo_producto_servicioCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_tipo_producto_servicioCuentaContableTipo));
			tableColumn.setCellEditor(new TipoProductoServicioTableCell(this.tipoproductoserviciosForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_tipo_producto_servicioCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_tipo_producto_servicioCuentaContableTipo,true,"id_tipo_producto_servicioCuentaContableTipo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA));

		if(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_ventaCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontableventasForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_ventaCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_ventaCuentaContableTipo));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontableventasForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_ventaCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_ventaCuentaContableTipo,true,"id_cuenta_contable_ventaCuentaContableTipo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO));

		if(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_descuentoCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontabledescuentosForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_descuentoCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_descuentoCuentaContableTipo));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontabledescuentosForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_descuentoCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_descuentoCuentaContableTipo,true,"id_cuenta_contable_descuentoCuentaContableTipo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION));

		if(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_devolucionCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontabledevolucionsForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_devolucionCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_devolucionCuentaContableTipo));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontabledevolucionsForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_devolucionCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_devolucionCuentaContableTipo,true,"id_cuenta_contable_devolucionCuentaContableTipo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO));

		if(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_costoCuentaContableTipo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecostosForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_costoCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_costoCuentaContableTipo));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecostosForeignKey,this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_costoCuentaContableTipo,this,this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_costoCuentaContableTipo,true,"id_cuenta_contable_costoCuentaContableTipo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CuentaContableTipoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaContableTipo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaContableTipo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCuentaContableTipo.addColumn(tableColumn);
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
			
			this.jTableDatosCuentaContableTipo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCuentaContableTipo.moveColumn(this.jTableDatosCuentaContableTipo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCuentaContableTipo.moveColumn(this.jTableDatosCuentaContableTipo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCuentaContableTipo.moveColumn(this.jTableDatosCuentaContableTipo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCuentaContableTipo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCuentaContableTipo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCuentaContableTipo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCuentaContableTipo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCuentaContableTipo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCuentaContableTipo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCuentaContableTipo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cuentacontabletipoLogic.getCuentaContableTipos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cuentacontabletipos.size()-1;
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
		//this.jTableDatosCuentaContableTipo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCuentaContableTipo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCuentaContableTipo();
			
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
				
				//this.isEsNuevoCuentaContableTipo=false;
					
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
				if(this.cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCuentaContableTipo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaContableTipo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaContableTipo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cuentacontabletipo.getsType().equals("DUPLICADO")
				   || this.cuentacontabletipo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCuentaContableTipo=true;
				
				} else {
					this.isEsNuevoCuentaContableTipo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					if(this.cuentacontabletipo.getId()>=0 && !this.cuentacontabletipo.getIsNew()) {						
						this.isEsNuevoCuentaContableTipo=false;
						
					} else {
						this.isEsNuevoCuentaContableTipo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCuentaContableTipo(esRelaciones);						
				
				this.seleccionarCuentaContableTipo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cuentacontabletipo.getId()<0) {
					this.isEsNuevoCuentaContableTipo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCuentaContableTipo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCuentaContableTipo(evt,rowIndex);
				}	
				
				if(this.cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CuentaContableTipo: " + this.dDif); 
					}
				}								
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCuentaContableTipo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cuentacontabletipo)) {
					if(this.cuentacontabletipo.getId()>0) {
						this.cuentacontabletipo.setIsDeleted(true);
						
						this.cuentacontabletiposEliminados.add(this.cuentacontabletipo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentacontabletipoLogic.getCuentaContableTipos().remove(this.cuentacontabletipo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipos.remove(this.cuentacontabletipo);				
					}
					
					
					((CuentaContableTipoModel) this.jTableDatosCuentaContableTipo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaContableTipo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCuentaContableTipo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCuentaContableTipo) {
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaContableTipo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaContableTipo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCuentaContableTipo(this.cuentacontabletipo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cuentacontabletipoConstantesFunciones.cargarid_empresaCuentaContableTipo || this.cuentacontabletipoConstantesFunciones.event_dependid_empresaCuentaContableTipo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cuentacontabletipo.getid_empresa());
									//this.inicializarActualizarBindingCuentaContableTipo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cuentacontabletipo.getEmpresa()!=null) {
							this.empresasForeignKey.add(cuentacontabletipo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cuentacontabletipo.getid_empresa(),false,"Formulario");

					//TipoCuentaContableTipo
					if(!this.cuentacontabletipoConstantesFunciones.cargarid_tipo_cuenta_contable_tipoCuentaContableTipo || this.cuentacontabletipoConstantesFunciones.event_dependid_tipo_cuenta_contable_tipoCuentaContableTipo) {
						//this.cargarCombosTipoCuentaContableTiposForeignKeyLista(" where id="+this.cuentacontabletipo.getid_tipo_cuenta_contable_tipo());
									//this.inicializarActualizarBindingCuentaContableTipo(false,false);
						this.tipocuentacontabletiposForeignKey=new ArrayList<TipoCuentaContableTipo>();

						if(cuentacontabletipo.getTipoCuentaContableTipo()!=null) {
							this.tipocuentacontabletiposForeignKey.add(cuentacontabletipo.getTipoCuentaContableTipo());
						}

						this.addItemDefectoCombosForeignKeyTipoCuentaContableTipo();
						this.cargarCombosFrameTipoCuentaContableTiposForeignKey("Todos");
					}
					this.setActualTipoCuentaContableTipoForeignKey(this.cuentacontabletipo.getid_tipo_cuenta_contable_tipo(),false,"Formulario");

					//TipoProductoServicio
					if(!this.cuentacontabletipoConstantesFunciones.cargarid_tipo_producto_servicioCuentaContableTipo || this.cuentacontabletipoConstantesFunciones.event_dependid_tipo_producto_servicioCuentaContableTipo) {
						//this.cargarCombosTipoProductoServiciosForeignKeyLista(" where id="+this.cuentacontabletipo.getid_tipo_producto_servicio());
									//this.inicializarActualizarBindingCuentaContableTipo(false,false);
						this.tipoproductoserviciosForeignKey=new ArrayList<TipoProductoServicio>();

						if(cuentacontabletipo.getTipoProductoServicio()!=null) {
							this.tipoproductoserviciosForeignKey.add(cuentacontabletipo.getTipoProductoServicio());
						}

						this.addItemDefectoCombosForeignKeyTipoProductoServicio();
						this.cargarCombosFrameTipoProductoServiciosForeignKey("Todos");
					}
					this.setActualTipoProductoServicioForeignKey(this.cuentacontabletipo.getid_tipo_producto_servicio(),false,"Formulario");

					//CuentaContableVenta
					if(!this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_ventaCuentaContableTipo || this.cuentacontabletipoConstantesFunciones.event_dependid_cuenta_contable_ventaCuentaContableTipo) {
						//this.cargarCombosCuentaContableVentasForeignKeyLista(" where id="+this.cuentacontabletipo.getid_cuenta_contable_venta());
									//this.inicializarActualizarBindingCuentaContableTipo(false,false);
						this.cuentacontableventasForeignKey=new ArrayList<CuentaContable>();

						if(cuentacontabletipo.getCuentaContableVenta()!=null) {
							this.cuentacontableventasForeignKey.add(cuentacontabletipo.getCuentaContableVenta());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableVenta();
						this.cargarCombosFrameCuentaContableVentasForeignKey("Todos");
					}
					this.setActualCuentaContableVentaForeignKey(this.cuentacontabletipo.getid_cuenta_contable_venta(),false,"Formulario");

					//CuentaContableDescuento
					if(!this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_descuentoCuentaContableTipo || this.cuentacontabletipoConstantesFunciones.event_dependid_cuenta_contable_descuentoCuentaContableTipo) {
						//this.cargarCombosCuentaContableDescuentosForeignKeyLista(" where id="+this.cuentacontabletipo.getid_cuenta_contable_descuento());
									//this.inicializarActualizarBindingCuentaContableTipo(false,false);
						this.cuentacontabledescuentosForeignKey=new ArrayList<CuentaContable>();

						if(cuentacontabletipo.getCuentaContableDescuento()!=null) {
							this.cuentacontabledescuentosForeignKey.add(cuentacontabletipo.getCuentaContableDescuento());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableDescuento();
						this.cargarCombosFrameCuentaContableDescuentosForeignKey("Todos");
					}
					this.setActualCuentaContableDescuentoForeignKey(this.cuentacontabletipo.getid_cuenta_contable_descuento(),false,"Formulario");

					//CuentaContableDevolucion
					if(!this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_devolucionCuentaContableTipo || this.cuentacontabletipoConstantesFunciones.event_dependid_cuenta_contable_devolucionCuentaContableTipo) {
						//this.cargarCombosCuentaContableDevolucionsForeignKeyLista(" where id="+this.cuentacontabletipo.getid_cuenta_contable_devolucion());
									//this.inicializarActualizarBindingCuentaContableTipo(false,false);
						this.cuentacontabledevolucionsForeignKey=new ArrayList<CuentaContable>();

						if(cuentacontabletipo.getCuentaContableDevolucion()!=null) {
							this.cuentacontabledevolucionsForeignKey.add(cuentacontabletipo.getCuentaContableDevolucion());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableDevolucion();
						this.cargarCombosFrameCuentaContableDevolucionsForeignKey("Todos");
					}
					this.setActualCuentaContableDevolucionForeignKey(this.cuentacontabletipo.getid_cuenta_contable_devolucion(),false,"Formulario");

					//CuentaContableCosto
					if(!this.cuentacontabletipoConstantesFunciones.cargarid_cuenta_contable_costoCuentaContableTipo || this.cuentacontabletipoConstantesFunciones.event_dependid_cuenta_contable_costoCuentaContableTipo) {
						//this.cargarCombosCuentaContableCostosForeignKeyLista(" where id="+this.cuentacontabletipo.getid_cuenta_contable_costo());
									//this.inicializarActualizarBindingCuentaContableTipo(false,false);
						this.cuentacontablecostosForeignKey=new ArrayList<CuentaContable>();

						if(cuentacontabletipo.getCuentaContableCosto()!=null) {
							this.cuentacontablecostosForeignKey.add(cuentacontabletipo.getCuentaContableCosto());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCosto();
						this.cargarCombosFrameCuentaContableCostosForeignKey("Todos");
					}
					this.setActualCuentaContableCostoForeignKey(this.cuentacontabletipo.getid_cuenta_contable_costo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCuentaContableTipo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCuentaContableTipo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaContableTipo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaContableTipo(CuentaContableTipo cuentacontabletipo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCuentaContableTipo(cuentacontabletipo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaContableTipo(CuentaContableTipo cuentacontabletipo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCuentaContableTipo(cuentacontabletipo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCuentaContableTipo(cuentacontabletipo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCuentaContableTipo(cuentacontabletipo);
	}
	
	public void setVariablesObjetoActualToFormularioCuentaContableTipo(CuentaContableTipo cuentacontabletipo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCuentaContableTipo.jLabelidCuentaContableTipo.setText(cuentacontabletipo.getId().toString());
			this.jInternalFrameDetalleFormCuentaContableTipo.jTextAreanombreCuentaContableTipo.setText(cuentacontabletipo.getnombre());
			this.jInternalFrameDetalleFormCuentaContableTipo.jTextFielddigito_verificadorCuentaContableTipo.setText(cuentacontabletipo.getdigito_verificador().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CuentaContableTipo cuentacontabletipoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cuentacontabletipoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CuentaContableTipo cuentacontabletipoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cuentacontabletipoLocal=this.cuentacontabletipo;
			} else {
				cuentacontabletipoLocal=this.cuentacontabletipoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cuentacontabletipoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCuentaContableTipo(cuentacontabletipoLocal,true);
					
					if(cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cuentacontabletipoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cuentacontabletipoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCuentaContableTipo(CuentaContableTipo cuentacontabletipo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaContableTipo(cuentacontabletipo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(cuentacontabletipo);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaContableTipo(CuentaContableTipo cuentacontabletipo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaContableTipo(cuentacontabletipo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaContableTipo(CuentaContableTipo cuentacontabletipo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCuentaContableTipo.jLabelidCuentaContableTipo.getText()==null || this.jInternalFrameDetalleFormCuentaContableTipo.jLabelidCuentaContableTipo.getText()=="" || this.jInternalFrameDetalleFormCuentaContableTipo.jLabelidCuentaContableTipo.getText()=="Id") {
				this.jInternalFrameDetalleFormCuentaContableTipo.jLabelidCuentaContableTipo.setText("0");
			}

			if(conColumnasBase) {cuentacontabletipo.setId(Long.parseLong(this.jInternalFrameDetalleFormCuentaContableTipo.jLabelidCuentaContableTipo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaContableTipoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelIdCuentaContableTipo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentacontabletipo.setnombre(this.jInternalFrameDetalleFormCuentaContableTipo.jTextAreanombreCuentaContableTipo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaContableTipoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabelnombreCuentaContableTipo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentacontabletipo.setdigito_verificador(Integer.parseInt(this.jInternalFrameDetalleFormCuentaContableTipo.jTextFielddigito_verificadorCuentaContableTipo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaContableTipo.jLabeldigito_verificadorCuentaContableTipo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaContableTipo(CuentaContableTipo cuentacontabletipoBean,CuentaContableTipo cuentacontabletipo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cuentacontabletipoBean.getid_tipo_cuenta_contable_tipo()!=null && !cuentacontabletipoBean.getid_tipo_cuenta_contable_tipo().equals(-1L))) {cuentacontabletipo.setid_tipo_cuenta_contable_tipo(cuentacontabletipoBean.getid_tipo_cuenta_contable_tipo());}
			if(conDefault || (!conDefault && cuentacontabletipoBean.getid_tipo_producto_servicio()!=null && !cuentacontabletipoBean.getid_tipo_producto_servicio().equals(-1L))) {cuentacontabletipo.setid_tipo_producto_servicio(cuentacontabletipoBean.getid_tipo_producto_servicio());}
			if(conDefault || (!conDefault && cuentacontabletipoBean.getid_cuenta_contable_venta()!=null && !cuentacontabletipoBean.getid_cuenta_contable_venta().equals(null))) {cuentacontabletipo.setid_cuenta_contable_venta(cuentacontabletipoBean.getid_cuenta_contable_venta());}
			if(conDefault || (!conDefault && cuentacontabletipoBean.getid_cuenta_contable_descuento()!=null && !cuentacontabletipoBean.getid_cuenta_contable_descuento().equals(null))) {cuentacontabletipo.setid_cuenta_contable_descuento(cuentacontabletipoBean.getid_cuenta_contable_descuento());}
			if(conDefault || (!conDefault && cuentacontabletipoBean.getid_cuenta_contable_devolucion()!=null && !cuentacontabletipoBean.getid_cuenta_contable_devolucion().equals(null))) {cuentacontabletipo.setid_cuenta_contable_devolucion(cuentacontabletipoBean.getid_cuenta_contable_devolucion());}
			if(conDefault || (!conDefault && cuentacontabletipoBean.getid_cuenta_contable_costo()!=null && !cuentacontabletipoBean.getid_cuenta_contable_costo().equals(null))) {cuentacontabletipo.setid_cuenta_contable_costo(cuentacontabletipoBean.getid_cuenta_contable_costo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCuentaContableTipo(CuentaContableTipo cuentacontabletipoOrigen,CuentaContableTipo cuentacontabletipo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentacontabletipoOrigen.getId()!=null && !cuentacontabletipoOrigen.getId().equals(0L))) {cuentacontabletipo.setId(cuentacontabletipoOrigen.getId());}}
			if(conDefault || (!conDefault && cuentacontabletipoOrigen.getnombre()!=null && !cuentacontabletipoOrigen.getnombre().equals(""))) {cuentacontabletipo.setnombre(cuentacontabletipoOrigen.getnombre());}
			if(conDefault || (!conDefault && cuentacontabletipoOrigen.getdigito_verificador()!=null && !cuentacontabletipoOrigen.getdigito_verificador().equals(0))) {cuentacontabletipo.setdigito_verificador(cuentacontabletipoOrigen.getdigito_verificador());}
			if(conDefault || (!conDefault && cuentacontabletipoOrigen.getid_tipo_cuenta_contable_tipo()!=null && !cuentacontabletipoOrigen.getid_tipo_cuenta_contable_tipo().equals(-1L))) {cuentacontabletipo.setid_tipo_cuenta_contable_tipo(cuentacontabletipoOrigen.getid_tipo_cuenta_contable_tipo());}
			if(conDefault || (!conDefault && cuentacontabletipoOrigen.getid_tipo_producto_servicio()!=null && !cuentacontabletipoOrigen.getid_tipo_producto_servicio().equals(-1L))) {cuentacontabletipo.setid_tipo_producto_servicio(cuentacontabletipoOrigen.getid_tipo_producto_servicio());}
			if(conDefault || (!conDefault && cuentacontabletipoOrigen.getid_cuenta_contable_venta()!=null && !cuentacontabletipoOrigen.getid_cuenta_contable_venta().equals(null))) {cuentacontabletipo.setid_cuenta_contable_venta(cuentacontabletipoOrigen.getid_cuenta_contable_venta());}
			if(conDefault || (!conDefault && cuentacontabletipoOrigen.getid_cuenta_contable_descuento()!=null && !cuentacontabletipoOrigen.getid_cuenta_contable_descuento().equals(null))) {cuentacontabletipo.setid_cuenta_contable_descuento(cuentacontabletipoOrigen.getid_cuenta_contable_descuento());}
			if(conDefault || (!conDefault && cuentacontabletipoOrigen.getid_cuenta_contable_devolucion()!=null && !cuentacontabletipoOrigen.getid_cuenta_contable_devolucion().equals(null))) {cuentacontabletipo.setid_cuenta_contable_devolucion(cuentacontabletipoOrigen.getid_cuenta_contable_devolucion());}
			if(conDefault || (!conDefault && cuentacontabletipoOrigen.getid_cuenta_contable_costo()!=null && !cuentacontabletipoOrigen.getid_cuenta_contable_costo().equals(null))) {cuentacontabletipo.setid_cuenta_contable_costo(cuentacontabletipoOrigen.getid_cuenta_contable_costo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaContableTipo(CuentaContableTipo cuentacontabletipo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaContableTipo.jLabelidCuentaContableTipo.setText(cuentacontabletipo.getId().toString());
			this.jInternalFrameDetalleFormCuentaContableTipo.jTextAreanombreCuentaContableTipo.setText(cuentacontabletipo.getnombre());
			this.jInternalFrameDetalleFormCuentaContableTipo.jTextFielddigito_verificadorCuentaContableTipo.setText(cuentacontabletipo.getdigito_verificador().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaContableTipo(CuentaContableTipoBean cuentacontabletipoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaContableTipo.jLabelidCuentaContableTipo.setText(cuentacontabletipoBean.getId().toString());
			this.jInternalFrameDetalleFormCuentaContableTipo.jTextAreanombreCuentaContableTipo.setText(cuentacontabletipoBean.getnombre());
			this.jInternalFrameDetalleFormCuentaContableTipo.jTextFielddigito_verificadorCuentaContableTipo.setText(cuentacontabletipoBean.getdigito_verificador().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCuentaContableTipo(CuentaContableTipoParameterReturnGeneral cuentacontabletipoReturnGeneral,CuentaContableTipoBean cuentacontabletipoBean,Boolean conDefault) throws Exception { 
		try {
			CuentaContableTipo cuentacontabletipoLocal=new CuentaContableTipo();
			
			cuentacontabletipoLocal=cuentacontabletipoReturnGeneral.getCuentaContableTipo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentacontabletipoLocal.getId()!=null && !cuentacontabletipoLocal.getId().equals(0L))) {cuentacontabletipoBean.setId(cuentacontabletipoLocal.getId());}}
			if(conDefault || (!conDefault && cuentacontabletipoLocal.getnombre()!=null && !cuentacontabletipoLocal.getnombre().equals(""))) {cuentacontabletipoBean.setnombre(cuentacontabletipoLocal.getnombre());}
			if(conDefault || (!conDefault && cuentacontabletipoLocal.getdigito_verificador()!=null && !cuentacontabletipoLocal.getdigito_verificador().equals(0))) {cuentacontabletipoBean.setdigito_verificador(cuentacontabletipoLocal.getdigito_verificador());}
			if(conDefault || (!conDefault && cuentacontabletipoLocal.getid_tipo_cuenta_contable_tipo()!=null && !cuentacontabletipoLocal.getid_tipo_cuenta_contable_tipo().equals(-1L))) {cuentacontabletipoBean.setid_tipo_cuenta_contable_tipo(cuentacontabletipoLocal.getid_tipo_cuenta_contable_tipo());}
			if(conDefault || (!conDefault && cuentacontabletipoLocal.getid_tipo_producto_servicio()!=null && !cuentacontabletipoLocal.getid_tipo_producto_servicio().equals(-1L))) {cuentacontabletipoBean.setid_tipo_producto_servicio(cuentacontabletipoLocal.getid_tipo_producto_servicio());}
			if(conDefault || (!conDefault && cuentacontabletipoLocal.getid_cuenta_contable_venta()!=null && !cuentacontabletipoLocal.getid_cuenta_contable_venta().equals(null))) {cuentacontabletipoBean.setid_cuenta_contable_venta(cuentacontabletipoLocal.getid_cuenta_contable_venta());}
			if(conDefault || (!conDefault && cuentacontabletipoLocal.getid_cuenta_contable_descuento()!=null && !cuentacontabletipoLocal.getid_cuenta_contable_descuento().equals(null))) {cuentacontabletipoBean.setid_cuenta_contable_descuento(cuentacontabletipoLocal.getid_cuenta_contable_descuento());}
			if(conDefault || (!conDefault && cuentacontabletipoLocal.getid_cuenta_contable_devolucion()!=null && !cuentacontabletipoLocal.getid_cuenta_contable_devolucion().equals(null))) {cuentacontabletipoBean.setid_cuenta_contable_devolucion(cuentacontabletipoLocal.getid_cuenta_contable_devolucion());}
			if(conDefault || (!conDefault && cuentacontabletipoLocal.getid_cuenta_contable_costo()!=null && !cuentacontabletipoLocal.getid_cuenta_contable_costo().equals(null))) {cuentacontabletipoBean.setid_cuenta_contable_costo(cuentacontabletipoLocal.getid_cuenta_contable_costo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCuentaContableTipoGenerico(Long idCuentaContableTipoSeleccionado,JComboBox jComboBoxCuentaContableTipo,List<CuentaContableTipo> cuentacontabletiposLocal)throws Exception {
		try {
			CuentaContableTipo  cuentacontabletipoTemp=null;

			for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletiposLocal) {
				if(cuentacontabletipoAux.getId()!=null && cuentacontabletipoAux.getId().equals(idCuentaContableTipoSeleccionado)) {
					cuentacontabletipoTemp=cuentacontabletipoAux;
					break;
				}
			}

			jComboBoxCuentaContableTipo.setSelectedItem(cuentacontabletipoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCuentaContableTipoGenerico(JComboBox jComboBoxCuentaContableTipo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaContableTipo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCuentaContableTipo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaContableTipo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCuentaContableTipo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacontabletipo=(CuentaContableTipo) cuentacontabletipoLogic.getCuentaContableTipos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentacontabletipo =(CuentaContableTipo) cuentacontabletipos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cuentacontabletipo.getIsNew() && !cuentacontabletipo.getIsChanged() && !cuentacontabletipo.getIsDeleted()) {
				sDescripcion=cuentacontabletipo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacontabletipo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoCuentaContableTipo")) {
			//sDescripcion=this.getActualTipoCuentaContableTipoForeignKeyDescripcion((Long)value);
			if(!cuentacontabletipo.getIsNew() && !cuentacontabletipo.getIsChanged() && !cuentacontabletipo.getIsDeleted()) {
				sDescripcion=cuentacontabletipo.gettipocuentacontabletipo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCuentaContableTipoForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacontabletipo.gettipocuentacontabletipo_descripcion();
			}
		}

		if(sTipo.equals("TipoProductoServicio")) {
			//sDescripcion=this.getActualTipoProductoServicioForeignKeyDescripcion((Long)value);
			if(!cuentacontabletipo.getIsNew() && !cuentacontabletipo.getIsChanged() && !cuentacontabletipo.getIsDeleted()) {
				sDescripcion=cuentacontabletipo.gettipoproductoservicio_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoServicioForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacontabletipo.gettipoproductoservicio_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableVenta")) {
			//sDescripcion=this.getActualCuentaContableVentaForeignKeyDescripcion((Long)value);
			if(!cuentacontabletipo.getIsNew() && !cuentacontabletipo.getIsChanged() && !cuentacontabletipo.getIsDeleted()) {
				sDescripcion=cuentacontabletipo.getcuentacontableventa_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableVentaForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacontabletipo.getcuentacontableventa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableDescuento")) {
			//sDescripcion=this.getActualCuentaContableDescuentoForeignKeyDescripcion((Long)value);
			if(!cuentacontabletipo.getIsNew() && !cuentacontabletipo.getIsChanged() && !cuentacontabletipo.getIsDeleted()) {
				sDescripcion=cuentacontabletipo.getcuentacontabledescuento_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableDescuentoForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacontabletipo.getcuentacontabledescuento_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableDevolucion")) {
			//sDescripcion=this.getActualCuentaContableDevolucionForeignKeyDescripcion((Long)value);
			if(!cuentacontabletipo.getIsNew() && !cuentacontabletipo.getIsChanged() && !cuentacontabletipo.getIsDeleted()) {
				sDescripcion=cuentacontabletipo.getcuentacontabledevolucion_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableDevolucionForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacontabletipo.getcuentacontabledevolucion_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCosto")) {
			//sDescripcion=this.getActualCuentaContableCostoForeignKeyDescripcion((Long)value);
			if(!cuentacontabletipo.getIsNew() && !cuentacontabletipo.getIsChanged() && !cuentacontabletipo.getIsDeleted()) {
				sDescripcion=cuentacontabletipo.getcuentacontablecosto_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCostoForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacontabletipo.getcuentacontablecosto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CuentaContableTipo cuentacontabletipoRow=new CuentaContableTipo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacontabletipoRow=(CuentaContableTipo) cuentacontabletipoLogic.getCuentaContableTipos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentacontabletipoRow=(CuentaContableTipo) cuentacontabletipos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCuentaContableTipo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoCuentaContableTipo && this.isPermisoNuevoCuentaContableTipo));			
			this.jButtonDuplicarCuentaContableTipo.setVisible((this.isVisibilidadCeldaDuplicarCuentaContableTipo && this.isPermisoDuplicarCuentaContableTipo));			
			this.jButtonCopiarCuentaContableTipo.setVisible((this.isVisibilidadCeldaCopiarCuentaContableTipo && this.isPermisoCopiarCuentaContableTipo));
			this.jButtonVerFormCuentaContableTipo.setVisible((this.isVisibilidadCeldaVerFormCuentaContableTipo && this.isPermisoVerFormCuentaContableTipo));
			
			this.jButtonAbrirOrderByCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenCuentaContableTipo && this.isPermisoOrdenCuentaContableTipo));			
			
			this.jButtonNuevoRelacionesCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo && this.isPermisoNuevoCuentaContableTipo));			
			this.jButtonNuevoGuardarCambiosCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoCuentaContableTipo && this.isPermisoNuevoCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo));
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonModificarCuentaContableTipo.setVisible((this.isVisibilidadCeldaModificarCuentaContableTipo && this.isPermisoActualizarCuentaContableTipo));	
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonActualizarCuentaContableTipo.setVisible((this.isVisibilidadCeldaActualizarCuentaContableTipo && this.isPermisoActualizarCuentaContableTipo));	
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonEliminarCuentaContableTipo.setVisible((this.isVisibilidadCeldaEliminarCuentaContableTipo && this.isPermisoEliminarCuentaContableTipo));
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonCancelarCuentaContableTipo.setVisible(this.isVisibilidadCeldaCancelarCuentaContableTipo);							
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo));			
			
			}
						
			this.jButtonGuardarCambiosTablaCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoCuentaContableTipo && this.isPermisoNuevoCuentaContableTipo));						
			this.jButtonDuplicarToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaDuplicarCuentaContableTipo && this.isPermisoDuplicarCuentaContableTipo));						
			this.jButtonCopiarToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaCopiarCuentaContableTipo && this.isPermisoCopiarCuentaContableTipo));			
			this.jButtonVerFormToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaVerFormCuentaContableTipo && this.isPermisoVerFormCuentaContableTipo));			
			this.jButtonAbrirOrderByToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenCuentaContableTipo && this.isPermisoOrdenCuentaContableTipo));
			this.jButtonNuevoRelacionesToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo && this.isPermisoNuevoCuentaContableTipo));			
			this.jButtonNuevoGuardarCambiosToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoCuentaContableTipo && this.isPermisoNuevoCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo));			
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonModificarToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaModificarCuentaContableTipo && this.isPermisoActualizarCuentaContableTipo));	
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonActualizarToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaActualizarCuentaContableTipo  && this.isPermisoActualizarCuentaContableTipo));	
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonEliminarToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaEliminarCuentaContableTipo && this.isPermisoEliminarCuentaContableTipo));
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonCancelarToolBarCuentaContableTipo.setVisible(this.isVisibilidadCeldaCancelarCuentaContableTipo);				
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoCuentaContableTipo && this.isPermisoNuevoCuentaContableTipo));			
			this.jMenuItemDuplicarCuentaContableTipo.setVisible((this.isVisibilidadCeldaDuplicarCuentaContableTipo && this.isPermisoDuplicarCuentaContableTipo));			
			this.jMenuItemCopiarCuentaContableTipo.setVisible((this.isVisibilidadCeldaCopiarCuentaContableTipo && this.isPermisoCopiarCuentaContableTipo));			
			this.jMenuItemVerFormCuentaContableTipo.setVisible((this.isVisibilidadCeldaVerFormCuentaContableTipo && this.isPermisoVerFormCuentaContableTipo));			
			this.jMenuItemAbrirOrderByCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenCuentaContableTipo && this.isPermisoOrdenCuentaContableTipo));			
			//this.jMenuItemMostrarOcultarCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenCuentaContableTipo && this.isPermisoOrdenCuentaContableTipo));
			this.jMenuItemDetalleAbrirOrderByCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenCuentaContableTipo && this.isPermisoOrdenCuentaContableTipo));			
			//this.jMenuItemDetalleMostrarOcultarCuentaContableTipo.setVisible((this.isVisibilidadCeldaOrdenCuentaContableTipo && this.isPermisoOrdenCuentaContableTipo));			
			this.jMenuItemNuevoRelacionesCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo && this.isPermisoNuevoCuentaContableTipo));			
			this.jMenuItemNuevoGuardarCambiosCuentaContableTipo.setVisible((this.isVisibilidadCeldaNuevoCuentaContableTipo && this.isPermisoNuevoCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo));									
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemModificarCuentaContableTipo.setVisible((this.isVisibilidadCeldaModificarCuentaContableTipo && this.isPermisoActualizarCuentaContableTipo));	
			this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemActualizarCuentaContableTipo.setVisible((this.isVisibilidadCeldaActualizarCuentaContableTipo && this.isPermisoActualizarCuentaContableTipo));	
			this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemEliminarCuentaContableTipo.setVisible((this.isVisibilidadCeldaEliminarCuentaContableTipo && this.isPermisoEliminarCuentaContableTipo));
			this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemCancelarCuentaContableTipo.setVisible(this.isVisibilidadCeldaCancelarCuentaContableTipo);				
			}
			
			this.jMenuItemGuardarCambiosCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo));						
			this.jMenuItemGuardarCambiosTablaCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCuentaContableTipo=this.jButtonNuevoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaDuplicarCuentaContableTipo=this.jButtonDuplicarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaCopiarCuentaContableTipo=this.jButtonCopiarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaVerFormCuentaContableTipo=this.jButtonVerFormCuentaContableTipo.isVisible();
			
			this.isVisibilidadCeldaOrdenCuentaContableTipo=this.jButtonAbrirOrderByCuentaContableTipo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=this.jButtonNuevoRelacionesCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaModificarCuentaContableTipo=this.jButtonModificarCuentaContableTipo.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			this.isVisibilidadCeldaActualizarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jButtonActualizarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaEliminarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jButtonEliminarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaCancelarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jButtonCancelarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaGuardarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosCuentaContableTipo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=this.jButtonGuardarCambiosTablaCuentaContableTipo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCuentaContableTipo=this.jButtonNuevoToolBarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=this.jButtonNuevoRelacionesToolBarCuentaContableTipo.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			this.isVisibilidadCeldaModificarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jButtonModificarToolBarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaActualizarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jButtonActualizarToolBarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaEliminarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jButtonEliminarToolBarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaCancelarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jButtonCancelarToolBarCuentaContableTipo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaContableTipo=this.jButtonGuardarCambiosToolBarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=this.jButtonGuardarCambiosTablaToolBarCuentaContableTipo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCuentaContableTipo=this.jMenuItemNuevoCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=this.jMenuItemNuevoRelacionesCuentaContableTipo.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			this.isVisibilidadCeldaModificarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemModificarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaActualizarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemActualizarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaEliminarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemEliminarCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaCancelarCuentaContableTipo=this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemCancelarCuentaContableTipo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaContableTipo=this.jMenuItemGuardarCambiosCuentaContableTipo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=this.jMenuItemGuardarCambiosTablaCuentaContableTipo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCuentaContableTipo(Boolean esInicializar) {
		if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
				//if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaContableTipo();
			}
			
			this.inicializarActualizarBindingBotonesManualCuentaContableTipo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCuentaContableTipo() {
		this.jButtonNuevoCuentaContableTipo.setVisible(this.isPermisoNuevoCuentaContableTipo);			
		this.jButtonDuplicarCuentaContableTipo.setVisible(this.isPermisoDuplicarCuentaContableTipo);			
		this.jButtonCopiarCuentaContableTipo.setVisible(this.isPermisoCopiarCuentaContableTipo);			
		this.jButtonVerFormCuentaContableTipo.setVisible(this.isPermisoVerFormCuentaContableTipo);			
		
		this.jButtonAbrirOrderByCuentaContableTipo.setVisible(this.isPermisoOrdenCuentaContableTipo);					
		
		this.jButtonNuevoRelacionesCuentaContableTipo.setVisible(this.isPermisoNuevoCuentaContableTipo);			
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonModificarCuentaContableTipo.setVisible(this.isPermisoActualizarCuentaContableTipo);	
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonActualizarCuentaContableTipo.setVisible(this.isPermisoActualizarCuentaContableTipo);	
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonEliminarCuentaContableTipo.setVisible(this.isPermisoEliminarCuentaContableTipo);
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonCancelarCuentaContableTipo.setVisible(this.isVisibilidadCeldaCancelarCuentaContableTipo);						
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosCuentaContableTipo.setVisible(this.isPermisoGuardarCambiosCuentaContableTipo);							
		}
		
		this.jButtonGuardarCambiosTablaCuentaContableTipo.setVisible(this.isPermisoActualizarCuentaContableTipo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaContableTipo() {
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonModificarCuentaContableTipo.setVisible(this.isPermisoActualizarCuentaContableTipo);	
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonActualizarCuentaContableTipo.setVisible(this.isPermisoActualizarCuentaContableTipo);	
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonEliminarCuentaContableTipo.setVisible(this.isPermisoEliminarCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonCancelarCuentaContableTipo.setVisible(this.isVisibilidadCeldaCancelarCuentaContableTipo);							
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosCuentaContableTipo.setVisible((this.isVisibilidadCeldaGuardarCuentaContableTipo && this.isPermisoGuardarCambiosCuentaContableTipo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCuentaContableTipo() {
		if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCuentaContableTipo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCuentaContableTipo() {
	}
	
	public void jTableDatosCuentaContableTipoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCuentaContableTipo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontabletipo==null) {
						this.cuentacontabletipo = new CuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				}

				if(this.cuentacontabletipo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cuentacontabletipo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCuentaContableTipoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCuentaContableTipo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaContableTipo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaContableTipo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cuentacontabletipoLogic.getConnexion());

				if(this.cuentacontabletipo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cuentacontabletipo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontabletipo==null) {
						this.cuentacontabletipo = new CuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				}

				if(this.cuentacontabletipo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cuentacontabletipo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontabletipo==null) {
						this.cuentacontabletipo = new CuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				}

				if(this.cuentacontabletipo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cuentacontabletipo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondigito_verificadorCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontabletipo==null) {
						this.cuentacontabletipo = new CuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				}

				if(this.cuentacontabletipo.getdigito_verificador()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where digito_verificador = "+this.cuentacontabletipo.getdigito_verificador().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocuentacontabletipo=true;

			idTienePermisotipocuentacontabletipo=this.tienePermisosUsuarioEnPaginaWebCuentaContableTipo(TipoCuentaContableTipoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocuentacontabletipo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaContableTipo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaContableTipo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);

				this.tipocuentacontabletipoBeanSwingJInternalFrame=new TipoCuentaContableTipoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocuentacontabletipoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocuentacontabletipoBeanSwingJInternalFrame.getTipoCuentaContableTipoLogic().setConnexion(this.cuentacontabletipoLogic.getConnexion());

				if(this.cuentacontabletipo.getid_tipo_cuenta_contable_tipo()!=null) {
					this.tipocuentacontabletipoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocuentacontabletipoBeanSwingJInternalFrame.setIdActual(this.cuentacontabletipo.getid_tipo_cuenta_contable_tipo());
					this.tipocuentacontabletipoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocuentacontabletipoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocuentacontabletipoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuentaContableTipo();
				}

				JInternalFrameBase jinternalFrame =this.tipocuentacontabletipoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
				TitledBorder titledBordertipocuentacontabletipo=(TitledBorder)this.tipocuentacontabletipoBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaContableTipo.getBorder();

				titledBordertipocuentacontabletipo.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Tipo Cuenta Contable Tipo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontabletipo==null) {
						this.cuentacontabletipo = new CuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				}

				if(this.cuentacontabletipo.getid_tipo_cuenta_contable_tipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_cuenta_contable_tipo = "+this.cuentacontabletipo.getid_tipo_cuenta_contable_tipo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_producto_servicioCuentaContableTipoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproductoservicio=true;

			idTienePermisotipoproductoservicio=this.tienePermisosUsuarioEnPaginaWebCuentaContableTipo(TipoProductoServicioConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproductoservicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaContableTipo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaContableTipo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);

				this.tipoproductoservicioBeanSwingJInternalFrame=new TipoProductoServicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoservicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoservicioBeanSwingJInternalFrame.getTipoProductoServicioLogic().setConnexion(this.cuentacontabletipoLogic.getConnexion());

				if(this.cuentacontabletipo.getid_tipo_producto_servicio()!=null) {
					this.tipoproductoservicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoservicioBeanSwingJInternalFrame.setIdActual(this.cuentacontabletipo.getid_tipo_producto_servicio());
					this.tipoproductoservicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoservicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoservicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProductoServicio();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoservicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
				TitledBorder titledBordertipoproductoservicio=(TitledBorder)this.tipoproductoservicioBeanSwingJInternalFrame.jScrollPanelDatosTipoProductoServicio.getBorder();

				titledBordertipoproductoservicio.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Tipo Producto Servicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_producto_servicioCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontabletipo==null) {
						this.cuentacontabletipo = new CuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				}

				if(this.cuentacontabletipo.getid_tipo_producto_servicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto_servicio = "+this.cuentacontabletipo.getid_tipo_producto_servicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_ventaCuentaContableTipoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontableventaBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontableventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontableventaBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableVenta";

			if(!this.sFinalQueryGeneral_cuentacontableventa.equals("")) {
				this.cuentacontableventaBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontableventa);
				this.cuentacontableventaBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontableventaBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontableventaBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontableventaBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableVenta.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontableventaBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCuentaContableTipo=null;
			TitledBorder titledBordercuentacontableventa=null;

			if(!this.jScrollPanelDatosCuentaContableTipo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
				titledBordercuentacontableventa=(TitledBorder)this.cuentacontableventaBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontableventa.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_ventaCuentaContableTipoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontableventa=true;

			idTienePermisocuentacontableventa=this.tienePermisosUsuarioEnPaginaWebCuentaContableTipo(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontableventa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaContableTipo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaContableTipo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);

				this.cuentacontableventaBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableventaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableventaBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cuentacontabletipoLogic.getConnexion());

				if(this.cuentacontabletipo.getid_cuenta_contable_venta()!=null) {
					this.cuentacontableventaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableventaBeanSwingJInternalFrame.setIdActual(this.cuentacontabletipo.getid_cuenta_contable_venta());
					this.cuentacontableventaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableventaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableventaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
				TitledBorder titledBordercuentacontableventa=(TitledBorder)this.cuentacontableventaBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontableventa.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_ventaCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontabletipo==null) {
						this.cuentacontabletipo = new CuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				}

				if(this.cuentacontabletipo.getid_cuenta_contable_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_venta = "+this.cuentacontabletipo.getid_cuenta_contable_venta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_descuentoCuentaContableTipoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontabledescuentoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontabledescuentoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontabledescuentoBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableDescuento";

			if(!this.sFinalQueryGeneral_cuentacontabledescuento.equals("")) {
				this.cuentacontabledescuentoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontabledescuento);
				this.cuentacontabledescuentoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontabledescuentoBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontabledescuentoBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontabledescuentoBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableDescuento.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontabledescuentoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCuentaContableTipo=null;
			TitledBorder titledBordercuentacontabledescuento=null;

			if(!this.jScrollPanelDatosCuentaContableTipo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
				titledBordercuentacontabledescuento=(TitledBorder)this.cuentacontabledescuentoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledescuento.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontabledescuento=true;

			idTienePermisocuentacontabledescuento=this.tienePermisosUsuarioEnPaginaWebCuentaContableTipo(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontabledescuento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaContableTipo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaContableTipo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);

				this.cuentacontabledescuentoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontabledescuentoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontabledescuentoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cuentacontabletipoLogic.getConnexion());

				if(this.cuentacontabletipo.getid_cuenta_contable_descuento()!=null) {
					this.cuentacontabledescuentoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontabledescuentoBeanSwingJInternalFrame.setIdActual(this.cuentacontabletipo.getid_cuenta_contable_descuento());
					this.cuentacontabledescuentoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontabledescuentoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontabledescuentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontabledescuentoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
				TitledBorder titledBordercuentacontabledescuento=(TitledBorder)this.cuentacontabledescuentoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledescuento.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_descuentoCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontabletipo==null) {
						this.cuentacontabletipo = new CuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				}

				if(this.cuentacontabletipo.getid_cuenta_contable_descuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_descuento = "+this.cuentacontabletipo.getid_cuenta_contable_descuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_devolucionCuentaContableTipoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontabledevolucionBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontabledevolucionBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontabledevolucionBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableDevolucion";

			if(!this.sFinalQueryGeneral_cuentacontabledevolucion.equals("")) {
				this.cuentacontabledevolucionBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontabledevolucion);
				this.cuentacontabledevolucionBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontabledevolucionBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontabledevolucionBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontabledevolucionBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableDevolucion.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontabledevolucionBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCuentaContableTipo=null;
			TitledBorder titledBordercuentacontabledevolucion=null;

			if(!this.jScrollPanelDatosCuentaContableTipo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
				titledBordercuentacontabledevolucion=(TitledBorder)this.cuentacontabledevolucionBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledevolucion.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontabledevolucion=true;

			idTienePermisocuentacontabledevolucion=this.tienePermisosUsuarioEnPaginaWebCuentaContableTipo(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontabledevolucion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaContableTipo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaContableTipo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);

				this.cuentacontabledevolucionBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontabledevolucionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontabledevolucionBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cuentacontabletipoLogic.getConnexion());

				if(this.cuentacontabletipo.getid_cuenta_contable_devolucion()!=null) {
					this.cuentacontabledevolucionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontabledevolucionBeanSwingJInternalFrame.setIdActual(this.cuentacontabletipo.getid_cuenta_contable_devolucion());
					this.cuentacontabledevolucionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontabledevolucionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontabledevolucionBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontabledevolucionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
				TitledBorder titledBordercuentacontabledevolucion=(TitledBorder)this.cuentacontabledevolucionBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledevolucion.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_devolucionCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontabletipo==null) {
						this.cuentacontabletipo = new CuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				}

				if(this.cuentacontabletipo.getid_cuenta_contable_devolucion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_devolucion = "+this.cuentacontabletipo.getid_cuenta_contable_devolucion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_costoCuentaContableTipoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontablecostoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontablecostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontablecostoBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableCosto";

			if(!this.sFinalQueryGeneral_cuentacontablecosto.equals("")) {
				this.cuentacontablecostoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontablecosto);
				this.cuentacontablecostoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontablecostoBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontablecostoBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontablecostoBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableCosto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontablecostoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCuentaContableTipo=null;
			TitledBorder titledBordercuentacontablecosto=null;

			if(!this.jScrollPanelDatosCuentaContableTipo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
				titledBordercuentacontablecosto=(TitledBorder)this.cuentacontablecostoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecosto.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_costoCuentaContableTipoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecosto=true;

			idTienePermisocuentacontablecosto=this.tienePermisosUsuarioEnPaginaWebCuentaContableTipo(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaContableTipo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaContableTipo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);

				this.cuentacontablecostoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecostoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cuentacontabletipoLogic.getConnexion());

				if(this.cuentacontabletipo.getid_cuenta_contable_costo()!=null) {
					this.cuentacontablecostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecostoBeanSwingJInternalFrame.setIdActual(this.cuentacontabletipo.getid_cuenta_contable_costo());
					this.cuentacontablecostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaContableTipo=(TitledBorder)this.jScrollPanelDatosCuentaContableTipo.getBorder();
				TitledBorder titledBordercuentacontablecosto=(TitledBorder)this.cuentacontablecostoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecosto.setTitle(titledBorderCuentaContableTipo.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_costoCuentaContableTipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.getcuentacontabletipo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacontabletipo==null) {
						this.cuentacontabletipo = new CuentaContableTipo();
					}

					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);
				}

				if(this.cuentacontabletipo.getid_cuenta_contable_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_costo = "+this.cuentacontabletipo.getid_cuenta_contable_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaContableTipo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContableTipo(false,false);

			this.getCuentaContableTiposBusquedaPorNombre();

			this.inicializarActualizarBindingCuentaContableTipo(false);

			//if(CuentaContableTipoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContableTipo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCostoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContableTipo(false,false);

			this.getCuentaContableTiposFK_IdCuentaContableCosto();

			this.inicializarActualizarBindingCuentaContableTipo(false);

			//if(CuentaContableTipoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContableTipo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableDescuentoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContableTipo(false,false);

			this.getCuentaContableTiposFK_IdCuentaContableDescuento();

			this.inicializarActualizarBindingCuentaContableTipo(false);

			//if(CuentaContableTipoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContableTipo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableDevolucionCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContableTipo(false,false);

			this.getCuentaContableTiposFK_IdCuentaContableDevolucion();

			this.inicializarActualizarBindingCuentaContableTipo(false);

			//if(CuentaContableTipoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContableTipo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableVentaCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContableTipo(false,false);

			this.getCuentaContableTiposFK_IdCuentaContableVenta();

			this.inicializarActualizarBindingCuentaContableTipo(false);

			//if(CuentaContableTipoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContableTipo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContableTipo(false,false);

			this.getCuentaContableTiposFK_IdEmpresa();

			this.inicializarActualizarBindingCuentaContableTipo(false);

			//if(CuentaContableTipoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContableTipo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCuentaContableTipoCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContableTipo(false,false);

			this.getCuentaContableTiposFK_IdTipoCuentaContableTipo();

			this.inicializarActualizarBindingCuentaContableTipo(false);

			//if(CuentaContableTipoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContableTipo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoServicioCuentaContableTipoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaContableTipo(false,false);

			this.getCuentaContableTiposFK_IdTipoProductoServicio();

			this.inicializarActualizarBindingCuentaContableTipo(false);

			//if(CuentaContableTipoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaContableTipo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacontabletipoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCuentaContableTipo() {
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
			this.jInternalFrameDetalleFormCuentaContableTipo.setVisible(false);	    			
			this.jInternalFrameDetalleFormCuentaContableTipo.dispose();
			this.jInternalFrameDetalleFormCuentaContableTipo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCuentaContableTipo!=null) {
			this.jInternalFrameReporteDinamicoCuentaContableTipo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCuentaContableTipo.dispose();
			this.jInternalFrameReporteDinamicoCuentaContableTipo=null;
		}
		
		if(this.jInternalFrameImportacionCuentaContableTipo!=null) {
			this.jInternalFrameImportacionCuentaContableTipo.setVisible(false);	    			
			this.jInternalFrameImportacionCuentaContableTipo.dispose();
			this.jInternalFrameImportacionCuentaContableTipo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCuentaContableTipo();
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCuentaContableTipo")) {
				jButtonNuevoCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCuentaContableTipo")) {
				jButtonDuplicarCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCuentaContableTipo")) {
				jButtonCopiarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCuentaContableTipo")) {
				jButtonVerFormCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCuentaContableTipo")) {
				jButtonNuevoCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCuentaContableTipo")) {
				jButtonDuplicarCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCuentaContableTipo")) {
				jButtonNuevoCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCuentaContableTipo")) {
				jButtonDuplicarCuentaContableTipoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCuentaContableTipo")) {
				jButtonNuevoCuentaContableTipoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCuentaContableTipo")) {
				jButtonNuevoCuentaContableTipoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCuentaContableTipo")) {
				jButtonNuevoCuentaContableTipoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCuentaContableTipo")) {
				jButtonModificarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCuentaContableTipo")) {
				jButtonModificarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCuentaContableTipo")) {
				jButtonModificarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCuentaContableTipo")) {
				jButtonActualizarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCuentaContableTipo")) {
				jButtonActualizarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCuentaContableTipo")) {
				jButtonActualizarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCuentaContableTipo")) {
				jButtonEliminarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCuentaContableTipo")) {
				jButtonEliminarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCuentaContableTipo")) {
				jButtonEliminarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCuentaContableTipo")) {
				jButtonCancelarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCuentaContableTipo")) {
				jButtonCancelarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCuentaContableTipo")) {
				jButtonCancelarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCuentaContableTipo")) {
				jButtonCerrarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCuentaContableTipo")) {
				jButtonCerrarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCuentaContableTipo")) {
				jButtonCerrarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCuentaContableTipo")) {
				jButtonMostrarOcultarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCuentaContableTipo")) {
				jButtonCancelarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCuentaContableTipo")) {
				jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCuentaContableTipo")) {
				jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCuentaContableTipo")) {
				jButtonCopiarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCuentaContableTipo")) {
				jButtonVerFormCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCuentaContableTipo")) {
				jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCuentaContableTipo")) {
				jButtonCopiarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCuentaContableTipo")) {
				jButtonVerFormCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCuentaContableTipo")) {
				jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCuentaContableTipo")) {
				jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCuentaContableTipo")) {
				jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCuentaContableTipo")) {
				jButtonRecargarInformacionCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCuentaContableTipo")) {
				jButtonRecargarInformacionCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCuentaContableTipo")) {
				jButtonRecargarInformacionCuentaContableTipoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCuentaContableTipo")) {
				jButtonAnterioresCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCuentaContableTipo")) {
				jButtonAnterioresCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCuentaContableTipo")) {
				jButtonAnterioresCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCuentaContableTipo")) {
				jButtonSiguientesCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCuentaContableTipo")) {
				jButtonSiguientesCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCuentaContableTipo")) {
				jButtonSiguientesCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCuentaContableTipo") || sTipo.equals("MenuItemDetalleAbrirOrderByCuentaContableTipo")) {
				jButtonAbrirOrderByCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCuentaContableTipo") || sTipo.equals("MenuItemDetalleMostrarOcultarCuentaContableTipo")) {
				jButtonMostrarOcultarCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaContableTipo")) {
				jButtonNuevoGuardarCambiosCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCuentaContableTipo")) {
				jButtonNuevoGuardarCambiosCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCuentaContableTipo")) {
				jButtonNuevoGuardarCambiosCuentaContableTipoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCuentaContableTipo")) {
				jButtonCerrarReporteDinamicoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCuentaContableTipo")) {
				jButtonGenerarReporteDinamicoCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCuentaContableTipo")) {
				
				jButtonGenerarExcelReporteDinamicoCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCuentaContableTipo")) {
				jButtonCerrarImportacionCuentaContableTipoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCuentaContableTipo")) {
				
				jButtonGenerarImportacionCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCuentaContableTipo")) {
				
				jButtonAbrirImportacionCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCuentaContableTipo")) {
				jComboBoxTiposAccionesCuentaContableTipoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCuentaContableTipo")) {
				jComboBoxTiposRelacionesCuentaContableTipoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCuentaContableTipo")) {
				jComboBoxTiposAccionesCuentaContableTipoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCuentaContableTipo")) {
				
				jComboBoxTiposSeleccionarCuentaContableTipoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCuentaContableTipo")) {
				jTextFieldValorCampoGeneralCuentaContableTipoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCuentaContableTipo")) {
				jButtonAbrirOrderByCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCuentaContableTipo")) {
				jButtonAbrirOrderByCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCuentaContableTipo")) {
				jButtonCerrarOrderByCuentaContableTipoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaContableTipoBusqueda")) {
				this.jButtonidCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCuentaContableTipoUpdate")) {
				this.jButtonid_empresaCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCuentaContableTipoBusqueda")) {
				this.jButtonid_empresaCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCuentaContableTipoBusqueda")) {
				this.jButtonnombreCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("digito_verificadorCuentaContableTipoBusqueda")) {
				this.jButtondigito_verificadorCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cuenta_contable_tipoCuentaContableTipoUpdate")) {
				this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda")) {
				this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioCuentaContableTipoUpdate")) {
				this.jButtonid_tipo_producto_servicioCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioCuentaContableTipoBusqueda")) {
				this.jButtonid_tipo_producto_servicioCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_ventaCuentaContableTipo")) {
				this.jButtonid_cuenta_contable_ventaCuentaContableTipoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_ventaCuentaContableTipoArbol")) {
				this.abrirFrameTreeCuentaContableVenta("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_ventaCuentaContableTipoUpdate")) {
				this.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_ventaCuentaContableTipoBusqueda")) {
				this.jButtonid_cuenta_contable_ventaCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_descuentoCuentaContableTipo")) {
				this.jButtonid_cuenta_contable_descuentoCuentaContableTipoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_descuentoCuentaContableTipoArbol")) {
				this.abrirFrameTreeCuentaContableDescuento("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_descuentoCuentaContableTipoUpdate")) {
				this.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_descuentoCuentaContableTipoBusqueda")) {
				this.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_devolucionCuentaContableTipo")) {
				this.jButtonid_cuenta_contable_devolucionCuentaContableTipoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_devolucionCuentaContableTipoArbol")) {
				this.abrirFrameTreeCuentaContableDevolucion("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_devolucionCuentaContableTipoUpdate")) {
				this.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_devolucionCuentaContableTipoBusqueda")) {
				this.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_costoCuentaContableTipo")) {
				this.jButtonid_cuenta_contable_costoCuentaContableTipoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_costoCuentaContableTipoArbol")) {
				this.abrirFrameTreeCuentaContableCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_costoCuentaContableTipoUpdate")) {
				this.jButtonid_cuenta_contable_costoCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_costoCuentaContableTipoBusqueda")) {
				this.jButtonid_cuenta_contable_costoCuentaContableTipoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreCuentaContableTipo")) {
				this.jButtonBusquedaPorNombreCuentaContableTipoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoCuentaContableTipoCuentaContableTipo")) {
				this.jButtonFK_IdTipoCuentaContableTipoCuentaContableTipoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProductoServicioCuentaContableTipo")) {
				this.jButtonFK_IdTipoProductoServicioCuentaContableTipoActionPerformed(evt);
			}
			
			;
			
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCuentaContableTipo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContableTipoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				


				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CuentaContableTipo cuentacontabletipoLocal=null;
			
			if(!this.getEsControlTabla()) {
				cuentacontabletipoLocal=this.cuentacontabletipo;
			} else {
				cuentacontabletipoLocal=this.cuentacontabletipoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
							
				
				


				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContableTipoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
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
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
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
			
			


			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContableTipoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
								
						
				


				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContableTipo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
								
				
				


				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContableTipoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContableTipoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContableTipoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
							
				
				


				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContableTipo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContableTipoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
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
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
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
			
			


			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContableTipoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
								
				
				


				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContableTipoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContableTipoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContableTipoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCuentaContableTipo")) {
					jCheckBoxSeleccionarTodosCuentaContableTipoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCuentaContableTipo")) {
					jCheckBoxSeleccionadosCuentaContableTipoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCuentaContableTipo")) {
					
				}
				
				


				
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
												
				
				


				
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContableTipo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContableTipoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContableTipoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
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
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
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
			
			


			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaContableTipoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContableTipo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContableTipo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacontabletipo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacontabletipo);
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
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
				
				


				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaContableTipo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaContableTipo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaContableTipoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacontabletipoAnterior =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCuentaContableTipo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCuentaContableTipoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCuentaContableTipo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cuentacontabletipo =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cuentacontabletipo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCuentaContableTipo")) {
				
				}
				
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCuentaContableTipo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCuentaContableTipo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCuentaContableTipo")) {
			
			}
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCuentaContableTipo();
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
			if(sTipo.equals("NuevoCuentaContableTipo")) {
				jButtonNuevoCuentaContableTipoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCuentaContableTipo")) {
				jButtonDuplicarCuentaContableTipoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCuentaContableTipo")) {
				jButtonCopiarCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCuentaContableTipo")) {
				jButtonVerFormCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCuentaContableTipo")) {
				jButtonNuevoCuentaContableTipoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCuentaContableTipo")) {
				jButtonModificarCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCuentaContableTipo")) {
				jButtonActualizarCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCuentaContableTipo")) {
				jButtonEliminarCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCuentaContableTipo")) {
				jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCuentaContableTipo")) {
				jButtonCancelarCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCuentaContableTipo")) {
				jButtonCerrarCuentaContableTipoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCuentaContableTipo")) {
				jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaContableTipo")) {
				jButtonNuevoGuardarCambiosCuentaContableTipoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCuentaContableTipo")) {
				jButtonAbrirOrderByCuentaContableTipoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCuentaContableTipo")) {
				jButtonRecargarInformacionCuentaContableTipoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCuentaContableTipo")) {
				jButtonAnterioresCuentaContableTipoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCuentaContableTipo")) {
				jButtonSiguientesCuentaContableTipoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaContableTipoBusqueda")) {
				this.jButtonidCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCuentaContableTipoUpdate")) {
				this.jButtonid_empresaCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCuentaContableTipoBusqueda")) {
				this.jButtonid_empresaCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCuentaContableTipoBusqueda")) {
				this.jButtonnombreCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("digito_verificadorCuentaContableTipoBusqueda")) {
				this.jButtondigito_verificadorCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cuenta_contable_tipoCuentaContableTipoUpdate")) {
				this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda")) {
				this.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioCuentaContableTipoUpdate")) {
				this.jButtonid_tipo_producto_servicioCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioCuentaContableTipoBusqueda")) {
				this.jButtonid_tipo_producto_servicioCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_ventaCuentaContableTipo")) {
				this.jButtonid_cuenta_contable_ventaCuentaContableTipoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_ventaCuentaContableTipoArbol")) {
				this.abrirFrameTreeCuentaContableVenta("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_ventaCuentaContableTipoUpdate")) {
				this.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_ventaCuentaContableTipoBusqueda")) {
				this.jButtonid_cuenta_contable_ventaCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_descuentoCuentaContableTipo")) {
				this.jButtonid_cuenta_contable_descuentoCuentaContableTipoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_descuentoCuentaContableTipoArbol")) {
				this.abrirFrameTreeCuentaContableDescuento("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_descuentoCuentaContableTipoUpdate")) {
				this.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_descuentoCuentaContableTipoBusqueda")) {
				this.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_devolucionCuentaContableTipo")) {
				this.jButtonid_cuenta_contable_devolucionCuentaContableTipoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_devolucionCuentaContableTipoArbol")) {
				this.abrirFrameTreeCuentaContableDevolucion("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_devolucionCuentaContableTipoUpdate")) {
				this.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_devolucionCuentaContableTipoBusqueda")) {
				this.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_costoCuentaContableTipo")) {
				this.jButtonid_cuenta_contable_costoCuentaContableTipoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_costoCuentaContableTipoArbol")) {
				this.abrirFrameTreeCuentaContableCosto("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_costoCuentaContableTipoUpdate")) {
				this.jButtonid_cuenta_contable_costoCuentaContableTipoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_costoCuentaContableTipoBusqueda")) {
				this.jButtonid_cuenta_contable_costoCuentaContableTipoBusquedaActionPerformed(evt);
			}
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCuentaContableTipo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCuentaContableTipo")) {
				closingInternalFrameCuentaContableTipo();
				
			} else if(sTipo.equals("jButtonCancelarCuentaContableTipo")) {
				JInternalFrameBase jInternalFrameDetalleFormCuentaContableTipo = (JInternalFrameBase)evt.getSource();
	            	
	            CuentaContableTipoBeanSwingJInternalFrame jInternalFrameParent=(CuentaContableTipoBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaContableTipo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCuentaContableTipoActionPerformed(null);
			}
			
			CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentacontabletipo,new Object(),this.cuentacontabletipoParameterGeneral,this.cuentacontabletipoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCuentaContableTipo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCuentaContableTipo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCuentaContableTipo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cuentacontabletipo)) {
			if(!esControlTabla) {
				if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);			
				}
				
				if(this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCuentaContableTipo(this.cuentacontabletipo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentacontabletipoReturnGeneral=cuentacontabletipoLogic.procesarEventosCuentaContableTiposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontabletipoLogic.getCuentaContableTipos(),this.cuentacontabletipo,this.cuentacontabletipoParameterGeneral,this.isEsNuevoCuentaContableTipo,classes);//this.cuentacontabletipoLogic.getCuentaContableTipo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCuentaContableTipo(this.cuentacontabletipoReturnGeneral,this.cuentacontabletipoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCuentaContableTipo(classes,this.cuentacontabletipoReturnGeneral,this.cuentacontabletipoBean,false);
					}
						
					if(this.cuentacontabletipoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCuentaContableTipo(this.cuentacontabletipoReturnGeneral.getCuentaContableTipo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCuentaContableTipo(this.cuentacontabletipoReturnGeneral.getCuentaContableTipo());	
					}
						
					if(this.cuentacontabletipoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCuentaContableTipo(this.cuentacontabletipoReturnGeneral.getCuentaContableTipo(),classes);//this.cuentacontabletipoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCuentaContableTipo(this.cuentacontabletipo,classes);//this.cuentacontabletipoBean);									
				}
			
				if(CuentaContableTipoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCuentaContableTipo(this.cuentacontabletipo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaContableTipo(this.cuentacontabletipo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cuentacontabletipoAnterior!=null) {
						this.cuentacontabletipo=this.cuentacontabletipoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentacontabletipoReturnGeneral=cuentacontabletipoLogic.procesarEventosCuentaContableTiposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontabletipoLogic.getCuentaContableTipos(),this.cuentacontabletipo,this.cuentacontabletipoParameterGeneral,this.isEsNuevoCuentaContableTipo,classes);//this.cuentacontabletipoLogic.getCuentaContableTipo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentacontabletipoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentacontabletipoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cuentacontabletipoReturnGeneral.getCuentaContableTipo(),cuentacontabletipoLogic.getCuentaContableTipos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cuentacontabletipoReturnGeneral.getCuentaContableTipo(),this.cuentacontabletipos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCuentaContableTipo.repaint();
				
				//((AbstractTableModel) this.jTableDatosCuentaContableTipo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCuentaContableTipo();
			}
		}
	}
	
	public void actualizarVisualTableDatosCuentaContableTipo() throws Exception {
		
		CuentaContableTipoModel cuentacontabletipoModel=(CuentaContableTipoModel)this.jTableDatosCuentaContableTipo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacontabletipoModel.cuentacontabletipos=this.cuentacontabletipoLogic.getCuentaContableTipos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cuentacontabletipoModel.cuentacontabletipos=this.cuentacontabletipos;
		}
		
		
		((CuentaContableTipoModel) this.jTableDatosCuentaContableTipo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCuentaContableTipo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcuentacontabletipoAnterior(),this.cuentacontabletipoLogic.getCuentaContableTipos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcuentacontabletipoAnterior(),this.cuentacontabletipos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCuentaContableTipo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCuentaContableTipo(CuentaContableTipo cuentacontabletipo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
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
										
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontabletipo,new Object(),generalEntityParameterGeneral,this.cuentacontabletipoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CuentaContableTipoConstantesFunciones.getClassesRelationshipsOfCuentaContableTipo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CuentaContableTipoConstantesFunciones.getClassesRelationshipsFromStringsOfCuentaContableTipo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCuentaContableTipo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CuentaContableTipoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacontabletipo,new Object(),generalEntityParameterGeneral,this.cuentacontabletipoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCuentaContableTipo(CuentaContableTipoBean cuentacontabletipoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCuentaContableTipo(ArrayList<Classe> classes,CuentaContableTipoReturnGeneral cuentacontabletipoReturnGeneral,CuentaContableTipoBean cuentacontabletipoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCuentaContableTipo(CuentaContableTipo cuentacontabletipo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cuentacontabletipo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCuentaContableTipo = new CuentaContableTipoDetalleFormJInternalFrame(jDesktopPane,this.cuentacontabletipoSessionBean.getConGuardarRelaciones(),this.cuentacontabletipoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.setVisible(false);
		this.jInternalFrameDetalleFormCuentaContableTipo.setSelected(false);						
		
		this.jInternalFrameDetalleFormCuentaContableTipo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCuentaContableTipo.cuentacontabletipoLogic=this.cuentacontabletipoLogic;
		
		this.cargarCombosFrameForeignKeyCuentaContableTipo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaContableTipo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaContableTipo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCuentaContableTipo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCuentaContableTipo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCuentaContableTipo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaContableTipo"));
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonModificarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ModificarCuentaContableTipo"));

		
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonModificarToolBarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaContableTipo"));
					
		this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemModificarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaContableTipo"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonActualizarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"ActualizarCuentaContableTipo"));
		
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonActualizarToolBarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaContableTipo"));
						
		this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemActualizarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaContableTipo"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonEliminarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"EliminarCuentaContableTipo"));
		
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonEliminarToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaContableTipo"));
								
		this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemEliminarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaContableTipo"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonCancelarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CancelarCuentaContableTipo"));
		
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonCancelarToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaContableTipo"));
					
		this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemCancelarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaContableTipo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemDetalleCerrarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaContableTipo"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaContableTipo"));
		
		
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaContableTipo"));
		
		
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaContableTipo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonidCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaContableTipoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_empresaCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_empresaCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaContableTipoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonnombreCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCuentaContableTipoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtondigito_verificadorCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"digito_verificadorCuentaContableTipoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_contable_tipoCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_producto_servicioCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_ventaCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_ventaCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipo"));
		//jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableVenta("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_descuentoCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_descuentoCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipo"));
		//jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDescuento("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_devolucionCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_devolucionCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipo"));
		//jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDevolucion("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_costoCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_costoCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipo"));
		//jButtonid_cuenta_contable_costoCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCuentaContableTipo.jTabbedPaneRelacionesCuentaContableTipo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaContableTipo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCuentaContableTipo"));
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaContableTipo"));
		}
		
		this.jTableDatosCuentaContableTipo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCuentaContableTipo"));
		
		this.jTableDatosCuentaContableTipo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCuentaContableTipo"));
		
		this.jButtonNuevoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"NuevoCuentaContableTipo"));
		
		this.jButtonDuplicarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"DuplicarCuentaContableTipo"));
		
		this.jButtonCopiarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"CopiarCuentaContableTipo"));
		
		this.jButtonVerFormCuentaContableTipo.addActionListener(new ButtonActionListener(this,"VerFormCuentaContableTipo"));
		
		
		this.jButtonNuevoToolBarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"NuevoToolBarCuentaContableTipo"));
			
		this.jButtonDuplicarToolBarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCuentaContableTipo"));
			
		this.jMenuItemNuevoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCuentaContableTipo"));
			
		this.jMenuItemDuplicarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCuentaContableTipo"));		
		
		
		this.jButtonNuevoRelacionesCuentaContableTipo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCuentaContableTipo"));
		
		
		this.jButtonNuevoRelacionesToolBarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCuentaContableTipo"));
			
		this.jMenuItemNuevoRelacionesCuentaContableTipo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCuentaContableTipo"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonModificarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ModificarCuentaContableTipo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonModificarToolBarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaContableTipo"));
			
			this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemModificarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaContableTipo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonActualizarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"ActualizarCuentaContableTipo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonActualizarToolBarCuentaContableTipo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaContableTipo"));
				
			this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemActualizarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaContableTipo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonEliminarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"EliminarCuentaContableTipo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonEliminarToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaContableTipo"));
						
			this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemEliminarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaContableTipo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonCancelarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CancelarCuentaContableTipo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonCancelarToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaContableTipo"));
			
			this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemCancelarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaContableTipo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCuentaContableTipo"));		
		
		
		this.jButtonCerrarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CerrarCuentaContableTipo"));
		
		
		this.jButtonCerrarToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CerrarToolBarCuentaContableTipo"));
			
		this.jMenuItemCerrarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCuentaContableTipo"));
			
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jMenuItemDetalleCerrarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaContableTipo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosCuentaContableTipo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaContableTipo"));
		}
		
		this.jButtonCopiarToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CopiarToolBarCuentaContableTipo"));
			
		this.jButtonVerFormToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"VerFormToolBarCuentaContableTipo"));
		
		this.jMenuItemGuardarCambiosCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCuentaContableTipo"));
			
		this.jMenuItemCopiarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCuentaContableTipo"));		
		
		this.jMenuItemVerFormCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCuentaContableTipo"));		
		
		
		this.jButtonGuardarCambiosTablaCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaContableTipo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCuentaContableTipo"));
			
		this.jMenuItemGuardarCambiosTablaCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaContableTipo"));		
		
		
		
		this.jButtonRecargarInformacionCuentaContableTipo.addActionListener (new ButtonActionListener(this,"RecargarInformacionCuentaContableTipo"));
					
		this.jButtonRecargarInformacionToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCuentaContableTipo"));
		
		this.jMenuItemRecargarInformacionCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCuentaContableTipo"));		
		
		
		
		this.jButtonAnterioresCuentaContableTipo.addActionListener (new ButtonActionListener(this,"AnterioresCuentaContableTipo"));
		
		
		this.jButtonAnterioresToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCuentaContableTipo"));
		
		this.jMenuItemAnterioresCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCuentaContableTipo"));		
		
		
		this.jButtonSiguientesCuentaContableTipo.addActionListener (new ButtonActionListener(this,"SiguientesCuentaContableTipo"));
		
		
		this.jButtonSiguientesToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCuentaContableTipo"));
			
		this.jMenuItemSiguientesCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCuentaContableTipo"));
			
		this.jMenuItemAbrirOrderByCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCuentaContableTipo"));
			
		this.jMenuItemMostrarOcultarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCuentaContableTipo"));
			
		this.jMenuItemDetalleAbrirOrderByCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCuentaContableTipo"));
			
		this.jMenuItemDetalleMostarOcultarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCuentaContableTipo"));		
		
		
		this.jButtonNuevoGuardarCambiosCuentaContableTipo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCuentaContableTipo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCuentaContableTipo"));
			
		this.jMenuItemNuevoGuardarCambiosCuentaContableTipo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCuentaContableTipo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCuentaContableTipo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCuentaContableTipo"));

		this.jCheckBoxSeleccionadosCuentaContableTipo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCuentaContableTipo"));
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaContableTipo"));
		}
		
		
		this.jComboBoxTiposRelacionesCuentaContableTipo.addActionListener (new ButtonActionListener(this,"TiposRelacionesCuentaContableTipo"));
			
		this.jComboBoxTiposAccionesCuentaContableTipo.addActionListener (new ButtonActionListener(this,"TiposAccionesCuentaContableTipo"));
					
		this.jComboBoxTiposSeleccionarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCuentaContableTipo"));
			
		this.jTextFieldValorCampoGeneralCuentaContableTipo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCuentaContableTipo"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonidCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaContableTipoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_empresaCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_empresaCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaContableTipoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonnombreCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCuentaContableTipoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtondigito_verificadorCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"digito_verificadorCuentaContableTipoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_contable_tipoCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_producto_servicioCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_ventaCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_ventaCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipo"));
		//jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableVenta("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_descuentoCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_descuentoCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipo"));
		//jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDescuento("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_devolucionCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_devolucionCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipo"));
		//jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDevolucion("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_costoCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_costoCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipo"));
		//jButtonid_cuenta_contable_costoCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreCuentaContableTipo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCuentaContableTipo"));

			this.jButtonFK_IdTipoCuentaContableTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuentaContableTipoCuentaContableTipo"));

			this.jButtonFK_IdTipoProductoServicioCuentaContableTipo.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoServicioCuentaContableTipo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCuentaContableTipo!=null) {
				this.jInternalFrameReporteDinamicoCuentaContableTipo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaContableTipo"));
				this.jInternalFrameReporteDinamicoCuentaContableTipo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaContableTipo"));
				this.jInternalFrameReporteDinamicoCuentaContableTipo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaContableTipo"));
			}
			
			//this.jButtonCerrarReporteDinamicoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaContableTipo"));				
			//this.jButtonGenerarReporteDinamicoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaContableTipo"));
			//this.jButtonGenerarExcelReporteDinamicoCuentaContableTipo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaContableTipo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCuentaContableTipo!=null) {
				this.jInternalFrameImportacionCuentaContableTipo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaContableTipo"));
				this.jInternalFrameImportacionCuentaContableTipo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaContableTipo"));
				this.jInternalFrameImportacionCuentaContableTipo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaContableTipo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCuentaContableTipo.addActionListener (new ButtonActionListener(this,"AbrirOrderByCuentaContableTipo"));
			
			this.jButtonAbrirOrderByToolBarCuentaContableTipo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCuentaContableTipo"));			
			
			if(this.jInternalFrameOrderByCuentaContableTipo!=null) {
				this.jInternalFrameOrderByCuentaContableTipo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaContableTipo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaContableTipo.jTabbedPaneRelacionesCuentaContableTipo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaContableTipo"));
		
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
            		closingInternalFrameCuentaContableTipo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCuentaContableTipo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCuentaContableTipo = (JInternalFrameBase)event.getSource();
	            	
	            CuentaContableTipoBeanSwingJInternalFrame jInternalFrameParent=(CuentaContableTipoBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaContableTipo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCuentaContableTipoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCuentaContableTipo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCuentaContableTipoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCuentaContableTipo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCuentaContableTipo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContableTipoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContableTipoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContableTipoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCuentaContableTipo";
		inputMap = this.jButtonNuevoCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaContableTipoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContableTipoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContableTipoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaContableTipoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCuentaContableTipo";
		inputMap = this.jButtonNuevoRelacionesCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaContableTipoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCuentaContableTipo";
		inputMap = this.jButtonModificarCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCuentaContableTipo";
		inputMap = this.jButtonActualizarCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCuentaContableTipo";
		inputMap = this.jButtonEliminarCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCuentaContableTipo";
		inputMap = this.jButtonCancelarCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCuentaContableTipo";
		inputMap = this.jButtonCerrarCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCuentaContableTipo";
		inputMap = this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosCuentaContableTipo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonGuardarCambiosCuentaContableTipo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCuentaContableTipoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCuentaContableTipo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCuentaContableTipoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCuentaContableTipo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCuentaContableTipoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCuentaContableTipo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCuentaContableTipoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCuentaContableTipo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCuentaContableTipoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonidCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaContableTipoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_empresaCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_empresaCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaContableTipoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonnombreCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCuentaContableTipoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtondigito_verificadorCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"digito_verificadorCuentaContableTipoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_contable_tipoCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_contable_tipoCuentaContableTipoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_producto_servicioCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_tipo_producto_servicioCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_ventaCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_ventaCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipo"));
		//jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableVenta("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_ventaCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_descuentoCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_descuentoCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipo"));
		//jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDescuento("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_descuentoCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_devolucionCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_devolucionCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipo"));
		//jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDevolucion("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_devolucionCuentaContableTipoBusqueda"));
		//jButtonid_cuenta_contable_costoCuentaContableTipo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_costoCuentaContableTipoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipo"));
		//jButtonid_cuenta_contable_costoCuentaContableTipoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCosto("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costoCuentaContableTipoBusqueda"));
		
		
		this.jButtonBusquedaPorNombreCuentaContableTipo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCuentaContableTipo"));

		this.jButtonFK_IdTipoCuentaContableTipoCuentaContableTipo.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuentaContableTipoCuentaContableTipo"));

		this.jButtonFK_IdTipoProductoServicioCuentaContableTipo.addActionListener(new ButtonActionListener(this,"FK_IdTipoProductoServicioCuentaContableTipo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCuentaContableTipo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCuentaContableTipoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCuentaContableTipoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCuentaContableTipo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCuentaContableTipo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipoLogic.getCuentaContableTipos()) {
					cuentacontabletipoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletipos) {
					cuentacontabletipoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCuentaContableTipoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaContableTipo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipoLogic.getCuentaContableTipos()) {
						cuentacontabletipoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletipos) {
						cuentacontabletipoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipoLogic.getCuentaContableTipos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletipos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaContableTipo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaContableTipo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaContableTipo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCuentaContableTipoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaContableTipo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCuentaContableTipo.getSelectedRows();
			
			CuentaContableTipo cuentacontabletipoLocal=new CuentaContableTipo();
			
			//this.seleccionarTodosCuentaContableTipo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabletipoLocal =(CuentaContableTipo) this.cuentacontabletipoLogic.getCuentaContableTipos().toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cuentacontabletipoLocal =(CuentaContableTipo) this.cuentacontabletipos.toArray()[this.jTableDatosCuentaContableTipo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cuentacontabletipoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipoLogic.getCuentaContableTipos()) {
						cuentacontabletipoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletipos) {
						cuentacontabletipoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCuentaContableTipo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaContableTipo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaContableTipo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaContableTipo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCuentaContableTipoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCuentaContableTipoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCuentaContableTipoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCuentaContableTipo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCuentaContableTipo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipoLogic.getCuentaContableTipos()) {
				
						if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cuentacontabletipoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR)) {
							existe=true;
							cuentacontabletipoAux.setdigito_verificador(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletipos) {
					
						if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cuentacontabletipoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR)) {
							existe=true;
							cuentacontabletipoAux.setdigito_verificador(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaContableTipo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCuentaContableTipoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCuentaContableTipo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCuentaContableTipo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCuentaContableTipo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCuentaContableTipo) {				
					conSplash=true;//false;										
					
					//this.startProcessCuentaContableTipo(conSplash);
				
					this.generarReporteCuentaContableTiposSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContableTipo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCuentaContableTiposSeleccionados();
				//this.jComboBoxTiposAccionesCuentaContableTipo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaContableTiposSeleccionados(false);
				//this.jComboBoxTiposAccionesCuentaContableTipo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaContableTiposSeleccionados(true);
				//this.jComboBoxTiposAccionesCuentaContableTipo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaContableTipo();
				
				this.exportarCuentaContableTiposSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContableTipo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCuentaContableTipos();
				//this.importarCuentaContableTipos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContableTipo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaContableTipo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCuentaContableTiposSeleccionados();
				//this.jComboBoxTiposAccionesCuentaContableTipo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cuenta Contable Tipo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCuentaContableTipo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCuentaContableTipo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCuentaContableTipo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaContableTipo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.setSelectedIndex(0);					
				}	
			} 			
			else if(CuentaContableTipoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCuentaContableTipo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCuentaContableTipo(conSplash);
					
						//this.actualizarParametrosGeneralCuentaContableTipo();
						
						this.generarReporteProcesoAccionCuentaContableTiposSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCuentaContableTipo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CuentaContableTipoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cuenta Contable TipoS SELECCIONADOS?", "MANTENIMIENTO DE Cuenta Contable Tipo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCuentaContableTipo();
				
						this.actualizarParametrosGeneralCuentaContableTipo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cuentacontabletipoReturnGeneral=cuentacontabletipoLogic.procesarAccionCuentaContableTiposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cuentacontabletipoLogic.getCuentaContableTipos(),this.cuentacontabletipoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCuentaContableTipoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaContableTipo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCuentaContableTipo();
					
					CuentaContableTipoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCuentaContableTipoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaContableTipo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxTiposAccionesFormularioCuentaContableTipo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCuentaContableTipo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCuentaContableTipoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCuentaContableTipo();
			
			if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();		
			CuentaContableTipo cuentacontabletipo=new CuentaContableTipo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCuentaContableTipo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCuentaContableTipo.getSelectedItem();
			
			
			
			
			cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(true);
			//this.sTipoAccion;
			
			if(cuentacontabletiposSeleccionados.size()==1) {
				for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletiposSeleccionados) {
					cuentacontabletipo=cuentacontabletipoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCuentaContableTipo();
			
      		//this.finishProcessCuentaContableTipo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCuentaContableTipoReturnGeneral() throws Exception {
		if(this.cuentacontabletipoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cuentacontabletipoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cuentacontabletipoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cuentacontabletipoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cuentacontabletipoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cuentacontabletipoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCuentaContableTipo(false);
		}
		
		if(this.cuentacontabletipoReturnGeneral.getConRetornoLista() || this.cuentacontabletipoReturnGeneral.getConRetornoObjeto()) {
			if(this.cuentacontabletipoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentacontabletipoLogic.setCuentaContableTipos(this.cuentacontabletipoReturnGeneral.getCuentaContableTipos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cuentacontabletipoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentacontabletipoLogic.setCuentaContableTipo(this.cuentacontabletipoReturnGeneral.getCuentaContableTipo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCuentaContableTipo(false);
		}
	}
	
	public void actualizarParametrosGeneralCuentaContableTipo() throws Exception {
		
		
	}
	
	public ArrayList<CuentaContableTipo> getCuentaContableTiposSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCuentaContableTipo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletipoLogic.getCuentaContableTipos()) {
					if(cuentacontabletipoAux.getIsSelected()) {
						cuentacontabletiposSeleccionados.add(cuentacontabletipoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaContableTipo cuentacontabletipoAux:this.cuentacontabletipos) {
					if(cuentacontabletipoAux.getIsSelected()) {
						cuentacontabletiposSeleccionados.add(cuentacontabletipoAux);				
					}
				}
			}
			
			if(cuentacontabletiposSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cuentacontabletiposSeleccionados.addAll(this.cuentacontabletipoLogic.getCuentaContableTipos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cuentacontabletiposSeleccionados.addAll(this.cuentacontabletipos);				
					}
				}
			}
		} else {
			cuentacontabletiposSeleccionados.add(this.cuentacontabletipo);
		}
		
		return cuentacontabletiposSeleccionados;
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
	
	public void generarReporteCuentaContableTiposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCuentaContableTiposSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCuentaContableTiposSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaContableTiposSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaContableTiposSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cuenta Contable Tipo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();		
		
		cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCuentaContableTipos("Todos",cuentacontabletiposSeleccionados);
		
	}	
	
	public void generarReporteNormalCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();		
		
		cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCuentaContableTipos("Todos",cuentacontabletiposSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCuentaContableTiposSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();
		
		cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCuentaContableTipos("Todos",cuentacontabletiposSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCuentaContableTipo();
		
		
		cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCuentaContableTipo();
		
		
		//this.generarReporteCuentaContableTipos("Todos",cuentacontabletiposSeleccionados ,cuentacontabletipoImplementable,cuentacontabletipoImplementableHome);
	}
	
	public void mostrarImportacionCuentaContableTipos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCuentaContableTipo();
		
		this.abrirFrameImportacionCuentaContableTipo();		
		
			
		//this.generarReporteCuentaContableTipos("Todos",cuentacontabletiposSeleccionados ,cuentacontabletipoImplementable,cuentacontabletipoImplementableHome);
	}
	
	public void importarCuentaContableTipos() throws Exception {		
	
	}
	
	public void exportarCuentaContableTiposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCuentaContableTiposSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCuentaContableTiposSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCuentaContableTiposSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cuenta Contable Tipo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();		
		
		cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontabletipo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCuentaContableTipo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletiposSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCuentaContableTipo(cuentacontabletipoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cuentacontabletipoAux.setsDetalleGeneralEntityReporte(cuentacontabletipoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCuentaContableTipo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CuentaContableTipoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContableTipoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContableTipoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCuentaContableTipo(CuentaContableTipo cuentacontabletipo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cuentacontabletipo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontabletipo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontabletipo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontabletipo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontabletipo.getdigito_verificador().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontabletipo.gettipocuentacontabletipo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontabletipo.gettipoproductoservicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontabletipo.getcuentacontableventa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontabletipo.getcuentacontabledescuento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontabletipo.getcuentacontabledevolucion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacontabletipo.getcuentacontablecosto_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();		
		
		cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontabletipo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CuentaContableTipos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCuentaContableTipo(row);				
				iRow++;
			}				
			
			for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletiposSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCuentaContableTipo(cuentacontabletipoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCuentaContableTiposSeleccionados() throws Exception {
		ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();		
		
		cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacontabletipo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cuentacontabletipos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cuentacontabletipo");
			//elementRoot.appendChild(element);
		
			for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletiposSeleccionados) {
				element = document.createElement("cuentacontabletipo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCuentaContableTipo(cuentacontabletipoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Contable Tipo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCuentaContableTipo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCuentaContableTipo(CuentaContableTipo cuentacontabletipo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontabletipo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontabletipo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontabletipo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontabletipo.getdigito_verificador());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontabletipo.gettipocuentacontabletipo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontabletipo.gettipoproductoservicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontabletipo.getcuentacontableventa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontabletipo.getcuentacontabledescuento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontabletipo.getcuentacontabledevolucion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacontabletipo.getcuentacontablecosto_descripcion());				
	}
	
	public void setFilaDatosExportarXmlCuentaContableTipo(CuentaContableTipo cuentacontabletipo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CuentaContableTipoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cuentacontabletipo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CuentaContableTipoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cuentacontabletipo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CuentaContableTipoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cuentacontabletipo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(CuentaContableTipoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cuentacontabletipo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdigito_verificador = document.createElement(CuentaContableTipoConstantesFunciones.DIGITOVERIFICADOR);
		elementdigito_verificador.appendChild(document.createTextNode(cuentacontabletipo.getdigito_verificador().toString().trim()));
		element.appendChild(elementdigito_verificador);

		Element elementtipocuentacontabletipo_descripcion = document.createElement(CuentaContableTipoConstantesFunciones.IDTIPOCUENTACONTABLETIPO);
		elementtipocuentacontabletipo_descripcion.appendChild(document.createTextNode(cuentacontabletipo.gettipocuentacontabletipo_descripcion()));
		element.appendChild(elementtipocuentacontabletipo_descripcion);

		Element elementtipoproductoservicio_descripcion = document.createElement(CuentaContableTipoConstantesFunciones.IDTIPOPRODUCTOSERVICIO);
		elementtipoproductoservicio_descripcion.appendChild(document.createTextNode(cuentacontabletipo.gettipoproductoservicio_descripcion()));
		element.appendChild(elementtipoproductoservicio_descripcion);

		Element elementcuentacontableventa_descripcion = document.createElement(CuentaContableTipoConstantesFunciones.IDCUENTACONTABLEVENTA);
		elementcuentacontableventa_descripcion.appendChild(document.createTextNode(cuentacontabletipo.getcuentacontableventa_descripcion()));
		element.appendChild(elementcuentacontableventa_descripcion);

		Element elementcuentacontabledescuento_descripcion = document.createElement(CuentaContableTipoConstantesFunciones.IDCUENTACONTABLEDESCUENTO);
		elementcuentacontabledescuento_descripcion.appendChild(document.createTextNode(cuentacontabletipo.getcuentacontabledescuento_descripcion()));
		element.appendChild(elementcuentacontabledescuento_descripcion);

		Element elementcuentacontabledevolucion_descripcion = document.createElement(CuentaContableTipoConstantesFunciones.IDCUENTACONTABLEDEVOLUCION);
		elementcuentacontabledevolucion_descripcion.appendChild(document.createTextNode(cuentacontabletipo.getcuentacontabledevolucion_descripcion()));
		element.appendChild(elementcuentacontabledevolucion_descripcion);

		Element elementcuentacontablecosto_descripcion = document.createElement(CuentaContableTipoConstantesFunciones.IDCUENTACONTABLECOSTO);
		elementcuentacontablecosto_descripcion.appendChild(document.createTextNode(cuentacontabletipo.getcuentacontablecosto_descripcion()));
		element.appendChild(elementcuentacontablecosto_descripcion);
	}
	
	public void generarReporteGroupGenericoCuentaContableTiposSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados=new ArrayList<CuentaContableTipo>();
		
		cuentacontabletiposSeleccionados=this.getCuentaContableTiposSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCuentaContableTipo(cuentacontabletiposSeleccionados);
		
		this.generarReporteCuentaContableTipos("Todos",cuentacontabletiposSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCuentaContableTipo(ArrayList<CuentaContableTipo> cuentacontabletiposSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CuentaContableTipo cuentacontabletipoAux:cuentacontabletiposSeleccionados) {
				cuentacontabletipoAux.setsDetalleGeneralEntityReporte(cuentacontabletipoAux.toString());
			
				if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cuentacontabletipoAux.setsDescripcionGeneralEntityReporte1(cuentacontabletipoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cuentacontabletipoAux.setsDescripcionGeneralEntityReporte1(cuentacontabletipoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_DIGITOVERIFICADOR)) {
					existe=true;
					cuentacontabletipoAux.setsDescripcionGeneralEntityReporte1(cuentacontabletipoAux.getdigito_verificador().toString());
				}
				 else if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOCUENTACONTABLETIPO)) {
					existe=true;
					cuentacontabletipoAux.setsDescripcionGeneralEntityReporte1(cuentacontabletipoAux.gettipocuentacontabletipo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO)) {
					existe=true;
					cuentacontabletipoAux.setsDescripcionGeneralEntityReporte1(cuentacontabletipoAux.gettipoproductoservicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEVENTA)) {
					existe=true;
					cuentacontabletipoAux.setsDescripcionGeneralEntityReporte1(cuentacontabletipoAux.getcuentacontableventa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDESCUENTO)) {
					existe=true;
					cuentacontabletipoAux.setsDescripcionGeneralEntityReporte1(cuentacontabletipoAux.getcuentacontabledescuento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLEDEVOLUCION)) {
					existe=true;
					cuentacontabletipoAux.setsDescripcionGeneralEntityReporte1(cuentacontabletipoAux.getcuentacontabledevolucion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaContableTipoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTO)) {
					existe=true;
					cuentacontabletipoAux.setsDescripcionGeneralEntityReporte1(cuentacontabletipoAux.getcuentacontablecosto_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaContableTipoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCuentaContableTipo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCuentaContableTipo=true;
				this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=true;
				this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=true;
			}
			
			this.isVisibilidadCeldaModificarCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarCuentaContableTipo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCuentaContableTipo=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=false;
			this.isVisibilidadCeldaModificarCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarCuentaContableTipo=true;
			this.isVisibilidadCeldaEliminarCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarCuentaContableTipo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCuentaContableTipo=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=false;
			this.isVisibilidadCeldaModificarCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarCuentaContableTipo=true;
			this.isVisibilidadCeldaEliminarCuentaContableTipo=true;
			this.isVisibilidadCeldaCancelarCuentaContableTipo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCuentaContableTipo=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=false;
			this.isVisibilidadCeldaModificarCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarCuentaContableTipo=true;
			this.isVisibilidadCeldaEliminarCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarCuentaContableTipo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCuentaContableTipo=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=true;
			this.isVisibilidadCeldaModificarCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarCuentaContableTipo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCuentaContableTipo=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=false;
			this.isVisibilidadCeldaActualizarCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarCuentaContableTipo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCuentaContableTipo=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=false;
			this.isVisibilidadCeldaModificarCuentaContableTipo=true;
			this.isVisibilidadCeldaActualizarCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarCuentaContableTipo=false;
			this.isVisibilidadCeldaCancelarCuentaContableTipo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaContableTipo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CuentaContableTipoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCuentaContableTipo=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=true;
		} else {
			this.actualizarEstadoPanelsCuentaContableTipo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCuentaContableTipo=false;
			//this.isVisibilidadCeldaVerFormCuentaContableTipo=false;
			this.isVisibilidadCeldaDuplicarCuentaContableTipo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cuentacontabletipoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=false;
		} else {
			this.isVisibilidadCeldaNuevoCuentaContableTipo=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaContableTipo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			if(!cuentacontabletipoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=false;												
			}
			
			this.jButtonCerrarCuentaContableTipo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaContableTipo=false;
		}
		
		if(!this.permiteMantenimiento(this.cuentacontabletipo)) {
			this.isVisibilidadCeldaActualizarCuentaContableTipo=false;
			this.isVisibilidadCeldaEliminarCuentaContableTipo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaContableTipo() {
	}
	
	public void actualizarEstadoPanelsCuentaContableTipo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionCuentaContableTipo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasCuentaContableTipo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContableTipo!=null) {
				this.jScrollPanelDatosCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContableTipo!=null) {
				this.jPanelPaginacionCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContableTipo!=null) {
				this.jPanelParametrosReportesCuentaContableTipo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionCuentaContableTipo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasCuentaContableTipo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCuentaContableTipo!=null) {
				this.jScrollPanelDatosCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaContableTipo!=null) {
				this.jPanelPaginacionCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaContableTipo!=null) {
				this.jPanelParametrosReportesCuentaContableTipo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionCuentaContableTipo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasCuentaContableTipo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContableTipo!=null) {
				this.jScrollPanelDatosCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaContableTipo!=null) {
				this.jPanelPaginacionCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaContableTipo!=null) {
				this.jPanelParametrosReportesCuentaContableTipo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionCuentaContableTipo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasCuentaContableTipo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContableTipo!=null) {
				this.jScrollPanelDatosCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaContableTipo!=null) {
				this.jPanelPaginacionCuentaContableTipo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaContableTipo!=null) {
				this.jPanelParametrosReportesCuentaContableTipo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionCuentaContableTipo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasCuentaContableTipo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContableTipo!=null) {
				this.jScrollPanelDatosCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContableTipo!=null) {
				this.jPanelPaginacionCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContableTipo!=null) {
				this.jPanelParametrosReportesCuentaContableTipo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionCuentaContableTipo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasCuentaContableTipo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContableTipo!=null) {
				this.jScrollPanelDatosCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContableTipo!=null) {
				this.jPanelPaginacionCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContableTipo!=null) {
				this.jPanelParametrosReportesCuentaContableTipo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCuentaContableTipo!=null) {
				this.jScrollPanelDatosEdicionCuentaContableTipo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasCuentaContableTipo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaContableTipo!=null) {
				this.jScrollPanelDatosCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaContableTipo!=null) {
				this.jPanelPaginacionCuentaContableTipo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaContableTipo!=null) {
				this.jPanelParametrosReportesCuentaContableTipo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCuentaContableTipo!=null) {
					this.jTabbedPaneBusquedasCuentaContableTipo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCuentaContableTipo!=null) {
				this.jPanelParametrosReportesCuentaContableTipo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaContableTipo!=null) {
				this.jTabbedPaneBusquedasCuentaContableTipo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCuentaContableTipo!=null) {
				this.jPanelParametrosReportesCuentaContableTipo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelBusquedaPorNombreCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoCuentaContableTipo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaContableTipo) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoProductoServicio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProductoServicio) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoProductoServicioCuentaContableTipo);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCuentaContableTipo(Boolean isParaTipoCuentaContableTipo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCuentaContableTipoNegation=!isParaTipoCuentaContableTipo;

			this.isVisibilidadBusquedaPorNombre=isParaTipoCuentaContableTipoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelBusquedaPorNombreCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoCuentaContableTipo=isParaTipoCuentaContableTipo;
			if(!this.isVisibilidadFK_IdTipoCuentaContableTipo) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoProductoServicio=isParaTipoCuentaContableTipoNegation;
			if(!this.isVisibilidadFK_IdTipoProductoServicio) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoProductoServicioCuentaContableTipo);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProductoServicio(Boolean isParaTipoProductoServicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoServicioNegation=!isParaTipoProductoServicio;

			this.isVisibilidadBusquedaPorNombre=isParaTipoProductoServicioNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelBusquedaPorNombreCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoCuentaContableTipo=isParaTipoProductoServicioNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaContableTipo) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoProductoServicio=isParaTipoProductoServicio;
			if(!this.isVisibilidadFK_IdTipoProductoServicio) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoProductoServicioCuentaContableTipo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableVenta(Boolean isParaCuentaContableVenta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableVentaNegation=!isParaCuentaContableVenta;

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableVentaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelBusquedaPorNombreCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoCuentaContableTipo=isParaCuentaContableVentaNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaContableTipo) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoProductoServicio=isParaCuentaContableVentaNegation;
			if(!this.isVisibilidadFK_IdTipoProductoServicio) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoProductoServicioCuentaContableTipo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableDescuento(Boolean isParaCuentaContableDescuento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableDescuentoNegation=!isParaCuentaContableDescuento;

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableDescuentoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelBusquedaPorNombreCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoCuentaContableTipo=isParaCuentaContableDescuentoNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaContableTipo) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoProductoServicio=isParaCuentaContableDescuentoNegation;
			if(!this.isVisibilidadFK_IdTipoProductoServicio) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoProductoServicioCuentaContableTipo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableDevolucion(Boolean isParaCuentaContableDevolucion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableDevolucionNegation=!isParaCuentaContableDevolucion;

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableDevolucionNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelBusquedaPorNombreCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoCuentaContableTipo=isParaCuentaContableDevolucionNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaContableTipo) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoProductoServicio=isParaCuentaContableDevolucionNegation;
			if(!this.isVisibilidadFK_IdTipoProductoServicio) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoProductoServicioCuentaContableTipo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCosto(Boolean isParaCuentaContableCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCostoNegation=!isParaCuentaContableCosto;

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableCostoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelBusquedaPorNombreCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoCuentaContableTipo=isParaCuentaContableCostoNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaContableTipo) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);}

			this.isVisibilidadFK_IdTipoProductoServicio=isParaCuentaContableCostoNegation;
			if(!this.isVisibilidadFK_IdTipoProductoServicio) {this.jTabbedPaneBusquedasCuentaContableTipo.remove(jPanelFK_IdTipoProductoServicioCuentaContableTipo);}
		}
		
	}
	
	
	
	

	public String registrarSesionCuentaContableTipoParaBusquedaCuentaContableVentas() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(cuentacontabletipoSessionBean==null) {
				cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(cuentacontableventaSessionBean==null) {
				cuentacontableventaSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableventaSessionBean.setsPathNavegacionActual(cuentacontabletipoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableventaSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableventaSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableventaSessionBean.getisPaginaPopup();
			cuentacontableventaSessionBean.setisPaginaPopup(false);
			cuentacontableventaSessionBean.setEstaModoBusqueda(true);
			cuentacontableventaSessionBean.setsFuncionBusquedaRapida("window.opener.cuentacontabletipoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_venta(TO_REPLACE);");
			cuentacontableventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(CuentaContableTipoConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionCuentaContableTipo(true);
			//cuentacontableSessionBean.setlidCuentaContableTipoActual(this.idCuentaContableTipoActual);

			cuentacontabletipoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo(true);
			cuentacontabletipoSessionBean.setlIdCuentaContableTipoActualForeignKey(this.idCuentaContableTipoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionCuentaContableTipoParaBusquedaCuentaContableDescuentos() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(cuentacontabletipoSessionBean==null) {
				cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(cuentacontabledescuentoSessionBean==null) {
				cuentacontabledescuentoSessionBean=new CuentaContableSessionBean();
			}

			cuentacontabledescuentoSessionBean.setsPathNavegacionActual(cuentacontabletipoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontabledescuentoSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontabledescuentoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontabledescuentoSessionBean.getisPaginaPopup();
			cuentacontabledescuentoSessionBean.setisPaginaPopup(false);
			cuentacontabledescuentoSessionBean.setEstaModoBusqueda(true);
			cuentacontabledescuentoSessionBean.setsFuncionBusquedaRapida("window.opener.cuentacontabletipoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_descuento(TO_REPLACE);");
			cuentacontabledescuentoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontabledescuentoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(CuentaContableTipoConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionCuentaContableTipo(true);
			//cuentacontableSessionBean.setlidCuentaContableTipoActual(this.idCuentaContableTipoActual);

			cuentacontabletipoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo(true);
			cuentacontabletipoSessionBean.setlIdCuentaContableTipoActualForeignKey(this.idCuentaContableTipoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionCuentaContableTipoParaBusquedaCuentaContableDevolucions() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(cuentacontabletipoSessionBean==null) {
				cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(cuentacontabledevolucionSessionBean==null) {
				cuentacontabledevolucionSessionBean=new CuentaContableSessionBean();
			}

			cuentacontabledevolucionSessionBean.setsPathNavegacionActual(cuentacontabletipoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontabledevolucionSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontabledevolucionSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontabledevolucionSessionBean.getisPaginaPopup();
			cuentacontabledevolucionSessionBean.setisPaginaPopup(false);
			cuentacontabledevolucionSessionBean.setEstaModoBusqueda(true);
			cuentacontabledevolucionSessionBean.setsFuncionBusquedaRapida("window.opener.cuentacontabletipoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_devolucion(TO_REPLACE);");
			cuentacontabledevolucionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontabledevolucionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(CuentaContableTipoConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionCuentaContableTipo(true);
			//cuentacontableSessionBean.setlidCuentaContableTipoActual(this.idCuentaContableTipoActual);

			cuentacontabletipoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo(true);
			cuentacontabletipoSessionBean.setlIdCuentaContableTipoActualForeignKey(this.idCuentaContableTipoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionCuentaContableTipoParaBusquedaCuentaContableCostos() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(cuentacontabletipoSessionBean==null) {
				cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
			}

			if(cuentacontablecostoSessionBean==null) {
				cuentacontablecostoSessionBean=new CuentaContableSessionBean();
			}

			cuentacontablecostoSessionBean.setsPathNavegacionActual(cuentacontabletipoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontablecostoSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontablecostoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontablecostoSessionBean.getisPaginaPopup();
			cuentacontablecostoSessionBean.setisPaginaPopup(false);
			cuentacontablecostoSessionBean.setEstaModoBusqueda(true);
			cuentacontablecostoSessionBean.setsFuncionBusquedaRapida("window.opener.cuentacontabletipoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_costo(TO_REPLACE);");
			cuentacontablecostoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontablecostoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(CuentaContableTipoConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionCuentaContableTipo(true);
			//cuentacontableSessionBean.setlidCuentaContableTipoActual(this.idCuentaContableTipoActual);

			cuentacontabletipoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCuentaContableTipo(true);
			cuentacontabletipoSessionBean.setlIdCuentaContableTipoActualForeignKey(this.idCuentaContableTipoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CuentaContableTipoSessionBean cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
		
		if(this.cuentacontabletipoSessionBean==null) {
			this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
		}
		
		this.cuentacontabletipoSessionBean.setsUltimaBusquedaCuentaContableTipo(this.getsAccionBusqueda());
		this.cuentacontabletipoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cuentacontabletipoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			cuentacontabletipoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cuentacontabletipoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCuentaContableTipo")) {
			cuentacontabletipoSessionBean.setid_tipo_cuenta_contable_tipo(this.getid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProductoServicio")) {
			cuentacontabletipoSessionBean.setid_tipo_producto_servicio(this.getid_tipo_producto_servicioFK_IdTipoProductoServicio());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CuentaContableTipoSessionBean cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
		
		if(this.cuentacontabletipoSessionBean==null) {
			this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
		}
		
		if(this.cuentacontabletipoSessionBean.getsUltimaBusquedaCuentaContableTipo()!=null&&!this.cuentacontabletipoSessionBean.getsUltimaBusquedaCuentaContableTipo().equals("")) {
			this.setsAccionBusqueda(cuentacontabletipoSessionBean.getsUltimaBusquedaCuentaContableTipo());
			this.setiNumeroPaginacion(cuentacontabletipoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cuentacontabletipoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(cuentacontabletipoSessionBean.getnombre());
				cuentacontabletipoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cuentacontabletipoSessionBean.getid_empresa());
				cuentacontabletipoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCuentaContableTipo")) {
				this.setid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo(cuentacontabletipoSessionBean.getid_tipo_cuenta_contable_tipo());
				cuentacontabletipoSessionBean.setid_tipo_cuenta_contable_tipo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProductoServicio")) {
				this.setid_tipo_producto_servicioFK_IdTipoProductoServicio(cuentacontabletipoSessionBean.getid_tipo_producto_servicio());
				cuentacontabletipoSessionBean.setid_tipo_producto_servicio(-1L);
			}
		}
		
		this.cuentacontabletipoSessionBean.setsUltimaBusquedaCuentaContableTipo("");
		this.cuentacontabletipoSessionBean.setiNumeroPaginacion(CuentaContableTipoConstantesFunciones.INUMEROPAGINACION);
		this.cuentacontabletipoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCuentaContableTipo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCuentaContableTipo() {
		this.updateBorderResaltarBusquedasFormularioCuentaContableTipo();
		this.updateVisibilidadBusquedasFormularioCuentaContableTipo();
		this.updateHabilitarBusquedasFormularioCuentaContableTipo();
	}
	
	public void updateBorderResaltarBusquedasFormularioCuentaContableTipo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCuentaContableTipo.getComponents().length>0) {
	

		if(this.cuentacontabletipoConstantesFunciones.resaltarBusquedaPorNombreCuentaContableTipo!=null) {
			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorNombreCuentaContableTipo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);
				jPanel.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarBusquedaPorNombreCuentaContableTipo);
			}
		}

		if(this.cuentacontabletipoConstantesFunciones.resaltarFK_IdTipoCuentaContableTipoCuentaContableTipo!=null) {
			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);
				jPanel.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarFK_IdTipoCuentaContableTipoCuentaContableTipo);
			}
		}

		if(this.cuentacontabletipoConstantesFunciones.resaltarFK_IdTipoProductoServicioCuentaContableTipo!=null) {
			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelFK_IdTipoProductoServicioCuentaContableTipo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);
				jPanel.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarFK_IdTipoProductoServicioCuentaContableTipo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCuentaContableTipo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCuentaContableTipo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorNombreCuentaContableTipo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarBusquedaPorNombreCuentaContableTipo);
			if(!this.cuentacontabletipoConstantesFunciones.mostrarBusquedaPorNombreCuentaContableTipo && index>-1) {
				this.jTabbedPaneBusquedasCuentaContableTipo.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarFK_IdTipoCuentaContableTipoCuentaContableTipo);
			if(!this.cuentacontabletipoConstantesFunciones.mostrarFK_IdTipoCuentaContableTipoCuentaContableTipo && index>-1) {
				this.jTabbedPaneBusquedasCuentaContableTipo.remove(index);
			}

			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelFK_IdTipoProductoServicioCuentaContableTipo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarFK_IdTipoProductoServicioCuentaContableTipo);
			if(!this.cuentacontabletipoConstantesFunciones.mostrarFK_IdTipoProductoServicioCuentaContableTipo && index>-1) {
				this.jTabbedPaneBusquedasCuentaContableTipo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCuentaContableTipo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCuentaContableTipo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorNombreCuentaContableTipo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentacontabletipoConstantesFunciones.activarBusquedaPorNombreCuentaContableTipo);
				this.jTabbedPaneBusquedasCuentaContableTipo.setEnabledAt(index,this.cuentacontabletipoConstantesFunciones.activarBusquedaPorNombreCuentaContableTipo);
			}

			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentacontabletipoConstantesFunciones.activarFK_IdTipoCuentaContableTipoCuentaContableTipo);
				this.jTabbedPaneBusquedasCuentaContableTipo.setEnabledAt(index,this.cuentacontabletipoConstantesFunciones.activarFK_IdTipoCuentaContableTipoCuentaContableTipo);
			}

			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelFK_IdTipoProductoServicioCuentaContableTipo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentacontabletipoConstantesFunciones.activarFK_IdTipoProductoServicioCuentaContableTipo);
				this.jTabbedPaneBusquedasCuentaContableTipo.setEnabledAt(index,this.cuentacontabletipoConstantesFunciones.activarFK_IdTipoProductoServicioCuentaContableTipo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCuentaContableTipo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelBusquedaPorNombreCuentaContableTipo);

			this.jTabbedPaneBusquedasCuentaContableTipo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);

			this.cuentacontabletipoConstantesFunciones.setResaltarBusquedaPorNombreCuentaContableTipo(resaltar);

			jPanel.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarBusquedaPorNombreCuentaContableTipo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoCuentaContableTipo")) {
			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelFK_IdTipoCuentaContableTipoCuentaContableTipo);

			this.jTabbedPaneBusquedasCuentaContableTipo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);

			this.cuentacontabletipoConstantesFunciones.setResaltarFK_IdTipoCuentaContableTipoCuentaContableTipo(resaltar);

			jPanel.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarFK_IdTipoCuentaContableTipoCuentaContableTipo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProductoServicio")) {
			index= this.jTabbedPaneBusquedasCuentaContableTipo.indexOfComponent(this.jPanelFK_IdTipoProductoServicioCuentaContableTipo);

			this.jTabbedPaneBusquedasCuentaContableTipo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaContableTipo.getComponent(index);

			this.cuentacontabletipoConstantesFunciones.setResaltarFK_IdTipoProductoServicioCuentaContableTipo(resaltar);

			jPanel.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarFK_IdTipoProductoServicioCuentaContableTipo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCuentaContableTipo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCuentaContableTipo() throws Exception {

		if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCuentaContableTipo();
		this.updateVisibilidadResaltarControlesFormularioCuentaContableTipo();
		this.updateHabilitarResaltarControlesFormularioCuentaContableTipo();
		
	}
	
	public void updateBorderResaltarControlesFormularioCuentaContableTipo() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cuentacontabletipoConstantesFunciones.resaltaridCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo!=null) {this.jInternalFrameDetalleFormCuentaContableTipo.jLabelidCuentaContableTipo.setBorder(this.cuentacontabletipoConstantesFunciones.resaltaridCuentaContableTipo);}
		if(this.cuentacontabletipoConstantesFunciones.resaltarid_empresaCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo!=null) {this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarid_empresaCuentaContableTipo);}
		if(this.cuentacontabletipoConstantesFunciones.resaltarnombreCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo!=null) {this.jInternalFrameDetalleFormCuentaContableTipo.jTextAreanombreCuentaContableTipo.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarnombreCuentaContableTipo);}
		if(this.cuentacontabletipoConstantesFunciones.resaltardigito_verificadorCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo!=null) {this.jInternalFrameDetalleFormCuentaContableTipo.jTextFielddigito_verificadorCuentaContableTipo.setBorder(this.cuentacontabletipoConstantesFunciones.resaltardigito_verificadorCuentaContableTipo);}
		if(this.cuentacontabletipoConstantesFunciones.resaltarid_tipo_cuenta_contable_tipoCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo!=null) {this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarid_tipo_cuenta_contable_tipoCuentaContableTipo);}
		if(this.cuentacontabletipoConstantesFunciones.resaltarid_tipo_producto_servicioCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo!=null) {this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarid_tipo_producto_servicioCuentaContableTipo);}
		if(this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_ventaCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo!=null) {this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_ventaCuentaContableTipo);}
		if(this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_descuentoCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo!=null) {this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_descuentoCuentaContableTipo);}
		if(this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_devolucionCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo!=null) {this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_devolucionCuentaContableTipo);}
		if(this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_costoCuentaContableTipo!=null && this.jInternalFrameDetalleFormCuentaContableTipo!=null) {this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.setBorder(this.cuentacontabletipoConstantesFunciones.resaltarid_cuenta_contable_costoCuentaContableTipo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCuentaContableTipo() throws Exception {		
		if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
	
		//this.jInternalFrameDetalleFormCuentaContableTipo.jLabelidCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostraridCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jPanelidCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostraridCuentaContableTipo);
		//this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_empresaCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jPanelid_empresaCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_empresaCuentaContableTipo);
		//this.jInternalFrameDetalleFormCuentaContableTipo.jTextAreanombreCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarnombreCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jPanelnombreCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarnombreCuentaContableTipo);
		//this.jInternalFrameDetalleFormCuentaContableTipo.jTextFielddigito_verificadorCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrardigito_verificadorCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jPaneldigito_verificadorCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrardigito_verificadorCuentaContableTipo);
		//this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_tipo_cuenta_contable_tipoCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jPanelid_tipo_cuenta_contable_tipoCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_tipo_cuenta_contable_tipoCuentaContableTipo);
		//this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_tipo_producto_servicioCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jPanelid_tipo_producto_servicioCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_tipo_producto_servicioCuentaContableTipo);
		//this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_ventaCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jPanelid_cuenta_contable_ventaCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_ventaCuentaContableTipo);
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_ventaCuentaContableTipo);
		//this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_descuentoCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jPanelid_cuenta_contable_descuentoCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_descuentoCuentaContableTipo);
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_descuentoCuentaContableTipo);
		//this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_devolucionCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jPanelid_cuenta_contable_devolucionCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_devolucionCuentaContableTipo);
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_devolucionCuentaContableTipo);
		//this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_costoCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jPanelid_cuenta_contable_costoCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_costoCuentaContableTipo);
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipo.setVisible(this.cuentacontabletipoConstantesFunciones.mostrarid_cuenta_contable_costoCuentaContableTipo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCuentaContableTipo() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaContableTipo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaContableTipo!=null) {
	
		this.jInternalFrameDetalleFormCuentaContableTipo.jLabelidCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activaridCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_empresaCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarid_empresaCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jTextAreanombreCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarnombreCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jTextFielddigito_verificadorCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activardigito_verificadorCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_cuenta_contable_tipoCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarid_tipo_cuenta_contable_tipoCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_tipo_producto_servicioCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarid_tipo_producto_servicioCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_ventaCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_ventaCuentaContableTipo);
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_ventaCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_ventaCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_descuentoCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_descuentoCuentaContableTipo);
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_descuentoCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_descuentoCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_devolucionCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_devolucionCuentaContableTipo);
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_devolucionCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_devolucionCuentaContableTipo);
		this.jInternalFrameDetalleFormCuentaContableTipo.jComboBoxid_cuenta_contable_costoCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_costoCuentaContableTipo);
			this.jInternalFrameDetalleFormCuentaContableTipo.jButtonid_cuenta_contable_costoCuentaContableTipo.setEnabled(this.cuentacontabletipoConstantesFunciones.activarid_cuenta_contable_costoCuentaContableTipo);
		}
	}
	
		
}