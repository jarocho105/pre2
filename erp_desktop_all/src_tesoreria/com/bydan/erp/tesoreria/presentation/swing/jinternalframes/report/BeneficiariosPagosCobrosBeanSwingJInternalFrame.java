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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.tesoreria.util.BeneficiariosPagosCobrosConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.BeneficiariosPagosCobrosParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.BeneficiariosPagosCobrosParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.BeneficiariosPagosCobrosBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

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
public class BeneficiariosPagosCobrosBeanSwingJInternalFrame extends BeneficiariosPagosCobrosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(BeneficiariosPagosCobrosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<BeneficiariosPagosCobros> beneficiariospagoscobrosValidator = new ClassValidator<BeneficiariosPagosCobros>(BeneficiariosPagosCobros.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public BeneficiariosPagosCobros beneficiariospagoscobros;	
	public BeneficiariosPagosCobros beneficiariospagoscobrosAux;
	public BeneficiariosPagosCobros beneficiariospagoscobrosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public BeneficiariosPagosCobros beneficiariospagoscobrosTotales;
	public Long idBeneficiariosPagosCobrosActual;
	public Long iIdNuevoBeneficiariosPagosCobros=0L;
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

	public String sFinalQueryComboTipoMovimiento="";

	public List<TipoMovimiento> tipomovimientosForeignKey;

	public List<TipoMovimiento> gettipomovimientosForeignKey() {
		return tipomovimientosForeignKey;
	}

	public void settipomovimientosForeignKey(List<TipoMovimiento> tipomovimientosForeignKey) {
		this.tipomovimientosForeignKey = tipomovimientosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMovimiento tipomovimientoForeignKey;

	public TipoMovimiento gettipomovimientoForeignKey() {
		return tipomovimientoForeignKey;
	}

	public void settipomovimientoForeignKey(TipoMovimiento tipomovimientoForeignKey) {
		this.tipomovimientoForeignKey = tipomovimientoForeignKey;
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
	
	public Boolean isPermisoTodoBeneficiariosPagosCobros;
	public Boolean isPermisoNuevoBeneficiariosPagosCobros;
	public Boolean isPermisoActualizarBeneficiariosPagosCobros;
	public Boolean isPermisoActualizarOriginalBeneficiariosPagosCobros;
	public Boolean isPermisoEliminarBeneficiariosPagosCobros;
	public Boolean isPermisoGuardarCambiosBeneficiariosPagosCobros;
	public Boolean isPermisoConsultaBeneficiariosPagosCobros;
	public Boolean isPermisoBusquedaBeneficiariosPagosCobros;
	public Boolean isPermisoReporteBeneficiariosPagosCobros;
	public Boolean isPermisoPaginacionMedioBeneficiariosPagosCobros;
	public Boolean isPermisoPaginacionAltoBeneficiariosPagosCobros;
	public Boolean isPermisoPaginacionTodoBeneficiariosPagosCobros;
	public Boolean isPermisoCopiarBeneficiariosPagosCobros;
	public Boolean isPermisoVerFormBeneficiariosPagosCobros;
	public Boolean isPermisoDuplicarBeneficiariosPagosCobros;
	public Boolean isPermisoOrdenBeneficiariosPagosCobros;
	
	
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
	
	public BeneficiariosPagosCobrosParameterReturnGeneral beneficiariospagoscobrosReturnGeneral;
	public BeneficiariosPagosCobrosParameterReturnGeneral beneficiariospagoscobrosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoBeneficiariosPagosCobros=false;
	public Boolean esParaAccionDesdeFormularioBeneficiariosPagosCobros=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected BeneficiariosPagosCobrosSessionBeanAdditional beneficiariospagoscobrosSessionBeanAdditional=null;
	
	public BeneficiariosPagosCobrosSessionBeanAdditional getBeneficiariosPagosCobrosSessionBeanAdditional() {
		return this.beneficiariospagoscobrosSessionBeanAdditional;
	}
	
	public void setBeneficiariosPagosCobrosSessionBeanAdditional(BeneficiariosPagosCobrosSessionBeanAdditional beneficiariospagoscobrosSessionBeanAdditional) {
		try {
			this.beneficiariospagoscobrosSessionBeanAdditional=beneficiariospagoscobrosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional beneficiariospagoscobrosBeanSwingJInternalFrameAdditional=null;
	//public class BeneficiariosPagosCobrosBeanSwingJInternalFrame
	
	public BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional getBeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional() {
		return this.beneficiariospagoscobrosBeanSwingJInternalFrameAdditional;
	}
	
	public void setBeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional(BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional beneficiariospagoscobrosBeanSwingJInternalFrameAdditional) {
		try {
			this.beneficiariospagoscobrosBeanSwingJInternalFrameAdditional=beneficiariospagoscobrosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public BeneficiariosPagosCobrosLogic beneficiariospagoscobrosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public BeneficiariosPagosCobros beneficiariospagoscobrosBean;
	public BeneficiariosPagosCobrosConstantesFunciones beneficiariospagoscobrosConstantesFunciones;
	//public BeneficiariosPagosCobrosParameterReturnGeneral beneficiariospagoscobrosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	
	//PARAMETROS
	
	
	//public List<BeneficiariosPagosCobros> beneficiariospagoscobross;	
	//public List<BeneficiariosPagosCobros> beneficiariospagoscobrossEliminados;
	//public List<BeneficiariosPagosCobros> beneficiariospagoscobrossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoBeneficiariosPagosCobros=false;
	public Boolean isVisibilidadCeldaDuplicarBeneficiariosPagosCobros=true;
	public Boolean isVisibilidadCeldaCopiarBeneficiariosPagosCobros=true;
	public Boolean isVisibilidadCeldaVerFormBeneficiariosPagosCobros=true;
	public Boolean isVisibilidadCeldaOrdenBeneficiariosPagosCobros=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=false;
	public Boolean isVisibilidadCeldaModificarBeneficiariosPagosCobros=false;
	public Boolean isVisibilidadCeldaActualizarBeneficiariosPagosCobros=false;
	public Boolean isVisibilidadCeldaEliminarBeneficiariosPagosCobros=false;
	public Boolean isVisibilidadCeldaCancelarBeneficiariosPagosCobros=false;
	public Boolean isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=false;	
	
	
	public Boolean isVisibilidadBusquedaBeneficiariosPagosCobros=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoBeneficiariosPagosCobros() {
		return this.iIdNuevoBeneficiariosPagosCobros;
	}

	public void setiIdNuevoBeneficiariosPagosCobros(Long iIdNuevoBeneficiariosPagosCobros) {
		this.iIdNuevoBeneficiariosPagosCobros = iIdNuevoBeneficiariosPagosCobros;
	}
	
	public Long getidBeneficiariosPagosCobrosActual() {
		return this.idBeneficiariosPagosCobrosActual;
	}

	public void setidBeneficiariosPagosCobrosActual(Long idBeneficiariosPagosCobrosActual) {
		this.idBeneficiariosPagosCobrosActual = idBeneficiariosPagosCobrosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public BeneficiariosPagosCobros getbeneficiariospagoscobros() {
		return this.beneficiariospagoscobros;
	}

	public void setbeneficiariospagoscobros(BeneficiariosPagosCobros beneficiariospagoscobros) {
		this.beneficiariospagoscobros = beneficiariospagoscobros;
	}
	
	public BeneficiariosPagosCobros getbeneficiariospagoscobrosAux() {
		return this.beneficiariospagoscobrosAux;
	}

	public void setbeneficiariospagoscobrosAux(BeneficiariosPagosCobros beneficiariospagoscobrosAux) {
		this.beneficiariospagoscobrosAux = beneficiariospagoscobrosAux;
	}				
	
	public BeneficiariosPagosCobros getbeneficiariospagoscobrosAnterior() {
		return this.beneficiariospagoscobrosAnterior;
	}

	public void setbeneficiariospagoscobrosAnterior(BeneficiariosPagosCobros beneficiariospagoscobrosAnterior) {
		this.beneficiariospagoscobrosAnterior = beneficiariospagoscobrosAnterior;
	}	
	
	public BeneficiariosPagosCobros getbeneficiariospagoscobrosTotales() {
		return this.beneficiariospagoscobrosTotales;
	}

	public void setbeneficiariospagoscobrosTotales(BeneficiariosPagosCobros beneficiariospagoscobrosTotales) {
		this.beneficiariospagoscobrosTotales = beneficiariospagoscobrosTotales;
	}	
	
	public BeneficiariosPagosCobros getbeneficiariospagoscobrosBean() {
		return this.beneficiariospagoscobrosBean;
	}

	public void setbeneficiariospagoscobrosBean(BeneficiariosPagosCobros beneficiariospagoscobrosBean) {
		this.beneficiariospagoscobrosBean = beneficiariospagoscobrosBean;
	}	
	
	public BeneficiariosPagosCobrosParameterReturnGeneral getbeneficiariospagoscobrosReturnGeneral() {
		return this.beneficiariospagoscobrosReturnGeneral;
	}

	public void setbeneficiariospagoscobrosReturnGeneral(BeneficiariosPagosCobrosParameterReturnGeneral beneficiariospagoscobrosReturnGeneral) {
		this.beneficiariospagoscobrosReturnGeneral = beneficiariospagoscobrosReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaBeneficiariosPagosCobros=-1L;

	public Long getid_ejercicioBusquedaBeneficiariosPagosCobros() {
		return this.id_ejercicioBusquedaBeneficiariosPagosCobros;
	}

	public void setid_ejercicioBusquedaBeneficiariosPagosCobros(Long id_ejercicioBusquedaBeneficiariosPagosCobros) {
		this.id_ejercicioBusquedaBeneficiariosPagosCobros = id_ejercicioBusquedaBeneficiariosPagosCobros;
	}

;
	public Long id_tipo_movimientoBusquedaBeneficiariosPagosCobros=-1L;

	public Long getid_tipo_movimientoBusquedaBeneficiariosPagosCobros() {
		return this.id_tipo_movimientoBusquedaBeneficiariosPagosCobros;
	}

	public void setid_tipo_movimientoBusquedaBeneficiariosPagosCobros(Long id_tipo_movimientoBusquedaBeneficiariosPagosCobros) {
		this.id_tipo_movimientoBusquedaBeneficiariosPagosCobros = id_tipo_movimientoBusquedaBeneficiariosPagosCobros;
	}

;
	public Date fecha_desdeBusquedaBeneficiariosPagosCobros=new Date();

	public Date getfecha_desdeBusquedaBeneficiariosPagosCobros() {
		return this.fecha_desdeBusquedaBeneficiariosPagosCobros;
	}

	public void setfecha_desdeBusquedaBeneficiariosPagosCobros(Date fecha_desdeBusquedaBeneficiariosPagosCobros) {
		this.fecha_desdeBusquedaBeneficiariosPagosCobros = fecha_desdeBusquedaBeneficiariosPagosCobros;
	}

;
	public Date fecha_hastaBusquedaBeneficiariosPagosCobros=new Date();

	public Date getfecha_hastaBusquedaBeneficiariosPagosCobros() {
		return this.fecha_hastaBusquedaBeneficiariosPagosCobros;
	}

	public void setfecha_hastaBusquedaBeneficiariosPagosCobros(Date fecha_hastaBusquedaBeneficiariosPagosCobros) {
		this.fecha_hastaBusquedaBeneficiariosPagosCobros = fecha_hastaBusquedaBeneficiariosPagosCobros;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_movimientoFK_IdTipoMovimiento=-1L;

	public Long getid_tipo_movimientoFK_IdTipoMovimiento() {
		return this.id_tipo_movimientoFK_IdTipoMovimiento;
	}

	public void setid_tipo_movimientoFK_IdTipoMovimiento(Long id_tipo_movimientoFK_IdTipoMovimiento) {
		this.id_tipo_movimientoFK_IdTipoMovimiento = id_tipo_movimientoFK_IdTipoMovimiento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public BeneficiariosPagosCobrosLogic getBeneficiariosPagosCobrosLogic()	{		
		return beneficiariospagoscobrosLogic;
	}

	public void setBeneficiariosPagosCobrosLogic(BeneficiariosPagosCobrosLogic beneficiariospagoscobrosLogic) {
		this.beneficiariospagoscobrosLogic = beneficiariospagoscobrosLogic;
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
	
	public Boolean getIsEsNuevoBeneficiariosPagosCobros() {
		return isEsNuevoBeneficiariosPagosCobros;
	}

	public void setIsEsNuevoBeneficiariosPagosCobros(Boolean isEsNuevoBeneficiariosPagosCobros) {
		this.isEsNuevoBeneficiariosPagosCobros = isEsNuevoBeneficiariosPagosCobros;
	}

	public Boolean getEsParaAccionDesdeFormularioBeneficiariosPagosCobros() {
		return esParaAccionDesdeFormularioBeneficiariosPagosCobros;
	}
	
	public void setEsParaAccionDesdeFormularioBeneficiariosPagosCobros(Boolean esParaAccionDesdeFormularioBeneficiariosPagosCobros) {
		this.esParaAccionDesdeFormularioBeneficiariosPagosCobros = esParaAccionDesdeFormularioBeneficiariosPagosCobros;
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

			if(this.beneficiariospagoscobrosSessionBean==null) {
				this.beneficiariospagoscobrosSessionBean=new BeneficiariosPagosCobrosSessionBean();
			}

			if(!this.beneficiariospagoscobrosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(beneficiariospagoscobrosSessionBean.getlidEmpresaActual());
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

			if(this.beneficiariospagoscobrosSessionBean==null) {
				this.beneficiariospagoscobrosSessionBean=new BeneficiariosPagosCobrosSessionBean();
			}

			if(!this.beneficiariospagoscobrosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(beneficiariospagoscobrosSessionBean.getlidSucursalActual());
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

			if(this.beneficiariospagoscobrosSessionBean==null) {
				this.beneficiariospagoscobrosSessionBean=new BeneficiariosPagosCobrosSessionBean();
			}

			if(!this.beneficiariospagoscobrosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(beneficiariospagoscobrosSessionBean.getlidEjercicioActual());
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

	public void cargarCombosTipoMovimientosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMovimientoLogic tipomovimientoLogic=new TipoMovimientoLogic();

			//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

			if(this.beneficiariospagoscobrosSessionBean==null) {
				this.beneficiariospagoscobrosSessionBean=new BeneficiariosPagosCobrosSessionBean();
			}

			if(!this.beneficiariospagoscobrosSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

					tipomovimientoLogic.getTodosTipoMovimientosWithConnection(sFinalQuery,new Pagination());

					this.tipomovimientosForeignKey=tipomovimientoLogic.getTipoMovimientos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMovimiento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientoLogic.getEntityWithConnection(beneficiariospagoscobrosSessionBean.getlidTipoMovimientoActual());
					this.tipomovimientosForeignKey.add(tipomovimientoLogic.getTipoMovimiento());
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

					if(this.beneficiariospagoscobros!=null) {
						this.beneficiariospagoscobros.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
						this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaBeneficiariosPagosCobros.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.getItemCount()>0) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaBeneficiariosPagosCobrosGenerico)throws Exception
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
				jComboBoxid_empresaBeneficiariosPagosCobrosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaBeneficiariosPagosCobrosGenerico!=null && jComboBoxid_empresaBeneficiariosPagosCobrosGenerico.getItemCount()>0) {
					jComboBoxid_empresaBeneficiariosPagosCobrosGenerico.setSelectedIndex(0);
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

					if(this.beneficiariospagoscobros!=null) {
						this.beneficiariospagoscobros.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
						this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalBeneficiariosPagosCobros.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.getItemCount()>0) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalBeneficiariosPagosCobrosGenerico)throws Exception
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
				jComboBoxid_sucursalBeneficiariosPagosCobrosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalBeneficiariosPagosCobrosGenerico!=null && jComboBoxid_sucursalBeneficiariosPagosCobrosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalBeneficiariosPagosCobrosGenerico.setSelectedIndex(0);
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

					if(this.beneficiariospagoscobros!=null) {
						this.beneficiariospagoscobros.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
						this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioBeneficiariosPagosCobros.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.getItemCount()>0) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaBeneficiariosPagosCobros") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros!=null) {
						jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros!=null) {
							//jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioBeneficiariosPagosCobrosGenerico)throws Exception
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
				jComboBoxid_ejercicioBeneficiariosPagosCobrosGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioBeneficiariosPagosCobrosGenerico!=null && jComboBoxid_ejercicioBeneficiariosPagosCobrosGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioBeneficiariosPagosCobrosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMovimientoForeignKey(Long idTipoMovimientoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomovimientoTemp!=null) {

					if(this.beneficiariospagoscobros!=null) {
						this.beneficiariospagoscobros.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
						this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.getItemCount()>0) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaBeneficiariosPagosCobros") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros!=null) {
						jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros!=null) {
							//jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.getItemCount()>0) {
								jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setSelectedIndex(0);
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

	public String getActualTipoMovimientoForeignKeyDescripcion(Long idTipoMovimientoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}


			sDescripcion=TipoMovimientoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoBeneficiariosPagosCobrosGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(tipomovimientoTemp!=null) {
				jComboBoxid_tipo_movimientoBeneficiariosPagosCobrosGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoBeneficiariosPagosCobrosGenerico!=null && jComboBoxid_tipo_movimientoBeneficiariosPagosCobrosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoBeneficiariosPagosCobrosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(BeneficiariosPagosCobros beneficiariospagoscobros,JComboBox jComboBoxid_empresaBeneficiariosPagosCobrosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaBeneficiariosPagosCobrosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaBeneficiariosPagosCobrosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				beneficiariospagoscobros.setid_empresa(empresaAux.getId());
				beneficiariospagoscobros.setempresa_descripcion(BeneficiariosPagosCobrosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				beneficiariospagoscobros.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(BeneficiariosPagosCobros beneficiariospagoscobros,JComboBox jComboBoxid_sucursalBeneficiariosPagosCobrosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalBeneficiariosPagosCobrosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalBeneficiariosPagosCobrosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				beneficiariospagoscobros.setid_sucursal(sucursalAux.getId());
				beneficiariospagoscobros.setsucursal_descripcion(BeneficiariosPagosCobrosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				beneficiariospagoscobros.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(BeneficiariosPagosCobros beneficiariospagoscobros,JComboBox jComboBoxid_ejercicioBeneficiariosPagosCobrosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioBeneficiariosPagosCobrosGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioBeneficiariosPagosCobrosGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				beneficiariospagoscobros.setid_ejercicio(ejercicioAux.getId());
				beneficiariospagoscobros.setejercicio_descripcion(BeneficiariosPagosCobrosConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				beneficiariospagoscobros.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(BeneficiariosPagosCobros beneficiariospagoscobros,JComboBox jComboBoxid_tipo_movimientoBeneficiariosPagosCobrosGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoBeneficiariosPagosCobrosGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoBeneficiariosPagosCobrosGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				beneficiariospagoscobros.setid_tipo_movimiento(tipomovimientoAux.getId());
				beneficiariospagoscobros.settipomovimiento_descripcion(BeneficiariosPagosCobrosConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				beneficiariospagoscobros.setTipoMovimiento(tipomovimientoAux);			}
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

					if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { 
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { 
					}

					if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { 
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { 
					}

					if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { 
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { 
					}

					if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaBeneficiariosPagosCobros") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.addItem(ejercicio);
							}
						}

						if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMovimientosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMovimiento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { 
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { 
					}

					if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaBeneficiariosPagosCobros") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.addItem(tipomovimiento);
							}
						}

						if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMovimientoForeignKey(TipoMovimiento tipomovimiento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesBeneficiariosPagosCobros() throws Exception {
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
		
	public BeneficiariosPagosCobrosParameterReturnGeneral getBeneficiariosPagosCobrosParameterGeneral() {
		return this.beneficiariospagoscobrosParameterGeneral;
	}
	
	public void setBeneficiariosPagosCobrosParameterGeneral(BeneficiariosPagosCobrosParameterReturnGeneral beneficiariospagoscobrosParameterGeneral) {
		this.beneficiariospagoscobrosParameterGeneral = beneficiariospagoscobrosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoBeneficiariosPagosCobros() {
		return isPermisoTodoBeneficiariosPagosCobros;
	}

	public void setIsPermisoTodoBeneficiariosPagosCobros(Boolean isPermisoTodoBeneficiariosPagosCobros) {
		this.isPermisoTodoBeneficiariosPagosCobros = isPermisoTodoBeneficiariosPagosCobros;
	}

	public Boolean getIsPermisoNuevoBeneficiariosPagosCobros() {
		return isPermisoNuevoBeneficiariosPagosCobros;
	}

	public void setIsPermisoNuevoBeneficiariosPagosCobros(Boolean isPermisoNuevoBeneficiariosPagosCobros) {
		this.isPermisoNuevoBeneficiariosPagosCobros = isPermisoNuevoBeneficiariosPagosCobros;
	}

	public Boolean getIsPermisoActualizarBeneficiariosPagosCobros() {
		return isPermisoActualizarBeneficiariosPagosCobros;
	}

	public void setIsPermisoActualizarBeneficiariosPagosCobros(Boolean isPermisoActualizarBeneficiariosPagosCobros) {
		this.isPermisoActualizarBeneficiariosPagosCobros = isPermisoActualizarBeneficiariosPagosCobros;
	}

	public Boolean getIsPermisoEliminarBeneficiariosPagosCobros() {
		return isPermisoEliminarBeneficiariosPagosCobros;
	}

	public void setIsPermisoEliminarBeneficiariosPagosCobros(Boolean isPermisoEliminarBeneficiariosPagosCobros) {
		this.isPermisoEliminarBeneficiariosPagosCobros = isPermisoEliminarBeneficiariosPagosCobros;
	}

	public Boolean getIsPermisoGuardarCambiosBeneficiariosPagosCobros() {
		return isPermisoGuardarCambiosBeneficiariosPagosCobros;
	}

	public void setIsPermisoGuardarCambiosBeneficiariosPagosCobros(Boolean isPermisoGuardarCambiosBeneficiariosPagosCobros) {
		this.isPermisoGuardarCambiosBeneficiariosPagosCobros = isPermisoGuardarCambiosBeneficiariosPagosCobros;
	}
	
	public Boolean getIsPermisoConsultaBeneficiariosPagosCobros() {
		return isPermisoConsultaBeneficiariosPagosCobros;
	}

	public void setIsPermisoConsultaBeneficiariosPagosCobros(Boolean isPermisoConsultaBeneficiariosPagosCobros) {
		this.isPermisoConsultaBeneficiariosPagosCobros = isPermisoConsultaBeneficiariosPagosCobros;
	}

	public Boolean getIsPermisoBusquedaBeneficiariosPagosCobros() {
		return isPermisoBusquedaBeneficiariosPagosCobros;
	}

	public void setIsPermisoBusquedaBeneficiariosPagosCobros(Boolean isPermisoBusquedaBeneficiariosPagosCobros) {
		this.isPermisoBusquedaBeneficiariosPagosCobros = isPermisoBusquedaBeneficiariosPagosCobros;
	}

	public Boolean getIsPermisoReporteBeneficiariosPagosCobros() {
		return isPermisoReporteBeneficiariosPagosCobros;
	}

	public void setIsPermisoReporteBeneficiariosPagosCobros(Boolean isPermisoReporteBeneficiariosPagosCobros) {
		this.isPermisoReporteBeneficiariosPagosCobros = isPermisoReporteBeneficiariosPagosCobros;
	}
	
	public Boolean getIsPermisoPaginacionMedioBeneficiariosPagosCobros() {
		return isPermisoPaginacionMedioBeneficiariosPagosCobros;
	}

	public void setIsPermisoPaginacionMedioBeneficiariosPagosCobros(Boolean isPermisoPaginacionMedioBeneficiariosPagosCobros) {
		this.isPermisoPaginacionMedioBeneficiariosPagosCobros = isPermisoPaginacionMedioBeneficiariosPagosCobros;
	}
	
	public Boolean getIsPermisoPaginacionTodoBeneficiariosPagosCobros() {
		return isPermisoPaginacionTodoBeneficiariosPagosCobros;
	}

	public void setIsPermisoPaginacionTodoBeneficiariosPagosCobros(Boolean isPermisoPaginacionTodoBeneficiariosPagosCobros) {
		this.isPermisoPaginacionTodoBeneficiariosPagosCobros = isPermisoPaginacionTodoBeneficiariosPagosCobros;
	}
	
	public Boolean getIsPermisoPaginacionAltoBeneficiariosPagosCobros() {
		return isPermisoPaginacionAltoBeneficiariosPagosCobros;
	}

	public void setIsPermisoPaginacionAltoBeneficiariosPagosCobros(Boolean isPermisoPaginacionAltoBeneficiariosPagosCobros) {
		this.isPermisoPaginacionAltoBeneficiariosPagosCobros = isPermisoPaginacionAltoBeneficiariosPagosCobros;
	}
	
	public Boolean getIsPermisoCopiarBeneficiariosPagosCobros() {
		return isPermisoCopiarBeneficiariosPagosCobros;
	}

	public void setIsPermisoCopiarBeneficiariosPagosCobros(Boolean isPermisoCopiarBeneficiariosPagosCobros) {
		this.isPermisoCopiarBeneficiariosPagosCobros = isPermisoCopiarBeneficiariosPagosCobros;
	}
	
	public Boolean getIsPermisoVerFormBeneficiariosPagosCobros() {
		return isPermisoVerFormBeneficiariosPagosCobros;
	}

	public void setIsPermisoVerFormBeneficiariosPagosCobros(Boolean isPermisoVerFormBeneficiariosPagosCobros) {
		this.isPermisoVerFormBeneficiariosPagosCobros = isPermisoVerFormBeneficiariosPagosCobros;
	}
	
	public Boolean getIsPermisoDuplicarBeneficiariosPagosCobros() {
		return isPermisoDuplicarBeneficiariosPagosCobros;
	}

	public void setIsPermisoDuplicarBeneficiariosPagosCobros(Boolean isPermisoDuplicarBeneficiariosPagosCobros) {
		this.isPermisoDuplicarBeneficiariosPagosCobros = isPermisoDuplicarBeneficiariosPagosCobros;
	}
	
	public Boolean getIsPermisoOrdenBeneficiariosPagosCobros() {
		return isPermisoOrdenBeneficiariosPagosCobros;
	}

	public void setIsPermisoOrdenBeneficiariosPagosCobros(Boolean isPermisoOrdenBeneficiariosPagosCobros) {
		this.isPermisoOrdenBeneficiariosPagosCobros = isPermisoOrdenBeneficiariosPagosCobros;
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
	
	public Boolean getIsVisibilidadCeldaNuevoBeneficiariosPagosCobros() {
		return isVisibilidadCeldaNuevoBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaNuevoBeneficiariosPagosCobros(Boolean isVisibilidadCeldaNuevoBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros = isVisibilidadCeldaNuevoBeneficiariosPagosCobros;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarBeneficiariosPagosCobros() {
		return isVisibilidadCeldaDuplicarBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaDuplicarBeneficiariosPagosCobros(Boolean isVisibilidadCeldaDuplicarBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaDuplicarBeneficiariosPagosCobros = isVisibilidadCeldaDuplicarBeneficiariosPagosCobros;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarBeneficiariosPagosCobros() {
		return isVisibilidadCeldaCopiarBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaCopiarBeneficiariosPagosCobros(Boolean isVisibilidadCeldaCopiarBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaCopiarBeneficiariosPagosCobros = isVisibilidadCeldaCopiarBeneficiariosPagosCobros;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormBeneficiariosPagosCobros() {
		return isVisibilidadCeldaVerFormBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaVerFormBeneficiariosPagosCobros(Boolean isVisibilidadCeldaVerFormBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaVerFormBeneficiariosPagosCobros = isVisibilidadCeldaVerFormBeneficiariosPagosCobros;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenBeneficiariosPagosCobros() {
		return isVisibilidadCeldaOrdenBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaOrdenBeneficiariosPagosCobros(Boolean isVisibilidadCeldaOrdenBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaOrdenBeneficiariosPagosCobros = isVisibilidadCeldaOrdenBeneficiariosPagosCobros;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros() {
		return isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros(Boolean isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros = isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros;
	}
	
	public Boolean getIsVisibilidadCeldaModificarBeneficiariosPagosCobros() {
		return isVisibilidadCeldaModificarBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaModificarBeneficiariosPagosCobros(Boolean isVisibilidadCeldaModificarBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaModificarBeneficiariosPagosCobros = isVisibilidadCeldaModificarBeneficiariosPagosCobros;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarBeneficiariosPagosCobros() {
		return isVisibilidadCeldaActualizarBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaActualizarBeneficiariosPagosCobros(Boolean isVisibilidadCeldaActualizarBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros = isVisibilidadCeldaActualizarBeneficiariosPagosCobros;
	}

	public Boolean getIsVisibilidadCeldaEliminarBeneficiariosPagosCobros() {
		return isVisibilidadCeldaEliminarBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaEliminarBeneficiariosPagosCobros(Boolean isVisibilidadCeldaEliminarBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros = isVisibilidadCeldaEliminarBeneficiariosPagosCobros;
	}

	public Boolean getIsVisibilidadCeldaCancelarBeneficiariosPagosCobros() {
		return isVisibilidadCeldaCancelarBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaCancelarBeneficiariosPagosCobros(Boolean isVisibilidadCeldaCancelarBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros = isVisibilidadCeldaCancelarBeneficiariosPagosCobros;
	}

	public Boolean getIsVisibilidadCeldaGuardarBeneficiariosPagosCobros() {
		return isVisibilidadCeldaGuardarBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaGuardarBeneficiariosPagosCobros(Boolean isVisibilidadCeldaGuardarBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros = isVisibilidadCeldaGuardarBeneficiariosPagosCobros;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros() {
		return isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros;
	}

	public void setIsVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros(Boolean isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros) {
		this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros = isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros;
	}
		
	public BeneficiariosPagosCobrosSessionBean getbeneficiariospagoscobrosSessionBean() {
		return this.beneficiariospagoscobrosSessionBean;
	}
	
	public void setbeneficiariospagoscobrosSessionBean(BeneficiariosPagosCobrosSessionBean beneficiariospagoscobrosSessionBean) {
		this.beneficiariospagoscobrosSessionBean=beneficiariospagoscobrosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaBeneficiariosPagosCobros() {
		return this.isVisibilidadBusquedaBeneficiariosPagosCobros;
	}

	public void setisVisibilidadBusquedaBeneficiariosPagosCobros(Boolean isVisibilidadBusquedaBeneficiariosPagosCobros) {
		this.isVisibilidadBusquedaBeneficiariosPagosCobros=isVisibilidadBusquedaBeneficiariosPagosCobros;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(beneficiariospagoscobros,null);
				this.setActualParaGuardarSucursalForeignKey(beneficiariospagoscobros,null);
				this.setActualParaGuardarEjercicioForeignKey(beneficiariospagoscobros,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(beneficiariospagoscobros,null);
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
	
	public void bugActualizarReferenciaActual(BeneficiariosPagosCobros beneficiariospagoscobros,BeneficiariosPagosCobros beneficiariospagoscobrosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalBeneficiariosPagosCobros(beneficiariospagoscobros);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		beneficiariospagoscobrosAux.setId(beneficiariospagoscobros.getId());
		beneficiariospagoscobrosAux.setVersionRow(beneficiariospagoscobros.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(BeneficiariosPagosCobros beneficiariospagoscobrosLocal) throws Exception {
		
		if(this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(BeneficiariosPagosCobros beneficiariospagoscobrosLocal) throws Exception {	
		if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				beneficiariospagoscobrosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				beneficiariospagoscobrosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				beneficiariospagoscobrosLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				beneficiariospagoscobrosLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarBeneficiariosPagosCobrosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = beneficiariospagoscobrosValidator.getInvalidValues(this.beneficiariospagoscobros);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(BeneficiariosPagosCobros beneficiariospagoscobros,List<BeneficiariosPagosCobros> beneficiariospagoscobross) throws Exception {
	}		
	
	public void actualizarSelectedLista(BeneficiariosPagosCobros beneficiariospagoscobros,List<BeneficiariosPagosCobros> beneficiariospagoscobross) throws Exception {
		try	{			
			BeneficiariosPagosCobrosConstantesFunciones.actualizarSelectedLista(beneficiariospagoscobros,beneficiariospagoscobross);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<BeneficiariosPagosCobros> beneficiariospagoscobrossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				beneficiariospagoscobrossLocal=this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				beneficiariospagoscobrossLocal=this.beneficiariospagoscobross;
			}
			//ARCHITECTURE
		
			for(BeneficiariosPagosCobros beneficiariospagoscobrosLocal:beneficiariospagoscobrossLocal) {
				if(this.permiteMantenimiento(beneficiariospagoscobrosLocal) && beneficiariospagoscobrosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.getBeneficiariosPagosCobrosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.CODIGOCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelcodigo_cuenta_contableBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.NOMBRECUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelnombre_cuenta_contableBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelnumero_mayorBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.NUMEROCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelnumero_chequeBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.BENEFICIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelbeneficiarioBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.DEBITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabeldebito_localBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.CREDITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelcredito_localBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabeldetalleBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.TIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabeltipo_movimientoBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelvalorBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.CUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelcuentaBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelfechaBeneficiariosPagosCobros,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BeneficiariosPagosCobrosConstantesFunciones.BENEFICIARIOASIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelbeneficiario_asientoBeneficiariosPagosCobros,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelcodigo_cuenta_contableBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelnombre_cuenta_contableBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelnumero_mayorBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelnumero_chequeBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelbeneficiarioBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabeldebito_localBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelcredito_localBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabeldetalleBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabeltipo_movimientoBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelvalorBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelcuentaBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelfechaBeneficiariosPagosCobros,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelbeneficiario_asientoBeneficiariosPagosCobros,"");
		
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
		this.iIdNuevoBeneficiariosPagosCobros--;	
		
		
		this.beneficiariospagoscobrosAux=new BeneficiariosPagosCobros();
		
		this.beneficiariospagoscobrosAux.setId(this.iIdNuevoBeneficiariosPagosCobros);
		this.beneficiariospagoscobrosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().add(this.beneficiariospagoscobrosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.beneficiariospagoscobross.add(this.beneficiariospagoscobrosAux);
		}
		//ARCHITECTURE
		
		this.beneficiariospagoscobros=this.beneficiariospagoscobrosAux;
		
		if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioBeneficiariosPagosCobros(this.beneficiariospagoscobros);
			this.setVariablesObjetoActualToFormularioForeignKeyBeneficiariosPagosCobros(this.beneficiariospagoscobros);
		}
				
		//this.setDefaultControlesBeneficiariosPagosCobros();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyBeneficiariosPagosCobros();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyBeneficiariosPagosCobros();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyBeneficiariosPagosCobros();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobrosBean,this.beneficiariospagoscobros,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanBeneficiariosPagosCobros(this.beneficiariospagoscobrosReturnGeneral,this.beneficiariospagoscobrosBean,false);
		
		if(this.beneficiariospagoscobrosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyBeneficiariosPagosCobros(this.beneficiariospagoscobrosReturnGeneral.getBeneficiariosPagosCobros());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioBeneficiariosPagosCobros(this.beneficiariospagoscobrosReturnGeneral.getBeneficiariosPagosCobros());
		}
		
		if(this.beneficiariospagoscobrosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioBeneficiariosPagosCobros(this.beneficiariospagoscobrosReturnGeneral.getBeneficiariosPagosCobros(),classes);//this.beneficiariospagoscobrosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyBeneficiariosPagosCobros();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyBeneficiariosPagosCobros();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.RecargarFormBeneficiariosPagosCobros(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
						
			if(beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBeneficiariosPagosCobros();
			}
			
			this.actualizarVisualTableDatosBeneficiariosPagosCobros();
			
			this.jTableDatosBeneficiariosPagosCobros.setRowSelectionInterval(this.getIndiceNuevoBeneficiariosPagosCobros(), this.getIndiceNuevoBeneficiariosPagosCobros());
			
			this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
						
			this.actualizarEstadoCeldasBotonesBeneficiariosPagosCobros("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesBeneficiariosPagosCobros(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfecha_desdeBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarfecha_desdeBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfecha_hastaBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarfecha_hastaBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarcodigo_cuenta_contableBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarnombre_cuenta_contableBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanumero_mayorBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarnumero_mayorBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldnumero_chequeBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarnumero_chequeBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiarioBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarbeneficiarioBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFielddebito_localBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activardebito_localBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcredito_localBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarcredito_localBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreadetalleBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activardetalleBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreatipo_movimientoBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activartipo_movimientoBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldvalorBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarvalorBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcuentaBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarcuentaBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfechaBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarfechaBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarbeneficiario_asientoBeneficiariosPagosCobros);	
		//
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarid_empresaBeneficiariosPagosCobros);//
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarid_sucursalBeneficiariosPagosCobros);//
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarid_ejercicioBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setEnabled(isHabilitar && this.beneficiariospagoscobrosConstantesFunciones.activarid_tipo_movimientoBeneficiariosPagosCobros);
	};
	
	public void setDefaultControlesBeneficiariosPagosCobros() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoBeneficiariosPagosCobros(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.beneficiariospagoscobrosSessionBean.setConGuardarRelaciones(true);			
			this.beneficiariospagoscobrosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTabbedPaneRelacionesBeneficiariosPagosCobros.setVisible(true);
			
					
		} else {
			//this.beneficiariospagoscobrosSessionBean.setConGuardarRelaciones(false);			
			this.beneficiariospagoscobrosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTabbedPaneRelacionesBeneficiariosPagosCobros.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoBeneficiariosPagosCobros() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
				if(beneficiariospagoscobrosAux.getId().equals(this.iIdNuevoBeneficiariosPagosCobros)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobross) {
				if(beneficiariospagoscobrosAux.getId().equals(this.iIdNuevoBeneficiariosPagosCobros)) {
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
	
	public int getIndiceActualBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
				if(beneficiariospagoscobrosAux.getId().equals(beneficiariospagoscobros.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobross) {
				if(beneficiariospagoscobrosAux.getId().equals(beneficiariospagoscobros.getId())) {
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
	
	public void setCamposBaseDesdeOriginalBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobrosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
				if(beneficiariospagoscobrosAux.getBeneficiariosPagosCobrosOriginal().getId().equals(beneficiariospagoscobrosOriginal.getId())) {
					existe=true;
					beneficiariospagoscobrosOriginal.setId(beneficiariospagoscobrosAux.getId());
					beneficiariospagoscobrosOriginal.setVersionRow(beneficiariospagoscobrosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobross) {
				if(beneficiariospagoscobrosAux.getBeneficiariosPagosCobrosOriginal().getId().equals(beneficiariospagoscobrosOriginal.getId())) {
					existe=true;
					beneficiariospagoscobrosOriginal.setId(beneficiariospagoscobrosAux.getId());
					beneficiariospagoscobrosOriginal.setVersionRow(beneficiariospagoscobrosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosBeneficiariosPagosCobros(Boolean esParaCancelar) throws Exception {
		beneficiariospagoscobrossAux=new ArrayList<BeneficiariosPagosCobros>();
		beneficiariospagoscobrosAux=new BeneficiariosPagosCobros();
		
		if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
					if(beneficiariospagoscobrosAux.getId()<0) {
						beneficiariospagoscobrossAux.add(beneficiariospagoscobrosAux);
					}		
				}
				this.iIdNuevoBeneficiariosPagosCobros=0L;
				this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().removeAll(beneficiariospagoscobrossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobross) {
					if(beneficiariospagoscobrosAux.getId()<0) {
						beneficiariospagoscobrossAux.add(beneficiariospagoscobrosAux);
					}		
				}
				this.iIdNuevoBeneficiariosPagosCobros=0L;
				this.beneficiariospagoscobross.removeAll(beneficiariospagoscobrossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoBeneficiariosPagosCobros 
					&& this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().size()>0
					) {
					beneficiariospagoscobrosAux=this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().get(this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().size() - 1);
				
					if(beneficiariospagoscobrosAux.getId()<0) {
						this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().remove(beneficiariospagoscobrosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoBeneficiariosPagosCobros && this.beneficiariospagoscobross.size()>0) {
					beneficiariospagoscobrosAux=this.beneficiariospagoscobross.get(this.beneficiariospagoscobross.size() - 1);
				
					if(beneficiariospagoscobrosAux.getId()<0) {
						this.beneficiariospagoscobross.remove(beneficiariospagoscobrosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoBeneficiariosPagosCobros(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(beneficiariospagoscobros.getId()<0) {
				this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().remove(this.beneficiariospagoscobros);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(beneficiariospagoscobros.getId()<0) {
				this.beneficiariospagoscobross.remove(this.beneficiariospagoscobros);
			}
		}			
	}
	
	public void setEstadosInicialesBeneficiariosPagosCobros(List<BeneficiariosPagosCobros> beneficiariospagoscobrossAux) throws Exception {
		BeneficiariosPagosCobrosConstantesFunciones.setEstadosInicialesBeneficiariosPagosCobros(beneficiariospagoscobrossAux);
	}
	
	public void setEstadosInicialesBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobrosAux) throws Exception {
		BeneficiariosPagosCobrosConstantesFunciones.setEstadosInicialesBeneficiariosPagosCobros(beneficiariospagoscobrosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarBeneficiariosPagosCobrosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesBeneficiariosPagosCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarBeneficiariosPagosCobrosActual()) {
				if(!this.isEsNuevoBeneficiariosPagosCobros) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesBeneficiariosPagosCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoBeneficiariosPagosCobros=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarBeneficiariosPagosCobrosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Beneficiarios Pagos Cobros ?", "MANTENIMIENTO DE Beneficiarios Pagos Cobros", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesBeneficiariosPagosCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(BeneficiariosPagosCobros beneficiariospagoscobros) throws Exception {
		BeneficiariosPagosCobrosConstantesFunciones.seleccionarAsignar(this.beneficiariospagoscobros,beneficiariospagoscobros);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarBeneficiariosPagosCobros=this.isPermisoActualizarOriginalBeneficiariosPagosCobros;
			
			
			this.seleccionarAsignar(beneficiariospagoscobros);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesBeneficiariosPagosCobros("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.beneficiariospagoscobrosSessionBean.setsFuncionBusquedaRapida(this.beneficiariospagoscobrosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoBeneficiariosPagosCobros) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosBeneficiariosPagosCobros(esParaCancelar);				
				this.cancelarNuevoBeneficiariosPagosCobros(esParaCancelar);								
			}
			
			this.beneficiariospagoscobros=new BeneficiariosPagosCobros();
			
			this.inicializarBeneficiariosPagosCobros();
			
			this.actualizarEstadoCeldasBotonesBeneficiariosPagosCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarBeneficiariosPagosCobros() throws Exception {
		try {
			BeneficiariosPagosCobrosConstantesFunciones.inicializarBeneficiariosPagosCobros(this.beneficiariospagoscobros);
			
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
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteBeneficiariosPagosCobross(String sAccionBusqueda,List<BeneficiariosPagosCobros> beneficiariospagoscobrossParaReportes) throws Exception {
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
					sPathReporteFinal="BeneficiariosPagosCobros"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="BeneficiariosPagosCobrosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("BeneficiariosPagosCobrosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="BeneficiariosPagosCobros"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Beneficiarios Pagos Cobroses");		
		parameters.put("busquedapor", BeneficiariosPagosCobrosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceBeneficiariosPagosCobros=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			BeneficiariosPagosCobrosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			BeneficiariosPagosCobrosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceBeneficiariosPagosCobros=new JRBeanArrayDataSource(BeneficiariosPagosCobrosJInternalFrame.TraerBeneficiariosPagosCobrosBeans(beneficiariospagoscobrossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceBeneficiariosPagosCobros);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+BeneficiariosPagosCobrosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(BeneficiariosPagosCobrosBean.TraerBeneficiariosPagosCobrosBeans(beneficiariospagoscobrossParaReportes).toArray()));
							
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
				this.generarExcelReporteBeneficiariosPagosCobross(sAccionBusqueda,sTipoArchivoReporte,beneficiariospagoscobrossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalBeneficiariosPagosCobross(sAccionBusqueda,sTipoArchivoReporte,beneficiariospagoscobrossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobrosActionPerformed(null);
					//this.generarExcelReporteBeneficiariosPagosCobross(sAccionBusqueda,sTipoArchivoReporte,beneficiariospagoscobrossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalBeneficiariosPagosCobross(sAccionBusqueda,sTipoArchivoReporte,beneficiariospagoscobrossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesBeneficiariosPagosCobross(sAccionBusqueda,sTipoArchivoReporte,beneficiariospagoscobrossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesBeneficiariosPagosCobross(sAccionBusqueda,sTipoArchivoReporte,beneficiariospagoscobrossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteBeneficiariosPagosCobross(String sAccionBusqueda,String sTipoArchivoReporte,List<BeneficiariosPagosCobros> beneficiariospagoscobrossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"beneficiariospagoscobros";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BeneficiariosPagosCobross");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBeneficiariosPagosCobros("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(BeneficiariosPagosCobros beneficiariospagoscobros : beneficiariospagoscobrossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			BeneficiariosPagosCobrosConstantesFunciones.generarExcelReporteDataBeneficiariosPagosCobros("NORMAL",row,workbook,beneficiariospagoscobros,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Beneficiarios Pagos Cobros",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderBeneficiariosPagosCobros(String sTipo,Row row,Workbook workbook) {
		
		BeneficiariosPagosCobrosConstantesFunciones.generarExcelReporteHeaderBeneficiariosPagosCobros(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalBeneficiariosPagosCobross(String sAccionBusqueda,String sTipoArchivoReporte,List<BeneficiariosPagosCobros> beneficiariospagoscobrossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"beneficiariospagoscobros_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BeneficiariosPagosCobross");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(BeneficiariosPagosCobros beneficiariospagoscobros : beneficiariospagoscobrossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.getBeneficiariosPagosCobrosDescripcion(beneficiariospagoscobros));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getcodigo_cuenta_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getnombre_cuenta_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getnumero_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getbeneficiario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getdebito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getcredito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getdetalle());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.gettipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getcuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(beneficiariospagoscobros.getbeneficiario_asiento());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Beneficiarios Pagos Cobros",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesBeneficiariosPagosCobross(String sAccionBusqueda,String sTipoArchivoReporte,List<BeneficiariosPagosCobros> beneficiariospagoscobrossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<BeneficiariosPagosCobros> beneficiariospagoscobrossRespaldo=null;
		
		classes=BeneficiariosPagosCobrosConstantesFunciones.getClassesRelationshipsOfBeneficiariosPagosCobros(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.beneficiariospagoscobrosLogic.setDatosCliente(this.datosCliente);
		this.beneficiariospagoscobrosLogic.setDatosDeep(this.datosDeep);
		this.beneficiariospagoscobrosLogic.setIsConDeep(true);
		
		beneficiariospagoscobrossRespaldo=this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross();
		
		this.beneficiariospagoscobrosLogic.setBeneficiariosPagosCobross(beneficiariospagoscobrossParaReportes);	
		this.beneficiariospagoscobrosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		beneficiariospagoscobrossParaReportes=this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross();
		this.beneficiariospagoscobrosLogic.setBeneficiariosPagosCobross(beneficiariospagoscobrossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"beneficiariospagoscobros_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BeneficiariosPagosCobross");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBeneficiariosPagosCobros("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(BeneficiariosPagosCobros beneficiariospagoscobros : beneficiariospagoscobrossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderBeneficiariosPagosCobros("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			BeneficiariosPagosCobrosConstantesFunciones.generarExcelReporteDataBeneficiariosPagosCobros("NORMAL",row,workbook,beneficiariospagoscobros,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.getBeneficiariosPagosCobrosDescripcion(beneficiariospagoscobros));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Beneficiarios Pagos Cobros",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessBeneficiariosPagosCobros() throws Exception {		
		this.startProcessBeneficiariosPagosCobros(true);
	}
	
	public void startProcessBeneficiariosPagosCobros(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasBeneficiariosPagosCobros ,this.jPanelParametrosReportesBeneficiariosPagosCobros, this.jScrollPanelDatosBeneficiariosPagosCobros,this.jPanelPaginacionBeneficiariosPagosCobros, this.jScrollPanelDatosEdicionBeneficiariosPagosCobros, this.jPanelAccionesBeneficiariosPagosCobros,this.jPanelAccionesFormularioBeneficiariosPagosCobros,this.jmenuBarBeneficiariosPagosCobros,this.jmenuBarDetalleBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,this.jTtoolBarDetalleBeneficiariosPagosCobros);		
		
		final JTabbedPane jTabbedPaneBusquedasBeneficiariosPagosCobros=this.jTabbedPaneBusquedasBeneficiariosPagosCobros; 
		
		final JPanel jPanelParametrosReportesBeneficiariosPagosCobros=this.jPanelParametrosReportesBeneficiariosPagosCobros;
		//final JScrollPane jScrollPanelDatosBeneficiariosPagosCobros=this.jScrollPanelDatosBeneficiariosPagosCobros;
		final JTable jTableDatosBeneficiariosPagosCobros=this.jTableDatosBeneficiariosPagosCobros;		
		final JPanel jPanelPaginacionBeneficiariosPagosCobros=this.jPanelPaginacionBeneficiariosPagosCobros;
		//final JScrollPane jScrollPanelDatosEdicionBeneficiariosPagosCobros=this.jScrollPanelDatosEdicionBeneficiariosPagosCobros;
		final JPanel jPanelAccionesBeneficiariosPagosCobros=this.jPanelAccionesBeneficiariosPagosCobros;
		
		JPanel jPanelCamposAuxiliarBeneficiariosPagosCobros=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarBeneficiariosPagosCobros=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			jPanelCamposAuxiliarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelCamposBeneficiariosPagosCobros;
			jPanelAccionesFormularioAuxiliarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelAccionesFormularioBeneficiariosPagosCobros;
		}
		
		final JPanel jPanelCamposBeneficiariosPagosCobros=jPanelCamposAuxiliarBeneficiariosPagosCobros;
		final JPanel jPanelAccionesFormularioBeneficiariosPagosCobros=jPanelAccionesFormularioAuxiliarBeneficiariosPagosCobros;
		
		
		final JMenuBar jmenuBarBeneficiariosPagosCobros=this.jmenuBarBeneficiariosPagosCobros;
		final JToolBar jTtoolBarBeneficiariosPagosCobros=this.jTtoolBarBeneficiariosPagosCobros;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarBeneficiariosPagosCobros=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBeneficiariosPagosCobros=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			jmenuBarDetalleAuxiliarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jmenuBarDetalleBeneficiariosPagosCobros;
			jTtoolBarDetalleAuxiliarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTtoolBarDetalleBeneficiariosPagosCobros;
		}
		
		final JMenuBar jmenuBarDetalleBeneficiariosPagosCobros=jmenuBarDetalleAuxiliarBeneficiariosPagosCobros;
		final JToolBar jTtoolBarDetalleBeneficiariosPagosCobros=jTtoolBarDetalleAuxiliarBeneficiariosPagosCobros;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBeneficiariosPagosCobros;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBeneficiariosPagosCobros;
			processRunnable.jTableDatos=jTableDatosBeneficiariosPagosCobros;
			processRunnable.jPanelCampos=jPanelCamposBeneficiariosPagosCobros;
			processRunnable.jPanelPaginacion=jPanelPaginacionBeneficiariosPagosCobros;
			processRunnable.jPanelAcciones=jPanelAccionesBeneficiariosPagosCobros;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBeneficiariosPagosCobros;
			
			
			processRunnable.jmenuBar=jmenuBarBeneficiariosPagosCobros;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBeneficiariosPagosCobros;
			processRunnable.jTtoolBar=jTtoolBarBeneficiariosPagosCobros;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBeneficiariosPagosCobros;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBeneficiariosPagosCobros ,jPanelParametrosReportesBeneficiariosPagosCobros,jTableDatosBeneficiariosPagosCobros, /*jScrollPanelDatosBeneficiariosPagosCobros,*/jPanelCamposBeneficiariosPagosCobros,jPanelPaginacionBeneficiariosPagosCobros, /*jScrollPanelDatosEdicionBeneficiariosPagosCobros,*/ jPanelAccionesBeneficiariosPagosCobros,jPanelAccionesFormularioBeneficiariosPagosCobros,jmenuBarBeneficiariosPagosCobros,jmenuBarDetalleBeneficiariosPagosCobros,jTtoolBarBeneficiariosPagosCobros,jTtoolBarDetalleBeneficiariosPagosCobros);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBeneficiariosPagosCobros ,jPanelParametrosReportesBeneficiariosPagosCobros, jScrollPanelDatosBeneficiariosPagosCobros,jPanelPaginacionBeneficiariosPagosCobros, jScrollPanelDatosEdicionBeneficiariosPagosCobros, jPanelAccionesBeneficiariosPagosCobros,jPanelAccionesFormularioBeneficiariosPagosCobros,jmenuBarBeneficiariosPagosCobros,jmenuBarDetalleBeneficiariosPagosCobros,jTtoolBarBeneficiariosPagosCobros,jTtoolBarDetalleBeneficiariosPagosCobros);
						
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
	
	public void finishProcessBeneficiariosPagosCobros() {// throws Exception 
		this.finishProcessBeneficiariosPagosCobros(true);
	}
	
	public void finishProcessBeneficiariosPagosCobros(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasBeneficiariosPagosCobros ,this.jPanelParametrosReportesBeneficiariosPagosCobros, this.jScrollPanelDatosBeneficiariosPagosCobros,this.jPanelPaginacionBeneficiariosPagosCobros, this.jScrollPanelDatosEdicionBeneficiariosPagosCobros, this.jPanelAccionesBeneficiariosPagosCobros,this.jPanelAccionesFormularioBeneficiariosPagosCobros,this.jmenuBarBeneficiariosPagosCobros,this.jmenuBarDetalleBeneficiariosPagosCobros,this.jTtoolBarBeneficiariosPagosCobros,this.jTtoolBarDetalleBeneficiariosPagosCobros);		
		
		final JTabbedPane jTabbedPaneBusquedasBeneficiariosPagosCobros=this.jTabbedPaneBusquedasBeneficiariosPagosCobros; 
		
		final JPanel jPanelParametrosReportesBeneficiariosPagosCobros=this.jPanelParametrosReportesBeneficiariosPagosCobros;
		//final JScrollPane jScrollPanelDatosBeneficiariosPagosCobros=this.jScrollPanelDatosBeneficiariosPagosCobros;
		final JTable jTableDatosBeneficiariosPagosCobros=this.jTableDatosBeneficiariosPagosCobros;		
		final JPanel jPanelPaginacionBeneficiariosPagosCobros=this.jPanelPaginacionBeneficiariosPagosCobros;
		//final JScrollPane jScrollPanelDatosEdicionBeneficiariosPagosCobros=this.jScrollPanelDatosEdicionBeneficiariosPagosCobros;
		final JPanel jPanelAccionesBeneficiariosPagosCobros=this.jPanelAccionesBeneficiariosPagosCobros;
		
		JPanel jPanelCamposAuxiliarBeneficiariosPagosCobros=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarBeneficiariosPagosCobros=new JPanel();
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			jPanelCamposAuxiliarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelCamposBeneficiariosPagosCobros;
			jPanelAccionesFormularioAuxiliarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelAccionesFormularioBeneficiariosPagosCobros;
		}
		
		final JPanel jPanelCamposBeneficiariosPagosCobros=jPanelCamposAuxiliarBeneficiariosPagosCobros;
		final JPanel jPanelAccionesFormularioBeneficiariosPagosCobros=jPanelAccionesFormularioAuxiliarBeneficiariosPagosCobros;
		
		
		final JMenuBar jmenuBarBeneficiariosPagosCobros=this.jmenuBarBeneficiariosPagosCobros;		
		final JToolBar jTtoolBarBeneficiariosPagosCobros=this.jTtoolBarBeneficiariosPagosCobros;
				
		JMenuBar jmenuBarDetalleAuxiliarBeneficiariosPagosCobros=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBeneficiariosPagosCobros=new JToolBar();
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			jmenuBarDetalleAuxiliarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jmenuBarDetalleBeneficiariosPagosCobros;
			jTtoolBarDetalleAuxiliarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTtoolBarDetalleBeneficiariosPagosCobros;		
		}
		
		final JMenuBar jmenuBarDetalleBeneficiariosPagosCobros=jmenuBarDetalleAuxiliarBeneficiariosPagosCobros;
		final JToolBar jTtoolBarDetalleBeneficiariosPagosCobros=jTtoolBarDetalleAuxiliarBeneficiariosPagosCobros;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBeneficiariosPagosCobros;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBeneficiariosPagosCobros;
			processRunnable.jTableDatos=jTableDatosBeneficiariosPagosCobros;
			processRunnable.jPanelCampos=jPanelCamposBeneficiariosPagosCobros;
			processRunnable.jPanelPaginacion=jPanelPaginacionBeneficiariosPagosCobros;
			processRunnable.jPanelAcciones=jPanelAccionesBeneficiariosPagosCobros;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBeneficiariosPagosCobros;
			
			
			processRunnable.jmenuBar=jmenuBarBeneficiariosPagosCobros;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBeneficiariosPagosCobros;
			processRunnable.jTtoolBar=jTtoolBarBeneficiariosPagosCobros;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBeneficiariosPagosCobros;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasBeneficiariosPagosCobros ,jPanelParametrosReportesBeneficiariosPagosCobros, jTableDatosBeneficiariosPagosCobros,/*jScrollPanelDatosBeneficiariosPagosCobros,*/jPanelCamposBeneficiariosPagosCobros,jPanelPaginacionBeneficiariosPagosCobros, /*jScrollPanelDatosEdicionBeneficiariosPagosCobros,*/ jPanelAccionesBeneficiariosPagosCobros,jPanelAccionesFormularioBeneficiariosPagosCobros,jmenuBarBeneficiariosPagosCobros,jmenuBarDetalleBeneficiariosPagosCobros,jTtoolBarBeneficiariosPagosCobros,jTtoolBarDetalleBeneficiariosPagosCobros));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesBeneficiariosPagosCobros(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarBeneficiariosPagosCobros(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuBeneficiariosPagosCobros(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarBeneficiariosPagosCobros(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarBeneficiariosPagosCobros,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleBeneficiariosPagosCobros,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuBeneficiariosPagosCobros(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarBeneficiariosPagosCobros,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleBeneficiariosPagosCobros,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.beneficiariospagoscobrosConstantesFunciones.getsFinalQueryBeneficiariosPagosCobros();
		String  finalQueryPaginacionTodos=this.beneficiariospagoscobrosConstantesFunciones.getsFinalQueryBeneficiariosPagosCobros();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=BeneficiariosPagosCobrosConstantesFunciones.getArrayColumnasGlobalesNoBeneficiariosPagosCobros(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=BeneficiariosPagosCobrosConstantesFunciones.getArrayColumnasGlobalesBeneficiariosPagosCobros(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,BeneficiariosPagosCobrosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.beneficiariospagoscobrossEliminados= new ArrayList<BeneficiariosPagosCobros>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessBeneficiariosPagosCobros();
		
				///*BeneficiariosPagosCobrosSessionBean*/this.beneficiariospagoscobrosSessionBean=new BeneficiariosPagosCobrosSessionBean();
			
			if(this.beneficiariospagoscobrosSessionBean==null) {
				this.beneficiariospagoscobrosSessionBean=new BeneficiariosPagosCobrosSessionBean();
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
					this.iNumeroPaginacion=BeneficiariosPagosCobrosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=BeneficiariosPagosCobrosConstantesFunciones.getClassesForeignKeysOfBeneficiariosPagosCobros(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/beneficiariospagoscobros."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			beneficiariospagoscobrossAux= new ArrayList<BeneficiariosPagosCobros>();
			
				
			beneficiariospagoscobrosLogic.setDatosCliente(this.datosCliente);
			beneficiariospagoscobrosLogic.setDatosDeep(this.datosDeep);
			beneficiariospagoscobrosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaBeneficiariosPagosCobros")) {
				this.sDetalleReporte=BeneficiariosPagosCobrosConstantesFunciones.getDetalleIndiceBusquedaBeneficiariosPagosCobros(id_ejercicioBusquedaBeneficiariosPagosCobros,id_tipo_movimientoBusquedaBeneficiariosPagosCobros,fecha_desdeBusquedaBeneficiariosPagosCobros,fecha_hastaBusquedaBeneficiariosPagosCobros);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					beneficiariospagoscobrosLogic.getBeneficiariosPagosCobrossBusquedaBeneficiariosPagosCobros(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaBeneficiariosPagosCobros,id_tipo_movimientoBusquedaBeneficiariosPagosCobros,fecha_desdeBusquedaBeneficiariosPagosCobros,fecha_hastaBusquedaBeneficiariosPagosCobros);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BeneficiariosPagosCobrosConstantesFunciones.getDetalleIndiceBusquedaBeneficiariosPagosCobros(id_ejercicioBusquedaBeneficiariosPagosCobros,id_tipo_movimientoBusquedaBeneficiariosPagosCobros,fecha_desdeBusquedaBeneficiariosPagosCobros,fecha_hastaBusquedaBeneficiariosPagosCobros);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BeneficiariosPagosCobrosConstantesFunciones.getDetalleIndiceBusquedaBeneficiariosPagosCobros(id_ejercicioBusquedaBeneficiariosPagosCobros,id_tipo_movimientoBusquedaBeneficiariosPagosCobros,fecha_desdeBusquedaBeneficiariosPagosCobros,fecha_hastaBusquedaBeneficiariosPagosCobros);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()==null||beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=beneficiariospagoscobross==null|| beneficiariospagoscobross.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						beneficiariospagoscobrossAux=new ArrayList<BeneficiariosPagosCobros>();
						beneficiariospagoscobrossAux.addAll(beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							beneficiariospagoscobrossAux=new ArrayList<BeneficiariosPagosCobros>();
							beneficiariospagoscobrossAux.addAll(beneficiariospagoscobross);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							beneficiariospagoscobrosLogic.getBeneficiariosPagosCobrossBusquedaBeneficiariosPagosCobros(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaBeneficiariosPagosCobros,id_tipo_movimientoBusquedaBeneficiariosPagosCobros,fecha_desdeBusquedaBeneficiariosPagosCobros,fecha_hastaBusquedaBeneficiariosPagosCobros);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BeneficiariosPagosCobrosConstantesFunciones.getDetalleIndiceBusquedaBeneficiariosPagosCobros(id_ejercicioBusquedaBeneficiariosPagosCobros,id_tipo_movimientoBusquedaBeneficiariosPagosCobros,fecha_desdeBusquedaBeneficiariosPagosCobros,fecha_hastaBusquedaBeneficiariosPagosCobros);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BeneficiariosPagosCobrosConstantesFunciones.getDetalleIndiceBusquedaBeneficiariosPagosCobros(id_ejercicioBusquedaBeneficiariosPagosCobros,id_tipo_movimientoBusquedaBeneficiariosPagosCobros,fecha_desdeBusquedaBeneficiariosPagosCobros,fecha_hastaBusquedaBeneficiariosPagosCobros);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBeneficiariosPagosCobross("BusquedaBeneficiariosPagosCobros",beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBeneficiariosPagosCobross("BusquedaBeneficiariosPagosCobros",beneficiariospagoscobross);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						beneficiariospagoscobrosLogic.setBeneficiariosPagosCobross(new ArrayList<BeneficiariosPagosCobros>());
						beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().addAll(beneficiariospagoscobrossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							beneficiariospagoscobross=new ArrayList<BeneficiariosPagosCobros>();
							beneficiariospagoscobross.addAll(beneficiariospagoscobrossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesBeneficiariosPagosCobros();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessBeneficiariosPagosCobros();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=beneficiariospagoscobross.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=beneficiariospagoscobross.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(BeneficiariosPagosCobros beneficiariospagoscobros) {
		Boolean permite=true;
		
		if(this.beneficiariospagoscobros.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=BeneficiariosPagosCobrosConstantesFunciones.getOrderByListaBeneficiariosPagosCobros();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=BeneficiariosPagosCobrosConstantesFunciones.getOrderByListaBeneficiariosPagosCobros();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
				if(beneficiariospagoscobros.getsType().equals(Constantes2.S_TOTALES)) {
					beneficiariospagoscobrosTotales=beneficiariospagoscobros;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BeneficiariosPagosCobros beneficiariospagoscobros:this.beneficiariospagoscobross) {
				if(beneficiariospagoscobros.getsType().equals(Constantes2.S_TOTALES)) {
					beneficiariospagoscobrosTotales=beneficiariospagoscobros;
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
			this.beneficiariospagoscobrosAux=new BeneficiariosPagosCobros();
			this.beneficiariospagoscobrosAux.setsType(Constantes2.S_TOTALES);
			this.beneficiariospagoscobrosAux.setIsNew(false);
			this.beneficiariospagoscobrosAux.setIsChanged(false);
			this.beneficiariospagoscobrosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//BeneficiariosPagosCobrosConstantesFunciones.TotalizarValoresFilaBeneficiariosPagosCobros(this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross(),this.beneficiariospagoscobrosAux);
				
				//this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().add(this.beneficiariospagoscobrosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				BeneficiariosPagosCobrosConstantesFunciones.TotalizarValoresFilaBeneficiariosPagosCobros(this.beneficiariospagoscobross,this.beneficiariospagoscobrosAux);
				
				this.beneficiariospagoscobross.add(this.beneficiariospagoscobrosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		beneficiariospagoscobrosTotales=new BeneficiariosPagosCobros();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().remove(beneficiariospagoscobrosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.beneficiariospagoscobross.remove(beneficiariospagoscobrosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		beneficiariospagoscobrosTotales=new BeneficiariosPagosCobros();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
				if(beneficiariospagoscobros.getsType().equals(Constantes2.S_TOTALES)) {
					beneficiariospagoscobrosTotales=beneficiariospagoscobros;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BeneficiariosPagosCobrosConstantesFunciones.TotalizarValoresFilaBeneficiariosPagosCobros(this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross(),beneficiariospagoscobrosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BeneficiariosPagosCobros beneficiariospagoscobros:this.beneficiariospagoscobross) {
				if(beneficiariospagoscobros.getsType().equals(Constantes2.S_TOTALES)) {
					beneficiariospagoscobrosTotales=beneficiariospagoscobros;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BeneficiariosPagosCobrosConstantesFunciones.TotalizarValoresFilaBeneficiariosPagosCobros(this.beneficiariospagoscobross,beneficiariospagoscobrosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getBeneficiariosPagosCobrossBusquedaBeneficiariosPagosCobros()throws Exception {
		try {
			sAccionBusqueda="BusquedaBeneficiariosPagosCobros";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBeneficiariosPagosCobrossFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBeneficiariosPagosCobrossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBeneficiariosPagosCobrossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBeneficiariosPagosCobrossFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getBeneficiariosPagosCobrossBusquedaBeneficiariosPagosCobros(String sFinalQuery,Long id_ejercicio,Long id_tipo_movimiento,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//beneficiariospagoscobrosLogic.getBeneficiariosPagosCobrossBusquedaBeneficiariosPagosCobros(sFinalQuery,this.pagination,id_ejercicio,id_tipo_movimiento,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBeneficiariosPagosCobrossFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//beneficiariospagoscobrosLogic.getBeneficiariosPagosCobrossFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBeneficiariosPagosCobrossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//beneficiariospagoscobrosLogic.getBeneficiariosPagosCobrossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBeneficiariosPagosCobrossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//beneficiariospagoscobrosLogic.getBeneficiariosPagosCobrossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBeneficiariosPagosCobrossFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//beneficiariospagoscobrosLogic.getBeneficiariosPagosCobrossFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosBeneficiariosPagosCobros() {
		this.isPermisoTodoBeneficiariosPagosCobros=false;
		this.isPermisoNuevoBeneficiariosPagosCobros=false;
		this.isPermisoActualizarBeneficiariosPagosCobros=false;
		this.isPermisoActualizarOriginalBeneficiariosPagosCobros=false;
		this.isPermisoEliminarBeneficiariosPagosCobros=false;
		this.isPermisoGuardarCambiosBeneficiariosPagosCobros=false;
		this.isPermisoConsultaBeneficiariosPagosCobros=true;
		this.isPermisoBusquedaBeneficiariosPagosCobros=true;
		this.isPermisoReporteBeneficiariosPagosCobros=true;
		this.isPermisoOrdenBeneficiariosPagosCobros=false;		
		this.isPermisoPaginacionMedioBeneficiariosPagosCobros=false;		
		this.isPermisoPaginacionAltoBeneficiariosPagosCobros=false;		
		this.isPermisoPaginacionTodoBeneficiariosPagosCobros=false;		
		this.isPermisoCopiarBeneficiariosPagosCobros=false;		
		this.isPermisoVerFormBeneficiariosPagosCobros=false;		
		this.isPermisoDuplicarBeneficiariosPagosCobros=false;
		this.isPermisoOrdenBeneficiariosPagosCobros=false;
	}
	
	public void setPermisosUsuarioBeneficiariosPagosCobros(Boolean isPermiso) {
		this.isPermisoTodoBeneficiariosPagosCobros=isPermiso;
		this.isPermisoNuevoBeneficiariosPagosCobros=isPermiso;
		this.isPermisoActualizarBeneficiariosPagosCobros=isPermiso;
		this.isPermisoActualizarOriginalBeneficiariosPagosCobros=isPermiso;
		this.isPermisoEliminarBeneficiariosPagosCobros=isPermiso;
		this.isPermisoGuardarCambiosBeneficiariosPagosCobros=isPermiso;
		this.isPermisoConsultaBeneficiariosPagosCobros=isPermiso;
		this.isPermisoBusquedaBeneficiariosPagosCobros=isPermiso;
		this.isPermisoReporteBeneficiariosPagosCobros=isPermiso;
		this.isPermisoOrdenBeneficiariosPagosCobros=isPermiso;		
		this.isPermisoPaginacionMedioBeneficiariosPagosCobros=isPermiso;		
		this.isPermisoPaginacionAltoBeneficiariosPagosCobros=isPermiso;		
		this.isPermisoPaginacionTodoBeneficiariosPagosCobros=isPermiso;		
		this.isPermisoCopiarBeneficiariosPagosCobros=isPermiso;		
		this.isPermisoVerFormBeneficiariosPagosCobros=isPermiso;		
		this.isPermisoDuplicarBeneficiariosPagosCobros=isPermiso;
		this.isPermisoOrdenBeneficiariosPagosCobros=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioBeneficiariosPagosCobros(Boolean isPermiso) {
		//this.isPermisoTodoBeneficiariosPagosCobros=isPermiso;
		this.isPermisoNuevoBeneficiariosPagosCobros=isPermiso;
		this.isPermisoActualizarBeneficiariosPagosCobros=isPermiso;
		this.isPermisoActualizarOriginalBeneficiariosPagosCobros=isPermiso;
		this.isPermisoEliminarBeneficiariosPagosCobros=isPermiso;
		this.isPermisoGuardarCambiosBeneficiariosPagosCobros=isPermiso;
		//this.isPermisoConsultaBeneficiariosPagosCobros=isPermiso;
		//this.isPermisoBusquedaBeneficiariosPagosCobros=isPermiso;
		//this.isPermisoReporteBeneficiariosPagosCobros=isPermiso;
		//this.isPermisoOrdenBeneficiariosPagosCobros=isPermiso;		
		//this.isPermisoPaginacionMedioBeneficiariosPagosCobros=isPermiso;		
		//this.isPermisoPaginacionAltoBeneficiariosPagosCobros=isPermiso;		
		//this.isPermisoPaginacionTodoBeneficiariosPagosCobros=isPermiso;		
		//this.isPermisoCopiarBeneficiariosPagosCobros=isPermiso;		
		//this.isPermisoDuplicarBeneficiariosPagosCobros=isPermiso;
		//this.isPermisoOrdenBeneficiariosPagosCobros=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioBeneficiariosPagosCobrosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(BeneficiariosPagosCobrosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebBeneficiariosPagosCobros(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioBeneficiariosPagosCobrosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioBeneficiariosPagosCobrosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionBeneficiariosPagosCobrosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioBeneficiariosPagosCobrosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioBeneficiariosPagosCobros() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(BeneficiariosPagosCobrosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, BeneficiariosPagosCobrosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoBeneficiariosPagosCobros=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarBeneficiariosPagosCobros=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalBeneficiariosPagosCobros=this.isPermisoActualizarBeneficiariosPagosCobros;
			this.isPermisoEliminarBeneficiariosPagosCobros=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosBeneficiariosPagosCobros=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaBeneficiariosPagosCobros=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaBeneficiariosPagosCobros=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoBeneficiariosPagosCobros=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteBeneficiariosPagosCobros=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBeneficiariosPagosCobros=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioBeneficiariosPagosCobros=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoBeneficiariosPagosCobros=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoBeneficiariosPagosCobros=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarBeneficiariosPagosCobros=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormBeneficiariosPagosCobros=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarBeneficiariosPagosCobros=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBeneficiariosPagosCobros=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosBeneficiariosPagosCobros.setToolTipText(this.jTableDatosBeneficiariosPagosCobros.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioBeneficiariosPagosCobros(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioBeneficiariosPagosCobros(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(BeneficiariosPagosCobrosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(BeneficiariosPagosCobrosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioBeneficiariosPagosCobros() throws Exception {
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
	public void inicializarCombosForeignKeyBeneficiariosPagosCobrosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyBeneficiariosPagosCobrosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(BeneficiariosPagosCobrosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoMovimientoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMovimientoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyBeneficiariosPagosCobros()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.beneficiariospagoscobrosSessionBean==null) {
				this.beneficiariospagoscobrosSessionBean=new BeneficiariosPagosCobrosSessionBean();
			}

			if(!this.beneficiariospagoscobrosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.beneficiariospagoscobrosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.beneficiariospagoscobrosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.beneficiariospagoscobrosSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				TipoMovimiento tipomovimiento=new TipoMovimiento();
				TipoMovimientoConstantesFunciones.setTipoMovimientoDescripcion(tipomovimiento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomovimiento.setId(null);

				if(!TipoMovimientoConstantesFunciones.ExisteEnLista(this.tipomovimientosForeignKey,tipomovimiento,true)) {

					this.tipomovimientosForeignKey.add(0,tipomovimiento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyBeneficiariosPagosCobros()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyBeneficiariosPagosCobros(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyBeneficiariosPagosCobros()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyBeneficiariosPagosCobros();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyBeneficiariosPagosCobros()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyBeneficiariosPagosCobros()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyBeneficiariosPagosCobros()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyBeneficiariosPagosCobros()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroBeneficiariosPagosCobros()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyBeneficiariosPagosCobros()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyBeneficiariosPagosCobros(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyBeneficiariosPagosCobros()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.getItemCount()>0) {
				this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.getItemCount()>0) {
				this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.getItemCount()>0) {
				this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.getItemCount()>0) {
				this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public BeneficiariosPagosCobrosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public BeneficiariosPagosCobrosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public BeneficiariosPagosCobrosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.beneficiariospagoscobrosSessionBean=new BeneficiariosPagosCobrosSessionBean(); 
		this.beneficiariospagoscobrosConstantesFunciones=new BeneficiariosPagosCobrosConstantesFunciones(); 
		this.beneficiariospagoscobrosBean=new BeneficiariosPagosCobros();//(this.beneficiariospagoscobrosConstantesFunciones); 		
		this.beneficiariospagoscobrosReturnGeneral=new BeneficiariosPagosCobrosParameterReturnGeneral(); 
		
		this.beneficiariospagoscobrosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.beneficiariospagoscobrosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public BeneficiariosPagosCobrosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public BeneficiariosPagosCobrosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public BeneficiariosPagosCobrosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessBeneficiariosPagosCobros(true);
			
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
			
			this.beneficiariospagoscobrosConstantesFunciones=new BeneficiariosPagosCobrosConstantesFunciones(); 
			this.beneficiariospagoscobrosBean=new BeneficiariosPagosCobros();//this.beneficiariospagoscobrosConstantesFunciones); 			
			this.beneficiariospagoscobrosReturnGeneral=new BeneficiariosPagosCobrosParameterReturnGeneral(); 
		
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Beneficiarios Pagos Cobros Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.beneficiariospagoscobros=new BeneficiariosPagosCobros();
			this.beneficiariospagoscobross = new ArrayList<BeneficiariosPagosCobros>();
			this.beneficiariospagoscobrossAux = new ArrayList<BeneficiariosPagosCobros>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic=new BeneficiariosPagosCobrosLogic();
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}
			
			//this.beneficiariospagoscobrosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.beneficiariospagoscobrosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormBeneficiariosPagosCobros);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros);	
					}
					
					if(this.jInternalFrameImportacionBeneficiariosPagosCobros!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBeneficiariosPagosCobros);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByBeneficiariosPagosCobros!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByBeneficiariosPagosCobros);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormBeneficiariosPagosCobros);
				this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setVisible(false);
				this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros);
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setVisible(false);
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionBeneficiariosPagosCobros!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionBeneficiariosPagosCobros);
					this.jInternalFrameImportacionBeneficiariosPagosCobros.setVisible(false);
					this.jInternalFrameImportacionBeneficiariosPagosCobros.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByBeneficiariosPagosCobros!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByBeneficiariosPagosCobros);
					this.jInternalFrameOrderByBeneficiariosPagosCobros.setVisible(false);
					this.jInternalFrameOrderByBeneficiariosPagosCobros.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idBeneficiariosPagosCobrosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=BeneficiariosPagosCobrosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.beneficiariospagoscobrosReturnGeneral=new BeneficiariosPagosCobrosParameterReturnGeneral();
			
			this.beneficiariospagoscobrosParameterGeneral=new BeneficiariosPagosCobrosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.beneficiariospagoscobrosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(BeneficiariosPagosCobrosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BeneficiariosPagosCobrosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado(),this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BeneficiariosPagosCobrosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado(),this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaDuplicarBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaCopiarBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaVerFormBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaOrdenBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaModificarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=false;
			
			
			this.isVisibilidadBusquedaBeneficiariosPagosCobros=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesBeneficiariosPagosCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosBeneficiariosPagosCobros();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioBeneficiariosPagosCobros(false);
			
			this.setPermisosUsuarioBeneficiariosPagosCobros();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() 
				|| (this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado() && this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioBeneficiariosPagosCobrosClasesRelacionadas();
			}
			
			if(this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioBeneficiariosPagosCobrosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosBeneficiariosPagosCobros();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualBeneficiariosPagosCobros();
			}
			
			if(!this.isPermisoBusquedaBeneficiariosPagosCobros) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(BeneficiariosPagosCobrosConstantesFunciones.getTiposSeleccionarBeneficiariosPagosCobros());
				
				this.tiposColumnasSelect=BeneficiariosPagosCobrosConstantesFunciones.getTiposSeleccionarBeneficiariosPagosCobros(true);
				
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
			//if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioBeneficiariosPagosCobros();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioBeneficiariosPagosCobros(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioBeneficiariosPagosCobros(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesBeneficiariosPagosCobros() ;
			
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
			this.tipomovimientoLogic=new TipoMovimientoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				beneficiariospagoscobrosImplementable= (BeneficiariosPagosCobrosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BeneficiariosPagosCobrosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				beneficiariospagoscobrosImplementableHome= (BeneficiariosPagosCobrosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BeneficiariosPagosCobrosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.beneficiariospagoscobross= new ArrayList<BeneficiariosPagosCobros>();
			this.beneficiariospagoscobrossEliminados= new ArrayList<BeneficiariosPagosCobros>();
						
			this.isEsNuevoBeneficiariosPagosCobros=false;
			this.esParaAccionDesdeFormularioBeneficiariosPagosCobros=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyBeneficiariosPagosCobros(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroBeneficiariosPagosCobros();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=BeneficiariosPagosCobrosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesBeneficiariosPagosCobros("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingBeneficiariosPagosCobros(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioBeneficiariosPagosCobros();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioBeneficiariosPagosCobros();
			}
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasBeneficiariosPagosCobros.getTabCount(); i++) {
					this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessBeneficiariosPagosCobros(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga BeneficiariosPagosCobros: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectBeneficiariosPagosCobros() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesBeneficiariosPagosCobros")) {
				iIndex=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTabbedPaneRelacionesBeneficiariosPagosCobros.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTabbedPaneRelacionesBeneficiariosPagosCobros.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessBeneficiariosPagosCobros();	
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
	
	public void cargarCombosForeignKeyBeneficiariosPagosCobros(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyBeneficiariosPagosCobros(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyBeneficiariosPagosCobros(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyBeneficiariosPagosCobrosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyBeneficiariosPagosCobros();
		
		this.cargarCombosFrameForeignKeyBeneficiariosPagosCobros();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyBeneficiariosPagosCobros();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyBeneficiariosPagosCobros();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoMovimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMovimiento(this.tipomovimientosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoBeneficiariosPagosCobrosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
			
			if(jTableDatosBeneficiariosPagosCobros.getRowCount()>=1) {
				jTableDatosBeneficiariosPagosCobros.removeRowSelectionInterval(0, jTableDatosBeneficiariosPagosCobros.getRowCount()-1);						
			}
			
			this.isEsNuevoBeneficiariosPagosCobros=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoBeneficiariosPagosCobros(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesBeneficiariosPagosCobros(true);			
			//this.beneficiariospagoscobros=new BeneficiariosPagosCobros();
			//this.beneficiariospagoscobros.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBeneficiariosPagosCobros(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBeneficiariosPagosCobros() ;
			
			if(BeneficiariosPagosCobrosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBeneficiariosPagosCobros(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.beneficiariospagoscobros);	
			this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);				
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
			if(this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar BeneficiariosPagosCobros: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarBeneficiariosPagosCobrosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosBeneficiariosPagosCobros.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosBeneficiariosPagosCobros.getSelectedRows().length;			
			}
			
			beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoBeneficiariosPagosCobros--;			
				//BeneficiariosPagosCobros beneficiariospagoscobrosAux= new BeneficiariosPagosCobros();			
				//beneficiariospagoscobrosAux.setId(this.iIdNuevoBeneficiariosPagosCobros);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//BeneficiariosPagosCobros beneficiariospagoscobrosOrigen=new BeneficiariosPagosCobros();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(BeneficiariosPagosCobros beneficiariospagoscobrosOrigen : beneficiariospagoscobrossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							beneficiariospagoscobrosOrigen =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							beneficiariospagoscobrosOrigen =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaBeneficiariosPagosCobros();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.beneficiariospagoscobros.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosBeneficiariosPagosCobros(beneficiariospagoscobrosOrigen,this.beneficiariospagoscobros,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().add(this.beneficiariospagoscobrosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobross.add(this.beneficiariospagoscobrosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
				
				this.jTableDatosBeneficiariosPagosCobros.setRowSelectionInterval(this.getIndiceNuevoBeneficiariosPagosCobros(), this.getIndiceNuevoBeneficiariosPagosCobros());
				
				int iLastRow =  this.jTableDatosBeneficiariosPagosCobros.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBeneficiariosPagosCobros.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBeneficiariosPagosCobros.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();									
		
			BeneficiariosPagosCobros beneficiariospagoscobrosOrigen=new BeneficiariosPagosCobros();
			BeneficiariosPagosCobros beneficiariospagoscobrosDestino=new BeneficiariosPagosCobros();
				
			beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosBeneficiariosPagosCobros.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || beneficiariospagoscobrossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosBeneficiariosPagosCobros.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						beneficiariospagoscobrosOrigen =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						beneficiariospagoscobrosOrigen =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						beneficiariospagoscobrosDestino =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						beneficiariospagoscobrosDestino =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				beneficiariospagoscobrosOrigen =beneficiariospagoscobrossSeleccionados.get(0);
				beneficiariospagoscobrosDestino =beneficiariospagoscobrossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosBeneficiariosPagosCobros(beneficiariospagoscobrosOrigen,beneficiariospagoscobrosDestino,true,false);
				
				beneficiariospagoscobrosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(beneficiariospagoscobrosDestino,beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(beneficiariospagoscobrosDestino,beneficiariospagoscobross);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
				
				//this.jTableDatosBeneficiariosPagosCobros.setRowSelectionInterval(this.getIndiceNuevoBeneficiariosPagosCobros(), this.getIndiceNuevoBeneficiariosPagosCobros());
				
				int iLastRow =  this.jTableDatosBeneficiariosPagosCobros.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBeneficiariosPagosCobros.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBeneficiariosPagosCobros.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesBeneficiariosPagosCobros.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesBeneficiariosPagosCobros.setVisible(!isVisible);
			this.jPanelPaginacionBeneficiariosPagosCobros.setVisible(!isVisible);
			this.jPanelAccionesBeneficiariosPagosCobros.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameBeneficiariosPagosCobros();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoBeneficiariosPagosCobros();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionBeneficiariosPagosCobros();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByBeneficiariosPagosCobros();
			
			this.abrirFrameOrderByBeneficiariosPagosCobros();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByBeneficiariosPagosCobros();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleBeneficiariosPagosCobros(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormBeneficiariosPagosCobros);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.isMaximum()) {
					this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setSize(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.iWidthFormulario,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormBeneficiariosPagosCobros.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormBeneficiariosPagosCobros.isMaximum()) {
						this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jContentPaneDetalleBeneficiariosPagosCobros.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTabbedPaneRelacionesBeneficiariosPagosCobros.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jContentPaneDetalleBeneficiariosPagosCobros.getWidth(),BeneficiariosPagosCobrosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTabbedPaneRelacionesBeneficiariosPagosCobros.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jContentPaneDetalleBeneficiariosPagosCobros.getWidth(),BeneficiariosPagosCobrosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTabbedPaneRelacionesBeneficiariosPagosCobros.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jContentPaneDetalleBeneficiariosPagosCobros.getWidth(),BeneficiariosPagosCobrosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setVisible(true);
	        this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByBeneficiariosPagosCobros() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByBeneficiariosPagosCobros==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByBeneficiariosPagosCobros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBeneficiariosPagosCobros,false,this);
				} else {
					this.jInternalFrameOrderByBeneficiariosPagosCobros=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBeneficiariosPagosCobros,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByBeneficiariosPagosCobros);
				this.jInternalFrameOrderByBeneficiariosPagosCobros.setVisible(false);
				this.jInternalFrameOrderByBeneficiariosPagosCobros.setSelected(false);
				
				this.jInternalFrameOrderByBeneficiariosPagosCobros.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBeneficiariosPagosCobros"));
				
				this.inicializarActualizarBindingTablaOrderByBeneficiariosPagosCobros();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionBeneficiariosPagosCobros() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionBeneficiariosPagosCobros==null) {
				
				this.jInternalFrameImportacionBeneficiariosPagosCobros=new ImportacionJInternalFrame(BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBeneficiariosPagosCobros);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionBeneficiariosPagosCobros);
				this.jInternalFrameImportacionBeneficiariosPagosCobros.setVisible(false);
				this.jInternalFrameImportacionBeneficiariosPagosCobros.setSelected(false);


				this.jInternalFrameImportacionBeneficiariosPagosCobros.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBeneficiariosPagosCobros"));
				this.jInternalFrameImportacionBeneficiariosPagosCobros.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBeneficiariosPagosCobros"));
				this.jInternalFrameImportacionBeneficiariosPagosCobros.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBeneficiariosPagosCobros"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoBeneficiariosPagosCobros() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros==null) {
				this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros=new ReporteDinamicoJInternalFrame(BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros);
				this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setVisible(false);
				this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBeneficiariosPagosCobros"));
				this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBeneficiariosPagosCobros"));
				this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBeneficiariosPagosCobros"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBeneficiariosPagosCobros();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleBeneficiariosPagosCobros() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormBeneficiariosPagosCobros);
			
	       	this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setVisible(false);
	        this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setSelected(false);
			
			//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.dispose();
			//this.jInternalFrameDetalleFormBeneficiariosPagosCobros=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoBeneficiariosPagosCobros() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setVisible(true);
	        this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionBeneficiariosPagosCobros() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionBeneficiariosPagosCobros.setVisible(true);
	        this.jInternalFrameImportacionBeneficiariosPagosCobros.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByBeneficiariosPagosCobros() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByBeneficiariosPagosCobros.setVisible(true);
	        this.jInternalFrameOrderByBeneficiariosPagosCobros.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByBeneficiariosPagosCobros() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByBeneficiariosPagosCobros.setVisible(false);
	        this.jInternalFrameOrderByBeneficiariosPagosCobros.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoBeneficiariosPagosCobros() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setVisible(false);
	        this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionBeneficiariosPagosCobros() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionBeneficiariosPagosCobros.setVisible(false);
	        this.jInternalFrameImportacionBeneficiariosPagosCobros.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarBeneficiariosPagosCobros(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarBeneficiariosPagosCobros(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesBeneficiariosPagosCobros(true);
			//this.isEsNuevoBeneficiariosPagosCobros=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesBeneficiariosPagosCobros("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBeneficiariosPagosCobros(false) ;
			
			if(beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(BeneficiariosPagosCobrosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBeneficiariosPagosCobros(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBeneficiariosPagosCobros(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaBeneficiariosPagosCobrosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarBeneficiariosPagosCobros(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesBeneficiariosPagosCobros(true);
			//this.isEsNuevoBeneficiariosPagosCobros=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.beneficiariospagoscobros.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesBeneficiariosPagosCobros("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesBeneficiariosPagosCobros(false) ;
			
			if(BeneficiariosPagosCobrosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBeneficiariosPagosCobros(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBeneficiariosPagosCobros(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesBeneficiariosPagosCobros(false);
			
			//if(!this.isEsNuevoBeneficiariosPagosCobros) {								
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
				this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				
			}
			
			if(this.permiteMantenimiento(this.beneficiariospagoscobros)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoBeneficiariosPagosCobros=true;
					this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
					this.isEsNuevoBeneficiariosPagosCobros=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoBeneficiariosPagosCobros=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoBeneficiariosPagosCobros=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBeneficiariosPagosCobros(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBeneficiariosPagosCobros(false);
				
				this.habilitarDeshabilitarControlesBeneficiariosPagosCobros(false);
			
												
				
				if(BeneficiariosPagosCobrosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleBeneficiariosPagosCobros();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,beneficiariospagoscobrosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosBeneficiariosPagosCobros.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,beneficiariospagoscobrosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.beneficiariospagoscobros.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(BeneficiariosPagosCobros.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BeneficiariosPagosCobros.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				this.beneficiariospagoscobros.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				this.beneficiariospagoscobros.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.beneficiariospagoscobros)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((BeneficiariosPagosCobrosModel) this.jTableDatosBeneficiariosPagosCobros.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoBeneficiariosPagosCobros=true;
				this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
				this.isEsNuevoBeneficiariosPagosCobros=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBeneficiariosPagosCobros(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBeneficiariosPagosCobros(false);
				
				this.habilitarDeshabilitarControlesBeneficiariosPagosCobros(false);
				
				
				
				if(BeneficiariosPagosCobrosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleBeneficiariosPagosCobros();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosBeneficiariosPagosCobros.getRowCount()>=1) {
				jTableDatosBeneficiariosPagosCobros.removeRowSelectionInterval(0, jTableDatosBeneficiariosPagosCobros.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesBeneficiariosPagosCobros(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBeneficiariosPagosCobros(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBeneficiariosPagosCobros(false) ;
			
			this.isEsNuevoBeneficiariosPagosCobros=false;
			
			if(BeneficiariosPagosCobrosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleBeneficiariosPagosCobros();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				
				//SI ES MANUAL
				if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualBeneficiariosPagosCobros();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoBeneficiariosPagosCobros--;			
			//BeneficiariosPagosCobros beneficiariospagoscobrosAux= new BeneficiariosPagosCobros();			
			//beneficiariospagoscobrosAux.setId(this.iIdNuevoBeneficiariosPagosCobros);
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaBeneficiariosPagosCobros();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
			
			this.beneficiariospagoscobros.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().add(this.beneficiariospagoscobrosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.beneficiariospagoscobross.add(this.beneficiariospagoscobrosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
			
			this.jTableDatosBeneficiariosPagosCobros.setRowSelectionInterval(this.getIndiceNuevoBeneficiariosPagosCobros(), this.getIndiceNuevoBeneficiariosPagosCobros());
			
			int iLastRow =  this.jTableDatosBeneficiariosPagosCobros.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosBeneficiariosPagosCobros.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosBeneficiariosPagosCobros.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
			
			//SI ES MANUAL
			if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBeneficiariosPagosCobros();
			}
			
			//this.abrirFrameTreeBeneficiariosPagosCobros();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionBeneficiariosPagosCobros.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionBeneficiariosPagosCobros.setFileImportacion(this.jInternalFrameImportacionBeneficiariosPagosCobros.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionBeneficiariosPagosCobros.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionBeneficiariosPagosCobros.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionBeneficiariosPagosCobros.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionBeneficiariosPagosCobros.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();		

		beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("BeneficiariosPagosCobrosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"BeneficiariosPagosCobrosBaseDesign.jrxml";
			
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
			
			this.generarReporteBeneficiariosPagosCobross("Todos",beneficiariospagoscobrossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Beneficiarios Pagos Cobros",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_enta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_enta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_enta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_enta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiarioAsiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiarioAsiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiarioAsiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiarioAsiento_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					sNombreCampoCategoria="codigo_cuenta_contable";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoria="nombre_cuenta_contable";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoria="numero_cheque";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoria="beneficiario";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoria="debito_local";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoria="credito_local";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoria="tipo_movimiento";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA:
					sNombreCampoCategoria="cuenta";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO:
					sNombreCampoCategoria="beneficiario_asiento";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					sNombreCampoCategoriaValor="codigo_cuenta_contable";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoriaValor="nombre_cuenta_contable";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoriaValor="numero_cheque";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoriaValor="beneficiario";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoriaValor="debito_local";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoriaValor="credito_local";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="tipo_movimiento";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA:
					sNombreCampoCategoriaValor="cuenta";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO:
					sNombreCampoCategoriaValor="beneficiario_asiento";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta_contable");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cheque");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_local");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_local");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_movimiento");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cuenta");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario Asiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario_asiento");
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
	
	public void jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();		
		
		beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"beneficiariospagoscobros";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("BeneficiariosPagosCobross");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getcodigo_cuenta_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getnombre_cuenta_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getnumero_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getbeneficiario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getdebito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getcredito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getdetalle());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.gettipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getcuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO);
					iRow++;

					for(BeneficiariosPagosCobros beneficiariospagoscobros:beneficiariospagoscobrossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(beneficiariospagoscobros.getbeneficiario_asiento());
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
			//	this.getFilaCabeceraExportarExcelBeneficiariosPagosCobros(row);				
			//	iRow++;
			//}				
			
			//for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobrossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelBeneficiariosPagosCobros(beneficiariospagoscobrosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Beneficiarios Pagos Cobros",JOptionPane.INFORMATION_MESSAGE);
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
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
			
			//SI ES MANUAL
			if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBeneficiariosPagosCobros();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
			
			//SI ES MANUAL
			if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBeneficiariosPagosCobros();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
			
			//SI ES MANUAL
			if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBeneficiariosPagosCobros();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaBeneficiariosPagosCobros() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosBeneficiariosPagosCobros.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosBeneficiariosPagosCobros.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosBeneficiariosPagosCobros.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosBeneficiariosPagosCobros.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosBeneficiariosPagosCobros.setMinimumSize(dimensionMinimum);
		this.jTableDatosBeneficiariosPagosCobros.setMaximumSize(dimensionMaximum);
		this.jTableDatosBeneficiariosPagosCobros.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingBeneficiariosPagosCobros(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingBeneficiariosPagosCobros(esInicializar,true);
	}
	
	public void inicializarActualizarBindingBeneficiariosPagosCobros(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesBeneficiariosPagosCobros(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasBeneficiariosPagosCobros(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBeneficiariosPagosCobros(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesBeneficiariosPagosCobros(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualBeneficiariosPagosCobros() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaBeneficiariosPagosCobros();
		
		this.inicializarActualizarBindingBotonesManualBeneficiariosPagosCobros(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualBeneficiariosPagosCobros();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBeneficiariosPagosCobros() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualBeneficiariosPagosCobros(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualBeneficiariosPagosCobros(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosBeneficiariosPagosCobros.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteBeneficiariosPagosCobros.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jCheckBoxPostAccionNuevoBeneficiariosPagosCobros.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jCheckBoxPostAccionSinCerrarBeneficiariosPagosCobros.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jCheckBoxPostAccionSinMensajeBeneficiariosPagosCobros.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosBeneficiariosPagosCobros.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteBeneficiariosPagosCobros.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
				this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jCheckBoxPostAccionNuevoBeneficiariosPagosCobros.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jCheckBoxPostAccionSinCerrarBeneficiariosPagosCobros.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jCheckBoxPostAccionSinMensajeBeneficiariosPagosCobros.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionBeneficiariosPagosCobros.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionBeneficiariosPagosCobros.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesBeneficiariosPagosCobros.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesBeneficiariosPagosCobros.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesBeneficiariosPagosCobros.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralBeneficiariosPagosCobros.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesBeneficiariosPagosCobros(Boolean esInicializar) throws Exception {
		try	{	
			if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualBeneficiariosPagosCobros(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesBeneficiariosPagosCobros() throws Exception {
		try	{
			if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualBeneficiariosPagosCobros();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBeneficiariosPagosCobros() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualBeneficiariosPagosCobros() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesBeneficiariosPagosCobros.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesBeneficiariosPagosCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesBeneficiariosPagosCobros.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesBeneficiariosPagosCobros.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionBeneficiariosPagosCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionBeneficiariosPagosCobros.addItem(reporte);
			}
			
			
			if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionBeneficiariosPagosCobros.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionBeneficiariosPagosCobros.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesBeneficiariosPagosCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesBeneficiariosPagosCobros.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesBeneficiariosPagosCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesBeneficiariosPagosCobros.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBeneficiariosPagosCobros();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBeneficiariosPagosCobros() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros!=null) {
				this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros!=null) {
				this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros!=null) {
				
				if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=BeneficiariosPagosCobrosConstantesFunciones.getTiposSeleccionarBeneficiariosPagosCobros(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=BeneficiariosPagosCobrosConstantesFunciones.getTiposSeleccionarBeneficiariosPagosCobros(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=BeneficiariosPagosCobrosConstantesFunciones.getTiposSeleccionarBeneficiariosPagosCobros(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualBeneficiariosPagosCobros()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.getSelectedItem()!=null){this.id_ejercicioBusquedaBeneficiariosPagosCobros=((Ejercicio)this.jComboBoxid_ejercicioBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.getSelectedItem()!=null){this.id_tipo_movimientoBusquedaBeneficiariosPagosCobros=((TipoMovimiento)this.jComboBoxid_tipo_movimientoBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.getSelectedItem()).getId();}
		this.fecha_desdeBusquedaBeneficiariosPagosCobros=new Date(this.jDateChooserfecha_desdeBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.getDate().getTime());
		this.fecha_hastaBusquedaBeneficiariosPagosCobros=new Date(this.jDateChooserfecha_hastaBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasBeneficiariosPagosCobros(Boolean esInicializar) throws Exception {				
		if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualBeneficiariosPagosCobros();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaBeneficiariosPagosCobros() throws Exception {
		this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByBeneficiariosPagosCobros() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosBeneficiariosPagosCobrosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobrosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaBeneficiariosPagosCobros(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=beneficiariospagoscobross.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosBeneficiariosPagosCobros.setModel(new BeneficiariosPagosCobrosModel(this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosBeneficiariosPagosCobros.setModel(new BeneficiariosPagosCobrosModel(this.beneficiariospagoscobross,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByBeneficiariosPagosCobros!=null && this.jInternalFrameOrderByBeneficiariosPagosCobros.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByBeneficiariosPagosCobros();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO,beneficiariospagoscobrosConstantesFunciones.resaltarSeleccionarBeneficiariosPagosCobros,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+BeneficiariosPagosCobrosConstantesFunciones.SCLASSWEBTITULO,beneficiariospagoscobrosConstantesFunciones.resaltarSeleccionarBeneficiariosPagosCobros,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_ID));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostraridBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltaridBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activaridBeneficiariosPagosCobros,iSizeTabla,this,true,"idBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltaridBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activaridBeneficiariosPagosCobros,this,true,"idBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrarcodigo_cuenta_contableBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarcodigo_cuenta_contableBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarcodigo_cuenta_contableBeneficiariosPagosCobros,iSizeTabla,this,true,"codigo_cuenta_contableBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarcodigo_cuenta_contableBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarcodigo_cuenta_contableBeneficiariosPagosCobros,this,true,"codigo_cuenta_contableBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrarnombre_cuenta_contableBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarnombre_cuenta_contableBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarnombre_cuenta_contableBeneficiariosPagosCobros,iSizeTabla,this,true,"nombre_cuenta_contableBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarnombre_cuenta_contableBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarnombre_cuenta_contableBeneficiariosPagosCobros,this,true,"nombre_cuenta_contableBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrarnumero_mayorBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarnumero_mayorBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarnumero_mayorBeneficiariosPagosCobros,iSizeTabla,this,true,"numero_mayorBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarnumero_mayorBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarnumero_mayorBeneficiariosPagosCobros,this,true,"numero_mayorBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrarnumero_chequeBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarnumero_chequeBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarnumero_chequeBeneficiariosPagosCobros,iSizeTabla,this,true,"numero_chequeBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarnumero_chequeBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarnumero_chequeBeneficiariosPagosCobros,this,true,"numero_chequeBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrarbeneficiarioBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarbeneficiarioBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarbeneficiarioBeneficiariosPagosCobros,iSizeTabla,this,true,"beneficiarioBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarbeneficiarioBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarbeneficiarioBeneficiariosPagosCobros,this,true,"beneficiarioBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrardebito_localBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltardebito_localBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activardebito_localBeneficiariosPagosCobros,iSizeTabla,this,true,"debito_localBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltardebito_localBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activardebito_localBeneficiariosPagosCobros,this,true,"debito_localBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrarcredito_localBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarcredito_localBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarcredito_localBeneficiariosPagosCobros,iSizeTabla,this,true,"credito_localBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarcredito_localBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarcredito_localBeneficiariosPagosCobros,this,true,"credito_localBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrardetalleBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltardetalleBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activardetalleBeneficiariosPagosCobros,iSizeTabla,this,true,"detalleBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltardetalleBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activardetalleBeneficiariosPagosCobros,this,true,"detalleBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrartipo_movimientoBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltartipo_movimientoBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activartipo_movimientoBeneficiariosPagosCobros,iSizeTabla,this,true,"tipo_movimientoBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltartipo_movimientoBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activartipo_movimientoBeneficiariosPagosCobros,this,true,"tipo_movimientoBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrarvalorBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarvalorBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarvalorBeneficiariosPagosCobros,iSizeTabla,this,true,"valorBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarvalorBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarvalorBeneficiariosPagosCobros,this,true,"valorBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrarcuentaBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarcuentaBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarcuentaBeneficiariosPagosCobros,iSizeTabla,this,true,"cuentaBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarcuentaBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarcuentaBeneficiariosPagosCobros,this,true,"cuentaBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrarfechaBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarfechaBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarfechaBeneficiariosPagosCobros,iSizeTabla,this,true,"fechaBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarfechaBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarfechaBeneficiariosPagosCobros,this,true,"fechaBeneficiariosPagosCobros","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO));

		if(this.beneficiariospagoscobrosConstantesFunciones.mostrarbeneficiario_asientoBeneficiariosPagosCobros && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarbeneficiario_asientoBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarbeneficiario_asientoBeneficiariosPagosCobros,iSizeTabla,this,true,"beneficiario_asientoBeneficiariosPagosCobros","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.beneficiariospagoscobrosConstantesFunciones.resaltarbeneficiario_asientoBeneficiariosPagosCobros,this.beneficiariospagoscobrosConstantesFunciones.activarbeneficiario_asientoBeneficiariosPagosCobros,this,true,"beneficiario_asientoBeneficiariosPagosCobros","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BeneficiariosPagosCobrosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBeneficiariosPagosCobros.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBeneficiariosPagosCobros.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosBeneficiariosPagosCobros.addColumn(tableColumn);
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
			
			this.jTableDatosBeneficiariosPagosCobros.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosBeneficiariosPagosCobros.moveColumn(this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosBeneficiariosPagosCobros.moveColumn(this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosBeneficiariosPagosCobros.moveColumn(this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosBeneficiariosPagosCobros.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosBeneficiariosPagosCobros.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosBeneficiariosPagosCobros,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosBeneficiariosPagosCobros.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosBeneficiariosPagosCobros.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosBeneficiariosPagosCobros.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=beneficiariospagoscobross.size()-1;
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
		//this.jTableDatosBeneficiariosPagosCobros.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosBeneficiariosPagosCobros.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosBeneficiariosPagosCobros();
			
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
				
				//this.isEsNuevoBeneficiariosPagosCobros=false;
					
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
				if(this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBeneficiariosPagosCobros.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.beneficiariospagoscobros.getsType().equals("DUPLICADO")
				   || this.beneficiariospagoscobros.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoBeneficiariosPagosCobros=true;
				
				} else {
					this.isEsNuevoBeneficiariosPagosCobros=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
					if(this.beneficiariospagoscobros.getId()>=0 && !this.beneficiariospagoscobros.getIsNew()) {						
						this.isEsNuevoBeneficiariosPagosCobros=false;
						
					} else {
						this.isEsNuevoBeneficiariosPagosCobros=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoBeneficiariosPagosCobros(esRelaciones);						
				
				this.seleccionarBeneficiariosPagosCobros(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.beneficiariospagoscobros.getId()<0) {
					this.isEsNuevoBeneficiariosPagosCobros=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarBeneficiariosPagosCobros(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarBeneficiariosPagosCobros(evt,rowIndex);
				}	
				
				if(this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion BeneficiariosPagosCobros: " + this.dDif); 
					}
				}								
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarBeneficiariosPagosCobros(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.beneficiariospagoscobros)) {
					if(this.beneficiariospagoscobros.getId()>0) {
						this.beneficiariospagoscobros.setIsDeleted(true);
						
						this.beneficiariospagoscobrossEliminados.add(this.beneficiariospagoscobros);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().remove(this.beneficiariospagoscobros);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobross.remove(this.beneficiariospagoscobros);				
					}
					
					
					((BeneficiariosPagosCobrosModel) this.jTableDatosBeneficiariosPagosCobros.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarBeneficiariosPagosCobros(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoBeneficiariosPagosCobros) {
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBeneficiariosPagosCobros.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesBeneficiariosPagosCobros("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesBeneficiariosPagosCobros(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBeneficiariosPagosCobros() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoBeneficiariosPagosCobros(beneficiariospagoscobros,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioBeneficiariosPagosCobros(beneficiariospagoscobros);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyBeneficiariosPagosCobros(beneficiariospagoscobros,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyBeneficiariosPagosCobros(beneficiariospagoscobros);
	}
	
	public void setVariablesObjetoActualToFormularioBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelidBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getId().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getcodigo_cuenta_contable());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanumero_mayorBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getnumero_mayor());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldnumero_chequeBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getnumero_cheque());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiarioBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getbeneficiario());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFielddebito_localBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getdebito_local().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcredito_localBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getcredito_local().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreadetalleBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getdetalle());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreatipo_movimientoBeneficiariosPagosCobros.setText(beneficiariospagoscobros.gettipo_movimiento());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldvalorBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getvalor().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcuentaBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getcuenta());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfechaBeneficiariosPagosCobros.setDate(beneficiariospagoscobros.getfecha());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getbeneficiario_asiento());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,BeneficiariosPagosCobros beneficiariospagoscobrosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,beneficiariospagoscobrosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,BeneficiariosPagosCobros beneficiariospagoscobrosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				beneficiariospagoscobrosLocal=this.beneficiariospagoscobros;
			} else {
				beneficiariospagoscobrosLocal=this.beneficiariospagoscobrosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(beneficiariospagoscobrosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoBeneficiariosPagosCobros(beneficiariospagoscobrosLocal,true);
					
					if(beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(beneficiariospagoscobrosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(beneficiariospagoscobrosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(beneficiariospagoscobros,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(beneficiariospagoscobros);
	}
	
	public void setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(beneficiariospagoscobros,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelidBeneficiariosPagosCobros.getText()==null || this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelidBeneficiariosPagosCobros.getText()=="" || this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelidBeneficiariosPagosCobros.getText()=="Id") {
				this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelidBeneficiariosPagosCobros.setText("0");
			}

			if(conColumnasBase) {beneficiariospagoscobros.setId(Long.parseLong(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelidBeneficiariosPagosCobros.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelIdBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setcodigo_cuenta_contable(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelcodigo_cuenta_contableBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setnombre_cuenta_contable(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelnombre_cuenta_contableBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setnumero_mayor(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanumero_mayorBeneficiariosPagosCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelnumero_mayorBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setnumero_cheque(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldnumero_chequeBeneficiariosPagosCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelnumero_chequeBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setbeneficiario(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiarioBeneficiariosPagosCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelbeneficiarioBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setdebito_local(Double.parseDouble(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFielddebito_localBeneficiariosPagosCobros.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabeldebito_localBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setcredito_local(Double.parseDouble(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcredito_localBeneficiariosPagosCobros.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelcredito_localBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setdetalle(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreadetalleBeneficiariosPagosCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabeldetalleBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.settipo_movimiento(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreatipo_movimientoBeneficiariosPagosCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabeltipo_movimientoBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldvalorBeneficiariosPagosCobros.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelvalorBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setcuenta(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcuentaBeneficiariosPagosCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelcuentaBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setfecha(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfechaBeneficiariosPagosCobros.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelfechaBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			beneficiariospagoscobros.setbeneficiario_asiento(this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiario_asientoBeneficiariosPagosCobros.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelbeneficiario_asientoBeneficiariosPagosCobros,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobrosBean,BeneficiariosPagosCobros beneficiariospagoscobros,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobrosOrigen,BeneficiariosPagosCobros beneficiariospagoscobros,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getId()!=null && !beneficiariospagoscobrosOrigen.getId().equals(0L))) {beneficiariospagoscobros.setId(beneficiariospagoscobrosOrigen.getId());}}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getfecha_desde()!=null && !beneficiariospagoscobrosOrigen.getfecha_desde().equals(new Date()))) {beneficiariospagoscobros.setfecha_desde(beneficiariospagoscobrosOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getfecha_hasta()!=null && !beneficiariospagoscobrosOrigen.getfecha_hasta().equals(new Date()))) {beneficiariospagoscobros.setfecha_hasta(beneficiariospagoscobrosOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getcodigo_cuenta_contable()!=null && !beneficiariospagoscobrosOrigen.getcodigo_cuenta_contable().equals(""))) {beneficiariospagoscobros.setcodigo_cuenta_contable(beneficiariospagoscobrosOrigen.getcodigo_cuenta_contable());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getnombre_cuenta_contable()!=null && !beneficiariospagoscobrosOrigen.getnombre_cuenta_contable().equals(""))) {beneficiariospagoscobros.setnombre_cuenta_contable(beneficiariospagoscobrosOrigen.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getnumero_mayor()!=null && !beneficiariospagoscobrosOrigen.getnumero_mayor().equals(""))) {beneficiariospagoscobros.setnumero_mayor(beneficiariospagoscobrosOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getnumero_cheque()!=null && !beneficiariospagoscobrosOrigen.getnumero_cheque().equals(""))) {beneficiariospagoscobros.setnumero_cheque(beneficiariospagoscobrosOrigen.getnumero_cheque());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getbeneficiario()!=null && !beneficiariospagoscobrosOrigen.getbeneficiario().equals(""))) {beneficiariospagoscobros.setbeneficiario(beneficiariospagoscobrosOrigen.getbeneficiario());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getdebito_local()!=null && !beneficiariospagoscobrosOrigen.getdebito_local().equals(0.0))) {beneficiariospagoscobros.setdebito_local(beneficiariospagoscobrosOrigen.getdebito_local());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getcredito_local()!=null && !beneficiariospagoscobrosOrigen.getcredito_local().equals(0.0))) {beneficiariospagoscobros.setcredito_local(beneficiariospagoscobrosOrigen.getcredito_local());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getdetalle()!=null && !beneficiariospagoscobrosOrigen.getdetalle().equals(""))) {beneficiariospagoscobros.setdetalle(beneficiariospagoscobrosOrigen.getdetalle());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.gettipo_movimiento()!=null && !beneficiariospagoscobrosOrigen.gettipo_movimiento().equals(""))) {beneficiariospagoscobros.settipo_movimiento(beneficiariospagoscobrosOrigen.gettipo_movimiento());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getvalor()!=null && !beneficiariospagoscobrosOrigen.getvalor().equals(0.0))) {beneficiariospagoscobros.setvalor(beneficiariospagoscobrosOrigen.getvalor());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getcuenta()!=null && !beneficiariospagoscobrosOrigen.getcuenta().equals(""))) {beneficiariospagoscobros.setcuenta(beneficiariospagoscobrosOrigen.getcuenta());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getfecha()!=null && !beneficiariospagoscobrosOrigen.getfecha().equals(new Date()))) {beneficiariospagoscobros.setfecha(beneficiariospagoscobrosOrigen.getfecha());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosOrigen.getbeneficiario_asiento()!=null && !beneficiariospagoscobrosOrigen.getbeneficiario_asiento().equals(""))) {beneficiariospagoscobros.setbeneficiario_asiento(beneficiariospagoscobrosOrigen.getbeneficiario_asiento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelidBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getId().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getcodigo_cuenta_contable());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanumero_mayorBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getnumero_mayor());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldnumero_chequeBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getnumero_cheque());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiarioBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getbeneficiario());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFielddebito_localBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getdebito_local().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcredito_localBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getcredito_local().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreadetalleBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getdetalle());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreatipo_movimientoBeneficiariosPagosCobros.setText(beneficiariospagoscobros.gettipo_movimiento());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldvalorBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getvalor().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcuentaBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getcuenta());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfechaBeneficiariosPagosCobros.setDate(beneficiariospagoscobros.getfecha());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setText(beneficiariospagoscobros.getbeneficiario_asiento());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBeneficiariosPagosCobros(BeneficiariosPagosCobrosBean beneficiariospagoscobrosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelidBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getId().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getcodigo_cuenta_contable());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanumero_mayorBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getnumero_mayor());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldnumero_chequeBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getnumero_cheque());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiarioBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getbeneficiario());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFielddebito_localBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getdebito_local().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcredito_localBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getcredito_local().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreadetalleBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getdetalle());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreatipo_movimientoBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.gettipo_movimiento());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldvalorBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getvalor().toString());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcuentaBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getcuenta());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfechaBeneficiariosPagosCobros.setDate(beneficiariospagoscobrosBean.getfecha());
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setText(beneficiariospagoscobrosBean.getbeneficiario_asiento());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanBeneficiariosPagosCobros(BeneficiariosPagosCobrosParameterReturnGeneral beneficiariospagoscobrosReturnGeneral,BeneficiariosPagosCobrosBean beneficiariospagoscobrosBean,Boolean conDefault) throws Exception { 
		try {
			BeneficiariosPagosCobros beneficiariospagoscobrosLocal=new BeneficiariosPagosCobros();
			
			beneficiariospagoscobrosLocal=beneficiariospagoscobrosReturnGeneral.getBeneficiariosPagosCobros();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getId()!=null && !beneficiariospagoscobrosLocal.getId().equals(0L))) {beneficiariospagoscobrosBean.setId(beneficiariospagoscobrosLocal.getId());}}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getcodigo_cuenta_contable()!=null && !beneficiariospagoscobrosLocal.getcodigo_cuenta_contable().equals(""))) {beneficiariospagoscobrosBean.setcodigo_cuenta_contable(beneficiariospagoscobrosLocal.getcodigo_cuenta_contable());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getnombre_cuenta_contable()!=null && !beneficiariospagoscobrosLocal.getnombre_cuenta_contable().equals(""))) {beneficiariospagoscobrosBean.setnombre_cuenta_contable(beneficiariospagoscobrosLocal.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getnumero_mayor()!=null && !beneficiariospagoscobrosLocal.getnumero_mayor().equals(""))) {beneficiariospagoscobrosBean.setnumero_mayor(beneficiariospagoscobrosLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getnumero_cheque()!=null && !beneficiariospagoscobrosLocal.getnumero_cheque().equals(""))) {beneficiariospagoscobrosBean.setnumero_cheque(beneficiariospagoscobrosLocal.getnumero_cheque());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getbeneficiario()!=null && !beneficiariospagoscobrosLocal.getbeneficiario().equals(""))) {beneficiariospagoscobrosBean.setbeneficiario(beneficiariospagoscobrosLocal.getbeneficiario());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getdebito_local()!=null && !beneficiariospagoscobrosLocal.getdebito_local().equals(0.0))) {beneficiariospagoscobrosBean.setdebito_local(beneficiariospagoscobrosLocal.getdebito_local());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getcredito_local()!=null && !beneficiariospagoscobrosLocal.getcredito_local().equals(0.0))) {beneficiariospagoscobrosBean.setcredito_local(beneficiariospagoscobrosLocal.getcredito_local());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getdetalle()!=null && !beneficiariospagoscobrosLocal.getdetalle().equals(""))) {beneficiariospagoscobrosBean.setdetalle(beneficiariospagoscobrosLocal.getdetalle());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.gettipo_movimiento()!=null && !beneficiariospagoscobrosLocal.gettipo_movimiento().equals(""))) {beneficiariospagoscobrosBean.settipo_movimiento(beneficiariospagoscobrosLocal.gettipo_movimiento());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getvalor()!=null && !beneficiariospagoscobrosLocal.getvalor().equals(0.0))) {beneficiariospagoscobrosBean.setvalor(beneficiariospagoscobrosLocal.getvalor());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getcuenta()!=null && !beneficiariospagoscobrosLocal.getcuenta().equals(""))) {beneficiariospagoscobrosBean.setcuenta(beneficiariospagoscobrosLocal.getcuenta());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getfecha()!=null && !beneficiariospagoscobrosLocal.getfecha().equals(new Date()))) {beneficiariospagoscobrosBean.setfecha(beneficiariospagoscobrosLocal.getfecha());}
			if(conDefault || (!conDefault && beneficiariospagoscobrosLocal.getbeneficiario_asiento()!=null && !beneficiariospagoscobrosLocal.getbeneficiario_asiento().equals(""))) {beneficiariospagoscobrosBean.setbeneficiario_asiento(beneficiariospagoscobrosLocal.getbeneficiario_asiento());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxBeneficiariosPagosCobrosGenerico(Long idBeneficiariosPagosCobrosSeleccionado,JComboBox jComboBoxBeneficiariosPagosCobros,List<BeneficiariosPagosCobros> beneficiariospagoscobrossLocal)throws Exception {
		try {
			BeneficiariosPagosCobros  beneficiariospagoscobrosTemp=null;

			for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobrossLocal) {
				if(beneficiariospagoscobrosAux.getId()!=null && beneficiariospagoscobrosAux.getId().equals(idBeneficiariosPagosCobrosSeleccionado)) {
					beneficiariospagoscobrosTemp=beneficiariospagoscobrosAux;
					break;
				}
			}

			jComboBoxBeneficiariosPagosCobros.setSelectedItem(beneficiariospagoscobrosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxBeneficiariosPagosCobrosGenerico(JComboBox jComboBoxBeneficiariosPagosCobros,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBeneficiariosPagosCobros.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxBeneficiariosPagosCobros.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBeneficiariosPagosCobros.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxBeneficiariosPagosCobros.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxBeneficiariosPagosCobros.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxBeneficiariosPagosCobros.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			beneficiariospagoscobros=(BeneficiariosPagosCobros) beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			beneficiariospagoscobros =(BeneficiariosPagosCobros) beneficiariospagoscobross.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!beneficiariospagoscobros.getIsNew() && !beneficiariospagoscobros.getIsChanged() && !beneficiariospagoscobros.getIsDeleted()) {
				sDescripcion=beneficiariospagoscobros.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=beneficiariospagoscobros.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!beneficiariospagoscobros.getIsNew() && !beneficiariospagoscobros.getIsChanged() && !beneficiariospagoscobros.getIsDeleted()) {
				sDescripcion=beneficiariospagoscobros.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=beneficiariospagoscobros.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!beneficiariospagoscobros.getIsNew() && !beneficiariospagoscobros.getIsChanged() && !beneficiariospagoscobros.getIsDeleted()) {
				sDescripcion=beneficiariospagoscobros.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=beneficiariospagoscobros.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!beneficiariospagoscobros.getIsNew() && !beneficiariospagoscobros.getIsChanged() && !beneficiariospagoscobros.getIsDeleted()) {
				sDescripcion=beneficiariospagoscobros.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=beneficiariospagoscobros.gettipomovimiento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		BeneficiariosPagosCobros beneficiariospagoscobrosRow=new BeneficiariosPagosCobros();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			beneficiariospagoscobrosRow=(BeneficiariosPagosCobros) beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			beneficiariospagoscobrosRow=(BeneficiariosPagosCobros) beneficiariospagoscobross.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualBeneficiariosPagosCobros(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros && this.isPermisoNuevoBeneficiariosPagosCobros));			
			this.jButtonDuplicarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaDuplicarBeneficiariosPagosCobros && this.isPermisoDuplicarBeneficiariosPagosCobros));			
			this.jButtonCopiarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaCopiarBeneficiariosPagosCobros && this.isPermisoCopiarBeneficiariosPagosCobros));
			this.jButtonVerFormBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaVerFormBeneficiariosPagosCobros && this.isPermisoVerFormBeneficiariosPagosCobros));
			
			this.jButtonAbrirOrderByBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaOrdenBeneficiariosPagosCobros && this.isPermisoOrdenBeneficiariosPagosCobros));			
			
			this.jButtonNuevoRelacionesBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros && this.isPermisoNuevoBeneficiariosPagosCobros));			
			this.jButtonNuevoGuardarCambiosBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros && this.isPermisoNuevoBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros));
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonModificarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaModificarBeneficiariosPagosCobros && this.isPermisoActualizarBeneficiariosPagosCobros));	
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonActualizarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros && this.isPermisoActualizarBeneficiariosPagosCobros));	
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonEliminarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros && this.isPermisoEliminarBeneficiariosPagosCobros));
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonCancelarBeneficiariosPagosCobros.setVisible(this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros);							
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros));			
			
			}
						
			this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros && this.isPermisoNuevoBeneficiariosPagosCobros));						
			this.jButtonDuplicarToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaDuplicarBeneficiariosPagosCobros && this.isPermisoDuplicarBeneficiariosPagosCobros));						
			this.jButtonCopiarToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaCopiarBeneficiariosPagosCobros && this.isPermisoCopiarBeneficiariosPagosCobros));			
			this.jButtonVerFormToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaVerFormBeneficiariosPagosCobros && this.isPermisoVerFormBeneficiariosPagosCobros));			
			this.jButtonAbrirOrderByToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaOrdenBeneficiariosPagosCobros && this.isPermisoOrdenBeneficiariosPagosCobros));
			this.jButtonNuevoRelacionesToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros && this.isPermisoNuevoBeneficiariosPagosCobros));			
			this.jButtonNuevoGuardarCambiosToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros && this.isPermisoNuevoBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros));			
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonModificarToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaModificarBeneficiariosPagosCobros && this.isPermisoActualizarBeneficiariosPagosCobros));	
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonActualizarToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros  && this.isPermisoActualizarBeneficiariosPagosCobros));	
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonEliminarToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros && this.isPermisoEliminarBeneficiariosPagosCobros));
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonCancelarToolBarBeneficiariosPagosCobros.setVisible(this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros);				
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros && this.isPermisoNuevoBeneficiariosPagosCobros));			
			this.jMenuItemDuplicarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaDuplicarBeneficiariosPagosCobros && this.isPermisoDuplicarBeneficiariosPagosCobros));			
			this.jMenuItemCopiarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaCopiarBeneficiariosPagosCobros && this.isPermisoCopiarBeneficiariosPagosCobros));			
			this.jMenuItemVerFormBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaVerFormBeneficiariosPagosCobros && this.isPermisoVerFormBeneficiariosPagosCobros));			
			this.jMenuItemAbrirOrderByBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaOrdenBeneficiariosPagosCobros && this.isPermisoOrdenBeneficiariosPagosCobros));			
			//this.jMenuItemMostrarOcultarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaOrdenBeneficiariosPagosCobros && this.isPermisoOrdenBeneficiariosPagosCobros));
			this.jMenuItemDetalleAbrirOrderByBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaOrdenBeneficiariosPagosCobros && this.isPermisoOrdenBeneficiariosPagosCobros));			
			//this.jMenuItemDetalleMostrarOcultarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaOrdenBeneficiariosPagosCobros && this.isPermisoOrdenBeneficiariosPagosCobros));			
			this.jMenuItemNuevoRelacionesBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros && this.isPermisoNuevoBeneficiariosPagosCobros));			
			this.jMenuItemNuevoGuardarCambiosBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros && this.isPermisoNuevoBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros));									
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemModificarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaModificarBeneficiariosPagosCobros && this.isPermisoActualizarBeneficiariosPagosCobros));	
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemActualizarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros && this.isPermisoActualizarBeneficiariosPagosCobros));	
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemEliminarBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros && this.isPermisoEliminarBeneficiariosPagosCobros));
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemCancelarBeneficiariosPagosCobros.setVisible(this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros);				
			}
			
			this.jMenuItemGuardarCambiosBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros));						
			this.jMenuItemGuardarCambiosTablaBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=this.jButtonNuevoBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaDuplicarBeneficiariosPagosCobros=this.jButtonDuplicarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaCopiarBeneficiariosPagosCobros=this.jButtonCopiarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaVerFormBeneficiariosPagosCobros=this.jButtonVerFormBeneficiariosPagosCobros.isVisible();
			
			this.isVisibilidadCeldaOrdenBeneficiariosPagosCobros=this.jButtonAbrirOrderByBeneficiariosPagosCobros.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=this.jButtonNuevoRelacionesBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaModificarBeneficiariosPagosCobros=this.jButtonModificarBeneficiariosPagosCobros.isVisible();
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonActualizarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonEliminarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonCancelarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosBeneficiariosPagosCobros.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=this.jButtonNuevoToolBarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=this.jButtonNuevoRelacionesToolBarBeneficiariosPagosCobros.isVisible();
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			this.isVisibilidadCeldaModificarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonModificarToolBarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonActualizarToolBarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonEliminarToolBarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonCancelarToolBarBeneficiariosPagosCobros.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=this.jButtonGuardarCambiosToolBarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=this.jButtonGuardarCambiosTablaToolBarBeneficiariosPagosCobros.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=this.jMenuItemNuevoBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=this.jMenuItemNuevoRelacionesBeneficiariosPagosCobros.isVisible();
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			this.isVisibilidadCeldaModificarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemModificarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemActualizarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemEliminarBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemCancelarBeneficiariosPagosCobros.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=this.jMenuItemGuardarCambiosBeneficiariosPagosCobros.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=this.jMenuItemGuardarCambiosTablaBeneficiariosPagosCobros.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesBeneficiariosPagosCobros(Boolean esInicializar) {
		if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
				//if(this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesBeneficiariosPagosCobros();
			}
			
			this.inicializarActualizarBindingBotonesManualBeneficiariosPagosCobros(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualBeneficiariosPagosCobros() {
		this.jButtonNuevoBeneficiariosPagosCobros.setVisible(this.isPermisoNuevoBeneficiariosPagosCobros);			
		this.jButtonDuplicarBeneficiariosPagosCobros.setVisible(this.isPermisoDuplicarBeneficiariosPagosCobros);			
		this.jButtonCopiarBeneficiariosPagosCobros.setVisible(this.isPermisoCopiarBeneficiariosPagosCobros);			
		this.jButtonVerFormBeneficiariosPagosCobros.setVisible(this.isPermisoVerFormBeneficiariosPagosCobros);			
		
		this.jButtonAbrirOrderByBeneficiariosPagosCobros.setVisible(this.isPermisoOrdenBeneficiariosPagosCobros);					
		
		this.jButtonNuevoRelacionesBeneficiariosPagosCobros.setVisible(this.isPermisoNuevoBeneficiariosPagosCobros);			
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonModificarBeneficiariosPagosCobros.setVisible(this.isPermisoActualizarBeneficiariosPagosCobros);	
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonActualizarBeneficiariosPagosCobros.setVisible(this.isPermisoActualizarBeneficiariosPagosCobros);	
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonEliminarBeneficiariosPagosCobros.setVisible(this.isPermisoEliminarBeneficiariosPagosCobros);
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonCancelarBeneficiariosPagosCobros.setVisible(this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros);						
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosBeneficiariosPagosCobros.setVisible(this.isPermisoGuardarCambiosBeneficiariosPagosCobros);							
		}
		
		this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.setVisible(this.isPermisoActualizarBeneficiariosPagosCobros);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleBeneficiariosPagosCobros() {
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonModificarBeneficiariosPagosCobros.setVisible(this.isPermisoActualizarBeneficiariosPagosCobros);	
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonActualizarBeneficiariosPagosCobros.setVisible(this.isPermisoActualizarBeneficiariosPagosCobros);	
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonEliminarBeneficiariosPagosCobros.setVisible(this.isPermisoEliminarBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonCancelarBeneficiariosPagosCobros.setVisible(this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros);							
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosBeneficiariosPagosCobros.setVisible((this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros && this.isPermisoGuardarCambiosBeneficiariosPagosCobros));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosBeneficiariosPagosCobros() {
		if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualBeneficiariosPagosCobros();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesBeneficiariosPagosCobros() {
	}
	
	public void jTableDatosBeneficiariosPagosCobrosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarBeneficiariosPagosCobros(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.beneficiariospagoscobros.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaBeneficiariosPagosCobrosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebBeneficiariosPagosCobros(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBeneficiariosPagosCobros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBeneficiariosPagosCobros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.beneficiariospagoscobrosLogic.getConnexion());

				if(this.beneficiariospagoscobros.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.beneficiariospagoscobros.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBeneficiariosPagosCobros=(TitledBorder)this.jScrollPanelDatosBeneficiariosPagosCobros.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderBeneficiariosPagosCobros.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.beneficiariospagoscobros.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalBeneficiariosPagosCobrosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebBeneficiariosPagosCobros(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBeneficiariosPagosCobros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBeneficiariosPagosCobros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.beneficiariospagoscobrosLogic.getConnexion());

				if(this.beneficiariospagoscobros.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.beneficiariospagoscobros.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBeneficiariosPagosCobros=(TitledBorder)this.jScrollPanelDatosBeneficiariosPagosCobros.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderBeneficiariosPagosCobros.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.beneficiariospagoscobros.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioBeneficiariosPagosCobrosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebBeneficiariosPagosCobros(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBeneficiariosPagosCobros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBeneficiariosPagosCobros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.beneficiariospagoscobrosLogic.getConnexion());

				if(this.beneficiariospagoscobros.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.beneficiariospagoscobros.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBeneficiariosPagosCobros=(TitledBorder)this.jScrollPanelDatosBeneficiariosPagosCobros.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderBeneficiariosPagosCobros.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.beneficiariospagoscobros.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebBeneficiariosPagosCobros(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBeneficiariosPagosCobros.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBeneficiariosPagosCobros.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.beneficiariospagoscobrosLogic.getConnexion());

				if(this.beneficiariospagoscobros.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.beneficiariospagoscobros.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBeneficiariosPagosCobros=(TitledBorder)this.jScrollPanelDatosBeneficiariosPagosCobros.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderBeneficiariosPagosCobros.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.beneficiariospagoscobros.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.beneficiariospagoscobros.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.beneficiariospagoscobros.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getcodigo_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta_contable like '%"+this.beneficiariospagoscobros.getcodigo_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getnombre_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable like '%"+this.beneficiariospagoscobros.getnombre_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.beneficiariospagoscobros.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chequeBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getnumero_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cheque like '%"+this.beneficiariospagoscobros.getnumero_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiarioBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getbeneficiario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario like '%"+this.beneficiariospagoscobros.getbeneficiario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_localBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getdebito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_local = "+this.beneficiariospagoscobros.getdebito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_localBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getcredito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_local = "+this.beneficiariospagoscobros.getcredito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalleBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.beneficiariospagoscobros.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_movimientoBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.gettipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_movimiento like '%"+this.beneficiariospagoscobros.gettipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.beneficiariospagoscobros.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncuentaBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getcuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cuenta like '%"+this.beneficiariospagoscobros.getcuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.beneficiariospagoscobros.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.getbeneficiariospagoscobros(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.beneficiariospagoscobros==null) {
						this.beneficiariospagoscobros = new BeneficiariosPagosCobros();
					}

					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);
				}

				if(this.beneficiariospagoscobros.getbeneficiario_asiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario_asiento like '%"+this.beneficiariospagoscobros.getbeneficiario_asiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);

			this.getBeneficiariosPagosCobrossBusquedaBeneficiariosPagosCobros();

			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);

			//if(BeneficiariosPagosCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);

			this.getBeneficiariosPagosCobrossFK_IdEjercicio();

			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);

			//if(BeneficiariosPagosCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);

			this.getBeneficiariosPagosCobrossFK_IdEmpresa();

			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);

			//if(BeneficiariosPagosCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);

			this.getBeneficiariosPagosCobrossFK_IdSucursal();

			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);

			//if(BeneficiariosPagosCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoBeneficiariosPagosCobrosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);

			this.getBeneficiariosPagosCobrossFK_IdTipoMovimiento();

			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);

			//if(BeneficiariosPagosCobrosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.beneficiariospagoscobrosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameBeneficiariosPagosCobros() {
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setVisible(false);	    			
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.dispose();
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros!=null) {
			this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.dispose();
			this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros=null;
		}
		
		if(this.jInternalFrameImportacionBeneficiariosPagosCobros!=null) {
			this.jInternalFrameImportacionBeneficiariosPagosCobros.setVisible(false);	    			
			this.jInternalFrameImportacionBeneficiariosPagosCobros.dispose();
			this.jInternalFrameImportacionBeneficiariosPagosCobros=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessBeneficiariosPagosCobros();
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
			
			if(sTipo.equals("NuevoBeneficiariosPagosCobros")) {
				jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarBeneficiariosPagosCobros")) {
				jButtonDuplicarBeneficiariosPagosCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarBeneficiariosPagosCobros")) {
				jButtonCopiarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("VerFormBeneficiariosPagosCobros")) {
				jButtonVerFormBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarBeneficiariosPagosCobros")) {
				jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarBeneficiariosPagosCobros")) {
				jButtonDuplicarBeneficiariosPagosCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoBeneficiariosPagosCobros")) {
				jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarBeneficiariosPagosCobros")) {
				jButtonDuplicarBeneficiariosPagosCobrosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesBeneficiariosPagosCobros")) {
				jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarBeneficiariosPagosCobros")) {
				jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesBeneficiariosPagosCobros")) {
				jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarBeneficiariosPagosCobros")) {
				jButtonModificarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarBeneficiariosPagosCobros")) {
				jButtonModificarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarBeneficiariosPagosCobros")) {
				jButtonModificarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarBeneficiariosPagosCobros")) {
				jButtonActualizarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarBeneficiariosPagosCobros")) {
				jButtonActualizarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarBeneficiariosPagosCobros")) {
				jButtonActualizarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("EliminarBeneficiariosPagosCobros")) {
				jButtonEliminarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarBeneficiariosPagosCobros")) {
				jButtonEliminarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarBeneficiariosPagosCobros")) {
				jButtonEliminarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("CancelarBeneficiariosPagosCobros")) {
				jButtonCancelarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarBeneficiariosPagosCobros")) {
				jButtonCancelarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarBeneficiariosPagosCobros")) {
				jButtonCancelarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("CerrarBeneficiariosPagosCobros")) {
				jButtonCerrarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarBeneficiariosPagosCobros")) {
				jButtonCerrarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarBeneficiariosPagosCobros")) {
				jButtonCerrarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarBeneficiariosPagosCobros")) {
				jButtonMostrarOcultarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarBeneficiariosPagosCobros")) {
				jButtonCancelarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosBeneficiariosPagosCobros")) {
				jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarBeneficiariosPagosCobros")) {
				jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarBeneficiariosPagosCobros")) {
				jButtonCopiarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarBeneficiariosPagosCobros")) {
				jButtonVerFormBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosBeneficiariosPagosCobros")) {
				jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarBeneficiariosPagosCobros")) {
				jButtonCopiarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormBeneficiariosPagosCobros")) {
				jButtonVerFormBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaBeneficiariosPagosCobros")) {
				jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarBeneficiariosPagosCobros")) {
				jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaBeneficiariosPagosCobros")) {
				jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionBeneficiariosPagosCobros")) {
				jButtonRecargarInformacionBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarBeneficiariosPagosCobros")) {
				jButtonRecargarInformacionBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionBeneficiariosPagosCobros")) {
				jButtonRecargarInformacionBeneficiariosPagosCobrosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresBeneficiariosPagosCobros")) {
				jButtonAnterioresBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarBeneficiariosPagosCobros")) {
				jButtonAnterioresBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreBeneficiariosPagosCobros")) {
				jButtonAnterioresBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesBeneficiariosPagosCobros")) {
				jButtonSiguientesBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarBeneficiariosPagosCobros")) {
				jButtonSiguientesBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesBeneficiariosPagosCobros")) {
				jButtonSiguientesBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByBeneficiariosPagosCobros") || sTipo.equals("MenuItemDetalleAbrirOrderByBeneficiariosPagosCobros")) {
				jButtonAbrirOrderByBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarBeneficiariosPagosCobros") || sTipo.equals("MenuItemDetalleMostrarOcultarBeneficiariosPagosCobros")) {
				jButtonMostrarOcultarBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosBeneficiariosPagosCobros")) {
				jButtonNuevoGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarBeneficiariosPagosCobros")) {
				jButtonNuevoGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosBeneficiariosPagosCobros")) {
				jButtonNuevoGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoBeneficiariosPagosCobros")) {
				jButtonCerrarReporteDinamicoBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoBeneficiariosPagosCobros")) {
				jButtonGenerarReporteDinamicoBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoBeneficiariosPagosCobros")) {
				
				jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionBeneficiariosPagosCobros")) {
				jButtonCerrarImportacionBeneficiariosPagosCobrosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionBeneficiariosPagosCobros")) {
				
				jButtonGenerarImportacionBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionBeneficiariosPagosCobros")) {
				
				jButtonAbrirImportacionBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesBeneficiariosPagosCobros")) {
				jComboBoxTiposAccionesBeneficiariosPagosCobrosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesBeneficiariosPagosCobros")) {
				jComboBoxTiposRelacionesBeneficiariosPagosCobrosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioBeneficiariosPagosCobros")) {
				jComboBoxTiposAccionesBeneficiariosPagosCobrosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarBeneficiariosPagosCobros")) {
				
				jComboBoxTiposSeleccionarBeneficiariosPagosCobrosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralBeneficiariosPagosCobros")) {
				jTextFieldValorCampoGeneralBeneficiariosPagosCobrosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByBeneficiariosPagosCobros")) {
				jButtonAbrirOrderByBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarBeneficiariosPagosCobros")) {
				jButtonAbrirOrderByBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByBeneficiariosPagosCobros")) {
				jButtonCerrarOrderByBeneficiariosPagosCobrosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonidBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBeneficiariosPagosCobrosUpdate")) {
				this.jButtonid_empresaBeneficiariosPagosCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonid_empresaBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalBeneficiariosPagosCobrosUpdate")) {
				this.jButtonid_sucursalBeneficiariosPagosCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonid_sucursalBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioBeneficiariosPagosCobrosUpdate")) {
				this.jButtonid_ejercicioBeneficiariosPagosCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonid_ejercicioBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoBeneficiariosPagosCobrosUpdate")) {
				this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonfecha_desdeBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonfecha_hastaBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_contableBeneficiariosPagosCobrosBusqueda")) {
				this.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonnumero_mayorBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonnumero_chequeBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonbeneficiarioBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localBeneficiariosPagosCobrosBusqueda")) {
				this.jButtondebito_localBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localBeneficiariosPagosCobrosBusqueda")) {
				this.jButtoncredito_localBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleBeneficiariosPagosCobrosBusqueda")) {
				this.jButtondetalleBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoBeneficiariosPagosCobrosBusqueda")) {
				this.jButtontipo_movimientoBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonvalorBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cuentaBeneficiariosPagosCobrosBusqueda")) {
				this.jButtoncuentaBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonfechaBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiario_asientoBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros")) {
				this.jButtonBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobrosActionPerformed(evt);
			}
			
			;
			
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessBeneficiariosPagosCobros();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				


				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BeneficiariosPagosCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BeneficiariosPagosCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			BeneficiariosPagosCobros beneficiariospagoscobrosLocal=null;
			
			if(!this.getEsControlTabla()) {
				beneficiariospagoscobrosLocal=this.beneficiariospagoscobros;
			} else {
				beneficiariospagoscobrosLocal=this.beneficiariospagoscobrosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
							
				
				


				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BeneficiariosPagosCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BeneficiariosPagosCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
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
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
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
			
			


			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
								
						
				


				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BeneficiariosPagosCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BeneficiariosPagosCobros.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
								
				
				


				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BeneficiariosPagosCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BeneficiariosPagosCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
			
			this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
							
				
				


				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BeneficiariosPagosCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BeneficiariosPagosCobros.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
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
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
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
			
			


			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
			
			this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
								
				
				


				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BeneficiariosPagosCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BeneficiariosPagosCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
			
			this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosBeneficiariosPagosCobros")) {
					jCheckBoxSeleccionarTodosBeneficiariosPagosCobrosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosBeneficiariosPagosCobros")) {
					jCheckBoxSeleccionadosBeneficiariosPagosCobrosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarBeneficiariosPagosCobros")) {
					
				}
				
				


				
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BeneficiariosPagosCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BeneficiariosPagosCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
												
				
				


				
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BeneficiariosPagosCobros.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BeneficiariosPagosCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
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
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
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
			
			


			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BeneficiariosPagosCobros.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BeneficiariosPagosCobros.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.beneficiariospagoscobros);
				
				this.actualizarInformacion("INFO_PADRE",false,this.beneficiariospagoscobros);
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
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
				
				


				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BeneficiariosPagosCobros.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BeneficiariosPagosCobros.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBeneficiariosPagosCobrosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.beneficiariospagoscobrosAnterior =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarBeneficiariosPagosCobros")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosBeneficiariosPagosCobrosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosBeneficiariosPagosCobros.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.beneficiariospagoscobros =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.beneficiariospagoscobros);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarBeneficiariosPagosCobros")) {
				
				}
				
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarBeneficiariosPagosCobros")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosBeneficiariosPagosCobros.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarBeneficiariosPagosCobros")) {
			
			}
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessBeneficiariosPagosCobros();
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
			if(sTipo.equals("NuevoBeneficiariosPagosCobros")) {
				jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarBeneficiariosPagosCobros")) {
				jButtonDuplicarBeneficiariosPagosCobrosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarBeneficiariosPagosCobros")) {
				jButtonCopiarBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormBeneficiariosPagosCobros")) {
				jButtonVerFormBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesBeneficiariosPagosCobros")) {
				jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarBeneficiariosPagosCobros")) {
				jButtonModificarBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarBeneficiariosPagosCobros")) {
				jButtonActualizarBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarBeneficiariosPagosCobros")) {
				jButtonEliminarBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaBeneficiariosPagosCobros")) {
				jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarBeneficiariosPagosCobros")) {
				jButtonCancelarBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarBeneficiariosPagosCobros")) {
				jButtonCerrarBeneficiariosPagosCobrosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosBeneficiariosPagosCobros")) {
				jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosBeneficiariosPagosCobros")) {
				jButtonNuevoGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByBeneficiariosPagosCobros")) {
				jButtonAbrirOrderByBeneficiariosPagosCobrosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionBeneficiariosPagosCobros")) {
				jButtonRecargarInformacionBeneficiariosPagosCobrosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresBeneficiariosPagosCobros")) {
				jButtonAnterioresBeneficiariosPagosCobrosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesBeneficiariosPagosCobros")) {
				jButtonSiguientesBeneficiariosPagosCobrosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonidBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBeneficiariosPagosCobrosUpdate")) {
				this.jButtonid_empresaBeneficiariosPagosCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonid_empresaBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalBeneficiariosPagosCobrosUpdate")) {
				this.jButtonid_sucursalBeneficiariosPagosCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonid_sucursalBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioBeneficiariosPagosCobrosUpdate")) {
				this.jButtonid_ejercicioBeneficiariosPagosCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonid_ejercicioBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoBeneficiariosPagosCobrosUpdate")) {
				this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonfecha_desdeBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonfecha_hastaBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_contableBeneficiariosPagosCobrosBusqueda")) {
				this.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonnumero_mayorBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonnumero_chequeBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonbeneficiarioBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localBeneficiariosPagosCobrosBusqueda")) {
				this.jButtondebito_localBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localBeneficiariosPagosCobrosBusqueda")) {
				this.jButtoncredito_localBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleBeneficiariosPagosCobrosBusqueda")) {
				this.jButtondetalleBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoBeneficiariosPagosCobrosBusqueda")) {
				this.jButtontipo_movimientoBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonvalorBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cuentaBeneficiariosPagosCobrosBusqueda")) {
				this.jButtoncuentaBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonfechaBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiario_asientoBeneficiariosPagosCobrosBusqueda")) {
				this.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusquedaActionPerformed(evt);
			}
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessBeneficiariosPagosCobros();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameBeneficiariosPagosCobros")) {
				closingInternalFrameBeneficiariosPagosCobros();
				
			} else if(sTipo.equals("jButtonCancelarBeneficiariosPagosCobros")) {
				JInternalFrameBase jInternalFrameDetalleFormBeneficiariosPagosCobros = (JInternalFrameBase)evt.getSource();
	            	
	            BeneficiariosPagosCobrosBeanSwingJInternalFrame jInternalFrameParent=(BeneficiariosPagosCobrosBeanSwingJInternalFrame)jInternalFrameDetalleFormBeneficiariosPagosCobros.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarBeneficiariosPagosCobrosActionPerformed(null);
			}
			
			BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.beneficiariospagoscobros,new Object(),this.beneficiariospagoscobrosParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormBeneficiariosPagosCobros(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormBeneficiariosPagosCobros(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormBeneficiariosPagosCobros(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.beneficiariospagoscobros)) {
			if(!esControlTabla) {
				if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);			
				}
				
				if(this.beneficiariospagoscobrosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanBeneficiariosPagosCobros(this.beneficiariospagoscobrosReturnGeneral,this.beneficiariospagoscobrosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.beneficiariospagoscobrosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanBeneficiariosPagosCobros(classes,this.beneficiariospagoscobrosReturnGeneral,this.beneficiariospagoscobrosBean,false);
					}
						
					if(this.beneficiariospagoscobrosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyBeneficiariosPagosCobros(this.beneficiariospagoscobrosReturnGeneral.getBeneficiariosPagosCobros());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioBeneficiariosPagosCobros(this.beneficiariospagoscobrosReturnGeneral.getBeneficiariosPagosCobros());	
					}
						
					if(this.beneficiariospagoscobrosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioBeneficiariosPagosCobros(this.beneficiariospagoscobrosReturnGeneral.getBeneficiariosPagosCobros(),classes);//this.beneficiariospagoscobrosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioBeneficiariosPagosCobros(this.beneficiariospagoscobros,classes);//this.beneficiariospagoscobrosBean);									
				}
			
				if(BeneficiariosPagosCobrosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualBeneficiariosPagosCobros(this.beneficiariospagoscobros,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBeneficiariosPagosCobros(this.beneficiariospagoscobros);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.beneficiariospagoscobrosAnterior!=null) {
						this.beneficiariospagoscobros=this.beneficiariospagoscobrosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.beneficiariospagoscobrosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.beneficiariospagoscobrosReturnGeneral.getBeneficiariosPagosCobros(),beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.beneficiariospagoscobrosReturnGeneral.getBeneficiariosPagosCobros(),this.beneficiariospagoscobross);
				}
				//ARCHITECTURE
				
				//this.jTableDatosBeneficiariosPagosCobros.repaint();
				
				//((AbstractTableModel) this.jTableDatosBeneficiariosPagosCobros.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosBeneficiariosPagosCobros();
			}
		}
	}
	
	public void actualizarVisualTableDatosBeneficiariosPagosCobros() throws Exception {
		
		BeneficiariosPagosCobrosModel beneficiariospagoscobrosModel=(BeneficiariosPagosCobrosModel)this.jTableDatosBeneficiariosPagosCobros.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			beneficiariospagoscobrosModel.beneficiariospagoscobross=this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			beneficiariospagoscobrosModel.beneficiariospagoscobross=this.beneficiariospagoscobross;
		}
		
		
		((BeneficiariosPagosCobrosModel) this.jTableDatosBeneficiariosPagosCobros.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaBeneficiariosPagosCobros() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getbeneficiariospagoscobrosAnterior(),this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getbeneficiariospagoscobrosAnterior(),this.beneficiariospagoscobross);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosBeneficiariosPagosCobros();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
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
										
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.beneficiariospagoscobros,new Object(),generalEntityParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=BeneficiariosPagosCobrosConstantesFunciones.getClassesRelationshipsOfBeneficiariosPagosCobros(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=BeneficiariosPagosCobrosConstantesFunciones.getClassesRelationshipsFromStringsOfBeneficiariosPagosCobros(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormBeneficiariosPagosCobros(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.beneficiariospagoscobros,new Object(),generalEntityParameterGeneral,this.beneficiariospagoscobrosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioBeneficiariosPagosCobros(BeneficiariosPagosCobrosBean beneficiariospagoscobrosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanBeneficiariosPagosCobros(ArrayList<Classe> classes,BeneficiariosPagosCobrosReturnGeneral beneficiariospagoscobrosReturnGeneral,BeneficiariosPagosCobrosBean beneficiariospagoscobrosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.beneficiariospagoscobros)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros = new BeneficiariosPagosCobrosDetalleFormJInternalFrame(jDesktopPane,this.beneficiariospagoscobrosSessionBean.getConGuardarRelaciones(),this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setVisible(false);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setSelected(false);						
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.beneficiariospagoscobrosLogic=this.beneficiariospagoscobrosLogic;
		
		this.cargarCombosFrameForeignKeyBeneficiariosPagosCobros("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleBeneficiariosPagosCobros();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBeneficiariosPagosCobros();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyBeneficiariosPagosCobros("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyBeneficiariosPagosCobros();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBeneficiariosPagosCobros"));
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonModificarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"ModificarBeneficiariosPagosCobros"));

		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonModificarToolBarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"ModificarToolBarBeneficiariosPagosCobros"));
					
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemModificarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"MenuItemModificarBeneficiariosPagosCobros"));		
		
		
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonActualizarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"ActualizarBeneficiariosPagosCobros"));
		
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonActualizarToolBarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBeneficiariosPagosCobros"));
						
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemActualizarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBeneficiariosPagosCobros"));		
		
		
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonEliminarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"EliminarBeneficiariosPagosCobros"));
		
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonEliminarToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"EliminarToolBarBeneficiariosPagosCobros"));
								
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemEliminarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBeneficiariosPagosCobros"));		
		
		
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonCancelarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"CancelarBeneficiariosPagosCobros"));
		
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonCancelarToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"CancelarToolBarBeneficiariosPagosCobros"));
					
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemCancelarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBeneficiariosPagosCobros"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemDetalleCerrarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBeneficiariosPagosCobros"));		
		
		
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBeneficiariosPagosCobros"));
		
		
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBeneficiariosPagosCobros"));
		
		
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBeneficiariosPagosCobros"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonidBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"idBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_empresaBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_empresaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_sucursalBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_ejercicioBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtondebito_localBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"debito_localBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtoncredito_localBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"credito_localBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtondetalleBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"detalleBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonvalorBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"valorBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtoncuentaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"cuentaBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonfechaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fechaBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiario_asientoBeneficiariosPagosCobrosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTabbedPaneRelacionesBeneficiariosPagosCobros.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBeneficiariosPagosCobros"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameBeneficiariosPagosCobros"));
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBeneficiariosPagosCobros"));
		}
		
		this.jTableDatosBeneficiariosPagosCobros.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarBeneficiariosPagosCobros"));
		
		this.jTableDatosBeneficiariosPagosCobros.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarBeneficiariosPagosCobros"));
		
		this.jButtonNuevoBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"NuevoBeneficiariosPagosCobros"));
		
		this.jButtonDuplicarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"DuplicarBeneficiariosPagosCobros"));
		
		this.jButtonCopiarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"CopiarBeneficiariosPagosCobros"));
		
		this.jButtonVerFormBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"VerFormBeneficiariosPagosCobros"));
		
		
		this.jButtonNuevoToolBarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"NuevoToolBarBeneficiariosPagosCobros"));
			
		this.jButtonDuplicarToolBarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"DuplicarToolBarBeneficiariosPagosCobros"));
			
		this.jMenuItemNuevoBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemNuevoBeneficiariosPagosCobros"));
			
		this.jMenuItemDuplicarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarBeneficiariosPagosCobros"));		
		
		
		this.jButtonNuevoRelacionesBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"NuevoRelacionesBeneficiariosPagosCobros"));
		
		
		this.jButtonNuevoRelacionesToolBarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarBeneficiariosPagosCobros"));
			
		this.jMenuItemNuevoRelacionesBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesBeneficiariosPagosCobros"));		
		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonModificarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"ModificarBeneficiariosPagosCobros"));
		}
		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonModificarToolBarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"ModificarToolBarBeneficiariosPagosCobros"));
			
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemModificarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"MenuItemModificarBeneficiariosPagosCobros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonActualizarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"ActualizarBeneficiariosPagosCobros"));
		}
		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonActualizarToolBarBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBeneficiariosPagosCobros"));
				
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemActualizarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBeneficiariosPagosCobros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonEliminarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"EliminarBeneficiariosPagosCobros"));
		}
		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonEliminarToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"EliminarToolBarBeneficiariosPagosCobros"));
						
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemEliminarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBeneficiariosPagosCobros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonCancelarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"CancelarBeneficiariosPagosCobros"));
		}
		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonCancelarToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"CancelarToolBarBeneficiariosPagosCobros"));
			
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemCancelarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBeneficiariosPagosCobros"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarBeneficiariosPagosCobros"));		
		
		
		this.jButtonCerrarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"CerrarBeneficiariosPagosCobros"));
		
		
		this.jButtonCerrarToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"CerrarToolBarBeneficiariosPagosCobros"));
			
		this.jMenuItemCerrarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemCerrarBeneficiariosPagosCobros"));
			
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jMenuItemDetalleCerrarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBeneficiariosPagosCobros"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosBeneficiariosPagosCobros"));
		}
		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBeneficiariosPagosCobros"));
		}
		
		this.jButtonCopiarToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"CopiarToolBarBeneficiariosPagosCobros"));
			
		this.jButtonVerFormToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"VerFormToolBarBeneficiariosPagosCobros"));
		
		this.jMenuItemGuardarCambiosBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosBeneficiariosPagosCobros"));
			
		this.jMenuItemCopiarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemCopiarBeneficiariosPagosCobros"));		
		
		this.jMenuItemVerFormBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemVerFormBeneficiariosPagosCobros"));		
		
		
		this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBeneficiariosPagosCobros"));
		
		
		this.jButtonGuardarCambiosTablaToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarBeneficiariosPagosCobros"));
			
		this.jMenuItemGuardarCambiosTablaBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBeneficiariosPagosCobros"));		
		
		
		
		this.jButtonRecargarInformacionBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"RecargarInformacionBeneficiariosPagosCobros"));
					
		this.jButtonRecargarInformacionToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarBeneficiariosPagosCobros"));
		
		this.jMenuItemRecargarInformacionBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionBeneficiariosPagosCobros"));		
		
		
		
		this.jButtonAnterioresBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"AnterioresBeneficiariosPagosCobros"));
		
		
		this.jButtonAnterioresToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"AnterioresToolBarBeneficiariosPagosCobros"));
		
		this.jMenuItemAnterioresBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresBeneficiariosPagosCobros"));		
		
		
		this.jButtonSiguientesBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"SiguientesBeneficiariosPagosCobros"));
		
		
		this.jButtonSiguientesToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"SiguientesToolBarBeneficiariosPagosCobros"));
			
		this.jMenuItemSiguientesBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesBeneficiariosPagosCobros"));
			
		this.jMenuItemAbrirOrderByBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByBeneficiariosPagosCobros"));
			
		this.jMenuItemMostrarOcultarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarBeneficiariosPagosCobros"));
			
		this.jMenuItemDetalleAbrirOrderByBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByBeneficiariosPagosCobros"));
			
		this.jMenuItemDetalleMostarOcultarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarBeneficiariosPagosCobros"));		
		
		
		this.jButtonNuevoGuardarCambiosBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosBeneficiariosPagosCobros"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarBeneficiariosPagosCobros"));
			
		this.jMenuItemNuevoGuardarCambiosBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosBeneficiariosPagosCobros"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosBeneficiariosPagosCobros"));

		this.jCheckBoxSeleccionadosBeneficiariosPagosCobros.addItemListener(new CheckBoxItemListener(this,"SeleccionadosBeneficiariosPagosCobros"));
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBeneficiariosPagosCobros"));
		}
		
		
		this.jComboBoxTiposRelacionesBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"TiposRelacionesBeneficiariosPagosCobros"));
			
		this.jComboBoxTiposAccionesBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"TiposAccionesBeneficiariosPagosCobros"));
					
		this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"TiposSeleccionarBeneficiariosPagosCobros"));
			
		this.jTextFieldValorCampoGeneralBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralBeneficiariosPagosCobros"));		
		
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonidBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"idBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_empresaBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_empresaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_sucursalBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_ejercicioBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtondebito_localBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"debito_localBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtoncredito_localBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"credito_localBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtondetalleBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"detalleBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonvalorBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"valorBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtoncuentaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"cuentaBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonfechaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fechaBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiario_asientoBeneficiariosPagosCobrosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"BusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros!=null) {
				this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBeneficiariosPagosCobros"));
				this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBeneficiariosPagosCobros"));
				this.jInternalFrameReporteDinamicoBeneficiariosPagosCobros.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBeneficiariosPagosCobros"));
			}
			
			//this.jButtonCerrarReporteDinamicoBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBeneficiariosPagosCobros"));				
			//this.jButtonGenerarReporteDinamicoBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBeneficiariosPagosCobros"));
			//this.jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBeneficiariosPagosCobros"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionBeneficiariosPagosCobros!=null) {
				this.jInternalFrameImportacionBeneficiariosPagosCobros.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBeneficiariosPagosCobros"));
				this.jInternalFrameImportacionBeneficiariosPagosCobros.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBeneficiariosPagosCobros"));
				this.jInternalFrameImportacionBeneficiariosPagosCobros.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBeneficiariosPagosCobros"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"AbrirOrderByBeneficiariosPagosCobros"));
			
			this.jButtonAbrirOrderByToolBarBeneficiariosPagosCobros.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarBeneficiariosPagosCobros"));			
			
			if(this.jInternalFrameOrderByBeneficiariosPagosCobros!=null) {
				this.jInternalFrameOrderByBeneficiariosPagosCobros.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBeneficiariosPagosCobros"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTabbedPaneRelacionesBeneficiariosPagosCobros.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBeneficiariosPagosCobros"));
		
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
            		closingInternalFrameBeneficiariosPagosCobros();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormBeneficiariosPagosCobros = (JInternalFrameBase)event.getSource();
	            	
	            BeneficiariosPagosCobrosBeanSwingJInternalFrame jInternalFrameParent=(BeneficiariosPagosCobrosBeanSwingJInternalFrame)jInternalFrameDetalleFormBeneficiariosPagosCobros.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarBeneficiariosPagosCobrosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosBeneficiariosPagosCobros.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosBeneficiariosPagosCobrosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosBeneficiariosPagosCobros.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosBeneficiariosPagosCobros.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoBeneficiariosPagosCobros";
		inputMap = this.jButtonNuevoBeneficiariosPagosCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoBeneficiariosPagosCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesBeneficiariosPagosCobros";
		inputMap = this.jButtonNuevoRelacionesBeneficiariosPagosCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesBeneficiariosPagosCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBeneficiariosPagosCobrosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarBeneficiariosPagosCobros";
		inputMap = this.jButtonModificarBeneficiariosPagosCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarBeneficiariosPagosCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarBeneficiariosPagosCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarBeneficiariosPagosCobros";
		inputMap = this.jButtonActualizarBeneficiariosPagosCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarBeneficiariosPagosCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarBeneficiariosPagosCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarBeneficiariosPagosCobros";
		inputMap = this.jButtonEliminarBeneficiariosPagosCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarBeneficiariosPagosCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarBeneficiariosPagosCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarBeneficiariosPagosCobros";
		inputMap = this.jButtonCancelarBeneficiariosPagosCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarBeneficiariosPagosCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarBeneficiariosPagosCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarBeneficiariosPagosCobros";
		inputMap = this.jButtonCerrarBeneficiariosPagosCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarBeneficiariosPagosCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarBeneficiariosPagosCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosBeneficiariosPagosCobros";
		inputMap = this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosBeneficiariosPagosCobros.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonGuardarCambiosBeneficiariosPagosCobros.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosBeneficiariosPagosCobros.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosBeneficiariosPagosCobrosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesBeneficiariosPagosCobros.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesBeneficiariosPagosCobrosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarBeneficiariosPagosCobrosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralBeneficiariosPagosCobros.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralBeneficiariosPagosCobrosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonidBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"idBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_empresaBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_empresaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_sucursalBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_sucursalBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_ejercicioBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_ejercicioBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioBeneficiariosPagosCobrosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_tipo_movimientoBeneficiariosPagosCobrosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoBeneficiariosPagosCobrosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonid_tipo_movimientoBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonfecha_desdeBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonfecha_hastaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtoncodigo_cuenta_contableBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonnombre_cuenta_contableBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonnumero_mayorBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonnumero_chequeBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonbeneficiarioBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtondebito_localBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"debito_localBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtoncredito_localBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"credito_localBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtondetalleBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"detalleBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtontipo_movimientoBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonvalorBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"valorBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtoncuentaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"cuentaBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonfechaBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"fechaBeneficiariosPagosCobrosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jButtonbeneficiario_asientoBeneficiariosPagosCobrosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiario_asientoBeneficiariosPagosCobrosBusqueda"));
		
		
		this.jButtonBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros.addActionListener(new ButtonActionListener(this,"BusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionBeneficiariosPagosCobros.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionBeneficiariosPagosCobrosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarBeneficiariosPagosCobrosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarBeneficiariosPagosCobros.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosBeneficiariosPagosCobros(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
					beneficiariospagoscobrosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobross) {
					beneficiariospagoscobrosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosBeneficiariosPagosCobrosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
						beneficiariospagoscobrosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobross) {
						beneficiariospagoscobrosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobross) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBeneficiariosPagosCobros.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBeneficiariosPagosCobros.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosBeneficiariosPagosCobrosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosBeneficiariosPagosCobros.getSelectedRows();
			
			BeneficiariosPagosCobros beneficiariospagoscobrosLocal=new BeneficiariosPagosCobros();
			
			//this.seleccionarTodosBeneficiariosPagosCobros(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					beneficiariospagoscobrosLocal =(BeneficiariosPagosCobros) this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross().toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					beneficiariospagoscobrosLocal =(BeneficiariosPagosCobros) this.beneficiariospagoscobross.toArray()[this.jTableDatosBeneficiariosPagosCobros.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				beneficiariospagoscobrosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
						beneficiariospagoscobrosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobross) {
						beneficiariospagoscobrosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBeneficiariosPagosCobros.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBeneficiariosPagosCobros.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBeneficiariosPagosCobros,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualBeneficiariosPagosCobrosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarBeneficiariosPagosCobrosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralBeneficiariosPagosCobrosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralBeneficiariosPagosCobros.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
				
						if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							beneficiariospagoscobrosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							beneficiariospagoscobrosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
							existe=true;
							beneficiariospagoscobrosAux.setcodigo_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							beneficiariospagoscobrosAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							beneficiariospagoscobrosAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							beneficiariospagoscobrosAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							beneficiariospagoscobrosAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							beneficiariospagoscobrosAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							beneficiariospagoscobrosAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							beneficiariospagoscobrosAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							beneficiariospagoscobrosAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							beneficiariospagoscobrosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA)) {
							existe=true;
							beneficiariospagoscobrosAux.setcuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							beneficiariospagoscobrosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO)) {
							existe=true;
							beneficiariospagoscobrosAux.setbeneficiario_asiento(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobross) {
					
						if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							beneficiariospagoscobrosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							beneficiariospagoscobrosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
							existe=true;
							beneficiariospagoscobrosAux.setcodigo_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							beneficiariospagoscobrosAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							beneficiariospagoscobrosAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							beneficiariospagoscobrosAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							beneficiariospagoscobrosAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							beneficiariospagoscobrosAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							beneficiariospagoscobrosAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							beneficiariospagoscobrosAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							beneficiariospagoscobrosAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							beneficiariospagoscobrosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA)) {
							existe=true;
							beneficiariospagoscobrosAux.setcuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							beneficiariospagoscobrosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO)) {
							existe=true;
							beneficiariospagoscobrosAux.setbeneficiario_asiento(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesBeneficiariosPagosCobrosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioBeneficiariosPagosCobros=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesBeneficiariosPagosCobros.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteBeneficiariosPagosCobros) {				
					conSplash=true;//false;										
					
					//this.startProcessBeneficiariosPagosCobros(conSplash);
				
					this.generarReporteBeneficiariosPagosCobrossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoBeneficiariosPagosCobrossSeleccionados();
				//this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBeneficiariosPagosCobrossSeleccionados(false);
				//this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBeneficiariosPagosCobrossSeleccionados(true);
				//this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBeneficiariosPagosCobros();
				
				this.exportarBeneficiariosPagosCobrossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionBeneficiariosPagosCobross();
				//this.importarBeneficiariosPagosCobross();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBeneficiariosPagosCobros();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelBeneficiariosPagosCobrossSeleccionados();
				//this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Beneficiarios Pagos Cobros", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessBeneficiariosPagosCobros();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoBeneficiariosPagosCobros)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyBeneficiariosPagosCobros(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Beneficiarios Pagos Cobros",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setSelectedIndex(0);					
				}	
			} 			
			else if(BeneficiariosPagosCobrosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteBeneficiariosPagosCobros) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessBeneficiariosPagosCobros(conSplash);
					
						//this.actualizarParametrosGeneralBeneficiariosPagosCobros();
						
						this.generarReporteProcesoAccionBeneficiariosPagosCobrossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Beneficiarios Pagos CobrosES SELECCIONADOS?", "MANTENIMIENTO DE Beneficiarios Pagos Cobros", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessBeneficiariosPagosCobros();
				
						this.actualizarParametrosGeneralBeneficiariosPagosCobros();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.beneficiariospagoscobrosReturnGeneral=beneficiariospagoscobrosLogic.procesarAccionBeneficiariosPagosCobrossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross(),this.beneficiariospagoscobrosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarBeneficiariosPagosCobrosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralBeneficiariosPagosCobros();
					
					BeneficiariosPagosCobrosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarBeneficiariosPagosCobrosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBeneficiariosPagosCobros.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxTiposAccionesFormularioBeneficiariosPagosCobros.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessBeneficiariosPagosCobros(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesBeneficiariosPagosCobrosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessBeneficiariosPagosCobros();
			
			if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();		
			BeneficiariosPagosCobros beneficiariospagoscobros=new BeneficiariosPagosCobros();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesBeneficiariosPagosCobros.getSelectedItem();
			
			
			
			
			beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(true);
			//this.sTipoAccion;
			
			if(beneficiariospagoscobrossSeleccionados.size()==1) {
				for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobrossSeleccionados) {
					beneficiariospagoscobros=beneficiariospagoscobrosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessBeneficiariosPagosCobros();
			
      		//this.finishProcessBeneficiariosPagosCobros(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarBeneficiariosPagosCobrosReturnGeneral() throws Exception {
		if(this.beneficiariospagoscobrosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.beneficiariospagoscobrosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.beneficiariospagoscobrosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.beneficiariospagoscobrosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.beneficiariospagoscobrosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.beneficiariospagoscobrosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
		}
		
		if(this.beneficiariospagoscobrosReturnGeneral.getConRetornoLista() || this.beneficiariospagoscobrosReturnGeneral.getConRetornoObjeto()) {
			if(this.beneficiariospagoscobrosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.beneficiariospagoscobrosLogic.setBeneficiariosPagosCobross(this.beneficiariospagoscobrosReturnGeneral.getBeneficiariosPagosCobross());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingBeneficiariosPagosCobros(false);
		}
	}
	
	public void actualizarParametrosGeneralBeneficiariosPagosCobros() throws Exception {
		
		
	}
	
	public ArrayList<BeneficiariosPagosCobros> getBeneficiariosPagosCobrossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioBeneficiariosPagosCobros) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross()) {
					if(beneficiariospagoscobrosAux.getIsSelected()) {
						beneficiariospagoscobrossSeleccionados.add(beneficiariospagoscobrosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:this.beneficiariospagoscobross) {
					if(beneficiariospagoscobrosAux.getIsSelected()) {
						beneficiariospagoscobrossSeleccionados.add(beneficiariospagoscobrosAux);				
					}
				}
			}
			
			if(beneficiariospagoscobrossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						beneficiariospagoscobrossSeleccionados.addAll(this.beneficiariospagoscobrosLogic.getBeneficiariosPagosCobross());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						beneficiariospagoscobrossSeleccionados.addAll(this.beneficiariospagoscobross);				
					}
				}
			}
		} else {
			beneficiariospagoscobrossSeleccionados.add(this.beneficiariospagoscobros);
		}
		
		return beneficiariospagoscobrossSeleccionados;
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
	
	public void generarReporteBeneficiariosPagosCobrossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalBeneficiariosPagosCobrossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoBeneficiariosPagosCobrossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBeneficiariosPagosCobrossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBeneficiariosPagosCobrossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Beneficiarios Pagos Cobros",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesBeneficiariosPagosCobrossSeleccionados() throws Exception {
		ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();		
		
		beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteBeneficiariosPagosCobross("Todos",beneficiariospagoscobrossSeleccionados);
		
	}	
	
	public void generarReporteNormalBeneficiariosPagosCobrossSeleccionados() throws Exception {
		ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();		
		
		beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteBeneficiariosPagosCobross("Todos",beneficiariospagoscobrossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionBeneficiariosPagosCobrossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();
		
		beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteBeneficiariosPagosCobross("Todos",beneficiariospagoscobrossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoBeneficiariosPagosCobrossSeleccionados() throws Exception {
		ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();		
		
		
		this.abrirInicializarFrameReporteDinamicoBeneficiariosPagosCobros();
		
		
		beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoBeneficiariosPagosCobros();
		
		
		//this.generarReporteBeneficiariosPagosCobross("Todos",beneficiariospagoscobrossSeleccionados ,beneficiariospagoscobrosImplementable,beneficiariospagoscobrosImplementableHome);
	}
	
	public void mostrarImportacionBeneficiariosPagosCobross() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionBeneficiariosPagosCobros();
		
		this.abrirFrameImportacionBeneficiariosPagosCobros();		
		
			
		//this.generarReporteBeneficiariosPagosCobross("Todos",beneficiariospagoscobrossSeleccionados ,beneficiariospagoscobrosImplementable,beneficiariospagoscobrosImplementableHome);
	}
	
	public void importarBeneficiariosPagosCobross() throws Exception {		
	
	}
	
	public void exportarBeneficiariosPagosCobrossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelBeneficiariosPagosCobrossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoBeneficiariosPagosCobrossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlBeneficiariosPagosCobrossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Beneficiarios Pagos Cobros",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoBeneficiariosPagosCobrossSeleccionados() throws Exception {
		ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();		
		
		beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"beneficiariospagoscobros."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarBeneficiariosPagosCobros(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobrossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarBeneficiariosPagosCobros(beneficiariospagoscobrosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//beneficiariospagoscobrosAux.setsDetalleGeneralEntityReporte(beneficiariospagoscobrosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Beneficiarios Pagos Cobros",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarBeneficiariosPagosCobros(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=beneficiariospagoscobros.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getcodigo_cuenta_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getnombre_cuenta_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getnumero_cheque();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getbeneficiario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getdebito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getcredito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getdetalle();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.gettipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getcuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=beneficiariospagoscobros.getbeneficiario_asiento();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelBeneficiariosPagosCobrossSeleccionados() throws Exception {
		ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();		
		
		beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"beneficiariospagoscobros.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("BeneficiariosPagosCobross");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelBeneficiariosPagosCobros(row);				
				iRow++;
			}				
			
			for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobrossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelBeneficiariosPagosCobros(beneficiariospagoscobrosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Beneficiarios Pagos Cobros",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlBeneficiariosPagosCobrossSeleccionados() throws Exception {
		ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();		
		
		beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"beneficiariospagoscobros.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("beneficiariospagoscobross");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("beneficiariospagoscobros");
			//elementRoot.appendChild(element);
		
			for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobrossSeleccionados) {
				element = document.createElement("beneficiariospagoscobros");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlBeneficiariosPagosCobros(beneficiariospagoscobrosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Beneficiarios Pagos Cobros",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelBeneficiariosPagosCobros(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DEBITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CREDITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getcodigo_cuenta_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getnombre_cuenta_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getnumero_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getbeneficiario());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getdebito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getcredito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getdetalle());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.gettipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getcuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(beneficiariospagoscobros.getbeneficiario_asiento());				
	}
	
	public void setFilaDatosExportarXmlBeneficiariosPagosCobros(BeneficiariosPagosCobros beneficiariospagoscobros,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(beneficiariospagoscobros.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(beneficiariospagoscobros.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(beneficiariospagoscobros.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(beneficiariospagoscobros.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(beneficiariospagoscobros.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(beneficiariospagoscobros.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementfecha_desde = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(beneficiariospagoscobros.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(beneficiariospagoscobros.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementcodigo_cuenta_contable = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.CODIGOCUENTACONTABLE);
		elementcodigo_cuenta_contable.appendChild(document.createTextNode(beneficiariospagoscobros.getcodigo_cuenta_contable().trim()));
		element.appendChild(elementcodigo_cuenta_contable);

		Element elementnombre_cuenta_contable = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.NOMBRECUENTACONTABLE);
		elementnombre_cuenta_contable.appendChild(document.createTextNode(beneficiariospagoscobros.getnombre_cuenta_contable().trim()));
		element.appendChild(elementnombre_cuenta_contable);

		Element elementnumero_mayor = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(beneficiariospagoscobros.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementnumero_cheque = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.NUMEROCHEQUE);
		elementnumero_cheque.appendChild(document.createTextNode(beneficiariospagoscobros.getnumero_cheque().trim()));
		element.appendChild(elementnumero_cheque);

		Element elementbeneficiario = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.BENEFICIARIO);
		elementbeneficiario.appendChild(document.createTextNode(beneficiariospagoscobros.getbeneficiario().trim()));
		element.appendChild(elementbeneficiario);

		Element elementdebito_local = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.DEBITOLOCAL);
		elementdebito_local.appendChild(document.createTextNode(beneficiariospagoscobros.getdebito_local().toString().trim()));
		element.appendChild(elementdebito_local);

		Element elementcredito_local = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.CREDITOLOCAL);
		elementcredito_local.appendChild(document.createTextNode(beneficiariospagoscobros.getcredito_local().toString().trim()));
		element.appendChild(elementcredito_local);

		Element elementdetalle = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(beneficiariospagoscobros.getdetalle().trim()));
		element.appendChild(elementdetalle);

		Element elementtipo_movimiento = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.TIPOMOVIMIENTO);
		elementtipo_movimiento.appendChild(document.createTextNode(beneficiariospagoscobros.gettipo_movimiento().trim()));
		element.appendChild(elementtipo_movimiento);

		Element elementvalor = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(beneficiariospagoscobros.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementcuenta = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.CUENTA);
		elementcuenta.appendChild(document.createTextNode(beneficiariospagoscobros.getcuenta().trim()));
		element.appendChild(elementcuenta);

		Element elementfecha = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(beneficiariospagoscobros.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementbeneficiario_asiento = document.createElement(BeneficiariosPagosCobrosConstantesFunciones.BENEFICIARIOASIENTO);
		elementbeneficiario_asiento.appendChild(document.createTextNode(beneficiariospagoscobros.getbeneficiario_asiento().trim()));
		element.appendChild(elementbeneficiario_asiento);
	}
	
	public void generarReporteGroupGenericoBeneficiariosPagosCobrossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados=new ArrayList<BeneficiariosPagosCobros>();
		
		beneficiariospagoscobrossSeleccionados=this.getBeneficiariosPagosCobrossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoBeneficiariosPagosCobros(beneficiariospagoscobrossSeleccionados);
		
		this.generarReporteBeneficiariosPagosCobross("Todos",beneficiariospagoscobrossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoBeneficiariosPagosCobros(ArrayList<BeneficiariosPagosCobros> beneficiariospagoscobrossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(BeneficiariosPagosCobros beneficiariospagoscobrosAux:beneficiariospagoscobrossSeleccionados) {
				beneficiariospagoscobrosAux.setsDetalleGeneralEntityReporte(beneficiariospagoscobrosAux.toString());
			
				if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(beneficiariospagoscobrosAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(beneficiariospagoscobrosAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.getcodigo_cuenta_contable());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.getnombre_cuenta_contable());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_NUMEROCHEQUE)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.getnumero_cheque());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIO)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.getbeneficiario());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.getdetalle());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.gettipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_CUENTA)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.getcuenta());
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(beneficiariospagoscobrosAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(BeneficiariosPagosCobrosConstantesFunciones.LABEL_BENEFICIARIOASIENTO)) {
					existe=true;
					beneficiariospagoscobrosAux.setsDescripcionGeneralEntityReporte1(beneficiariospagoscobrosAux.getbeneficiario_asiento());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BeneficiariosPagosCobrosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesBeneficiariosPagosCobros(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=true;
				this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=true;
				this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=true;
			}
			
			this.isVisibilidadCeldaModificarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=true;
				} else {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaModificarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=true;
				} else {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaModificarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=true;
				} else {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaModificarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
				} else {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaModificarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=true;
				} else {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
				} else {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaModificarBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
				} else {
					this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(BeneficiariosPagosCobrosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=true;
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=true;
		} else {
			this.actualizarEstadoPanelsBeneficiariosPagosCobros(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarBeneficiariosPagosCobros=false;
			//this.isVisibilidadCeldaVerFormBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaDuplicarBeneficiariosPagosCobros=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=false;
		} else {
			this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
			if(!beneficiariospagoscobrosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=false;												
			}
			
			this.jButtonCerrarBeneficiariosPagosCobros.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=false;
		}
		
		if(!this.permiteMantenimiento(this.beneficiariospagoscobros)) {
			this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=false;
			this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoBeneficiariosPagosCobros=false;
		this.isVisibilidadCeldaNuevoRelacionesBeneficiariosPagosCobros=false;
		this.isVisibilidadCeldaGuardarCambiosBeneficiariosPagosCobros=false;
		//this.isVisibilidadCeldaModificarBeneficiariosPagosCobros=true;
		this.isVisibilidadCeldaActualizarBeneficiariosPagosCobros=false;
		this.isVisibilidadCeldaEliminarBeneficiariosPagosCobros=false;
		//this.isVisibilidadCeldaCancelarBeneficiariosPagosCobros=true;			
		this.isVisibilidadCeldaGuardarBeneficiariosPagosCobros=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesBeneficiariosPagosCobros() {
	}
	
	public void actualizarEstadoPanelsBeneficiariosPagosCobros(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros!=null) {
				this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosBeneficiariosPagosCobros.setVisible(true);
			}
			
			if(this.jPanelPaginacionBeneficiariosPagosCobros!=null) {
				this.jPanelPaginacionBeneficiariosPagosCobros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBeneficiariosPagosCobros!=null) {
				this.jPanelParametrosReportesBeneficiariosPagosCobros.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros!=null) {
				this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosBeneficiariosPagosCobros.setVisible(false);
			}
			
			if(this.jPanelPaginacionBeneficiariosPagosCobros!=null) {
				this.jPanelPaginacionBeneficiariosPagosCobros.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBeneficiariosPagosCobros!=null) {
				this.jPanelParametrosReportesBeneficiariosPagosCobros.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros!=null) {
				this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosBeneficiariosPagosCobros.setVisible(false);
			}
			
			if(this.jPanelPaginacionBeneficiariosPagosCobros!=null) {
				this.jPanelPaginacionBeneficiariosPagosCobros.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBeneficiariosPagosCobros!=null) {
				this.jPanelParametrosReportesBeneficiariosPagosCobros.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros!=null) {
				this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosBeneficiariosPagosCobros.setVisible(false);
			}
			
			if(this.jPanelPaginacionBeneficiariosPagosCobros!=null) {
				this.jPanelPaginacionBeneficiariosPagosCobros.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBeneficiariosPagosCobros!=null) {
				this.jPanelParametrosReportesBeneficiariosPagosCobros.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros!=null) {
				this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosBeneficiariosPagosCobros.setVisible(true);
			}
			
			if(this.jPanelPaginacionBeneficiariosPagosCobros!=null) {
				this.jPanelPaginacionBeneficiariosPagosCobros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBeneficiariosPagosCobros!=null) {
				this.jPanelParametrosReportesBeneficiariosPagosCobros.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros!=null) {
				this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosBeneficiariosPagosCobros.setVisible(true);
			}
			
			if(this.jPanelPaginacionBeneficiariosPagosCobros!=null) {
				this.jPanelPaginacionBeneficiariosPagosCobros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBeneficiariosPagosCobros!=null) {
				this.jPanelParametrosReportesBeneficiariosPagosCobros.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosEdicionBeneficiariosPagosCobros.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros!=null) {
				this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBeneficiariosPagosCobros!=null) {
				this.jScrollPanelDatosBeneficiariosPagosCobros.setVisible(true);
			}
			
			if(this.jPanelPaginacionBeneficiariosPagosCobros!=null) {
				this.jPanelPaginacionBeneficiariosPagosCobros.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBeneficiariosPagosCobros!=null) {
				this.jPanelParametrosReportesBeneficiariosPagosCobros.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros!=null) {
					this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesBeneficiariosPagosCobros!=null) {
				this.jPanelParametrosReportesBeneficiariosPagosCobros.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.beneficiariospagoscobrosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros!=null) {
				this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesBeneficiariosPagosCobros!=null) {
				this.jPanelParametrosReportesBeneficiariosPagosCobros.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaBeneficiariosPagosCobros=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaBeneficiariosPagosCobros) {this.jTabbedPaneBusquedasBeneficiariosPagosCobros.remove(jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaBeneficiariosPagosCobros=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaBeneficiariosPagosCobros) {this.jTabbedPaneBusquedasBeneficiariosPagosCobros.remove(jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaBeneficiariosPagosCobros=isParaEjercicio;
			if(!this.isVisibilidadBusquedaBeneficiariosPagosCobros) {this.jTabbedPaneBusquedasBeneficiariosPagosCobros.remove(jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaBeneficiariosPagosCobros=isParaTipoMovimiento;
			if(!this.isVisibilidadBusquedaBeneficiariosPagosCobros) {this.jTabbedPaneBusquedasBeneficiariosPagosCobros.remove(jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaBeneficiariosPagosCobros(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioBeneficiariosPagosCobros() {
		this.updateBorderResaltarBusquedasFormularioBeneficiariosPagosCobros();
		this.updateVisibilidadBusquedasFormularioBeneficiariosPagosCobros();
		this.updateHabilitarBusquedasFormularioBeneficiariosPagosCobros();
	}
	
	public void updateBorderResaltarBusquedasFormularioBeneficiariosPagosCobros() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros.getComponents().length>0) {
	

		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros!=null) {
			index= this.jTabbedPaneBusquedasBeneficiariosPagosCobros.indexOfComponent(this.jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBeneficiariosPagosCobros.getComponent(index);
				jPanel.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioBeneficiariosPagosCobros() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBeneficiariosPagosCobros.indexOfComponent(this.jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBeneficiariosPagosCobros.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);
			if(!this.beneficiariospagoscobrosConstantesFunciones.mostrarBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros && index>-1) {
				this.jTabbedPaneBusquedasBeneficiariosPagosCobros.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioBeneficiariosPagosCobros() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasBeneficiariosPagosCobros.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBeneficiariosPagosCobros.indexOfComponent(this.jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBeneficiariosPagosCobros.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);
				this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setEnabledAt(index,this.beneficiariospagoscobrosConstantesFunciones.activarBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaBeneficiariosPagosCobros(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaBeneficiariosPagosCobros")) {
			index= this.jTabbedPaneBusquedasBeneficiariosPagosCobros.indexOfComponent(this.jPanelBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);

			this.jTabbedPaneBusquedasBeneficiariosPagosCobros.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBeneficiariosPagosCobros.getComponent(index);

			this.beneficiariospagoscobrosConstantesFunciones.setResaltarBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros(resaltar);

			jPanel.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarBusquedaBeneficiariosPagosCobrosBeneficiariosPagosCobros);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarBeneficiariosPagosCobros.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioBeneficiariosPagosCobros() throws Exception {

		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioBeneficiariosPagosCobros();
		this.updateVisibilidadResaltarControlesFormularioBeneficiariosPagosCobros();
		this.updateHabilitarResaltarControlesFormularioBeneficiariosPagosCobros();
		
	}
	
	public void updateBorderResaltarControlesFormularioBeneficiariosPagosCobros() throws Exception {
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltaridBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelidBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltaridBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarid_empresaBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarid_empresaBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarid_sucursalBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarid_sucursalBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarid_ejercicioBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarid_ejercicioBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarid_tipo_movimientoBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarid_tipo_movimientoBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarfecha_desdeBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfecha_desdeBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarfecha_desdeBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarfecha_hastaBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfecha_hastaBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarfecha_hastaBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarcodigo_cuenta_contableBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarcodigo_cuenta_contableBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarnombre_cuenta_contableBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarnombre_cuenta_contableBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarnumero_mayorBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanumero_mayorBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarnumero_mayorBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarnumero_chequeBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldnumero_chequeBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarnumero_chequeBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarbeneficiarioBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiarioBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarbeneficiarioBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltardebito_localBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFielddebito_localBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltardebito_localBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarcredito_localBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcredito_localBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarcredito_localBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltardetalleBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreadetalleBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltardetalleBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltartipo_movimientoBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreatipo_movimientoBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltartipo_movimientoBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarvalorBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldvalorBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarvalorBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarcuentaBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcuentaBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarcuentaBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarfechaBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfechaBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarfechaBeneficiariosPagosCobros);}
		if(this.beneficiariospagoscobrosConstantesFunciones.resaltarbeneficiario_asientoBeneficiariosPagosCobros!=null && this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setBorder(this.beneficiariospagoscobrosConstantesFunciones.resaltarbeneficiario_asientoBeneficiariosPagosCobros);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioBeneficiariosPagosCobros() throws Exception {		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
	
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelidBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostraridBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelidBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostraridBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarid_empresaBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelid_empresaBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarid_empresaBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarid_sucursalBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelid_sucursalBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarid_sucursalBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarid_ejercicioBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelid_ejercicioBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarid_ejercicioBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarid_tipo_movimientoBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelid_tipo_movimientoBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarid_tipo_movimientoBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfecha_desdeBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarfecha_desdeBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelfecha_desdeBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarfecha_desdeBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfecha_hastaBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarfecha_hastaBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelfecha_hastaBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarfecha_hastaBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarcodigo_cuenta_contableBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelcodigo_cuenta_contableBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarcodigo_cuenta_contableBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarnombre_cuenta_contableBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelnombre_cuenta_contableBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarnombre_cuenta_contableBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanumero_mayorBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarnumero_mayorBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelnumero_mayorBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarnumero_mayorBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldnumero_chequeBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarnumero_chequeBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelnumero_chequeBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarnumero_chequeBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiarioBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarbeneficiarioBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelbeneficiarioBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarbeneficiarioBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFielddebito_localBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrardebito_localBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPaneldebito_localBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrardebito_localBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcredito_localBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarcredito_localBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelcredito_localBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarcredito_localBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreadetalleBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrardetalleBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPaneldetalleBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrardetalleBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreatipo_movimientoBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrartipo_movimientoBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPaneltipo_movimientoBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrartipo_movimientoBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldvalorBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarvalorBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelvalorBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarvalorBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcuentaBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarcuentaBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelcuentaBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarcuentaBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfechaBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarfechaBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelfechaBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarfechaBeneficiariosPagosCobros);
		//this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarbeneficiario_asientoBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jPanelbeneficiario_asientoBeneficiariosPagosCobros.setVisible(this.beneficiariospagoscobrosConstantesFunciones.mostrarbeneficiario_asientoBeneficiariosPagosCobros);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioBeneficiariosPagosCobros() throws Exception {
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBeneficiariosPagosCobros!=null) {
	
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jLabelidBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activaridBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_empresaBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarid_empresaBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_sucursalBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarid_sucursalBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_ejercicioBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarid_ejercicioBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jComboBoxid_tipo_movimientoBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarid_tipo_movimientoBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfecha_desdeBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarfecha_desdeBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfecha_hastaBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarfecha_hastaBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcodigo_cuenta_contableBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarcodigo_cuenta_contableBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanombre_cuenta_contableBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarnombre_cuenta_contableBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreanumero_mayorBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarnumero_mayorBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldnumero_chequeBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarnumero_chequeBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiarioBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarbeneficiarioBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFielddebito_localBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activardebito_localBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcredito_localBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarcredito_localBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreadetalleBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activardetalleBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreatipo_movimientoBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activartipo_movimientoBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldvalorBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarvalorBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextFieldcuentaBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarcuentaBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jDateChooserfechaBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarfechaBeneficiariosPagosCobros);
		this.jInternalFrameDetalleFormBeneficiariosPagosCobros.jTextAreabeneficiario_asientoBeneficiariosPagosCobros.setEnabled(this.beneficiariospagoscobrosConstantesFunciones.activarbeneficiario_asientoBeneficiariosPagosCobros);
		}
	}
	
		
}