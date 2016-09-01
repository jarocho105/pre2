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

import com.bydan.erp.inventario.util.FormaPagoInvenConstantesFunciones;
import com.bydan.erp.inventario.util.FormaPagoInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.FormaPagoInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.FormaPagoInvenBean;
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
import com.bydan.erp.facturacion.business.logic.*;

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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class FormaPagoInvenBeanSwingJInternalFrame extends FormaPagoInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FormaPagoInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FormaPagoInven> formapagoinvenValidator = new ClassValidator<FormaPagoInven>(FormaPagoInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FormaPagoInven formapagoinven;	
	public FormaPagoInven formapagoinvenAux;
	public FormaPagoInven formapagoinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FormaPagoInven formapagoinvenTotales;
	public Long idFormaPagoInvenActual;
	public Long iIdNuevoFormaPagoInven=0L;
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
	
	public Boolean isPermisoTodoFormaPagoInven;
	public Boolean isPermisoNuevoFormaPagoInven;
	public Boolean isPermisoActualizarFormaPagoInven;
	public Boolean isPermisoActualizarOriginalFormaPagoInven;
	public Boolean isPermisoEliminarFormaPagoInven;
	public Boolean isPermisoGuardarCambiosFormaPagoInven;
	public Boolean isPermisoConsultaFormaPagoInven;
	public Boolean isPermisoBusquedaFormaPagoInven;
	public Boolean isPermisoReporteFormaPagoInven;
	public Boolean isPermisoPaginacionMedioFormaPagoInven;
	public Boolean isPermisoPaginacionAltoFormaPagoInven;
	public Boolean isPermisoPaginacionTodoFormaPagoInven;
	public Boolean isPermisoCopiarFormaPagoInven;
	public Boolean isPermisoVerFormFormaPagoInven;
	public Boolean isPermisoDuplicarFormaPagoInven;
	public Boolean isPermisoOrdenFormaPagoInven;
	
	
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
	
	public FormaPagoInvenParameterReturnGeneral formapagoinvenReturnGeneral;
	public FormaPagoInvenParameterReturnGeneral formapagoinvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFormaPagoInven=false;
	public Boolean esParaAccionDesdeFormularioFormaPagoInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FormaPagoInvenSessionBeanAdditional formapagoinvenSessionBeanAdditional=null;
	
	public FormaPagoInvenSessionBeanAdditional getFormaPagoInvenSessionBeanAdditional() {
		return this.formapagoinvenSessionBeanAdditional;
	}
	
	public void setFormaPagoInvenSessionBeanAdditional(FormaPagoInvenSessionBeanAdditional formapagoinvenSessionBeanAdditional) {
		try {
			this.formapagoinvenSessionBeanAdditional=formapagoinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FormaPagoInvenBeanSwingJInternalFrameAdditional formapagoinvenBeanSwingJInternalFrameAdditional=null;
	//public class FormaPagoInvenBeanSwingJInternalFrame
	
	public FormaPagoInvenBeanSwingJInternalFrameAdditional getFormaPagoInvenBeanSwingJInternalFrameAdditional() {
		return this.formapagoinvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setFormaPagoInvenBeanSwingJInternalFrameAdditional(FormaPagoInvenBeanSwingJInternalFrameAdditional formapagoinvenBeanSwingJInternalFrameAdditional) {
		try {
			this.formapagoinvenBeanSwingJInternalFrameAdditional=formapagoinvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FormaPagoInvenLogic formapagoinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FormaPagoInven formapagoinvenBean;
	public FormaPagoInvenConstantesFunciones formapagoinvenConstantesFunciones;
	//public FormaPagoInvenParameterReturnGeneral formapagoinvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public TipoFormaPagoLogic tipoformapagoLogic;
	public CompraLogic compraLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<FormaPagoInven> formapagoinvens;	
	//public List<FormaPagoInven> formapagoinvensEliminados;
	//public List<FormaPagoInven> formapagoinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFormaPagoInven=false;
	public Boolean isVisibilidadCeldaDuplicarFormaPagoInven=true;
	public Boolean isVisibilidadCeldaCopiarFormaPagoInven=true;
	public Boolean isVisibilidadCeldaVerFormFormaPagoInven=true;
	public Boolean isVisibilidadCeldaOrdenFormaPagoInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFormaPagoInven=false;
	public Boolean isVisibilidadCeldaModificarFormaPagoInven=false;
	public Boolean isVisibilidadCeldaActualizarFormaPagoInven=false;
	public Boolean isVisibilidadCeldaEliminarFormaPagoInven=false;
	public Boolean isVisibilidadCeldaCancelarFormaPagoInven=false;
	public Boolean isVisibilidadCeldaGuardarFormaPagoInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFormaPagoInven=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdCompra=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoFormaPago=false;
	
	public Long getiIdNuevoFormaPagoInven() {
		return this.iIdNuevoFormaPagoInven;
	}

	public void setiIdNuevoFormaPagoInven(Long iIdNuevoFormaPagoInven) {
		this.iIdNuevoFormaPagoInven = iIdNuevoFormaPagoInven;
	}
	
	public Long getidFormaPagoInvenActual() {
		return this.idFormaPagoInvenActual;
	}

	public void setidFormaPagoInvenActual(Long idFormaPagoInvenActual) {
		this.idFormaPagoInvenActual = idFormaPagoInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FormaPagoInven getformapagoinven() {
		return this.formapagoinven;
	}

	public void setformapagoinven(FormaPagoInven formapagoinven) {
		this.formapagoinven = formapagoinven;
	}
	
	public FormaPagoInven getformapagoinvenAux() {
		return this.formapagoinvenAux;
	}

	public void setformapagoinvenAux(FormaPagoInven formapagoinvenAux) {
		this.formapagoinvenAux = formapagoinvenAux;
	}				
	
	public FormaPagoInven getformapagoinvenAnterior() {
		return this.formapagoinvenAnterior;
	}

	public void setformapagoinvenAnterior(FormaPagoInven formapagoinvenAnterior) {
		this.formapagoinvenAnterior = formapagoinvenAnterior;
	}	
	
	public FormaPagoInven getformapagoinvenTotales() {
		return this.formapagoinvenTotales;
	}

	public void setformapagoinvenTotales(FormaPagoInven formapagoinvenTotales) {
		this.formapagoinvenTotales = formapagoinvenTotales;
	}	
	
	public FormaPagoInven getformapagoinvenBean() {
		return this.formapagoinvenBean;
	}

	public void setformapagoinvenBean(FormaPagoInven formapagoinvenBean) {
		this.formapagoinvenBean = formapagoinvenBean;
	}	
	
	public FormaPagoInvenParameterReturnGeneral getformapagoinvenReturnGeneral() {
		return this.formapagoinvenReturnGeneral;
	}

	public void setformapagoinvenReturnGeneral(FormaPagoInvenParameterReturnGeneral formapagoinvenReturnGeneral) {
		this.formapagoinvenReturnGeneral = formapagoinvenReturnGeneral;
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

	public Long id_tipo_forma_pagoFK_IdTipoFormaPago=-1L;

	public Long getid_tipo_forma_pagoFK_IdTipoFormaPago() {
		return this.id_tipo_forma_pagoFK_IdTipoFormaPago;
	}

	public void setid_tipo_forma_pagoFK_IdTipoFormaPago(Long id_tipo_forma_pagoFK_IdTipoFormaPago) {
		this.id_tipo_forma_pagoFK_IdTipoFormaPago = id_tipo_forma_pagoFK_IdTipoFormaPago;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FormaPagoInvenLogic getFormaPagoInvenLogic()	{		
		return formapagoinvenLogic;
	}

	public void setFormaPagoInvenLogic(FormaPagoInvenLogic formapagoinvenLogic) {
		this.formapagoinvenLogic = formapagoinvenLogic;
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
	
	public Boolean getIsEsNuevoFormaPagoInven() {
		return isEsNuevoFormaPagoInven;
	}

	public void setIsEsNuevoFormaPagoInven(Boolean isEsNuevoFormaPagoInven) {
		this.isEsNuevoFormaPagoInven = isEsNuevoFormaPagoInven;
	}

	public Boolean getEsParaAccionDesdeFormularioFormaPagoInven() {
		return esParaAccionDesdeFormularioFormaPagoInven;
	}
	
	public void setEsParaAccionDesdeFormularioFormaPagoInven(Boolean esParaAccionDesdeFormularioFormaPagoInven) {
		this.esParaAccionDesdeFormularioFormaPagoInven = esParaAccionDesdeFormularioFormaPagoInven;
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

			if(this.formapagoinvenSessionBean==null) {
				this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			}

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(formapagoinvenSessionBean.getlidEmpresaActual());
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

			if(this.formapagoinvenSessionBean==null) {
				this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			}

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(formapagoinvenSessionBean.getlidSucursalActual());
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

			if(this.formapagoinvenSessionBean==null) {
				this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			}

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(formapagoinvenSessionBean.getlidEjercicioActual());
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

			if(this.formapagoinvenSessionBean==null) {
				this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			}

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(formapagoinvenSessionBean.getlidPeriodoActual());
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

			if(this.formapagoinvenSessionBean==null) {
				this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			}

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
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
					tipoformapagoLogic.getEntityWithConnection(formapagoinvenSessionBean.getlidTipoFormaPagoActual());
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

			if(this.formapagoinvenSessionBean==null) {
				this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			}

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCompra()) {
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
					compraLogic.getEntityWithConnection(formapagoinvenSessionBean.getlidCompraActual());
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

			if(this.formapagoinvenSessionBean==null) {
				this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			}

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(formapagoinvenSessionBean.getlidAnioActual());
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

			if(this.formapagoinvenSessionBean==null) {
				this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			}

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(formapagoinvenSessionBean.getlidMesActual());
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

			if(this.formapagoinvenSessionBean==null) {
				this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			}

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(formapagoinvenSessionBean.getlidCuentaContableActual());
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

					if(this.formapagoinven!=null) {
						this.formapagoinven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFormaPagoInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
		/*				

		*/			}

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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFormaPagoInvenGenerico)throws Exception
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
				jComboBoxid_empresaFormaPagoInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFormaPagoInvenGenerico!=null && jComboBoxid_empresaFormaPagoInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaFormaPagoInvenGenerico.setSelectedIndex(0);
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

					if(this.formapagoinven!=null) {
						this.formapagoinven.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalFormaPagoInven.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
		/*				

		*/			}

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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalFormaPagoInvenGenerico)throws Exception
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
				jComboBoxid_sucursalFormaPagoInvenGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalFormaPagoInvenGenerico!=null && jComboBoxid_sucursalFormaPagoInvenGenerico.getItemCount()>0) {
					jComboBoxid_sucursalFormaPagoInvenGenerico.setSelectedIndex(0);
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

					if(this.formapagoinven!=null) {
						this.formapagoinven.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioFormaPagoInven.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
		/*				

		*/			}

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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioFormaPagoInvenGenerico)throws Exception
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
				jComboBoxid_ejercicioFormaPagoInvenGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioFormaPagoInvenGenerico!=null && jComboBoxid_ejercicioFormaPagoInvenGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioFormaPagoInvenGenerico.setSelectedIndex(0);
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

					if(this.formapagoinven!=null) {
						this.formapagoinven.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoFormaPagoInven.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
		/*				

		*/			}

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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoFormaPagoInvenGenerico)throws Exception
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
				jComboBoxid_periodoFormaPagoInvenGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoFormaPagoInvenGenerico!=null && jComboBoxid_periodoFormaPagoInvenGenerico.getItemCount()>0) {
					jComboBoxid_periodoFormaPagoInvenGenerico.setSelectedIndex(0);
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

					if(this.formapagoinven!=null) {
						this.formapagoinven.setTipoFormaPago(tipoformapagoTemp);
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.setSelectedItem(tipoformapagoTemp);
					}
				} else {
					//jComboBoxid_tipo_forma_pagoFormaPagoInven.setSelectedItem(tipoformapagoTemp);
					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
		/*				
				if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoformapagoTemp!=null && jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven!=null) {
						jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setSelectedItem(tipoformapagoTemp);
					} else {
						if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven!=null) {
							//jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setSelectedItem(tipoformapagoTemp);
							if(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.getItemCount()>0) {
								jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setSelectedIndex(0);
							}
						}
					}
				}

		*/			}

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
	public void setActualTipoFormaPagoForeignKeyGenerico(Long idTipoFormaPagoSeleccionado,JComboBox jComboBoxid_tipo_forma_pagoFormaPagoInvenGenerico)throws Exception
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
				jComboBoxid_tipo_forma_pagoFormaPagoInvenGenerico.setSelectedItem(tipoformapagoTemp);
			} else {
				if(jComboBoxid_tipo_forma_pagoFormaPagoInvenGenerico!=null && jComboBoxid_tipo_forma_pagoFormaPagoInvenGenerico.getItemCount()>0) {
					jComboBoxid_tipo_forma_pagoFormaPagoInvenGenerico.setSelectedIndex(0);
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

					if(this.formapagoinven!=null) {
						this.formapagoinven.setCompra(compraTemp);
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.setSelectedItem(compraTemp);
					}
				} else {
					//jComboBoxid_compraFormaPagoInven.setSelectedItem(compraTemp);
					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
		/*				
				if(sFormularioTipoBusqueda.equals("FK_IdCompra") || sFormularioTipoBusqueda.equals("Todos")){
					if(compraTemp!=null && jComboBoxid_compraFK_IdCompraFormaPagoInven!=null) {
						jComboBoxid_compraFK_IdCompraFormaPagoInven.setSelectedItem(compraTemp);
					} else {
						if(jComboBoxid_compraFK_IdCompraFormaPagoInven!=null) {
							//jComboBoxid_compraFK_IdCompraFormaPagoInven.setSelectedItem(compraTemp);
							if(jComboBoxid_compraFK_IdCompraFormaPagoInven.getItemCount()>0) {
								jComboBoxid_compraFK_IdCompraFormaPagoInven.setSelectedIndex(0);
							}
						}
					}
				}

		*/			}

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
	public void setActualCompraForeignKeyGenerico(Long idCompraSeleccionado,JComboBox jComboBoxid_compraFormaPagoInvenGenerico)throws Exception
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
				jComboBoxid_compraFormaPagoInvenGenerico.setSelectedItem(compraTemp);
			} else {
				if(jComboBoxid_compraFormaPagoInvenGenerico!=null && jComboBoxid_compraFormaPagoInvenGenerico.getItemCount()>0) {
					jComboBoxid_compraFormaPagoInvenGenerico.setSelectedIndex(0);
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

					if(this.formapagoinven!=null) {
						this.formapagoinven.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioFormaPagoInven.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
		/*				

		*/			}

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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioFormaPagoInvenGenerico)throws Exception
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
				jComboBoxid_anioFormaPagoInvenGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioFormaPagoInvenGenerico!=null && jComboBoxid_anioFormaPagoInvenGenerico.getItemCount()>0) {
					jComboBoxid_anioFormaPagoInvenGenerico.setSelectedIndex(0);
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

					if(this.formapagoinven!=null) {
						this.formapagoinven.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesFormaPagoInven.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
		/*				

		*/			}

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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesFormaPagoInvenGenerico)throws Exception
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
				jComboBoxid_mesFormaPagoInvenGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesFormaPagoInvenGenerico!=null && jComboBoxid_mesFormaPagoInvenGenerico.getItemCount()>0) {
					jComboBoxid_mesFormaPagoInvenGenerico.setSelectedIndex(0);
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

					if(this.formapagoinven!=null) {
						this.formapagoinven.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableFormaPagoInven.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
						if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
		/*				
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setSelectedIndex(0);
							}
						}
					}
				}

		*/			}

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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableFormaPagoInvenGenerico)throws Exception
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
				jComboBoxid_cuenta_contableFormaPagoInvenGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableFormaPagoInvenGenerico!=null && jComboBoxid_cuenta_contableFormaPagoInvenGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableFormaPagoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FormaPagoInven formapagoinven,JComboBox jComboBoxid_empresaFormaPagoInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFormaPagoInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFormaPagoInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				formapagoinven.setid_empresa(empresaAux.getId());
				formapagoinven.setempresa_descripcion(FormaPagoInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				formapagoinven.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(FormaPagoInven formapagoinven,JComboBox jComboBoxid_sucursalFormaPagoInvenGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalFormaPagoInvenGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalFormaPagoInvenGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				formapagoinven.setid_sucursal(sucursalAux.getId());
				formapagoinven.setsucursal_descripcion(FormaPagoInvenConstantesFunciones.getSucursalDescripcion(sucursalAux));
				formapagoinven.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(FormaPagoInven formapagoinven,JComboBox jComboBoxid_ejercicioFormaPagoInvenGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioFormaPagoInvenGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioFormaPagoInvenGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				formapagoinven.setid_ejercicio(ejercicioAux.getId());
				formapagoinven.setejercicio_descripcion(FormaPagoInvenConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				formapagoinven.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(FormaPagoInven formapagoinven,JComboBox jComboBoxid_periodoFormaPagoInvenGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoFormaPagoInvenGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoFormaPagoInvenGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				formapagoinven.setid_periodo(periodoAux.getId());
				formapagoinven.setperiodo_descripcion(FormaPagoInvenConstantesFunciones.getPeriodoDescripcion(periodoAux));
				formapagoinven.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFormaPagoForeignKey(FormaPagoInven formapagoinven,JComboBox jComboBoxid_tipo_forma_pagoFormaPagoInvenGenerico)throws Exception
	{
		try
		{
			TipoFormaPago  tipoformapagoAux=new TipoFormaPago();

			if(jComboBoxid_tipo_forma_pagoFormaPagoInvenGenerico==null) {
				tipoformapagoAux=(TipoFormaPago)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.getSelectedItem();
			} else {
				tipoformapagoAux=(TipoFormaPago)jComboBoxid_tipo_forma_pagoFormaPagoInvenGenerico.getSelectedItem();
			}

			if(tipoformapagoAux!=null && tipoformapagoAux.getId()!=null) {
				formapagoinven.setid_tipo_forma_pago(tipoformapagoAux.getId());
				formapagoinven.settipoformapago_descripcion(FormaPagoInvenConstantesFunciones.getTipoFormaPagoDescripcion(tipoformapagoAux));
				formapagoinven.setTipoFormaPago(tipoformapagoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCompraForeignKey(FormaPagoInven formapagoinven,JComboBox jComboBoxid_compraFormaPagoInvenGenerico)throws Exception
	{
		try
		{
			Compra  compraAux=new Compra();

			if(jComboBoxid_compraFormaPagoInvenGenerico==null) {
				compraAux=(Compra)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.getSelectedItem();
			} else {
				compraAux=(Compra)jComboBoxid_compraFormaPagoInvenGenerico.getSelectedItem();
			}

			if(compraAux!=null && compraAux.getId()!=null) {
				formapagoinven.setid_compra(compraAux.getId());
				formapagoinven.setcompra_descripcion(FormaPagoInvenConstantesFunciones.getCompraDescripcion(compraAux));
				formapagoinven.setCompra(compraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(FormaPagoInven formapagoinven,JComboBox jComboBoxid_anioFormaPagoInvenGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioFormaPagoInvenGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioFormaPagoInvenGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				formapagoinven.setid_anio(anioAux.getId());
				formapagoinven.setanio_descripcion(FormaPagoInvenConstantesFunciones.getAnioDescripcion(anioAux));
				formapagoinven.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(FormaPagoInven formapagoinven,JComboBox jComboBoxid_mesFormaPagoInvenGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesFormaPagoInvenGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesFormaPagoInvenGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				formapagoinven.setid_mes(mesAux.getId());
				formapagoinven.setmes_descripcion(FormaPagoInvenConstantesFunciones.getMesDescripcion(mesAux));
				formapagoinven.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(FormaPagoInven formapagoinven,JComboBox jComboBoxid_cuenta_contableFormaPagoInvenGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableFormaPagoInvenGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableFormaPagoInvenGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				formapagoinven.setid_cuenta_contable(cuentacontableAux.getId());
				formapagoinven.setcuentacontable_descripcion(FormaPagoInvenConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				formapagoinven.setCuentaContable(cuentacontableAux);			}
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

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
					}

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
					}

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
					}

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
					}

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.addItem(tipoformapago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
					}

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoFormaPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						/*
						if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.removeAllItems();

							for(TipoFormaPago tipoformapago:this.tipoformapagosForeignKey) {
								this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.addItem(tipoformapago);
							}
						}

						if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
						}

						*/
					}

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

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.removeAllItems();

							for(Compra compra:this.comprasForeignKey) {
								this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.addItem(compra);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
					}

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCompra") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						/*
						if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_compraFK_IdCompraFormaPagoInven.removeAllItems();

							for(Compra compra:this.comprasForeignKey) {
								this.jComboBoxid_compraFK_IdCompraFormaPagoInven.addItem(compra);
							}
						}

						if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
						}

						*/
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

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
					}

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
					}

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { 
					}

					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						/*
						if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.addItem(cuentacontable);
							}
						}

						if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
						}

						*/
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
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					/*

					*/					}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					/*

					*/					}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					/*

					*/					}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					/*

					*/					}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoFormaPagoForeignKey(TipoFormaPago tipoformapago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.setSelectedItem(tipoformapago);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					/*
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setSelectedItem(tipoformapago);
						} else {
							this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.setSelectedIndex(iIndexSelected);
						}

					*/					}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCompraForeignKey(Compra compra,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.setSelectedItem(compra);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					/*
						if(!conSelectedIndex) {
							this.jComboBoxid_compraFK_IdCompraFormaPagoInven.setSelectedItem(compra);
						} else {
							this.jComboBoxid_compraFK_IdCompraFormaPagoInven.setSelectedIndex(iIndexSelected);
						}

					*/					}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					/*

					*/					}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					/*

					*/					}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					/*
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.setSelectedIndex(iIndexSelected);
						}

					*/					}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFormaPagoInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FormaPagoInvenConstantesFunciones.refrescarForeignKeysDescripcionesFormaPagoInven(this.formapagoinvenLogic.getFormaPagoInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FormaPagoInvenConstantesFunciones.refrescarForeignKeysDescripcionesFormaPagoInven(this.formapagoinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(TipoFormaPago.class));
		classes.add(new Classe(Compra.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//formapagoinvenLogic.setFormaPagoInvens(this.formapagoinvens);
			formapagoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FormaPagoInvenParameterReturnGeneral getFormaPagoInvenParameterGeneral() {
		return this.formapagoinvenParameterGeneral;
	}
	
	public void setFormaPagoInvenParameterGeneral(FormaPagoInvenParameterReturnGeneral formapagoinvenParameterGeneral) {
		this.formapagoinvenParameterGeneral = formapagoinvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFormaPagoInven() {
		return isPermisoTodoFormaPagoInven;
	}

	public void setIsPermisoTodoFormaPagoInven(Boolean isPermisoTodoFormaPagoInven) {
		this.isPermisoTodoFormaPagoInven = isPermisoTodoFormaPagoInven;
	}

	public Boolean getIsPermisoNuevoFormaPagoInven() {
		return isPermisoNuevoFormaPagoInven;
	}

	public void setIsPermisoNuevoFormaPagoInven(Boolean isPermisoNuevoFormaPagoInven) {
		this.isPermisoNuevoFormaPagoInven = isPermisoNuevoFormaPagoInven;
	}

	public Boolean getIsPermisoActualizarFormaPagoInven() {
		return isPermisoActualizarFormaPagoInven;
	}

	public void setIsPermisoActualizarFormaPagoInven(Boolean isPermisoActualizarFormaPagoInven) {
		this.isPermisoActualizarFormaPagoInven = isPermisoActualizarFormaPagoInven;
	}

	public Boolean getIsPermisoEliminarFormaPagoInven() {
		return isPermisoEliminarFormaPagoInven;
	}

	public void setIsPermisoEliminarFormaPagoInven(Boolean isPermisoEliminarFormaPagoInven) {
		this.isPermisoEliminarFormaPagoInven = isPermisoEliminarFormaPagoInven;
	}

	public Boolean getIsPermisoGuardarCambiosFormaPagoInven() {
		return isPermisoGuardarCambiosFormaPagoInven;
	}

	public void setIsPermisoGuardarCambiosFormaPagoInven(Boolean isPermisoGuardarCambiosFormaPagoInven) {
		this.isPermisoGuardarCambiosFormaPagoInven = isPermisoGuardarCambiosFormaPagoInven;
	}
	
	public Boolean getIsPermisoConsultaFormaPagoInven() {
		return isPermisoConsultaFormaPagoInven;
	}

	public void setIsPermisoConsultaFormaPagoInven(Boolean isPermisoConsultaFormaPagoInven) {
		this.isPermisoConsultaFormaPagoInven = isPermisoConsultaFormaPagoInven;
	}

	public Boolean getIsPermisoBusquedaFormaPagoInven() {
		return isPermisoBusquedaFormaPagoInven;
	}

	public void setIsPermisoBusquedaFormaPagoInven(Boolean isPermisoBusquedaFormaPagoInven) {
		this.isPermisoBusquedaFormaPagoInven = isPermisoBusquedaFormaPagoInven;
	}

	public Boolean getIsPermisoReporteFormaPagoInven() {
		return isPermisoReporteFormaPagoInven;
	}

	public void setIsPermisoReporteFormaPagoInven(Boolean isPermisoReporteFormaPagoInven) {
		this.isPermisoReporteFormaPagoInven = isPermisoReporteFormaPagoInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioFormaPagoInven() {
		return isPermisoPaginacionMedioFormaPagoInven;
	}

	public void setIsPermisoPaginacionMedioFormaPagoInven(Boolean isPermisoPaginacionMedioFormaPagoInven) {
		this.isPermisoPaginacionMedioFormaPagoInven = isPermisoPaginacionMedioFormaPagoInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoFormaPagoInven() {
		return isPermisoPaginacionTodoFormaPagoInven;
	}

	public void setIsPermisoPaginacionTodoFormaPagoInven(Boolean isPermisoPaginacionTodoFormaPagoInven) {
		this.isPermisoPaginacionTodoFormaPagoInven = isPermisoPaginacionTodoFormaPagoInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoFormaPagoInven() {
		return isPermisoPaginacionAltoFormaPagoInven;
	}

	public void setIsPermisoPaginacionAltoFormaPagoInven(Boolean isPermisoPaginacionAltoFormaPagoInven) {
		this.isPermisoPaginacionAltoFormaPagoInven = isPermisoPaginacionAltoFormaPagoInven;
	}
	
	public Boolean getIsPermisoCopiarFormaPagoInven() {
		return isPermisoCopiarFormaPagoInven;
	}

	public void setIsPermisoCopiarFormaPagoInven(Boolean isPermisoCopiarFormaPagoInven) {
		this.isPermisoCopiarFormaPagoInven = isPermisoCopiarFormaPagoInven;
	}
	
	public Boolean getIsPermisoVerFormFormaPagoInven() {
		return isPermisoVerFormFormaPagoInven;
	}

	public void setIsPermisoVerFormFormaPagoInven(Boolean isPermisoVerFormFormaPagoInven) {
		this.isPermisoVerFormFormaPagoInven = isPermisoVerFormFormaPagoInven;
	}
	
	public Boolean getIsPermisoDuplicarFormaPagoInven() {
		return isPermisoDuplicarFormaPagoInven;
	}

	public void setIsPermisoDuplicarFormaPagoInven(Boolean isPermisoDuplicarFormaPagoInven) {
		this.isPermisoDuplicarFormaPagoInven = isPermisoDuplicarFormaPagoInven;
	}
	
	public Boolean getIsPermisoOrdenFormaPagoInven() {
		return isPermisoOrdenFormaPagoInven;
	}

	public void setIsPermisoOrdenFormaPagoInven(Boolean isPermisoOrdenFormaPagoInven) {
		this.isPermisoOrdenFormaPagoInven = isPermisoOrdenFormaPagoInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFormaPagoInven() {
		return isVisibilidadCeldaNuevoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaNuevoFormaPagoInven(Boolean isVisibilidadCeldaNuevoFormaPagoInven) {
		this.isVisibilidadCeldaNuevoFormaPagoInven = isVisibilidadCeldaNuevoFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFormaPagoInven() {
		return isVisibilidadCeldaDuplicarFormaPagoInven;
	}

	public void setIsVisibilidadCeldaDuplicarFormaPagoInven(Boolean isVisibilidadCeldaDuplicarFormaPagoInven) {
		this.isVisibilidadCeldaDuplicarFormaPagoInven = isVisibilidadCeldaDuplicarFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFormaPagoInven() {
		return isVisibilidadCeldaCopiarFormaPagoInven;
	}

	public void setIsVisibilidadCeldaCopiarFormaPagoInven(Boolean isVisibilidadCeldaCopiarFormaPagoInven) {
		this.isVisibilidadCeldaCopiarFormaPagoInven = isVisibilidadCeldaCopiarFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFormaPagoInven() {
		return isVisibilidadCeldaVerFormFormaPagoInven;
	}

	public void setIsVisibilidadCeldaVerFormFormaPagoInven(Boolean isVisibilidadCeldaVerFormFormaPagoInven) {
		this.isVisibilidadCeldaVerFormFormaPagoInven = isVisibilidadCeldaVerFormFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFormaPagoInven() {
		return isVisibilidadCeldaOrdenFormaPagoInven;
	}

	public void setIsVisibilidadCeldaOrdenFormaPagoInven(Boolean isVisibilidadCeldaOrdenFormaPagoInven) {
		this.isVisibilidadCeldaOrdenFormaPagoInven = isVisibilidadCeldaOrdenFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFormaPagoInven() {
		return isVisibilidadCeldaNuevoRelacionesFormaPagoInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFormaPagoInven(Boolean isVisibilidadCeldaNuevoRelacionesFormaPagoInven) {
		this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven = isVisibilidadCeldaNuevoRelacionesFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFormaPagoInven() {
		return isVisibilidadCeldaModificarFormaPagoInven;
	}

	public void setIsVisibilidadCeldaModificarFormaPagoInven(Boolean isVisibilidadCeldaModificarFormaPagoInven) {
		this.isVisibilidadCeldaModificarFormaPagoInven = isVisibilidadCeldaModificarFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFormaPagoInven() {
		return isVisibilidadCeldaActualizarFormaPagoInven;
	}

	public void setIsVisibilidadCeldaActualizarFormaPagoInven(Boolean isVisibilidadCeldaActualizarFormaPagoInven) {
		this.isVisibilidadCeldaActualizarFormaPagoInven = isVisibilidadCeldaActualizarFormaPagoInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarFormaPagoInven() {
		return isVisibilidadCeldaEliminarFormaPagoInven;
	}

	public void setIsVisibilidadCeldaEliminarFormaPagoInven(Boolean isVisibilidadCeldaEliminarFormaPagoInven) {
		this.isVisibilidadCeldaEliminarFormaPagoInven = isVisibilidadCeldaEliminarFormaPagoInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarFormaPagoInven() {
		return isVisibilidadCeldaCancelarFormaPagoInven;
	}

	public void setIsVisibilidadCeldaCancelarFormaPagoInven(Boolean isVisibilidadCeldaCancelarFormaPagoInven) {
		this.isVisibilidadCeldaCancelarFormaPagoInven = isVisibilidadCeldaCancelarFormaPagoInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarFormaPagoInven() {
		return isVisibilidadCeldaGuardarFormaPagoInven;
	}

	public void setIsVisibilidadCeldaGuardarFormaPagoInven(Boolean isVisibilidadCeldaGuardarFormaPagoInven) {
		this.isVisibilidadCeldaGuardarFormaPagoInven = isVisibilidadCeldaGuardarFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFormaPagoInven() {
		return isVisibilidadCeldaGuardarCambiosFormaPagoInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFormaPagoInven(Boolean isVisibilidadCeldaGuardarCambiosFormaPagoInven) {
		this.isVisibilidadCeldaGuardarCambiosFormaPagoInven = isVisibilidadCeldaGuardarCambiosFormaPagoInven;
	}
		
	public FormaPagoInvenSessionBean getformapagoinvenSessionBean() {
		return this.formapagoinvenSessionBean;
	}
	
	public void setformapagoinvenSessionBean(FormaPagoInvenSessionBean formapagoinvenSessionBean) {
		this.formapagoinvenSessionBean=formapagoinvenSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoFormaPago() {
		return this.isVisibilidadFK_IdTipoFormaPago;
	}

	public void setisVisibilidadFK_IdTipoFormaPago(Boolean isVisibilidadFK_IdTipoFormaPago) {
		this.isVisibilidadFK_IdTipoFormaPago=isVisibilidadFK_IdTipoFormaPago;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(FormaPagoInven formapagoinven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(formapagoinven,null);
				this.setActualParaGuardarSucursalForeignKey(formapagoinven,null);
				this.setActualParaGuardarEjercicioForeignKey(formapagoinven,null);
				this.setActualParaGuardarPeriodoForeignKey(formapagoinven,null);
				this.setActualParaGuardarTipoFormaPagoForeignKey(formapagoinven,null);
				this.setActualParaGuardarCompraForeignKey(formapagoinven,null);
				this.setActualParaGuardarAnioForeignKey(formapagoinven,null);
				this.setActualParaGuardarMesForeignKey(formapagoinven,null);
				this.setActualParaGuardarCuentaContableForeignKey(formapagoinven,null);
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
		
		/*
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		*/
		
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
			
			/*
			//this.cargarLicenciaCliente(this.datosCliente);
			*/
	}
	
	public void bugActualizarReferenciaActual(FormaPagoInven formapagoinven,FormaPagoInven formapagoinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFormaPagoInven(formapagoinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		formapagoinvenAux.setId(formapagoinven.getId());
		formapagoinvenAux.setVersionRow(formapagoinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFormaPagoInven();
		
			int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = formapagoinvenValidator.getInvalidValues(this.formapagoinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			formapagoinvenLogic.setDatosCliente(datosCliente);
			formapagoinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				formapagoinvenAux=new  FormaPagoInven();
				
				formapagoinvenAux.setIsNew(true);
				formapagoinvenAux.setIsChanged(true);
				
				formapagoinvenAux.setFormaPagoInvenOriginal(this.formapagoinven);
				
				formapagoinvenAux.setId(this.formapagoinven.getId());	
				formapagoinvenAux.setVersionRow(this.formapagoinven.getVersionRow());	
				formapagoinvenAux.setid_empresa(this.formapagoinven.getid_empresa());	
				formapagoinvenAux.setid_sucursal(this.formapagoinven.getid_sucursal());	
				formapagoinvenAux.setid_ejercicio(this.formapagoinven.getid_ejercicio());	
				formapagoinvenAux.setid_periodo(this.formapagoinven.getid_periodo());	
				formapagoinvenAux.setid_tipo_forma_pago(this.formapagoinven.getid_tipo_forma_pago());	
				formapagoinvenAux.setfecha_inicio(this.formapagoinven.getfecha_inicio());	
				formapagoinvenAux.setnumero_dias(this.formapagoinven.getnumero_dias());	
				formapagoinvenAux.setfecha_fin(this.formapagoinven.getfecha_fin());	
				formapagoinvenAux.setporcentaje(this.formapagoinven.getporcentaje());	
				formapagoinvenAux.setvalor(this.formapagoinven.getvalor());	
				formapagoinvenAux.setdetalle(this.formapagoinven.getdetalle());	
				formapagoinvenAux.setid_compra(this.formapagoinven.getid_compra());	
				formapagoinvenAux.setid_anio(this.formapagoinven.getid_anio());	
				formapagoinvenAux.setid_mes(this.formapagoinven.getid_mes());	
				formapagoinvenAux.setid_cuenta_contable(this.formapagoinven.getid_cuenta_contable());	
				formapagoinvenAux.setfecha(this.formapagoinven.getfecha());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formapagoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(formapagoinvenAux,formapagoinvenLogic.getFormaPagoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formapagoinvenAux,formapagoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formapagoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenLogic.saveFormaPagoInvens();//WithConnection
						//formapagoinvenLogic.getSetVersionRowFormaPagoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formapagoinven,formapagoinvenAux);
					
					this.refrescarForeignKeysDescripcionesFormaPagoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formapagoinvenLogic.saveFormaPagoInvenRelaciones(formapagoinvenAux);//WithConnection
								//formapagoinvenLogic.getSetVersionRowFormaPagoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formapagoinven,formapagoinvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formapagoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formapagoinvenAux,formapagoinvenLogic.getFormaPagoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formapagoinvenAux,formapagoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formapagoinven,formapagoinvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				formapagoinvenAux=new  FormaPagoInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.formapagoinvenSessionBean.getEsGuardarRelacionado() && this.formapagoinven.getId()>=0)) {
						
					formapagoinvenAux.setIsNew(false);
				}
				
				formapagoinvenAux.setIsDeleted(false);
			
				formapagoinvenAux.setId(this.formapagoinven.getId());	
				formapagoinvenAux.setVersionRow(this.formapagoinven.getVersionRow());	
				formapagoinvenAux.setid_empresa(this.formapagoinven.getid_empresa());	
				formapagoinvenAux.setid_sucursal(this.formapagoinven.getid_sucursal());	
				formapagoinvenAux.setid_ejercicio(this.formapagoinven.getid_ejercicio());	
				formapagoinvenAux.setid_periodo(this.formapagoinven.getid_periodo());	
				formapagoinvenAux.setid_tipo_forma_pago(this.formapagoinven.getid_tipo_forma_pago());	
				formapagoinvenAux.setfecha_inicio(this.formapagoinven.getfecha_inicio());	
				formapagoinvenAux.setnumero_dias(this.formapagoinven.getnumero_dias());	
				formapagoinvenAux.setfecha_fin(this.formapagoinven.getfecha_fin());	
				formapagoinvenAux.setporcentaje(this.formapagoinven.getporcentaje());	
				formapagoinvenAux.setvalor(this.formapagoinven.getvalor());	
				formapagoinvenAux.setdetalle(this.formapagoinven.getdetalle());	
				formapagoinvenAux.setid_compra(this.formapagoinven.getid_compra());	
				formapagoinvenAux.setid_anio(this.formapagoinven.getid_anio());	
				formapagoinvenAux.setid_mes(this.formapagoinven.getid_mes());	
				formapagoinvenAux.setid_cuenta_contable(this.formapagoinven.getid_cuenta_contable());	
				formapagoinvenAux.setfecha(this.formapagoinven.getfecha());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formapagoinvenAux,formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formapagoinvenAux,formapagoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formapagoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenLogic.saveFormaPagoInvens();//WithConnection
						//formapagoinvenLogic.getSetVersionRowFormaPagoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formapagoinven,formapagoinvenAux);
					
					this.refrescarForeignKeysDescripcionesFormaPagoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formapagoinvenLogic.saveFormaPagoInvenRelaciones(formapagoinvenAux);//WithConnection
								//formapagoinvenLogic.getSetVersionRowFormaPagoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formapagoinven,formapagoinvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formapagoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formapagoinvenAux,formapagoinvenLogic.getFormaPagoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formapagoinvenAux,formapagoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formapagoinven,formapagoinvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				formapagoinvenAux=new  FormaPagoInven();
				
				formapagoinvenAux.setIsNew(false);
				formapagoinvenAux.setIsChanged(false);
				
				formapagoinvenAux.setIsDeleted(true);
				
				formapagoinvenAux.setId(this.formapagoinven.getId());	
				formapagoinvenAux.setVersionRow(this.formapagoinven.getVersionRow());	
				formapagoinvenAux.setid_empresa(this.formapagoinven.getid_empresa());	
				formapagoinvenAux.setid_sucursal(this.formapagoinven.getid_sucursal());	
				formapagoinvenAux.setid_ejercicio(this.formapagoinven.getid_ejercicio());	
				formapagoinvenAux.setid_periodo(this.formapagoinven.getid_periodo());	
				formapagoinvenAux.setid_tipo_forma_pago(this.formapagoinven.getid_tipo_forma_pago());	
				formapagoinvenAux.setfecha_inicio(this.formapagoinven.getfecha_inicio());	
				formapagoinvenAux.setnumero_dias(this.formapagoinven.getnumero_dias());	
				formapagoinvenAux.setfecha_fin(this.formapagoinven.getfecha_fin());	
				formapagoinvenAux.setporcentaje(this.formapagoinven.getporcentaje());	
				formapagoinvenAux.setvalor(this.formapagoinven.getvalor());	
				formapagoinvenAux.setdetalle(this.formapagoinven.getdetalle());	
				formapagoinvenAux.setid_compra(this.formapagoinven.getid_compra());	
				formapagoinvenAux.setid_anio(this.formapagoinven.getid_anio());	
				formapagoinvenAux.setid_mes(this.formapagoinven.getid_mes());	
				formapagoinvenAux.setid_cuenta_contable(this.formapagoinven.getid_cuenta_contable());	
				formapagoinvenAux.setfecha(this.formapagoinven.getfecha());	
				
				if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.formapagoinvenAux.getId()>=0) {	
						this.formapagoinvensEliminados.add(formapagoinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(formapagoinvenAux,formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formapagoinvenAux,formapagoinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formapagoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenLogic.saveFormaPagoInvens();//WithConnection
						//formapagoinvenLogic.getSetVersionRowFormaPagoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formapagoinvenLogic.saveFormaPagoInvenRelaciones(formapagoinvenAux);//WithConnection
								//formapagoinvenLogic.getSetVersionRowFormaPagoInvens();//WithConnection
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
							if(this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.formapagoinvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(formapagoinvenAux,formapagoinvenLogic.getFormaPagoInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(formapagoinvenAux,formapagoinvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getFormaPagoInvens().addAll(this.formapagoinvensEliminados);
					
					formapagoinvenLogic.saveFormaPagoInvens();//WithConnection
					//formapagoinvenLogic.getSetVersionRowFormaPagoInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFormaPagoInven();
				
				this.formapagoinvensEliminados= new ArrayList<FormaPagoInven>();		
			}
			
			if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Forma Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.formapagoinven=formapagoinvenAux;
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
      		//this.finishProcessFormaPagoInven();
      	}
		
	}	
	
	public void actualizarRelaciones(FormaPagoInven formapagoinvenLocal) throws Exception {
		
		if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FormaPagoInven formapagoinvenLocal) throws Exception {	
		if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				formapagoinvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				formapagoinvenLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				formapagoinvenLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				formapagoinvenLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFormaPagoDetalleFormJInternalFrame.class)) {
				TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrameLocal=(TipoFormaPagoBeanSwingJInternalFrame) ((TipoFormaPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoformapagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.gettipoformapago(),true);
				tipoformapagoBeanSwingJInternalFrameLocal.actualizarLista(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago,this.tipoformapagosForeignKey);

				tipoformapagoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				formapagoinvenLocal.setTipoFormaPago(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago);

				this.addItemDefectoCombosForeignKeyTipoFormaPago();
				this.cargarCombosFrameTipoFormaPagosForeignKey("Formulario");
				this.setActualTipoFormaPagoForeignKey(tipoformapagoBeanSwingJInternalFrameLocal.tipoformapago.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CompraDetalleFormJInternalFrame.class)) {
				CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrameLocal=(CompraBeanSwingJInternalFrame) ((CompraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				compraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCompra(compraBeanSwingJInternalFrameLocal.getcompra(),true);
				compraBeanSwingJInternalFrameLocal.actualizarLista(compraBeanSwingJInternalFrameLocal.compra,this.comprasForeignKey);

				compraBeanSwingJInternalFrameLocal.actualizarRelaciones(compraBeanSwingJInternalFrameLocal.compra);

				formapagoinvenLocal.setCompra(compraBeanSwingJInternalFrameLocal.compra);

				this.addItemDefectoCombosForeignKeyCompra();
				this.cargarCombosFrameComprasForeignKey("Formulario");
				this.setActualCompraForeignKey(compraBeanSwingJInternalFrameLocal.compra.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				formapagoinvenLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				formapagoinvenLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				formapagoinvenLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFormaPagoInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = formapagoinvenValidator.getInvalidValues(this.formapagoinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FormaPagoInven formapagoinven,List<FormaPagoInven> formapagoinvens) throws Exception {
		try	{		
			FormaPagoInvenConstantesFunciones.actualizarLista(formapagoinven,formapagoinvens,this.formapagoinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FormaPagoInven formapagoinven,List<FormaPagoInven> formapagoinvens) throws Exception {
		try	{			
			FormaPagoInvenConstantesFunciones.actualizarSelectedLista(formapagoinven,formapagoinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FormaPagoInven> formapagoinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				formapagoinvensLocal=this.formapagoinvenLogic.getFormaPagoInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				formapagoinvensLocal=this.formapagoinvens;
			}
			//ARCHITECTURE
		
			for(FormaPagoInven formapagoinvenLocal:formapagoinvensLocal) {
				if(this.permiteMantenimiento(formapagoinvenLocal) && formapagoinvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FormaPagoInvenConstantesFunciones.getFormaPagoInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_empresaFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_sucursalFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_ejercicioFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_periodoFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.IDTIPOFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_tipo_forma_pagoFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelfecha_inicioFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.NUMERODIAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelnumero_diasFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelfecha_finFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelporcentajeFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelvalorFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabeldetalleFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.IDCOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_compraFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_anioFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_mesFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_cuenta_contableFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormaPagoInvenConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelfechaFormaPagoInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_empresaFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_sucursalFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_ejercicioFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_periodoFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_tipo_forma_pagoFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelfecha_inicioFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelnumero_diasFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelfecha_finFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelporcentajeFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelvalorFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabeldetalleFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_compraFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_anioFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_mesFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelid_cuenta_contableFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormaPagoInven.jLabelfechaFormaPagoInven,"");
		
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
		this.iIdNuevoFormaPagoInven--;	
		
		
		this.formapagoinvenAux=new FormaPagoInven();
		
		this.formapagoinvenAux.setId(this.iIdNuevoFormaPagoInven);
		this.formapagoinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formapagoinvenLogic.getFormaPagoInvens().add(this.formapagoinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.formapagoinvens.add(this.formapagoinvenAux);
		}
		//ARCHITECTURE
		
		this.formapagoinven=this.formapagoinvenAux;
		
		if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFormaPagoInven(this.formapagoinven);
			this.setVariablesObjetoActualToFormularioForeignKeyFormaPagoInven(this.formapagoinven);
		}
				
		//this.setDefaultControlesFormaPagoInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFormaPagoInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFormaPagoInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormaPagoInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormaPagoInven(this.formapagoinvenBean,this.formapagoinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FormaPagoInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
			classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.formapagoinvenReturnGeneral=formapagoinvenLogic.procesarEventosFormaPagoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formapagoinvenLogic.getFormaPagoInvens(),this.formapagoinven,this.formapagoinvenParameterGeneral,this.isEsNuevoFormaPagoInven,classes);//this.formapagoinvenLogic.getFormaPagoInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFormaPagoInven(this.formapagoinvenReturnGeneral,this.formapagoinvenBean,false);
		
		if(this.formapagoinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFormaPagoInven(this.formapagoinvenReturnGeneral.getFormaPagoInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFormaPagoInven(this.formapagoinvenReturnGeneral.getFormaPagoInven());
		}
		
		if(this.formapagoinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFormaPagoInven(this.formapagoinvenReturnGeneral.getFormaPagoInven(),classes);//this.formapagoinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFormaPagoInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFormaPagoInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.RecargarFormFormaPagoInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFormaPagoInven(false);
						
			if(formapagoinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormaPagoInven();
			}
			
			this.actualizarVisualTableDatosFormaPagoInven();
			
			this.jTableDatosFormaPagoInven.setRowSelectionInterval(this.getIndiceNuevoFormaPagoInven(), this.getIndiceNuevoFormaPagoInven());
			
			this.seleccionarFilaTablaFormaPagoInvenActual();
						
			this.actualizarEstadoCeldasBotonesFormaPagoInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFormaPagoInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_inicioFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarfecha_inicioFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarnumero_diasFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_finFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarfecha_finFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarporcentajeFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarvalorFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jTextAreadetalleFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activardetalleFormaPagoInven);//
		this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfechaFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarfechaFormaPagoInven);	
		//
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarid_empresaFormaPagoInven);//
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarid_sucursalFormaPagoInven);//
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarid_ejercicioFormaPagoInven);//
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarid_periodoFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarid_tipo_forma_pagoFormaPagoInven);//
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarid_compraFormaPagoInven);//
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarid_anioFormaPagoInven);//
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarid_mesFormaPagoInven);//
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.setEnabled(isHabilitar && this.formapagoinvenConstantesFunciones.activarid_cuenta_contableFormaPagoInven);
	};
	
	public void setDefaultControlesFormaPagoInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFormaPagoInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.formapagoinvenSessionBean.setConGuardarRelaciones(true);			
			this.formapagoinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFormaPagoInven.jTabbedPaneRelacionesFormaPagoInven.setVisible(true);
			
					
		} else {
			//this.formapagoinvenSessionBean.setConGuardarRelaciones(false);			
			this.formapagoinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFormaPagoInven.jTabbedPaneRelacionesFormaPagoInven.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFormaPagoInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormaPagoInven formapagoinvenAux:this.formapagoinvenLogic.getFormaPagoInvens()) {
				if(formapagoinvenAux.getId().equals(this.iIdNuevoFormaPagoInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormaPagoInven formapagoinvenAux:this.formapagoinvens) {
				if(formapagoinvenAux.getId().equals(this.iIdNuevoFormaPagoInven)) {
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
	
	public int getIndiceActualFormaPagoInven(FormaPagoInven formapagoinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormaPagoInven formapagoinvenAux:this.formapagoinvenLogic.getFormaPagoInvens()) {
				if(formapagoinvenAux.getId().equals(formapagoinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormaPagoInven formapagoinvenAux:this.formapagoinvens) {
				if(formapagoinvenAux.getId().equals(formapagoinven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFormaPagoInven(FormaPagoInven formapagoinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormaPagoInven formapagoinvenAux:this.formapagoinvenLogic.getFormaPagoInvens()) {
				if(formapagoinvenAux.getFormaPagoInvenOriginal().getId().equals(formapagoinvenOriginal.getId())) {
					existe=true;
					formapagoinvenOriginal.setId(formapagoinvenAux.getId());
					formapagoinvenOriginal.setVersionRow(formapagoinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormaPagoInven formapagoinvenAux:this.formapagoinvens) {
				if(formapagoinvenAux.getFormaPagoInvenOriginal().getId().equals(formapagoinvenOriginal.getId())) {
					existe=true;
					formapagoinvenOriginal.setId(formapagoinvenAux.getId());
					formapagoinvenOriginal.setVersionRow(formapagoinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFormaPagoInven(Boolean esParaCancelar) throws Exception {
		formapagoinvensAux=new ArrayList<FormaPagoInven>();
		formapagoinvenAux=new FormaPagoInven();
		
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormaPagoInven formapagoinvenAux:this.formapagoinvenLogic.getFormaPagoInvens()) {
					if(formapagoinvenAux.getId()<0) {
						formapagoinvensAux.add(formapagoinvenAux);
					}		
				}
				this.iIdNuevoFormaPagoInven=0L;
				this.formapagoinvenLogic.getFormaPagoInvens().removeAll(formapagoinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormaPagoInven formapagoinvenAux:this.formapagoinvens) {
					if(formapagoinvenAux.getId()<0) {
						formapagoinvensAux.add(formapagoinvenAux);
					}		
				}
				this.iIdNuevoFormaPagoInven=0L;
				this.formapagoinvens.removeAll(formapagoinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFormaPagoInven 
					&& this.formapagoinvenLogic.getFormaPagoInvens().size()>0
					) {
					formapagoinvenAux=this.formapagoinvenLogic.getFormaPagoInvens().get(this.formapagoinvenLogic.getFormaPagoInvens().size() - 1);
				
					if(formapagoinvenAux.getId()<0) {
						this.formapagoinvenLogic.getFormaPagoInvens().remove(formapagoinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFormaPagoInven && this.formapagoinvens.size()>0) {
					formapagoinvenAux=this.formapagoinvens.get(this.formapagoinvens.size() - 1);
				
					if(formapagoinvenAux.getId()<0) {
						this.formapagoinvens.remove(formapagoinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFormaPagoInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(formapagoinven.getId()<0) {
				this.formapagoinvenLogic.getFormaPagoInvens().remove(this.formapagoinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(formapagoinven.getId()<0) {
				this.formapagoinvens.remove(this.formapagoinven);
			}
		}			
	}
	
	public void setEstadosInicialesFormaPagoInven(List<FormaPagoInven> formapagoinvensAux) throws Exception {
		FormaPagoInvenConstantesFunciones.setEstadosInicialesFormaPagoInven(formapagoinvensAux);
	}
	
	public void setEstadosInicialesFormaPagoInven(FormaPagoInven formapagoinvenAux) throws Exception {
		FormaPagoInvenConstantesFunciones.setEstadosInicialesFormaPagoInven(formapagoinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFormaPagoInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFormaPagoInvenActual()) {
				if(!this.isEsNuevoFormaPagoInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFormaPagoInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFormaPagoInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Forma Pago ?", "MANTENIMIENTO DE Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FormaPagoInven formapagoinven) throws Exception {
		FormaPagoInvenConstantesFunciones.seleccionarAsignar(this.formapagoinven,formapagoinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFormaPagoInven=this.isPermisoActualizarOriginalFormaPagoInven;
			
			
			this.seleccionarAsignar(formapagoinven);
			
			

			idCuentaContableActual=formapagoinven.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormaPagoInvenConstantesFunciones.quitarEspaciosFormaPagoInven(this.formapagoinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFormaPagoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.formapagoinvenSessionBean.setsFuncionBusquedaRapida(this.formapagoinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoFormaPagoInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFormaPagoInven(esParaCancelar);				
				this.cancelarNuevoFormaPagoInven(esParaCancelar);								
			}
			
			this.formapagoinven=new FormaPagoInven();
			
			this.inicializarFormaPagoInven();
			
			this.actualizarEstadoCeldasBotonesFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFormaPagoInven() throws Exception {
		try {
			FormaPagoInvenConstantesFunciones.inicializarFormaPagoInven(this.formapagoinven);
			
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
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.formapagoinvenLogic.getFormaPagoInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFormaPagoInvens(String sAccionBusqueda,List<FormaPagoInven> formapagoinvensParaReportes) throws Exception {
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
					sPathReporteFinal="FormaPagoInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FormaPagoInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FormaPagoInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FormaPagoInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Forma Pagoes");		
		parameters.put("busquedapor", FormaPagoInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFormaPagoInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FormaPagoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FormaPagoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFormaPagoInven=new JRBeanArrayDataSource(FormaPagoInvenJInternalFrame.TraerFormaPagoInvenBeans(formapagoinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFormaPagoInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FormaPagoInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FormaPagoInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FormaPagoInvenBean.TraerFormaPagoInvenBeans(formapagoinvensParaReportes).toArray()));
							
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
				this.generarExcelReporteFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,formapagoinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,formapagoinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					/*
					this.jButtonGenerarExcelReporteDinamicoFormaPagoInvenActionPerformed(null);
					//this.generarExcelReporteFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,formapagoinvensParaReportes);
					*/
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,formapagoinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,formapagoinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,formapagoinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFormaPagoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<FormaPagoInven> formapagoinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formapagoinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormaPagoInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormaPagoInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FormaPagoInven formapagoinven : formapagoinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FormaPagoInvenConstantesFunciones.generarExcelReporteDataFormaPagoInven("NORMAL",row,workbook,formapagoinven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFormaPagoInven(String sTipo,Row row,Workbook workbook) {
		
		FormaPagoInvenConstantesFunciones.generarExcelReporteHeaderFormaPagoInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFormaPagoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<FormaPagoInven> formapagoinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formapagoinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormaPagoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FormaPagoInven formapagoinven : formapagoinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FormaPagoInvenConstantesFunciones.getFormaPagoInvenDescripcion(formapagoinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.gettipoformapago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getnumero_dias());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getdetalle());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getcompra_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormaPagoInvenConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formapagoinven.getfecha());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFormaPagoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<FormaPagoInven> formapagoinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FormaPagoInven> formapagoinvensRespaldo=null;
		
		classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.formapagoinvenLogic.setDatosCliente(this.datosCliente);
		this.formapagoinvenLogic.setDatosDeep(this.datosDeep);
		this.formapagoinvenLogic.setIsConDeep(true);
		
		formapagoinvensRespaldo=this.formapagoinvenLogic.getFormaPagoInvens();
		
		this.formapagoinvenLogic.setFormaPagoInvens(formapagoinvensParaReportes);	
		this.formapagoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		formapagoinvensParaReportes=this.formapagoinvenLogic.getFormaPagoInvens();
		this.formapagoinvenLogic.setFormaPagoInvens(formapagoinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formapagoinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormaPagoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormaPagoInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FormaPagoInven formapagoinven : formapagoinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFormaPagoInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FormaPagoInvenConstantesFunciones.generarExcelReporteDataFormaPagoInven("NORMAL",row,workbook,formapagoinven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FormaPagoInvenConstantesFunciones.getFormaPagoInvenDescripcion(formapagoinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		/*
		for(int index:this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		*/
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		/*
		for(int index:this.jInternalFrameReporteDinamicoFormaPagoInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		*/
		
		return existe;
	}
	
	public void startProcessFormaPagoInven() throws Exception {		
		this.startProcessFormaPagoInven(true);
	}
	
	public void startProcessFormaPagoInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFormaPagoInven ,this.jPanelParametrosReportesFormaPagoInven, this.jScrollPanelDatosFormaPagoInven,this.jPanelPaginacionFormaPagoInven, this.jScrollPanelDatosEdicionFormaPagoInven, this.jPanelAccionesFormaPagoInven,this.jPanelAccionesFormularioFormaPagoInven,this.jmenuBarFormaPagoInven,this.jmenuBarDetalleFormaPagoInven,this.jTtoolBarFormaPagoInven,this.jTtoolBarDetalleFormaPagoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasFormaPagoInven=new JTabbedPane();
		
		final JPanel jPanelParametrosReportesFormaPagoInven=this.jPanelParametrosReportesFormaPagoInven;
		//final JScrollPane jScrollPanelDatosFormaPagoInven=this.jScrollPanelDatosFormaPagoInven;
		final JTable jTableDatosFormaPagoInven=this.jTableDatosFormaPagoInven;		
		final JPanel jPanelPaginacionFormaPagoInven=this.jPanelPaginacionFormaPagoInven;
		//final JScrollPane jScrollPanelDatosEdicionFormaPagoInven=this.jScrollPanelDatosEdicionFormaPagoInven;
		final JPanel jPanelAccionesFormaPagoInven=this.jPanelAccionesFormaPagoInven;
		
		JPanel jPanelCamposAuxiliarFormaPagoInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFormaPagoInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
			jPanelCamposAuxiliarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jPanelCamposFormaPagoInven;
			jPanelAccionesFormularioAuxiliarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jPanelAccionesFormularioFormaPagoInven;
		}
		
		final JPanel jPanelCamposFormaPagoInven=jPanelCamposAuxiliarFormaPagoInven;
		final JPanel jPanelAccionesFormularioFormaPagoInven=jPanelAccionesFormularioAuxiliarFormaPagoInven;
		
		
		final JMenuBar jmenuBarFormaPagoInven=new JMenuBar();
		final JMenuBar jmenuBarDetalleFormaPagoInven=new JMenuBar();
		final JToolBar jTtoolBarFormaPagoInven=new JToolBar();
		final JToolBar jTtoolBarDetalleFormaPagoInven=new JToolBar();		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormaPagoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormaPagoInven;
			processRunnable.jTableDatos=jTableDatosFormaPagoInven;
			processRunnable.jPanelCampos=jPanelCamposFormaPagoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormaPagoInven;
			processRunnable.jPanelAcciones=jPanelAccionesFormaPagoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormaPagoInven;
			
			
			processRunnable.jmenuBar=jmenuBarFormaPagoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormaPagoInven;
			processRunnable.jTtoolBar=jTtoolBarFormaPagoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormaPagoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormaPagoInven ,jPanelParametrosReportesFormaPagoInven,jTableDatosFormaPagoInven, /*jScrollPanelDatosFormaPagoInven,*/jPanelCamposFormaPagoInven,jPanelPaginacionFormaPagoInven, /*jScrollPanelDatosEdicionFormaPagoInven,*/ jPanelAccionesFormaPagoInven,jPanelAccionesFormularioFormaPagoInven,jmenuBarFormaPagoInven,jmenuBarDetalleFormaPagoInven,jTtoolBarFormaPagoInven,jTtoolBarDetalleFormaPagoInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormaPagoInven ,jPanelParametrosReportesFormaPagoInven, jScrollPanelDatosFormaPagoInven,jPanelPaginacionFormaPagoInven, jScrollPanelDatosEdicionFormaPagoInven, jPanelAccionesFormaPagoInven,jPanelAccionesFormularioFormaPagoInven,jmenuBarFormaPagoInven,jmenuBarDetalleFormaPagoInven,jTtoolBarFormaPagoInven,jTtoolBarDetalleFormaPagoInven);
						
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
	
	public void finishProcessFormaPagoInven() {// throws Exception 
		this.finishProcessFormaPagoInven(true);
	}
	
	public void finishProcessFormaPagoInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFormaPagoInven ,this.jPanelParametrosReportesFormaPagoInven, this.jScrollPanelDatosFormaPagoInven,this.jPanelPaginacionFormaPagoInven, this.jScrollPanelDatosEdicionFormaPagoInven, this.jPanelAccionesFormaPagoInven,this.jPanelAccionesFormularioFormaPagoInven,this.jmenuBarFormaPagoInven,this.jmenuBarDetalleFormaPagoInven,this.jTtoolBarFormaPagoInven,this.jTtoolBarDetalleFormaPagoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasFormaPagoInven=new JTabbedPane();
		
		final JPanel jPanelParametrosReportesFormaPagoInven=this.jPanelParametrosReportesFormaPagoInven;
		//final JScrollPane jScrollPanelDatosFormaPagoInven=this.jScrollPanelDatosFormaPagoInven;
		final JTable jTableDatosFormaPagoInven=this.jTableDatosFormaPagoInven;		
		final JPanel jPanelPaginacionFormaPagoInven=this.jPanelPaginacionFormaPagoInven;
		//final JScrollPane jScrollPanelDatosEdicionFormaPagoInven=this.jScrollPanelDatosEdicionFormaPagoInven;
		final JPanel jPanelAccionesFormaPagoInven=this.jPanelAccionesFormaPagoInven;
		
		JPanel jPanelCamposAuxiliarFormaPagoInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFormaPagoInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
			jPanelCamposAuxiliarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jPanelCamposFormaPagoInven;
			jPanelAccionesFormularioAuxiliarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jPanelAccionesFormularioFormaPagoInven;
		}
		
		final JPanel jPanelCamposFormaPagoInven=jPanelCamposAuxiliarFormaPagoInven;
		final JPanel jPanelAccionesFormularioFormaPagoInven=jPanelAccionesFormularioAuxiliarFormaPagoInven;
		
		
		final JMenuBar jmenuBarFormaPagoInven=new JMenuBar();
		final JMenuBar jmenuBarDetalleFormaPagoInven=new JMenuBar();
		final JToolBar jTtoolBarFormaPagoInven=new JToolBar();
		final JToolBar jTtoolBarDetalleFormaPagoInven=new JToolBar();		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormaPagoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormaPagoInven;
			processRunnable.jTableDatos=jTableDatosFormaPagoInven;
			processRunnable.jPanelCampos=jPanelCamposFormaPagoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormaPagoInven;
			processRunnable.jPanelAcciones=jPanelAccionesFormaPagoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormaPagoInven;
			
			
			processRunnable.jmenuBar=jmenuBarFormaPagoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormaPagoInven;
			processRunnable.jTtoolBar=jTtoolBarFormaPagoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormaPagoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFormaPagoInven ,jPanelParametrosReportesFormaPagoInven, jTableDatosFormaPagoInven,/*jScrollPanelDatosFormaPagoInven,*/jPanelCamposFormaPagoInven,jPanelPaginacionFormaPagoInven, /*jScrollPanelDatosEdicionFormaPagoInven,*/ jPanelAccionesFormaPagoInven,jPanelAccionesFormularioFormaPagoInven,jmenuBarFormaPagoInven,jmenuBarDetalleFormaPagoInven,jTtoolBarFormaPagoInven,jTtoolBarDetalleFormaPagoInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFormaPagoInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFormaPagoInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFormaPagoInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFormaPagoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFormaPagoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFormaPagoInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFormaPagoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFormaPagoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFormaPagoInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.formapagoinvenConstantesFunciones.getsFinalQueryFormaPagoInven();
		String  finalQueryPaginacionTodos=this.formapagoinvenConstantesFunciones.getsFinalQueryFormaPagoInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FormaPagoInvenConstantesFunciones.getArrayColumnasGlobalesNoFormaPagoInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FormaPagoInvenConstantesFunciones.getArrayColumnasGlobalesFormaPagoInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FormaPagoInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		/*
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		*/
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.formapagoinvensEliminados= new ArrayList<FormaPagoInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFormaPagoInven();
		
				///*FormaPagoInvenSessionBean*/this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			
			if(this.formapagoinvenSessionBean==null) {
				this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
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
					this.iNumeroPaginacion=FormaPagoInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FormaPagoInvenConstantesFunciones.getClassesForeignKeysOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/formapagoinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			formapagoinvensAux= new ArrayList<FormaPagoInven>();
			
				
			formapagoinvenLogic.setDatosCliente(this.datosCliente);
			formapagoinvenLogic.setDatosDeep(this.datosDeep);
			formapagoinvenLogic.setIsConDeep(true);
			
			
			formapagoinvenLogic.getFormaPagoInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					formapagoinvenLogic.getTodosFormaPagoInvens(finalQueryGlobal,pagination);
					
					//formapagoinvenLogic.getTodosFormaPagoInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(formapagoinvenLogic.getFormaPagoInvens()==null|| formapagoinvenLogic.getFormaPagoInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formapagoinvensAux= new ArrayList<FormaPagoInven>();
							formapagoinvensAux.addAll(formapagoinvenLogic.getFormaPagoInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvensAux= new ArrayList<FormaPagoInven>();
							formapagoinvensAux.addAll(formapagoinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formapagoinvenLogic.getTodosFormaPagoInvens(finalQueryGlobal+"",this.pagination);												
							
							//formapagoinvenLogic.getTodosFormaPagoInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFormaPagoInvens("Todos",formapagoinvenLogic.getFormaPagoInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formapagoinvenLogic.setFormaPagoInvens(new ArrayList<FormaPagoInven>());					
							formapagoinvenLogic.getFormaPagoInvens().addAll(formapagoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvens=new ArrayList<FormaPagoInven>();
							formapagoinvens.addAll(formapagoinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFormaPagoInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFormaPagoInven=this.idActual;
				
				} else if(this.idFormaPagoInvenActual!=null && this.idFormaPagoInvenActual!=0L) {
					idFormaPagoInven=idFormaPagoInvenActual;
				}
				
					
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndicePorId(idFormaPagoInven);
				
				this.formapagoinvens=new ArrayList<FormaPagoInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					formapagoinvenLogic.getEntity(idFormaPagoInven);
					
					//formapagoinvenLogic.getEntityWithConnection(idFormaPagoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formapagoinvenLogic.setFormaPagoInvens(new ArrayList<FormaPagoInven>());
					formapagoinvenLogic.getFormaPagoInvens().add(formapagoinvenLogic.getFormaPagoInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formapagoinvens=new ArrayList<FormaPagoInven>();
					this.formapagoinvens.add(formapagoinven);
				}
				
				if(formapagoinvenLogic.getFormaPagoInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCompra")) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdCompra(id_compraFK_IdCompra);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formapagoinvenLogic.getFormaPagoInvensFK_IdCompra(finalQueryGlobal,pagination,id_compraFK_IdCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdCompra(id_compraFK_IdCompra);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdCompra(id_compraFK_IdCompra);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formapagoinvenLogic.getFormaPagoInvens()==null||formapagoinvenLogic.getFormaPagoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formapagoinvens==null|| formapagoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvensAux=new ArrayList<FormaPagoInven>();
						formapagoinvensAux.addAll(formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvensAux=new ArrayList<FormaPagoInven>();
							formapagoinvensAux.addAll(formapagoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formapagoinvenLogic.getFormaPagoInvensFK_IdCompra(finalQueryGlobal,pagination,id_compraFK_IdCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdCompra(id_compraFK_IdCompra);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdCompra(id_compraFK_IdCompra);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormaPagoInvens("FK_IdCompra",formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormaPagoInvens("FK_IdCompra",formapagoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenLogic.setFormaPagoInvens(new ArrayList<FormaPagoInven>());
						formapagoinvenLogic.getFormaPagoInvens().addAll(formapagoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvens=new ArrayList<FormaPagoInven>();
							formapagoinvens.addAll(formapagoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formapagoinvenLogic.getFormaPagoInvensFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formapagoinvenLogic.getFormaPagoInvens()==null||formapagoinvenLogic.getFormaPagoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formapagoinvens==null|| formapagoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvensAux=new ArrayList<FormaPagoInven>();
						formapagoinvensAux.addAll(formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvensAux=new ArrayList<FormaPagoInven>();
							formapagoinvensAux.addAll(formapagoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formapagoinvenLogic.getFormaPagoInvensFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormaPagoInvens("FK_IdCuentaContable",formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormaPagoInvens("FK_IdCuentaContable",formapagoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenLogic.setFormaPagoInvens(new ArrayList<FormaPagoInven>());
						formapagoinvenLogic.getFormaPagoInvens().addAll(formapagoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvens=new ArrayList<FormaPagoInven>();
							formapagoinvens.addAll(formapagoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formapagoinvenLogic.getFormaPagoInvensFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formapagoinvenLogic.getFormaPagoInvens()==null||formapagoinvenLogic.getFormaPagoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formapagoinvens==null|| formapagoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvensAux=new ArrayList<FormaPagoInven>();
						formapagoinvensAux.addAll(formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvensAux=new ArrayList<FormaPagoInven>();
							formapagoinvensAux.addAll(formapagoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formapagoinvenLogic.getFormaPagoInvensFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormaPagoInvens("FK_IdEjercicio",formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormaPagoInvens("FK_IdEjercicio",formapagoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenLogic.setFormaPagoInvens(new ArrayList<FormaPagoInven>());
						formapagoinvenLogic.getFormaPagoInvens().addAll(formapagoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvens=new ArrayList<FormaPagoInven>();
							formapagoinvens.addAll(formapagoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formapagoinvenLogic.getFormaPagoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formapagoinvenLogic.getFormaPagoInvens()==null||formapagoinvenLogic.getFormaPagoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formapagoinvens==null|| formapagoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvensAux=new ArrayList<FormaPagoInven>();
						formapagoinvensAux.addAll(formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvensAux=new ArrayList<FormaPagoInven>();
							formapagoinvensAux.addAll(formapagoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formapagoinvenLogic.getFormaPagoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormaPagoInvens("FK_IdEmpresa",formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormaPagoInvens("FK_IdEmpresa",formapagoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenLogic.setFormaPagoInvens(new ArrayList<FormaPagoInven>());
						formapagoinvenLogic.getFormaPagoInvens().addAll(formapagoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvens=new ArrayList<FormaPagoInven>();
							formapagoinvens.addAll(formapagoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formapagoinvenLogic.getFormaPagoInvensFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formapagoinvenLogic.getFormaPagoInvens()==null||formapagoinvenLogic.getFormaPagoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formapagoinvens==null|| formapagoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvensAux=new ArrayList<FormaPagoInven>();
						formapagoinvensAux.addAll(formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvensAux=new ArrayList<FormaPagoInven>();
							formapagoinvensAux.addAll(formapagoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formapagoinvenLogic.getFormaPagoInvensFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormaPagoInvens("FK_IdPeriodo",formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormaPagoInvens("FK_IdPeriodo",formapagoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenLogic.setFormaPagoInvens(new ArrayList<FormaPagoInven>());
						formapagoinvenLogic.getFormaPagoInvens().addAll(formapagoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvens=new ArrayList<FormaPagoInven>();
							formapagoinvens.addAll(formapagoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formapagoinvenLogic.getFormaPagoInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formapagoinvenLogic.getFormaPagoInvens()==null||formapagoinvenLogic.getFormaPagoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formapagoinvens==null|| formapagoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvensAux=new ArrayList<FormaPagoInven>();
						formapagoinvensAux.addAll(formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvensAux=new ArrayList<FormaPagoInven>();
							formapagoinvensAux.addAll(formapagoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formapagoinvenLogic.getFormaPagoInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormaPagoInvens("FK_IdSucursal",formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormaPagoInvens("FK_IdSucursal",formapagoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenLogic.setFormaPagoInvens(new ArrayList<FormaPagoInven>());
						formapagoinvenLogic.getFormaPagoInvens().addAll(formapagoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvens=new ArrayList<FormaPagoInven>();
							formapagoinvens.addAll(formapagoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoFormaPago")) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formapagoinvenLogic.getFormaPagoInvensFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formapagoinvenLogic.getFormaPagoInvens()==null||formapagoinvenLogic.getFormaPagoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formapagoinvens==null|| formapagoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvensAux=new ArrayList<FormaPagoInven>();
						formapagoinvensAux.addAll(formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvensAux=new ArrayList<FormaPagoInven>();
							formapagoinvensAux.addAll(formapagoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formapagoinvenLogic.getFormaPagoInvensFK_IdTipoFormaPago(finalQueryGlobal,pagination,id_tipo_forma_pagoFK_IdTipoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdTipoFormaPago(id_tipo_forma_pagoFK_IdTipoFormaPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormaPagoInvens("FK_IdTipoFormaPago",formapagoinvenLogic.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormaPagoInvens("FK_IdTipoFormaPago",formapagoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenLogic.setFormaPagoInvens(new ArrayList<FormaPagoInven>());
						formapagoinvenLogic.getFormaPagoInvens().addAll(formapagoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvens=new ArrayList<FormaPagoInven>();
							formapagoinvens.addAll(formapagoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFormaPagoInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFormaPagoInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formapagoinvenLogic.getFormaPagoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formapagoinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formapagoinvenLogic.getFormaPagoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formapagoinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FormaPagoInven formapagoinven) {
		Boolean permite=true;
		
		if(this.formapagoinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	/*
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FormaPagoInvenConstantesFunciones.getOrderByListaFormaPagoInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FormaPagoInvenConstantesFunciones.getOrderByListaFormaPagoInven();
		}		
	}
	*/
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormaPagoInven formapagoinven:formapagoinvenLogic.getFormaPagoInvens()) {
				if(formapagoinven.getsType().equals(Constantes2.S_TOTALES)) {
					formapagoinvenTotales=formapagoinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormaPagoInven formapagoinven:this.formapagoinvens) {
				if(formapagoinven.getsType().equals(Constantes2.S_TOTALES)) {
					formapagoinvenTotales=formapagoinven;
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
			this.formapagoinvenAux=new FormaPagoInven();
			this.formapagoinvenAux.setsType(Constantes2.S_TOTALES);
			this.formapagoinvenAux.setIsNew(false);
			this.formapagoinvenAux.setIsChanged(false);
			this.formapagoinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FormaPagoInvenConstantesFunciones.TotalizarValoresFilaFormaPagoInven(this.formapagoinvenLogic.getFormaPagoInvens(),this.formapagoinvenAux);
				
				this.formapagoinvenLogic.getFormaPagoInvens().add(this.formapagoinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FormaPagoInvenConstantesFunciones.TotalizarValoresFilaFormaPagoInven(this.formapagoinvens,this.formapagoinvenAux);
				
				this.formapagoinvens.add(this.formapagoinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		formapagoinvenTotales=new FormaPagoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formapagoinvenLogic.getFormaPagoInvens().remove(formapagoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formapagoinvens.remove(formapagoinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		formapagoinvenTotales=new FormaPagoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormaPagoInven formapagoinven:formapagoinvenLogic.getFormaPagoInvens()) {
				if(formapagoinven.getsType().equals(Constantes2.S_TOTALES)) {
					formapagoinvenTotales=formapagoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormaPagoInvenConstantesFunciones.TotalizarValoresFilaFormaPagoInven(this.formapagoinvenLogic.getFormaPagoInvens(),formapagoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormaPagoInven formapagoinven:this.formapagoinvens) {
				if(formapagoinven.getsType().equals(Constantes2.S_TOTALES)) {
					formapagoinvenTotales=formapagoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormaPagoInvenConstantesFunciones.TotalizarValoresFilaFormaPagoInven(this.formapagoinvens,formapagoinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosFormaPagoInven() {
		this.isPermisoTodoFormaPagoInven=false;
		this.isPermisoNuevoFormaPagoInven=false;
		this.isPermisoActualizarFormaPagoInven=false;
		this.isPermisoActualizarOriginalFormaPagoInven=false;
		this.isPermisoEliminarFormaPagoInven=false;
		this.isPermisoGuardarCambiosFormaPagoInven=false;
		this.isPermisoConsultaFormaPagoInven=false;
		this.isPermisoBusquedaFormaPagoInven=false;
		this.isPermisoReporteFormaPagoInven=false;		
		this.isPermisoOrdenFormaPagoInven=false;		
		this.isPermisoPaginacionMedioFormaPagoInven=false;		
		this.isPermisoPaginacionAltoFormaPagoInven=false;
		this.isPermisoPaginacionTodoFormaPagoInven=false;
		this.isPermisoCopiarFormaPagoInven=false;		
		this.isPermisoVerFormFormaPagoInven=false;		
		this.isPermisoDuplicarFormaPagoInven=false;		
		this.isPermisoOrdenFormaPagoInven=false;		
	}
	
	public void setPermisosUsuarioFormaPagoInven(Boolean isPermiso) {
		this.isPermisoTodoFormaPagoInven=isPermiso;
		this.isPermisoNuevoFormaPagoInven=isPermiso;
		this.isPermisoActualizarFormaPagoInven=isPermiso;
		this.isPermisoActualizarOriginalFormaPagoInven=isPermiso;
		this.isPermisoEliminarFormaPagoInven=isPermiso;
		this.isPermisoGuardarCambiosFormaPagoInven=isPermiso;
		this.isPermisoConsultaFormaPagoInven=isPermiso;
		this.isPermisoBusquedaFormaPagoInven=isPermiso;
		this.isPermisoReporteFormaPagoInven=isPermiso;
		this.isPermisoOrdenFormaPagoInven=isPermiso;		
		this.isPermisoPaginacionMedioFormaPagoInven=isPermiso;		
		this.isPermisoPaginacionAltoFormaPagoInven=isPermiso;		
		this.isPermisoPaginacionTodoFormaPagoInven=isPermiso;		
		this.isPermisoCopiarFormaPagoInven=isPermiso;		
		this.isPermisoVerFormFormaPagoInven=isPermiso;		
		this.isPermisoDuplicarFormaPagoInven=isPermiso;
		this.isPermisoOrdenFormaPagoInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFormaPagoInven(Boolean isPermiso) {
		//this.isPermisoTodoFormaPagoInven=isPermiso;
		this.isPermisoNuevoFormaPagoInven=isPermiso;
		this.isPermisoActualizarFormaPagoInven=isPermiso;
		this.isPermisoActualizarOriginalFormaPagoInven=isPermiso;
		this.isPermisoEliminarFormaPagoInven=isPermiso;
		this.isPermisoGuardarCambiosFormaPagoInven=isPermiso;
		//this.isPermisoConsultaFormaPagoInven=isPermiso;
		//this.isPermisoBusquedaFormaPagoInven=isPermiso;
		//this.isPermisoReporteFormaPagoInven=isPermiso;
		//this.isPermisoOrdenFormaPagoInven=isPermiso;		
		//this.isPermisoPaginacionMedioFormaPagoInven=isPermiso;		
		//this.isPermisoPaginacionAltoFormaPagoInven=isPermiso;		
		//this.isPermisoPaginacionTodoFormaPagoInven=isPermiso;		
		//this.isPermisoCopiarFormaPagoInven=isPermiso;		
		//this.isPermisoDuplicarFormaPagoInven=isPermiso;
		//this.isPermisoOrdenFormaPagoInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFormaPagoInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FormaPagoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFormaPagoInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFormaPagoInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFormaPagoInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFormaPagoInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFormaPagoInvenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFormaPagoInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FormaPagoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FormaPagoInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFormaPagoInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFormaPagoInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFormaPagoInven=this.isPermisoActualizarFormaPagoInven;
			this.isPermisoEliminarFormaPagoInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFormaPagoInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFormaPagoInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFormaPagoInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFormaPagoInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFormaPagoInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormaPagoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFormaPagoInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFormaPagoInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFormaPagoInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFormaPagoInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFormaPagoInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFormaPagoInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormaPagoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFormaPagoInven.setToolTipText(this.jTableDatosFormaPagoInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFormaPagoInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFormaPagoInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FormaPagoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FormaPagoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFormaPagoInven() throws Exception {
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
	public void inicializarCombosForeignKeyFormaPagoInvenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.tipoformapagosForeignKey=new ArrayList();
				this.comprasForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFormaPagoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FormaPagoInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFormaPagoInvenListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFormaPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCompraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyFormaPagoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FormaPagoInvenParameterReturnGeneral formapagoinvenReturnGeneral=new FormaPagoInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.formapagoinvenConstantesFunciones.cargarid_empresaFormaPagoInven)
					 || (this.esRecargarFks && this.formapagoinvenConstantesFunciones.cargarid_empresaFormaPagoInven)) {

					if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+formapagoinvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.formapagoinvenConstantesFunciones.cargarid_sucursalFormaPagoInven)
					 || (this.esRecargarFks && this.formapagoinvenConstantesFunciones.cargarid_sucursalFormaPagoInven)) {

					if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+formapagoinvenSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.formapagoinvenConstantesFunciones.cargarid_ejercicioFormaPagoInven)
					 || (this.esRecargarFks && this.formapagoinvenConstantesFunciones.cargarid_ejercicioFormaPagoInven)) {

					if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+formapagoinvenSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.formapagoinvenConstantesFunciones.cargarid_periodoFormaPagoInven)
					 || (this.esRecargarFks && this.formapagoinvenConstantesFunciones.cargarid_periodoFormaPagoInven)) {

					if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+formapagoinvenSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalTipoFormaPago="";

				if(((this.tipoformapagosForeignKey==null||this.tipoformapagosForeignKey.size()<=0) && this.formapagoinvenConstantesFunciones.cargarid_tipo_forma_pagoFormaPagoInven)
					 || (this.esRecargarFks && this.formapagoinvenConstantesFunciones.cargarid_tipo_forma_pagoFormaPagoInven)) {

					if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoFormaPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoFormaPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFormaPagoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoFormaPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoFormaPago, "");
						finalQueryGlobalTipoFormaPago+=TipoFormaPagoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoFormaPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoFormaPago=" WHERE " + ConstantesSql.ID + "="+formapagoinvenSessionBean.getlidTipoFormaPagoActual();
					}
				} else {
					finalQueryGlobalTipoFormaPago="NONE";
				}


				String finalQueryGlobalCompra="";

				if(((this.comprasForeignKey==null||this.comprasForeignKey.size()<=0) && this.formapagoinvenConstantesFunciones.cargarid_compraFormaPagoInven)
					 || (this.esRecargarFks && this.formapagoinvenConstantesFunciones.cargarid_compraFormaPagoInven)) {

					if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCompra()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CompraConstantesFunciones.getArrayColumnasGlobalesCompra(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCompra=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CompraConstantesFunciones.TABLENAME);

						finalQueryGlobalCompra=Funciones.GetFinalQueryAppend(finalQueryGlobalCompra, "");
						finalQueryGlobalCompra+=CompraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosComprasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCompra=" WHERE " + ConstantesSql.ID + "="+formapagoinvenSessionBean.getlidCompraActual();
					}
				} else {
					finalQueryGlobalCompra="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.formapagoinvenConstantesFunciones.cargarid_anioFormaPagoInven)
					 || (this.esRecargarFks && this.formapagoinvenConstantesFunciones.cargarid_anioFormaPagoInven)) {

					if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+formapagoinvenSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.formapagoinvenConstantesFunciones.cargarid_mesFormaPagoInven)
					 || (this.esRecargarFks && this.formapagoinvenConstantesFunciones.cargarid_mesFormaPagoInven)) {

					if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+formapagoinvenSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.formapagoinvenConstantesFunciones.cargarid_cuenta_contableFormaPagoInven)
					 || (this.esRecargarFks && this.formapagoinvenConstantesFunciones.cargarid_cuenta_contableFormaPagoInven)) {

					if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+formapagoinvenSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				formapagoinvenReturnGeneral=formapagoinvenLogic.cargarCombosLoteForeignKeyFormaPagoInven(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalTipoFormaPago,finalQueryGlobalCompra,finalQueryGlobalAnio,finalQueryGlobalMes,finalQueryGlobalCuentaContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=formapagoinvenReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=formapagoinvenReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=formapagoinvenReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=formapagoinvenReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalTipoFormaPago.equals("NONE")) {
				this.tipoformapagosForeignKey=formapagoinvenReturnGeneral.gettipoformapagosForeignKey();
			}

			if(!finalQueryGlobalCompra.equals("NONE")) {
				this.comprasForeignKey=formapagoinvenReturnGeneral.getcomprasForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=formapagoinvenReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=formapagoinvenReturnGeneral.getmessForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=formapagoinvenReturnGeneral.getcuentacontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFormaPagoInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyTipoFormaPago();
			this.addItemDefectoCombosForeignKeyCompra();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.formapagoinvenSessionBean==null) {
				this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			}

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyTipoFormaPago()throws Exception {
		try {

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoFormaPago()) {
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

	public void addItemDefectoCombosForeignKeyCompra()throws Exception {
		try {

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCompra()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.formapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
	
	public void initActionsCombosTodosForeignKeyFormaPagoInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFormaPagoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFormaPagoInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.formapagoinven.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.formapagoinven.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
				this.formapagoinven.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormaPagoInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFormaPagoInven(FormaPagoInven formapagoinven)throws Exception {	
		try {
			
			this.setActualTipoFormaPagoForeignKey(formapagoinven.getid_tipo_forma_pago(),false,"Formulario");
			this.setActualCompraForeignKey(formapagoinven.getid_compra(),false,"Formulario");
			this.setActualCuentaContableForeignKey(formapagoinven.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFormaPagoInven(FormaPagoInven formapagoinven,String sTipoEvento)throws Exception {	
		try {
			
			

				if(formapagoinven.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableFormaPagoInven")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(formapagoinven.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFormaPagoInven()throws Exception {	
		try {
			
			this.setActualTipoFormaPagoForeignKey(this.formapagoinvenConstantesFunciones.getid_tipo_forma_pago(),false,"Formulario");
			this.setActualCompraForeignKey(this.formapagoinvenConstantesFunciones.getid_compra(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.formapagoinvenConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFormaPagoInven()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFormaPagoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFormaPagoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFormaPagoInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFormaPagoInven()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");
			this.cargarCombosFrameComprasForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFormaPagoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFormaPagosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameComprasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFormaPagoInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public FormaPagoInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FormaPagoInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FormaPagoInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean(); 
		this.formapagoinvenConstantesFunciones=new FormaPagoInvenConstantesFunciones(); 
		this.formapagoinvenBean=new FormaPagoInven();//(this.formapagoinvenConstantesFunciones); 		
		this.formapagoinvenReturnGeneral=new FormaPagoInvenParameterReturnGeneral(); 
		
		this.formapagoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formapagoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FormaPagoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FormaPagoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FormaPagoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFormaPagoInven(true);
			
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
			
			this.formapagoinvenConstantesFunciones=new FormaPagoInvenConstantesFunciones(); 
			this.formapagoinvenBean=new FormaPagoInven();//this.formapagoinvenConstantesFunciones); 			
			this.formapagoinvenReturnGeneral=new FormaPagoInvenParameterReturnGeneral(); 
		
			FormaPagoInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Forma Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.formapagoinven=new FormaPagoInven();
			this.formapagoinvens = new ArrayList<FormaPagoInven>();
			this.formapagoinvensAux = new ArrayList<FormaPagoInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic=new FormaPagoInvenLogic();
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.formapagoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.formapagoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFormaPagoInven);
				
				if(!this.conCargarMinimo) {
					/*
					if(this.jInternalFrameReporteDinamicoFormaPagoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormaPagoInven);	
					}
					
					if(this.jInternalFrameImportacionFormaPagoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormaPagoInven);							
					}
					*/
				}
				
				
				if(!this.conCargarMinimo) {
					/*
					if(this.jInternalFrameOrderByFormaPagoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFormaPagoInven);					
					}
					*/
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFormaPagoInven);
				this.jInternalFrameDetalleFormFormaPagoInven.setVisible(false);
				this.jInternalFrameDetalleFormFormaPagoInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				/*
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFormaPagoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormaPagoInven);
					this.jInternalFrameReporteDinamicoFormaPagoInven.setVisible(false);
					this.jInternalFrameReporteDinamicoFormaPagoInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFormaPagoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFormaPagoInven);
					this.jInternalFrameImportacionFormaPagoInven.setVisible(false);
					this.jInternalFrameImportacionFormaPagoInven.setSelected(false);
				}
				
				*/
			}
			
			
			if(!this.conCargarMinimo) {
				/*
				if(this.jInternalFrameOrderByFormaPagoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFormaPagoInven);
					this.jInternalFrameOrderByFormaPagoInven.setVisible(false);
					this.jInternalFrameOrderByFormaPagoInven.setSelected(false);				
				}
				*/
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFormaPagoInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FormaPagoInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.formapagoinvenReturnGeneral=new FormaPagoInvenParameterReturnGeneral();
			
			this.formapagoinvenParameterGeneral=new FormaPagoInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.formapagoinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			/*
			if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			*/
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(FormaPagoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormaPagoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formapagoinvenSessionBean.getEsGuardarRelacionado(),this.formapagoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormaPagoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formapagoinvenSessionBean.getEsGuardarRelacionado(),this.formapagoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFormaPagoInven=false;
			this.isVisibilidadCeldaDuplicarFormaPagoInven=true;
			this.isVisibilidadCeldaCopiarFormaPagoInven=true;
			this.isVisibilidadCeldaVerFormFormaPagoInven=true;
			this.isVisibilidadCeldaOrdenFormaPagoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=false;
			this.isVisibilidadCeldaModificarFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdCompra=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoFormaPago=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFormaPagoInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFormaPagoInven(false);
			
			this.setPermisosUsuarioFormaPagoInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.formapagoinvenSessionBean.getEsGuardarRelacionado() && this.formapagoinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFormaPagoInvenClasesRelacionadas();
			}
			
			if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFormaPagoInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFormaPagoInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFormaPagoInven();
			}
			
			if(!this.isPermisoBusquedaFormaPagoInven) {
				//BYDAN_BUSQUEDAS
				/*
				this.jTabbedPaneBusquedasFormaPagoInven.setVisible(false);				
				*/
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFormaPagoInven,this.isPermisoPaginacionMedioFormaPagoInven,this.isPermisoPaginacionTodoFormaPagoInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FormaPagoInvenConstantesFunciones.getTiposSeleccionarFormaPagoInven());
				
				this.tiposColumnasSelect=FormaPagoInvenConstantesFunciones.getTiposSeleccionarFormaPagoInven(true);
				
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
			//if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFormaPagoInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioFormaPagoInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioFormaPagoInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFormaPagoInven() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			/*
			this.arrOrderBy= new  ArrayList<OrderBy>();
			*/
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			/*
			this.traerValoresTablaOrderBy();			
			*/
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.tipoformapagoLogic=new TipoFormaPagoLogic();
			this.compraLogic=new CompraLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
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
				formapagoinvenImplementable= (FormaPagoInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormaPagoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				formapagoinvenImplementableHome= (FormaPagoInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormaPagoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.formapagoinvens= new ArrayList<FormaPagoInven>();
			this.formapagoinvensEliminados= new ArrayList<FormaPagoInven>();
						
			this.isEsNuevoFormaPagoInven=false;
			this.esParaAccionDesdeFormularioFormaPagoInven=false;
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
			this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>() ;
			this.comprasForeignKey=new ArrayList<Compra>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFormaPagoInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFormaPagoInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FormaPagoInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FormaPagoInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFormaPagoInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFormaPagoInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFormaPagoInven();
			}
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				/*
				
				for(int i=0; i<this.jTabbedPaneBusquedasFormaPagoInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFormaPagoInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFormaPagoInven.setSelectedIndex(0);
				}	
				
				*/
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFormaPagoInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FormaPagoInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFormaPagoInven() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFormaPagoInven")) {
				iIndex=this.jInternalFrameDetalleFormFormaPagoInven.jTabbedPaneRelacionesFormaPagoInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFormaPagoInven.jTabbedPaneRelacionesFormaPagoInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFormaPagoInven();	
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
	
	public void cargarCombosForeignKeyFormaPagoInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFormaPagoInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFormaPagoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFormaPagoInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFormaPagoInven();
		
		this.cargarCombosFrameForeignKeyFormaPagoInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFormaPagoInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFormaPagoInven();
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
	
	public void jButtonNuevoFormaPagoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
			
			if(jTableDatosFormaPagoInven.getRowCount()>=1) {
				jTableDatosFormaPagoInven.removeRowSelectionInterval(0, jTableDatosFormaPagoInven.getRowCount()-1);						
			}
			
			this.isEsNuevoFormaPagoInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFormaPagoInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFormaPagoInven(true);			
			//this.formapagoinven=new FormaPagoInven();
			//this.formapagoinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormaPagoInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormaPagoInven() ;
			
			if(FormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormaPagoInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.formapagoinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);				
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
			if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FormaPagoInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFormaPagoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFormaPagoInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFormaPagoInven.getSelectedRows().length;			
			}
			
			formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFormaPagoInven--;			
				//FormaPagoInven formapagoinvenAux= new FormaPagoInven();			
				//formapagoinvenAux.setId(this.iIdNuevoFormaPagoInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FormaPagoInven formapagoinvenOrigen=new FormaPagoInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FormaPagoInven formapagoinvenOrigen : formapagoinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							formapagoinvenOrigen =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formapagoinvenOrigen =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFormaPagoInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.formapagoinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFormaPagoInven(formapagoinvenOrigen,this.formapagoinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formapagoinvenLogic.getFormaPagoInvens().add(this.formapagoinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formapagoinvens.add(this.formapagoinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFormaPagoInven(false);
				
				this.jTableDatosFormaPagoInven.setRowSelectionInterval(this.getIndiceNuevoFormaPagoInven(), this.getIndiceNuevoFormaPagoInven());
				
				int iLastRow =  this.jTableDatosFormaPagoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormaPagoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormaPagoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormaPagoInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();									
		
			FormaPagoInven formapagoinvenOrigen=new FormaPagoInven();
			FormaPagoInven formapagoinvenDestino=new FormaPagoInven();
				
			formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFormaPagoInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || formapagoinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFormaPagoInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenOrigen =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formapagoinvenOrigen =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formapagoinvenDestino =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formapagoinvenDestino =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				formapagoinvenOrigen =formapagoinvensSeleccionados.get(0);
				formapagoinvenDestino =formapagoinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFormaPagoInven(formapagoinvenOrigen,formapagoinvenDestino,true,false);
				
				formapagoinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formapagoinvenDestino,formapagoinvenLogic.getFormaPagoInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formapagoinvenDestino,formapagoinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFormaPagoInven(false);
				
				//this.jTableDatosFormaPagoInven.setRowSelectionInterval(this.getIndiceNuevoFormaPagoInven(), this.getIndiceNuevoFormaPagoInven());
				
				int iLastRow =  this.jTableDatosFormaPagoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormaPagoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormaPagoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormaPagoInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFormaPagoInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFormaPagoInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			/*
			this.jTabbedPaneBusquedasFormaPagoInven.setVisible(!isVisible);			
			*/
			
			this.jPanelParametrosReportesFormaPagoInven.setVisible(!isVisible);
			this.jPanelPaginacionFormaPagoInven.setVisible(!isVisible);
			this.jPanelAccionesFormaPagoInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFormaPagoInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			/*
			this.cerrarFrameReporteDinamicoFormaPagoInven();
			*/
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			/*
			this.cerrarFrameImportacionFormaPagoInven();
			*/
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			/*
			
			this.abrirInicializarFrameOrderByFormaPagoInven();
			
			this.abrirFrameOrderByFormaPagoInven();
			*/
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			/*
			this.cerrarFrameOrderByFormaPagoInven();
			*/
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFormaPagoInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormaPagoInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFormaPagoInven.isMaximum()) {
					this.jInternalFrameDetalleFormFormaPagoInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFormaPagoInven.setSize(this.jInternalFrameDetalleFormFormaPagoInven.iWidthFormulario,this.jInternalFrameDetalleFormFormaPagoInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFormaPagoInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFormaPagoInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFormaPagoInven.isMaximum()) {
						this.jInternalFrameDetalleFormFormaPagoInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFormaPagoInven.jContentPaneDetalleFormaPagoInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFormaPagoInven.jTabbedPaneRelacionesFormaPagoInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFormaPagoInven.jContentPaneDetalleFormaPagoInven.getWidth(),FormaPagoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormaPagoInven.jTabbedPaneRelacionesFormaPagoInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFormaPagoInven.jContentPaneDetalleFormaPagoInven.getWidth(),FormaPagoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormaPagoInven.jTabbedPaneRelacionesFormaPagoInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFormaPagoInven.jContentPaneDetalleFormaPagoInven.getWidth(),FormaPagoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFormaPagoInven.setVisible(true);
	        this.jInternalFrameDetalleFormFormaPagoInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	/*
	public void abrirInicializarFrameOrderByFormaPagoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFormaPagoInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFormaPagoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormaPagoInven,false,this);
				} else {
					this.jInternalFrameOrderByFormaPagoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormaPagoInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFormaPagoInven);
				this.jInternalFrameOrderByFormaPagoInven.setVisible(false);
				this.jInternalFrameOrderByFormaPagoInven.setSelected(false);
				
				this.jInternalFrameOrderByFormaPagoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormaPagoInven"));
				
				this.inicializarActualizarBindingTablaOrderByFormaPagoInven();
			}
		} catch (final Exception e) {
			
		}
	}
	*/
	
	/*
	public void abrirInicializarFrameImportacionFormaPagoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFormaPagoInven==null) {
				
				this.jInternalFrameImportacionFormaPagoInven=new ImportacionJInternalFrame(FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormaPagoInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFormaPagoInven);
				this.jInternalFrameImportacionFormaPagoInven.setVisible(false);
				this.jInternalFrameImportacionFormaPagoInven.setSelected(false);


				this.jInternalFrameImportacionFormaPagoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormaPagoInven"));
				this.jInternalFrameImportacionFormaPagoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormaPagoInven"));
				this.jInternalFrameImportacionFormaPagoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormaPagoInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	*/
	
	/*
	public void abrirInicializarFrameReporteDinamicoFormaPagoInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFormaPagoInven==null) {
				this.jInternalFrameReporteDinamicoFormaPagoInven=new ReporteDinamicoJInternalFrame(FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormaPagoInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormaPagoInven);
				this.jInternalFrameReporteDinamicoFormaPagoInven.setVisible(false);
				this.jInternalFrameReporteDinamicoFormaPagoInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFormaPagoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormaPagoInven"));
				this.jInternalFrameReporteDinamicoFormaPagoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormaPagoInven"));
				this.jInternalFrameReporteDinamicoFormaPagoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormaPagoInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormaPagoInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	*/
	
	
		
					
	public void cerrarFrameDetalleFormaPagoInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormaPagoInven);
			
	       	this.jInternalFrameDetalleFormFormaPagoInven.setVisible(false);
	        this.jInternalFrameDetalleFormFormaPagoInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormFormaPagoInven.dispose();
			//this.jInternalFrameDetalleFormFormaPagoInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	/*
	public void abrirFrameReporteDinamicoFormaPagoInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFormaPagoInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoFormaPagoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	*/
	
	/*
	public void abrirFrameImportacionFormaPagoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFormaPagoInven.setVisible(true);
	        this.jInternalFrameImportacionFormaPagoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	*/
	
	
	
	/*
	public void abrirFrameOrderByFormaPagoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFormaPagoInven.setVisible(true);
	        this.jInternalFrameOrderByFormaPagoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	*/
	
	/*
	public void cerrarFrameOrderByFormaPagoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFormaPagoInven.setVisible(false);
	        this.jInternalFrameOrderByFormaPagoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	*/
	
	/*
	public void cerrarFrameReporteDinamicoFormaPagoInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFormaPagoInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoFormaPagoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	*/
	
	/*
	public void cerrarFrameImportacionFormaPagoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFormaPagoInven.setVisible(false);
	        this.jInternalFrameImportacionFormaPagoInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	*/
	
	

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
						TitledBorder titledBorderFormaPagoInven=(TitledBorder)this.jScrollPanelDatosFormaPagoInven.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderFormaPagoInven.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFormaPagoInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFormaPagoInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFormaPagoInven(true);
			//this.isEsNuevoFormaPagoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFormaPagoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormaPagoInven(false) ;
			
			if(formapagoinvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormaPagoInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormaPagoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFormaPagoInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFormaPagoInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFormaPagoInven(true);
			//this.isEsNuevoFormaPagoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.formapagoinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFormaPagoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFormaPagoInven(false) ;
			
			if(FormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormaPagoInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormaPagoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.formapagoinvenConstantesFunciones.cargarid_cuenta_contableFormaPagoInven) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingFormaPagoInven(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaTipoFormaPago(List<TipoFormaPago> tipoformapagosForeignKey)throws Exception{
		TableColumn tableColumnTipoFormaPago=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO));
		TableCellEditor tableCellEditorTipoFormaPago =tableColumnTipoFormaPago.getCellEditor();

		TipoFormaPagoTableCell tipoformapagoTableCellFk=(TipoFormaPagoTableCell)tableCellEditorTipoFormaPago;

		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.settipoformapagosForeignKey(tipoformapagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormaPagoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoformapagoTableCellFk.setRowActual(intSelectedRow);
			//tipoformapagoTableCellFk.settipoformapagosForeignKeyActual(tipoformapagosForeignKey);
		//}


		if(tipoformapagoTableCellFk!=null) {
			tipoformapagoTableCellFk.RecargarTipoFormaPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCompra(List<Compra> comprasForeignKey)throws Exception{
		TableColumn tableColumnCompra=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA));
		TableCellEditor tableCellEditorCompra =tableColumnCompra.getCellEditor();

		CompraTableCell compraTableCellFk=(CompraTableCell)tableCellEditorCompra;

		if(compraTableCellFk!=null) {
			compraTableCellFk.setcomprasForeignKey(comprasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormaPagoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//compraTableCellFk.setRowActual(intSelectedRow);
			//compraTableCellFk.setcomprasForeignKeyActual(comprasForeignKey);
		//}


		if(compraTableCellFk!=null) {
			compraTableCellFk.RecargarComprasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormaPagoInven.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormaPagoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormaPagoInven.getSelectedRow();

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
	
	public void jButtonActualizarFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFormaPagoInven(false);
			
			//if(!this.isEsNuevoFormaPagoInven) {								
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				
			}
			
			if(this.permiteMantenimiento(this.formapagoinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFormaPagoInven=true;
					this.inicializarActualizarBindingTablaFormaPagoInven(false);
					this.isEsNuevoFormaPagoInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFormaPagoInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFormaPagoInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormaPagoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormaPagoInven(false);
				
				this.habilitarDeshabilitarControlesFormaPagoInven(false);
			
												
				
				if(FormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFormaPagoInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFormaPagoInvenActionPerformed(evt,formapagoinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFormaPagoInven(this.formapagoinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFormaPagoInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,formapagoinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.formapagoinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FormaPagoInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormaPagoInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				this.formapagoinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				this.formapagoinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.formapagoinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FormaPagoInvenModel) this.jTableDatosFormaPagoInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFormaPagoInven=true;
				this.inicializarActualizarBindingTablaFormaPagoInven(false);
				this.isEsNuevoFormaPagoInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormaPagoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormaPagoInven(false);
				
				this.habilitarDeshabilitarControlesFormaPagoInven(false);
				
				
				
				if(FormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFormaPagoInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFormaPagoInven.getRowCount()>=1) {
				jTableDatosFormaPagoInven.removeRowSelectionInterval(0, jTableDatosFormaPagoInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFormaPagoInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFormaPagoInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormaPagoInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormaPagoInven(false) ;
			
			this.isEsNuevoFormaPagoInven=false;
			
			if(FormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFormaPagoInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFormaPagoInven(false);
				
				//SI ES MANUAL
				if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFormaPagoInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFormaPagoInven--;			
			//FormaPagoInven formapagoinvenAux= new FormaPagoInven();			
			//formapagoinvenAux.setId(this.iIdNuevoFormaPagoInven);
			
			if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFormaPagoInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
			
			this.formapagoinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.formapagoinvenLogic.getFormaPagoInvens().add(this.formapagoinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.formapagoinvens.add(this.formapagoinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFormaPagoInven(false);
			
			this.jTableDatosFormaPagoInven.setRowSelectionInterval(this.getIndiceNuevoFormaPagoInven(), this.getIndiceNuevoFormaPagoInven());
			
			int iLastRow =  this.jTableDatosFormaPagoInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFormaPagoInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFormaPagoInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFormaPagoInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFormaPagoInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormaPagoInven(false);
			
			//SI ES MANUAL
			if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormaPagoInven();
			}
			
			//this.abrirFrameTreeFormaPagoInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	/*
	public void jButtonGenerarImportacionFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Forma PagoES ?", "MANTENIMIENTO DE Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFormaPagoInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFormaPagoInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.formapagoinvenReturnGeneral=formapagoinvenLogic.procesarImportacionFormaPagoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.formapagoinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFormaPagoInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	*/
	
	/*
	public void jButtonAbrirImportacionFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFormaPagoInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFormaPagoInven.setFileImportacion(this.jInternalFrameImportacionFormaPagoInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFormaPagoInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFormaPagoInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFormaPagoInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFormaPagoInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	*/
	
	public void jButtonGenerarReporteDinamicoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();		

		formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(true);
		
		/*
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		*/
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FormaPagoInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FormaPagoInvenBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			/*
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			*/
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteFormaPagoInvens("Todos",formapagoinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	/*
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDias_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDias_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDias_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDias_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Compra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Compra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Compra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Compra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFormaPagoInven.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	*/
	
	/*
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoria="id_tipo_forma_pago";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoria="numero_dias";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA:
					sNombreCampoCategoria="id_compra";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					sNombreCampoCategoriaValor="id_tipo_forma_pago";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoriaValor="numero_dias";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA:
					sNombreCampoCategoriaValor="id_compra";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_forma_pago");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Dias",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_dias");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_compra");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
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
	*/
	
	//@SuppressWarnings("deprecation")
	/*
	public void jButtonGenerarExcelReporteDinamicoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();		
		
		formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formapagoinven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FormaPagoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.gettipoformapago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getnumero_dias());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getdetalle());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getcompra_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormaPagoInvenConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(FormaPagoInven formapagoinven:formapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formapagoinven.getfecha());
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
			//	this.getFilaCabeceraExportarExcelFormaPagoInven(row);				
			//	iRow++;
			//}				
			
			//for(FormaPagoInven formapagoinvenAux:formapagoinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFormaPagoInven(formapagoinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	*/
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormaPagoInven(false);
			
			//SI ES MANUAL
			if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormaPagoInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormaPagoInven(false);
			
			//SI ES MANUAL
			if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormaPagoInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormaPagoInven(false);
			
			//SI ES MANUAL
			if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormaPagoInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFormaPagoInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFormaPagoInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFormaPagoInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFormaPagoInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFormaPagoInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFormaPagoInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosFormaPagoInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosFormaPagoInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFormaPagoInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFormaPagoInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFormaPagoInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFormaPagoInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFormaPagoInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFormaPagoInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormaPagoInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFormaPagoInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFormaPagoInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFormaPagoInven();
		
		this.inicializarActualizarBindingBotonesManualFormaPagoInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
			/*
			this.inicializarActualizarBindingBusquedasManualFormaPagoInven();			
			*/
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormaPagoInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFormaPagoInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFormaPagoInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFormaPagoInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFormaPagoInven.isSelected();
				
				/*
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFormaPagoInven.isSelected();															
				*/
				
				if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFormaPagoInven.jCheckBoxPostAccionNuevoFormaPagoInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFormaPagoInven.jCheckBoxPostAccionSinCerrarFormaPagoInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFormaPagoInven.jCheckBoxPostAccionSinMensajeFormaPagoInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFormaPagoInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFormaPagoInven.setSelected(this.isSeleccionados);
				
				/*
				this.jCheckBoxConGraficoReporteFormaPagoInven.setSelected(this.conGraficoReporte);				
				*/
				
				if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
				this.jInternalFrameDetalleFormFormaPagoInven.jCheckBoxPostAccionNuevoFormaPagoInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFormaPagoInven.jCheckBoxPostAccionSinCerrarFormaPagoInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFormaPagoInven.jCheckBoxPostAccionSinMensajeFormaPagoInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			/*
			if(this.jComboBoxTiposPaginacionFormaPagoInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFormaPagoInven.getSelectedItem()).getsCodigo();			
			}
			*/
			
			
			if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.getSelectedItem()).getsCodigo();
			}
			
			
			/*
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFormaPagoInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFormaPagoInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFormaPagoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFormaPagoInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFormaPagoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFormaPagoInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFormaPagoInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFormaPagoInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFormaPagoInven.getText();						
			
			*/
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFormaPagoInven(Boolean esInicializar) throws Exception {
		try	{	
			if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFormaPagoInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFormaPagoInven() throws Exception {
		try	{
			if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormaPagoInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormaPagoInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormaPagoInven() throws Exception {
		try	{
			/*
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFormaPagoInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFormaPagoInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFormaPagoInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFormaPagoInven.addItem(reporte);
			}
			
			
			if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFormaPagoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFormaPagoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFormaPagoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFormaPagoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			*/
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			/*
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFormaPagoInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFormaPagoInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormaPagoInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			*/
		} catch(Exception e) {
			throw e;
		}
	}		
	
	/*
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormaPagoInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormaPagoInven!=null) {
				this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormaPagoInven!=null) {
				this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFormaPagoInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFormaPagoInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormaPagoInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormaPagoInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FormaPagoInvenConstantesFunciones.getTiposSeleccionarFormaPagoInven(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FormaPagoInvenConstantesFunciones.getTiposSeleccionarFormaPagoInven(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FormaPagoInvenConstantesFunciones.getTiposSeleccionarFormaPagoInven(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormaPagoInven.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFormaPagoInven.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	*/
	
	/*
	public void inicializarActualizarBindingBusquedasManualFormaPagoInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_compraFK_IdCompraFormaPagoInven.getSelectedItem()!=null){this.id_compraFK_IdCompra=((Compra)this.jComboBoxid_compraFK_IdCompraFormaPagoInven.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormaPagoInven.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.getSelectedItem()!=null){this.id_tipo_forma_pagoFK_IdTipoFormaPago=((TipoFormaPago)this.jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoFormaPagoInven.getSelectedItem()).getId();}
		
	}
	*/
	
	
	
	public void inicializarActualizarBindingBusquedasFormaPagoInven(Boolean esInicializar) throws Exception {				
		if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
			/*
			this.inicializarActualizarBindingBusquedasManualFormaPagoInven();			
			*/
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFormaPagoInven() throws Exception {
		this.inicializarActualizarBindingTablaFormaPagoInven(false);
	}
	
	/*
	public void inicializarActualizarBindingTablaOrderByFormaPagoInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFormaPagoInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	*/
	
	
	public void inicializarActualizarBindingTablaFormaPagoInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=formapagoinvenLogic.getFormaPagoInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=formapagoinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFormaPagoInven.setModel(new FormaPagoInvenModel(this.formapagoinvenLogic.getFormaPagoInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFormaPagoInven.setModel(new FormaPagoInvenModel(this.formapagoinvens,this));
			}
			//ARCHITECTURE
			
							
			/*
			
			if(this.jInternalFrameOrderByFormaPagoInven!=null && this.jInternalFrameOrderByFormaPagoInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFormaPagoInven();
			}
			*/
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,formapagoinvenConstantesFunciones.resaltarSeleccionarFormaPagoInven,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,formapagoinvenConstantesFunciones.resaltarSeleccionarFormaPagoInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_ID));

		if(this.formapagoinvenConstantesFunciones.mostraridFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formapagoinvenConstantesFunciones.resaltaridFormaPagoInven,this.formapagoinvenConstantesFunciones.activaridFormaPagoInven,iSizeTabla,this,true,"idFormaPagoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formapagoinvenConstantesFunciones.resaltaridFormaPagoInven,this.formapagoinvenConstantesFunciones.activaridFormaPagoInven,this,true,"idFormaPagoInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.formapagoinvenConstantesFunciones.mostrarid_empresaFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_empresaFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_empresaFormaPagoInven,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_empresaFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_empresaFormaPagoInven,false,"id_empresaFormaPagoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.formapagoinvenConstantesFunciones.mostrarid_sucursalFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_sucursalFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_sucursalFormaPagoInven,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_sucursalFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_sucursalFormaPagoInven,false,"id_sucursalFormaPagoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.formapagoinvenConstantesFunciones.mostrarid_ejercicioFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_ejercicioFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_ejercicioFormaPagoInven,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_ejercicioFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_ejercicioFormaPagoInven,false,"id_ejercicioFormaPagoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO));

		if(this.formapagoinvenConstantesFunciones.mostrarid_periodoFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_periodoFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_periodoFormaPagoInven,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_periodoFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_periodoFormaPagoInven,false,"id_periodoFormaPagoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO));

		if(this.formapagoinvenConstantesFunciones.mostrarid_tipo_forma_pagoFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_tipo_forma_pagoFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_tipo_forma_pagoFormaPagoInven,iSizeTabla));
			tableColumn.setCellEditor(new TipoFormaPagoTableCell(this.tipoformapagosForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_tipo_forma_pagoFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_tipo_forma_pagoFormaPagoInven,true,"id_tipo_forma_pagoFormaPagoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO));

		if(this.formapagoinvenConstantesFunciones.mostrarfecha_inicioFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.formapagoinvenConstantesFunciones.resaltarfecha_inicioFormaPagoInven,this.formapagoinvenConstantesFunciones.activarfecha_inicioFormaPagoInven,iSizeTabla,this,true,"fecha_inicioFormaPagoInven","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.formapagoinvenConstantesFunciones.resaltarfecha_inicioFormaPagoInven,this.formapagoinvenConstantesFunciones.activarfecha_inicioFormaPagoInven,this,true,"fecha_inicioFormaPagoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS));

		if(this.formapagoinvenConstantesFunciones.mostrarnumero_diasFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formapagoinvenConstantesFunciones.resaltarnumero_diasFormaPagoInven,this.formapagoinvenConstantesFunciones.activarnumero_diasFormaPagoInven,iSizeTabla,this,true,"numero_diasFormaPagoInven","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formapagoinvenConstantesFunciones.resaltarnumero_diasFormaPagoInven,this.formapagoinvenConstantesFunciones.activarnumero_diasFormaPagoInven,this,true,"numero_diasFormaPagoInven","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN));

		if(this.formapagoinvenConstantesFunciones.mostrarfecha_finFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.formapagoinvenConstantesFunciones.resaltarfecha_finFormaPagoInven,this.formapagoinvenConstantesFunciones.activarfecha_finFormaPagoInven,iSizeTabla,this,true,"fecha_finFormaPagoInven","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.formapagoinvenConstantesFunciones.resaltarfecha_finFormaPagoInven,this.formapagoinvenConstantesFunciones.activarfecha_finFormaPagoInven,this,true,"fecha_finFormaPagoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE));

		if(this.formapagoinvenConstantesFunciones.mostrarporcentajeFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formapagoinvenConstantesFunciones.resaltarporcentajeFormaPagoInven,this.formapagoinvenConstantesFunciones.activarporcentajeFormaPagoInven,iSizeTabla,this,true,"porcentajeFormaPagoInven","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formapagoinvenConstantesFunciones.resaltarporcentajeFormaPagoInven,this.formapagoinvenConstantesFunciones.activarporcentajeFormaPagoInven,this,true,"porcentajeFormaPagoInven","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_VALOR));

		if(this.formapagoinvenConstantesFunciones.mostrarvalorFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formapagoinvenConstantesFunciones.resaltarvalorFormaPagoInven,this.formapagoinvenConstantesFunciones.activarvalorFormaPagoInven,iSizeTabla,this,true,"valorFormaPagoInven","BASICO-CON_EVENT_CHANGE"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formapagoinvenConstantesFunciones.resaltarvalorFormaPagoInven,this.formapagoinvenConstantesFunciones.activarvalorFormaPagoInven,this,true,"valorFormaPagoInven","BASICO-CON_EVENT_CHANGE",true));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_DETALLE));

		if(this.formapagoinvenConstantesFunciones.mostrardetalleFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.formapagoinvenConstantesFunciones.resaltardetalleFormaPagoInven,this.formapagoinvenConstantesFunciones.activardetalleFormaPagoInven,iSizeTabla,this,true,"detalleFormaPagoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formapagoinvenConstantesFunciones.resaltardetalleFormaPagoInven,this.formapagoinvenConstantesFunciones.activardetalleFormaPagoInven,this,true,"detalleFormaPagoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDANIO));

		if(this.formapagoinvenConstantesFunciones.mostrarid_anioFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_anioFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_anioFormaPagoInven,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_anioFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_anioFormaPagoInven,true,"id_anioFormaPagoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,FormaPagoInvenConstantesFunciones.LABEL_IDMES));

		if(this.formapagoinvenConstantesFunciones.mostrarid_mesFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormaPagoInvenConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_mesFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_mesFormaPagoInven,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.formapagoinvenConstantesFunciones.resaltarid_mesFormaPagoInven,this,this.formapagoinvenConstantesFunciones.activarid_mesFormaPagoInven,true,"id_mesFormaPagoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formapagoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formapagoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormaPagoInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formapagoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formapagoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormaPagoInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.formapagoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.formapagoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFormaPagoInven.addColumn(tableColumn);
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
			
			this.jTableDatosFormaPagoInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFormaPagoInven.moveColumn(this.jTableDatosFormaPagoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFormaPagoInven.moveColumn(this.jTableDatosFormaPagoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFormaPagoInven.moveColumn(this.jTableDatosFormaPagoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFormaPagoInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFormaPagoInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFormaPagoInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFormaPagoInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFormaPagoInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFormaPagoInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFormaPagoInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFormaPagoInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=formapagoinvenLogic.getFormaPagoInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=formapagoinvens.size()-1;
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
		//this.jTableDatosFormaPagoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFormaPagoInven();
			
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
				
				//this.isEsNuevoFormaPagoInven=false;
					
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFormaPagoInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormaPagoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormaPagoInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.formapagoinven.getsType().equals("DUPLICADO")
				   || this.formapagoinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFormaPagoInven=true;
				
				} else {
					this.isEsNuevoFormaPagoInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.formapagoinven.getId()>=0 && !this.formapagoinven.getIsNew()) {						
						this.isEsNuevoFormaPagoInven=false;
						
					} else {
						this.isEsNuevoFormaPagoInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFormaPagoInven(esRelaciones);						
				
				this.seleccionarFormaPagoInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.formapagoinven.getId()<0) {
					this.isEsNuevoFormaPagoInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFormaPagoInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFormaPagoInven(evt,rowIndex);
				}	
				
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FormaPagoInven: " + this.dDif); 
					}
				}								
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFormaPagoInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.formapagoinven)) {
					if(this.formapagoinven.getId()>0) {
						this.formapagoinven.setIsDeleted(true);
						
						this.formapagoinvensEliminados.add(this.formapagoinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formapagoinvenLogic.getFormaPagoInvens().remove(this.formapagoinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formapagoinvens.remove(this.formapagoinven);				
					}
					
					
					((FormaPagoInvenModel) this.jTableDatosFormaPagoInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFormaPagoInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFormaPagoInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFormaPagoInven) {
			
			if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormaPagoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormaPagoInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFormaPagoInven(this.formapagoinven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.formapagoinvenConstantesFunciones.cargarid_empresaFormaPagoInven || this.formapagoinvenConstantesFunciones.event_dependid_empresaFormaPagoInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.formapagoinven.getid_empresa());
									//this.inicializarActualizarBindingFormaPagoInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(formapagoinven.getEmpresa()!=null) {
							this.empresasForeignKey.add(formapagoinven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.formapagoinven.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.formapagoinvenConstantesFunciones.cargarid_sucursalFormaPagoInven || this.formapagoinvenConstantesFunciones.event_dependid_sucursalFormaPagoInven) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.formapagoinven.getid_sucursal());
									//this.inicializarActualizarBindingFormaPagoInven(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(formapagoinven.getSucursal()!=null) {
							this.sucursalsForeignKey.add(formapagoinven.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.formapagoinven.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.formapagoinvenConstantesFunciones.cargarid_ejercicioFormaPagoInven || this.formapagoinvenConstantesFunciones.event_dependid_ejercicioFormaPagoInven) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.formapagoinven.getid_ejercicio());
									//this.inicializarActualizarBindingFormaPagoInven(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(formapagoinven.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(formapagoinven.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.formapagoinven.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.formapagoinvenConstantesFunciones.cargarid_periodoFormaPagoInven || this.formapagoinvenConstantesFunciones.event_dependid_periodoFormaPagoInven) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.formapagoinven.getid_periodo());
									//this.inicializarActualizarBindingFormaPagoInven(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(formapagoinven.getPeriodo()!=null) {
							this.periodosForeignKey.add(formapagoinven.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.formapagoinven.getid_periodo(),false,"Formulario");

					//TipoFormaPago
					if(!this.formapagoinvenConstantesFunciones.cargarid_tipo_forma_pagoFormaPagoInven || this.formapagoinvenConstantesFunciones.event_dependid_tipo_forma_pagoFormaPagoInven) {
						//this.cargarCombosTipoFormaPagosForeignKeyLista(" where id="+this.formapagoinven.getid_tipo_forma_pago());
									//this.inicializarActualizarBindingFormaPagoInven(false,false);
						this.tipoformapagosForeignKey=new ArrayList<TipoFormaPago>();

						if(formapagoinven.getTipoFormaPago()!=null) {
							this.tipoformapagosForeignKey.add(formapagoinven.getTipoFormaPago());
						}

						this.addItemDefectoCombosForeignKeyTipoFormaPago();
						this.cargarCombosFrameTipoFormaPagosForeignKey("Todos");
					}
					this.setActualTipoFormaPagoForeignKey(this.formapagoinven.getid_tipo_forma_pago(),false,"Formulario");

					//Compra
					if(!this.formapagoinvenConstantesFunciones.cargarid_compraFormaPagoInven || this.formapagoinvenConstantesFunciones.event_dependid_compraFormaPagoInven) {
						//this.cargarCombosComprasForeignKeyLista(" where id="+this.formapagoinven.getid_compra());
									//this.inicializarActualizarBindingFormaPagoInven(false,false);
						this.comprasForeignKey=new ArrayList<Compra>();

						if(formapagoinven.getCompra()!=null) {
							this.comprasForeignKey.add(formapagoinven.getCompra());
						}

						this.addItemDefectoCombosForeignKeyCompra();
						this.cargarCombosFrameComprasForeignKey("Todos");
					}
					this.setActualCompraForeignKey(this.formapagoinven.getid_compra(),false,"Formulario");

					//Anio
					if(!this.formapagoinvenConstantesFunciones.cargarid_anioFormaPagoInven || this.formapagoinvenConstantesFunciones.event_dependid_anioFormaPagoInven) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.formapagoinven.getid_anio());
									//this.inicializarActualizarBindingFormaPagoInven(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(formapagoinven.getAnio()!=null) {
							this.aniosForeignKey.add(formapagoinven.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.formapagoinven.getid_anio(),false,"Formulario");

					//Mes
					if(!this.formapagoinvenConstantesFunciones.cargarid_mesFormaPagoInven || this.formapagoinvenConstantesFunciones.event_dependid_mesFormaPagoInven) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.formapagoinven.getid_mes());
									//this.inicializarActualizarBindingFormaPagoInven(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(formapagoinven.getMes()!=null) {
							this.messForeignKey.add(formapagoinven.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.formapagoinven.getid_mes(),false,"Formulario");

					//CuentaContable
					if(!this.formapagoinvenConstantesFunciones.cargarid_cuenta_contableFormaPagoInven || this.formapagoinvenConstantesFunciones.event_dependid_cuenta_contableFormaPagoInven) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.formapagoinven.getid_cuenta_contable());
									//this.inicializarActualizarBindingFormaPagoInven(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(formapagoinven.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(formapagoinven.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.formapagoinven.getid_cuenta_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFormaPagoInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFormaPagoInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormaPagoInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormaPagoInven(FormaPagoInven formapagoinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFormaPagoInven(formapagoinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormaPagoInven(FormaPagoInven formapagoinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFormaPagoInven(formapagoinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFormaPagoInven(formapagoinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFormaPagoInven(formapagoinven);
	}
	
	public void setVariablesObjetoActualToFormularioFormaPagoInven(FormaPagoInven formapagoinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFormaPagoInven.jLabelidFormaPagoInven.setText(formapagoinven.getId().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_inicioFormaPagoInven.setDate(formapagoinven.getfecha_inicio());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.setText(formapagoinven.getnumero_dias().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_finFormaPagoInven.setDate(formapagoinven.getfecha_fin());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.setText(formapagoinven.getporcentaje().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.setText(formapagoinven.getvalor().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextAreadetalleFormaPagoInven.setText(formapagoinven.getdetalle());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FormaPagoInven formapagoinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,formapagoinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FormaPagoInven formapagoinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				formapagoinvenLocal=this.formapagoinven;
			} else {
				formapagoinvenLocal=this.formapagoinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(formapagoinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFormaPagoInven(formapagoinvenLocal,true);
					
					if(formapagoinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(formapagoinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(formapagoinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFormaPagoInven(FormaPagoInven formapagoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormaPagoInven(formapagoinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(formapagoinven);
	}
	
	public void setVariablesFormularioToObjetoActualFormaPagoInven(FormaPagoInven formapagoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormaPagoInven(formapagoinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFormaPagoInven(FormaPagoInven formapagoinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFormaPagoInven.jLabelidFormaPagoInven.getText()==null || this.jInternalFrameDetalleFormFormaPagoInven.jLabelidFormaPagoInven.getText()=="" || this.jInternalFrameDetalleFormFormaPagoInven.jLabelidFormaPagoInven.getText()=="Id") {
				this.jInternalFrameDetalleFormFormaPagoInven.jLabelidFormaPagoInven.setText("0");
			}

			if(conColumnasBase) {formapagoinven.setId(Long.parseLong(this.jInternalFrameDetalleFormFormaPagoInven.jLabelidFormaPagoInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormaPagoInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelIdFormaPagoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formapagoinven.setfecha_inicio(this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_inicioFormaPagoInven.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelfecha_inicioFormaPagoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formapagoinven.setnumero_dias(Integer.parseInt(this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelnumero_diasFormaPagoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formapagoinven.setfecha_fin(this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_finFormaPagoInven.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelfecha_finFormaPagoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formapagoinven.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelporcentajeFormaPagoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formapagoinven.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormaPagoInvenConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabelvalorFormaPagoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formapagoinven.setdetalle(this.jInternalFrameDetalleFormFormaPagoInven.jTextAreadetalleFormaPagoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormaPagoInvenConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormaPagoInven.jLabeldetalleFormaPagoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormaPagoInven(FormaPagoInven formapagoinvenBean,FormaPagoInven formapagoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFormaPagoInven(FormaPagoInven formapagoinvenOrigen,FormaPagoInven formapagoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formapagoinvenOrigen.getId()!=null && !formapagoinvenOrigen.getId().equals(0L))) {formapagoinven.setId(formapagoinvenOrigen.getId());}}
			if(conDefault || (!conDefault && formapagoinvenOrigen.getfecha_inicio()!=null && !formapagoinvenOrigen.getfecha_inicio().equals(new Date()))) {formapagoinven.setfecha_inicio(formapagoinvenOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && formapagoinvenOrigen.getnumero_dias()!=null && !formapagoinvenOrigen.getnumero_dias().equals(0))) {formapagoinven.setnumero_dias(formapagoinvenOrigen.getnumero_dias());}
			if(conDefault || (!conDefault && formapagoinvenOrigen.getfecha_fin()!=null && !formapagoinvenOrigen.getfecha_fin().equals(new Date()))) {formapagoinven.setfecha_fin(formapagoinvenOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && formapagoinvenOrigen.getporcentaje()!=null && !formapagoinvenOrigen.getporcentaje().equals(0.0))) {formapagoinven.setporcentaje(formapagoinvenOrigen.getporcentaje());}
			if(conDefault || (!conDefault && formapagoinvenOrigen.getvalor()!=null && !formapagoinvenOrigen.getvalor().equals(0.0))) {formapagoinven.setvalor(formapagoinvenOrigen.getvalor());}
			if(conDefault || (!conDefault && formapagoinvenOrigen.getdetalle()!=null && !formapagoinvenOrigen.getdetalle().equals(""))) {formapagoinven.setdetalle(formapagoinvenOrigen.getdetalle());}
			if(conDefault || (!conDefault && formapagoinvenOrigen.getfecha()!=null && !formapagoinvenOrigen.getfecha().equals(new Date()))) {formapagoinven.setfecha(formapagoinvenOrigen.getfecha());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormaPagoInven(FormaPagoInven formapagoinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormaPagoInven.jLabelidFormaPagoInven.setText(formapagoinven.getId().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_inicioFormaPagoInven.setDate(formapagoinven.getfecha_inicio());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.setText(formapagoinven.getnumero_dias().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_finFormaPagoInven.setDate(formapagoinven.getfecha_fin());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.setText(formapagoinven.getporcentaje().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.setText(formapagoinven.getvalor().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextAreadetalleFormaPagoInven.setText(formapagoinven.getdetalle());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormaPagoInven(FormaPagoInvenBean formapagoinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormaPagoInven.jLabelidFormaPagoInven.setText(formapagoinvenBean.getId().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_inicioFormaPagoInven.setDate(formapagoinvenBean.getfecha_inicio());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.setText(formapagoinvenBean.getnumero_dias().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_finFormaPagoInven.setDate(formapagoinvenBean.getfecha_fin());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.setText(formapagoinvenBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.setText(formapagoinvenBean.getvalor().toString());
			this.jInternalFrameDetalleFormFormaPagoInven.jTextAreadetalleFormaPagoInven.setText(formapagoinvenBean.getdetalle());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFormaPagoInven(FormaPagoInvenParameterReturnGeneral formapagoinvenReturnGeneral,FormaPagoInvenBean formapagoinvenBean,Boolean conDefault) throws Exception { 
		try {
			FormaPagoInven formapagoinvenLocal=new FormaPagoInven();
			
			formapagoinvenLocal=formapagoinvenReturnGeneral.getFormaPagoInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formapagoinvenLocal.getId()!=null && !formapagoinvenLocal.getId().equals(0L))) {formapagoinvenBean.setId(formapagoinvenLocal.getId());}}
			if(conDefault || (!conDefault && formapagoinvenLocal.getfecha_inicio()!=null && !formapagoinvenLocal.getfecha_inicio().equals(new Date()))) {formapagoinvenBean.setfecha_inicio(formapagoinvenLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && formapagoinvenLocal.getnumero_dias()!=null && !formapagoinvenLocal.getnumero_dias().equals(0))) {formapagoinvenBean.setnumero_dias(formapagoinvenLocal.getnumero_dias());}
			if(conDefault || (!conDefault && formapagoinvenLocal.getfecha_fin()!=null && !formapagoinvenLocal.getfecha_fin().equals(new Date()))) {formapagoinvenBean.setfecha_fin(formapagoinvenLocal.getfecha_fin());}
			if(conDefault || (!conDefault && formapagoinvenLocal.getporcentaje()!=null && !formapagoinvenLocal.getporcentaje().equals(0.0))) {formapagoinvenBean.setporcentaje(formapagoinvenLocal.getporcentaje());}
			if(conDefault || (!conDefault && formapagoinvenLocal.getvalor()!=null && !formapagoinvenLocal.getvalor().equals(0.0))) {formapagoinvenBean.setvalor(formapagoinvenLocal.getvalor());}
			if(conDefault || (!conDefault && formapagoinvenLocal.getdetalle()!=null && !formapagoinvenLocal.getdetalle().equals(""))) {formapagoinvenBean.setdetalle(formapagoinvenLocal.getdetalle());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFormaPagoInvenGenerico(Long idFormaPagoInvenSeleccionado,JComboBox jComboBoxFormaPagoInven,List<FormaPagoInven> formapagoinvensLocal)throws Exception {
		try {
			FormaPagoInven  formapagoinvenTemp=null;

			for(FormaPagoInven formapagoinvenAux:formapagoinvensLocal) {
				if(formapagoinvenAux.getId()!=null && formapagoinvenAux.getId().equals(idFormaPagoInvenSeleccionado)) {
					formapagoinvenTemp=formapagoinvenAux;
					break;
				}
			}

			jComboBoxFormaPagoInven.setSelectedItem(formapagoinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFormaPagoInvenGenerico(JComboBox jComboBoxFormaPagoInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormaPagoInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFormaPagoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormaPagoInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFormaPagoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formapagoinven=(FormaPagoInven) formapagoinvenLogic.getFormaPagoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formapagoinven =(FormaPagoInven) formapagoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!formapagoinven.getIsNew() && !formapagoinven.getIsChanged() && !formapagoinven.getIsDeleted()) {
				sDescripcion=formapagoinven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=formapagoinven.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!formapagoinven.getIsNew() && !formapagoinven.getIsChanged() && !formapagoinven.getIsDeleted()) {
				sDescripcion=formapagoinven.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=formapagoinven.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!formapagoinven.getIsNew() && !formapagoinven.getIsChanged() && !formapagoinven.getIsDeleted()) {
				sDescripcion=formapagoinven.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=formapagoinven.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!formapagoinven.getIsNew() && !formapagoinven.getIsChanged() && !formapagoinven.getIsDeleted()) {
				sDescripcion=formapagoinven.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=formapagoinven.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("TipoFormaPago")) {
			//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
			if(!formapagoinven.getIsNew() && !formapagoinven.getIsChanged() && !formapagoinven.getIsDeleted()) {
				sDescripcion=formapagoinven.gettipoformapago_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFormaPagoForeignKeyDescripcion((Long)value);
				sDescripcion=formapagoinven.gettipoformapago_descripcion();
			}
		}

		if(sTipo.equals("Compra")) {
			//sDescripcion=this.getActualCompraForeignKeyDescripcion((Long)value);
			if(!formapagoinven.getIsNew() && !formapagoinven.getIsChanged() && !formapagoinven.getIsDeleted()) {
				sDescripcion=formapagoinven.getcompra_descripcion();
			} else {
				//sDescripcion=this.getActualCompraForeignKeyDescripcion((Long)value);
				sDescripcion=formapagoinven.getcompra_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!formapagoinven.getIsNew() && !formapagoinven.getIsChanged() && !formapagoinven.getIsDeleted()) {
				sDescripcion=formapagoinven.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=formapagoinven.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!formapagoinven.getIsNew() && !formapagoinven.getIsChanged() && !formapagoinven.getIsDeleted()) {
				sDescripcion=formapagoinven.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=formapagoinven.getmes_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!formapagoinven.getIsNew() && !formapagoinven.getIsChanged() && !formapagoinven.getIsDeleted()) {
				sDescripcion=formapagoinven.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=formapagoinven.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FormaPagoInven formapagoinvenRow=new FormaPagoInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formapagoinvenRow=(FormaPagoInven) formapagoinvenLogic.getFormaPagoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formapagoinvenRow=(FormaPagoInven) formapagoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFormaPagoInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoFormaPagoInven && this.isPermisoNuevoFormaPagoInven));			
			this.jButtonDuplicarFormaPagoInven.setVisible((this.isVisibilidadCeldaDuplicarFormaPagoInven && this.isPermisoDuplicarFormaPagoInven));			
			this.jButtonCopiarFormaPagoInven.setVisible((this.isVisibilidadCeldaCopiarFormaPagoInven && this.isPermisoCopiarFormaPagoInven));
			this.jButtonVerFormFormaPagoInven.setVisible((this.isVisibilidadCeldaVerFormFormaPagoInven && this.isPermisoVerFormFormaPagoInven));
			/*
			this.jButtonAbrirOrderByFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenFormaPagoInven && this.isPermisoOrdenFormaPagoInven));			
			*/
			this.jButtonNuevoRelacionesFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven && this.isPermisoNuevoFormaPagoInven));			
			this.jButtonNuevoGuardarCambiosFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoFormaPagoInven && this.isPermisoNuevoFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven));
			
			if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonModificarFormaPagoInven.setVisible((this.isVisibilidadCeldaModificarFormaPagoInven && this.isPermisoActualizarFormaPagoInven));	
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonActualizarFormaPagoInven.setVisible((this.isVisibilidadCeldaActualizarFormaPagoInven && this.isPermisoActualizarFormaPagoInven));	
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonEliminarFormaPagoInven.setVisible((this.isVisibilidadCeldaEliminarFormaPagoInven && this.isPermisoEliminarFormaPagoInven));
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonCancelarFormaPagoInven.setVisible(this.isVisibilidadCeldaCancelarFormaPagoInven);							
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven));							
			
			//TOOLBAR
			/*
			this.jButtonNuevoToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoFormaPagoInven && this.isPermisoNuevoFormaPagoInven));						
			this.jButtonDuplicarToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaDuplicarFormaPagoInven && this.isPermisoDuplicarFormaPagoInven));						
			this.jButtonCopiarToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaCopiarFormaPagoInven && this.isPermisoCopiarFormaPagoInven));			
			this.jButtonVerFormToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaVerFormFormaPagoInven && this.isPermisoVerFormFormaPagoInven));			
			this.jButtonAbrirOrderByToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenFormaPagoInven && this.isPermisoOrdenFormaPagoInven));
			this.jButtonNuevoRelacionesToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven && this.isPermisoNuevoFormaPagoInven));			
			this.jButtonNuevoGuardarCambiosToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoFormaPagoInven && this.isPermisoNuevoFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven));			
			
			if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonModificarToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaModificarFormaPagoInven && this.isPermisoActualizarFormaPagoInven));	
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonActualizarToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaActualizarFormaPagoInven  && this.isPermisoActualizarFormaPagoInven));	
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonEliminarToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaEliminarFormaPagoInven && this.isPermisoEliminarFormaPagoInven));
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonCancelarToolBarFormaPagoInven.setVisible(this.isVisibilidadCeldaCancelarFormaPagoInven);				
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven));									
			*/
			//TOOLBAR
			
			//MENUS
			/*
			this.jMenuItemNuevoFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoFormaPagoInven && this.isPermisoNuevoFormaPagoInven));			
			this.jMenuItemDuplicarFormaPagoInven.setVisible((this.isVisibilidadCeldaDuplicarFormaPagoInven && this.isPermisoDuplicarFormaPagoInven));			
			this.jMenuItemCopiarFormaPagoInven.setVisible((this.isVisibilidadCeldaCopiarFormaPagoInven && this.isPermisoCopiarFormaPagoInven));			
			this.jMenuItemVerFormFormaPagoInven.setVisible((this.isVisibilidadCeldaVerFormFormaPagoInven && this.isPermisoVerFormFormaPagoInven));			
			this.jMenuItemAbrirOrderByFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenFormaPagoInven && this.isPermisoOrdenFormaPagoInven));			
			//this.jMenuItemMostrarOcultarFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenFormaPagoInven && this.isPermisoOrdenFormaPagoInven));
			this.jMenuItemDetalleAbrirOrderByFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenFormaPagoInven && this.isPermisoOrdenFormaPagoInven));			
			//this.jMenuItemDetalleMostrarOcultarFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenFormaPagoInven && this.isPermisoOrdenFormaPagoInven));			
			this.jMenuItemNuevoRelacionesFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven && this.isPermisoNuevoFormaPagoInven));			
			this.jMenuItemNuevoGuardarCambiosFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoFormaPagoInven && this.isPermisoNuevoFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven));									
			
			if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
			this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemModificarFormaPagoInven.setVisible((this.isVisibilidadCeldaModificarFormaPagoInven && this.isPermisoActualizarFormaPagoInven));	
			this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemActualizarFormaPagoInven.setVisible((this.isVisibilidadCeldaActualizarFormaPagoInven && this.isPermisoActualizarFormaPagoInven));	
			this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemEliminarFormaPagoInven.setVisible((this.isVisibilidadCeldaEliminarFormaPagoInven && this.isPermisoEliminarFormaPagoInven));
			this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemCancelarFormaPagoInven.setVisible(this.isVisibilidadCeldaCancelarFormaPagoInven);				
			}
			
			this.jMenuItemGuardarCambiosFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven));						
			this.jMenuItemGuardarCambiosTablaFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven));						
			*/
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFormaPagoInven=this.jButtonNuevoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaDuplicarFormaPagoInven=this.jButtonDuplicarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaCopiarFormaPagoInven=this.jButtonCopiarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaVerFormFormaPagoInven=this.jButtonVerFormFormaPagoInven.isVisible();
			/*
			this.isVisibilidadCeldaOrdenFormaPagoInven=this.jButtonAbrirOrderByFormaPagoInven.isVisible();			
			*/
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=this.jButtonNuevoRelacionesFormaPagoInven.isVisible();
			this.isVisibilidadCeldaModificarFormaPagoInven=this.jButtonModificarFormaPagoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
			this.isVisibilidadCeldaActualizarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jButtonActualizarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaEliminarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jButtonEliminarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaCancelarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jButtonCancelarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaGuardarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosFormaPagoInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=this.jButtonGuardarCambiosTablaFormaPagoInven.isVisible();
			
			//TOOLBAR
			/*
			this.isVisibilidadCeldaNuevoFormaPagoInven=this.jButtonNuevoToolBarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=this.jButtonNuevoRelacionesToolBarFormaPagoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
			this.isVisibilidadCeldaModificarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jButtonModificarToolBarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaActualizarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jButtonActualizarToolBarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaEliminarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jButtonEliminarToolBarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaCancelarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jButtonCancelarToolBarFormaPagoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormaPagoInven=this.jButtonGuardarCambiosToolBarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=this.jButtonGuardarCambiosTablaToolBarFormaPagoInven.isVisible();						
			*/
			//TOOLBAR
			
			//MENUS
			/*
			this.isVisibilidadCeldaNuevoFormaPagoInven=this.jMenuItemNuevoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=this.jMenuItemNuevoRelacionesFormaPagoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
			this.isVisibilidadCeldaModificarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemModificarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaActualizarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemActualizarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaEliminarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemEliminarFormaPagoInven.isVisible();
			this.isVisibilidadCeldaCancelarFormaPagoInven=this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemCancelarFormaPagoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormaPagoInven=this.jMenuItemGuardarCambiosFormaPagoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=this.jMenuItemGuardarCambiosTablaFormaPagoInven.isVisible();						
			*/
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFormaPagoInven(Boolean esInicializar) {
		if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFormaPagoInven();
			}
			
			this.inicializarActualizarBindingBotonesManualFormaPagoInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFormaPagoInven() {
		this.jButtonNuevoFormaPagoInven.setVisible(this.isPermisoNuevoFormaPagoInven);			
		this.jButtonDuplicarFormaPagoInven.setVisible(this.isPermisoDuplicarFormaPagoInven);			
		this.jButtonCopiarFormaPagoInven.setVisible(this.isPermisoCopiarFormaPagoInven);			
		this.jButtonVerFormFormaPagoInven.setVisible(this.isPermisoVerFormFormaPagoInven);			
		/*
		this.jButtonAbrirOrderByFormaPagoInven.setVisible(this.isPermisoOrdenFormaPagoInven);					
		*/
		this.jButtonNuevoRelacionesFormaPagoInven.setVisible(this.isPermisoNuevoFormaPagoInven);			
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonModificarFormaPagoInven.setVisible(this.isPermisoActualizarFormaPagoInven);	
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonActualizarFormaPagoInven.setVisible(this.isPermisoActualizarFormaPagoInven);	
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonEliminarFormaPagoInven.setVisible(this.isPermisoEliminarFormaPagoInven);
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonCancelarFormaPagoInven.setVisible(this.isVisibilidadCeldaCancelarFormaPagoInven);						
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosFormaPagoInven.setVisible(this.isPermisoGuardarCambiosFormaPagoInven);							
		}
		
		this.jButtonGuardarCambiosTablaFormaPagoInven.setVisible(this.isPermisoActualizarFormaPagoInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFormaPagoInven() {
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonModificarFormaPagoInven.setVisible(this.isPermisoActualizarFormaPagoInven);	
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonActualizarFormaPagoInven.setVisible(this.isPermisoActualizarFormaPagoInven);	
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonEliminarFormaPagoInven.setVisible(this.isPermisoEliminarFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonCancelarFormaPagoInven.setVisible(this.isVisibilidadCeldaCancelarFormaPagoInven);							
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarFormaPagoInven && this.isPermisoGuardarCambiosFormaPagoInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFormaPagoInven() {
		if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFormaPagoInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFormaPagoInven() {
	}
	
	public void jTableDatosFormaPagoInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFormaPagoInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.formapagoinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFormaPagoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFormaPagoInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormaPagoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormaPagoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.formapagoinvenLogic.getConnexion());

				if(this.formapagoinven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.formapagoinven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormaPagoInven=(TitledBorder)this.jScrollPanelDatosFormaPagoInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFormaPagoInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.formapagoinven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalFormaPagoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebFormaPagoInven(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormaPagoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormaPagoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.formapagoinvenLogic.getConnexion());

				if(this.formapagoinven.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.formapagoinven.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormaPagoInven=(TitledBorder)this.jScrollPanelDatosFormaPagoInven.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderFormaPagoInven.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.formapagoinven.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioFormaPagoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebFormaPagoInven(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormaPagoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormaPagoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.formapagoinvenLogic.getConnexion());

				if(this.formapagoinven.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.formapagoinven.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormaPagoInven=(TitledBorder)this.jScrollPanelDatosFormaPagoInven.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderFormaPagoInven.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.formapagoinven.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoFormaPagoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebFormaPagoInven(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormaPagoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormaPagoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.formapagoinvenLogic.getConnexion());

				if(this.formapagoinven.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.formapagoinven.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormaPagoInven=(TitledBorder)this.jScrollPanelDatosFormaPagoInven.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderFormaPagoInven.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.formapagoinven.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_forma_pagoFormaPagoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoformapago=true;

			idTienePermisotipoformapago=this.tienePermisosUsuarioEnPaginaWebFormaPagoInven(TipoFormaPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoformapago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormaPagoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormaPagoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);

				this.tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoformapagoBeanSwingJInternalFrame.getTipoFormaPagoLogic().setConnexion(this.formapagoinvenLogic.getConnexion());

				if(this.formapagoinven.getid_tipo_forma_pago()!=null) {
					this.tipoformapagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoformapagoBeanSwingJInternalFrame.setIdActual(this.formapagoinven.getid_tipo_forma_pago());
					this.tipoformapagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormaPago();
				}

				JInternalFrameBase jinternalFrame =this.tipoformapagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormaPagoInven=(TitledBorder)this.jScrollPanelDatosFormaPagoInven.getBorder();
				TitledBorder titledBordertipoformapago=(TitledBorder)this.tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.getBorder();

				titledBordertipoformapago.setTitle(titledBorderFormaPagoInven.getTitle() + " -> Tipo Forma Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_forma_pagoFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getid_tipo_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_forma_pago = "+this.formapagoinven.getid_tipo_forma_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.formapagoinven.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_diasFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getnumero_dias()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_dias = "+this.formapagoinven.getnumero_dias().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.formapagoinven.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.formapagoinven.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.formapagoinven.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalleFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.formapagoinven.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_compraFormaPagoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocompra=true;

			idTienePermisocompra=this.tienePermisosUsuarioEnPaginaWebFormaPagoInven(CompraConstantesFunciones.CLASSNAME);

			if(idTienePermisocompra) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormaPagoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormaPagoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);

				this.compraBeanSwingJInternalFrame=new CompraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.compraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.compraBeanSwingJInternalFrame.getCompraLogic().setConnexion(this.formapagoinvenLogic.getConnexion());

				if(this.formapagoinven.getid_compra()!=null) {
					this.compraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.compraBeanSwingJInternalFrame.setIdActual(this.formapagoinven.getid_compra());
					this.compraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.compraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.compraBeanSwingJInternalFrame.inicializarActualizarBindingTablaCompra();
				}

				JInternalFrameBase jinternalFrame =this.compraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormaPagoInven=(TitledBorder)this.jScrollPanelDatosFormaPagoInven.getBorder();
				TitledBorder titledBordercompra=(TitledBorder)this.compraBeanSwingJInternalFrame.jScrollPanelDatosCompra.getBorder();

				titledBordercompra.setTitle(titledBorderFormaPagoInven.getTitle() + " -> Compra");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_compraFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getid_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_compra = "+this.formapagoinven.getid_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioFormaPagoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebFormaPagoInven(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormaPagoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormaPagoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.formapagoinvenLogic.getConnexion());

				if(this.formapagoinven.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.formapagoinven.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormaPagoInven=(TitledBorder)this.jScrollPanelDatosFormaPagoInven.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderFormaPagoInven.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.formapagoinven.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesFormaPagoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebFormaPagoInven(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormaPagoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormaPagoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.formapagoinvenLogic.getConnexion());

				if(this.formapagoinven.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.formapagoinven.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormaPagoInven=(TitledBorder)this.jScrollPanelDatosFormaPagoInven.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderFormaPagoInven.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.formapagoinven.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableFormaPagoInvenActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderFormaPagoInven=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosFormaPagoInven.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderFormaPagoInven=(TitledBorder)this.jScrollPanelDatosFormaPagoInven.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderFormaPagoInven.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableFormaPagoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebFormaPagoInven(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormaPagoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormaPagoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.formapagoinvenLogic.getConnexion());

				if(this.formapagoinven.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.formapagoinven.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormaPagoInven=(TitledBorder)this.jScrollPanelDatosFormaPagoInven.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderFormaPagoInven.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formapagoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.formapagoinven.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.getformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formapagoinven==null) {
						this.formapagoinven = new FormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);
				}

				if(this.formapagoinven.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.formapagoinven.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void closingInternalFrameFormaPagoInven() {
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
			this.jInternalFrameDetalleFormFormaPagoInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormFormaPagoInven.dispose();
			this.jInternalFrameDetalleFormFormaPagoInven=null;
		}
		
		/*
		if(this.jInternalFrameReporteDinamicoFormaPagoInven!=null) {
			this.jInternalFrameReporteDinamicoFormaPagoInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFormaPagoInven.dispose();
			this.jInternalFrameReporteDinamicoFormaPagoInven=null;
		}
		
		if(this.jInternalFrameImportacionFormaPagoInven!=null) {
			this.jInternalFrameImportacionFormaPagoInven.setVisible(false);	    			
			this.jInternalFrameImportacionFormaPagoInven.dispose();
			this.jInternalFrameImportacionFormaPagoInven=null;
		}		
		*/
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFormaPagoInven();
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoFormaPagoInven")) {
				jButtonNuevoFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFormaPagoInven")) {
				jButtonDuplicarFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFormaPagoInven")) {
				jButtonCopiarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormFormaPagoInven")) {
				jButtonVerFormFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFormaPagoInven")) {
				jButtonNuevoFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFormaPagoInven")) {
				jButtonDuplicarFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFormaPagoInven")) {
				jButtonNuevoFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFormaPagoInven")) {
				jButtonDuplicarFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFormaPagoInven")) {
				jButtonNuevoFormaPagoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFormaPagoInven")) {
				jButtonNuevoFormaPagoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFormaPagoInven")) {
				jButtonNuevoFormaPagoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFormaPagoInven")) {
				jButtonModificarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFormaPagoInven")) {
				jButtonModificarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFormaPagoInven")) {
				jButtonModificarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFormaPagoInven")) {
				jButtonActualizarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFormaPagoInven")) {
				jButtonActualizarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFormaPagoInven")) {
				jButtonActualizarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarFormaPagoInven")) {
				jButtonEliminarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFormaPagoInven")) {
				jButtonEliminarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFormaPagoInven")) {
				jButtonEliminarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarFormaPagoInven")) {
				jButtonCancelarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFormaPagoInven")) {
				jButtonCancelarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFormaPagoInven")) {
				jButtonCancelarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarFormaPagoInven")) {
				jButtonCerrarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFormaPagoInven")) {
				jButtonCerrarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFormaPagoInven")) {
				jButtonCerrarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFormaPagoInven")) {
				jButtonMostrarOcultarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFormaPagoInven")) {
				jButtonCancelarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFormaPagoInven")) {
				jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFormaPagoInven")) {
				jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFormaPagoInven")) {
				jButtonCopiarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFormaPagoInven")) {
				jButtonVerFormFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFormaPagoInven")) {
				jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFormaPagoInven")) {
				jButtonCopiarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFormaPagoInven")) {
				jButtonVerFormFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFormaPagoInven")) {
				jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFormaPagoInven")) {
				jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFormaPagoInven")) {
				jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFormaPagoInven")) {
				jButtonRecargarInformacionFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFormaPagoInven")) {
				jButtonRecargarInformacionFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFormaPagoInven")) {
				jButtonRecargarInformacionFormaPagoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFormaPagoInven")) {
				jButtonAnterioresFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFormaPagoInven")) {
				jButtonAnterioresFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFormaPagoInven")) {
				jButtonAnterioresFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFormaPagoInven")) {
				jButtonSiguientesFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFormaPagoInven")) {
				jButtonSiguientesFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFormaPagoInven")) {
				jButtonSiguientesFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFormaPagoInven") || sTipo.equals("MenuItemDetalleAbrirOrderByFormaPagoInven")) {
				jButtonAbrirOrderByFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFormaPagoInven") || sTipo.equals("MenuItemDetalleMostrarOcultarFormaPagoInven")) {
				jButtonMostrarOcultarFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFormaPagoInven")) {
				jButtonNuevoGuardarCambiosFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFormaPagoInven")) {
				jButtonNuevoGuardarCambiosFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFormaPagoInven")) {
				jButtonNuevoGuardarCambiosFormaPagoInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFormaPagoInven")) {
				jButtonCerrarReporteDinamicoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFormaPagoInven")) {
				jButtonGenerarReporteDinamicoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFormaPagoInven")) {
				/*
				jButtonGenerarExcelReporteDinamicoFormaPagoInvenActionPerformed(evt);
				*/
			} else if(sTipo.equals("CerrarImportacionFormaPagoInven")) {
				jButtonCerrarImportacionFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFormaPagoInven")) {
				/*
				jButtonGenerarImportacionFormaPagoInvenActionPerformed(evt);
				*/
			} else if(sTipo.equals("AbrirImportacionFormaPagoInven")) {
				/*
				jButtonAbrirImportacionFormaPagoInvenActionPerformed(evt);
				*/
			} else if(sTipo.equals("TiposAccionesFormaPagoInven")) {
				jComboBoxTiposAccionesFormaPagoInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFormaPagoInven")) {
				jComboBoxTiposRelacionesFormaPagoInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFormaPagoInven")) {
				jComboBoxTiposAccionesFormaPagoInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFormaPagoInven")) {
				/*
				jComboBoxTiposSeleccionarFormaPagoInvenActionListener(evt);
				*/
			} else if(sTipo.equals("ValorCampoGeneralFormaPagoInven")) {
				jTextFieldValorCampoGeneralFormaPagoInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFormaPagoInven")) {
				jButtonAbrirOrderByFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFormaPagoInven")) {
				jButtonAbrirOrderByFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFormaPagoInven")) {
				jButtonCerrarOrderByFormaPagoInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormaPagoInvenBusqueda")) {
				this.jButtonidFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormaPagoInvenUpdate")) {
				this.jButtonid_empresaFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormaPagoInvenBusqueda")) {
				this.jButtonid_empresaFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFormaPagoInvenUpdate")) {
				this.jButtonid_sucursalFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFormaPagoInvenBusqueda")) {
				this.jButtonid_sucursalFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioFormaPagoInvenUpdate")) {
				this.jButtonid_ejercicioFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioFormaPagoInvenBusqueda")) {
				this.jButtonid_ejercicioFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoFormaPagoInvenUpdate")) {
				this.jButtonid_periodoFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoFormaPagoInvenBusqueda")) {
				this.jButtonid_periodoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoFormaPagoInvenUpdate")) {
				this.jButtonid_tipo_forma_pagoFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoFormaPagoInvenBusqueda")) {
				this.jButtonid_tipo_forma_pagoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioFormaPagoInvenBusqueda")) {
				this.jButtonfecha_inicioFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasFormaPagoInvenBusqueda")) {
				this.jButtonnumero_diasFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finFormaPagoInvenBusqueda")) {
				this.jButtonfecha_finFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeFormaPagoInvenBusqueda")) {
				this.jButtonporcentajeFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorFormaPagoInvenBusqueda")) {
				this.jButtonvalorFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleFormaPagoInvenBusqueda")) {
				this.jButtondetalleFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_compraFormaPagoInvenUpdate")) {
				this.jButtonid_compraFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_compraFormaPagoInvenBusqueda")) {
				this.jButtonid_compraFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioFormaPagoInvenUpdate")) {
				this.jButtonid_anioFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioFormaPagoInvenBusqueda")) {
				this.jButtonid_anioFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesFormaPagoInvenUpdate")) {
				this.jButtonid_mesFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesFormaPagoInvenBusqueda")) {
				this.jButtonid_mesFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableFormaPagoInven")) {
				this.jButtonid_cuenta_contableFormaPagoInvenActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableFormaPagoInvenArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableFormaPagoInvenUpdate")) {
				this.jButtonid_cuenta_contableFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableFormaPagoInvenBusqueda")) {
				this.jButtonid_cuenta_contableFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaFormaPagoInvenBusqueda")) {
				this.jButtonfechaFormaPagoInvenBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contableFormaPagoInven")) {
				this.jButtonid_cuenta_contableFormaPagoInvenActionPerformed(evt);
			}
			
			
			;
			
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFormaPagoInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormaPagoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				


			if(sTipo.equals("numero_diasFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("porcentajeFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("valorFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FormaPagoInven formapagoinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				formapagoinvenLocal=this.formapagoinven;
			} else {
				formapagoinvenLocal=this.formapagoinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


				if(sTipo.equals("numero_diasFormaPagoInven")) {
					if(formapagoinvenLocal.getnumero_dias()==Integer.parseInt(this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.getText())){existeCambio=false;};
				}
				 else if(sTipo.equals("porcentajeFormaPagoInven")) {
					if(formapagoinvenLocal.getporcentaje()==Double.parseDouble(this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.getText())){existeCambio=false;};
				}
				 else if(sTipo.equals("valorFormaPagoInven")) {
					if(formapagoinvenLocal.getvalor()==Double.parseDouble(this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.getText())){existeCambio=false;};
				}
			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
							
				
				


			if(sTipo.equals("numero_diasFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("porcentajeFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("valorFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormaPagoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
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
			
			


			if(sTipo.equals("numero_diasFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("porcentajeFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("valorFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"TEXTBOX",classes,false,esControlTabla);
			}
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormaPagoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
								
						
				


				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormaPagoInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
								
				
				


				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormaPagoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormaPagoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormaPagoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
							
				
				


				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormaPagoInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormaPagoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
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
			
			


			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormaPagoInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
								
				
				


			if(sTipo.equals("numero_diasFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("porcentajeFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("valorFormaPagoInven")) {
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					//classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
				}

				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);

				this.recargarFormFormaPagoInven(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.LABEL,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"LABEL",classes,false,esControlTabla);
			}
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormaPagoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormaPagoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormaPagoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFormaPagoInven")) {
					jCheckBoxSeleccionarTodosFormaPagoInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFormaPagoInven")) {
					jCheckBoxSeleccionadosFormaPagoInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFormaPagoInven")) {
					
				}
				
				


				
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
												
				
				


				
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormaPagoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormaPagoInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
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
			
			


			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormaPagoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormaPagoInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormaPagoInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formapagoinven);
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
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
				
				


				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormaPagoInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormaPagoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formapagoinvenAnterior =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFormaPagoInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFormaPagoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFormaPagoInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.formapagoinven =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.formapagoinven =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.formapagoinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFormaPagoInven")) {
				
				}
				
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFormaPagoInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFormaPagoInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFormaPagoInven")) {
			
			}
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFormaPagoInven();
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
			if(sTipo.equals("NuevoFormaPagoInven")) {
				jButtonNuevoFormaPagoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFormaPagoInven")) {
				jButtonDuplicarFormaPagoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFormaPagoInven")) {
				jButtonCopiarFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFormaPagoInven")) {
				jButtonVerFormFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFormaPagoInven")) {
				jButtonNuevoFormaPagoInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFormaPagoInven")) {
				jButtonModificarFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFormaPagoInven")) {
				jButtonActualizarFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFormaPagoInven")) {
				jButtonEliminarFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFormaPagoInven")) {
				jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFormaPagoInven")) {
				jButtonCancelarFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFormaPagoInven")) {
				jButtonCerrarFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFormaPagoInven")) {
				jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFormaPagoInven")) {
				jButtonNuevoGuardarCambiosFormaPagoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFormaPagoInven")) {
				jButtonAbrirOrderByFormaPagoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFormaPagoInven")) {
				jButtonRecargarInformacionFormaPagoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFormaPagoInven")) {
				jButtonAnterioresFormaPagoInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFormaPagoInven")) {
				jButtonSiguientesFormaPagoInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormaPagoInvenBusqueda")) {
				this.jButtonidFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormaPagoInvenUpdate")) {
				this.jButtonid_empresaFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormaPagoInvenBusqueda")) {
				this.jButtonid_empresaFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalFormaPagoInvenUpdate")) {
				this.jButtonid_sucursalFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalFormaPagoInvenBusqueda")) {
				this.jButtonid_sucursalFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioFormaPagoInvenUpdate")) {
				this.jButtonid_ejercicioFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioFormaPagoInvenBusqueda")) {
				this.jButtonid_ejercicioFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoFormaPagoInvenUpdate")) {
				this.jButtonid_periodoFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoFormaPagoInvenBusqueda")) {
				this.jButtonid_periodoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoFormaPagoInvenUpdate")) {
				this.jButtonid_tipo_forma_pagoFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_forma_pagoFormaPagoInvenBusqueda")) {
				this.jButtonid_tipo_forma_pagoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioFormaPagoInvenBusqueda")) {
				this.jButtonfecha_inicioFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasFormaPagoInvenBusqueda")) {
				this.jButtonnumero_diasFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finFormaPagoInvenBusqueda")) {
				this.jButtonfecha_finFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeFormaPagoInvenBusqueda")) {
				this.jButtonporcentajeFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorFormaPagoInvenBusqueda")) {
				this.jButtonvalorFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleFormaPagoInvenBusqueda")) {
				this.jButtondetalleFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_compraFormaPagoInvenUpdate")) {
				this.jButtonid_compraFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_compraFormaPagoInvenBusqueda")) {
				this.jButtonid_compraFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioFormaPagoInvenUpdate")) {
				this.jButtonid_anioFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioFormaPagoInvenBusqueda")) {
				this.jButtonid_anioFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesFormaPagoInvenUpdate")) {
				this.jButtonid_mesFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesFormaPagoInvenBusqueda")) {
				this.jButtonid_mesFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableFormaPagoInven")) {
				this.jButtonid_cuenta_contableFormaPagoInvenActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableFormaPagoInvenArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableFormaPagoInvenUpdate")) {
				this.jButtonid_cuenta_contableFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableFormaPagoInvenBusqueda")) {
				this.jButtonid_cuenta_contableFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaFormaPagoInvenBusqueda")) {
				this.jButtonfechaFormaPagoInvenBusquedaActionPerformed(evt);
			}
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFormaPagoInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFormaPagoInven")) {
				closingInternalFrameFormaPagoInven();
				
			} else if(sTipo.equals("jButtonCancelarFormaPagoInven")) {
				JInternalFrameBase jInternalFrameDetalleFormFormaPagoInven = (JInternalFrameBase)evt.getSource();
	            	
	            FormaPagoInvenBeanSwingJInternalFrame jInternalFrameParent=(FormaPagoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormFormaPagoInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFormaPagoInvenActionPerformed(null);
			}
			
			FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formapagoinven,new Object(),this.formapagoinvenParameterGeneral,this.formapagoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFormaPagoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFormaPagoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFormaPagoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.formapagoinven)) {
			if(!esControlTabla) {
				if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);			
				}
				
				if(this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFormaPagoInven(this.formapagoinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formapagoinvenReturnGeneral=formapagoinvenLogic.procesarEventosFormaPagoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formapagoinvenLogic.getFormaPagoInvens(),this.formapagoinven,this.formapagoinvenParameterGeneral,this.isEsNuevoFormaPagoInven,classes);//this.formapagoinvenLogic.getFormaPagoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFormaPagoInven(this.formapagoinvenReturnGeneral,this.formapagoinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFormaPagoInven(classes,this.formapagoinvenReturnGeneral,this.formapagoinvenBean,false);
					}
						
					if(this.formapagoinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFormaPagoInven(this.formapagoinvenReturnGeneral.getFormaPagoInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFormaPagoInven(this.formapagoinvenReturnGeneral.getFormaPagoInven());	
					}
						
					if(this.formapagoinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFormaPagoInven(this.formapagoinvenReturnGeneral.getFormaPagoInven(),classes);//this.formapagoinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFormaPagoInven(this.formapagoinven,classes);//this.formapagoinvenBean);									
				}
			
				if(FormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFormaPagoInven(this.formapagoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormaPagoInven(this.formapagoinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.formapagoinvenAnterior!=null) {
						this.formapagoinven=this.formapagoinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formapagoinvenReturnGeneral=formapagoinvenLogic.procesarEventosFormaPagoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formapagoinvenLogic.getFormaPagoInvens(),this.formapagoinven,this.formapagoinvenParameterGeneral,this.isEsNuevoFormaPagoInven,classes);//this.formapagoinvenLogic.getFormaPagoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formapagoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.formapagoinvenReturnGeneral.getFormaPagoInven(),formapagoinvenLogic.getFormaPagoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.formapagoinvenReturnGeneral.getFormaPagoInven(),this.formapagoinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFormaPagoInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosFormaPagoInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFormaPagoInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosFormaPagoInven() throws Exception {
		
		FormaPagoInvenModel formapagoinvenModel=(FormaPagoInvenModel)this.jTableDatosFormaPagoInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formapagoinvenModel.formapagoinvens=this.formapagoinvenLogic.getFormaPagoInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			formapagoinvenModel.formapagoinvens=this.formapagoinvens;
		}
		
		
		((FormaPagoInvenModel) this.jTableDatosFormaPagoInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFormaPagoInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getformapagoinvenAnterior(),this.formapagoinvenLogic.getFormaPagoInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getformapagoinvenAnterior(),this.formapagoinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFormaPagoInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFormaPagoInven(FormaPagoInven formapagoinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
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
										
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formapagoinven,new Object(),generalEntityParameterGeneral,this.formapagoinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.formapagoinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsOfFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FormaPagoInvenConstantesFunciones.getClassesRelationshipsFromStringsOfFormaPagoInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFormaPagoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formapagoinven,new Object(),generalEntityParameterGeneral,this.formapagoinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFormaPagoInven(FormaPagoInvenBean formapagoinvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFormaPagoInven(ArrayList<Classe> classes,FormaPagoInvenReturnGeneral formapagoinvenReturnGeneral,FormaPagoInvenBean formapagoinvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFormaPagoInven(FormaPagoInven formapagoinven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.formapagoinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFormaPagoInven = new FormaPagoInvenDetalleFormJInternalFrame(jDesktopPane,this.formapagoinvenSessionBean.getConGuardarRelaciones(),this.formapagoinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.setVisible(false);
		this.jInternalFrameDetalleFormFormaPagoInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormFormaPagoInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFormaPagoInven.formapagoinvenLogic=this.formapagoinvenLogic;
		
		this.cargarCombosFrameForeignKeyFormaPagoInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFormaPagoInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormaPagoInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFormaPagoInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFormaPagoInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFormaPagoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormaPagoInven"));
		
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonModificarFormaPagoInven.addActionListener(new ButtonActionListener(this,"ModificarFormaPagoInven"));

		/*
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonModificarToolBarFormaPagoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormaPagoInven"));
					
		this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemModificarFormaPagoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormaPagoInven"));		
		
		*/
		
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonActualizarFormaPagoInven.addActionListener (new ButtonActionListener(this,"ActualizarFormaPagoInven"));
		
		/*
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonActualizarToolBarFormaPagoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormaPagoInven"));
						
		this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemActualizarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormaPagoInven"));		
		
		*/
		
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonEliminarFormaPagoInven.addActionListener (new ButtonActionListener(this,"EliminarFormaPagoInven"));
		
		/*
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonEliminarToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormaPagoInven"));
								
		this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemEliminarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormaPagoInven"));		
		
		*/
		
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonCancelarFormaPagoInven.addActionListener (new ButtonActionListener(this,"CancelarFormaPagoInven"));
		
		/*
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonCancelarToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormaPagoInven"));
					
		this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemCancelarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormaPagoInven"));		
		
		*/
		
		
		/*
		this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemDetalleCerrarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormaPagoInven"));		
		*/
		
		/*
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormaPagoInven"));
		*/
		
		/*
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormaPagoInven"));
		*/
		
		
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormaPagoInven"));
		
		
		//CAMPO EVENTO
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.addFocusListener(new TextFieldFocusListener(this,"numero_diasFormaPagoInven"));
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.addActionListener(new TextFieldActionListener(this,"numero_diasFormaPagoInven"));
		//this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldnumero_diasFormaPagoInven,"numero_diasFormaPagoInven"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.addFocusListener(new TextFieldFocusListener(this,"porcentajeFormaPagoInven"));
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.addActionListener(new TextFieldActionListener(this,"porcentajeFormaPagoInven"));
		//this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldporcentajeFormaPagoInven,"porcentajeFormaPagoInven"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.addFocusListener(new TextFieldFocusListener(this,"valorFormaPagoInven"));
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.addActionListener(new TextFieldActionListener(this,"valorFormaPagoInven"));
		//this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldvalorFormaPagoInven,"valorFormaPagoInven"));


				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonidFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_empresaFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_empresaFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_sucursalFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_sucursalFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_ejercicioFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_ejercicioFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_periodoFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_periodoFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_periodoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_tipo_forma_pagoFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonfecha_inicioFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonnumero_diasFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonfecha_finFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonporcentajeFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonvalorFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"valorFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtondetalleFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"detalleFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_compraFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_compraFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_compraFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_compraFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_anioFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_anioFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_anioFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_anioFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_mesFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mesFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_mesFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mesFormaPagoInvenBusqueda"));
		//jButtonid_cuenta_contableFormaPagoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableFormaPagoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInven"));
		//jButtonid_cuenta_contableFormaPagoInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonfechaFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"fechaFormaPagoInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFormaPagoInven.jTabbedPaneRelacionesFormaPagoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormaPagoInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFormaPagoInven"));
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormaPagoInven"));
		}
		
		this.jTableDatosFormaPagoInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFormaPagoInven"));
		
		this.jTableDatosFormaPagoInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFormaPagoInven"));
		
		this.jButtonNuevoFormaPagoInven.addActionListener(new ButtonActionListener(this,"NuevoFormaPagoInven"));
		
		this.jButtonDuplicarFormaPagoInven.addActionListener(new ButtonActionListener(this,"DuplicarFormaPagoInven"));
		
		this.jButtonCopiarFormaPagoInven.addActionListener(new ButtonActionListener(this,"CopiarFormaPagoInven"));
		
		this.jButtonVerFormFormaPagoInven.addActionListener(new ButtonActionListener(this,"VerFormFormaPagoInven"));
		
		/*
		this.jButtonNuevoToolBarFormaPagoInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarFormaPagoInven"));
			
		this.jButtonDuplicarToolBarFormaPagoInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFormaPagoInven"));
			
		this.jMenuItemNuevoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFormaPagoInven"));
			
		this.jMenuItemDuplicarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFormaPagoInven"));		
		*/
		
		this.jButtonNuevoRelacionesFormaPagoInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFormaPagoInven"));
		
		/*
		this.jButtonNuevoRelacionesToolBarFormaPagoInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFormaPagoInven"));
			
		this.jMenuItemNuevoRelacionesFormaPagoInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFormaPagoInven"));		
		*/
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonModificarFormaPagoInven.addActionListener(new ButtonActionListener(this,"ModificarFormaPagoInven"));
		}
		
		/*
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonModificarToolBarFormaPagoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormaPagoInven"));
			
			this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemModificarFormaPagoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormaPagoInven"));		
		}
		*/
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonActualizarFormaPagoInven.addActionListener (new ButtonActionListener(this,"ActualizarFormaPagoInven"));
		}
		
		/*
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonActualizarToolBarFormaPagoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormaPagoInven"));
				
			this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemActualizarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormaPagoInven"));		
		}
		*/
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonEliminarFormaPagoInven.addActionListener (new ButtonActionListener(this,"EliminarFormaPagoInven"));
		}
		
		/*
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonEliminarToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormaPagoInven"));
						
			this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemEliminarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormaPagoInven"));		
		}
		*/
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonCancelarFormaPagoInven.addActionListener (new ButtonActionListener(this,"CancelarFormaPagoInven"));
		}
		
		/*
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonCancelarToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormaPagoInven"));
			
			this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemCancelarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormaPagoInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFormaPagoInven"));		
		*/
		
		this.jButtonCerrarFormaPagoInven.addActionListener (new ButtonActionListener(this,"CerrarFormaPagoInven"));
		
		/*
		this.jButtonCerrarToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarFormaPagoInven"));
			
		this.jMenuItemCerrarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFormaPagoInven"));
			
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jMenuItemDetalleCerrarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormaPagoInven"));		
		}
		*/
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosFormaPagoInven"));
		}
		
		/*
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormaPagoInven"));
		}
		
		this.jButtonCopiarToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarFormaPagoInven"));
			
		this.jButtonVerFormToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarFormaPagoInven"));
		
		this.jMenuItemGuardarCambiosFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFormaPagoInven"));
			
		this.jMenuItemCopiarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFormaPagoInven"));		
		
		this.jMenuItemVerFormFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFormaPagoInven"));		
		*/
		
		this.jButtonGuardarCambiosTablaFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormaPagoInven"));
		
		/*
		this.jButtonGuardarCambiosTablaToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFormaPagoInven"));
			
		this.jMenuItemGuardarCambiosTablaFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormaPagoInven"));		
		*/
		
		/*
		this.jButtonRecargarInformacionFormaPagoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionFormaPagoInven"));
					
		this.jButtonRecargarInformacionToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFormaPagoInven"));
		
		this.jMenuItemRecargarInformacionFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFormaPagoInven"));		
		*/
		
		
		this.jButtonAnterioresFormaPagoInven.addActionListener (new ButtonActionListener(this,"AnterioresFormaPagoInven"));
		
		/*
		this.jButtonAnterioresToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFormaPagoInven"));
		
		this.jMenuItemAnterioresFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFormaPagoInven"));		
		*/
		
		this.jButtonSiguientesFormaPagoInven.addActionListener (new ButtonActionListener(this,"SiguientesFormaPagoInven"));
		
		/*
		this.jButtonSiguientesToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFormaPagoInven"));
			
		this.jMenuItemSiguientesFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFormaPagoInven"));
			
		this.jMenuItemAbrirOrderByFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFormaPagoInven"));
			
		this.jMenuItemMostrarOcultarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFormaPagoInven"));
			
		this.jMenuItemDetalleAbrirOrderByFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFormaPagoInven"));
			
		this.jMenuItemDetalleMostarOcultarFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFormaPagoInven"));		
		*/
		
		this.jButtonNuevoGuardarCambiosFormaPagoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFormaPagoInven"));
		
		/*
		this.jButtonNuevoGuardarCambiosToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFormaPagoInven"));
			
		this.jMenuItemNuevoGuardarCambiosFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFormaPagoInven"));		
		*/
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFormaPagoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFormaPagoInven"));

		this.jCheckBoxSeleccionadosFormaPagoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFormaPagoInven"));
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormaPagoInven"));
		}
		
		/*
		this.jComboBoxTiposRelacionesFormaPagoInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesFormaPagoInven"));
			
		this.jComboBoxTiposAccionesFormaPagoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormaPagoInven"));
					
		this.jComboBoxTiposSeleccionarFormaPagoInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFormaPagoInven"));
			
		this.jTextFieldValorCampoGeneralFormaPagoInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFormaPagoInven"));		
		*/
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
		
		//CAMPO EVENTO
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.addFocusListener(new TextFieldFocusListener(this,"numero_diasFormaPagoInven"));
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.addActionListener(new TextFieldActionListener(this,"numero_diasFormaPagoInven"));
		//this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldnumero_diasFormaPagoInven,"numero_diasFormaPagoInven"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.addFocusListener(new TextFieldFocusListener(this,"porcentajeFormaPagoInven"));
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.addActionListener(new TextFieldActionListener(this,"porcentajeFormaPagoInven"));
		//this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldporcentajeFormaPagoInven,"porcentajeFormaPagoInven"));


		//CAMPO EVENTO
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.addFocusListener(new TextFieldFocusListener(this,"valorFormaPagoInven"));
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.addActionListener(new TextFieldActionListener(this,"valorFormaPagoInven"));
		//this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.getDocument().addDocumentListener(new TextFieldDocumentListener(this,this.jTextFieldvalorFormaPagoInven,"valorFormaPagoInven"));


		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonidFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_empresaFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_empresaFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_sucursalFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_sucursalFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_ejercicioFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_ejercicioFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_periodoFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_periodoFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_periodoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_tipo_forma_pagoFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonfecha_inicioFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonnumero_diasFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonfecha_finFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonporcentajeFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonvalorFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"valorFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtondetalleFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"detalleFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_compraFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_compraFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_compraFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_compraFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_anioFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_anioFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_anioFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_anioFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_mesFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mesFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_mesFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mesFormaPagoInvenBusqueda"));
		//jButtonid_cuenta_contableFormaPagoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableFormaPagoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInven"));
		//jButtonid_cuenta_contableFormaPagoInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonfechaFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"fechaFormaPagoInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		/*
		
			this.jButtonFK_IdCompraFormaPagoInven.addActionListener(new ButtonActionListener(this,"FK_IdCompraFormaPagoInven"));

			this.jButtonFK_IdCuentaContableFormaPagoInven.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableFormaPagoInven"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInven"));

			this.jButtonFK_IdTipoFormaPagoFormaPagoInven.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoFormaPagoInven"));
		
		*/
		
			//REPORTE DINAMICO
			/*
			if(this.jInternalFrameReporteDinamicoFormaPagoInven!=null) {
				this.jInternalFrameReporteDinamicoFormaPagoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormaPagoInven"));
				this.jInternalFrameReporteDinamicoFormaPagoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormaPagoInven"));
				this.jInternalFrameReporteDinamicoFormaPagoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormaPagoInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoFormaPagoInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormaPagoInven"));				
			//this.jButtonGenerarReporteDinamicoFormaPagoInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormaPagoInven"));
			//this.jButtonGenerarExcelReporteDinamicoFormaPagoInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormaPagoInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFormaPagoInven!=null) {
				this.jInternalFrameImportacionFormaPagoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormaPagoInven"));
				this.jInternalFrameImportacionFormaPagoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormaPagoInven"));
				this.jInternalFrameImportacionFormaPagoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormaPagoInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFormaPagoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByFormaPagoInven"));
			
			this.jButtonAbrirOrderByToolBarFormaPagoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFormaPagoInven"));			
			
			if(this.jInternalFrameOrderByFormaPagoInven!=null) {
				this.jInternalFrameOrderByFormaPagoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormaPagoInven"));				
			}
			*/
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormaPagoInven.jTabbedPaneRelacionesFormaPagoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormaPagoInven"));
		
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
            		closingInternalFrameFormaPagoInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFormaPagoInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFormaPagoInven = (JInternalFrameBase)event.getSource();
	            	
	            FormaPagoInvenBeanSwingJInternalFrame jInternalFrameParent=(FormaPagoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormFormaPagoInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFormaPagoInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFormaPagoInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFormaPagoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFormaPagoInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFormaPagoInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormaPagoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormaPagoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormaPagoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFormaPagoInven";
		inputMap = this.jButtonNuevoFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormaPagoInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormaPagoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormaPagoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormaPagoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFormaPagoInven";
		inputMap = this.jButtonNuevoRelacionesFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormaPagoInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFormaPagoInven";
		inputMap = this.jButtonModificarFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFormaPagoInven";
		inputMap = this.jButtonActualizarFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFormaPagoInven";
		inputMap = this.jButtonEliminarFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFormaPagoInven";
		inputMap = this.jButtonCancelarFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFormaPagoInven";
		inputMap = this.jButtonCerrarFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFormaPagoInven";
		inputMap = this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonGuardarCambiosFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFormaPagoInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFormaPagoInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFormaPagoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFormaPagoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFormaPagoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFormaPagoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFormaPagoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFormaPagoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonidFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_empresaFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_empresaFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_sucursalFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_sucursalFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_ejercicioFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_ejercicioFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_periodoFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_periodoFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_periodoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_tipo_forma_pagoFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_tipo_forma_pagoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_forma_pagoFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonfecha_inicioFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonnumero_diasFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonfecha_finFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonporcentajeFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonvalorFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"valorFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtondetalleFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"detalleFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_compraFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_compraFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_compraFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_compraFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_anioFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_anioFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_anioFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_anioFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_mesFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mesFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_mesFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mesFormaPagoInvenBusqueda"));
		//jButtonid_cuenta_contableFormaPagoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableFormaPagoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInven"));
		//jButtonid_cuenta_contableFormaPagoInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormaPagoInven.jButtonfechaFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"fechaFormaPagoInvenBusqueda"));
		
		
		this.jButtonFK_IdCompraFormaPagoInven.addActionListener(new ButtonActionListener(this,"FK_IdCompraFormaPagoInven"));

		this.jButtonFK_IdCuentaContableFormaPagoInven.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableFormaPagoInven"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableFormaPagoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormaPagoInven"));

		this.jButtonFK_IdTipoFormaPagoFormaPagoInven.addActionListener(new ButtonActionListener(this,"FK_IdTipoFormaPagoFormaPagoInven"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	/*
	public void jComboBoxTiposSeleccionarFormaPagoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFormaPagoInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}	
	*/
	
	
	public void seleccionarTodosFormaPagoInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FormaPagoInven formapagoinvenAux:this.formapagoinvenLogic.getFormaPagoInvens()) {
					formapagoinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormaPagoInven formapagoinvenAux:formapagoinvens) {
					formapagoinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFormaPagoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormaPagoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormaPagoInven formapagoinvenAux:this.formapagoinvenLogic.getFormaPagoInvens()) {
						formapagoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormaPagoInven formapagoinvenAux:formapagoinvens) {
						formapagoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FormaPagoInven formapagoinvenAux:this.formapagoinvenLogic.getFormaPagoInvens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormaPagoInven formapagoinvenAux:formapagoinvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFormaPagoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormaPagoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormaPagoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFormaPagoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormaPagoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFormaPagoInven.getSelectedRows();
			
			FormaPagoInven formapagoinvenLocal=new FormaPagoInven();
			
			//this.seleccionarTodosFormaPagoInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formapagoinvenLocal =(FormaPagoInven) this.formapagoinvenLogic.getFormaPagoInvens().toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					formapagoinvenLocal =(FormaPagoInven) this.formapagoinvens.toArray()[this.jTableDatosFormaPagoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				formapagoinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormaPagoInven formapagoinvenAux:this.formapagoinvenLogic.getFormaPagoInvens()) {
						formapagoinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormaPagoInven formapagoinvenAux:formapagoinvens) {
						formapagoinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFormaPagoInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormaPagoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormaPagoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormaPagoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFormaPagoInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFormaPagoInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFormaPagoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFormaPagoInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFormaPagoInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormaPagoInven formapagoinvenAux:this.formapagoinvenLogic.getFormaPagoInvens()) {
				
						if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							formapagoinvenAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							formapagoinvenAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							formapagoinvenAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							formapagoinvenAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							formapagoinvenAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							formapagoinvenAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							formapagoinvenAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormaPagoInven formapagoinvenAux:formapagoinvens) {
					
						if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							formapagoinvenAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							formapagoinvenAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							formapagoinvenAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							formapagoinvenAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							formapagoinvenAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							formapagoinvenAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							formapagoinvenAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFormaPagoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFormaPagoInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFormaPagoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFormaPagoInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				/*
				reporte=(Reporte)this.jComboBoxTiposAccionesFormaPagoInven.getSelectedItem();
				*/
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFormaPagoInven) {				
					conSplash=true;//false;										
					
					//this.startProcessFormaPagoInven(conSplash);
				
					this.generarReporteFormaPagoInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					/*
					this.jComboBoxTiposAccionesFormaPagoInven.setSelectedIndex(0);					
					*/
				} else {
					this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFormaPagoInvensSeleccionados();
				//this.jComboBoxTiposAccionesFormaPagoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormaPagoInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesFormaPagoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormaPagoInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesFormaPagoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormaPagoInven();
				
				this.exportarFormaPagoInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					/*
					this.jComboBoxTiposAccionesFormaPagoInven.setSelectedIndex(0);					
					*/
				} else {
					this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFormaPagoInvens();
				//this.importarFormaPagoInvens();
				if(!esParaAccionDesdeFormulario) {
					/*
					this.jComboBoxTiposAccionesFormaPagoInven.setSelectedIndex(0);					
					*/
				} else {
					this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormaPagoInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFormaPagoInvensSeleccionados();
				//this.jComboBoxTiposAccionesFormaPagoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFormaPagoInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFormaPagoInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFormaPagoInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					/*
					this.jComboBoxTiposAccionesFormaPagoInven.setSelectedIndex(0);					
					*/
				} else {
					this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.setSelectedIndex(0);					
				}	
			} 			
			else if(FormaPagoInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFormaPagoInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFormaPagoInven(conSplash);
					
						//this.actualizarParametrosGeneralFormaPagoInven();
						
						this.generarReporteProcesoAccionFormaPagoInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							/*
							this.jComboBoxTiposAccionesFormaPagoInven.setSelectedIndex(0);					
							*/
						} else {
							this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FormaPagoInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Forma PagoES SELECCIONADOS?", "MANTENIMIENTO DE Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFormaPagoInven();
				
						this.actualizarParametrosGeneralFormaPagoInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.formapagoinvenReturnGeneral=formapagoinvenLogic.procesarAccionFormaPagoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.formapagoinvenLogic.getFormaPagoInvens(),this.formapagoinvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFormaPagoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						/*
						this.jComboBoxTiposAccionesFormaPagoInven.setSelectedIndex(0);					
						*/
					} else {
						this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFormaPagoInven();
					
					FormaPagoInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFormaPagoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						/*
						this.jComboBoxTiposAccionesFormaPagoInven.setSelectedIndex(0);					
						*/
					} else {
						this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxTiposAccionesFormularioFormaPagoInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFormaPagoInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFormaPagoInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFormaPagoInven();
			
			if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();		
			FormaPagoInven formapagoinven=new FormaPagoInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFormaPagoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			/*
			reporte=(Reporte)this.jComboBoxTiposRelacionesFormaPagoInven.getSelectedItem();
			*/
			
			
			
			formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(formapagoinvensSeleccionados.size()==1) {
				for(FormaPagoInven formapagoinvenAux:formapagoinvensSeleccionados) {
					formapagoinven=formapagoinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFormaPagoInven();
			
      		//this.finishProcessFormaPagoInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFormaPagoInvenReturnGeneral() throws Exception {
		if(this.formapagoinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.formapagoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.formapagoinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.formapagoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.formapagoinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.formapagoinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFormaPagoInven(false);
		}
		
		if(this.formapagoinvenReturnGeneral.getConRetornoLista() || this.formapagoinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.formapagoinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formapagoinvenLogic.setFormaPagoInvens(this.formapagoinvenReturnGeneral.getFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.formapagoinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formapagoinvenLogic.setFormaPagoInven(this.formapagoinvenReturnGeneral.getFormaPagoInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFormaPagoInven(false);
		}
	}
	
	public void actualizarParametrosGeneralFormaPagoInven() throws Exception {
		
		
	}
	
	public ArrayList<FormaPagoInven> getFormaPagoInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFormaPagoInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FormaPagoInven formapagoinvenAux:formapagoinvenLogic.getFormaPagoInvens()) {
					if(formapagoinvenAux.getIsSelected()) {
						formapagoinvensSeleccionados.add(formapagoinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormaPagoInven formapagoinvenAux:this.formapagoinvens) {
					if(formapagoinvenAux.getIsSelected()) {
						formapagoinvensSeleccionados.add(formapagoinvenAux);				
					}
				}
			}
			
			if(formapagoinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						formapagoinvensSeleccionados.addAll(this.formapagoinvenLogic.getFormaPagoInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						formapagoinvensSeleccionados.addAll(this.formapagoinvens);				
					}
				}
			}
		} else {
			formapagoinvensSeleccionados.add(this.formapagoinven);
		}
		
		return formapagoinvensSeleccionados;
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
	
	public void generarReporteFormaPagoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFormaPagoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFormaPagoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormaPagoInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormaPagoInvensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();		
		
		formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFormaPagoInvens("Todos",formapagoinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();		
		
		formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFormaPagoInvens("Todos",formapagoinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFormaPagoInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();
		
		formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFormaPagoInvens("Todos",formapagoinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();		
		
		/*
		this.abrirInicializarFrameReporteDinamicoFormaPagoInven();
		*/
		
		formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.abrirFrameReporteDinamicoFormaPagoInven();
		*/
		
		//this.generarReporteFormaPagoInvens("Todos",formapagoinvensSeleccionados ,formapagoinvenImplementable,formapagoinvenImplementableHome);
	}
	
	public void mostrarImportacionFormaPagoInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.abrirInicializarFrameImportacionFormaPagoInven();
		
		this.abrirFrameImportacionFormaPagoInven();		
		*/
			
		//this.generarReporteFormaPagoInvens("Todos",formapagoinvensSeleccionados ,formapagoinvenImplementable,formapagoinvenImplementableHome);
	}
	
	public void importarFormaPagoInvens() throws Exception {		
	
	}
	
	public void exportarFormaPagoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFormaPagoInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFormaPagoInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFormaPagoInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();		
		
		formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formapagoinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFormaPagoInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FormaPagoInven formapagoinvenAux:formapagoinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFormaPagoInven(formapagoinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//formapagoinvenAux.setsDetalleGeneralEntityReporte(formapagoinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFormaPagoInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_DETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormaPagoInvenConstantesFunciones.LABEL_FECHA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFormaPagoInven(FormaPagoInven formapagoinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=formapagoinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.gettipoformapago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getnumero_dias().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getdetalle();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getcompra_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formapagoinven.getfecha().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();		
		
		formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formapagoinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FormaPagoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFormaPagoInven(row);				
				iRow++;
			}				
			
			for(FormaPagoInven formapagoinvenAux:formapagoinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFormaPagoInven(formapagoinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();		
		
		formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formapagoinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("formapagoinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("formapagoinven");
			//elementRoot.appendChild(element);
		
			for(FormaPagoInven formapagoinvenAux:formapagoinvensSeleccionados) {
				element = document.createElement("formapagoinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFormaPagoInven(formapagoinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFormaPagoInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_DETALLE);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(FormaPagoInvenConstantesFunciones.LABEL_FECHA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFormaPagoInven(FormaPagoInven formapagoinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.gettipoformapago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getnumero_dias());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getdetalle());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getcompra_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formapagoinven.getfecha());				
	}
	
	public void setFilaDatosExportarXmlFormaPagoInven(FormaPagoInven formapagoinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FormaPagoInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(formapagoinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FormaPagoInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(formapagoinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FormaPagoInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(formapagoinven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(FormaPagoInvenConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(formapagoinven.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(FormaPagoInvenConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(formapagoinven.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(FormaPagoInvenConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(formapagoinven.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementtipoformapago_descripcion = document.createElement(FormaPagoInvenConstantesFunciones.IDTIPOFORMAPAGO);
		elementtipoformapago_descripcion.appendChild(document.createTextNode(formapagoinven.gettipoformapago_descripcion()));
		element.appendChild(elementtipoformapago_descripcion);

		Element elementfecha_inicio = document.createElement(FormaPagoInvenConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(formapagoinven.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementnumero_dias = document.createElement(FormaPagoInvenConstantesFunciones.NUMERODIAS);
		elementnumero_dias.appendChild(document.createTextNode(formapagoinven.getnumero_dias().toString().trim()));
		element.appendChild(elementnumero_dias);

		Element elementfecha_fin = document.createElement(FormaPagoInvenConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(formapagoinven.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementporcentaje = document.createElement(FormaPagoInvenConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(formapagoinven.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor = document.createElement(FormaPagoInvenConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(formapagoinven.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementdetalle = document.createElement(FormaPagoInvenConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(formapagoinven.getdetalle().trim()));
		element.appendChild(elementdetalle);

		Element elementcompra_descripcion = document.createElement(FormaPagoInvenConstantesFunciones.IDCOMPRA);
		elementcompra_descripcion.appendChild(document.createTextNode(formapagoinven.getcompra_descripcion()));
		element.appendChild(elementcompra_descripcion);

		Element elementanio_descripcion = document.createElement(FormaPagoInvenConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(formapagoinven.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(FormaPagoInvenConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(formapagoinven.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(FormaPagoInvenConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(formapagoinven.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementfecha = document.createElement(FormaPagoInvenConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(formapagoinven.getfecha().toString().trim()));
		element.appendChild(elementfecha);
	}
	
	public void generarReporteGroupGenericoFormaPagoInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FormaPagoInven> formapagoinvensSeleccionados=new ArrayList<FormaPagoInven>();
		
		formapagoinvensSeleccionados=this.getFormaPagoInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFormaPagoInven(formapagoinvensSeleccionados);
		
		this.generarReporteFormaPagoInvens("Todos",formapagoinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFormaPagoInven(ArrayList<FormaPagoInven> formapagoinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FormaPagoInven formapagoinvenAux:formapagoinvensSeleccionados) {
				formapagoinvenAux.setsDetalleGeneralEntityReporte(formapagoinvenAux.toString());
			
				if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(formapagoinvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(formapagoinvenAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(formapagoinvenAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(formapagoinvenAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_IDTIPOFORMAPAGO)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(formapagoinvenAux.gettipoformapago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(formapagoinvenAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_NUMERODIAS)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(formapagoinvenAux.getnumero_dias().toString());
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(formapagoinvenAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(formapagoinvenAux.getdetalle());
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_IDCOMPRA)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(formapagoinvenAux.getcompra_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(formapagoinvenAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(formapagoinvenAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(formapagoinvenAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormaPagoInvenConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					formapagoinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(formapagoinvenAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFormaPagoInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFormaPagoInven=true;
				this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=true;
				this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=true;
			}
			
			this.isVisibilidadCeldaModificarFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarFormaPagoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormaPagoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarFormaPagoInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFormaPagoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=false;
			this.isVisibilidadCeldaModificarFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarFormaPagoInven=true;
			this.isVisibilidadCeldaEliminarFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarFormaPagoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormaPagoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarFormaPagoInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFormaPagoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=false;
			this.isVisibilidadCeldaModificarFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarFormaPagoInven=true;
			this.isVisibilidadCeldaEliminarFormaPagoInven=true;
			this.isVisibilidadCeldaCancelarFormaPagoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormaPagoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarFormaPagoInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFormaPagoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=false;
			this.isVisibilidadCeldaModificarFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarFormaPagoInven=true;
			this.isVisibilidadCeldaEliminarFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarFormaPagoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormaPagoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarFormaPagoInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFormaPagoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=true;
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=true;
			this.isVisibilidadCeldaModificarFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarFormaPagoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormaPagoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarFormaPagoInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFormaPagoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarFormaPagoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormaPagoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarFormaPagoInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFormaPagoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=false;
			this.isVisibilidadCeldaModificarFormaPagoInven=true;
			this.isVisibilidadCeldaActualizarFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarFormaPagoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormaPagoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarFormaPagoInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FormaPagoInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFormaPagoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=true;
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=true;
		} else {
			this.actualizarEstadoPanelsFormaPagoInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFormaPagoInven=false;
			//this.isVisibilidadCeldaVerFormFormaPagoInven=false;
			this.isVisibilidadCeldaDuplicarFormaPagoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!formapagoinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=false;
		} else {
			this.isVisibilidadCeldaNuevoFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosFormaPagoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(formapagoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!formapagoinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=false;												
			}
			
			this.jButtonCerrarFormaPagoInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFormaPagoInven=false;
		}
		
		if(!this.permiteMantenimiento(this.formapagoinven)) {
			this.isVisibilidadCeldaActualizarFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarFormaPagoInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFormaPagoInven() {
	}
	
	public void actualizarEstadoPanelsFormaPagoInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionFormaPagoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			/*
			if(this.jTabbedPaneBusquedasFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasFormaPagoInven.setVisible(true);			
			}
			*/
			
			if(this.jScrollPanelDatosFormaPagoInven!=null) {
				this.jScrollPanelDatosFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormaPagoInven!=null) {
				this.jPanelPaginacionFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormaPagoInven!=null) {
				this.jPanelParametrosReportesFormaPagoInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionFormaPagoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			/*
			if(this.jTabbedPaneBusquedasFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasFormaPagoInven.setVisible(false);			
			}
			*/
			
			
			if(this.jScrollPanelDatosFormaPagoInven!=null) {
				this.jScrollPanelDatosFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormaPagoInven!=null) {
				this.jPanelPaginacionFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormaPagoInven!=null) {
				this.jPanelParametrosReportesFormaPagoInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionFormaPagoInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			/*
			if(this.jTabbedPaneBusquedasFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasFormaPagoInven.setVisible(false);			
			}
			*/
			
			if(this.jScrollPanelDatosFormaPagoInven!=null) {
				this.jScrollPanelDatosFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormaPagoInven!=null) {
				this.jPanelPaginacionFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormaPagoInven!=null) {
				this.jPanelParametrosReportesFormaPagoInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionFormaPagoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			/*
			if(this.jTabbedPaneBusquedasFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasFormaPagoInven.setVisible(false);			
			}
			*/
			
			if(this.jScrollPanelDatosFormaPagoInven!=null) {
				this.jScrollPanelDatosFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormaPagoInven!=null) {
				this.jPanelPaginacionFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormaPagoInven!=null) {
				this.jPanelParametrosReportesFormaPagoInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionFormaPagoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			/*
			if(this.jTabbedPaneBusquedasFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasFormaPagoInven.setVisible(true);			
			}
			*/
			
			if(this.jScrollPanelDatosFormaPagoInven!=null) {
				this.jScrollPanelDatosFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormaPagoInven!=null) {
				this.jPanelPaginacionFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormaPagoInven!=null) {
				this.jPanelParametrosReportesFormaPagoInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionFormaPagoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			/*
			if(this.jTabbedPaneBusquedasFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasFormaPagoInven.setVisible(true);			
			}
			*/
			
			if(this.jScrollPanelDatosFormaPagoInven!=null) {
				this.jScrollPanelDatosFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormaPagoInven!=null) {
				this.jPanelPaginacionFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormaPagoInven!=null) {
				this.jPanelParametrosReportesFormaPagoInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionFormaPagoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			/*
			if(this.jTabbedPaneBusquedasFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasFormaPagoInven.setVisible(true);			
			}
			*/
			
			if(this.jScrollPanelDatosFormaPagoInven!=null) {
				this.jScrollPanelDatosFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormaPagoInven!=null) {
				this.jPanelPaginacionFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormaPagoInven!=null) {
				this.jPanelParametrosReportesFormaPagoInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				/*
				if(this.jTabbedPaneBusquedasFormaPagoInven!=null) {
					this.jTabbedPaneBusquedasFormaPagoInven.setVisible(false);				
				}
				*/
			}
			
			if(this.jPanelParametrosReportesFormaPagoInven!=null) {
				this.jPanelParametrosReportesFormaPagoInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			/*
			if(this.jTabbedPaneBusquedasFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasFormaPagoInven.setVisible(true);			
			}
			*/
			if(this.jPanelParametrosReportesFormaPagoInven!=null) {
				this.jPanelParametrosReportesFormaPagoInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		/*
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCompra=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCompraFormaPagoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCuentaContableFormaPagoInven);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdTipoFormaPagoFormaPagoInven);}
		}
		*/
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		/*
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCompra=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCompraFormaPagoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCuentaContableFormaPagoInven);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdTipoFormaPagoFormaPagoInven);}
		}
		*/
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		/*
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCompra=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCompraFormaPagoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCuentaContableFormaPagoInven);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdTipoFormaPagoFormaPagoInven);}
		}
		*/
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		/*
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdCompra=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCompraFormaPagoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCuentaContableFormaPagoInven);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdTipoFormaPagoFormaPagoInven);}
		}
		*/
	}

	public void setVisibilidadBusquedasParaTipoFormaPago(Boolean isParaTipoFormaPago){
		//BYDAN_BUSQUEDAS
		/*
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFormaPagoNegation=!isParaTipoFormaPago;

			this.isVisibilidadFK_IdCompra=isParaTipoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCompraFormaPagoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaTipoFormaPagoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCuentaContableFormaPagoInven);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaTipoFormaPago;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdTipoFormaPagoFormaPagoInven);}
		}
		*/
	}

	public void setVisibilidadBusquedasParaCompra(Boolean isParaCompra){
		//BYDAN_BUSQUEDAS
		/*
		if(!this.conCargarMinimo) {

			Boolean isParaCompraNegation=!isParaCompra;

			this.isVisibilidadFK_IdCompra=isParaCompra;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCompraFormaPagoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaCompraNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCuentaContableFormaPagoInven);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaCompraNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdTipoFormaPagoFormaPagoInven);}
		}
		*/
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		/*
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdCompra=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCompraFormaPagoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCuentaContableFormaPagoInven);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdTipoFormaPagoFormaPagoInven);}
		}
		*/
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		/*
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdCompra=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCompraFormaPagoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCuentaContableFormaPagoInven);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdTipoFormaPagoFormaPagoInven);}
		}
		*/
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		/*
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCompra=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCompra) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCompraFormaPagoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdCuentaContableFormaPagoInven);}

			this.isVisibilidadFK_IdTipoFormaPago=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdTipoFormaPago) {this.jTabbedPaneBusquedasFormaPagoInven.remove(jPanelFK_IdTipoFormaPagoFormaPagoInven);}
		}
		*/
	}
	
	
	
	

	public String registrarSesionFormaPagoInvenParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(formapagoinvenSessionBean==null) {
				formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(formapagoinvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.formapagoinvenFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(FormaPagoInvenConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionFormaPagoInven(true);
			//cuentacontableSessionBean.setlidFormaPagoInvenActual(this.idFormaPagoInvenActual);

			formapagoinvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFormaPagoInven(true);
			formapagoinvenSessionBean.setlIdFormaPagoInvenActualForeignKey(this.idFormaPagoInvenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FormaPagoInvenSessionBean formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
		
		if(this.formapagoinvenSessionBean==null) {
			this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
		}
		
		this.formapagoinvenSessionBean.setsUltimaBusquedaFormaPagoInven(this.getsAccionBusqueda());
		this.formapagoinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.formapagoinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCompra")) {
			formapagoinvenSessionBean.setid_compra(this.getid_compraFK_IdCompra());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			formapagoinvenSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			formapagoinvenSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			formapagoinvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			formapagoinvenSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			formapagoinvenSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
			formapagoinvenSessionBean.setid_tipo_forma_pago(this.getid_tipo_forma_pagoFK_IdTipoFormaPago());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FormaPagoInvenSessionBean formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
		
		if(this.formapagoinvenSessionBean==null) {
			this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
		}
		
		if(this.formapagoinvenSessionBean.getsUltimaBusquedaFormaPagoInven()!=null&&!this.formapagoinvenSessionBean.getsUltimaBusquedaFormaPagoInven().equals("")) {
			this.setsAccionBusqueda(formapagoinvenSessionBean.getsUltimaBusquedaFormaPagoInven());
			this.setiNumeroPaginacion(formapagoinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(formapagoinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCompra")) {
				this.setid_compraFK_IdCompra(formapagoinvenSessionBean.getid_compra());
				formapagoinvenSessionBean.setid_compra(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(formapagoinvenSessionBean.getid_cuenta_contable());
				formapagoinvenSessionBean.setid_cuenta_contable(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(formapagoinvenSessionBean.getid_ejercicio());
				formapagoinvenSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(formapagoinvenSessionBean.getid_empresa());
				formapagoinvenSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(formapagoinvenSessionBean.getid_periodo());
				formapagoinvenSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(formapagoinvenSessionBean.getid_sucursal());
				formapagoinvenSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoFormaPago")) {
				this.setid_tipo_forma_pagoFK_IdTipoFormaPago(formapagoinvenSessionBean.getid_tipo_forma_pago());
				formapagoinvenSessionBean.setid_tipo_forma_pago(-1L);
			}
		}
		
		this.formapagoinvenSessionBean.setsUltimaBusquedaFormaPagoInven("");
		this.formapagoinvenSessionBean.setiNumeroPaginacion(FormaPagoInvenConstantesFunciones.INUMEROPAGINACION);
		this.formapagoinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFormaPagoInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFormaPagoInven() {
		this.updateBorderResaltarBusquedasFormularioFormaPagoInven();
		this.updateVisibilidadBusquedasFormularioFormaPagoInven();
		this.updateHabilitarBusquedasFormularioFormaPagoInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioFormaPagoInven() {					
	//BYDAN_BUSQUEDAS
	/*	
	int index=0;
		
	if(this.jTabbedPaneBusquedasFormaPagoInven.getComponents().length>0) {
	

		if(this.formapagoinvenConstantesFunciones.resaltarFK_IdCompraFormaPagoInven!=null) {
			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdCompraFormaPagoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);
				jPanel.setBorder(this.formapagoinvenConstantesFunciones.resaltarFK_IdCompraFormaPagoInven);
			}
		}

		if(this.formapagoinvenConstantesFunciones.resaltarFK_IdCuentaContableFormaPagoInven!=null) {
			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdCuentaContableFormaPagoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);
				jPanel.setBorder(this.formapagoinvenConstantesFunciones.resaltarFK_IdCuentaContableFormaPagoInven);
			}
		}

		if(this.formapagoinvenConstantesFunciones.resaltarFK_IdTipoFormaPagoFormaPagoInven!=null) {
			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdTipoFormaPagoFormaPagoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);
				jPanel.setBorder(this.formapagoinvenConstantesFunciones.resaltarFK_IdTipoFormaPagoFormaPagoInven);
			}
		}
	}	
	*/
	}
	
	public void updateVisibilidadBusquedasFormularioFormaPagoInven() {
	//BYDAN_BUSQUEDAS
	/*
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFormaPagoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdCompraFormaPagoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formapagoinvenConstantesFunciones.mostrarFK_IdCompraFormaPagoInven);
			if(!this.formapagoinvenConstantesFunciones.mostrarFK_IdCompraFormaPagoInven && index>-1) {
				this.jTabbedPaneBusquedasFormaPagoInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdCuentaContableFormaPagoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formapagoinvenConstantesFunciones.mostrarFK_IdCuentaContableFormaPagoInven);
			if(!this.formapagoinvenConstantesFunciones.mostrarFK_IdCuentaContableFormaPagoInven && index>-1) {
				this.jTabbedPaneBusquedasFormaPagoInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdTipoFormaPagoFormaPagoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formapagoinvenConstantesFunciones.mostrarFK_IdTipoFormaPagoFormaPagoInven);
			if(!this.formapagoinvenConstantesFunciones.mostrarFK_IdTipoFormaPagoFormaPagoInven && index>-1) {
				this.jTabbedPaneBusquedasFormaPagoInven.remove(index);
			}
	}	
	*/
	}
	
	public void updateHabilitarBusquedasFormularioFormaPagoInven() {
	/*
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFormaPagoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdCompraFormaPagoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formapagoinvenConstantesFunciones.activarFK_IdCompraFormaPagoInven);
				this.jTabbedPaneBusquedasFormaPagoInven.setEnabledAt(index,this.formapagoinvenConstantesFunciones.activarFK_IdCompraFormaPagoInven);
			}

			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdCuentaContableFormaPagoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formapagoinvenConstantesFunciones.activarFK_IdCuentaContableFormaPagoInven);
				this.jTabbedPaneBusquedasFormaPagoInven.setEnabledAt(index,this.formapagoinvenConstantesFunciones.activarFK_IdCuentaContableFormaPagoInven);
			}

			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdTipoFormaPagoFormaPagoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formapagoinvenConstantesFunciones.activarFK_IdTipoFormaPagoFormaPagoInven);
				this.jTabbedPaneBusquedasFormaPagoInven.setEnabledAt(index,this.formapagoinvenConstantesFunciones.activarFK_IdTipoFormaPagoFormaPagoInven);
			}
		}	
	*/
	}
	
	
	public void resaltarPanelBusquedaFormaPagoInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		/*
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCompra")) {
			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdCompraFormaPagoInven);

			this.jTabbedPaneBusquedasFormaPagoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);

			this.formapagoinvenConstantesFunciones.setResaltarFK_IdCompraFormaPagoInven(resaltar);

			jPanel.setBorder(this.formapagoinvenConstantesFunciones.resaltarFK_IdCompraFormaPagoInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdCuentaContableFormaPagoInven);

			this.jTabbedPaneBusquedasFormaPagoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);

			this.formapagoinvenConstantesFunciones.setResaltarFK_IdCuentaContableFormaPagoInven(resaltar);

			jPanel.setBorder(this.formapagoinvenConstantesFunciones.resaltarFK_IdCuentaContableFormaPagoInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoFormaPago")) {
			index= this.jTabbedPaneBusquedasFormaPagoInven.indexOfComponent(this.jPanelFK_IdTipoFormaPagoFormaPagoInven);

			this.jTabbedPaneBusquedasFormaPagoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormaPagoInven.getComponent(index);

			this.formapagoinvenConstantesFunciones.setResaltarFK_IdTipoFormaPagoFormaPagoInven(resaltar);

			jPanel.setBorder(this.formapagoinvenConstantesFunciones.resaltarFK_IdTipoFormaPagoFormaPagoInven);
			existe=true;
		}
		*/

		if(existe) {
			/*
			this.jTtoolBarFormaPagoInven.setBorder(resaltar);
			*/
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
	
	public void updateControlesFormularioFormaPagoInven() throws Exception {

		if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFormaPagoInven();
		this.updateVisibilidadResaltarControlesFormularioFormaPagoInven();
		this.updateHabilitarResaltarControlesFormularioFormaPagoInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioFormaPagoInven() throws Exception {
		if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.formapagoinvenConstantesFunciones.resaltaridFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jLabelidFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltaridFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarid_empresaFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarid_empresaFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarid_sucursalFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarid_sucursalFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarid_ejercicioFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarid_ejercicioFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarid_periodoFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarid_periodoFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarid_tipo_forma_pagoFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarid_tipo_forma_pagoFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarfecha_inicioFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_inicioFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarfecha_inicioFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarnumero_diasFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarnumero_diasFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarfecha_finFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_finFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarfecha_finFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarporcentajeFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarporcentajeFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarvalorFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarvalorFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltardetalleFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jTextAreadetalleFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltardetalleFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarid_compraFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarid_compraFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarid_anioFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarid_anioFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarid_mesFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarid_mesFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarid_cuenta_contableFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarid_cuenta_contableFormaPagoInven);}
		if(this.formapagoinvenConstantesFunciones.resaltarfechaFormaPagoInven!=null && this.jInternalFrameDetalleFormFormaPagoInven!=null) {this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfechaFormaPagoInven.setBorder(this.formapagoinvenConstantesFunciones.resaltarfechaFormaPagoInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFormaPagoInven() throws Exception {		
		if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
	
		//this.jInternalFrameDetalleFormFormaPagoInven.jLabelidFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostraridFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelidFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostraridFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_empresaFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelid_empresaFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_empresaFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_sucursalFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelid_sucursalFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_sucursalFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_ejercicioFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelid_ejercicioFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_ejercicioFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_periodoFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelid_periodoFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_periodoFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_tipo_forma_pagoFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelid_tipo_forma_pagoFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_tipo_forma_pagoFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_inicioFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarfecha_inicioFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelfecha_inicioFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarfecha_inicioFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarnumero_diasFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelnumero_diasFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarnumero_diasFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_finFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarfecha_finFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelfecha_finFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarfecha_finFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarporcentajeFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelporcentajeFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarporcentajeFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarvalorFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelvalorFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarvalorFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jTextAreadetalleFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrardetalleFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPaneldetalleFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrardetalleFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_compraFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelid_compraFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_compraFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_anioFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelid_anioFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_anioFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_mesFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelid_mesFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_mesFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_cuenta_contableFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelid_cuenta_contableFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_cuenta_contableFormaPagoInven);
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarid_cuenta_contableFormaPagoInven);
		//this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfechaFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarfechaFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jPanelfechaFormaPagoInven.setVisible(this.formapagoinvenConstantesFunciones.mostrarfechaFormaPagoInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFormaPagoInven() throws Exception {
		if(this.jInternalFrameDetalleFormFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormaPagoInven!=null) {
	
		this.jInternalFrameDetalleFormFormaPagoInven.jLabelidFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activaridFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_empresaFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarid_empresaFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_sucursalFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarid_sucursalFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_ejercicioFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarid_ejercicioFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_periodoFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarid_periodoFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_tipo_forma_pagoFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarid_tipo_forma_pagoFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_inicioFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarfecha_inicioFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldnumero_diasFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarnumero_diasFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfecha_finFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarfecha_finFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldporcentajeFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarporcentajeFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jTextFieldvalorFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarvalorFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jTextAreadetalleFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activardetalleFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_compraFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarid_compraFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_anioFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarid_anioFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_mesFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarid_mesFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jComboBoxid_cuenta_contableFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarid_cuenta_contableFormaPagoInven);
			this.jInternalFrameDetalleFormFormaPagoInven.jButtonid_cuenta_contableFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarid_cuenta_contableFormaPagoInven);
		this.jInternalFrameDetalleFormFormaPagoInven.jDateChooserfechaFormaPagoInven.setEnabled(this.formapagoinvenConstantesFunciones.activarfechaFormaPagoInven);
		}
	}
	
		
}