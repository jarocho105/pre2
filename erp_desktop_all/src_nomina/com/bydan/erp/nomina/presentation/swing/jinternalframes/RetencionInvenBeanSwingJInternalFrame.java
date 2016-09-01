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

import com.bydan.erp.nomina.util.RetencionInvenConstantesFunciones;
import com.bydan.erp.nomina.util.RetencionInvenParameterReturnGeneral;
//import com.bydan.erp.nomina.util.RetencionInvenParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.RetencionInvenBean;
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
import com.bydan.erp.inventario.business.logic.*;

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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class RetencionInvenBeanSwingJInternalFrame extends RetencionInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RetencionInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RetencionInven> retencioninvenValidator = new ClassValidator<RetencionInven>(RetencionInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RetencionInven retencioninven;	
	public RetencionInven retencioninvenAux;
	public RetencionInven retencioninvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RetencionInven retencioninvenTotales;
	public Long idRetencionInvenActual;
	public Long iIdNuevoRetencionInven=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboCompra="";

	public List<Compra> comprasForeignKey;

	public List<Compra> getcomprasForeignKey() {
		return comprasForeignKey;
	}

	public void setcomprasForeignKey(List<Compra> comprasForeignKey) {
		this.comprasForeignKey = comprasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Compra compraForeignKey;

	public Compra getcompraForeignKey() {
		return compraForeignKey;
	}

	public void setcompraForeignKey(Compra compraForeignKey) {
		this.compraForeignKey = compraForeignKey;
	}

	public String sFinalQueryComboTipoRetencion="";

	public List<TipoRetencion> tiporetencionsForeignKey;

	public List<TipoRetencion> gettiporetencionsForeignKey() {
		return tiporetencionsForeignKey;
	}

	public void settiporetencionsForeignKey(List<TipoRetencion> tiporetencionsForeignKey) {
		this.tiporetencionsForeignKey = tiporetencionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRetencion tiporetencionForeignKey;

	public TipoRetencion gettiporetencionForeignKey() {
		return tiporetencionForeignKey;
	}

	public void settiporetencionForeignKey(TipoRetencion tiporetencionForeignKey) {
		this.tiporetencionForeignKey = tiporetencionForeignKey;
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

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
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
	
	public Boolean isPermisoTodoRetencionInven;
	public Boolean isPermisoNuevoRetencionInven;
	public Boolean isPermisoActualizarRetencionInven;
	public Boolean isPermisoActualizarOriginalRetencionInven;
	public Boolean isPermisoEliminarRetencionInven;
	public Boolean isPermisoGuardarCambiosRetencionInven;
	public Boolean isPermisoConsultaRetencionInven;
	public Boolean isPermisoBusquedaRetencionInven;
	public Boolean isPermisoReporteRetencionInven;
	public Boolean isPermisoPaginacionMedioRetencionInven;
	public Boolean isPermisoPaginacionAltoRetencionInven;
	public Boolean isPermisoPaginacionTodoRetencionInven;
	public Boolean isPermisoCopiarRetencionInven;
	public Boolean isPermisoVerFormRetencionInven;
	public Boolean isPermisoDuplicarRetencionInven;
	public Boolean isPermisoOrdenRetencionInven;
	
	
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
	
	public RetencionInvenParameterReturnGeneral retencioninvenReturnGeneral;
	public RetencionInvenParameterReturnGeneral retencioninvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRetencionInven=false;
	public Boolean esParaAccionDesdeFormularioRetencionInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RetencionInvenSessionBeanAdditional retencioninvenSessionBeanAdditional=null;
	
	public RetencionInvenSessionBeanAdditional getRetencionInvenSessionBeanAdditional() {
		return this.retencioninvenSessionBeanAdditional;
	}
	
	public void setRetencionInvenSessionBeanAdditional(RetencionInvenSessionBeanAdditional retencioninvenSessionBeanAdditional) {
		try {
			this.retencioninvenSessionBeanAdditional=retencioninvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RetencionInvenBeanSwingJInternalFrameAdditional retencioninvenBeanSwingJInternalFrameAdditional=null;
	//public class RetencionInvenBeanSwingJInternalFrame
	
	public RetencionInvenBeanSwingJInternalFrameAdditional getRetencionInvenBeanSwingJInternalFrameAdditional() {
		return this.retencioninvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setRetencionInvenBeanSwingJInternalFrameAdditional(RetencionInvenBeanSwingJInternalFrameAdditional retencioninvenBeanSwingJInternalFrameAdditional) {
		try {
			this.retencioninvenBeanSwingJInternalFrameAdditional=retencioninvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RetencionInvenLogic retencioninvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RetencionInven retencioninvenBean;
	public RetencionInvenConstantesFunciones retencioninvenConstantesFunciones;
	//public RetencionInvenParameterReturnGeneral retencioninvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public CompraLogic compraLogic;
	public TipoRetencionLogic tiporetencionLogic;
	public CuentaContableLogic cuentacontableLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<RetencionInven> retencioninvens;	
	//public List<RetencionInven> retencioninvensEliminados;
	//public List<RetencionInven> retencioninvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRetencionInven=false;
	public Boolean isVisibilidadCeldaDuplicarRetencionInven=true;
	public Boolean isVisibilidadCeldaCopiarRetencionInven=true;
	public Boolean isVisibilidadCeldaVerFormRetencionInven=true;
	public Boolean isVisibilidadCeldaOrdenRetencionInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRetencionInven=false;
	public Boolean isVisibilidadCeldaModificarRetencionInven=false;
	public Boolean isVisibilidadCeldaActualizarRetencionInven=false;
	public Boolean isVisibilidadCeldaEliminarRetencionInven=false;
	public Boolean isVisibilidadCeldaCancelarRetencionInven=false;
	public Boolean isVisibilidadCeldaGuardarRetencionInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRetencionInven=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdCompra=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoRetencion=false;
	
	public Long getiIdNuevoRetencionInven() {
		return this.iIdNuevoRetencionInven;
	}

	public void setiIdNuevoRetencionInven(Long iIdNuevoRetencionInven) {
		this.iIdNuevoRetencionInven = iIdNuevoRetencionInven;
	}
	
	public Long getidRetencionInvenActual() {
		return this.idRetencionInvenActual;
	}

	public void setidRetencionInvenActual(Long idRetencionInvenActual) {
		this.idRetencionInvenActual = idRetencionInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RetencionInven getretencioninven() {
		return this.retencioninven;
	}

	public void setretencioninven(RetencionInven retencioninven) {
		this.retencioninven = retencioninven;
	}
	
	public RetencionInven getretencioninvenAux() {
		return this.retencioninvenAux;
	}

	public void setretencioninvenAux(RetencionInven retencioninvenAux) {
		this.retencioninvenAux = retencioninvenAux;
	}				
	
	public RetencionInven getretencioninvenAnterior() {
		return this.retencioninvenAnterior;
	}

	public void setretencioninvenAnterior(RetencionInven retencioninvenAnterior) {
		this.retencioninvenAnterior = retencioninvenAnterior;
	}	
	
	public RetencionInven getretencioninvenTotales() {
		return this.retencioninvenTotales;
	}

	public void setretencioninvenTotales(RetencionInven retencioninvenTotales) {
		this.retencioninvenTotales = retencioninvenTotales;
	}	
	
	public RetencionInven getretencioninvenBean() {
		return this.retencioninvenBean;
	}

	public void setretencioninvenBean(RetencionInven retencioninvenBean) {
		this.retencioninvenBean = retencioninvenBean;
	}	
	
	public RetencionInvenParameterReturnGeneral getretencioninvenReturnGeneral() {
		return this.retencioninvenReturnGeneral;
	}

	public void setretencioninvenReturnGeneral(RetencionInvenParameterReturnGeneral retencioninvenReturnGeneral) {
		this.retencioninvenReturnGeneral = retencioninvenReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_compraFK_IdCompra=-1L;

	public Long getid_compraFK_IdCompra() {
		return this.id_compraFK_IdCompra;
	}

	public void setid_compraFK_IdCompra(Long id_compraFK_IdCompra) {
		this.id_compraFK_IdCompra = id_compraFK_IdCompra;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=null;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
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

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_retencionFK_IdTipoRetencion=-1L;

	public Long getid_tipo_retencionFK_IdTipoRetencion() {
		return this.id_tipo_retencionFK_IdTipoRetencion;
	}

	public void setid_tipo_retencionFK_IdTipoRetencion(Long id_tipo_retencionFK_IdTipoRetencion) {
		this.id_tipo_retencionFK_IdTipoRetencion = id_tipo_retencionFK_IdTipoRetencion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RetencionInvenLogic getRetencionInvenLogic()	{		
		return retencioninvenLogic;
	}

	public void setRetencionInvenLogic(RetencionInvenLogic retencioninvenLogic) {
		this.retencioninvenLogic = retencioninvenLogic;
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
	
	public Boolean getIsEsNuevoRetencionInven() {
		return isEsNuevoRetencionInven;
	}

	public void setIsEsNuevoRetencionInven(Boolean isEsNuevoRetencionInven) {
		this.isEsNuevoRetencionInven = isEsNuevoRetencionInven;
	}

	public Boolean getEsParaAccionDesdeFormularioRetencionInven() {
		return esParaAccionDesdeFormularioRetencionInven;
	}
	
	public void setEsParaAccionDesdeFormularioRetencionInven(Boolean esParaAccionDesdeFormularioRetencionInven) {
		this.esParaAccionDesdeFormularioRetencionInven = esParaAccionDesdeFormularioRetencionInven;
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

			if(this.retencioninvenSessionBean==null) {
				this.retencioninvenSessionBean=new RetencionInvenSessionBean();
			}

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(retencioninvenSessionBean.getlidEmpresaActual());
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

			if(this.retencioninvenSessionBean==null) {
				this.retencioninvenSessionBean=new RetencionInvenSessionBean();
			}

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(retencioninvenSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.retencioninvenSessionBean==null) {
				this.retencioninvenSessionBean=new RetencionInvenSessionBean();
			}

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(retencioninvenSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.retencioninvenSessionBean==null) {
				this.retencioninvenSessionBean=new RetencionInvenSessionBean();
			}

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(retencioninvenSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosComprasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.comprasForeignKey=new ArrayList<Compra>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CompraLogic compraLogic=new CompraLogic();

			//compraLogic.getCompraDataAccess().setIsForForeingKeyData(true);

			if(this.retencioninvenSessionBean==null) {
				this.retencioninvenSessionBean=new RetencionInvenSessionBean();
			}

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionCompra()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//compraLogic.getCompraDataAccess().setIsForForeingKeyData(true);

					compraLogic.getTodosComprasWithConnection(sFinalQuery,new Pagination());

					this.comprasForeignKey=compraLogic.getCompras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCompra(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					compraLogic.getEntityWithConnection(retencioninvenSessionBean.getlidCompraActual());
					this.comprasForeignKey.add(compraLogic.getCompra());
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

	public void cargarCombosTipoRetencionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRetencionLogic tiporetencionLogic=new TipoRetencionLogic();

			//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

			if(this.retencioninvenSessionBean==null) {
				this.retencioninvenSessionBean=new RetencionInvenSessionBean();
			}

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

					tiporetencionLogic.getTodosTipoRetencionsWithConnection(sFinalQuery,new Pagination());

					this.tiporetencionsForeignKey=tiporetencionLogic.getTipoRetencions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRetencion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getEntityWithConnection(retencioninvenSessionBean.getlidTipoRetencionActual());
					this.tiporetencionsForeignKey.add(tiporetencionLogic.getTipoRetencion());
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

			CuentaContable cuentacontableNulo = new CuentaContable();

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.retencioninvenSessionBean==null) {
				this.retencioninvenSessionBean=new RetencionInvenSessionBean();
			}

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablesForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.cuentacontablesForeignKey.add(0, cuentacontableNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(retencioninvenSessionBean.getlidCuentaContableActual());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.retencioninvenSessionBean==null) {
				this.retencioninvenSessionBean=new RetencionInvenSessionBean();
			}

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(retencioninvenSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

			if(this.retencioninvenSessionBean==null) {
				this.retencioninvenSessionBean=new RetencionInvenSessionBean();
			}

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(retencioninvenSessionBean.getlidMesActual());
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

					if(this.retencioninven!=null) {
						this.retencioninven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRetencionInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRetencionInvenGenerico)throws Exception
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
				jComboBoxid_empresaRetencionInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRetencionInvenGenerico!=null && jComboBoxid_empresaRetencionInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaRetencionInvenGenerico.setSelectedIndex(0);
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

					if(this.retencioninven!=null) {
						this.retencioninven.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalRetencionInven.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalRetencionInvenGenerico)throws Exception
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
				jComboBoxid_sucursalRetencionInvenGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalRetencionInvenGenerico!=null && jComboBoxid_sucursalRetencionInvenGenerico.getItemCount()>0) {
					jComboBoxid_sucursalRetencionInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.retencioninven!=null) {
						this.retencioninven.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioRetencionInven.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioRetencionInvenGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioRetencionInvenGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioRetencionInvenGenerico!=null && jComboBoxid_ejercicioRetencionInvenGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioRetencionInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.retencioninven!=null) {
						this.retencioninven.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoRetencionInven.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoRetencionInvenGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoRetencionInvenGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoRetencionInvenGenerico!=null && jComboBoxid_periodoRetencionInvenGenerico.getItemCount()>0) {
					jComboBoxid_periodoRetencionInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCompraForeignKey(Long idCompraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Compra  compraTemp=null;

			for(Compra compraAux:comprasForeignKey) {
				if(compraAux.getId()!=null && compraAux.getId().equals(idCompraSeleccionado)) {
					compraTemp=compraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(compraTemp!=null) {

					if(this.retencioninven!=null) {
						this.retencioninven.setCompra(compraTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.setSelectedItem(compraTemp);
					}
				} else {
					//jComboBoxid_compraRetencionInven.setSelectedItem(compraTemp);
					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCompra") || sFormularioTipoBusqueda.equals("Todos")){
					if(compraTemp!=null && jComboBoxid_compraFK_IdCompraRetencionInven!=null) {
						jComboBoxid_compraFK_IdCompraRetencionInven.setSelectedItem(compraTemp);
					} else {
						if(jComboBoxid_compraFK_IdCompraRetencionInven!=null) {
							//jComboBoxid_compraFK_IdCompraRetencionInven.setSelectedItem(compraTemp);
							if(jComboBoxid_compraFK_IdCompraRetencionInven.getItemCount()>0) {
								jComboBoxid_compraFK_IdCompraRetencionInven.setSelectedIndex(0);
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

	public String getActualCompraForeignKeyDescripcion(Long idCompraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Compra  compraTemp=null;

			for(Compra compraAux:comprasForeignKey) {
				if(compraAux.getId()!=null && compraAux.getId().equals(idCompraSeleccionado)) {
					compraTemp=compraAux;
					break;
				}
			}


			sDescripcion=CompraConstantesFunciones.getCompraDescripcion(compraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCompraForeignKeyGenerico(Long idCompraSeleccionado,JComboBox jComboBoxid_compraRetencionInvenGenerico)throws Exception
	{
		try
		{
			Compra  compraTemp=null;

			for(Compra compraAux:comprasForeignKey) {
				if(compraAux.getId()!=null && compraAux.getId().equals(idCompraSeleccionado)) {
					compraTemp=compraAux;
					break;
				}
			}

			if(compraTemp!=null) {
				jComboBoxid_compraRetencionInvenGenerico.setSelectedItem(compraTemp);
			} else {
				if(jComboBoxid_compraRetencionInvenGenerico!=null && jComboBoxid_compraRetencionInvenGenerico.getItemCount()>0) {
					jComboBoxid_compraRetencionInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRetencionForeignKey(Long idTipoRetencionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporetencionTemp!=null) {

					if(this.retencioninven!=null) {
						this.retencioninven.setTipoRetencion(tiporetencionTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.setSelectedItem(tiporetencionTemp);
					}
				} else {
					//jComboBoxid_tipo_retencionRetencionInven.setSelectedItem(tiporetencionTemp);
					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoRetencion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporetencionTemp!=null && jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven!=null) {
						jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.setSelectedItem(tiporetencionTemp);
					} else {
						if(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven!=null) {
							//jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.setSelectedItem(tiporetencionTemp);
							if(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.getItemCount()>0) {
								jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.setSelectedIndex(0);
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

	public String getActualTipoRetencionForeignKeyDescripcion(Long idTipoRetencionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}


			sDescripcion=TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRetencionForeignKeyGenerico(Long idTipoRetencionSeleccionado,JComboBox jComboBoxid_tipo_retencionRetencionInvenGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}

			if(tiporetencionTemp!=null) {
				jComboBoxid_tipo_retencionRetencionInvenGenerico.setSelectedItem(tiporetencionTemp);
			} else {
				if(jComboBoxid_tipo_retencionRetencionInvenGenerico!=null && jComboBoxid_tipo_retencionRetencionInvenGenerico.getItemCount()>0) {
					jComboBoxid_tipo_retencionRetencionInvenGenerico.setSelectedIndex(0);
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

					if(this.retencioninven!=null) {
						this.retencioninven.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableRetencionInven.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableRetencionInvenGenerico)throws Exception
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
				jComboBoxid_cuenta_contableRetencionInvenGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableRetencionInvenGenerico!=null && jComboBoxid_cuenta_contableRetencionInvenGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableRetencionInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.retencioninven!=null) {
						this.retencioninven.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioRetencionInven.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioRetencionInvenGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioRetencionInvenGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioRetencionInvenGenerico!=null && jComboBoxid_anioRetencionInvenGenerico.getItemCount()>0) {
					jComboBoxid_anioRetencionInvenGenerico.setSelectedIndex(0);
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

					if(this.retencioninven!=null) {
						this.retencioninven.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesRetencionInven.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesRetencionInvenGenerico)throws Exception
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
				jComboBoxid_mesRetencionInvenGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesRetencionInvenGenerico!=null && jComboBoxid_mesRetencionInvenGenerico.getItemCount()>0) {
					jComboBoxid_mesRetencionInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RetencionInven retencioninven,JComboBox jComboBoxid_empresaRetencionInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRetencionInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRetencionInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				retencioninven.setid_empresa(empresaAux.getId());
				retencioninven.setempresa_descripcion(RetencionInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				retencioninven.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(RetencionInven retencioninven,JComboBox jComboBoxid_sucursalRetencionInvenGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalRetencionInvenGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalRetencionInvenGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				retencioninven.setid_sucursal(sucursalAux.getId());
				retencioninven.setsucursal_descripcion(RetencionInvenConstantesFunciones.getSucursalDescripcion(sucursalAux));
				retencioninven.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(RetencionInven retencioninven,JComboBox jComboBoxid_ejercicioRetencionInvenGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioRetencionInvenGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioRetencionInvenGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				retencioninven.setid_ejercicio(ejercicioAux.getId());
				retencioninven.setejercicio_descripcion(RetencionInvenConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				retencioninven.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(RetencionInven retencioninven,JComboBox jComboBoxid_periodoRetencionInvenGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoRetencionInvenGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoRetencionInvenGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				retencioninven.setid_periodo(periodoAux.getId());
				retencioninven.setperiodo_descripcion(RetencionInvenConstantesFunciones.getPeriodoDescripcion(periodoAux));
				retencioninven.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCompraForeignKey(RetencionInven retencioninven,JComboBox jComboBoxid_compraRetencionInvenGenerico)throws Exception
	{
		try
		{
			Compra  compraAux=new Compra();

			if(jComboBoxid_compraRetencionInvenGenerico==null) {
				compraAux=(Compra)this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.getSelectedItem();
			} else {
				compraAux=(Compra)jComboBoxid_compraRetencionInvenGenerico.getSelectedItem();
			}

			if(compraAux!=null && compraAux.getId()!=null) {
				retencioninven.setid_compra(compraAux.getId());
				retencioninven.setcompra_descripcion(RetencionInvenConstantesFunciones.getCompraDescripcion(compraAux));
				retencioninven.setCompra(compraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRetencionForeignKey(RetencionInven retencioninven,JComboBox jComboBoxid_tipo_retencionRetencionInvenGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionAux=new TipoRetencion();

			if(jComboBoxid_tipo_retencionRetencionInvenGenerico==null) {
				tiporetencionAux=(TipoRetencion)this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.getSelectedItem();
			} else {
				tiporetencionAux=(TipoRetencion)jComboBoxid_tipo_retencionRetencionInvenGenerico.getSelectedItem();
			}

			if(tiporetencionAux!=null && tiporetencionAux.getId()!=null) {
				retencioninven.setid_tipo_retencion(tiporetencionAux.getId());
				retencioninven.settiporetencion_descripcion(RetencionInvenConstantesFunciones.getTipoRetencionDescripcion(tiporetencionAux));
				retencioninven.setTipoRetencion(tiporetencionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(RetencionInven retencioninven,JComboBox jComboBoxid_cuenta_contableRetencionInvenGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableRetencionInvenGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableRetencionInvenGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				retencioninven.setid_cuenta_contable(cuentacontableAux.getId());
				retencioninven.setcuentacontable_descripcion(RetencionInvenConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				retencioninven.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(RetencionInven retencioninven,JComboBox jComboBoxid_anioRetencionInvenGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioRetencionInvenGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioRetencionInvenGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				retencioninven.setid_anio(anioAux.getId());
				retencioninven.setanio_descripcion(RetencionInvenConstantesFunciones.getAnioDescripcion(anioAux));
				retencioninven.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(RetencionInven retencioninven,JComboBox jComboBoxid_mesRetencionInvenGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesRetencionInvenGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesRetencionInvenGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				retencioninven.setid_mes(mesAux.getId());
				retencioninven.setmes_descripcion(RetencionInvenConstantesFunciones.getMesDescripcion(mesAux));
				retencioninven.setMes(mesAux);			}
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

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
					}

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
					}

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
					}

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
					}

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameComprasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCompra=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.removeAllItems();

							for(Compra compra:this.comprasForeignKey) {
								this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.addItem(compra);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
					}

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCompra") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_compraFK_IdCompraRetencionInven.removeAllItems();

							for(Compra compra:this.comprasForeignKey) {
								this.jComboBoxid_compraFK_IdCompraRetencionInven.addItem(compra);
							}
						}

						if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRetencionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRetencion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.addItem(tiporetencion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
					}

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoRetencion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.addItem(tiporetencion);
							}
						}

						if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
					}

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.addItem(cuentacontable);
							}
						}

						if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
					}

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionInven!=null) { 
					}

					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCompraForeignKey(Compra compra,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.setSelectedItem(compra);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_compraFK_IdCompraRetencionInven.setSelectedItem(compra);
						} else {
							this.jComboBoxid_compraFK_IdCompraRetencionInven.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoRetencionForeignKey(TipoRetencion tiporetencion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.setSelectedItem(tiporetencion);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.setSelectedItem(tiporetencion);
						} else {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionInven!=null) {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesRetencionInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RetencionInvenConstantesFunciones.refrescarForeignKeysDescripcionesRetencionInven(this.retencioninvenLogic.getRetencionInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RetencionInvenConstantesFunciones.refrescarForeignKeysDescripcionesRetencionInven(this.retencioninvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Compra.class));
		classes.add(new Classe(TipoRetencion.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//retencioninvenLogic.setRetencionInvens(this.retencioninvens);
			retencioninvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RetencionInvenParameterReturnGeneral getRetencionInvenParameterGeneral() {
		return this.retencioninvenParameterGeneral;
	}
	
	public void setRetencionInvenParameterGeneral(RetencionInvenParameterReturnGeneral retencioninvenParameterGeneral) {
		this.retencioninvenParameterGeneral = retencioninvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRetencionInven() {
		return isPermisoTodoRetencionInven;
	}

	public void setIsPermisoTodoRetencionInven(Boolean isPermisoTodoRetencionInven) {
		this.isPermisoTodoRetencionInven = isPermisoTodoRetencionInven;
	}

	public Boolean getIsPermisoNuevoRetencionInven() {
		return isPermisoNuevoRetencionInven;
	}

	public void setIsPermisoNuevoRetencionInven(Boolean isPermisoNuevoRetencionInven) {
		this.isPermisoNuevoRetencionInven = isPermisoNuevoRetencionInven;
	}

	public Boolean getIsPermisoActualizarRetencionInven() {
		return isPermisoActualizarRetencionInven;
	}

	public void setIsPermisoActualizarRetencionInven(Boolean isPermisoActualizarRetencionInven) {
		this.isPermisoActualizarRetencionInven = isPermisoActualizarRetencionInven;
	}

	public Boolean getIsPermisoEliminarRetencionInven() {
		return isPermisoEliminarRetencionInven;
	}

	public void setIsPermisoEliminarRetencionInven(Boolean isPermisoEliminarRetencionInven) {
		this.isPermisoEliminarRetencionInven = isPermisoEliminarRetencionInven;
	}

	public Boolean getIsPermisoGuardarCambiosRetencionInven() {
		return isPermisoGuardarCambiosRetencionInven;
	}

	public void setIsPermisoGuardarCambiosRetencionInven(Boolean isPermisoGuardarCambiosRetencionInven) {
		this.isPermisoGuardarCambiosRetencionInven = isPermisoGuardarCambiosRetencionInven;
	}
	
	public Boolean getIsPermisoConsultaRetencionInven() {
		return isPermisoConsultaRetencionInven;
	}

	public void setIsPermisoConsultaRetencionInven(Boolean isPermisoConsultaRetencionInven) {
		this.isPermisoConsultaRetencionInven = isPermisoConsultaRetencionInven;
	}

	public Boolean getIsPermisoBusquedaRetencionInven() {
		return isPermisoBusquedaRetencionInven;
	}

	public void setIsPermisoBusquedaRetencionInven(Boolean isPermisoBusquedaRetencionInven) {
		this.isPermisoBusquedaRetencionInven = isPermisoBusquedaRetencionInven;
	}

	public Boolean getIsPermisoReporteRetencionInven() {
		return isPermisoReporteRetencionInven;
	}

	public void setIsPermisoReporteRetencionInven(Boolean isPermisoReporteRetencionInven) {
		this.isPermisoReporteRetencionInven = isPermisoReporteRetencionInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioRetencionInven() {
		return isPermisoPaginacionMedioRetencionInven;
	}

	public void setIsPermisoPaginacionMedioRetencionInven(Boolean isPermisoPaginacionMedioRetencionInven) {
		this.isPermisoPaginacionMedioRetencionInven = isPermisoPaginacionMedioRetencionInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoRetencionInven() {
		return isPermisoPaginacionTodoRetencionInven;
	}

	public void setIsPermisoPaginacionTodoRetencionInven(Boolean isPermisoPaginacionTodoRetencionInven) {
		this.isPermisoPaginacionTodoRetencionInven = isPermisoPaginacionTodoRetencionInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoRetencionInven() {
		return isPermisoPaginacionAltoRetencionInven;
	}

	public void setIsPermisoPaginacionAltoRetencionInven(Boolean isPermisoPaginacionAltoRetencionInven) {
		this.isPermisoPaginacionAltoRetencionInven = isPermisoPaginacionAltoRetencionInven;
	}
	
	public Boolean getIsPermisoCopiarRetencionInven() {
		return isPermisoCopiarRetencionInven;
	}

	public void setIsPermisoCopiarRetencionInven(Boolean isPermisoCopiarRetencionInven) {
		this.isPermisoCopiarRetencionInven = isPermisoCopiarRetencionInven;
	}
	
	public Boolean getIsPermisoVerFormRetencionInven() {
		return isPermisoVerFormRetencionInven;
	}

	public void setIsPermisoVerFormRetencionInven(Boolean isPermisoVerFormRetencionInven) {
		this.isPermisoVerFormRetencionInven = isPermisoVerFormRetencionInven;
	}
	
	public Boolean getIsPermisoDuplicarRetencionInven() {
		return isPermisoDuplicarRetencionInven;
	}

	public void setIsPermisoDuplicarRetencionInven(Boolean isPermisoDuplicarRetencionInven) {
		this.isPermisoDuplicarRetencionInven = isPermisoDuplicarRetencionInven;
	}
	
	public Boolean getIsPermisoOrdenRetencionInven() {
		return isPermisoOrdenRetencionInven;
	}

	public void setIsPermisoOrdenRetencionInven(Boolean isPermisoOrdenRetencionInven) {
		this.isPermisoOrdenRetencionInven = isPermisoOrdenRetencionInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRetencionInven() {
		return isVisibilidadCeldaNuevoRetencionInven;
	}

	public void setIsVisibilidadCeldaNuevoRetencionInven(Boolean isVisibilidadCeldaNuevoRetencionInven) {
		this.isVisibilidadCeldaNuevoRetencionInven = isVisibilidadCeldaNuevoRetencionInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRetencionInven() {
		return isVisibilidadCeldaDuplicarRetencionInven;
	}

	public void setIsVisibilidadCeldaDuplicarRetencionInven(Boolean isVisibilidadCeldaDuplicarRetencionInven) {
		this.isVisibilidadCeldaDuplicarRetencionInven = isVisibilidadCeldaDuplicarRetencionInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRetencionInven() {
		return isVisibilidadCeldaCopiarRetencionInven;
	}

	public void setIsVisibilidadCeldaCopiarRetencionInven(Boolean isVisibilidadCeldaCopiarRetencionInven) {
		this.isVisibilidadCeldaCopiarRetencionInven = isVisibilidadCeldaCopiarRetencionInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRetencionInven() {
		return isVisibilidadCeldaVerFormRetencionInven;
	}

	public void setIsVisibilidadCeldaVerFormRetencionInven(Boolean isVisibilidadCeldaVerFormRetencionInven) {
		this.isVisibilidadCeldaVerFormRetencionInven = isVisibilidadCeldaVerFormRetencionInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRetencionInven() {
		return isVisibilidadCeldaOrdenRetencionInven;
	}

	public void setIsVisibilidadCeldaOrdenRetencionInven(Boolean isVisibilidadCeldaOrdenRetencionInven) {
		this.isVisibilidadCeldaOrdenRetencionInven = isVisibilidadCeldaOrdenRetencionInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRetencionInven() {
		return isVisibilidadCeldaNuevoRelacionesRetencionInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRetencionInven(Boolean isVisibilidadCeldaNuevoRelacionesRetencionInven) {
		this.isVisibilidadCeldaNuevoRelacionesRetencionInven = isVisibilidadCeldaNuevoRelacionesRetencionInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRetencionInven() {
		return isVisibilidadCeldaModificarRetencionInven;
	}

	public void setIsVisibilidadCeldaModificarRetencionInven(Boolean isVisibilidadCeldaModificarRetencionInven) {
		this.isVisibilidadCeldaModificarRetencionInven = isVisibilidadCeldaModificarRetencionInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRetencionInven() {
		return isVisibilidadCeldaActualizarRetencionInven;
	}

	public void setIsVisibilidadCeldaActualizarRetencionInven(Boolean isVisibilidadCeldaActualizarRetencionInven) {
		this.isVisibilidadCeldaActualizarRetencionInven = isVisibilidadCeldaActualizarRetencionInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarRetencionInven() {
		return isVisibilidadCeldaEliminarRetencionInven;
	}

	public void setIsVisibilidadCeldaEliminarRetencionInven(Boolean isVisibilidadCeldaEliminarRetencionInven) {
		this.isVisibilidadCeldaEliminarRetencionInven = isVisibilidadCeldaEliminarRetencionInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarRetencionInven() {
		return isVisibilidadCeldaCancelarRetencionInven;
	}

	public void setIsVisibilidadCeldaCancelarRetencionInven(Boolean isVisibilidadCeldaCancelarRetencionInven) {
		this.isVisibilidadCeldaCancelarRetencionInven = isVisibilidadCeldaCancelarRetencionInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarRetencionInven() {
		return isVisibilidadCeldaGuardarRetencionInven;
	}

	public void setIsVisibilidadCeldaGuardarRetencionInven(Boolean isVisibilidadCeldaGuardarRetencionInven) {
		this.isVisibilidadCeldaGuardarRetencionInven = isVisibilidadCeldaGuardarRetencionInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRetencionInven() {
		return isVisibilidadCeldaGuardarCambiosRetencionInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRetencionInven(Boolean isVisibilidadCeldaGuardarCambiosRetencionInven) {
		this.isVisibilidadCeldaGuardarCambiosRetencionInven = isVisibilidadCeldaGuardarCambiosRetencionInven;
	}
		
	public RetencionInvenSessionBean getretencioninvenSessionBean() {
		return this.retencioninvenSessionBean;
	}
	
	public void setretencioninvenSessionBean(RetencionInvenSessionBean retencioninvenSessionBean) {
		this.retencioninvenSessionBean=retencioninvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdCompra() {
		return this.isVisibilidadFK_IdCompra;
	}

	public void setisVisibilidadFK_IdCompra(Boolean isVisibilidadFK_IdCompra) {
		this.isVisibilidadFK_IdCompra=isVisibilidadFK_IdCompra;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
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

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoRetencion() {
		return this.isVisibilidadFK_IdTipoRetencion;
	}

	public void setisVisibilidadFK_IdTipoRetencion(Boolean isVisibilidadFK_IdTipoRetencion) {
		this.isVisibilidadFK_IdTipoRetencion=isVisibilidadFK_IdTipoRetencion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRetencionInven(RetencionInven retencioninven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(retencioninven,null);
				this.setActualParaGuardarSucursalForeignKey(retencioninven,null);
				this.setActualParaGuardarEjercicioForeignKey(retencioninven,null);
				this.setActualParaGuardarPeriodoForeignKey(retencioninven,null);
				this.setActualParaGuardarCompraForeignKey(retencioninven,null);
				this.setActualParaGuardarTipoRetencionForeignKey(retencioninven,null);
				this.setActualParaGuardarCuentaContableForeignKey(retencioninven,null);
				this.setActualParaGuardarAnioForeignKey(retencioninven,null);
				this.setActualParaGuardarMesForeignKey(retencioninven,null);
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
	
	public void bugActualizarReferenciaActual(RetencionInven retencioninven,RetencionInven retencioninvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRetencionInven(retencioninven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		retencioninvenAux.setId(retencioninven.getId());
		retencioninvenAux.setVersionRow(retencioninven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRetencionInven();
		
			int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RetencionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = retencioninvenValidator.getInvalidValues(this.retencioninven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			retencioninvenLogic.setDatosCliente(datosCliente);
			retencioninvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				retencioninvenAux=new  RetencionInven();
				
				retencioninvenAux.setIsNew(true);
				retencioninvenAux.setIsChanged(true);
				
				retencioninvenAux.setRetencionInvenOriginal(this.retencioninven);
				
				retencioninvenAux.setId(this.retencioninven.getId());	
				retencioninvenAux.setVersionRow(this.retencioninven.getVersionRow());	
				retencioninvenAux.setid_empresa(this.retencioninven.getid_empresa());	
				retencioninvenAux.setid_sucursal(this.retencioninven.getid_sucursal());	
				retencioninvenAux.setid_ejercicio(this.retencioninven.getid_ejercicio());	
				retencioninvenAux.setid_periodo(this.retencioninven.getid_periodo());	
				retencioninvenAux.setid_compra(this.retencioninven.getid_compra());	
				retencioninvenAux.setid_tipo_retencion(this.retencioninven.getid_tipo_retencion());	
				retencioninvenAux.setporcentaje(this.retencioninven.getporcentaje());	
				retencioninvenAux.setbase_imponible(this.retencioninven.getbase_imponible());	
				retencioninvenAux.setretencion(this.retencioninven.getretencion());	
				retencioninvenAux.setnumero_retencion(this.retencioninven.getnumero_retencion());	
				
				if(this.retencioninven.getid_cuenta_contable()!=null && this.retencioninven.getid_cuenta_contable()>0L) {
					retencioninvenAux.setid_cuenta_contable(this.retencioninven.getid_cuenta_contable());
				} else {
					retencioninvenAux.setid_cuenta_contable(null);
				}	
				retencioninvenAux.setid_anio(this.retencioninven.getid_anio());	
				retencioninvenAux.setid_mes(this.retencioninven.getid_mes());	
				retencioninvenAux.setnumero_serie_retencion(this.retencioninven.getnumero_serie_retencion());	
				retencioninvenAux.setcodigo(this.retencioninven.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.retencioninvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.retencioninvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(retencioninvenAux,retencioninvenLogic.getRetencionInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(retencioninvenAux,retencioninvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.retencioninvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.retencioninvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenLogic.saveRetencionInvens();//WithConnection
						//retencioninvenLogic.getSetVersionRowRetencionInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.retencioninven,retencioninvenAux);
					
					this.refrescarForeignKeysDescripcionesRetencionInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.retencioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								retencioninvenLogic.saveRetencionInvenRelaciones(retencioninvenAux);//WithConnection
								//retencioninvenLogic.getSetVersionRowRetencionInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.retencioninven,retencioninvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.retencioninvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.retencioninvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(retencioninvenAux,retencioninvenLogic.getRetencionInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(retencioninvenAux,retencioninvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.retencioninven,retencioninvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				retencioninvenAux=new  RetencionInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.retencioninvenSessionBean.getEsGuardarRelacionado() 
					|| (this.retencioninvenSessionBean.getEsGuardarRelacionado() && this.retencioninven.getId()>=0)) {
						
					retencioninvenAux.setIsNew(false);
				}
				
				retencioninvenAux.setIsDeleted(false);
			
				retencioninvenAux.setId(this.retencioninven.getId());	
				retencioninvenAux.setVersionRow(this.retencioninven.getVersionRow());	
				retencioninvenAux.setid_empresa(this.retencioninven.getid_empresa());	
				retencioninvenAux.setid_sucursal(this.retencioninven.getid_sucursal());	
				retencioninvenAux.setid_ejercicio(this.retencioninven.getid_ejercicio());	
				retencioninvenAux.setid_periodo(this.retencioninven.getid_periodo());	
				retencioninvenAux.setid_compra(this.retencioninven.getid_compra());	
				retencioninvenAux.setid_tipo_retencion(this.retencioninven.getid_tipo_retencion());	
				retencioninvenAux.setporcentaje(this.retencioninven.getporcentaje());	
				retencioninvenAux.setbase_imponible(this.retencioninven.getbase_imponible());	
				retencioninvenAux.setretencion(this.retencioninven.getretencion());	
				retencioninvenAux.setnumero_retencion(this.retencioninven.getnumero_retencion());	
				
				if(this.retencioninven.getid_cuenta_contable()!=null && this.retencioninven.getid_cuenta_contable()>0L) {
					retencioninvenAux.setid_cuenta_contable(this.retencioninven.getid_cuenta_contable());
				} else {
					retencioninvenAux.setid_cuenta_contable(null);
				}	
				retencioninvenAux.setid_anio(this.retencioninven.getid_anio());	
				retencioninvenAux.setid_mes(this.retencioninven.getid_mes());	
				retencioninvenAux.setnumero_serie_retencion(this.retencioninven.getnumero_serie_retencion());	
				retencioninvenAux.setcodigo(this.retencioninven.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(retencioninvenAux,retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(retencioninvenAux,retencioninvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.retencioninvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.retencioninvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenLogic.saveRetencionInvens();//WithConnection
						//retencioninvenLogic.getSetVersionRowRetencionInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.retencioninven,retencioninvenAux);
					
					this.refrescarForeignKeysDescripcionesRetencionInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.retencioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								retencioninvenLogic.saveRetencionInvenRelaciones(retencioninvenAux);//WithConnection
								//retencioninvenLogic.getSetVersionRowRetencionInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.retencioninven,retencioninvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.retencioninvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.retencioninvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(retencioninvenAux,retencioninvenLogic.getRetencionInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(retencioninvenAux,retencioninvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.retencioninven,retencioninvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				retencioninvenAux=new  RetencionInven();
				
				retencioninvenAux.setIsNew(false);
				retencioninvenAux.setIsChanged(false);
				
				retencioninvenAux.setIsDeleted(true);
				
				retencioninvenAux.setId(this.retencioninven.getId());	
				retencioninvenAux.setVersionRow(this.retencioninven.getVersionRow());	
				retencioninvenAux.setid_empresa(this.retencioninven.getid_empresa());	
				retencioninvenAux.setid_sucursal(this.retencioninven.getid_sucursal());	
				retencioninvenAux.setid_ejercicio(this.retencioninven.getid_ejercicio());	
				retencioninvenAux.setid_periodo(this.retencioninven.getid_periodo());	
				retencioninvenAux.setid_compra(this.retencioninven.getid_compra());	
				retencioninvenAux.setid_tipo_retencion(this.retencioninven.getid_tipo_retencion());	
				retencioninvenAux.setporcentaje(this.retencioninven.getporcentaje());	
				retencioninvenAux.setbase_imponible(this.retencioninven.getbase_imponible());	
				retencioninvenAux.setretencion(this.retencioninven.getretencion());	
				retencioninvenAux.setnumero_retencion(this.retencioninven.getnumero_retencion());	
				
				if(this.retencioninven.getid_cuenta_contable()!=null && this.retencioninven.getid_cuenta_contable()>0L) {
					retencioninvenAux.setid_cuenta_contable(this.retencioninven.getid_cuenta_contable());
				} else {
					retencioninvenAux.setid_cuenta_contable(null);
				}	
				retencioninvenAux.setid_anio(this.retencioninven.getid_anio());	
				retencioninvenAux.setid_mes(this.retencioninven.getid_mes());	
				retencioninvenAux.setnumero_serie_retencion(this.retencioninven.getnumero_serie_retencion());	
				retencioninvenAux.setcodigo(this.retencioninven.getcodigo());	
				
				if(this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.retencioninvenAux.getId()>=0) {	
						this.retencioninvensEliminados.add(retencioninvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(retencioninvenAux,retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(retencioninvenAux,retencioninvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.retencioninvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.retencioninvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenLogic.saveRetencionInvens();//WithConnection
						//retencioninvenLogic.getSetVersionRowRetencionInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.retencioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								retencioninvenLogic.saveRetencionInvenRelaciones(retencioninvenAux);//WithConnection
								//retencioninvenLogic.getSetVersionRowRetencionInvens();//WithConnection
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
							if(this.retencioninvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.retencioninvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(retencioninvenAux,retencioninvenLogic.getRetencionInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(retencioninvenAux,retencioninvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getRetencionInvens().addAll(this.retencioninvensEliminados);
					
					retencioninvenLogic.saveRetencionInvens();//WithConnection
					//retencioninvenLogic.getSetVersionRowRetencionInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRetencionInven();
				
				this.retencioninvensEliminados= new ArrayList<RetencionInven>();		
			}
			
			if(this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Retencion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Retencion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.retencioninven=retencioninvenAux;
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
      		//this.finishProcessRetencionInven();
      	}
		
	}	
	
	public void actualizarRelaciones(RetencionInven retencioninvenLocal) throws Exception {
		
		if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RetencionInven retencioninvenLocal) throws Exception {	
		if(this.retencioninvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				retencioninvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				retencioninvenLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				retencioninvenLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				retencioninvenLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CompraDetalleFormJInternalFrame.class)) {
				CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrameLocal=(CompraBeanSwingJInternalFrame) ((CompraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				compraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCompra(compraBeanSwingJInternalFrameLocal.getcompra(),true);
				compraBeanSwingJInternalFrameLocal.actualizarLista(compraBeanSwingJInternalFrameLocal.compra,this.comprasForeignKey);

				compraBeanSwingJInternalFrameLocal.actualizarRelaciones(compraBeanSwingJInternalFrameLocal.compra);

				retencioninvenLocal.setCompra(compraBeanSwingJInternalFrameLocal.compra);

				this.addItemDefectoCombosForeignKeyCompra();
				this.cargarCombosFrameComprasForeignKey("Formulario");
				this.setActualCompraForeignKey(compraBeanSwingJInternalFrameLocal.compra.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRetencionDetalleFormJInternalFrame.class)) {
				TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrameLocal=(TipoRetencionBeanSwingJInternalFrame) ((TipoRetencionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporetencionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.gettiporetencion(),true);
				tiporetencionBeanSwingJInternalFrameLocal.actualizarLista(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion,this.tiporetencionsForeignKey);

				tiporetencionBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				retencioninvenLocal.setTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				this.addItemDefectoCombosForeignKeyTipoRetencion();
				this.cargarCombosFrameTipoRetencionsForeignKey("Formulario");
				this.setActualTipoRetencionForeignKey(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				retencioninvenLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				retencioninvenLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				retencioninvenLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRetencionInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = retencioninvenValidator.getInvalidValues(this.retencioninven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RetencionInven retencioninven,List<RetencionInven> retencioninvens) throws Exception {
		try	{		
			RetencionInvenConstantesFunciones.actualizarLista(retencioninven,retencioninvens,this.retencioninvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RetencionInven retencioninven,List<RetencionInven> retencioninvens) throws Exception {
		try	{			
			RetencionInvenConstantesFunciones.actualizarSelectedLista(retencioninven,retencioninvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RetencionInven> retencioninvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				retencioninvensLocal=this.retencioninvenLogic.getRetencionInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				retencioninvensLocal=this.retencioninvens;
			}
			//ARCHITECTURE
		
			for(RetencionInven retencioninvenLocal:retencioninvensLocal) {
				if(this.permiteMantenimiento(retencioninvenLocal) && retencioninvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RetencionInvenConstantesFunciones.getRetencionInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelid_empresaRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelid_sucursalRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelid_ejercicioRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelid_periodoRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.IDCOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelid_compraRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.IDTIPORETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelid_tipo_retencionRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelporcentajeRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.BASEIMPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelbase_imponibleRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.RETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelretencionRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.NUMERORETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelnumero_retencionRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelid_cuenta_contableRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelid_anioRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelid_mesRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.NUMEROSERIERETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelnumero_serie_retencionRetencionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionInvenConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelcodigoRetencionInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelid_empresaRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelid_sucursalRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelid_ejercicioRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelid_periodoRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelid_compraRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelid_tipo_retencionRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelporcentajeRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelbase_imponibleRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelretencionRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelnumero_retencionRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelid_cuenta_contableRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelid_anioRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelid_mesRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelnumero_serie_retencionRetencionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionInven.jLabelcodigoRetencionInven,"");
		
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
		this.iIdNuevoRetencionInven--;	
		
		
		this.retencioninvenAux=new RetencionInven();
		
		this.retencioninvenAux.setId(this.iIdNuevoRetencionInven);
		this.retencioninvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.retencioninvenLogic.getRetencionInvens().add(this.retencioninvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.retencioninvens.add(this.retencioninvenAux);
		}
		//ARCHITECTURE
		
		this.retencioninven=this.retencioninvenAux;
		
		if(RetencionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRetencionInven(this.retencioninven);
			this.setVariablesObjetoActualToFormularioForeignKeyRetencionInven(this.retencioninven);
		}
				
		//this.setDefaultControlesRetencionInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRetencionInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRetencionInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRetencionInven(this.retencioninvenBean,this.retencioninven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RetencionInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
			classes=RetencionInvenConstantesFunciones.getClassesRelationshipsOfRetencionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.retencioninvenReturnGeneral=retencioninvenLogic.procesarEventosRetencionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.retencioninvenLogic.getRetencionInvens(),this.retencioninven,this.retencioninvenParameterGeneral,this.isEsNuevoRetencionInven,classes);//this.retencioninvenLogic.getRetencionInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRetencionInven(this.retencioninvenReturnGeneral,this.retencioninvenBean,false);
		
		if(this.retencioninvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRetencionInven(this.retencioninvenReturnGeneral.getRetencionInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRetencionInven(this.retencioninvenReturnGeneral.getRetencionInven());
		}
		
		if(this.retencioninvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRetencionInven(this.retencioninvenReturnGeneral.getRetencionInven(),classes);//this.retencioninvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRetencionInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRetencionInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RetencionInvenBeanSwingJInternalFrameAdditional.RecargarFormRetencionInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRetencionInven(false);
						
			if(retencioninvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionInven();
			}
			
			this.actualizarVisualTableDatosRetencionInven();
			
			this.jTableDatosRetencionInven.setRowSelectionInterval(this.getIndiceNuevoRetencionInven(), this.getIndiceNuevoRetencionInven());
			
			this.seleccionarFilaTablaRetencionInvenActual();
						
			this.actualizarEstadoCeldasBotonesRetencionInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRetencionInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldporcentajeRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarporcentajeRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldbase_imponibleRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarbase_imponibleRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldretencionRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarretencionRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_retencionRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarnumero_retencionRetencionInven);//
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_serie_retencionRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarnumero_serie_retencionRetencionInven);//
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldcodigoRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarcodigoRetencionInven);	
		//
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarid_empresaRetencionInven);//
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarid_sucursalRetencionInven);//
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarid_ejercicioRetencionInven);//
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarid_periodoRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarid_compraRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarid_tipo_retencionRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarid_cuenta_contableRetencionInven);//
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarid_anioRetencionInven);//
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.setEnabled(isHabilitar && this.retencioninvenConstantesFunciones.activarid_mesRetencionInven);
	};
	
	public void setDefaultControlesRetencionInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRetencionInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.retencioninvenSessionBean.setConGuardarRelaciones(true);			
			this.retencioninvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRetencionInven.jTabbedPaneRelacionesRetencionInven.setVisible(true);
			
					
		} else {
			//this.retencioninvenSessionBean.setConGuardarRelaciones(false);			
			this.retencioninvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRetencionInven.jTabbedPaneRelacionesRetencionInven.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRetencionInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionInven retencioninvenAux:this.retencioninvenLogic.getRetencionInvens()) {
				if(retencioninvenAux.getId().equals(this.iIdNuevoRetencionInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionInven retencioninvenAux:this.retencioninvens) {
				if(retencioninvenAux.getId().equals(this.iIdNuevoRetencionInven)) {
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
	
	public int getIndiceActualRetencionInven(RetencionInven retencioninven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionInven retencioninvenAux:this.retencioninvenLogic.getRetencionInvens()) {
				if(retencioninvenAux.getId().equals(retencioninven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionInven retencioninvenAux:this.retencioninvens) {
				if(retencioninvenAux.getId().equals(retencioninven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRetencionInven(RetencionInven retencioninvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionInven retencioninvenAux:this.retencioninvenLogic.getRetencionInvens()) {
				if(retencioninvenAux.getRetencionInvenOriginal().getId().equals(retencioninvenOriginal.getId())) {
					existe=true;
					retencioninvenOriginal.setId(retencioninvenAux.getId());
					retencioninvenOriginal.setVersionRow(retencioninvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionInven retencioninvenAux:this.retencioninvens) {
				if(retencioninvenAux.getRetencionInvenOriginal().getId().equals(retencioninvenOriginal.getId())) {
					existe=true;
					retencioninvenOriginal.setId(retencioninvenAux.getId());
					retencioninvenOriginal.setVersionRow(retencioninvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRetencionInven(Boolean esParaCancelar) throws Exception {
		retencioninvensAux=new ArrayList<RetencionInven>();
		retencioninvenAux=new RetencionInven();
		
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RetencionInven retencioninvenAux:this.retencioninvenLogic.getRetencionInvens()) {
					if(retencioninvenAux.getId()<0) {
						retencioninvensAux.add(retencioninvenAux);
					}		
				}
				this.iIdNuevoRetencionInven=0L;
				this.retencioninvenLogic.getRetencionInvens().removeAll(retencioninvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionInven retencioninvenAux:this.retencioninvens) {
					if(retencioninvenAux.getId()<0) {
						retencioninvensAux.add(retencioninvenAux);
					}		
				}
				this.iIdNuevoRetencionInven=0L;
				this.retencioninvens.removeAll(retencioninvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRetencionInven 
					&& this.retencioninvenLogic.getRetencionInvens().size()>0
					) {
					retencioninvenAux=this.retencioninvenLogic.getRetencionInvens().get(this.retencioninvenLogic.getRetencionInvens().size() - 1);
				
					if(retencioninvenAux.getId()<0) {
						this.retencioninvenLogic.getRetencionInvens().remove(retencioninvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRetencionInven && this.retencioninvens.size()>0) {
					retencioninvenAux=this.retencioninvens.get(this.retencioninvens.size() - 1);
				
					if(retencioninvenAux.getId()<0) {
						this.retencioninvens.remove(retencioninvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRetencionInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(retencioninven.getId()<0) {
				this.retencioninvenLogic.getRetencionInvens().remove(this.retencioninven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(retencioninven.getId()<0) {
				this.retencioninvens.remove(this.retencioninven);
			}
		}			
	}
	
	public void setEstadosInicialesRetencionInven(List<RetencionInven> retencioninvensAux) throws Exception {
		RetencionInvenConstantesFunciones.setEstadosInicialesRetencionInven(retencioninvensAux);
	}
	
	public void setEstadosInicialesRetencionInven(RetencionInven retencioninvenAux) throws Exception {
		RetencionInvenConstantesFunciones.setEstadosInicialesRetencionInven(retencioninvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRetencionInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRetencionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRetencionInvenActual()) {
				if(!this.isEsNuevoRetencionInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRetencionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRetencionInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRetencionInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Retencion ?", "MANTENIMIENTO DE Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRetencionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RetencionInven retencioninven) throws Exception {
		RetencionInvenConstantesFunciones.seleccionarAsignar(this.retencioninven,retencioninven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRetencionInven=this.isPermisoActualizarOriginalRetencionInven;
			
			
			this.seleccionarAsignar(retencioninven);
			
			

			idCuentaContableActual=retencioninven.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RetencionInvenConstantesFunciones.quitarEspaciosRetencionInven(this.retencioninven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRetencionInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.retencioninvenSessionBean.setsFuncionBusquedaRapida(this.retencioninvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoRetencionInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRetencionInven(esParaCancelar);				
				this.cancelarNuevoRetencionInven(esParaCancelar);								
			}
			
			this.retencioninven=new RetencionInven();
			
			this.inicializarRetencionInven();
			
			this.actualizarEstadoCeldasBotonesRetencionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRetencionInven() throws Exception {
		try {
			RetencionInvenConstantesFunciones.inicializarRetencionInven(this.retencioninven);
			
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
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.retencioninvenLogic.getRetencionInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRetencionInvens(String sAccionBusqueda,List<RetencionInven> retencioninvensParaReportes) throws Exception {
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
					sPathReporteFinal="RetencionInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RetencionInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RetencionInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RetencionInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Retenciones");		
		parameters.put("busquedapor", RetencionInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRetencionInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RetencionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RetencionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRetencionInven=new JRBeanArrayDataSource(RetencionInvenJInternalFrame.TraerRetencionInvenBeans(retencioninvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRetencionInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RetencionInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RetencionInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RetencionInvenBean.TraerRetencionInvenBeans(retencioninvensParaReportes).toArray()));
							
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
				this.generarExcelReporteRetencionInvens(sAccionBusqueda,sTipoArchivoReporte,retencioninvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRetencionInvens(sAccionBusqueda,sTipoArchivoReporte,retencioninvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRetencionInvenActionPerformed(null);
					//this.generarExcelReporteRetencionInvens(sAccionBusqueda,sTipoArchivoReporte,retencioninvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRetencionInvens(sAccionBusqueda,sTipoArchivoReporte,retencioninvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRetencionInvens(sAccionBusqueda,sTipoArchivoReporte,retencioninvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRetencionInvens(sAccionBusqueda,sTipoArchivoReporte,retencioninvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRetencionInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionInven> retencioninvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencioninven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRetencionInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RetencionInven retencioninven : retencioninvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RetencionInvenConstantesFunciones.generarExcelReporteDataRetencionInven("NORMAL",row,workbook,retencioninven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRetencionInven(String sTipo,Row row,Workbook workbook) {
		
		RetencionInvenConstantesFunciones.generarExcelReporteHeaderRetencionInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRetencionInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionInven> retencioninvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencioninven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RetencionInven retencioninven : retencioninvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RetencionInvenConstantesFunciones.getRetencionInvenDescripcion(retencioninven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_IDCOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDCOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getcompra_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.gettiporetencion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getbase_imponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_RETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_RETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getretencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getnumero_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getnumero_serie_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionInvenConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencioninven.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRetencionInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionInven> retencioninvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RetencionInven> retencioninvensRespaldo=null;
		
		classes=RetencionInvenConstantesFunciones.getClassesRelationshipsOfRetencionInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.retencioninvenLogic.setDatosCliente(this.datosCliente);
		this.retencioninvenLogic.setDatosDeep(this.datosDeep);
		this.retencioninvenLogic.setIsConDeep(true);
		
		retencioninvensRespaldo=this.retencioninvenLogic.getRetencionInvens();
		
		this.retencioninvenLogic.setRetencionInvens(retencioninvensParaReportes);	
		this.retencioninvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		retencioninvensParaReportes=this.retencioninvenLogic.getRetencionInvens();
		this.retencioninvenLogic.setRetencionInvens(retencioninvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencioninven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRetencionInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RetencionInven retencioninven : retencioninvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRetencionInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RetencionInvenConstantesFunciones.generarExcelReporteDataRetencionInven("NORMAL",row,workbook,retencioninven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RetencionInvenConstantesFunciones.getRetencionInvenDescripcion(retencioninven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRetencionInven() throws Exception {		
		this.startProcessRetencionInven(true);
	}
	
	public void startProcessRetencionInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRetencionInven ,this.jPanelParametrosReportesRetencionInven, this.jScrollPanelDatosRetencionInven,this.jPanelPaginacionRetencionInven, this.jScrollPanelDatosEdicionRetencionInven, this.jPanelAccionesRetencionInven,this.jPanelAccionesFormularioRetencionInven,this.jmenuBarRetencionInven,this.jmenuBarDetalleRetencionInven,this.jTtoolBarRetencionInven,this.jTtoolBarDetalleRetencionInven);		
		
		final JTabbedPane jTabbedPaneBusquedasRetencionInven=this.jTabbedPaneBusquedasRetencionInven; 
		
		final JPanel jPanelParametrosReportesRetencionInven=this.jPanelParametrosReportesRetencionInven;
		//final JScrollPane jScrollPanelDatosRetencionInven=this.jScrollPanelDatosRetencionInven;
		final JTable jTableDatosRetencionInven=this.jTableDatosRetencionInven;		
		final JPanel jPanelPaginacionRetencionInven=this.jPanelPaginacionRetencionInven;
		//final JScrollPane jScrollPanelDatosEdicionRetencionInven=this.jScrollPanelDatosEdicionRetencionInven;
		final JPanel jPanelAccionesRetencionInven=this.jPanelAccionesRetencionInven;
		
		JPanel jPanelCamposAuxiliarRetencionInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRetencionInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			jPanelCamposAuxiliarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jPanelCamposRetencionInven;
			jPanelAccionesFormularioAuxiliarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jPanelAccionesFormularioRetencionInven;
		}
		
		final JPanel jPanelCamposRetencionInven=jPanelCamposAuxiliarRetencionInven;
		final JPanel jPanelAccionesFormularioRetencionInven=jPanelAccionesFormularioAuxiliarRetencionInven;
		
		
		final JMenuBar jmenuBarRetencionInven=this.jmenuBarRetencionInven;
		final JToolBar jTtoolBarRetencionInven=this.jTtoolBarRetencionInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRetencionInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRetencionInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			jmenuBarDetalleAuxiliarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jmenuBarDetalleRetencionInven;
			jTtoolBarDetalleAuxiliarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jTtoolBarDetalleRetencionInven;
		}
		
		final JMenuBar jmenuBarDetalleRetencionInven=jmenuBarDetalleAuxiliarRetencionInven;
		final JToolBar jTtoolBarDetalleRetencionInven=jTtoolBarDetalleAuxiliarRetencionInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRetencionInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRetencionInven;
			processRunnable.jTableDatos=jTableDatosRetencionInven;
			processRunnable.jPanelCampos=jPanelCamposRetencionInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionRetencionInven;
			processRunnable.jPanelAcciones=jPanelAccionesRetencionInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRetencionInven;
			
			
			processRunnable.jmenuBar=jmenuBarRetencionInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRetencionInven;
			processRunnable.jTtoolBar=jTtoolBarRetencionInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRetencionInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRetencionInven ,jPanelParametrosReportesRetencionInven,jTableDatosRetencionInven, /*jScrollPanelDatosRetencionInven,*/jPanelCamposRetencionInven,jPanelPaginacionRetencionInven, /*jScrollPanelDatosEdicionRetencionInven,*/ jPanelAccionesRetencionInven,jPanelAccionesFormularioRetencionInven,jmenuBarRetencionInven,jmenuBarDetalleRetencionInven,jTtoolBarRetencionInven,jTtoolBarDetalleRetencionInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRetencionInven ,jPanelParametrosReportesRetencionInven, jScrollPanelDatosRetencionInven,jPanelPaginacionRetencionInven, jScrollPanelDatosEdicionRetencionInven, jPanelAccionesRetencionInven,jPanelAccionesFormularioRetencionInven,jmenuBarRetencionInven,jmenuBarDetalleRetencionInven,jTtoolBarRetencionInven,jTtoolBarDetalleRetencionInven);
						
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
	
	public void finishProcessRetencionInven() {// throws Exception 
		this.finishProcessRetencionInven(true);
	}
	
	public void finishProcessRetencionInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRetencionInven ,this.jPanelParametrosReportesRetencionInven, this.jScrollPanelDatosRetencionInven,this.jPanelPaginacionRetencionInven, this.jScrollPanelDatosEdicionRetencionInven, this.jPanelAccionesRetencionInven,this.jPanelAccionesFormularioRetencionInven,this.jmenuBarRetencionInven,this.jmenuBarDetalleRetencionInven,this.jTtoolBarRetencionInven,this.jTtoolBarDetalleRetencionInven);		
		
		final JTabbedPane jTabbedPaneBusquedasRetencionInven=this.jTabbedPaneBusquedasRetencionInven; 
		
		final JPanel jPanelParametrosReportesRetencionInven=this.jPanelParametrosReportesRetencionInven;
		//final JScrollPane jScrollPanelDatosRetencionInven=this.jScrollPanelDatosRetencionInven;
		final JTable jTableDatosRetencionInven=this.jTableDatosRetencionInven;		
		final JPanel jPanelPaginacionRetencionInven=this.jPanelPaginacionRetencionInven;
		//final JScrollPane jScrollPanelDatosEdicionRetencionInven=this.jScrollPanelDatosEdicionRetencionInven;
		final JPanel jPanelAccionesRetencionInven=this.jPanelAccionesRetencionInven;
		
		JPanel jPanelCamposAuxiliarRetencionInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRetencionInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			jPanelCamposAuxiliarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jPanelCamposRetencionInven;
			jPanelAccionesFormularioAuxiliarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jPanelAccionesFormularioRetencionInven;
		}
		
		final JPanel jPanelCamposRetencionInven=jPanelCamposAuxiliarRetencionInven;
		final JPanel jPanelAccionesFormularioRetencionInven=jPanelAccionesFormularioAuxiliarRetencionInven;
		
		
		final JMenuBar jmenuBarRetencionInven=this.jmenuBarRetencionInven;		
		final JToolBar jTtoolBarRetencionInven=this.jTtoolBarRetencionInven;
				
		JMenuBar jmenuBarDetalleAuxiliarRetencionInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRetencionInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			jmenuBarDetalleAuxiliarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jmenuBarDetalleRetencionInven;
			jTtoolBarDetalleAuxiliarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jTtoolBarDetalleRetencionInven;		
		}
		
		final JMenuBar jmenuBarDetalleRetencionInven=jmenuBarDetalleAuxiliarRetencionInven;
		final JToolBar jTtoolBarDetalleRetencionInven=jTtoolBarDetalleAuxiliarRetencionInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRetencionInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRetencionInven;
			processRunnable.jTableDatos=jTableDatosRetencionInven;
			processRunnable.jPanelCampos=jPanelCamposRetencionInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionRetencionInven;
			processRunnable.jPanelAcciones=jPanelAccionesRetencionInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRetencionInven;
			
			
			processRunnable.jmenuBar=jmenuBarRetencionInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRetencionInven;
			processRunnable.jTtoolBar=jTtoolBarRetencionInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRetencionInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRetencionInven ,jPanelParametrosReportesRetencionInven, jTableDatosRetencionInven,/*jScrollPanelDatosRetencionInven,*/jPanelCamposRetencionInven,jPanelPaginacionRetencionInven, /*jScrollPanelDatosEdicionRetencionInven,*/ jPanelAccionesRetencionInven,jPanelAccionesFormularioRetencionInven,jmenuBarRetencionInven,jmenuBarDetalleRetencionInven,jTtoolBarRetencionInven,jTtoolBarDetalleRetencionInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRetencionInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRetencionInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRetencionInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRetencionInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRetencionInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRetencionInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRetencionInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRetencionInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRetencionInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.retencioninvenConstantesFunciones.getsFinalQueryRetencionInven();
		String  finalQueryPaginacionTodos=this.retencioninvenConstantesFunciones.getsFinalQueryRetencionInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RetencionInvenConstantesFunciones.getArrayColumnasGlobalesNoRetencionInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RetencionInvenConstantesFunciones.getArrayColumnasGlobalesRetencionInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RetencionInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.retencioninvensEliminados= new ArrayList<RetencionInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRetencionInven();
		
				///*RetencionInvenSessionBean*/this.retencioninvenSessionBean=new RetencionInvenSessionBean();
			
			if(this.retencioninvenSessionBean==null) {
				this.retencioninvenSessionBean=new RetencionInvenSessionBean();
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
					this.iNumeroPaginacion=RetencionInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RetencionInvenConstantesFunciones.getClassesForeignKeysOfRetencionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/retencioninven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			retencioninvensAux= new ArrayList<RetencionInven>();
			
				
			retencioninvenLogic.setDatosCliente(this.datosCliente);
			retencioninvenLogic.setDatosDeep(this.datosDeep);
			retencioninvenLogic.setIsConDeep(true);
			
			
			retencioninvenLogic.getRetencionInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					retencioninvenLogic.getTodosRetencionInvens(finalQueryGlobal,pagination);
					
					//retencioninvenLogic.getTodosRetencionInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(retencioninvenLogic.getRetencionInvens()==null|| retencioninvenLogic.getRetencionInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							retencioninvensAux= new ArrayList<RetencionInven>();
							retencioninvensAux.addAll(retencioninvenLogic.getRetencionInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvensAux= new ArrayList<RetencionInven>();
							retencioninvensAux.addAll(retencioninvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							retencioninvenLogic.getTodosRetencionInvens(finalQueryGlobal+"",this.pagination);												
							
							//retencioninvenLogic.getTodosRetencionInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRetencionInvens("Todos",retencioninvenLogic.getRetencionInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							retencioninvenLogic.setRetencionInvens(new ArrayList<RetencionInven>());					
							retencioninvenLogic.getRetencionInvens().addAll(retencioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvens=new ArrayList<RetencionInven>();
							retencioninvens.addAll(retencioninvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRetencionInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRetencionInven=this.idActual;
				
				} else if(this.idRetencionInvenActual!=null && this.idRetencionInvenActual!=0L) {
					idRetencionInven=idRetencionInvenActual;
				}
				
					
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndicePorId(idRetencionInven);
				
				this.retencioninvens=new ArrayList<RetencionInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					retencioninvenLogic.getEntity(idRetencionInven);
					
					//retencioninvenLogic.getEntityWithConnection(idRetencionInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencioninvenLogic.setRetencionInvens(new ArrayList<RetencionInven>());
					retencioninvenLogic.getRetencionInvens().add(retencioninvenLogic.getRetencionInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencioninvens=new ArrayList<RetencionInven>();
					this.retencioninvens.add(retencioninven);
				}
				
				if(retencioninvenLogic.getRetencionInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCompra")) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdCompra(id_compraFK_IdCompra);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencioninvenLogic.getRetencionInvensFK_IdCompra(finalQueryGlobal,pagination,id_compraFK_IdCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdCompra(id_compraFK_IdCompra);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdCompra(id_compraFK_IdCompra);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencioninvenLogic.getRetencionInvens()==null||retencioninvenLogic.getRetencionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencioninvens==null|| retencioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvensAux=new ArrayList<RetencionInven>();
						retencioninvensAux.addAll(retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvensAux=new ArrayList<RetencionInven>();
							retencioninvensAux.addAll(retencioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencioninvenLogic.getRetencionInvensFK_IdCompra(finalQueryGlobal,pagination,id_compraFK_IdCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdCompra(id_compraFK_IdCompra);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdCompra(id_compraFK_IdCompra);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionInvens("FK_IdCompra",retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionInvens("FK_IdCompra",retencioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenLogic.setRetencionInvens(new ArrayList<RetencionInven>());
						retencioninvenLogic.getRetencionInvens().addAll(retencioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvens=new ArrayList<RetencionInven>();
							retencioninvens.addAll(retencioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencioninvenLogic.getRetencionInvensFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencioninvenLogic.getRetencionInvens()==null||retencioninvenLogic.getRetencionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencioninvens==null|| retencioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvensAux=new ArrayList<RetencionInven>();
						retencioninvensAux.addAll(retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvensAux=new ArrayList<RetencionInven>();
							retencioninvensAux.addAll(retencioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencioninvenLogic.getRetencionInvensFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionInvens("FK_IdCuentaContable",retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionInvens("FK_IdCuentaContable",retencioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenLogic.setRetencionInvens(new ArrayList<RetencionInven>());
						retencioninvenLogic.getRetencionInvens().addAll(retencioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvens=new ArrayList<RetencionInven>();
							retencioninvens.addAll(retencioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencioninvenLogic.getRetencionInvensFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencioninvenLogic.getRetencionInvens()==null||retencioninvenLogic.getRetencionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencioninvens==null|| retencioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvensAux=new ArrayList<RetencionInven>();
						retencioninvensAux.addAll(retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvensAux=new ArrayList<RetencionInven>();
							retencioninvensAux.addAll(retencioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencioninvenLogic.getRetencionInvensFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionInvens("FK_IdEjercicio",retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionInvens("FK_IdEjercicio",retencioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenLogic.setRetencionInvens(new ArrayList<RetencionInven>());
						retencioninvenLogic.getRetencionInvens().addAll(retencioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvens=new ArrayList<RetencionInven>();
							retencioninvens.addAll(retencioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencioninvenLogic.getRetencionInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencioninvenLogic.getRetencionInvens()==null||retencioninvenLogic.getRetencionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencioninvens==null|| retencioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvensAux=new ArrayList<RetencionInven>();
						retencioninvensAux.addAll(retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvensAux=new ArrayList<RetencionInven>();
							retencioninvensAux.addAll(retencioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencioninvenLogic.getRetencionInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionInvens("FK_IdEmpresa",retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionInvens("FK_IdEmpresa",retencioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenLogic.setRetencionInvens(new ArrayList<RetencionInven>());
						retencioninvenLogic.getRetencionInvens().addAll(retencioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvens=new ArrayList<RetencionInven>();
							retencioninvens.addAll(retencioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencioninvenLogic.getRetencionInvensFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencioninvenLogic.getRetencionInvens()==null||retencioninvenLogic.getRetencionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencioninvens==null|| retencioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvensAux=new ArrayList<RetencionInven>();
						retencioninvensAux.addAll(retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvensAux=new ArrayList<RetencionInven>();
							retencioninvensAux.addAll(retencioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencioninvenLogic.getRetencionInvensFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionInvens("FK_IdPeriodo",retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionInvens("FK_IdPeriodo",retencioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenLogic.setRetencionInvens(new ArrayList<RetencionInven>());
						retencioninvenLogic.getRetencionInvens().addAll(retencioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvens=new ArrayList<RetencionInven>();
							retencioninvens.addAll(retencioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencioninvenLogic.getRetencionInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencioninvenLogic.getRetencionInvens()==null||retencioninvenLogic.getRetencionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencioninvens==null|| retencioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvensAux=new ArrayList<RetencionInven>();
						retencioninvensAux.addAll(retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvensAux=new ArrayList<RetencionInven>();
							retencioninvensAux.addAll(retencioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencioninvenLogic.getRetencionInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionInvens("FK_IdSucursal",retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionInvens("FK_IdSucursal",retencioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenLogic.setRetencionInvens(new ArrayList<RetencionInven>());
						retencioninvenLogic.getRetencionInvens().addAll(retencioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvens=new ArrayList<RetencionInven>();
							retencioninvens.addAll(retencioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoRetencion")) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencioninvenLogic.getRetencionInvensFK_IdTipoRetencion(finalQueryGlobal,pagination,id_tipo_retencionFK_IdTipoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencioninvenLogic.getRetencionInvens()==null||retencioninvenLogic.getRetencionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencioninvens==null|| retencioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvensAux=new ArrayList<RetencionInven>();
						retencioninvensAux.addAll(retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvensAux=new ArrayList<RetencionInven>();
							retencioninvensAux.addAll(retencioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencioninvenLogic.getRetencionInvensFK_IdTipoRetencion(finalQueryGlobal,pagination,id_tipo_retencionFK_IdTipoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionInvenConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionInvens("FK_IdTipoRetencion",retencioninvenLogic.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionInvens("FK_IdTipoRetencion",retencioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenLogic.setRetencionInvens(new ArrayList<RetencionInven>());
						retencioninvenLogic.getRetencionInvens().addAll(retencioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvens=new ArrayList<RetencionInven>();
							retencioninvens.addAll(retencioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRetencionInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRetencionInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=retencioninvenLogic.getRetencionInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencioninvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=retencioninvenLogic.getRetencionInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencioninvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RetencionInven retencioninven) {
		Boolean permite=true;
		
		if(this.retencioninven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RetencionInvenConstantesFunciones.getOrderByListaRetencionInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RetencionInvenConstantesFunciones.getOrderByListaRetencionInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionInven retencioninven:retencioninvenLogic.getRetencionInvens()) {
				if(retencioninven.getsType().equals(Constantes2.S_TOTALES)) {
					retencioninvenTotales=retencioninven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionInven retencioninven:this.retencioninvens) {
				if(retencioninven.getsType().equals(Constantes2.S_TOTALES)) {
					retencioninvenTotales=retencioninven;
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
			this.retencioninvenAux=new RetencionInven();
			this.retencioninvenAux.setsType(Constantes2.S_TOTALES);
			this.retencioninvenAux.setIsNew(false);
			this.retencioninvenAux.setIsChanged(false);
			this.retencioninvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RetencionInvenConstantesFunciones.TotalizarValoresFilaRetencionInven(this.retencioninvenLogic.getRetencionInvens(),this.retencioninvenAux);
				
				this.retencioninvenLogic.getRetencionInvens().add(this.retencioninvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RetencionInvenConstantesFunciones.TotalizarValoresFilaRetencionInven(this.retencioninvens,this.retencioninvenAux);
				
				this.retencioninvens.add(this.retencioninvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		retencioninvenTotales=new RetencionInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.retencioninvenLogic.getRetencionInvens().remove(retencioninvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.retencioninvens.remove(retencioninvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		retencioninvenTotales=new RetencionInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionInven retencioninven:retencioninvenLogic.getRetencionInvens()) {
				if(retencioninven.getsType().equals(Constantes2.S_TOTALES)) {
					retencioninvenTotales=retencioninven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RetencionInvenConstantesFunciones.TotalizarValoresFilaRetencionInven(this.retencioninvenLogic.getRetencionInvens(),retencioninvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionInven retencioninven:this.retencioninvens) {
				if(retencioninven.getsType().equals(Constantes2.S_TOTALES)) {
					retencioninvenTotales=retencioninven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RetencionInvenConstantesFunciones.TotalizarValoresFilaRetencionInven(this.retencioninvens,retencioninvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRetencionInvensFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionInvensFK_IdCompra()throws Exception {
		try {
			sAccionBusqueda="FK_IdCompra";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionInvensFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionInvensFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionInvensFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionInvensFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionInvensFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionInvensFK_IdTipoRetencion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRetencion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRetencionInvensFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencioninvenLogic.getRetencionInvensFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionInvensFK_IdCompra(String sFinalQuery,Long id_compra)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencioninvenLogic.getRetencionInvensFK_IdCompra(sFinalQuery,this.pagination,id_compra);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionInvensFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencioninvenLogic.getRetencionInvensFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionInvensFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencioninvenLogic.getRetencionInvensFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencioninvenLogic.getRetencionInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionInvensFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencioninvenLogic.getRetencionInvensFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionInvensFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencioninvenLogic.getRetencionInvensFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionInvensFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencioninvenLogic.getRetencionInvensFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionInvensFK_IdTipoRetencion(String sFinalQuery,Long id_tipo_retencion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencioninvenLogic.getRetencionInvensFK_IdTipoRetencion(sFinalQuery,this.pagination,id_tipo_retencion);
				
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
	
	public void inicializarPermisosRetencionInven() {
		this.isPermisoTodoRetencionInven=false;
		this.isPermisoNuevoRetencionInven=false;
		this.isPermisoActualizarRetencionInven=false;
		this.isPermisoActualizarOriginalRetencionInven=false;
		this.isPermisoEliminarRetencionInven=false;
		this.isPermisoGuardarCambiosRetencionInven=false;
		this.isPermisoConsultaRetencionInven=false;
		this.isPermisoBusquedaRetencionInven=false;
		this.isPermisoReporteRetencionInven=false;		
		this.isPermisoOrdenRetencionInven=false;		
		this.isPermisoPaginacionMedioRetencionInven=false;		
		this.isPermisoPaginacionAltoRetencionInven=false;
		this.isPermisoPaginacionTodoRetencionInven=false;
		this.isPermisoCopiarRetencionInven=false;		
		this.isPermisoVerFormRetencionInven=false;		
		this.isPermisoDuplicarRetencionInven=false;		
		this.isPermisoOrdenRetencionInven=false;		
	}
	
	public void setPermisosUsuarioRetencionInven(Boolean isPermiso) {
		this.isPermisoTodoRetencionInven=isPermiso;
		this.isPermisoNuevoRetencionInven=isPermiso;
		this.isPermisoActualizarRetencionInven=isPermiso;
		this.isPermisoActualizarOriginalRetencionInven=isPermiso;
		this.isPermisoEliminarRetencionInven=isPermiso;
		this.isPermisoGuardarCambiosRetencionInven=isPermiso;
		this.isPermisoConsultaRetencionInven=isPermiso;
		this.isPermisoBusquedaRetencionInven=isPermiso;
		this.isPermisoReporteRetencionInven=isPermiso;
		this.isPermisoOrdenRetencionInven=isPermiso;		
		this.isPermisoPaginacionMedioRetencionInven=isPermiso;		
		this.isPermisoPaginacionAltoRetencionInven=isPermiso;		
		this.isPermisoPaginacionTodoRetencionInven=isPermiso;		
		this.isPermisoCopiarRetencionInven=isPermiso;		
		this.isPermisoVerFormRetencionInven=isPermiso;		
		this.isPermisoDuplicarRetencionInven=isPermiso;
		this.isPermisoOrdenRetencionInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRetencionInven(Boolean isPermiso) {
		//this.isPermisoTodoRetencionInven=isPermiso;
		this.isPermisoNuevoRetencionInven=isPermiso;
		this.isPermisoActualizarRetencionInven=isPermiso;
		this.isPermisoActualizarOriginalRetencionInven=isPermiso;
		this.isPermisoEliminarRetencionInven=isPermiso;
		this.isPermisoGuardarCambiosRetencionInven=isPermiso;
		//this.isPermisoConsultaRetencionInven=isPermiso;
		//this.isPermisoBusquedaRetencionInven=isPermiso;
		//this.isPermisoReporteRetencionInven=isPermiso;
		//this.isPermisoOrdenRetencionInven=isPermiso;		
		//this.isPermisoPaginacionMedioRetencionInven=isPermiso;		
		//this.isPermisoPaginacionAltoRetencionInven=isPermiso;		
		//this.isPermisoPaginacionTodoRetencionInven=isPermiso;		
		//this.isPermisoCopiarRetencionInven=isPermiso;		
		//this.isPermisoDuplicarRetencionInven=isPermiso;
		//this.isPermisoOrdenRetencionInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRetencionInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RetencionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRetencionInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRetencionInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRetencionInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRetencionInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRetencionInvenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRetencionInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RetencionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RetencionInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRetencionInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRetencionInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRetencionInven=this.isPermisoActualizarRetencionInven;
			this.isPermisoEliminarRetencionInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRetencionInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRetencionInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRetencionInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRetencionInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRetencionInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRetencionInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRetencionInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRetencionInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRetencionInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRetencionInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRetencionInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRetencionInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRetencionInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRetencionInven.setToolTipText(this.jTableDatosRetencionInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRetencionInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRetencionInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RetencionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RetencionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRetencionInven() throws Exception {
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
	public void inicializarCombosForeignKeyRetencionInvenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.comprasForeignKey=new ArrayList();
				this.tiporetencionsForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRetencionInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RetencionInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRetencionInvenListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCompraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRetencionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCompraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.comprasForeignKey==null||this.comprasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CompraConstantesFunciones.getArrayColumnasGlobalesCompra(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CompraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CompraConstantesFunciones.SFINALQUERY;

				this.cargarCombosComprasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporetencionsForeignKey==null||this.tiporetencionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRetencionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRetencionsForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyRetencionInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RetencionInvenParameterReturnGeneral retencioninvenReturnGeneral=new RetencionInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.retencioninvenConstantesFunciones.cargarid_empresaRetencionInven)
					 || (this.esRecargarFks && this.retencioninvenConstantesFunciones.cargarid_empresaRetencionInven)) {

					if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+retencioninvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.retencioninvenConstantesFunciones.cargarid_sucursalRetencionInven)
					 || (this.esRecargarFks && this.retencioninvenConstantesFunciones.cargarid_sucursalRetencionInven)) {

					if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+retencioninvenSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.retencioninvenConstantesFunciones.cargarid_ejercicioRetencionInven)
					 || (this.esRecargarFks && this.retencioninvenConstantesFunciones.cargarid_ejercicioRetencionInven)) {

					if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+retencioninvenSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.retencioninvenConstantesFunciones.cargarid_periodoRetencionInven)
					 || (this.esRecargarFks && this.retencioninvenConstantesFunciones.cargarid_periodoRetencionInven)) {

					if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+retencioninvenSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalCompra="";

				if(((this.comprasForeignKey==null||this.comprasForeignKey.size()<=0) && this.retencioninvenConstantesFunciones.cargarid_compraRetencionInven)
					 || (this.esRecargarFks && this.retencioninvenConstantesFunciones.cargarid_compraRetencionInven)) {

					if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionCompra()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CompraConstantesFunciones.getArrayColumnasGlobalesCompra(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCompra=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CompraConstantesFunciones.TABLENAME);

						finalQueryGlobalCompra=Funciones.GetFinalQueryAppend(finalQueryGlobalCompra, "");
						finalQueryGlobalCompra+=CompraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosComprasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCompra=" WHERE " + ConstantesSql.ID + "="+retencioninvenSessionBean.getlidCompraActual();
					}
				} else {
					finalQueryGlobalCompra="NONE";
				}


				String finalQueryGlobalTipoRetencion="";

				if(((this.tiporetencionsForeignKey==null||this.tiporetencionsForeignKey.size()<=0) && this.retencioninvenConstantesFunciones.cargarid_tipo_retencionRetencionInven)
					 || (this.esRecargarFks && this.retencioninvenConstantesFunciones.cargarid_tipo_retencionRetencionInven)) {

					if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoRetencion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoRetencion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoRetencion, "");
						finalQueryGlobalTipoRetencion+=TipoRetencionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoRetencionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoRetencion=" WHERE " + ConstantesSql.ID + "="+retencioninvenSessionBean.getlidTipoRetencionActual();
					}
				} else {
					finalQueryGlobalTipoRetencion="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.retencioninvenConstantesFunciones.cargarid_cuenta_contableRetencionInven)
					 || (this.esRecargarFks && this.retencioninvenConstantesFunciones.cargarid_cuenta_contableRetencionInven)) {

					if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+retencioninvenSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.retencioninvenConstantesFunciones.cargarid_anioRetencionInven)
					 || (this.esRecargarFks && this.retencioninvenConstantesFunciones.cargarid_anioRetencionInven)) {

					if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+retencioninvenSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.retencioninvenConstantesFunciones.cargarid_mesRetencionInven)
					 || (this.esRecargarFks && this.retencioninvenConstantesFunciones.cargarid_mesRetencionInven)) {

					if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+retencioninvenSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				retencioninvenReturnGeneral=retencioninvenLogic.cargarCombosLoteForeignKeyRetencionInven(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalCompra,finalQueryGlobalTipoRetencion,finalQueryGlobalCuentaContable,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=retencioninvenReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=retencioninvenReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=retencioninvenReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=retencioninvenReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalCompra.equals("NONE")) {
				this.comprasForeignKey=retencioninvenReturnGeneral.getcomprasForeignKey();
			}

			if(!finalQueryGlobalTipoRetencion.equals("NONE")) {
				this.tiporetencionsForeignKey=retencioninvenReturnGeneral.gettiporetencionsForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=retencioninvenReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=retencioninvenReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=retencioninvenReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRetencionInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyCompra();
			this.addItemDefectoCombosForeignKeyTipoRetencion();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.retencioninvenSessionBean==null) {
				this.retencioninvenSessionBean=new RetencionInvenSessionBean();
			}

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCompra()throws Exception {
		try {

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionCompra()) {
				Compra compra=new Compra();
				CompraConstantesFunciones.setCompraDescripcion(compra,Constantes.SMENSAJE_ESCOJA_OPCION);
				compra.setId(null);

				if(!CompraConstantesFunciones.ExisteEnLista(this.comprasForeignKey,compra,true)) {

					this.comprasForeignKey.add(0,compra);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoRetencion()throws Exception {
		try {

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
				TipoRetencion tiporetencion=new TipoRetencion();
				TipoRetencionConstantesFunciones.setTipoRetencionDescripcion(tiporetencion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporetencion.setId(null);

				if(!TipoRetencionConstantesFunciones.ExisteEnLista(this.tiporetencionsForeignKey,tiporetencion,true)) {

					this.tiporetencionsForeignKey.add(0,tiporetencion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.retencioninvenSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyRetencionInven()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyTipoRetencion("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRetencionInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyTipoRetencion(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyTipoRetencion(JComboBox jComboBoxTipoRetencionGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			TipoRetencion tiporetencionLocal=(TipoRetencion)jComboBoxTipoRetencionGenerico.getSelectedItem();

			if(tiporetencionLocal!=null  && tiporetencionLocal.getId()!=null  && tiporetencionLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_tipo_retencion="+tiporetencionLocal.getId();
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyTipoRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.addItemListener(new ComboBoxItemListener(this,"id_tipo_retencionRetencionInven"));
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.addFocusListener(new ComboBoxFocusListener(this,"id_tipo_retencionRetencionInven"));
					}
				} else {
					if(this.jInternalFrameDetalleFormRetencionInven!=null) {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.addActionListener(new ComboBoxActionListener(this,"id_tipo_retencionRetencionInven"));
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.addFocusListener(new ComboBoxFocusListener(this,"id_tipo_retencionRetencionInven"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven"));

						this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven"));

					} else {
						this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven"));

						this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyRetencionInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRetencionInven(RetencionInven retencioninven)throws Exception {	
		try {
			
			this.setActualCompraForeignKey(retencioninven.getid_compra(),false,"Formulario");
			this.setActualTipoRetencionForeignKey(retencioninven.getid_tipo_retencion(),false,"Formulario");
			this.setActualCuentaContableForeignKey(retencioninven.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRetencionInven(RetencionInven retencioninven,String sTipoEvento)throws Exception {	
		try {
			
			

				if(retencioninven.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableRetencionInven")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(retencioninven.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRetencionInven()throws Exception {	
		try {
			
			this.setActualCompraForeignKey(this.retencioninvenConstantesFunciones.getid_compra(),false,"Formulario");
			this.setActualTipoRetencionForeignKey(this.retencioninvenConstantesFunciones.getid_tipo_retencion(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.retencioninvenConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionInven()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormRetencionInven!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormRetencionInven!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRetencionInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRetencionInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRetencionInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRetencionInven()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameComprasForeignKey("Todos");
			this.cargarCombosFrameTipoRetencionsForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRetencionInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameComprasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRetencionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRetencionInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	











	public void recargarFormRetencionInvenTipoRetencion(JComboBox<?> jComboBoxGenericoTipoRetencion,String sFormularioTipoBusqueda) throws Exception {

	}






	
	

	public RetencionInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RetencionInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RetencionInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.retencioninvenSessionBean=new RetencionInvenSessionBean(); 
		this.retencioninvenConstantesFunciones=new RetencionInvenConstantesFunciones(); 
		this.retencioninvenBean=new RetencionInven();//(this.retencioninvenConstantesFunciones); 		
		this.retencioninvenReturnGeneral=new RetencionInvenParameterReturnGeneral(); 
		
		this.retencioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RetencionInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RetencionInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RetencionInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRetencionInven(true);
			
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
			
			this.retencioninvenConstantesFunciones=new RetencionInvenConstantesFunciones(); 
			this.retencioninvenBean=new RetencionInven();//this.retencioninvenConstantesFunciones); 			
			this.retencioninvenReturnGeneral=new RetencionInvenParameterReturnGeneral(); 
		
			RetencionInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Retencion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.retencioninven=new RetencionInven();
			this.retencioninvens = new ArrayList<RetencionInven>();
			this.retencioninvensAux = new ArrayList<RetencionInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic=new RetencionInvenLogic();
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}
			
			//this.retencioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.retencioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRetencionInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRetencionInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRetencionInven);	
					}
					
					if(this.jInternalFrameImportacionRetencionInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRetencionInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRetencionInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRetencionInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRetencionInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRetencionInven);
				this.jInternalFrameDetalleFormRetencionInven.setVisible(false);
				this.jInternalFrameDetalleFormRetencionInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRetencionInven);
					this.jInternalFrameReporteDinamicoRetencionInven.setVisible(false);
					this.jInternalFrameReporteDinamicoRetencionInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRetencionInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRetencionInven);
					this.jInternalFrameImportacionRetencionInven.setVisible(false);
					this.jInternalFrameImportacionRetencionInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRetencionInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRetencionInven);
					this.jInternalFrameOrderByRetencionInven.setVisible(false);
					this.jInternalFrameOrderByRetencionInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRetencionInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RetencionInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.retencioninvenReturnGeneral=new RetencionInvenParameterReturnGeneral();
			
			this.retencioninvenParameterGeneral=new RetencionInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.retencioninvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RetencionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RetencionInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.retencioninvenSessionBean.getEsGuardarRelacionado(),this.retencioninvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RetencionInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.retencioninvenSessionBean.getEsGuardarRelacionado(),this.retencioninvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRetencionInven=false;
			this.isVisibilidadCeldaDuplicarRetencionInven=true;
			this.isVisibilidadCeldaCopiarRetencionInven=true;
			this.isVisibilidadCeldaVerFormRetencionInven=true;
			this.isVisibilidadCeldaOrdenRetencionInven=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=false;
			this.isVisibilidadCeldaModificarRetencionInven=false;
			this.isVisibilidadCeldaActualizarRetencionInven=false;
			this.isVisibilidadCeldaEliminarRetencionInven=false;
			this.isVisibilidadCeldaCancelarRetencionInven=false;
			this.isVisibilidadCeldaGuardarRetencionInven=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdCompra=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoRetencion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRetencionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRetencionInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRetencionInven(false);
			
			this.setPermisosUsuarioRetencionInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencioninvenSessionBean.getEsGuardarRelacionado() 
				|| (this.retencioninvenSessionBean.getEsGuardarRelacionado() && this.retencioninvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRetencionInvenClasesRelacionadas();
			}
			
			if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRetencionInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRetencionInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRetencionInven();
			}
			
			if(!this.isPermisoBusquedaRetencionInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRetencionInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRetencionInven,this.isPermisoPaginacionMedioRetencionInven,this.isPermisoPaginacionTodoRetencionInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RetencionInvenConstantesFunciones.getTiposSeleccionarRetencionInven());
				
				this.tiposColumnasSelect=RetencionInvenConstantesFunciones.getTiposSeleccionarRetencionInven(true);
				
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
			//if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRetencionInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioRetencionInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioRetencionInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionInven() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.compraLogic=new CompraLogic();
			this.tiporetencionLogic=new TipoRetencionLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				retencioninvenImplementable= (RetencionInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RetencionInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				retencioninvenImplementableHome= (RetencionInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RetencionInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.retencioninvens= new ArrayList<RetencionInven>();
			this.retencioninvensEliminados= new ArrayList<RetencionInven>();
						
			this.isEsNuevoRetencionInven=false;
			this.esParaAccionDesdeFormularioRetencionInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.comprasForeignKey=new ArrayList<Compra>() ;
			this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRetencionInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRetencionInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RetencionInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RetencionInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRetencionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRetencionInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRetencionInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRetencionInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRetencionInven();
			}
			
			RetencionInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRetencionInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRetencionInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRetencionInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRetencionInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RetencionInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRetencionInven() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRetencionInven")) {
				iIndex=this.jInternalFrameDetalleFormRetencionInven.jTabbedPaneRelacionesRetencionInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRetencionInven.jTabbedPaneRelacionesRetencionInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRetencionInven();	
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
	
	public void cargarCombosForeignKeyRetencionInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRetencionInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRetencionInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRetencionInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRetencionInven();
		
		this.cargarCombosFrameForeignKeyRetencionInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRetencionInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRetencionInven();
		}
	}
	
	

	public void cargarCombosForeignKeyCompra(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCompraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCompra();
				this.cargarCombosFrameComprasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCompra(this.comprasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRetencionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRetencion();
				this.cargarCombosFrameTipoRetencionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyTipoRetencion("Todos");
				}

			this.recargarComboTablaTipoRetencion(this.tiporetencionsForeignKey);

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
					this.initActionsCombosForeignKeyTipoRetencion("Todos");
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyTipoRetencion("Todos");
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyTipoRetencion("Todos");
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRetencionInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
			
			if(jTableDatosRetencionInven.getRowCount()>=1) {
				jTableDatosRetencionInven.removeRowSelectionInterval(0, jTableDatosRetencionInven.getRowCount()-1);						
			}
			
			this.isEsNuevoRetencionInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRetencionInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRetencionInven(true);			
			//this.retencioninven=new RetencionInven();
			//this.retencioninven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionInven() ;
			
			if(RetencionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.retencioninven);	
			this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);				
			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
			if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RetencionInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRetencionInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRetencionInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRetencionInven.getSelectedRows().length;			
			}
			
			retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRetencionInven--;			
				//RetencionInven retencioninvenAux= new RetencionInven();			
				//retencioninvenAux.setId(this.iIdNuevoRetencionInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RetencionInven retencioninvenOrigen=new RetencionInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RetencionInven retencioninvenOrigen : retencioninvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							retencioninvenOrigen =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencioninvenOrigen =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRetencionInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.retencioninven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRetencionInven(retencioninvenOrigen,this.retencioninven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.retencioninvenLogic.getRetencionInvens().add(this.retencioninvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.retencioninvens.add(this.retencioninvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRetencionInven(false);
				
				this.jTableDatosRetencionInven.setRowSelectionInterval(this.getIndiceNuevoRetencionInven(), this.getIndiceNuevoRetencionInven());
				
				int iLastRow =  this.jTableDatosRetencionInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRetencionInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRetencionInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRetencionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();									
		
			RetencionInven retencioninvenOrigen=new RetencionInven();
			RetencionInven retencioninvenDestino=new RetencionInven();
				
			retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRetencionInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || retencioninvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRetencionInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenOrigen =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						retencioninvenOrigen =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencioninvenDestino =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						retencioninvenDestino =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				retencioninvenOrigen =retencioninvensSeleccionados.get(0);
				retencioninvenDestino =retencioninvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRetencionInven(retencioninvenOrigen,retencioninvenDestino,true,false);
				
				retencioninvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(retencioninvenDestino,retencioninvenLogic.getRetencionInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(retencioninvenDestino,retencioninvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRetencionInven(false);
				
				//this.jTableDatosRetencionInven.setRowSelectionInterval(this.getIndiceNuevoRetencionInven(), this.getIndiceNuevoRetencionInven());
				
				int iLastRow =  this.jTableDatosRetencionInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRetencionInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRetencionInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRetencionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRetencionInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRetencionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRetencionInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRetencionInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRetencionInven.setVisible(!isVisible);
			this.jPanelPaginacionRetencionInven.setVisible(!isVisible);
			this.jPanelAccionesRetencionInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRetencionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRetencionInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRetencionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRetencionInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRetencionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRetencionInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRetencionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRetencionInven();
			
			this.abrirFrameOrderByRetencionInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRetencionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRetencionInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRetencionInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRetencionInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRetencionInven.isMaximum()) {
					this.jInternalFrameDetalleFormRetencionInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRetencionInven.setSize(this.jInternalFrameDetalleFormRetencionInven.iWidthFormulario,this.jInternalFrameDetalleFormRetencionInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRetencionInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRetencionInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRetencionInven.isMaximum()) {
						this.jInternalFrameDetalleFormRetencionInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRetencionInven.jContentPaneDetalleRetencionInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRetencionInven.jTabbedPaneRelacionesRetencionInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRetencionInven.jContentPaneDetalleRetencionInven.getWidth(),RetencionInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRetencionInven.jTabbedPaneRelacionesRetencionInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRetencionInven.jContentPaneDetalleRetencionInven.getWidth(),RetencionInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRetencionInven.jTabbedPaneRelacionesRetencionInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRetencionInven.jContentPaneDetalleRetencionInven.getWidth(),RetencionInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRetencionInven.setVisible(true);
	        this.jInternalFrameDetalleFormRetencionInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRetencionInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRetencionInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRetencionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionInven,false,this);
				} else {
					this.jInternalFrameOrderByRetencionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRetencionInven);
				this.jInternalFrameOrderByRetencionInven.setVisible(false);
				this.jInternalFrameOrderByRetencionInven.setSelected(false);
				
				this.jInternalFrameOrderByRetencionInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRetencionInven"));
				
				this.inicializarActualizarBindingTablaOrderByRetencionInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRetencionInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRetencionInven==null) {
				
				this.jInternalFrameImportacionRetencionInven=new ImportacionJInternalFrame(RetencionInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRetencionInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRetencionInven);
				this.jInternalFrameImportacionRetencionInven.setVisible(false);
				this.jInternalFrameImportacionRetencionInven.setSelected(false);


				this.jInternalFrameImportacionRetencionInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRetencionInven"));
				this.jInternalFrameImportacionRetencionInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRetencionInven"));
				this.jInternalFrameImportacionRetencionInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRetencionInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRetencionInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRetencionInven==null) {
				this.jInternalFrameReporteDinamicoRetencionInven=new ReporteDinamicoJInternalFrame(RetencionInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRetencionInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRetencionInven);
				this.jInternalFrameReporteDinamicoRetencionInven.setVisible(false);
				this.jInternalFrameReporteDinamicoRetencionInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRetencionInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionInven"));
				this.jInternalFrameReporteDinamicoRetencionInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionInven"));
				this.jInternalFrameReporteDinamicoRetencionInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRetencionInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRetencionInven);
			
	       	this.jInternalFrameDetalleFormRetencionInven.setVisible(false);
	        this.jInternalFrameDetalleFormRetencionInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormRetencionInven.dispose();
			//this.jInternalFrameDetalleFormRetencionInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRetencionInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRetencionInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoRetencionInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRetencionInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRetencionInven.setVisible(true);
	        this.jInternalFrameImportacionRetencionInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRetencionInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRetencionInven.setVisible(true);
	        this.jInternalFrameOrderByRetencionInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRetencionInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRetencionInven.setVisible(false);
	        this.jInternalFrameOrderByRetencionInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRetencionInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRetencionInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoRetencionInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRetencionInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRetencionInven.setVisible(false);
	        this.jInternalFrameImportacionRetencionInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderRetencionInven=(TitledBorder)this.jScrollPanelDatosRetencionInven.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderRetencionInven.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarRetencionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRetencionInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRetencionInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRetencionInven(true);
			//this.isEsNuevoRetencionInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRetencionInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionInven(false) ;
			
			if(retencioninvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RetencionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRetencionInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRetencionInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRetencionInven(true);
			//this.isEsNuevoRetencionInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.retencioninven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRetencionInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRetencionInven(false) ;
			
			if(RetencionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.retencioninvenConstantesFunciones.cargarid_cuenta_contableRetencionInven) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingRetencionInven(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaCompra(List<Compra> comprasForeignKey)throws Exception{
		TableColumn tableColumnCompra=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDCOMPRA));
		TableCellEditor tableCellEditorCompra =tableColumnCompra.getCellEditor();

		CompraTableCell compraTableCellFk=(CompraTableCell)tableCellEditorCompra;

		if(compraTableCellFk!=null) {
			compraTableCellFk.setcomprasForeignKey(comprasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRetencionInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//compraTableCellFk.setRowActual(intSelectedRow);
			//compraTableCellFk.setcomprasForeignKeyActual(comprasForeignKey);
		//}


		if(compraTableCellFk!=null) {
			compraTableCellFk.RecargarComprasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoRetencion(List<TipoRetencion> tiporetencionsForeignKey)throws Exception{
		TableColumn tableColumnTipoRetencion=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION));
		TableCellEditor tableCellEditorTipoRetencion =tableColumnTipoRetencion.getCellEditor();

		TipoRetencionTableCell tiporetencionTableCellFk=(TipoRetencionTableCell)tableCellEditorTipoRetencion;

		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.settiporetencionsForeignKey(tiporetencionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRetencionInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporetencionTableCellFk.setRowActual(intSelectedRow);
			//tiporetencionTableCellFk.settiporetencionsForeignKeyActual(tiporetencionsForeignKey);
		//}


		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.RecargarTipoRetencionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRetencionInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRetencionInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRetencionInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarRetencionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRetencionInven(false);
			
			//if(!this.isEsNuevoRetencionInven) {								
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RetencionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				
			}
			
			if(this.permiteMantenimiento(this.retencioninven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRetencionInven=true;
					this.inicializarActualizarBindingTablaRetencionInven(false);
					this.isEsNuevoRetencionInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRetencionInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRetencionInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRetencionInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionInven(false);
				
				this.habilitarDeshabilitarControlesRetencionInven(false);
			
												
				
				if(RetencionInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRetencionInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRetencionInvenActionPerformed(evt,retencioninvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRetencionInven(this.retencioninven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRetencionInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,retencioninvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.retencioninven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RetencionInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRetencionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				this.retencioninven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				this.retencioninven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.retencioninven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RetencionInvenModel) this.jTableDatosRetencionInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRetencionInven=true;
				this.inicializarActualizarBindingTablaRetencionInven(false);
				this.isEsNuevoRetencionInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRetencionInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionInven(false);
				
				this.habilitarDeshabilitarControlesRetencionInven(false);
				
				
				
				if(RetencionInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRetencionInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRetencionInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRetencionInven.getRowCount()>=1) {
				jTableDatosRetencionInven.removeRowSelectionInterval(0, jTableDatosRetencionInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRetencionInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRetencionInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionInven(false) ;
			
			this.isEsNuevoRetencionInven=false;
			
			if(RetencionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRetencionInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRetencionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRetencionInven(false);
				
				//SI ES MANUAL
				if(RetencionInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRetencionInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRetencionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRetencionInven--;			
			//RetencionInven retencioninvenAux= new RetencionInven();			
			//retencioninvenAux.setId(this.iIdNuevoRetencionInven);
			
			if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRetencionInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
			
			this.retencioninven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.retencioninvenLogic.getRetencionInvens().add(this.retencioninvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.retencioninvens.add(this.retencioninvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRetencionInven(false);
			
			this.jTableDatosRetencionInven.setRowSelectionInterval(this.getIndiceNuevoRetencionInven(), this.getIndiceNuevoRetencionInven());
			
			int iLastRow =  this.jTableDatosRetencionInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRetencionInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRetencionInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRetencionInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRetencionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRetencionInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionInven(false);
			
			//SI ES MANUAL
			if(RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionInven();
			}
			
			//this.abrirFrameTreeRetencionInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRetencionInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE RetencionES ?", "MANTENIMIENTO DE Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRetencionInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRetencionInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.retencioninvenReturnGeneral=retencioninvenLogic.procesarImportacionRetencionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.retencioninvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRetencionInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRetencionInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRetencionInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRetencionInven.setFileImportacion(this.jInternalFrameImportacionRetencionInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRetencionInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRetencionInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRetencionInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRetencionInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRetencionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();		

		retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RetencionInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RetencionInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteRetencionInvens("Todos",retencioninvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RetencionInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_IDCOMPRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Compra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Compra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Compra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Compra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_seImponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_seImponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_seImponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_seImponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_RETENCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSerieRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSerieRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSerieRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSerieRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionInvenConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRetencionInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RetencionInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDCOMPRA:
					sNombreCampoCategoria="id_compra";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION:
					sNombreCampoCategoria="id_tipo_retencion";
					break;

				case RetencionInvenConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoria="base_imponible";
					break;

				case RetencionInvenConstantesFunciones.LABEL_RETENCION:
					sNombreCampoCategoria="retencion";
					break;

				case RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION:
					sNombreCampoCategoria="numero_retencion";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION:
					sNombreCampoCategoria="numero_serie_retencion";
					break;

				case RetencionInvenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RetencionInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDCOMPRA:
					sNombreCampoCategoriaValor="id_compra";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION:
					sNombreCampoCategoriaValor="id_tipo_retencion";
					break;

				case RetencionInvenConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoriaValor="base_imponible";
					break;

				case RetencionInvenConstantesFunciones.LABEL_RETENCION:
					sNombreCampoCategoriaValor="retencion";
					break;

				case RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION:
					sNombreCampoCategoriaValor="numero_retencion";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION:
					sNombreCampoCategoriaValor="numero_serie_retencion";
					break;

				case RetencionInvenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RetencionInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDCOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_compra");
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_retencion");
					break;

				case RetencionInvenConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Base Imponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"base_imponible");
					break;

				case RetencionInvenConstantesFunciones.LABEL_RETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"retencion");
					break;

				case RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_retencion");
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Serie Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_serie_retencion");
					break;

				case RetencionInvenConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
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
	
	public void jButtonGenerarExcelReporteDinamicoRetencionInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();		
		
		retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencioninven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RetencionInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RetencionInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDCOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDCOMPRA);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getcompra_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.gettiporetencion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getbase_imponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_RETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_RETENCION);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getretencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getnumero_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getnumero_serie_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionInvenConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(RetencionInven retencioninven:retencioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencioninven.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelRetencionInven(row);				
			//	iRow++;
			//}				
			
			//for(RetencionInven retencioninvenAux:retencioninvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRetencionInven(retencioninvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion",JOptionPane.INFORMATION_MESSAGE);
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
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionInven(false);
			
			//SI ES MANUAL
			if(RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRetencionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionInven(false);
			
			//SI ES MANUAL
			if(RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRetencionInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRetencionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionInven(false);
			
			//SI ES MANUAL
			if(RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRetencionInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRetencionInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRetencionInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRetencionInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRetencionInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRetencionInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRetencionInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosRetencionInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosRetencionInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRetencionInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRetencionInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRetencionInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRetencionInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRetencionInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRetencionInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRetencionInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RetencionInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRetencionInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRetencionInven();
		
		this.inicializarActualizarBindingBotonesManualRetencionInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRetencionInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRetencionInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRetencionInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRetencionInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRetencionInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRetencionInven.jCheckBoxPostAccionNuevoRetencionInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRetencionInven.jCheckBoxPostAccionSinCerrarRetencionInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRetencionInven.jCheckBoxPostAccionSinMensajeRetencionInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRetencionInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRetencionInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRetencionInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRetencionInven!=null) {
				this.jInternalFrameDetalleFormRetencionInven.jCheckBoxPostAccionNuevoRetencionInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRetencionInven.jCheckBoxPostAccionSinCerrarRetencionInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRetencionInven.jCheckBoxPostAccionSinMensajeRetencionInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRetencionInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRetencionInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRetencionInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRetencionInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRetencionInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRetencionInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRetencionInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRetencionInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRetencionInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRetencionInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRetencionInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRetencionInven(Boolean esInicializar) throws Exception {
		try	{	
			if(RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRetencionInven() throws Exception {
		try	{
			if(RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRetencionInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRetencionInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRetencionInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRetencionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRetencionInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRetencionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRetencionInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRetencionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRetencionInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRetencionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRetencionInven.addItem(reporte);
			}
			
			
			if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRetencionInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRetencionInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRetencionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRetencionInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRetencionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRetencionInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRetencionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRetencionInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRetencionInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRetencionInven!=null) {
				this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRetencionInven!=null) {
				this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRetencionInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRetencionInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRetencionInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RetencionInvenConstantesFunciones.getTiposSeleccionarRetencionInven(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RetencionInvenConstantesFunciones.getTiposSeleccionarRetencionInven(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RetencionInvenConstantesFunciones.getTiposSeleccionarRetencionInven(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionInven.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRetencionInven.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRetencionInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_compraFK_IdCompraRetencionInven.getSelectedItem()!=null){this.id_compraFK_IdCompra=((Compra)this.jComboBoxid_compraFK_IdCompraRetencionInven.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableRetencionInven.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.getSelectedItem()!=null){this.id_tipo_retencionFK_IdTipoRetencion=((TipoRetencion)this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRetencionInven(Boolean esInicializar) throws Exception {				
		if(RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRetencionInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRetencionInven() throws Exception {
		this.inicializarActualizarBindingTablaRetencionInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRetencionInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRetencionInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRetencionInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=retencioninvenLogic.getRetencionInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=retencioninvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RetencionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRetencionInven.setModel(new RetencionInvenModel(this.retencioninvenLogic.getRetencionInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRetencionInven.setModel(new RetencionInvenModel(this.retencioninvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRetencionInven!=null && this.jInternalFrameOrderByRetencionInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRetencionInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO,retencioninvenConstantesFunciones.resaltarSeleccionarRetencionInven,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RetencionInvenConstantesFunciones.SCLASSWEBTITULO,retencioninvenConstantesFunciones.resaltarSeleccionarRetencionInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_ID));

		if(this.retencioninvenConstantesFunciones.mostraridRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencioninvenConstantesFunciones.resaltaridRetencionInven,this.retencioninvenConstantesFunciones.activaridRetencionInven,iSizeTabla,this,true,"idRetencionInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencioninvenConstantesFunciones.resaltaridRetencionInven,this.retencioninvenConstantesFunciones.activaridRetencionInven,this,true,"idRetencionInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.retencioninvenConstantesFunciones.mostrarid_empresaRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.retencioninvenConstantesFunciones.resaltarid_empresaRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_empresaRetencionInven,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.retencioninvenConstantesFunciones.resaltarid_empresaRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_empresaRetencionInven,false,"id_empresaRetencionInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.retencioninvenConstantesFunciones.mostrarid_sucursalRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.retencioninvenConstantesFunciones.resaltarid_sucursalRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_sucursalRetencionInven,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.retencioninvenConstantesFunciones.resaltarid_sucursalRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_sucursalRetencionInven,false,"id_sucursalRetencionInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.retencioninvenConstantesFunciones.mostrarid_ejercicioRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.retencioninvenConstantesFunciones.resaltarid_ejercicioRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_ejercicioRetencionInven,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.retencioninvenConstantesFunciones.resaltarid_ejercicioRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_ejercicioRetencionInven,false,"id_ejercicioRetencionInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDPERIODO));

		if(this.retencioninvenConstantesFunciones.mostrarid_periodoRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.retencioninvenConstantesFunciones.resaltarid_periodoRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_periodoRetencionInven,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.retencioninvenConstantesFunciones.resaltarid_periodoRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_periodoRetencionInven,false,"id_periodoRetencionInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDCOMPRA));

		if(this.retencioninvenConstantesFunciones.mostrarid_compraRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_IDCOMPRA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CompraTableCell(this.comprasForeignKey,this.retencioninvenConstantesFunciones.resaltarid_compraRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_compraRetencionInven,iSizeTabla));
			tableColumn.setCellEditor(new CompraTableCell(this.comprasForeignKey,this.retencioninvenConstantesFunciones.resaltarid_compraRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_compraRetencionInven,true,"id_compraRetencionInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION));

		if(this.retencioninvenConstantesFunciones.mostrarid_tipo_retencionRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRetencionTableCell(this.tiporetencionsForeignKey,this.retencioninvenConstantesFunciones.resaltarid_tipo_retencionRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_tipo_retencionRetencionInven,iSizeTabla));
			tableColumn.setCellEditor(new TipoRetencionTableCell(this.tiporetencionsForeignKey,this.retencioninvenConstantesFunciones.resaltarid_tipo_retencionRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_tipo_retencionRetencionInven,true,"id_tipo_retencionRetencionInven","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_PORCENTAJE));

		if(this.retencioninvenConstantesFunciones.mostrarporcentajeRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencioninvenConstantesFunciones.resaltarporcentajeRetencionInven,this.retencioninvenConstantesFunciones.activarporcentajeRetencionInven,iSizeTabla,this,true,"porcentajeRetencionInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencioninvenConstantesFunciones.resaltarporcentajeRetencionInven,this.retencioninvenConstantesFunciones.activarporcentajeRetencionInven,this,true,"porcentajeRetencionInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE));

		if(this.retencioninvenConstantesFunciones.mostrarbase_imponibleRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencioninvenConstantesFunciones.resaltarbase_imponibleRetencionInven,this.retencioninvenConstantesFunciones.activarbase_imponibleRetencionInven,iSizeTabla,this,true,"base_imponibleRetencionInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencioninvenConstantesFunciones.resaltarbase_imponibleRetencionInven,this.retencioninvenConstantesFunciones.activarbase_imponibleRetencionInven,this,true,"base_imponibleRetencionInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_RETENCION));

		if(this.retencioninvenConstantesFunciones.mostrarretencionRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_RETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencioninvenConstantesFunciones.resaltarretencionRetencionInven,this.retencioninvenConstantesFunciones.activarretencionRetencionInven,iSizeTabla,this,true,"retencionRetencionInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencioninvenConstantesFunciones.resaltarretencionRetencionInven,this.retencioninvenConstantesFunciones.activarretencionRetencionInven,this,true,"retencionRetencionInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION));

		if(this.retencioninvenConstantesFunciones.mostrarnumero_retencionRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencioninvenConstantesFunciones.resaltarnumero_retencionRetencionInven,this.retencioninvenConstantesFunciones.activarnumero_retencionRetencionInven,iSizeTabla,this,true,"numero_retencionRetencionInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencioninvenConstantesFunciones.resaltarnumero_retencionRetencionInven,this.retencioninvenConstantesFunciones.activarnumero_retencionRetencionInven,this,true,"numero_retencionRetencionInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.retencioninvenConstantesFunciones.mostrarid_cuenta_contableRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.retencioninvenConstantesFunciones.resaltarid_cuenta_contableRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_cuenta_contableRetencionInven,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.retencioninvenConstantesFunciones.resaltarid_cuenta_contableRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_cuenta_contableRetencionInven,true,"id_cuenta_contableRetencionInven","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDANIO));

		if(this.retencioninvenConstantesFunciones.mostrarid_anioRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.retencioninvenConstantesFunciones.resaltarid_anioRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_anioRetencionInven,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.retencioninvenConstantesFunciones.resaltarid_anioRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_anioRetencionInven,true,"id_anioRetencionInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,RetencionInvenConstantesFunciones.LABEL_IDMES));

		if(this.retencioninvenConstantesFunciones.mostrarid_mesRetencionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionInvenConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.retencioninvenConstantesFunciones.resaltarid_mesRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_mesRetencionInven,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.retencioninvenConstantesFunciones.resaltarid_mesRetencionInven,this,this.retencioninvenConstantesFunciones.activarid_mesRetencionInven,true,"id_mesRetencionInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.retencioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.retencioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRetencionInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.retencioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.retencioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRetencionInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRetencionInven && this.isPermisoGuardarCambiosRetencionInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.retencioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.retencioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRetencionInven.addColumn(tableColumn);
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
			
			this.jTableDatosRetencionInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRetencionInven && this.isPermisoGuardarCambiosRetencionInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRetencionInven && this.isPermisoGuardarCambiosRetencionInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRetencionInven.moveColumn(this.jTableDatosRetencionInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRetencionInven.moveColumn(this.jTableDatosRetencionInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRetencionInven.moveColumn(this.jTableDatosRetencionInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRetencionInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRetencionInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRetencionInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRetencionInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRetencionInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RetencionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRetencionInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRetencionInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRetencionInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=retencioninvenLogic.getRetencionInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=retencioninvens.size()-1;
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
		//this.jTableDatosRetencionInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRetencionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRetencionInven();
			
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
				
				//this.isEsNuevoRetencionInven=false;
					
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
				if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRetencionInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRetencionInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRetencionInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.retencioninven.getsType().equals("DUPLICADO")
				   || this.retencioninven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRetencionInven=true;
				
				} else {
					this.isEsNuevoRetencionInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
					if(this.retencioninven.getId()>=0 && !this.retencioninven.getIsNew()) {						
						this.isEsNuevoRetencionInven=false;
						
					} else {
						this.isEsNuevoRetencionInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRetencionInven(esRelaciones);						
				
				this.seleccionarRetencionInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.retencioninven.getId()<0) {
					this.isEsNuevoRetencionInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRetencionInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRetencionInven(evt,rowIndex);
				}	
				
				if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RetencionInven: " + this.dDif); 
					}
				}								
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRetencionInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.retencioninven)) {
					if(this.retencioninven.getId()>0) {
						this.retencioninven.setIsDeleted(true);
						
						this.retencioninvensEliminados.add(this.retencioninven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.retencioninvenLogic.getRetencionInvens().remove(this.retencioninven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.retencioninvens.remove(this.retencioninven);				
					}
					
					
					((RetencionInvenModel) this.jTableDatosRetencionInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRetencionInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRetencionInven) {
			
			if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRetencionInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRetencionInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RetencionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRetencionInven(this.retencioninven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.retencioninvenConstantesFunciones.cargarid_empresaRetencionInven || this.retencioninvenConstantesFunciones.event_dependid_empresaRetencionInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.retencioninven.getid_empresa());
									//this.inicializarActualizarBindingRetencionInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(retencioninven.getEmpresa()!=null) {
							this.empresasForeignKey.add(retencioninven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.retencioninven.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.retencioninvenConstantesFunciones.cargarid_sucursalRetencionInven || this.retencioninvenConstantesFunciones.event_dependid_sucursalRetencionInven) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.retencioninven.getid_sucursal());
									//this.inicializarActualizarBindingRetencionInven(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(retencioninven.getSucursal()!=null) {
							this.sucursalsForeignKey.add(retencioninven.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.retencioninven.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.retencioninvenConstantesFunciones.cargarid_ejercicioRetencionInven || this.retencioninvenConstantesFunciones.event_dependid_ejercicioRetencionInven) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.retencioninven.getid_ejercicio());
									//this.inicializarActualizarBindingRetencionInven(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(retencioninven.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(retencioninven.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.retencioninven.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.retencioninvenConstantesFunciones.cargarid_periodoRetencionInven || this.retencioninvenConstantesFunciones.event_dependid_periodoRetencionInven) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.retencioninven.getid_periodo());
									//this.inicializarActualizarBindingRetencionInven(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(retencioninven.getPeriodo()!=null) {
							this.periodosForeignKey.add(retencioninven.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.retencioninven.getid_periodo(),false,"Formulario");

					//Compra
					if(!this.retencioninvenConstantesFunciones.cargarid_compraRetencionInven || this.retencioninvenConstantesFunciones.event_dependid_compraRetencionInven) {
						//this.cargarCombosComprasForeignKeyLista(" where id="+this.retencioninven.getid_compra());
									//this.inicializarActualizarBindingRetencionInven(false,false);
						this.comprasForeignKey=new ArrayList<Compra>();

						if(retencioninven.getCompra()!=null) {
							this.comprasForeignKey.add(retencioninven.getCompra());
						}

						this.addItemDefectoCombosForeignKeyCompra();
						this.cargarCombosFrameComprasForeignKey("Todos");
					}
					this.setActualCompraForeignKey(this.retencioninven.getid_compra(),false,"Formulario");

					//TipoRetencion
					if(!this.retencioninvenConstantesFunciones.cargarid_tipo_retencionRetencionInven || this.retencioninvenConstantesFunciones.event_dependid_tipo_retencionRetencionInven) {
						//this.cargarCombosTipoRetencionsForeignKeyLista(" where id="+this.retencioninven.getid_tipo_retencion());
									//this.inicializarActualizarBindingRetencionInven(false,false);
						this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>();

						if(retencioninven.getTipoRetencion()!=null) {
							this.tiporetencionsForeignKey.add(retencioninven.getTipoRetencion());
						}

						this.addItemDefectoCombosForeignKeyTipoRetencion();
						this.cargarCombosFrameTipoRetencionsForeignKey("Todos");
					}
					this.setActualTipoRetencionForeignKey(this.retencioninven.getid_tipo_retencion(),false,"Formulario");

					//CuentaContable
					if(!this.retencioninvenConstantesFunciones.cargarid_cuenta_contableRetencionInven || this.retencioninvenConstantesFunciones.event_dependid_cuenta_contableRetencionInven) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.retencioninven.getid_cuenta_contable());
									//this.inicializarActualizarBindingRetencionInven(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(retencioninven.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(retencioninven.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.retencioninven.getid_cuenta_contable(),false,"Formulario");

					//Anio
					if(!this.retencioninvenConstantesFunciones.cargarid_anioRetencionInven || this.retencioninvenConstantesFunciones.event_dependid_anioRetencionInven) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.retencioninven.getid_anio());
									//this.inicializarActualizarBindingRetencionInven(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(retencioninven.getAnio()!=null) {
							this.aniosForeignKey.add(retencioninven.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.retencioninven.getid_anio(),false,"Formulario");

					//Mes
					if(!this.retencioninvenConstantesFunciones.cargarid_mesRetencionInven || this.retencioninvenConstantesFunciones.event_dependid_mesRetencionInven) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.retencioninven.getid_mes());
									//this.inicializarActualizarBindingRetencionInven(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(retencioninven.getMes()!=null) {
							this.messForeignKey.add(retencioninven.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.retencioninven.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRetencionInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRetencionInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRetencionInven(RetencionInven retencioninven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRetencionInven(retencioninven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRetencionInven(RetencionInven retencioninven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRetencionInven(retencioninven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRetencionInven(retencioninven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRetencionInven(retencioninven);
	}
	
	public void setVariablesObjetoActualToFormularioRetencionInven(RetencionInven retencioninven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRetencionInven.jLabelidRetencionInven.setText(retencioninven.getId().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldporcentajeRetencionInven.setText(retencioninven.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldbase_imponibleRetencionInven.setText(retencioninven.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldretencionRetencionInven.setText(retencioninven.getretencion().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_retencionRetencionInven.setText(retencioninven.getnumero_retencion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RetencionInven retencioninvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,retencioninvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RetencionInven retencioninvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				retencioninvenLocal=this.retencioninven;
			} else {
				retencioninvenLocal=this.retencioninvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(retencioninvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRetencionInven(retencioninvenLocal,true);
					
					if(retencioninvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(retencioninvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(retencioninvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRetencionInven(RetencionInven retencioninven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRetencionInven(retencioninven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(retencioninven);
	}
	
	public void setVariablesFormularioToObjetoActualRetencionInven(RetencionInven retencioninven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRetencionInven(retencioninven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRetencionInven(RetencionInven retencioninven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRetencionInven.jLabelidRetencionInven.getText()==null || this.jInternalFrameDetalleFormRetencionInven.jLabelidRetencionInven.getText()=="" || this.jInternalFrameDetalleFormRetencionInven.jLabelidRetencionInven.getText()=="Id") {
				this.jInternalFrameDetalleFormRetencionInven.jLabelidRetencionInven.setText("0");
			}

			if(conColumnasBase) {retencioninven.setId(Long.parseLong(this.jInternalFrameDetalleFormRetencionInven.jLabelidRetencionInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelIdRetencionInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencioninven.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormRetencionInven.jTextFieldporcentajeRetencionInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionInvenConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelporcentajeRetencionInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencioninven.setbase_imponible(Double.parseDouble(this.jInternalFrameDetalleFormRetencionInven.jTextFieldbase_imponibleRetencionInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelbase_imponibleRetencionInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencioninven.setretencion(Double.parseDouble(this.jInternalFrameDetalleFormRetencionInven.jTextFieldretencionRetencionInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionInvenConstantesFunciones.LABEL_RETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelretencionRetencionInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencioninven.setnumero_retencion(this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_retencionRetencionInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionInven.jLabelnumero_retencionRetencionInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRetencionInven(RetencionInven retencioninvenBean,RetencionInven retencioninven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRetencionInven(RetencionInven retencioninvenOrigen,RetencionInven retencioninven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && retencioninvenOrigen.getId()!=null && !retencioninvenOrigen.getId().equals(0L))) {retencioninven.setId(retencioninvenOrigen.getId());}}
			if(conDefault || (!conDefault && retencioninvenOrigen.getporcentaje()!=null && !retencioninvenOrigen.getporcentaje().equals(0.0))) {retencioninven.setporcentaje(retencioninvenOrigen.getporcentaje());}
			if(conDefault || (!conDefault && retencioninvenOrigen.getbase_imponible()!=null && !retencioninvenOrigen.getbase_imponible().equals(0.0))) {retencioninven.setbase_imponible(retencioninvenOrigen.getbase_imponible());}
			if(conDefault || (!conDefault && retencioninvenOrigen.getretencion()!=null && !retencioninvenOrigen.getretencion().equals(0.0))) {retencioninven.setretencion(retencioninvenOrigen.getretencion());}
			if(conDefault || (!conDefault && retencioninvenOrigen.getnumero_retencion()!=null && !retencioninvenOrigen.getnumero_retencion().equals(""))) {retencioninven.setnumero_retencion(retencioninvenOrigen.getnumero_retencion());}
			if(conDefault || (!conDefault && retencioninvenOrigen.getnumero_serie_retencion()!=null && !retencioninvenOrigen.getnumero_serie_retencion().equals(0.0))) {retencioninven.setnumero_serie_retencion(retencioninvenOrigen.getnumero_serie_retencion());}
			if(conDefault || (!conDefault && retencioninvenOrigen.getcodigo()!=null && !retencioninvenOrigen.getcodigo().equals(""))) {retencioninven.setcodigo(retencioninvenOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRetencionInven(RetencionInven retencioninven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRetencionInven.jLabelidRetencionInven.setText(retencioninven.getId().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldporcentajeRetencionInven.setText(retencioninven.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldbase_imponibleRetencionInven.setText(retencioninven.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldretencionRetencionInven.setText(retencioninven.getretencion().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_retencionRetencionInven.setText(retencioninven.getnumero_retencion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRetencionInven(RetencionInvenBean retencioninvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRetencionInven.jLabelidRetencionInven.setText(retencioninvenBean.getId().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldporcentajeRetencionInven.setText(retencioninvenBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldbase_imponibleRetencionInven.setText(retencioninvenBean.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldretencionRetencionInven.setText(retencioninvenBean.getretencion().toString());
			this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_retencionRetencionInven.setText(retencioninvenBean.getnumero_retencion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRetencionInven(RetencionInvenParameterReturnGeneral retencioninvenReturnGeneral,RetencionInvenBean retencioninvenBean,Boolean conDefault) throws Exception { 
		try {
			RetencionInven retencioninvenLocal=new RetencionInven();
			
			retencioninvenLocal=retencioninvenReturnGeneral.getRetencionInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && retencioninvenLocal.getId()!=null && !retencioninvenLocal.getId().equals(0L))) {retencioninvenBean.setId(retencioninvenLocal.getId());}}
			if(conDefault || (!conDefault && retencioninvenLocal.getporcentaje()!=null && !retencioninvenLocal.getporcentaje().equals(0.0))) {retencioninvenBean.setporcentaje(retencioninvenLocal.getporcentaje());}
			if(conDefault || (!conDefault && retencioninvenLocal.getbase_imponible()!=null && !retencioninvenLocal.getbase_imponible().equals(0.0))) {retencioninvenBean.setbase_imponible(retencioninvenLocal.getbase_imponible());}
			if(conDefault || (!conDefault && retencioninvenLocal.getretencion()!=null && !retencioninvenLocal.getretencion().equals(0.0))) {retencioninvenBean.setretencion(retencioninvenLocal.getretencion());}
			if(conDefault || (!conDefault && retencioninvenLocal.getnumero_retencion()!=null && !retencioninvenLocal.getnumero_retencion().equals(""))) {retencioninvenBean.setnumero_retencion(retencioninvenLocal.getnumero_retencion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRetencionInvenGenerico(Long idRetencionInvenSeleccionado,JComboBox jComboBoxRetencionInven,List<RetencionInven> retencioninvensLocal)throws Exception {
		try {
			RetencionInven  retencioninvenTemp=null;

			for(RetencionInven retencioninvenAux:retencioninvensLocal) {
				if(retencioninvenAux.getId()!=null && retencioninvenAux.getId().equals(idRetencionInvenSeleccionado)) {
					retencioninvenTemp=retencioninvenAux;
					break;
				}
			}

			jComboBoxRetencionInven.setSelectedItem(retencioninvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRetencionInvenGenerico(JComboBox jComboBoxRetencionInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRetencionInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRetencionInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRetencionInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRetencionInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRetencionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRetencionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencioninven=(RetencionInven) retencioninvenLogic.getRetencionInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			retencioninven =(RetencionInven) retencioninvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!retencioninven.getIsNew() && !retencioninven.getIsChanged() && !retencioninven.getIsDeleted()) {
				sDescripcion=retencioninven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=retencioninven.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!retencioninven.getIsNew() && !retencioninven.getIsChanged() && !retencioninven.getIsDeleted()) {
				sDescripcion=retencioninven.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=retencioninven.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!retencioninven.getIsNew() && !retencioninven.getIsChanged() && !retencioninven.getIsDeleted()) {
				sDescripcion=retencioninven.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=retencioninven.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!retencioninven.getIsNew() && !retencioninven.getIsChanged() && !retencioninven.getIsDeleted()) {
				sDescripcion=retencioninven.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=retencioninven.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Compra")) {
			//sDescripcion=this.getActualCompraForeignKeyDescripcion((Long)value);
			if(!retencioninven.getIsNew() && !retencioninven.getIsChanged() && !retencioninven.getIsDeleted()) {
				sDescripcion=retencioninven.getcompra_descripcion();
			} else {
				//sDescripcion=this.getActualCompraForeignKeyDescripcion((Long)value);
				sDescripcion=retencioninven.getcompra_descripcion();
			}
		}

		if(sTipo.equals("TipoRetencion")) {
			//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
			if(!retencioninven.getIsNew() && !retencioninven.getIsChanged() && !retencioninven.getIsDeleted()) {
				sDescripcion=retencioninven.gettiporetencion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
				sDescripcion=retencioninven.gettiporetencion_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!retencioninven.getIsNew() && !retencioninven.getIsChanged() && !retencioninven.getIsDeleted()) {
				sDescripcion=retencioninven.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=retencioninven.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!retencioninven.getIsNew() && !retencioninven.getIsChanged() && !retencioninven.getIsDeleted()) {
				sDescripcion=retencioninven.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=retencioninven.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!retencioninven.getIsNew() && !retencioninven.getIsChanged() && !retencioninven.getIsDeleted()) {
				sDescripcion=retencioninven.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=retencioninven.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RetencionInven retencioninvenRow=new RetencionInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencioninvenRow=(RetencionInven) retencioninvenLogic.getRetencionInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			retencioninvenRow=(RetencionInven) retencioninvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRetencionInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRetencionInven.setVisible((this.isVisibilidadCeldaNuevoRetencionInven && this.isPermisoNuevoRetencionInven));			
			this.jButtonDuplicarRetencionInven.setVisible((this.isVisibilidadCeldaDuplicarRetencionInven && this.isPermisoDuplicarRetencionInven));			
			this.jButtonCopiarRetencionInven.setVisible((this.isVisibilidadCeldaCopiarRetencionInven && this.isPermisoCopiarRetencionInven));
			this.jButtonVerFormRetencionInven.setVisible((this.isVisibilidadCeldaVerFormRetencionInven && this.isPermisoVerFormRetencionInven));
			
			this.jButtonAbrirOrderByRetencionInven.setVisible((this.isVisibilidadCeldaOrdenRetencionInven && this.isPermisoOrdenRetencionInven));			
			
			this.jButtonNuevoRelacionesRetencionInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionInven && this.isPermisoNuevoRetencionInven));			
			this.jButtonNuevoGuardarCambiosRetencionInven.setVisible((this.isVisibilidadCeldaNuevoRetencionInven && this.isPermisoNuevoRetencionInven && this.isPermisoGuardarCambiosRetencionInven));
			
			if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonModificarRetencionInven.setVisible((this.isVisibilidadCeldaModificarRetencionInven && this.isPermisoActualizarRetencionInven));	
			this.jInternalFrameDetalleFormRetencionInven.jButtonActualizarRetencionInven.setVisible((this.isVisibilidadCeldaActualizarRetencionInven && this.isPermisoActualizarRetencionInven));	
			this.jInternalFrameDetalleFormRetencionInven.jButtonEliminarRetencionInven.setVisible((this.isVisibilidadCeldaEliminarRetencionInven && this.isPermisoEliminarRetencionInven));
			this.jInternalFrameDetalleFormRetencionInven.jButtonCancelarRetencionInven.setVisible(this.isVisibilidadCeldaCancelarRetencionInven);							
			this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosRetencionInven.setVisible((this.isVisibilidadCeldaGuardarRetencionInven && this.isPermisoGuardarCambiosRetencionInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaRetencionInven.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionInven && this.isPermisoGuardarCambiosRetencionInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRetencionInven.setVisible((this.isVisibilidadCeldaNuevoRetencionInven && this.isPermisoNuevoRetencionInven));						
			this.jButtonDuplicarToolBarRetencionInven.setVisible((this.isVisibilidadCeldaDuplicarRetencionInven && this.isPermisoDuplicarRetencionInven));						
			this.jButtonCopiarToolBarRetencionInven.setVisible((this.isVisibilidadCeldaCopiarRetencionInven && this.isPermisoCopiarRetencionInven));			
			this.jButtonVerFormToolBarRetencionInven.setVisible((this.isVisibilidadCeldaVerFormRetencionInven && this.isPermisoVerFormRetencionInven));			
			this.jButtonAbrirOrderByToolBarRetencionInven.setVisible((this.isVisibilidadCeldaOrdenRetencionInven && this.isPermisoOrdenRetencionInven));
			this.jButtonNuevoRelacionesToolBarRetencionInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionInven && this.isPermisoNuevoRetencionInven));			
			this.jButtonNuevoGuardarCambiosToolBarRetencionInven.setVisible((this.isVisibilidadCeldaNuevoRetencionInven && this.isPermisoNuevoRetencionInven && this.isPermisoGuardarCambiosRetencionInven));			
			
			if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonModificarToolBarRetencionInven.setVisible((this.isVisibilidadCeldaModificarRetencionInven && this.isPermisoActualizarRetencionInven));	
			this.jInternalFrameDetalleFormRetencionInven.jButtonActualizarToolBarRetencionInven.setVisible((this.isVisibilidadCeldaActualizarRetencionInven  && this.isPermisoActualizarRetencionInven));	
			this.jInternalFrameDetalleFormRetencionInven.jButtonEliminarToolBarRetencionInven.setVisible((this.isVisibilidadCeldaEliminarRetencionInven && this.isPermisoEliminarRetencionInven));
			this.jInternalFrameDetalleFormRetencionInven.jButtonCancelarToolBarRetencionInven.setVisible(this.isVisibilidadCeldaCancelarRetencionInven);				
			this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosToolBarRetencionInven.setVisible((this.isVisibilidadCeldaGuardarRetencionInven && this.isPermisoGuardarCambiosRetencionInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRetencionInven.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionInven && this.isPermisoGuardarCambiosRetencionInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRetencionInven.setVisible((this.isVisibilidadCeldaNuevoRetencionInven && this.isPermisoNuevoRetencionInven));			
			this.jMenuItemDuplicarRetencionInven.setVisible((this.isVisibilidadCeldaDuplicarRetencionInven && this.isPermisoDuplicarRetencionInven));			
			this.jMenuItemCopiarRetencionInven.setVisible((this.isVisibilidadCeldaCopiarRetencionInven && this.isPermisoCopiarRetencionInven));			
			this.jMenuItemVerFormRetencionInven.setVisible((this.isVisibilidadCeldaVerFormRetencionInven && this.isPermisoVerFormRetencionInven));			
			this.jMenuItemAbrirOrderByRetencionInven.setVisible((this.isVisibilidadCeldaOrdenRetencionInven && this.isPermisoOrdenRetencionInven));			
			//this.jMenuItemMostrarOcultarRetencionInven.setVisible((this.isVisibilidadCeldaOrdenRetencionInven && this.isPermisoOrdenRetencionInven));
			this.jMenuItemDetalleAbrirOrderByRetencionInven.setVisible((this.isVisibilidadCeldaOrdenRetencionInven && this.isPermisoOrdenRetencionInven));			
			//this.jMenuItemDetalleMostrarOcultarRetencionInven.setVisible((this.isVisibilidadCeldaOrdenRetencionInven && this.isPermisoOrdenRetencionInven));			
			this.jMenuItemNuevoRelacionesRetencionInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionInven && this.isPermisoNuevoRetencionInven));			
			this.jMenuItemNuevoGuardarCambiosRetencionInven.setVisible((this.isVisibilidadCeldaNuevoRetencionInven && this.isPermisoNuevoRetencionInven && this.isPermisoGuardarCambiosRetencionInven));									
			
			if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			this.jInternalFrameDetalleFormRetencionInven.jMenuItemModificarRetencionInven.setVisible((this.isVisibilidadCeldaModificarRetencionInven && this.isPermisoActualizarRetencionInven));	
			this.jInternalFrameDetalleFormRetencionInven.jMenuItemActualizarRetencionInven.setVisible((this.isVisibilidadCeldaActualizarRetencionInven && this.isPermisoActualizarRetencionInven));	
			this.jInternalFrameDetalleFormRetencionInven.jMenuItemEliminarRetencionInven.setVisible((this.isVisibilidadCeldaEliminarRetencionInven && this.isPermisoEliminarRetencionInven));
			this.jInternalFrameDetalleFormRetencionInven.jMenuItemCancelarRetencionInven.setVisible(this.isVisibilidadCeldaCancelarRetencionInven);				
			}
			
			this.jMenuItemGuardarCambiosRetencionInven.setVisible((this.isVisibilidadCeldaGuardarRetencionInven && this.isPermisoGuardarCambiosRetencionInven));						
			this.jMenuItemGuardarCambiosTablaRetencionInven.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionInven && this.isPermisoGuardarCambiosRetencionInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRetencionInven=this.jButtonNuevoRetencionInven.isVisible();
			this.isVisibilidadCeldaDuplicarRetencionInven=this.jButtonDuplicarRetencionInven.isVisible();
			this.isVisibilidadCeldaCopiarRetencionInven=this.jButtonCopiarRetencionInven.isVisible();
			this.isVisibilidadCeldaVerFormRetencionInven=this.jButtonVerFormRetencionInven.isVisible();
			
			this.isVisibilidadCeldaOrdenRetencionInven=this.jButtonAbrirOrderByRetencionInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=this.jButtonNuevoRelacionesRetencionInven.isVisible();
			this.isVisibilidadCeldaModificarRetencionInven=this.jButtonModificarRetencionInven.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			this.isVisibilidadCeldaActualizarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jButtonActualizarRetencionInven.isVisible();
			this.isVisibilidadCeldaEliminarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jButtonEliminarRetencionInven.isVisible();
			this.isVisibilidadCeldaCancelarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jButtonCancelarRetencionInven.isVisible();
			this.isVisibilidadCeldaGuardarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosRetencionInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=this.jButtonGuardarCambiosTablaRetencionInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRetencionInven=this.jButtonNuevoToolBarRetencionInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=this.jButtonNuevoRelacionesToolBarRetencionInven.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			this.isVisibilidadCeldaModificarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jButtonModificarToolBarRetencionInven.isVisible();
			this.isVisibilidadCeldaActualizarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jButtonActualizarToolBarRetencionInven.isVisible();
			this.isVisibilidadCeldaEliminarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jButtonEliminarToolBarRetencionInven.isVisible();
			this.isVisibilidadCeldaCancelarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jButtonCancelarToolBarRetencionInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRetencionInven=this.jButtonGuardarCambiosToolBarRetencionInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=this.jButtonGuardarCambiosTablaToolBarRetencionInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRetencionInven=this.jMenuItemNuevoRetencionInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=this.jMenuItemNuevoRelacionesRetencionInven.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			this.isVisibilidadCeldaModificarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jMenuItemModificarRetencionInven.isVisible();
			this.isVisibilidadCeldaActualizarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jMenuItemActualizarRetencionInven.isVisible();
			this.isVisibilidadCeldaEliminarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jMenuItemEliminarRetencionInven.isVisible();
			this.isVisibilidadCeldaCancelarRetencionInven=this.jInternalFrameDetalleFormRetencionInven.jMenuItemCancelarRetencionInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRetencionInven=this.jMenuItemGuardarCambiosRetencionInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=this.jMenuItemGuardarCambiosTablaRetencionInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRetencionInven(Boolean esInicializar) {
		if(RetencionInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
				//if(this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRetencionInven();
			}
			
			this.inicializarActualizarBindingBotonesManualRetencionInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRetencionInven() {
		this.jButtonNuevoRetencionInven.setVisible(this.isPermisoNuevoRetencionInven);			
		this.jButtonDuplicarRetencionInven.setVisible(this.isPermisoDuplicarRetencionInven);			
		this.jButtonCopiarRetencionInven.setVisible(this.isPermisoCopiarRetencionInven);			
		this.jButtonVerFormRetencionInven.setVisible(this.isPermisoVerFormRetencionInven);			
		
		this.jButtonAbrirOrderByRetencionInven.setVisible(this.isPermisoOrdenRetencionInven);					
		
		this.jButtonNuevoRelacionesRetencionInven.setVisible(this.isPermisoNuevoRetencionInven);			
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonModificarRetencionInven.setVisible(this.isPermisoActualizarRetencionInven);	
			this.jInternalFrameDetalleFormRetencionInven.jButtonActualizarRetencionInven.setVisible(this.isPermisoActualizarRetencionInven);	
			this.jInternalFrameDetalleFormRetencionInven.jButtonEliminarRetencionInven.setVisible(this.isPermisoEliminarRetencionInven);
			this.jInternalFrameDetalleFormRetencionInven.jButtonCancelarRetencionInven.setVisible(this.isVisibilidadCeldaCancelarRetencionInven);						
			this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosRetencionInven.setVisible(this.isPermisoGuardarCambiosRetencionInven);							
		}
		
		this.jButtonGuardarCambiosTablaRetencionInven.setVisible(this.isPermisoActualizarRetencionInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRetencionInven() {
		this.jInternalFrameDetalleFormRetencionInven.jButtonModificarRetencionInven.setVisible(this.isPermisoActualizarRetencionInven);	
		this.jInternalFrameDetalleFormRetencionInven.jButtonActualizarRetencionInven.setVisible(this.isPermisoActualizarRetencionInven);	
		this.jInternalFrameDetalleFormRetencionInven.jButtonEliminarRetencionInven.setVisible(this.isPermisoEliminarRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jButtonCancelarRetencionInven.setVisible(this.isVisibilidadCeldaCancelarRetencionInven);							
		this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosRetencionInven.setVisible((this.isVisibilidadCeldaGuardarRetencionInven && this.isPermisoGuardarCambiosRetencionInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRetencionInven() {
		if(RetencionInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRetencionInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRetencionInven() {
	}
	
	public void jTableDatosRetencionInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRetencionInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.retencioninven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRetencionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRetencionInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.retencioninvenLogic.getConnexion());

				if(this.retencioninven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.retencioninven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionInven=(TitledBorder)this.jScrollPanelDatosRetencionInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRetencionInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.retencioninven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalRetencionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebRetencionInven(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.retencioninvenLogic.getConnexion());

				if(this.retencioninven.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.retencioninven.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionInven=(TitledBorder)this.jScrollPanelDatosRetencionInven.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderRetencionInven.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.retencioninven.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioRetencionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebRetencionInven(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.retencioninvenLogic.getConnexion());

				if(this.retencioninven.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.retencioninven.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionInven=(TitledBorder)this.jScrollPanelDatosRetencionInven.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderRetencionInven.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.retencioninven.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoRetencionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebRetencionInven(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.retencioninvenLogic.getConnexion());

				if(this.retencioninven.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.retencioninven.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionInven=(TitledBorder)this.jScrollPanelDatosRetencionInven.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderRetencionInven.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.retencioninven.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_compraRetencionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocompra=true;

			idTienePermisocompra=this.tienePermisosUsuarioEnPaginaWebRetencionInven(CompraConstantesFunciones.CLASSNAME);

			if(idTienePermisocompra) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);

				this.compraBeanSwingJInternalFrame=new CompraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.compraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.compraBeanSwingJInternalFrame.getCompraLogic().setConnexion(this.retencioninvenLogic.getConnexion());

				if(this.retencioninven.getid_compra()!=null) {
					this.compraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.compraBeanSwingJInternalFrame.setIdActual(this.retencioninven.getid_compra());
					this.compraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.compraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.compraBeanSwingJInternalFrame.inicializarActualizarBindingTablaCompra();
				}

				JInternalFrameBase jinternalFrame =this.compraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionInven=(TitledBorder)this.jScrollPanelDatosRetencionInven.getBorder();
				TitledBorder titledBordercompra=(TitledBorder)this.compraBeanSwingJInternalFrame.jScrollPanelDatosCompra.getBorder();

				titledBordercompra.setTitle(titledBorderRetencionInven.getTitle() + " -> Compra");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_compraRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getid_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_compra = "+this.retencioninven.getid_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_retencionRetencionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporetencion=true;

			idTienePermisotiporetencion=this.tienePermisosUsuarioEnPaginaWebRetencionInven(TipoRetencionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporetencion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);

				this.tiporetencionBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporetencionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporetencionBeanSwingJInternalFrame.getTipoRetencionLogic().setConnexion(this.retencioninvenLogic.getConnexion());

				if(this.retencioninven.getid_tipo_retencion()!=null) {
					this.tiporetencionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporetencionBeanSwingJInternalFrame.setIdActual(this.retencioninven.getid_tipo_retencion());
					this.tiporetencionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRetencion();
				}

				JInternalFrameBase jinternalFrame =this.tiporetencionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionInven=(TitledBorder)this.jScrollPanelDatosRetencionInven.getBorder();
				TitledBorder titledBordertiporetencion=(TitledBorder)this.tiporetencionBeanSwingJInternalFrame.jScrollPanelDatosTipoRetencion.getBorder();

				titledBordertiporetencion.setTitle(titledBorderRetencionInven.getTitle() + " -> Tipo Retencion ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_retencionRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getid_tipo_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_retencion = "+this.retencioninven.getid_tipo_retencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.retencioninven.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbase_imponibleRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getbase_imponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where base_imponible = "+this.retencioninven.getbase_imponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonretencionRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getretencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where retencion = "+this.retencioninven.getretencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_retencionRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getnumero_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_retencion like '%"+this.retencioninven.getnumero_retencion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableRetencionInvenActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderRetencionInven=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosRetencionInven.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderRetencionInven=(TitledBorder)this.jScrollPanelDatosRetencionInven.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderRetencionInven.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableRetencionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebRetencionInven(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.retencioninvenLogic.getConnexion());

				if(this.retencioninven.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.retencioninven.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionInven=(TitledBorder)this.jScrollPanelDatosRetencionInven.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderRetencionInven.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.retencioninven.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioRetencionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebRetencionInven(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.retencioninvenLogic.getConnexion());

				if(this.retencioninven.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.retencioninven.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionInven=(TitledBorder)this.jScrollPanelDatosRetencionInven.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderRetencionInven.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.retencioninven.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesRetencionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebRetencionInven(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.retencioninvenLogic.getConnexion());

				if(this.retencioninven.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.retencioninven.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionInven=(TitledBorder)this.jScrollPanelDatosRetencionInven.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderRetencionInven.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.retencioninven.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_serie_retencionRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getnumero_serie_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_serie_retencion = "+this.retencioninven.getnumero_serie_retencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoRetencionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.getretencioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencioninven==null) {
						this.retencioninven = new RetencionInven();
					}

					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);
				}

				if(this.retencioninven.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.retencioninven.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioRetencionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionInven(false,false);

			this.getRetencionInvensFK_IdAnio();

			this.inicializarActualizarBindingRetencionInven(false);

			//if(RetencionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCompraRetencionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionInven(false,false);

			this.getRetencionInvensFK_IdCompra();

			this.inicializarActualizarBindingRetencionInven(false);

			//if(RetencionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableRetencionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionInven(false,false);

			this.getRetencionInvensFK_IdCuentaContable();

			this.inicializarActualizarBindingRetencionInven(false);

			//if(RetencionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioRetencionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionInven(false,false);

			this.getRetencionInvensFK_IdEjercicio();

			this.inicializarActualizarBindingRetencionInven(false);

			//if(RetencionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRetencionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionInven(false,false);

			this.getRetencionInvensFK_IdEmpresa();

			this.inicializarActualizarBindingRetencionInven(false);

			//if(RetencionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesRetencionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionInven(false,false);

			this.getRetencionInvensFK_IdMes();

			this.inicializarActualizarBindingRetencionInven(false);

			//if(RetencionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoRetencionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionInven(false,false);

			this.getRetencionInvensFK_IdPeriodo();

			this.inicializarActualizarBindingRetencionInven(false);

			//if(RetencionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalRetencionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionInven(false,false);

			this.getRetencionInvensFK_IdSucursal();

			this.inicializarActualizarBindingRetencionInven(false);

			//if(RetencionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRetencionRetencionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionInven(false,false);

			this.getRetencionInvensFK_IdTipoRetencion();

			this.inicializarActualizarBindingRetencionInven(false);

			//if(RetencionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRetencionInven() {
		if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) {
			this.jInternalFrameDetalleFormRetencionInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormRetencionInven.dispose();
			this.jInternalFrameDetalleFormRetencionInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRetencionInven!=null) {
			this.jInternalFrameReporteDinamicoRetencionInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRetencionInven.dispose();
			this.jInternalFrameReporteDinamicoRetencionInven=null;
		}
		
		if(this.jInternalFrameImportacionRetencionInven!=null) {
			this.jInternalFrameImportacionRetencionInven.setVisible(false);	    			
			this.jInternalFrameImportacionRetencionInven.dispose();
			this.jInternalFrameImportacionRetencionInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRetencionInven();
			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoRetencionInven")) {
				jButtonNuevoRetencionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRetencionInven")) {
				jButtonDuplicarRetencionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRetencionInven")) {
				jButtonCopiarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormRetencionInven")) {
				jButtonVerFormRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRetencionInven")) {
				jButtonNuevoRetencionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRetencionInven")) {
				jButtonDuplicarRetencionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRetencionInven")) {
				jButtonNuevoRetencionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRetencionInven")) {
				jButtonDuplicarRetencionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRetencionInven")) {
				jButtonNuevoRetencionInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRetencionInven")) {
				jButtonNuevoRetencionInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRetencionInven")) {
				jButtonNuevoRetencionInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRetencionInven")) {
				jButtonModificarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRetencionInven")) {
				jButtonModificarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRetencionInven")) {
				jButtonModificarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRetencionInven")) {
				jButtonActualizarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRetencionInven")) {
				jButtonActualizarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRetencionInven")) {
				jButtonActualizarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarRetencionInven")) {
				jButtonEliminarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRetencionInven")) {
				jButtonEliminarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRetencionInven")) {
				jButtonEliminarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarRetencionInven")) {
				jButtonCancelarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRetencionInven")) {
				jButtonCancelarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRetencionInven")) {
				jButtonCancelarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarRetencionInven")) {
				jButtonCerrarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRetencionInven")) {
				jButtonCerrarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRetencionInven")) {
				jButtonCerrarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRetencionInven")) {
				jButtonMostrarOcultarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRetencionInven")) {
				jButtonCancelarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRetencionInven")) {
				jButtonGuardarCambiosRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRetencionInven")) {
				jButtonGuardarCambiosRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRetencionInven")) {
				jButtonCopiarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRetencionInven")) {
				jButtonVerFormRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRetencionInven")) {
				jButtonGuardarCambiosRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRetencionInven")) {
				jButtonCopiarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRetencionInven")) {
				jButtonVerFormRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRetencionInven")) {
				jButtonGuardarCambiosRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRetencionInven")) {
				jButtonGuardarCambiosRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRetencionInven")) {
				jButtonGuardarCambiosRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRetencionInven")) {
				jButtonRecargarInformacionRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRetencionInven")) {
				jButtonRecargarInformacionRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRetencionInven")) {
				jButtonRecargarInformacionRetencionInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRetencionInven")) {
				jButtonAnterioresRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRetencionInven")) {
				jButtonAnterioresRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRetencionInven")) {
				jButtonAnterioresRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRetencionInven")) {
				jButtonSiguientesRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRetencionInven")) {
				jButtonSiguientesRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRetencionInven")) {
				jButtonSiguientesRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRetencionInven") || sTipo.equals("MenuItemDetalleAbrirOrderByRetencionInven")) {
				jButtonAbrirOrderByRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRetencionInven") || sTipo.equals("MenuItemDetalleMostrarOcultarRetencionInven")) {
				jButtonMostrarOcultarRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRetencionInven")) {
				jButtonNuevoGuardarCambiosRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRetencionInven")) {
				jButtonNuevoGuardarCambiosRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRetencionInven")) {
				jButtonNuevoGuardarCambiosRetencionInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRetencionInven")) {
				jButtonCerrarReporteDinamicoRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRetencionInven")) {
				jButtonGenerarReporteDinamicoRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRetencionInven")) {
				
				jButtonGenerarExcelReporteDinamicoRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRetencionInven")) {
				jButtonCerrarImportacionRetencionInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRetencionInven")) {
				
				jButtonGenerarImportacionRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRetencionInven")) {
				
				jButtonAbrirImportacionRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRetencionInven")) {
				jComboBoxTiposAccionesRetencionInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRetencionInven")) {
				jComboBoxTiposRelacionesRetencionInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRetencionInven")) {
				jComboBoxTiposAccionesRetencionInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRetencionInven")) {
				
				jComboBoxTiposSeleccionarRetencionInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRetencionInven")) {
				jTextFieldValorCampoGeneralRetencionInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRetencionInven")) {
				jButtonAbrirOrderByRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRetencionInven")) {
				jButtonAbrirOrderByRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRetencionInven")) {
				jButtonCerrarOrderByRetencionInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRetencionInvenBusqueda")) {
				this.jButtonidRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRetencionInvenUpdate")) {
				this.jButtonid_empresaRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRetencionInvenBusqueda")) {
				this.jButtonid_empresaRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRetencionInvenUpdate")) {
				this.jButtonid_sucursalRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRetencionInvenBusqueda")) {
				this.jButtonid_sucursalRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioRetencionInvenUpdate")) {
				this.jButtonid_ejercicioRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioRetencionInvenBusqueda")) {
				this.jButtonid_ejercicioRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoRetencionInvenUpdate")) {
				this.jButtonid_periodoRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoRetencionInvenBusqueda")) {
				this.jButtonid_periodoRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_compraRetencionInvenUpdate")) {
				this.jButtonid_compraRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_compraRetencionInvenBusqueda")) {
				this.jButtonid_compraRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionInvenUpdate")) {
				this.jButtonid_tipo_retencionRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionInvenBusqueda")) {
				this.jButtonid_tipo_retencionRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeRetencionInvenBusqueda")) {
				this.jButtonporcentajeRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleRetencionInvenBusqueda")) {
				this.jButtonbase_imponibleRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("retencionRetencionInvenBusqueda")) {
				this.jButtonretencionRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencionRetencionInvenBusqueda")) {
				this.jButtonnumero_retencionRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableRetencionInven")) {
				this.jButtonid_cuenta_contableRetencionInvenActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableRetencionInvenArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableRetencionInvenUpdate")) {
				this.jButtonid_cuenta_contableRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableRetencionInvenBusqueda")) {
				this.jButtonid_cuenta_contableRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioRetencionInvenUpdate")) {
				this.jButtonid_anioRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioRetencionInvenBusqueda")) {
				this.jButtonid_anioRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesRetencionInvenUpdate")) {
				this.jButtonid_mesRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesRetencionInvenBusqueda")) {
				this.jButtonid_mesRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serie_retencionRetencionInvenBusqueda")) {
				this.jButtonnumero_serie_retencionRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoRetencionInvenBusqueda")) {
				this.jButtoncodigoRetencionInvenBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contableRetencionInven")) {
				this.jButtonid_cuenta_contableRetencionInvenActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCompraRetencionInven")) {
				this.jButtonFK_IdCompraRetencionInvenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableRetencionInven")) {
				this.jButtonFK_IdCuentaContableRetencionInvenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoRetencionRetencionInven")) {
				this.jButtonFK_IdTipoRetencionRetencionInvenActionPerformed(evt);
			}
			
			;
			
			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRetencionInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				


				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RetencionInven retencioninvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				retencioninvenLocal=this.retencioninven;
			} else {
				retencioninvenLocal=this.retencioninvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
							
				
				


				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenAnterior =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencioninvenAnterior =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
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
			
			


			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
								
						
				


				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
								
				
				


				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenAnterior =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencioninvenAnterior =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenAnterior =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencioninvenAnterior =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
							
				
				


				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninvenAnterior =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.retencioninvenAnterior =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
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
			
			


			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
								
				
				


				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenAnterior =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencioninvenAnterior =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRetencionInven")) {
					jCheckBoxSeleccionarTodosRetencionInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRetencionInven")) {
					jCheckBoxSeleccionadosRetencionInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRetencionInven")) {
					
				}
				
				


				
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
												
				
				


				
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencioninvenAnterior =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.retencioninvenAnterior =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
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
			
			


			if(sTipo.equals("id_tipo_retencionRetencionInven")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven;
				}

				if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
					//classes=RetencionInvenConstantesFunciones.getClassesRelationshipsOfRetencionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyTipoRetencion(jComboBoxGenerico,"Formulario");

				this.recargarFormRetencionInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven")) {
				this.procesarActionsCombosForeignKeyTipoRetencion(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven,"FK_IdTipoRetencion");
				//recargarFormRetencionInvenTipoRetencion(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven,"FK_IdTipoRetencion");
			}
			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_tipo_retencionRetencionInven")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven;
				}

				if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
					//classes=RetencionInvenConstantesFunciones.getClassesRelationshipsOfRetencionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyTipoRetencion(jComboBoxGenerico,"Formulario");

				this.recargarFormRetencionInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven")) {
				this.procesarActionsCombosForeignKeyTipoRetencion(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven,"FK_IdTipoRetencion");
				//recargarFormRetencionInvenTipoRetencion(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven,"FK_IdTipoRetencion");
			}
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencioninven);
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
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
				
				


			if(sTipo.equals("id_tipo_retencionRetencionInven")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven;
				}

				if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
					//classes=RetencionInvenConstantesFunciones.getClassesRelationshipsOfRetencionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyTipoRetencion(jComboBoxGenerico,"Formulario");

				this.recargarFormRetencionInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven")) {
				this.procesarActionsCombosForeignKeyTipoRetencion(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven,"FK_IdTipoRetencion");
				//recargarFormRetencionInvenTipoRetencion(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionInven,"FK_IdTipoRetencion");
			}
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencioninvenAnterior =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencioninvenAnterior =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRetencionInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRetencionInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRetencionInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.retencioninven =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.retencioninven =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.retencioninven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRetencionInven")) {
				
				}
				
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRetencionInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRetencionInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRetencionInven")) {
			
			}
			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRetencionInven();
			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
			if(sTipo.equals("NuevoRetencionInven")) {
				jButtonNuevoRetencionInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRetencionInven")) {
				jButtonDuplicarRetencionInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRetencionInven")) {
				jButtonCopiarRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRetencionInven")) {
				jButtonVerFormRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRetencionInven")) {
				jButtonNuevoRetencionInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRetencionInven")) {
				jButtonModificarRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRetencionInven")) {
				jButtonActualizarRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRetencionInven")) {
				jButtonEliminarRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRetencionInven")) {
				jButtonGuardarCambiosRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRetencionInven")) {
				jButtonCancelarRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRetencionInven")) {
				jButtonCerrarRetencionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRetencionInven")) {
				jButtonGuardarCambiosRetencionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRetencionInven")) {
				jButtonNuevoGuardarCambiosRetencionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRetencionInven")) {
				jButtonAbrirOrderByRetencionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRetencionInven")) {
				jButtonRecargarInformacionRetencionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRetencionInven")) {
				jButtonAnterioresRetencionInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRetencionInven")) {
				jButtonSiguientesRetencionInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRetencionInvenBusqueda")) {
				this.jButtonidRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRetencionInvenUpdate")) {
				this.jButtonid_empresaRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRetencionInvenBusqueda")) {
				this.jButtonid_empresaRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRetencionInvenUpdate")) {
				this.jButtonid_sucursalRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRetencionInvenBusqueda")) {
				this.jButtonid_sucursalRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioRetencionInvenUpdate")) {
				this.jButtonid_ejercicioRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioRetencionInvenBusqueda")) {
				this.jButtonid_ejercicioRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoRetencionInvenUpdate")) {
				this.jButtonid_periodoRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoRetencionInvenBusqueda")) {
				this.jButtonid_periodoRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_compraRetencionInvenUpdate")) {
				this.jButtonid_compraRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_compraRetencionInvenBusqueda")) {
				this.jButtonid_compraRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionInvenUpdate")) {
				this.jButtonid_tipo_retencionRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionInvenBusqueda")) {
				this.jButtonid_tipo_retencionRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeRetencionInvenBusqueda")) {
				this.jButtonporcentajeRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleRetencionInvenBusqueda")) {
				this.jButtonbase_imponibleRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("retencionRetencionInvenBusqueda")) {
				this.jButtonretencionRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencionRetencionInvenBusqueda")) {
				this.jButtonnumero_retencionRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableRetencionInven")) {
				this.jButtonid_cuenta_contableRetencionInvenActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableRetencionInvenArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableRetencionInvenUpdate")) {
				this.jButtonid_cuenta_contableRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableRetencionInvenBusqueda")) {
				this.jButtonid_cuenta_contableRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioRetencionInvenUpdate")) {
				this.jButtonid_anioRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioRetencionInvenBusqueda")) {
				this.jButtonid_anioRetencionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesRetencionInvenUpdate")) {
				this.jButtonid_mesRetencionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesRetencionInvenBusqueda")) {
				this.jButtonid_mesRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serie_retencionRetencionInvenBusqueda")) {
				this.jButtonnumero_serie_retencionRetencionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoRetencionInvenBusqueda")) {
				this.jButtoncodigoRetencionInvenBusquedaActionPerformed(evt);
			}
			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRetencionInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRetencionInven")) {
				closingInternalFrameRetencionInven();
				
			} else if(sTipo.equals("jButtonCancelarRetencionInven")) {
				JInternalFrameBase jInternalFrameDetalleFormRetencionInven = (JInternalFrameBase)evt.getSource();
	            	
	            RetencionInvenBeanSwingJInternalFrame jInternalFrameParent=(RetencionInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormRetencionInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRetencionInvenActionPerformed(null);
			}
			
			RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.retencioninven,new Object(),this.retencioninvenParameterGeneral,this.retencioninvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRetencionInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRetencionInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRetencionInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.retencioninven)) {
			if(!esControlTabla) {
				if(RetencionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);			
				}
				
				if(this.retencioninvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRetencionInven(this.retencioninven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.retencioninvenReturnGeneral=retencioninvenLogic.procesarEventosRetencionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencioninvenLogic.getRetencionInvens(),this.retencioninven,this.retencioninvenParameterGeneral,this.isEsNuevoRetencionInven,classes);//this.retencioninvenLogic.getRetencionInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRetencionInven(this.retencioninvenReturnGeneral,this.retencioninvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.retencioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRetencionInven(classes,this.retencioninvenReturnGeneral,this.retencioninvenBean,false);
					}
						
					if(this.retencioninvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRetencionInven(this.retencioninvenReturnGeneral.getRetencionInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRetencionInven(this.retencioninvenReturnGeneral.getRetencionInven());	
					}
						
					if(this.retencioninvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRetencionInven(this.retencioninvenReturnGeneral.getRetencionInven(),classes);//this.retencioninvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRetencionInven(this.retencioninven,classes);//this.retencioninvenBean);									
				}
			
				if(RetencionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRetencionInven(this.retencioninven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionInven(this.retencioninven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.retencioninvenAnterior!=null) {
						this.retencioninven=this.retencioninvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.retencioninvenReturnGeneral=retencioninvenLogic.procesarEventosRetencionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencioninvenLogic.getRetencionInvens(),this.retencioninven,this.retencioninvenParameterGeneral,this.isEsNuevoRetencionInven,classes);//this.retencioninvenLogic.getRetencionInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.retencioninvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.retencioninvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.retencioninvenReturnGeneral.getRetencionInven(),retencioninvenLogic.getRetencionInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.retencioninvenReturnGeneral.getRetencionInven(),this.retencioninvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRetencionInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosRetencionInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRetencionInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosRetencionInven() throws Exception {
		
		RetencionInvenModel retencioninvenModel=(RetencionInvenModel)this.jTableDatosRetencionInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencioninvenModel.retencioninvens=this.retencioninvenLogic.getRetencionInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			retencioninvenModel.retencioninvens=this.retencioninvens;
		}
		
		
		((RetencionInvenModel) this.jTableDatosRetencionInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRetencionInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getretencioninvenAnterior(),this.retencioninvenLogic.getRetencionInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getretencioninvenAnterior(),this.retencioninvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRetencionInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRetencionInven(RetencionInven retencioninven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
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
										
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencioninven,new Object(),generalEntityParameterGeneral,this.retencioninvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.retencioninvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RetencionInvenConstantesFunciones.getClassesRelationshipsOfRetencionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RetencionInvenConstantesFunciones.getClassesRelationshipsFromStringsOfRetencionInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRetencionInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RetencionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencioninven,new Object(),generalEntityParameterGeneral,this.retencioninvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRetencionInven(RetencionInvenBean retencioninvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRetencionInven(ArrayList<Classe> classes,RetencionInvenReturnGeneral retencioninvenReturnGeneral,RetencionInvenBean retencioninvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRetencionInven(RetencionInven retencioninven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.retencioninven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRetencionInven = new RetencionInvenDetalleFormJInternalFrame(jDesktopPane,this.retencioninvenSessionBean.getConGuardarRelaciones(),this.retencioninvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.setVisible(false);
		this.jInternalFrameDetalleFormRetencionInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormRetencionInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRetencionInven.retencioninvenLogic=this.retencioninvenLogic;
		
		this.cargarCombosFrameForeignKeyRetencionInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRetencionInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRetencionInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRetencionInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRetencionInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRetencionInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRetencionInven"));
		
		this.jInternalFrameDetalleFormRetencionInven.jButtonModificarRetencionInven.addActionListener(new ButtonActionListener(this,"ModificarRetencionInven"));

		
		this.jInternalFrameDetalleFormRetencionInven.jButtonModificarToolBarRetencionInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarRetencionInven"));
					
		this.jInternalFrameDetalleFormRetencionInven.jMenuItemModificarRetencionInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarRetencionInven"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionInven.jButtonActualizarRetencionInven.addActionListener (new ButtonActionListener(this,"ActualizarRetencionInven"));
		
		
		this.jInternalFrameDetalleFormRetencionInven.jButtonActualizarToolBarRetencionInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRetencionInven"));
						
		this.jInternalFrameDetalleFormRetencionInven.jMenuItemActualizarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRetencionInven"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionInven.jButtonEliminarRetencionInven.addActionListener (new ButtonActionListener(this,"EliminarRetencionInven"));
		
		
		this.jInternalFrameDetalleFormRetencionInven.jButtonEliminarToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarRetencionInven"));
								
		this.jInternalFrameDetalleFormRetencionInven.jMenuItemEliminarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRetencionInven"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionInven.jButtonCancelarRetencionInven.addActionListener (new ButtonActionListener(this,"CancelarRetencionInven"));
		
		
		this.jInternalFrameDetalleFormRetencionInven.jButtonCancelarToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarRetencionInven"));
					
		this.jInternalFrameDetalleFormRetencionInven.jMenuItemCancelarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRetencionInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRetencionInven.jMenuItemDetalleCerrarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRetencionInven"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionInven"));
		
		
		
		this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionInven"));
		
		
		
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRetencionInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonidRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_empresaRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_empresaRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_sucursalRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_sucursalRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_ejercicioRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_ejercicioRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_periodoRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_periodoRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_periodoRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_compraRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_compraRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_compraRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_compraRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_tipo_retencionRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_tipo_retencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonporcentajeRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonbase_imponibleRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonretencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"retencionRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonnumero_retencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionRetencionInvenBusqueda"));
		//jButtonid_cuenta_contableRetencionInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableRetencionInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInven"));
		//jButtonid_cuenta_contableRetencionInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_anioRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_anioRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_anioRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_anioRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_mesRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mesRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_mesRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mesRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonnumero_serie_retencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_serie_retencionRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtoncodigoRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoRetencionInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRetencionInven.jTabbedPaneRelacionesRetencionInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRetencionInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRetencionInven"));
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRetencionInven"));
		}
		
		this.jTableDatosRetencionInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRetencionInven"));
		
		this.jTableDatosRetencionInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRetencionInven"));
		
		this.jButtonNuevoRetencionInven.addActionListener(new ButtonActionListener(this,"NuevoRetencionInven"));
		
		this.jButtonDuplicarRetencionInven.addActionListener(new ButtonActionListener(this,"DuplicarRetencionInven"));
		
		this.jButtonCopiarRetencionInven.addActionListener(new ButtonActionListener(this,"CopiarRetencionInven"));
		
		this.jButtonVerFormRetencionInven.addActionListener(new ButtonActionListener(this,"VerFormRetencionInven"));
		
		
		this.jButtonNuevoToolBarRetencionInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarRetencionInven"));
			
		this.jButtonDuplicarToolBarRetencionInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRetencionInven"));
			
		this.jMenuItemNuevoRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRetencionInven"));
			
		this.jMenuItemDuplicarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRetencionInven"));		
		
		
		this.jButtonNuevoRelacionesRetencionInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRetencionInven"));
		
		
		this.jButtonNuevoRelacionesToolBarRetencionInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRetencionInven"));
			
		this.jMenuItemNuevoRelacionesRetencionInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRetencionInven"));		
		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonModificarRetencionInven.addActionListener(new ButtonActionListener(this,"ModificarRetencionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonModificarToolBarRetencionInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarRetencionInven"));
			
			this.jInternalFrameDetalleFormRetencionInven.jMenuItemModificarRetencionInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarRetencionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRetencionInven.jButtonActualizarRetencionInven.addActionListener (new ButtonActionListener(this,"ActualizarRetencionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonActualizarToolBarRetencionInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRetencionInven"));
				
			this.jInternalFrameDetalleFormRetencionInven.jMenuItemActualizarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRetencionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonEliminarRetencionInven.addActionListener (new ButtonActionListener(this,"EliminarRetencionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonEliminarToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarRetencionInven"));
						
			this.jInternalFrameDetalleFormRetencionInven.jMenuItemEliminarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRetencionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonCancelarRetencionInven.addActionListener (new ButtonActionListener(this,"CancelarRetencionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonCancelarToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarRetencionInven"));
			
			this.jInternalFrameDetalleFormRetencionInven.jMenuItemCancelarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRetencionInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRetencionInven"));		
		
		
		this.jButtonCerrarRetencionInven.addActionListener (new ButtonActionListener(this,"CerrarRetencionInven"));
		
		
		this.jButtonCerrarToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarRetencionInven"));
			
		this.jMenuItemCerrarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRetencionInven"));
			
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jMenuItemDetalleCerrarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRetencionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosRetencionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosRetencionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionInven"));
		}
		
		this.jButtonCopiarToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarRetencionInven"));
			
		this.jButtonVerFormToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarRetencionInven"));
		
		this.jMenuItemGuardarCambiosRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRetencionInven"));
			
		this.jMenuItemCopiarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRetencionInven"));		
		
		this.jMenuItemVerFormRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRetencionInven"));		
		
		
		this.jButtonGuardarCambiosTablaRetencionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRetencionInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRetencionInven"));
			
		this.jMenuItemGuardarCambiosTablaRetencionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRetencionInven"));		
		
		
		
		this.jButtonRecargarInformacionRetencionInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionRetencionInven"));
					
		this.jButtonRecargarInformacionToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRetencionInven"));
		
		this.jMenuItemRecargarInformacionRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRetencionInven"));		
		
		
		
		this.jButtonAnterioresRetencionInven.addActionListener (new ButtonActionListener(this,"AnterioresRetencionInven"));
		
		
		this.jButtonAnterioresToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRetencionInven"));
		
		this.jMenuItemAnterioresRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRetencionInven"));		
		
		
		this.jButtonSiguientesRetencionInven.addActionListener (new ButtonActionListener(this,"SiguientesRetencionInven"));
		
		
		this.jButtonSiguientesToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRetencionInven"));
			
		this.jMenuItemSiguientesRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRetencionInven"));
			
		this.jMenuItemAbrirOrderByRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRetencionInven"));
			
		this.jMenuItemMostrarOcultarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRetencionInven"));
			
		this.jMenuItemDetalleAbrirOrderByRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRetencionInven"));
			
		this.jMenuItemDetalleMostarOcultarRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRetencionInven"));		
		
		
		this.jButtonNuevoGuardarCambiosRetencionInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRetencionInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRetencionInven"));
			
		this.jMenuItemNuevoGuardarCambiosRetencionInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRetencionInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRetencionInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRetencionInven"));

		this.jCheckBoxSeleccionadosRetencionInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRetencionInven"));
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRetencionInven"));
		}
		
		
		this.jComboBoxTiposRelacionesRetencionInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesRetencionInven"));
			
		this.jComboBoxTiposAccionesRetencionInven.addActionListener (new ButtonActionListener(this,"TiposAccionesRetencionInven"));
					
		this.jComboBoxTiposSeleccionarRetencionInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRetencionInven"));
			
		this.jTextFieldValorCampoGeneralRetencionInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRetencionInven"));		
		
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonidRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_empresaRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_empresaRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_sucursalRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_sucursalRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_ejercicioRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_ejercicioRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_periodoRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_periodoRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_periodoRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_compraRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_compraRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_compraRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_compraRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_tipo_retencionRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_tipo_retencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonporcentajeRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonbase_imponibleRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonretencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"retencionRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonnumero_retencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionRetencionInvenBusqueda"));
		//jButtonid_cuenta_contableRetencionInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableRetencionInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInven"));
		//jButtonid_cuenta_contableRetencionInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_anioRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_anioRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_anioRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_anioRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_mesRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mesRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_mesRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mesRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonnumero_serie_retencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_serie_retencionRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtoncodigoRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoRetencionInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCompraRetencionInven.addActionListener(new ButtonActionListener(this,"FK_IdCompraRetencionInven"));

			this.jButtonFK_IdCuentaContableRetencionInven.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableRetencionInven"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableRetencionInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInven"));

			this.jButtonFK_IdTipoRetencionRetencionInven.addActionListener(new ButtonActionListener(this,"FK_IdTipoRetencionRetencionInven"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRetencionInven!=null) {
				this.jInternalFrameReporteDinamicoRetencionInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionInven"));
				this.jInternalFrameReporteDinamicoRetencionInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionInven"));
				this.jInternalFrameReporteDinamicoRetencionInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoRetencionInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionInven"));				
			//this.jButtonGenerarReporteDinamicoRetencionInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionInven"));
			//this.jButtonGenerarExcelReporteDinamicoRetencionInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRetencionInven!=null) {
				this.jInternalFrameImportacionRetencionInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRetencionInven"));
				this.jInternalFrameImportacionRetencionInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRetencionInven"));
				this.jInternalFrameImportacionRetencionInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRetencionInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRetencionInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByRetencionInven"));
			
			this.jButtonAbrirOrderByToolBarRetencionInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRetencionInven"));			
			
			if(this.jInternalFrameOrderByRetencionInven!=null) {
				this.jInternalFrameOrderByRetencionInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRetencionInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRetencionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionInven.jTabbedPaneRelacionesRetencionInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRetencionInven"));
		
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
            		closingInternalFrameRetencionInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRetencionInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRetencionInven = (JInternalFrameBase)event.getSource();
	            	
	            RetencionInvenBeanSwingJInternalFrame jInternalFrameParent=(RetencionInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormRetencionInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRetencionInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRetencionInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRetencionInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRetencionInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRetencionInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRetencionInven";
		inputMap = this.jButtonNuevoRetencionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRetencionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRetencionInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRetencionInven";
		inputMap = this.jButtonNuevoRelacionesRetencionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRetencionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRetencionInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRetencionInven";
		inputMap = this.jButtonModificarRetencionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRetencionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRetencionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRetencionInven";
		inputMap = this.jButtonActualizarRetencionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRetencionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRetencionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRetencionInven";
		inputMap = this.jButtonEliminarRetencionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRetencionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRetencionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRetencionInven";
		inputMap = this.jButtonCancelarRetencionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRetencionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRetencionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRetencionInven";
		inputMap = this.jButtonCerrarRetencionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRetencionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRetencionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRetencionInven";
		inputMap = this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosRetencionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRetencionInven.jButtonGuardarCambiosRetencionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRetencionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRetencionInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRetencionInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRetencionInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRetencionInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRetencionInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRetencionInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRetencionInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRetencionInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonidRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_empresaRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_empresaRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_sucursalRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_sucursalRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_ejercicioRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_ejercicioRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_periodoRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_periodoRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_periodoRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_compraRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_compraRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_compraRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_compraRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_tipo_retencionRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_tipo_retencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonporcentajeRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonbase_imponibleRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonretencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"retencionRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonnumero_retencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionRetencionInvenBusqueda"));
		//jButtonid_cuenta_contableRetencionInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableRetencionInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInven"));
		//jButtonid_cuenta_contableRetencionInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_anioRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_anioRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_anioRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_anioRetencionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_mesRetencionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mesRetencionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonid_mesRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mesRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtonnumero_serie_retencionRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_serie_retencionRetencionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionInven.jButtoncodigoRetencionInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoRetencionInvenBusqueda"));
		
		
		this.jButtonFK_IdCompraRetencionInven.addActionListener(new ButtonActionListener(this,"FK_IdCompraRetencionInven"));

		this.jButtonFK_IdCuentaContableRetencionInven.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableRetencionInven"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableRetencionInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRetencionInven"));

		this.jButtonFK_IdTipoRetencionRetencionInven.addActionListener(new ButtonActionListener(this,"FK_IdTipoRetencionRetencionInven"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRetencionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRetencionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRetencionInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRetencionInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRetencionInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RetencionInven retencioninvenAux:this.retencioninvenLogic.getRetencionInvens()) {
					retencioninvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionInven retencioninvenAux:retencioninvens) {
					retencioninvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRetencionInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRetencionInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RetencionInven retencioninvenAux:this.retencioninvenLogic.getRetencionInvens()) {
						retencioninvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionInven retencioninvenAux:retencioninvens) {
						retencioninvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RetencionInven retencioninvenAux:this.retencioninvenLogic.getRetencionInvens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionInven retencioninvenAux:retencioninvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRetencionInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRetencionInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRetencionInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRetencionInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRetencionInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRetencionInven.getSelectedRows();
			
			RetencionInven retencioninvenLocal=new RetencionInven();
			
			//this.seleccionarTodosRetencionInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencioninvenLocal =(RetencionInven) this.retencioninvenLogic.getRetencionInvens().toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					retencioninvenLocal =(RetencionInven) this.retencioninvens.toArray()[this.jTableDatosRetencionInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				retencioninvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RetencionInven retencioninvenAux:this.retencioninvenLogic.getRetencionInvens()) {
						retencioninvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionInven retencioninvenAux:retencioninvens) {
						retencioninvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRetencionInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRetencionInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRetencionInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRetencionInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRetencionInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRetencionInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRetencionInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRetencionInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRetencionInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RetencionInven retencioninvenAux:this.retencioninvenLogic.getRetencionInvens()) {
				
						if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							retencioninvenAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							retencioninvenAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_RETENCION)) {
							existe=true;
							retencioninvenAux.setretencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION)) {
							existe=true;
							retencioninvenAux.setnumero_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION)) {
							existe=true;
							retencioninvenAux.setnumero_serie_retencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							retencioninvenAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionInven retencioninvenAux:retencioninvens) {
					
						if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							retencioninvenAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							retencioninvenAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_RETENCION)) {
							existe=true;
							retencioninvenAux.setretencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION)) {
							existe=true;
							retencioninvenAux.setnumero_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION)) {
							existe=true;
							retencioninvenAux.setnumero_serie_retencion(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							retencioninvenAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRetencionInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRetencionInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRetencionInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRetencionInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRetencionInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRetencionInven) {				
					conSplash=true;//false;										
					
					//this.startProcessRetencionInven(conSplash);
				
					this.generarReporteRetencionInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRetencionInvensSeleccionados();
				//this.jComboBoxTiposAccionesRetencionInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRetencionInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesRetencionInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRetencionInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesRetencionInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRetencionInven();
				
				this.exportarRetencionInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRetencionInvens();
				//this.importarRetencionInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRetencionInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRetencionInvensSeleccionados();
				//this.jComboBoxTiposAccionesRetencionInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRetencionInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRetencionInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRetencionInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Retencion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.setSelectedIndex(0);					
				}	
			} 			
			else if(RetencionInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRetencionInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRetencionInven(conSplash);
					
						//this.actualizarParametrosGeneralRetencionInven();
						
						this.generarReporteProcesoAccionRetencionInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRetencionInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RetencionInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO RetencionES SELECCIONADOS?", "MANTENIMIENTO DE Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRetencionInven();
				
						this.actualizarParametrosGeneralRetencionInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.retencioninvenReturnGeneral=retencioninvenLogic.procesarAccionRetencionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.retencioninvenLogic.getRetencionInvens(),this.retencioninvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRetencionInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRetencionInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRetencionInven();
					
					RetencionInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRetencionInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRetencionInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRetencionInven.jComboBoxTiposAccionesFormularioRetencionInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRetencionInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRetencionInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRetencionInven();
			
			if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();		
			RetencionInven retencioninven=new RetencionInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRetencionInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRetencionInven.getSelectedItem();
			
			
			
			
			retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(retencioninvensSeleccionados.size()==1) {
				for(RetencionInven retencioninvenAux:retencioninvensSeleccionados) {
					retencioninven=retencioninvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRetencionInven();
			
      		//this.finishProcessRetencionInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRetencionInvenReturnGeneral() throws Exception {
		if(this.retencioninvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.retencioninvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.retencioninvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.retencioninvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.retencioninvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.retencioninvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRetencionInven(false);
		}
		
		if(this.retencioninvenReturnGeneral.getConRetornoLista() || this.retencioninvenReturnGeneral.getConRetornoObjeto()) {
			if(this.retencioninvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.retencioninvenLogic.setRetencionInvens(this.retencioninvenReturnGeneral.getRetencionInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.retencioninvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.retencioninvenLogic.setRetencionInven(this.retencioninvenReturnGeneral.getRetencionInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRetencionInven(false);
		}
	}
	
	public void actualizarParametrosGeneralRetencionInven() throws Exception {
		
		
	}
	
	public ArrayList<RetencionInven> getRetencionInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRetencionInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RetencionInven retencioninvenAux:retencioninvenLogic.getRetencionInvens()) {
					if(retencioninvenAux.getIsSelected()) {
						retencioninvensSeleccionados.add(retencioninvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionInven retencioninvenAux:this.retencioninvens) {
					if(retencioninvenAux.getIsSelected()) {
						retencioninvensSeleccionados.add(retencioninvenAux);				
					}
				}
			}
			
			if(retencioninvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						retencioninvensSeleccionados.addAll(this.retencioninvenLogic.getRetencionInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						retencioninvensSeleccionados.addAll(this.retencioninvens);				
					}
				}
			}
		} else {
			retencioninvensSeleccionados.add(this.retencioninven);
		}
		
		return retencioninvensSeleccionados;
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
	
	public void generarReporteRetencionInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRetencionInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRetencionInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRetencionInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRetencionInvensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRetencionInvensSeleccionados() throws Exception {
		ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();		
		
		retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRetencionInvens("Todos",retencioninvensSeleccionados);
		
	}	
	
	public void generarReporteNormalRetencionInvensSeleccionados() throws Exception {
		ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();		
		
		retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRetencionInvens("Todos",retencioninvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRetencionInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();
		
		retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRetencionInvens("Todos",retencioninvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRetencionInvensSeleccionados() throws Exception {
		ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRetencionInven();
		
		
		retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRetencionInven();
		
		
		//this.generarReporteRetencionInvens("Todos",retencioninvensSeleccionados ,retencioninvenImplementable,retencioninvenImplementableHome);
	}
	
	public void mostrarImportacionRetencionInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRetencionInven();
		
		this.abrirFrameImportacionRetencionInven();		
		
			
		//this.generarReporteRetencionInvens("Todos",retencioninvensSeleccionados ,retencioninvenImplementable,retencioninvenImplementableHome);
	}
	
	public void importarRetencionInvens() throws Exception {		
	
	}
	
	public void exportarRetencionInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRetencionInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRetencionInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRetencionInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRetencionInvensSeleccionados() throws Exception {
		ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();		
		
		retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencioninven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRetencionInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RetencionInven retencioninvenAux:retencioninvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRetencionInven(retencioninvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//retencioninvenAux.setsDetalleGeneralEntityReporte(retencioninvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRetencionInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_IDCOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_RETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionInvenConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRetencionInven(RetencionInven retencioninven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=retencioninven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getcompra_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.gettiporetencion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getbase_imponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getretencion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getnumero_retencion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getnumero_serie_retencion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencioninven.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRetencionInvensSeleccionados() throws Exception {
		ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();		
		
		retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencioninven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RetencionInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRetencionInven(row);				
				iRow++;
			}				
			
			for(RetencionInven retencioninvenAux:retencioninvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRetencionInven(retencioninvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRetencionInvensSeleccionados() throws Exception {
		ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();		
		
		retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencioninven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("retencioninvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("retencioninven");
			//elementRoot.appendChild(element);
		
			for(RetencionInven retencioninvenAux:retencioninvensSeleccionados) {
				element = document.createElement("retencioninven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRetencionInven(retencioninvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRetencionInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDCOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_BASEIMPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_RETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_NUMEROSERIERETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionInvenConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRetencionInven(RetencionInven retencioninven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getcompra_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.gettiporetencion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getbase_imponible());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getretencion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getnumero_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getnumero_serie_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencioninven.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlRetencionInven(RetencionInven retencioninven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RetencionInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(retencioninven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RetencionInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(retencioninven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RetencionInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(retencioninven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(RetencionInvenConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(retencioninven.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(RetencionInvenConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(retencioninven.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(RetencionInvenConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(retencioninven.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementcompra_descripcion = document.createElement(RetencionInvenConstantesFunciones.IDCOMPRA);
		elementcompra_descripcion.appendChild(document.createTextNode(retencioninven.getcompra_descripcion()));
		element.appendChild(elementcompra_descripcion);

		Element elementtiporetencion_descripcion = document.createElement(RetencionInvenConstantesFunciones.IDTIPORETENCION);
		elementtiporetencion_descripcion.appendChild(document.createTextNode(retencioninven.gettiporetencion_descripcion()));
		element.appendChild(elementtiporetencion_descripcion);

		Element elementporcentaje = document.createElement(RetencionInvenConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(retencioninven.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementbase_imponible = document.createElement(RetencionInvenConstantesFunciones.BASEIMPONIBLE);
		elementbase_imponible.appendChild(document.createTextNode(retencioninven.getbase_imponible().toString().trim()));
		element.appendChild(elementbase_imponible);

		Element elementretencion = document.createElement(RetencionInvenConstantesFunciones.RETENCION);
		elementretencion.appendChild(document.createTextNode(retencioninven.getretencion().toString().trim()));
		element.appendChild(elementretencion);

		Element elementnumero_retencion = document.createElement(RetencionInvenConstantesFunciones.NUMERORETENCION);
		elementnumero_retencion.appendChild(document.createTextNode(retencioninven.getnumero_retencion().trim()));
		element.appendChild(elementnumero_retencion);

		Element elementcuentacontable_descripcion = document.createElement(RetencionInvenConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(retencioninven.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementanio_descripcion = document.createElement(RetencionInvenConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(retencioninven.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(RetencionInvenConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(retencioninven.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementnumero_serie_retencion = document.createElement(RetencionInvenConstantesFunciones.NUMEROSERIERETENCION);
		elementnumero_serie_retencion.appendChild(document.createTextNode(retencioninven.getnumero_serie_retencion().toString().trim()));
		element.appendChild(elementnumero_serie_retencion);

		Element elementcodigo = document.createElement(RetencionInvenConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(retencioninven.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoRetencionInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RetencionInven> retencioninvensSeleccionados=new ArrayList<RetencionInven>();
		
		retencioninvensSeleccionados=this.getRetencionInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRetencionInven(retencioninvensSeleccionados);
		
		this.generarReporteRetencionInvens("Todos",retencioninvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRetencionInven(ArrayList<RetencionInven> retencioninvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RetencionInven retencioninvenAux:retencioninvensSeleccionados) {
				retencioninvenAux.setsDetalleGeneralEntityReporte(retencioninvenAux.toString());
			
				if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					retencioninvenAux.setsDescripcionGeneralEntityReporte1(retencioninvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					retencioninvenAux.setsDescripcionGeneralEntityReporte1(retencioninvenAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					retencioninvenAux.setsDescripcionGeneralEntityReporte1(retencioninvenAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					retencioninvenAux.setsDescripcionGeneralEntityReporte1(retencioninvenAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_IDCOMPRA)) {
					existe=true;
					retencioninvenAux.setsDescripcionGeneralEntityReporte1(retencioninvenAux.getcompra_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_IDTIPORETENCION)) {
					existe=true;
					retencioninvenAux.setsDescripcionGeneralEntityReporte1(retencioninvenAux.gettiporetencion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_NUMERORETENCION)) {
					existe=true;
					retencioninvenAux.setsDescripcionGeneralEntityReporte1(retencioninvenAux.getnumero_retencion());
				}
				 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					retencioninvenAux.setsDescripcionGeneralEntityReporte1(retencioninvenAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					retencioninvenAux.setsDescripcionGeneralEntityReporte1(retencioninvenAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					retencioninvenAux.setsDescripcionGeneralEntityReporte1(retencioninvenAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionInvenConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					retencioninvenAux.setsDescripcionGeneralEntityReporte1(retencioninvenAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRetencionInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRetencionInven=true;
				this.isVisibilidadCeldaNuevoRelacionesRetencionInven=true;
				this.isVisibilidadCeldaGuardarCambiosRetencionInven=true;
			}
			
			this.isVisibilidadCeldaModificarRetencionInven=false;
			this.isVisibilidadCeldaActualizarRetencionInven=false;
			this.isVisibilidadCeldaEliminarRetencionInven=false;
			this.isVisibilidadCeldaCancelarRetencionInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRetencionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=false;
			this.isVisibilidadCeldaModificarRetencionInven=false;
			this.isVisibilidadCeldaActualizarRetencionInven=true;
			this.isVisibilidadCeldaEliminarRetencionInven=false;
			this.isVisibilidadCeldaCancelarRetencionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRetencionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=false;
			this.isVisibilidadCeldaModificarRetencionInven=false;
			this.isVisibilidadCeldaActualizarRetencionInven=true;
			this.isVisibilidadCeldaEliminarRetencionInven=true;
			this.isVisibilidadCeldaCancelarRetencionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRetencionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=false;
			this.isVisibilidadCeldaModificarRetencionInven=false;
			this.isVisibilidadCeldaActualizarRetencionInven=true;
			this.isVisibilidadCeldaEliminarRetencionInven=false;
			this.isVisibilidadCeldaCancelarRetencionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionInven=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRetencionInven=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=true;
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=true;
			this.isVisibilidadCeldaModificarRetencionInven=false;
			this.isVisibilidadCeldaActualizarRetencionInven=false;
			this.isVisibilidadCeldaEliminarRetencionInven=false;
			this.isVisibilidadCeldaCancelarRetencionInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRetencionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=false;
			this.isVisibilidadCeldaActualizarRetencionInven=false;
			this.isVisibilidadCeldaEliminarRetencionInven=false;
			this.isVisibilidadCeldaCancelarRetencionInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionInven=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRetencionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=false;
			this.isVisibilidadCeldaModificarRetencionInven=true;
			this.isVisibilidadCeldaActualizarRetencionInven=false;
			this.isVisibilidadCeldaEliminarRetencionInven=false;
			this.isVisibilidadCeldaCancelarRetencionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionInven=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RetencionInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRetencionInven=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=true;
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=true;
		} else {
			this.actualizarEstadoPanelsRetencionInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRetencionInven=false;
			//this.isVisibilidadCeldaVerFormRetencionInven=false;
			this.isVisibilidadCeldaDuplicarRetencionInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!retencioninvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=false;
		} else {
			this.isVisibilidadCeldaNuevoRetencionInven=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(retencioninvenSessionBean.getEsGuardarRelacionado()) {
			if(!retencioninvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRetencionInven=false;												
			}
			
			this.jButtonCerrarRetencionInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRetencionInven=false;
		}
		
		if(!this.permiteMantenimiento(this.retencioninven)) {
			this.isVisibilidadCeldaActualizarRetencionInven=false;
			this.isVisibilidadCeldaEliminarRetencionInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRetencionInven() {
	}
	
	public void actualizarEstadoPanelsRetencionInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRetencionInven!=null) {
				this.jScrollPanelDatosEdicionRetencionInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionInven!=null) {
				this.jTabbedPaneBusquedasRetencionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionInven!=null) {
				this.jScrollPanelDatosRetencionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionInven!=null) {
				this.jPanelPaginacionRetencionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionInven!=null) {
				this.jPanelParametrosReportesRetencionInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRetencionInven!=null) {
				this.jScrollPanelDatosEdicionRetencionInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionInven!=null) {
				this.jTabbedPaneBusquedasRetencionInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRetencionInven!=null) {
				this.jScrollPanelDatosRetencionInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionInven!=null) {
				this.jPanelPaginacionRetencionInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionInven!=null) {
				this.jPanelParametrosReportesRetencionInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRetencionInven!=null) {
				this.jScrollPanelDatosEdicionRetencionInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionInven!=null) {
				this.jTabbedPaneBusquedasRetencionInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRetencionInven!=null) {
				this.jScrollPanelDatosRetencionInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionInven!=null) {
				this.jPanelPaginacionRetencionInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionInven!=null) {
				this.jPanelParametrosReportesRetencionInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRetencionInven!=null) {
				this.jScrollPanelDatosEdicionRetencionInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionInven!=null) {
				this.jTabbedPaneBusquedasRetencionInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRetencionInven!=null) {
				this.jScrollPanelDatosRetencionInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionInven!=null) {
				this.jPanelPaginacionRetencionInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionInven!=null) {
				this.jPanelParametrosReportesRetencionInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRetencionInven!=null) {
				this.jScrollPanelDatosEdicionRetencionInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionInven!=null) {
				this.jTabbedPaneBusquedasRetencionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionInven!=null) {
				this.jScrollPanelDatosRetencionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionInven!=null) {
				this.jPanelPaginacionRetencionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionInven!=null) {
				this.jPanelParametrosReportesRetencionInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRetencionInven!=null) {
				this.jScrollPanelDatosEdicionRetencionInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionInven!=null) {
				this.jTabbedPaneBusquedasRetencionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionInven!=null) {
				this.jScrollPanelDatosRetencionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionInven!=null) {
				this.jPanelPaginacionRetencionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionInven!=null) {
				this.jPanelParametrosReportesRetencionInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRetencionInven!=null) {
				this.jScrollPanelDatosEdicionRetencionInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionInven!=null) {
				this.jTabbedPaneBusquedasRetencionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionInven!=null) {
				this.jScrollPanelDatosRetencionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionInven!=null) {
				this.jPanelPaginacionRetencionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionInven!=null) {
				this.jPanelParametrosReportesRetencionInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRetencionInven!=null) {
					this.jTabbedPaneBusquedasRetencionInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRetencionInven!=null) {
				this.jPanelParametrosReportesRetencionInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionInven!=null) {
				this.jTabbedPaneBusquedasRetencionInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRetencionInven!=null) {
				this.jPanelParametrosReportesRetencionInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCompra=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCompraRetencionInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCuentaContableRetencionInven);}

			this.isVisibilidadFK_IdTipoRetencion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdTipoRetencionRetencionInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCompra=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCompraRetencionInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCuentaContableRetencionInven);}

			this.isVisibilidadFK_IdTipoRetencion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdTipoRetencionRetencionInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCompra=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCompraRetencionInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCuentaContableRetencionInven);}

			this.isVisibilidadFK_IdTipoRetencion=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdTipoRetencionRetencionInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdCompra=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCompraRetencionInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCuentaContableRetencionInven);}

			this.isVisibilidadFK_IdTipoRetencion=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdTipoRetencionRetencionInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaCompra(Boolean isParaCompra){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCompraNegation=!isParaCompra;

			this.isVisibilidadFK_IdCompra=isParaCompra;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCompraRetencionInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaCompraNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCuentaContableRetencionInven);}

			this.isVisibilidadFK_IdTipoRetencion=isParaCompraNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdTipoRetencionRetencionInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRetencion(Boolean isParaTipoRetencion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRetencionNegation=!isParaTipoRetencion;

			this.isVisibilidadFK_IdCompra=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCompraRetencionInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCuentaContableRetencionInven);}

			this.isVisibilidadFK_IdTipoRetencion=isParaTipoRetencion;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdTipoRetencionRetencionInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCompra=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCompraRetencionInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCuentaContableRetencionInven);}

			this.isVisibilidadFK_IdTipoRetencion=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdTipoRetencionRetencionInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdCompra=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCompraRetencionInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCuentaContableRetencionInven);}

			this.isVisibilidadFK_IdTipoRetencion=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdTipoRetencionRetencionInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdCompra=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCompraRetencionInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdCuentaContableRetencionInven);}

			this.isVisibilidadFK_IdTipoRetencion=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionInven.remove(jPanelFK_IdTipoRetencionRetencionInven);}
		}
		
	}
	
	
	
	

	public String registrarSesionRetencionInvenParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(retencioninvenSessionBean==null) {
				retencioninvenSessionBean=new RetencionInvenSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(retencioninvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.retencioninvenFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(RetencionInvenConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionRetencionInven(true);
			//cuentacontableSessionBean.setlidRetencionInvenActual(this.idRetencionInvenActual);

			retencioninvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRetencionInven(true);
			retencioninvenSessionBean.setlIdRetencionInvenActualForeignKey(this.idRetencionInvenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RetencionInvenSessionBean retencioninvenSessionBean=new RetencionInvenSessionBean();
		
		if(this.retencioninvenSessionBean==null) {
			this.retencioninvenSessionBean=new RetencionInvenSessionBean();
		}
		
		this.retencioninvenSessionBean.setsUltimaBusquedaRetencionInven(this.getsAccionBusqueda());
		this.retencioninvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.retencioninvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCompra")) {
			retencioninvenSessionBean.setid_compra(this.getid_compraFK_IdCompra());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			retencioninvenSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			retencioninvenSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			retencioninvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			retencioninvenSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			retencioninvenSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoRetencion")) {
			retencioninvenSessionBean.setid_tipo_retencion(this.getid_tipo_retencionFK_IdTipoRetencion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RetencionInvenSessionBean retencioninvenSessionBean=new RetencionInvenSessionBean();
		
		if(this.retencioninvenSessionBean==null) {
			this.retencioninvenSessionBean=new RetencionInvenSessionBean();
		}
		
		if(this.retencioninvenSessionBean.getsUltimaBusquedaRetencionInven()!=null&&!this.retencioninvenSessionBean.getsUltimaBusquedaRetencionInven().equals("")) {
			this.setsAccionBusqueda(retencioninvenSessionBean.getsUltimaBusquedaRetencionInven());
			this.setiNumeroPaginacion(retencioninvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(retencioninvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCompra")) {
				this.setid_compraFK_IdCompra(retencioninvenSessionBean.getid_compra());
				retencioninvenSessionBean.setid_compra(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(retencioninvenSessionBean.getid_cuenta_contable());
				retencioninvenSessionBean.setid_cuenta_contable(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(retencioninvenSessionBean.getid_ejercicio());
				retencioninvenSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(retencioninvenSessionBean.getid_empresa());
				retencioninvenSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(retencioninvenSessionBean.getid_periodo());
				retencioninvenSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(retencioninvenSessionBean.getid_sucursal());
				retencioninvenSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoRetencion")) {
				this.setid_tipo_retencionFK_IdTipoRetencion(retencioninvenSessionBean.getid_tipo_retencion());
				retencioninvenSessionBean.setid_tipo_retencion(-1L);
			}
		}
		
		this.retencioninvenSessionBean.setsUltimaBusquedaRetencionInven("");
		this.retencioninvenSessionBean.setiNumeroPaginacion(RetencionInvenConstantesFunciones.INUMEROPAGINACION);
		this.retencioninvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRetencionInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRetencionInven() {
		this.updateBorderResaltarBusquedasFormularioRetencionInven();
		this.updateVisibilidadBusquedasFormularioRetencionInven();
		this.updateHabilitarBusquedasFormularioRetencionInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioRetencionInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRetencionInven.getComponents().length>0) {
	

		if(this.retencioninvenConstantesFunciones.resaltarFK_IdCompraRetencionInven!=null) {
			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdCompraRetencionInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);
				jPanel.setBorder(this.retencioninvenConstantesFunciones.resaltarFK_IdCompraRetencionInven);
			}
		}

		if(this.retencioninvenConstantesFunciones.resaltarFK_IdCuentaContableRetencionInven!=null) {
			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdCuentaContableRetencionInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);
				jPanel.setBorder(this.retencioninvenConstantesFunciones.resaltarFK_IdCuentaContableRetencionInven);
			}
		}

		if(this.retencioninvenConstantesFunciones.resaltarFK_IdTipoRetencionRetencionInven!=null) {
			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdTipoRetencionRetencionInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);
				jPanel.setBorder(this.retencioninvenConstantesFunciones.resaltarFK_IdTipoRetencionRetencionInven);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRetencionInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRetencionInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdCompraRetencionInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.retencioninvenConstantesFunciones.mostrarFK_IdCompraRetencionInven);
			if(!this.retencioninvenConstantesFunciones.mostrarFK_IdCompraRetencionInven && index>-1) {
				this.jTabbedPaneBusquedasRetencionInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdCuentaContableRetencionInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.retencioninvenConstantesFunciones.mostrarFK_IdCuentaContableRetencionInven);
			if(!this.retencioninvenConstantesFunciones.mostrarFK_IdCuentaContableRetencionInven && index>-1) {
				this.jTabbedPaneBusquedasRetencionInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdTipoRetencionRetencionInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.retencioninvenConstantesFunciones.mostrarFK_IdTipoRetencionRetencionInven);
			if(!this.retencioninvenConstantesFunciones.mostrarFK_IdTipoRetencionRetencionInven && index>-1) {
				this.jTabbedPaneBusquedasRetencionInven.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRetencionInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRetencionInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdCompraRetencionInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.retencioninvenConstantesFunciones.activarFK_IdCompraRetencionInven);
				this.jTabbedPaneBusquedasRetencionInven.setEnabledAt(index,this.retencioninvenConstantesFunciones.activarFK_IdCompraRetencionInven);
			}

			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdCuentaContableRetencionInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.retencioninvenConstantesFunciones.activarFK_IdCuentaContableRetencionInven);
				this.jTabbedPaneBusquedasRetencionInven.setEnabledAt(index,this.retencioninvenConstantesFunciones.activarFK_IdCuentaContableRetencionInven);
			}

			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdTipoRetencionRetencionInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.retencioninvenConstantesFunciones.activarFK_IdTipoRetencionRetencionInven);
				this.jTabbedPaneBusquedasRetencionInven.setEnabledAt(index,this.retencioninvenConstantesFunciones.activarFK_IdTipoRetencionRetencionInven);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRetencionInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCompra")) {
			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdCompraRetencionInven);

			this.jTabbedPaneBusquedasRetencionInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);

			this.retencioninvenConstantesFunciones.setResaltarFK_IdCompraRetencionInven(resaltar);

			jPanel.setBorder(this.retencioninvenConstantesFunciones.resaltarFK_IdCompraRetencionInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdCuentaContableRetencionInven);

			this.jTabbedPaneBusquedasRetencionInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);

			this.retencioninvenConstantesFunciones.setResaltarFK_IdCuentaContableRetencionInven(resaltar);

			jPanel.setBorder(this.retencioninvenConstantesFunciones.resaltarFK_IdCuentaContableRetencionInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoRetencion")) {
			index= this.jTabbedPaneBusquedasRetencionInven.indexOfComponent(this.jPanelFK_IdTipoRetencionRetencionInven);

			this.jTabbedPaneBusquedasRetencionInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionInven.getComponent(index);

			this.retencioninvenConstantesFunciones.setResaltarFK_IdTipoRetencionRetencionInven(resaltar);

			jPanel.setBorder(this.retencioninvenConstantesFunciones.resaltarFK_IdTipoRetencionRetencionInven);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRetencionInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRetencionInven() throws Exception {

		if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRetencionInven();
		this.updateVisibilidadResaltarControlesFormularioRetencionInven();
		this.updateHabilitarResaltarControlesFormularioRetencionInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioRetencionInven() throws Exception {
		if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.retencioninvenConstantesFunciones.resaltaridRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jLabelidRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltaridRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarid_empresaRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarid_empresaRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarid_sucursalRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarid_sucursalRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarid_ejercicioRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarid_ejercicioRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarid_periodoRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarid_periodoRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarid_compraRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarid_compraRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarid_tipo_retencionRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarid_tipo_retencionRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarporcentajeRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jTextFieldporcentajeRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarporcentajeRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarbase_imponibleRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jTextFieldbase_imponibleRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarbase_imponibleRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarretencionRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jTextFieldretencionRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarretencionRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarnumero_retencionRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_retencionRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarnumero_retencionRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarid_cuenta_contableRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarid_cuenta_contableRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarid_anioRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarid_anioRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarid_mesRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarid_mesRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarnumero_serie_retencionRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_serie_retencionRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarnumero_serie_retencionRetencionInven);}
		if(this.retencioninvenConstantesFunciones.resaltarcodigoRetencionInven!=null && this.jInternalFrameDetalleFormRetencionInven!=null) {this.jInternalFrameDetalleFormRetencionInven.jTextFieldcodigoRetencionInven.setBorder(this.retencioninvenConstantesFunciones.resaltarcodigoRetencionInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRetencionInven() throws Exception {		
		if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) {
	
		//this.jInternalFrameDetalleFormRetencionInven.jLabelidRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostraridRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelidRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostraridRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_empresaRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelid_empresaRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_empresaRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_sucursalRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelid_sucursalRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_sucursalRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_ejercicioRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelid_ejercicioRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_ejercicioRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_periodoRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelid_periodoRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_periodoRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_compraRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelid_compraRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_compraRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_tipo_retencionRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelid_tipo_retencionRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_tipo_retencionRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jTextFieldporcentajeRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarporcentajeRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelporcentajeRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarporcentajeRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jTextFieldbase_imponibleRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarbase_imponibleRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelbase_imponibleRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarbase_imponibleRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jTextFieldretencionRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarretencionRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelretencionRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarretencionRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_retencionRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarnumero_retencionRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelnumero_retencionRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarnumero_retencionRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_cuenta_contableRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelid_cuenta_contableRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_cuenta_contableRetencionInven);
			this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_cuenta_contableRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_anioRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelid_anioRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_anioRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_mesRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelid_mesRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarid_mesRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_serie_retencionRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarnumero_serie_retencionRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelnumero_serie_retencionRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarnumero_serie_retencionRetencionInven);
		//this.jInternalFrameDetalleFormRetencionInven.jTextFieldcodigoRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarcodigoRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jPanelcodigoRetencionInven.setVisible(this.retencioninvenConstantesFunciones.mostrarcodigoRetencionInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRetencionInven() throws Exception {
		if(this.jInternalFrameDetalleFormRetencionInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRetencionInven!=null) {
	
		this.jInternalFrameDetalleFormRetencionInven.jLabelidRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activaridRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_empresaRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarid_empresaRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_sucursalRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarid_sucursalRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_ejercicioRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarid_ejercicioRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_periodoRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarid_periodoRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_compraRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarid_compraRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_tipo_retencionRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarid_tipo_retencionRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldporcentajeRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarporcentajeRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldbase_imponibleRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarbase_imponibleRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldretencionRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarretencionRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_retencionRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarnumero_retencionRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_cuenta_contableRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarid_cuenta_contableRetencionInven);
			this.jInternalFrameDetalleFormRetencionInven.jButtonid_cuenta_contableRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarid_cuenta_contableRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_anioRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarid_anioRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jComboBoxid_mesRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarid_mesRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldnumero_serie_retencionRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarnumero_serie_retencionRetencionInven);
		this.jInternalFrameDetalleFormRetencionInven.jTextFieldcodigoRetencionInven.setEnabled(this.retencioninvenConstantesFunciones.activarcodigoRetencionInven);
		}
	}
	
		
}