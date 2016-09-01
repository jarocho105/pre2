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

import com.bydan.erp.nomina.util.TipoPrestamoConstantesFunciones;
import com.bydan.erp.nomina.util.TipoPrestamoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoPrestamoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoPrestamoBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoPrestamoBeanSwingJInternalFrame extends TipoPrestamoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoPrestamoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoPrestamo> tipoprestamoValidator = new ClassValidator<TipoPrestamo>(TipoPrestamo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoPrestamo tipoprestamo;	
	public TipoPrestamo tipoprestamoAux;
	public TipoPrestamo tipoprestamoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoPrestamo tipoprestamoTotales;
	public Long idTipoPrestamoActual;
	public Long iIdNuevoTipoPrestamo=0L;
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

	public String sFinalQueryComboRubroEmplea="";

	public List<RubroEmplea> rubroempleasForeignKey;

	public List<RubroEmplea> getrubroempleasForeignKey() {
		return rubroempleasForeignKey;
	}

	public void setrubroempleasForeignKey(List<RubroEmplea> rubroempleasForeignKey) {
		this.rubroempleasForeignKey = rubroempleasForeignKey;
	}

	//OBJETO FK ACTUAL
	public RubroEmplea rubroempleaForeignKey;

	public RubroEmplea getrubroempleaForeignKey() {
		return rubroempleaForeignKey;
	}

	public void setrubroempleaForeignKey(RubroEmplea rubroempleaForeignKey) {
		this.rubroempleaForeignKey = rubroempleaForeignKey;
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

		
	
	
	
	
	

	public Boolean isTienePermisosPrestamo=false;

	public Boolean getIsTienePermisosPrestamo() {
		return isTienePermisosPrestamo;
	}

	public void setIsTienePermisosPrestamo(Boolean isTienePermisosPrestamo) {
		this.isTienePermisosPrestamo= isTienePermisosPrestamo;
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
	
	public Boolean isPermisoTodoTipoPrestamo;
	public Boolean isPermisoNuevoTipoPrestamo;
	public Boolean isPermisoActualizarTipoPrestamo;
	public Boolean isPermisoActualizarOriginalTipoPrestamo;
	public Boolean isPermisoEliminarTipoPrestamo;
	public Boolean isPermisoGuardarCambiosTipoPrestamo;
	public Boolean isPermisoConsultaTipoPrestamo;
	public Boolean isPermisoBusquedaTipoPrestamo;
	public Boolean isPermisoReporteTipoPrestamo;
	public Boolean isPermisoPaginacionMedioTipoPrestamo;
	public Boolean isPermisoPaginacionAltoTipoPrestamo;
	public Boolean isPermisoPaginacionTodoTipoPrestamo;
	public Boolean isPermisoCopiarTipoPrestamo;
	public Boolean isPermisoVerFormTipoPrestamo;
	public Boolean isPermisoDuplicarTipoPrestamo;
	public Boolean isPermisoOrdenTipoPrestamo;
	
	
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
	
	public TipoPrestamoParameterReturnGeneral tipoprestamoReturnGeneral;
	public TipoPrestamoParameterReturnGeneral tipoprestamoParameterGeneral;
	
	

	public PrestamoLogic prestamoLogic=null;

	public PrestamoLogic getPrestamoLogic() {
		return prestamoLogic;
	}

	public void setPrestamoLogic(PrestamoLogic prestamoLogic) {
		this.prestamoLogic = prestamoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoPrestamo=false;
	public Boolean esParaAccionDesdeFormularioTipoPrestamo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoPrestamoSessionBeanAdditional tipoprestamoSessionBeanAdditional=null;
	
	public TipoPrestamoSessionBeanAdditional getTipoPrestamoSessionBeanAdditional() {
		return this.tipoprestamoSessionBeanAdditional;
	}
	
	public void setTipoPrestamoSessionBeanAdditional(TipoPrestamoSessionBeanAdditional tipoprestamoSessionBeanAdditional) {
		try {
			this.tipoprestamoSessionBeanAdditional=tipoprestamoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoPrestamoBeanSwingJInternalFrameAdditional tipoprestamoBeanSwingJInternalFrameAdditional=null;
	//public class TipoPrestamoBeanSwingJInternalFrame
	
	public TipoPrestamoBeanSwingJInternalFrameAdditional getTipoPrestamoBeanSwingJInternalFrameAdditional() {
		return this.tipoprestamoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoPrestamoBeanSwingJInternalFrameAdditional(TipoPrestamoBeanSwingJInternalFrameAdditional tipoprestamoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoprestamoBeanSwingJInternalFrameAdditional=tipoprestamoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoPrestamoLogic tipoprestamoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoPrestamo tipoprestamoBean;
	public TipoPrestamoConstantesFunciones tipoprestamoConstantesFunciones;
	//public TipoPrestamoParameterReturnGeneral tipoprestamoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public RubroEmpleaLogic rubroempleaLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<TipoPrestamo> tipoprestamos;	
	//public List<TipoPrestamo> tipoprestamosEliminados;
	//public List<TipoPrestamo> tipoprestamosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoPrestamo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoPrestamo=true;
	public Boolean isVisibilidadCeldaCopiarTipoPrestamo=true;
	public Boolean isVisibilidadCeldaVerFormTipoPrestamo=true;
	public Boolean isVisibilidadCeldaOrdenTipoPrestamo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoPrestamo=false;
	public Boolean isVisibilidadCeldaModificarTipoPrestamo=false;
	public Boolean isVisibilidadCeldaActualizarTipoPrestamo=false;
	public Boolean isVisibilidadCeldaEliminarTipoPrestamo=false;
	public Boolean isVisibilidadCeldaCancelarTipoPrestamo=false;
	public Boolean isVisibilidadCeldaGuardarTipoPrestamo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoPrestamo=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoPrestamo=false;
	
	public Long getiIdNuevoTipoPrestamo() {
		return this.iIdNuevoTipoPrestamo;
	}

	public void setiIdNuevoTipoPrestamo(Long iIdNuevoTipoPrestamo) {
		this.iIdNuevoTipoPrestamo = iIdNuevoTipoPrestamo;
	}
	
	public Long getidTipoPrestamoActual() {
		return this.idTipoPrestamoActual;
	}

	public void setidTipoPrestamoActual(Long idTipoPrestamoActual) {
		this.idTipoPrestamoActual = idTipoPrestamoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoPrestamo gettipoprestamo() {
		return this.tipoprestamo;
	}

	public void settipoprestamo(TipoPrestamo tipoprestamo) {
		this.tipoprestamo = tipoprestamo;
	}
	
	public TipoPrestamo gettipoprestamoAux() {
		return this.tipoprestamoAux;
	}

	public void settipoprestamoAux(TipoPrestamo tipoprestamoAux) {
		this.tipoprestamoAux = tipoprestamoAux;
	}				
	
	public TipoPrestamo gettipoprestamoAnterior() {
		return this.tipoprestamoAnterior;
	}

	public void settipoprestamoAnterior(TipoPrestamo tipoprestamoAnterior) {
		this.tipoprestamoAnterior = tipoprestamoAnterior;
	}	
	
	public TipoPrestamo gettipoprestamoTotales() {
		return this.tipoprestamoTotales;
	}

	public void settipoprestamoTotales(TipoPrestamo tipoprestamoTotales) {
		this.tipoprestamoTotales = tipoprestamoTotales;
	}	
	
	public TipoPrestamo gettipoprestamoBean() {
		return this.tipoprestamoBean;
	}

	public void settipoprestamoBean(TipoPrestamo tipoprestamoBean) {
		this.tipoprestamoBean = tipoprestamoBean;
	}	
	
	public TipoPrestamoParameterReturnGeneral gettipoprestamoReturnGeneral() {
		return this.tipoprestamoReturnGeneral;
	}

	public void settipoprestamoReturnGeneral(TipoPrestamoParameterReturnGeneral tipoprestamoReturnGeneral) {
		this.tipoprestamoReturnGeneral = tipoprestamoReturnGeneral;
	}	
	
	
	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_rubro_empleaFK_IdTipoPrestamo=-1L;

	public Long getid_rubro_empleaFK_IdTipoPrestamo() {
		return this.id_rubro_empleaFK_IdTipoPrestamo;
	}

	public void setid_rubro_empleaFK_IdTipoPrestamo(Long id_rubro_empleaFK_IdTipoPrestamo) {
		this.id_rubro_empleaFK_IdTipoPrestamo = id_rubro_empleaFK_IdTipoPrestamo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoPrestamoLogic getTipoPrestamoLogic()	{		
		return tipoprestamoLogic;
	}

	public void setTipoPrestamoLogic(TipoPrestamoLogic tipoprestamoLogic) {
		this.tipoprestamoLogic = tipoprestamoLogic;
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
	
	public Boolean getIsEsNuevoTipoPrestamo() {
		return isEsNuevoTipoPrestamo;
	}

	public void setIsEsNuevoTipoPrestamo(Boolean isEsNuevoTipoPrestamo) {
		this.isEsNuevoTipoPrestamo = isEsNuevoTipoPrestamo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoPrestamo() {
		return esParaAccionDesdeFormularioTipoPrestamo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoPrestamo(Boolean esParaAccionDesdeFormularioTipoPrestamo) {
		this.esParaAccionDesdeFormularioTipoPrestamo = esParaAccionDesdeFormularioTipoPrestamo;
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

			if(this.tipoprestamoSessionBean==null) {
				this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
			}

			if(!this.tipoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoprestamoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosRubroEmpleasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RubroEmpleaLogic rubroempleaLogic=new RubroEmpleaLogic();

			//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

			if(this.tipoprestamoSessionBean==null) {
				this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
			}

			if(!this.tipoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

					rubroempleaLogic.getTodosRubroEmpleasWithConnection(sFinalQuery,new Pagination());

					this.rubroempleasForeignKey=rubroempleaLogic.getRubroEmpleas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRubroEmplea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleaLogic.getEntityWithConnection(tipoprestamoSessionBean.getlidRubroEmpleaActual());
					this.rubroempleasForeignKey.add(rubroempleaLogic.getRubroEmplea());
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

			if(this.tipoprestamoSessionBean==null) {
				this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
			}

			if(!this.tipoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(tipoprestamoSessionBean.getlidCuentaContableActual());
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

					if(this.tipoprestamo!=null) {
						this.tipoprestamo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
						this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoPrestamo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
						if(this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoPrestamoGenerico)throws Exception
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
				jComboBoxid_empresaTipoPrestamoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoPrestamoGenerico!=null && jComboBoxid_empresaTipoPrestamoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoPrestamoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualRubroEmpleaForeignKey(Long idRubroEmpleaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(rubroempleaTemp!=null) {

					if(this.tipoprestamo!=null) {
						this.tipoprestamo.setRubroEmplea(rubroempleaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
						this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.setSelectedItem(rubroempleaTemp);
					}
				} else {
					//jComboBoxid_rubro_empleaTipoPrestamo.setSelectedItem(rubroempleaTemp);
					if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
						if(this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoPrestamo") || sFormularioTipoBusqueda.equals("Todos")){
					if(rubroempleaTemp!=null && jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo!=null) {
						jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setSelectedItem(rubroempleaTemp);
					} else {
						if(jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo!=null) {
							//jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setSelectedItem(rubroempleaTemp);
							if(jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.getItemCount()>0) {
								jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setSelectedIndex(0);
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

	public String getActualRubroEmpleaForeignKeyDescripcion(Long idRubroEmpleaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}


			sDescripcion=RubroEmpleaConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRubroEmpleaForeignKeyGenerico(Long idRubroEmpleaSeleccionado,JComboBox jComboBoxid_rubro_empleaTipoPrestamoGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(rubroempleaTemp!=null) {
				jComboBoxid_rubro_empleaTipoPrestamoGenerico.setSelectedItem(rubroempleaTemp);
			} else {
				if(jComboBoxid_rubro_empleaTipoPrestamoGenerico!=null && jComboBoxid_rubro_empleaTipoPrestamoGenerico.getItemCount()>0) {
					jComboBoxid_rubro_empleaTipoPrestamoGenerico.setSelectedIndex(0);
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

					if(this.tipoprestamo!=null) {
						this.tipoprestamo.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
						this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableTipoPrestamo.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
						if(this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableTipoPrestamoGenerico)throws Exception
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
				jComboBoxid_cuenta_contableTipoPrestamoGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableTipoPrestamoGenerico!=null && jComboBoxid_cuenta_contableTipoPrestamoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableTipoPrestamoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoPrestamo tipoprestamo,JComboBox jComboBoxid_empresaTipoPrestamoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoPrestamoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoPrestamoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoprestamo.setid_empresa(empresaAux.getId());
				tipoprestamo.setempresa_descripcion(TipoPrestamoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoprestamo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRubroEmpleaForeignKey(TipoPrestamo tipoprestamo,JComboBox jComboBoxid_rubro_empleaTipoPrestamoGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaAux=new RubroEmplea();

			if(jComboBoxid_rubro_empleaTipoPrestamoGenerico==null) {
				rubroempleaAux=(RubroEmplea)this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.getSelectedItem();
			} else {
				rubroempleaAux=(RubroEmplea)jComboBoxid_rubro_empleaTipoPrestamoGenerico.getSelectedItem();
			}

			if(rubroempleaAux!=null && rubroempleaAux.getId()!=null) {
				tipoprestamo.setid_rubro_emplea(rubroempleaAux.getId());
				tipoprestamo.setrubroemplea_descripcion(TipoPrestamoConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaAux));
				tipoprestamo.setRubroEmplea(rubroempleaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(TipoPrestamo tipoprestamo,JComboBox jComboBoxid_cuenta_contableTipoPrestamoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableTipoPrestamoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableTipoPrestamoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				tipoprestamo.setid_cuenta_contable(cuentacontableAux.getId());
				tipoprestamo.setcuentacontable_descripcion(TipoPrestamoConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				tipoprestamo.setCuentaContable(cuentacontableAux);			}
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

					if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { 
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { 
					}

					if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRubroEmpleasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRubroEmplea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { 
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.addItem(rubroemplea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { 
					}

					if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoPrestamo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.addItem(rubroemplea);
							}
						}

						if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { 
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { 
					}

					if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.addItem(cuentacontable);
							}
						}

						if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameRubroEmpleaForeignKey(RubroEmplea rubroemplea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.setSelectedItem(rubroemplea);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setSelectedItem(rubroemplea);
						} else {
							this.jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoPrestamo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoPrestamoConstantesFunciones.refrescarForeignKeysDescripcionesTipoPrestamo(this.tipoprestamoLogic.getTipoPrestamos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoPrestamoConstantesFunciones.refrescarForeignKeysDescripcionesTipoPrestamo(this.tipoprestamos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(RubroEmplea.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoprestamoLogic.setTipoPrestamos(this.tipoprestamos);
			tipoprestamoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoPrestamoParameterReturnGeneral getTipoPrestamoParameterGeneral() {
		return this.tipoprestamoParameterGeneral;
	}
	
	public void setTipoPrestamoParameterGeneral(TipoPrestamoParameterReturnGeneral tipoprestamoParameterGeneral) {
		this.tipoprestamoParameterGeneral = tipoprestamoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoPrestamo() {
		return isPermisoTodoTipoPrestamo;
	}

	public void setIsPermisoTodoTipoPrestamo(Boolean isPermisoTodoTipoPrestamo) {
		this.isPermisoTodoTipoPrestamo = isPermisoTodoTipoPrestamo;
	}

	public Boolean getIsPermisoNuevoTipoPrestamo() {
		return isPermisoNuevoTipoPrestamo;
	}

	public void setIsPermisoNuevoTipoPrestamo(Boolean isPermisoNuevoTipoPrestamo) {
		this.isPermisoNuevoTipoPrestamo = isPermisoNuevoTipoPrestamo;
	}

	public Boolean getIsPermisoActualizarTipoPrestamo() {
		return isPermisoActualizarTipoPrestamo;
	}

	public void setIsPermisoActualizarTipoPrestamo(Boolean isPermisoActualizarTipoPrestamo) {
		this.isPermisoActualizarTipoPrestamo = isPermisoActualizarTipoPrestamo;
	}

	public Boolean getIsPermisoEliminarTipoPrestamo() {
		return isPermisoEliminarTipoPrestamo;
	}

	public void setIsPermisoEliminarTipoPrestamo(Boolean isPermisoEliminarTipoPrestamo) {
		this.isPermisoEliminarTipoPrestamo = isPermisoEliminarTipoPrestamo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoPrestamo() {
		return isPermisoGuardarCambiosTipoPrestamo;
	}

	public void setIsPermisoGuardarCambiosTipoPrestamo(Boolean isPermisoGuardarCambiosTipoPrestamo) {
		this.isPermisoGuardarCambiosTipoPrestamo = isPermisoGuardarCambiosTipoPrestamo;
	}
	
	public Boolean getIsPermisoConsultaTipoPrestamo() {
		return isPermisoConsultaTipoPrestamo;
	}

	public void setIsPermisoConsultaTipoPrestamo(Boolean isPermisoConsultaTipoPrestamo) {
		this.isPermisoConsultaTipoPrestamo = isPermisoConsultaTipoPrestamo;
	}

	public Boolean getIsPermisoBusquedaTipoPrestamo() {
		return isPermisoBusquedaTipoPrestamo;
	}

	public void setIsPermisoBusquedaTipoPrestamo(Boolean isPermisoBusquedaTipoPrestamo) {
		this.isPermisoBusquedaTipoPrestamo = isPermisoBusquedaTipoPrestamo;
	}

	public Boolean getIsPermisoReporteTipoPrestamo() {
		return isPermisoReporteTipoPrestamo;
	}

	public void setIsPermisoReporteTipoPrestamo(Boolean isPermisoReporteTipoPrestamo) {
		this.isPermisoReporteTipoPrestamo = isPermisoReporteTipoPrestamo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoPrestamo() {
		return isPermisoPaginacionMedioTipoPrestamo;
	}

	public void setIsPermisoPaginacionMedioTipoPrestamo(Boolean isPermisoPaginacionMedioTipoPrestamo) {
		this.isPermisoPaginacionMedioTipoPrestamo = isPermisoPaginacionMedioTipoPrestamo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoPrestamo() {
		return isPermisoPaginacionTodoTipoPrestamo;
	}

	public void setIsPermisoPaginacionTodoTipoPrestamo(Boolean isPermisoPaginacionTodoTipoPrestamo) {
		this.isPermisoPaginacionTodoTipoPrestamo = isPermisoPaginacionTodoTipoPrestamo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoPrestamo() {
		return isPermisoPaginacionAltoTipoPrestamo;
	}

	public void setIsPermisoPaginacionAltoTipoPrestamo(Boolean isPermisoPaginacionAltoTipoPrestamo) {
		this.isPermisoPaginacionAltoTipoPrestamo = isPermisoPaginacionAltoTipoPrestamo;
	}
	
	public Boolean getIsPermisoCopiarTipoPrestamo() {
		return isPermisoCopiarTipoPrestamo;
	}

	public void setIsPermisoCopiarTipoPrestamo(Boolean isPermisoCopiarTipoPrestamo) {
		this.isPermisoCopiarTipoPrestamo = isPermisoCopiarTipoPrestamo;
	}
	
	public Boolean getIsPermisoVerFormTipoPrestamo() {
		return isPermisoVerFormTipoPrestamo;
	}

	public void setIsPermisoVerFormTipoPrestamo(Boolean isPermisoVerFormTipoPrestamo) {
		this.isPermisoVerFormTipoPrestamo = isPermisoVerFormTipoPrestamo;
	}
	
	public Boolean getIsPermisoDuplicarTipoPrestamo() {
		return isPermisoDuplicarTipoPrestamo;
	}

	public void setIsPermisoDuplicarTipoPrestamo(Boolean isPermisoDuplicarTipoPrestamo) {
		this.isPermisoDuplicarTipoPrestamo = isPermisoDuplicarTipoPrestamo;
	}
	
	public Boolean getIsPermisoOrdenTipoPrestamo() {
		return isPermisoOrdenTipoPrestamo;
	}

	public void setIsPermisoOrdenTipoPrestamo(Boolean isPermisoOrdenTipoPrestamo) {
		this.isPermisoOrdenTipoPrestamo = isPermisoOrdenTipoPrestamo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoPrestamo() {
		return isVisibilidadCeldaNuevoTipoPrestamo;
	}

	public void setIsVisibilidadCeldaNuevoTipoPrestamo(Boolean isVisibilidadCeldaNuevoTipoPrestamo) {
		this.isVisibilidadCeldaNuevoTipoPrestamo = isVisibilidadCeldaNuevoTipoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoPrestamo() {
		return isVisibilidadCeldaDuplicarTipoPrestamo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoPrestamo(Boolean isVisibilidadCeldaDuplicarTipoPrestamo) {
		this.isVisibilidadCeldaDuplicarTipoPrestamo = isVisibilidadCeldaDuplicarTipoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoPrestamo() {
		return isVisibilidadCeldaCopiarTipoPrestamo;
	}

	public void setIsVisibilidadCeldaCopiarTipoPrestamo(Boolean isVisibilidadCeldaCopiarTipoPrestamo) {
		this.isVisibilidadCeldaCopiarTipoPrestamo = isVisibilidadCeldaCopiarTipoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoPrestamo() {
		return isVisibilidadCeldaVerFormTipoPrestamo;
	}

	public void setIsVisibilidadCeldaVerFormTipoPrestamo(Boolean isVisibilidadCeldaVerFormTipoPrestamo) {
		this.isVisibilidadCeldaVerFormTipoPrestamo = isVisibilidadCeldaVerFormTipoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoPrestamo() {
		return isVisibilidadCeldaOrdenTipoPrestamo;
	}

	public void setIsVisibilidadCeldaOrdenTipoPrestamo(Boolean isVisibilidadCeldaOrdenTipoPrestamo) {
		this.isVisibilidadCeldaOrdenTipoPrestamo = isVisibilidadCeldaOrdenTipoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoPrestamo() {
		return isVisibilidadCeldaNuevoRelacionesTipoPrestamo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoPrestamo(Boolean isVisibilidadCeldaNuevoRelacionesTipoPrestamo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo = isVisibilidadCeldaNuevoRelacionesTipoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoPrestamo() {
		return isVisibilidadCeldaModificarTipoPrestamo;
	}

	public void setIsVisibilidadCeldaModificarTipoPrestamo(Boolean isVisibilidadCeldaModificarTipoPrestamo) {
		this.isVisibilidadCeldaModificarTipoPrestamo = isVisibilidadCeldaModificarTipoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoPrestamo() {
		return isVisibilidadCeldaActualizarTipoPrestamo;
	}

	public void setIsVisibilidadCeldaActualizarTipoPrestamo(Boolean isVisibilidadCeldaActualizarTipoPrestamo) {
		this.isVisibilidadCeldaActualizarTipoPrestamo = isVisibilidadCeldaActualizarTipoPrestamo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoPrestamo() {
		return isVisibilidadCeldaEliminarTipoPrestamo;
	}

	public void setIsVisibilidadCeldaEliminarTipoPrestamo(Boolean isVisibilidadCeldaEliminarTipoPrestamo) {
		this.isVisibilidadCeldaEliminarTipoPrestamo = isVisibilidadCeldaEliminarTipoPrestamo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoPrestamo() {
		return isVisibilidadCeldaCancelarTipoPrestamo;
	}

	public void setIsVisibilidadCeldaCancelarTipoPrestamo(Boolean isVisibilidadCeldaCancelarTipoPrestamo) {
		this.isVisibilidadCeldaCancelarTipoPrestamo = isVisibilidadCeldaCancelarTipoPrestamo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoPrestamo() {
		return isVisibilidadCeldaGuardarTipoPrestamo;
	}

	public void setIsVisibilidadCeldaGuardarTipoPrestamo(Boolean isVisibilidadCeldaGuardarTipoPrestamo) {
		this.isVisibilidadCeldaGuardarTipoPrestamo = isVisibilidadCeldaGuardarTipoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoPrestamo() {
		return isVisibilidadCeldaGuardarCambiosTipoPrestamo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoPrestamo(Boolean isVisibilidadCeldaGuardarCambiosTipoPrestamo) {
		this.isVisibilidadCeldaGuardarCambiosTipoPrestamo = isVisibilidadCeldaGuardarCambiosTipoPrestamo;
	}
		
	public TipoPrestamoSessionBean gettipoprestamoSessionBean() {
		return this.tipoprestamoSessionBean;
	}
	
	public void settipoprestamoSessionBean(TipoPrestamoSessionBean tipoprestamoSessionBean) {
		this.tipoprestamoSessionBean=tipoprestamoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoPrestamo() {
		return this.isVisibilidadFK_IdTipoPrestamo;
	}

	public void setisVisibilidadFK_IdTipoPrestamo(Boolean isVisibilidadFK_IdTipoPrestamo) {
		this.isVisibilidadFK_IdTipoPrestamo=isVisibilidadFK_IdTipoPrestamo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(TipoPrestamo tipoprestamo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoprestamo,null);
				this.setActualParaGuardarRubroEmpleaForeignKey(tipoprestamo,null);
				this.setActualParaGuardarCuentaContableForeignKey(tipoprestamo,null);
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
	
	public void bugActualizarReferenciaActual(TipoPrestamo tipoprestamo,TipoPrestamo tipoprestamoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoPrestamo(tipoprestamo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoprestamoAux.setId(tipoprestamo.getId());
		tipoprestamoAux.setVersionRow(tipoprestamo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoPrestamo();
		
			int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoprestamoValidator.getInvalidValues(this.tipoprestamo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoprestamoLogic.setDatosCliente(datosCliente);
			tipoprestamoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoprestamoAux=new  TipoPrestamo();
				
				tipoprestamoAux.setIsNew(true);
				tipoprestamoAux.setIsChanged(true);
				
				tipoprestamoAux.setTipoPrestamoOriginal(this.tipoprestamo);
				
				tipoprestamoAux.setId(this.tipoprestamo.getId());	
				tipoprestamoAux.setVersionRow(this.tipoprestamo.getVersionRow());	
				tipoprestamoAux.setid_empresa(this.tipoprestamo.getid_empresa());	
				tipoprestamoAux.setid_rubro_emplea(this.tipoprestamo.getid_rubro_emplea());	
				tipoprestamoAux.setid_cuenta_contable(this.tipoprestamo.getid_cuenta_contable());	
				tipoprestamoAux.setcodigo(this.tipoprestamo.getcodigo());	
				tipoprestamoAux.setnombre(this.tipoprestamo.getnombre());	
				tipoprestamoAux.setcon_pago(this.tipoprestamo.getcon_pago());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprestamoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoprestamoAux,tipoprestamoLogic.getTipoPrestamos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprestamoAux,tipoprestamos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprestamoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprestamoLogic.saveTipoPrestamos();//WithConnection
						//tipoprestamoLogic.getSetVersionRowTipoPrestamos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprestamo,tipoprestamoAux);
					
					this.refrescarForeignKeysDescripcionesTipoPrestamo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos().addAll(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamos.addAll(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprestamoLogic.saveTipoPrestamoRelaciones(tipoprestamoAux,this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());//WithConnection
								//tipoprestamoLogic.getSetVersionRowTipoPrestamos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprestamo,tipoprestamoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamos= new ArrayList<Prestamo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprestamoAux.setPrestamos(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoprestamoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoprestamoAux,tipoprestamoLogic.getTipoPrestamos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoprestamoAux,tipoprestamos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprestamo,tipoprestamoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoprestamoAux=new  TipoPrestamo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoprestamoSessionBean.getEsGuardarRelacionado() && this.tipoprestamo.getId()>=0)) {
						
					tipoprestamoAux.setIsNew(false);
				}
				
				tipoprestamoAux.setIsDeleted(false);
			
				tipoprestamoAux.setId(this.tipoprestamo.getId());	
				tipoprestamoAux.setVersionRow(this.tipoprestamo.getVersionRow());	
				tipoprestamoAux.setid_empresa(this.tipoprestamo.getid_empresa());	
				tipoprestamoAux.setid_rubro_emplea(this.tipoprestamo.getid_rubro_emplea());	
				tipoprestamoAux.setid_cuenta_contable(this.tipoprestamo.getid_cuenta_contable());	
				tipoprestamoAux.setcodigo(this.tipoprestamo.getcodigo());	
				tipoprestamoAux.setnombre(this.tipoprestamo.getnombre());	
				tipoprestamoAux.setcon_pago(this.tipoprestamo.getcon_pago());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprestamoAux,tipoprestamoLogic.getTipoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprestamoAux,tipoprestamos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprestamoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprestamoLogic.saveTipoPrestamos();//WithConnection
						//tipoprestamoLogic.getSetVersionRowTipoPrestamos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprestamo,tipoprestamoAux);
					
					this.refrescarForeignKeysDescripcionesTipoPrestamo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos().addAll(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamos.addAll(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprestamoLogic.saveTipoPrestamoRelaciones(tipoprestamoAux,this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());//WithConnection
								//tipoprestamoLogic.getSetVersionRowTipoPrestamos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprestamo,tipoprestamoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamos= new ArrayList<Prestamo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprestamoAux.setPrestamos(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoprestamoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoprestamoAux,tipoprestamoLogic.getTipoPrestamos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoprestamoAux,tipoprestamos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprestamo,tipoprestamoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoprestamoAux=new  TipoPrestamo();
				
				tipoprestamoAux.setIsNew(false);
				tipoprestamoAux.setIsChanged(false);
				
				tipoprestamoAux.setIsDeleted(true);
				
				tipoprestamoAux.setId(this.tipoprestamo.getId());	
				tipoprestamoAux.setVersionRow(this.tipoprestamo.getVersionRow());	
				tipoprestamoAux.setid_empresa(this.tipoprestamo.getid_empresa());	
				tipoprestamoAux.setid_rubro_emplea(this.tipoprestamo.getid_rubro_emplea());	
				tipoprestamoAux.setid_cuenta_contable(this.tipoprestamo.getid_cuenta_contable());	
				tipoprestamoAux.setcodigo(this.tipoprestamo.getcodigo());	
				tipoprestamoAux.setnombre(this.tipoprestamo.getnombre());	
				tipoprestamoAux.setcon_pago(this.tipoprestamo.getcon_pago());	
				
				if(this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoprestamoAux.getId()>=0) {	
						this.tipoprestamosEliminados.add(tipoprestamoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoprestamoAux,tipoprestamoLogic.getTipoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprestamoAux,tipoprestamos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprestamoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprestamoLogic.saveTipoPrestamos();//WithConnection
						//tipoprestamoLogic.getSetVersionRowTipoPrestamos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos().addAll(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamos.addAll(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.abonoprestamoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jInternalFrameDetalleFormPrestamo.cuotaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprestamoLogic.saveTipoPrestamoRelaciones(tipoprestamoAux,this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());//WithConnection
								//tipoprestamoLogic.getSetVersionRowTipoPrestamos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.setPrestamos(new ArrayList<Prestamo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamos= new ArrayList<Prestamo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprestamoAux.setPrestamos(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoprestamoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoprestamoAux,tipoprestamoLogic.getTipoPrestamos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoprestamoAux,tipoprestamos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.getTipoPrestamos().addAll(this.tipoprestamosEliminados);
					
					tipoprestamoLogic.saveTipoPrestamos();//WithConnection
					//tipoprestamoLogic.getSetVersionRowTipoPrestamos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoPrestamo();
				
				this.tipoprestamosEliminados= new ArrayList<TipoPrestamo>();		
			}
			
			if(this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Prestamo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Prestamo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoprestamo=tipoprestamoAux;
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
      		//this.finishProcessTipoPrestamo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoPrestamo tipoprestamoLocal) throws Exception {
		
		if(this.tipoprestamoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoprestamoLocal.setPrestamos(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());
			
			} else {
			
				tipoprestamoLocal.setPrestamos(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoPrestamo tipoprestamoLocal) throws Exception {	
		if(this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoprestamoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RubroEmpleaDetalleFormJInternalFrame.class)) {
				RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrameLocal=(RubroEmpleaBeanSwingJInternalFrame) ((RubroEmpleaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				rubroempleaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.getrubroemplea(),true);
				rubroempleaBeanSwingJInternalFrameLocal.actualizarLista(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea,this.rubroempleasForeignKey);

				rubroempleaBeanSwingJInternalFrameLocal.actualizarRelaciones(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				tipoprestamoLocal.setRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey("Formulario");
				this.setActualRubroEmpleaForeignKey(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				tipoprestamoLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoPrestamoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoprestamoValidator.getInvalidValues(this.tipoprestamo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoPrestamo tipoprestamo,List<TipoPrestamo> tipoprestamos) throws Exception {
		try	{		
			TipoPrestamoConstantesFunciones.actualizarLista(tipoprestamo,tipoprestamos,this.tipoprestamoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoPrestamo tipoprestamo,List<TipoPrestamo> tipoprestamos) throws Exception {
		try	{			
			TipoPrestamoConstantesFunciones.actualizarSelectedLista(tipoprestamo,tipoprestamos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoPrestamo> tipoprestamosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoprestamosLocal=this.tipoprestamoLogic.getTipoPrestamos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoprestamosLocal=this.tipoprestamos;
			}
			//ARCHITECTURE
		
			for(TipoPrestamo tipoprestamoLocal:tipoprestamosLocal) {
				if(this.permiteMantenimiento(tipoprestamoLocal) && tipoprestamoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoPrestamoConstantesFunciones.getTipoPrestamoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoPrestamoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrestamo.jLabelid_empresaTipoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPrestamoConstantesFunciones.IDRUBROEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrestamo.jLabelid_rubro_empleaTipoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPrestamoConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrestamo.jLabelid_cuenta_contableTipoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPrestamoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrestamo.jLabelcodigoTipoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPrestamoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrestamo.jLabelnombreTipoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPrestamoConstantesFunciones.CONPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrestamo.jLabelcon_pagoTipoPrestamo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrestamo.jLabelid_empresaTipoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrestamo.jLabelid_rubro_empleaTipoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrestamo.jLabelid_cuenta_contableTipoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrestamo.jLabelcodigoTipoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrestamo.jLabelnombreTipoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrestamo.jLabelcon_pagoTipoPrestamo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Prestamo")) {
			if(this.tipoprestamo==null) {
				this.tipoprestamo= new TipoPrestamo();
			}

			if(this.tipoprestamoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoPrestamo
				this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);

				this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.getprestamo().setTipoPrestamo(this.tipoprestamo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoPrestamo--;	
		
		
		this.tipoprestamoAux=new TipoPrestamo();
		
		this.tipoprestamoAux.setId(this.iIdNuevoTipoPrestamo);
		this.tipoprestamoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprestamoLogic.getTipoPrestamos().add(this.tipoprestamoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoprestamos.add(this.tipoprestamoAux);
		}
		//ARCHITECTURE
		
		this.tipoprestamo=this.tipoprestamoAux;
		
		if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoPrestamo(this.tipoprestamo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPrestamo(this.tipoprestamo);
		}
				
		//this.setDefaultControlesTipoPrestamo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoPrestamo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoPrestamo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrestamo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPrestamo(this.tipoprestamoBean,this.tipoprestamo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoPrestamoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoprestamoSessionBean.getConGuardarRelaciones()) {
			classes=TipoPrestamoConstantesFunciones.getClassesRelationshipsOfTipoPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoprestamoReturnGeneral=tipoprestamoLogic.procesarEventosTipoPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprestamoLogic.getTipoPrestamos(),this.tipoprestamo,this.tipoprestamoParameterGeneral,this.isEsNuevoTipoPrestamo,classes);//this.tipoprestamoLogic.getTipoPrestamo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoPrestamo(this.tipoprestamoReturnGeneral,this.tipoprestamoBean,false);
		
		if(this.tipoprestamoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPrestamo(this.tipoprestamoReturnGeneral.getTipoPrestamo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoPrestamo(this.tipoprestamoReturnGeneral.getTipoPrestamo());
		}
		
		if(this.tipoprestamoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoPrestamo(this.tipoprestamoReturnGeneral.getTipoPrestamo(),classes);//this.tipoprestamoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoPrestamo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoPrestamo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.RecargarFormTipoPrestamo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoPrestamo(false);
						
			if(tipoprestamoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoSessionBean.getEsGuardarRelacionado() && PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPrestamoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrestamo();
			}
			
			this.actualizarVisualTableDatosTipoPrestamo();
			
			this.jTableDatosTipoPrestamo.setRowSelectionInterval(this.getIndiceNuevoTipoPrestamo(), this.getIndiceNuevoTipoPrestamo());
			
			this.seleccionarFilaTablaTipoPrestamoActual();
						
			this.actualizarEstadoCeldasBotonesTipoPrestamo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoPrestamo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoPrestamo.jTextFieldcodigoTipoPrestamo.setEnabled(isHabilitar && this.tipoprestamoConstantesFunciones.activarcodigoTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jTextAreanombreTipoPrestamo.setEnabled(isHabilitar && this.tipoprestamoConstantesFunciones.activarnombreTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxcon_pagoTipoPrestamo.setEnabled(isHabilitar && this.tipoprestamoConstantesFunciones.activarcon_pagoTipoPrestamo);	
		//
		this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.setEnabled(isHabilitar && this.tipoprestamoConstantesFunciones.activarid_empresaTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.setEnabled(isHabilitar && this.tipoprestamoConstantesFunciones.activarid_rubro_empleaTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.setEnabled(isHabilitar && this.tipoprestamoConstantesFunciones.activarid_cuenta_contableTipoPrestamo);
	};
	
	public void setDefaultControlesTipoPrestamo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoPrestamo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoprestamoSessionBean.setConGuardarRelaciones(true);			
			this.tipoprestamoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoprestamoSessionBean.setConGuardarRelaciones(false);			
			this.tipoprestamoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoPrestamo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrestamo tipoprestamoAux:this.tipoprestamoLogic.getTipoPrestamos()) {
				if(tipoprestamoAux.getId().equals(this.iIdNuevoTipoPrestamo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrestamo tipoprestamoAux:this.tipoprestamos) {
				if(tipoprestamoAux.getId().equals(this.iIdNuevoTipoPrestamo)) {
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
	
	public int getIndiceActualTipoPrestamo(TipoPrestamo tipoprestamo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrestamo tipoprestamoAux:this.tipoprestamoLogic.getTipoPrestamos()) {
				if(tipoprestamoAux.getId().equals(tipoprestamo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrestamo tipoprestamoAux:this.tipoprestamos) {
				if(tipoprestamoAux.getId().equals(tipoprestamo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoPrestamo(TipoPrestamo tipoprestamoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrestamo tipoprestamoAux:this.tipoprestamoLogic.getTipoPrestamos()) {
				if(tipoprestamoAux.getTipoPrestamoOriginal().getId().equals(tipoprestamoOriginal.getId())) {
					existe=true;
					tipoprestamoOriginal.setId(tipoprestamoAux.getId());
					tipoprestamoOriginal.setVersionRow(tipoprestamoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrestamo tipoprestamoAux:this.tipoprestamos) {
				if(tipoprestamoAux.getTipoPrestamoOriginal().getId().equals(tipoprestamoOriginal.getId())) {
					existe=true;
					tipoprestamoOriginal.setId(tipoprestamoAux.getId());
					tipoprestamoOriginal.setVersionRow(tipoprestamoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoPrestamo(Boolean esParaCancelar) throws Exception {
		tipoprestamosAux=new ArrayList<TipoPrestamo>();
		tipoprestamoAux=new TipoPrestamo();
		
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPrestamo tipoprestamoAux:this.tipoprestamoLogic.getTipoPrestamos()) {
					if(tipoprestamoAux.getId()<0) {
						tipoprestamosAux.add(tipoprestamoAux);
					}		
				}
				this.iIdNuevoTipoPrestamo=0L;
				this.tipoprestamoLogic.getTipoPrestamos().removeAll(tipoprestamosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrestamo tipoprestamoAux:this.tipoprestamos) {
					if(tipoprestamoAux.getId()<0) {
						tipoprestamosAux.add(tipoprestamoAux);
					}		
				}
				this.iIdNuevoTipoPrestamo=0L;
				this.tipoprestamos.removeAll(tipoprestamosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoPrestamo 
					&& this.tipoprestamoLogic.getTipoPrestamos().size()>0
					) {
					tipoprestamoAux=this.tipoprestamoLogic.getTipoPrestamos().get(this.tipoprestamoLogic.getTipoPrestamos().size() - 1);
				
					if(tipoprestamoAux.getId()<0) {
						this.tipoprestamoLogic.getTipoPrestamos().remove(tipoprestamoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoPrestamo && this.tipoprestamos.size()>0) {
					tipoprestamoAux=this.tipoprestamos.get(this.tipoprestamos.size() - 1);
				
					if(tipoprestamoAux.getId()<0) {
						this.tipoprestamos.remove(tipoprestamoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoPrestamo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoprestamo.getId()<0) {
				this.tipoprestamoLogic.getTipoPrestamos().remove(this.tipoprestamo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoprestamo.getId()<0) {
				this.tipoprestamos.remove(this.tipoprestamo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoPrestamo(List<TipoPrestamo> tipoprestamosAux) throws Exception {
		TipoPrestamoConstantesFunciones.setEstadosInicialesTipoPrestamo(tipoprestamosAux);
	}
	
	public void setEstadosInicialesTipoPrestamo(TipoPrestamo tipoprestamoAux) throws Exception {
		TipoPrestamoConstantesFunciones.setEstadosInicialesTipoPrestamo(tipoprestamoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoPrestamoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoPrestamoActual()) {
				if(!this.isEsNuevoTipoPrestamo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoPrestamo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoPrestamoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Prestamo ?", "MANTENIMIENTO DE Tipo Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoPrestamo tipoprestamo) throws Exception {
		TipoPrestamoConstantesFunciones.seleccionarAsignar(this.tipoprestamo,tipoprestamo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoPrestamo=this.isPermisoActualizarOriginalTipoPrestamo;
			
			
			this.seleccionarAsignar(tipoprestamo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPrestamoConstantesFunciones.quitarEspaciosTipoPrestamo(this.tipoprestamo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoPrestamo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoprestamoSessionBean.setsFuncionBusquedaRapida(this.tipoprestamoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoPrestamo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoPrestamo(esParaCancelar);				
				this.cancelarNuevoTipoPrestamo(esParaCancelar);								
			}
			
			this.tipoprestamo=new TipoPrestamo();
			
			this.inicializarTipoPrestamo();
			
			this.actualizarEstadoCeldasBotonesTipoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoPrestamo() throws Exception {
		try {
			TipoPrestamoConstantesFunciones.inicializarTipoPrestamo(this.tipoprestamo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoprestamoLogic.getTipoPrestamos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoPrestamos(String sAccionBusqueda,List<TipoPrestamo> tipoprestamosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoPrestamo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoPrestamoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoPrestamoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoPrestamo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Prestamos");		
		parameters.put("busquedapor", TipoPrestamoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Prestamo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoPrestamoLogic tipoprestamoLogicAuxiliar=new TipoPrestamoLogic();
					tipoprestamoLogicAuxiliar.setDatosCliente(tipoprestamoLogic.getDatosCliente());				
					tipoprestamoLogicAuxiliar.setTipoPrestamos(tipoprestamosParaReportes);
					
					tipoprestamoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoPrestamoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoprestamosParaReportes=tipoprestamoLogicAuxiliar.getTipoPrestamos();
					
					//tipoprestamoLogic.getNewConnexionToDeep();
					
					//for (TipoPrestamo tipoprestamo:tipoprestamosParaReportes) {
					//	tipoprestamoLogic.deepLoad(tipoprestamo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoprestamoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoprestamoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePrestamo = AuxiliarReportes.class.getResourceAsStream("PrestamoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_prestamo", reportFilePrestamo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoPrestamo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoPrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoPrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoPrestamo=new JRBeanArrayDataSource(TipoPrestamoJInternalFrame.TraerTipoPrestamoBeans(tipoprestamosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoPrestamo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoPrestamoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoPrestamoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoPrestamoBean.TraerTipoPrestamoBeans(tipoprestamosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoPrestamos(sAccionBusqueda,sTipoArchivoReporte,tipoprestamosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoPrestamos(sAccionBusqueda,sTipoArchivoReporte,tipoprestamosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoPrestamoActionPerformed(null);
					//this.generarExcelReporteTipoPrestamos(sAccionBusqueda,sTipoArchivoReporte,tipoprestamosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoPrestamos(sAccionBusqueda,sTipoArchivoReporte,tipoprestamosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoPrestamos(sAccionBusqueda,sTipoArchivoReporte,tipoprestamosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoPrestamos(sAccionBusqueda,sTipoArchivoReporte,tipoprestamosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoPrestamos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrestamo> tipoprestamosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprestamo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPrestamos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPrestamo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoPrestamo tipoprestamo : tipoprestamosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoPrestamoConstantesFunciones.generarExcelReporteDataTipoPrestamo("NORMAL",row,workbook,tipoprestamo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prestamo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoPrestamo(String sTipo,Row row,Workbook workbook) {
		
		TipoPrestamoConstantesFunciones.generarExcelReporteHeaderTipoPrestamo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoPrestamos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrestamo> tipoprestamosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprestamo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPrestamos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoPrestamo tipoprestamo : tipoprestamosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoPrestamoConstantesFunciones.getTipoPrestamoDescripcion(tipoprestamo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprestamo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprestamo.getrubroemplea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprestamo.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPrestamoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprestamo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPrestamoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprestamo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPrestamoConstantesFunciones.LABEL_CONPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_CONPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipoprestamo.getcon_pago()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prestamo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoPrestamos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrestamo> tipoprestamosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoPrestamo> tipoprestamosRespaldo=null;
		
		classes=TipoPrestamoConstantesFunciones.getClassesRelationshipsOfTipoPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoprestamoLogic.setDatosCliente(this.datosCliente);
		this.tipoprestamoLogic.setDatosDeep(this.datosDeep);
		this.tipoprestamoLogic.setIsConDeep(true);
		
		tipoprestamosRespaldo=this.tipoprestamoLogic.getTipoPrestamos();
		
		this.tipoprestamoLogic.setTipoPrestamos(tipoprestamosParaReportes);	
		this.tipoprestamoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoprestamosParaReportes=this.tipoprestamoLogic.getTipoPrestamos();
		this.tipoprestamoLogic.setTipoPrestamos(tipoprestamosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprestamo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPrestamos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPrestamo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoPrestamo tipoprestamo : tipoprestamosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoPrestamo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoPrestamoConstantesFunciones.generarExcelReporteDataTipoPrestamo("NORMAL",row,workbook,tipoprestamo,cellStyleDataAux);
		
			
			


				//Prestamo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PrestamoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoprestamo.getPrestamos()!=null && tipoprestamo.getPrestamos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PrestamoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PrestamoConstantesFunciones.generarExcelReporteHeaderPrestamo("RELACIONADO",row,workbook);
				}

				if(tipoprestamo.getPrestamos()!=null) {
					i2=0;
					for(Prestamo prestamo : tipoprestamo.getPrestamos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PrestamoConstantesFunciones.generarExcelReporteDataPrestamo("RELACIONADO",row,workbook,prestamo,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoPrestamoConstantesFunciones.getTipoPrestamoDescripcion(tipoprestamo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prestamo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrestamo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrestamo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoPrestamo() throws Exception {		
		this.startProcessTipoPrestamo(true);
	}
	
	public void startProcessTipoPrestamo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoPrestamo ,this.jPanelParametrosReportesTipoPrestamo, this.jScrollPanelDatosTipoPrestamo,this.jPanelPaginacionTipoPrestamo, this.jScrollPanelDatosEdicionTipoPrestamo, this.jPanelAccionesTipoPrestamo,this.jPanelAccionesFormularioTipoPrestamo,this.jmenuBarTipoPrestamo,this.jmenuBarDetalleTipoPrestamo,this.jTtoolBarTipoPrestamo,this.jTtoolBarDetalleTipoPrestamo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPrestamo=this.jTabbedPaneBusquedasTipoPrestamo; 
		
		final JPanel jPanelParametrosReportesTipoPrestamo=this.jPanelParametrosReportesTipoPrestamo;
		//final JScrollPane jScrollPanelDatosTipoPrestamo=this.jScrollPanelDatosTipoPrestamo;
		final JTable jTableDatosTipoPrestamo=this.jTableDatosTipoPrestamo;		
		final JPanel jPanelPaginacionTipoPrestamo=this.jPanelPaginacionTipoPrestamo;
		//final JScrollPane jScrollPanelDatosEdicionTipoPrestamo=this.jScrollPanelDatosEdicionTipoPrestamo;
		final JPanel jPanelAccionesTipoPrestamo=this.jPanelAccionesTipoPrestamo;
		
		JPanel jPanelCamposAuxiliarTipoPrestamo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoPrestamo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			jPanelCamposAuxiliarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jPanelCamposTipoPrestamo;
			jPanelAccionesFormularioAuxiliarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jPanelAccionesFormularioTipoPrestamo;
		}
		
		final JPanel jPanelCamposTipoPrestamo=jPanelCamposAuxiliarTipoPrestamo;
		final JPanel jPanelAccionesFormularioTipoPrestamo=jPanelAccionesFormularioAuxiliarTipoPrestamo;
		
		
		final JMenuBar jmenuBarTipoPrestamo=this.jmenuBarTipoPrestamo;
		final JToolBar jTtoolBarTipoPrestamo=this.jTtoolBarTipoPrestamo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoPrestamo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPrestamo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			jmenuBarDetalleAuxiliarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jmenuBarDetalleTipoPrestamo;
			jTtoolBarDetalleAuxiliarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jTtoolBarDetalleTipoPrestamo;
		}
		
		final JMenuBar jmenuBarDetalleTipoPrestamo=jmenuBarDetalleAuxiliarTipoPrestamo;
		final JToolBar jTtoolBarDetalleTipoPrestamo=jTtoolBarDetalleAuxiliarTipoPrestamo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPrestamo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPrestamo;
			processRunnable.jTableDatos=jTableDatosTipoPrestamo;
			processRunnable.jPanelCampos=jPanelCamposTipoPrestamo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPrestamo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPrestamo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPrestamo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPrestamo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPrestamo;
			processRunnable.jTtoolBar=jTtoolBarTipoPrestamo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPrestamo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPrestamo ,jPanelParametrosReportesTipoPrestamo,jTableDatosTipoPrestamo, /*jScrollPanelDatosTipoPrestamo,*/jPanelCamposTipoPrestamo,jPanelPaginacionTipoPrestamo, /*jScrollPanelDatosEdicionTipoPrestamo,*/ jPanelAccionesTipoPrestamo,jPanelAccionesFormularioTipoPrestamo,jmenuBarTipoPrestamo,jmenuBarDetalleTipoPrestamo,jTtoolBarTipoPrestamo,jTtoolBarDetalleTipoPrestamo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPrestamo ,jPanelParametrosReportesTipoPrestamo, jScrollPanelDatosTipoPrestamo,jPanelPaginacionTipoPrestamo, jScrollPanelDatosEdicionTipoPrestamo, jPanelAccionesTipoPrestamo,jPanelAccionesFormularioTipoPrestamo,jmenuBarTipoPrestamo,jmenuBarDetalleTipoPrestamo,jTtoolBarTipoPrestamo,jTtoolBarDetalleTipoPrestamo);
						
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
	
	public void finishProcessTipoPrestamo() {// throws Exception 
		this.finishProcessTipoPrestamo(true);
	}
	
	public void finishProcessTipoPrestamo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoPrestamo ,this.jPanelParametrosReportesTipoPrestamo, this.jScrollPanelDatosTipoPrestamo,this.jPanelPaginacionTipoPrestamo, this.jScrollPanelDatosEdicionTipoPrestamo, this.jPanelAccionesTipoPrestamo,this.jPanelAccionesFormularioTipoPrestamo,this.jmenuBarTipoPrestamo,this.jmenuBarDetalleTipoPrestamo,this.jTtoolBarTipoPrestamo,this.jTtoolBarDetalleTipoPrestamo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPrestamo=this.jTabbedPaneBusquedasTipoPrestamo; 
		
		final JPanel jPanelParametrosReportesTipoPrestamo=this.jPanelParametrosReportesTipoPrestamo;
		//final JScrollPane jScrollPanelDatosTipoPrestamo=this.jScrollPanelDatosTipoPrestamo;
		final JTable jTableDatosTipoPrestamo=this.jTableDatosTipoPrestamo;		
		final JPanel jPanelPaginacionTipoPrestamo=this.jPanelPaginacionTipoPrestamo;
		//final JScrollPane jScrollPanelDatosEdicionTipoPrestamo=this.jScrollPanelDatosEdicionTipoPrestamo;
		final JPanel jPanelAccionesTipoPrestamo=this.jPanelAccionesTipoPrestamo;
		
		JPanel jPanelCamposAuxiliarTipoPrestamo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoPrestamo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			jPanelCamposAuxiliarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jPanelCamposTipoPrestamo;
			jPanelAccionesFormularioAuxiliarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jPanelAccionesFormularioTipoPrestamo;
		}
		
		final JPanel jPanelCamposTipoPrestamo=jPanelCamposAuxiliarTipoPrestamo;
		final JPanel jPanelAccionesFormularioTipoPrestamo=jPanelAccionesFormularioAuxiliarTipoPrestamo;
		
		
		final JMenuBar jmenuBarTipoPrestamo=this.jmenuBarTipoPrestamo;		
		final JToolBar jTtoolBarTipoPrestamo=this.jTtoolBarTipoPrestamo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoPrestamo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPrestamo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			jmenuBarDetalleAuxiliarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jmenuBarDetalleTipoPrestamo;
			jTtoolBarDetalleAuxiliarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jTtoolBarDetalleTipoPrestamo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoPrestamo=jmenuBarDetalleAuxiliarTipoPrestamo;
		final JToolBar jTtoolBarDetalleTipoPrestamo=jTtoolBarDetalleAuxiliarTipoPrestamo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPrestamo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPrestamo;
			processRunnable.jTableDatos=jTableDatosTipoPrestamo;
			processRunnable.jPanelCampos=jPanelCamposTipoPrestamo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPrestamo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPrestamo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPrestamo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPrestamo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPrestamo;
			processRunnable.jTtoolBar=jTtoolBarTipoPrestamo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPrestamo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoPrestamo ,jPanelParametrosReportesTipoPrestamo, jTableDatosTipoPrestamo,/*jScrollPanelDatosTipoPrestamo,*/jPanelCamposTipoPrestamo,jPanelPaginacionTipoPrestamo, /*jScrollPanelDatosEdicionTipoPrestamo,*/ jPanelAccionesTipoPrestamo,jPanelAccionesFormularioTipoPrestamo,jmenuBarTipoPrestamo,jmenuBarDetalleTipoPrestamo,jTtoolBarTipoPrestamo,jTtoolBarDetalleTipoPrestamo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoPrestamo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoPrestamo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoPrestamo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoPrestamo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoPrestamo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoPrestamo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoPrestamo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoPrestamo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoPrestamo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoprestamoConstantesFunciones.getsFinalQueryTipoPrestamo();
		String  finalQueryPaginacionTodos=this.tipoprestamoConstantesFunciones.getsFinalQueryTipoPrestamo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoPrestamoConstantesFunciones.getArrayColumnasGlobalesNoTipoPrestamo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoPrestamoConstantesFunciones.getArrayColumnasGlobalesTipoPrestamo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoPrestamoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoprestamosEliminados= new ArrayList<TipoPrestamo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoPrestamo();
		
				///*TipoPrestamoSessionBean*/this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
			
			if(this.tipoprestamoSessionBean==null) {
				this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
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
					this.iNumeroPaginacion=TipoPrestamoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoPrestamoConstantesFunciones.getClassesForeignKeysOfTipoPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoprestamo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoprestamosAux= new ArrayList<TipoPrestamo>();
			
				
			tipoprestamoLogic.setDatosCliente(this.datosCliente);
			tipoprestamoLogic.setDatosDeep(this.datosDeep);
			tipoprestamoLogic.setIsConDeep(true);
			
			
			tipoprestamoLogic.getTipoPrestamoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoprestamoLogic.getTodosTipoPrestamos(finalQueryGlobal,pagination);
					
					//tipoprestamoLogic.getTodosTipoPrestamosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoprestamoLogic.getTipoPrestamos()==null|| tipoprestamoLogic.getTipoPrestamos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprestamosAux= new ArrayList<TipoPrestamo>();
							tipoprestamosAux.addAll(tipoprestamoLogic.getTipoPrestamos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprestamosAux= new ArrayList<TipoPrestamo>();
							tipoprestamosAux.addAll(tipoprestamos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprestamoLogic.getTodosTipoPrestamos(finalQueryGlobal+"",this.pagination);												
							
							//tipoprestamoLogic.getTodosTipoPrestamosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoPrestamos("Todos",tipoprestamoLogic.getTipoPrestamos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprestamoLogic.setTipoPrestamos(new ArrayList<TipoPrestamo>());					
							tipoprestamoLogic.getTipoPrestamos().addAll(tipoprestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprestamos=new ArrayList<TipoPrestamo>();
							tipoprestamos.addAll(tipoprestamosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoPrestamo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoPrestamo=this.idActual;
				
				} else if(this.idTipoPrestamoActual!=null && this.idTipoPrestamoActual!=0L) {
					idTipoPrestamo=idTipoPrestamoActual;
				}
				
					
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndicePorId(idTipoPrestamo);
				
				this.tipoprestamos=new ArrayList<TipoPrestamo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoprestamoLogic.getEntity(idTipoPrestamo);
					
					//tipoprestamoLogic.getEntityWithConnection(idTipoPrestamo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprestamoLogic.setTipoPrestamos(new ArrayList<TipoPrestamo>());
					tipoprestamoLogic.getTipoPrestamos().add(tipoprestamoLogic.getTipoPrestamo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprestamos=new ArrayList<TipoPrestamo>();
					this.tipoprestamos.add(tipoprestamo);
				}
				
				if(tipoprestamoLogic.getTipoPrestamo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoprestamoLogic.getTipoPrestamosFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoprestamoLogic.getTipoPrestamos()==null||tipoprestamoLogic.getTipoPrestamos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoprestamos==null|| tipoprestamos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprestamosAux=new ArrayList<TipoPrestamo>();
						tipoprestamosAux.addAll(tipoprestamoLogic.getTipoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprestamosAux=new ArrayList<TipoPrestamo>();
							tipoprestamosAux.addAll(tipoprestamos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoprestamoLogic.getTipoPrestamosFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoPrestamos("FK_IdCuentaContable",tipoprestamoLogic.getTipoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoPrestamos("FK_IdCuentaContable",tipoprestamos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprestamoLogic.setTipoPrestamos(new ArrayList<TipoPrestamo>());
						tipoprestamoLogic.getTipoPrestamos().addAll(tipoprestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprestamos=new ArrayList<TipoPrestamo>();
							tipoprestamos.addAll(tipoprestamosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoprestamoLogic.getTipoPrestamosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoprestamoLogic.getTipoPrestamos()==null||tipoprestamoLogic.getTipoPrestamos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoprestamos==null|| tipoprestamos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprestamosAux=new ArrayList<TipoPrestamo>();
						tipoprestamosAux.addAll(tipoprestamoLogic.getTipoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprestamosAux=new ArrayList<TipoPrestamo>();
							tipoprestamosAux.addAll(tipoprestamos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoprestamoLogic.getTipoPrestamosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoPrestamos("FK_IdEmpresa",tipoprestamoLogic.getTipoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoPrestamos("FK_IdEmpresa",tipoprestamos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprestamoLogic.setTipoPrestamos(new ArrayList<TipoPrestamo>());
						tipoprestamoLogic.getTipoPrestamos().addAll(tipoprestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprestamos=new ArrayList<TipoPrestamo>();
							tipoprestamos.addAll(tipoprestamosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoPrestamo")) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoPrestamo(id_rubro_empleaFK_IdTipoPrestamo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoprestamoLogic.getTipoPrestamosFK_IdTipoPrestamo(finalQueryGlobal,pagination,id_rubro_empleaFK_IdTipoPrestamo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoPrestamo(id_rubro_empleaFK_IdTipoPrestamo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoPrestamo(id_rubro_empleaFK_IdTipoPrestamo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoprestamoLogic.getTipoPrestamos()==null||tipoprestamoLogic.getTipoPrestamos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoprestamos==null|| tipoprestamos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprestamosAux=new ArrayList<TipoPrestamo>();
						tipoprestamosAux.addAll(tipoprestamoLogic.getTipoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprestamosAux=new ArrayList<TipoPrestamo>();
							tipoprestamosAux.addAll(tipoprestamos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoprestamoLogic.getTipoPrestamosFK_IdTipoPrestamo(finalQueryGlobal,pagination,id_rubro_empleaFK_IdTipoPrestamo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoPrestamo(id_rubro_empleaFK_IdTipoPrestamo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrestamoConstantesFunciones.getDetalleIndiceFK_IdTipoPrestamo(id_rubro_empleaFK_IdTipoPrestamo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoPrestamos("FK_IdTipoPrestamo",tipoprestamoLogic.getTipoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoPrestamos("FK_IdTipoPrestamo",tipoprestamos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprestamoLogic.setTipoPrestamos(new ArrayList<TipoPrestamo>());
						tipoprestamoLogic.getTipoPrestamos().addAll(tipoprestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprestamos=new ArrayList<TipoPrestamo>();
							tipoprestamos.addAll(tipoprestamosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoPrestamo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoPrestamo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprestamoLogic.getTipoPrestamos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprestamos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprestamoLogic.getTipoPrestamos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprestamos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoPrestamo tipoprestamo) {
		Boolean permite=true;
		
		if(this.tipoprestamo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoPrestamoConstantesFunciones.getOrderByListaTipoPrestamo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoPrestamoConstantesFunciones.getOrderByListaTipoPrestamo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrestamo tipoprestamo:tipoprestamoLogic.getTipoPrestamos()) {
				if(tipoprestamo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprestamoTotales=tipoprestamo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrestamo tipoprestamo:this.tipoprestamos) {
				if(tipoprestamo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprestamoTotales=tipoprestamo;
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
			this.tipoprestamoAux=new TipoPrestamo();
			this.tipoprestamoAux.setsType(Constantes2.S_TOTALES);
			this.tipoprestamoAux.setIsNew(false);
			this.tipoprestamoAux.setIsChanged(false);
			this.tipoprestamoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoPrestamoConstantesFunciones.TotalizarValoresFilaTipoPrestamo(this.tipoprestamoLogic.getTipoPrestamos(),this.tipoprestamoAux);
				
				this.tipoprestamoLogic.getTipoPrestamos().add(this.tipoprestamoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoPrestamoConstantesFunciones.TotalizarValoresFilaTipoPrestamo(this.tipoprestamos,this.tipoprestamoAux);
				
				this.tipoprestamos.add(this.tipoprestamoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoprestamoTotales=new TipoPrestamo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprestamoLogic.getTipoPrestamos().remove(tipoprestamoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprestamos.remove(tipoprestamoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoprestamoTotales=new TipoPrestamo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrestamo tipoprestamo:tipoprestamoLogic.getTipoPrestamos()) {
				if(tipoprestamo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprestamoTotales=tipoprestamo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPrestamoConstantesFunciones.TotalizarValoresFilaTipoPrestamo(this.tipoprestamoLogic.getTipoPrestamos(),tipoprestamoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrestamo tipoprestamo:this.tipoprestamos) {
				if(tipoprestamo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprestamoTotales=tipoprestamo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPrestamoConstantesFunciones.TotalizarValoresFilaTipoPrestamo(this.tipoprestamos,tipoprestamoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoPrestamosFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoPrestamosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoPrestamosFK_IdTipoPrestamo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPrestamo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoPrestamosFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprestamoLogic.getTipoPrestamosFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoPrestamosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprestamoLogic.getTipoPrestamosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoPrestamosFK_IdTipoPrestamo(String sFinalQuery,Long id_rubro_emplea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprestamoLogic.getTipoPrestamosFK_IdTipoPrestamo(sFinalQuery,this.pagination,id_rubro_emplea);
				
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
	
	public void inicializarPermisosTipoPrestamo() {
		this.isPermisoTodoTipoPrestamo=false;
		this.isPermisoNuevoTipoPrestamo=false;
		this.isPermisoActualizarTipoPrestamo=false;
		this.isPermisoActualizarOriginalTipoPrestamo=false;
		this.isPermisoEliminarTipoPrestamo=false;
		this.isPermisoGuardarCambiosTipoPrestamo=false;
		this.isPermisoConsultaTipoPrestamo=false;
		this.isPermisoBusquedaTipoPrestamo=false;
		this.isPermisoReporteTipoPrestamo=false;		
		this.isPermisoOrdenTipoPrestamo=false;		
		this.isPermisoPaginacionMedioTipoPrestamo=false;		
		this.isPermisoPaginacionAltoTipoPrestamo=false;
		this.isPermisoPaginacionTodoTipoPrestamo=false;
		this.isPermisoCopiarTipoPrestamo=false;		
		this.isPermisoVerFormTipoPrestamo=false;		
		this.isPermisoDuplicarTipoPrestamo=false;		
		this.isPermisoOrdenTipoPrestamo=false;		
	}
	
	public void setPermisosUsuarioTipoPrestamo(Boolean isPermiso) {
		this.isPermisoTodoTipoPrestamo=isPermiso;
		this.isPermisoNuevoTipoPrestamo=isPermiso;
		this.isPermisoActualizarTipoPrestamo=isPermiso;
		this.isPermisoActualizarOriginalTipoPrestamo=isPermiso;
		this.isPermisoEliminarTipoPrestamo=isPermiso;
		this.isPermisoGuardarCambiosTipoPrestamo=isPermiso;
		this.isPermisoConsultaTipoPrestamo=isPermiso;
		this.isPermisoBusquedaTipoPrestamo=isPermiso;
		this.isPermisoReporteTipoPrestamo=isPermiso;
		this.isPermisoOrdenTipoPrestamo=isPermiso;		
		this.isPermisoPaginacionMedioTipoPrestamo=isPermiso;		
		this.isPermisoPaginacionAltoTipoPrestamo=isPermiso;		
		this.isPermisoPaginacionTodoTipoPrestamo=isPermiso;		
		this.isPermisoCopiarTipoPrestamo=isPermiso;		
		this.isPermisoVerFormTipoPrestamo=isPermiso;		
		this.isPermisoDuplicarTipoPrestamo=isPermiso;
		this.isPermisoOrdenTipoPrestamo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoPrestamo(Boolean isPermiso) {
		//this.isPermisoTodoTipoPrestamo=isPermiso;
		this.isPermisoNuevoTipoPrestamo=isPermiso;
		this.isPermisoActualizarTipoPrestamo=isPermiso;
		this.isPermisoActualizarOriginalTipoPrestamo=isPermiso;
		this.isPermisoEliminarTipoPrestamo=isPermiso;
		this.isPermisoGuardarCambiosTipoPrestamo=isPermiso;
		//this.isPermisoConsultaTipoPrestamo=isPermiso;
		//this.isPermisoBusquedaTipoPrestamo=isPermiso;
		//this.isPermisoReporteTipoPrestamo=isPermiso;
		//this.isPermisoOrdenTipoPrestamo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoPrestamo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoPrestamo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoPrestamo=isPermiso;		
		//this.isPermisoCopiarTipoPrestamo=isPermiso;		
		//this.isPermisoDuplicarTipoPrestamo=isPermiso;
		//this.isPermisoOrdenTipoPrestamo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoPrestamoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PrestamoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoPrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPrestamo=false;
		this.isTienePermisosPrestamo=this.verificarGetPermisosUsuarioOpcionTipoPrestamoClaseRelacionada(this.opcionsRelacionadas,PrestamoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoPrestamo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoPrestamoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPrestamo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoPrestamoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoPrestamoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoPrestamoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPrestamo && this.jInternalFrameDetalleFormTipoPrestamo!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.remove(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoPrestamo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoPrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoPrestamoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoPrestamo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoPrestamo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoPrestamo=this.isPermisoActualizarTipoPrestamo;
			this.isPermisoEliminarTipoPrestamo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoPrestamo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoPrestamo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoPrestamo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoPrestamo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoPrestamo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPrestamo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoPrestamo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoPrestamo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoPrestamo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoPrestamo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoPrestamo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoPrestamo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPrestamo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoPrestamo.setToolTipText(this.jTableDatosTipoPrestamo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoPrestamo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoPrestamo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoPrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoPrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoPrestamo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPrestamo && this.tipoprestamoConstantesFunciones.mostrarPrestamoTipoPrestamo && !TipoPrestamoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Prestamo");
			reporte.setsDescripcion("Prestamo");
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
	public void inicializarCombosForeignKeyTipoPrestamoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.rubroempleasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoPrestamoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoPrestamoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoPrestamoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyRubroEmpleaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RubroEmpleaConstantesFunciones.SFINALQUERY;

				this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyTipoPrestamoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoPrestamoParameterReturnGeneral tipoprestamoReturnGeneral=new TipoPrestamoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoprestamoConstantesFunciones.cargarid_empresaTipoPrestamo)
					 || (this.esRecargarFks && this.tipoprestamoConstantesFunciones.cargarid_empresaTipoPrestamo)) {

					if(!this.tipoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoprestamoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalRubroEmplea="";

				if(((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0) && this.tipoprestamoConstantesFunciones.cargarid_rubro_empleaTipoPrestamo)
					 || (this.esRecargarFks && this.tipoprestamoConstantesFunciones.cargarid_rubro_empleaTipoPrestamo)) {

					if(!this.tipoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRubroEmplea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

						finalQueryGlobalRubroEmplea=Funciones.GetFinalQueryAppend(finalQueryGlobalRubroEmplea, "");
						finalQueryGlobalRubroEmplea+=RubroEmpleaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRubroEmplea=" WHERE " + ConstantesSql.ID + "="+tipoprestamoSessionBean.getlidRubroEmpleaActual();
					}
				} else {
					finalQueryGlobalRubroEmplea="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.tipoprestamoConstantesFunciones.cargarid_cuenta_contableTipoPrestamo)
					 || (this.esRecargarFks && this.tipoprestamoConstantesFunciones.cargarid_cuenta_contableTipoPrestamo)) {

					if(!this.tipoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+tipoprestamoSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoprestamoReturnGeneral=tipoprestamoLogic.cargarCombosLoteForeignKeyTipoPrestamo(finalQueryGlobalEmpresa,finalQueryGlobalRubroEmplea,finalQueryGlobalCuentaContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoprestamoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalRubroEmplea.equals("NONE")) {
				this.rubroempleasForeignKey=tipoprestamoReturnGeneral.getrubroempleasForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=tipoprestamoReturnGeneral.getcuentacontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoPrestamo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyRubroEmplea();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoprestamoSessionBean==null) {
				this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
			}

			if(!this.tipoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyRubroEmplea()throws Exception {
		try {

			if(!this.tipoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				RubroEmplea rubroemplea=new RubroEmplea();
				RubroEmpleaConstantesFunciones.setRubroEmpleaDescripcion(rubroemplea,Constantes.SMENSAJE_ESCOJA_OPCION);
				rubroemplea.setId(null);

				if(!RubroEmpleaConstantesFunciones.ExisteEnLista(this.rubroempleasForeignKey,rubroemplea,true)) {

					this.rubroempleasForeignKey.add(0,rubroemplea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.tipoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoPrestamo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoPrestamo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoPrestamo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrestamo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoPrestamo(TipoPrestamo tipoprestamo)throws Exception {	
		try {
			
			this.setActualRubroEmpleaForeignKey(tipoprestamo.getid_rubro_emplea(),false,"Formulario");
			this.setActualCuentaContableForeignKey(tipoprestamo.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoPrestamo(TipoPrestamo tipoprestamo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoPrestamo()throws Exception {	
		try {
			
			this.setActualRubroEmpleaForeignKey(this.tipoprestamoConstantesFunciones.getid_rubro_emplea(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.tipoprestamoConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrestamo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoPrestamo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoPrestamo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoPrestamo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoPrestamo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoPrestamo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoPrestamo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo!=null && this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo!=null && this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo!=null && this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public TipoPrestamoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoPrestamoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoPrestamoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoprestamoSessionBean=new TipoPrestamoSessionBean(); 
		this.tipoprestamoConstantesFunciones=new TipoPrestamoConstantesFunciones(); 
		this.tipoprestamoBean=new TipoPrestamo();//(this.tipoprestamoConstantesFunciones); 		
		this.tipoprestamoReturnGeneral=new TipoPrestamoParameterReturnGeneral(); 
		
		this.tipoprestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoPrestamoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoPrestamoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoPrestamoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoPrestamo(true);
			
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
			
			this.tipoprestamoConstantesFunciones=new TipoPrestamoConstantesFunciones(); 
			this.tipoprestamoBean=new TipoPrestamo();//this.tipoprestamoConstantesFunciones); 			
			this.tipoprestamoReturnGeneral=new TipoPrestamoParameterReturnGeneral(); 
		
			TipoPrestamoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Prestamo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoprestamo=new TipoPrestamo();
			this.tipoprestamos = new ArrayList<TipoPrestamo>();
			this.tipoprestamosAux = new ArrayList<TipoPrestamo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic=new TipoPrestamoLogic();
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoprestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoprestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoPrestamo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoPrestamo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPrestamo);	
					}
					
					if(this.jInternalFrameImportacionTipoPrestamo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPrestamo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoPrestamo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoPrestamo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPrestamo);
				this.jInternalFrameDetalleFormTipoPrestamo.setVisible(false);
				this.jInternalFrameDetalleFormTipoPrestamo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoPrestamo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPrestamo);
					this.jInternalFrameReporteDinamicoTipoPrestamo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoPrestamo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoPrestamo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoPrestamo);
					this.jInternalFrameImportacionTipoPrestamo.setVisible(false);
					this.jInternalFrameImportacionTipoPrestamo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoPrestamo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoPrestamo);
					this.jInternalFrameOrderByTipoPrestamo.setVisible(false);
					this.jInternalFrameOrderByTipoPrestamo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoPrestamoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoPrestamoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoprestamoReturnGeneral=new TipoPrestamoParameterReturnGeneral();
			
			this.tipoprestamoParameterGeneral=new TipoPrestamoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoprestamoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoPrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PrestamoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPrestamoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprestamoSessionBean.getEsGuardarRelacionado(),this.tipoprestamoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPrestamoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprestamoSessionBean.getEsGuardarRelacionado(),this.tipoprestamoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoPrestamo=false;
			this.isVisibilidadCeldaDuplicarTipoPrestamo=true;
			this.isVisibilidadCeldaCopiarTipoPrestamo=true;
			this.isVisibilidadCeldaVerFormTipoPrestamo=true;
			this.isVisibilidadCeldaOrdenTipoPrestamo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=false;
			this.isVisibilidadCeldaModificarTipoPrestamo=false;
			this.isVisibilidadCeldaActualizarTipoPrestamo=false;
			this.isVisibilidadCeldaEliminarTipoPrestamo=false;
			this.isVisibilidadCeldaCancelarTipoPrestamo=false;
			this.isVisibilidadCeldaGuardarTipoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=false;
			
			
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoPrestamo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoPrestamo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoPrestamo(false);
			
			this.setPermisosUsuarioTipoPrestamo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoprestamoSessionBean.getEsGuardarRelacionado() && this.tipoprestamoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoPrestamoClasesRelacionadas();
			}
			
			if(this.tipoprestamoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoPrestamoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoPrestamo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoPrestamo();
			}
			
			if(!this.isPermisoBusquedaTipoPrestamo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoPrestamo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoPrestamo,this.isPermisoPaginacionMedioTipoPrestamo,this.isPermisoPaginacionTodoTipoPrestamo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoPrestamoConstantesFunciones.getTiposSeleccionarTipoPrestamo());
				
				this.tiposColumnasSelect=TipoPrestamoConstantesFunciones.getTiposSeleccionarTipoPrestamo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoPrestamo();				
				//this.tiposRelacionesSelect=TipoPrestamoConstantesFunciones.getTiposRelacionesTipoPrestamo(true);
				
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
			//if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoPrestamo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoPrestamo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoPrestamo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrestamo() ;
			
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
			
			
			this.prestamoLogic=new PrestamoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.rubroempleaLogic=new RubroEmpleaLogic();
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
				tipoprestamoImplementable= (TipoPrestamoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPrestamoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoprestamoImplementableHome= (TipoPrestamoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPrestamoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoprestamos= new ArrayList<TipoPrestamo>();
			this.tipoprestamosEliminados= new ArrayList<TipoPrestamo>();
						
			this.isEsNuevoTipoPrestamo=false;
			this.esParaAccionDesdeFormularioTipoPrestamo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoPrestamo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoPrestamo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoPrestamoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoPrestamoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoPrestamo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			
		this.jButtonRelacionesFinNormalTipoPrestamoActionPerformed(null);;
						
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoPrestamo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoPrestamo();
			}
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoPrestamo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoPrestamo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoPrestamo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoPrestamo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoPrestamo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoPrestamo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PrestamoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PrestamoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoPrestamo")) {
				iIndex=this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();	
				
				

				if(sTitle.equals("Prestamos")) {
					if(!PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoPrestamo();

						this.cargarParteTabPanelRelacionadaPrestamo(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			
			if(sTipo.equals("RelacionesFinformas_de_pagoTipoPrestamo")) {
				iIndex=this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.getSelectedIndex();
				sTitle= this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.getTitleAt(iIndex);
				Integer intSelectedRow = 0;
				intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();

				if(sTitle.equals("Prestamos")) {
					if(!PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoPrestamo();

						this.cargarParteTabPanelRelacionadaPrestamo(iIndex,intSelectedRow);
					}
					
				}
			};
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoPrestamo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPrestamo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoPrestamo.cargarSessionConBeanSwingJInternalFramePrestamo(false,true,iIndex);
		this.jButtonPrestamoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPrestamo();

		//this.jTabbedPaneRelacionesTipoPrestamo.updateUI();
		//this.jTabbedPaneRelacionesTipoPrestamo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoPrestamo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Prestamo")) {
				int row=this.jTableDatosTipoPrestamo.getSelectedRow();
				jButtonPrestamoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Prestamo")) {

					if(this.isTienePermisosPrestamo && this.tipoprestamoConstantesFunciones.mostrarPrestamoTipoPrestamo && !TipoPrestamoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Prestamos"+"("+PrestamoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Prestamos");

						if(tipoprestamoConstantesFunciones.resaltarPrestamoTipoPrestamo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoprestamoConstantesFunciones.resaltarPrestamoTipoPrestamo);
						}

						jmenuItem.setEnabled(this.tipoprestamoConstantesFunciones.activarPrestamoTipoPrestamo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Prestamo"));

						

						this.jInternalFrameDetalleFormTipoPrestamo.jmenuDetalleTipoPrestamo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoPrestamo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoPrestamo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoPrestamo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoPrestamoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoPrestamo();
		
		this.cargarCombosFrameForeignKeyTipoPrestamo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoPrestamo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoPrestamo();
		}
	}
	
	

	public void cargarCombosForeignKeyRubroEmplea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaRubroEmplea(this.rubroempleasForeignKey);

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
	
	public void jButtonNuevoTipoPrestamoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoprestamoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
			
			if(jTableDatosTipoPrestamo.getRowCount()>=1) {
				jTableDatosTipoPrestamo.removeRowSelectionInterval(0, jTableDatosTipoPrestamo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoPrestamo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoPrestamo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoPrestamo(true);			
			//this.tipoprestamo=new TipoPrestamo();
			//this.tipoprestamo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrestamo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrestamo() ;
			
			if(TipoPrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrestamo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoprestamo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);				
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
			if(this.tipoprestamoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoPrestamo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoPrestamoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoPrestamo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoPrestamo.getSelectedRows().length;			
			}
			
			tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoPrestamo--;			
				//TipoPrestamo tipoprestamoAux= new TipoPrestamo();			
				//tipoprestamoAux.setId(this.iIdNuevoTipoPrestamo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoPrestamo tipoprestamoOrigen=new TipoPrestamo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoPrestamo tipoprestamoOrigen : tipoprestamosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoprestamoOrigen =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprestamoOrigen =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoPrestamo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoprestamo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoPrestamo(tipoprestamoOrigen,this.tipoprestamo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprestamoLogic.getTipoPrestamos().add(this.tipoprestamoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprestamos.add(this.tipoprestamoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoPrestamo(false);
				
				this.jTableDatosTipoPrestamo.setRowSelectionInterval(this.getIndiceNuevoTipoPrestamo(), this.getIndiceNuevoTipoPrestamo());
				
				int iLastRow =  this.jTableDatosTipoPrestamo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPrestamo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPrestamo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrestamo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();									
		
			TipoPrestamo tipoprestamoOrigen=new TipoPrestamo();
			TipoPrestamo tipoprestamoDestino=new TipoPrestamo();
				
			tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoPrestamo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoprestamosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoPrestamo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprestamoOrigen =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprestamoOrigen =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprestamoDestino =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprestamoDestino =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoprestamoOrigen =tipoprestamosSeleccionados.get(0);
				tipoprestamoDestino =tipoprestamosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoPrestamo(tipoprestamoOrigen,tipoprestamoDestino,true,false);
				
				tipoprestamoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprestamoDestino,tipoprestamoLogic.getTipoPrestamos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprestamoDestino,tipoprestamos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoPrestamo(false);
				
				//this.jTableDatosTipoPrestamo.setRowSelectionInterval(this.getIndiceNuevoTipoPrestamo(), this.getIndiceNuevoTipoPrestamo());
				
				int iLastRow =  this.jTableDatosTipoPrestamo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPrestamo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPrestamo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrestamo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoPrestamo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoPrestamo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoPrestamo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoPrestamo.setVisible(!isVisible);
			this.jPanelPaginacionTipoPrestamo.setVisible(!isVisible);
			this.jPanelAccionesTipoPrestamo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoPrestamo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoPrestamo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoPrestamo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoPrestamo();
			
			this.abrirFrameOrderByTipoPrestamo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoPrestamo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoPrestamo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPrestamo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoPrestamo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoPrestamo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoPrestamo.setSize(this.jInternalFrameDetalleFormTipoPrestamo.iWidthFormulario,this.jInternalFrameDetalleFormTipoPrestamo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoPrestamo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoPrestamo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoPrestamo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoPrestamo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoPrestamo.jContentPaneDetalleTipoPrestamo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoPrestamo.jContentPaneDetalleTipoPrestamo.getWidth(),TipoPrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoPrestamo.jContentPaneDetalleTipoPrestamo.getWidth(),TipoPrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoPrestamo.jContentPaneDetalleTipoPrestamo.getWidth(),TipoPrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPrestamo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoPrestamo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoPrestamo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoPrestamo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoPrestamo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrestamo,false,this);
				} else {
					this.jInternalFrameOrderByTipoPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrestamo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoPrestamo);
				this.jInternalFrameOrderByTipoPrestamo.setVisible(false);
				this.jInternalFrameOrderByTipoPrestamo.setSelected(false);
				
				this.jInternalFrameOrderByTipoPrestamo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPrestamo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoPrestamo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoPrestamo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoPrestamo==null) {
				
				this.jInternalFrameImportacionTipoPrestamo=new ImportacionJInternalFrame(TipoPrestamoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPrestamo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoPrestamo);
				this.jInternalFrameImportacionTipoPrestamo.setVisible(false);
				this.jInternalFrameImportacionTipoPrestamo.setSelected(false);


				this.jInternalFrameImportacionTipoPrestamo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPrestamo"));
				this.jInternalFrameImportacionTipoPrestamo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPrestamo"));
				this.jInternalFrameImportacionTipoPrestamo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPrestamo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoPrestamo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoPrestamo==null) {
				this.jInternalFrameReporteDinamicoTipoPrestamo=new ReporteDinamicoJInternalFrame(TipoPrestamoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPrestamo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPrestamo);
				this.jInternalFrameReporteDinamicoTipoPrestamo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoPrestamo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoPrestamo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrestamo"));
				this.jInternalFrameReporteDinamicoTipoPrestamo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrestamo"));
				this.jInternalFrameReporteDinamicoTipoPrestamo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrestamo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrestamo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPrestamo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoPrestamo.jContentPaneDetalleTipoPrestamo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoPrestamo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPrestamo);
			
	       	this.jInternalFrameDetalleFormTipoPrestamo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoPrestamo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoPrestamo.dispose();
			//this.jInternalFrameDetalleFormTipoPrestamo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoPrestamo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoPrestamo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoPrestamo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoPrestamo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoPrestamo.setVisible(true);
	        this.jInternalFrameImportacionTipoPrestamo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoPrestamo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoPrestamo.setVisible(true);
	        this.jInternalFrameOrderByTipoPrestamo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoPrestamo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoPrestamo.setVisible(false);
	        this.jInternalFrameOrderByTipoPrestamo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoPrestamo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoPrestamo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoPrestamo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoPrestamo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoPrestamo.setVisible(false);
	        this.jInternalFrameImportacionTipoPrestamo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderTipoPrestamo=(TitledBorder)this.jScrollPanelDatosTipoPrestamo.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderTipoPrestamo.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoPrestamo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoPrestamo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoPrestamo(true);
			//this.isEsNuevoTipoPrestamo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoPrestamo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrestamo(false) ;
			
			if(tipoprestamoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoSessionBean.getEsGuardarRelacionado() && PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPrestamoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoPrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrestamo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrestamo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoPrestamoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoPrestamo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoPrestamo(true);
			//this.isEsNuevoTipoPrestamo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoprestamo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoPrestamo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoPrestamo(false) ;
			
			if(TipoPrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrestamo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrestamo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaRubroEmplea(List<RubroEmplea> rubroempleasForeignKey)throws Exception{
		TableColumn tableColumnRubroEmplea=this.jTableDatosTipoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA));
		TableCellEditor tableCellEditorRubroEmplea =tableColumnRubroEmplea.getCellEditor();

		RubroEmpleaTableCell rubroempleaTableCellFk=(RubroEmpleaTableCell)tableCellEditorRubroEmplea;

		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.setrubroempleasForeignKey(rubroempleasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoPrestamo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//rubroempleaTableCellFk.setRowActual(intSelectedRow);
			//rubroempleaTableCellFk.setrubroempleasForeignKeyActual(rubroempleasForeignKey);
		//}


		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.RecargarRubroEmpleasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosTipoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoPrestamo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoPrestamo(false);
			
			//if(!this.isEsNuevoTipoPrestamo) {								
				int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
				
			}
			
			if(this.permiteMantenimiento(this.tipoprestamo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoPrestamo=true;
					this.inicializarActualizarBindingTablaTipoPrestamo(false);
					this.isEsNuevoTipoPrestamo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoPrestamo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoPrestamo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPrestamo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrestamo(false);
				
				this.habilitarDeshabilitarControlesTipoPrestamo(false);
			
												
				
				if(TipoPrestamoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoPrestamo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoPrestamoActionPerformed(evt,tipoprestamoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoPrestamo(this.tipoprestamo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoPrestamo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoprestamoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoprestamo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoPrestamo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrestamo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				this.tipoprestamo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				this.tipoprestamo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoprestamo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoPrestamoModel) this.jTableDatosTipoPrestamo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoPrestamo=true;
				this.inicializarActualizarBindingTablaTipoPrestamo(false);
				this.isEsNuevoTipoPrestamo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPrestamo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrestamo(false);
				
				this.habilitarDeshabilitarControlesTipoPrestamo(false);
				
				
				
				if(TipoPrestamoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoPrestamo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoPrestamo.getRowCount()>=1) {
				jTableDatosTipoPrestamo.removeRowSelectionInterval(0, jTableDatosTipoPrestamo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoPrestamo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoPrestamo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrestamo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrestamo(false) ;
			
			this.isEsNuevoTipoPrestamo=false;
			
			if(TipoPrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoPrestamo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoPrestamo(false);
				
				//SI ES MANUAL
				if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoPrestamo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoPrestamo--;			
			//TipoPrestamo tipoprestamoAux= new TipoPrestamo();			
			//tipoprestamoAux.setId(this.iIdNuevoTipoPrestamo);
			
			if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoPrestamo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
			
			this.tipoprestamo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoprestamoLogic.getTipoPrestamos().add(this.tipoprestamoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoprestamos.add(this.tipoprestamoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoPrestamo(false);
			
			this.jTableDatosTipoPrestamo.setRowSelectionInterval(this.getIndiceNuevoTipoPrestamo(), this.getIndiceNuevoTipoPrestamo());
			
			int iLastRow =  this.jTableDatosTipoPrestamo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoPrestamo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoPrestamo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoPrestamo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoPrestamo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrestamo(false);
			
			//SI ES MANUAL
			if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrestamo();
			}
			
			//this.abrirFrameTreeTipoPrestamo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo PrestamoS ?", "MANTENIMIENTO DE Tipo Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoPrestamo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoPrestamo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoprestamoReturnGeneral=tipoprestamoLogic.procesarImportacionTipoPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoprestamoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoPrestamoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoPrestamo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoPrestamo.setFileImportacion(this.jInternalFrameImportacionTipoPrestamo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoPrestamo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoPrestamo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoPrestamo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoPrestamo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();		

		tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoPrestamoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoPrestamoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoPrestamos("Todos",tipoprestamosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrestamo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RubroEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RubroEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RubroEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RubroEmplea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPrestamoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPrestamoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPrestamoConstantesFunciones.LABEL_CONPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nPago_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoPrestamo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoria="id_rubro_emplea";
					break;

				case TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case TipoPrestamoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoPrestamoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoPrestamoConstantesFunciones.LABEL_CONPAGO:
					sNombreCampoCategoria="con_pago";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoriaValor="id_rubro_emplea";
					break;

				case TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case TipoPrestamoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoPrestamoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoPrestamoConstantesFunciones.LABEL_CONPAGO:
					sNombreCampoCategoriaValor="con_pago";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoPrestamo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Idrubro Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_rubro_emplea");
					break;

				case TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case TipoPrestamoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoPrestamoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoPrestamoConstantesFunciones.LABEL_CONPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_pago");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();		
		
		tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprestamo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoPrestamos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoPrestamo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoPrestamo tipoprestamo:tipoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprestamo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA);
					iRow++;

					for(TipoPrestamo tipoprestamo:tipoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprestamo.getrubroemplea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(TipoPrestamo tipoprestamo:tipoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprestamo.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPrestamoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoPrestamo tipoprestamo:tipoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprestamo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPrestamoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoPrestamo tipoprestamo:tipoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprestamo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPrestamoConstantesFunciones.LABEL_CONPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_CONPAGO);
					iRow++;

					for(TipoPrestamo tipoprestamo:tipoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprestamo.getcon_pago());
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
			//	this.getFilaCabeceraExportarExcelTipoPrestamo(row);				
			//	iRow++;
			//}				
			
			//for(TipoPrestamo tipoprestamoAux:tipoprestamosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoPrestamo(tipoprestamoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prestamo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrestamo(false);
			
			//SI ES MANUAL
			if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrestamo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrestamo(false);
			
			//SI ES MANUAL
			if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPrestamo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrestamo(false);
			
			//SI ES MANUAL
			if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPrestamo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoPrestamo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoPrestamo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoPrestamo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoPrestamo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoPrestamo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoPrestamo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoPrestamo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoPrestamo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoPrestamo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoPrestamo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoPrestamo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoPrestamo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoPrestamo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoPrestamo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrestamo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoPrestamo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoPrestamo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoPrestamo();
		
		this.inicializarActualizarBindingBotonesManualTipoPrestamo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPrestamo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrestamo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrestamo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrestamo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoPrestamo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoPrestamo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoPrestamo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxPostAccionNuevoTipoPrestamo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxPostAccionSinCerrarTipoPrestamo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxPostAccionSinMensajeTipoPrestamo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoPrestamo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoPrestamo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoPrestamo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
				this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxPostAccionNuevoTipoPrestamo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxPostAccionSinCerrarTipoPrestamo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxPostAccionSinMensajeTipoPrestamo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoPrestamo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoPrestamo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoPrestamo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoPrestamo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoPrestamo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoPrestamo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoPrestamo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoPrestamo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoPrestamo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrestamo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoPrestamo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoPrestamo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoPrestamo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrestamo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrestamo() throws Exception {
		try	{
			if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPrestamo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPrestamo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPrestamo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoPrestamo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoPrestamo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoPrestamo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoPrestamo.addItem(reporte);
			}
			
			
			if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoPrestamo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoPrestamo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoPrestamo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoPrestamo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoPrestamo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoPrestamo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrestamo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrestamo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPrestamo!=null) {
				this.jInternalFrameReporteDinamicoTipoPrestamo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPrestamo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPrestamo!=null) {
				this.jInternalFrameReporteDinamicoTipoPrestamo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPrestamo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoPrestamo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoPrestamo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPrestamo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPrestamo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoPrestamo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPrestamo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPrestamo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoPrestamo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableTipoPrestamo.getSelectedItem()).getId();}
		if(this.jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.getSelectedItem()!=null){this.id_rubro_empleaFK_IdTipoPrestamo=((RubroEmplea)this.jComboBoxid_rubro_empleaFK_IdTipoPrestamoTipoPrestamo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoPrestamo(Boolean esInicializar) throws Exception {				
		if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPrestamo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoPrestamo() throws Exception {
		this.inicializarActualizarBindingTablaTipoPrestamo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoPrestamo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoPrestamoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoPrestamoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoPrestamoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoPrestamoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoPrestamoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoPrestamo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoprestamoLogic.getTipoPrestamos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoprestamos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoPrestamo.setModel(new TipoPrestamoModel(this.tipoprestamoLogic.getTipoPrestamos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoPrestamo.setModel(new TipoPrestamoModel(this.tipoprestamos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoPrestamo!=null && this.jInternalFrameOrderByTipoPrestamo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoPrestamo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoPrestamoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO,tipoprestamoConstantesFunciones.resaltarSeleccionarTipoPrestamo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO,tipoprestamoConstantesFunciones.resaltarSeleccionarTipoPrestamo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,TipoPrestamoConstantesFunciones.LABEL_ID));

		if(this.tipoprestamoConstantesFunciones.mostraridTipoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrestamoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoprestamoConstantesFunciones.resaltaridTipoPrestamo,this.tipoprestamoConstantesFunciones.activaridTipoPrestamo,this,true,"idTipoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprestamoConstantesFunciones.resaltaridTipoPrestamo,this.tipoprestamoConstantesFunciones.activaridTipoPrestamo,this,true,"idTipoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoprestamoConstantesFunciones.mostrarid_empresaTipoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoprestamoConstantesFunciones.resaltarid_empresaTipoPrestamo,this,this.tipoprestamoConstantesFunciones.activarid_empresaTipoPrestamo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoprestamoConstantesFunciones.resaltarid_empresaTipoPrestamo,this,this.tipoprestamoConstantesFunciones.activarid_empresaTipoPrestamo,false,"id_empresaTipoPrestamo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA));

		if(this.tipoprestamoConstantesFunciones.mostrarid_rubro_empleaTipoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.tipoprestamoConstantesFunciones.resaltarid_rubro_empleaTipoPrestamo,this,this.tipoprestamoConstantesFunciones.activarid_rubro_empleaTipoPrestamo));
			tableColumn.setCellEditor(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.tipoprestamoConstantesFunciones.resaltarid_rubro_empleaTipoPrestamo,this,this.tipoprestamoConstantesFunciones.activarid_rubro_empleaTipoPrestamo,true,"id_rubro_empleaTipoPrestamo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.tipoprestamoConstantesFunciones.mostrarid_cuenta_contableTipoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.tipoprestamoConstantesFunciones.resaltarid_cuenta_contableTipoPrestamo,this,this.tipoprestamoConstantesFunciones.activarid_cuenta_contableTipoPrestamo));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.tipoprestamoConstantesFunciones.resaltarid_cuenta_contableTipoPrestamo,this,this.tipoprestamoConstantesFunciones.activarid_cuenta_contableTipoPrestamo,true,"id_cuenta_contableTipoPrestamo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new TipoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,TipoPrestamoConstantesFunciones.LABEL_CODIGO));

		if(this.tipoprestamoConstantesFunciones.mostrarcodigoTipoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrestamoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprestamoConstantesFunciones.resaltarcodigoTipoPrestamo,this.tipoprestamoConstantesFunciones.activarcodigoTipoPrestamo,this,true,"codigoTipoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprestamoConstantesFunciones.resaltarcodigoTipoPrestamo,this.tipoprestamoConstantesFunciones.activarcodigoTipoPrestamo,this,true,"codigoTipoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,TipoPrestamoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoprestamoConstantesFunciones.mostrarnombreTipoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrestamoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprestamoConstantesFunciones.resaltarnombreTipoPrestamo,this.tipoprestamoConstantesFunciones.activarnombreTipoPrestamo,this,true,"nombreTipoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprestamoConstantesFunciones.resaltarnombreTipoPrestamo,this.tipoprestamoConstantesFunciones.activarnombreTipoPrestamo,this,true,"nombreTipoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,TipoPrestamoConstantesFunciones.LABEL_CONPAGO));

		if(this.tipoprestamoConstantesFunciones.mostrarcon_pagoTipoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrestamoConstantesFunciones.LABEL_CONPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipoprestamoConstantesFunciones.resaltarcon_pagoTipoPrestamo,this.tipoprestamoConstantesFunciones.activarcon_pagoTipoPrestamo));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipoprestamoConstantesFunciones.resaltarcon_pagoTipoPrestamo,this.tipoprestamoConstantesFunciones.activarcon_pagoTipoPrestamo,this,true,"con_pagoTipoPrestamo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPrestamo && this.tipoprestamoConstantesFunciones.mostrarPrestamoTipoPrestamo && !TipoPrestamoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Prestamos");
				tableColumn.setHeaderValue("Prestamos");
				tableColumn.setCellRenderer(new PrestamoTableCell(tipoprestamoConstantesFunciones.resaltarPrestamoTipoPrestamo,this,this.tipoprestamoConstantesFunciones.activarPrestamoTipoPrestamo));
				tableColumn.setCellEditor(new PrestamoTableCell(tipoprestamoConstantesFunciones.resaltarPrestamoTipoPrestamo,this,this.tipoprestamoConstantesFunciones.activarPrestamoTipoPrestamo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoPrestamo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprestamoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprestamoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPrestamo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprestamoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprestamoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPrestamo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoprestamoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoprestamoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoPrestamo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoprestamoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoPrestamo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoPrestamo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprestamoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoPrestamo.moveColumn(this.jTableDatosTipoPrestamo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoPrestamo.moveColumn(this.jTableDatosTipoPrestamo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprestamoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoPrestamo.moveColumn(this.jTableDatosTipoPrestamo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoPrestamo.moveColumn(this.jTableDatosTipoPrestamo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoPrestamo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoPrestamo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoPrestamo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoPrestamo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoPrestamo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoPrestamo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoPrestamo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoPrestamo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoprestamoLogic.getTipoPrestamos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoprestamos.size()-1;
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
		//this.jTableDatosTipoPrestamo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoPrestamo();
			
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
				
				//this.isEsNuevoTipoPrestamo=false;
					
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
				if(this.tipoprestamoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoPrestamo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPrestamo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPrestamo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoprestamo.getsType().equals("DUPLICADO")
				   || this.tipoprestamo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoPrestamo=true;
				
				} else {
					this.isEsNuevoTipoPrestamo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoprestamo.getId()>=0 && !this.tipoprestamo.getIsNew()) {						
						this.isEsNuevoTipoPrestamo=false;
						
					} else {
						this.isEsNuevoTipoPrestamo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoPrestamo(esRelaciones);						
				
				this.seleccionarTipoPrestamo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoprestamo.getId()<0) {
					this.isEsNuevoTipoPrestamo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoPrestamo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoPrestamo(evt,rowIndex);
				}	
				
				if(this.tipoprestamoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoPrestamo: " + this.dDif); 
					}
				}								
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoPrestamo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoprestamo)) {
					if(this.tipoprestamo.getId()>0) {
						this.tipoprestamo.setIsDeleted(true);
						
						this.tipoprestamosEliminados.add(this.tipoprestamo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprestamoLogic.getTipoPrestamos().remove(this.tipoprestamo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprestamos.remove(this.tipoprestamo);				
					}
					
					
					((TipoPrestamoModel) this.jTableDatosTipoPrestamo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrestamo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoPrestamo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoPrestamo) {
			
			if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPrestamo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPrestamo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoPrestamo(this.tipoprestamo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoprestamoConstantesFunciones.cargarid_empresaTipoPrestamo || this.tipoprestamoConstantesFunciones.event_dependid_empresaTipoPrestamo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoprestamo.getid_empresa());
									//this.inicializarActualizarBindingTipoPrestamo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoprestamo.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoprestamo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoprestamo.getid_empresa(),false,"Formulario");

					//RubroEmplea
					if(!this.tipoprestamoConstantesFunciones.cargarid_rubro_empleaTipoPrestamo || this.tipoprestamoConstantesFunciones.event_dependid_rubro_empleaTipoPrestamo) {
						//this.cargarCombosRubroEmpleasForeignKeyLista(" where id="+this.tipoprestamo.getid_rubro_emplea());
									//this.inicializarActualizarBindingTipoPrestamo(false,false);
						this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

						if(tipoprestamo.getRubroEmplea()!=null) {
							this.rubroempleasForeignKey.add(tipoprestamo.getRubroEmplea());
						}

						this.addItemDefectoCombosForeignKeyRubroEmplea();
						this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
					}
					this.setActualRubroEmpleaForeignKey(this.tipoprestamo.getid_rubro_emplea(),false,"Formulario");

					//CuentaContable
					if(!this.tipoprestamoConstantesFunciones.cargarid_cuenta_contableTipoPrestamo || this.tipoprestamoConstantesFunciones.event_dependid_cuenta_contableTipoPrestamo) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.tipoprestamo.getid_cuenta_contable());
									//this.inicializarActualizarBindingTipoPrestamo(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(tipoprestamo.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(tipoprestamo.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.tipoprestamo.getid_cuenta_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoPrestamo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoPrestamo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrestamo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPrestamo(TipoPrestamo tipoprestamo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoPrestamo(tipoprestamo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPrestamo(TipoPrestamo tipoprestamo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoPrestamo(tipoprestamo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoPrestamo(tipoprestamo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoPrestamo(tipoprestamo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoPrestamo(TipoPrestamo tipoprestamo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoPrestamo.jLabelidTipoPrestamo.setText(tipoprestamo.getId().toString());
			this.jInternalFrameDetalleFormTipoPrestamo.jTextFieldcodigoTipoPrestamo.setText(tipoprestamo.getcodigo());
			this.jInternalFrameDetalleFormTipoPrestamo.jTextAreanombreTipoPrestamo.setText(tipoprestamo.getnombre());
			this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxcon_pagoTipoPrestamo.setSelected(tipoprestamo.getcon_pago());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoPrestamo tipoprestamoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoprestamoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoPrestamo tipoprestamoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoprestamoLocal=this.tipoprestamo;
			} else {
				tipoprestamoLocal=this.tipoprestamoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoprestamoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoPrestamo(tipoprestamoLocal,true);
					
					if(tipoprestamoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoprestamoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoprestamoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoPrestamo(TipoPrestamo tipoprestamo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPrestamo(tipoprestamo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(tipoprestamo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPrestamo(TipoPrestamo tipoprestamo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPrestamo(tipoprestamo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPrestamo(TipoPrestamo tipoprestamo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoPrestamo.jLabelidTipoPrestamo.getText()==null || this.jInternalFrameDetalleFormTipoPrestamo.jLabelidTipoPrestamo.getText()=="" || this.jInternalFrameDetalleFormTipoPrestamo.jLabelidTipoPrestamo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoPrestamo.jLabelidTipoPrestamo.setText("0");
			}

			if(conColumnasBase) {tipoprestamo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoPrestamo.jLabelidTipoPrestamo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPrestamoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrestamo.jLabelIdTipoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprestamo.setcodigo(this.jInternalFrameDetalleFormTipoPrestamo.jTextFieldcodigoTipoPrestamo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPrestamoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrestamo.jLabelcodigoTipoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprestamo.setnombre(this.jInternalFrameDetalleFormTipoPrestamo.jTextAreanombreTipoPrestamo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPrestamoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrestamo.jLabelnombreTipoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprestamo.setcon_pago(this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxcon_pagoTipoPrestamo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPrestamoConstantesFunciones.LABEL_CONPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrestamo.jLabelcon_pagoTipoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPrestamo(TipoPrestamo tipoprestamoBean,TipoPrestamo tipoprestamo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipoprestamoBean.getid_rubro_emplea()!=null && !tipoprestamoBean.getid_rubro_emplea().equals(-1L))) {tipoprestamo.setid_rubro_emplea(tipoprestamoBean.getid_rubro_emplea());}
			if(conDefault || (!conDefault && tipoprestamoBean.getid_cuenta_contable()!=null && !tipoprestamoBean.getid_cuenta_contable().equals(-1L))) {tipoprestamo.setid_cuenta_contable(tipoprestamoBean.getid_cuenta_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoPrestamo(TipoPrestamo tipoprestamoOrigen,TipoPrestamo tipoprestamo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprestamoOrigen.getId()!=null && !tipoprestamoOrigen.getId().equals(0L))) {tipoprestamo.setId(tipoprestamoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoprestamoOrigen.getid_rubro_emplea()!=null && !tipoprestamoOrigen.getid_rubro_emplea().equals(-1L))) {tipoprestamo.setid_rubro_emplea(tipoprestamoOrigen.getid_rubro_emplea());}
			if(conDefault || (!conDefault && tipoprestamoOrigen.getid_cuenta_contable()!=null && !tipoprestamoOrigen.getid_cuenta_contable().equals(-1L))) {tipoprestamo.setid_cuenta_contable(tipoprestamoOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && tipoprestamoOrigen.getcodigo()!=null && !tipoprestamoOrigen.getcodigo().equals(""))) {tipoprestamo.setcodigo(tipoprestamoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoprestamoOrigen.getnombre()!=null && !tipoprestamoOrigen.getnombre().equals(""))) {tipoprestamo.setnombre(tipoprestamoOrigen.getnombre());}
			if(conDefault || (!conDefault && tipoprestamoOrigen.getcon_pago()!=null && !tipoprestamoOrigen.getcon_pago().equals(false))) {tipoprestamo.setcon_pago(tipoprestamoOrigen.getcon_pago());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPrestamo(TipoPrestamo tipoprestamo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPrestamo.jLabelidTipoPrestamo.setText(tipoprestamo.getId().toString());
			this.jInternalFrameDetalleFormTipoPrestamo.jTextFieldcodigoTipoPrestamo.setText(tipoprestamo.getcodigo());
			this.jInternalFrameDetalleFormTipoPrestamo.jTextAreanombreTipoPrestamo.setText(tipoprestamo.getnombre());
			this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxcon_pagoTipoPrestamo.setSelected(tipoprestamo.getcon_pago());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPrestamo(TipoPrestamoBean tipoprestamoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPrestamo.jLabelidTipoPrestamo.setText(tipoprestamoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoPrestamo.jTextFieldcodigoTipoPrestamo.setText(tipoprestamoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoPrestamo.jTextAreanombreTipoPrestamo.setText(tipoprestamoBean.getnombre());
			this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxcon_pagoTipoPrestamo.setSelected(tipoprestamoBean.getcon_pago());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoPrestamo(TipoPrestamoParameterReturnGeneral tipoprestamoReturnGeneral,TipoPrestamoBean tipoprestamoBean,Boolean conDefault) throws Exception { 
		try {
			TipoPrestamo tipoprestamoLocal=new TipoPrestamo();
			
			tipoprestamoLocal=tipoprestamoReturnGeneral.getTipoPrestamo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprestamoLocal.getId()!=null && !tipoprestamoLocal.getId().equals(0L))) {tipoprestamoBean.setId(tipoprestamoLocal.getId());}}
			if(conDefault || (!conDefault && tipoprestamoLocal.getid_rubro_emplea()!=null && !tipoprestamoLocal.getid_rubro_emplea().equals(-1L))) {tipoprestamoBean.setid_rubro_emplea(tipoprestamoLocal.getid_rubro_emplea());}
			if(conDefault || (!conDefault && tipoprestamoLocal.getid_cuenta_contable()!=null && !tipoprestamoLocal.getid_cuenta_contable().equals(-1L))) {tipoprestamoBean.setid_cuenta_contable(tipoprestamoLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && tipoprestamoLocal.getcodigo()!=null && !tipoprestamoLocal.getcodigo().equals(""))) {tipoprestamoBean.setcodigo(tipoprestamoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoprestamoLocal.getnombre()!=null && !tipoprestamoLocal.getnombre().equals(""))) {tipoprestamoBean.setnombre(tipoprestamoLocal.getnombre());}
			if(conDefault || (!conDefault && tipoprestamoLocal.getcon_pago()!=null && !tipoprestamoLocal.getcon_pago().equals(false))) {tipoprestamoBean.setcon_pago(tipoprestamoLocal.getcon_pago());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoPrestamoGenerico(Long idTipoPrestamoSeleccionado,JComboBox jComboBoxTipoPrestamo,List<TipoPrestamo> tipoprestamosLocal)throws Exception {
		try {
			TipoPrestamo  tipoprestamoTemp=null;

			for(TipoPrestamo tipoprestamoAux:tipoprestamosLocal) {
				if(tipoprestamoAux.getId()!=null && tipoprestamoAux.getId().equals(idTipoPrestamoSeleccionado)) {
					tipoprestamoTemp=tipoprestamoAux;
					break;
				}
			}

			jComboBoxTipoPrestamo.setSelectedItem(tipoprestamoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoPrestamoGenerico(JComboBox jComboBoxTipoPrestamo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPrestamo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoPrestamo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPrestamo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoPrestamo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Prestamo")) {
			jButtonPrestamoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprestamo=(TipoPrestamo) tipoprestamoLogic.getTipoPrestamos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprestamo =(TipoPrestamo) tipoprestamos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoprestamo.getIsNew() && !tipoprestamo.getIsChanged() && !tipoprestamo.getIsDeleted()) {
				sDescripcion=tipoprestamo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoprestamo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("RubroEmplea")) {
			//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
			if(!tipoprestamo.getIsNew() && !tipoprestamo.getIsChanged() && !tipoprestamo.getIsDeleted()) {
				sDescripcion=tipoprestamo.getrubroemplea_descripcion();
			} else {
				//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoprestamo.getrubroemplea_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!tipoprestamo.getIsNew() && !tipoprestamo.getIsChanged() && !tipoprestamo.getIsDeleted()) {
				sDescripcion=tipoprestamo.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=tipoprestamo.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoPrestamo tipoprestamoRow=new TipoPrestamo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprestamoRow=(TipoPrestamo) tipoprestamoLogic.getTipoPrestamos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprestamoRow=(TipoPrestamo) tipoprestamos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPrestamoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoPrestamo tipoprestamo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoPrestamo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprestamo = (TipoPrestamo)this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoprestamo = (TipoPrestamo)this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoprestamo!=null) {
						this.tipoprestamo = tipoprestamo;
					} else {
						this.tipoprestamo = new TipoPrestamo();
					}
				}

				if(this.isTienePermisosPrestamo && this.permiteMantenimiento(this.tipoprestamo)) {
					PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFramePopup=new PrestamoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						prestamoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFramePopup;
					} else {
						prestamoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame;
					}

					List<TipoPrestamo> tipoprestamos=new ArrayList<TipoPrestamo>();
					tipoprestamos.add(this.tipoprestamo);
					if(!esRelacionado) {
						//prestamoBeanSwingJInternalFrame.prestamoSessionBean.setConGuardarRelaciones(false);
						//prestamoBeanSwingJInternalFrame.prestamoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					prestamoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoPrestamo.cargarPrestamoBeanSwingJInternalFrame(tipoprestamos,this.tipoprestamo,prestamoBeanSwingJInternalFrame,/*conInicializar,*/prestamoBeanSwingJInternalFrame.prestamoSessionBean.getConGuardarRelaciones(),prestamoBeanSwingJInternalFrame.prestamoSessionBean.getEsGuardarRelacionado());
					prestamoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						prestamoBeanSwingJInternalFrame.actualizarEstadoPanelsPrestamo("no_relacionado");

						prestamoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PrestamoConstantesFunciones.ITAMANIOFILATABLA + (PrestamoConstantesFunciones.ITAMANIOFILATABLA/2));

						prestamoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoPrestamo=(TitledBorder)this.jScrollPanelDatosTipoPrestamo.getBorder();
						TitledBorder titledBorderPrestamo=(TitledBorder)prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.getBorder();

						titledBorderPrestamo.setTitle(titledBorderTipoPrestamo.getTitle() + " -> Prestamo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,prestamoBeanSwingJInternalFrame);
						}

						prestamoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(prestamoBeanSwingJInternalFrame);

						prestamoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoprestamoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Prestamo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoPrestamo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoPrestamo.setVisible((this.isVisibilidadCeldaNuevoTipoPrestamo && this.isPermisoNuevoTipoPrestamo));			
			this.jButtonDuplicarTipoPrestamo.setVisible((this.isVisibilidadCeldaDuplicarTipoPrestamo && this.isPermisoDuplicarTipoPrestamo));			
			this.jButtonCopiarTipoPrestamo.setVisible((this.isVisibilidadCeldaCopiarTipoPrestamo && this.isPermisoCopiarTipoPrestamo));
			this.jButtonVerFormTipoPrestamo.setVisible((this.isVisibilidadCeldaVerFormTipoPrestamo && this.isPermisoVerFormTipoPrestamo));
			
			this.jButtonAbrirOrderByTipoPrestamo.setVisible((this.isVisibilidadCeldaOrdenTipoPrestamo && this.isPermisoOrdenTipoPrestamo));			
			
			this.jButtonNuevoRelacionesTipoPrestamo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo && this.isPermisoNuevoTipoPrestamo));			
			this.jButtonNuevoGuardarCambiosTipoPrestamo.setVisible((this.isVisibilidadCeldaNuevoTipoPrestamo && this.isPermisoNuevoTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo));
			
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonModificarTipoPrestamo.setVisible((this.isVisibilidadCeldaModificarTipoPrestamo && this.isPermisoActualizarTipoPrestamo));	
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonActualizarTipoPrestamo.setVisible((this.isVisibilidadCeldaActualizarTipoPrestamo && this.isPermisoActualizarTipoPrestamo));	
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonEliminarTipoPrestamo.setVisible((this.isVisibilidadCeldaEliminarTipoPrestamo && this.isPermisoEliminarTipoPrestamo));
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonCancelarTipoPrestamo.setVisible(this.isVisibilidadCeldaCancelarTipoPrestamo);							
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosTipoPrestamo.setVisible((this.isVisibilidadCeldaGuardarTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoPrestamo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaNuevoTipoPrestamo && this.isPermisoNuevoTipoPrestamo));						
			this.jButtonDuplicarToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaDuplicarTipoPrestamo && this.isPermisoDuplicarTipoPrestamo));						
			this.jButtonCopiarToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaCopiarTipoPrestamo && this.isPermisoCopiarTipoPrestamo));			
			this.jButtonVerFormToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaVerFormTipoPrestamo && this.isPermisoVerFormTipoPrestamo));			
			this.jButtonAbrirOrderByToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaOrdenTipoPrestamo && this.isPermisoOrdenTipoPrestamo));
			this.jButtonNuevoRelacionesToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo && this.isPermisoNuevoTipoPrestamo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaNuevoTipoPrestamo && this.isPermisoNuevoTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo));			
			
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonModificarToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaModificarTipoPrestamo && this.isPermisoActualizarTipoPrestamo));	
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonActualizarToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaActualizarTipoPrestamo  && this.isPermisoActualizarTipoPrestamo));	
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonEliminarToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaEliminarTipoPrestamo && this.isPermisoEliminarTipoPrestamo));
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonCancelarToolBarTipoPrestamo.setVisible(this.isVisibilidadCeldaCancelarTipoPrestamo);				
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaGuardarTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoPrestamo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoPrestamo.setVisible((this.isVisibilidadCeldaNuevoTipoPrestamo && this.isPermisoNuevoTipoPrestamo));			
			this.jMenuItemDuplicarTipoPrestamo.setVisible((this.isVisibilidadCeldaDuplicarTipoPrestamo && this.isPermisoDuplicarTipoPrestamo));			
			this.jMenuItemCopiarTipoPrestamo.setVisible((this.isVisibilidadCeldaCopiarTipoPrestamo && this.isPermisoCopiarTipoPrestamo));			
			this.jMenuItemVerFormTipoPrestamo.setVisible((this.isVisibilidadCeldaVerFormTipoPrestamo && this.isPermisoVerFormTipoPrestamo));			
			this.jMenuItemAbrirOrderByTipoPrestamo.setVisible((this.isVisibilidadCeldaOrdenTipoPrestamo && this.isPermisoOrdenTipoPrestamo));			
			//this.jMenuItemMostrarOcultarTipoPrestamo.setVisible((this.isVisibilidadCeldaOrdenTipoPrestamo && this.isPermisoOrdenTipoPrestamo));
			this.jMenuItemDetalleAbrirOrderByTipoPrestamo.setVisible((this.isVisibilidadCeldaOrdenTipoPrestamo && this.isPermisoOrdenTipoPrestamo));			
			//this.jMenuItemDetalleMostrarOcultarTipoPrestamo.setVisible((this.isVisibilidadCeldaOrdenTipoPrestamo && this.isPermisoOrdenTipoPrestamo));			
			this.jMenuItemNuevoRelacionesTipoPrestamo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo && this.isPermisoNuevoTipoPrestamo));			
			this.jMenuItemNuevoGuardarCambiosTipoPrestamo.setVisible((this.isVisibilidadCeldaNuevoTipoPrestamo && this.isPermisoNuevoTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo));									
			
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemModificarTipoPrestamo.setVisible((this.isVisibilidadCeldaModificarTipoPrestamo && this.isPermisoActualizarTipoPrestamo));	
			this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemActualizarTipoPrestamo.setVisible((this.isVisibilidadCeldaActualizarTipoPrestamo && this.isPermisoActualizarTipoPrestamo));	
			this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemEliminarTipoPrestamo.setVisible((this.isVisibilidadCeldaEliminarTipoPrestamo && this.isPermisoEliminarTipoPrestamo));
			this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemCancelarTipoPrestamo.setVisible(this.isVisibilidadCeldaCancelarTipoPrestamo);				
			}
			
			this.jMenuItemGuardarCambiosTipoPrestamo.setVisible((this.isVisibilidadCeldaGuardarTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo));						
			this.jMenuItemGuardarCambiosTablaTipoPrestamo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoPrestamo=this.jButtonNuevoTipoPrestamo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoPrestamo=this.jButtonDuplicarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaCopiarTipoPrestamo=this.jButtonCopiarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaVerFormTipoPrestamo=this.jButtonVerFormTipoPrestamo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoPrestamo=this.jButtonAbrirOrderByTipoPrestamo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=this.jButtonNuevoRelacionesTipoPrestamo.isVisible();
			this.isVisibilidadCeldaModificarTipoPrestamo=this.jButtonModificarTipoPrestamo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			this.isVisibilidadCeldaActualizarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jButtonActualizarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jButtonEliminarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jButtonCancelarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaGuardarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosTipoPrestamo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=this.jButtonGuardarCambiosTablaTipoPrestamo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoPrestamo=this.jButtonNuevoToolBarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=this.jButtonNuevoRelacionesToolBarTipoPrestamo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			this.isVisibilidadCeldaModificarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jButtonModificarToolBarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaActualizarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jButtonActualizarToolBarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jButtonEliminarToolBarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jButtonCancelarToolBarTipoPrestamo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPrestamo=this.jButtonGuardarCambiosToolBarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=this.jButtonGuardarCambiosTablaToolBarTipoPrestamo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoPrestamo=this.jMenuItemNuevoTipoPrestamo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=this.jMenuItemNuevoRelacionesTipoPrestamo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			this.isVisibilidadCeldaModificarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemModificarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaActualizarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemActualizarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemEliminarTipoPrestamo.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemCancelarTipoPrestamo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPrestamo=this.jMenuItemGuardarCambiosTipoPrestamo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=this.jMenuItemGuardarCambiosTablaTipoPrestamo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoPrestamo(Boolean esInicializar) {
		if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoprestamoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPrestamo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoPrestamo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoPrestamo() {
		this.jButtonNuevoTipoPrestamo.setVisible(this.isPermisoNuevoTipoPrestamo);			
		this.jButtonDuplicarTipoPrestamo.setVisible(this.isPermisoDuplicarTipoPrestamo);			
		this.jButtonCopiarTipoPrestamo.setVisible(this.isPermisoCopiarTipoPrestamo);			
		this.jButtonVerFormTipoPrestamo.setVisible(this.isPermisoVerFormTipoPrestamo);			
		
		this.jButtonAbrirOrderByTipoPrestamo.setVisible(this.isPermisoOrdenTipoPrestamo);					
		
		this.jButtonNuevoRelacionesTipoPrestamo.setVisible(this.isPermisoNuevoTipoPrestamo);			
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonModificarTipoPrestamo.setVisible(this.isPermisoActualizarTipoPrestamo);	
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonActualizarTipoPrestamo.setVisible(this.isPermisoActualizarTipoPrestamo);	
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonEliminarTipoPrestamo.setVisible(this.isPermisoEliminarTipoPrestamo);
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonCancelarTipoPrestamo.setVisible(this.isVisibilidadCeldaCancelarTipoPrestamo);						
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosTipoPrestamo.setVisible(this.isPermisoGuardarCambiosTipoPrestamo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoPrestamo.setVisible(this.isPermisoActualizarTipoPrestamo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPrestamo() {
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonModificarTipoPrestamo.setVisible(this.isPermisoActualizarTipoPrestamo);	
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonActualizarTipoPrestamo.setVisible(this.isPermisoActualizarTipoPrestamo);	
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonEliminarTipoPrestamo.setVisible(this.isPermisoEliminarTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonCancelarTipoPrestamo.setVisible(this.isVisibilidadCeldaCancelarTipoPrestamo);							
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosTipoPrestamo.setVisible((this.isVisibilidadCeldaGuardarTipoPrestamo && this.isPermisoGuardarCambiosTipoPrestamo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoPrestamo() {
		if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoPrestamo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoPrestamo() {
	}
	
	public void jTableDatosTipoPrestamoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoPrestamo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.gettipoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprestamo==null) {
						this.tipoprestamo = new TipoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
				}

				if(this.tipoprestamo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoprestamo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoPrestamoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoPrestamo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoPrestamo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoPrestamo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoPrestamo(this.gettipoprestamo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoprestamoLogic.getConnexion());

				if(this.tipoprestamo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoprestamo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoPrestamo=(TitledBorder)this.jScrollPanelDatosTipoPrestamo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoPrestamo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.gettipoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprestamo==null) {
						this.tipoprestamo = new TipoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
				}

				if(this.tipoprestamo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoprestamo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_rubro_empleaTipoPrestamoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorubroemplea=true;

			idTienePermisorubroemplea=this.tienePermisosUsuarioEnPaginaWebTipoPrestamo(RubroEmpleaConstantesFunciones.CLASSNAME);

			if(idTienePermisorubroemplea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoPrestamo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoPrestamo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoPrestamo(this.gettipoprestamo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);

				this.rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.rubroempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.rubroempleaBeanSwingJInternalFrame.getRubroEmpleaLogic().setConnexion(this.tipoprestamoLogic.getConnexion());

				if(this.tipoprestamo.getid_rubro_emplea()!=null) {
					this.rubroempleaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.rubroempleaBeanSwingJInternalFrame.setIdActual(this.tipoprestamo.getid_rubro_emplea());
					this.rubroempleaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea();
				}

				JInternalFrameBase jinternalFrame =this.rubroempleaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoPrestamo=(TitledBorder)this.jScrollPanelDatosTipoPrestamo.getBorder();
				TitledBorder titledBorderrubroemplea=(TitledBorder)this.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getBorder();

				titledBorderrubroemplea.setTitle(titledBorderTipoPrestamo.getTitle() + " -> Rubro Emplea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_rubro_empleaTipoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.gettipoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprestamo==null) {
						this.tipoprestamo = new TipoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
				}

				if(this.tipoprestamo.getid_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_rubro_emplea = "+this.tipoprestamo.getid_rubro_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableTipoPrestamoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebTipoPrestamo(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoPrestamo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoPrestamo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoPrestamo(this.gettipoprestamo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.tipoprestamoLogic.getConnexion());

				if(this.tipoprestamo.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.tipoprestamo.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoPrestamo=(TitledBorder)this.jScrollPanelDatosTipoPrestamo.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderTipoPrestamo.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableTipoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.gettipoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprestamo==null) {
						this.tipoprestamo = new TipoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
				}

				if(this.tipoprestamo.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.tipoprestamo.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.gettipoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprestamo==null) {
						this.tipoprestamo = new TipoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
				}

				if(this.tipoprestamo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoprestamo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.gettipoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprestamo==null) {
						this.tipoprestamo = new TipoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
				}

				if(this.tipoprestamo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoprestamo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_pagoTipoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.gettipoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprestamo==null) {
						this.tipoprestamo = new TipoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);
				}

				if(this.tipoprestamo.getcon_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_pago = "+this.tipoprestamo.getcon_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoPrestamo(false,false);

			this.getTipoPrestamosFK_IdCuentaContable();

			this.inicializarActualizarBindingTipoPrestamo(false);

			//if(TipoPrestamoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoPrestamo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoPrestamo(false,false);

			this.getTipoPrestamosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoPrestamo(false);

			//if(TipoPrestamoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoPrestamo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPrestamoTipoPrestamoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoPrestamo(false,false);

			this.getTipoPrestamosFK_IdTipoPrestamo();

			this.inicializarActualizarBindingTipoPrestamo(false);

			//if(TipoPrestamoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoPrestamo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoPrestamo() {
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
		

		if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			this.jInternalFrameDetalleFormTipoPrestamo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoPrestamo.dispose();
			this.jInternalFrameDetalleFormTipoPrestamo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoPrestamo!=null) {
			this.jInternalFrameReporteDinamicoTipoPrestamo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoPrestamo.dispose();
			this.jInternalFrameReporteDinamicoTipoPrestamo=null;
		}
		
		if(this.jInternalFrameImportacionTipoPrestamo!=null) {
			this.jInternalFrameImportacionTipoPrestamo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoPrestamo.dispose();
			this.jInternalFrameImportacionTipoPrestamo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoPrestamo();
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoPrestamo")) {
				jButtonNuevoTipoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoPrestamo")) {
				jButtonDuplicarTipoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoPrestamo")) {
				jButtonCopiarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoPrestamo")) {
				jButtonVerFormTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoPrestamo")) {
				jButtonNuevoTipoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoPrestamo")) {
				jButtonDuplicarTipoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoPrestamo")) {
				jButtonNuevoTipoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoPrestamo")) {
				jButtonDuplicarTipoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoPrestamo")) {
				jButtonNuevoTipoPrestamoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoPrestamo")) {
				jButtonNuevoTipoPrestamoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoPrestamo")) {
				jButtonNuevoTipoPrestamoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoPrestamo")) {
				jButtonModificarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoPrestamo")) {
				jButtonModificarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoPrestamo")) {
				jButtonModificarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoPrestamo")) {
				jButtonActualizarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoPrestamo")) {
				jButtonActualizarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoPrestamo")) {
				jButtonActualizarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoPrestamo")) {
				jButtonEliminarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoPrestamo")) {
				jButtonEliminarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoPrestamo")) {
				jButtonEliminarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoPrestamo")) {
				jButtonCancelarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoPrestamo")) {
				jButtonCancelarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoPrestamo")) {
				jButtonCancelarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoPrestamo")) {
				jButtonCerrarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoPrestamo")) {
				jButtonCerrarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoPrestamo")) {
				jButtonCerrarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoPrestamo")) {
				jButtonMostrarOcultarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoPrestamo")) {
				jButtonCancelarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoPrestamo")) {
				jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoPrestamo")) {
				jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoPrestamo")) {
				jButtonCopiarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoPrestamo")) {
				jButtonVerFormTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoPrestamo")) {
				jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoPrestamo")) {
				jButtonCopiarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoPrestamo")) {
				jButtonVerFormTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoPrestamo")) {
				jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoPrestamo")) {
				jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoPrestamo")) {
				jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoPrestamo")) {
				jButtonRecargarInformacionTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoPrestamo")) {
				jButtonRecargarInformacionTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoPrestamo")) {
				jButtonRecargarInformacionTipoPrestamoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoPrestamo")) {
				jButtonAnterioresTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoPrestamo")) {
				jButtonAnterioresTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoPrestamo")) {
				jButtonAnterioresTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoPrestamo")) {
				jButtonSiguientesTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoPrestamo")) {
				jButtonSiguientesTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoPrestamo")) {
				jButtonSiguientesTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoPrestamo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoPrestamo")) {
				jButtonAbrirOrderByTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoPrestamo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoPrestamo")) {
				jButtonMostrarOcultarTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPrestamo")) {
				jButtonNuevoGuardarCambiosTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoPrestamo")) {
				jButtonNuevoGuardarCambiosTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoPrestamo")) {
				jButtonNuevoGuardarCambiosTipoPrestamoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoPrestamo")) {
				jButtonCerrarReporteDinamicoTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoPrestamo")) {
				jButtonGenerarReporteDinamicoTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoPrestamo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoPrestamo")) {
				jButtonCerrarImportacionTipoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoPrestamo")) {
				
				jButtonGenerarImportacionTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoPrestamo")) {
				
				jButtonAbrirImportacionTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoPrestamo")) {
				jComboBoxTiposAccionesTipoPrestamoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoPrestamo")) {
				jComboBoxTiposRelacionesTipoPrestamoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoPrestamo")) {
				jComboBoxTiposAccionesTipoPrestamoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoPrestamo")) {
				
				jComboBoxTiposSeleccionarTipoPrestamoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoPrestamo")) {
				jTextFieldValorCampoGeneralTipoPrestamoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoPrestamo")) {
				jButtonAbrirOrderByTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoPrestamo")) {
				jButtonAbrirOrderByTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoPrestamo")) {
				jButtonCerrarOrderByTipoPrestamoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPrestamoBusqueda")) {
				this.jButtonidTipoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoPrestamoUpdate")) {
				this.jButtonid_empresaTipoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoPrestamoBusqueda")) {
				this.jButtonid_empresaTipoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaTipoPrestamoUpdate")) {
				this.jButtonid_rubro_empleaTipoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaTipoPrestamoBusqueda")) {
				this.jButtonid_rubro_empleaTipoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoPrestamoUpdate")) {
				this.jButtonid_cuenta_contableTipoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoPrestamoBusqueda")) {
				this.jButtonid_cuenta_contableTipoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPrestamoBusqueda")) {
				this.jButtoncodigoTipoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPrestamoBusqueda")) {
				this.jButtonnombreTipoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_pagoTipoPrestamoBusqueda")) {
				this.jButtoncon_pagoTipoPrestamoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCuentaContableTipoPrestamo")) {
				this.jButtonFK_IdCuentaContableTipoPrestamoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoPrestamoTipoPrestamo")) {
				this.jButtonFK_IdTipoPrestamoTipoPrestamoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("RelacionesFinformas_de_pagoTipoPrestamo")) {
				this.jButtonRelacionesFinformas_de_pagoTipoPrestamoActionPerformed(evt);
			}
			else if(sTipo.equals("RelacionesFinNormalTipoPrestamo")) {
				this.jButtonRelacionesFinNormalTipoPrestamoActionPerformed(evt);
			};
			
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoPrestamo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrestamoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				


				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoPrestamo tipoprestamoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoprestamoLocal=this.tipoprestamo;
			} else {
				tipoprestamoLocal=this.tipoprestamoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
							
				
				


				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
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
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
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
			
			


			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrestamoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
								
						
				


				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrestamo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
								
				
				


				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrestamoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
							
				
				


				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrestamo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrestamoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
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
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
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
			
			


			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrestamoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
								
				
				


				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrestamoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrestamoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoPrestamo")) {
					jCheckBoxSeleccionarTodosTipoPrestamoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoPrestamo")) {
					jCheckBoxSeleccionadosTipoPrestamoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoPrestamo")) {
					
				}
				
				


				
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
												
				
				


				
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrestamoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrestamoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
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
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
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
			
			


			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrestamoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrestamo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrestamo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprestamo);
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
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
				
				


				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrestamo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprestamoAnterior =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoPrestamo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoPrestamoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoPrestamo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoprestamo =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoprestamo =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoprestamo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoPrestamo")) {
				
				}
				
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoPrestamo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoPrestamo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoPrestamo")) {
			
			}
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	
		public void jButtonRelacionesFinformas_de_pagoTipoPrestamoActionPerformed(ActionEvent evt) {
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.setVisible(false);
			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.setVisible(false);

			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.setVisible(true);
			}
		}

		public void jButtonRelacionesFinNormalTipoPrestamoActionPerformed(ActionEvent evt) {
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.setVisible(false);
			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.setVisible(false);

			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.setVisible(true);
			}
		};
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoPrestamo();
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoPrestamo")) {
				jButtonNuevoTipoPrestamoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoPrestamo")) {
				jButtonDuplicarTipoPrestamoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoPrestamo")) {
				jButtonCopiarTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoPrestamo")) {
				jButtonVerFormTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoPrestamo")) {
				jButtonNuevoTipoPrestamoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoPrestamo")) {
				jButtonModificarTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoPrestamo")) {
				jButtonActualizarTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoPrestamo")) {
				jButtonEliminarTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoPrestamo")) {
				jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoPrestamo")) {
				jButtonCancelarTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoPrestamo")) {
				jButtonCerrarTipoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoPrestamo")) {
				jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPrestamo")) {
				jButtonNuevoGuardarCambiosTipoPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoPrestamo")) {
				jButtonAbrirOrderByTipoPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoPrestamo")) {
				jButtonRecargarInformacionTipoPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoPrestamo")) {
				jButtonAnterioresTipoPrestamoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoPrestamo")) {
				jButtonSiguientesTipoPrestamoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPrestamoBusqueda")) {
				this.jButtonidTipoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoPrestamoUpdate")) {
				this.jButtonid_empresaTipoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoPrestamoBusqueda")) {
				this.jButtonid_empresaTipoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaTipoPrestamoUpdate")) {
				this.jButtonid_rubro_empleaTipoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaTipoPrestamoBusqueda")) {
				this.jButtonid_rubro_empleaTipoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoPrestamoUpdate")) {
				this.jButtonid_cuenta_contableTipoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoPrestamoBusqueda")) {
				this.jButtonid_cuenta_contableTipoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPrestamoBusqueda")) {
				this.jButtoncodigoTipoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPrestamoBusqueda")) {
				this.jButtonnombreTipoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_pagoTipoPrestamoBusqueda")) {
				this.jButtoncon_pagoTipoPrestamoBusquedaActionPerformed(evt);
			}
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoPrestamo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoPrestamo")) {
				closingInternalFrameTipoPrestamo();
				
			} else if(sTipo.equals("jButtonCancelarTipoPrestamo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoPrestamo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoPrestamoBeanSwingJInternalFrame jInternalFrameParent=(TipoPrestamoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPrestamo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoPrestamoActionPerformed(null);
			}
			
			TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprestamo,new Object(),this.tipoprestamoParameterGeneral,this.tipoprestamoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoPrestamo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoPrestamo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoPrestamo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoprestamo)) {
			if(!esControlTabla) {
				if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);			
				}
				
				if(this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoPrestamo(this.tipoprestamo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprestamoReturnGeneral=tipoprestamoLogic.procesarEventosTipoPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprestamoLogic.getTipoPrestamos(),this.tipoprestamo,this.tipoprestamoParameterGeneral,this.isEsNuevoTipoPrestamo,classes);//this.tipoprestamoLogic.getTipoPrestamo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoPrestamo(this.tipoprestamoReturnGeneral,this.tipoprestamoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoPrestamo(classes,this.tipoprestamoReturnGeneral,this.tipoprestamoBean,false);
					}
						
					if(this.tipoprestamoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoPrestamo(this.tipoprestamoReturnGeneral.getTipoPrestamo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoPrestamo(this.tipoprestamoReturnGeneral.getTipoPrestamo());	
					}
						
					if(this.tipoprestamoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoPrestamo(this.tipoprestamoReturnGeneral.getTipoPrestamo(),classes);//this.tipoprestamoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoPrestamo(this.tipoprestamo,classes);//this.tipoprestamoBean);									
				}
			
				if(TipoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoPrestamo(this.tipoprestamo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrestamo(this.tipoprestamo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoprestamoAnterior!=null) {
						this.tipoprestamo=this.tipoprestamoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprestamoReturnGeneral=tipoprestamoLogic.procesarEventosTipoPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprestamoLogic.getTipoPrestamos(),this.tipoprestamo,this.tipoprestamoParameterGeneral,this.isEsNuevoTipoPrestamo,classes);//this.tipoprestamoLogic.getTipoPrestamo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprestamoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoprestamoReturnGeneral.getTipoPrestamo(),tipoprestamoLogic.getTipoPrestamos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoprestamoReturnGeneral.getTipoPrestamo(),this.tipoprestamos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoPrestamo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoPrestamo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoPrestamo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoPrestamo() throws Exception {
		
		TipoPrestamoModel tipoprestamoModel=(TipoPrestamoModel)this.jTableDatosTipoPrestamo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprestamoModel.tipoprestamos=this.tipoprestamoLogic.getTipoPrestamos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoprestamoModel.tipoprestamos=this.tipoprestamos;
		}
		
		
		((TipoPrestamoModel) this.jTableDatosTipoPrestamo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoPrestamo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoprestamoAnterior(),this.tipoprestamoLogic.getTipoPrestamos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoprestamoAnterior(),this.tipoprestamos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoPrestamo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoPrestamo(TipoPrestamo tipoprestamo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Prestamo.class)) {
					this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.setPrestamos(tipoprestamo.getPrestamos());
					this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrestamo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
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
										
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprestamo,new Object(),generalEntityParameterGeneral,this.tipoprestamoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoprestamoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoPrestamoConstantesFunciones.getClassesRelationshipsOfTipoPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoPrestamoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoPrestamo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoPrestamo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprestamo,new Object(),generalEntityParameterGeneral,this.tipoprestamoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoPrestamo(TipoPrestamoBean tipoprestamoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Prestamo.class)) {
					this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.setPrestamos(tipoprestamo.getPrestamos());
					this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrestamo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoPrestamo(ArrayList<Classe> classes,TipoPrestamoReturnGeneral tipoprestamoReturnGeneral,TipoPrestamoBean tipoprestamoBean,Boolean conDefault) throws Exception {
		
			this.tipoprestamoBean.setPrestamos(tipoprestamoReturnGeneral.getTipoPrestamo().getPrestamos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoPrestamo(TipoPrestamo tipoprestamo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Prestamo.class)) {
					tipoprestamo.setPrestamos(this.jInternalFrameDetalleFormTipoPrestamo.prestamoBeanSwingJInternalFrame.prestamoLogic.getPrestamos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoprestamo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoPrestamo = new TipoPrestamoDetalleFormJInternalFrame(jDesktopPane,this.tipoprestamoSessionBean.getConGuardarRelaciones(),this.tipoprestamoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.setVisible(false);
		this.jInternalFrameDetalleFormTipoPrestamo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoPrestamo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoPrestamo.tipoprestamoLogic=this.tipoprestamoLogic;
		
		this.cargarCombosFrameForeignKeyTipoPrestamo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPrestamo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPrestamo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoPrestamo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoPrestamo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoPrestamo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPrestamo"));
		
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonModificarTipoPrestamo.addActionListener(new ButtonActionListener(this,"ModificarTipoPrestamo"));

		
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonModificarToolBarTipoPrestamo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPrestamo"));
					
		this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemModificarTipoPrestamo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonActualizarTipoPrestamo.addActionListener (new ButtonActionListener(this,"ActualizarTipoPrestamo"));
		
		
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonActualizarToolBarTipoPrestamo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPrestamo"));
						
		this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemActualizarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonEliminarTipoPrestamo.addActionListener (new ButtonActionListener(this,"EliminarTipoPrestamo"));
		
		
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonEliminarToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPrestamo"));
								
		this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemEliminarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonCancelarTipoPrestamo.addActionListener (new ButtonActionListener(this,"CancelarTipoPrestamo"));
		
		
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonCancelarToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPrestamo"));
					
		this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemCancelarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPrestamo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemDetalleCerrarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrestamo"));
		
		
		
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrestamo"));
		
		
		
		this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPrestamo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonidTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_empresaTipoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_empresaTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_rubro_empleaTipoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaTipoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_rubro_empleaTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaTipoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_cuenta_contableTipoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_cuenta_contableTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtoncodigoTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonnombreTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtoncon_pagoTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"con_pagoTipoPrestamoBusqueda"));
		
		
		
				this.jInternalFrameDetalleFormTipoPrestamo.jButtonRelacionesFinformas_de_pagoTipoPrestamo.addActionListener (new ButtonActionListener(this,"RelacionesFinformas_de_pagoTipoPrestamo"));
				this.jInternalFrameDetalleFormTipoPrestamo.jButtonRelacionesFinNormalTipoPrestamo.addActionListener (new ButtonActionListener(this,"RelacionesFinNormalTipoPrestamo"));;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPrestamo"));
		
		
			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFinformas_de_pagoTipoPrestamo"));;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoPrestamo"));
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPrestamo"));
		}
		
		this.jTableDatosTipoPrestamo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoPrestamo"));
		
		this.jTableDatosTipoPrestamo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoPrestamo"));
		
		this.jButtonNuevoTipoPrestamo.addActionListener(new ButtonActionListener(this,"NuevoTipoPrestamo"));
		
		this.jButtonDuplicarTipoPrestamo.addActionListener(new ButtonActionListener(this,"DuplicarTipoPrestamo"));
		
		this.jButtonCopiarTipoPrestamo.addActionListener(new ButtonActionListener(this,"CopiarTipoPrestamo"));
		
		this.jButtonVerFormTipoPrestamo.addActionListener(new ButtonActionListener(this,"VerFormTipoPrestamo"));
		
		
		this.jButtonNuevoToolBarTipoPrestamo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoPrestamo"));
			
		this.jButtonDuplicarToolBarTipoPrestamo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoPrestamo"));
			
		this.jMenuItemNuevoTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoPrestamo"));
			
		this.jMenuItemDuplicarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoPrestamo"));		
		
		
		this.jButtonNuevoRelacionesTipoPrestamo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoPrestamo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoPrestamo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoPrestamo"));
			
		this.jMenuItemNuevoRelacionesTipoPrestamo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoPrestamo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonModificarTipoPrestamo.addActionListener(new ButtonActionListener(this,"ModificarTipoPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonModificarToolBarTipoPrestamo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPrestamo"));
			
			this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemModificarTipoPrestamo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonActualizarTipoPrestamo.addActionListener (new ButtonActionListener(this,"ActualizarTipoPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonActualizarToolBarTipoPrestamo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPrestamo"));
				
			this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemActualizarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonEliminarTipoPrestamo.addActionListener (new ButtonActionListener(this,"EliminarTipoPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonEliminarToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPrestamo"));
						
			this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemEliminarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonCancelarTipoPrestamo.addActionListener (new ButtonActionListener(this,"CancelarTipoPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonCancelarToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPrestamo"));
			
			this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemCancelarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPrestamo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoPrestamo"));		
		
		
		this.jButtonCerrarTipoPrestamo.addActionListener (new ButtonActionListener(this,"CerrarTipoPrestamo"));
		
		
		this.jButtonCerrarToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoPrestamo"));
			
		this.jMenuItemCerrarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoPrestamo"));
			
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jMenuItemDetalleCerrarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosTipoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrestamo"));
		}
		
		this.jButtonCopiarToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoPrestamo"));
			
		this.jButtonVerFormToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoPrestamo"));
		
		this.jMenuItemGuardarCambiosTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoPrestamo"));
			
		this.jMenuItemCopiarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoPrestamo"));		
		
		this.jMenuItemVerFormTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoPrestamo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPrestamo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoPrestamo"));
			
		this.jMenuItemGuardarCambiosTablaTipoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPrestamo"));		
		
		
		
		this.jButtonRecargarInformacionTipoPrestamo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoPrestamo"));
					
		this.jButtonRecargarInformacionToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoPrestamo"));
		
		this.jMenuItemRecargarInformacionTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoPrestamo"));		
		
		
		
		this.jButtonAnterioresTipoPrestamo.addActionListener (new ButtonActionListener(this,"AnterioresTipoPrestamo"));
		
		
		this.jButtonAnterioresToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoPrestamo"));
		
		this.jMenuItemAnterioresTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoPrestamo"));		
		
		
		this.jButtonSiguientesTipoPrestamo.addActionListener (new ButtonActionListener(this,"SiguientesTipoPrestamo"));
		
		
		this.jButtonSiguientesToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoPrestamo"));
			
		this.jMenuItemSiguientesTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoPrestamo"));
			
		this.jMenuItemAbrirOrderByTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoPrestamo"));
			
		this.jMenuItemMostrarOcultarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoPrestamo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoPrestamo"));
			
		this.jMenuItemDetalleMostarOcultarTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoPrestamo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoPrestamo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoPrestamo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoPrestamo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoPrestamo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoPrestamo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoPrestamo"));

		this.jCheckBoxSeleccionadosTipoPrestamo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoPrestamo"));
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPrestamo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoPrestamo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoPrestamo"));
			
		this.jComboBoxTiposAccionesTipoPrestamo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoPrestamo"));
					
		this.jComboBoxTiposSeleccionarTipoPrestamo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoPrestamo"));
			
		this.jTextFieldValorCampoGeneralTipoPrestamo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoPrestamo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonidTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_empresaTipoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_empresaTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_rubro_empleaTipoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaTipoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_rubro_empleaTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaTipoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_cuenta_contableTipoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_cuenta_contableTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtoncodigoTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonnombreTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtoncon_pagoTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"con_pagoTipoPrestamoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableTipoPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableTipoPrestamo"));

			this.jButtonFK_IdTipoPrestamoTipoPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrestamoTipoPrestamo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoPrestamo!=null) {
				this.jInternalFrameReporteDinamicoTipoPrestamo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrestamo"));
				this.jInternalFrameReporteDinamicoTipoPrestamo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrestamo"));
				this.jInternalFrameReporteDinamicoTipoPrestamo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrestamo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoPrestamo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrestamo"));				
			//this.jButtonGenerarReporteDinamicoTipoPrestamo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrestamo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoPrestamo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrestamo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoPrestamo!=null) {
				this.jInternalFrameImportacionTipoPrestamo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPrestamo"));
				this.jInternalFrameImportacionTipoPrestamo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPrestamo"));
				this.jInternalFrameImportacionTipoPrestamo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPrestamo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoPrestamo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoPrestamo"));
			
			this.jButtonAbrirOrderByToolBarTipoPrestamo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoPrestamo"));			
			
			if(this.jInternalFrameOrderByTipoPrestamo!=null) {
				this.jInternalFrameOrderByTipoPrestamo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPrestamo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			
				this.jInternalFrameDetalleFormTipoPrestamo.jButtonRelacionesFinformas_de_pagoTipoPrestamo.addActionListener (new ButtonActionListener(this,"RelacionesFinformas_de_pagoTipoPrestamo"));
				this.jInternalFrameDetalleFormTipoPrestamo.jButtonRelacionesFinNormalTipoPrestamo.addActionListener (new ButtonActionListener(this,"RelacionesFinNormalTipoPrestamo"));;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesTipoPrestamo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPrestamo"));
		
		
			this.jInternalFrameDetalleFormTipoPrestamo.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFinformas_de_pagoTipoPrestamo"));;
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
            		closingInternalFrameTipoPrestamo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoPrestamo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoPrestamo = (JInternalFrameBase)event.getSource();
	            	
	            TipoPrestamoBeanSwingJInternalFrame jInternalFrameParent=(TipoPrestamoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPrestamo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoPrestamoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoPrestamo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoPrestamoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoPrestamo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoPrestamo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrestamoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrestamoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrestamoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoPrestamo";
		inputMap = this.jButtonNuevoTipoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPrestamoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrestamoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrestamoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrestamoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoPrestamo";
		inputMap = this.jButtonNuevoRelacionesTipoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPrestamoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoPrestamo";
		inputMap = this.jButtonModificarTipoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoPrestamo";
		inputMap = this.jButtonActualizarTipoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoPrestamo";
		inputMap = this.jButtonEliminarTipoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoPrestamo";
		inputMap = this.jButtonCancelarTipoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoPrestamo";
		inputMap = this.jButtonCerrarTipoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoPrestamo";
		inputMap = this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosTipoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonGuardarCambiosTipoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoPrestamo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoPrestamoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoPrestamo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoPrestamoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoPrestamo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoPrestamoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoPrestamo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoPrestamoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonidTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_empresaTipoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_empresaTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_rubro_empleaTipoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaTipoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_rubro_empleaTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaTipoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_cuenta_contableTipoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonid_cuenta_contableTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtoncodigoTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtonnombreTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrestamo.jButtoncon_pagoTipoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"con_pagoTipoPrestamoBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableTipoPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableTipoPrestamo"));

		this.jButtonFK_IdTipoPrestamoTipoPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrestamoTipoPrestamo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoPrestamoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoPrestamo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoPrestamo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoPrestamo tipoprestamoAux:this.tipoprestamoLogic.getTipoPrestamos()) {
					tipoprestamoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrestamo tipoprestamoAux:tipoprestamos) {
					tipoprestamoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoPrestamoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPrestamo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPrestamo tipoprestamoAux:this.tipoprestamoLogic.getTipoPrestamos()) {
						tipoprestamoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrestamo tipoprestamoAux:tipoprestamos) {
						tipoprestamoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoPrestamo tipoprestamoAux:this.tipoprestamoLogic.getTipoPrestamos()) {
					
						if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_CONPAGO)) {
							existe=true;
							tipoprestamoAux.setcon_pago(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrestamo tipoprestamoAux:tipoprestamos) {
						
						if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_CONPAGO)) {
							existe=true;
							tipoprestamoAux.setcon_pago(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPrestamo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPrestamo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPrestamo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoPrestamoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPrestamo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoPrestamo.getSelectedRows();
			
			TipoPrestamo tipoprestamoLocal=new TipoPrestamo();
			
			//this.seleccionarTodosTipoPrestamo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprestamoLocal =(TipoPrestamo) this.tipoprestamoLogic.getTipoPrestamos().toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoprestamoLocal =(TipoPrestamo) this.tipoprestamos.toArray()[this.jTableDatosTipoPrestamo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoprestamoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPrestamo tipoprestamoAux:this.tipoprestamoLogic.getTipoPrestamos()) {
						tipoprestamoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrestamo tipoprestamoAux:tipoprestamos) {
						tipoprestamoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoPrestamo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPrestamo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPrestamo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPrestamo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoPrestamoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoPrestamoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoPrestamoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoPrestamo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoPrestamo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPrestamo tipoprestamoAux:this.tipoprestamoLogic.getTipoPrestamos()) {
				
						if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoprestamoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprestamoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrestamo tipoprestamoAux:tipoprestamos) {
					
						if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoprestamoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprestamoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPrestamo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoPrestamoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoPrestamo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoPrestamo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoPrestamo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoPrestamo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoPrestamo(conSplash);
				
					this.generarReporteTipoPrestamosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoPrestamosSeleccionados();
				//this.jComboBoxTiposAccionesTipoPrestamo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPrestamosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoPrestamo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPrestamosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoPrestamo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPrestamo();
				
				this.exportarTipoPrestamosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoPrestamos();
				//this.importarTipoPrestamos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPrestamo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoPrestamosSeleccionados();
				//this.jComboBoxTiposAccionesTipoPrestamo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoPrestamo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoPrestamo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoPrestamo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Prestamo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoPrestamoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoPrestamo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoPrestamo(conSplash);
					
						//this.actualizarParametrosGeneralTipoPrestamo();
						
						this.generarReporteProcesoAccionTipoPrestamosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoPrestamo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoPrestamoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo PrestamoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoPrestamo();
				
						this.actualizarParametrosGeneralTipoPrestamo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoprestamoReturnGeneral=tipoprestamoLogic.procesarAccionTipoPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoprestamoLogic.getTipoPrestamos(),this.tipoprestamoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoPrestamoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoPrestamo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoPrestamo();
					
					TipoPrestamoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoPrestamoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoPrestamo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxTiposAccionesFormularioTipoPrestamo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoPrestamo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoPrestamoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoPrestamo();
			
			if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();		
			TipoPrestamo tipoprestamo=new TipoPrestamo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoPrestamo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoPrestamo.getSelectedItem();
			
			
			
			
			tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoprestamosSeleccionados.size()==1) {
				for(TipoPrestamo tipoprestamoAux:tipoprestamosSeleccionados) {
					tipoprestamo=tipoprestamoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Prestamo")) {
					jButtonPrestamoActionPerformed(null,rowIndex,true,false,tipoprestamo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoPrestamo();
			
      		//this.finishProcessTipoPrestamo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoPrestamoReturnGeneral() throws Exception {
		if(this.tipoprestamoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoprestamoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoprestamoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoprestamoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoprestamoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoprestamoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoPrestamo(false);
		}
		
		if(this.tipoprestamoReturnGeneral.getConRetornoLista() || this.tipoprestamoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoprestamoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprestamoLogic.setTipoPrestamos(this.tipoprestamoReturnGeneral.getTipoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoprestamoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprestamoLogic.setTipoPrestamo(this.tipoprestamoReturnGeneral.getTipoPrestamo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoPrestamo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoPrestamo() throws Exception {
		
		
	}
	
	public ArrayList<TipoPrestamo> getTipoPrestamosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoPrestamo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoPrestamo tipoprestamoAux:tipoprestamoLogic.getTipoPrestamos()) {
					if(tipoprestamoAux.getIsSelected()) {
						tipoprestamosSeleccionados.add(tipoprestamoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrestamo tipoprestamoAux:this.tipoprestamos) {
					if(tipoprestamoAux.getIsSelected()) {
						tipoprestamosSeleccionados.add(tipoprestamoAux);				
					}
				}
			}
			
			if(tipoprestamosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoprestamosSeleccionados.addAll(this.tipoprestamoLogic.getTipoPrestamos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoprestamosSeleccionados.addAll(this.tipoprestamos);				
					}
				}
			}
		} else {
			tipoprestamosSeleccionados.add(this.tipoprestamo);
		}
		
		return tipoprestamosSeleccionados;
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
	
	public void generarReporteTipoPrestamosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoPrestamosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoPrestamosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPrestamosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPrestamosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoPrestamosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Prestamo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoPrestamosSeleccionados() throws Exception {
		ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();		
		
		tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoPrestamos("Todos",tipoprestamosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoPrestamosSeleccionados() throws Exception {
		ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();		
		
		tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoPrestamos("Todos",tipoprestamosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoPrestamosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();
		
		tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoPrestamos("Todos",tipoprestamosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoPrestamosSeleccionados() throws Exception {
		ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoPrestamo();
		
		
		tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoPrestamo();
		
		
		//this.generarReporteTipoPrestamos("Todos",tipoprestamosSeleccionados ,tipoprestamoImplementable,tipoprestamoImplementableHome);
	}
	
	public void mostrarImportacionTipoPrestamos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoPrestamo();
		
		this.abrirFrameImportacionTipoPrestamo();		
		
			
		//this.generarReporteTipoPrestamos("Todos",tipoprestamosSeleccionados ,tipoprestamoImplementable,tipoprestamoImplementableHome);
	}
	
	public void importarTipoPrestamos() throws Exception {		
	
	}
	
	public void exportarTipoPrestamosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoPrestamosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoPrestamosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoPrestamosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Prestamo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoPrestamosSeleccionados() throws Exception {
		ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();		
		
		tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprestamo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoPrestamo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoPrestamo tipoprestamoAux:tipoprestamosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoPrestamo(tipoprestamoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoprestamoAux.setsDetalleGeneralEntityReporte(tipoprestamoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoPrestamo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoPrestamoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrestamoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrestamoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrestamoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrestamoConstantesFunciones.LABEL_CONPAGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoPrestamo(TipoPrestamo tipoprestamo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoprestamo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprestamo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprestamo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprestamo.getrubroemplea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprestamo.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprestamo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprestamo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprestamo.getcon_pago().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoPrestamosSeleccionados() throws Exception {
		ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();		
		
		tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprestamo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoPrestamos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoPrestamo(row);				
				iRow++;
			}				
			
			for(TipoPrestamo tipoprestamoAux:tipoprestamosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoPrestamo(tipoprestamoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoPrestamosSeleccionados() throws Exception {
		ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();		
		
		tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprestamo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoprestamos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoprestamo");
			//elementRoot.appendChild(element);
		
			for(TipoPrestamo tipoprestamoAux:tipoprestamosSeleccionados) {
				element = document.createElement("tipoprestamo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoPrestamo(tipoprestamoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoPrestamo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrestamoConstantesFunciones.LABEL_CONPAGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoPrestamo(TipoPrestamo tipoprestamo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprestamo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprestamo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprestamo.getrubroemplea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprestamo.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprestamo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprestamo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprestamo.getcon_pago());				
	}
	
	public void setFilaDatosExportarXmlTipoPrestamo(TipoPrestamo tipoprestamo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoPrestamoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoprestamo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoPrestamoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoprestamo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoPrestamoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoprestamo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementrubroemplea_descripcion = document.createElement(TipoPrestamoConstantesFunciones.IDRUBROEMPLEA);
		elementrubroemplea_descripcion.appendChild(document.createTextNode(tipoprestamo.getrubroemplea_descripcion()));
		element.appendChild(elementrubroemplea_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(TipoPrestamoConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(tipoprestamo.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementcodigo = document.createElement(TipoPrestamoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoprestamo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoPrestamoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoprestamo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcon_pago = document.createElement(TipoPrestamoConstantesFunciones.CONPAGO);
		elementcon_pago.appendChild(document.createTextNode(tipoprestamo.getcon_pago().toString().trim()));
		element.appendChild(elementcon_pago);
	}
	
	public void generarReporteGroupGenericoTipoPrestamosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoPrestamo> tipoprestamosSeleccionados=new ArrayList<TipoPrestamo>();
		
		tipoprestamosSeleccionados=this.getTipoPrestamosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoPrestamo(tipoprestamosSeleccionados);
		
		this.generarReporteTipoPrestamos("Todos",tipoprestamosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoPrestamo(ArrayList<TipoPrestamo> tipoprestamosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoPrestamo tipoprestamoAux:tipoprestamosSeleccionados) {
				tipoprestamoAux.setsDetalleGeneralEntityReporte(tipoprestamoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoprestamoAux.setsDescripcionGeneralEntityReporte1(tipoprestamoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA)) {
					existe=true;
					tipoprestamoAux.setsDescripcionGeneralEntityReporte1(tipoprestamoAux.getrubroemplea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					tipoprestamoAux.setsDescripcionGeneralEntityReporte1(tipoprestamoAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoprestamoAux.setsDescripcionGeneralEntityReporte1(tipoprestamoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoprestamoAux.setsDescripcionGeneralEntityReporte1(tipoprestamoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoPrestamoConstantesFunciones.LABEL_CONPAGO)) {
					existe=true;
					tipoprestamoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipoprestamoAux.getcon_pago()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoPrestamo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoPrestamo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoPrestamo=false;
			this.isVisibilidadCeldaActualizarTipoPrestamo=false;
			this.isVisibilidadCeldaEliminarTipoPrestamo=false;
			this.isVisibilidadCeldaCancelarTipoPrestamo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrestamo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=false;
			this.isVisibilidadCeldaModificarTipoPrestamo=false;
			this.isVisibilidadCeldaActualizarTipoPrestamo=true;
			this.isVisibilidadCeldaEliminarTipoPrestamo=false;
			this.isVisibilidadCeldaCancelarTipoPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrestamo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=false;
			this.isVisibilidadCeldaModificarTipoPrestamo=false;
			this.isVisibilidadCeldaActualizarTipoPrestamo=true;
			this.isVisibilidadCeldaEliminarTipoPrestamo=true;
			this.isVisibilidadCeldaCancelarTipoPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrestamo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=false;
			this.isVisibilidadCeldaModificarTipoPrestamo=false;
			this.isVisibilidadCeldaActualizarTipoPrestamo=true;
			this.isVisibilidadCeldaEliminarTipoPrestamo=false;
			this.isVisibilidadCeldaCancelarTipoPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrestamo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrestamo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoPrestamo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=true;
			this.isVisibilidadCeldaModificarTipoPrestamo=false;
			this.isVisibilidadCeldaActualizarTipoPrestamo=false;
			this.isVisibilidadCeldaEliminarTipoPrestamo=false;
			this.isVisibilidadCeldaCancelarTipoPrestamo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrestamo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=false;
			this.isVisibilidadCeldaActualizarTipoPrestamo=false;
			this.isVisibilidadCeldaEliminarTipoPrestamo=false;
			this.isVisibilidadCeldaCancelarTipoPrestamo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrestamo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrestamo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=false;
			this.isVisibilidadCeldaModificarTipoPrestamo=true;
			this.isVisibilidadCeldaActualizarTipoPrestamo=false;
			this.isVisibilidadCeldaEliminarTipoPrestamo=false;
			this.isVisibilidadCeldaCancelarTipoPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrestamo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrestamo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoPrestamoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoPrestamo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=true;
		} else {
			this.actualizarEstadoPanelsTipoPrestamo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoPrestamo=false;
			//this.isVisibilidadCeldaVerFormTipoPrestamo=false;
			this.isVisibilidadCeldaDuplicarTipoPrestamo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoprestamoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoprestamoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoprestamoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=false;												
			}
			
			this.jButtonCerrarTipoPrestamo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPrestamo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoprestamo)) {
			this.isVisibilidadCeldaActualizarTipoPrestamo=false;
			this.isVisibilidadCeldaEliminarTipoPrestamo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPrestamo() {
		this.isVisibilidadCeldaNuevoTipoPrestamo=false;
		this.isVisibilidadCeldaGuardarCambiosTipoPrestamo=false;
	}
	
	public void actualizarEstadoPanelsTipoPrestamo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoPrestamo!=null) {
				this.jScrollPanelDatosEdicionTipoPrestamo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrestamo!=null) {
				this.jTabbedPaneBusquedasTipoPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrestamo!=null) {
				this.jScrollPanelDatosTipoPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrestamo!=null) {
				this.jPanelPaginacionTipoPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrestamo!=null) {
				this.jPanelParametrosReportesTipoPrestamo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoPrestamo!=null) {
				this.jScrollPanelDatosEdicionTipoPrestamo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrestamo!=null) {
				this.jTabbedPaneBusquedasTipoPrestamo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoPrestamo!=null) {
				this.jScrollPanelDatosTipoPrestamo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrestamo!=null) {
				this.jPanelPaginacionTipoPrestamo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrestamo!=null) {
				this.jPanelParametrosReportesTipoPrestamo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoPrestamo!=null) {
				this.jScrollPanelDatosEdicionTipoPrestamo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrestamo!=null) {
				this.jTabbedPaneBusquedasTipoPrestamo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrestamo!=null) {
				this.jScrollPanelDatosTipoPrestamo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrestamo!=null) {
				this.jPanelPaginacionTipoPrestamo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrestamo!=null) {
				this.jPanelParametrosReportesTipoPrestamo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoPrestamo!=null) {
				this.jScrollPanelDatosEdicionTipoPrestamo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrestamo!=null) {
				this.jTabbedPaneBusquedasTipoPrestamo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrestamo!=null) {
				this.jScrollPanelDatosTipoPrestamo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrestamo!=null) {
				this.jPanelPaginacionTipoPrestamo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrestamo!=null) {
				this.jPanelParametrosReportesTipoPrestamo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoPrestamo!=null) {
				this.jScrollPanelDatosEdicionTipoPrestamo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrestamo!=null) {
				this.jTabbedPaneBusquedasTipoPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrestamo!=null) {
				this.jScrollPanelDatosTipoPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrestamo!=null) {
				this.jPanelPaginacionTipoPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrestamo!=null) {
				this.jPanelParametrosReportesTipoPrestamo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoPrestamo!=null) {
				this.jScrollPanelDatosEdicionTipoPrestamo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrestamo!=null) {
				this.jTabbedPaneBusquedasTipoPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrestamo!=null) {
				this.jScrollPanelDatosTipoPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrestamo!=null) {
				this.jPanelPaginacionTipoPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrestamo!=null) {
				this.jPanelParametrosReportesTipoPrestamo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoPrestamo!=null) {
				this.jScrollPanelDatosEdicionTipoPrestamo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrestamo!=null) {
				this.jTabbedPaneBusquedasTipoPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrestamo!=null) {
				this.jScrollPanelDatosTipoPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrestamo!=null) {
				this.jPanelPaginacionTipoPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrestamo!=null) {
				this.jPanelParametrosReportesTipoPrestamo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoPrestamo!=null) {
					this.jTabbedPaneBusquedasTipoPrestamo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoPrestamo!=null) {
				this.jPanelParametrosReportesTipoPrestamo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrestamo!=null) {
				this.jTabbedPaneBusquedasTipoPrestamo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoPrestamo!=null) {
				this.jPanelParametrosReportesTipoPrestamo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasTipoPrestamo.remove(jPanelFK_IdCuentaContableTipoPrestamo);}

			this.isVisibilidadFK_IdTipoPrestamo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoPrestamo) {this.jTabbedPaneBusquedasTipoPrestamo.remove(jPanelFK_IdTipoPrestamoTipoPrestamo);}
		}
		
	}

	public void setVisibilidadBusquedasParaRubroEmplea(Boolean isParaRubroEmplea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRubroEmpleaNegation=!isParaRubroEmplea;

			this.isVisibilidadFK_IdCuentaContable=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasTipoPrestamo.remove(jPanelFK_IdCuentaContableTipoPrestamo);}

			this.isVisibilidadFK_IdTipoPrestamo=isParaRubroEmplea;
			if(!this.isVisibilidadFK_IdTipoPrestamo) {this.jTabbedPaneBusquedasTipoPrestamo.remove(jPanelFK_IdTipoPrestamoTipoPrestamo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasTipoPrestamo.remove(jPanelFK_IdCuentaContableTipoPrestamo);}

			this.isVisibilidadFK_IdTipoPrestamo=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdTipoPrestamo) {this.jTabbedPaneBusquedasTipoPrestamo.remove(jPanelFK_IdTipoPrestamoTipoPrestamo);}
		}
		
	}
	
	

	public String registrarSesionTipoPrestamoParaPrestamos() throws Exception {
		Boolean isPaginaPopupPrestamo=false;

		try {

			if(this.tipoprestamoSessionBean==null) {
				this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoPrestamo.prestamoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoPrestamo.prestamoSessionBean=new PrestamoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoPrestamo.prestamoSessionBean.setsPathNavegacionActual(tipoprestamoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PrestamoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoPrestamo.prestamoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPrestamo=this.jInternalFrameDetalleFormTipoPrestamo.prestamoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoPrestamo.prestamoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePrestamo(true);
			this.jInternalFrameDetalleFormTipoPrestamo.prestamoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePrestamo(TipoPrestamoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoPrestamo.prestamoSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrestamo(true);
			this.jInternalFrameDetalleFormTipoPrestamo.prestamoSessionBean.setlidTipoPrestamoActual(this.idTipoPrestamoActual);

			tipoprestamoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoPrestamo(true);
			tipoprestamoSessionBean.setlIdTipoPrestamoActualForeignKey(this.idTipoPrestamoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoPrestamoSessionBean tipoprestamoSessionBean=new TipoPrestamoSessionBean();
		
		if(this.tipoprestamoSessionBean==null) {
			this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
		}
		
		this.tipoprestamoSessionBean.setsUltimaBusquedaTipoPrestamo(this.getsAccionBusqueda());
		this.tipoprestamoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoprestamoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			tipoprestamoSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoprestamoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoPrestamo")) {
			tipoprestamoSessionBean.setid_rubro_emplea(this.getid_rubro_empleaFK_IdTipoPrestamo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoPrestamoSessionBean tipoprestamoSessionBean=new TipoPrestamoSessionBean();
		
		if(this.tipoprestamoSessionBean==null) {
			this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
		}
		
		if(this.tipoprestamoSessionBean.getsUltimaBusquedaTipoPrestamo()!=null&&!this.tipoprestamoSessionBean.getsUltimaBusquedaTipoPrestamo().equals("")) {
			this.setsAccionBusqueda(tipoprestamoSessionBean.getsUltimaBusquedaTipoPrestamo());
			this.setiNumeroPaginacion(tipoprestamoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoprestamoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(tipoprestamoSessionBean.getid_cuenta_contable());
				tipoprestamoSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoprestamoSessionBean.getid_empresa());
				tipoprestamoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoPrestamo")) {
				this.setid_rubro_empleaFK_IdTipoPrestamo(tipoprestamoSessionBean.getid_rubro_emplea());
				tipoprestamoSessionBean.setid_rubro_emplea(-1L);
			}
		}
		
		this.tipoprestamoSessionBean.setsUltimaBusquedaTipoPrestamo("");
		this.tipoprestamoSessionBean.setiNumeroPaginacion(TipoPrestamoConstantesFunciones.INUMEROPAGINACION);
		this.tipoprestamoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoPrestamo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoPrestamo() {
		this.updateBorderResaltarBusquedasFormularioTipoPrestamo();
		this.updateVisibilidadBusquedasFormularioTipoPrestamo();
		this.updateHabilitarBusquedasFormularioTipoPrestamo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoPrestamo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoPrestamo.getComponents().length>0) {
	

		if(this.tipoprestamoConstantesFunciones.resaltarFK_IdCuentaContableTipoPrestamo!=null) {
			index= this.jTabbedPaneBusquedasTipoPrestamo.indexOfComponent(this.jPanelFK_IdCuentaContableTipoPrestamo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrestamo.getComponent(index);
				jPanel.setBorder(this.tipoprestamoConstantesFunciones.resaltarFK_IdCuentaContableTipoPrestamo);
			}
		}

		if(this.tipoprestamoConstantesFunciones.resaltarFK_IdTipoPrestamoTipoPrestamo!=null) {
			index= this.jTabbedPaneBusquedasTipoPrestamo.indexOfComponent(this.jPanelFK_IdTipoPrestamoTipoPrestamo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrestamo.getComponent(index);
				jPanel.setBorder(this.tipoprestamoConstantesFunciones.resaltarFK_IdTipoPrestamoTipoPrestamo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoPrestamo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoPrestamo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoPrestamo.indexOfComponent(this.jPanelFK_IdCuentaContableTipoPrestamo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrestamo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoprestamoConstantesFunciones.mostrarFK_IdCuentaContableTipoPrestamo);
			if(!this.tipoprestamoConstantesFunciones.mostrarFK_IdCuentaContableTipoPrestamo && index>-1) {
				this.jTabbedPaneBusquedasTipoPrestamo.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoPrestamo.indexOfComponent(this.jPanelFK_IdTipoPrestamoTipoPrestamo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrestamo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoprestamoConstantesFunciones.mostrarFK_IdTipoPrestamoTipoPrestamo);
			if(!this.tipoprestamoConstantesFunciones.mostrarFK_IdTipoPrestamoTipoPrestamo && index>-1) {
				this.jTabbedPaneBusquedasTipoPrestamo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoPrestamo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoPrestamo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoPrestamo.indexOfComponent(this.jPanelFK_IdCuentaContableTipoPrestamo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrestamo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoprestamoConstantesFunciones.activarFK_IdCuentaContableTipoPrestamo);
				this.jTabbedPaneBusquedasTipoPrestamo.setEnabledAt(index,this.tipoprestamoConstantesFunciones.activarFK_IdCuentaContableTipoPrestamo);
			}

			index= this.jTabbedPaneBusquedasTipoPrestamo.indexOfComponent(this.jPanelFK_IdTipoPrestamoTipoPrestamo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrestamo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoprestamoConstantesFunciones.activarFK_IdTipoPrestamoTipoPrestamo);
				this.jTabbedPaneBusquedasTipoPrestamo.setEnabledAt(index,this.tipoprestamoConstantesFunciones.activarFK_IdTipoPrestamoTipoPrestamo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoPrestamo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasTipoPrestamo.indexOfComponent(this.jPanelFK_IdCuentaContableTipoPrestamo);

			this.jTabbedPaneBusquedasTipoPrestamo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrestamo.getComponent(index);

			this.tipoprestamoConstantesFunciones.setResaltarFK_IdCuentaContableTipoPrestamo(resaltar);

			jPanel.setBorder(this.tipoprestamoConstantesFunciones.resaltarFK_IdCuentaContableTipoPrestamo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoPrestamo")) {
			index= this.jTabbedPaneBusquedasTipoPrestamo.indexOfComponent(this.jPanelFK_IdTipoPrestamoTipoPrestamo);

			this.jTabbedPaneBusquedasTipoPrestamo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrestamo.getComponent(index);

			this.tipoprestamoConstantesFunciones.setResaltarFK_IdTipoPrestamoTipoPrestamo(resaltar);

			jPanel.setBorder(this.tipoprestamoConstantesFunciones.resaltarFK_IdTipoPrestamoTipoPrestamo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoPrestamo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoPrestamo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoPrestamo();
		this.updateVisibilidadResaltarControlesFormularioTipoPrestamo();
		this.updateHabilitarResaltarControlesFormularioTipoPrestamo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoPrestamo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoprestamoConstantesFunciones.resaltaridTipoPrestamo!=null && this.jInternalFrameDetalleFormTipoPrestamo!=null) {this.jInternalFrameDetalleFormTipoPrestamo.jLabelidTipoPrestamo.setBorder(this.tipoprestamoConstantesFunciones.resaltaridTipoPrestamo);}
		if(this.tipoprestamoConstantesFunciones.resaltarid_empresaTipoPrestamo!=null && this.jInternalFrameDetalleFormTipoPrestamo!=null) {this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.setBorder(this.tipoprestamoConstantesFunciones.resaltarid_empresaTipoPrestamo);}
		if(this.tipoprestamoConstantesFunciones.resaltarid_rubro_empleaTipoPrestamo!=null && this.jInternalFrameDetalleFormTipoPrestamo!=null) {this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.setBorder(this.tipoprestamoConstantesFunciones.resaltarid_rubro_empleaTipoPrestamo);}
		if(this.tipoprestamoConstantesFunciones.resaltarid_cuenta_contableTipoPrestamo!=null && this.jInternalFrameDetalleFormTipoPrestamo!=null) {this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.setBorder(this.tipoprestamoConstantesFunciones.resaltarid_cuenta_contableTipoPrestamo);}
		if(this.tipoprestamoConstantesFunciones.resaltarcodigoTipoPrestamo!=null && this.jInternalFrameDetalleFormTipoPrestamo!=null) {this.jInternalFrameDetalleFormTipoPrestamo.jTextFieldcodigoTipoPrestamo.setBorder(this.tipoprestamoConstantesFunciones.resaltarcodigoTipoPrestamo);}
		if(this.tipoprestamoConstantesFunciones.resaltarnombreTipoPrestamo!=null && this.jInternalFrameDetalleFormTipoPrestamo!=null) {this.jInternalFrameDetalleFormTipoPrestamo.jTextAreanombreTipoPrestamo.setBorder(this.tipoprestamoConstantesFunciones.resaltarnombreTipoPrestamo);}
		if(this.tipoprestamoConstantesFunciones.resaltarcon_pagoTipoPrestamo!=null && this.jInternalFrameDetalleFormTipoPrestamo!=null) {this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxcon_pagoTipoPrestamo.setBorderPainted(true);this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxcon_pagoTipoPrestamo.setBorder(this.tipoprestamoConstantesFunciones.resaltarcon_pagoTipoPrestamo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoPrestamo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
	
		//this.jInternalFrameDetalleFormTipoPrestamo.jLabelidTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostraridTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jPanelidTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostraridTipoPrestamo);
		//this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarid_empresaTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jPanelid_empresaTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarid_empresaTipoPrestamo);
		//this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarid_rubro_empleaTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jPanelid_rubro_empleaTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarid_rubro_empleaTipoPrestamo);
		//this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarid_cuenta_contableTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jPanelid_cuenta_contableTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarid_cuenta_contableTipoPrestamo);
		//this.jInternalFrameDetalleFormTipoPrestamo.jTextFieldcodigoTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarcodigoTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jPanelcodigoTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarcodigoTipoPrestamo);
		//this.jInternalFrameDetalleFormTipoPrestamo.jTextAreanombreTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarnombreTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jPanelnombreTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarnombreTipoPrestamo);
		//this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxcon_pagoTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarcon_pagoTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jPanelcon_pagoTipoPrestamo.setVisible(this.tipoprestamoConstantesFunciones.mostrarcon_pagoTipoPrestamo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoPrestamo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPrestamo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPrestamo!=null) {
	
		this.jInternalFrameDetalleFormTipoPrestamo.jLabelidTipoPrestamo.setEnabled(this.tipoprestamoConstantesFunciones.activaridTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_empresaTipoPrestamo.setEnabled(this.tipoprestamoConstantesFunciones.activarid_empresaTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_rubro_empleaTipoPrestamo.setEnabled(this.tipoprestamoConstantesFunciones.activarid_rubro_empleaTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jComboBoxid_cuenta_contableTipoPrestamo.setEnabled(this.tipoprestamoConstantesFunciones.activarid_cuenta_contableTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jTextFieldcodigoTipoPrestamo.setEnabled(this.tipoprestamoConstantesFunciones.activarcodigoTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jTextAreanombreTipoPrestamo.setEnabled(this.tipoprestamoConstantesFunciones.activarnombreTipoPrestamo);
		this.jInternalFrameDetalleFormTipoPrestamo.jCheckBoxcon_pagoTipoPrestamo.setEnabled(this.tipoprestamoConstantesFunciones.activarcon_pagoTipoPrestamo);
		}
	}
	
		
}