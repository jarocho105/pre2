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

import com.bydan.erp.facturacion.util.DetallePagoConstantesFunciones;
import com.bydan.erp.facturacion.util.DetallePagoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.DetallePagoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.DetallePagoBean;
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
public class DetallePagoBeanSwingJInternalFrame extends DetallePagoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetallePagoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetallePago> detallepagoValidator = new ClassValidator<DetallePago>(DetallePago.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetallePago detallepago;	
	public DetallePago detallepagoAux;
	public DetallePago detallepagoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetallePago detallepagoTotales;
	public Long idDetallePagoActual;
	public Long iIdNuevoDetallePago=0L;
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

	public String sFinalQueryComboAsientoContable="";

	public List<AsientoContable> asientocontablesForeignKey;

	public List<AsientoContable> getasientocontablesForeignKey() {
		return asientocontablesForeignKey;
	}

	public void setasientocontablesForeignKey(List<AsientoContable> asientocontablesForeignKey) {
		this.asientocontablesForeignKey = asientocontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public AsientoContable asientocontableForeignKey;

	public AsientoContable getasientocontableForeignKey() {
		return asientocontableForeignKey;
	}

	public void setasientocontableForeignKey(AsientoContable asientocontableForeignKey) {
		this.asientocontableForeignKey = asientocontableForeignKey;
	}

	public String sFinalQueryComboTipoFormaPago="";

	public List<TipoFormaPago> tipoformapagosForeignKey;

	public List<TipoFormaPago> gettipoformapagosForeignKey() {
		return tipoformapagosForeignKey;
	}

	public void settipoformapagosForeignKey(List<TipoFormaPago> tipoformapagosForeignKey) {
		this.tipoformapagosForeignKey = tipoformapagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFormaPago tipoformapagoForeignKey;

	public TipoFormaPago gettipoformapagoForeignKey() {
		return tipoformapagoForeignKey;
	}

	public void settipoformapagoForeignKey(TipoFormaPago tipoformapagoForeignKey) {
		this.tipoformapagoForeignKey = tipoformapagoForeignKey;
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
	public Long idAsientoContableActual=0L;

	public Long getidAsientoContableActual() {
		return idAsientoContableActual;
	}

	public void setidAsientoContableActual(Long idAsientoContableActual) {
		this.idAsientoContableActual= idAsientoContableActual;
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
	
	public Boolean isPermisoTodoDetallePago;
	public Boolean isPermisoNuevoDetallePago;
	public Boolean isPermisoActualizarDetallePago;
	public Boolean isPermisoActualizarOriginalDetallePago;
	public Boolean isPermisoEliminarDetallePago;
	public Boolean isPermisoGuardarCambiosDetallePago;
	public Boolean isPermisoConsultaDetallePago;
	public Boolean isPermisoBusquedaDetallePago;
	public Boolean isPermisoReporteDetallePago;
	public Boolean isPermisoPaginacionMedioDetallePago;
	public Boolean isPermisoPaginacionAltoDetallePago;
	public Boolean isPermisoPaginacionTodoDetallePago;
	public Boolean isPermisoCopiarDetallePago;
	public Boolean isPermisoVerFormDetallePago;
	public Boolean isPermisoDuplicarDetallePago;
	public Boolean isPermisoOrdenDetallePago;
	
	
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
	
	public DetallePagoParameterReturnGeneral detallepagoReturnGeneral;
	public DetallePagoParameterReturnGeneral detallepagoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetallePago=false;
	public Boolean esParaAccionDesdeFormularioDetallePago=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetallePagoSessionBeanAdditional detallepagoSessionBeanAdditional=null;
	
	public DetallePagoSessionBeanAdditional getDetallePagoSessionBeanAdditional() {
		return this.detallepagoSessionBeanAdditional;
	}
	
	public void setDetallePagoSessionBeanAdditional(DetallePagoSessionBeanAdditional detallepagoSessionBeanAdditional) {
		try {
			this.detallepagoSessionBeanAdditional=detallepagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetallePagoBeanSwingJInternalFrameAdditional detallepagoBeanSwingJInternalFrameAdditional=null;
	//public class DetallePagoBeanSwingJInternalFrame
	
	public DetallePagoBeanSwingJInternalFrameAdditional getDetallePagoBeanSwingJInternalFrameAdditional() {
		return this.detallepagoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetallePagoBeanSwingJInternalFrameAdditional(DetallePagoBeanSwingJInternalFrameAdditional detallepagoBeanSwingJInternalFrameAdditional) {
		try {
			this.detallepagoBeanSwingJInternalFrameAdditional=detallepagoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetallePagoLogic detallepagoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetallePago detallepagoBean;
	public DetallePagoConstantesFunciones detallepagoConstantesFunciones;
	//public DetallePagoParameterReturnGeneral detallepagoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public AsientoContableLogic asientocontableLogic;
	public TipoFormaPagoLogic tipoformapagoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<DetallePago> detallepagos;	
	//public List<DetallePago> detallepagosEliminados;
	//public List<DetallePago> detallepagosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetallePago=false;
	public Boolean isVisibilidadCeldaDuplicarDetallePago=true;
	public Boolean isVisibilidadCeldaCopiarDetallePago=true;
	public Boolean isVisibilidadCeldaVerFormDetallePago=true;
	public Boolean isVisibilidadCeldaOrdenDetallePago=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetallePago=false;
	public Boolean isVisibilidadCeldaModificarDetallePago=false;
	public Boolean isVisibilidadCeldaActualizarDetallePago=false;
	public Boolean isVisibilidadCeldaEliminarDetallePago=false;
	public Boolean isVisibilidadCeldaCancelarDetallePago=false;
	public Boolean isVisibilidadCeldaGuardarDetallePago=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetallePago=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdAsientoContable=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoFormaPago=false;
	
	public Long getiIdNuevoDetallePago() {
		return this.iIdNuevoDetallePago;
	}

	public void setiIdNuevoDetallePago(Long iIdNuevoDetallePago) {
		this.iIdNuevoDetallePago = iIdNuevoDetallePago;
	}
	
	public Long getidDetallePagoActual() {
		return this.idDetallePagoActual;
	}

	public void setidDetallePagoActual(Long idDetallePagoActual) {
		this.idDetallePagoActual = idDetallePagoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetallePago getdetallepago() {
		return this.detallepago;
	}

	public void setdetallepago(DetallePago detallepago) {
		this.detallepago = detallepago;
	}
	
	public DetallePago getdetallepagoAux() {
		return this.detallepagoAux;
	}

	public void setdetallepagoAux(DetallePago detallepagoAux) {
		this.detallepagoAux = detallepagoAux;
	}				
	
	public DetallePago getdetallepagoAnterior() {
		return this.detallepagoAnterior;
	}

	public void setdetallepagoAnterior(DetallePago detallepagoAnterior) {
		this.detallepagoAnterior = detallepagoAnterior;
	}	
	
	public DetallePago getdetallepagoTotales() {
		return this.detallepagoTotales;
	}

	public void setdetallepagoTotales(DetallePago detallepagoTotales) {
		this.detallepagoTotales = detallepagoTotales;
	}	
	
	public DetallePago getdetallepagoBean() {
		return this.detallepagoBean;
	}

	public void setdetallepagoBean(DetallePago detallepagoBean) {
		this.detallepagoBean = detallepagoBean;
	}	
	
	public DetallePagoParameterReturnGeneral getdetallepagoReturnGeneral() {
		return this.detallepagoReturnGeneral;
	}

	public void setdetallepagoReturnGeneral(DetallePagoParameterReturnGeneral detallepagoReturnGeneral) {
		this.detallepagoReturnGeneral = detallepagoReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_asiento_contableFK_IdAsientoContable=-1L;

	public Long getid_asiento_contableFK_IdAsientoContable() {
		return this.id_asiento_contableFK_IdAsientoContable;
	}

	public void setid_asiento_contableFK_IdAsientoContable(Long id_asiento_contableFK_IdAsientoContable) {
		this.id_asiento_contableFK_IdAsientoContable = id_asiento_contableFK_IdAsientoContable;
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

	public Long id_tipo_forma_pagoFK_IdTipoFormaPago=-1L;

	public Long getid_tipo_forma_pagoFK_IdTipoFormaPago() {
		return this.id_tipo_forma_pagoFK_IdTipoFormaPago;
	}

	public void setid_tipo_forma_pagoFK_IdTipoFormaPago(Long id_tipo_forma_pagoFK_IdTipoFormaPago) {
		this.id_tipo_forma_pagoFK_IdTipoFormaPago = id_tipo_forma_pagoFK_IdTipoFormaPago;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetallePagoLogic getDetallePagoLogic()	{		
		return detallepagoLogic;
	}

	public void setDetallePagoLogic(DetallePagoLogic detallepagoLogic) {
		this.detallepagoLogic = detallepagoLogic;
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
	
	public Boolean getIsEsNuevoDetallePago() {
		return isEsNuevoDetallePago;
	}

	public void setIsEsNuevoDetallePago(Boolean isEsNuevoDetallePago) {
		this.isEsNuevoDetallePago = isEsNuevoDetallePago;
	}

	public Boolean getEsParaAccionDesdeFormularioDetallePago() {
		return esParaAccionDesdeFormularioDetallePago;
	}
	
	public void setEsParaAccionDesdeFormularioDetallePago(Boolean esParaAccionDesdeFormularioDetallePago) {
		this.esParaAccionDesdeFormularioDetallePago = esParaAccionDesdeFormularioDetallePago;
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

			if(this.detallepagoSessionBean==null) {
				this.detallepagoSessionBean=new DetallePagoSessionBean();
			}

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallepagoSessionBean.getlidEmpresaActual());
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

			if(this.detallepagoSessionBean==null) {
				this.detallepagoSessionBean=new DetallePagoSessionBean();
			}

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detallepagoSessionBean.getlidSucursalActual());
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

			if(this.detallepagoSessionBean==null) {
				this.detallepagoSessionBean=new DetallePagoSessionBean();
			}

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(detallepagoSessionBean.getlidEjercicioActual());
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

			if(this.detallepagoSessionBean==null) {
				this.detallepagoSessionBean=new DetallePagoSessionBean();
			}

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(detallepagoSessionBean.getlidPeriodoActual());
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

	public void cargarCombosAsientoContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AsientoContableLogic asientocontableLogic=new AsientoContableLogic();

			//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

			if(this.detallepagoSessionBean==null) {
				this.detallepagoSessionBean=new DetallePagoSessionBean();
			}

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

					asientocontableLogic.getTodosAsientoContablesWithConnection(sFinalQuery,new Pagination());

					this.asientocontablesForeignKey=asientocontableLogic.getAsientoContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAsientoContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(detallepagoSessionBean.getlidAsientoContableActual());
					this.asientocontablesForeignKey.add(asientocontableLogic.getAsientoContable());
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

	public void cargarCombosTipoFormaPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFormaPagoLogic tipoformapagoLogic=new TipoFormaPagoLogic();

			//tipoformapagoLogic.getTipoFormaPagoDataAccess().setIsForForeingKeyData(true);

			if(this.detallepagoSessionBean==null) {
				this.detallepagoSessionBean=new DetallePagoSessionBean();
			}

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoformapagoLogic.getTipoFormaPagoDataAccess().setIsForForeingKeyData(true);

					tipoformapagoLogic.getTodosTipoFormaPagosWithConnection(sFinalQuery,new Pagination());

					this.tipoformapagosForeignKey=tipoformapagoLogic.getTipoFormaPagos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFormaPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformapagoLogic.getEntityWithConnection(detallepagoSessionBean.getlidTipoFormaPagoActual());
					this.tipoformapagosForeignKey.add(tipoformapagoLogic.getTipoFormaPago());
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

			if(this.detallepagoSessionBean==null) {
				this.detallepagoSessionBean=new DetallePagoSessionBean();
			}

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(detallepagoSessionBean.getlidAnioActual());
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

			if(this.detallepagoSessionBean==null) {
				this.detallepagoSessionBean=new DetallePagoSessionBean();
			}

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(detallepagoSessionBean.getlidMesActual());
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

					if(this.detallepago!=null) {
						this.detallepago.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetallePago.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetallePagoGenerico)throws Exception
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
				jComboBoxid_empresaDetallePagoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetallePagoGenerico!=null && jComboBoxid_empresaDetallePagoGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetallePagoGenerico.setSelectedIndex(0);
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

					if(this.detallepago!=null) {
						this.detallepago.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetallePago.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetallePagoGenerico)throws Exception
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
				jComboBoxid_sucursalDetallePagoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetallePagoGenerico!=null && jComboBoxid_sucursalDetallePagoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetallePagoGenerico.setSelectedIndex(0);
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

					if(this.detallepago!=null) {
						this.detallepago.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDetallePago.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDetallePagoGenerico)throws Exception
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
				jComboBoxid_ejercicioDetallePagoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDetallePagoGenerico!=null && jComboBoxid_ejercicioDetallePagoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDetallePagoGenerico.setSelectedIndex(0);
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

					if(this.detallepago!=null) {
						this.detallepago.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoDetallePago.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoDetallePagoGenerico)throws Exception
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
				jComboBoxid_periodoDetallePagoGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoDetallePagoGenerico!=null && jComboBoxid_periodoDetallePagoGenerico.getItemCount()>0) {
					jComboBoxid_periodoDetallePagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAsientoContableForeignKey(Long idAsientoContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(asientocontableTemp!=null) {

					if(this.detallepago!=null) {
						this.detallepago.setAsientoContable(asientocontableTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.setSelectedItem(asientocontableTemp);
					}
				} else {
					//jComboBoxid_asiento_contableDetallePago.setSelectedItem(asientocontableTemp);
					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(asientocontableTemp!=null && jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago!=null) {
						jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.setSelectedItem(asientocontableTemp);
					} else {
						if(jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago!=null) {
							//jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.setSelectedItem(asientocontableTemp);
							if(jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.getItemCount()>0) {
								jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.setSelectedIndex(0);
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

	public String getActualAsientoContableForeignKeyDescripcion(Long idAsientoContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}


			sDescripcion=AsientoContableConstantesFunciones.getAsientoContableDescripcion(asientocontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAsientoContableForeignKeyGenerico(Long idAsientoContableSeleccionado,JComboBox jComboBoxid_asiento_contableDetallePagoGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(asientocontableTemp!=null) {
				jComboBoxid_asiento_contableDetallePagoGenerico.setSelectedItem(asientocontableTemp);
			} else {
				if(jComboBoxid_asiento_contableDetallePagoGenerico!=null && jComboBoxid_asiento_contableDetallePagoGenerico.getItemCount()>0) {
					jComboBoxid_asiento_contableDetallePagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFormaPagoForeignKey(Long idTipoFormaPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoformapagoTemp!=null) {

					if(this.detallepago!=null) {
						this.detallepago.setTipoFormaPago(tipoformapagoTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.setSelectedItem(tipoformapagoTemp);
					}
				} else {
					//jComboBoxid_tipo_forma_pagoDetallePago.setSelectedItem(tipoformapagoTemp);
					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoformapagoTemp!=null && jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago!=null) {
						jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setSelectedItem(tipoformapagoTemp);
					} else {
						if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago!=null) {
							//jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setSelectedItem(tipoformapagoTemp);
							if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.getItemCount()>0) {
								jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setSelectedIndex(0);
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

	public String getActualTipoFormaPagoForeignKeyDescripcion(Long idTipoFormaPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}


			sDescripcion=TipoFormaPagoConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFormaPagoForeignKeyGenerico(Long idTipoFormaPagoSeleccionado,JComboBox jComboBoxid_tipo_forma_pagoDetallePagoGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoTemp=null;

			for(TipoFormaPago tipoformapagoAux:tipoformapagosForeignKey) {
				if(tipoformapagoAux.getId()!=null && tipoformapagoAux.getId().equals(idTipoFormaPagoSeleccionado)) {
					tipoformapagoTemp=tipoformapagoAux;
					break;
				}
			}

			if(tipoformapagoTemp!=null) {
				jComboBoxid_tipo_forma_pagoDetallePagoGenerico.setSelectedItem(tipoformapagoTemp);
			} else {
				if(jComboBoxid_tipo_forma_pagoDetallePagoGenerico!=null && jComboBoxid_tipo_forma_pagoDetallePagoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_forma_pagoDetallePagoGenerico.setSelectedIndex(0);
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

					if(this.detallepago!=null) {
						this.detallepago.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioDetallePago.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioDetallePagoGenerico)throws Exception
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
				jComboBoxid_anioDetallePagoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioDetallePagoGenerico!=null && jComboBoxid_anioDetallePagoGenerico.getItemCount()>0) {
					jComboBoxid_anioDetallePagoGenerico.setSelectedIndex(0);
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

					if(this.detallepago!=null) {
						this.detallepago.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesDetallePago.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormDetallePago!=null) {
						if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesDetallePagoGenerico)throws Exception
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
				jComboBoxid_mesDetallePagoGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesDetallePagoGenerico!=null && jComboBoxid_mesDetallePagoGenerico.getItemCount()>0) {
					jComboBoxid_mesDetallePagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetallePago detallepago,JComboBox jComboBoxid_empresaDetallePagoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetallePagoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetallePagoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallepago.setid_empresa(empresaAux.getId());
				detallepago.setempresa_descripcion(DetallePagoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallepago.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetallePago detallepago,JComboBox jComboBoxid_sucursalDetallePagoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetallePagoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetallePagoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detallepago.setid_sucursal(sucursalAux.getId());
				detallepago.setsucursal_descripcion(DetallePagoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detallepago.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DetallePago detallepago,JComboBox jComboBoxid_ejercicioDetallePagoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDetallePagoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDetallePagoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				detallepago.setid_ejercicio(ejercicioAux.getId());
				detallepago.setejercicio_descripcion(DetallePagoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				detallepago.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(DetallePago detallepago,JComboBox jComboBoxid_periodoDetallePagoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoDetallePagoGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoDetallePagoGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				detallepago.setid_periodo(periodoAux.getId());
				detallepago.setperiodo_descripcion(DetallePagoConstantesFunciones.getPeriodoDescripcion(periodoAux));
				detallepago.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAsientoContableForeignKey(DetallePago detallepago,JComboBox jComboBoxid_asiento_contableDetallePagoGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableAux=new AsientoContable();

			if(jComboBoxid_asiento_contableDetallePagoGenerico==null) {
				asientocontableAux=(AsientoContable)this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.getSelectedItem();
			} else {
				asientocontableAux=(AsientoContable)jComboBoxid_asiento_contableDetallePagoGenerico.getSelectedItem();
			}

			if(asientocontableAux!=null && asientocontableAux.getId()!=null) {
				detallepago.setid_asiento_contable(asientocontableAux.getId());
				detallepago.setasientocontable_descripcion(DetallePagoConstantesFunciones.getAsientoContableDescripcion(asientocontableAux));
				detallepago.setAsientoContable(asientocontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFormaPagoForeignKey(DetallePago detallepago,JComboBox jComboBoxid_tipo_forma_pagoDetallePagoGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoAux=new TipoFormaPago();

			if(jComboBoxid_tipo_forma_pagoDetallePagoGenerico==null) {
				tipoformapagoAux=(TipoFormaPago)this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.getSelectedItem();
			} else {
				tipoformapagoAux=(TipoFormaPago)jComboBoxid_tipo_forma_pagoDetallePagoGenerico.getSelectedItem();
			}

			if(tipoformapagoAux!=null && tipoformapagoAux.getId()!=null) {
				detallepago.setid_tipo_forma_pago(tipoformapagoAux.getId());
				detallepago.settipoformapago_descripcion(DetallePagoConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoAux));
				detallepago.setTipoFormaPago(tipoformapagoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(DetallePago detallepago,JComboBox jComboBoxid_anioDetallePagoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioDetallePagoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioDetallePagoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				detallepago.setid_anio(anioAux.getId());
				detallepago.setanio_descripcion(DetallePagoConstantesFunciones.getAnioDescripcion(anioAux));
				detallepago.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(DetallePago detallepago,JComboBox jComboBoxid_mesDetallePagoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesDetallePagoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesDetallePagoGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				detallepago.setid_mes(mesAux.getId());
				detallepago.setmes_descripcion(DetallePagoConstantesFunciones.getMesDescripcion(mesAux));
				detallepago.setMes(mesAux);			}
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

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) { 
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) { 
					}

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) { 
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) { 
					}

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) { 
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) { 
					}

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) { 
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) { 
					}

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAsientoContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAsientoContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) { 
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.addItem(asientocontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) { 
					}

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.addItem(asientocontable);
							}
						}

						if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFormaPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFormaPago=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) { 
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.addItem(tipoformapago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) { 
					}

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.addItem(tipoformapago);
							}
						}

						if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) { 
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) { 
					}

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) { 
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePago!=null) { 
					}

					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameAsientoContableForeignKey(AsientoContable asientocontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.setSelectedItem(asientocontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.setSelectedItem(asientocontable);
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoFormaPagoForeignKey(TipoFormaPago tipoformapago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.setSelectedItem(tipoformapago);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setSelectedItem(tipoformapago);
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePago!=null) {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesDetallePago() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetallePagoConstantesFunciones.refrescarForeignKeysDescripcionesDetallePago(this.detallepagoLogic.getDetallePagos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetallePagoConstantesFunciones.refrescarForeignKeysDescripcionesDetallePago(this.detallepagos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(AsientoContable.class));
		classes.add(new Classe(TipoFormaPago.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detallepagoLogic.setDetallePagos(this.detallepagos);
			detallepagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetallePagoParameterReturnGeneral getDetallePagoParameterGeneral() {
		return this.detallepagoParameterGeneral;
	}
	
	public void setDetallePagoParameterGeneral(DetallePagoParameterReturnGeneral detallepagoParameterGeneral) {
		this.detallepagoParameterGeneral = detallepagoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetallePago() {
		return isPermisoTodoDetallePago;
	}

	public void setIsPermisoTodoDetallePago(Boolean isPermisoTodoDetallePago) {
		this.isPermisoTodoDetallePago = isPermisoTodoDetallePago;
	}

	public Boolean getIsPermisoNuevoDetallePago() {
		return isPermisoNuevoDetallePago;
	}

	public void setIsPermisoNuevoDetallePago(Boolean isPermisoNuevoDetallePago) {
		this.isPermisoNuevoDetallePago = isPermisoNuevoDetallePago;
	}

	public Boolean getIsPermisoActualizarDetallePago() {
		return isPermisoActualizarDetallePago;
	}

	public void setIsPermisoActualizarDetallePago(Boolean isPermisoActualizarDetallePago) {
		this.isPermisoActualizarDetallePago = isPermisoActualizarDetallePago;
	}

	public Boolean getIsPermisoEliminarDetallePago() {
		return isPermisoEliminarDetallePago;
	}

	public void setIsPermisoEliminarDetallePago(Boolean isPermisoEliminarDetallePago) {
		this.isPermisoEliminarDetallePago = isPermisoEliminarDetallePago;
	}

	public Boolean getIsPermisoGuardarCambiosDetallePago() {
		return isPermisoGuardarCambiosDetallePago;
	}

	public void setIsPermisoGuardarCambiosDetallePago(Boolean isPermisoGuardarCambiosDetallePago) {
		this.isPermisoGuardarCambiosDetallePago = isPermisoGuardarCambiosDetallePago;
	}
	
	public Boolean getIsPermisoConsultaDetallePago() {
		return isPermisoConsultaDetallePago;
	}

	public void setIsPermisoConsultaDetallePago(Boolean isPermisoConsultaDetallePago) {
		this.isPermisoConsultaDetallePago = isPermisoConsultaDetallePago;
	}

	public Boolean getIsPermisoBusquedaDetallePago() {
		return isPermisoBusquedaDetallePago;
	}

	public void setIsPermisoBusquedaDetallePago(Boolean isPermisoBusquedaDetallePago) {
		this.isPermisoBusquedaDetallePago = isPermisoBusquedaDetallePago;
	}

	public Boolean getIsPermisoReporteDetallePago() {
		return isPermisoReporteDetallePago;
	}

	public void setIsPermisoReporteDetallePago(Boolean isPermisoReporteDetallePago) {
		this.isPermisoReporteDetallePago = isPermisoReporteDetallePago;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetallePago() {
		return isPermisoPaginacionMedioDetallePago;
	}

	public void setIsPermisoPaginacionMedioDetallePago(Boolean isPermisoPaginacionMedioDetallePago) {
		this.isPermisoPaginacionMedioDetallePago = isPermisoPaginacionMedioDetallePago;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetallePago() {
		return isPermisoPaginacionTodoDetallePago;
	}

	public void setIsPermisoPaginacionTodoDetallePago(Boolean isPermisoPaginacionTodoDetallePago) {
		this.isPermisoPaginacionTodoDetallePago = isPermisoPaginacionTodoDetallePago;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetallePago() {
		return isPermisoPaginacionAltoDetallePago;
	}

	public void setIsPermisoPaginacionAltoDetallePago(Boolean isPermisoPaginacionAltoDetallePago) {
		this.isPermisoPaginacionAltoDetallePago = isPermisoPaginacionAltoDetallePago;
	}
	
	public Boolean getIsPermisoCopiarDetallePago() {
		return isPermisoCopiarDetallePago;
	}

	public void setIsPermisoCopiarDetallePago(Boolean isPermisoCopiarDetallePago) {
		this.isPermisoCopiarDetallePago = isPermisoCopiarDetallePago;
	}
	
	public Boolean getIsPermisoVerFormDetallePago() {
		return isPermisoVerFormDetallePago;
	}

	public void setIsPermisoVerFormDetallePago(Boolean isPermisoVerFormDetallePago) {
		this.isPermisoVerFormDetallePago = isPermisoVerFormDetallePago;
	}
	
	public Boolean getIsPermisoDuplicarDetallePago() {
		return isPermisoDuplicarDetallePago;
	}

	public void setIsPermisoDuplicarDetallePago(Boolean isPermisoDuplicarDetallePago) {
		this.isPermisoDuplicarDetallePago = isPermisoDuplicarDetallePago;
	}
	
	public Boolean getIsPermisoOrdenDetallePago() {
		return isPermisoOrdenDetallePago;
	}

	public void setIsPermisoOrdenDetallePago(Boolean isPermisoOrdenDetallePago) {
		this.isPermisoOrdenDetallePago = isPermisoOrdenDetallePago;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetallePago() {
		return isVisibilidadCeldaNuevoDetallePago;
	}

	public void setIsVisibilidadCeldaNuevoDetallePago(Boolean isVisibilidadCeldaNuevoDetallePago) {
		this.isVisibilidadCeldaNuevoDetallePago = isVisibilidadCeldaNuevoDetallePago;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetallePago() {
		return isVisibilidadCeldaDuplicarDetallePago;
	}

	public void setIsVisibilidadCeldaDuplicarDetallePago(Boolean isVisibilidadCeldaDuplicarDetallePago) {
		this.isVisibilidadCeldaDuplicarDetallePago = isVisibilidadCeldaDuplicarDetallePago;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetallePago() {
		return isVisibilidadCeldaCopiarDetallePago;
	}

	public void setIsVisibilidadCeldaCopiarDetallePago(Boolean isVisibilidadCeldaCopiarDetallePago) {
		this.isVisibilidadCeldaCopiarDetallePago = isVisibilidadCeldaCopiarDetallePago;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetallePago() {
		return isVisibilidadCeldaVerFormDetallePago;
	}

	public void setIsVisibilidadCeldaVerFormDetallePago(Boolean isVisibilidadCeldaVerFormDetallePago) {
		this.isVisibilidadCeldaVerFormDetallePago = isVisibilidadCeldaVerFormDetallePago;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetallePago() {
		return isVisibilidadCeldaOrdenDetallePago;
	}

	public void setIsVisibilidadCeldaOrdenDetallePago(Boolean isVisibilidadCeldaOrdenDetallePago) {
		this.isVisibilidadCeldaOrdenDetallePago = isVisibilidadCeldaOrdenDetallePago;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetallePago() {
		return isVisibilidadCeldaNuevoRelacionesDetallePago;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetallePago(Boolean isVisibilidadCeldaNuevoRelacionesDetallePago) {
		this.isVisibilidadCeldaNuevoRelacionesDetallePago = isVisibilidadCeldaNuevoRelacionesDetallePago;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetallePago() {
		return isVisibilidadCeldaModificarDetallePago;
	}

	public void setIsVisibilidadCeldaModificarDetallePago(Boolean isVisibilidadCeldaModificarDetallePago) {
		this.isVisibilidadCeldaModificarDetallePago = isVisibilidadCeldaModificarDetallePago;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetallePago() {
		return isVisibilidadCeldaActualizarDetallePago;
	}

	public void setIsVisibilidadCeldaActualizarDetallePago(Boolean isVisibilidadCeldaActualizarDetallePago) {
		this.isVisibilidadCeldaActualizarDetallePago = isVisibilidadCeldaActualizarDetallePago;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetallePago() {
		return isVisibilidadCeldaEliminarDetallePago;
	}

	public void setIsVisibilidadCeldaEliminarDetallePago(Boolean isVisibilidadCeldaEliminarDetallePago) {
		this.isVisibilidadCeldaEliminarDetallePago = isVisibilidadCeldaEliminarDetallePago;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetallePago() {
		return isVisibilidadCeldaCancelarDetallePago;
	}

	public void setIsVisibilidadCeldaCancelarDetallePago(Boolean isVisibilidadCeldaCancelarDetallePago) {
		this.isVisibilidadCeldaCancelarDetallePago = isVisibilidadCeldaCancelarDetallePago;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetallePago() {
		return isVisibilidadCeldaGuardarDetallePago;
	}

	public void setIsVisibilidadCeldaGuardarDetallePago(Boolean isVisibilidadCeldaGuardarDetallePago) {
		this.isVisibilidadCeldaGuardarDetallePago = isVisibilidadCeldaGuardarDetallePago;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetallePago() {
		return isVisibilidadCeldaGuardarCambiosDetallePago;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetallePago(Boolean isVisibilidadCeldaGuardarCambiosDetallePago) {
		this.isVisibilidadCeldaGuardarCambiosDetallePago = isVisibilidadCeldaGuardarCambiosDetallePago;
	}
		
	public DetallePagoSessionBean getdetallepagoSessionBean() {
		return this.detallepagoSessionBean;
	}
	
	public void setdetallepagoSessionBean(DetallePagoSessionBean detallepagoSessionBean) {
		this.detallepagoSessionBean=detallepagoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdAsientoContable() {
		return this.isVisibilidadFK_IdAsientoContable;
	}

	public void setisVisibilidadFK_IdAsientoContable(Boolean isVisibilidadFK_IdAsientoContable) {
		this.isVisibilidadFK_IdAsientoContable=isVisibilidadFK_IdAsientoContable;
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

	public Boolean getisVisibilidadFK_IdTipoFormaPago() {
		return this.isVisibilidadFK_IdTipoFormaPago;
	}

	public void setisVisibilidadFK_IdTipoFormaPago(Boolean isVisibilidadFK_IdTipoFormaPago) {
		this.isVisibilidadFK_IdTipoFormaPago=isVisibilidadFK_IdTipoFormaPago;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetallePago(DetallePago detallepago)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detallepago,null);
				this.setActualParaGuardarSucursalForeignKey(detallepago,null);
				this.setActualParaGuardarEjercicioForeignKey(detallepago,null);
				this.setActualParaGuardarPeriodoForeignKey(detallepago,null);
				this.setActualParaGuardarAsientoContableForeignKey(detallepago,null);
				this.setActualParaGuardarTipoFormaPagoForeignKey(detallepago,null);
				this.setActualParaGuardarAnioForeignKey(detallepago,null);
				this.setActualParaGuardarMesForeignKey(detallepago,null);
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
	
	public void bugActualizarReferenciaActual(DetallePago detallepago,DetallePago detallepagoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetallePago(detallepago);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallepagoAux.setId(detallepago.getId());
		detallepagoAux.setVersionRow(detallepago.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetallePago();
		
			int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetallePagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detallepagoValidator.getInvalidValues(this.detallepago);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detallepagoLogic.setDatosCliente(datosCliente);
			detallepagoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detallepagoAux=new  DetallePago();
				
				detallepagoAux.setIsNew(true);
				detallepagoAux.setIsChanged(true);
				
				detallepagoAux.setDetallePagoOriginal(this.detallepago);
				
				detallepagoAux.setId(this.detallepago.getId());	
				detallepagoAux.setVersionRow(this.detallepago.getVersionRow());	
				detallepagoAux.setid_empresa(this.detallepago.getid_empresa());	
				detallepagoAux.setid_sucursal(this.detallepago.getid_sucursal());	
				detallepagoAux.setid_ejercicio(this.detallepago.getid_ejercicio());	
				detallepagoAux.setid_periodo(this.detallepago.getid_periodo());	
				detallepagoAux.setid_asiento_contable(this.detallepago.getid_asiento_contable());	
				detallepagoAux.setid_tipo_forma_pago(this.detallepago.getid_tipo_forma_pago());	
				detallepagoAux.setvalor(this.detallepago.getvalor());	
				detallepagoAux.setnumero_fila(this.detallepago.getnumero_fila());	
				detallepagoAux.setid_anio(this.detallepago.getid_anio());	
				detallepagoAux.setid_mes(this.detallepago.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallepagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallepagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detallepagoAux,detallepagoLogic.getDetallePagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepagoAux,detallepagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detallepagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallepagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagoLogic.saveDetallePagos();//WithConnection
						//detallepagoLogic.getSetVersionRowDetallePagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallepago,detallepagoAux);
					
					this.refrescarForeignKeysDescripcionesDetallePago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallepagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallepagoLogic.saveDetallePagoRelaciones(detallepagoAux);//WithConnection
								//detallepagoLogic.getSetVersionRowDetallePagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallepago,detallepagoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallepagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallepagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallepagoAux,detallepagoLogic.getDetallePagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallepagoAux,detallepagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallepago,detallepagoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detallepagoAux=new  DetallePago();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detallepagoSessionBean.getEsGuardarRelacionado() 
					|| (this.detallepagoSessionBean.getEsGuardarRelacionado() && this.detallepago.getId()>=0)) {
						
					detallepagoAux.setIsNew(false);
				}
				
				detallepagoAux.setIsDeleted(false);
			
				detallepagoAux.setId(this.detallepago.getId());	
				detallepagoAux.setVersionRow(this.detallepago.getVersionRow());	
				detallepagoAux.setid_empresa(this.detallepago.getid_empresa());	
				detallepagoAux.setid_sucursal(this.detallepago.getid_sucursal());	
				detallepagoAux.setid_ejercicio(this.detallepago.getid_ejercicio());	
				detallepagoAux.setid_periodo(this.detallepago.getid_periodo());	
				detallepagoAux.setid_asiento_contable(this.detallepago.getid_asiento_contable());	
				detallepagoAux.setid_tipo_forma_pago(this.detallepago.getid_tipo_forma_pago());	
				detallepagoAux.setvalor(this.detallepago.getvalor());	
				detallepagoAux.setnumero_fila(this.detallepago.getnumero_fila());	
				detallepagoAux.setid_anio(this.detallepago.getid_anio());	
				detallepagoAux.setid_mes(this.detallepago.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallepagoAux,detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepagoAux,detallepagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detallepagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallepagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagoLogic.saveDetallePagos();//WithConnection
						//detallepagoLogic.getSetVersionRowDetallePagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallepago,detallepagoAux);
					
					this.refrescarForeignKeysDescripcionesDetallePago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallepagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallepagoLogic.saveDetallePagoRelaciones(detallepagoAux);//WithConnection
								//detallepagoLogic.getSetVersionRowDetallePagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallepago,detallepagoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallepagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallepagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallepagoAux,detallepagoLogic.getDetallePagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallepagoAux,detallepagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallepago,detallepagoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detallepagoAux=new  DetallePago();
				
				detallepagoAux.setIsNew(false);
				detallepagoAux.setIsChanged(false);
				
				detallepagoAux.setIsDeleted(true);
				
				detallepagoAux.setId(this.detallepago.getId());	
				detallepagoAux.setVersionRow(this.detallepago.getVersionRow());	
				detallepagoAux.setid_empresa(this.detallepago.getid_empresa());	
				detallepagoAux.setid_sucursal(this.detallepago.getid_sucursal());	
				detallepagoAux.setid_ejercicio(this.detallepago.getid_ejercicio());	
				detallepagoAux.setid_periodo(this.detallepago.getid_periodo());	
				detallepagoAux.setid_asiento_contable(this.detallepago.getid_asiento_contable());	
				detallepagoAux.setid_tipo_forma_pago(this.detallepago.getid_tipo_forma_pago());	
				detallepagoAux.setvalor(this.detallepago.getvalor());	
				detallepagoAux.setnumero_fila(this.detallepago.getnumero_fila());	
				detallepagoAux.setid_anio(this.detallepago.getid_anio());	
				detallepagoAux.setid_mes(this.detallepago.getid_mes());	
				
				if(this.detallepagoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detallepagoAux.getId()>=0) {	
						this.detallepagosEliminados.add(detallepagoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detallepagoAux,detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepagoAux,detallepagos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detallepagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallepagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagoLogic.saveDetallePagos();//WithConnection
						//detallepagoLogic.getSetVersionRowDetallePagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallepagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallepagoLogic.saveDetallePagoRelaciones(detallepagoAux);//WithConnection
								//detallepagoLogic.getSetVersionRowDetallePagos();//WithConnection
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
							if(this.detallepagoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detallepagoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detallepagoAux,detallepagoLogic.getDetallePagos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detallepagoAux,detallepagos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getDetallePagos().addAll(this.detallepagosEliminados);
					
					detallepagoLogic.saveDetallePagos();//WithConnection
					//detallepagoLogic.getSetVersionRowDetallePagos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetallePago();
				
				this.detallepagosEliminados= new ArrayList<DetallePago>();		
			}
			
			if(this.detallepagoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detallepago=detallepagoAux;
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
      		//this.finishProcessDetallePago();
      	}
		
	}	
	
	public void actualizarRelaciones(DetallePago detallepagoLocal) throws Exception {
		
		if(this.detallepagoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetallePago detallepagoLocal) throws Exception {	
		if(this.detallepagoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallepagoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detallepagoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				detallepagoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				detallepagoLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AsientoContableDetalleFormJInternalFrame.class)) {
				AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrameLocal=(AsientoContableBeanSwingJInternalFrame) ((AsientoContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				asientocontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAsientoContable(asientocontableBeanSwingJInternalFrameLocal.getasientocontable(),true);
				asientocontableBeanSwingJInternalFrameLocal.actualizarLista(asientocontableBeanSwingJInternalFrameLocal.asientocontable,this.asientocontablesForeignKey);

				asientocontableBeanSwingJInternalFrameLocal.actualizarRelaciones(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				detallepagoLocal.setAsientoContable(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey("Formulario");
				this.setActualAsientoContableForeignKey(asientocontableBeanSwingJInternalFrameLocal.asientocontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFormaPagoDetalleFormJInternalFrame.class)) {
				TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrameLocal=(TipoFormaPagoBeanSwingJInternalFrame) ((TipoFormaPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoformapagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.gettipoformapago(),true);
				tipoformapagoBeanSwingJInternalFrameLocal.actualizarLista(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago,this.tipoformapagosForeignKey);

				tipoformapagoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				detallepagoLocal.setTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey("Formulario");
				this.setActualTipoFormaPagoForeignKey(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				detallepagoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				detallepagoLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetallePagoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallepagoValidator.getInvalidValues(this.detallepago);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetallePago detallepago,List<DetallePago> detallepagos) throws Exception {
		try	{		
			DetallePagoConstantesFunciones.actualizarLista(detallepago,detallepagos,this.detallepagoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetallePago detallepago,List<DetallePago> detallepagos) throws Exception {
		try	{			
			DetallePagoConstantesFunciones.actualizarSelectedLista(detallepago,detallepagos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetallePago> detallepagosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallepagosLocal=this.detallepagoLogic.getDetallePagos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallepagosLocal=this.detallepagos;
			}
			//ARCHITECTURE
		
			for(DetallePago detallepagoLocal:detallepagosLocal) {
				if(this.permiteMantenimiento(detallepagoLocal) && detallepagoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetallePagoConstantesFunciones.getDetallePagoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetallePagoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelid_empresaDetallePago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelid_sucursalDetallePago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelid_ejercicioDetallePago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelid_periodoDetallePago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoConstantesFunciones.IDASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelid_asiento_contableDetallePago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoConstantesFunciones.IDTIPOFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelid_tipo_forma_pagoDetallePago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelvalorDetallePago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoConstantesFunciones.NUMEROFILA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelnumero_filaDetallePago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelid_anioDetallePago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelid_mesDetallePago,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePago.jLabelid_empresaDetallePago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePago.jLabelid_sucursalDetallePago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePago.jLabelid_ejercicioDetallePago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePago.jLabelid_periodoDetallePago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePago.jLabelid_asiento_contableDetallePago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePago.jLabelid_tipo_forma_pagoDetallePago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePago.jLabelvalorDetallePago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePago.jLabelnumero_filaDetallePago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePago.jLabelid_anioDetallePago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePago.jLabelid_mesDetallePago,"");
		
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
		this.iIdNuevoDetallePago--;	
		
		
		this.detallepagoAux=new DetallePago();
		
		this.detallepagoAux.setId(this.iIdNuevoDetallePago);
		this.detallepagoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallepagoLogic.getDetallePagos().add(this.detallepagoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallepagos.add(this.detallepagoAux);
		}
		//ARCHITECTURE
		
		this.detallepago=this.detallepagoAux;
		
		if(DetallePagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetallePago(this.detallepago);
			this.setVariablesObjetoActualToFormularioForeignKeyDetallePago(this.detallepago);
		}
				
		//this.setDefaultControlesDetallePago();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetallePago();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetallePago();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePago();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallePago(this.detallepagoBean,this.detallepago,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetallePagoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detallepagoSessionBean.getConGuardarRelaciones()) {
			classes=DetallePagoConstantesFunciones.getClassesRelationshipsOfDetallePago(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detallepagoReturnGeneral=detallepagoLogic.procesarEventosDetallePagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallepagoLogic.getDetallePagos(),this.detallepago,this.detallepagoParameterGeneral,this.isEsNuevoDetallePago,classes);//this.detallepagoLogic.getDetallePago()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetallePago(this.detallepagoReturnGeneral,this.detallepagoBean,false);
		
		if(this.detallepagoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetallePago(this.detallepagoReturnGeneral.getDetallePago());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetallePago(this.detallepagoReturnGeneral.getDetallePago());
		}
		
		if(this.detallepagoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetallePago(this.detallepagoReturnGeneral.getDetallePago(),classes);//this.detallepagoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetallePago();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetallePago();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetallePagoBeanSwingJInternalFrameAdditional.RecargarFormDetallePago(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetallePago(false);
						
			if(detallepagoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetallePagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePago();
			}
			
			this.actualizarVisualTableDatosDetallePago();
			
			this.jTableDatosDetallePago.setRowSelectionInterval(this.getIndiceNuevoDetallePago(), this.getIndiceNuevoDetallePago());
			
			this.seleccionarFilaTablaDetallePagoActual();
						
			this.actualizarEstadoCeldasBotonesDetallePago("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetallePago(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetallePago.jTextFieldvalorDetallePago.setEnabled(isHabilitar && this.detallepagoConstantesFunciones.activarvalorDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jTextFieldnumero_filaDetallePago.setEnabled(isHabilitar && this.detallepagoConstantesFunciones.activarnumero_filaDetallePago);	
		//
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.setEnabled(isHabilitar && this.detallepagoConstantesFunciones.activarid_empresaDetallePago);//
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.setEnabled(isHabilitar && this.detallepagoConstantesFunciones.activarid_sucursalDetallePago);//
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.setEnabled(isHabilitar && this.detallepagoConstantesFunciones.activarid_ejercicioDetallePago);//
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.setEnabled(isHabilitar && this.detallepagoConstantesFunciones.activarid_periodoDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.setEnabled(isHabilitar && this.detallepagoConstantesFunciones.activarid_asiento_contableDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.setEnabled(isHabilitar && this.detallepagoConstantesFunciones.activarid_tipo_forma_pagoDetallePago);//
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.setEnabled(isHabilitar && this.detallepagoConstantesFunciones.activarid_anioDetallePago);//
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.setEnabled(isHabilitar && this.detallepagoConstantesFunciones.activarid_mesDetallePago);
	};
	
	public void setDefaultControlesDetallePago() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetallePago(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallepagoSessionBean.setConGuardarRelaciones(true);			
			this.detallepagoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetallePago.jTabbedPaneRelacionesDetallePago.setVisible(true);
			
					
		} else {
			//this.detallepagoSessionBean.setConGuardarRelaciones(false);			
			this.detallepagoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetallePago.jTabbedPaneRelacionesDetallePago.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetallePago() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePago detallepagoAux:this.detallepagoLogic.getDetallePagos()) {
				if(detallepagoAux.getId().equals(this.iIdNuevoDetallePago)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePago detallepagoAux:this.detallepagos) {
				if(detallepagoAux.getId().equals(this.iIdNuevoDetallePago)) {
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
	
	public int getIndiceActualDetallePago(DetallePago detallepago,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePago detallepagoAux:this.detallepagoLogic.getDetallePagos()) {
				if(detallepagoAux.getId().equals(detallepago.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePago detallepagoAux:this.detallepagos) {
				if(detallepagoAux.getId().equals(detallepago.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetallePago(DetallePago detallepagoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePago detallepagoAux:this.detallepagoLogic.getDetallePagos()) {
				if(detallepagoAux.getDetallePagoOriginal().getId().equals(detallepagoOriginal.getId())) {
					existe=true;
					detallepagoOriginal.setId(detallepagoAux.getId());
					detallepagoOriginal.setVersionRow(detallepagoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePago detallepagoAux:this.detallepagos) {
				if(detallepagoAux.getDetallePagoOriginal().getId().equals(detallepagoOriginal.getId())) {
					existe=true;
					detallepagoOriginal.setId(detallepagoAux.getId());
					detallepagoOriginal.setVersionRow(detallepagoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetallePago(Boolean esParaCancelar) throws Exception {
		detallepagosAux=new ArrayList<DetallePago>();
		detallepagoAux=new DetallePago();
		
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallePago detallepagoAux:this.detallepagoLogic.getDetallePagos()) {
					if(detallepagoAux.getId()<0) {
						detallepagosAux.add(detallepagoAux);
					}		
				}
				this.iIdNuevoDetallePago=0L;
				this.detallepagoLogic.getDetallePagos().removeAll(detallepagosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePago detallepagoAux:this.detallepagos) {
					if(detallepagoAux.getId()<0) {
						detallepagosAux.add(detallepagoAux);
					}		
				}
				this.iIdNuevoDetallePago=0L;
				this.detallepagos.removeAll(detallepagosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetallePago 
					&& this.detallepagoLogic.getDetallePagos().size()>0
					) {
					detallepagoAux=this.detallepagoLogic.getDetallePagos().get(this.detallepagoLogic.getDetallePagos().size() - 1);
				
					if(detallepagoAux.getId()<0) {
						this.detallepagoLogic.getDetallePagos().remove(detallepagoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetallePago && this.detallepagos.size()>0) {
					detallepagoAux=this.detallepagos.get(this.detallepagos.size() - 1);
				
					if(detallepagoAux.getId()<0) {
						this.detallepagos.remove(detallepagoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetallePago(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallepago.getId()<0) {
				this.detallepagoLogic.getDetallePagos().remove(this.detallepago);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallepago.getId()<0) {
				this.detallepagos.remove(this.detallepago);
			}
		}			
	}
	
	public void setEstadosInicialesDetallePago(List<DetallePago> detallepagosAux) throws Exception {
		DetallePagoConstantesFunciones.setEstadosInicialesDetallePago(detallepagosAux);
	}
	
	public void setEstadosInicialesDetallePago(DetallePago detallepagoAux) throws Exception {
		DetallePagoConstantesFunciones.setEstadosInicialesDetallePago(detallepagoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetallePagoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetallePago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetallePagoActual()) {
				if(!this.isEsNuevoDetallePago) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetallePago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetallePago=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetallePagoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Pago ?", "MANTENIMIENTO DE Detalle Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetallePago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetallePago detallepago) throws Exception {
		DetallePagoConstantesFunciones.seleccionarAsignar(this.detallepago,detallepago);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetallePago=this.isPermisoActualizarOriginalDetallePago;
			
			
			this.seleccionarAsignar(detallepago);
			
			

			idAsientoContableActual=detallepago.getid_asiento_contable();
			this.seleccionarAsientoContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetallePagoConstantesFunciones.quitarEspaciosDetallePago(this.detallepago,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetallePago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallepagoSessionBean.setsFuncionBusquedaRapida(this.detallepagoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarAsientoContableActual() throws Exception {
		try	{
			AsientoContable asientocontableAux=new AsientoContable();

			if(this.idAsientoContableActual != null && this.idAsientoContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(this.idAsientoContableActual);
					asientocontableAux= asientocontableLogic.getAsientoContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				asientocontablesForeignKey=new ArrayList<AsientoContable>();
				asientocontablesForeignKey.add(asientocontableAux);
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
			if(this.isEsNuevoDetallePago) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetallePago(esParaCancelar);				
				this.cancelarNuevoDetallePago(esParaCancelar);								
			}
			
			this.detallepago=new DetallePago();
			
			this.inicializarDetallePago();
			
			this.actualizarEstadoCeldasBotonesDetallePago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetallePago() throws Exception {
		try {
			DetallePagoConstantesFunciones.inicializarDetallePago(this.detallepago);
			
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
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallepagoLogic.getDetallePagos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetallePagos(String sAccionBusqueda,List<DetallePago> detallepagosParaReportes) throws Exception {
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
					sPathReporteFinal="DetallePago"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetallePagoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetallePagoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetallePago"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Pagos");		
		parameters.put("busquedapor", DetallePagoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetallePago=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetallePagoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetallePagoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetallePago=new JRBeanArrayDataSource(DetallePagoJInternalFrame.TraerDetallePagoBeans(detallepagosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetallePago);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetallePagoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetallePagoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetallePagoBean.TraerDetallePagoBeans(detallepagosParaReportes).toArray()));
							
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
				this.generarExcelReporteDetallePagos(sAccionBusqueda,sTipoArchivoReporte,detallepagosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetallePagos(sAccionBusqueda,sTipoArchivoReporte,detallepagosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetallePagoActionPerformed(null);
					//this.generarExcelReporteDetallePagos(sAccionBusqueda,sTipoArchivoReporte,detallepagosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetallePagos(sAccionBusqueda,sTipoArchivoReporte,detallepagosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetallePagos(sAccionBusqueda,sTipoArchivoReporte,detallepagosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetallePagos(sAccionBusqueda,sTipoArchivoReporte,detallepagosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetallePagos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePago> detallepagosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepago";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePagos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallePago("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetallePago detallepago : detallepagosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetallePagoConstantesFunciones.generarExcelReporteDataDetallePago("NORMAL",row,workbook,detallepago,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetallePago(String sTipo,Row row,Workbook workbook) {
		
		DetallePagoConstantesFunciones.generarExcelReporteHeaderDetallePago(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetallePagos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePago> detallepagosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepago_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetallePago detallepago : detallepagosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetallePagoConstantesFunciones.getDetallePagoDescripcion(detallepago));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepago.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepago.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepago.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepago.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepago.getasientocontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepago.gettipoformapago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepago.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoConstantesFunciones.LABEL_NUMEROFILA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoConstantesFunciones.LABEL_NUMEROFILA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepago.getnumero_fila());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepago.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepago.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetallePagos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePago> detallepagosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetallePago> detallepagosRespaldo=null;
		
		classes=DetallePagoConstantesFunciones.getClassesRelationshipsOfDetallePago(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallepagoLogic.setDatosCliente(this.datosCliente);
		this.detallepagoLogic.setDatosDeep(this.datosDeep);
		this.detallepagoLogic.setIsConDeep(true);
		
		detallepagosRespaldo=this.detallepagoLogic.getDetallePagos();
		
		this.detallepagoLogic.setDetallePagos(detallepagosParaReportes);	
		this.detallepagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallepagosParaReportes=this.detallepagoLogic.getDetallePagos();
		this.detallepagoLogic.setDetallePagos(detallepagosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepago_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallePago("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetallePago detallepago : detallepagosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetallePago("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetallePagoConstantesFunciones.generarExcelReporteDataDetallePago("NORMAL",row,workbook,detallepago,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetallePagoConstantesFunciones.getDetallePagoDescripcion(detallepago));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePago.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetallePago() throws Exception {		
		this.startProcessDetallePago(true);
	}
	
	public void startProcessDetallePago(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetallePago ,this.jPanelParametrosReportesDetallePago, this.jScrollPanelDatosDetallePago,this.jPanelPaginacionDetallePago, this.jScrollPanelDatosEdicionDetallePago, this.jPanelAccionesDetallePago,this.jPanelAccionesFormularioDetallePago,this.jmenuBarDetallePago,this.jmenuBarDetalleDetallePago,this.jTtoolBarDetallePago,this.jTtoolBarDetalleDetallePago);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallePago=this.jTabbedPaneBusquedasDetallePago; 
		
		final JPanel jPanelParametrosReportesDetallePago=this.jPanelParametrosReportesDetallePago;
		//final JScrollPane jScrollPanelDatosDetallePago=this.jScrollPanelDatosDetallePago;
		final JTable jTableDatosDetallePago=this.jTableDatosDetallePago;		
		final JPanel jPanelPaginacionDetallePago=this.jPanelPaginacionDetallePago;
		//final JScrollPane jScrollPanelDatosEdicionDetallePago=this.jScrollPanelDatosEdicionDetallePago;
		final JPanel jPanelAccionesDetallePago=this.jPanelAccionesDetallePago;
		
		JPanel jPanelCamposAuxiliarDetallePago=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetallePago=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) {
			jPanelCamposAuxiliarDetallePago=this.jInternalFrameDetalleFormDetallePago.jPanelCamposDetallePago;
			jPanelAccionesFormularioAuxiliarDetallePago=this.jInternalFrameDetalleFormDetallePago.jPanelAccionesFormularioDetallePago;
		}
		
		final JPanel jPanelCamposDetallePago=jPanelCamposAuxiliarDetallePago;
		final JPanel jPanelAccionesFormularioDetallePago=jPanelAccionesFormularioAuxiliarDetallePago;
		
		
		final JMenuBar jmenuBarDetallePago=this.jmenuBarDetallePago;
		final JToolBar jTtoolBarDetallePago=this.jTtoolBarDetallePago;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetallePago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallePago=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) {
			jmenuBarDetalleAuxiliarDetallePago=this.jInternalFrameDetalleFormDetallePago.jmenuBarDetalleDetallePago;
			jTtoolBarDetalleAuxiliarDetallePago=this.jInternalFrameDetalleFormDetallePago.jTtoolBarDetalleDetallePago;
		}
		
		final JMenuBar jmenuBarDetalleDetallePago=jmenuBarDetalleAuxiliarDetallePago;
		final JToolBar jTtoolBarDetalleDetallePago=jTtoolBarDetalleAuxiliarDetallePago;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallePago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallePago;
			processRunnable.jTableDatos=jTableDatosDetallePago;
			processRunnable.jPanelCampos=jPanelCamposDetallePago;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallePago;
			processRunnable.jPanelAcciones=jPanelAccionesDetallePago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallePago;
			
			
			processRunnable.jmenuBar=jmenuBarDetallePago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallePago;
			processRunnable.jTtoolBar=jTtoolBarDetallePago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallePago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallePago ,jPanelParametrosReportesDetallePago,jTableDatosDetallePago, /*jScrollPanelDatosDetallePago,*/jPanelCamposDetallePago,jPanelPaginacionDetallePago, /*jScrollPanelDatosEdicionDetallePago,*/ jPanelAccionesDetallePago,jPanelAccionesFormularioDetallePago,jmenuBarDetallePago,jmenuBarDetalleDetallePago,jTtoolBarDetallePago,jTtoolBarDetalleDetallePago);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallePago ,jPanelParametrosReportesDetallePago, jScrollPanelDatosDetallePago,jPanelPaginacionDetallePago, jScrollPanelDatosEdicionDetallePago, jPanelAccionesDetallePago,jPanelAccionesFormularioDetallePago,jmenuBarDetallePago,jmenuBarDetalleDetallePago,jTtoolBarDetallePago,jTtoolBarDetalleDetallePago);
						
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
	
	public void finishProcessDetallePago() {// throws Exception 
		this.finishProcessDetallePago(true);
	}
	
	public void finishProcessDetallePago(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetallePago ,this.jPanelParametrosReportesDetallePago, this.jScrollPanelDatosDetallePago,this.jPanelPaginacionDetallePago, this.jScrollPanelDatosEdicionDetallePago, this.jPanelAccionesDetallePago,this.jPanelAccionesFormularioDetallePago,this.jmenuBarDetallePago,this.jmenuBarDetalleDetallePago,this.jTtoolBarDetallePago,this.jTtoolBarDetalleDetallePago);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallePago=this.jTabbedPaneBusquedasDetallePago; 
		
		final JPanel jPanelParametrosReportesDetallePago=this.jPanelParametrosReportesDetallePago;
		//final JScrollPane jScrollPanelDatosDetallePago=this.jScrollPanelDatosDetallePago;
		final JTable jTableDatosDetallePago=this.jTableDatosDetallePago;		
		final JPanel jPanelPaginacionDetallePago=this.jPanelPaginacionDetallePago;
		//final JScrollPane jScrollPanelDatosEdicionDetallePago=this.jScrollPanelDatosEdicionDetallePago;
		final JPanel jPanelAccionesDetallePago=this.jPanelAccionesDetallePago;
		
		JPanel jPanelCamposAuxiliarDetallePago=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetallePago=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) {
			jPanelCamposAuxiliarDetallePago=this.jInternalFrameDetalleFormDetallePago.jPanelCamposDetallePago;
			jPanelAccionesFormularioAuxiliarDetallePago=this.jInternalFrameDetalleFormDetallePago.jPanelAccionesFormularioDetallePago;
		}
		
		final JPanel jPanelCamposDetallePago=jPanelCamposAuxiliarDetallePago;
		final JPanel jPanelAccionesFormularioDetallePago=jPanelAccionesFormularioAuxiliarDetallePago;
		
		
		final JMenuBar jmenuBarDetallePago=this.jmenuBarDetallePago;		
		final JToolBar jTtoolBarDetallePago=this.jTtoolBarDetallePago;
				
		JMenuBar jmenuBarDetalleAuxiliarDetallePago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallePago=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) {
			jmenuBarDetalleAuxiliarDetallePago=this.jInternalFrameDetalleFormDetallePago.jmenuBarDetalleDetallePago;
			jTtoolBarDetalleAuxiliarDetallePago=this.jInternalFrameDetalleFormDetallePago.jTtoolBarDetalleDetallePago;		
		}
		
		final JMenuBar jmenuBarDetalleDetallePago=jmenuBarDetalleAuxiliarDetallePago;
		final JToolBar jTtoolBarDetalleDetallePago=jTtoolBarDetalleAuxiliarDetallePago;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallePago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallePago;
			processRunnable.jTableDatos=jTableDatosDetallePago;
			processRunnable.jPanelCampos=jPanelCamposDetallePago;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallePago;
			processRunnable.jPanelAcciones=jPanelAccionesDetallePago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallePago;
			
			
			processRunnable.jmenuBar=jmenuBarDetallePago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallePago;
			processRunnable.jTtoolBar=jTtoolBarDetallePago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallePago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetallePago ,jPanelParametrosReportesDetallePago, jTableDatosDetallePago,/*jScrollPanelDatosDetallePago,*/jPanelCamposDetallePago,jPanelPaginacionDetallePago, /*jScrollPanelDatosEdicionDetallePago,*/ jPanelAccionesDetallePago,jPanelAccionesFormularioDetallePago,jmenuBarDetallePago,jmenuBarDetalleDetallePago,jTtoolBarDetallePago,jTtoolBarDetalleDetallePago));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetallePago(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetallePago(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetallePago(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetallePago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetallePago,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetallePago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetallePago,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallepagoConstantesFunciones.getsFinalQueryDetallePago();
		String  finalQueryPaginacionTodos=this.detallepagoConstantesFunciones.getsFinalQueryDetallePago();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetallePagoConstantesFunciones.getArrayColumnasGlobalesNoDetallePago(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetallePagoConstantesFunciones.getArrayColumnasGlobalesDetallePago(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetallePagoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallepagosEliminados= new ArrayList<DetallePago>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetallePago();
		
				///*DetallePagoSessionBean*/this.detallepagoSessionBean=new DetallePagoSessionBean();
			
			if(this.detallepagoSessionBean==null) {
				this.detallepagoSessionBean=new DetallePagoSessionBean();
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
					this.iNumeroPaginacion=DetallePagoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetallePagoConstantesFunciones.getClassesForeignKeysOfDetallePago(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallepago."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallepagosAux= new ArrayList<DetallePago>();
			
				
			detallepagoLogic.setDatosCliente(this.datosCliente);
			detallepagoLogic.setDatosDeep(this.datosDeep);
			detallepagoLogic.setIsConDeep(true);
			
			
			detallepagoLogic.getDetallePagoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detallepagoLogic.getTodosDetallePagos(finalQueryGlobal,pagination);
					
					//detallepagoLogic.getTodosDetallePagosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detallepagoLogic.getDetallePagos()==null|| detallepagoLogic.getDetallePagos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallepagosAux= new ArrayList<DetallePago>();
							detallepagosAux.addAll(detallepagoLogic.getDetallePagos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagosAux= new ArrayList<DetallePago>();
							detallepagosAux.addAll(detallepagos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallepagoLogic.getTodosDetallePagos(finalQueryGlobal+"",this.pagination);												
							
							//detallepagoLogic.getTodosDetallePagosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetallePagos("Todos",detallepagoLogic.getDetallePagos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallepagoLogic.setDetallePagos(new ArrayList<DetallePago>());					
							detallepagoLogic.getDetallePagos().addAll(detallepagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagos=new ArrayList<DetallePago>();
							detallepagos.addAll(detallepagosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetallePago=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetallePago=this.idActual;
				
				} else if(this.idDetallePagoActual!=null && this.idDetallePagoActual!=0L) {
					idDetallePago=idDetallePagoActual;
				}
				
					
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndicePorId(idDetallePago);
				
				this.detallepagos=new ArrayList<DetallePago>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detallepagoLogic.getEntity(idDetallePago);
					
					//detallepagoLogic.getEntityWithConnection(idDetallePago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagoLogic.setDetallePagos(new ArrayList<DetallePago>());
					detallepagoLogic.getDetallePagos().add(detallepagoLogic.getDetallePago());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagos=new ArrayList<DetallePago>();
					this.detallepagos.add(detallepago);
				}
				
				if(detallepagoLogic.getDetallePago()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAsientoContable")) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagoLogic.getDetallePagosFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagoLogic.getDetallePagos()==null||detallepagoLogic.getDetallePagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagos==null|| detallepagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagosAux=new ArrayList<DetallePago>();
						detallepagosAux.addAll(detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagosAux=new ArrayList<DetallePago>();
							detallepagosAux.addAll(detallepagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagoLogic.getDetallePagosFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagos("FK_IdAsientoContable",detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagos("FK_IdAsientoContable",detallepagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagoLogic.setDetallePagos(new ArrayList<DetallePago>());
						detallepagoLogic.getDetallePagos().addAll(detallepagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagos=new ArrayList<DetallePago>();
							detallepagos.addAll(detallepagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagoLogic.getDetallePagosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagoLogic.getDetallePagos()==null||detallepagoLogic.getDetallePagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagos==null|| detallepagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagosAux=new ArrayList<DetallePago>();
						detallepagosAux.addAll(detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagosAux=new ArrayList<DetallePago>();
							detallepagosAux.addAll(detallepagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagoLogic.getDetallePagosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagos("FK_IdEjercicio",detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagos("FK_IdEjercicio",detallepagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagoLogic.setDetallePagos(new ArrayList<DetallePago>());
						detallepagoLogic.getDetallePagos().addAll(detallepagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagos=new ArrayList<DetallePago>();
							detallepagos.addAll(detallepagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagoLogic.getDetallePagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagoLogic.getDetallePagos()==null||detallepagoLogic.getDetallePagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagos==null|| detallepagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagosAux=new ArrayList<DetallePago>();
						detallepagosAux.addAll(detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagosAux=new ArrayList<DetallePago>();
							detallepagosAux.addAll(detallepagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagoLogic.getDetallePagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagos("FK_IdEmpresa",detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagos("FK_IdEmpresa",detallepagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagoLogic.setDetallePagos(new ArrayList<DetallePago>());
						detallepagoLogic.getDetallePagos().addAll(detallepagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagos=new ArrayList<DetallePago>();
							detallepagos.addAll(detallepagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagoLogic.getDetallePagosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagoLogic.getDetallePagos()==null||detallepagoLogic.getDetallePagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagos==null|| detallepagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagosAux=new ArrayList<DetallePago>();
						detallepagosAux.addAll(detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagosAux=new ArrayList<DetallePago>();
							detallepagosAux.addAll(detallepagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagoLogic.getDetallePagosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagos("FK_IdPeriodo",detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagos("FK_IdPeriodo",detallepagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagoLogic.setDetallePagos(new ArrayList<DetallePago>());
						detallepagoLogic.getDetallePagos().addAll(detallepagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagos=new ArrayList<DetallePago>();
							detallepagos.addAll(detallepagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagoLogic.getDetallePagosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagoLogic.getDetallePagos()==null||detallepagoLogic.getDetallePagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagos==null|| detallepagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagosAux=new ArrayList<DetallePago>();
						detallepagosAux.addAll(detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagosAux=new ArrayList<DetallePago>();
							detallepagosAux.addAll(detallepagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagoLogic.getDetallePagosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagos("FK_IdSucursal",detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagos("FK_IdSucursal",detallepagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagoLogic.setDetallePagos(new ArrayList<DetallePago>());
						detallepagoLogic.getDetallePagos().addAll(detallepagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagos=new ArrayList<DetallePago>();
							detallepagos.addAll(detallepagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoFormaPago")) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagoLogic.getDetallePagosFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagoLogic.getDetallePagos()==null||detallepagoLogic.getDetallePagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagos==null|| detallepagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagosAux=new ArrayList<DetallePago>();
						detallepagosAux.addAll(detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagosAux=new ArrayList<DetallePago>();
							detallepagosAux.addAll(detallepagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagoLogic.getDetallePagosFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagos("FK_IdTipoFormaPago",detallepagoLogic.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagos("FK_IdTipoFormaPago",detallepagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagoLogic.setDetallePagos(new ArrayList<DetallePago>());
						detallepagoLogic.getDetallePagos().addAll(detallepagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagos=new ArrayList<DetallePago>();
							detallepagos.addAll(detallepagosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetallePago();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetallePago();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepagoLogic.getDetallePagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepagos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepagoLogic.getDetallePagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepagos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetallePago detallepago) {
		Boolean permite=true;
		
		if(this.detallepago.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetallePagoConstantesFunciones.getOrderByListaDetallePago();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetallePagoConstantesFunciones.getOrderByListaDetallePago();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePago detallepago:detallepagoLogic.getDetallePagos()) {
				if(detallepago.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagoTotales=detallepago;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePago detallepago:this.detallepagos) {
				if(detallepago.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagoTotales=detallepago;
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
			this.detallepagoAux=new DetallePago();
			this.detallepagoAux.setsType(Constantes2.S_TOTALES);
			this.detallepagoAux.setIsNew(false);
			this.detallepagoAux.setIsChanged(false);
			this.detallepagoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetallePagoConstantesFunciones.TotalizarValoresFilaDetallePago(this.detallepagoLogic.getDetallePagos(),this.detallepagoAux);
				
				this.detallepagoLogic.getDetallePagos().add(this.detallepagoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetallePagoConstantesFunciones.TotalizarValoresFilaDetallePago(this.detallepagos,this.detallepagoAux);
				
				this.detallepagos.add(this.detallepagoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallepagoTotales=new DetallePago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallepagoLogic.getDetallePagos().remove(detallepagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallepagos.remove(detallepagoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallepagoTotales=new DetallePago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePago detallepago:detallepagoLogic.getDetallePagos()) {
				if(detallepago.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagoTotales=detallepago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallePagoConstantesFunciones.TotalizarValoresFilaDetallePago(this.detallepagoLogic.getDetallePagos(),detallepagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePago detallepago:this.detallepagos) {
				if(detallepago.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagoTotales=detallepago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallePagoConstantesFunciones.TotalizarValoresFilaDetallePago(this.detallepagos,detallepagoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetallePagosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagosFK_IdAsientoContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdAsientoContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagosFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagosFK_IdTipoFormaPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFormaPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetallePagosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagoLogic.getDetallePagosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagosFK_IdAsientoContable(String sFinalQuery,Long id_asiento_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagoLogic.getDetallePagosFK_IdAsientoContable(sFinalQuery,this.pagination,id_asiento_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagoLogic.getDetallePagosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagoLogic.getDetallePagosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagoLogic.getDetallePagosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagosFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagoLogic.getDetallePagosFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagoLogic.getDetallePagosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagosFK_IdTipoFormaPago(String sFinalQuery,Long id_tipo_forma_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagoLogic.getDetallePagosFK_IdTipoFormaPago(sFinalQuery,this.pagination,id_tipo_forma_pago);
				
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
	
	public void inicializarPermisosDetallePago() {
		this.isPermisoTodoDetallePago=false;
		this.isPermisoNuevoDetallePago=false;
		this.isPermisoActualizarDetallePago=false;
		this.isPermisoActualizarOriginalDetallePago=false;
		this.isPermisoEliminarDetallePago=false;
		this.isPermisoGuardarCambiosDetallePago=false;
		this.isPermisoConsultaDetallePago=false;
		this.isPermisoBusquedaDetallePago=false;
		this.isPermisoReporteDetallePago=false;		
		this.isPermisoOrdenDetallePago=false;		
		this.isPermisoPaginacionMedioDetallePago=false;		
		this.isPermisoPaginacionAltoDetallePago=false;
		this.isPermisoPaginacionTodoDetallePago=false;
		this.isPermisoCopiarDetallePago=false;		
		this.isPermisoVerFormDetallePago=false;		
		this.isPermisoDuplicarDetallePago=false;		
		this.isPermisoOrdenDetallePago=false;		
	}
	
	public void setPermisosUsuarioDetallePago(Boolean isPermiso) {
		this.isPermisoTodoDetallePago=isPermiso;
		this.isPermisoNuevoDetallePago=isPermiso;
		this.isPermisoActualizarDetallePago=isPermiso;
		this.isPermisoActualizarOriginalDetallePago=isPermiso;
		this.isPermisoEliminarDetallePago=isPermiso;
		this.isPermisoGuardarCambiosDetallePago=isPermiso;
		this.isPermisoConsultaDetallePago=isPermiso;
		this.isPermisoBusquedaDetallePago=isPermiso;
		this.isPermisoReporteDetallePago=isPermiso;
		this.isPermisoOrdenDetallePago=isPermiso;		
		this.isPermisoPaginacionMedioDetallePago=isPermiso;		
		this.isPermisoPaginacionAltoDetallePago=isPermiso;		
		this.isPermisoPaginacionTodoDetallePago=isPermiso;		
		this.isPermisoCopiarDetallePago=isPermiso;		
		this.isPermisoVerFormDetallePago=isPermiso;		
		this.isPermisoDuplicarDetallePago=isPermiso;
		this.isPermisoOrdenDetallePago=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetallePago(Boolean isPermiso) {
		//this.isPermisoTodoDetallePago=isPermiso;
		this.isPermisoNuevoDetallePago=isPermiso;
		this.isPermisoActualizarDetallePago=isPermiso;
		this.isPermisoActualizarOriginalDetallePago=isPermiso;
		this.isPermisoEliminarDetallePago=isPermiso;
		this.isPermisoGuardarCambiosDetallePago=isPermiso;
		//this.isPermisoConsultaDetallePago=isPermiso;
		//this.isPermisoBusquedaDetallePago=isPermiso;
		//this.isPermisoReporteDetallePago=isPermiso;
		//this.isPermisoOrdenDetallePago=isPermiso;		
		//this.isPermisoPaginacionMedioDetallePago=isPermiso;		
		//this.isPermisoPaginacionAltoDetallePago=isPermiso;		
		//this.isPermisoPaginacionTodoDetallePago=isPermiso;		
		//this.isPermisoCopiarDetallePago=isPermiso;		
		//this.isPermisoDuplicarDetallePago=isPermiso;
		//this.isPermisoOrdenDetallePago=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetallePagoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetallePagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetallePago(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetallePagoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetallePagoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetallePagoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetallePagoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetallePago() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetallePagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallepagoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetallePagoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetallePago=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetallePago=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetallePago=this.isPermisoActualizarDetallePago;
			this.isPermisoEliminarDetallePago=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetallePago=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetallePago=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetallePago=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetallePago=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetallePago=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallePago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetallePago=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetallePago=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetallePago=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetallePago=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetallePago=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetallePago=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallePago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallepagoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetallePago.setToolTipText(this.jTableDatosDetallePago.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetallePago(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetallePago(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetallePagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetallePagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetallePago() throws Exception {
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
	public void inicializarCombosForeignKeyDetallePagoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.asientocontablesForeignKey=new ArrayList();
				this.tipoformapagosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetallePagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetallePagoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetallePagoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyAsientoContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AsientoContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFormaPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyDetallePagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetallePagoParameterReturnGeneral detallepagoReturnGeneral=new DetallePagoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detallepagoConstantesFunciones.cargarid_empresaDetallePago)
					 || (this.esRecargarFks && this.detallepagoConstantesFunciones.cargarid_empresaDetallePago)) {

					if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detallepagoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detallepagoConstantesFunciones.cargarid_sucursalDetallePago)
					 || (this.esRecargarFks && this.detallepagoConstantesFunciones.cargarid_sucursalDetallePago)) {

					if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detallepagoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.detallepagoConstantesFunciones.cargarid_ejercicioDetallePago)
					 || (this.esRecargarFks && this.detallepagoConstantesFunciones.cargarid_ejercicioDetallePago)) {

					if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+detallepagoSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.detallepagoConstantesFunciones.cargarid_periodoDetallePago)
					 || (this.esRecargarFks && this.detallepagoConstantesFunciones.cargarid_periodoDetallePago)) {

					if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+detallepagoSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalAsientoContable="";

				if(((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0) && this.detallepagoConstantesFunciones.cargarid_asiento_contableDetallePago)
					 || (this.esRecargarFks && this.detallepagoConstantesFunciones.cargarid_asiento_contableDetallePago)) {

					if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAsientoContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

						finalQueryGlobalAsientoContable=Funciones.GetFinalQueryAppend(finalQueryGlobalAsientoContable, "");
						finalQueryGlobalAsientoContable+=AsientoContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAsientoContable=" WHERE " + ConstantesSql.ID + "="+detallepagoSessionBean.getlidAsientoContableActual();
					}
				} else {
					finalQueryGlobalAsientoContable="NONE";
				}


				String finalQueryGlobalTipoFormaPago="";

				if(((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0) && this.detallepagoConstantesFunciones.cargarid_tipo_forma_pagoDetallePago)
					 || (this.esRecargarFks && this.detallepagoConstantesFunciones.cargarid_tipo_forma_pagoDetallePago)) {

					if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoFormaPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoFormaPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoFormaPago, "");
						finalQueryGlobalTipoFormaPago+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoFormaPago=" WHERE " + ConstantesSql.ID + "="+detallepagoSessionBean.getlidTipoFormaPagoActual();
					}
				} else {
					finalQueryGlobalTipoFormaPago="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.detallepagoConstantesFunciones.cargarid_anioDetallePago)
					 || (this.esRecargarFks && this.detallepagoConstantesFunciones.cargarid_anioDetallePago)) {

					if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+detallepagoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.detallepagoConstantesFunciones.cargarid_mesDetallePago)
					 || (this.esRecargarFks && this.detallepagoConstantesFunciones.cargarid_mesDetallePago)) {

					if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+detallepagoSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detallepagoReturnGeneral=detallepagoLogic.cargarCombosLoteForeignKeyDetallePago(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalAsientoContable,finalQueryGlobalTipoFormaPago,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detallepagoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detallepagoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=detallepagoReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=detallepagoReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalAsientoContable.equals("NONE")) {
				this.asientocontablesForeignKey=detallepagoReturnGeneral.getasientocontablesForeignKey();
			}

			if(!finalQueryGlobalTipoFormaPago.equals("NONE")) {
				this.tipoformapagosForeignKey=detallepagoReturnGeneral.gettipoformapagosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=detallepagoReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=detallepagoReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetallePago()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyAsientoContable();
			this.addItemDefectoCombosForeignKeyTipoFormaPago();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detallepagoSessionBean==null) {
				this.detallepagoSessionBean=new DetallePagoSessionBean();
			}

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyAsientoContable()throws Exception {
		try {

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				AsientoContable asientocontable=new AsientoContable();
				AsientoContableConstantesFunciones.setAsientoContableDescripcion(asientocontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				asientocontable.setId(null);

				if(!AsientoContableConstantesFunciones.ExisteEnLista(this.asientocontablesForeignKey,asientocontable,true)) {

					this.asientocontablesForeignKey.add(0,asientocontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoFormaPago()throws Exception {
		try {

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
				TipoFormaPago tipoformapago=new TipoFormaPago();
				TipoFormaPagoConstantesFunciones.setTipoFormaPagoDescripcion(tipoformapago,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoformapago.setId(null);

				if(!TipoFormaPagoConstantesFunciones.ExisteEnLista(this.tipoformapagosForeignKey,tipoformapago,true)) {

					this.tipoformapagosForeignKey.add(0,tipoformapago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.detallepagoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyDetallePago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetallePago(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetallePago()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePago();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetallePago(DetallePago detallepago)throws Exception {	
		try {
			
			this.setActualAsientoContableForeignKey(detallepago.getid_asiento_contable(),false,"Formulario");
			this.setActualTipoFormaPagoForeignKey(detallepago.getid_tipo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetallePago(DetallePago detallepago,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detallepago.getAsientoContable()!=null && !sTipoEvento.equals("id_asiento_contableDetallePago")) { //sTipoEvento Evita Bucle Infinito

					this.asientocontablesForeignKey=new ArrayList<AsientoContable>();
					this.asientocontablesForeignKey.add(detallepago.getAsientoContable());

					this.addItemDefectoCombosForeignKeyAsientoContable();
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetallePago()throws Exception {	
		try {
			
			this.setActualAsientoContableForeignKey(this.detallepagoConstantesFunciones.getid_asiento_contable(),false,"Formulario");
			this.setActualTipoFormaPagoForeignKey(this.detallepagoConstantesFunciones.getid_tipo_forma_pago(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePago()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDetallePago!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormDetallePago!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetallePago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetallePago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetallePago()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetallePago()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameAsientoContablesForeignKey("Todos");
			this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetallePago(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetallePago()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago!=null && this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago!=null && this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago!=null && this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago!=null && this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago!=null && this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago!=null && this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago!=null && this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago!=null && this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public DetallePagoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetallePagoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetallePagoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallepagoSessionBean=new DetallePagoSessionBean(); 
		this.detallepagoConstantesFunciones=new DetallePagoConstantesFunciones(); 
		this.detallepagoBean=new DetallePago();//(this.detallepagoConstantesFunciones); 		
		this.detallepagoReturnGeneral=new DetallePagoParameterReturnGeneral(); 
		
		this.detallepagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetallePagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetallePagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetallePagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetallePago(true);
			
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
			
			this.detallepagoConstantesFunciones=new DetallePagoConstantesFunciones(); 
			this.detallepagoBean=new DetallePago();//this.detallepagoConstantesFunciones); 			
			this.detallepagoReturnGeneral=new DetallePagoParameterReturnGeneral(); 
		
			DetallePagoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detallepago=new DetallePago();
			this.detallepagos = new ArrayList<DetallePago>();
			this.detallepagosAux = new ArrayList<DetallePago>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic=new DetallePagoLogic();
				this.detallepagoLogic.getNewConnexionToDeep("");
			}
			
			//this.detallepagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallepagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetallePago);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetallePago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallePago);	
					}
					
					if(this.jInternalFrameImportacionDetallePago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallePago);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetallePago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetallePago);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetallePago!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallePago);
				this.jInternalFrameDetalleFormDetallePago.setVisible(false);
				this.jInternalFrameDetalleFormDetallePago.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePago!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallePago);
					this.jInternalFrameReporteDinamicoDetallePago.setVisible(false);
					this.jInternalFrameReporteDinamicoDetallePago.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetallePago!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetallePago);
					this.jInternalFrameImportacionDetallePago.setVisible(false);
					this.jInternalFrameImportacionDetallePago.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetallePago!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetallePago);
					this.jInternalFrameOrderByDetallePago.setVisible(false);
					this.jInternalFrameOrderByDetallePago.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetallePagoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetallePagoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallepagoReturnGeneral=new DetallePagoParameterReturnGeneral();
			
			this.detallepagoParameterGeneral=new DetallePagoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallepagoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetallePagoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallepagoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallePagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallepagoSessionBean.getEsGuardarRelacionado(),this.detallepagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallePagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallepagoSessionBean.getEsGuardarRelacionado(),this.detallepagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetallePago=false;
			this.isVisibilidadCeldaDuplicarDetallePago=true;
			this.isVisibilidadCeldaCopiarDetallePago=true;
			this.isVisibilidadCeldaVerFormDetallePago=true;
			this.isVisibilidadCeldaOrdenDetallePago=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=false;
			this.isVisibilidadCeldaModificarDetallePago=false;
			this.isVisibilidadCeldaActualizarDetallePago=false;
			this.isVisibilidadCeldaEliminarDetallePago=false;
			this.isVisibilidadCeldaCancelarDetallePago=false;
			this.isVisibilidadCeldaGuardarDetallePago=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePago=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdAsientoContable=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoFormaPago=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetallePago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetallePago();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetallePago(false);
			
			this.setPermisosUsuarioDetallePago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepagoSessionBean.getEsGuardarRelacionado() 
				|| (this.detallepagoSessionBean.getEsGuardarRelacionado() && this.detallepagoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetallePagoClasesRelacionadas();
			}
			
			if(this.detallepagoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetallePagoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetallePago();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetallePago();
			}
			
			if(!this.isPermisoBusquedaDetallePago) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetallePago.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetallePago,this.isPermisoPaginacionMedioDetallePago,this.isPermisoPaginacionTodoDetallePago);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetallePagoConstantesFunciones.getTiposSeleccionarDetallePago());
				
				this.tiposColumnasSelect=DetallePagoConstantesFunciones.getTiposSeleccionarDetallePago(true);
				
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
			//if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetallePago();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetallePago(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetallePago(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePago() ;
			
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
			this.asientocontableLogic=new AsientoContableLogic();
			this.tipoformapagoLogic=new TipoFormaPagoLogic();
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
				detallepagoImplementable= (DetallePagoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallePagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallepagoImplementableHome= (DetallePagoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallePagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallepagos= new ArrayList<DetallePago>();
			this.detallepagosEliminados= new ArrayList<DetallePago>();
						
			this.isEsNuevoDetallePago=false;
			this.esParaAccionDesdeFormularioDetallePago=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idAsientoContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>() ;
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetallePago(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetallePago();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetallePagoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetallePagoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetallePago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetallePago(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetallePago!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetallePago();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetallePago();
			}
			
			DetallePagoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetallePago.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetallePago.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetallePago.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetallePago(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetallePago: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetallePago() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetallePago")) {
				iIndex=this.jInternalFrameDetalleFormDetallePago.jTabbedPaneRelacionesDetallePago.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetallePago.jTabbedPaneRelacionesDetallePago.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetallePago();	
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
	
	public void cargarCombosForeignKeyDetallePago(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetallePago(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetallePago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetallePagoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetallePago();
		
		this.cargarCombosFrameForeignKeyDetallePago();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetallePago();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetallePago();
		}
	}
	
	

	public void cargarCombosForeignKeyAsientoContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFormaPago(this.tipoformapagosForeignKey);

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
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetallePagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallepagoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
			
			if(jTableDatosDetallePago.getRowCount()>=1) {
				jTableDatosDetallePago.removeRowSelectionInterval(0, jTableDatosDetallePago.getRowCount()-1);						
			}
			
			this.isEsNuevoDetallePago=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetallePago(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetallePago(true);			
			//this.detallepago=new DetallePago();
			//this.detallepago.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePago(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePago() ;
			
			if(DetallePagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePago(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallepago);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallepago);				
			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
			if(this.detallepagoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetallePago: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetallePagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetallePago.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetallePago.getSelectedRows().length;			
			}
			
			detallepagosSeleccionados=this.getDetallePagosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetallePago--;			
				//DetallePago detallepagoAux= new DetallePago();			
				//detallepagoAux.setId(this.iIdNuevoDetallePago);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetallePago detallepagoOrigen=new DetallePago();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetallePago detallepagoOrigen : detallepagosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallepagoOrigen =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagoOrigen =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetallePago();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallepago.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetallePago(detallepagoOrigen,this.detallepago,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallepagoLogic.getDetallePagos().add(this.detallepagoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallepagos.add(this.detallepagoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetallePago(false);
				
				this.jTableDatosDetallePago.setRowSelectionInterval(this.getIndiceNuevoDetallePago(), this.getIndiceNuevoDetallePago());
				
				int iLastRow =  this.jTableDatosDetallePago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallePago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallePago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePago(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetallePagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();									
		
			DetallePago detallepagoOrigen=new DetallePago();
			DetallePago detallepagoDestino=new DetallePago();
				
			detallepagosSeleccionados=this.getDetallePagosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetallePago.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallepagosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetallePago.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagoOrigen =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallepagoOrigen =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagoDestino =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallepagoDestino =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallepagoOrigen =detallepagosSeleccionados.get(0);
				detallepagoDestino =detallepagosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetallePago(detallepagoOrigen,detallepagoDestino,true,false);
				
				detallepagoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallepagoDestino,detallepagoLogic.getDetallePagos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepagoDestino,detallepagos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetallePago(false);
				
				//this.jTableDatosDetallePago.setRowSelectionInterval(this.getIndiceNuevoDetallePago(), this.getIndiceNuevoDetallePago());
				
				int iLastRow =  this.jTableDatosDetallePago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallePago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallePago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePago(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetallePagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetallePago.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetallePagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetallePago.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetallePago.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetallePago.setVisible(!isVisible);
			this.jPanelPaginacionDetallePago.setVisible(!isVisible);
			this.jPanelAccionesDetallePago.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetallePagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetallePago();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetallePagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetallePago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetallePagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetallePago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetallePagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetallePago();
			
			this.abrirFrameOrderByDetallePago();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetallePagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetallePago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetallePago(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallePago);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetallePago.isMaximum()) {
					this.jInternalFrameDetalleFormDetallePago.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetallePago.setSize(this.jInternalFrameDetalleFormDetallePago.iWidthFormulario,this.jInternalFrameDetalleFormDetallePago.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetallePago.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetallePago.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetallePago.isMaximum()) {
						this.jInternalFrameDetalleFormDetallePago.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetallePago.jContentPaneDetalleDetallePago.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetallePago.jTabbedPaneRelacionesDetallePago.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetallePago.jContentPaneDetalleDetallePago.getWidth(),DetallePagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallePago.jTabbedPaneRelacionesDetallePago.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetallePago.jContentPaneDetalleDetallePago.getWidth(),DetallePagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallePago.jTabbedPaneRelacionesDetallePago.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetallePago.jContentPaneDetalleDetallePago.getWidth(),DetallePagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetallePago.setVisible(true);
	        this.jInternalFrameDetalleFormDetallePago.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetallePago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetallePago==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetallePago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePago,false,this);
				} else {
					this.jInternalFrameOrderByDetallePago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePago,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetallePago);
				this.jInternalFrameOrderByDetallePago.setVisible(false);
				this.jInternalFrameOrderByDetallePago.setSelected(false);
				
				this.jInternalFrameOrderByDetallePago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallePago"));
				
				this.inicializarActualizarBindingTablaOrderByDetallePago();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetallePago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetallePago==null) {
				
				this.jInternalFrameImportacionDetallePago=new ImportacionJInternalFrame(DetallePagoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallePago);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetallePago);
				this.jInternalFrameImportacionDetallePago.setVisible(false);
				this.jInternalFrameImportacionDetallePago.setSelected(false);


				this.jInternalFrameImportacionDetallePago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallePago"));
				this.jInternalFrameImportacionDetallePago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallePago"));
				this.jInternalFrameImportacionDetallePago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallePago"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetallePago() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetallePago==null) {
				this.jInternalFrameReporteDinamicoDetallePago=new ReporteDinamicoJInternalFrame(DetallePagoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallePago);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallePago);
				this.jInternalFrameReporteDinamicoDetallePago.setVisible(false);
				this.jInternalFrameReporteDinamicoDetallePago.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetallePago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePago"));
				this.jInternalFrameReporteDinamicoDetallePago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePago"));
				this.jInternalFrameReporteDinamicoDetallePago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePago"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePago();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetallePago() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallePago);
			
	       	this.jInternalFrameDetalleFormDetallePago.setVisible(false);
	        this.jInternalFrameDetalleFormDetallePago.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetallePago.dispose();
			//this.jInternalFrameDetalleFormDetallePago=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetallePago() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetallePago.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetallePago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetallePago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetallePago.setVisible(true);
	        this.jInternalFrameImportacionDetallePago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetallePago() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetallePago.setVisible(true);
	        this.jInternalFrameOrderByDetallePago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetallePago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetallePago.setVisible(false);
	        this.jInternalFrameOrderByDetallePago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetallePago() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetallePago.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetallePago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetallePago() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetallePago.setVisible(false);
	        this.jInternalFrameImportacionDetallePago.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetallePagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetallePago(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetallePago(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetallePago(true);
			//this.isEsNuevoDetallePago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetallePago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePago(false) ;
			
			if(detallepagoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetallePagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePago(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetallePagoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetallePago(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetallePago(true);
			//this.isEsNuevoDetallePago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallepago.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetallePago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetallePago(false) ;
			
			if(DetallePagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePago(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("AsientoContable")) {
				if(!this.detallepagoConstantesFunciones.cargarid_asiento_contableDetallePago) {
					this.cargarCombosAsientoContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetallePago(false,false);
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_asiento_contable (id);

				this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaAsientoContable(List<AsientoContable> asientocontablesForeignKey)throws Exception{
		TableColumn tableColumnAsientoContable=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE));
		TableCellEditor tableCellEditorAsientoContable =tableColumnAsientoContable.getCellEditor();

		AsientoContableTableCell asientocontableTableCellFk=(AsientoContableTableCell)tableCellEditorAsientoContable;

		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.setasientocontablesForeignKey(asientocontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//asientocontableTableCellFk.setRowActual(intSelectedRow);
			//asientocontableTableCellFk.setasientocontablesForeignKeyActual(asientocontablesForeignKey);
		//}


		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.RecargarAsientoContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoFormaPago(List<TipoFormaPago> tipoformapagosForeignKey)throws Exception{
		TableColumn tableColumnTipoFormaPago=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO));
		TableCellEditor tableCellEditorTipoFormaPago =tableColumnTipoFormaPago.getCellEditor();

		TipoFormaPagoTableCell tipoformapagoTableCellFk=(TipoFormaPagoTableCell)tableCellEditorTipoFormaPago;

		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.settipoformapagosForeignKey(tipoformapagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoformapagoTableCellFk.setRowActual(intSelectedRow);
			//tipoformapagoTableCellFk.settipoformapagosForeignKeyActual(tipoformapagosForeignKey);
		//}


		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.RecargarTipoFormaPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePago.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_asiento_contable (Long id) throws Exception {
		this.setActualAsientoContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDetallePagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetallePago(false);
			
			//if(!this.isEsNuevoDetallePago) {								
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetallePagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				
			}
			
			if(this.permiteMantenimiento(this.detallepago)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetallePago=true;
					this.inicializarActualizarBindingTablaDetallePago(false);
					this.isEsNuevoDetallePago=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetallePago=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetallePago=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallePago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePago(false);
				
				this.habilitarDeshabilitarControlesDetallePago(false);
			
												
				
				if(DetallePagoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetallePago();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetallePagoActionPerformed(evt,detallepagoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetallePago(this.detallepago,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetallePago.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallepagoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallepago.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetallePago.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePago.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetallePagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				this.detallepago.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				this.detallepago.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallepago)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetallePagoModel) this.jTableDatosDetallePago.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetallePago=true;
				this.inicializarActualizarBindingTablaDetallePago(false);
				this.isEsNuevoDetallePago=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallePago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePago(false);
				
				this.habilitarDeshabilitarControlesDetallePago(false);
				
				
				
				if(DetallePagoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetallePago();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetallePagoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetallePago.getRowCount()>=1) {
				jTableDatosDetallePago.removeRowSelectionInterval(0, jTableDatosDetallePago.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetallePago(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetallePago(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePago(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePago(false) ;
			
			this.isEsNuevoDetallePago=false;
			
			if(DetallePagoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetallePago();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetallePagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetallePago(false);
				
				//SI ES MANUAL
				if(DetallePagoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetallePago();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetallePagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetallePago--;			
			//DetallePago detallepagoAux= new DetallePago();			
			//detallepagoAux.setId(this.iIdNuevoDetallePago);
			
			if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetallePago();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
			
			this.detallepago.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallepagoLogic.getDetallePagos().add(this.detallepagoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallepagos.add(this.detallepagoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetallePago(false);
			
			this.jTableDatosDetallePago.setRowSelectionInterval(this.getIndiceNuevoDetallePago(), this.getIndiceNuevoDetallePago());
			
			int iLastRow =  this.jTableDatosDetallePago.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetallePago.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetallePago.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetallePago(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetallePagoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetallePago(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePago(false);
			
			//SI ES MANUAL
			if(DetallePagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePago();
			}
			
			//this.abrirFrameTreeDetallePago();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetallePagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle PagoS ?", "MANTENIMIENTO DE Detalle Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetallePago.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetallePago();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detallepagoReturnGeneral=detallepagoLogic.procesarImportacionDetallePagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detallepagoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetallePagoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetallePagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetallePago.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetallePago.setFileImportacion(this.jInternalFrameImportacionDetallePago.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetallePago.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetallePago.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetallePago.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetallePago.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetallePagoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();		

		detallepagosSeleccionados=this.getDetallePagosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetallePagoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetallePagoBaseDesign.jrxml";
			
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
			
			this.generarReporteDetallePagos("Todos",detallepagosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallePagoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoConstantesFunciones.LABEL_NUMEROFILA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFila_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFila_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFila_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFila_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetallePago.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetallePagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoria="id_asiento_contable";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoria="id_tipo_forma_pago";
					break;

				case DetallePagoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case DetallePagoConstantesFunciones.LABEL_NUMEROFILA:
					sNombreCampoCategoria="numero_fila";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetallePagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoriaValor="id_asiento_contable";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoriaValor="id_tipo_forma_pago";
					break;

				case DetallePagoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case DetallePagoConstantesFunciones.LABEL_NUMEROFILA:
					sNombreCampoCategoriaValor="numero_fila";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case DetallePagoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallePagoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetallePagoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetallePagoConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case DetallePagoConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_asiento_contable");
					break;

				case DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_forma_pago");
					break;

				case DetallePagoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case DetallePagoConstantesFunciones.LABEL_NUMEROFILA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Fila",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_fila");
					break;

				case DetallePagoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case DetallePagoConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetallePagoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();		
		
		detallepagosSeleccionados=this.getDetallePagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepago";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetallePagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetallePagoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetallePago detallepago:detallepagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepago.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetallePago detallepago:detallepagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepago.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DetallePago detallepago:detallepagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepago.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(DetallePago detallepago:detallepagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepago.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
					iRow++;

					for(DetallePago detallepago:detallepagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepago.getasientocontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
					iRow++;

					for(DetallePago detallepago:detallepagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepago.gettipoformapago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(DetallePago detallepago:detallepagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepago.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoConstantesFunciones.LABEL_NUMEROFILA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoConstantesFunciones.LABEL_NUMEROFILA);
					iRow++;

					for(DetallePago detallepago:detallepagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepago.getnumero_fila());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(DetallePago detallepago:detallepagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepago.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(DetallePago detallepago:detallepagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepago.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelDetallePago(row);				
			//	iRow++;
			//}				
			
			//for(DetallePago detallepagoAux:detallepagosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetallePago(detallepagoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallepagoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePago(false);
			
			//SI ES MANUAL
			if(DetallePagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePago();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetallePagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePago(false);
			
			//SI ES MANUAL
			if(DetallePagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallePago();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetallePagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePago(false);
			
			//SI ES MANUAL
			if(DetallePagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallePago();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetallePago() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetallePago.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetallePago.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetallePago.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetallePago.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetallePago.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetallePago.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetallePago.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetallePago(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetallePago(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetallePago(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetallePago(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetallePago(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetallePago(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePago(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetallePago(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetallePagoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetallePagoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetallePago() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetallePago();
		
		this.inicializarActualizarBindingBotonesManualDetallePago(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetallePago();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePago() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePago(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePago(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetallePago.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetallePago.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetallePago.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetallePago!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetallePago.jCheckBoxPostAccionNuevoDetallePago.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetallePago.jCheckBoxPostAccionSinCerrarDetallePago.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetallePago.jCheckBoxPostAccionSinMensajeDetallePago.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetallePago.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetallePago.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetallePago.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetallePago!=null) {
				this.jInternalFrameDetalleFormDetallePago.jCheckBoxPostAccionNuevoDetallePago.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetallePago.jCheckBoxPostAccionSinCerrarDetallePago.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetallePago.jCheckBoxPostAccionSinMensajeDetallePago.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetallePago.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetallePago.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetallePago!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetallePago.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetallePago!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetallePago.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetallePago.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetallePago.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetallePago.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetallePago!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetallePago.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetallePago.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetallePago(Boolean esInicializar) throws Exception {
		try	{	
			if(DetallePagoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePago(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetallePago() throws Exception {
		try	{
			if(DetallePagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallePago();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallePago() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallePago() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetallePago.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetallePago.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetallePago.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetallePago.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetallePago.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetallePago.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetallePago.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetallePago.addItem(reporte);
			}
			
			
			if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetallePago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetallePago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetallePago.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetallePago.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetallePago.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetallePago.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetallePago.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetallePago.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetallePago.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePago();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePago() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallePago!=null) {
				this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallePago!=null) {
				this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetallePago!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetallePago.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallePago.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePago.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetallePagoConstantesFunciones.getTiposSeleccionarDetallePago(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetallePagoConstantesFunciones.getTiposSeleccionarDetallePago(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetallePagoConstantesFunciones.getTiposSeleccionarDetallePago(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePago.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetallePago.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetallePago()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.getSelectedItem()!=null){this.id_asiento_contableFK_IdAsientoContable=((AsientoContable)this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePago.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.getSelectedItem()!=null){this.id_tipo_forma_pagoFK_IdTipoFormaPago=((TipoFormaPago)this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoDetallePago.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetallePago(Boolean esInicializar) throws Exception {				
		if(DetallePagoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetallePago();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetallePago() throws Exception {
		this.inicializarActualizarBindingTablaDetallePago(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetallePago() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetallePagoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetallePago(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallepagoLogic.getDetallePagos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallepagos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetallePagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetallePago.setModel(new DetallePagoModel(this.detallepagoLogic.getDetallePagos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetallePago.setModel(new DetallePagoModel(this.detallepagos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetallePago!=null && this.jInternalFrameOrderByDetallePago.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetallePago();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetallePagoConstantesFunciones.SCLASSWEBTITULO,detallepagoConstantesFunciones.resaltarSeleccionarDetallePago,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetallePagoConstantesFunciones.SCLASSWEBTITULO,detallepagoConstantesFunciones.resaltarSeleccionarDetallePago,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_ID));

		if(this.detallepagoConstantesFunciones.mostraridDetallePago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepagoConstantesFunciones.resaltaridDetallePago,this.detallepagoConstantesFunciones.activaridDetallePago,iSizeTabla,this,true,"idDetallePago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagoConstantesFunciones.resaltaridDetallePago,this.detallepagoConstantesFunciones.activaridDetallePago,this,true,"idDetallePago","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detallepagoConstantesFunciones.mostrarid_empresaDetallePago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detallepagoConstantesFunciones.resaltarid_empresaDetallePago,this,this.detallepagoConstantesFunciones.activarid_empresaDetallePago,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detallepagoConstantesFunciones.resaltarid_empresaDetallePago,this,this.detallepagoConstantesFunciones.activarid_empresaDetallePago,false,"id_empresaDetallePago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detallepagoConstantesFunciones.mostrarid_sucursalDetallePago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detallepagoConstantesFunciones.resaltarid_sucursalDetallePago,this,this.detallepagoConstantesFunciones.activarid_sucursalDetallePago,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detallepagoConstantesFunciones.resaltarid_sucursalDetallePago,this,this.detallepagoConstantesFunciones.activarid_sucursalDetallePago,false,"id_sucursalDetallePago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.detallepagoConstantesFunciones.mostrarid_ejercicioDetallePago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.detallepagoConstantesFunciones.resaltarid_ejercicioDetallePago,this,this.detallepagoConstantesFunciones.activarid_ejercicioDetallePago,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.detallepagoConstantesFunciones.resaltarid_ejercicioDetallePago,this,this.detallepagoConstantesFunciones.activarid_ejercicioDetallePago,false,"id_ejercicioDetallePago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDPERIODO));

		if(this.detallepagoConstantesFunciones.mostrarid_periodoDetallePago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.detallepagoConstantesFunciones.resaltarid_periodoDetallePago,this,this.detallepagoConstantesFunciones.activarid_periodoDetallePago,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.detallepagoConstantesFunciones.resaltarid_periodoDetallePago,this,this.detallepagoConstantesFunciones.activarid_periodoDetallePago,false,"id_periodoDetallePago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE));

		if(this.detallepagoConstantesFunciones.mostrarid_asiento_contableDetallePago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AsientoContableTableCell(this.asientocontablesForeignKey,this.detallepagoConstantesFunciones.resaltarid_asiento_contableDetallePago,this,this.detallepagoConstantesFunciones.activarid_asiento_contableDetallePago,iSizeTabla));
			tableColumn.setCellEditor(new AsientoContableTableCell(this.asientocontablesForeignKey,this.detallepagoConstantesFunciones.resaltarid_asiento_contableDetallePago,this,this.detallepagoConstantesFunciones.activarid_asiento_contableDetallePago,true,"id_asiento_contableDetallePago","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO));

		if(this.detallepagoConstantesFunciones.mostrarid_tipo_forma_pagoDetallePago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.detallepagoConstantesFunciones.resaltarid_tipo_forma_pagoDetallePago,this,this.detallepagoConstantesFunciones.activarid_tipo_forma_pagoDetallePago,iSizeTabla));
			tableColumn.setCellEditor(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.detallepagoConstantesFunciones.resaltarid_tipo_forma_pagoDetallePago,this,this.detallepagoConstantesFunciones.activarid_tipo_forma_pagoDetallePago,true,"id_tipo_forma_pagoDetallePago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_VALOR));

		if(this.detallepagoConstantesFunciones.mostrarvalorDetallePago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepagoConstantesFunciones.resaltarvalorDetallePago,this.detallepagoConstantesFunciones.activarvalorDetallePago,iSizeTabla,this,true,"valorDetallePago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagoConstantesFunciones.resaltarvalorDetallePago,this.detallepagoConstantesFunciones.activarvalorDetallePago,this,true,"valorDetallePago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_NUMEROFILA));

		if(this.detallepagoConstantesFunciones.mostrarnumero_filaDetallePago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoConstantesFunciones.LABEL_NUMEROFILA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepagoConstantesFunciones.resaltarnumero_filaDetallePago,this.detallepagoConstantesFunciones.activarnumero_filaDetallePago,iSizeTabla,this,true,"numero_filaDetallePago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagoConstantesFunciones.resaltarnumero_filaDetallePago,this.detallepagoConstantesFunciones.activarnumero_filaDetallePago,this,true,"numero_filaDetallePago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDANIO));

		if(this.detallepagoConstantesFunciones.mostrarid_anioDetallePago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.detallepagoConstantesFunciones.resaltarid_anioDetallePago,this,this.detallepagoConstantesFunciones.activarid_anioDetallePago,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.detallepagoConstantesFunciones.resaltarid_anioDetallePago,this,this.detallepagoConstantesFunciones.activarid_anioDetallePago,true,"id_anioDetallePago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,DetallePagoConstantesFunciones.LABEL_IDMES));

		if(this.detallepagoConstantesFunciones.mostrarid_mesDetallePago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.detallepagoConstantesFunciones.resaltarid_mesDetallePago,this,this.detallepagoConstantesFunciones.activarid_mesDetallePago,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.detallepagoConstantesFunciones.resaltarid_mesDetallePago,this,this.detallepagoConstantesFunciones.activarid_mesDetallePago,true,"id_mesDetallePago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallepagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallepagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallePago.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallepagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallepagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallePago.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetallePago && this.isPermisoGuardarCambiosDetallePago) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallepagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallepagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetallePago.addColumn(tableColumn);
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
			
			this.jTableDatosDetallePago.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallePago && this.isPermisoGuardarCambiosDetallePago) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallePago && this.isPermisoGuardarCambiosDetallePago) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetallePago.moveColumn(this.jTableDatosDetallePago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetallePago.moveColumn(this.jTableDatosDetallePago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetallePago.moveColumn(this.jTableDatosDetallePago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetallePago.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetallePago.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetallePago,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetallePagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetallePago.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetallePago.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetallePagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetallePago.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetallePago.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetallePago.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detallepagoLogic.getDetallePagos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallepagos.size()-1;
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
		//this.jTableDatosDetallePago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetallePago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetallePago();
			
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
				
				//this.isEsNuevoDetallePago=false;
					
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
				if(this.detallepagoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetallePago==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallePago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallePago.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallepago.getsType().equals("DUPLICADO")
				   || this.detallepago.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetallePago=true;
				
				} else {
					this.isEsNuevoDetallePago=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
					if(this.detallepago.getId()>=0 && !this.detallepago.getIsNew()) {						
						this.isEsNuevoDetallePago=false;
						
					} else {
						this.isEsNuevoDetallePago=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetallePago(esRelaciones);						
				
				this.seleccionarDetallePago(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallepago.getId()<0) {
					this.isEsNuevoDetallePago=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetallePago(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetallePago(evt,rowIndex);
				}	
				
				if(this.detallepagoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetallePago: " + this.dDif); 
					}
				}								
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetallePago(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallepago)) {
					if(this.detallepago.getId()>0) {
						this.detallepago.setIsDeleted(true);
						
						this.detallepagosEliminados.add(this.detallepago);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallepagoLogic.getDetallePagos().remove(this.detallepago);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallepagos.remove(this.detallepago);				
					}
					
					
					((DetallePagoModel) this.jTableDatosDetallePago.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePago(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetallePago(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetallePago) {
			
			if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallePago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallePago.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetallePagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetallePago(this.detallepago);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detallepagoConstantesFunciones.cargarid_empresaDetallePago || this.detallepagoConstantesFunciones.event_dependid_empresaDetallePago) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detallepago.getid_empresa());
									//this.inicializarActualizarBindingDetallePago(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detallepago.getEmpresa()!=null) {
							this.empresasForeignKey.add(detallepago.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detallepago.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detallepagoConstantesFunciones.cargarid_sucursalDetallePago || this.detallepagoConstantesFunciones.event_dependid_sucursalDetallePago) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detallepago.getid_sucursal());
									//this.inicializarActualizarBindingDetallePago(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detallepago.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detallepago.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detallepago.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.detallepagoConstantesFunciones.cargarid_ejercicioDetallePago || this.detallepagoConstantesFunciones.event_dependid_ejercicioDetallePago) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.detallepago.getid_ejercicio());
									//this.inicializarActualizarBindingDetallePago(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(detallepago.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(detallepago.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.detallepago.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.detallepagoConstantesFunciones.cargarid_periodoDetallePago || this.detallepagoConstantesFunciones.event_dependid_periodoDetallePago) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.detallepago.getid_periodo());
									//this.inicializarActualizarBindingDetallePago(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(detallepago.getPeriodo()!=null) {
							this.periodosForeignKey.add(detallepago.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.detallepago.getid_periodo(),false,"Formulario");

					//AsientoContable
					if(!this.detallepagoConstantesFunciones.cargarid_asiento_contableDetallePago || this.detallepagoConstantesFunciones.event_dependid_asiento_contableDetallePago) {
						//this.cargarCombosAsientoContablesForeignKeyLista(" where id="+this.detallepago.getid_asiento_contable());
									//this.inicializarActualizarBindingDetallePago(false,false);
						this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

						if(detallepago.getAsientoContable()!=null) {
							this.asientocontablesForeignKey.add(detallepago.getAsientoContable());
						}

						this.addItemDefectoCombosForeignKeyAsientoContable();
						this.cargarCombosFrameAsientoContablesForeignKey("Todos");
					}
					this.setActualAsientoContableForeignKey(this.detallepago.getid_asiento_contable(),false,"Formulario");

					//TipoFormaPago
					if(!this.detallepagoConstantesFunciones.cargarid_tipo_forma_pagoDetallePago || this.detallepagoConstantesFunciones.event_dependid_tipo_forma_pagoDetallePago) {
						//this.cargarCombosTipoFormaPagosForeignKeyLista(" where id="+this.detallepago.getid_tipo_forma_pago());
									//this.inicializarActualizarBindingDetallePago(false,false);
						this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

						if(detallepago.getTipoFormaPago()!=null) {
							this.tipoformapagosForeignKey.add(detallepago.getTipoFormaPago());
						}

						this.addItemDefectoCombosForeignKeyTipoFormaPago();
						this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");
					}
					this.setActualTipoFormaPagoForeignKey(this.detallepago.getid_tipo_forma_pago(),false,"Formulario");

					//Anio
					if(!this.detallepagoConstantesFunciones.cargarid_anioDetallePago || this.detallepagoConstantesFunciones.event_dependid_anioDetallePago) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.detallepago.getid_anio());
									//this.inicializarActualizarBindingDetallePago(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(detallepago.getAnio()!=null) {
							this.aniosForeignKey.add(detallepago.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.detallepago.getid_anio(),false,"Formulario");

					//Mes
					if(!this.detallepagoConstantesFunciones.cargarid_mesDetallePago || this.detallepagoConstantesFunciones.event_dependid_mesDetallePago) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.detallepago.getid_mes());
									//this.inicializarActualizarBindingDetallePago(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(detallepago.getMes()!=null) {
							this.messForeignKey.add(detallepago.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.detallepago.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetallePago("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetallePago(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePago() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallePago(DetallePago detallepago) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetallePago(detallepago,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallePago(DetallePago detallepago,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetallePago(detallepago);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetallePago(detallepago,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetallePago(detallepago);
	}
	
	public void setVariablesObjetoActualToFormularioDetallePago(DetallePago detallepago) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetallePago.jLabelidDetallePago.setText(detallepago.getId().toString());
			this.jInternalFrameDetalleFormDetallePago.jTextFieldvalorDetallePago.setText(detallepago.getvalor().toString());
			this.jInternalFrameDetalleFormDetallePago.jTextFieldnumero_filaDetallePago.setText(detallepago.getnumero_fila().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetallePago detallepagoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallepagoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetallePago detallepagoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallepagoLocal=this.detallepago;
			} else {
				detallepagoLocal=this.detallepagoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallepagoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetallePago(detallepagoLocal,true);
					
					if(detallepagoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallepagoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallepagoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallepagoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetallePago(DetallePago detallepago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallePago(detallepago,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(detallepago);
	}
	
	public void setVariablesFormularioToObjetoActualDetallePago(DetallePago detallepago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallePago(detallepago,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetallePago(DetallePago detallepago,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetallePago.jLabelidDetallePago.getText()==null || this.jInternalFrameDetalleFormDetallePago.jLabelidDetallePago.getText()=="" || this.jInternalFrameDetalleFormDetallePago.jLabelidDetallePago.getText()=="Id") {
				this.jInternalFrameDetalleFormDetallePago.jLabelidDetallePago.setText("0");
			}

			if(conColumnasBase) {detallepago.setId(Long.parseLong(this.jInternalFrameDetalleFormDetallePago.jLabelidDetallePago.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelIdDetallePago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepago.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormDetallePago.jTextFieldvalorDetallePago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelvalorDetallePago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepago.setnumero_fila(Integer.parseInt(this.jInternalFrameDetalleFormDetallePago.jTextFieldnumero_filaDetallePago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagoConstantesFunciones.LABEL_NUMEROFILA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePago.jLabelnumero_filaDetallePago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallePago(DetallePago detallepagoBean,DetallePago detallepago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetallePago(DetallePago detallepagoOrigen,DetallePago detallepago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallepagoOrigen.getId()!=null && !detallepagoOrigen.getId().equals(0L))) {detallepago.setId(detallepagoOrigen.getId());}}
			if(conDefault || (!conDefault && detallepagoOrigen.getvalor()!=null && !detallepagoOrigen.getvalor().equals(0.0))) {detallepago.setvalor(detallepagoOrigen.getvalor());}
			if(conDefault || (!conDefault && detallepagoOrigen.getnumero_fila()!=null && !detallepagoOrigen.getnumero_fila().equals(0))) {detallepago.setnumero_fila(detallepagoOrigen.getnumero_fila());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallePago(DetallePago detallepago) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallePago.jLabelidDetallePago.setText(detallepago.getId().toString());
			this.jInternalFrameDetalleFormDetallePago.jTextFieldvalorDetallePago.setText(detallepago.getvalor().toString());
			this.jInternalFrameDetalleFormDetallePago.jTextFieldnumero_filaDetallePago.setText(detallepago.getnumero_fila().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallePago(DetallePagoBean detallepagoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallePago.jLabelidDetallePago.setText(detallepagoBean.getId().toString());
			this.jInternalFrameDetalleFormDetallePago.jTextFieldvalorDetallePago.setText(detallepagoBean.getvalor().toString());
			this.jInternalFrameDetalleFormDetallePago.jTextFieldnumero_filaDetallePago.setText(detallepagoBean.getnumero_fila().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetallePago(DetallePagoParameterReturnGeneral detallepagoReturnGeneral,DetallePagoBean detallepagoBean,Boolean conDefault) throws Exception { 
		try {
			DetallePago detallepagoLocal=new DetallePago();
			
			detallepagoLocal=detallepagoReturnGeneral.getDetallePago();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallepagoLocal.getId()!=null && !detallepagoLocal.getId().equals(0L))) {detallepagoBean.setId(detallepagoLocal.getId());}}
			if(conDefault || (!conDefault && detallepagoLocal.getvalor()!=null && !detallepagoLocal.getvalor().equals(0.0))) {detallepagoBean.setvalor(detallepagoLocal.getvalor());}
			if(conDefault || (!conDefault && detallepagoLocal.getnumero_fila()!=null && !detallepagoLocal.getnumero_fila().equals(0))) {detallepagoBean.setnumero_fila(detallepagoLocal.getnumero_fila());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetallePagoGenerico(Long idDetallePagoSeleccionado,JComboBox jComboBoxDetallePago,List<DetallePago> detallepagosLocal)throws Exception {
		try {
			DetallePago  detallepagoTemp=null;

			for(DetallePago detallepagoAux:detallepagosLocal) {
				if(detallepagoAux.getId()!=null && detallepagoAux.getId().equals(idDetallePagoSeleccionado)) {
					detallepagoTemp=detallepagoAux;
					break;
				}
			}

			jComboBoxDetallePago.setSelectedItem(detallepagoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetallePagoGenerico(JComboBox jComboBoxDetallePago,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallePago.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetallePago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallePago.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetallePago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepago=(DetallePago) detallepagoLogic.getDetallePagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallepago =(DetallePago) detallepagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallepago.getIsNew() && !detallepago.getIsChanged() && !detallepago.getIsDeleted()) {
				sDescripcion=detallepago.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallepago.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detallepago.getIsNew() && !detallepago.getIsChanged() && !detallepago.getIsDeleted()) {
				sDescripcion=detallepago.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detallepago.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!detallepago.getIsNew() && !detallepago.getIsChanged() && !detallepago.getIsDeleted()) {
				sDescripcion=detallepago.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=detallepago.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!detallepago.getIsNew() && !detallepago.getIsChanged() && !detallepago.getIsDeleted()) {
				sDescripcion=detallepago.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=detallepago.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("AsientoContable")) {
			//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
			if(!detallepago.getIsNew() && !detallepago.getIsChanged() && !detallepago.getIsDeleted()) {
				sDescripcion=detallepago.getasientocontable_descripcion();
			} else {
				//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
				sDescripcion=detallepago.getasientocontable_descripcion();
			}
		}

		if(sTipo.equals("TipoFormaPago")) {
			//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
			if(!detallepago.getIsNew() && !detallepago.getIsChanged() && !detallepago.getIsDeleted()) {
				sDescripcion=detallepago.gettipoformapago_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
				sDescripcion=detallepago.gettipoformapago_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!detallepago.getIsNew() && !detallepago.getIsChanged() && !detallepago.getIsDeleted()) {
				sDescripcion=detallepago.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=detallepago.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!detallepago.getIsNew() && !detallepago.getIsChanged() && !detallepago.getIsDeleted()) {
				sDescripcion=detallepago.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=detallepago.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetallePago detallepagoRow=new DetallePago();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepagoRow=(DetallePago) detallepagoLogic.getDetallePagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallepagoRow=(DetallePago) detallepagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetallePago(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetallePago.setVisible((this.isVisibilidadCeldaNuevoDetallePago && this.isPermisoNuevoDetallePago));			
			this.jButtonDuplicarDetallePago.setVisible((this.isVisibilidadCeldaDuplicarDetallePago && this.isPermisoDuplicarDetallePago));			
			this.jButtonCopiarDetallePago.setVisible((this.isVisibilidadCeldaCopiarDetallePago && this.isPermisoCopiarDetallePago));
			this.jButtonVerFormDetallePago.setVisible((this.isVisibilidadCeldaVerFormDetallePago && this.isPermisoVerFormDetallePago));
			
			this.jButtonAbrirOrderByDetallePago.setVisible((this.isVisibilidadCeldaOrdenDetallePago && this.isPermisoOrdenDetallePago));			
			
			this.jButtonNuevoRelacionesDetallePago.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePago && this.isPermisoNuevoDetallePago));			
			this.jButtonNuevoGuardarCambiosDetallePago.setVisible((this.isVisibilidadCeldaNuevoDetallePago && this.isPermisoNuevoDetallePago && this.isPermisoGuardarCambiosDetallePago));
			
			if(this.jInternalFrameDetalleFormDetallePago!=null) {
			this.jInternalFrameDetalleFormDetallePago.jButtonModificarDetallePago.setVisible((this.isVisibilidadCeldaModificarDetallePago && this.isPermisoActualizarDetallePago));	
			this.jInternalFrameDetalleFormDetallePago.jButtonActualizarDetallePago.setVisible((this.isVisibilidadCeldaActualizarDetallePago && this.isPermisoActualizarDetallePago));	
			this.jInternalFrameDetalleFormDetallePago.jButtonEliminarDetallePago.setVisible((this.isVisibilidadCeldaEliminarDetallePago && this.isPermisoEliminarDetallePago));
			this.jInternalFrameDetalleFormDetallePago.jButtonCancelarDetallePago.setVisible(this.isVisibilidadCeldaCancelarDetallePago);							
			this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosDetallePago.setVisible((this.isVisibilidadCeldaGuardarDetallePago && this.isPermisoGuardarCambiosDetallePago));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetallePago.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePago && this.isPermisoGuardarCambiosDetallePago));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetallePago.setVisible((this.isVisibilidadCeldaNuevoDetallePago && this.isPermisoNuevoDetallePago));						
			this.jButtonDuplicarToolBarDetallePago.setVisible((this.isVisibilidadCeldaDuplicarDetallePago && this.isPermisoDuplicarDetallePago));						
			this.jButtonCopiarToolBarDetallePago.setVisible((this.isVisibilidadCeldaCopiarDetallePago && this.isPermisoCopiarDetallePago));			
			this.jButtonVerFormToolBarDetallePago.setVisible((this.isVisibilidadCeldaVerFormDetallePago && this.isPermisoVerFormDetallePago));			
			this.jButtonAbrirOrderByToolBarDetallePago.setVisible((this.isVisibilidadCeldaOrdenDetallePago && this.isPermisoOrdenDetallePago));
			this.jButtonNuevoRelacionesToolBarDetallePago.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePago && this.isPermisoNuevoDetallePago));			
			this.jButtonNuevoGuardarCambiosToolBarDetallePago.setVisible((this.isVisibilidadCeldaNuevoDetallePago && this.isPermisoNuevoDetallePago && this.isPermisoGuardarCambiosDetallePago));			
			
			if(this.jInternalFrameDetalleFormDetallePago!=null) {
			this.jInternalFrameDetalleFormDetallePago.jButtonModificarToolBarDetallePago.setVisible((this.isVisibilidadCeldaModificarDetallePago && this.isPermisoActualizarDetallePago));	
			this.jInternalFrameDetalleFormDetallePago.jButtonActualizarToolBarDetallePago.setVisible((this.isVisibilidadCeldaActualizarDetallePago  && this.isPermisoActualizarDetallePago));	
			this.jInternalFrameDetalleFormDetallePago.jButtonEliminarToolBarDetallePago.setVisible((this.isVisibilidadCeldaEliminarDetallePago && this.isPermisoEliminarDetallePago));
			this.jInternalFrameDetalleFormDetallePago.jButtonCancelarToolBarDetallePago.setVisible(this.isVisibilidadCeldaCancelarDetallePago);				
			this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosToolBarDetallePago.setVisible((this.isVisibilidadCeldaGuardarDetallePago && this.isPermisoGuardarCambiosDetallePago));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetallePago.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePago && this.isPermisoGuardarCambiosDetallePago));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetallePago.setVisible((this.isVisibilidadCeldaNuevoDetallePago && this.isPermisoNuevoDetallePago));			
			this.jMenuItemDuplicarDetallePago.setVisible((this.isVisibilidadCeldaDuplicarDetallePago && this.isPermisoDuplicarDetallePago));			
			this.jMenuItemCopiarDetallePago.setVisible((this.isVisibilidadCeldaCopiarDetallePago && this.isPermisoCopiarDetallePago));			
			this.jMenuItemVerFormDetallePago.setVisible((this.isVisibilidadCeldaVerFormDetallePago && this.isPermisoVerFormDetallePago));			
			this.jMenuItemAbrirOrderByDetallePago.setVisible((this.isVisibilidadCeldaOrdenDetallePago && this.isPermisoOrdenDetallePago));			
			//this.jMenuItemMostrarOcultarDetallePago.setVisible((this.isVisibilidadCeldaOrdenDetallePago && this.isPermisoOrdenDetallePago));
			this.jMenuItemDetalleAbrirOrderByDetallePago.setVisible((this.isVisibilidadCeldaOrdenDetallePago && this.isPermisoOrdenDetallePago));			
			//this.jMenuItemDetalleMostrarOcultarDetallePago.setVisible((this.isVisibilidadCeldaOrdenDetallePago && this.isPermisoOrdenDetallePago));			
			this.jMenuItemNuevoRelacionesDetallePago.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePago && this.isPermisoNuevoDetallePago));			
			this.jMenuItemNuevoGuardarCambiosDetallePago.setVisible((this.isVisibilidadCeldaNuevoDetallePago && this.isPermisoNuevoDetallePago && this.isPermisoGuardarCambiosDetallePago));									
			
			if(this.jInternalFrameDetalleFormDetallePago!=null) {
			this.jInternalFrameDetalleFormDetallePago.jMenuItemModificarDetallePago.setVisible((this.isVisibilidadCeldaModificarDetallePago && this.isPermisoActualizarDetallePago));	
			this.jInternalFrameDetalleFormDetallePago.jMenuItemActualizarDetallePago.setVisible((this.isVisibilidadCeldaActualizarDetallePago && this.isPermisoActualizarDetallePago));	
			this.jInternalFrameDetalleFormDetallePago.jMenuItemEliminarDetallePago.setVisible((this.isVisibilidadCeldaEliminarDetallePago && this.isPermisoEliminarDetallePago));
			this.jInternalFrameDetalleFormDetallePago.jMenuItemCancelarDetallePago.setVisible(this.isVisibilidadCeldaCancelarDetallePago);				
			}
			
			this.jMenuItemGuardarCambiosDetallePago.setVisible((this.isVisibilidadCeldaGuardarDetallePago && this.isPermisoGuardarCambiosDetallePago));						
			this.jMenuItemGuardarCambiosTablaDetallePago.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePago && this.isPermisoGuardarCambiosDetallePago));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetallePago=this.jButtonNuevoDetallePago.isVisible();
			this.isVisibilidadCeldaDuplicarDetallePago=this.jButtonDuplicarDetallePago.isVisible();
			this.isVisibilidadCeldaCopiarDetallePago=this.jButtonCopiarDetallePago.isVisible();
			this.isVisibilidadCeldaVerFormDetallePago=this.jButtonVerFormDetallePago.isVisible();
			
			this.isVisibilidadCeldaOrdenDetallePago=this.jButtonAbrirOrderByDetallePago.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=this.jButtonNuevoRelacionesDetallePago.isVisible();
			this.isVisibilidadCeldaModificarDetallePago=this.jButtonModificarDetallePago.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePago!=null) {
			this.isVisibilidadCeldaActualizarDetallePago=this.jInternalFrameDetalleFormDetallePago.jButtonActualizarDetallePago.isVisible();
			this.isVisibilidadCeldaEliminarDetallePago=this.jInternalFrameDetalleFormDetallePago.jButtonEliminarDetallePago.isVisible();
			this.isVisibilidadCeldaCancelarDetallePago=this.jInternalFrameDetalleFormDetallePago.jButtonCancelarDetallePago.isVisible();
			this.isVisibilidadCeldaGuardarDetallePago=this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosDetallePago.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetallePago=this.jButtonGuardarCambiosTablaDetallePago.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetallePago=this.jButtonNuevoToolBarDetallePago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=this.jButtonNuevoRelacionesToolBarDetallePago.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePago!=null) {
			this.isVisibilidadCeldaModificarDetallePago=this.jInternalFrameDetalleFormDetallePago.jButtonModificarToolBarDetallePago.isVisible();
			this.isVisibilidadCeldaActualizarDetallePago=this.jInternalFrameDetalleFormDetallePago.jButtonActualizarToolBarDetallePago.isVisible();
			this.isVisibilidadCeldaEliminarDetallePago=this.jInternalFrameDetalleFormDetallePago.jButtonEliminarToolBarDetallePago.isVisible();
			this.isVisibilidadCeldaCancelarDetallePago=this.jInternalFrameDetalleFormDetallePago.jButtonCancelarToolBarDetallePago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallePago=this.jButtonGuardarCambiosToolBarDetallePago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallePago=this.jButtonGuardarCambiosTablaToolBarDetallePago.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetallePago=this.jMenuItemNuevoDetallePago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=this.jMenuItemNuevoRelacionesDetallePago.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePago!=null) {
			this.isVisibilidadCeldaModificarDetallePago=this.jInternalFrameDetalleFormDetallePago.jMenuItemModificarDetallePago.isVisible();
			this.isVisibilidadCeldaActualizarDetallePago=this.jInternalFrameDetalleFormDetallePago.jMenuItemActualizarDetallePago.isVisible();
			this.isVisibilidadCeldaEliminarDetallePago=this.jInternalFrameDetalleFormDetallePago.jMenuItemEliminarDetallePago.isVisible();
			this.isVisibilidadCeldaCancelarDetallePago=this.jInternalFrameDetalleFormDetallePago.jMenuItemCancelarDetallePago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallePago=this.jMenuItemGuardarCambiosDetallePago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallePago=this.jMenuItemGuardarCambiosTablaDetallePago.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetallePago(Boolean esInicializar) {
		if(DetallePagoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallepagoSessionBean.getConGuardarRelaciones()) {
				//if(this.detallepagoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetallePago();
			}
			
			this.inicializarActualizarBindingBotonesManualDetallePago(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetallePago() {
		this.jButtonNuevoDetallePago.setVisible(this.isPermisoNuevoDetallePago);			
		this.jButtonDuplicarDetallePago.setVisible(this.isPermisoDuplicarDetallePago);			
		this.jButtonCopiarDetallePago.setVisible(this.isPermisoCopiarDetallePago);			
		this.jButtonVerFormDetallePago.setVisible(this.isPermisoVerFormDetallePago);			
		
		this.jButtonAbrirOrderByDetallePago.setVisible(this.isPermisoOrdenDetallePago);					
		
		this.jButtonNuevoRelacionesDetallePago.setVisible(this.isPermisoNuevoDetallePago);			
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jButtonModificarDetallePago.setVisible(this.isPermisoActualizarDetallePago);	
			this.jInternalFrameDetalleFormDetallePago.jButtonActualizarDetallePago.setVisible(this.isPermisoActualizarDetallePago);	
			this.jInternalFrameDetalleFormDetallePago.jButtonEliminarDetallePago.setVisible(this.isPermisoEliminarDetallePago);
			this.jInternalFrameDetalleFormDetallePago.jButtonCancelarDetallePago.setVisible(this.isVisibilidadCeldaCancelarDetallePago);						
			this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosDetallePago.setVisible(this.isPermisoGuardarCambiosDetallePago);							
		}
		
		this.jButtonGuardarCambiosTablaDetallePago.setVisible(this.isPermisoActualizarDetallePago);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallePago() {
		this.jInternalFrameDetalleFormDetallePago.jButtonModificarDetallePago.setVisible(this.isPermisoActualizarDetallePago);	
		this.jInternalFrameDetalleFormDetallePago.jButtonActualizarDetallePago.setVisible(this.isPermisoActualizarDetallePago);	
		this.jInternalFrameDetalleFormDetallePago.jButtonEliminarDetallePago.setVisible(this.isPermisoEliminarDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jButtonCancelarDetallePago.setVisible(this.isVisibilidadCeldaCancelarDetallePago);							
		this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosDetallePago.setVisible((this.isVisibilidadCeldaGuardarDetallePago && this.isPermisoGuardarCambiosDetallePago));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetallePago() {
		if(DetallePagoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetallePago();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetallePago() {
	}
	
	public void jTableDatosDetallePagoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetallePago(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetallePagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepago==null) {
						this.detallepago = new DetallePago();
					}

					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				}

				if(this.detallepago.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallepago.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetallePagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetallePago(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallepagoLogic.getConnexion());

				if(this.detallepago.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallepago.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePago=(TitledBorder)this.jScrollPanelDatosDetallePago.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetallePago.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetallePagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepago==null) {
						this.detallepago = new DetallePago();
					}

					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				}

				if(this.detallepago.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallepago.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetallePagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetallePago(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detallepagoLogic.getConnexion());

				if(this.detallepago.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detallepago.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePago=(TitledBorder)this.jScrollPanelDatosDetallePago.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetallePago.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetallePagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepago==null) {
						this.detallepago = new DetallePago();
					}

					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				}

				if(this.detallepago.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detallepago.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDetallePagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDetallePago(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.detallepagoLogic.getConnexion());

				if(this.detallepago.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.detallepago.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePago=(TitledBorder)this.jScrollPanelDatosDetallePago.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDetallePago.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDetallePagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepago==null) {
						this.detallepago = new DetallePago();
					}

					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				}

				if(this.detallepago.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.detallepago.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoDetallePagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebDetallePago(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.detallepagoLogic.getConnexion());

				if(this.detallepago.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.detallepago.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePago=(TitledBorder)this.jScrollPanelDatosDetallePago.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderDetallePago.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoDetallePagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepago==null) {
						this.detallepago = new DetallePago();
					}

					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				}

				if(this.detallepago.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.detallepago.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_asiento_contableDetallePagoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="AsientoContable";

			if(!this.sFinalQueryGeneral_asientocontable.equals("")) {
				this.asientocontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_asientocontable);
				this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.asientocontableBeanSwingJInternalFrame.procesarBusqueda(this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingAsientoContable(false);
			}

			if(!this.sFinalQueryComboAsientoContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetallePago=null;
			TitledBorder titledBorderasientocontable=null;

			if(!this.jScrollPanelDatosDetallePago.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetallePago=(TitledBorder)this.jScrollPanelDatosDetallePago.getBorder();
				titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderDetallePago.getTitle() + " -> Asiento Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_asiento_contableDetallePagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoasientocontable=true;

			idTienePermisoasientocontable=this.tienePermisosUsuarioEnPaginaWebDetallePago(AsientoContableConstantesFunciones.CLASSNAME);

			if(idTienePermisoasientocontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);

				this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.asientocontableBeanSwingJInternalFrame.getAsientoContableLogic().setConnexion(this.detallepagoLogic.getConnexion());

				if(this.detallepago.getid_asiento_contable()!=null) {
					this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.asientocontableBeanSwingJInternalFrame.setIdActual(this.detallepago.getid_asiento_contable());
					this.asientocontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsientoContable();
				}

				JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePago=(TitledBorder)this.jScrollPanelDatosDetallePago.getBorder();
				TitledBorder titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderDetallePago.getTitle() + " -> Asiento Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_asiento_contableDetallePagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepago==null) {
						this.detallepago = new DetallePago();
					}

					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				}

				if(this.detallepago.getid_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_asiento_contable = "+this.detallepago.getid_asiento_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_forma_pagoDetallePagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoformapago=true;

			idTienePermisotipoformapago=this.tienePermisosUsuarioEnPaginaWebDetallePago(TipoFormaPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoformapago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);

				this.tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoformapagoBeanSwingJInternalFrame.getTipoFormaPagoLogic().setConnexion(this.detallepagoLogic.getConnexion());

				if(this.detallepago.getid_tipo_forma_pago()!=null) {
					this.tipoformapagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoformapagoBeanSwingJInternalFrame.setIdActual(this.detallepago.getid_tipo_forma_pago());
					this.tipoformapagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormaPago();
				}

				JInternalFrameBase jinternalFrame =this.tipoformapagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePago=(TitledBorder)this.jScrollPanelDatosDetallePago.getBorder();
				TitledBorder titledBordertipoformapago=(TitledBorder)this.tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.getBorder();

				titledBordertipoformapago.setTitle(titledBorderDetallePago.getTitle() + " -> Tipo Forma Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_forma_pagoDetallePagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepago==null) {
						this.detallepago = new DetallePago();
					}

					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				}

				if(this.detallepago.getid_tipo_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_forma_pago = "+this.detallepago.getid_tipo_forma_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorDetallePagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepago==null) {
						this.detallepago = new DetallePago();
					}

					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				}

				if(this.detallepago.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.detallepago.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_filaDetallePagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepago==null) {
						this.detallepago = new DetallePago();
					}

					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				}

				if(this.detallepago.getnumero_fila()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_fila = "+this.detallepago.getnumero_fila().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioDetallePagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebDetallePago(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.detallepagoLogic.getConnexion());

				if(this.detallepago.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.detallepago.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePago=(TitledBorder)this.jScrollPanelDatosDetallePago.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderDetallePago.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioDetallePagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepago==null) {
						this.detallepago = new DetallePago();
					}

					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				}

				if(this.detallepago.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.detallepago.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesDetallePagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebDetallePago(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.detallepagoLogic.getConnexion());

				if(this.detallepago.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.detallepago.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePago=(TitledBorder)this.jScrollPanelDatosDetallePago.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderDetallePago.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesDetallePagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.getdetallepago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepago==null) {
						this.detallepago = new DetallePago();
					}

					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);
				}

				if(this.detallepago.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.detallepago.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioDetallePagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePago(false,false);

			this.getDetallePagosFK_IdAnio();

			this.inicializarActualizarBindingDetallePago(false);

			//if(DetallePagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAsientoContableDetallePagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePago(false,false);

			this.getDetallePagosFK_IdAsientoContable();

			this.inicializarActualizarBindingDetallePago(false);

			//if(DetallePagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioDetallePagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePago(false,false);

			this.getDetallePagosFK_IdEjercicio();

			this.inicializarActualizarBindingDetallePago(false);

			//if(DetallePagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetallePagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePago(false,false);

			this.getDetallePagosFK_IdEmpresa();

			this.inicializarActualizarBindingDetallePago(false);

			//if(DetallePagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesDetallePagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePago(false,false);

			this.getDetallePagosFK_IdMes();

			this.inicializarActualizarBindingDetallePago(false);

			//if(DetallePagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDetallePagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePago(false,false);

			this.getDetallePagosFK_IdPeriodo();

			this.inicializarActualizarBindingDetallePago(false);

			//if(DetallePagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetallePagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePago(false,false);

			this.getDetallePagosFK_IdSucursal();

			this.inicializarActualizarBindingDetallePago(false);

			//if(DetallePagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFormaPagoDetallePagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePago(false,false);

			this.getDetallePagosFK_IdTipoFormaPago();

			this.inicializarActualizarBindingDetallePago(false);

			//if(DetallePagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetallePago() {
		if(this.jInternalFrameDetalleFormDetallePago!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) {
			this.jInternalFrameDetalleFormDetallePago.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetallePago.dispose();
			this.jInternalFrameDetalleFormDetallePago=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetallePago!=null) {
			this.jInternalFrameReporteDinamicoDetallePago.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetallePago.dispose();
			this.jInternalFrameReporteDinamicoDetallePago=null;
		}
		
		if(this.jInternalFrameImportacionDetallePago!=null) {
			this.jInternalFrameImportacionDetallePago.setVisible(false);	    			
			this.jInternalFrameImportacionDetallePago.dispose();
			this.jInternalFrameImportacionDetallePago=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetallePago();
			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetallePago")) {
				jButtonNuevoDetallePagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetallePago")) {
				jButtonDuplicarDetallePagoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetallePago")) {
				jButtonCopiarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetallePago")) {
				jButtonVerFormDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetallePago")) {
				jButtonNuevoDetallePagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetallePago")) {
				jButtonDuplicarDetallePagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetallePago")) {
				jButtonNuevoDetallePagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetallePago")) {
				jButtonDuplicarDetallePagoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetallePago")) {
				jButtonNuevoDetallePagoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetallePago")) {
				jButtonNuevoDetallePagoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetallePago")) {
				jButtonNuevoDetallePagoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetallePago")) {
				jButtonModificarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetallePago")) {
				jButtonModificarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetallePago")) {
				jButtonModificarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetallePago")) {
				jButtonActualizarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetallePago")) {
				jButtonActualizarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetallePago")) {
				jButtonActualizarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetallePago")) {
				jButtonEliminarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetallePago")) {
				jButtonEliminarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetallePago")) {
				jButtonEliminarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetallePago")) {
				jButtonCancelarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetallePago")) {
				jButtonCancelarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetallePago")) {
				jButtonCancelarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetallePago")) {
				jButtonCerrarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetallePago")) {
				jButtonCerrarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetallePago")) {
				jButtonCerrarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetallePago")) {
				jButtonMostrarOcultarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetallePago")) {
				jButtonCancelarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetallePago")) {
				jButtonGuardarCambiosDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetallePago")) {
				jButtonGuardarCambiosDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetallePago")) {
				jButtonCopiarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetallePago")) {
				jButtonVerFormDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetallePago")) {
				jButtonGuardarCambiosDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetallePago")) {
				jButtonCopiarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetallePago")) {
				jButtonVerFormDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetallePago")) {
				jButtonGuardarCambiosDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetallePago")) {
				jButtonGuardarCambiosDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetallePago")) {
				jButtonGuardarCambiosDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetallePago")) {
				jButtonRecargarInformacionDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetallePago")) {
				jButtonRecargarInformacionDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetallePago")) {
				jButtonRecargarInformacionDetallePagoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetallePago")) {
				jButtonAnterioresDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetallePago")) {
				jButtonAnterioresDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetallePago")) {
				jButtonAnterioresDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetallePago")) {
				jButtonSiguientesDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetallePago")) {
				jButtonSiguientesDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetallePago")) {
				jButtonSiguientesDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetallePago") || sTipo.equals("MenuItemDetalleAbrirOrderByDetallePago")) {
				jButtonAbrirOrderByDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetallePago") || sTipo.equals("MenuItemDetalleMostrarOcultarDetallePago")) {
				jButtonMostrarOcultarDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetallePago")) {
				jButtonNuevoGuardarCambiosDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetallePago")) {
				jButtonNuevoGuardarCambiosDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetallePago")) {
				jButtonNuevoGuardarCambiosDetallePagoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetallePago")) {
				jButtonCerrarReporteDinamicoDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetallePago")) {
				jButtonGenerarReporteDinamicoDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetallePago")) {
				
				jButtonGenerarExcelReporteDinamicoDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetallePago")) {
				jButtonCerrarImportacionDetallePagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetallePago")) {
				
				jButtonGenerarImportacionDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetallePago")) {
				
				jButtonAbrirImportacionDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetallePago")) {
				jComboBoxTiposAccionesDetallePagoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetallePago")) {
				jComboBoxTiposRelacionesDetallePagoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetallePago")) {
				jComboBoxTiposAccionesDetallePagoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetallePago")) {
				
				jComboBoxTiposSeleccionarDetallePagoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetallePago")) {
				jTextFieldValorCampoGeneralDetallePagoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetallePago")) {
				jButtonAbrirOrderByDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetallePago")) {
				jButtonAbrirOrderByDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetallePago")) {
				jButtonCerrarOrderByDetallePagoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallePagoBusqueda")) {
				this.jButtonidDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallePagoUpdate")) {
				this.jButtonid_empresaDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallePagoBusqueda")) {
				this.jButtonid_empresaDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetallePagoUpdate")) {
				this.jButtonid_sucursalDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetallePagoBusqueda")) {
				this.jButtonid_sucursalDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetallePagoUpdate")) {
				this.jButtonid_ejercicioDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetallePagoBusqueda")) {
				this.jButtonid_ejercicioDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetallePagoUpdate")) {
				this.jButtonid_periodoDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetallePagoBusqueda")) {
				this.jButtonid_periodoDetallePagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePago")) {
				this.jButtonid_asiento_contableDetallePagoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePagoUpdate")) {
				this.jButtonid_asiento_contableDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePagoBusqueda")) {
				this.jButtonid_asiento_contableDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoDetallePagoUpdate")) {
				this.jButtonid_tipo_forma_pagoDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoDetallePagoBusqueda")) {
				this.jButtonid_tipo_forma_pagoDetallePagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetallePagoBusqueda")) {
				this.jButtonvalorDetallePagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_filaDetallePagoBusqueda")) {
				this.jButtonnumero_filaDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDetallePagoUpdate")) {
				this.jButtonid_anioDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDetallePagoBusqueda")) {
				this.jButtonid_anioDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDetallePagoUpdate")) {
				this.jButtonid_mesDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDetallePagoBusqueda")) {
				this.jButtonid_mesDetallePagoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_asiento_contableDetallePago")) {
				this.jButtonid_asiento_contableDetallePagoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAsientoContableDetallePago")) {
				this.jButtonFK_IdAsientoContableDetallePagoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoFormaPagoDetallePago")) {
				this.jButtonFK_IdTipoFormaPagoDetallePagoActionPerformed(evt);
			}
			
			;
			
			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetallePago();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				


				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetallePago detallepagoLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallepagoLocal=this.detallepago;
			} else {
				detallepagoLocal=this.detallepagoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
							
				
				


				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoAnterior =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagoAnterior =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
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
			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
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
			
			


			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
								
						
				


				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePago.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
								
				
				


				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoAnterior =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagoAnterior =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoAnterior =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagoAnterior =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
							
				
				


				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePago.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagoAnterior =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallepagoAnterior =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
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
			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
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
			
			


			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
								
				
				


				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoAnterior =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagoAnterior =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetallePago")) {
					jCheckBoxSeleccionarTodosDetallePagoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetallePago")) {
					jCheckBoxSeleccionadosDetallePagoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetallePago")) {
					
				}
				
				


				
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
												
				
				


				
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagoAnterior =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallepagoAnterior =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
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
			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
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
			
			


			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePago.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePago.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepago);
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
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
				
				


				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePago.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagoAnterior =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagoAnterior =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetallePago")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetallePagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetallePago.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallepago =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallepago =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallepago);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetallePago")) {
				
				}
				
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetallePago")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetallePago.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetallePago")) {
			
			}
			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetallePago();
			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
			if(sTipo.equals("NuevoDetallePago")) {
				jButtonNuevoDetallePagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetallePago")) {
				jButtonDuplicarDetallePagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetallePago")) {
				jButtonCopiarDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetallePago")) {
				jButtonVerFormDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetallePago")) {
				jButtonNuevoDetallePagoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetallePago")) {
				jButtonModificarDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetallePago")) {
				jButtonActualizarDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetallePago")) {
				jButtonEliminarDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetallePago")) {
				jButtonGuardarCambiosDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetallePago")) {
				jButtonCancelarDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetallePago")) {
				jButtonCerrarDetallePagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetallePago")) {
				jButtonGuardarCambiosDetallePagoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetallePago")) {
				jButtonNuevoGuardarCambiosDetallePagoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetallePago")) {
				jButtonAbrirOrderByDetallePagoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetallePago")) {
				jButtonRecargarInformacionDetallePagoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetallePago")) {
				jButtonAnterioresDetallePagoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetallePago")) {
				jButtonSiguientesDetallePagoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallePagoBusqueda")) {
				this.jButtonidDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallePagoUpdate")) {
				this.jButtonid_empresaDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallePagoBusqueda")) {
				this.jButtonid_empresaDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetallePagoUpdate")) {
				this.jButtonid_sucursalDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetallePagoBusqueda")) {
				this.jButtonid_sucursalDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetallePagoUpdate")) {
				this.jButtonid_ejercicioDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetallePagoBusqueda")) {
				this.jButtonid_ejercicioDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetallePagoUpdate")) {
				this.jButtonid_periodoDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetallePagoBusqueda")) {
				this.jButtonid_periodoDetallePagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePago")) {
				this.jButtonid_asiento_contableDetallePagoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePagoUpdate")) {
				this.jButtonid_asiento_contableDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePagoBusqueda")) {
				this.jButtonid_asiento_contableDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoDetallePagoUpdate")) {
				this.jButtonid_tipo_forma_pagoDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoDetallePagoBusqueda")) {
				this.jButtonid_tipo_forma_pagoDetallePagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetallePagoBusqueda")) {
				this.jButtonvalorDetallePagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_filaDetallePagoBusqueda")) {
				this.jButtonnumero_filaDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDetallePagoUpdate")) {
				this.jButtonid_anioDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDetallePagoBusqueda")) {
				this.jButtonid_anioDetallePagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDetallePagoUpdate")) {
				this.jButtonid_mesDetallePagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDetallePagoBusqueda")) {
				this.jButtonid_mesDetallePagoBusquedaActionPerformed(evt);
			}
			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetallePago();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetallePago")) {
				closingInternalFrameDetallePago();
				
			} else if(sTipo.equals("jButtonCancelarDetallePago")) {
				JInternalFrameBase jInternalFrameDetalleFormDetallePago = (JInternalFrameBase)evt.getSource();
	            	
	            DetallePagoBeanSwingJInternalFrame jInternalFrameParent=(DetallePagoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallePago.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetallePagoActionPerformed(null);
			}
			
			DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallepago,new Object(),this.detallepagoParameterGeneral,this.detallepagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetallePago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetallePago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetallePago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallepago)) {
			if(!esControlTabla) {
				if(DetallePagoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);			
				}
				
				if(this.detallepagoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetallePago(this.detallepago,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallepagoReturnGeneral=detallepagoLogic.procesarEventosDetallePagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepagoLogic.getDetallePagos(),this.detallepago,this.detallepagoParameterGeneral,this.isEsNuevoDetallePago,classes);//this.detallepagoLogic.getDetallePago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetallePago(this.detallepagoReturnGeneral,this.detallepagoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallepagoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetallePago(classes,this.detallepagoReturnGeneral,this.detallepagoBean,false);
					}
						
					if(this.detallepagoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetallePago(this.detallepagoReturnGeneral.getDetallePago());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetallePago(this.detallepagoReturnGeneral.getDetallePago());	
					}
						
					if(this.detallepagoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetallePago(this.detallepagoReturnGeneral.getDetallePago(),classes);//this.detallepagoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetallePago(this.detallepago,classes);//this.detallepagoBean);									
				}
			
				if(DetallePagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetallePago(this.detallepago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePago(this.detallepago);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallepagoAnterior!=null) {
						this.detallepago=this.detallepagoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallepagoReturnGeneral=detallepagoLogic.procesarEventosDetallePagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepagoLogic.getDetallePagos(),this.detallepago,this.detallepagoParameterGeneral,this.isEsNuevoDetallePago,classes);//this.detallepagoLogic.getDetallePago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallepagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallepagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallepagoReturnGeneral.getDetallePago(),detallepagoLogic.getDetallePagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallepagoReturnGeneral.getDetallePago(),this.detallepagos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetallePago.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetallePago.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetallePago();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetallePago() throws Exception {
		
		DetallePagoModel detallepagoModel=(DetallePagoModel)this.jTableDatosDetallePago.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepagoModel.detallepagos=this.detallepagoLogic.getDetallePagos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallepagoModel.detallepagos=this.detallepagos;
		}
		
		
		((DetallePagoModel) this.jTableDatosDetallePago.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetallePago() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallepagoAnterior(),this.detallepagoLogic.getDetallePagos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallepagoAnterior(),this.detallepagos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetallePago();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetallePago(DetallePago detallepago,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
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
										
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepago,new Object(),generalEntityParameterGeneral,this.detallepagoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallepagoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetallePagoConstantesFunciones.getClassesRelationshipsOfDetallePago(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetallePagoConstantesFunciones.getClassesRelationshipsFromStringsOfDetallePago(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetallePago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetallePagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepago,new Object(),generalEntityParameterGeneral,this.detallepagoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetallePago(DetallePagoBean detallepagoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetallePago(ArrayList<Classe> classes,DetallePagoReturnGeneral detallepagoReturnGeneral,DetallePagoBean detallepagoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetallePago(DetallePago detallepago,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallepago)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetallePago = new DetallePagoDetalleFormJInternalFrame(jDesktopPane,this.detallepagoSessionBean.getConGuardarRelaciones(),this.detallepagoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallePago);
		this.jInternalFrameDetalleFormDetallePago.setVisible(false);
		this.jInternalFrameDetalleFormDetallePago.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetallePago.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetallePago.detallepagoLogic=this.detallepagoLogic;
		
		this.cargarCombosFrameForeignKeyDetallePago("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallePago();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallePago();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetallePago("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetallePago();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetallePago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallePago"));
		
		this.jInternalFrameDetalleFormDetallePago.jButtonModificarDetallePago.addActionListener(new ButtonActionListener(this,"ModificarDetallePago"));

		
		this.jInternalFrameDetalleFormDetallePago.jButtonModificarToolBarDetallePago.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallePago"));
					
		this.jInternalFrameDetalleFormDetallePago.jMenuItemModificarDetallePago.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallePago"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePago.jButtonActualizarDetallePago.addActionListener (new ButtonActionListener(this,"ActualizarDetallePago"));
		
		
		this.jInternalFrameDetalleFormDetallePago.jButtonActualizarToolBarDetallePago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallePago"));
						
		this.jInternalFrameDetalleFormDetallePago.jMenuItemActualizarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallePago"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePago.jButtonEliminarDetallePago.addActionListener (new ButtonActionListener(this,"EliminarDetallePago"));
		
		
		this.jInternalFrameDetalleFormDetallePago.jButtonEliminarToolBarDetallePago.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallePago"));
								
		this.jInternalFrameDetalleFormDetallePago.jMenuItemEliminarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallePago"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePago.jButtonCancelarDetallePago.addActionListener (new ButtonActionListener(this,"CancelarDetallePago"));
		
		
		this.jInternalFrameDetalleFormDetallePago.jButtonCancelarToolBarDetallePago.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallePago"));
					
		this.jInternalFrameDetalleFormDetallePago.jMenuItemCancelarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallePago"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetallePago.jMenuItemDetalleCerrarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallePago"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosToolBarDetallePago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePago"));
		
		
		
		this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosToolBarDetallePago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePago"));
		
		
		
		this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallePago"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonidDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_empresaDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_empresaDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_sucursalDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_sucursalDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_ejercicioDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_ejercicioDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_periodoDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_periodoDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoBusqueda"));
		//jButtonid_asiento_contableDetallePago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDetallePagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePago.jButtonid_asiento_contableDetallePago.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePago"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_asiento_contableDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_asiento_contableDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_tipo_forma_pagoDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_tipo_forma_pagoDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetallePagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonvalorDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"valorDetallePagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonnumero_filaDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_filaDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_anioDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_anioDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_mesDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_mesDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetallePago.jTabbedPaneRelacionesDetallePago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallePago"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetallePago"));
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallePago"));
		}
		
		this.jTableDatosDetallePago.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetallePago"));
		
		this.jTableDatosDetallePago.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetallePago"));
		
		this.jButtonNuevoDetallePago.addActionListener(new ButtonActionListener(this,"NuevoDetallePago"));
		
		this.jButtonDuplicarDetallePago.addActionListener(new ButtonActionListener(this,"DuplicarDetallePago"));
		
		this.jButtonCopiarDetallePago.addActionListener(new ButtonActionListener(this,"CopiarDetallePago"));
		
		this.jButtonVerFormDetallePago.addActionListener(new ButtonActionListener(this,"VerFormDetallePago"));
		
		
		this.jButtonNuevoToolBarDetallePago.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetallePago"));
			
		this.jButtonDuplicarToolBarDetallePago.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetallePago"));
			
		this.jMenuItemNuevoDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetallePago"));
			
		this.jMenuItemDuplicarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetallePago"));		
		
		
		this.jButtonNuevoRelacionesDetallePago.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetallePago"));
		
		
		this.jButtonNuevoRelacionesToolBarDetallePago.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetallePago"));
			
		this.jMenuItemNuevoRelacionesDetallePago.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetallePago"));		
		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jButtonModificarDetallePago.addActionListener(new ButtonActionListener(this,"ModificarDetallePago"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jButtonModificarToolBarDetallePago.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallePago"));
			
			this.jInternalFrameDetalleFormDetallePago.jMenuItemModificarDetallePago.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallePago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetallePago.jButtonActualizarDetallePago.addActionListener (new ButtonActionListener(this,"ActualizarDetallePago"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jButtonActualizarToolBarDetallePago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallePago"));
				
			this.jInternalFrameDetalleFormDetallePago.jMenuItemActualizarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallePago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jButtonEliminarDetallePago.addActionListener (new ButtonActionListener(this,"EliminarDetallePago"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jButtonEliminarToolBarDetallePago.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallePago"));
						
			this.jInternalFrameDetalleFormDetallePago.jMenuItemEliminarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallePago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jButtonCancelarDetallePago.addActionListener (new ButtonActionListener(this,"CancelarDetallePago"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jButtonCancelarToolBarDetallePago.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallePago"));
			
			this.jInternalFrameDetalleFormDetallePago.jMenuItemCancelarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallePago"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetallePago.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetallePago"));		
		
		
		this.jButtonCerrarDetallePago.addActionListener (new ButtonActionListener(this,"CerrarDetallePago"));
		
		
		this.jButtonCerrarToolBarDetallePago.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetallePago"));
			
		this.jMenuItemCerrarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetallePago"));
			
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jMenuItemDetalleCerrarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallePago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosDetallePago.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetallePago"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosToolBarDetallePago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePago"));
		}
		
		this.jButtonCopiarToolBarDetallePago.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetallePago"));
			
		this.jButtonVerFormToolBarDetallePago.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetallePago"));
		
		this.jMenuItemGuardarCambiosDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetallePago"));
			
		this.jMenuItemCopiarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetallePago"));		
		
		this.jMenuItemVerFormDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetallePago"));		
		
		
		this.jButtonGuardarCambiosTablaDetallePago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallePago"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetallePago"));
			
		this.jMenuItemGuardarCambiosTablaDetallePago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallePago"));		
		
		
		
		this.jButtonRecargarInformacionDetallePago.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetallePago"));
					
		this.jButtonRecargarInformacionToolBarDetallePago.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetallePago"));
		
		this.jMenuItemRecargarInformacionDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetallePago"));		
		
		
		
		this.jButtonAnterioresDetallePago.addActionListener (new ButtonActionListener(this,"AnterioresDetallePago"));
		
		
		this.jButtonAnterioresToolBarDetallePago.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetallePago"));
		
		this.jMenuItemAnterioresDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetallePago"));		
		
		
		this.jButtonSiguientesDetallePago.addActionListener (new ButtonActionListener(this,"SiguientesDetallePago"));
		
		
		this.jButtonSiguientesToolBarDetallePago.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetallePago"));
			
		this.jMenuItemSiguientesDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetallePago"));
			
		this.jMenuItemAbrirOrderByDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetallePago"));
			
		this.jMenuItemMostrarOcultarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetallePago"));
			
		this.jMenuItemDetalleAbrirOrderByDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetallePago"));
			
		this.jMenuItemDetalleMostarOcultarDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetallePago"));		
		
		
		this.jButtonNuevoGuardarCambiosDetallePago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetallePago"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetallePago"));
			
		this.jMenuItemNuevoGuardarCambiosDetallePago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetallePago"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetallePago.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetallePago"));

		this.jCheckBoxSeleccionadosDetallePago.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetallePago"));
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallePago"));
		}
		
		
		this.jComboBoxTiposRelacionesDetallePago.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetallePago"));
			
		this.jComboBoxTiposAccionesDetallePago.addActionListener (new ButtonActionListener(this,"TiposAccionesDetallePago"));
					
		this.jComboBoxTiposSeleccionarDetallePago.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetallePago"));
			
		this.jTextFieldValorCampoGeneralDetallePago.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetallePago"));		
		
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonidDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_empresaDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_empresaDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_sucursalDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_sucursalDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_ejercicioDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_ejercicioDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_periodoDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_periodoDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoBusqueda"));
		//jButtonid_asiento_contableDetallePago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDetallePagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePago.jButtonid_asiento_contableDetallePago.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePago"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_asiento_contableDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_asiento_contableDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_tipo_forma_pagoDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_tipo_forma_pagoDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetallePagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonvalorDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"valorDetallePagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonnumero_filaDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_filaDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_anioDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_anioDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_mesDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_mesDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAsientoContableDetallePago.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableDetallePago"));

			this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePago.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePago"));

			this.jButtonFK_IdTipoFormaPagoDetallePago.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoDetallePago"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetallePago!=null) {
				this.jInternalFrameReporteDinamicoDetallePago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePago"));
				this.jInternalFrameReporteDinamicoDetallePago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePago"));
				this.jInternalFrameReporteDinamicoDetallePago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePago"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetallePago.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePago"));				
			//this.jButtonGenerarReporteDinamicoDetallePago.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePago"));
			//this.jButtonGenerarExcelReporteDinamicoDetallePago.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePago"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetallePago!=null) {
				this.jInternalFrameImportacionDetallePago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallePago"));
				this.jInternalFrameImportacionDetallePago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallePago"));
				this.jInternalFrameImportacionDetallePago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallePago"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetallePago.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetallePago"));
			
			this.jButtonAbrirOrderByToolBarDetallePago.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetallePago"));			
			
			if(this.jInternalFrameOrderByDetallePago!=null) {
				this.jInternalFrameOrderByDetallePago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallePago"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetallePago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePago.jTabbedPaneRelacionesDetallePago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallePago"));
		
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
            		closingInternalFrameDetallePago();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetallePago.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetallePago = (JInternalFrameBase)event.getSource();
	            	
	            DetallePagoBeanSwingJInternalFrame jInternalFrameParent=(DetallePagoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallePago.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetallePagoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetallePago.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetallePagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetallePago.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetallePago.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetallePago";
		inputMap = this.jButtonNuevoDetallePago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetallePago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallePagoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetallePago";
		inputMap = this.jButtonNuevoRelacionesDetallePago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetallePago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallePagoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetallePago";
		inputMap = this.jButtonModificarDetallePago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetallePago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetallePagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetallePago";
		inputMap = this.jButtonActualizarDetallePago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetallePago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetallePagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetallePago";
		inputMap = this.jButtonEliminarDetallePago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetallePago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetallePagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetallePago";
		inputMap = this.jButtonCancelarDetallePago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetallePago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetallePagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetallePago";
		inputMap = this.jButtonCerrarDetallePago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetallePago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetallePagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetallePago";
		inputMap = this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosDetallePago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetallePago.jButtonGuardarCambiosDetallePago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetallePagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetallePago.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetallePagoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetallePago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetallePagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetallePago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetallePagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetallePago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetallePagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonidDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_empresaDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_empresaDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_sucursalDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_sucursalDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_ejercicioDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_ejercicioDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_periodoDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_periodoDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoBusqueda"));
		//jButtonid_asiento_contableDetallePago.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDetallePagoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePago.jButtonid_asiento_contableDetallePago.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePago"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_asiento_contableDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_asiento_contableDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_tipo_forma_pagoDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_tipo_forma_pagoDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoDetallePagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonvalorDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"valorDetallePagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonnumero_filaDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_filaDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_anioDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_anioDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePago.jButtonid_mesDetallePagoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePago.jButtonid_mesDetallePagoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoBusqueda"));
		
		
		this.jButtonFK_IdAsientoContableDetallePago.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableDetallePago"));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePago.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePago"));

		this.jButtonFK_IdTipoFormaPagoDetallePago.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoDetallePago"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetallePago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetallePagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetallePagoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetallePago.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetallePago(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetallePago detallepagoAux:this.detallepagoLogic.getDetallePagos()) {
					detallepagoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePago detallepagoAux:detallepagos) {
					detallepagoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetallePagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallePago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallePago detallepagoAux:this.detallepagoLogic.getDetallePagos()) {
						detallepagoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePago detallepagoAux:detallepagos) {
						detallepagoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetallePago detallepagoAux:this.detallepagoLogic.getDetallePagos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePago detallepagoAux:detallepagos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetallePago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallePago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallePago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetallePagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallePago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetallePago.getSelectedRows();
			
			DetallePago detallepagoLocal=new DetallePago();
			
			//this.seleccionarTodosDetallePago(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagoLocal =(DetallePago) this.detallepagoLogic.getDetallePagos().toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallepagoLocal =(DetallePago) this.detallepagos.toArray()[this.jTableDatosDetallePago.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallepagoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallePago detallepagoAux:this.detallepagoLogic.getDetallePagos()) {
						detallepagoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePago detallepagoAux:detallepagos) {
						detallepagoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetallePago(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallePago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallePago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallePago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetallePagoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetallePagoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetallePagoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetallePago(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetallePago.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallePago detallepagoAux:this.detallepagoLogic.getDetallePagos()) {
				
						if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detallepagoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_NUMEROFILA)) {
							existe=true;
							detallepagoAux.setnumero_fila(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePago detallepagoAux:detallepagos) {
					
						if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detallepagoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_NUMEROFILA)) {
							existe=true;
							detallepagoAux.setnumero_fila(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetallePago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetallePagoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetallePago(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetallePago=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetallePago.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetallePago) {				
					conSplash=true;//false;										
					
					//this.startProcessDetallePago(conSplash);
				
					this.generarReporteDetallePagosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetallePagosSeleccionados();
				//this.jComboBoxTiposAccionesDetallePago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallePagosSeleccionados(false);
				//this.jComboBoxTiposAccionesDetallePago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallePagosSeleccionados(true);
				//this.jComboBoxTiposAccionesDetallePago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallePago();
				
				this.exportarDetallePagosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetallePagos();
				//this.importarDetallePagos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallePago();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetallePagosSeleccionados();
				//this.jComboBoxTiposAccionesDetallePago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetallePago();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetallePago)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetallePago(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.setSelectedIndex(0);					
				}	
			} 			
			else if(DetallePagoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetallePago) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetallePago(conSplash);
					
						//this.actualizarParametrosGeneralDetallePago();
						
						this.generarReporteProcesoAccionDetallePagosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetallePago.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetallePagoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle PagoS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetallePago();
				
						this.actualizarParametrosGeneralDetallePago();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallepagoReturnGeneral=detallepagoLogic.procesarAccionDetallePagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallepagoLogic.getDetallePagos(),this.detallepagoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetallePagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallePago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetallePago();
					
					DetallePagoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetallePagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallePago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallePago.jComboBoxTiposAccionesFormularioDetallePago.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetallePago(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetallePagoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetallePago();
			
			if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();		
			DetallePago detallepago=new DetallePago();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetallePago(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetallePago.getSelectedItem();
			
			
			
			
			detallepagosSeleccionados=this.getDetallePagosSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallepagosSeleccionados.size()==1) {
				for(DetallePago detallepagoAux:detallepagosSeleccionados) {
					detallepago=detallepagoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetallePago();
			
      		//this.finishProcessDetallePago(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetallePagoReturnGeneral() throws Exception {
		if(this.detallepagoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallepagoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallepagoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallepagoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallepagoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallepagoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetallePago(false);
		}
		
		if(this.detallepagoReturnGeneral.getConRetornoLista() || this.detallepagoReturnGeneral.getConRetornoObjeto()) {
			if(this.detallepagoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallepagoLogic.setDetallePagos(this.detallepagoReturnGeneral.getDetallePagos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detallepagoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallepagoLogic.setDetallePago(this.detallepagoReturnGeneral.getDetallePago());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetallePago(false);
		}
	}
	
	public void actualizarParametrosGeneralDetallePago() throws Exception {
		
		
	}
	
	public ArrayList<DetallePago> getDetallePagosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetallePago) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetallePago detallepagoAux:detallepagoLogic.getDetallePagos()) {
					if(detallepagoAux.getIsSelected()) {
						detallepagosSeleccionados.add(detallepagoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePago detallepagoAux:this.detallepagos) {
					if(detallepagoAux.getIsSelected()) {
						detallepagosSeleccionados.add(detallepagoAux);				
					}
				}
			}
			
			if(detallepagosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallepagosSeleccionados.addAll(this.detallepagoLogic.getDetallePagos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallepagosSeleccionados.addAll(this.detallepagos);				
					}
				}
			}
		} else {
			detallepagosSeleccionados.add(this.detallepago);
		}
		
		return detallepagosSeleccionados;
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
	
	public void generarReporteDetallePagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetallePagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetallePagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallePagosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallePagosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetallePagosSeleccionados() throws Exception {
		ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();		
		
		detallepagosSeleccionados=this.getDetallePagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetallePagos("Todos",detallepagosSeleccionados);
		
	}	
	
	public void generarReporteNormalDetallePagosSeleccionados() throws Exception {
		ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();		
		
		detallepagosSeleccionados=this.getDetallePagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetallePagos("Todos",detallepagosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetallePagosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();
		
		detallepagosSeleccionados=this.getDetallePagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetallePagos("Todos",detallepagosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetallePagosSeleccionados() throws Exception {
		ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetallePago();
		
		
		detallepagosSeleccionados=this.getDetallePagosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetallePago();
		
		
		//this.generarReporteDetallePagos("Todos",detallepagosSeleccionados ,detallepagoImplementable,detallepagoImplementableHome);
	}
	
	public void mostrarImportacionDetallePagos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetallePago();
		
		this.abrirFrameImportacionDetallePago();		
		
			
		//this.generarReporteDetallePagos("Todos",detallepagosSeleccionados ,detallepagoImplementable,detallepagoImplementableHome);
	}
	
	public void importarDetallePagos() throws Exception {		
	
	}
	
	public void exportarDetallePagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetallePagosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetallePagosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetallePagosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetallePagosSeleccionados() throws Exception {
		ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();		
		
		detallepagosSeleccionados=this.getDetallePagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepago."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetallePago(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetallePago detallepagoAux:detallepagosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetallePago(detallepagoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallepagoAux.setsDetalleGeneralEntityReporte(detallepagoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetallePago(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_NUMEROFILA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetallePago(DetallePago detallepago,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallepago.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepago.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepago.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepago.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepago.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepago.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepago.getasientocontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepago.gettipoformapago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepago.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepago.getnumero_fila().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepago.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepago.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetallePagosSeleccionados() throws Exception {
		ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();		
		
		detallepagosSeleccionados=this.getDetallePagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepago.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetallePagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetallePago(row);				
				iRow++;
			}				
			
			for(DetallePago detallepagoAux:detallepagosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetallePago(detallepagoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetallePagosSeleccionados() throws Exception {
		ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();		
		
		detallepagosSeleccionados=this.getDetallePagosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepago.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallepagos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallepago");
			//elementRoot.appendChild(element);
		
			for(DetallePago detallepagoAux:detallepagosSeleccionados) {
				element = document.createElement("detallepago");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetallePago(detallepagoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetallePago(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_NUMEROFILA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetallePago(DetallePago detallepago,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallepago.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepago.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepago.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepago.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepago.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepago.getasientocontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepago.gettipoformapago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepago.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepago.getnumero_fila());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepago.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepago.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlDetallePago(DetallePago detallepago,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetallePagoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallepago.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetallePagoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallepago.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetallePagoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallepago.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetallePagoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detallepago.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(DetallePagoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(detallepago.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(DetallePagoConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(detallepago.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementasientocontable_descripcion = document.createElement(DetallePagoConstantesFunciones.IDASIENTOCONTABLE);
		elementasientocontable_descripcion.appendChild(document.createTextNode(detallepago.getasientocontable_descripcion()));
		element.appendChild(elementasientocontable_descripcion);

		Element elementtipoformapago_descripcion = document.createElement(DetallePagoConstantesFunciones.IDTIPOFORMAPAGO);
		elementtipoformapago_descripcion.appendChild(document.createTextNode(detallepago.gettipoformapago_descripcion()));
		element.appendChild(elementtipoformapago_descripcion);

		Element elementvalor = document.createElement(DetallePagoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(detallepago.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnumero_fila = document.createElement(DetallePagoConstantesFunciones.NUMEROFILA);
		elementnumero_fila.appendChild(document.createTextNode(detallepago.getnumero_fila().toString().trim()));
		element.appendChild(elementnumero_fila);

		Element elementanio_descripcion = document.createElement(DetallePagoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(detallepago.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(DetallePagoConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(detallepago.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoDetallePagosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetallePago> detallepagosSeleccionados=new ArrayList<DetallePago>();
		
		detallepagosSeleccionados=this.getDetallePagosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetallePago(detallepagosSeleccionados);
		
		this.generarReporteDetallePagos("Todos",detallepagosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetallePago(ArrayList<DetallePago> detallepagosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetallePago detallepagoAux:detallepagosSeleccionados) {
				detallepagoAux.setsDetalleGeneralEntityReporte(detallepagoAux.toString());
			
				if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallepagoAux.setsDescripcionGeneralEntityReporte1(detallepagoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detallepagoAux.setsDescripcionGeneralEntityReporte1(detallepagoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					detallepagoAux.setsDescripcionGeneralEntityReporte1(detallepagoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					detallepagoAux.setsDescripcionGeneralEntityReporte1(detallepagoAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE)) {
					existe=true;
					detallepagoAux.setsDescripcionGeneralEntityReporte1(detallepagoAux.getasientocontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO)) {
					existe=true;
					detallepagoAux.setsDescripcionGeneralEntityReporte1(detallepagoAux.gettipoformapago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_NUMEROFILA)) {
					existe=true;
					detallepagoAux.setsDescripcionGeneralEntityReporte1(detallepagoAux.getnumero_fila().toString());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					detallepagoAux.setsDescripcionGeneralEntityReporte1(detallepagoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					detallepagoAux.setsDescripcionGeneralEntityReporte1(detallepagoAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetallePago(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetallePago=true;
				this.isVisibilidadCeldaNuevoRelacionesDetallePago=true;
				this.isVisibilidadCeldaGuardarCambiosDetallePago=true;
			}
			
			this.isVisibilidadCeldaModificarDetallePago=false;
			this.isVisibilidadCeldaActualizarDetallePago=false;
			this.isVisibilidadCeldaEliminarDetallePago=false;
			this.isVisibilidadCeldaCancelarDetallePago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePago=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePago=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetallePago=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePago=false;
			this.isVisibilidadCeldaModificarDetallePago=false;
			this.isVisibilidadCeldaActualizarDetallePago=true;
			this.isVisibilidadCeldaEliminarDetallePago=false;
			this.isVisibilidadCeldaCancelarDetallePago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePago=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePago=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetallePago=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePago=false;
			this.isVisibilidadCeldaModificarDetallePago=false;
			this.isVisibilidadCeldaActualizarDetallePago=true;
			this.isVisibilidadCeldaEliminarDetallePago=true;
			this.isVisibilidadCeldaCancelarDetallePago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePago=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePago=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetallePago=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePago=false;
			this.isVisibilidadCeldaModificarDetallePago=false;
			this.isVisibilidadCeldaActualizarDetallePago=true;
			this.isVisibilidadCeldaEliminarDetallePago=false;
			this.isVisibilidadCeldaCancelarDetallePago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePago=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePago=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetallePago=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=true;
			this.isVisibilidadCeldaGuardarCambiosDetallePago=true;
			this.isVisibilidadCeldaModificarDetallePago=false;
			this.isVisibilidadCeldaActualizarDetallePago=false;
			this.isVisibilidadCeldaEliminarDetallePago=false;
			this.isVisibilidadCeldaCancelarDetallePago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePago=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePago=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetallePago=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePago=false;
			this.isVisibilidadCeldaActualizarDetallePago=false;
			this.isVisibilidadCeldaEliminarDetallePago=false;
			this.isVisibilidadCeldaCancelarDetallePago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePago=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePago=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetallePago=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePago=false;
			this.isVisibilidadCeldaModificarDetallePago=true;
			this.isVisibilidadCeldaActualizarDetallePago=false;
			this.isVisibilidadCeldaEliminarDetallePago=false;
			this.isVisibilidadCeldaCancelarDetallePago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePago=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePago=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetallePagoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetallePago=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=true;
			this.isVisibilidadCeldaGuardarCambiosDetallePago=true;
		} else {
			this.actualizarEstadoPanelsDetallePago(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetallePago=false;
			//this.isVisibilidadCeldaVerFormDetallePago=false;
			this.isVisibilidadCeldaDuplicarDetallePago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallepagoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=false;
		} else {
			this.isVisibilidadCeldaNuevoDetallePago=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallepagoSessionBean.getEsGuardarRelacionado()) {
			if(!detallepagoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetallePago=false;												
			}
			
			this.jButtonCerrarDetallePago.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetallePago=false;
		}
		
		if(!this.permiteMantenimiento(this.detallepago)) {
			this.isVisibilidadCeldaActualizarDetallePago=false;
			this.isVisibilidadCeldaEliminarDetallePago=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetallePago() {
	}
	
	public void actualizarEstadoPanelsDetallePago(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetallePago!=null) {
				this.jScrollPanelDatosEdicionDetallePago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePago!=null) {
				this.jTabbedPaneBusquedasDetallePago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePago!=null) {
				this.jScrollPanelDatosDetallePago.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePago!=null) {
				this.jPanelPaginacionDetallePago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePago!=null) {
				this.jPanelParametrosReportesDetallePago.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetallePago!=null) {
				this.jScrollPanelDatosEdicionDetallePago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePago!=null) {
				this.jTabbedPaneBusquedasDetallePago.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetallePago!=null) {
				this.jScrollPanelDatosDetallePago.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePago!=null) {
				this.jPanelPaginacionDetallePago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePago!=null) {
				this.jPanelParametrosReportesDetallePago.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetallePago!=null) {
				this.jScrollPanelDatosEdicionDetallePago.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePago!=null) {
				this.jTabbedPaneBusquedasDetallePago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallePago!=null) {
				this.jScrollPanelDatosDetallePago.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePago!=null) {
				this.jPanelPaginacionDetallePago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePago!=null) {
				this.jPanelParametrosReportesDetallePago.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetallePago!=null) {
				this.jScrollPanelDatosEdicionDetallePago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePago!=null) {
				this.jTabbedPaneBusquedasDetallePago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallePago!=null) {
				this.jScrollPanelDatosDetallePago.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePago!=null) {
				this.jPanelPaginacionDetallePago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePago!=null) {
				this.jPanelParametrosReportesDetallePago.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetallePago!=null) {
				this.jScrollPanelDatosEdicionDetallePago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePago!=null) {
				this.jTabbedPaneBusquedasDetallePago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePago!=null) {
				this.jScrollPanelDatosDetallePago.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePago!=null) {
				this.jPanelPaginacionDetallePago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePago!=null) {
				this.jPanelParametrosReportesDetallePago.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetallePago!=null) {
				this.jScrollPanelDatosEdicionDetallePago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePago!=null) {
				this.jTabbedPaneBusquedasDetallePago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePago!=null) {
				this.jScrollPanelDatosDetallePago.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePago!=null) {
				this.jPanelPaginacionDetallePago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePago!=null) {
				this.jPanelParametrosReportesDetallePago.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetallePago!=null) {
				this.jScrollPanelDatosEdicionDetallePago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePago!=null) {
				this.jTabbedPaneBusquedasDetallePago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePago!=null) {
				this.jScrollPanelDatosDetallePago.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePago!=null) {
				this.jPanelPaginacionDetallePago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePago!=null) {
				this.jPanelParametrosReportesDetallePago.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallepagoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetallePago!=null) {
					this.jTabbedPaneBusquedasDetallePago.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetallePago!=null) {
				this.jPanelParametrosReportesDetallePago.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePago!=null) {
				this.jTabbedPaneBusquedasDetallePago.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetallePago!=null) {
				this.jPanelParametrosReportesDetallePago.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAsientoContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdAsientoContableDetallePago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdTipoFormaPagoDetallePago);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdAsientoContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdAsientoContableDetallePago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdTipoFormaPagoDetallePago);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdAsientoContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdAsientoContableDetallePago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdTipoFormaPagoDetallePago);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdAsientoContable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdAsientoContableDetallePago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdTipoFormaPagoDetallePago);}
		}
		
	}

	public void setVisibilidadBusquedasParaAsientoContable(Boolean isParaAsientoContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAsientoContableNegation=!isParaAsientoContable;

			this.isVisibilidadFK_IdAsientoContable=isParaAsientoContable;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdAsientoContableDetallePago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdTipoFormaPagoDetallePago);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFormaPago(Boolean isParaTipoFormaPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFormaPagoNegation=!isParaTipoFormaPago;

			this.isVisibilidadFK_IdAsientoContable=isParaTipoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdAsientoContableDetallePago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaTipoFormaPago;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdTipoFormaPagoDetallePago);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAsientoContable=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdAsientoContableDetallePago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdTipoFormaPagoDetallePago);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAsientoContable=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdAsientoContableDetallePago);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasDetallePago.remove(jPanelFK_IdTipoFormaPagoDetallePago);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetallePagoParaBusquedaAsientoContables() throws Exception {
		Boolean isPaginaPopupAsientoContable=false;

		try {

			if(detallepagoSessionBean==null) {
				detallepagoSessionBean=new DetallePagoSessionBean();
			}

			if(asientocontableSessionBean==null) {
				asientocontableSessionBean=new AsientoContableSessionBean();
			}

			asientocontableSessionBean.setsPathNavegacionActual(detallepagoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
			asientocontableSessionBean.setisPermiteRecargarInformacion(false);
			asientocontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupAsientoContable=asientocontableSessionBean.getisPaginaPopup();
			asientocontableSessionBean.setisPaginaPopup(false);
			asientocontableSessionBean.setEstaModoBusqueda(true);
			asientocontableSessionBean.setsFuncionBusquedaRapida("window.opener.detallepagoFuncionGeneral.setCombosCodigoDesdeBusquedaid_asiento_contable(TO_REPLACE);");
			asientocontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAsientoContable(true);
			asientocontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable(DetallePagoConstantesFunciones.SNOMBREOPCION);
			//asientocontableSessionBean.setisBusquedaDesdeForeignKeySesionDetallePago(true);
			//asientocontableSessionBean.setlidDetallePagoActual(this.idDetallePagoActual);

			detallepagoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetallePago(true);
			detallepagoSessionBean.setlIdDetallePagoActualForeignKey(this.idDetallePagoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetallePagoSessionBean detallepagoSessionBean=new DetallePagoSessionBean();
		
		if(this.detallepagoSessionBean==null) {
			this.detallepagoSessionBean=new DetallePagoSessionBean();
		}
		
		this.detallepagoSessionBean.setsUltimaBusquedaDetallePago(this.getsAccionBusqueda());
		this.detallepagoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detallepagoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
			detallepagoSessionBean.setid_asiento_contable(this.getid_asiento_contableFK_IdAsientoContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			detallepagoSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detallepagoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			detallepagoSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detallepagoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
			detallepagoSessionBean.setid_tipo_forma_pago(this.getid_tipo_forma_pagoFK_IdTipoFormaPago());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetallePagoSessionBean detallepagoSessionBean=new DetallePagoSessionBean();
		
		if(this.detallepagoSessionBean==null) {
			this.detallepagoSessionBean=new DetallePagoSessionBean();
		}
		
		if(this.detallepagoSessionBean.getsUltimaBusquedaDetallePago()!=null&&!this.detallepagoSessionBean.getsUltimaBusquedaDetallePago().equals("")) {
			this.setsAccionBusqueda(detallepagoSessionBean.getsUltimaBusquedaDetallePago());
			this.setiNumeroPaginacion(detallepagoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detallepagoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
				this.setid_asiento_contableFK_IdAsientoContable(detallepagoSessionBean.getid_asiento_contable());
				detallepagoSessionBean.setid_asiento_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(detallepagoSessionBean.getid_ejercicio());
				detallepagoSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detallepagoSessionBean.getid_empresa());
				detallepagoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(detallepagoSessionBean.getid_periodo());
				detallepagoSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detallepagoSessionBean.getid_sucursal());
				detallepagoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
				this.setid_tipo_forma_pagoFK_IdTipoFormaPago(detallepagoSessionBean.getid_tipo_forma_pago());
				detallepagoSessionBean.setid_tipo_forma_pago(-1L);
			}
		}
		
		this.detallepagoSessionBean.setsUltimaBusquedaDetallePago("");
		this.detallepagoSessionBean.setiNumeroPaginacion(DetallePagoConstantesFunciones.INUMEROPAGINACION);
		this.detallepagoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetallePago(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetallePago() {
		this.updateBorderResaltarBusquedasFormularioDetallePago();
		this.updateVisibilidadBusquedasFormularioDetallePago();
		this.updateHabilitarBusquedasFormularioDetallePago();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetallePago() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetallePago.getComponents().length>0) {
	

		if(this.detallepagoConstantesFunciones.resaltarFK_IdAsientoContableDetallePago!=null) {
			index= this.jTabbedPaneBusquedasDetallePago.indexOfComponent(this.jPanelFK_IdAsientoContableDetallePago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePago.getComponent(index);
				jPanel.setBorder(this.detallepagoConstantesFunciones.resaltarFK_IdAsientoContableDetallePago);
			}
		}

		if(this.detallepagoConstantesFunciones.resaltarFK_IdTipoFormaPagoDetallePago!=null) {
			index= this.jTabbedPaneBusquedasDetallePago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoDetallePago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePago.getComponent(index);
				jPanel.setBorder(this.detallepagoConstantesFunciones.resaltarFK_IdTipoFormaPagoDetallePago);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetallePago() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetallePago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallePago.indexOfComponent(this.jPanelFK_IdAsientoContableDetallePago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallepagoConstantesFunciones.mostrarFK_IdAsientoContableDetallePago);
			if(!this.detallepagoConstantesFunciones.mostrarFK_IdAsientoContableDetallePago && index>-1) {
				this.jTabbedPaneBusquedasDetallePago.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetallePago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoDetallePago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallepagoConstantesFunciones.mostrarFK_IdTipoFormaPagoDetallePago);
			if(!this.detallepagoConstantesFunciones.mostrarFK_IdTipoFormaPagoDetallePago && index>-1) {
				this.jTabbedPaneBusquedasDetallePago.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetallePago() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetallePago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallePago.indexOfComponent(this.jPanelFK_IdAsientoContableDetallePago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallepagoConstantesFunciones.activarFK_IdAsientoContableDetallePago);
				this.jTabbedPaneBusquedasDetallePago.setEnabledAt(index,this.detallepagoConstantesFunciones.activarFK_IdAsientoContableDetallePago);
			}

			index= this.jTabbedPaneBusquedasDetallePago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoDetallePago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallepagoConstantesFunciones.activarFK_IdTipoFormaPagoDetallePago);
				this.jTabbedPaneBusquedasDetallePago.setEnabledAt(index,this.detallepagoConstantesFunciones.activarFK_IdTipoFormaPagoDetallePago);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetallePago(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAsientoContable")) {
			index= this.jTabbedPaneBusquedasDetallePago.indexOfComponent(this.jPanelFK_IdAsientoContableDetallePago);

			this.jTabbedPaneBusquedasDetallePago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePago.getComponent(index);

			this.detallepagoConstantesFunciones.setResaltarFK_IdAsientoContableDetallePago(resaltar);

			jPanel.setBorder(this.detallepagoConstantesFunciones.resaltarFK_IdAsientoContableDetallePago);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoFormaPago")) {
			index= this.jTabbedPaneBusquedasDetallePago.indexOfComponent(this.jPanelFK_IdTipoFormaPagoDetallePago);

			this.jTabbedPaneBusquedasDetallePago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePago.getComponent(index);

			this.detallepagoConstantesFunciones.setResaltarFK_IdTipoFormaPagoDetallePago(resaltar);

			jPanel.setBorder(this.detallepagoConstantesFunciones.resaltarFK_IdTipoFormaPagoDetallePago);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetallePago.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetallePago() throws Exception {

		if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetallePago();
		this.updateVisibilidadResaltarControlesFormularioDetallePago();
		this.updateHabilitarResaltarControlesFormularioDetallePago();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetallePago() throws Exception {
		if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallepagoConstantesFunciones.resaltaridDetallePago!=null && this.jInternalFrameDetalleFormDetallePago!=null) {this.jInternalFrameDetalleFormDetallePago.jLabelidDetallePago.setBorder(this.detallepagoConstantesFunciones.resaltaridDetallePago);}
		if(this.detallepagoConstantesFunciones.resaltarid_empresaDetallePago!=null && this.jInternalFrameDetalleFormDetallePago!=null) {this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.setBorder(this.detallepagoConstantesFunciones.resaltarid_empresaDetallePago);}
		if(this.detallepagoConstantesFunciones.resaltarid_sucursalDetallePago!=null && this.jInternalFrameDetalleFormDetallePago!=null) {this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.setBorder(this.detallepagoConstantesFunciones.resaltarid_sucursalDetallePago);}
		if(this.detallepagoConstantesFunciones.resaltarid_ejercicioDetallePago!=null && this.jInternalFrameDetalleFormDetallePago!=null) {this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.setBorder(this.detallepagoConstantesFunciones.resaltarid_ejercicioDetallePago);}
		if(this.detallepagoConstantesFunciones.resaltarid_periodoDetallePago!=null && this.jInternalFrameDetalleFormDetallePago!=null) {this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.setBorder(this.detallepagoConstantesFunciones.resaltarid_periodoDetallePago);}
		if(this.detallepagoConstantesFunciones.resaltarid_asiento_contableDetallePago!=null && this.jInternalFrameDetalleFormDetallePago!=null) {this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.setBorder(this.detallepagoConstantesFunciones.resaltarid_asiento_contableDetallePago);}
		if(this.detallepagoConstantesFunciones.resaltarid_tipo_forma_pagoDetallePago!=null && this.jInternalFrameDetalleFormDetallePago!=null) {this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.setBorder(this.detallepagoConstantesFunciones.resaltarid_tipo_forma_pagoDetallePago);}
		if(this.detallepagoConstantesFunciones.resaltarvalorDetallePago!=null && this.jInternalFrameDetalleFormDetallePago!=null) {this.jInternalFrameDetalleFormDetallePago.jTextFieldvalorDetallePago.setBorder(this.detallepagoConstantesFunciones.resaltarvalorDetallePago);}
		if(this.detallepagoConstantesFunciones.resaltarnumero_filaDetallePago!=null && this.jInternalFrameDetalleFormDetallePago!=null) {this.jInternalFrameDetalleFormDetallePago.jTextFieldnumero_filaDetallePago.setBorder(this.detallepagoConstantesFunciones.resaltarnumero_filaDetallePago);}
		if(this.detallepagoConstantesFunciones.resaltarid_anioDetallePago!=null && this.jInternalFrameDetalleFormDetallePago!=null) {this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.setBorder(this.detallepagoConstantesFunciones.resaltarid_anioDetallePago);}
		if(this.detallepagoConstantesFunciones.resaltarid_mesDetallePago!=null && this.jInternalFrameDetalleFormDetallePago!=null) {this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.setBorder(this.detallepagoConstantesFunciones.resaltarid_mesDetallePago);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetallePago() throws Exception {		
		if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) {
	
		//this.jInternalFrameDetalleFormDetallePago.jLabelidDetallePago.setVisible(this.detallepagoConstantesFunciones.mostraridDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jPanelidDetallePago.setVisible(this.detallepagoConstantesFunciones.mostraridDetallePago);
		//this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_empresaDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jPanelid_empresaDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_empresaDetallePago);
		//this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_sucursalDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jPanelid_sucursalDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_sucursalDetallePago);
		//this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_ejercicioDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jPanelid_ejercicioDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_ejercicioDetallePago);
		//this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_periodoDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jPanelid_periodoDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_periodoDetallePago);
		//this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_asiento_contableDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jPanelid_asiento_contableDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_asiento_contableDetallePago);
			this.jInternalFrameDetalleFormDetallePago.jButtonid_asiento_contableDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_asiento_contableDetallePago);
		//this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_tipo_forma_pagoDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jPanelid_tipo_forma_pagoDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_tipo_forma_pagoDetallePago);
		//this.jInternalFrameDetalleFormDetallePago.jTextFieldvalorDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarvalorDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jPanelvalorDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarvalorDetallePago);
		//this.jInternalFrameDetalleFormDetallePago.jTextFieldnumero_filaDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarnumero_filaDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jPanelnumero_filaDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarnumero_filaDetallePago);
		//this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_anioDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jPanelid_anioDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_anioDetallePago);
		//this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_mesDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jPanelid_mesDetallePago.setVisible(this.detallepagoConstantesFunciones.mostrarid_mesDetallePago);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetallePago() throws Exception {
		if(this.jInternalFrameDetalleFormDetallePago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallePago!=null) {
	
		this.jInternalFrameDetalleFormDetallePago.jLabelidDetallePago.setEnabled(this.detallepagoConstantesFunciones.activaridDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_empresaDetallePago.setEnabled(this.detallepagoConstantesFunciones.activarid_empresaDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_sucursalDetallePago.setEnabled(this.detallepagoConstantesFunciones.activarid_sucursalDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_ejercicioDetallePago.setEnabled(this.detallepagoConstantesFunciones.activarid_ejercicioDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_periodoDetallePago.setEnabled(this.detallepagoConstantesFunciones.activarid_periodoDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_asiento_contableDetallePago.setEnabled(this.detallepagoConstantesFunciones.activarid_asiento_contableDetallePago);
			this.jInternalFrameDetalleFormDetallePago.jButtonid_asiento_contableDetallePago.setEnabled(this.detallepagoConstantesFunciones.activarid_asiento_contableDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_tipo_forma_pagoDetallePago.setEnabled(this.detallepagoConstantesFunciones.activarid_tipo_forma_pagoDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jTextFieldvalorDetallePago.setEnabled(this.detallepagoConstantesFunciones.activarvalorDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jTextFieldnumero_filaDetallePago.setEnabled(this.detallepagoConstantesFunciones.activarnumero_filaDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_anioDetallePago.setEnabled(this.detallepagoConstantesFunciones.activarid_anioDetallePago);
		this.jInternalFrameDetalleFormDetallePago.jComboBoxid_mesDetallePago.setEnabled(this.detallepagoConstantesFunciones.activarid_mesDetallePago);
		}
	}
	
		
}