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

import com.bydan.erp.activosfijos.util.DetalleGrupoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.DetalleGrupoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.DetalleGrupoActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.DetalleGrupoActivoFijoBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetalleGrupoActivoFijoBeanSwingJInternalFrame extends DetalleGrupoActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleGrupoActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleGrupoActivoFijo> detallegrupoactivofijoValidator = new ClassValidator<DetalleGrupoActivoFijo>(DetalleGrupoActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleGrupoActivoFijo detallegrupoactivofijo;	
	public DetalleGrupoActivoFijo detallegrupoactivofijoAux;
	public DetalleGrupoActivoFijo detallegrupoactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleGrupoActivoFijo detallegrupoactivofijoTotales;
	public Long idDetalleGrupoActivoFijoActual;
	public Long iIdNuevoDetalleGrupoActivoFijo=0L;
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

	public String sFinalQueryComboCuentaContableCostoOriginal="";

	public List<CuentaContable> cuentacontablecostooriginalsForeignKey;

	public List<CuentaContable> getcuentacontablecostooriginalsForeignKey() {
		return cuentacontablecostooriginalsForeignKey;
	}

	public void setcuentacontablecostooriginalsForeignKey(List<CuentaContable> cuentacontablecostooriginalsForeignKey) {
		this.cuentacontablecostooriginalsForeignKey = cuentacontablecostooriginalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontablecostooriginalForeignKey;

	public CuentaContable getcuentacontablecostooriginalForeignKey() {
		return cuentacontablecostooriginalForeignKey;
	}

	public void setcuentacontablecostooriginalForeignKey(CuentaContable cuentacontablecostooriginalForeignKey) {
		this.cuentacontablecostooriginalForeignKey = cuentacontablecostooriginalForeignKey;
	}

	public String sFinalQueryComboCuentaContableDepreNormal="";

	public List<CuentaContable> cuentacontabledeprenormalsForeignKey;

	public List<CuentaContable> getcuentacontabledeprenormalsForeignKey() {
		return cuentacontabledeprenormalsForeignKey;
	}

	public void setcuentacontabledeprenormalsForeignKey(List<CuentaContable> cuentacontabledeprenormalsForeignKey) {
		this.cuentacontabledeprenormalsForeignKey = cuentacontabledeprenormalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontabledeprenormalForeignKey;

	public CuentaContable getcuentacontabledeprenormalForeignKey() {
		return cuentacontabledeprenormalForeignKey;
	}

	public void setcuentacontabledeprenormalForeignKey(CuentaContable cuentacontabledeprenormalForeignKey) {
		this.cuentacontabledeprenormalForeignKey = cuentacontabledeprenormalForeignKey;
	}

	public String sFinalQueryComboCuentaContableDepreGastoNormal="";

	public List<CuentaContable> cuentacontabledepregastonormalsForeignKey;

	public List<CuentaContable> getcuentacontabledepregastonormalsForeignKey() {
		return cuentacontabledepregastonormalsForeignKey;
	}

	public void setcuentacontabledepregastonormalsForeignKey(List<CuentaContable> cuentacontabledepregastonormalsForeignKey) {
		this.cuentacontabledepregastonormalsForeignKey = cuentacontabledepregastonormalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontabledepregastonormalForeignKey;

	public CuentaContable getcuentacontabledepregastonormalForeignKey() {
		return cuentacontabledepregastonormalForeignKey;
	}

	public void setcuentacontabledepregastonormalForeignKey(CuentaContable cuentacontabledepregastonormalForeignKey) {
		this.cuentacontabledepregastonormalForeignKey = cuentacontabledepregastonormalForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableCostoOriginalActual=0L;

	public Long getidCuentaContableCostoOriginalActual() {
		return idCuentaContableCostoOriginalActual;
	}

	public void setidCuentaContableCostoOriginalActual(Long idCuentaContableCostoOriginalActual) {
		this.idCuentaContableCostoOriginalActual= idCuentaContableCostoOriginalActual;
	}
	public Long idCuentaContableDepreNormalActual=0L;

	public Long getidCuentaContableDepreNormalActual() {
		return idCuentaContableDepreNormalActual;
	}

	public void setidCuentaContableDepreNormalActual(Long idCuentaContableDepreNormalActual) {
		this.idCuentaContableDepreNormalActual= idCuentaContableDepreNormalActual;
	}
	public Long idCuentaContableDepreGastoNormalActual=0L;

	public Long getidCuentaContableDepreGastoNormalActual() {
		return idCuentaContableDepreGastoNormalActual;
	}

	public void setidCuentaContableDepreGastoNormalActual(Long idCuentaContableDepreGastoNormalActual) {
		this.idCuentaContableDepreGastoNormalActual= idCuentaContableDepreGastoNormalActual;
	}
	
	

	public Boolean isTienePermisosDetalleActivoFijo=false;

	public Boolean getIsTienePermisosDetalleActivoFijo() {
		return isTienePermisosDetalleActivoFijo;
	}

	public void setIsTienePermisosDetalleActivoFijo(Boolean isTienePermisosDetalleActivoFijo) {
		this.isTienePermisosDetalleActivoFijo= isTienePermisosDetalleActivoFijo;
	}


	public Boolean isTienePermisosCuentaContaDetaGrupoActi=false;

	public Boolean getIsTienePermisosCuentaContaDetaGrupoActi() {
		return isTienePermisosCuentaContaDetaGrupoActi;
	}

	public void setIsTienePermisosCuentaContaDetaGrupoActi(Boolean isTienePermisosCuentaContaDetaGrupoActi) {
		this.isTienePermisosCuentaContaDetaGrupoActi= isTienePermisosCuentaContaDetaGrupoActi;
	}


	public Boolean isTienePermisosSubGrupoActivoFijo=false;

	public Boolean getIsTienePermisosSubGrupoActivoFijo() {
		return isTienePermisosSubGrupoActivoFijo;
	}

	public void setIsTienePermisosSubGrupoActivoFijo(Boolean isTienePermisosSubGrupoActivoFijo) {
		this.isTienePermisosSubGrupoActivoFijo= isTienePermisosSubGrupoActivoFijo;
	}


	public Boolean isTienePermisosGastoDepreciacion=false;

	public Boolean getIsTienePermisosGastoDepreciacion() {
		return isTienePermisosGastoDepreciacion;
	}

	public void setIsTienePermisosGastoDepreciacion(Boolean isTienePermisosGastoDepreciacion) {
		this.isTienePermisosGastoDepreciacion= isTienePermisosGastoDepreciacion;
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
	
	public Boolean isPermisoTodoDetalleGrupoActivoFijo;
	public Boolean isPermisoNuevoDetalleGrupoActivoFijo;
	public Boolean isPermisoActualizarDetalleGrupoActivoFijo;
	public Boolean isPermisoActualizarOriginalDetalleGrupoActivoFijo;
	public Boolean isPermisoEliminarDetalleGrupoActivoFijo;
	public Boolean isPermisoGuardarCambiosDetalleGrupoActivoFijo;
	public Boolean isPermisoConsultaDetalleGrupoActivoFijo;
	public Boolean isPermisoBusquedaDetalleGrupoActivoFijo;
	public Boolean isPermisoReporteDetalleGrupoActivoFijo;
	public Boolean isPermisoPaginacionMedioDetalleGrupoActivoFijo;
	public Boolean isPermisoPaginacionAltoDetalleGrupoActivoFijo;
	public Boolean isPermisoPaginacionTodoDetalleGrupoActivoFijo;
	public Boolean isPermisoCopiarDetalleGrupoActivoFijo;
	public Boolean isPermisoVerFormDetalleGrupoActivoFijo;
	public Boolean isPermisoDuplicarDetalleGrupoActivoFijo;
	public Boolean isPermisoOrdenDetalleGrupoActivoFijo;
	
	
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
	
	public DetalleGrupoActivoFijoParameterReturnGeneral detallegrupoactivofijoReturnGeneral;
	public DetalleGrupoActivoFijoParameterReturnGeneral detallegrupoactivofijoParameterGeneral;
	
	

	public DetalleActivoFijoLogic detalleactivofijoLogic=null;

	public DetalleActivoFijoLogic getDetalleActivoFijoLogic() {
		return detalleactivofijoLogic;
	}

	public void setDetalleActivoFijoLogic(DetalleActivoFijoLogic detalleactivofijoLogic) {
		this.detalleactivofijoLogic = detalleactivofijoLogic;
	}


	public CuentaContaDetaGrupoActiLogic cuentacontadetagrupoactiLogic=null;

	public CuentaContaDetaGrupoActiLogic getCuentaContaDetaGrupoActiLogic() {
		return cuentacontadetagrupoactiLogic;
	}

	public void setCuentaContaDetaGrupoActiLogic(CuentaContaDetaGrupoActiLogic cuentacontadetagrupoactiLogic) {
		this.cuentacontadetagrupoactiLogic = cuentacontadetagrupoactiLogic;
	}


	public SubGrupoActivoFijoLogic subgrupoactivofijoLogic=null;

	public SubGrupoActivoFijoLogic getSubGrupoActivoFijoLogic() {
		return subgrupoactivofijoLogic;
	}

	public void setSubGrupoActivoFijoLogic(SubGrupoActivoFijoLogic subgrupoactivofijoLogic) {
		this.subgrupoactivofijoLogic = subgrupoactivofijoLogic;
	}


	public GastoDepreciacionLogic gastodepreciacionLogic=null;

	public GastoDepreciacionLogic getGastoDepreciacionLogic() {
		return gastodepreciacionLogic;
	}

	public void setGastoDepreciacionLogic(GastoDepreciacionLogic gastodepreciacionLogic) {
		this.gastodepreciacionLogic = gastodepreciacionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleGrupoActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioDetalleGrupoActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleGrupoActivoFijoSessionBeanAdditional detallegrupoactivofijoSessionBeanAdditional=null;
	
	public DetalleGrupoActivoFijoSessionBeanAdditional getDetalleGrupoActivoFijoSessionBeanAdditional() {
		return this.detallegrupoactivofijoSessionBeanAdditional;
	}
	
	public void setDetalleGrupoActivoFijoSessionBeanAdditional(DetalleGrupoActivoFijoSessionBeanAdditional detallegrupoactivofijoSessionBeanAdditional) {
		try {
			this.detallegrupoactivofijoSessionBeanAdditional=detallegrupoactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional detallegrupoactivofijoBeanSwingJInternalFrameAdditional=null;
	//public class DetalleGrupoActivoFijoBeanSwingJInternalFrame
	
	public DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional getDetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional() {
		return this.detallegrupoactivofijoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional(DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional detallegrupoactivofijoBeanSwingJInternalFrameAdditional) {
		try {
			this.detallegrupoactivofijoBeanSwingJInternalFrameAdditional=detallegrupoactivofijoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleGrupoActivoFijo detallegrupoactivofijoBean;
	public DetalleGrupoActivoFijoConstantesFunciones detallegrupoactivofijoConstantesFunciones;
	//public DetalleGrupoActivoFijoParameterReturnGeneral detallegrupoactivofijoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CuentaContableLogic cuentacontablecostooriginalLogic;
	public CuentaContableLogic cuentacontabledeprenormalLogic;
	public CuentaContableLogic cuentacontabledepregastonormalLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleGrupoActivoFijo> detallegrupoactivofijos;	
	//public List<DetalleGrupoActivoFijo> detallegrupoactivofijosEliminados;
	//public List<DetalleGrupoActivoFijo> detallegrupoactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarDetalleGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormDetalleGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenDetalleGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarDetalleGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContableCostoOriginal=false;
	public Boolean isVisibilidadFK_IdCuentaContableDepreGastoNormal=false;
	public Boolean isVisibilidadFK_IdCuentaContableDepreNormal=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoDetalleGrupoActivoFijo() {
		return this.iIdNuevoDetalleGrupoActivoFijo;
	}

	public void setiIdNuevoDetalleGrupoActivoFijo(Long iIdNuevoDetalleGrupoActivoFijo) {
		this.iIdNuevoDetalleGrupoActivoFijo = iIdNuevoDetalleGrupoActivoFijo;
	}
	
	public Long getidDetalleGrupoActivoFijoActual() {
		return this.idDetalleGrupoActivoFijoActual;
	}

	public void setidDetalleGrupoActivoFijoActual(Long idDetalleGrupoActivoFijoActual) {
		this.idDetalleGrupoActivoFijoActual = idDetalleGrupoActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleGrupoActivoFijo getdetallegrupoactivofijo() {
		return this.detallegrupoactivofijo;
	}

	public void setdetallegrupoactivofijo(DetalleGrupoActivoFijo detallegrupoactivofijo) {
		this.detallegrupoactivofijo = detallegrupoactivofijo;
	}
	
	public DetalleGrupoActivoFijo getdetallegrupoactivofijoAux() {
		return this.detallegrupoactivofijoAux;
	}

	public void setdetallegrupoactivofijoAux(DetalleGrupoActivoFijo detallegrupoactivofijoAux) {
		this.detallegrupoactivofijoAux = detallegrupoactivofijoAux;
	}				
	
	public DetalleGrupoActivoFijo getdetallegrupoactivofijoAnterior() {
		return this.detallegrupoactivofijoAnterior;
	}

	public void setdetallegrupoactivofijoAnterior(DetalleGrupoActivoFijo detallegrupoactivofijoAnterior) {
		this.detallegrupoactivofijoAnterior = detallegrupoactivofijoAnterior;
	}	
	
	public DetalleGrupoActivoFijo getdetallegrupoactivofijoTotales() {
		return this.detallegrupoactivofijoTotales;
	}

	public void setdetallegrupoactivofijoTotales(DetalleGrupoActivoFijo detallegrupoactivofijoTotales) {
		this.detallegrupoactivofijoTotales = detallegrupoactivofijoTotales;
	}	
	
	public DetalleGrupoActivoFijo getdetallegrupoactivofijoBean() {
		return this.detallegrupoactivofijoBean;
	}

	public void setdetallegrupoactivofijoBean(DetalleGrupoActivoFijo detallegrupoactivofijoBean) {
		this.detallegrupoactivofijoBean = detallegrupoactivofijoBean;
	}	
	
	public DetalleGrupoActivoFijoParameterReturnGeneral getdetallegrupoactivofijoReturnGeneral() {
		return this.detallegrupoactivofijoReturnGeneral;
	}

	public void setdetallegrupoactivofijoReturnGeneral(DetalleGrupoActivoFijoParameterReturnGeneral detallegrupoactivofijoReturnGeneral) {
		this.detallegrupoactivofijoReturnGeneral = detallegrupoactivofijoReturnGeneral;
	}	
	
	
	public Long id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal=null;

	public Long getid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal() {
		return this.id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal;
	}

	public void setid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal(Long id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal) {
		this.id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal = id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal;
	}

	public Long id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal=null;

	public Long getid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal() {
		return this.id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal;
	}

	public void setid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal(Long id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal) {
		this.id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal = id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal;
	}

	public Long id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal=null;

	public Long getid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal() {
		return this.id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal;
	}

	public void setid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal(Long id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal) {
		this.id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal = id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal;
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
	
	
	public DetalleGrupoActivoFijoLogic getDetalleGrupoActivoFijoLogic()	{		
		return detallegrupoactivofijoLogic;
	}

	public void setDetalleGrupoActivoFijoLogic(DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic) {
		this.detallegrupoactivofijoLogic = detallegrupoactivofijoLogic;
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
	
	public Boolean getIsEsNuevoDetalleGrupoActivoFijo() {
		return isEsNuevoDetalleGrupoActivoFijo;
	}

	public void setIsEsNuevoDetalleGrupoActivoFijo(Boolean isEsNuevoDetalleGrupoActivoFijo) {
		this.isEsNuevoDetalleGrupoActivoFijo = isEsNuevoDetalleGrupoActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleGrupoActivoFijo() {
		return esParaAccionDesdeFormularioDetalleGrupoActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleGrupoActivoFijo(Boolean esParaAccionDesdeFormularioDetalleGrupoActivoFijo) {
		this.esParaAccionDesdeFormularioDetalleGrupoActivoFijo = esParaAccionDesdeFormularioDetalleGrupoActivoFijo;
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

			if(this.detallegrupoactivofijoSessionBean==null) {
				this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallegrupoactivofijoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosCuentaContableCostoOriginalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablecostooriginalsForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.detallegrupoactivofijoSessionBean==null) {
				this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCostoOriginal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontablecostooriginalLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablecostooriginalsForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableCostoOriginal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(detallegrupoactivofijoSessionBean.getlidCuentaContableCostoOriginalActual());
					this.cuentacontablecostooriginalsForeignKey.add(cuentacontableLogic.getCuentaContable());
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

	public void cargarCombosCuentaContableDepreNormalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontabledeprenormalsForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.detallegrupoactivofijoSessionBean==null) {
				this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDepreNormal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontabledeprenormalLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontabledeprenormalsForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableDepreNormal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(detallegrupoactivofijoSessionBean.getlidCuentaContableDepreNormalActual());
					this.cuentacontabledeprenormalsForeignKey.add(cuentacontableLogic.getCuentaContable());
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

	public void cargarCombosCuentaContableDepreGastoNormalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontabledepregastonormalsForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.detallegrupoactivofijoSessionBean==null) {
				this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDepreGastoNormal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontabledepregastonormalLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontabledepregastonormalsForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableDepreGastoNormal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(detallegrupoactivofijoSessionBean.getlidCuentaContableDepreGastoNormalActual());
					this.cuentacontabledepregastonormalsForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.detallegrupoactivofijo!=null) {
						this.detallegrupoactivofijo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleGrupoActivoFijo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleGrupoActivoFijoGenerico)throws Exception
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
				jComboBoxid_empresaDetalleGrupoActivoFijoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleGrupoActivoFijoGenerico!=null && jComboBoxid_empresaDetalleGrupoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleGrupoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableCostoOriginalForeignKey(Long idCuentaContableCostoOriginalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecostooriginalTemp=null;

			for(CuentaContable cuentacontablecostooriginalAux:cuentacontablecostooriginalsForeignKey) {
				if(cuentacontablecostooriginalAux.getId()!=null && cuentacontablecostooriginalAux.getId().equals(idCuentaContableCostoOriginalSeleccionado)) {
					cuentacontablecostooriginalTemp=cuentacontablecostooriginalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontablecostooriginalTemp!=null) {

					if(this.detallegrupoactivofijo!=null) {
						this.detallegrupoactivofijo.setCuentaContableCostoOriginal(cuentacontablecostooriginalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setSelectedItem(cuentacontablecostooriginalTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setSelectedItem(cuentacontablecostooriginalTemp);
					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCostoOriginal") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontablecostooriginalTemp!=null && jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo!=null) {
						jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setSelectedItem(cuentacontablecostooriginalTemp);
					} else {
						if(jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo!=null) {
							//jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setSelectedItem(cuentacontablecostooriginalTemp);
							if(jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.getItemCount()>0) {
								jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setSelectedIndex(0);
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

	public String getActualCuentaContableCostoOriginalForeignKeyDescripcion(Long idCuentaContableCostoOriginalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontablecostooriginalTemp=null;

			for(CuentaContable cuentacontablecostooriginalAux:cuentacontablecostooriginalsForeignKey) {
				if(cuentacontablecostooriginalAux.getId()!=null && cuentacontablecostooriginalAux.getId().equals(idCuentaContableCostoOriginalSeleccionado)) {
					cuentacontablecostooriginalTemp=cuentacontablecostooriginalAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontablecostooriginalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableCostoOriginalForeignKeyGenerico(Long idCuentaContableCostoOriginalSeleccionado,JComboBox jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecostooriginalTemp=null;

			for(CuentaContable cuentacontablecostooriginalAux:cuentacontablecostooriginalsForeignKey) {
				if(cuentacontablecostooriginalAux.getId()!=null && cuentacontablecostooriginalAux.getId().equals(idCuentaContableCostoOriginalSeleccionado)) {
					cuentacontablecostooriginalTemp=cuentacontablecostooriginalAux;
					break;
				}
			}

			if(cuentacontablecostooriginalTemp!=null) {
				jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijoGenerico.setSelectedItem(cuentacontablecostooriginalTemp);
			} else {
				if(jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijoGenerico!=null && jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableDepreNormalForeignKey(Long idCuentaContableDepreNormalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledeprenormalTemp=null;

			for(CuentaContable cuentacontabledeprenormalAux:cuentacontabledeprenormalsForeignKey) {
				if(cuentacontabledeprenormalAux.getId()!=null && cuentacontabledeprenormalAux.getId().equals(idCuentaContableDepreNormalSeleccionado)) {
					cuentacontabledeprenormalTemp=cuentacontabledeprenormalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontabledeprenormalTemp!=null) {

					if(this.detallegrupoactivofijo!=null) {
						this.detallegrupoactivofijo.setCuentaContableDepreNormal(cuentacontabledeprenormalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledeprenormalTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledeprenormalTemp);
					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDepreNormal") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontabledeprenormalTemp!=null && jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo!=null) {
						jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledeprenormalTemp);
					} else {
						if(jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo!=null) {
							//jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledeprenormalTemp);
							if(jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.getItemCount()>0) {
								jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setSelectedIndex(0);
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

	public String getActualCuentaContableDepreNormalForeignKeyDescripcion(Long idCuentaContableDepreNormalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontabledeprenormalTemp=null;

			for(CuentaContable cuentacontabledeprenormalAux:cuentacontabledeprenormalsForeignKey) {
				if(cuentacontabledeprenormalAux.getId()!=null && cuentacontabledeprenormalAux.getId().equals(idCuentaContableDepreNormalSeleccionado)) {
					cuentacontabledeprenormalTemp=cuentacontabledeprenormalAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontabledeprenormalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableDepreNormalForeignKeyGenerico(Long idCuentaContableDepreNormalSeleccionado,JComboBox jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledeprenormalTemp=null;

			for(CuentaContable cuentacontabledeprenormalAux:cuentacontabledeprenormalsForeignKey) {
				if(cuentacontabledeprenormalAux.getId()!=null && cuentacontabledeprenormalAux.getId().equals(idCuentaContableDepreNormalSeleccionado)) {
					cuentacontabledeprenormalTemp=cuentacontabledeprenormalAux;
					break;
				}
			}

			if(cuentacontabledeprenormalTemp!=null) {
				jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijoGenerico.setSelectedItem(cuentacontabledeprenormalTemp);
			} else {
				if(jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijoGenerico!=null && jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableDepreGastoNormalForeignKey(Long idCuentaContableDepreGastoNormalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledepregastonormalTemp=null;

			for(CuentaContable cuentacontabledepregastonormalAux:cuentacontabledepregastonormalsForeignKey) {
				if(cuentacontabledepregastonormalAux.getId()!=null && cuentacontabledepregastonormalAux.getId().equals(idCuentaContableDepreGastoNormalSeleccionado)) {
					cuentacontabledepregastonormalTemp=cuentacontabledepregastonormalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontabledepregastonormalTemp!=null) {

					if(this.detallegrupoactivofijo!=null) {
						this.detallegrupoactivofijo.setCuentaContableDepreGastoNormal(cuentacontabledepregastonormalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledepregastonormalTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledepregastonormalTemp);
					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDepreGastoNormal") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontabledepregastonormalTemp!=null && jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo!=null) {
						jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledepregastonormalTemp);
					} else {
						if(jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo!=null) {
							//jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledepregastonormalTemp);
							if(jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.getItemCount()>0) {
								jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setSelectedIndex(0);
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

	public String getActualCuentaContableDepreGastoNormalForeignKeyDescripcion(Long idCuentaContableDepreGastoNormalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontabledepregastonormalTemp=null;

			for(CuentaContable cuentacontabledepregastonormalAux:cuentacontabledepregastonormalsForeignKey) {
				if(cuentacontabledepregastonormalAux.getId()!=null && cuentacontabledepregastonormalAux.getId().equals(idCuentaContableDepreGastoNormalSeleccionado)) {
					cuentacontabledepregastonormalTemp=cuentacontabledepregastonormalAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontabledepregastonormalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableDepreGastoNormalForeignKeyGenerico(Long idCuentaContableDepreGastoNormalSeleccionado,JComboBox jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledepregastonormalTemp=null;

			for(CuentaContable cuentacontabledepregastonormalAux:cuentacontabledepregastonormalsForeignKey) {
				if(cuentacontabledepregastonormalAux.getId()!=null && cuentacontabledepregastonormalAux.getId().equals(idCuentaContableDepreGastoNormalSeleccionado)) {
					cuentacontabledepregastonormalTemp=cuentacontabledepregastonormalAux;
					break;
				}
			}

			if(cuentacontabledepregastonormalTemp!=null) {
				jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoGenerico.setSelectedItem(cuentacontabledepregastonormalTemp);
			} else {
				if(jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoGenerico!=null && jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleGrupoActivoFijo detallegrupoactivofijo,JComboBox jComboBoxid_empresaDetalleGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleGrupoActivoFijoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleGrupoActivoFijoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallegrupoactivofijo.setid_empresa(empresaAux.getId());
				detallegrupoactivofijo.setempresa_descripcion(DetalleGrupoActivoFijoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallegrupoactivofijo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCostoOriginalForeignKey(DetalleGrupoActivoFijo detallegrupoactivofijo,JComboBox jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				detallegrupoactivofijo.setid_cuenta_contable_costo_original(cuentacontableAux.getId());
				detallegrupoactivofijo.setcuentacontablecostooriginal_descripcion(DetalleGrupoActivoFijoConstantesFunciones.getCuentaContableCostoOriginalDescripcion(cuentacontableAux));
				detallegrupoactivofijo.setCuentaContableCostoOriginal(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableDepreNormalForeignKey(DetalleGrupoActivoFijo detallegrupoactivofijo,JComboBox jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				detallegrupoactivofijo.setid_cuenta_contable_depre_normal(cuentacontableAux.getId());
				detallegrupoactivofijo.setcuentacontabledeprenormal_descripcion(DetalleGrupoActivoFijoConstantesFunciones.getCuentaContableDepreNormalDescripcion(cuentacontableAux));
				detallegrupoactivofijo.setCuentaContableDepreNormal(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableDepreGastoNormalForeignKey(DetalleGrupoActivoFijo detallegrupoactivofijo,JComboBox jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				detallegrupoactivofijo.setid_cuenta_contable_depre_gasto_normal(cuentacontableAux.getId());
				detallegrupoactivofijo.setcuentacontabledepregastonormal_descripcion(DetalleGrupoActivoFijoConstantesFunciones.getCuentaContableDepreGastoNormalDescripcion(cuentacontableAux));
				detallegrupoactivofijo.setCuentaContableDepreGastoNormal(cuentacontableAux);			}
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

					if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { 
					}

					if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableCostoOriginalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.removeAllItems();

							for(CuentaContable cuentacontablecostooriginal:this.cuentacontablecostooriginalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.addItem(cuentacontablecostooriginal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { 
					}

					if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCostoOriginal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.removeAllItems();

							for(CuentaContable cuentacontablecostooriginal:this.cuentacontablecostooriginalsForeignKey) {
								this.jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.addItem(cuentacontablecostooriginal);
							}
						}

						if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableDepreNormalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.removeAllItems();

							for(CuentaContable cuentacontabledeprenormal:this.cuentacontabledeprenormalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.addItem(cuentacontabledeprenormal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { 
					}

					if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDepreNormal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.removeAllItems();

							for(CuentaContable cuentacontabledeprenormal:this.cuentacontabledeprenormalsForeignKey) {
								this.jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.addItem(cuentacontabledeprenormal);
							}
						}

						if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableDepreGastoNormalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.removeAllItems();

							for(CuentaContable cuentacontabledepregastonormal:this.cuentacontabledepregastonormalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.addItem(cuentacontabledepregastonormal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { 
					}

					if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDepreGastoNormal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.removeAllItems();

							for(CuentaContable cuentacontabledepregastonormal:this.cuentacontabledepregastonormalsForeignKey) {
								this.jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.addItem(cuentacontabledepregastonormal);
							}
						}

						if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableCostoOriginalForeignKey(CuentaContable cuentacontablecostooriginal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setSelectedItem(cuentacontablecostooriginal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setSelectedItem(cuentacontablecostooriginal);
						} else {
							this.jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableDepreNormalForeignKey(CuentaContable cuentacontabledeprenormal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledeprenormal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledeprenormal);
						} else {
							this.jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableDepreGastoNormalForeignKey(CuentaContable cuentacontabledepregastonormal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledepregastonormal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setSelectedItem(cuentacontabledepregastonormal);
						} else {
							this.jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleGrupoActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleGrupoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesDetalleGrupoActivoFijo(this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleGrupoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesDetalleGrupoActivoFijo(this.detallegrupoactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detallegrupoactivofijoLogic.setDetalleGrupoActivoFijos(this.detallegrupoactivofijos);
			detallegrupoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleGrupoActivoFijoParameterReturnGeneral getDetalleGrupoActivoFijoParameterGeneral() {
		return this.detallegrupoactivofijoParameterGeneral;
	}
	
	public void setDetalleGrupoActivoFijoParameterGeneral(DetalleGrupoActivoFijoParameterReturnGeneral detallegrupoactivofijoParameterGeneral) {
		this.detallegrupoactivofijoParameterGeneral = detallegrupoactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleGrupoActivoFijo() {
		return isPermisoTodoDetalleGrupoActivoFijo;
	}

	public void setIsPermisoTodoDetalleGrupoActivoFijo(Boolean isPermisoTodoDetalleGrupoActivoFijo) {
		this.isPermisoTodoDetalleGrupoActivoFijo = isPermisoTodoDetalleGrupoActivoFijo;
	}

	public Boolean getIsPermisoNuevoDetalleGrupoActivoFijo() {
		return isPermisoNuevoDetalleGrupoActivoFijo;
	}

	public void setIsPermisoNuevoDetalleGrupoActivoFijo(Boolean isPermisoNuevoDetalleGrupoActivoFijo) {
		this.isPermisoNuevoDetalleGrupoActivoFijo = isPermisoNuevoDetalleGrupoActivoFijo;
	}

	public Boolean getIsPermisoActualizarDetalleGrupoActivoFijo() {
		return isPermisoActualizarDetalleGrupoActivoFijo;
	}

	public void setIsPermisoActualizarDetalleGrupoActivoFijo(Boolean isPermisoActualizarDetalleGrupoActivoFijo) {
		this.isPermisoActualizarDetalleGrupoActivoFijo = isPermisoActualizarDetalleGrupoActivoFijo;
	}

	public Boolean getIsPermisoEliminarDetalleGrupoActivoFijo() {
		return isPermisoEliminarDetalleGrupoActivoFijo;
	}

	public void setIsPermisoEliminarDetalleGrupoActivoFijo(Boolean isPermisoEliminarDetalleGrupoActivoFijo) {
		this.isPermisoEliminarDetalleGrupoActivoFijo = isPermisoEliminarDetalleGrupoActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleGrupoActivoFijo() {
		return isPermisoGuardarCambiosDetalleGrupoActivoFijo;
	}

	public void setIsPermisoGuardarCambiosDetalleGrupoActivoFijo(Boolean isPermisoGuardarCambiosDetalleGrupoActivoFijo) {
		this.isPermisoGuardarCambiosDetalleGrupoActivoFijo = isPermisoGuardarCambiosDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaDetalleGrupoActivoFijo() {
		return isPermisoConsultaDetalleGrupoActivoFijo;
	}

	public void setIsPermisoConsultaDetalleGrupoActivoFijo(Boolean isPermisoConsultaDetalleGrupoActivoFijo) {
		this.isPermisoConsultaDetalleGrupoActivoFijo = isPermisoConsultaDetalleGrupoActivoFijo;
	}

	public Boolean getIsPermisoBusquedaDetalleGrupoActivoFijo() {
		return isPermisoBusquedaDetalleGrupoActivoFijo;
	}

	public void setIsPermisoBusquedaDetalleGrupoActivoFijo(Boolean isPermisoBusquedaDetalleGrupoActivoFijo) {
		this.isPermisoBusquedaDetalleGrupoActivoFijo = isPermisoBusquedaDetalleGrupoActivoFijo;
	}

	public Boolean getIsPermisoReporteDetalleGrupoActivoFijo() {
		return isPermisoReporteDetalleGrupoActivoFijo;
	}

	public void setIsPermisoReporteDetalleGrupoActivoFijo(Boolean isPermisoReporteDetalleGrupoActivoFijo) {
		this.isPermisoReporteDetalleGrupoActivoFijo = isPermisoReporteDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleGrupoActivoFijo() {
		return isPermisoPaginacionMedioDetalleGrupoActivoFijo;
	}

	public void setIsPermisoPaginacionMedioDetalleGrupoActivoFijo(Boolean isPermisoPaginacionMedioDetalleGrupoActivoFijo) {
		this.isPermisoPaginacionMedioDetalleGrupoActivoFijo = isPermisoPaginacionMedioDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleGrupoActivoFijo() {
		return isPermisoPaginacionTodoDetalleGrupoActivoFijo;
	}

	public void setIsPermisoPaginacionTodoDetalleGrupoActivoFijo(Boolean isPermisoPaginacionTodoDetalleGrupoActivoFijo) {
		this.isPermisoPaginacionTodoDetalleGrupoActivoFijo = isPermisoPaginacionTodoDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleGrupoActivoFijo() {
		return isPermisoPaginacionAltoDetalleGrupoActivoFijo;
	}

	public void setIsPermisoPaginacionAltoDetalleGrupoActivoFijo(Boolean isPermisoPaginacionAltoDetalleGrupoActivoFijo) {
		this.isPermisoPaginacionAltoDetalleGrupoActivoFijo = isPermisoPaginacionAltoDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarDetalleGrupoActivoFijo() {
		return isPermisoCopiarDetalleGrupoActivoFijo;
	}

	public void setIsPermisoCopiarDetalleGrupoActivoFijo(Boolean isPermisoCopiarDetalleGrupoActivoFijo) {
		this.isPermisoCopiarDetalleGrupoActivoFijo = isPermisoCopiarDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormDetalleGrupoActivoFijo() {
		return isPermisoVerFormDetalleGrupoActivoFijo;
	}

	public void setIsPermisoVerFormDetalleGrupoActivoFijo(Boolean isPermisoVerFormDetalleGrupoActivoFijo) {
		this.isPermisoVerFormDetalleGrupoActivoFijo = isPermisoVerFormDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarDetalleGrupoActivoFijo() {
		return isPermisoDuplicarDetalleGrupoActivoFijo;
	}

	public void setIsPermisoDuplicarDetalleGrupoActivoFijo(Boolean isPermisoDuplicarDetalleGrupoActivoFijo) {
		this.isPermisoDuplicarDetalleGrupoActivoFijo = isPermisoDuplicarDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenDetalleGrupoActivoFijo() {
		return isPermisoOrdenDetalleGrupoActivoFijo;
	}

	public void setIsPermisoOrdenDetalleGrupoActivoFijo(Boolean isPermisoOrdenDetalleGrupoActivoFijo) {
		this.isPermisoOrdenDetalleGrupoActivoFijo = isPermisoOrdenDetalleGrupoActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaNuevoDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaNuevoDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo = isVisibilidadCeldaNuevoDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaDuplicarDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaDuplicarDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaDuplicarDetalleGrupoActivoFijo = isVisibilidadCeldaDuplicarDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaCopiarDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaCopiarDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaCopiarDetalleGrupoActivoFijo = isVisibilidadCeldaCopiarDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaVerFormDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaVerFormDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaVerFormDetalleGrupoActivoFijo = isVisibilidadCeldaVerFormDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaOrdenDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaOrdenDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaOrdenDetalleGrupoActivoFijo = isVisibilidadCeldaOrdenDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo = isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaModificarDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaModificarDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo = isVisibilidadCeldaModificarDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaActualizarDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaActualizarDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo = isVisibilidadCeldaActualizarDetalleGrupoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaEliminarDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaEliminarDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo = isVisibilidadCeldaEliminarDetalleGrupoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaCancelarDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaCancelarDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo = isVisibilidadCeldaCancelarDetalleGrupoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaGuardarDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaGuardarDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo = isVisibilidadCeldaGuardarDetalleGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo = isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo;
	}
		
	public DetalleGrupoActivoFijoSessionBean getdetallegrupoactivofijoSessionBean() {
		return this.detallegrupoactivofijoSessionBean;
	}
	
	public void setdetallegrupoactivofijoSessionBean(DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean) {
		this.detallegrupoactivofijoSessionBean=detallegrupoactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCuentaContableCostoOriginal() {
		return this.isVisibilidadFK_IdCuentaContableCostoOriginal;
	}

	public void setisVisibilidadFK_IdCuentaContableCostoOriginal(Boolean isVisibilidadFK_IdCuentaContableCostoOriginal) {
		this.isVisibilidadFK_IdCuentaContableCostoOriginal=isVisibilidadFK_IdCuentaContableCostoOriginal;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableDepreGastoNormal() {
		return this.isVisibilidadFK_IdCuentaContableDepreGastoNormal;
	}

	public void setisVisibilidadFK_IdCuentaContableDepreGastoNormal(Boolean isVisibilidadFK_IdCuentaContableDepreGastoNormal) {
		this.isVisibilidadFK_IdCuentaContableDepreGastoNormal=isVisibilidadFK_IdCuentaContableDepreGastoNormal;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableDepreNormal() {
		return this.isVisibilidadFK_IdCuentaContableDepreNormal;
	}

	public void setisVisibilidadFK_IdCuentaContableDepreNormal(Boolean isVisibilidadFK_IdCuentaContableDepreNormal) {
		this.isVisibilidadFK_IdCuentaContableDepreNormal=isVisibilidadFK_IdCuentaContableDepreNormal;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detallegrupoactivofijo,null);
				this.setActualParaGuardarCuentaContableCostoOriginalForeignKey(detallegrupoactivofijo,null);
				this.setActualParaGuardarCuentaContableDepreNormalForeignKey(detallegrupoactivofijo,null);
				this.setActualParaGuardarCuentaContableDepreGastoNormalForeignKey(detallegrupoactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(DetalleGrupoActivoFijo detallegrupoactivofijo,DetalleGrupoActivoFijo detallegrupoactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleGrupoActivoFijo(detallegrupoactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallegrupoactivofijoAux.setId(detallegrupoactivofijo.getId());
		detallegrupoactivofijoAux.setVersionRow(detallegrupoactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleGrupoActivoFijo();
		
			int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detallegrupoactivofijoValidator.getInvalidValues(this.detallegrupoactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detallegrupoactivofijoLogic.setDatosCliente(datosCliente);
			detallegrupoactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detallegrupoactivofijoAux=new  DetalleGrupoActivoFijo();
				
				detallegrupoactivofijoAux.setIsNew(true);
				detallegrupoactivofijoAux.setIsChanged(true);
				
				detallegrupoactivofijoAux.setDetalleGrupoActivoFijoOriginal(this.detallegrupoactivofijo);
				
				detallegrupoactivofijoAux.setId(this.detallegrupoactivofijo.getId());	
				detallegrupoactivofijoAux.setVersionRow(this.detallegrupoactivofijo.getVersionRow());	
				detallegrupoactivofijoAux.setid_empresa(this.detallegrupoactivofijo.getid_empresa());	
				detallegrupoactivofijoAux.setcodigo(this.detallegrupoactivofijo.getcodigo());	
				detallegrupoactivofijoAux.setnombre(this.detallegrupoactivofijo.getnombre());	
				detallegrupoactivofijoAux.setsiglas(this.detallegrupoactivofijo.getsiglas());	
				detallegrupoactivofijoAux.setid_cuenta_contable_costo_original(this.detallegrupoactivofijo.getid_cuenta_contable_costo_original());	
				detallegrupoactivofijoAux.setid_cuenta_contable_depre_normal(this.detallegrupoactivofijo.getid_cuenta_contable_depre_normal());	
				detallegrupoactivofijoAux.setid_cuenta_contable_depre_gasto_normal(this.detallegrupoactivofijo.getid_cuenta_contable_depre_gasto_normal());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijoLogic.saveDetalleGrupoActivoFijos();//WithConnection
						//detallegrupoactivofijoLogic.getSetVersionRowDetalleGrupoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallegrupoactivofijo,detallegrupoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesDetalleGrupoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactisEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.getSubGrupoActivoFijos().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.getGastoDepreciacions().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactis.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactisEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijos.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacions.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallegrupoactivofijoLogic.saveDetalleGrupoActivoFijoRelaciones(detallegrupoactivofijoAux,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos(),this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis(),this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.getSubGrupoActivoFijos(),this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.getGastoDepreciacions());//WithConnection
								//detallegrupoactivofijoLogic.getSetVersionRowDetalleGrupoActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallegrupoactivofijo,detallegrupoactivofijoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(new ArrayList<DetalleActivoFijo>());
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(new ArrayList<CuentaContaDetaGrupoActi>());
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.setSubGrupoActivoFijos(new ArrayList<SubGrupoActivoFijo>());
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.setGastoDepreciacions(new ArrayList<GastoDepreciacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos= new ArrayList<DetalleActivoFijo>();
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactis= new ArrayList<CuentaContaDetaGrupoActi>();
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijos= new ArrayList<SubGrupoActivoFijo>();
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacions= new ArrayList<GastoDepreciacion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setCuentaContaDetaGrupoActis(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setSubGrupoActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.getSubGrupoActivoFijos());

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setGastoDepreciacions(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.getGastoDepreciacions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallegrupoactivofijo,detallegrupoactivofijoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detallegrupoactivofijoAux=new  DetalleGrupoActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado() && this.detallegrupoactivofijo.getId()>=0)) {
						
					detallegrupoactivofijoAux.setIsNew(false);
				}
				
				detallegrupoactivofijoAux.setIsDeleted(false);
			
				detallegrupoactivofijoAux.setId(this.detallegrupoactivofijo.getId());	
				detallegrupoactivofijoAux.setVersionRow(this.detallegrupoactivofijo.getVersionRow());	
				detallegrupoactivofijoAux.setid_empresa(this.detallegrupoactivofijo.getid_empresa());	
				detallegrupoactivofijoAux.setcodigo(this.detallegrupoactivofijo.getcodigo());	
				detallegrupoactivofijoAux.setnombre(this.detallegrupoactivofijo.getnombre());	
				detallegrupoactivofijoAux.setsiglas(this.detallegrupoactivofijo.getsiglas());	
				detallegrupoactivofijoAux.setid_cuenta_contable_costo_original(this.detallegrupoactivofijo.getid_cuenta_contable_costo_original());	
				detallegrupoactivofijoAux.setid_cuenta_contable_depre_normal(this.detallegrupoactivofijo.getid_cuenta_contable_depre_normal());	
				detallegrupoactivofijoAux.setid_cuenta_contable_depre_gasto_normal(this.detallegrupoactivofijo.getid_cuenta_contable_depre_gasto_normal());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijoLogic.saveDetalleGrupoActivoFijos();//WithConnection
						//detallegrupoactivofijoLogic.getSetVersionRowDetalleGrupoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallegrupoactivofijo,detallegrupoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesDetalleGrupoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactisEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.getSubGrupoActivoFijos().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.getGastoDepreciacions().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactis.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactisEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijos.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacions.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallegrupoactivofijoLogic.saveDetalleGrupoActivoFijoRelaciones(detallegrupoactivofijoAux,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos(),this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis(),this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.getSubGrupoActivoFijos(),this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.getGastoDepreciacions());//WithConnection
								//detallegrupoactivofijoLogic.getSetVersionRowDetalleGrupoActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallegrupoactivofijo,detallegrupoactivofijoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(new ArrayList<DetalleActivoFijo>());
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(new ArrayList<CuentaContaDetaGrupoActi>());
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.setSubGrupoActivoFijos(new ArrayList<SubGrupoActivoFijo>());
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.setGastoDepreciacions(new ArrayList<GastoDepreciacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos= new ArrayList<DetalleActivoFijo>();
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactis= new ArrayList<CuentaContaDetaGrupoActi>();
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijos= new ArrayList<SubGrupoActivoFijo>();
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacions= new ArrayList<GastoDepreciacion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setCuentaContaDetaGrupoActis(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setSubGrupoActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.getSubGrupoActivoFijos());

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setGastoDepreciacions(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.getGastoDepreciacions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallegrupoactivofijo,detallegrupoactivofijoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detallegrupoactivofijoAux=new  DetalleGrupoActivoFijo();
				
				detallegrupoactivofijoAux.setIsNew(false);
				detallegrupoactivofijoAux.setIsChanged(false);
				
				detallegrupoactivofijoAux.setIsDeleted(true);
				
				detallegrupoactivofijoAux.setId(this.detallegrupoactivofijo.getId());	
				detallegrupoactivofijoAux.setVersionRow(this.detallegrupoactivofijo.getVersionRow());	
				detallegrupoactivofijoAux.setid_empresa(this.detallegrupoactivofijo.getid_empresa());	
				detallegrupoactivofijoAux.setcodigo(this.detallegrupoactivofijo.getcodigo());	
				detallegrupoactivofijoAux.setnombre(this.detallegrupoactivofijo.getnombre());	
				detallegrupoactivofijoAux.setsiglas(this.detallegrupoactivofijo.getsiglas());	
				detallegrupoactivofijoAux.setid_cuenta_contable_costo_original(this.detallegrupoactivofijo.getid_cuenta_contable_costo_original());	
				detallegrupoactivofijoAux.setid_cuenta_contable_depre_normal(this.detallegrupoactivofijo.getid_cuenta_contable_depre_normal());	
				detallegrupoactivofijoAux.setid_cuenta_contable_depre_gasto_normal(this.detallegrupoactivofijo.getid_cuenta_contable_depre_gasto_normal());	
				
				if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detallegrupoactivofijoAux.getId()>=0) {	
						this.detallegrupoactivofijosEliminados.add(detallegrupoactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijoLogic.saveDetalleGrupoActivoFijos();//WithConnection
						//detallegrupoactivofijoLogic.getSetVersionRowDetalleGrupoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactisEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.getSubGrupoActivoFijos().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.getGastoDepreciacions().addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactis.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactisEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijos.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijosEliminados);
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacions.addAll(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallegrupoactivofijoLogic.saveDetalleGrupoActivoFijoRelaciones(detallegrupoactivofijoAux,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos(),this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis(),this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.getSubGrupoActivoFijos(),this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.getGastoDepreciacions());//WithConnection
								//detallegrupoactivofijoLogic.getSetVersionRowDetalleGrupoActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(new ArrayList<DetalleActivoFijo>());
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(new ArrayList<CuentaContaDetaGrupoActi>());
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.setSubGrupoActivoFijos(new ArrayList<SubGrupoActivoFijo>());
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.setGastoDepreciacions(new ArrayList<GastoDepreciacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos= new ArrayList<DetalleActivoFijo>();
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactis= new ArrayList<CuentaContaDetaGrupoActi>();
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijos= new ArrayList<SubGrupoActivoFijo>();
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacions= new ArrayList<GastoDepreciacion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setCuentaContaDetaGrupoActis(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setSubGrupoActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.getSubGrupoActivoFijos());

							if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.quitarFilaTotales();}
							detallegrupoactivofijoAux.setGastoDepreciacions(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.getGastoDepreciacions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detallegrupoactivofijoAux,detallegrupoactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().addAll(this.detallegrupoactivofijosEliminados);
					
					detallegrupoactivofijoLogic.saveDetalleGrupoActivoFijos();//WithConnection
					//detallegrupoactivofijoLogic.getSetVersionRowDetalleGrupoActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleGrupoActivoFijo();
				
				this.detallegrupoactivofijosEliminados= new ArrayList<DetalleGrupoActivoFijo>();		
			}
			
			if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Grupo Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detallegrupoactivofijo=detallegrupoactivofijoAux;
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
      		//this.finishProcessDetalleGrupoActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleGrupoActivoFijo detallegrupoactivofijoLocal) throws Exception {
		
		if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				detallegrupoactivofijoLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
				detallegrupoactivofijoLocal.setCuentaContaDetaGrupoActis(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
				detallegrupoactivofijoLocal.setSubGrupoActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.getSubGrupoActivoFijos());
				detallegrupoactivofijoLocal.setGastoDepreciacions(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.getGastoDepreciacions());
			
			} else {
			
				detallegrupoactivofijoLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos);
				detallegrupoactivofijoLocal.setCuentaContaDetaGrupoActis(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactis);
				detallegrupoactivofijoLocal.setSubGrupoActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijos);
				detallegrupoactivofijoLocal.setGastoDepreciacions(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleGrupoActivoFijo detallegrupoactivofijoLocal) throws Exception {	
		if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallegrupoactivofijoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecostooriginalBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecostooriginalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecostooriginalBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecostooriginalBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecostooriginalBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecostooriginalsForeignKey);

				cuentacontablecostooriginalBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecostooriginalBeanSwingJInternalFrameLocal.cuentacontable);

				detallegrupoactivofijoLocal.setCuentaContableCostoOriginal(cuentacontablecostooriginalBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCostoOriginal();
				this.cargarCombosFrameCuentaContableCostoOriginalsForeignKey("Formulario");
				this.setActualCuentaContableCostoOriginalForeignKey(cuentacontablecostooriginalBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontabledeprenormalBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontabledeprenormalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontabledeprenormalBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontabledeprenormalBeanSwingJInternalFrameLocal.actualizarLista(cuentacontabledeprenormalBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontabledeprenormalsForeignKey);

				cuentacontabledeprenormalBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontabledeprenormalBeanSwingJInternalFrameLocal.cuentacontable);

				detallegrupoactivofijoLocal.setCuentaContableDepreNormal(cuentacontabledeprenormalBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableDepreNormal();
				this.cargarCombosFrameCuentaContableDepreNormalsForeignKey("Formulario");
				this.setActualCuentaContableDepreNormalForeignKey(cuentacontabledeprenormalBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontabledepregastonormalBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontabledepregastonormalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontabledepregastonormalBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontabledepregastonormalBeanSwingJInternalFrameLocal.actualizarLista(cuentacontabledepregastonormalBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontabledepregastonormalsForeignKey);

				cuentacontabledepregastonormalBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontabledepregastonormalBeanSwingJInternalFrameLocal.cuentacontable);

				detallegrupoactivofijoLocal.setCuentaContableDepreGastoNormal(cuentacontabledepregastonormalBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableDepreGastoNormal();
				this.cargarCombosFrameCuentaContableDepreGastoNormalsForeignKey("Formulario");
				this.setActualCuentaContableDepreGastoNormalForeignKey(cuentacontabledepregastonormalBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleGrupoActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallegrupoactivofijoValidator.getInvalidValues(this.detallegrupoactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleGrupoActivoFijo detallegrupoactivofijo,List<DetalleGrupoActivoFijo> detallegrupoactivofijos) throws Exception {
		try	{		
			DetalleGrupoActivoFijoConstantesFunciones.actualizarLista(detallegrupoactivofijo,detallegrupoactivofijos,this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleGrupoActivoFijo detallegrupoactivofijo,List<DetalleGrupoActivoFijo> detallegrupoactivofijos) throws Exception {
		try	{			
			DetalleGrupoActivoFijoConstantesFunciones.actualizarSelectedLista(detallegrupoactivofijo,detallegrupoactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleGrupoActivoFijo> detallegrupoactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallegrupoactivofijosLocal=this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallegrupoactivofijosLocal=this.detallegrupoactivofijos;
			}
			//ARCHITECTURE
		
			for(DetalleGrupoActivoFijo detallegrupoactivofijoLocal:detallegrupoactivofijosLocal) {
				if(this.permiteMantenimiento(detallegrupoactivofijoLocal) && detallegrupoactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleGrupoActivoFijoConstantesFunciones.getDetalleGrupoActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleGrupoActivoFijoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelid_empresaDetalleGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleGrupoActivoFijoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelcodigoDetalleGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleGrupoActivoFijoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelnombreDetalleGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleGrupoActivoFijoConstantesFunciones.SIGLAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelsiglasDetalleGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleGrupoActivoFijoConstantesFunciones.IDCUENTACONTABLECOSTOORIGINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleGrupoActivoFijoConstantesFunciones.IDCUENTACONTABLEDEPRENORMAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleGrupoActivoFijoConstantesFunciones.IDCUENTACONTABLEDEPREGASTONORMAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelid_empresaDetalleGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelcodigoDetalleGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelnombreDetalleGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelsiglasDetalleGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleActivoFijo")) {
			if(this.detallegrupoactivofijo==null) {
				this.detallegrupoactivofijo= new DetalleGrupoActivoFijo();
			}

			if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoDetalleGrupoActivoFijo
				this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);

				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getdetalleactivofijo().setDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
			}

			return;
		}
		 else  if(sTipo.equals("CuentaContaDetaGrupoActi")) {
			if(this.detallegrupoactivofijo==null) {
				this.detallegrupoactivofijo= new DetalleGrupoActivoFijo();
			}

			if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoDetalleGrupoActivoFijo
				this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);

				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.getcuentacontadetagrupoacti().setDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
			}

			return;
		}
		 else  if(sTipo.equals("SubGrupoActivoFijo")) {
			if(this.detallegrupoactivofijo==null) {
				this.detallegrupoactivofijo= new DetalleGrupoActivoFijo();
			}

			if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoDetalleGrupoActivoFijo
				this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);

				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.getsubgrupoactivofijo().setDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
			}

			return;
		}
		 else  if(sTipo.equals("GastoDepreciacion")) {
			if(this.detallegrupoactivofijo==null) {
				this.detallegrupoactivofijo= new DetalleGrupoActivoFijo();
			}

			if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoDetalleGrupoActivoFijo
				this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);

				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.getgastodepreciacion().setDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoDetalleGrupoActivoFijo--;	
		
		
		this.detallegrupoactivofijoAux=new DetalleGrupoActivoFijo();
		
		this.detallegrupoactivofijoAux.setId(this.iIdNuevoDetalleGrupoActivoFijo);
		this.detallegrupoactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().add(this.detallegrupoactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallegrupoactivofijos.add(this.detallegrupoactivofijoAux);
		}
		//ARCHITECTURE
		
		this.detallegrupoactivofijo=this.detallegrupoactivofijoAux;
		
		if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
		}
				
		//this.setDefaultControlesDetalleGrupoActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleGrupoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleGrupoActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijoBean,this.detallegrupoactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=DetalleGrupoActivoFijoConstantesFunciones.getClassesRelationshipsOfDetalleGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detallegrupoactivofijoReturnGeneral=detallegrupoactivofijoLogic.procesarEventosDetalleGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos(),this.detallegrupoactivofijo,this.detallegrupoactivofijoParameterGeneral,this.isEsNuevoDetalleGrupoActivoFijo,classes);//this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleGrupoActivoFijo(this.detallegrupoactivofijoReturnGeneral,this.detallegrupoactivofijoBean,false);
		
		if(this.detallegrupoactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleGrupoActivoFijo(this.detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleGrupoActivoFijo(this.detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo());
		}
		
		if(this.detallegrupoactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleGrupoActivoFijo(this.detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo(),classes);//this.detallegrupoactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleGrupoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleGrupoActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.RecargarFormDetalleGrupoActivoFijo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
						
			if(detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado() && CuentaContaDetaGrupoActiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContaDetaGrupoActiActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() && SubGrupoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubGrupoActivoFijoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionSessionBean.getEsGuardarRelacionado() && GastoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGastoDepreciacionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleGrupoActivoFijo();
			}
			
			this.actualizarVisualTableDatosDetalleGrupoActivoFijo();
			
			this.jTableDatosDetalleGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoDetalleGrupoActivoFijo(), this.getIndiceNuevoDetalleGrupoActivoFijo());
			
			this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleGrupoActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldcodigoDetalleGrupoActivoFijo.setEnabled(isHabilitar && this.detallegrupoactivofijoConstantesFunciones.activarcodigoDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextAreanombreDetalleGrupoActivoFijo.setEnabled(isHabilitar && this.detallegrupoactivofijoConstantesFunciones.activarnombreDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldsiglasDetalleGrupoActivoFijo.setEnabled(isHabilitar && this.detallegrupoactivofijoConstantesFunciones.activarsiglasDetalleGrupoActivoFijo);	
		//
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.setEnabled(isHabilitar && this.detallegrupoactivofijoConstantesFunciones.activarid_empresaDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setEnabled(isHabilitar && this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setEnabled(isHabilitar && this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setEnabled(isHabilitar && this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo);
	};
	
	public void setDefaultControlesDetalleGrupoActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleGrupoActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallegrupoactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.detallegrupoactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.detallegrupoactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.detallegrupoactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoDetalleGrupoActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
				if(detallegrupoactivofijoAux.getId().equals(this.iIdNuevoDetalleGrupoActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijos) {
				if(detallegrupoactivofijoAux.getId().equals(this.iIdNuevoDetalleGrupoActivoFijo)) {
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
	
	public int getIndiceActualDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
				if(detallegrupoactivofijoAux.getId().equals(detallegrupoactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijos) {
				if(detallegrupoactivofijoAux.getId().equals(detallegrupoactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
				if(detallegrupoactivofijoAux.getDetalleGrupoActivoFijoOriginal().getId().equals(detallegrupoactivofijoOriginal.getId())) {
					existe=true;
					detallegrupoactivofijoOriginal.setId(detallegrupoactivofijoAux.getId());
					detallegrupoactivofijoOriginal.setVersionRow(detallegrupoactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijos) {
				if(detallegrupoactivofijoAux.getDetalleGrupoActivoFijoOriginal().getId().equals(detallegrupoactivofijoOriginal.getId())) {
					existe=true;
					detallegrupoactivofijoOriginal.setId(detallegrupoactivofijoAux.getId());
					detallegrupoactivofijoOriginal.setVersionRow(detallegrupoactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleGrupoActivoFijo(Boolean esParaCancelar) throws Exception {
		detallegrupoactivofijosAux=new ArrayList<DetalleGrupoActivoFijo>();
		detallegrupoactivofijoAux=new DetalleGrupoActivoFijo();
		
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
					if(detallegrupoactivofijoAux.getId()<0) {
						detallegrupoactivofijosAux.add(detallegrupoactivofijoAux);
					}		
				}
				this.iIdNuevoDetalleGrupoActivoFijo=0L;
				this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().removeAll(detallegrupoactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijos) {
					if(detallegrupoactivofijoAux.getId()<0) {
						detallegrupoactivofijosAux.add(detallegrupoactivofijoAux);
					}		
				}
				this.iIdNuevoDetalleGrupoActivoFijo=0L;
				this.detallegrupoactivofijos.removeAll(detallegrupoactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleGrupoActivoFijo 
					&& this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size()>0
					) {
					detallegrupoactivofijoAux=this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().get(this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size() - 1);
				
					if(detallegrupoactivofijoAux.getId()<0) {
						this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().remove(detallegrupoactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleGrupoActivoFijo && this.detallegrupoactivofijos.size()>0) {
					detallegrupoactivofijoAux=this.detallegrupoactivofijos.get(this.detallegrupoactivofijos.size() - 1);
				
					if(detallegrupoactivofijoAux.getId()<0) {
						this.detallegrupoactivofijos.remove(detallegrupoactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleGrupoActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallegrupoactivofijo.getId()<0) {
				this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().remove(this.detallegrupoactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallegrupoactivofijo.getId()<0) {
				this.detallegrupoactivofijos.remove(this.detallegrupoactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleGrupoActivoFijo(List<DetalleGrupoActivoFijo> detallegrupoactivofijosAux) throws Exception {
		DetalleGrupoActivoFijoConstantesFunciones.setEstadosInicialesDetalleGrupoActivoFijo(detallegrupoactivofijosAux);
	}
	
	public void setEstadosInicialesDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijoAux) throws Exception {
		DetalleGrupoActivoFijoConstantesFunciones.setEstadosInicialesDetalleGrupoActivoFijo(detallegrupoactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleGrupoActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleGrupoActivoFijoActual()) {
				if(!this.isEsNuevoDetalleGrupoActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleGrupoActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleGrupoActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Grupo Activo Fijo ?", "MANTENIMIENTO DE Detalle Grupo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleGrupoActivoFijo detallegrupoactivofijo) throws Exception {
		DetalleGrupoActivoFijoConstantesFunciones.seleccionarAsignar(this.detallegrupoactivofijo,detallegrupoactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleGrupoActivoFijo=this.isPermisoActualizarOriginalDetalleGrupoActivoFijo;
			
			
			this.seleccionarAsignar(detallegrupoactivofijo);
			
			

			idCuentaContableCostoOriginalActual=detallegrupoactivofijo.getid_cuenta_contable_costo_original();
			this.seleccionarCuentaContableCostoOriginalActual();

			idCuentaContableDepreNormalActual=detallegrupoactivofijo.getid_cuenta_contable_depre_normal();
			this.seleccionarCuentaContableDepreNormalActual();

			idCuentaContableDepreGastoNormalActual=detallegrupoactivofijo.getid_cuenta_contable_depre_gasto_normal();
			this.seleccionarCuentaContableDepreGastoNormalActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleGrupoActivoFijoConstantesFunciones.quitarEspaciosDetalleGrupoActivoFijo(this.detallegrupoactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallegrupoactivofijoSessionBean.setsFuncionBusquedaRapida(this.detallegrupoactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableCostoOriginalActual() throws Exception {
		try	{
			CuentaContable cuentacontablecostooriginalAux=new CuentaContable();

			if(this.idCuentaContableCostoOriginalActual != null && this.idCuentaContableCostoOriginalActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontablecostooriginalLogic.getEntityWithConnection(this.idCuentaContableCostoOriginalActual);
					cuentacontablecostooriginalAux= cuentacontablecostooriginalLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablecostooriginalsForeignKey=new ArrayList<CuentaContable>();
				cuentacontablecostooriginalsForeignKey.add(cuentacontablecostooriginalAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCuentaContableDepreNormalActual() throws Exception {
		try	{
			CuentaContable cuentacontabledeprenormalAux=new CuentaContable();

			if(this.idCuentaContableDepreNormalActual != null && this.idCuentaContableDepreNormalActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabledeprenormalLogic.getEntityWithConnection(this.idCuentaContableDepreNormalActual);
					cuentacontabledeprenormalAux= cuentacontabledeprenormalLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontabledeprenormalsForeignKey=new ArrayList<CuentaContable>();
				cuentacontabledeprenormalsForeignKey.add(cuentacontabledeprenormalAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCuentaContableDepreGastoNormalActual() throws Exception {
		try	{
			CuentaContable cuentacontabledepregastonormalAux=new CuentaContable();

			if(this.idCuentaContableDepreGastoNormalActual != null && this.idCuentaContableDepreGastoNormalActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabledepregastonormalLogic.getEntityWithConnection(this.idCuentaContableDepreGastoNormalActual);
					cuentacontabledepregastonormalAux= cuentacontabledepregastonormalLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontabledepregastonormalsForeignKey=new ArrayList<CuentaContable>();
				cuentacontabledepregastonormalsForeignKey.add(cuentacontabledepregastonormalAux);
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
			if(this.isEsNuevoDetalleGrupoActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleGrupoActivoFijo(esParaCancelar);				
				this.cancelarNuevoDetalleGrupoActivoFijo(esParaCancelar);								
			}
			
			this.detallegrupoactivofijo=new DetalleGrupoActivoFijo();
			
			this.inicializarDetalleGrupoActivoFijo();
			
			this.actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleGrupoActivoFijo() throws Exception {
		try {
			DetalleGrupoActivoFijoConstantesFunciones.inicializarDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleGrupoActivoFijos(String sAccionBusqueda,List<DetalleGrupoActivoFijo> detallegrupoactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleGrupoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleGrupoActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleGrupoActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleGrupoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Grupo Activo Fijos");		
		parameters.put("busquedapor", DetalleGrupoActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleActivoFijo.class));
			classes.add(new Classe(CuentaContaDetaGrupoActi.class));
			classes.add(new Classe(SubGrupoActivoFijo.class));
			classes.add(new Classe(GastoDepreciacion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogicAuxiliar=new DetalleGrupoActivoFijoLogic();
					detallegrupoactivofijoLogicAuxiliar.setDatosCliente(detallegrupoactivofijoLogic.getDatosCliente());				
					detallegrupoactivofijoLogicAuxiliar.setDetalleGrupoActivoFijos(detallegrupoactivofijosParaReportes);
					
					detallegrupoactivofijoLogicAuxiliar.cargarRelacionesLoteForeignKeyDetalleGrupoActivoFijoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					detallegrupoactivofijosParaReportes=detallegrupoactivofijoLogicAuxiliar.getDetalleGrupoActivoFijos();
					
					//detallegrupoactivofijoLogic.getNewConnexionToDeep();
					
					//for (DetalleGrupoActivoFijo detallegrupoactivofijo:detallegrupoactivofijosParaReportes) {
					//	detallegrupoactivofijoLogic.deepLoad(detallegrupoactivofijo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//detallegrupoactivofijoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleActivoFijo = AuxiliarReportes.class.getResourceAsStream("DetalleActivoFijoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleactivofijo", reportFileDetalleActivoFijo);

			InputStream reportFileCuentaContaDetaGrupoActi = AuxiliarReportes.class.getResourceAsStream("CuentaContaDetaGrupoActiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuentacontadetagrupoacti", reportFileCuentaContaDetaGrupoActi);

			InputStream reportFileSubGrupoActivoFijo = AuxiliarReportes.class.getResourceAsStream("SubGrupoActivoFijoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_subgrupoactivofijo", reportFileSubGrupoActivoFijo);

			InputStream reportFileGastoDepreciacion = AuxiliarReportes.class.getResourceAsStream("GastoDepreciacionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_gastodepreciacion", reportFileGastoDepreciacion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleGrupoActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleGrupoActivoFijo=new JRBeanArrayDataSource(DetalleGrupoActivoFijoJInternalFrame.TraerDetalleGrupoActivoFijoBeans(detallegrupoactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleGrupoActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleGrupoActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleGrupoActivoFijoBean.TraerDetalleGrupoActivoFijoBeans(detallegrupoactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,detallegrupoactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,detallegrupoactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijoActionPerformed(null);
					//this.generarExcelReporteDetalleGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,detallegrupoactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,detallegrupoactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,detallegrupoactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,detallegrupoactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleGrupoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleGrupoActivoFijo> detallegrupoactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallegrupoactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleGrupoActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleGrupoActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleGrupoActivoFijo detallegrupoactivofijo : detallegrupoactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleGrupoActivoFijoConstantesFunciones.generarExcelReporteDataDetalleGrupoActivoFijo("NORMAL",row,workbook,detallegrupoactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleGrupoActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		DetalleGrupoActivoFijoConstantesFunciones.generarExcelReporteHeaderDetalleGrupoActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleGrupoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleGrupoActivoFijo> detallegrupoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallegrupoactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleGrupoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleGrupoActivoFijo detallegrupoactivofijo : detallegrupoactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.getDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallegrupoactivofijo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallegrupoactivofijo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallegrupoactivofijo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallegrupoactivofijo.getsiglas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallegrupoactivofijo.getcuentacontablecostooriginal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallegrupoactivofijo.getcuentacontabledeprenormal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallegrupoactivofijo.getcuentacontabledepregastonormal_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleGrupoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleGrupoActivoFijo> detallegrupoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleGrupoActivoFijo> detallegrupoactivofijosRespaldo=null;
		
		classes=DetalleGrupoActivoFijoConstantesFunciones.getClassesRelationshipsOfDetalleGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallegrupoactivofijoLogic.setDatosCliente(this.datosCliente);
		this.detallegrupoactivofijoLogic.setDatosDeep(this.datosDeep);
		this.detallegrupoactivofijoLogic.setIsConDeep(true);
		
		detallegrupoactivofijosRespaldo=this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos();
		
		this.detallegrupoactivofijoLogic.setDetalleGrupoActivoFijos(detallegrupoactivofijosParaReportes);	
		this.detallegrupoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallegrupoactivofijosParaReportes=this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos();
		this.detallegrupoactivofijoLogic.setDetalleGrupoActivoFijos(detallegrupoactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallegrupoactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleGrupoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleGrupoActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleGrupoActivoFijo detallegrupoactivofijo : detallegrupoactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleGrupoActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleGrupoActivoFijoConstantesFunciones.generarExcelReporteDataDetalleGrupoActivoFijo("NORMAL",row,workbook,detallegrupoactivofijo,cellStyleDataAux);
		
			
			


				//DetalleActivoFijo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO))) {

				if(detallegrupoactivofijo.getDetalleActivoFijos()!=null && detallegrupoactivofijo.getDetalleActivoFijos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleActivoFijoConstantesFunciones.generarExcelReporteHeaderDetalleActivoFijo("RELACIONADO",row,workbook);
				}

				if(detallegrupoactivofijo.getDetalleActivoFijos()!=null) {
					i2=0;
					for(DetalleActivoFijo detalleactivofijo : detallegrupoactivofijo.getDetalleActivoFijos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleActivoFijoConstantesFunciones.generarExcelReporteDataDetalleActivoFijo("RELACIONADO",row,workbook,detalleactivofijo,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CuentaContaDetaGrupoActi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO))) {

				if(detallegrupoactivofijo.getCuentaContaDetaGrupoActis()!=null && detallegrupoactivofijo.getCuentaContaDetaGrupoActis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuentaContaDetaGrupoActiConstantesFunciones.generarExcelReporteHeaderCuentaContaDetaGrupoActi("RELACIONADO",row,workbook);
				}

				if(detallegrupoactivofijo.getCuentaContaDetaGrupoActis()!=null) {
					i2=0;
					for(CuentaContaDetaGrupoActi cuentacontadetagrupoacti : detallegrupoactivofijo.getCuentaContaDetaGrupoActis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuentaContaDetaGrupoActiConstantesFunciones.generarExcelReporteDataCuentaContaDetaGrupoActi("RELACIONADO",row,workbook,cuentacontadetagrupoacti,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//SubGrupoActivoFijo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO))) {

				if(detallegrupoactivofijo.getSubGrupoActivoFijos()!=null && detallegrupoactivofijo.getSubGrupoActivoFijos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SubGrupoActivoFijoConstantesFunciones.generarExcelReporteHeaderSubGrupoActivoFijo("RELACIONADO",row,workbook);
				}

				if(detallegrupoactivofijo.getSubGrupoActivoFijos()!=null) {
					i2=0;
					for(SubGrupoActivoFijo subgrupoactivofijo : detallegrupoactivofijo.getSubGrupoActivoFijos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SubGrupoActivoFijoConstantesFunciones.generarExcelReporteDataSubGrupoActivoFijo("RELACIONADO",row,workbook,subgrupoactivofijo,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//GastoDepreciacion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO))) {

				if(detallegrupoactivofijo.getGastoDepreciacions()!=null && detallegrupoactivofijo.getGastoDepreciacions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					GastoDepreciacionConstantesFunciones.generarExcelReporteHeaderGastoDepreciacion("RELACIONADO",row,workbook);
				}

				if(detallegrupoactivofijo.getGastoDepreciacions()!=null) {
					i2=0;
					for(GastoDepreciacion gastodepreciacion : detallegrupoactivofijo.getGastoDepreciacions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						GastoDepreciacionConstantesFunciones.generarExcelReporteDataGastoDepreciacion("RELACIONADO",row,workbook,gastodepreciacion,cellStyleDataAuxHijo);
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
		cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.getDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleGrupoActivoFijo() throws Exception {		
		this.startProcessDetalleGrupoActivoFijo(true);
	}
	
	public void startProcessDetalleGrupoActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleGrupoActivoFijo ,this.jPanelParametrosReportesDetalleGrupoActivoFijo, this.jScrollPanelDatosDetalleGrupoActivoFijo,this.jPanelPaginacionDetalleGrupoActivoFijo, this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo, this.jPanelAccionesDetalleGrupoActivoFijo,this.jPanelAccionesFormularioDetalleGrupoActivoFijo,this.jmenuBarDetalleGrupoActivoFijo,this.jmenuBarDetalleDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleDetalleGrupoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleGrupoActivoFijo=this.jTabbedPaneBusquedasDetalleGrupoActivoFijo; 
		
		final JPanel jPanelParametrosReportesDetalleGrupoActivoFijo=this.jPanelParametrosReportesDetalleGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosDetalleGrupoActivoFijo=this.jScrollPanelDatosDetalleGrupoActivoFijo;
		final JTable jTableDatosDetalleGrupoActivoFijo=this.jTableDatosDetalleGrupoActivoFijo;		
		final JPanel jPanelPaginacionDetalleGrupoActivoFijo=this.jPanelPaginacionDetalleGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionDetalleGrupoActivoFijo=this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo;
		final JPanel jPanelAccionesDetalleGrupoActivoFijo=this.jPanelAccionesDetalleGrupoActivoFijo;
		
		JPanel jPanelCamposAuxiliarDetalleGrupoActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleGrupoActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			jPanelCamposAuxiliarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelCamposDetalleGrupoActivoFijo;
			jPanelAccionesFormularioAuxiliarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelAccionesFormularioDetalleGrupoActivoFijo;
		}
		
		final JPanel jPanelCamposDetalleGrupoActivoFijo=jPanelCamposAuxiliarDetalleGrupoActivoFijo;
		final JPanel jPanelAccionesFormularioDetalleGrupoActivoFijo=jPanelAccionesFormularioAuxiliarDetalleGrupoActivoFijo;
		
		
		final JMenuBar jmenuBarDetalleGrupoActivoFijo=this.jmenuBarDetalleGrupoActivoFijo;
		final JToolBar jTtoolBarDetalleGrupoActivoFijo=this.jTtoolBarDetalleGrupoActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleGrupoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleGrupoActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jmenuBarDetalleDetalleGrupoActivoFijo;
			jTtoolBarDetalleAuxiliarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTtoolBarDetalleDetalleGrupoActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleDetalleGrupoActivoFijo=jmenuBarDetalleAuxiliarDetalleGrupoActivoFijo;
		final JToolBar jTtoolBarDetalleDetalleGrupoActivoFijo=jTtoolBarDetalleAuxiliarDetalleGrupoActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleGrupoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleGrupoActivoFijo;
			processRunnable.jTableDatos=jTableDatosDetalleGrupoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposDetalleGrupoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleGrupoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleGrupoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleGrupoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleGrupoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleGrupoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarDetalleGrupoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleGrupoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleGrupoActivoFijo ,jPanelParametrosReportesDetalleGrupoActivoFijo,jTableDatosDetalleGrupoActivoFijo, /*jScrollPanelDatosDetalleGrupoActivoFijo,*/jPanelCamposDetalleGrupoActivoFijo,jPanelPaginacionDetalleGrupoActivoFijo, /*jScrollPanelDatosEdicionDetalleGrupoActivoFijo,*/ jPanelAccionesDetalleGrupoActivoFijo,jPanelAccionesFormularioDetalleGrupoActivoFijo,jmenuBarDetalleGrupoActivoFijo,jmenuBarDetalleDetalleGrupoActivoFijo,jTtoolBarDetalleGrupoActivoFijo,jTtoolBarDetalleDetalleGrupoActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleGrupoActivoFijo ,jPanelParametrosReportesDetalleGrupoActivoFijo, jScrollPanelDatosDetalleGrupoActivoFijo,jPanelPaginacionDetalleGrupoActivoFijo, jScrollPanelDatosEdicionDetalleGrupoActivoFijo, jPanelAccionesDetalleGrupoActivoFijo,jPanelAccionesFormularioDetalleGrupoActivoFijo,jmenuBarDetalleGrupoActivoFijo,jmenuBarDetalleDetalleGrupoActivoFijo,jTtoolBarDetalleGrupoActivoFijo,jTtoolBarDetalleDetalleGrupoActivoFijo);
						
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
	
	public void finishProcessDetalleGrupoActivoFijo() {// throws Exception 
		this.finishProcessDetalleGrupoActivoFijo(true);
	}
	
	public void finishProcessDetalleGrupoActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleGrupoActivoFijo ,this.jPanelParametrosReportesDetalleGrupoActivoFijo, this.jScrollPanelDatosDetalleGrupoActivoFijo,this.jPanelPaginacionDetalleGrupoActivoFijo, this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo, this.jPanelAccionesDetalleGrupoActivoFijo,this.jPanelAccionesFormularioDetalleGrupoActivoFijo,this.jmenuBarDetalleGrupoActivoFijo,this.jmenuBarDetalleDetalleGrupoActivoFijo,this.jTtoolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleDetalleGrupoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleGrupoActivoFijo=this.jTabbedPaneBusquedasDetalleGrupoActivoFijo; 
		
		final JPanel jPanelParametrosReportesDetalleGrupoActivoFijo=this.jPanelParametrosReportesDetalleGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosDetalleGrupoActivoFijo=this.jScrollPanelDatosDetalleGrupoActivoFijo;
		final JTable jTableDatosDetalleGrupoActivoFijo=this.jTableDatosDetalleGrupoActivoFijo;		
		final JPanel jPanelPaginacionDetalleGrupoActivoFijo=this.jPanelPaginacionDetalleGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionDetalleGrupoActivoFijo=this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo;
		final JPanel jPanelAccionesDetalleGrupoActivoFijo=this.jPanelAccionesDetalleGrupoActivoFijo;
		
		JPanel jPanelCamposAuxiliarDetalleGrupoActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleGrupoActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			jPanelCamposAuxiliarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelCamposDetalleGrupoActivoFijo;
			jPanelAccionesFormularioAuxiliarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelAccionesFormularioDetalleGrupoActivoFijo;
		}
		
		final JPanel jPanelCamposDetalleGrupoActivoFijo=jPanelCamposAuxiliarDetalleGrupoActivoFijo;
		final JPanel jPanelAccionesFormularioDetalleGrupoActivoFijo=jPanelAccionesFormularioAuxiliarDetalleGrupoActivoFijo;
		
		
		final JMenuBar jmenuBarDetalleGrupoActivoFijo=this.jmenuBarDetalleGrupoActivoFijo;		
		final JToolBar jTtoolBarDetalleGrupoActivoFijo=this.jTtoolBarDetalleGrupoActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleGrupoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleGrupoActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jmenuBarDetalleDetalleGrupoActivoFijo;
			jTtoolBarDetalleAuxiliarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTtoolBarDetalleDetalleGrupoActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleGrupoActivoFijo=jmenuBarDetalleAuxiliarDetalleGrupoActivoFijo;
		final JToolBar jTtoolBarDetalleDetalleGrupoActivoFijo=jTtoolBarDetalleAuxiliarDetalleGrupoActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleGrupoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleGrupoActivoFijo;
			processRunnable.jTableDatos=jTableDatosDetalleGrupoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposDetalleGrupoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleGrupoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleGrupoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleGrupoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleGrupoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleGrupoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarDetalleGrupoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleGrupoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleGrupoActivoFijo ,jPanelParametrosReportesDetalleGrupoActivoFijo, jTableDatosDetalleGrupoActivoFijo,/*jScrollPanelDatosDetalleGrupoActivoFijo,*/jPanelCamposDetalleGrupoActivoFijo,jPanelPaginacionDetalleGrupoActivoFijo, /*jScrollPanelDatosEdicionDetalleGrupoActivoFijo,*/ jPanelAccionesDetalleGrupoActivoFijo,jPanelAccionesFormularioDetalleGrupoActivoFijo,jmenuBarDetalleGrupoActivoFijo,jmenuBarDetalleDetalleGrupoActivoFijo,jTtoolBarDetalleGrupoActivoFijo,jTtoolBarDetalleDetalleGrupoActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleGrupoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleGrupoActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleGrupoActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleGrupoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGrupoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleGrupoActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleGrupoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGrupoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleGrupoActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallegrupoactivofijoConstantesFunciones.getsFinalQueryDetalleGrupoActivoFijo();
		String  finalQueryPaginacionTodos=this.detallegrupoactivofijoConstantesFunciones.getsFinalQueryDetalleGrupoActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoDetalleGrupoActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleGrupoActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleGrupoActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallegrupoactivofijosEliminados= new ArrayList<DetalleGrupoActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleGrupoActivoFijo();
		
				///*DetalleGrupoActivoFijoSessionBean*/this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			
			if(this.detallegrupoactivofijoSessionBean==null) {
				this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
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
					this.iNumeroPaginacion=DetalleGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleGrupoActivoFijoConstantesFunciones.getClassesForeignKeysOfDetalleGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallegrupoactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallegrupoactivofijosAux= new ArrayList<DetalleGrupoActivoFijo>();
			
				
			detallegrupoactivofijoLogic.setDatosCliente(this.datosCliente);
			detallegrupoactivofijoLogic.setDatosDeep(this.datosDeep);
			detallegrupoactivofijoLogic.setIsConDeep(true);
			
			
			detallegrupoactivofijoLogic.getDetalleGrupoActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detallegrupoactivofijoLogic.getTodosDetalleGrupoActivoFijos(finalQueryGlobal,pagination);
					
					//detallegrupoactivofijoLogic.getTodosDetalleGrupoActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()==null|| detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallegrupoactivofijosAux= new ArrayList<DetalleGrupoActivoFijo>();
							detallegrupoactivofijosAux.addAll(detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallegrupoactivofijosAux= new ArrayList<DetalleGrupoActivoFijo>();
							detallegrupoactivofijosAux.addAll(detallegrupoactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallegrupoactivofijoLogic.getTodosDetalleGrupoActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//detallegrupoactivofijoLogic.getTodosDetalleGrupoActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleGrupoActivoFijos("Todos",detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallegrupoactivofijoLogic.setDetalleGrupoActivoFijos(new ArrayList<DetalleGrupoActivoFijo>());					
							detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().addAll(detallegrupoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallegrupoactivofijos=new ArrayList<DetalleGrupoActivoFijo>();
							detallegrupoactivofijos.addAll(detallegrupoactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleGrupoActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleGrupoActivoFijo=this.idActual;
				
				} else if(this.idDetalleGrupoActivoFijoActual!=null && this.idDetalleGrupoActivoFijoActual!=0L) {
					idDetalleGrupoActivoFijo=idDetalleGrupoActivoFijoActual;
				}
				
					
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndicePorId(idDetalleGrupoActivoFijo);
				
				this.detallegrupoactivofijos=new ArrayList<DetalleGrupoActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detallegrupoactivofijoLogic.getEntity(idDetalleGrupoActivoFijo);
					
					//detallegrupoactivofijoLogic.getEntityWithConnection(idDetalleGrupoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallegrupoactivofijoLogic.setDetalleGrupoActivoFijos(new ArrayList<DetalleGrupoActivoFijo>());
					detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().add(detallegrupoactivofijoLogic.getDetalleGrupoActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallegrupoactivofijos=new ArrayList<DetalleGrupoActivoFijo>();
					this.detallegrupoactivofijos.add(detallegrupoactivofijo);
				}
				
				if(detallegrupoactivofijoLogic.getDetalleGrupoActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContableCostoOriginal")) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCostoOriginal(id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdCuentaContableCostoOriginal(finalQueryGlobal,pagination,id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCostoOriginal(id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCostoOriginal(id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()==null||detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallegrupoactivofijos==null|| detallegrupoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijosAux=new ArrayList<DetalleGrupoActivoFijo>();
						detallegrupoactivofijosAux.addAll(detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallegrupoactivofijosAux=new ArrayList<DetalleGrupoActivoFijo>();
							detallegrupoactivofijosAux.addAll(detallegrupoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdCuentaContableCostoOriginal(finalQueryGlobal,pagination,id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCostoOriginal(id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCostoOriginal(id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleGrupoActivoFijos("FK_IdCuentaContableCostoOriginal",detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleGrupoActivoFijos("FK_IdCuentaContableCostoOriginal",detallegrupoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijoLogic.setDetalleGrupoActivoFijos(new ArrayList<DetalleGrupoActivoFijo>());
						detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().addAll(detallegrupoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallegrupoactivofijos=new ArrayList<DetalleGrupoActivoFijo>();
							detallegrupoactivofijos.addAll(detallegrupoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableDepreGastoNormal")) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDepreGastoNormal(id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdCuentaContableDepreGastoNormal(finalQueryGlobal,pagination,id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDepreGastoNormal(id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDepreGastoNormal(id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()==null||detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallegrupoactivofijos==null|| detallegrupoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijosAux=new ArrayList<DetalleGrupoActivoFijo>();
						detallegrupoactivofijosAux.addAll(detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallegrupoactivofijosAux=new ArrayList<DetalleGrupoActivoFijo>();
							detallegrupoactivofijosAux.addAll(detallegrupoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdCuentaContableDepreGastoNormal(finalQueryGlobal,pagination,id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDepreGastoNormal(id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDepreGastoNormal(id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleGrupoActivoFijos("FK_IdCuentaContableDepreGastoNormal",detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleGrupoActivoFijos("FK_IdCuentaContableDepreGastoNormal",detallegrupoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijoLogic.setDetalleGrupoActivoFijos(new ArrayList<DetalleGrupoActivoFijo>());
						detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().addAll(detallegrupoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallegrupoactivofijos=new ArrayList<DetalleGrupoActivoFijo>();
							detallegrupoactivofijos.addAll(detallegrupoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableDepreNormal")) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDepreNormal(id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdCuentaContableDepreNormal(finalQueryGlobal,pagination,id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDepreNormal(id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDepreNormal(id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()==null||detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallegrupoactivofijos==null|| detallegrupoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijosAux=new ArrayList<DetalleGrupoActivoFijo>();
						detallegrupoactivofijosAux.addAll(detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallegrupoactivofijosAux=new ArrayList<DetalleGrupoActivoFijo>();
							detallegrupoactivofijosAux.addAll(detallegrupoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdCuentaContableDepreNormal(finalQueryGlobal,pagination,id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDepreNormal(id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDepreNormal(id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleGrupoActivoFijos("FK_IdCuentaContableDepreNormal",detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleGrupoActivoFijos("FK_IdCuentaContableDepreNormal",detallegrupoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijoLogic.setDetalleGrupoActivoFijos(new ArrayList<DetalleGrupoActivoFijo>());
						detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().addAll(detallegrupoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallegrupoactivofijos=new ArrayList<DetalleGrupoActivoFijo>();
							detallegrupoactivofijos.addAll(detallegrupoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()==null||detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallegrupoactivofijos==null|| detallegrupoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijosAux=new ArrayList<DetalleGrupoActivoFijo>();
						detallegrupoactivofijosAux.addAll(detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallegrupoactivofijosAux=new ArrayList<DetalleGrupoActivoFijo>();
							detallegrupoactivofijosAux.addAll(detallegrupoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleGrupoActivoFijos("FK_IdEmpresa",detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleGrupoActivoFijos("FK_IdEmpresa",detallegrupoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijoLogic.setDetalleGrupoActivoFijos(new ArrayList<DetalleGrupoActivoFijo>());
						detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().addAll(detallegrupoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallegrupoactivofijos=new ArrayList<DetalleGrupoActivoFijo>();
							detallegrupoactivofijos.addAll(detallegrupoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleGrupoActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleGrupoActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallegrupoactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallegrupoactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleGrupoActivoFijo detallegrupoactivofijo) {
		Boolean permite=true;
		
		if(this.detallegrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleGrupoActivoFijoConstantesFunciones.getOrderByListaDetalleGrupoActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleGrupoActivoFijoConstantesFunciones.getOrderByListaDetalleGrupoActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleGrupoActivoFijo detallegrupoactivofijo:detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
				if(detallegrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					detallegrupoactivofijoTotales=detallegrupoactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleGrupoActivoFijo detallegrupoactivofijo:this.detallegrupoactivofijos) {
				if(detallegrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					detallegrupoactivofijoTotales=detallegrupoactivofijo;
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
			this.detallegrupoactivofijoAux=new DetalleGrupoActivoFijo();
			this.detallegrupoactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.detallegrupoactivofijoAux.setIsNew(false);
			this.detallegrupoactivofijoAux.setIsChanged(false);
			this.detallegrupoactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaDetalleGrupoActivoFijo(this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos(),this.detallegrupoactivofijoAux);
				
				this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().add(this.detallegrupoactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaDetalleGrupoActivoFijo(this.detallegrupoactivofijos,this.detallegrupoactivofijoAux);
				
				this.detallegrupoactivofijos.add(this.detallegrupoactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallegrupoactivofijoTotales=new DetalleGrupoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().remove(detallegrupoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallegrupoactivofijos.remove(detallegrupoactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallegrupoactivofijoTotales=new DetalleGrupoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleGrupoActivoFijo detallegrupoactivofijo:detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
				if(detallegrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					detallegrupoactivofijoTotales=detallegrupoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaDetalleGrupoActivoFijo(this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos(),detallegrupoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleGrupoActivoFijo detallegrupoactivofijo:this.detallegrupoactivofijos) {
				if(detallegrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					detallegrupoactivofijoTotales=detallegrupoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaDetalleGrupoActivoFijo(this.detallegrupoactivofijos,detallegrupoactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleGrupoActivoFijosFK_IdCuentaContableCostoOriginal()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCostoOriginal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleGrupoActivoFijosFK_IdCuentaContableDepreGastoNormal()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableDepreGastoNormal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleGrupoActivoFijosFK_IdCuentaContableDepreNormal()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableDepreNormal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleGrupoActivoFijosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleGrupoActivoFijosFK_IdCuentaContableCostoOriginal(String sFinalQuery,Long id_cuenta_contable_costo_original)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdCuentaContableCostoOriginal(sFinalQuery,this.pagination,id_cuenta_contable_costo_original);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleGrupoActivoFijosFK_IdCuentaContableDepreGastoNormal(String sFinalQuery,Long id_cuenta_contable_depre_gasto_normal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdCuentaContableDepreGastoNormal(sFinalQuery,this.pagination,id_cuenta_contable_depre_gasto_normal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleGrupoActivoFijosFK_IdCuentaContableDepreNormal(String sFinalQuery,Long id_cuenta_contable_depre_normal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdCuentaContableDepreNormal(sFinalQuery,this.pagination,id_cuenta_contable_depre_normal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleGrupoActivoFijosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallegrupoactivofijoLogic.getDetalleGrupoActivoFijosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosDetalleGrupoActivoFijo() {
		this.isPermisoTodoDetalleGrupoActivoFijo=false;
		this.isPermisoNuevoDetalleGrupoActivoFijo=false;
		this.isPermisoActualizarDetalleGrupoActivoFijo=false;
		this.isPermisoActualizarOriginalDetalleGrupoActivoFijo=false;
		this.isPermisoEliminarDetalleGrupoActivoFijo=false;
		this.isPermisoGuardarCambiosDetalleGrupoActivoFijo=false;
		this.isPermisoConsultaDetalleGrupoActivoFijo=false;
		this.isPermisoBusquedaDetalleGrupoActivoFijo=false;
		this.isPermisoReporteDetalleGrupoActivoFijo=false;		
		this.isPermisoOrdenDetalleGrupoActivoFijo=false;		
		this.isPermisoPaginacionMedioDetalleGrupoActivoFijo=false;		
		this.isPermisoPaginacionAltoDetalleGrupoActivoFijo=false;
		this.isPermisoPaginacionTodoDetalleGrupoActivoFijo=false;
		this.isPermisoCopiarDetalleGrupoActivoFijo=false;		
		this.isPermisoVerFormDetalleGrupoActivoFijo=false;		
		this.isPermisoDuplicarDetalleGrupoActivoFijo=false;		
		this.isPermisoOrdenDetalleGrupoActivoFijo=false;		
	}
	
	public void setPermisosUsuarioDetalleGrupoActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoNuevoDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoEliminarDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoConsultaDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoBusquedaDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoReporteDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoOrdenDetalleGrupoActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioDetalleGrupoActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoDetalleGrupoActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoDetalleGrupoActivoFijo=isPermiso;		
		this.isPermisoCopiarDetalleGrupoActivoFijo=isPermiso;		
		this.isPermisoVerFormDetalleGrupoActivoFijo=isPermiso;		
		this.isPermisoDuplicarDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoOrdenDetalleGrupoActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleGrupoActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoNuevoDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoEliminarDetalleGrupoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosDetalleGrupoActivoFijo=isPermiso;
		//this.isPermisoConsultaDetalleGrupoActivoFijo=isPermiso;
		//this.isPermisoBusquedaDetalleGrupoActivoFijo=isPermiso;
		//this.isPermisoReporteDetalleGrupoActivoFijo=isPermiso;
		//this.isPermisoOrdenDetalleGrupoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleGrupoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleGrupoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleGrupoActivoFijo=isPermiso;		
		//this.isPermisoCopiarDetalleGrupoActivoFijo=isPermiso;		
		//this.isPermisoDuplicarDetalleGrupoActivoFijo=isPermiso;
		//this.isPermisoOrdenDetalleGrupoActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleGrupoActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CuentaContaDetaGrupoActiConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SubGrupoActivoFijoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(GastoDepreciacionConstantesFunciones.SNOMBREOPCION);
		
		if(DetalleGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleActivoFijo=false;
		this.isTienePermisosDetalleActivoFijo=this.verificarGetPermisosUsuarioOpcionDetalleGrupoActivoFijoClaseRelacionada(this.opcionsRelacionadas,DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCuentaContaDetaGrupoActi=false;
		this.isTienePermisosCuentaContaDetaGrupoActi=this.verificarGetPermisosUsuarioOpcionDetalleGrupoActivoFijoClaseRelacionada(this.opcionsRelacionadas,CuentaContaDetaGrupoActiConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSubGrupoActivoFijo=false;
		this.isTienePermisosSubGrupoActivoFijo=this.verificarGetPermisosUsuarioOpcionDetalleGrupoActivoFijoClaseRelacionada(this.opcionsRelacionadas,SubGrupoActivoFijoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosGastoDepreciacion=false;
		this.isTienePermisosGastoDepreciacion=this.verificarGetPermisosUsuarioOpcionDetalleGrupoActivoFijoClaseRelacionada(this.opcionsRelacionadas,GastoDepreciacionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleGrupoActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleGrupoActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleActivoFijo=conPermiso;
		this.isTienePermisosCuentaContaDetaGrupoActi=conPermiso;
		this.isTienePermisosSubGrupoActivoFijo=conPermiso;
		this.isTienePermisosGastoDepreciacion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleGrupoActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleGrupoActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleGrupoActivoFijoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleActivoFijo && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.remove(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCuentaContaDetaGrupoActi && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.remove(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSubGrupoActivoFijo && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.remove(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosGastoDepreciacion && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.remove(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioDetalleGrupoActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleGrupoActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleGrupoActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleGrupoActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleGrupoActivoFijo=this.isPermisoActualizarDetalleGrupoActivoFijo;
			this.isPermisoEliminarDetalleGrupoActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleGrupoActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleGrupoActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleGrupoActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleGrupoActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleGrupoActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleGrupoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleGrupoActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleGrupoActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleGrupoActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleGrupoActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleGrupoActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleGrupoActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleGrupoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleGrupoActivoFijo.setToolTipText(this.jTableDatosDetalleGrupoActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleGrupoActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleGrupoActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleGrupoActivoFijo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleActivoFijo && this.detallegrupoactivofijoConstantesFunciones.mostrarDetalleActivoFijoDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Activo Fijo");
			reporte.setsDescripcion("Detalle Activo Fijo");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCuentaContaDetaGrupoActi && this.detallegrupoactivofijoConstantesFunciones.mostrarCuentaContaDetaGrupoActiDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuenta Conta Deta Grupo Acti");
			reporte.setsDescripcion("Cuenta Conta Deta Grupo Acti");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSubGrupoActivoFijo && this.detallegrupoactivofijoConstantesFunciones.mostrarSubGrupoActivoFijoDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Sub Grupo Activo Fijo");
			reporte.setsDescripcion("Sub Grupo Activo Fijo");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosGastoDepreciacion && this.detallegrupoactivofijoConstantesFunciones.mostrarGastoDepreciacionDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Gasto Depreciacion");
			reporte.setsDescripcion("Gasto Depreciacion");
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
	public void inicializarCombosForeignKeyDetalleGrupoActivoFijoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cuentacontablecostooriginalsForeignKey=new ArrayList();
				this.cuentacontabledeprenormalsForeignKey=new ArrayList();
				this.cuentacontabledepregastonormalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleGrupoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleGrupoActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleGrupoActivoFijoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableCostoOriginalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableDepreNormalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableDepreGastoNormalListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCuentaContableCostoOriginalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablecostooriginalsForeignKey==null||this.cuentacontablecostooriginalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableCostoOriginalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDepreNormalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontabledeprenormalsForeignKey==null||this.cuentacontabledeprenormalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableDepreNormalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDepreGastoNormalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontabledepregastonormalsForeignKey==null||this.cuentacontabledepregastonormalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableDepreGastoNormalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleGrupoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleGrupoActivoFijoParameterReturnGeneral detallegrupoactivofijoReturnGeneral=new DetalleGrupoActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detallegrupoactivofijoConstantesFunciones.cargarid_empresaDetalleGrupoActivoFijo)
					 || (this.esRecargarFks && this.detallegrupoactivofijoConstantesFunciones.cargarid_empresaDetalleGrupoActivoFijo)) {

					if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detallegrupoactivofijoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCuentaContableCostoOriginal="";

				if(((this.cuentacontablecostooriginalsForeignKey==null||this.cuentacontablecostooriginalsForeignKey.size()<=0) && this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo)
					 || (this.esRecargarFks && this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo)) {

					if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCostoOriginal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCostoOriginal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCostoOriginal=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCostoOriginal, "");
						finalQueryGlobalCuentaContableCostoOriginal+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCostoOriginalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCostoOriginal=" WHERE " + ConstantesSql.ID + "="+detallegrupoactivofijoSessionBean.getlidCuentaContableCostoOriginalActual();
					}
				} else {
					finalQueryGlobalCuentaContableCostoOriginal="NONE";
				}


				String finalQueryGlobalCuentaContableDepreNormal="";

				if(((this.cuentacontabledeprenormalsForeignKey==null||this.cuentacontabledeprenormalsForeignKey.size()<=0) && this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo)
					 || (this.esRecargarFks && this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo)) {

					if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDepreNormal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableDepreNormal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableDepreNormal=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableDepreNormal, "");
						finalQueryGlobalCuentaContableDepreNormal+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableDepreNormalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableDepreNormal=" WHERE " + ConstantesSql.ID + "="+detallegrupoactivofijoSessionBean.getlidCuentaContableDepreNormalActual();
					}
				} else {
					finalQueryGlobalCuentaContableDepreNormal="NONE";
				}


				String finalQueryGlobalCuentaContableDepreGastoNormal="";

				if(((this.cuentacontabledepregastonormalsForeignKey==null||this.cuentacontabledepregastonormalsForeignKey.size()<=0) && this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo)
					 || (this.esRecargarFks && this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo)) {

					if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDepreGastoNormal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableDepreGastoNormal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableDepreGastoNormal=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableDepreGastoNormal, "");
						finalQueryGlobalCuentaContableDepreGastoNormal+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableDepreGastoNormalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableDepreGastoNormal=" WHERE " + ConstantesSql.ID + "="+detallegrupoactivofijoSessionBean.getlidCuentaContableDepreGastoNormalActual();
					}
				} else {
					finalQueryGlobalCuentaContableDepreGastoNormal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detallegrupoactivofijoReturnGeneral=detallegrupoactivofijoLogic.cargarCombosLoteForeignKeyDetalleGrupoActivoFijo(finalQueryGlobalEmpresa,finalQueryGlobalCuentaContableCostoOriginal,finalQueryGlobalCuentaContableDepreNormal,finalQueryGlobalCuentaContableDepreGastoNormal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detallegrupoactivofijoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCostoOriginal.equals("NONE")) {
				this.cuentacontablecostooriginalsForeignKey=detallegrupoactivofijoReturnGeneral.getcuentacontablecostooriginalsForeignKey();
			}

			if(!finalQueryGlobalCuentaContableDepreNormal.equals("NONE")) {
				this.cuentacontabledeprenormalsForeignKey=detallegrupoactivofijoReturnGeneral.getcuentacontabledeprenormalsForeignKey();
			}

			if(!finalQueryGlobalCuentaContableDepreGastoNormal.equals("NONE")) {
				this.cuentacontabledepregastonormalsForeignKey=detallegrupoactivofijoReturnGeneral.getcuentacontabledepregastonormalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleGrupoActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCuentaContableCostoOriginal();
			this.addItemDefectoCombosForeignKeyCuentaContableDepreNormal();
			this.addItemDefectoCombosForeignKeyCuentaContableDepreGastoNormal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detallegrupoactivofijoSessionBean==null) {
				this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContableCostoOriginal()throws Exception {
		try {

			if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCostoOriginal()) {
				CuentaContable cuentacontablecostooriginal=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontablecostooriginal,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontablecostooriginal.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablecostooriginalsForeignKey,cuentacontablecostooriginal,true)) {

					this.cuentacontablecostooriginalsForeignKey.add(0,cuentacontablecostooriginal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableDepreNormal()throws Exception {
		try {

			if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDepreNormal()) {
				CuentaContable cuentacontabledeprenormal=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontabledeprenormal,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontabledeprenormal.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontabledeprenormalsForeignKey,cuentacontabledeprenormal,true)) {

					this.cuentacontabledeprenormalsForeignKey.add(0,cuentacontabledeprenormal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableDepreGastoNormal()throws Exception {
		try {

			if(!this.detallegrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDepreGastoNormal()) {
				CuentaContable cuentacontabledepregastonormal=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontabledepregastonormal,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontabledepregastonormal.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontabledepregastonormalsForeignKey,cuentacontabledepregastonormal,true)) {

					this.cuentacontabledepregastonormalsForeignKey.add(0,cuentacontabledepregastonormal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleGrupoActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleGrupoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleGrupoActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleGrupoActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo)throws Exception {	
		try {
			
			this.setActualCuentaContableCostoOriginalForeignKey(detallegrupoactivofijo.getid_cuenta_contable_costo_original(),false,"Formulario");
			this.setActualCuentaContableDepreNormalForeignKey(detallegrupoactivofijo.getid_cuenta_contable_depre_normal(),false,"Formulario");
			this.setActualCuentaContableDepreGastoNormalForeignKey(detallegrupoactivofijo.getid_cuenta_contable_depre_gasto_normal(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detallegrupoactivofijo.getCuentaContableCostoOriginal()!=null && !sTipoEvento.equals("id_cuenta_contable_costo_originalDetalleGrupoActivoFijo")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablecostooriginalsForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablecostooriginalsForeignKey.add(detallegrupoactivofijo.getCuentaContableCostoOriginal());

					this.addItemDefectoCombosForeignKeyCuentaContableCostoOriginal();
					this.cargarCombosFrameCuentaContableCostoOriginalsForeignKey("Todos");
				}

				if(detallegrupoactivofijo.getCuentaContableDepreNormal()!=null && !sTipoEvento.equals("id_cuenta_contable_depre_normalDetalleGrupoActivoFijo")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontabledeprenormalsForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontabledeprenormalsForeignKey.add(detallegrupoactivofijo.getCuentaContableDepreNormal());

					this.addItemDefectoCombosForeignKeyCuentaContableDepreNormal();
					this.cargarCombosFrameCuentaContableDepreNormalsForeignKey("Todos");
				}

				if(detallegrupoactivofijo.getCuentaContableDepreGastoNormal()!=null && !sTipoEvento.equals("id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontabledepregastonormalsForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontabledepregastonormalsForeignKey.add(detallegrupoactivofijo.getCuentaContableDepreGastoNormal());

					this.addItemDefectoCombosForeignKeyCuentaContableDepreGastoNormal();
					this.cargarCombosFrameCuentaContableDepreGastoNormalsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleGrupoActivoFijo()throws Exception {	
		try {
			
			this.setActualCuentaContableCostoOriginalForeignKey(this.detallegrupoactivofijoConstantesFunciones.getid_cuenta_contable_costo_original(),false,"Formulario");
			this.setActualCuentaContableDepreNormalForeignKey(this.detallegrupoactivofijoConstantesFunciones.getid_cuenta_contable_depre_normal(),false,"Formulario");
			this.setActualCuentaContableDepreGastoNormalForeignKey(this.detallegrupoactivofijoConstantesFunciones.getid_cuenta_contable_depre_gasto_normal(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleGrupoActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleGrupoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleGrupoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleGrupoActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleGrupoActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCostoOriginalsForeignKey("Todos");
			this.cargarCombosFrameCuentaContableDepreNormalsForeignKey("Todos");
			this.cargarCombosFrameCuentaContableDepreGastoNormalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleGrupoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCostoOriginalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableDepreNormalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableDepreGastoNormalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleGrupoActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public DetalleGrupoActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleGrupoActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleGrupoActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean(); 
		this.detallegrupoactivofijoConstantesFunciones=new DetalleGrupoActivoFijoConstantesFunciones(); 
		this.detallegrupoactivofijoBean=new DetalleGrupoActivoFijo();//(this.detallegrupoactivofijoConstantesFunciones); 		
		this.detallegrupoactivofijoReturnGeneral=new DetalleGrupoActivoFijoParameterReturnGeneral(); 
		
		this.detallegrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallegrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleGrupoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleGrupoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleGrupoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleGrupoActivoFijo(true);
			
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
			
			this.detallegrupoactivofijoConstantesFunciones=new DetalleGrupoActivoFijoConstantesFunciones(); 
			this.detallegrupoactivofijoBean=new DetalleGrupoActivoFijo();//this.detallegrupoactivofijoConstantesFunciones); 			
			this.detallegrupoactivofijoReturnGeneral=new DetalleGrupoActivoFijoParameterReturnGeneral(); 
		
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Grupo Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.detallegrupoactivofijo=new DetalleGrupoActivoFijo();
			this.detallegrupoactivofijos = new ArrayList<DetalleGrupoActivoFijo>();
			this.detallegrupoactivofijosAux = new ArrayList<DetalleGrupoActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic=new DetalleGrupoActivoFijoLogic();
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.detallegrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallegrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionDetalleGrupoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleGrupoActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleGrupoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleGrupoActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo);
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo);
					this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleGrupoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleGrupoActivoFijo);
					this.jInternalFrameImportacionDetalleGrupoActivoFijo.setVisible(false);
					this.jInternalFrameImportacionDetalleGrupoActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleGrupoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleGrupoActivoFijo);
					this.jInternalFrameOrderByDetalleGrupoActivoFijo.setVisible(false);
					this.jInternalFrameOrderByDetalleGrupoActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleGrupoActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallegrupoactivofijoReturnGeneral=new DetalleGrupoActivoFijoParameterReturnGeneral();
			
			this.detallegrupoactivofijoParameterGeneral=new DetalleGrupoActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallegrupoactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CuentaContaDetaGrupoActiConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SubGrupoActivoFijoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(GastoDepreciacionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleGrupoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado(),this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleGrupoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado(),this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaCopiarDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaVerFormDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaOrdenDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=false;
			
			
			this.isVisibilidadFK_IdCuentaContableCostoOriginal=true;
			this.isVisibilidadFK_IdCuentaContableDepreGastoNormal=true;
			this.isVisibilidadFK_IdCuentaContableDepreNormal=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleGrupoActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleGrupoActivoFijo(false);
			
			this.setPermisosUsuarioDetalleGrupoActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado() && this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleGrupoActivoFijoClasesRelacionadas();
			}
			
			if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleGrupoActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleGrupoActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleGrupoActivoFijo();
			}
			
			if(!this.isPermisoBusquedaDetalleGrupoActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleGrupoActivoFijo,this.isPermisoPaginacionMedioDetalleGrupoActivoFijo,this.isPermisoPaginacionTodoDetalleGrupoActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleGrupoActivoFijoConstantesFunciones.getTiposSeleccionarDetalleGrupoActivoFijo());
				
				this.tiposColumnasSelect=DetalleGrupoActivoFijoConstantesFunciones.getTiposSeleccionarDetalleGrupoActivoFijo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectDetalleGrupoActivoFijo();				
				//this.tiposRelacionesSelect=DetalleGrupoActivoFijoConstantesFunciones.getTiposRelacionesDetalleGrupoActivoFijo(true);
				
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
			//if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleGrupoActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDetalleGrupoActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDetalleGrupoActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleGrupoActivoFijo() ;
			
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
			
			
			this.detalleactivofijoLogic=new DetalleActivoFijoLogic();
			this.cuentacontadetagrupoactiLogic=new CuentaContaDetaGrupoActiLogic();
			this.subgrupoactivofijoLogic=new SubGrupoActivoFijoLogic();
			this.gastodepreciacionLogic=new GastoDepreciacionLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.cuentacontablecostooriginalLogic=new CuentaContableLogic();
			this.cuentacontabledeprenormalLogic=new CuentaContableLogic();
			this.cuentacontabledepregastonormalLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detallegrupoactivofijoImplementable= (DetalleGrupoActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleGrupoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallegrupoactivofijoImplementableHome= (DetalleGrupoActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleGrupoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallegrupoactivofijos= new ArrayList<DetalleGrupoActivoFijo>();
			this.detallegrupoactivofijosEliminados= new ArrayList<DetalleGrupoActivoFijo>();
						
			this.isEsNuevoDetalleGrupoActivoFijo=false;
			this.esParaAccionDesdeFormularioDetalleGrupoActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableCostoOriginalActual=0L;
			this.idCuentaContableDepreNormalActual=0L;
			this.idCuentaContableDepreGastoNormalActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.cuentacontablecostooriginalsForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontabledeprenormalsForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontabledepregastonormalsForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleGrupoActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleGrupoActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleGrupoActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleGrupoActivoFijo();
			}
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleGrupoActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleGrupoActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleGrupoActivoFijo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleGrupoActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();	
				
				

				if(sTitle.equals("Cuenta Conta Deta Grupo Actis")) {
					if(!CuentaContaDetaGrupoActiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessDetalleGrupoActivoFijo();

						this.cargarParteTabPanelRelacionadaCuentaContaDetaGrupoActi(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle Activo Fijos")) {
					if(!DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessDetalleGrupoActivoFijo();

						this.cargarParteTabPanelRelacionadaDetalleActivoFijo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Gasto Depreciaciones")) {
					if(!GastoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessDetalleGrupoActivoFijo();

						this.cargarParteTabPanelRelacionadaGastoDepreciacion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Sub Grupo Activo Fijos")) {
					if(!SubGrupoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessDetalleGrupoActivoFijo();

						this.cargarParteTabPanelRelacionadaSubGrupoActivoFijo(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleGrupoActivoFijo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCuentaContaDetaGrupoActi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cargarSessionConBeanSwingJInternalFrameCuentaContaDetaGrupoActi(false,true,iIndex);
		this.jButtonCuentaContaDetaGrupoActiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuentaContaDetaGrupoActi();

		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.updateUI();
		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetalleActivoFijo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(false,true,iIndex);
		this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();

		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.updateUI();
		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaGastoDepreciacion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cargarSessionConBeanSwingJInternalFrameGastoDepreciacion(false,true,iIndex);
		this.jButtonGastoDepreciacionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaGastoDepreciacion();

		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.updateUI();
		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSubGrupoActivoFijo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cargarSessionConBeanSwingJInternalFrameSubGrupoActivoFijo(false,true,iIndex);
		this.jButtonSubGrupoActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSubGrupoActivoFijo();

		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.updateUI();
		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleActivoFijo")) {
				int row=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
				jButtonDetalleActivoFijoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CuentaContaDetaGrupoActi")) {
				int row=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
				jButtonCuentaContaDetaGrupoActiActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SubGrupoActivoFijo")) {
				int row=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
				jButtonSubGrupoActivoFijoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("GastoDepreciacion")) {
				int row=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
				jButtonGastoDepreciacionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Activo Fijo")) {

					if(this.isTienePermisosDetalleActivoFijo && this.detallegrupoactivofijoConstantesFunciones.mostrarDetalleActivoFijoDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Activo Fijos"+"("+DetalleActivoFijoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Activo Fijos");

						if(detallegrupoactivofijoConstantesFunciones.resaltarDetalleActivoFijoDetalleGrupoActivoFijo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(detallegrupoactivofijoConstantesFunciones.resaltarDetalleActivoFijoDetalleGrupoActivoFijo);
						}

						jmenuItem.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarDetalleActivoFijoDetalleGrupoActivoFijo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleActivoFijo"));

						

						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jmenuDetalleDetalleGrupoActivoFijo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cuenta Conta Deta Grupo Acti")) {

					if(this.isTienePermisosCuentaContaDetaGrupoActi && this.detallegrupoactivofijoConstantesFunciones.mostrarCuentaContaDetaGrupoActiDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuenta Conta Deta Grupo Actis"+"("+CuentaContaDetaGrupoActiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuenta Conta Deta Grupo Actis");

						if(detallegrupoactivofijoConstantesFunciones.resaltarCuentaContaDetaGrupoActiDetalleGrupoActivoFijo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(detallegrupoactivofijoConstantesFunciones.resaltarCuentaContaDetaGrupoActiDetalleGrupoActivoFijo);
						}

						jmenuItem.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarCuentaContaDetaGrupoActiDetalleGrupoActivoFijo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CuentaContaDetaGrupoActi"));

						

						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jmenuDetalleDetalleGrupoActivoFijo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Sub Grupo Activo Fijo")) {

					if(this.isTienePermisosSubGrupoActivoFijo && this.detallegrupoactivofijoConstantesFunciones.mostrarSubGrupoActivoFijoDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Sub Grupo Activo Fijos"+"("+SubGrupoActivoFijoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Sub Grupo Activo Fijos");

						if(detallegrupoactivofijoConstantesFunciones.resaltarSubGrupoActivoFijoDetalleGrupoActivoFijo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(detallegrupoactivofijoConstantesFunciones.resaltarSubGrupoActivoFijoDetalleGrupoActivoFijo);
						}

						jmenuItem.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarSubGrupoActivoFijoDetalleGrupoActivoFijo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SubGrupoActivoFijo"));

						

						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jmenuDetalleDetalleGrupoActivoFijo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Gasto Depreciacion")) {

					if(this.isTienePermisosGastoDepreciacion && this.detallegrupoactivofijoConstantesFunciones.mostrarGastoDepreciacionDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Gasto Depreciaciones"+"("+GastoDepreciacionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Gasto Depreciaciones");

						if(detallegrupoactivofijoConstantesFunciones.resaltarGastoDepreciacionDetalleGrupoActivoFijo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(detallegrupoactivofijoConstantesFunciones.resaltarGastoDepreciacionDetalleGrupoActivoFijo);
						}

						jmenuItem.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarGastoDepreciacionDetalleGrupoActivoFijo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"GastoDepreciacion"));

						

						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jmenuDetalleDetalleGrupoActivoFijo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyDetalleGrupoActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleGrupoActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleGrupoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleGrupoActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleGrupoActivoFijo();
		
		this.cargarCombosFrameForeignKeyDetalleGrupoActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleGrupoActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleGrupoActivoFijo();
		}
	}
	
	

	public void cargarCombosForeignKeyCuentaContableCostoOriginal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableCostoOriginalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableCostoOriginal();
				this.cargarCombosFrameCuentaContableCostoOriginalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableCostoOriginal(this.cuentacontablecostooriginalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDepreNormal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableDepreNormalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableDepreNormal();
				this.cargarCombosFrameCuentaContableDepreNormalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableDepreNormal(this.cuentacontabledeprenormalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDepreGastoNormal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableDepreGastoNormalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableDepreGastoNormal();
				this.cargarCombosFrameCuentaContableDepreGastoNormalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableDepreGastoNormal(this.cuentacontabledepregastonormalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleGrupoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
			
			if(jTableDatosDetalleGrupoActivoFijo.getRowCount()>=1) {
				jTableDatosDetalleGrupoActivoFijo.removeRowSelectionInterval(0, jTableDatosDetalleGrupoActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleGrupoActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleGrupoActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleGrupoActivoFijo(true);			
			//this.detallegrupoactivofijo=new DetalleGrupoActivoFijo();
			//this.detallegrupoactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleGrupoActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleGrupoActivoFijo() ;
			
			if(DetalleGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleGrupoActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallegrupoactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);				
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
			if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleGrupoActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleGrupoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRows().length;			
			}
			
			detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleGrupoActivoFijo--;			
				//DetalleGrupoActivoFijo detallegrupoactivofijoAux= new DetalleGrupoActivoFijo();			
				//detallegrupoactivofijoAux.setId(this.iIdNuevoDetalleGrupoActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleGrupoActivoFijo detallegrupoactivofijoOrigen=new DetalleGrupoActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleGrupoActivoFijo detallegrupoactivofijoOrigen : detallegrupoactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallegrupoactivofijoOrigen =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallegrupoactivofijoOrigen =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleGrupoActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallegrupoactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleGrupoActivoFijo(detallegrupoactivofijoOrigen,this.detallegrupoactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().add(this.detallegrupoactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallegrupoactivofijos.add(this.detallegrupoactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
				
				this.jTableDatosDetalleGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoDetalleGrupoActivoFijo(), this.getIndiceNuevoDetalleGrupoActivoFijo());
				
				int iLastRow =  this.jTableDatosDetalleGrupoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleGrupoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleGrupoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();									
		
			DetalleGrupoActivoFijo detallegrupoactivofijoOrigen=new DetalleGrupoActivoFijo();
			DetalleGrupoActivoFijo detallegrupoactivofijoDestino=new DetalleGrupoActivoFijo();
				
			detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallegrupoactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleGrupoActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijoOrigen =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallegrupoactivofijoOrigen =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallegrupoactivofijoDestino =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallegrupoactivofijoDestino =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallegrupoactivofijoOrigen =detallegrupoactivofijosSeleccionados.get(0);
				detallegrupoactivofijoDestino =detallegrupoactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleGrupoActivoFijo(detallegrupoactivofijoOrigen,detallegrupoactivofijoDestino,true,false);
				
				detallegrupoactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallegrupoactivofijoDestino,detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallegrupoactivofijoDestino,detallegrupoactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
				
				//this.jTableDatosDetalleGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoDetalleGrupoActivoFijo(), this.getIndiceNuevoDetalleGrupoActivoFijo());
				
				int iLastRow =  this.jTableDatosDetalleGrupoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleGrupoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleGrupoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleGrupoActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleGrupoActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionDetalleGrupoActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesDetalleGrupoActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleGrupoActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleGrupoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleGrupoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleGrupoActivoFijo();
			
			this.abrirFrameOrderByDetalleGrupoActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleGrupoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleGrupoActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleGrupoActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setSize(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jContentPaneDetalleDetalleGrupoActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jContentPaneDetalleDetalleGrupoActivoFijo.getWidth(),DetalleGrupoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jContentPaneDetalleDetalleGrupoActivoFijo.getWidth(),DetalleGrupoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jContentPaneDetalleDetalleGrupoActivoFijo.getWidth(),DetalleGrupoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CuentaContaDetaGrupoActiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuentaContaDetaGrupoActi();
					}

					if(DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();
					}

					if(GastoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaGastoDepreciacion();
					}

					if(SubGrupoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSubGrupoActivoFijo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleGrupoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleGrupoActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleGrupoActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByDetalleGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleGrupoActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleGrupoActivoFijo);
				this.jInternalFrameOrderByDetalleGrupoActivoFijo.setVisible(false);
				this.jInternalFrameOrderByDetalleGrupoActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleGrupoActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleGrupoActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleGrupoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleGrupoActivoFijo==null) {
				
				this.jInternalFrameImportacionDetalleGrupoActivoFijo=new ImportacionJInternalFrame(DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleGrupoActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleGrupoActivoFijo);
				this.jInternalFrameImportacionDetalleGrupoActivoFijo.setVisible(false);
				this.jInternalFrameImportacionDetalleGrupoActivoFijo.setSelected(false);


				this.jInternalFrameImportacionDetalleGrupoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleGrupoActivoFijo"));
				this.jInternalFrameImportacionDetalleGrupoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleGrupoActivoFijo"));
				this.jInternalFrameImportacionDetalleGrupoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleGrupoActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleGrupoActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo==null) {
				this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo=new ReporteDinamicoJInternalFrame(DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo);
				this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleGrupoActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleGrupoActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCuentaContaDetaGrupoActi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.jScrollPanelDatosCuentaContaDetaGrupoActi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jContentPaneDetalleDetalleGrupoActivoFijo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.jScrollPanelDatosCuentaContaDetaGrupoActi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.jScrollPanelDatosCuentaContaDetaGrupoActi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.jScrollPanelDatosCuentaContaDetaGrupoActi.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetalleActivoFijo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jContentPaneDetalleDetalleGrupoActivoFijo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaGastoDepreciacion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jScrollPanelDatosGastoDepreciacion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jContentPaneDetalleDetalleGrupoActivoFijo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jScrollPanelDatosGastoDepreciacion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jScrollPanelDatosGastoDepreciacion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.jScrollPanelDatosGastoDepreciacion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSubGrupoActivoFijo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosSubGrupoActivoFijo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jContentPaneDetalleDetalleGrupoActivoFijo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosSubGrupoActivoFijo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosSubGrupoActivoFijo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosSubGrupoActivoFijo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleDetalleGrupoActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleGrupoActivoFijo);
			
	       	this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.dispose();
			//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleGrupoActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleGrupoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionDetalleGrupoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleGrupoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByDetalleGrupoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleGrupoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByDetalleGrupoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleGrupoActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleGrupoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionDetalleGrupoActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContableCostoOriginal(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableCostoOriginal";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
						TitledBorder titledBorderCuentaContableCostoOriginal=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCostoOriginal.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableCostoOriginal(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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

				public void abrirFrameTreeCuentaContableDepreNormal(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableDepreNormal";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
						TitledBorder titledBorderCuentaContableDepreNormal=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableDepreNormal.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableDepreNormal(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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

				public void abrirFrameTreeCuentaContableDepreGastoNormal(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableDepreGastoNormal";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
						TitledBorder titledBorderCuentaContableDepreGastoNormal=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableDepreGastoNormal.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableDepreGastoNormal(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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
	
	public void jButtonModificarDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleGrupoActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleGrupoActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleGrupoActivoFijo(true);
			//this.isEsNuevoDetalleGrupoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleGrupoActivoFijo(false) ;
			
			if(detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado() && CuentaContaDetaGrupoActiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContaDetaGrupoActiActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() && SubGrupoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSubGrupoActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionSessionBean.getEsGuardarRelacionado() && GastoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGastoDepreciacionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(DetalleGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleGrupoActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleGrupoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleGrupoActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleGrupoActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleGrupoActivoFijo(true);
			//this.isEsNuevoDetalleGrupoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallegrupoactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleGrupoActivoFijo(false) ;
			
			if(DetalleGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleGrupoActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleGrupoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContableCostoOriginal")) {
				if(!this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo) {
					this.cargarCombosCuentaContableCostoOriginalsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
					this.cargarCombosFrameCuentaContableCostoOriginalsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_costo_original (id);

				this.recargarComboTablaCuentaContableCostoOriginal(this.cuentacontablecostooriginalsForeignKey);

			}
			
			if(sType.equals("CuentaContableDepreNormal")) {
				if(!this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo) {
					this.cargarCombosCuentaContableDepreNormalsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
					this.cargarCombosFrameCuentaContableDepreNormalsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_depre_normal (id);

				this.recargarComboTablaCuentaContableDepreNormal(this.cuentacontabledeprenormalsForeignKey);

			}
			
			if(sType.equals("CuentaContableDepreGastoNormal")) {
				if(!this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo) {
					this.cargarCombosCuentaContableDepreGastoNormalsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
					this.cargarCombosFrameCuentaContableDepreGastoNormalsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_depre_gasto_normal (id);

				this.recargarComboTablaCuentaContableDepreGastoNormal(this.cuentacontabledepregastonormalsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCuentaContableCostoOriginal(List<CuentaContable> cuentacontablecostooriginalsForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableCostoOriginal=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL));
		TableCellEditor tableCellEditorCuentaContableCostoOriginal =tableColumnCuentaContableCostoOriginal.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCostoOriginal;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecostooriginalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablecostooriginalsForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableDepreNormal(List<CuentaContable> cuentacontabledeprenormalsForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableDepreNormal=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL));
		TableCellEditor tableCellEditorCuentaContableDepreNormal =tableColumnCuentaContableDepreNormal.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableDepreNormal;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontabledeprenormalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontabledeprenormalsForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableDepreGastoNormal(List<CuentaContable> cuentacontabledepregastonormalsForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableDepreGastoNormal=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL));
		TableCellEditor tableCellEditorCuentaContableDepreGastoNormal =tableColumnCuentaContableDepreGastoNormal.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableDepreGastoNormal;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontabledepregastonormalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontabledepregastonormalsForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_costo_original (Long id) throws Exception {
		this.setActualCuentaContableCostoOriginalForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_depre_normal (Long id) throws Exception {
		this.setActualCuentaContableDepreNormalForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_depre_gasto_normal (Long id) throws Exception {
		this.setActualCuentaContableDepreGastoNormalForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleGrupoActivoFijo(false);
			
			//if(!this.isEsNuevoDetalleGrupoActivoFijo) {								
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.detallegrupoactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleGrupoActivoFijo=true;
					this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
					this.isEsNuevoDetalleGrupoActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleGrupoActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleGrupoActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleGrupoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleGrupoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesDetalleGrupoActivoFijo(false);
			
												
				
				if(DetalleGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleGrupoActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,detallegrupoactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleGrupoActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallegrupoactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallegrupoactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleGrupoActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleGrupoActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.detallegrupoactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.detallegrupoactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallegrupoactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleGrupoActivoFijoModel) this.jTableDatosDetalleGrupoActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleGrupoActivoFijo=true;
				this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
				this.isEsNuevoDetalleGrupoActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleGrupoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleGrupoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesDetalleGrupoActivoFijo(false);
				
				
				
				if(DetalleGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleGrupoActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleGrupoActivoFijo.getRowCount()>=1) {
				jTableDatosDetalleGrupoActivoFijo.removeRowSelectionInterval(0, jTableDatosDetalleGrupoActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleGrupoActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleGrupoActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleGrupoActivoFijo(false) ;
			
			this.isEsNuevoDetalleGrupoActivoFijo=false;
			
			if(DetalleGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleGrupoActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
				
				//SI ES MANUAL
				if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleGrupoActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleGrupoActivoFijo--;			
			//DetalleGrupoActivoFijo detallegrupoactivofijoAux= new DetalleGrupoActivoFijo();			
			//detallegrupoactivofijoAux.setId(this.iIdNuevoDetalleGrupoActivoFijo);
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleGrupoActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
			
			this.detallegrupoactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().add(this.detallegrupoactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallegrupoactivofijos.add(this.detallegrupoactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
			
			this.jTableDatosDetalleGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoDetalleGrupoActivoFijo(), this.getIndiceNuevoDetalleGrupoActivoFijo());
			
			int iLastRow =  this.jTableDatosDetalleGrupoActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleGrupoActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleGrupoActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleGrupoActivoFijo();
			}
			
			//this.abrirFrameTreeDetalleGrupoActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Grupo Activo FijoS ?", "MANTENIMIENTO DE Detalle Grupo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleGrupoActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleGrupoActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detallegrupoactivofijoReturnGeneral=detallegrupoactivofijoLogic.procesarImportacionDetalleGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detallegrupoactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleGrupoActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleGrupoActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleGrupoActivoFijo.setFileImportacion(this.jInternalFrameImportacionDetalleGrupoActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleGrupoActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleGrupoActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleGrupoActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleGrupoActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();		

		detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleGrupoActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleGrupoActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleGrupoActivoFijos("Todos",detallegrupoactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_glas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_glas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_glas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_glas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCostoOriginal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCostoOriginal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCostoOriginal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCostoOriginal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableDepreNormal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableDepreNormal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableDepreNormal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableDepreNormal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableDepreGastoNormal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableDepreGastoNormal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableDepreGastoNormal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableDepreGastoNormal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoria="siglas";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL:
					sNombreCampoCategoria="id_cuenta_contable_costo_original";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL:
					sNombreCampoCategoria="id_cuenta_contable_depre_normal";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL:
					sNombreCampoCategoria="id_cuenta_contable_depre_gasto_normal";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoriaValor="siglas";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL:
					sNombreCampoCategoriaValor="id_cuenta_contable_costo_original";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL:
					sNombreCampoCategoriaValor="id_cuenta_contable_depre_normal";
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL:
					sNombreCampoCategoriaValor="id_cuenta_contable_depre_gasto_normal";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Siglas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"siglas");
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Costo Original",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_costo_original");
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Depre Normal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_depre_normal");
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Depre Gasto Normal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_depre_gasto_normal");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();		
		
		detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallegrupoactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleGrupoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleGrupoActivoFijo detallegrupoactivofijo:detallegrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallegrupoactivofijo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(DetalleGrupoActivoFijo detallegrupoactivofijo:detallegrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallegrupoactivofijo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DetalleGrupoActivoFijo detallegrupoactivofijo:detallegrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallegrupoactivofijo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS);
					iRow++;

					for(DetalleGrupoActivoFijo detallegrupoactivofijo:detallegrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallegrupoactivofijo.getsiglas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL);
					iRow++;

					for(DetalleGrupoActivoFijo detallegrupoactivofijo:detallegrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallegrupoactivofijo.getcuentacontablecostooriginal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL);
					iRow++;

					for(DetalleGrupoActivoFijo detallegrupoactivofijo:detallegrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallegrupoactivofijo.getcuentacontabledeprenormal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL);
					iRow++;

					for(DetalleGrupoActivoFijo detallegrupoactivofijo:detallegrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallegrupoactivofijo.getcuentacontabledepregastonormal_descripcion());
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
			//	this.getFilaCabeceraExportarExcelDetalleGrupoActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleGrupoActivoFijo(detallegrupoactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleGrupoActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleGrupoActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleGrupoActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleGrupoActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleGrupoActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleGrupoActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleGrupoActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleGrupoActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleGrupoActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleGrupoActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleGrupoActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleGrupoActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleGrupoActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleGrupoActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleGrupoActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleGrupoActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleGrupoActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleGrupoActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleGrupoActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualDetalleGrupoActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleGrupoActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleGrupoActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleGrupoActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleGrupoActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleGrupoActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jCheckBoxPostAccionNuevoDetalleGrupoActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jCheckBoxPostAccionSinCerrarDetalleGrupoActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jCheckBoxPostAccionSinMensajeDetalleGrupoActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleGrupoActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jCheckBoxPostAccionNuevoDetalleGrupoActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jCheckBoxPostAccionSinCerrarDetalleGrupoActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jCheckBoxPostAccionSinMensajeDetalleGrupoActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleGrupoActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleGrupoActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleGrupoActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleGrupoActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleGrupoActivoFijo() throws Exception {
		try	{
			if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleGrupoActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleGrupoActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleGrupoActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleGrupoActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleGrupoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleGrupoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo.addItem(reporte);
			}
			
			
			if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleGrupoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleGrupoActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleGrupoActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleGrupoActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.getSelectedItem()!=null){this.id_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal=((CuentaContable)this.jComboBoxid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.getSelectedItem()!=null){this.id_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal=((CuentaContable)this.jComboBoxid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.getSelectedItem()!=null){this.id_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal=((CuentaContable)this.jComboBoxid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleGrupoActivoFijo(Boolean esInicializar) throws Exception {				
		if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleGrupoActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleGrupoActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleGrupoActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleGrupoActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleGrupoActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallegrupoactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleGrupoActivoFijo.setModel(new DetalleGrupoActivoFijoModel(this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleGrupoActivoFijo.setModel(new DetalleGrupoActivoFijoModel(this.detallegrupoactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleGrupoActivoFijo!=null && this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleGrupoActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,detallegrupoactivofijoConstantesFunciones.resaltarSeleccionarDetalleGrupoActivoFijo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,detallegrupoactivofijoConstantesFunciones.resaltarSeleccionarDetalleGrupoActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,DetalleGrupoActivoFijoConstantesFunciones.LABEL_ID));

		if(this.detallegrupoactivofijoConstantesFunciones.mostraridDetalleGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleGrupoActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallegrupoactivofijoConstantesFunciones.resaltaridDetalleGrupoActivoFijo,this.detallegrupoactivofijoConstantesFunciones.activaridDetalleGrupoActivoFijo,this,true,"idDetalleGrupoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallegrupoactivofijoConstantesFunciones.resaltaridDetalleGrupoActivoFijo,this.detallegrupoactivofijoConstantesFunciones.activaridDetalleGrupoActivoFijo,this,true,"idDetalleGrupoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detallegrupoactivofijoConstantesFunciones.mostrarid_empresaDetalleGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detallegrupoactivofijoConstantesFunciones.resaltarid_empresaDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarid_empresaDetalleGrupoActivoFijo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detallegrupoactivofijoConstantesFunciones.resaltarid_empresaDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarid_empresaDetalleGrupoActivoFijo,false,"id_empresaDetalleGrupoActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO));

		if(this.detallegrupoactivofijoConstantesFunciones.mostrarcodigoDetalleGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallegrupoactivofijoConstantesFunciones.resaltarcodigoDetalleGrupoActivoFijo,this.detallegrupoactivofijoConstantesFunciones.activarcodigoDetalleGrupoActivoFijo,this,true,"codigoDetalleGrupoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallegrupoactivofijoConstantesFunciones.resaltarcodigoDetalleGrupoActivoFijo,this.detallegrupoactivofijoConstantesFunciones.activarcodigoDetalleGrupoActivoFijo,this,true,"codigoDetalleGrupoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE));

		if(this.detallegrupoactivofijoConstantesFunciones.mostrarnombreDetalleGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallegrupoactivofijoConstantesFunciones.resaltarnombreDetalleGrupoActivoFijo,this.detallegrupoactivofijoConstantesFunciones.activarnombreDetalleGrupoActivoFijo,this,true,"nombreDetalleGrupoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallegrupoactivofijoConstantesFunciones.resaltarnombreDetalleGrupoActivoFijo,this.detallegrupoactivofijoConstantesFunciones.activarnombreDetalleGrupoActivoFijo,this,true,"nombreDetalleGrupoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS));

		if(this.detallegrupoactivofijoConstantesFunciones.mostrarsiglasDetalleGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallegrupoactivofijoConstantesFunciones.resaltarsiglasDetalleGrupoActivoFijo,this.detallegrupoactivofijoConstantesFunciones.activarsiglasDetalleGrupoActivoFijo,this,true,"siglasDetalleGrupoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallegrupoactivofijoConstantesFunciones.resaltarsiglasDetalleGrupoActivoFijo,this.detallegrupoactivofijoConstantesFunciones.activarsiglasDetalleGrupoActivoFijo,this,true,"siglasDetalleGrupoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL));

		if(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecostooriginalsForeignKey,this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecostooriginalsForeignKey,this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo,true,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL));

		if(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontabledeprenormalsForeignKey,this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontabledeprenormalsForeignKey,this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo,true,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL));

		if(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontabledepregastonormalsForeignKey,this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontabledepregastonormalsForeignKey,this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo,true,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new DetalleGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleActivoFijo && this.detallegrupoactivofijoConstantesFunciones.mostrarDetalleActivoFijoDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Activo Fijos");
				tableColumn.setHeaderValue("Detalle Activo Fijos");
				tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(detallegrupoactivofijoConstantesFunciones.resaltarDetalleActivoFijoDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarDetalleActivoFijoDetalleGrupoActivoFijo));
				tableColumn.setCellEditor(new DetalleActivoFijoTableCell(detallegrupoactivofijoConstantesFunciones.resaltarDetalleActivoFijoDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarDetalleActivoFijoDetalleGrupoActivoFijo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosDetalleGrupoActivoFijo.addColumn(tableColumn);
			}

			if(this.isTienePermisosCuentaContaDetaGrupoActi && this.detallegrupoactivofijoConstantesFunciones.mostrarCuentaContaDetaGrupoActiDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuenta Conta Deta Grupo Actis");
				tableColumn.setHeaderValue("Cuenta Conta Deta Grupo Actis");
				tableColumn.setCellRenderer(new CuentaContaDetaGrupoActiTableCell(detallegrupoactivofijoConstantesFunciones.resaltarCuentaContaDetaGrupoActiDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarCuentaContaDetaGrupoActiDetalleGrupoActivoFijo));
				tableColumn.setCellEditor(new CuentaContaDetaGrupoActiTableCell(detallegrupoactivofijoConstantesFunciones.resaltarCuentaContaDetaGrupoActiDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarCuentaContaDetaGrupoActiDetalleGrupoActivoFijo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosDetalleGrupoActivoFijo.addColumn(tableColumn);
			}

			if(this.isTienePermisosSubGrupoActivoFijo && this.detallegrupoactivofijoConstantesFunciones.mostrarSubGrupoActivoFijoDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Sub Grupo Activo Fijos");
				tableColumn.setHeaderValue("Sub Grupo Activo Fijos");
				tableColumn.setCellRenderer(new SubGrupoActivoFijoTableCell(detallegrupoactivofijoConstantesFunciones.resaltarSubGrupoActivoFijoDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarSubGrupoActivoFijoDetalleGrupoActivoFijo));
				tableColumn.setCellEditor(new SubGrupoActivoFijoTableCell(detallegrupoactivofijoConstantesFunciones.resaltarSubGrupoActivoFijoDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarSubGrupoActivoFijoDetalleGrupoActivoFijo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosDetalleGrupoActivoFijo.addColumn(tableColumn);
			}

			if(this.isTienePermisosGastoDepreciacion && this.detallegrupoactivofijoConstantesFunciones.mostrarGastoDepreciacionDetalleGrupoActivoFijo && !DetalleGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Gasto Depreciaciones");
				tableColumn.setHeaderValue("Gasto Depreciaciones");
				tableColumn.setCellRenderer(new GastoDepreciacionTableCell(detallegrupoactivofijoConstantesFunciones.resaltarGastoDepreciacionDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarGastoDepreciacionDetalleGrupoActivoFijo));
				tableColumn.setCellEditor(new GastoDepreciacionTableCell(detallegrupoactivofijoConstantesFunciones.resaltarGastoDepreciacionDetalleGrupoActivoFijo,this,this.detallegrupoactivofijoConstantesFunciones.activarGastoDepreciacionDetalleGrupoActivoFijo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosDetalleGrupoActivoFijo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleGrupoActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleGrupoActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleGrupoActivoFijo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosDetalleGrupoActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleGrupoActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleGrupoActivoFijo.moveColumn(this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleGrupoActivoFijo.moveColumn(this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosDetalleGrupoActivoFijo.moveColumn(this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleGrupoActivoFijo.moveColumn(this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleGrupoActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleGrupoActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleGrupoActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleGrupoActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleGrupoActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleGrupoActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallegrupoactivofijos.size()-1;
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
		//this.jTableDatosDetalleGrupoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleGrupoActivoFijo();
			
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
				
				//this.isEsNuevoDetalleGrupoActivoFijo=false;
					
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
				if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleGrupoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallegrupoactivofijo.getsType().equals("DUPLICADO")
				   || this.detallegrupoactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleGrupoActivoFijo=true;
				
				} else {
					this.isEsNuevoDetalleGrupoActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.detallegrupoactivofijo.getId()>=0 && !this.detallegrupoactivofijo.getIsNew()) {						
						this.isEsNuevoDetalleGrupoActivoFijo=false;
						
					} else {
						this.isEsNuevoDetalleGrupoActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleGrupoActivoFijo(esRelaciones);						
				
				this.seleccionarDetalleGrupoActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallegrupoactivofijo.getId()<0) {
					this.isEsNuevoDetalleGrupoActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleGrupoActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleGrupoActivoFijo(evt,rowIndex);
				}	
				
				if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleGrupoActivoFijo: " + this.dDif); 
					}
				}								
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleGrupoActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallegrupoactivofijo)) {
					if(this.detallegrupoactivofijo.getId()>0) {
						this.detallegrupoactivofijo.setIsDeleted(true);
						
						this.detallegrupoactivofijosEliminados.add(this.detallegrupoactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().remove(this.detallegrupoactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallegrupoactivofijos.remove(this.detallegrupoactivofijo);				
					}
					
					
					((DetalleGrupoActivoFijoModel) this.jTableDatosDetalleGrupoActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleGrupoActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleGrupoActivoFijo) {
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleGrupoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detallegrupoactivofijoConstantesFunciones.cargarid_empresaDetalleGrupoActivoFijo || this.detallegrupoactivofijoConstantesFunciones.event_dependid_empresaDetalleGrupoActivoFijo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detallegrupoactivofijo.getid_empresa());
									//this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detallegrupoactivofijo.getEmpresa()!=null) {
							this.empresasForeignKey.add(detallegrupoactivofijo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detallegrupoactivofijo.getid_empresa(),false,"Formulario");

					//CuentaContableCostoOriginal
					if(!this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo || this.detallegrupoactivofijoConstantesFunciones.event_dependid_cuenta_contable_costo_originalDetalleGrupoActivoFijo) {
						//this.cargarCombosCuentaContableCostoOriginalsForeignKeyLista(" where id="+this.detallegrupoactivofijo.getid_cuenta_contable_costo_original());
									//this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
						this.cuentacontablecostooriginalsForeignKey=new ArrayList<CuentaContable>();

						if(detallegrupoactivofijo.getCuentaContableCostoOriginal()!=null) {
							this.cuentacontablecostooriginalsForeignKey.add(detallegrupoactivofijo.getCuentaContableCostoOriginal());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCostoOriginal();
						this.cargarCombosFrameCuentaContableCostoOriginalsForeignKey("Todos");
					}
					this.setActualCuentaContableCostoOriginalForeignKey(this.detallegrupoactivofijo.getid_cuenta_contable_costo_original(),false,"Formulario");

					//CuentaContableDepreNormal
					if(!this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo || this.detallegrupoactivofijoConstantesFunciones.event_dependid_cuenta_contable_depre_normalDetalleGrupoActivoFijo) {
						//this.cargarCombosCuentaContableDepreNormalsForeignKeyLista(" where id="+this.detallegrupoactivofijo.getid_cuenta_contable_depre_normal());
									//this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
						this.cuentacontabledeprenormalsForeignKey=new ArrayList<CuentaContable>();

						if(detallegrupoactivofijo.getCuentaContableDepreNormal()!=null) {
							this.cuentacontabledeprenormalsForeignKey.add(detallegrupoactivofijo.getCuentaContableDepreNormal());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableDepreNormal();
						this.cargarCombosFrameCuentaContableDepreNormalsForeignKey("Todos");
					}
					this.setActualCuentaContableDepreNormalForeignKey(this.detallegrupoactivofijo.getid_cuenta_contable_depre_normal(),false,"Formulario");

					//CuentaContableDepreGastoNormal
					if(!this.detallegrupoactivofijoConstantesFunciones.cargarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo || this.detallegrupoactivofijoConstantesFunciones.event_dependid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo) {
						//this.cargarCombosCuentaContableDepreGastoNormalsForeignKeyLista(" where id="+this.detallegrupoactivofijo.getid_cuenta_contable_depre_gasto_normal());
									//this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
						this.cuentacontabledepregastonormalsForeignKey=new ArrayList<CuentaContable>();

						if(detallegrupoactivofijo.getCuentaContableDepreGastoNormal()!=null) {
							this.cuentacontabledepregastonormalsForeignKey.add(detallegrupoactivofijo.getCuentaContableDepreGastoNormal());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableDepreGastoNormal();
						this.cargarCombosFrameCuentaContableDepreGastoNormalsForeignKey("Todos");
					}
					this.setActualCuentaContableDepreGastoNormalForeignKey(this.detallegrupoactivofijo.getid_cuenta_contable_depre_gasto_normal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleGrupoActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleGrupoActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleGrupoActivoFijo(detallegrupoactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleGrupoActivoFijo(detallegrupoactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleGrupoActivoFijo(detallegrupoactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleGrupoActivoFijo(detallegrupoactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelidDetalleGrupoActivoFijo.setText(detallegrupoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldcodigoDetalleGrupoActivoFijo.setText(detallegrupoactivofijo.getcodigo());
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextAreanombreDetalleGrupoActivoFijo.setText(detallegrupoactivofijo.getnombre());
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldsiglasDetalleGrupoActivoFijo.setText(detallegrupoactivofijo.getsiglas());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleGrupoActivoFijo detallegrupoactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallegrupoactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleGrupoActivoFijo detallegrupoactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallegrupoactivofijoLocal=this.detallegrupoactivofijo;
			} else {
				detallegrupoactivofijoLocal=this.detallegrupoactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallegrupoactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleGrupoActivoFijo(detallegrupoactivofijoLocal,true);
					
					if(detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallegrupoactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallegrupoactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(detallegrupoactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(detallegrupoactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(detallegrupoactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelidDetalleGrupoActivoFijo.getText()==null || this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelidDetalleGrupoActivoFijo.getText()=="" || this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelidDetalleGrupoActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelidDetalleGrupoActivoFijo.setText("0");
			}

			if(conColumnasBase) {detallegrupoactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelidDetalleGrupoActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleGrupoActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelIdDetalleGrupoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallegrupoactivofijo.setcodigo(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldcodigoDetalleGrupoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelcodigoDetalleGrupoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallegrupoactivofijo.setnombre(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextAreanombreDetalleGrupoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelnombreDetalleGrupoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallegrupoactivofijo.setsiglas(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldsiglasDetalleGrupoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelsiglasDetalleGrupoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijoBean,DetalleGrupoActivoFijo detallegrupoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detallegrupoactivofijoBean.getid_cuenta_contable_costo_original()!=null && !detallegrupoactivofijoBean.getid_cuenta_contable_costo_original().equals(null))) {detallegrupoactivofijo.setid_cuenta_contable_costo_original(detallegrupoactivofijoBean.getid_cuenta_contable_costo_original());}
			if(conDefault || (!conDefault && detallegrupoactivofijoBean.getid_cuenta_contable_depre_normal()!=null && !detallegrupoactivofijoBean.getid_cuenta_contable_depre_normal().equals(null))) {detallegrupoactivofijo.setid_cuenta_contable_depre_normal(detallegrupoactivofijoBean.getid_cuenta_contable_depre_normal());}
			if(conDefault || (!conDefault && detallegrupoactivofijoBean.getid_cuenta_contable_depre_gasto_normal()!=null && !detallegrupoactivofijoBean.getid_cuenta_contable_depre_gasto_normal().equals(null))) {detallegrupoactivofijo.setid_cuenta_contable_depre_gasto_normal(detallegrupoactivofijoBean.getid_cuenta_contable_depre_gasto_normal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijoOrigen,DetalleGrupoActivoFijo detallegrupoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallegrupoactivofijoOrigen.getId()!=null && !detallegrupoactivofijoOrigen.getId().equals(0L))) {detallegrupoactivofijo.setId(detallegrupoactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && detallegrupoactivofijoOrigen.getcodigo()!=null && !detallegrupoactivofijoOrigen.getcodigo().equals(""))) {detallegrupoactivofijo.setcodigo(detallegrupoactivofijoOrigen.getcodigo());}
			if(conDefault || (!conDefault && detallegrupoactivofijoOrigen.getnombre()!=null && !detallegrupoactivofijoOrigen.getnombre().equals(""))) {detallegrupoactivofijo.setnombre(detallegrupoactivofijoOrigen.getnombre());}
			if(conDefault || (!conDefault && detallegrupoactivofijoOrigen.getsiglas()!=null && !detallegrupoactivofijoOrigen.getsiglas().equals(""))) {detallegrupoactivofijo.setsiglas(detallegrupoactivofijoOrigen.getsiglas());}
			if(conDefault || (!conDefault && detallegrupoactivofijoOrigen.getid_cuenta_contable_costo_original()!=null && !detallegrupoactivofijoOrigen.getid_cuenta_contable_costo_original().equals(null))) {detallegrupoactivofijo.setid_cuenta_contable_costo_original(detallegrupoactivofijoOrigen.getid_cuenta_contable_costo_original());}
			if(conDefault || (!conDefault && detallegrupoactivofijoOrigen.getid_cuenta_contable_depre_normal()!=null && !detallegrupoactivofijoOrigen.getid_cuenta_contable_depre_normal().equals(null))) {detallegrupoactivofijo.setid_cuenta_contable_depre_normal(detallegrupoactivofijoOrigen.getid_cuenta_contable_depre_normal());}
			if(conDefault || (!conDefault && detallegrupoactivofijoOrigen.getid_cuenta_contable_depre_gasto_normal()!=null && !detallegrupoactivofijoOrigen.getid_cuenta_contable_depre_gasto_normal().equals(null))) {detallegrupoactivofijo.setid_cuenta_contable_depre_gasto_normal(detallegrupoactivofijoOrigen.getid_cuenta_contable_depre_gasto_normal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelidDetalleGrupoActivoFijo.setText(detallegrupoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldcodigoDetalleGrupoActivoFijo.setText(detallegrupoactivofijo.getcodigo());
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextAreanombreDetalleGrupoActivoFijo.setText(detallegrupoactivofijo.getnombre());
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldsiglasDetalleGrupoActivoFijo.setText(detallegrupoactivofijo.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleGrupoActivoFijo(DetalleGrupoActivoFijoBean detallegrupoactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelidDetalleGrupoActivoFijo.setText(detallegrupoactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldcodigoDetalleGrupoActivoFijo.setText(detallegrupoactivofijoBean.getcodigo());
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextAreanombreDetalleGrupoActivoFijo.setText(detallegrupoactivofijoBean.getnombre());
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldsiglasDetalleGrupoActivoFijo.setText(detallegrupoactivofijoBean.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleGrupoActivoFijo(DetalleGrupoActivoFijoParameterReturnGeneral detallegrupoactivofijoReturnGeneral,DetalleGrupoActivoFijoBean detallegrupoactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			DetalleGrupoActivoFijo detallegrupoactivofijoLocal=new DetalleGrupoActivoFijo();
			
			detallegrupoactivofijoLocal=detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallegrupoactivofijoLocal.getId()!=null && !detallegrupoactivofijoLocal.getId().equals(0L))) {detallegrupoactivofijoBean.setId(detallegrupoactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && detallegrupoactivofijoLocal.getcodigo()!=null && !detallegrupoactivofijoLocal.getcodigo().equals(""))) {detallegrupoactivofijoBean.setcodigo(detallegrupoactivofijoLocal.getcodigo());}
			if(conDefault || (!conDefault && detallegrupoactivofijoLocal.getnombre()!=null && !detallegrupoactivofijoLocal.getnombre().equals(""))) {detallegrupoactivofijoBean.setnombre(detallegrupoactivofijoLocal.getnombre());}
			if(conDefault || (!conDefault && detallegrupoactivofijoLocal.getsiglas()!=null && !detallegrupoactivofijoLocal.getsiglas().equals(""))) {detallegrupoactivofijoBean.setsiglas(detallegrupoactivofijoLocal.getsiglas());}
			if(conDefault || (!conDefault && detallegrupoactivofijoLocal.getid_cuenta_contable_costo_original()!=null && !detallegrupoactivofijoLocal.getid_cuenta_contable_costo_original().equals(null))) {detallegrupoactivofijoBean.setid_cuenta_contable_costo_original(detallegrupoactivofijoLocal.getid_cuenta_contable_costo_original());}
			if(conDefault || (!conDefault && detallegrupoactivofijoLocal.getid_cuenta_contable_depre_normal()!=null && !detallegrupoactivofijoLocal.getid_cuenta_contable_depre_normal().equals(null))) {detallegrupoactivofijoBean.setid_cuenta_contable_depre_normal(detallegrupoactivofijoLocal.getid_cuenta_contable_depre_normal());}
			if(conDefault || (!conDefault && detallegrupoactivofijoLocal.getid_cuenta_contable_depre_gasto_normal()!=null && !detallegrupoactivofijoLocal.getid_cuenta_contable_depre_gasto_normal().equals(null))) {detallegrupoactivofijoBean.setid_cuenta_contable_depre_gasto_normal(detallegrupoactivofijoLocal.getid_cuenta_contable_depre_gasto_normal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleGrupoActivoFijoGenerico(Long idDetalleGrupoActivoFijoSeleccionado,JComboBox jComboBoxDetalleGrupoActivoFijo,List<DetalleGrupoActivoFijo> detallegrupoactivofijosLocal)throws Exception {
		try {
			DetalleGrupoActivoFijo  detallegrupoactivofijoTemp=null;

			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosLocal) {
				if(detallegrupoactivofijoAux.getId()!=null && detallegrupoactivofijoAux.getId().equals(idDetalleGrupoActivoFijoSeleccionado)) {
					detallegrupoactivofijoTemp=detallegrupoactivofijoAux;
					break;
				}
			}

			jComboBoxDetalleGrupoActivoFijo.setSelectedItem(detallegrupoactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleGrupoActivoFijoGenerico(JComboBox jComboBoxDetalleGrupoActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleGrupoActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleGrupoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleGrupoActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleGrupoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleActivoFijo")) {
			jButtonDetalleActivoFijoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CuentaContaDetaGrupoActi")) {
			jButtonCuentaContaDetaGrupoActiActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("SubGrupoActivoFijo")) {
			jButtonSubGrupoActivoFijoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("GastoDepreciacion")) {
			jButtonGastoDepreciacionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallegrupoactivofijo=(DetalleGrupoActivoFijo) detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallegrupoactivofijo =(DetalleGrupoActivoFijo) detallegrupoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallegrupoactivofijo.getIsNew() && !detallegrupoactivofijo.getIsChanged() && !detallegrupoactivofijo.getIsDeleted()) {
				sDescripcion=detallegrupoactivofijo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallegrupoactivofijo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCostoOriginal")) {
			//sDescripcion=this.getActualCuentaContableCostoOriginalForeignKeyDescripcion((Long)value);
			if(!detallegrupoactivofijo.getIsNew() && !detallegrupoactivofijo.getIsChanged() && !detallegrupoactivofijo.getIsDeleted()) {
				sDescripcion=detallegrupoactivofijo.getcuentacontablecostooriginal_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCostoOriginalForeignKeyDescripcion((Long)value);
				sDescripcion=detallegrupoactivofijo.getcuentacontablecostooriginal_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableDepreNormal")) {
			//sDescripcion=this.getActualCuentaContableDepreNormalForeignKeyDescripcion((Long)value);
			if(!detallegrupoactivofijo.getIsNew() && !detallegrupoactivofijo.getIsChanged() && !detallegrupoactivofijo.getIsDeleted()) {
				sDescripcion=detallegrupoactivofijo.getcuentacontabledeprenormal_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableDepreNormalForeignKeyDescripcion((Long)value);
				sDescripcion=detallegrupoactivofijo.getcuentacontabledeprenormal_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableDepreGastoNormal")) {
			//sDescripcion=this.getActualCuentaContableDepreGastoNormalForeignKeyDescripcion((Long)value);
			if(!detallegrupoactivofijo.getIsNew() && !detallegrupoactivofijo.getIsChanged() && !detallegrupoactivofijo.getIsDeleted()) {
				sDescripcion=detallegrupoactivofijo.getcuentacontabledepregastonormal_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableDepreGastoNormalForeignKeyDescripcion((Long)value);
				sDescripcion=detallegrupoactivofijo.getcuentacontabledepregastonormal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleGrupoActivoFijo detallegrupoactivofijoRow=new DetalleGrupoActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallegrupoactivofijoRow=(DetalleGrupoActivoFijo) detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallegrupoactivofijoRow=(DetalleGrupoActivoFijo) detallegrupoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleActivoFijoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,DetalleGrupoActivoFijo detallegrupoactivofijo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo = (DetalleGrupoActivoFijo)this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.detallegrupoactivofijo = (DetalleGrupoActivoFijo)this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(detallegrupoactivofijo!=null) {
						this.detallegrupoactivofijo = detallegrupoactivofijo;
					} else {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}
				}

				if(this.isTienePermisosDetalleActivoFijo && this.permiteMantenimiento(this.detallegrupoactivofijo)) {
					DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup;
					} else {
						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame;
					}

					List<DetalleGrupoActivoFijo> detallegrupoactivofijos=new ArrayList<DetalleGrupoActivoFijo>();
					detallegrupoactivofijos.add(this.detallegrupoactivofijo);
					if(!esRelacionado) {
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setConGuardarRelaciones(false);
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cargarDetalleActivoFijoBeanSwingJInternalFrame(detallegrupoactivofijos,this.detallegrupoactivofijo,detalleactivofijoBeanSwingJInternalFrame,/*conInicializar,*/detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getConGuardarRelaciones(),detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado());
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("no_relacionado");

						detalleactivofijoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA + (DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleactivofijoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
						TitledBorder titledBorderDetalleActivoFijo=(TitledBorder)detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

						titledBorderDetalleActivoFijo.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Detalle Activo Fijo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleactivofijoBeanSwingJInternalFrame);
						}

						detalleactivofijoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleactivofijoBeanSwingJInternalFrame);

						detalleactivofijoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Activo Fijo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCuentaContaDetaGrupoActiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,DetalleGrupoActivoFijo detallegrupoactivofijo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo = (DetalleGrupoActivoFijo)this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.detallegrupoactivofijo = (DetalleGrupoActivoFijo)this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(detallegrupoactivofijo!=null) {
						this.detallegrupoactivofijo = detallegrupoactivofijo;
					} else {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}
				}

				if(this.isTienePermisosCuentaContaDetaGrupoActi && this.permiteMantenimiento(this.detallegrupoactivofijo)) {
					CuentaContaDetaGrupoActiBeanSwingJInternalFrame cuentacontadetagrupoactiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFramePopup=new CuentaContaDetaGrupoActiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuentacontadetagrupoactiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFramePopup;
					} else {
						cuentacontadetagrupoactiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame;
					}

					List<DetalleGrupoActivoFijo> detallegrupoactivofijos=new ArrayList<DetalleGrupoActivoFijo>();
					detallegrupoactivofijos.add(this.detallegrupoactivofijo);
					if(!esRelacionado) {
						//cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiSessionBean.setConGuardarRelaciones(false);
						//cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuentacontadetagrupoactiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cargarCuentaContaDetaGrupoActiBeanSwingJInternalFrame(detallegrupoactivofijos,this.detallegrupoactivofijo,cuentacontadetagrupoactiBeanSwingJInternalFrame,/*conInicializar,*/cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones(),cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
					cuentacontadetagrupoactiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuentacontadetagrupoactiBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContaDetaGrupoActi("no_relacionado");

						cuentacontadetagrupoactiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuentaContaDetaGrupoActiConstantesFunciones.ITAMANIOFILATABLA + (CuentaContaDetaGrupoActiConstantesFunciones.ITAMANIOFILATABLA/2));

						cuentacontadetagrupoactiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
						TitledBorder titledBorderCuentaContaDetaGrupoActi=(TitledBorder)cuentacontadetagrupoactiBeanSwingJInternalFrame.jScrollPanelDatosCuentaContaDetaGrupoActi.getBorder();

						titledBorderCuentaContaDetaGrupoActi.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Cuenta Conta Deta Grupo Acti");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontadetagrupoactiBeanSwingJInternalFrame);
						}

						cuentacontadetagrupoactiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuentacontadetagrupoactiBeanSwingJInternalFrame);

						cuentacontadetagrupoactiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuenta Conta Deta Grupo Acti",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSubGrupoActivoFijoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,DetalleGrupoActivoFijo detallegrupoactivofijo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo = (DetalleGrupoActivoFijo)this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.detallegrupoactivofijo = (DetalleGrupoActivoFijo)this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(detallegrupoactivofijo!=null) {
						this.detallegrupoactivofijo = detallegrupoactivofijo;
					} else {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}
				}

				if(this.isTienePermisosSubGrupoActivoFijo && this.permiteMantenimiento(this.detallegrupoactivofijo)) {
					SubGrupoActivoFijoBeanSwingJInternalFrame subgrupoactivofijoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFramePopup=new SubGrupoActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						subgrupoactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFramePopup;
					} else {
						subgrupoactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame;
					}

					List<DetalleGrupoActivoFijo> detallegrupoactivofijos=new ArrayList<DetalleGrupoActivoFijo>();
					detallegrupoactivofijos.add(this.detallegrupoactivofijo);
					if(!esRelacionado) {
						//subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoSessionBean.setConGuardarRelaciones(false);
						//subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					subgrupoactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cargarSubGrupoActivoFijoBeanSwingJInternalFrame(detallegrupoactivofijos,this.detallegrupoactivofijo,subgrupoactivofijoBeanSwingJInternalFrame,/*conInicializar,*/subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoSessionBean.getConGuardarRelaciones(),subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());
					subgrupoactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						subgrupoactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsSubGrupoActivoFijo("no_relacionado");

						subgrupoactivofijoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SubGrupoActivoFijoConstantesFunciones.ITAMANIOFILATABLA + (SubGrupoActivoFijoConstantesFunciones.ITAMANIOFILATABLA/2));

						subgrupoactivofijoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
						TitledBorder titledBorderSubGrupoActivoFijo=(TitledBorder)subgrupoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosSubGrupoActivoFijo.getBorder();

						titledBorderSubGrupoActivoFijo.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Sub Grupo Activo Fijo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,subgrupoactivofijoBeanSwingJInternalFrame);
						}

						subgrupoactivofijoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(subgrupoactivofijoBeanSwingJInternalFrame);

						subgrupoactivofijoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Sub Grupo Activo Fijo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonGastoDepreciacionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,DetalleGrupoActivoFijo detallegrupoactivofijo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo = (DetalleGrupoActivoFijo)this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.detallegrupoactivofijo = (DetalleGrupoActivoFijo)this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(detallegrupoactivofijo!=null) {
						this.detallegrupoactivofijo = detallegrupoactivofijo;
					} else {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}
				}

				if(this.isTienePermisosGastoDepreciacion && this.permiteMantenimiento(this.detallegrupoactivofijo)) {
					GastoDepreciacionBeanSwingJInternalFrame gastodepreciacionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFramePopup=new GastoDepreciacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						gastodepreciacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFramePopup;
					} else {
						gastodepreciacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame;
					}

					List<DetalleGrupoActivoFijo> detallegrupoactivofijos=new ArrayList<DetalleGrupoActivoFijo>();
					detallegrupoactivofijos.add(this.detallegrupoactivofijo);
					if(!esRelacionado) {
						//gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionSessionBean.setConGuardarRelaciones(false);
						//gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					gastodepreciacionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cargarGastoDepreciacionBeanSwingJInternalFrame(detallegrupoactivofijos,this.detallegrupoactivofijo,gastodepreciacionBeanSwingJInternalFrame,/*conInicializar,*/gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionSessionBean.getConGuardarRelaciones(),gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionSessionBean.getEsGuardarRelacionado());
					gastodepreciacionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						gastodepreciacionBeanSwingJInternalFrame.actualizarEstadoPanelsGastoDepreciacion("no_relacionado");

						gastodepreciacionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(GastoDepreciacionConstantesFunciones.ITAMANIOFILATABLA + (GastoDepreciacionConstantesFunciones.ITAMANIOFILATABLA/2));

						gastodepreciacionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
						TitledBorder titledBorderGastoDepreciacion=(TitledBorder)gastodepreciacionBeanSwingJInternalFrame.jScrollPanelDatosGastoDepreciacion.getBorder();

						titledBorderGastoDepreciacion.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Gasto Depreciacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,gastodepreciacionBeanSwingJInternalFrame);
						}

						gastodepreciacionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(gastodepreciacionBeanSwingJInternalFrame);

						gastodepreciacionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Gasto Depreciacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleGrupoActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo && this.isPermisoNuevoDetalleGrupoActivoFijo));			
			this.jButtonDuplicarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarDetalleGrupoActivoFijo && this.isPermisoDuplicarDetalleGrupoActivoFijo));			
			this.jButtonCopiarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarDetalleGrupoActivoFijo && this.isPermisoCopiarDetalleGrupoActivoFijo));
			this.jButtonVerFormDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormDetalleGrupoActivoFijo && this.isPermisoVerFormDetalleGrupoActivoFijo));
			
			this.jButtonAbrirOrderByDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDetalleGrupoActivoFijo && this.isPermisoOrdenDetalleGrupoActivoFijo));			
			
			this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo && this.isPermisoNuevoDetalleGrupoActivoFijo));			
			this.jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo && this.isPermisoNuevoDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo));
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonModificarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo && this.isPermisoActualizarDetalleGrupoActivoFijo));	
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonActualizarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo && this.isPermisoActualizarDetalleGrupoActivoFijo));	
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonEliminarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo && this.isPermisoEliminarDetalleGrupoActivoFijo));
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonCancelarDetalleGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo);							
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo && this.isPermisoNuevoDetalleGrupoActivoFijo));						
			this.jButtonDuplicarToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarDetalleGrupoActivoFijo && this.isPermisoDuplicarDetalleGrupoActivoFijo));						
			this.jButtonCopiarToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarDetalleGrupoActivoFijo && this.isPermisoCopiarDetalleGrupoActivoFijo));			
			this.jButtonVerFormToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormDetalleGrupoActivoFijo && this.isPermisoVerFormDetalleGrupoActivoFijo));			
			this.jButtonAbrirOrderByToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDetalleGrupoActivoFijo && this.isPermisoOrdenDetalleGrupoActivoFijo));
			this.jButtonNuevoRelacionesToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo && this.isPermisoNuevoDetalleGrupoActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo && this.isPermisoNuevoDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo));			
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonModificarToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo && this.isPermisoActualizarDetalleGrupoActivoFijo));	
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonActualizarToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo  && this.isPermisoActualizarDetalleGrupoActivoFijo));	
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonEliminarToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo && this.isPermisoEliminarDetalleGrupoActivoFijo));
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonCancelarToolBarDetalleGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo);				
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo && this.isPermisoNuevoDetalleGrupoActivoFijo));			
			this.jMenuItemDuplicarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarDetalleGrupoActivoFijo && this.isPermisoDuplicarDetalleGrupoActivoFijo));			
			this.jMenuItemCopiarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarDetalleGrupoActivoFijo && this.isPermisoCopiarDetalleGrupoActivoFijo));			
			this.jMenuItemVerFormDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormDetalleGrupoActivoFijo && this.isPermisoVerFormDetalleGrupoActivoFijo));			
			this.jMenuItemAbrirOrderByDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDetalleGrupoActivoFijo && this.isPermisoOrdenDetalleGrupoActivoFijo));			
			//this.jMenuItemMostrarOcultarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDetalleGrupoActivoFijo && this.isPermisoOrdenDetalleGrupoActivoFijo));
			this.jMenuItemDetalleAbrirOrderByDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDetalleGrupoActivoFijo && this.isPermisoOrdenDetalleGrupoActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDetalleGrupoActivoFijo && this.isPermisoOrdenDetalleGrupoActivoFijo));			
			this.jMenuItemNuevoRelacionesDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo && this.isPermisoNuevoDetalleGrupoActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo && this.isPermisoNuevoDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo));									
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemModificarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo && this.isPermisoActualizarDetalleGrupoActivoFijo));	
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemActualizarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo && this.isPermisoActualizarDetalleGrupoActivoFijo));	
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemEliminarDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo && this.isPermisoEliminarDetalleGrupoActivoFijo));
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemCancelarDetalleGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo));						
			this.jMenuItemGuardarCambiosTablaDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=this.jButtonNuevoDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleGrupoActivoFijo=this.jButtonDuplicarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarDetalleGrupoActivoFijo=this.jButtonCopiarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormDetalleGrupoActivoFijo=this.jButtonVerFormDetalleGrupoActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleGrupoActivoFijo=this.jButtonAbrirOrderByDetalleGrupoActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo=this.jButtonModificarDetalleGrupoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonActualizarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonEliminarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonCancelarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosDetalleGrupoActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=this.jButtonNuevoToolBarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=this.jButtonNuevoRelacionesToolBarDetalleGrupoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonModificarToolBarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonActualizarToolBarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonEliminarToolBarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonCancelarToolBarDetalleGrupoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=this.jButtonGuardarCambiosToolBarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=this.jButtonGuardarCambiosTablaToolBarDetalleGrupoActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=this.jMenuItemNuevoDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=this.jMenuItemNuevoRelacionesDetalleGrupoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemModificarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemActualizarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemEliminarDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemCancelarDetalleGrupoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=this.jMenuItemGuardarCambiosTablaDetalleGrupoActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleGrupoActivoFijo(Boolean esInicializar) {
		if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleGrupoActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleGrupoActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleGrupoActivoFijo() {
		this.jButtonNuevoDetalleGrupoActivoFijo.setVisible(this.isPermisoNuevoDetalleGrupoActivoFijo);			
		this.jButtonDuplicarDetalleGrupoActivoFijo.setVisible(this.isPermisoDuplicarDetalleGrupoActivoFijo);			
		this.jButtonCopiarDetalleGrupoActivoFijo.setVisible(this.isPermisoCopiarDetalleGrupoActivoFijo);			
		this.jButtonVerFormDetalleGrupoActivoFijo.setVisible(this.isPermisoVerFormDetalleGrupoActivoFijo);			
		
		this.jButtonAbrirOrderByDetalleGrupoActivoFijo.setVisible(this.isPermisoOrdenDetalleGrupoActivoFijo);					
		
		this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.setVisible(this.isPermisoNuevoDetalleGrupoActivoFijo);			
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonModificarDetalleGrupoActivoFijo.setVisible(this.isPermisoActualizarDetalleGrupoActivoFijo);	
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonActualizarDetalleGrupoActivoFijo.setVisible(this.isPermisoActualizarDetalleGrupoActivoFijo);	
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonEliminarDetalleGrupoActivoFijo.setVisible(this.isPermisoEliminarDetalleGrupoActivoFijo);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonCancelarDetalleGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo);						
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosDetalleGrupoActivoFijo.setVisible(this.isPermisoGuardarCambiosDetalleGrupoActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.setVisible(this.isPermisoActualizarDetalleGrupoActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleGrupoActivoFijo() {
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonModificarDetalleGrupoActivoFijo.setVisible(this.isPermisoActualizarDetalleGrupoActivoFijo);	
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonActualizarDetalleGrupoActivoFijo.setVisible(this.isPermisoActualizarDetalleGrupoActivoFijo);	
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonEliminarDetalleGrupoActivoFijo.setVisible(this.isPermisoEliminarDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonCancelarDetalleGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo);							
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosDetalleGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo && this.isPermisoGuardarCambiosDetalleGrupoActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleGrupoActivoFijo() {
		if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleGrupoActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleGrupoActivoFijo() {
	}
	
	public void jTableDatosDetalleGrupoActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleGrupoActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallegrupoactivofijo==null) {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
				}

				if(this.detallegrupoactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallegrupoactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleGrupoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleGrupoActivoFijo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleGrupoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleGrupoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallegrupoactivofijoLogic.getConnexion());

				if(this.detallegrupoactivofijo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallegrupoactivofijo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallegrupoactivofijo==null) {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
				}

				if(this.detallegrupoactivofijo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallegrupoactivofijo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoDetalleGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallegrupoactivofijo==null) {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
				}

				if(this.detallegrupoactivofijo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.detallegrupoactivofijo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDetalleGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallegrupoactivofijo==null) {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
				}

				if(this.detallegrupoactivofijo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.detallegrupoactivofijo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglasDetalleGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallegrupoactivofijo==null) {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
				}

				if(this.detallegrupoactivofijo.getsiglas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where siglas like '%"+this.detallegrupoactivofijo.getsiglas()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontablecostooriginalBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontablecostooriginalBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontablecostooriginalBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableCostoOriginal";

			if(!this.sFinalQueryGeneral_cuentacontablecostooriginal.equals("")) {
				this.cuentacontablecostooriginalBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontablecostooriginal);
				this.cuentacontablecostooriginalBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontablecostooriginalBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontablecostooriginalBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontablecostooriginalBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableCostoOriginal.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontablecostooriginalBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetalleGrupoActivoFijo=null;
			TitledBorder titledBordercuentacontablecostooriginal=null;

			if(!this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
				titledBordercuentacontablecostooriginal=(TitledBorder)this.cuentacontablecostooriginalBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecostooriginal.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecostooriginal=true;

			idTienePermisocuentacontablecostooriginal=this.tienePermisosUsuarioEnPaginaWebDetalleGrupoActivoFijo(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecostooriginal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleGrupoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleGrupoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);

				this.cuentacontablecostooriginalBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecostooriginalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecostooriginalBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.detallegrupoactivofijoLogic.getConnexion());

				if(this.detallegrupoactivofijo.getid_cuenta_contable_costo_original()!=null) {
					this.cuentacontablecostooriginalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecostooriginalBeanSwingJInternalFrame.setIdActual(this.detallegrupoactivofijo.getid_cuenta_contable_costo_original());
					this.cuentacontablecostooriginalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecostooriginalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecostooriginalBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecostooriginalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
				TitledBorder titledBordercuentacontablecostooriginal=(TitledBorder)this.cuentacontablecostooriginalBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecostooriginal.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallegrupoactivofijo==null) {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
				}

				if(this.detallegrupoactivofijo.getid_cuenta_contable_costo_original()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_costo_original = "+this.detallegrupoactivofijo.getid_cuenta_contable_costo_original().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontabledeprenormalBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontabledeprenormalBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontabledeprenormalBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableDepreNormal";

			if(!this.sFinalQueryGeneral_cuentacontabledeprenormal.equals("")) {
				this.cuentacontabledeprenormalBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontabledeprenormal);
				this.cuentacontabledeprenormalBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontabledeprenormalBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontabledeprenormalBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontabledeprenormalBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableDepreNormal.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontabledeprenormalBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetalleGrupoActivoFijo=null;
			TitledBorder titledBordercuentacontabledeprenormal=null;

			if(!this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
				titledBordercuentacontabledeprenormal=(TitledBorder)this.cuentacontabledeprenormalBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledeprenormal.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontabledeprenormal=true;

			idTienePermisocuentacontabledeprenormal=this.tienePermisosUsuarioEnPaginaWebDetalleGrupoActivoFijo(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontabledeprenormal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleGrupoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleGrupoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);

				this.cuentacontabledeprenormalBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontabledeprenormalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontabledeprenormalBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.detallegrupoactivofijoLogic.getConnexion());

				if(this.detallegrupoactivofijo.getid_cuenta_contable_depre_normal()!=null) {
					this.cuentacontabledeprenormalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontabledeprenormalBeanSwingJInternalFrame.setIdActual(this.detallegrupoactivofijo.getid_cuenta_contable_depre_normal());
					this.cuentacontabledeprenormalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontabledeprenormalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontabledeprenormalBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontabledeprenormalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
				TitledBorder titledBordercuentacontabledeprenormal=(TitledBorder)this.cuentacontabledeprenormalBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledeprenormal.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallegrupoactivofijo==null) {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
				}

				if(this.detallegrupoactivofijo.getid_cuenta_contable_depre_normal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_depre_normal = "+this.detallegrupoactivofijo.getid_cuenta_contable_depre_normal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontabledepregastonormalBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontabledepregastonormalBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontabledepregastonormalBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableDepreGastoNormal";

			if(!this.sFinalQueryGeneral_cuentacontabledepregastonormal.equals("")) {
				this.cuentacontabledepregastonormalBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontabledepregastonormal);
				this.cuentacontabledepregastonormalBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontabledepregastonormalBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontabledepregastonormalBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontabledepregastonormalBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableDepreGastoNormal.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontabledepregastonormalBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetalleGrupoActivoFijo=null;
			TitledBorder titledBordercuentacontabledepregastonormal=null;

			if(!this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
				titledBordercuentacontabledepregastonormal=(TitledBorder)this.cuentacontabledepregastonormalBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledepregastonormal.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontabledepregastonormal=true;

			idTienePermisocuentacontabledepregastonormal=this.tienePermisosUsuarioEnPaginaWebDetalleGrupoActivoFijo(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontabledepregastonormal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleGrupoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleGrupoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);

				this.cuentacontabledepregastonormalBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontabledepregastonormalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontabledepregastonormalBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.detallegrupoactivofijoLogic.getConnexion());

				if(this.detallegrupoactivofijo.getid_cuenta_contable_depre_gasto_normal()!=null) {
					this.cuentacontabledepregastonormalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontabledepregastonormalBeanSwingJInternalFrame.setIdActual(this.detallegrupoactivofijo.getid_cuenta_contable_depre_gasto_normal());
					this.cuentacontabledepregastonormalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontabledepregastonormalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontabledepregastonormalBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontabledepregastonormalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();
				TitledBorder titledBordercuentacontabledepregastonormal=(TitledBorder)this.cuentacontabledepregastonormalBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledepregastonormal.setTitle(titledBorderDetalleGrupoActivoFijo.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.getdetallegrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallegrupoactivofijo==null) {
						this.detallegrupoactivofijo = new DetalleGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);
				}

				if(this.detallegrupoactivofijo.getid_cuenta_contable_depre_gasto_normal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_depre_gasto_normal = "+this.detallegrupoactivofijo.getid_cuenta_contable_depre_gasto_normal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);

			this.getDetalleGrupoActivoFijosFK_IdCuentaContableCostoOriginal();

			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);

			//if(DetalleGrupoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);

			this.getDetalleGrupoActivoFijosFK_IdCuentaContableDepreGastoNormal();

			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);

			//if(DetalleGrupoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);

			this.getDetalleGrupoActivoFijosFK_IdCuentaContableDepreNormal();

			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);

			//if(DetalleGrupoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);

			this.getDetalleGrupoActivoFijosFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);

			//if(DetalleGrupoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallegrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleGrupoActivoFijo() {
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
		

		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.dispose();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionDetalleGrupoActivoFijo!=null) {
			this.jInternalFrameImportacionDetalleGrupoActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleGrupoActivoFijo.dispose();
			this.jInternalFrameImportacionDetalleGrupoActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleGrupoActivoFijo();
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleGrupoActivoFijo")) {
				jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleGrupoActivoFijo")) {
				jButtonDuplicarDetalleGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleGrupoActivoFijo")) {
				jButtonCopiarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleGrupoActivoFijo")) {
				jButtonVerFormDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleGrupoActivoFijo")) {
				jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleGrupoActivoFijo")) {
				jButtonDuplicarDetalleGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleGrupoActivoFijo")) {
				jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleGrupoActivoFijo")) {
				jButtonDuplicarDetalleGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleGrupoActivoFijo")) {
				jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleGrupoActivoFijo")) {
				jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleGrupoActivoFijo")) {
				jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleGrupoActivoFijo")) {
				jButtonModificarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleGrupoActivoFijo")) {
				jButtonModificarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleGrupoActivoFijo")) {
				jButtonModificarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleGrupoActivoFijo")) {
				jButtonActualizarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleGrupoActivoFijo")) {
				jButtonActualizarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleGrupoActivoFijo")) {
				jButtonActualizarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleGrupoActivoFijo")) {
				jButtonEliminarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleGrupoActivoFijo")) {
				jButtonEliminarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleGrupoActivoFijo")) {
				jButtonEliminarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleGrupoActivoFijo")) {
				jButtonCancelarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleGrupoActivoFijo")) {
				jButtonCancelarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleGrupoActivoFijo")) {
				jButtonCancelarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleGrupoActivoFijo")) {
				jButtonCerrarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleGrupoActivoFijo")) {
				jButtonCerrarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleGrupoActivoFijo")) {
				jButtonCerrarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleGrupoActivoFijo")) {
				jButtonMostrarOcultarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleGrupoActivoFijo")) {
				jButtonCancelarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleGrupoActivoFijo")) {
				jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleGrupoActivoFijo")) {
				jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleGrupoActivoFijo")) {
				jButtonCopiarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleGrupoActivoFijo")) {
				jButtonVerFormDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleGrupoActivoFijo")) {
				jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleGrupoActivoFijo")) {
				jButtonCopiarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleGrupoActivoFijo")) {
				jButtonVerFormDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleGrupoActivoFijo")) {
				jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleGrupoActivoFijo")) {
				jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleGrupoActivoFijo")) {
				jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleGrupoActivoFijo")) {
				jButtonRecargarInformacionDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleGrupoActivoFijo")) {
				jButtonRecargarInformacionDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleGrupoActivoFijo")) {
				jButtonRecargarInformacionDetalleGrupoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleGrupoActivoFijo")) {
				jButtonAnterioresDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleGrupoActivoFijo")) {
				jButtonAnterioresDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleGrupoActivoFijo")) {
				jButtonAnterioresDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleGrupoActivoFijo")) {
				jButtonSiguientesDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleGrupoActivoFijo")) {
				jButtonSiguientesDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleGrupoActivoFijo")) {
				jButtonSiguientesDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleGrupoActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleGrupoActivoFijo")) {
				jButtonAbrirOrderByDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleGrupoActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleGrupoActivoFijo")) {
				jButtonMostrarOcultarDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleGrupoActivoFijo")) {
				jButtonCerrarReporteDinamicoDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleGrupoActivoFijo")) {
				jButtonGenerarReporteDinamicoDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleGrupoActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleGrupoActivoFijo")) {
				jButtonCerrarImportacionDetalleGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleGrupoActivoFijo")) {
				
				jButtonGenerarImportacionDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleGrupoActivoFijo")) {
				
				jButtonAbrirImportacionDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleGrupoActivoFijo")) {
				jComboBoxTiposAccionesDetalleGrupoActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleGrupoActivoFijo")) {
				jComboBoxTiposRelacionesDetalleGrupoActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleGrupoActivoFijo")) {
				jComboBoxTiposAccionesDetalleGrupoActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleGrupoActivoFijo")) {
				
				jComboBoxTiposSeleccionarDetalleGrupoActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleGrupoActivoFijo")) {
				jTextFieldValorCampoGeneralDetalleGrupoActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleGrupoActivoFijo")) {
				jButtonAbrirOrderByDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleGrupoActivoFijo")) {
				jButtonAbrirOrderByDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleGrupoActivoFijo")) {
				jButtonCerrarOrderByDetalleGrupoActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonidDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleGrupoActivoFijoUpdate")) {
				this.jButtonid_empresaDetalleGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonid_empresaDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDetalleGrupoActivoFijoBusqueda")) {
				this.jButtoncodigoDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonnombreDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonsiglasDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_costo_originalDetalleGrupoActivoFijo")) {
				this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol")) {
				this.abrirFrameTreeCuentaContableCostoOriginal("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate")) {
				this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_normalDetalleGrupoActivoFijo")) {
				this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol")) {
				this.abrirFrameTreeCuentaContableDepreNormal("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate")) {
				this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo")) {
				this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol")) {
				this.abrirFrameTreeCuentaContableDepreGastoNormal("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate")) {
				this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contable_costo_originalDetalleGrupoActivoFijo")) {
				this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo")) {
				this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("id_cuenta_contable_depre_normalDetalleGrupoActivoFijo")) {
				this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo")) {
				this.jButtonFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo")) {
				this.jButtonFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo")) {
				this.jButtonFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			
			;
			
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleGrupoActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				


				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleGrupoActivoFijo detallegrupoactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallegrupoactivofijoLocal=this.detallegrupoactivofijo;
			} else {
				detallegrupoactivofijoLocal=this.detallegrupoactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
							
				
				


				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
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
			
			


			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
								
						
				


				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleGrupoActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
								
				
				


				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
							
				
				


				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleGrupoActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
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
			
			


			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
								
				
				


				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleGrupoActivoFijo")) {
					jCheckBoxSeleccionarTodosDetalleGrupoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleGrupoActivoFijo")) {
					jCheckBoxSeleccionadosDetalleGrupoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleGrupoActivoFijo")) {
					
				}
				
				


				
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
												
				
				


				
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
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
			
			


			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleGrupoActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleGrupoActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallegrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallegrupoactivofijo);
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
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
				
				


				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleGrupoActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallegrupoactivofijoAnterior =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleGrupoActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleGrupoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleGrupoActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallegrupoactivofijo =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallegrupoactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleGrupoActivoFijo")) {
				
				}
				
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleGrupoActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleGrupoActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleGrupoActivoFijo")) {
			
			}
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleGrupoActivoFijo();
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleGrupoActivoFijo")) {
				jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleGrupoActivoFijo")) {
				jButtonDuplicarDetalleGrupoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleGrupoActivoFijo")) {
				jButtonCopiarDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleGrupoActivoFijo")) {
				jButtonVerFormDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleGrupoActivoFijo")) {
				jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleGrupoActivoFijo")) {
				jButtonModificarDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleGrupoActivoFijo")) {
				jButtonActualizarDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleGrupoActivoFijo")) {
				jButtonEliminarDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleGrupoActivoFijo")) {
				jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleGrupoActivoFijo")) {
				jButtonCancelarDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleGrupoActivoFijo")) {
				jButtonCerrarDetalleGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleGrupoActivoFijo")) {
				jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleGrupoActivoFijo")) {
				jButtonAbrirOrderByDetalleGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleGrupoActivoFijo")) {
				jButtonRecargarInformacionDetalleGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleGrupoActivoFijo")) {
				jButtonAnterioresDetalleGrupoActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleGrupoActivoFijo")) {
				jButtonSiguientesDetalleGrupoActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonidDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleGrupoActivoFijoUpdate")) {
				this.jButtonid_empresaDetalleGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonid_empresaDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDetalleGrupoActivoFijoBusqueda")) {
				this.jButtoncodigoDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonnombreDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonsiglasDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_costo_originalDetalleGrupoActivoFijo")) {
				this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol")) {
				this.abrirFrameTreeCuentaContableCostoOriginal("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate")) {
				this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_normalDetalleGrupoActivoFijo")) {
				this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol")) {
				this.abrirFrameTreeCuentaContableDepreNormal("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate")) {
				this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo")) {
				this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol")) {
				this.abrirFrameTreeCuentaContableDepreGastoNormal("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate")) {
				this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda")) {
				this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleGrupoActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleGrupoActivoFijo")) {
				closingInternalFrameDetalleGrupoActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarDetalleGrupoActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleGrupoActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleGrupoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(DetalleGrupoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleGrupoActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleGrupoActivoFijoActionPerformed(null);
			}
			
			DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallegrupoactivofijo,new Object(),this.detallegrupoactivofijoParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleGrupoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleGrupoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleGrupoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallegrupoactivofijo)) {
			if(!esControlTabla) {
				if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);			
				}
				
				if(this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallegrupoactivofijoReturnGeneral=detallegrupoactivofijoLogic.procesarEventosDetalleGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos(),this.detallegrupoactivofijo,this.detallegrupoactivofijoParameterGeneral,this.isEsNuevoDetalleGrupoActivoFijo,classes);//this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleGrupoActivoFijo(this.detallegrupoactivofijoReturnGeneral,this.detallegrupoactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleGrupoActivoFijo(classes,this.detallegrupoactivofijoReturnGeneral,this.detallegrupoactivofijoBean,false);
					}
						
					if(this.detallegrupoactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleGrupoActivoFijo(this.detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleGrupoActivoFijo(this.detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo());	
					}
						
					if(this.detallegrupoactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleGrupoActivoFijo(this.detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo(),classes);//this.detallegrupoactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleGrupoActivoFijo(this.detallegrupoactivofijo,classes);//this.detallegrupoactivofijoBean);									
				}
			
				if(DetalleGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleGrupoActivoFijo(this.detallegrupoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleGrupoActivoFijo(this.detallegrupoactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallegrupoactivofijoAnterior!=null) {
						this.detallegrupoactivofijo=this.detallegrupoactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallegrupoactivofijoReturnGeneral=detallegrupoactivofijoLogic.procesarEventosDetalleGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos(),this.detallegrupoactivofijo,this.detallegrupoactivofijoParameterGeneral,this.isEsNuevoDetalleGrupoActivoFijo,classes);//this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo(),detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo(),this.detallegrupoactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleGrupoActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleGrupoActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleGrupoActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleGrupoActivoFijo() throws Exception {
		
		DetalleGrupoActivoFijoModel detallegrupoactivofijoModel=(DetalleGrupoActivoFijoModel)this.jTableDatosDetalleGrupoActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallegrupoactivofijoModel.detallegrupoactivofijos=this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallegrupoactivofijoModel.detallegrupoactivofijos=this.detallegrupoactivofijos;
		}
		
		
		((DetalleGrupoActivoFijoModel) this.jTableDatosDetalleGrupoActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleGrupoActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallegrupoactivofijoAnterior(),this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallegrupoactivofijoAnterior(),this.detallegrupoactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleGrupoActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(detallegrupoactivofijo.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContaDetaGrupoActi.class)) {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(detallegrupoactivofijo.getCuentaContaDetaGrupoActis());
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubGrupoActivoFijo.class)) {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.setSubGrupoActivoFijos(detallegrupoactivofijo.getSubGrupoActivoFijos());
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GastoDepreciacion.class)) {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.setGastoDepreciacions(detallegrupoactivofijo.getGastoDepreciacions());
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGastoDepreciacion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
										
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallegrupoactivofijo,new Object(),generalEntityParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleGrupoActivoFijoConstantesFunciones.getClassesRelationshipsOfDetalleGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleGrupoActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleGrupoActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleGrupoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallegrupoactivofijo,new Object(),generalEntityParameterGeneral,this.detallegrupoactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleGrupoActivoFijo(DetalleGrupoActivoFijoBean detallegrupoactivofijoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(detallegrupoactivofijo.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContaDetaGrupoActi.class)) {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.setCuentaContaDetaGrupoActis(detallegrupoactivofijo.getCuentaContaDetaGrupoActis());
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubGrupoActivoFijo.class)) {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.setSubGrupoActivoFijos(detallegrupoactivofijo.getSubGrupoActivoFijos());
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GastoDepreciacion.class)) {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.setGastoDepreciacions(detallegrupoactivofijo.getGastoDepreciacions());
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGastoDepreciacion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleGrupoActivoFijo(ArrayList<Classe> classes,DetalleGrupoActivoFijoReturnGeneral detallegrupoactivofijoReturnGeneral,DetalleGrupoActivoFijoBean detallegrupoactivofijoBean,Boolean conDefault) throws Exception {
		
			this.detallegrupoactivofijoBean.setDetalleActivoFijos(detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo().getDetalleActivoFijos());
			this.detallegrupoactivofijoBean.setCuentaContaDetaGrupoActis(detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo().getCuentaContaDetaGrupoActis());
			this.detallegrupoactivofijoBean.setSubGrupoActivoFijos(detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo().getSubGrupoActivoFijos());
			this.detallegrupoactivofijoBean.setGastoDepreciacions(detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo().getGastoDepreciacions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					detallegrupoactivofijo.setDetalleActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContaDetaGrupoActi.class)) {
					detallegrupoactivofijo.setCuentaContaDetaGrupoActis(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiLogic.getCuentaContaDetaGrupoActis());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SubGrupoActivoFijo.class)) {
					detallegrupoactivofijo.setSubGrupoActivoFijos(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoLogic.getSubGrupoActivoFijos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(GastoDepreciacion.class)) {
					detallegrupoactivofijo.setGastoDepreciacions(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionLogic.getGastoDepreciacions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.detallegrupoactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo = new DetalleGrupoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones(),this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detallegrupoactivofijoLogic=this.detallegrupoactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyDetalleGrupoActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleGrupoActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleGrupoActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleGrupoActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleGrupoActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleGrupoActivoFijo"));
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonModificarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarDetalleGrupoActivoFijo"));

		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonModificarToolBarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleGrupoActivoFijo"));
					
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemModificarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonActualizarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarDetalleGrupoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonActualizarToolBarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleGrupoActivoFijo"));
						
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemActualizarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonEliminarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarDetalleGrupoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonEliminarToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleGrupoActivoFijo"));
								
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemEliminarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonCancelarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarDetalleGrupoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonCancelarToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleGrupoActivoFijo"));
					
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemCancelarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleGrupoActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemDetalleCerrarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleGrupoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleGrupoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleGrupoActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonidDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_empresaDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_empresaDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtoncodigoDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetalleGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonnombreDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonsiglasDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"siglasDetalleGrupoActivoFijoBusqueda"));
		//jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijo"));
		//jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCostoOriginal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda"));
		//jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijo"));
		//jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDepreNormal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda"));
		//jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo"));
		//jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDepreGastoNormal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleGrupoActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleGrupoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleGrupoActivoFijo"));
		}
		
		this.jTableDatosDetalleGrupoActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleGrupoActivoFijo"));
		
		this.jTableDatosDetalleGrupoActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleGrupoActivoFijo"));
		
		this.jButtonNuevoDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoDetalleGrupoActivoFijo"));
		
		this.jButtonDuplicarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarDetalleGrupoActivoFijo"));
		
		this.jButtonCopiarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarDetalleGrupoActivoFijo"));
		
		this.jButtonVerFormDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormDetalleGrupoActivoFijo"));
		
		
		this.jButtonNuevoToolBarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleGrupoActivoFijo"));
			
		this.jButtonDuplicarToolBarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleGrupoActivoFijo"));
			
		this.jMenuItemNuevoDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleGrupoActivoFijo"));
			
		this.jMenuItemDuplicarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleGrupoActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleGrupoActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleGrupoActivoFijo"));
			
		this.jMenuItemNuevoRelacionesDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleGrupoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonModificarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarDetalleGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonModificarToolBarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleGrupoActivoFijo"));
			
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemModificarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonActualizarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarDetalleGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonActualizarToolBarDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleGrupoActivoFijo"));
				
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemActualizarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonEliminarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarDetalleGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonEliminarToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleGrupoActivoFijo"));
						
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemEliminarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonCancelarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarDetalleGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonCancelarToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleGrupoActivoFijo"));
			
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemCancelarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleGrupoActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleGrupoActivoFijo"));		
		
		
		this.jButtonCerrarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarDetalleGrupoActivoFijo"));
		
		
		this.jButtonCerrarToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleGrupoActivoFijo"));
			
		this.jMenuItemCerrarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleGrupoActivoFijo"));
			
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jMenuItemDetalleCerrarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleGrupoActivoFijo"));
		}
		
		this.jButtonCopiarToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleGrupoActivoFijo"));
			
		this.jButtonVerFormToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleGrupoActivoFijo"));
		
		this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleGrupoActivoFijo"));
			
		this.jMenuItemCopiarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleGrupoActivoFijo"));		
		
		this.jMenuItemVerFormDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleGrupoActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleGrupoActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleGrupoActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleGrupoActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleGrupoActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleGrupoActivoFijo"));
		
		this.jMenuItemRecargarInformacionDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleGrupoActivoFijo"));		
		
		
		
		this.jButtonAnterioresDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresDetalleGrupoActivoFijo"));
		
		
		this.jButtonAnterioresToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleGrupoActivoFijo"));
		
		this.jMenuItemAnterioresDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleGrupoActivoFijo"));		
		
		
		this.jButtonSiguientesDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesDetalleGrupoActivoFijo"));
		
		
		this.jButtonSiguientesToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleGrupoActivoFijo"));
			
		this.jMenuItemSiguientesDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleGrupoActivoFijo"));
			
		this.jMenuItemAbrirOrderByDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleGrupoActivoFijo"));
			
		this.jMenuItemMostrarOcultarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleGrupoActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleGrupoActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleGrupoActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleGrupoActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleGrupoActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleGrupoActivoFijo"));

		this.jCheckBoxSeleccionadosDetalleGrupoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleGrupoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleGrupoActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleGrupoActivoFijo"));
			
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleGrupoActivoFijo"));
					
		this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleGrupoActivoFijo"));
			
		this.jTextFieldValorCampoGeneralDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleGrupoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonidDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_empresaDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_empresaDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtoncodigoDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetalleGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonnombreDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonsiglasDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"siglasDetalleGrupoActivoFijoBusqueda"));
		//jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijo"));
		//jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCostoOriginal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda"));
		//jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijo"));
		//jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDepreNormal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda"));
		//jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo"));
		//jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDepreGastoNormal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo"));

			this.jButtonBuscarFK_IdCuentaContableCostoOriginalid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijo"));

			this.jButtonFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo"));

			this.jButtonBuscarFK_IdCuentaContableDepreGastoNormalid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo"));

			this.jButtonFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo"));

			this.jButtonBuscarFK_IdCuentaContableDepreNormalid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoDetalleGrupoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleGrupoActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleGrupoActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleGrupoActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleGrupoActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleGrupoActivoFijo!=null) {
				this.jInternalFrameImportacionDetalleGrupoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleGrupoActivoFijo"));
				this.jInternalFrameImportacionDetalleGrupoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleGrupoActivoFijo"));
				this.jInternalFrameImportacionDetalleGrupoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleGrupoActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleGrupoActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarDetalleGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleGrupoActivoFijo"));			
			
			if(this.jInternalFrameOrderByDetalleGrupoActivoFijo!=null) {
				this.jInternalFrameOrderByDetalleGrupoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleGrupoActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTabbedPaneRelacionesDetalleGrupoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleGrupoActivoFijo"));
		
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
            		closingInternalFrameDetalleGrupoActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleGrupoActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            DetalleGrupoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(DetalleGrupoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleGrupoActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleGrupoActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleGrupoActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleGrupoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleGrupoActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleGrupoActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleGrupoActivoFijo";
		inputMap = this.jButtonNuevoDetalleGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleGrupoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleGrupoActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleGrupoActivoFijo";
		inputMap = this.jButtonModificarDetalleGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleGrupoActivoFijo";
		inputMap = this.jButtonActualizarDetalleGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleGrupoActivoFijo";
		inputMap = this.jButtonEliminarDetalleGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleGrupoActivoFijo";
		inputMap = this.jButtonCancelarDetalleGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleGrupoActivoFijo";
		inputMap = this.jButtonCerrarDetalleGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleGrupoActivoFijo";
		inputMap = this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosDetalleGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonGuardarCambiosDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleGrupoActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleGrupoActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleGrupoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleGrupoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleGrupoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleGrupoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonidDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_empresaDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_empresaDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtoncodigoDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetalleGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonnombreDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonsiglasDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"siglasDetalleGrupoActivoFijoBusqueda"));
		//jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijo"));
		//jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCostoOriginal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda"));
		//jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijo"));
		//jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDepreNormal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda"));
		//jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo"));
		//jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDepreGastoNormal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo"));

		this.jButtonBuscarFK_IdCuentaContableCostoOriginalid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijo"));

		this.jButtonFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo"));

		this.jButtonBuscarFK_IdCuentaContableDepreGastoNormalid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo"));

		this.jButtonFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo"));

		this.jButtonBuscarFK_IdCuentaContableDepreNormalid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleGrupoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleGrupoActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleGrupoActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
					detallegrupoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijos) {
					detallegrupoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleGrupoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
						detallegrupoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijos) {
						detallegrupoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleGrupoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleGrupoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleGrupoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleGrupoActivoFijo.getSelectedRows();
			
			DetalleGrupoActivoFijo detallegrupoactivofijoLocal=new DetalleGrupoActivoFijo();
			
			//this.seleccionarTodosDetalleGrupoActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallegrupoactivofijoLocal =(DetalleGrupoActivoFijo) this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos().toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallegrupoactivofijoLocal =(DetalleGrupoActivoFijo) this.detallegrupoactivofijos.toArray()[this.jTableDatosDetalleGrupoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallegrupoactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
						detallegrupoactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijos) {
						detallegrupoactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleGrupoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleGrupoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleGrupoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleGrupoActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleGrupoActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleGrupoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleGrupoActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
				
						if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							detallegrupoactivofijoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detallegrupoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							detallegrupoactivofijoAux.setsiglas(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijos) {
					
						if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							detallegrupoactivofijoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detallegrupoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							detallegrupoactivofijoAux.setsiglas(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleGrupoActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleGrupoActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleGrupoActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleGrupoActivoFijo(conSplash);
				
					this.generarReporteDetalleGrupoActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleGrupoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleGrupoActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleGrupoActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleGrupoActivoFijo();
				
				this.exportarDetalleGrupoActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleGrupoActivoFijos();
				//this.importarDetalleGrupoActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleGrupoActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleGrupoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Grupo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleGrupoActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleGrupoActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleGrupoActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleGrupoActivoFijoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleGrupoActivoFijo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleGrupoActivoFijo(conSplash);
					
						//this.actualizarParametrosGeneralDetalleGrupoActivoFijo();
						
						this.generarReporteProcesoAccionDetalleGrupoActivoFijosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Grupo Activo FijoS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Grupo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleGrupoActivoFijo();
				
						this.actualizarParametrosGeneralDetalleGrupoActivoFijo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallegrupoactivofijoReturnGeneral=detallegrupoactivofijoLogic.procesarAccionDetalleGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos(),this.detallegrupoactivofijoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleGrupoActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleGrupoActivoFijo();
					
					DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleGrupoActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleGrupoActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleGrupoActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleGrupoActivoFijo();
			
			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();		
			DetalleGrupoActivoFijo detallegrupoactivofijo=new DetalleGrupoActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo.getSelectedItem();
			
			
			
			
			detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallegrupoactivofijosSeleccionados.size()==1) {
				for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosSeleccionados) {
					detallegrupoactivofijo=detallegrupoactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Activo Fijo")) {
					jButtonDetalleActivoFijoActionPerformed(null,rowIndex,true,false,detallegrupoactivofijo);
				}
				else if(this.sTipoRelacion.equals("Cuenta Conta Deta Grupo Acti")) {
					jButtonCuentaContaDetaGrupoActiActionPerformed(null,rowIndex,true,false,detallegrupoactivofijo);
				}
				else if(this.sTipoRelacion.equals("Sub Grupo Activo Fijo")) {
					jButtonSubGrupoActivoFijoActionPerformed(null,rowIndex,true,false,detallegrupoactivofijo);
				}
				else if(this.sTipoRelacion.equals("Gasto Depreciacion")) {
					jButtonGastoDepreciacionActionPerformed(null,rowIndex,true,false,detallegrupoactivofijo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleGrupoActivoFijo();
			
      		//this.finishProcessDetalleGrupoActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleGrupoActivoFijoReturnGeneral() throws Exception {
		if(this.detallegrupoactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallegrupoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallegrupoactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallegrupoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallegrupoactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallegrupoactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
		}
		
		if(this.detallegrupoactivofijoReturnGeneral.getConRetornoLista() || this.detallegrupoactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.detallegrupoactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallegrupoactivofijoLogic.setDetalleGrupoActivoFijos(this.detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detallegrupoactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallegrupoactivofijoLogic.setDetalleGrupoActivoFijo(this.detallegrupoactivofijoReturnGeneral.getDetalleGrupoActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleGrupoActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleGrupoActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<DetalleGrupoActivoFijo> getDetalleGrupoActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleGrupoActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos()) {
					if(detallegrupoactivofijoAux.getIsSelected()) {
						detallegrupoactivofijosSeleccionados.add(detallegrupoactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:this.detallegrupoactivofijos) {
					if(detallegrupoactivofijoAux.getIsSelected()) {
						detallegrupoactivofijosSeleccionados.add(detallegrupoactivofijoAux);				
					}
				}
			}
			
			if(detallegrupoactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallegrupoactivofijosSeleccionados.addAll(this.detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallegrupoactivofijosSeleccionados.addAll(this.detallegrupoactivofijos);				
					}
				}
			}
		} else {
			detallegrupoactivofijosSeleccionados.add(this.detallegrupoactivofijo);
		}
		
		return detallegrupoactivofijosSeleccionados;
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
	
	public void generarReporteDetalleGrupoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleGrupoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleGrupoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleGrupoActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleGrupoActivoFijosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesDetalleGrupoActivoFijosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Grupo Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();		
		
		detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleGrupoActivoFijos("Todos",detallegrupoactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();		
		
		detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleGrupoActivoFijos("Todos",detallegrupoactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleGrupoActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();
		
		detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleGrupoActivoFijos("Todos",detallegrupoactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleGrupoActivoFijo();
		
		
		detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleGrupoActivoFijo();
		
		
		//this.generarReporteDetalleGrupoActivoFijos("Todos",detallegrupoactivofijosSeleccionados ,detallegrupoactivofijoImplementable,detallegrupoactivofijoImplementableHome);
	}
	
	public void mostrarImportacionDetalleGrupoActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleGrupoActivoFijo();
		
		this.abrirFrameImportacionDetalleGrupoActivoFijo();		
		
			
		//this.generarReporteDetalleGrupoActivoFijos("Todos",detallegrupoactivofijosSeleccionados ,detallegrupoactivofijoImplementable,detallegrupoactivofijoImplementableHome);
	}
	
	public void importarDetalleGrupoActivoFijos() throws Exception {		
	
	}
	
	public void exportarDetalleGrupoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleGrupoActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleGrupoActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleGrupoActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Grupo Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();		
		
		detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallegrupoactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleGrupoActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleGrupoActivoFijo(detallegrupoactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallegrupoactivofijoAux.setsDetalleGeneralEntityReporte(detallegrupoactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleGrupoActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleGrupoActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleGrupoActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallegrupoactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallegrupoactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallegrupoactivofijo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallegrupoactivofijo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallegrupoactivofijo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallegrupoactivofijo.getsiglas();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallegrupoactivofijo.getcuentacontablecostooriginal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallegrupoactivofijo.getcuentacontabledeprenormal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallegrupoactivofijo.getcuentacontabledepregastonormal_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();		
		
		detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallegrupoactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleGrupoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleGrupoActivoFijo(row);				
				iRow++;
			}				
			
			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleGrupoActivoFijo(detallegrupoactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();		
		
		detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallegrupoactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallegrupoactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallegrupoactivofijo");
			//elementRoot.appendChild(element);
		
			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosSeleccionados) {
				element = document.createElement("detallegrupoactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleGrupoActivoFijo(detallegrupoactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleGrupoActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallegrupoactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallegrupoactivofijo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallegrupoactivofijo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(detallegrupoactivofijo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(detallegrupoactivofijo.getsiglas());
		cell = row.createCell(iColumn++);cell.setCellValue(detallegrupoactivofijo.getcuentacontablecostooriginal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallegrupoactivofijo.getcuentacontabledeprenormal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallegrupoactivofijo.getcuentacontabledepregastonormal_descripcion());				
	}
	
	public void setFilaDatosExportarXmlDetalleGrupoActivoFijo(DetalleGrupoActivoFijo detallegrupoactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleGrupoActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallegrupoactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleGrupoActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallegrupoactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetalleGrupoActivoFijoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallegrupoactivofijo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(DetalleGrupoActivoFijoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(detallegrupoactivofijo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(DetalleGrupoActivoFijoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(detallegrupoactivofijo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsiglas = document.createElement(DetalleGrupoActivoFijoConstantesFunciones.SIGLAS);
		elementsiglas.appendChild(document.createTextNode(detallegrupoactivofijo.getsiglas().trim()));
		element.appendChild(elementsiglas);

		Element elementcuentacontablecostooriginal_descripcion = document.createElement(DetalleGrupoActivoFijoConstantesFunciones.IDCUENTACONTABLECOSTOORIGINAL);
		elementcuentacontablecostooriginal_descripcion.appendChild(document.createTextNode(detallegrupoactivofijo.getcuentacontablecostooriginal_descripcion()));
		element.appendChild(elementcuentacontablecostooriginal_descripcion);

		Element elementcuentacontabledeprenormal_descripcion = document.createElement(DetalleGrupoActivoFijoConstantesFunciones.IDCUENTACONTABLEDEPRENORMAL);
		elementcuentacontabledeprenormal_descripcion.appendChild(document.createTextNode(detallegrupoactivofijo.getcuentacontabledeprenormal_descripcion()));
		element.appendChild(elementcuentacontabledeprenormal_descripcion);

		Element elementcuentacontabledepregastonormal_descripcion = document.createElement(DetalleGrupoActivoFijoConstantesFunciones.IDCUENTACONTABLEDEPREGASTONORMAL);
		elementcuentacontabledepregastonormal_descripcion.appendChild(document.createTextNode(detallegrupoactivofijo.getcuentacontabledepregastonormal_descripcion()));
		element.appendChild(elementcuentacontabledepregastonormal_descripcion);
	}
	
	public void generarReporteGroupGenericoDetalleGrupoActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados=new ArrayList<DetalleGrupoActivoFijo>();
		
		detallegrupoactivofijosSeleccionados=this.getDetalleGrupoActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleGrupoActivoFijo(detallegrupoactivofijosSeleccionados);
		
		this.generarReporteDetalleGrupoActivoFijos("Todos",detallegrupoactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleGrupoActivoFijo(ArrayList<DetalleGrupoActivoFijo> detallegrupoactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosSeleccionados) {
				detallegrupoactivofijoAux.setsDetalleGeneralEntityReporte(detallegrupoactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallegrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(detallegrupoactivofijoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					detallegrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(detallegrupoactivofijoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					detallegrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(detallegrupoactivofijoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS)) {
					existe=true;
					detallegrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(detallegrupoactivofijoAux.getsiglas());
				}
				 else if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL)) {
					existe=true;
					detallegrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(detallegrupoactivofijoAux.getcuentacontablecostooriginal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL)) {
					existe=true;
					detallegrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(detallegrupoactivofijoAux.getcuentacontabledeprenormal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL)) {
					existe=true;
					detallegrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(detallegrupoactivofijoAux.getcuentacontabledepregastonormal_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleGrupoActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarDetalleGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleGrupoActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsDetalleGrupoActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleGrupoActivoFijo=false;
			//this.isVisibilidadCeldaVerFormDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarDetalleGrupoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=false;												
			}
			
			this.jButtonCerrarDetalleGrupoActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleGrupoActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.detallegrupoactivofijo)) {
			this.isVisibilidadCeldaActualizarDetalleGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarDetalleGrupoActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleGrupoActivoFijo() {
		this.isVisibilidadCeldaNuevoDetalleGrupoActivoFijo=false;
		this.isVisibilidadCeldaGuardarCambiosDetalleGrupoActivoFijo=false;
	}
	
	public void actualizarEstadoPanelsDetalleGrupoActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosDetalleGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleGrupoActivoFijo!=null) {
				this.jPanelPaginacionDetalleGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesDetalleGrupoActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosDetalleGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleGrupoActivoFijo!=null) {
				this.jPanelPaginacionDetalleGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesDetalleGrupoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosDetalleGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleGrupoActivoFijo!=null) {
				this.jPanelPaginacionDetalleGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesDetalleGrupoActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosDetalleGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleGrupoActivoFijo!=null) {
				this.jPanelPaginacionDetalleGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesDetalleGrupoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosDetalleGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleGrupoActivoFijo!=null) {
				this.jPanelPaginacionDetalleGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesDetalleGrupoActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosDetalleGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleGrupoActivoFijo!=null) {
				this.jPanelPaginacionDetalleGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesDetalleGrupoActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleGrupoActivoFijo!=null) {
				this.jScrollPanelDatosDetalleGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleGrupoActivoFijo!=null) {
				this.jPanelPaginacionDetalleGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesDetalleGrupoActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo!=null) {
					this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesDetalleGrupoActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesDetalleGrupoActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCuentaContableCostoOriginal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCostoOriginal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);}

			this.isVisibilidadFK_IdCuentaContableDepreGastoNormal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDepreGastoNormal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);}

			this.isVisibilidadFK_IdCuentaContableDepreNormal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDepreNormal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCostoOriginal(Boolean isParaCuentaContableCostoOriginal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCostoOriginalNegation=!isParaCuentaContableCostoOriginal;

			this.isVisibilidadFK_IdCuentaContableCostoOriginal=isParaCuentaContableCostoOriginal;
			if(!this.isVisibilidadFK_IdCuentaContableCostoOriginal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);}

			this.isVisibilidadFK_IdCuentaContableDepreGastoNormal=isParaCuentaContableCostoOriginalNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDepreGastoNormal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);}

			this.isVisibilidadFK_IdCuentaContableDepreNormal=isParaCuentaContableCostoOriginalNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDepreNormal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableDepreNormal(Boolean isParaCuentaContableDepreNormal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableDepreNormalNegation=!isParaCuentaContableDepreNormal;

			this.isVisibilidadFK_IdCuentaContableCostoOriginal=isParaCuentaContableDepreNormalNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCostoOriginal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);}

			this.isVisibilidadFK_IdCuentaContableDepreGastoNormal=isParaCuentaContableDepreNormalNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDepreGastoNormal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);}

			this.isVisibilidadFK_IdCuentaContableDepreNormal=isParaCuentaContableDepreNormal;
			if(!this.isVisibilidadFK_IdCuentaContableDepreNormal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableDepreGastoNormal(Boolean isParaCuentaContableDepreGastoNormal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableDepreGastoNormalNegation=!isParaCuentaContableDepreGastoNormal;

			this.isVisibilidadFK_IdCuentaContableCostoOriginal=isParaCuentaContableDepreGastoNormalNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCostoOriginal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);}

			this.isVisibilidadFK_IdCuentaContableDepreGastoNormal=isParaCuentaContableDepreGastoNormal;
			if(!this.isVisibilidadFK_IdCuentaContableDepreGastoNormal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);}

			this.isVisibilidadFK_IdCuentaContableDepreNormal=isParaCuentaContableDepreGastoNormalNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDepreNormal) {this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);}
		}
		
	}
	
	

	public String registrarSesionDetalleGrupoActivoFijoParaDetalleActivoFijos() throws Exception {
		Boolean isPaginaPopupDetalleActivoFijo=false;

		try {

			if(this.detallegrupoactivofijoSessionBean==null) {
				this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoSessionBean==null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
			}

			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoSessionBean.setsPathNavegacionActual(detallegrupoactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(true);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(DetalleGrupoActivoFijoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(true);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.detalleactivofijoSessionBean.setlidDetalleGrupoActivoFijoActual(this.idDetalleGrupoActivoFijoActual);

			detallegrupoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo(true);
			detallegrupoactivofijoSessionBean.setlIdDetalleGrupoActivoFijoActualForeignKey(this.idDetalleGrupoActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionDetalleGrupoActivoFijoParaCuentaContaDetaGrupoActis() throws Exception {
		Boolean isPaginaPopupCuentaContaDetaGrupoActi=false;

		try {

			if(this.detallegrupoactivofijoSessionBean==null) {
				this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiSessionBean==null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
			}

			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiSessionBean.setsPathNavegacionActual(detallegrupoactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuentaContaDetaGrupoActi=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi(true);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaDetaGrupoActi(DetalleGrupoActivoFijoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiSessionBean.setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(true);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.cuentacontadetagrupoactiSessionBean.setlidDetalleGrupoActivoFijoActual(this.idDetalleGrupoActivoFijoActual);

			detallegrupoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo(true);
			detallegrupoactivofijoSessionBean.setlIdDetalleGrupoActivoFijoActualForeignKey(this.idDetalleGrupoActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionDetalleGrupoActivoFijoParaSubGrupoActivoFijos() throws Exception {
		Boolean isPaginaPopupSubGrupoActivoFijo=false;

		try {

			if(this.detallegrupoactivofijoSessionBean==null) {
				this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoSessionBean==null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
			}

			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoSessionBean.setsPathNavegacionActual(detallegrupoactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSubGrupoActivoFijo=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSubGrupoActivoFijo(true);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSubGrupoActivoFijo(DetalleGrupoActivoFijoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(true);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.subgrupoactivofijoSessionBean.setlidDetalleGrupoActivoFijoActual(this.idDetalleGrupoActivoFijoActual);

			detallegrupoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo(true);
			detallegrupoactivofijoSessionBean.setlIdDetalleGrupoActivoFijoActualForeignKey(this.idDetalleGrupoActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionDetalleGrupoActivoFijoParaGastoDepreciaciones() throws Exception {
		Boolean isPaginaPopupGastoDepreciacion=false;

		try {

			if(this.detallegrupoactivofijoSessionBean==null) {
				this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionSessionBean==null) {
				this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
			}

			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionSessionBean.setsPathNavegacionActual(detallegrupoactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupGastoDepreciacion=this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeGastoDepreciacion(true);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeGastoDepreciacion(DetalleGrupoActivoFijoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionSessionBean.setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(true);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.gastodepreciacionSessionBean.setlidDetalleGrupoActivoFijoActual(this.idDetalleGrupoActivoFijoActual);

			detallegrupoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo(true);
			detallegrupoactivofijoSessionBean.setlIdDetalleGrupoActivoFijoActualForeignKey(this.idDetalleGrupoActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionDetalleGrupoActivoFijoParaBusquedaCuentaContableCostoOriginals() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(detallegrupoactivofijoSessionBean==null) {
				detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(cuentacontablecostooriginalSessionBean==null) {
				cuentacontablecostooriginalSessionBean=new CuentaContableSessionBean();
			}

			cuentacontablecostooriginalSessionBean.setsPathNavegacionActual(detallegrupoactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontablecostooriginalSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontablecostooriginalSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontablecostooriginalSessionBean.getisPaginaPopup();
			cuentacontablecostooriginalSessionBean.setisPaginaPopup(false);
			cuentacontablecostooriginalSessionBean.setEstaModoBusqueda(true);
			cuentacontablecostooriginalSessionBean.setsFuncionBusquedaRapida("window.opener.detallegrupoactivofijoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_costo_original(TO_REPLACE);");
			cuentacontablecostooriginalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontablecostooriginalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(DetalleGrupoActivoFijoConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(true);
			//cuentacontableSessionBean.setlidDetalleGrupoActivoFijoActual(this.idDetalleGrupoActivoFijoActual);

			detallegrupoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo(true);
			detallegrupoactivofijoSessionBean.setlIdDetalleGrupoActivoFijoActualForeignKey(this.idDetalleGrupoActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionDetalleGrupoActivoFijoParaBusquedaCuentaContableDepreNormals() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(detallegrupoactivofijoSessionBean==null) {
				detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(cuentacontabledeprenormalSessionBean==null) {
				cuentacontabledeprenormalSessionBean=new CuentaContableSessionBean();
			}

			cuentacontabledeprenormalSessionBean.setsPathNavegacionActual(detallegrupoactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontabledeprenormalSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontabledeprenormalSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontabledeprenormalSessionBean.getisPaginaPopup();
			cuentacontabledeprenormalSessionBean.setisPaginaPopup(false);
			cuentacontabledeprenormalSessionBean.setEstaModoBusqueda(true);
			cuentacontabledeprenormalSessionBean.setsFuncionBusquedaRapida("window.opener.detallegrupoactivofijoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_depre_normal(TO_REPLACE);");
			cuentacontabledeprenormalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontabledeprenormalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(DetalleGrupoActivoFijoConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(true);
			//cuentacontableSessionBean.setlidDetalleGrupoActivoFijoActual(this.idDetalleGrupoActivoFijoActual);

			detallegrupoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo(true);
			detallegrupoactivofijoSessionBean.setlIdDetalleGrupoActivoFijoActualForeignKey(this.idDetalleGrupoActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionDetalleGrupoActivoFijoParaBusquedaCuentaContableDepreGastoNormals() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(detallegrupoactivofijoSessionBean==null) {
				detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
			}

			if(cuentacontabledepregastonormalSessionBean==null) {
				cuentacontabledepregastonormalSessionBean=new CuentaContableSessionBean();
			}

			cuentacontabledepregastonormalSessionBean.setsPathNavegacionActual(detallegrupoactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontabledepregastonormalSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontabledepregastonormalSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontabledepregastonormalSessionBean.getisPaginaPopup();
			cuentacontabledepregastonormalSessionBean.setisPaginaPopup(false);
			cuentacontabledepregastonormalSessionBean.setEstaModoBusqueda(true);
			cuentacontabledepregastonormalSessionBean.setsFuncionBusquedaRapida("window.opener.detallegrupoactivofijoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_depre_gasto_normal(TO_REPLACE);");
			cuentacontabledepregastonormalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontabledepregastonormalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(DetalleGrupoActivoFijoConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(true);
			//cuentacontableSessionBean.setlidDetalleGrupoActivoFijoActual(this.idDetalleGrupoActivoFijoActual);

			detallegrupoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleGrupoActivoFijo(true);
			detallegrupoactivofijoSessionBean.setlIdDetalleGrupoActivoFijoActualForeignKey(this.idDetalleGrupoActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
		
		if(this.detallegrupoactivofijoSessionBean==null) {
			this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
		}
		
		this.detallegrupoactivofijoSessionBean.setsUltimaBusquedaDetalleGrupoActivoFijo(this.getsAccionBusqueda());
		this.detallegrupoactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detallegrupoactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCostoOriginal")) {
			detallegrupoactivofijoSessionBean.setid_cuenta_contable_costo_original(this.getid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDepreGastoNormal")) {
			detallegrupoactivofijoSessionBean.setid_cuenta_contable_depre_gasto_normal(this.getid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDepreNormal")) {
			detallegrupoactivofijoSessionBean.setid_cuenta_contable_depre_normal(this.getid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detallegrupoactivofijoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
		
		if(this.detallegrupoactivofijoSessionBean==null) {
			this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
		}
		
		if(this.detallegrupoactivofijoSessionBean.getsUltimaBusquedaDetalleGrupoActivoFijo()!=null&&!this.detallegrupoactivofijoSessionBean.getsUltimaBusquedaDetalleGrupoActivoFijo().equals("")) {
			this.setsAccionBusqueda(detallegrupoactivofijoSessionBean.getsUltimaBusquedaDetalleGrupoActivoFijo());
			this.setiNumeroPaginacion(detallegrupoactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detallegrupoactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCostoOriginal")) {
				this.setid_cuenta_contable_costo_originalFK_IdCuentaContableCostoOriginal(detallegrupoactivofijoSessionBean.getid_cuenta_contable_costo_original());
				detallegrupoactivofijoSessionBean.setid_cuenta_contable_costo_original(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDepreGastoNormal")) {
				this.setid_cuenta_contable_depre_gasto_normalFK_IdCuentaContableDepreGastoNormal(detallegrupoactivofijoSessionBean.getid_cuenta_contable_depre_gasto_normal());
				detallegrupoactivofijoSessionBean.setid_cuenta_contable_depre_gasto_normal(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDepreNormal")) {
				this.setid_cuenta_contable_depre_normalFK_IdCuentaContableDepreNormal(detallegrupoactivofijoSessionBean.getid_cuenta_contable_depre_normal());
				detallegrupoactivofijoSessionBean.setid_cuenta_contable_depre_normal(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detallegrupoactivofijoSessionBean.getid_empresa());
				detallegrupoactivofijoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.detallegrupoactivofijoSessionBean.setsUltimaBusquedaDetalleGrupoActivoFijo("");
		this.detallegrupoactivofijoSessionBean.setiNumeroPaginacion(DetalleGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.detallegrupoactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleGrupoActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleGrupoActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioDetalleGrupoActivoFijo();
		this.updateVisibilidadBusquedasFormularioDetalleGrupoActivoFijo();
		this.updateHabilitarBusquedasFormularioDetalleGrupoActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleGrupoActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponents().length>0) {
	

		if(this.detallegrupoactivofijoConstantesFunciones.resaltarFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);
				jPanel.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);
			}
		}

		if(this.detallegrupoactivofijoConstantesFunciones.resaltarFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);
				jPanel.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);
			}
		}

		if(this.detallegrupoactivofijoConstantesFunciones.resaltarFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);
				jPanel.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleGrupoActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);
			if(!this.detallegrupoactivofijoConstantesFunciones.mostrarFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);
			if(!this.detallegrupoactivofijoConstantesFunciones.mostrarFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);
			if(!this.detallegrupoactivofijoConstantesFunciones.mostrarFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleGrupoActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setEnabledAt(index,this.detallegrupoactivofijoConstantesFunciones.activarFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);
			}

			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setEnabledAt(index,this.detallegrupoactivofijoConstantesFunciones.activarFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);
			}

			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);
				this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setEnabledAt(index,this.detallegrupoactivofijoConstantesFunciones.activarFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleGrupoActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContableCostoOriginal")) {
			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);

			this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);

			this.detallegrupoactivofijoConstantesFunciones.setResaltarFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo(resaltar);

			jPanel.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarFK_IdCuentaContableCostoOriginalDetalleGrupoActivoFijo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableDepreGastoNormal")) {
			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);

			this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);

			this.detallegrupoactivofijoConstantesFunciones.setResaltarFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo(resaltar);

			jPanel.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarFK_IdCuentaContableDepreGastoNormalDetalleGrupoActivoFijo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableDepreNormal")) {
			index= this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.indexOfComponent(this.jPanelFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);

			this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleGrupoActivoFijo.getComponent(index);

			this.detallegrupoactivofijoConstantesFunciones.setResaltarFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo(resaltar);

			jPanel.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarFK_IdCuentaContableDepreNormalDetalleGrupoActivoFijo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleGrupoActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleGrupoActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleGrupoActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioDetalleGrupoActivoFijo();
		this.updateHabilitarResaltarControlesFormularioDetalleGrupoActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleGrupoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallegrupoactivofijoConstantesFunciones.resaltaridDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelidDetalleGrupoActivoFijo.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltaridDetalleGrupoActivoFijo);}
		if(this.detallegrupoactivofijoConstantesFunciones.resaltarid_empresaDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarid_empresaDetalleGrupoActivoFijo);}
		if(this.detallegrupoactivofijoConstantesFunciones.resaltarcodigoDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldcodigoDetalleGrupoActivoFijo.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarcodigoDetalleGrupoActivoFijo);}
		if(this.detallegrupoactivofijoConstantesFunciones.resaltarnombreDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextAreanombreDetalleGrupoActivoFijo.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarnombreDetalleGrupoActivoFijo);}
		if(this.detallegrupoactivofijoConstantesFunciones.resaltarsiglasDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldsiglasDetalleGrupoActivoFijo.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarsiglasDetalleGrupoActivoFijo);}
		if(this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo);}
		if(this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo);}
		if(this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo!=null && this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setBorder(this.detallegrupoactivofijoConstantesFunciones.resaltarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleGrupoActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelidDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostraridDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelidDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostraridDetalleGrupoActivoFijo);
		//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarid_empresaDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelid_empresaDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarid_empresaDetalleGrupoActivoFijo);
		//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldcodigoDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarcodigoDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelcodigoDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarcodigoDetalleGrupoActivoFijo);
		//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextAreanombreDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarnombreDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelnombreDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarnombreDetalleGrupoActivoFijo);
		//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldsiglasDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarsiglasDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelsiglasDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarsiglasDetalleGrupoActivoFijo);
		//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo);
		//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo);
		//this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setVisible(this.detallegrupoactivofijoConstantesFunciones.mostrarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleGrupoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleGrupoActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jLabelidDetalleGrupoActivoFijo.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activaridDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_empresaDetalleGrupoActivoFijo.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarid_empresaDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldcodigoDetalleGrupoActivoFijo.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarcodigoDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextAreanombreDetalleGrupoActivoFijo.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarnombreDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jTextFieldsiglasDetalleGrupoActivoFijo.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarsiglasDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_costo_originalDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_depre_normalDetalleGrupoActivoFijo);
		this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo);
			this.jInternalFrameDetalleFormDetalleGrupoActivoFijo.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setEnabled(this.detallegrupoactivofijoConstantesFunciones.activarid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo);
		}
	}
	
		
}